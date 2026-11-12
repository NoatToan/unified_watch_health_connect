package i3;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Li3/m4;", "Li3/a0;", "Li3/k4;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lj23/l;", "yearRange", "Li3/q5;", "initialDisplayMode", "Li3/bc;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lj23/l;ILi3/bc;Ljava/util/Locale;Lkotlin/jvm/internal/j;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m4 extends a0 implements k4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f88948h = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3.c2 f88949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f88950g;

    private m4(Long l14, Long l15, j23.l lVar, int i14, bc bcVar, Locale locale) {
        super(l15, lVar, bcVar, locale);
        l3.d0 d0Var = null;
        if (l14 != null) {
            l3.d0 d0VarB = this.f87406c.b(l14.longValue());
            if (lVar.d(d0VarB.f109208a)) {
                d0Var = d0VarB;
            }
        }
        this.f88949f = p3.p0.n(d0Var);
        this.f88950g = p3.p0.n(q5.a(i14));
    }

    @Override // i3.k4
    public final void c(int i14) {
        Long lG = g();
        if (lG != null) {
            a(this.f87406c.f(lG.longValue()).f109264e);
        }
        this.f88950g.setValue(q5.a(i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.k4
    public final int f() {
        return ((q5) this.f88950g.getF182175a()).f89412a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.k4
    public final Long g() {
        l3.d0 d0Var = (l3.d0) this.f88949f.getF182175a();
        if (d0Var != null) {
            return Long.valueOf(d0Var.f109211d);
        }
        return null;
    }

    @Override // i3.k4
    public final void h(Long l14) {
        p3.c2 c2Var = this.f88949f;
        if (l14 == null) {
            c2Var.setValue(null);
        } else {
            l3.d0 d0VarB = this.f87406c.b(l14.longValue());
            c2Var.setValue(this.f87404a.d(d0VarB.f109208a) ? d0VarB : null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/m4$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ m4(Long l14, Long l15, j23.l lVar, int i14, bc bcVar, Locale locale, p005kotlin.jvm.internal.j jVar) {
        this(l14, l15, lVar, i14, bcVar, locale);
    }
}
