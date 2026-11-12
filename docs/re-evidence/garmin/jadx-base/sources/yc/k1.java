package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/k1;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f196113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f196114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f196115c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196116a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f196116a = iArr;
        }
    }

    public k1() {
        z0.c.a aVar = z0.c.f196665b;
        aVar.getClass();
        z0.c cVar = z0.c.f196667d;
        this.f196113a = cVar;
        aVar.getClass();
        this.f196114b = cVar;
        aVar.getClass();
        this.f196115c = cVar;
    }

    public final z0 a(c1 c1Var) {
        c1Var.getClass();
        int i14 = a.f196116a[c1Var.ordinal()];
        if (i14 == 1) {
            return this.f196113a;
        }
        if (i14 == 2) {
            return this.f196115c;
        }
        if (i14 == 3) {
            return this.f196114b;
        }
        lc.u0.r();
        return null;
    }

    public final void b(b1 b1Var) {
        b1Var.getClass();
        this.f196113a = b1Var.f195769a;
        this.f196115c = b1Var.f195771c;
        this.f196114b = b1Var.f195770b;
    }

    public final void c(c1 c1Var, z0 z0Var) {
        c1Var.getClass();
        z0Var.getClass();
        int i14 = a.f196116a[c1Var.ordinal()];
        if (i14 == 1) {
            this.f196113a = z0Var;
            return;
        }
        if (i14 == 2) {
            this.f196115c = z0Var;
        } else if (i14 == 3) {
            this.f196114b = z0Var;
        } else {
            lc.u0.r();
        }
    }

    public final b1 d() {
        return new b1(this.f196113a, this.f196114b, this.f196115c);
    }
}
