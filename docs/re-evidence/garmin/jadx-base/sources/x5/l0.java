package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lx5/l0;", "", "Ls5/c;", "annotatedString", "Ls5/w0;", "selection", "composition", "<init>", "(Ls5/c;JLs5/w0;Lkotlin/jvm/internal/j;)V", "", "text", "(Ljava/lang/String;JLs5/w0;Lkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f188876d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d4.l f188877e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f188878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f188879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f188880c;

    static {
        wt0.i iVar = new wt0.i((byte) 0, 11);
        wy2.c cVar = new wy2.c(24);
        d4.l lVar = d4.m.f57455a;
        f188877e = new d4.l(iVar, cVar);
    }

    private l0(s5.c cVar, long j8, w0 w0Var) {
        w0 w0VarA;
        this.f188878a = cVar;
        this.f188879b = og.a.x(0, cVar.f157138b.length(), j8);
        if (w0Var != null) {
            w0VarA = w0.a(og.a.x(0, cVar.f157138b.length(), w0Var.f157317a));
        } else {
            w0VarA = null;
        }
        this.f188880c = w0VarA;
    }

    public static l0 a(l0 l0Var, String str, long j8, int i14) {
        if ((i14 & 2) != 0) {
            j8 = l0Var.f188879b;
        }
        w0 w0Var = l0Var.f188880c;
        l0Var.getClass();
        return new l0(new s5.c(str, null, 2, null), j8, w0Var, (p005kotlin.jvm.internal.j) null);
    }

    public static l0 b(l0 l0Var, s5.c cVar, long j8, int i14) {
        if ((i14 & 1) != 0) {
            cVar = l0Var.f188878a;
        }
        s5.c cVar2 = cVar;
        if ((i14 & 2) != 0) {
            j8 = l0Var.f188879b;
        }
        long j14 = j8;
        w0 w0Var = (i14 & 4) != 0 ? l0Var.f188880c : null;
        l0Var.getClass();
        return new l0(cVar2, j14, w0Var, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return w0.d(this.f188879b, l0Var.f188879b) && p005kotlin.jvm.internal.s.g(this.f188880c, l0Var.f188880c) && p005kotlin.jvm.internal.s.g(this.f188878a, l0Var.f188878a);
    }

    public final int hashCode() {
        int iHashCode = this.f188878a.hashCode() * 31;
        w0.a aVar = w0.f157315b;
        int iE = q6.f.e(iHashCode, 31, this.f188879b);
        w0 w0Var = this.f188880c;
        return iE + (w0Var != null ? Long.hashCode(w0Var.f157317a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f188878a) + "', selection=" + ((Object) w0.j(this.f188879b)) + ", composition=" + this.f188880c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx5/l0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l0(s5.c cVar, long j8, w0 w0Var, p005kotlin.jvm.internal.j jVar) {
        this(cVar, j8, w0Var);
    }

    public /* synthetic */ l0(String str, long j8, w0 w0Var, p005kotlin.jvm.internal.j jVar) {
        this(str, j8, w0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(s5.c cVar, long j8, w0 w0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            w0.f157315b.getClass();
            j8 = w0.f157316c;
        }
        this(cVar, j8, (i14 & 4) != 0 ? null : w0Var, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(String str, long j8, w0 w0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        String str2 = (i14 & 1) != 0 ? "" : str;
        if ((i14 & 2) != 0) {
            w0.f157315b.getClass();
            j8 = w0.f157316c;
        }
        this(str2, j8, (i14 & 4) != 0 ? null : w0Var, (p005kotlin.jvm.internal.j) null);
    }

    private l0(String str, long j8, w0 w0Var) {
        this(new s5.c(str, null, 2, null), j8, w0Var, (p005kotlin.jvm.internal.j) null);
    }
}
