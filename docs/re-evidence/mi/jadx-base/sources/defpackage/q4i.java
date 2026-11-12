package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class q4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f31091a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f31092b = 2;
    public static int c = 3;

    public static WritableMap a(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("code", i);
        if (str != null) {
            writableMapCreateMap.putString("message", str);
        }
        writableMapCreateMap.putInt("PERMISSION_DENIED", f31091a);
        writableMapCreateMap.putInt("POSITION_UNAVAILABLE", f31092b);
        writableMapCreateMap.putInt("TIMEOUT", c);
        return writableMapCreateMap;
    }
}
