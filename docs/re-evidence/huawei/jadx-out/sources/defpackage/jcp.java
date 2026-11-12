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
public class jcp {
    private jcp() {
    }

    public static jcp d() {
        return b.f38383b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object[]] */
    public Bitmap d(String str) throws Throwable {
        Throwable th;
        IOException e;
        InputStream inputStreamOpen;
        LogUtil.a("Track_SkipRopeResManager", "getAssetsBitmap() imagePath: ", str);
        ?? r3 = 0;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                inputStreamOpen = BaseApplication.b().getAssets().open(str);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                            LogUtil.e("Track_SkipRopeResManager", "getAssetsBitmap() close InputStream error");
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    LogUtil.e("Track_SkipRopeResManager", "getAssetsBitmap() ioException: ", LogAnonymous.b(e));
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                            LogUtil.e("Track_SkipRopeResManager", "getAssetsBitmap() close InputStream error");
                        }
                    }
                }
            } catch (IOException e3) {
                e = e3;
                inputStreamOpen = null;
            } catch (Throwable th2) {
                th = th2;
            }
            str = new Object[]{"getAssetsBitmap() bitmap: ", bitmapDecodeStream};
            LogUtil.a("Track_SkipRopeResManager", (Object[]) str);
            return bitmapDecodeStream;
        } catch (Throwable th3) {
            r3 = str;
            th = th3;
        }
        if (r3 != 0) {
            try {
                r3.close();
            } catch (IOException unused3) {
                LogUtil.e("Track_SkipRopeResManager", "getAssetsBitmap() close InputStream error");
            }
        }
        throw th;
    }

    public String b(String str, String str2) {
        return d(str, str2, "");
    }

    public String d(String str, String str2, String str3) {
        LogUtil.a("Track_SkipRopeResManager", "getSkipRopeFilePath() fileName: ", str, ", fileType: ", str2, ", languageType: ", str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "zh-CN";
        }
        String strA = a(str, str2, str3);
        if (TextUtils.isEmpty(strA) && str3.equals("en") && str2.equals("png")) {
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
        StringBuilder sb = new StringBuilder("skip_rope_res");
        sb.append(File.separator);
        sb.append("1.0.0");
        sb.append(File.separator);
        sb.append(str2);
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
        } else if (str2.equals("png") && !a(str)) {
            sb.append(str3);
            sb.append(File.separator);
        } else {
            LogUtil.j("Track_SkipRopeResManager", "getSkipRopeDirectory() wrong fileType: ", str2);
        }
        return sb.toString();
    }

    private boolean a(String str) {
        return str.startsWith("particle") || str.equals("pic_home_skipping") || str.equals("pic_ripple_big") || str.equals("pic_rope_introduce_first") || str.equals("pic_rope_introduce_second");
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final jcp f38383b = new jcp();
    }
}
