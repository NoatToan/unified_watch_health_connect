package com.huami.lib.qrcode.detector;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;
import org.opencv.android.Utils;
import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes10.dex */
public class DecodeHandler {
    public static String detectAndDecode(Bitmap bitmap) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        List<String> listDetectAndDecode = WeChatQRCodeDetector.detectAndDecode(bitmap);
        if (!listDetectAndDecode.isEmpty()) {
            return listDetectAndDecode.get(0);
        }
        OpenCVBarcodeDetector.detectAndDecode(mat, listDetectAndDecode);
        return listDetectAndDecode.isEmpty() ? "" : listDetectAndDecode.get(0);
    }

    public static void init(Context context) {
        OpenCVBarcodeDetector.init(context);
    }
}
