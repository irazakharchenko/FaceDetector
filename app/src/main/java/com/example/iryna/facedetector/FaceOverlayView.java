package com.example.iryna.facedetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.params.Face;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

import static android.R.attr.bitmap;


public class FaceOverlayView extends View {

    private Bitmap mBitmap;
    private SparseArray<Face> mFaces;

    // constructor for viewing object from code (new FaceOverlayView)
    public FaceOverlayView(Context context) {
        this(context, null);
        public void setBitmap( Bitmap bitmap ) {
            mBitmap = bitmap;
        }
    }

    // constructor for viewing object from .xml
    public FaceOverlayView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    // constructor for viewing object from .xml
    public FaceOverlayView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
}
