package com.journeyapps.barcodescanner;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes18.dex */
public class RotationListener {
    private int a;
    private WindowManager b;
    private OrientationEventListener c;
    private RotationCallback d;

    public class a extends OrientationEventListener {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation;
            WindowManager windowManager = RotationListener.this.b;
            RotationCallback rotationCallback = RotationListener.this.d;
            if (RotationListener.this.b == null || rotationCallback == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == RotationListener.this.a) {
                return;
            }
            RotationListener.this.a = rotation;
            rotationCallback.onRotationChanged(rotation);
        }
    }

    public void listen(Context context, RotationCallback rotationCallback) {
        stop();
        Context applicationContext = context.getApplicationContext();
        this.d = rotationCallback;
        this.b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.c = aVar;
        aVar.enable();
        this.a = this.b.getDefaultDisplay().getRotation();
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.c = null;
        this.b = null;
        this.d = null;
    }
}
