package com.huami.lib.qrcode.detector;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.huami.lib.qrcode.R;
import java.io.File;
import java.util.List;
import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.wechat_qrcode.WeChatQRCode;

/* JADX INFO: loaded from: classes10.dex */
public final class WeChatQRCodeDetector {
    private static final String a = "WeChatQRCodeDetector";
    public static final String b = "qrcode";
    private static final String c = "detect_caffemodel";
    private static final String d = "detect_prototxt";
    public static final String e = "sr_caffemodel";
    public static final String f = "sr_prototxt";
    private static WeChatQRCode g;

    private WeChatQRCodeDetector() {
        throw new AssertionError();
    }

    private static void a(@NonNull Context context) {
        String absolutePath;
        String strExportResource;
        String absolutePath2;
        String absolutePath3;
        File dir = context.getDir(b, 0);
        File file = new File(dir, c);
        File file2 = new File(dir, d);
        File file3 = new File(dir, e);
        File file4 = new File(dir, f);
        if (file.exists() && file2.exists() && file3.exists() && file4.exists()) {
            absolutePath2 = file.getAbsolutePath();
            absolutePath = file2.getAbsolutePath();
            absolutePath3 = file3.getAbsolutePath();
            strExportResource = file4.getAbsolutePath();
        } else {
            String strExportResource2 = Utils.exportResource(context, R.raw.detect_caffemodel, b);
            String strExportResource3 = Utils.exportResource(context, R.raw.detect_prototxt, b);
            String strExportResource4 = Utils.exportResource(context, R.raw.sr_caffemodel, b);
            absolutePath = strExportResource3;
            strExportResource = Utils.exportResource(context, R.raw.sr_prototxt, b);
            absolutePath2 = strExportResource2;
            absolutePath3 = strExportResource4;
        }
        Log.d(a, ">>> 初始化 WeChatQRCode 开始");
        try {
            g = new WeChatQRCode(absolutePath, absolutePath2, strExportResource, absolutePath3);
        } catch (UnsatisfiedLinkError e2) {
            Log.e(a, "<<< 初始化 WeChatQRCode 失败", e2);
        }
        Log.d(a, "<<< 初始化 WeChatQRCode 成功");
    }

    public static List<String> detectAndDecode(Bitmap bitmap) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat);
    }

    public static void init(@NonNull Context context) {
        a(context.getApplicationContext());
    }

    public static List<String> detectAndDecode(Bitmap bitmap, List<Mat> list) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat, list);
    }

    public static List<String> detectAndDecode(Mat mat) {
        return g.detectAndDecode(mat);
    }

    public static List<String> detectAndDecode(Mat mat, List<Mat> list) {
        return g.detectAndDecode(mat, list);
    }
}
