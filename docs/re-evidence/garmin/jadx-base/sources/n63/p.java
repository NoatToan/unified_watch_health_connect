package n63;

import com.garmin.android.gncs.NotificationConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class p {
    public static o a(e23.l lVar) {
        b.a aVar = b.f123892d;
        aVar.getClass();
        lVar.getClass();
        e eVar = new e(aVar);
        lVar.invoke(eVar);
        if (eVar.f123917p) {
            if (!p005kotlin.jvm.internal.s.g(eVar.f123909h, NotificationConstants.KEY_DATA_MIME_TYPE)) {
                vb.h.s("Class discriminator should not be specified when array polymorphism is specified");
                return null;
            }
            if (eVar.f123910i != a.POLYMORPHIC) {
                vb.h.s("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
                return null;
            }
        }
        boolean z14 = eVar.f123906e;
        String str = eVar.f123907f;
        if (z14) {
            if (!p005kotlin.jvm.internal.s.g(str, "    ")) {
                for (int i14 = 0; i14 < str.length(); i14++) {
                    char cCharAt = str.charAt(i14);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        vb.h.x("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!p005kotlin.jvm.internal.s.g(str, "    ")) {
            vb.h.s("Indent should not be specified when default printing mode is used");
            return null;
        }
        return new o(new g(eVar.f123902a, eVar.f123904c, eVar.f123905d, eVar.f123916o, eVar.f123906e, eVar.f123903b, eVar.f123907f, eVar.f123908g, eVar.f123917p, eVar.f123909h, eVar.f123915n, eVar.f123911j, null, eVar.f123912k, eVar.f123913l, eVar.f123914m, eVar.f123910i), eVar.f123918q);
    }
}
