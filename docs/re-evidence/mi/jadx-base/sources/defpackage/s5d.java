package defpackage;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* JADX INFO: loaded from: classes4.dex */
public class s5d {
    public static Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static rbl.b b() {
        return rbl.b.g;
    }

    public static rbl.b c(String str) {
        if ("contain".equals(str)) {
            return rbl.b.c;
        }
        if ("cover".equals(str)) {
            return rbl.b.g;
        }
        if ("stretch".equals(str)) {
            return rbl.b.f32389a;
        }
        if ("center".equals(str)) {
            return rbl.b.f;
        }
        if ("repeat".equals(str)) {
            return jbl.j;
        }
        if (str == null) {
            return b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static Shader.TileMode d(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str == null) {
            return a();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }
}
