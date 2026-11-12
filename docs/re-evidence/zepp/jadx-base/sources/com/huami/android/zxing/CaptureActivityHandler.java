package com.huami.android.zxing;

import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.huami.android.zxing.camera.CameraManager;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureActivityHandler extends Handler {
    private static final String f = CaptureActivityHandler.class.getSimpleName();
    private final b a;
    private a b;
    private final CameraManager c;
    private ICaputureListener d;
    private ViewfinderView e;

    public interface ICaputureListener {
        void handleFailed();

        void handleReturn();

        void handleSuccess(Result result);
    }

    public enum a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(ICaputureListener iCaputureListener, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, CameraManager cameraManager, int i, ViewfinderView viewfinderView) {
        this.d = null;
        this.e = null;
        this.d = iCaputureListener;
        this.e = viewfinderView;
        b bVar = new b(this, cameraManager, i, collection, map, str, new c(viewfinderView));
        this.a = bVar;
        bVar.start();
        this.b = a.SUCCESS;
        this.c = cameraManager;
        cameraManager.startPreview();
        a();
    }

    private void a() {
        if (this.b == a.SUCCESS) {
            this.b = a.PREVIEW;
            this.c.requestPreviewFrame(this.a.a(), 65542);
            this.e.drawViewfinder();
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 65544) {
            Message messageObtain = Message.obtain(this.a.a(), 65544);
            messageObtain.obj = message.obj;
            messageObtain.sendToTarget();
        }
        switch (i) {
            case 65537:
                a();
                break;
            case 65538:
                this.b = a.SUCCESS;
                this.d.handleSuccess((Result) message.obj);
                break;
            case 65539:
                this.b = a.PREVIEW;
                this.c.requestPreviewFrame(this.a.a(), 65542);
                this.d.handleFailed();
                break;
            case 65540:
                ICaputureListener iCaputureListener = this.d;
                if (iCaputureListener != null) {
                    iCaputureListener.handleReturn();
                }
                break;
        }
    }

    public void quitSynchronously() {
        this.b = a.DONE;
        Message.obtain(this.a.a(), 65543).sendToTarget();
        try {
            this.a.join(500L);
        } catch (InterruptedException unused) {
        }
        removeMessages(65538);
        removeMessages(65539);
    }
}
