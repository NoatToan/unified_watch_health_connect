package com.huami.android.zxing.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
final class c implements Camera.PreviewCallback {
    private static final String d = c.class.getSimpleName();
    private final b a;
    private Handler b;
    private int c;

    public c(b bVar) {
        this.a = bVar;
    }

    public void a(Handler handler, int i) {
        this.b = handler;
        this.c = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointB = this.a.b();
        Handler handler = this.b;
        if (pointB == null || handler == null) {
            Log.d(d, "Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.c, pointB.x, pointB.y, bArr).sendToTarget();
            this.b = null;
        }
    }
}
