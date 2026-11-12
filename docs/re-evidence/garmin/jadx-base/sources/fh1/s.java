package fh1;

/* JADX INFO: loaded from: classes10.dex */
public class s {
    public static a1 a(String str, com.garmin.android.apps.connectmobile.c cVar) {
        str.getClass();
        switch (str) {
            case "APP_NATIVE_ID_STEPS":
                return new u(cVar);
            case "APP_NATIVE_ID_USER_TEXT_SCREEN":
                return new n(cVar);
            case "APP_NATIVE_ID_WEATHER":
                return new w(cVar);
            case "APP_NATIVE_ID_ACTIVE_MINUTES":
                return new q(cVar);
            case "APP_NATIVE_ID_STEPS_GOAL":
                return new t(cVar);
            case "APP_NATIVE_ID_CALORIES":
                return new m(cVar);
            case "APP_NATIVE_ID_DISTANCE":
                return new p(cVar);
            case "APP_NATIVE_ID_DATE":
                return new o(cVar);
            case "APP_NATIVE_ID_TIME":
                return new v(cVar);
            default:
                return null;
        }
    }
}
