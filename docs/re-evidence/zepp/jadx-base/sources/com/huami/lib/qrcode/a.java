package com.huami.lib.qrcode;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.huami.lib.qrcode.detector.WeChatQRCodeDetector;
import java.util.List;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes10.dex */
final class a {
    @Nullable
    public static Result a(@NonNull ImageProxy imageProxy) {
        List<String> listDetectAndDecode = WeChatQRCodeDetector.detectAndDecode(b(imageProxy));
        return (listDetectAndDecode == null || listDetectAndDecode.isEmpty()) ? QRCodeDecoder.f(imageProxy) : new Result(listDetectAndDecode.get(0), null, null, BarcodeFormat.QR_CODE);
    }

    @NonNull
    private static Mat b(@NonNull ImageProxy imageProxy) {
        ImageProxy.PlaneProxy[] planes = imageProxy.getPlanes();
        return new Mat(imageProxy.getHeight(), imageProxy.getWidth(), CvType.CV_8UC1, planes[0].getBuffer(), planes[0].getRowStride());
    }

    public static void c(Context context) {
        WeChatQRCodeDetector.init(context);
    }
}
