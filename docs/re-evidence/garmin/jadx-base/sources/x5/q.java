package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lx5/q;", "", "", "singleLine", "Lx5/u;", "capitalization", "autoCorrect", "Lx5/v;", "keyboardType", "Lx5/p;", "imeAction", "Lx5/f0;", "platformImeOptions", "Lz5/c;", "hintLocales", "<init>", "(ZIZIILx5/f0;Lz5/c;Lkotlin/jvm/internal/j;)V", "(ZIZIILx5/f0;Lkotlin/jvm/internal/j;)V", "(ZIZIILkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f188930h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f188931i = new q(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f188935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f188936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f188937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5.c f188938g;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var, z5.c cVar, int i17, p005kotlin.jvm.internal.j jVar) {
        z14 = (i17 & 1) != 0 ? false : z14;
        if ((i17 & 2) != 0) {
            u.f188948b.getClass();
            i14 = 0;
        }
        z15 = (i17 & 4) != 0 ? true : z15;
        if ((i17 & 8) != 0) {
            v.f188954b.getClass();
            i15 = v.f188955c;
        }
        if ((i17 & 16) != 0) {
            p.f188918b.getClass();
            i16 = p.f188920d;
        }
        f0Var = (i17 & 32) != 0 ? null : f0Var;
        if ((i17 & 64) != 0) {
            z5.c.f202441c.getClass();
            cVar = z5.c.f202442d;
        }
        z5.c cVar2 = cVar;
        f0 f0Var2 = f0Var;
        this(z14, i14, z15, i15, i16, f0Var2, cVar2, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f188932a != qVar.f188932a) {
            return false;
        }
        int i14 = qVar.f188933b;
        u.a aVar = u.f188948b;
        if (this.f188933b != i14 || this.f188934c != qVar.f188934c) {
            return false;
        }
        int i15 = qVar.f188935d;
        v.a aVar2 = v.f188954b;
        if (this.f188935d == i15) {
            int i16 = qVar.f188936e;
            p.a aVar3 = p.f188918b;
            return this.f188936e == i16 && p005kotlin.jvm.internal.s.g(this.f188937f, qVar.f188937f) && p005kotlin.jvm.internal.s.g(this.f188938g, qVar.f188938g);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f188932a) * 31;
        u.a aVar = u.f188948b;
        int iG = q6.f.g(q2.d(this.f188933b, iHashCode, 31), 31, this.f188934c);
        v.a aVar2 = v.f188954b;
        int iD = q2.d(this.f188935d, iG, 31);
        p.a aVar3 = p.f188918b;
        int iD2 = q2.d(this.f188936e, iD, 31);
        f0 f0Var = this.f188937f;
        return this.f188938g.f202443a.hashCode() + ((iD2 + (f0Var != null ? f0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f188932a + ", capitalization=" + ((Object) u.b(this.f188933b)) + ", autoCorrect=" + this.f188934c + ", keyboardType=" + ((Object) v.b(this.f188935d)) + ", imeAction=" + ((Object) p.b(this.f188936e)) + ", platformImeOptions=" + this.f188937f + ", hintLocales=" + this.f188938g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/q$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @o13.e
    public /* synthetic */ q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var, p005kotlin.jvm.internal.j jVar) {
        this(z14, i14, z15, i15, i16, f0Var);
    }

    public /* synthetic */ q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var, z5.c cVar, p005kotlin.jvm.internal.j jVar) {
        this(z14, i14, z15, i15, i16, f0Var, cVar);
    }

    private q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var, z5.c cVar) {
        this.f188932a = z14;
        this.f188933b = i14;
        this.f188934c = z15;
        this.f188935d = i15;
        this.f188936e = i16;
        this.f188937f = f0Var;
        this.f188938g = cVar;
    }

    @o13.e
    public /* synthetic */ q(boolean z14, int i14, boolean z15, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(z14, i14, z15, i15, i16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        int i19;
        int i24 = 0;
        boolean z16 = (i17 & 1) != 0 ? false : z14;
        if ((i17 & 2) != 0) {
            u.f188948b.getClass();
        } else {
            i24 = i14;
        }
        boolean z17 = (i17 & 4) != 0 ? true : z15;
        if ((i17 & 8) != 0) {
            v.f188954b.getClass();
            i18 = v.f188955c;
        } else {
            i18 = i15;
        }
        if ((i17 & 16) != 0) {
            p.f188918b.getClass();
            i19 = p.f188920d;
        } else {
            i19 = i16;
        }
        this(z16, i24, z17, i18, i19, (i17 & 32) != 0 ? null : f0Var, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private q(boolean z14, int i14, boolean z15, int i15, int i16, f0 f0Var) {
        this(z14, i14, z15, i15, i16, f0Var, z5.c.f202442d, (p005kotlin.jvm.internal.j) null);
        z5.c.f202441c.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(boolean z14, int i14, boolean z15, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        boolean z16 = (i17 & 1) != 0 ? false : z14;
        if ((i17 & 2) != 0) {
            u.f188948b.getClass();
            i18 = 0;
        } else {
            i18 = i14;
        }
        boolean z17 = (i17 & 4) != 0 ? true : z15;
        if ((i17 & 8) != 0) {
            v.f188954b.getClass();
            i15 = v.f188955c;
        }
        int i19 = i15;
        if ((i17 & 16) != 0) {
            p.f188918b.getClass();
            i16 = p.f188920d;
        }
        this(z16, i18, z17, i19, i16, (p005kotlin.jvm.internal.j) null);
    }

    private q(boolean z14, int i14, boolean z15, int i15, int i16) {
        this(z14, i14, z15, i15, i16, null, null, 64, null);
    }
}
