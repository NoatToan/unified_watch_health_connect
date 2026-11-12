package pf1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpf1/g;", "Lh82/c;", "<init>", "()V", "a", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f137573f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(1932012996, true, new d(this, 0)), 4, null);
        h82.c.b bVar2 = new h82.c.b("RUNNING_TOLERANCE", context.getString(R.string.running_tolerance_help_about_title), null, new z3.e(1504743267, true, new d(this, 1)), 4, null);
        h82.c.b bVar3 = new h82.c.b("WEEKLY_TOLERANCE", context.getString(R.string.weekly_tolerance), null, new z3.e(1077473538, true, new d(this, 2)), 4, null);
        String string = context.getString(R.string.impact_load);
        b.f137561a.getClass();
        return x.k(bVar, bVar2, bVar3, new h82.c.b("IMPACT_LOAD", string, null, b.f137562b, 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-36486116);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            b.f137561a.getClass();
            h82.e.a(b.f137563c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 0);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1850356152);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(62182452, new d(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 1);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(1542666494);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            b.f137561a.getClass();
            h82.e.a(b.f137564d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lpf1/g$a;", "", "<init>", "()V", "", "RUNNING_TOLERANCE", "Ljava/lang/String;", "WEEKLY_TOLERANCE", "IMPACT_LOAD", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
