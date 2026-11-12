package r53;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u53.x f150633a = new u53.x("NO_VALUE");

    public static final e2 a(int i14, int i15, q53.a aVar) {
        if (i14 < 0) {
            vb.h.x(am.j.h(i14, "replay cannot be negative, but was "));
            return null;
        }
        if (i15 < 0) {
            vb.h.x(am.j.h(i15, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i14 <= 0 && i15 <= 0 && aVar != q53.a.SUSPEND) {
            vb.h.y(aVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i16 = i15 + i14;
        if (i16 < 0) {
            i16 = Integer.MAX_VALUE;
        }
        return new e2(i14, i16, aVar);
    }

    public static /* synthetic */ e2 b(int i14, int i15, q53.a aVar, int i16) {
        if ((i16 & 1) != 0) {
            i14 = 0;
        }
        if ((i16 & 2) != 0) {
            i15 = 0;
        }
        if ((i16 & 4) != 0) {
            aVar = q53.a.SUSPEND;
        }
        return a(i14, i15, aVar);
    }

    public static final void c(Object[] objArr, long j8, Object obj) {
        objArr[((int) j8) & (objArr.length - 1)] = obj;
    }

    public static final <T> i<T> d(d2<? extends T> d2Var, t13.g gVar, int i14, q53.a aVar) {
        return ((i14 == 0 || i14 == -3) && aVar == q53.a.SUSPEND) ? d2Var : new s53.j(d2Var, gVar, i14, aVar);
    }
}
