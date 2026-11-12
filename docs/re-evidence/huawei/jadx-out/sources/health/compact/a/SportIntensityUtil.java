package health.compact.a;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.fdy;
import defpackage.phs;
import defpackage.pia;
import defpackage.pqo;
import defpackage.pqr;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class SportIntensityUtil {
    private static volatile pqo d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36633b = phs.d + "index_sport_intensity" + File.separator;

    private static int c(int i, int i2, int i3, int i4) {
        return (i < i2 || i > i3) ? i4 : i;
    }

    private SportIntensityUtil() {
    }

    private static void e() {
        a();
        d.n(c(d.o(), 0, 200, 110));
        d.c(c(d.a(), 0, 200, 60));
        d.i(c(d.h(), 0, 100, 64));
        d.b(c(d.c(), 0, 255, 80));
        d.h(c(d.j(), 1, 10, 3));
        d.d(Math.max(c(d.b(), 1, 10, 5), d.j()));
        d.k(c(d.l(), 0, 200, 105));
        d.e(c(d.e(), 0, 200, 60));
        d.f(c(d.g(), 0, 100, 25));
        d.j(c(d.f(), 0, 255, 88));
        d.o(c(d.k(), 0, 255, 88));
        d.g(c(d.i(), 1, 10, 1));
        d.a(Math.max(c(d.d(), 1, 10, 1), d.i()));
    }

    public static pqo b() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    e();
                }
            }
        }
        d.k(110);
        com.huawei.hwlogsmodel.LogUtil.a("Step_SportIntensityUtil", "sSportIntensityConfigBean", d.toString());
        return d;
    }

    private static void a() {
        String strC = CommonUtil.c(fdy.d("com.huawei.health_Sport_Common", "sport_intensity_index", "json"));
        if (TextUtils.isEmpty(strC)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_SportIntensityUtil", "cloudConfigPath is illegal!");
            d = new pqo();
            return;
        }
        String strA = pia.a(new File(strC));
        com.huawei.hwlogsmodel.LogUtil.j("Step_SportIntensityUtil", "EzPluginHelper.readFileToData jsonData = ", strA);
        if (TextUtils.isEmpty(strA)) {
            strA = b("local_sport_intensity_index.json");
            com.huawei.hwlogsmodel.LogUtil.j("Step_SportIntensityUtil", "parseAssestsJsonFile jsonData = ", strA);
        }
        if (TextUtils.isEmpty(strA)) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_SportIntensityUtil", "getCloudConfigScriptJsonObject jsonData is empty ");
            d = new pqo();
            return;
        }
        try {
            d = ((pqr) new Gson().fromJson(strA, pqr.class)).a();
        } catch (JsonSyntaxException e2) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_SportIntensityUtil", ExceptionUtils.c(e2));
            d = new pqo();
        }
    }

    public static void c() {
        StringBuilder sb = new StringBuilder();
        String str = f36633b;
        sb.append(str);
        sb.append("index_sport_intensity.json");
        String strC = CommonUtil.c(sb.toString());
        File file = strC != null ? new File(strC) : null;
        if (file == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_SportIntensityUtil", "updateDownloadToLocalConfig tempFile is null");
            return;
        }
        if (!file.exists()) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_SportIntensityUtil", "already renamed");
            return;
        }
        String strC2 = CommonUtil.c(str + "index_sport_intensity_config.json");
        if (strC2 == null || !file.renameTo(new File(strC2))) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_SportIntensityUtil", "rename fail");
        }
    }

    private static String b(String str) {
        try {
            return e(BaseApplication.getContext().getAssets().open(str));
        } catch (IOException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_SportIntensityUtil", "getString IOException");
            return "";
        }
    }

    private static String e(InputStream inputStream) {
        String str = "";
        if (inputStream == null) {
            return "";
        }
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) > 0) {
                    str = new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IOException unused) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_SportIntensityUtil", "getString IOException");
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_SportIntensityUtil", "getString ioException", LogAnonymous.b(e2));
            }
        }
    }
}
