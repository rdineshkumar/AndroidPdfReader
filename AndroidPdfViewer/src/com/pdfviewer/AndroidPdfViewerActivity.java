package com.pdfviewer;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AndroidPdfViewerActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.readButton).setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				final File APP_FILE_PATH = new File("/sdcard/2XClientForAndroid.pdf");

		        Intent intent = new Intent(AndroidPdfViewerActivity.this,PdfViewerActivity.class);
			    intent.putExtra(PdfViewerActivity.EXTRA_PDFFILENAME,APP_FILE_PATH.getAbsolutePath());
			    startActivity(intent);
			    finish();
				
			}
		});
		
        
    }
}