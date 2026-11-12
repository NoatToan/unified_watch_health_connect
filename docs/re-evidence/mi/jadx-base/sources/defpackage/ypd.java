package defpackage;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ypd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static vpd f40395a = vpd.h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yud f40396b = new yud();
    public static final vtd c = new vtd();

    public static String a(String str) {
        return b(str, f40395a);
    }

    public static String b(String str, vpd vpdVar) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        vpdVar.f(str, sb);
        return sb.toString();
    }

    public static void c(String str, Appendable appendable, vpd vpdVar) {
        if (str == null) {
            return;
        }
        vpdVar.f(str, appendable);
    }

    public static void d(Object obj, Appendable appendable, vpd vpdVar) throws IOException {
        if (obj == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
            return;
        }
        Class<?> cls = obj.getClass();
        yud yudVar = f40396b;
        zud<Object> zudVarA = yudVar.a(cls);
        if (zudVarA == null) {
            if (cls.isArray()) {
                zudVarA = yud.l;
            } else {
                zudVarA = yudVar.b(obj.getClass());
                if (zudVarA == null) {
                    zudVarA = yud.j;
                }
            }
            yudVar.d(zudVarA, cls);
        }
        zudVarA.a(obj, appendable, vpdVar);
    }
}
