package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class pwl {
    public static Map<String, Float> a(f08 f08Var) {
        return e4f.g("top", Float.valueOf(exh.a(f08Var.f17254a)), TSMAuthContants.PARAM_KEY_RIGHT, Float.valueOf(exh.a(f08Var.f17255b)), "bottom", Float.valueOf(exh.a(f08Var.c)), "left", Float.valueOf(exh.a(f08Var.d)));
    }

    public static WritableMap b(f08 f08Var) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", exh.a(f08Var.f17254a));
        writableMapCreateMap.putDouble(TSMAuthContants.PARAM_KEY_RIGHT, exh.a(f08Var.f17255b));
        writableMapCreateMap.putDouble("bottom", exh.a(f08Var.c));
        writableMapCreateMap.putDouble("left", exh.a(f08Var.d));
        return writableMapCreateMap;
    }

    public static Map<String, Float> c(aak aakVar) {
        return e4f.g("x", Float.valueOf(exh.a(aakVar.f837a)), "y", Float.valueOf(exh.a(aakVar.f838b)), "width", Float.valueOf(exh.a(aakVar.c)), "height", Float.valueOf(exh.a(aakVar.d)));
    }

    public static WritableMap d(aak aakVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", exh.a(aakVar.f837a));
        writableMapCreateMap.putDouble("y", exh.a(aakVar.f838b));
        writableMapCreateMap.putDouble("width", exh.a(aakVar.c));
        writableMapCreateMap.putDouble("height", exh.a(aakVar.d));
        return writableMapCreateMap;
    }
}
