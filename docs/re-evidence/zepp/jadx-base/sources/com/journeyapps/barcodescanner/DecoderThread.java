package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.client.android.R;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.PreviewCallback;

/* JADX INFO: loaded from: classes18.dex */
public class DecoderThread {
    private static final String k = "DecoderThread";
    private CameraInstance a;
    private HandlerThread b;
    private Handler c;
    private Decoder d;
    private Handler e;
    private Rect f;
    private boolean g = false;
    private final Object h = new Object();
    private final Handler.Callback i = new a();
    private final PreviewCallback j = new b();

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == R.id.zxing_decode) {
                DecoderThread.this.f((SourceData) message.obj);
                return true;
            }
            if (i != R.id.zxing_preview_failed) {
                return true;
            }
            DecoderThread.this.g();
            return true;
        }
    }

    public class b implements PreviewCallback {
        public b() {
        }

        @Override // com.journeyapps.barcodescanner.camera.PreviewCallback
        public void onPreview(SourceData sourceData) {
            synchronized (DecoderThread.this.h) {
                if (DecoderThread.this.g) {
                    DecoderThread.this.c.obtainMessage(R.id.zxing_decode, sourceData).sendToTarget();
                }
            }
        }

        @Override // com.journeyapps.barcodescanner.camera.PreviewCallback
        public void onPreviewError(Exception exc) {
            synchronized (DecoderThread.this.h) {
                if (DecoderThread.this.g) {
                    DecoderThread.this.c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public DecoderThread(CameraInstance cameraInstance, Decoder decoder, Handler handler) {
        Util.validateMainThread();
        this.a = cameraInstance;
        this.d = decoder;
        this.e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(SourceData sourceData) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        sourceData.setCropRect(this.f);
        LuminanceSource luminanceSourceCreateSource = createSource(sourceData);
        Result resultDecode = luminanceSourceCreateSource != null ? this.d.decode(luminanceSourceCreateSource) : null;
        if (resultDecode != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Log.d(k, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (this.e != null) {
                Message messageObtain = Message.obtain(this.e, R.id.zxing_decode_succeeded, new BarcodeResult(resultDecode, sourceData));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.e;
            if (handler != null) {
                Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.e != null) {
            Message.obtain(this.e, R.id.zxing_possible_result_points, this.d.getPossibleResultPoints()).sendToTarget();
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.a.isOpen()) {
            this.a.requestPreview(this.j);
        }
    }

    public LuminanceSource createSource(SourceData sourceData) {
        if (this.f == null) {
            return null;
        }
        return sourceData.createSource();
    }

    public Rect getCropRect() {
        return this.f;
    }

    public Decoder getDecoder() {
        return this.d;
    }

    public void setCropRect(Rect rect) {
        this.f = rect;
    }

    public void setDecoder(Decoder decoder) {
        this.d = decoder;
    }

    public void start() {
        Util.validateMainThread();
        HandlerThread handlerThread = new HandlerThread(k);
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(this.b.getLooper(), this.i);
        this.g = true;
        g();
    }

    public void stop() {
        Util.validateMainThread();
        synchronized (this.h) {
            this.g = false;
            this.c.removeCallbacksAndMessages(null);
            this.b.quit();
        }
    }
}
