package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.push.Cif;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes11.dex */
public class gis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SimpleDateFormat f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f19042b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringUtils.EXPECT_DATE_FORMAT);
        f19041a = simpleDateFormat;
        f19042b = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static Cif a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cif cif = new Cif();
        cif.d("category_push_stat");
        cif.a("push_sdk_stat_channel");
        cif.a(1L);
        cif.b(str);
        cif.a(true);
        cif.b(System.currentTimeMillis());
        cif.g(yfs.b(context).d());
        cif.e("com.xiaomi.xmsf");
        cif.f("");
        cif.c("push_stat");
        return cif;
    }
}
