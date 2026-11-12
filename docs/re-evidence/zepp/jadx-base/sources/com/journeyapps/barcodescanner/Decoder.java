package com.journeyapps.barcodescanner;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Decoder implements ResultPointCallback {
    private Reader a;
    private List<ResultPoint> b = new ArrayList();

    public Decoder(Reader reader) {
        this.a = reader;
    }

    public Result decode(LuminanceSource luminanceSource) {
        return decode(toBitmap(luminanceSource));
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.b.add(resultPoint);
    }

    public List<ResultPoint> getPossibleResultPoints() {
        return new ArrayList(this.b);
    }

    public Reader getReader() {
        return this.a;
    }

    public BinaryBitmap toBitmap(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource));
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        Result resultDecodeWithState;
        this.b.clear();
        try {
            Reader reader = this.a;
            resultDecodeWithState = reader instanceof MultiFormatReader ? ((MultiFormatReader) reader).decodeWithState(binaryBitmap) : reader.decode(binaryBitmap);
        } catch (Exception unused) {
            resultDecodeWithState = null;
        } finally {
            this.a.reset();
        }
        return resultDecodeWithState;
    }
}
