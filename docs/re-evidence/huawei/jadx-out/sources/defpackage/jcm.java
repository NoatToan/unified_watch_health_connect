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
public class jcm {
    private jcm() {
    }

    public static jcm b() {
        return d.d;
    }

    public Bitmap b(String str) {
        LogUtil.a("Track_SportExamResManager", "getAssetsBitmap imagePath: ", str);
        Bitmap bitmapDecodeStream = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Track_SportExamResManager", "getAssetsBitmap failed, imagePath is null", str);
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
            LogUtil.e("Track_SportExamResManager", "getAssetsBitmap ioException: ", LogAnonymous.b(e));
        }
        LogUtil.a("Track_SportExamResManager", "getAssetsBitmap bitmap: ", bitmapDecodeStream);
        return bitmapDecodeStream;
    }

    public String d(String str, String str2) {
        return b(str, str2, "");
    }

    public String b(String str, String str2, String str3) {
        LogUtil.a("Track_SportExamResManager", "getSportExamFilePath fileName: ", str, ", fileType: ", str2, ", languageType: ", str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "zh-CN";
        }
        String strA = a(str, str2, str3);
        if (TextUtils.isEmpty(strA) && str3.equals("en") && d(str2)) {
            strA = a(str, str2, "zh-CN");
        }
        StringBuilder sb = new StringBuilder(strA);
        if (!str.contains(".")) {
            sb.append(str);
            sb.append(".");
            sb.append(str2);
        }
        return sb.toString();
    }

    public String a(String str, String str2, String str3) {
        LogUtil.a("Track_SportExamResManager", "getSportExamDirectory fileName = ", str, ", fileType = ", str2, ", languageType = ", str3);
        StringBuilder sb = new StringBuilder("sport_exam_res");
        sb.append(File.separator);
        sb.append("1.0.0");
        sb.append(File.separator);
        sb.append(d(str2) ? "png" : str2);
        sb.append(File.separator);
        if (str2.equals("mp3") || str2.equals("ogg")) {
            sb.append(str3);
            sb.append(File.separator);
            if (str3.equals("zh-CN")) {
                sb.append("female");
                sb.append(File.separator);
                sb.append("mandarin");
                sb.append(File.separator);
            } else {
                sb.append("male");
                sb.append(File.separator);
            }
        }
        if (d(str2) && !f(str)) {
            sb.append(str3);
            sb.append(File.separator);
        }
        if (a(str)) {
            sb.append("frame");
            sb.append(File.separator);
        }
        return sb.toString();
    }

    private boolean d(String str) {
        return str.equals("png") || str.equals("webp");
    }

    private boolean f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a(str) || str.startsWith("light_beam") || e(str) || str.startsWith("public_") || "camera_bg".equals(str);
        }
        LogUtil.j("Track_SportExamResManager", "isPublicUseImage fileName null");
        return false;
    }

    private boolean e(String str) {
        return "pic_standflex_introduce_first".equals(str) || "pic_standflex_introduce_second".equals(str) || "pic_supineleg_introduce_first".equals(str) || "pic_supineleg_introduce_second".equals(str);
    }

    private boolean a(String str) {
        return str.startsWith("frame_");
    }

    public Bitmap c(String str) {
        return a(str, "png");
    }

    public Bitmap a(String str, String str2) {
        String strD = d(str, str2);
        LogUtil.a("Track_SportExamResManager", "getSportExamBitmap() imagePath: ", strD);
        return b(strD);
    }

    static class d {
        private static final jcm d = new jcm();
    }
}
