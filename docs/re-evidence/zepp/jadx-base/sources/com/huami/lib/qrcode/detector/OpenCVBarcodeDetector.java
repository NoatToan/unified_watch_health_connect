package com.huami.lib.qrcode.detector;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huami.lib.qrcode.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.opencv.android.Utils;
import org.opencv.barcode.BarcodeDetector;
import org.opencv.core.Mat;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenCVBarcodeDetector {
    private static final String a = "OpenCVBarcodeDetector";
    private static BarcodeDetector b;

    public static boolean detectAndDecode(Bitmap bitmap, List<String> list) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat, list);
    }

    public static void init(@NonNull Context context) {
        initBarcodeDetector(context);
    }

    public static void initBarcodeDetector(@NonNull Context context) {
        String strExportResource;
        String absolutePath;
        b = new BarcodeDetector();
        File dir = context.getDir(WeChatQRCodeDetector.b, 0);
        File file = new File(dir, WeChatQRCodeDetector.e);
        File file2 = new File(dir, WeChatQRCodeDetector.f);
        if (file.exists() && file2.exists()) {
            absolutePath = file.getAbsolutePath();
            strExportResource = file2.getAbsolutePath();
        } else {
            String strExportResource2 = Utils.exportResource(context, R.raw.sr_caffemodel, WeChatQRCodeDetector.b);
            strExportResource = Utils.exportResource(context, R.raw.sr_prototxt, WeChatQRCodeDetector.b);
            absolutePath = strExportResource2;
        }
        Log.d(a, ">>> 初始化 OpenCVBarcode 开始");
        try {
            b = new BarcodeDetector(strExportResource, absolutePath);
        } catch (UnsatisfiedLinkError e) {
            Log.e(a, "<<< 初始化 OpenCVBarcode 失败", e);
        }
        Log.d(a, "<<< 初始化 OpenCVBarcode 成功");
    }

    public static boolean detectAndDecode(Mat mat, List<String> list) {
        return b.detectAndDecode(mat, list, new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
    }

    public static boolean detectAndDecode(Mat mat, List<String> list, List<Integer> list2) {
        return b.detectAndDecode(mat, list, list2);
    }
}
