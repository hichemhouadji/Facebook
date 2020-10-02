package com.example.facebooktad;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        mToolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.update_post_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Update Post");
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item)
        {
            int id = item.getItemId();

            if(id == android.R.id.home)
            {
                SendUserToMainActivity();
            }

            return super.onOptionsItemSelected(item);
        }



        private void SendUserToMainActivity()
        {
            Intent mainIntent = new Intent(PostActivity.this, MainActivity.class);
            startActivity(mainIntent);
        }


}