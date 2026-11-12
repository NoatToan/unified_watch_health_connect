package n70;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes8.dex */
public interface v<T> {
    default <R> R a(String str, TypeToken<R> typeToken) {
        if (str != null) {
            try {
                R r14 = (R) new Gson().fromJson(str, typeToken.getType());
                if (r14 != null) {
                    return r14;
                }
            } catch (Exception e4) {
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String str2 = "[" + getTag() + "] parseData -> Exception " + e4;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.e(a2Var, str2);
                return null;
            }
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String str3 = "[" + getTag() + "] parseData -> null server data";
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.e(a2Var2, str3);
        return null;
    }

    String getTag();
}
