package w63;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lw63/i0;", "Lw63/l;", "Lw63/y;", "zipPath", "fileSystem", "", "Lx63/h;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "comment", "<init>", "(Lw63/y;Lw63/l;Ljava/util/Map;Ljava/lang/String;)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f183369f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f183370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f183371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<y, x63.h> f183372e;

    static {
        new a(null);
        y.f183408b.getClass();
        f183369f = y.a.a("/");
    }

    public i0(y yVar, l lVar, Map<y, x63.h> map, String str) {
        yVar.getClass();
        lVar.getClass();
        map.getClass();
        this.f183370c = yVar;
        this.f183371d = lVar;
        this.f183372e = map;
    }

    @Override // w63.l
    public final f0 a(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // w63.l
    public final void c(y yVar, y yVar2) throws IOException {
        yVar.getClass();
        yVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // w63.l
    public final void e(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // w63.l
    public final void f(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // w63.l
    public final List<y> l(y yVar) throws IOException {
        yVar.getClass();
        y yVar2 = f183369f;
        yVar2.getClass();
        x63.h hVar = this.f183372e.get(x63.c.b(yVar2, yVar, true));
        if (hVar == null) {
            vb.h.B(yVar, "not a directory: ");
            return null;
        }
        List<y> listB1 = p13.h0.b1(hVar.f189345q);
        listB1.getClass();
        return listB1;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    @Override // w63.l
    public final k p(y yVar) throws Throwable {
        Long lValueOf;
        long j8;
        Long l14;
        Long lValueOf2;
        Long l15;
        Integer num;
        Long l16;
        Long lValueOf3;
        Throwable th3;
        Throwable th4;
        x63.h hVarF;
        yVar.getClass();
        y yVar2 = f183369f;
        yVar2.getClass();
        x63.h hVar = this.f183372e.get(x63.c.b(yVar2, yVar, true));
        if (hVar == null) {
            return null;
        }
        long j14 = hVar.f189336h;
        if (j14 != -1) {
            j jVarS = this.f183371d.s(this.f183370c);
            try {
                b0 b0Var = new b0(jVarS.f(j14));
                try {
                    hVarF = x63.k.f(b0Var, hVar);
                    hVarF.getClass();
                    try {
                        b0Var.close();
                        th4 = null;
                    } catch (Throwable th5) {
                        th4 = th5;
                    }
                } catch (Throwable th6) {
                    try {
                        b0Var.close();
                    } catch (Throwable th7) {
                        o13.g.a(th6, th7);
                    }
                    th4 = th6;
                    hVarF = null;
                }
                if (th4 != null) {
                    throw th4;
                }
                try {
                    jVarS.close();
                    th = null;
                } catch (Throwable th8) {
                    th = th8;
                }
                x63.h hVar2 = hVarF;
                th3 = th;
                hVar = hVar2;
            } catch (Throwable th9) {
                th3 = th9;
                if (jVarS != null) {
                    try {
                        jVarS.close();
                    } catch (Throwable th10) {
                        o13.g.a(th3, th10);
                    }
                }
                hVar = null;
            }
            if (th3 != null) {
                throw th3;
            }
        }
        boolean z14 = hVar.f189330b;
        boolean z15 = !z14;
        Long lValueOf4 = z14 ? null : Long.valueOf(hVar.f189334f);
        Long l17 = hVar.f189341m;
        if (l17 != null) {
            lValueOf = Long.valueOf((l17.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            Integer num2 = hVar.f189344p;
            lValueOf = num2 != null ? Long.valueOf(((long) num2.intValue()) * 1000) : null;
        }
        Long l18 = hVar.f189339k;
        if (l18 != null) {
            j8 = 11644473600000L;
            lValueOf2 = Long.valueOf((l18.longValue() / ((long) 10000)) - 11644473600000L);
        } else {
            j8 = 11644473600000L;
            Integer num3 = hVar.f189342n;
            if (num3 == null) {
                int i14 = hVar.f189338j;
                if (i14 != -1) {
                    int i15 = hVar.f189337i;
                    if (i14 != -1) {
                        int i16 = (i14 >> 11) & 31;
                        int i17 = (i14 >> 5) & 63;
                        int i18 = (i14 & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i15 >> 9) & 127) + 1980, ((i15 >> 5) & 15) - 1, i15 & 31, i16, i17, i18);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                    l15 = hVar.f189340l;
                    if (l15 == null) {
                        num = hVar.f189343o;
                        if (num != null) {
                            lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                        } else {
                            l16 = null;
                        }
                        return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
                    }
                    lValueOf3 = Long.valueOf((l15.longValue() / ((long) 10000)) - j8);
                    l16 = lValueOf3;
                    return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
                }
                l14 = null;
                l15 = hVar.f189340l;
                if (l15 == null) {
                    num = hVar.f189343o;
                    if (num != null) {
                        lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
                    } else {
                        l16 = null;
                    }
                    return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
                }
                lValueOf3 = Long.valueOf((l15.longValue() / ((long) 10000)) - j8);
                l16 = lValueOf3;
                return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
            }
            lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
        }
        l14 = lValueOf2;
        l15 = hVar.f189340l;
        if (l15 == null) {
            num = hVar.f189343o;
            if (num != null) {
                lValueOf3 = Long.valueOf(((long) num.intValue()) * 1000);
            } else {
                l16 = null;
            }
            return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
        }
        lValueOf3 = Long.valueOf((l15.longValue() / ((long) 10000)) - j8);
        l16 = lValueOf3;
        return new k(z15, z14, null, lValueOf4, lValueOf, l14, l16, null, 128, null);
    }

    @Override // w63.l
    public final j s(y yVar) {
        yVar.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // w63.l
    public final f0 v(y yVar, boolean z14) throws IOException {
        yVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // w63.l
    public final g0 w(y yVar) throws Throwable {
        b0 b0Var;
        Throwable th3;
        yVar.getClass();
        y yVar2 = f183369f;
        yVar2.getClass();
        x63.h hVar = this.f183372e.get(x63.c.b(yVar2, yVar, true));
        if (hVar == null) {
            vb.h.r(yVar, "no such file: ");
            return null;
        }
        long j8 = hVar.f189334f;
        j jVarS = this.f183371d.s(this.f183370c);
        try {
            b0Var = new b0(jVarS.f(hVar.f189336h));
            try {
                jVarS.close();
                th3 = null;
            } catch (Throwable th4) {
                th3 = th4;
            }
        } catch (Throwable th5) {
            if (jVarS != null) {
                try {
                    jVarS.close();
                } catch (Throwable th6) {
                    o13.g.a(th5, th6);
                }
            }
            b0Var = null;
            th3 = th5;
        }
        if (th3 != null) {
            throw th3;
        }
        b0Var.getClass();
        x63.k.f(b0Var, null);
        return hVar.f189335g == 0 ? new x63.e(b0Var, j8, true) : new x63.e(new r(new x63.e(b0Var, hVar.f189333e, true), new Inflater(true)), j8, false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/i0$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
