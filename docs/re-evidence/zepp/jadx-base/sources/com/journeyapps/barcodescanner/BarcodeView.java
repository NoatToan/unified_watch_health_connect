package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.R;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class BarcodeView extends CameraPreview {
    private b C;
    private BarcodeCallback D;
    private DecoderThread E;
    private DecoderFactory F;
    private Handler G;
    private final Handler.Callback H;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == R.id.zxing_decode_succeeded) {
                BarcodeResult barcodeResult = (BarcodeResult) message.obj;
                if (barcodeResult != null && BarcodeView.this.D != null && BarcodeView.this.C != b.NONE) {
                    BarcodeView.this.D.barcodeResult(barcodeResult);
                    if (BarcodeView.this.C == b.SINGLE) {
                        BarcodeView.this.stopDecoding();
                    }
                }
                return true;
            }
            if (i == R.id.zxing_decode_failed) {
                return true;
            }
            if (i != R.id.zxing_possible_result_points) {
                return false;
            }
            List<ResultPoint> list = (List) message.obj;
            if (BarcodeView.this.D != null && BarcodeView.this.C != b.NONE) {
                BarcodeView.this.D.possibleResultPoints(list);
            }
            return true;
        }
    }

    public enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.C = b.NONE;
        this.D = null;
        this.H = new a();
        v();
    }

    private Decoder u() {
        if (this.F == null) {
            this.F = createDefaultDecoderFactory();
        }
        DecoderResultPointCallback decoderResultPointCallback = new DecoderResultPointCallback();
        HashMap map = new HashMap();
        map.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, decoderResultPointCallback);
        Decoder decoderCreateDecoder = this.F.createDecoder(map);
        decoderResultPointCallback.setDecoder(decoderCreateDecoder);
        return decoderCreateDecoder;
    }

    private void v() {
        this.F = new DefaultDecoderFactory();
        this.G = new Handler(this.H);
    }

    private void w() {
        x();
        if (this.C == b.NONE || !isPreviewActive()) {
            return;
        }
        DecoderThread decoderThread = new DecoderThread(getCameraInstance(), u(), this.G);
        this.E = decoderThread;
        decoderThread.setCropRect(getPreviewFramingRect());
        this.E.start();
    }

    private void x() {
        DecoderThread decoderThread = this.E;
        if (decoderThread != null) {
            decoderThread.stop();
            this.E = null;
        }
    }

    public DecoderFactory createDefaultDecoderFactory() {
        return new DefaultDecoderFactory();
    }

    public void decodeContinuous(BarcodeCallback barcodeCallback) {
        this.C = b.CONTINUOUS;
        this.D = barcodeCallback;
        w();
    }

    public void decodeSingle(BarcodeCallback barcodeCallback) {
        this.C = b.SINGLE;
        this.D = barcodeCallback;
        w();
    }

    public DecoderFactory getDecoderFactory() {
        return this.F;
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public void pause() {
        x();
        super.pause();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public void previewStarted() {
        super.previewStarted();
        w();
    }

    public void setDecoderFactory(DecoderFactory decoderFactory) {
        Util.validateMainThread();
        this.F = decoderFactory;
        DecoderThread decoderThread = this.E;
        if (decoderThread != null) {
            decoderThread.setDecoder(u());
        }
    }

    public void stopDecoding() {
        this.C = b.NONE;
        this.D = null;
        x();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = b.NONE;
        this.D = null;
        this.H = new a();
        v();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = b.NONE;
        this.D = null;
        this.H = new a();
        v();
    }
}
