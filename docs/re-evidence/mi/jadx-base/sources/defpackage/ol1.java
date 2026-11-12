package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes6.dex */
public class ol1 {
    public static WritableMap a(String str) {
        return b(str, "Database Error");
    }

    public static WritableMap b(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str2);
        if (str != null) {
            writableMapCreateMap.putString("key", str);
        }
        return writableMapCreateMap;
    }

    public static WritableMap c(String str) {
        return b(str, "Invalid key");
    }

    public static WritableMap d(String str) {
        return b(str, "Invalid Value");
    }
}
