package com.example.simplegame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TextView scoreText;
    private Button clickButton;
    private Button resetButton;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化视图组件
        scoreText = findViewById(R.id.scoreText);
        clickButton = findViewById(R.id.clickButton);
        resetButton = findViewById(R.id.resetButton);

        // 设置点击按钮监听器
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                updateScore();
                
                // 当分数达到特定值时显示祝贺消息
                if (score == 10) {
                    Toast.makeText(MainActivity.this, "恭喜！达到10分！", Toast.LENGTH_SHORT).show();
                } else if (score == 50) {
                    Toast.makeText(MainActivity.this, "太棒了！达到50分！", Toast.LENGTH_SHORT).show();
                } else if (score == 100) {
                    Toast.makeText(MainActivity.this, "完美！达到100分！", Toast.LENGTH_LONG).show();
                }
            }
        });

        // 设置重置按钮监听器
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                updateScore();
                Toast.makeText(MainActivity.this, "分数已重置", Toast.LENGTH_SHORT).show();
            }
        });

        updateScore();
    }

    private void updateScore() {
        scoreText.setText("分数: " + score);
    }
}
