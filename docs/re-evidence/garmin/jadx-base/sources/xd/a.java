package xd;

import d53.w;
import java.io.IOException;
import java.util.Locale;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd/a;", "Lud/a;", "Lvd/c;", "db", "<init>", "(Lvd/c;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements ud.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.c f189967a;

    public a(vd.c cVar) {
        cVar.getClass();
        this.f189967a = cVar;
    }

    @Override // ud.a
    public final boolean D() {
        return this.f189967a.D();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ud.a
    public final ud.c M0(String str) {
        c.a.b bVar;
        int i14;
        str.getClass();
        vd.c cVar = this.f189967a;
        c.a.AbstractC3536a.C3537a c3537a = null;
        if (!cVar.isOpen()) {
            f.a0(21, "connection is closed");
            throw null;
        }
        c.f189969d.getClass();
        String upperCase = w.i0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i15 = -1;
        if (length >= 0) {
            int iG = 0;
            loop0: while (iG < length) {
                char cCharAt = upperCase.charAt(iG);
                if (s.h(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iG2 = iG + 1;
                            if (upperCase.charAt(iG2) == '*') {
                                do {
                                    iG2 = w.G('*', iG2 + 1, 4, upperCase);
                                    if (iG2 < 0) {
                                        break loop0;
                                    }
                                    i14 = iG2 + 1;
                                    if (i14 >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i14) != '/');
                                iG = iG2 + 2;
                            }
                        }
                        i15 = iG;
                        break;
                    }
                    if (upperCase.charAt(iG + 1) != '-') {
                        i15 = iG;
                        break;
                    }
                    iG = w.G('\n', iG + 2, 4, upperCase);
                    if (iG < 0) {
                        break;
                    }
                }
                iG++;
            }
        }
        String strSubstring = (i15 < 0 || i15 > upperCase.length()) ? null : upperCase.substring(i15, Math.min(i15 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new c.C3538c(cVar, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    bVar = null;
                } else if (!w.z(upperCase, "EXCLUSIVE", false)) {
                    bVar = !w.z(upperCase, "IMMEDIATE", false) ? c.a.b.BEGIN_DEFERRED : c.a.b.BEGIN_IMMEDIATE;
                } else {
                    bVar = c.a.b.BEGIN_EXCLUSIVE;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    bVar = null;
                } else {
                    bVar = c.a.b.END;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    bVar = null;
                } else {
                    bVar = c.a.b.END;
                }
                break;
            case 81327:
                bVar = (!strSubstring.equals("ROL") || w.z(upperCase, " TO ", false)) ? null : c.a.b.ROLLBACK;
                break;
            default:
                bVar = null;
                break;
        }
        if (bVar != null) {
            return new c.e(cVar, str, bVar);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (w.z(w.c0(lowerCase, "journal_mode", ""), "=", false)) {
                c3537a = c.a.AbstractC3536a.C3537a.f189973a;
            }
        }
        if (c3537a != null) {
            return new c.b(cVar, str, new c.d(cVar, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new c.C3538c(cVar, str) : new c.d(cVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f189967a.close();
    }
}
