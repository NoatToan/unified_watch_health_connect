package fh1;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    public static a1 a(String str, com.garmin.android.apps.connectmobile.c cVar) {
        str.getClass();
        switch (str) {
            case "APP_NATIVE_ID_STEPS":
                return new h(cVar);
            case "APP_NATIVE_ID_TIMER":
                return new j(cVar);
            case "APP_NATIVE_ID_USER_TEXT_SCREEN":
                return new b(cVar);
            case "APP_NATIVE_ID_STEPS_GOAL":
                return new g(cVar);
            case "APP_NATIVE_ID_CALORIES":
                return new a(cVar);
            case "APP_NATIVE_ID_DISTANCE":
                return new d(cVar);
            case "APP_NATIVE_ID_DATE":
                return new c(cVar);
            case "APP_NATIVE_ID_TIME":
                return new i(cVar);
            default:
                return null;
        }
    }
}
