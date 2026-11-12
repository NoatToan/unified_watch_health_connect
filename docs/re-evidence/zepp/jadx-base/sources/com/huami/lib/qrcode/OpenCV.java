package com.huami.lib.qrcode;

import android.content.Context;
import android.util.Log;
import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenCV {
    private static final String a = "OpenCV";

    public class a extends BaseLoaderCallback {
        public a(Context context) {
            super(context);
        }

        @Override // org.opencv.android.BaseLoaderCallback, org.opencv.android.LoaderCallbackInterface
        public void onManagerConnected(int i) {
            super.onManagerConnected(i);
            Log.i(OpenCV.a, "onManagerConnected:" + i);
            if (i == 0) {
                Log.i(OpenCV.a, "OpenCV loaded successfully");
            }
        }
    }

    private OpenCV() {
        throw new AssertionError();
    }

    public static void initAsync(Context context) {
        initAsync(context, new a(context));
    }

    public static void initAsync(Context context, LoaderCallbackInterface loaderCallbackInterface) {
        if (!OpenCVLoader.initDebug()) {
            Log.d(a, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION, context, loaderCallbackInterface);
        } else {
            Log.d(a, "OpenCV library found inside package. Using it!");
            loaderCallbackInterface.onManagerConnected(0);
        }
    }
}
