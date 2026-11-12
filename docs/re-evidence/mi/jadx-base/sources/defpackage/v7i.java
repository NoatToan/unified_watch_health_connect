package defpackage;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public final class v7i implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ag3 f36593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f36594b;
    public int c;

    public v7i(ag3 ag3Var) {
        this.f36593a = ag3Var;
    }

    public void a(Handler handler, int i) {
        this.f36594b = handler;
        this.c = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointB = this.f36593a.b();
        Handler handler = this.f36594b;
        if (pointB == null || handler == null) {
            ipe.a("Got preview callback, but no handler or resolution available");
        } else {
            handler.obtainMessage(this.c, pointB.x, pointB.y, bArr).sendToTarget();
            this.f36594b = null;
        }
    }
}
