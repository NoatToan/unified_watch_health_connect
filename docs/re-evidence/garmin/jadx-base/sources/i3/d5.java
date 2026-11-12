package i3;

import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Li3/d5;", "Li3/a0;", "Li3/c5;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lj23/l;", "yearRange", "Li3/q5;", "initialDisplayMode", "Li3/bc;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lj23/l;ILi3/bc;Ljava/util/Locale;Lkotlin/jvm/internal/j;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d5 extends a0 implements c5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f87822i = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3.c2 f87823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f87824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.c2 f87825h;

    private d5(Long l14, Long l15, Long l16, j23.l lVar, int i14, bc bcVar, Locale locale) {
        super(l16, lVar, bcVar, locale);
        this.f87823f = p3.p0.n(null);
        this.f87824g = p3.p0.n(null);
        j(l14, l15);
        this.f87825h = p3.p0.n(q5.a(i14));
    }

    @Override // i3.c5
    public final void c(int i14) {
        Long lK = k();
        if (lK != null) {
            a(this.f87406c.f(lK.longValue()).f109264e);
        }
        this.f87825h.setValue(q5.a(i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.c5
    public final int f() {
        return ((q5) this.f87825h.getF182175a()).f89412a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.c5
    public final Long i() {
        l3.d0 d0Var = (l3.d0) this.f87824g.getF182175a();
        if (d0Var != null) {
            return Long.valueOf(d0Var.f109211d);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // i3.c5
    public final void j(Long l14, Long l15) {
        l3.d0 d0VarB;
        l3.d0 d0VarB2;
        j23.l lVar = this.f87404a;
        l3.f0 f0Var = this.f87406c;
        if (l14 != null) {
            d0VarB = f0Var.b(l14.longValue());
            if (!lVar.d(d0VarB.f109208a)) {
                d0VarB = null;
            }
        } else {
            d0VarB = null;
        }
        if (l15 != null) {
            d0VarB2 = f0Var.b(l15.longValue());
            if (!lVar.d(d0VarB2.f109208a)) {
                d0VarB2 = null;
            }
        } else {
            d0VarB2 = null;
        }
        p3.c2 c2Var = this.f87824g;
        p3.c2 c2Var2 = this.f87823f;
        if (d0VarB == null || (d0VarB2 != null && d0VarB.f109211d > d0VarB2.f109211d)) {
            c2Var2.setValue(null);
            c2Var.setValue(null);
        } else {
            c2Var2.setValue(d0VarB);
            c2Var.setValue(d0VarB2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.c5
    public final Long k() {
        l3.d0 d0Var = (l3.d0) this.f87823f.getF182175a();
        if (d0Var != null) {
            return Long.valueOf(d0Var.f109211d);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/d5$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d5(Long l14, Long l15, Long l16, j23.l lVar, int i14, bc bcVar, Locale locale, p005kotlin.jvm.internal.j jVar) {
        this(l14, l15, l16, lVar, i14, bcVar, locale);
    }
}
