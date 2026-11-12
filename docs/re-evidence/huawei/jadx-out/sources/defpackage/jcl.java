package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class jcl {
    private jcl() {
    }

    public static jcl e() {
        return c.d;
    }

    public Bitmap c(String str) {
        LogUtil.a("Track_AiActionTrainResManager", "getAssetsBitmap imagePath: ", str);
        Bitmap bitmapDecodeStream = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Track_AiActionTrainResManager", "getAssetsBitmap failed, imagePath is null", str);
            return null;
        }
        try {
            InputStream inputStreamOpen = BaseApplication.b().getAssets().open(str);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            LogUtil.e("Track_AiActionTrainResManager", "getAssetsBitmap ioException: ", LogAnonymous.b(e));
        }
        LogUtil.a("Track_AiActionTrainResManager", "getAssetsBitmap bitmap: ", bitmapDecodeStream);
        return bitmapDecodeStream;
    }

    public String c(String str, String str2) {
        return e(str, str2, "");
    }

    public String e(String str, String str2, String str3) {
        LogUtil.a("Track_AiActionTrainResManager", "getAiActionTrainFilePath fileName: ", str, ", fileType: ", str2, ", languageType: ", str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(b(str, str2, str3));
        if (!str.contains(".")) {
            sb.append(str);
            sb.append(".");
            sb.append(str2);
        }
        return sb.toString();
    }

    private String b(String str, String str2, String str3) {
        LogUtil.a("Track_AiActionTrainResManager", "getAiActionTrainDirectory fileName = ", str, ", fileType = ", str2, ", languageType = ", str3);
        StringBuilder sb = new StringBuilder();
        if (str2.equals("mp3") || str2.equals("wav")) {
            sb.append(str3);
            sb.append(File.separator);
        }
        if (a(str2)) {
            sb.append("ai_fitness_sport_img");
            sb.append(File.separator);
        }
        return sb.toString();
    }

    public Bitmap e(String str) {
        return b(str, "png");
    }

    public Bitmap b(String str, String str2) {
        String strC = c(str, str2);
        LogUtil.a("Track_AiActionTrainResManager", "getAiActionTrainBitmap() imagePath: ", strC);
        return c(strC);
    }

    private boolean a(String str) {
        return str.equals("png") || str.equals("webp");
    }

    static class c {
        private static final jcl d = new jcl();
    }
}
