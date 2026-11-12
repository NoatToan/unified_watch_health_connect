package w30;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.q2;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lw30/e;", "Lh82/c;", "<init>", "()V", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f181832f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_planning_climbs), null, new z3.e(-1677147977, true, new w30.b(this, 0)), 4, null), new h82.c.b("VIEWING_CLIMB_DETAILS_ACTION", context.getString(R.string.viewing_climb_details_title), null, new z3.e(1580808918, true, new w30.b(this, 1)), 4, null), new h82.c.b("CLIMB_CATEGORIES_ACTION", context.getString(R.string.climb_categories_title), null, new z3.e(543798517, true, new w30.b(this, 2)), 4, null), new h82.c.b("CLIMB_GRADE_ACTION", context.getString(R.string.climb_grade_title), null, new z3.e(-493211884, true, new w30.b(this, 3)), 4, null), new h82.c.b("CREATE_COURSES_WITH_CLIMBS_ACTION", context.getString(R.string.create_courses_with_climbs), null, new z3.e(-1530222285, true, new w30.b(this, 4)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(2033420061);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w30.a.f181821a.getClass();
            h82.e.a(w30.a.f181823c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 1);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(1337356389);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w30.a.f181821a.getClass();
            h82.e.a(w30.a.f181824d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 2);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(745825575);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            w30.a.f181821a.getClass();
            h82.e.a(w30.a.f181822b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 3);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(1079794172);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-683764401, new ub1.e(this), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 0);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-2113241285);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(f.c(805089063, new w30.b(this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(this, i14, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lw30/e$a;", "", "<init>", "()V", "", "VIEWING_CLIMB_DETAILS_ACTION", "Ljava/lang/String;", "CLIMB_CATEGORIES_ACTION", "CLIMB_GRADE_ACTION", "CREATE_COURSES_WITH_CLIMBS_ACTION", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw30/e$b;", "", "Lo4/d0;", "icon", "", "percent", "description", "<init>", "(JIILkotlin/jvm/internal/j;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f181833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f181834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f181835c;

        private b(long j8, int i14, int i15) {
            this.f181833a = j8;
            this.f181834b = i14;
            this.f181835c = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return d0.d(this.f181833a, bVar.f181833a) && this.f181834b == bVar.f181834b && this.f181835c == bVar.f181835c;
        }

        public final int hashCode() {
            d0.a aVar = d0.f128823b;
            z.a aVar2 = z.f128618b;
            return Integer.hashCode(this.f181835c) + q2.d(this.f181834b, Long.hashCode(this.f181833a) * 31, 31);
        }

        public final String toString() {
            return am.j.q(androidx.core.view.j.k(this.f181834b, "RowItem(icon=", d0.j(this.f181833a), ", percent=", ", description="), this.f181835c, ")");
        }

        public /* synthetic */ b(long j8, int i14, int i15, j jVar) {
            this(j8, i14, i15);
        }
    }
}
