package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/y;", "Li63/c;", "Le53/c;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements i63.c<e53.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f117044a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f117045b = new q1("kotlin.time.Duration", k63.d.i.f103232a);

    private y() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        e53.c.a aVar = e53.c.f63094b;
        String strS = eVar.s();
        aVar.getClass();
        strS.getClass();
        try {
            long jD = e53.e.d(strS);
            if (jD == e53.c.f63097e) {
                throw new IllegalStateException("invariant failed");
            }
            return e53.c.c(jD);
        } catch (IllegalArgumentException e4) {
            n23.j.w(am.j.m("Invalid ISO duration string format: '", strS, "'."), e4);
            return null;
        }
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f117045b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        long j8 = ((e53.c) obj).f63098a;
        e53.c.a aVar = e53.c.f63094b;
        StringBuilder sb3 = new StringBuilder();
        if (j8 < 0) {
            sb3.append('-');
        }
        sb3.append("PT");
        long jL = j8 < 0 ? e53.c.l(j8) : j8;
        long j14 = e53.c.j(jL, e53.f.HOURS);
        boolean z14 = false;
        int iJ = e53.c.g(jL) ? 0 : (int) (e53.c.j(jL, e53.f.MINUTES) % ((long) 60));
        int iJ2 = e53.c.g(jL) ? 0 : (int) (e53.c.j(jL, e53.f.SECONDS) % ((long) 60));
        int iF = e53.c.f(jL);
        if (e53.c.g(j8)) {
            j14 = 9999999999999L;
        }
        boolean z15 = j14 != 0;
        boolean z16 = (iJ2 == 0 && iF == 0) ? false : true;
        if (iJ != 0 || (z16 && z15)) {
            z14 = true;
        }
        if (z15) {
            sb3.append(j14);
            sb3.append('H');
        }
        if (z14) {
            sb3.append(iJ);
            sb3.append('M');
        }
        if (z16 || (!z15 && !z14)) {
            e53.c.b(sb3, iJ2, iF, 9, "S", true);
        }
        fVar.p(sb3.toString());
    }
}
