package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.smarthome.setting.ServerSetting;

/* JADX INFO: loaded from: classes8.dex */
public final class ijr {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ijr f21240a = new ijr();
    }

    public static ijr c() {
        return a.f21240a;
    }

    public final String a() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            return "https://hlth.io.mi.com/app/v1/resource/download".substring(0, 8) + "staging-" + "https://hlth.io.mi.com/app/v1/resource/download".substring(8);
        }
        if (TextUtils.equals("production", "production") || !TextUtils.equals("production", ServerSetting.SERVER_ENV_PREVIEW)) {
            return "https://hlth.io.mi.com/app/v1/resource/download";
        }
        return "https://hlth.io.mi.com/app/v1/resource/download".substring(0, 8) + "pv." + "https://hlth.io.mi.com/app/v1/resource/download".substring(8);
    }

    public final String b() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        return TextUtils.isEmpty(currentRegion) ? "cn" : currentRegion;
    }

    public String d() {
        String strA = a();
        String strB = b();
        if ("cn".equals(strB)) {
            return strA;
        }
        int iIndexOf = strA.indexOf("://");
        StringBuilder sb = new StringBuilder();
        int i = iIndexOf + 3;
        sb.append(strA.substring(0, i));
        sb.append(strB);
        sb.append(".");
        sb.append(strA.substring(i));
        return sb.toString();
    }

    public ijr() {
    }
}
