package defpackage;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes3.dex */
public class jmq {
    public static t51 a(String str) {
        if (str.equals("SHA-1")) {
            return new t51(y2h.i, mg5.f26130a);
        }
        if (str.equals("SHA-224")) {
            return new t51(hgg.f, mg5.f26130a);
        }
        if (str.equals(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM)) {
            return new t51(hgg.c, mg5.f26130a);
        }
        if (str.equals("SHA-384")) {
            return new t51(hgg.d, mg5.f26130a);
        }
        if (str.equals("SHA-512")) {
            return new t51(hgg.e, mg5.f26130a);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    public static aw6 b(t51 t51Var) {
        if (t51Var.g().equals(y2h.i)) {
            return bw6.a();
        }
        if (t51Var.g().equals(hgg.f)) {
            return bw6.b();
        }
        if (t51Var.g().equals(hgg.c)) {
            return bw6.c();
        }
        if (t51Var.g().equals(hgg.d)) {
            return bw6.d();
        }
        if (t51Var.g().equals(hgg.e)) {
            return bw6.e();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + t51Var.g());
    }
}
