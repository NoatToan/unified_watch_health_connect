package com.xiaomi.hm.health;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.opensdk.SignatureKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\"\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\u000e\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"", "sign", "", "checkAppSignature", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "record", "", "a", "Ljava/util/List;", "signList", "b", "Ljava/lang/String;", "EVENT_KEY", "c", "PARAM_KEY_VERSION", GoogleApiAvailabilityLight.a, "PARAM_KEY_SIGN", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class RecordSignKt {

    @NotNull
    private static final List<String> a;

    @NotNull
    private static final String b = "APP_SIGN_RECORD";

    @NotNull
    private static final String c = "VERSION";

    @NotNull
    private static final String d = "SIGN";

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("AB:AA:55:F9:3A:AE:16:5C:54:86:15:27:5B:3A:6E:28:78:93:F3:9A");
        arrayList.add("A6:E2:21:D7:7C:B6:76:0D:46:75:CF:AA:3E:DA:87:17:9D:13:7F:92");
        a = arrayList;
    }

    public static final boolean checkAppSignature(@NotNull String str) {
        return a.contains(str);
    }

    public static final void record(@NotNull Context context) {
        String appSignatureSHA1 = SignatureKt.getAppSignatureSHA1(context, "com.huami.watch.hmwatchmanager");
        if (checkAppSignature(appSignatureSHA1)) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sign", 0);
        String string = sharedPreferences.getString(BuildConfig.VERSION_NAME, null);
        if (string == null || string.length() == 0) {
            sharedPreferences.edit().putString(BuildConfig.VERSION_NAME, appSignatureSHA1).apply();
            HashMap map = new HashMap(2);
            map.put(c, BuildConfig.VERSION_NAME);
            map.put(d, appSignatureSHA1);
            Analytics.recordEvent(new CountEventBuilder(b).putExtras(map));
        }
    }
}
