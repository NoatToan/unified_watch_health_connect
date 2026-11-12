package kotlin;

import d6.g;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s5.q0;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li5/d;", "Li5/b;", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f91127e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f91130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f91126d = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f91128f = g.Rtl;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f91129g = g.Ltr;

    public /* synthetic */ d(j jVar) {
        this();
    }

    @Override // kotlin.b
    public final int[] a(int i14) {
        int iD;
        if (c().length() <= 0 || i14 >= c().length()) {
            return null;
        }
        q0 q0Var = this.f91130c;
        g gVar = f91128f;
        if (i14 < 0) {
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            iD = q0Var.f157281b.d(0);
        } else {
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            int iD2 = q0Var.f157281b.d(i14);
            iD = e(iD2, gVar) == i14 ? iD2 : iD2 + 1;
        }
        q0 q0Var2 = this.f91130c;
        if (q0Var2 == null) {
            s.m("layoutResult");
            throw null;
        }
        if (iD >= q0Var2.f157281b.f157257f) {
            return null;
        }
        return b(e(iD, gVar), e(iD, f91129g) + 1);
    }

    @Override // kotlin.b
    public final int[] d(int i14) {
        int iD;
        if (c().length() <= 0 || i14 <= 0) {
            return null;
        }
        int length = c().length();
        q0 q0Var = this.f91130c;
        g gVar = f91129g;
        if (i14 > length) {
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            iD = q0Var.f157281b.d(c().length());
        } else {
            if (q0Var == null) {
                s.m("layoutResult");
                throw null;
            }
            int iD2 = q0Var.f157281b.d(i14);
            iD = e(iD2, gVar) + 1 == i14 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return b(e(iD, f91128f), e(iD, gVar) + 1);
    }

    public final int e(int i14, g gVar) {
        q0 q0Var = this.f91130c;
        if (q0Var == null) {
            s.m("layoutResult");
            throw null;
        }
        int i15 = q0Var.i(i14);
        q0 q0Var2 = this.f91130c;
        if (q0Var2 == null) {
            s.m("layoutResult");
            throw null;
        }
        g gVarJ = q0Var2.j(i15);
        q0 q0Var3 = this.f91130c;
        if (gVar != gVarJ) {
            if (q0Var3 != null) {
                return q0Var3.i(i14);
            }
            s.m("layoutResult");
            throw null;
        }
        if (q0Var3 != null) {
            return q0Var3.f157281b.c(i14, false) - 1;
        }
        s.m("layoutResult");
        throw null;
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Li5/d$a;", "", "<init>", "()V", "Li5/d;", "lineInstance", "Li5/d;", "Ld6/g;", "DirectionStart", "Ld6/g;", "DirectionEnd", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private d() {
    }
}
