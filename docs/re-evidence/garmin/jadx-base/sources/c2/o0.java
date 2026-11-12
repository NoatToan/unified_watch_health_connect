package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0002\r\u000eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lc2/o0;", "", "", "maxItemsInMainAxis", "Lc2/w0;", "overflow", "Lc2/d2;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILc2/w0;JIIILkotlin/jvm/internal/j;)V", "b", "a", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f22792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22796f;

    private o0(int i14, w0 w0Var, long j8, int i15, int i16, int i17) {
        this.f22791a = i14;
        this.f22792b = w0Var;
        this.f22793c = j8;
        this.f22794d = i15;
        this.f22795e = i16;
        this.f22796f = i17;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public final a a(b bVar, boolean z14, int i14, int i15, int i16, int i17) {
        a aVar;
        f5.y0 y0Var;
        p1.k kVar;
        f5.v1 v1Var;
        if (bVar.f22802b) {
            w0 w0Var = this.f22792b;
            int i18 = w0.a.f22916a[w0Var.f22907a.ordinal()];
            boolean z15 = true;
            if (i18 == 1 || i18 == 2) {
                aVar = null;
            } else {
                if (i18 != 3 && i18 != 4) {
                    lc.u0.r();
                    return null;
                }
                if (z14) {
                    y0Var = w0Var.f22910d;
                    kVar = w0Var.f22914h;
                    v1Var = w0Var.f22911e;
                } else {
                    y0Var = (i14 < w0Var.f22908b - 1 || i15 < w0Var.f22909c) ? null : w0Var.f22912f;
                    kVar = w0Var.f22915i;
                    v1Var = w0Var.f22913g;
                }
                f5.v1 v1Var2 = v1Var;
                f5.y0 y0Var2 = y0Var;
                if (y0Var2 == null) {
                    aVar = null;
                } else {
                    kVar.getClass();
                    aVar = new a(y0Var2, v1Var2, kVar.f134757a, false, 8, null);
                }
            }
            if (aVar != null) {
                if (i14 < 0 || (i17 != 0 && (i16 - ((int) (aVar.f22799c >> 32)) < 0 || i17 >= this.f22791a))) {
                    z15 = false;
                }
                aVar.f22800d = z15;
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b(boolean z14, int i14, long j8, p1.k kVar, int i15, int i16, int i17, boolean z15, boolean z16) {
        long j14;
        int i18 = i16 + i17;
        if (kVar == null) {
            return new b(true, true);
        }
        long j15 = kVar.f134757a;
        w0 w0Var = this.f22792b;
        if (w0Var.f22907a != u0.a.Visible && (i15 >= this.f22794d || ((int) (j8 & 4294967295L)) - ((int) (j15 & 4294967295L)) < 0)) {
            return new b(true, true);
        }
        int i19 = this.f22795e;
        int i24 = this.f22796f;
        long j16 = this.f22793c;
        int i25 = this.f22791a;
        if (i14 != 0) {
            if (i14 >= i25) {
                j14 = 4294967295L;
            } else {
                j14 = 4294967295L;
            }
            return z15 ? new b(true, true) : new b(true, b(z14, 0, p1.k.b(g6.a.j(j16), (((int) (j8 & j14)) - i24) - i17), p1.k.a(p1.k.b(((int) (j15 >> 32)) - i19, (int) (j15 & j14))), i15 + 1, i18, 0, true, false).f22802b);
        }
        j14 = 4294967295L;
        int i26 = (int) (j15 & j14);
        int iMax = Math.max(i17, i26) + i16;
        p1.k kVarA = z16 ? null : w0Var.a(i15, iMax, z14);
        if (kVarA == null || (i14 + 1 < i25 && ((((int) (j8 >> 32)) - ((int) (j15 >> 32))) - i19) - ((int) (kVarA.f134757a >> 32)) >= 0)) {
            return new b(false, false);
        }
        if (z16) {
            return new b(true, true);
        }
        boolean z17 = b(false, 0, p1.k.b(g6.a.j(j16), (((int) (j8 & j14)) - i24) - Math.max(i17, i26)), kVarA, i15 + 1, iMax, 0, true, true).f22802b;
        return new b(z17, z17);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/o0$a;", "", "Lf5/y0;", "ellipsis", "Lf5/v1;", "placeable", "Lp1/k;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Lf5/y0;Lf5/v1;JZLkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5.y0 f22797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f5.v1 f22798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f22799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22800d;

        public /* synthetic */ a(f5.y0 y0Var, f5.v1 v1Var, long j8, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(y0Var, v1Var, j8, (i14 & 8) != 0 ? true : z14, null);
        }

        private a(f5.y0 y0Var, f5.v1 v1Var, long j8, boolean z14) {
            this.f22797a = y0Var;
            this.f22798b = v1Var;
            this.f22799c = j8;
            this.f22800d = z14;
        }

        public /* synthetic */ a(f5.y0 y0Var, f5.v1 v1Var, long j8, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(y0Var, v1Var, j8, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/o0$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22802b;

        public /* synthetic */ b(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
        }

        public b(boolean z14, boolean z15) {
            this.f22801a = z14;
            this.f22802b = z15;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z14 = false;
            this(z14, z14, 3, null);
        }
    }

    public /* synthetic */ o0(int i14, w0 w0Var, long j8, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this(i14, w0Var, j8, i15, i16, i17);
    }
}
