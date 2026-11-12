package g63;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import fe2.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg63/q;", "Output", "Lg63/m;", "", "string", "<init>", "(Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q<Output> implements m<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76156a;

    public q(String str) {
        str.getClass();
        this.f76156a = str;
        if (str.length() <= 0) {
            vb.h.s("Empty string is not allowed");
            throw null;
        }
        if (dh.b.G(str.charAt(0))) {
            vb.h.x(am.j.m("String '", str, "' starts with a digit"));
            throw null;
        }
        if (dh.b.G(str.charAt(str.length() - 1))) {
            vb.h.x(am.j.m("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // g63.m
    public final Object a(c cVar, CharSequence charSequence, int i14) {
        charSequence.getClass();
        String str = this.f76156a;
        if (str.length() + i14 > charSequence.length()) {
            i.a aVar = i.f76142b;
            z zVar = new z(this, 14);
            aVar.getClass();
            return new h(i14, zVar);
        }
        int length = str.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (charSequence.charAt(i14 + i15) != str.charAt(i15)) {
                i.a aVar2 = i.f76142b;
                p pVar = new p(this, charSequence, i14, i15);
                aVar2.getClass();
                return new h(i14, pVar);
            }
        }
        i.a aVar3 = i.f76142b;
        int length2 = str.length() + i14;
        aVar3.getClass();
        return Integer.valueOf(length2);
    }

    public final String toString() {
        return a0.m(new StringBuilder("'"), this.f76156a, CoreConstants.SINGLE_QUOTE_CHAR);
    }
}
