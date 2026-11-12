package aq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laq/h;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h82.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11972f = 0;

    static {
        new a(null);
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(372810312, true, new e(this, 0)), 4, null), new h82.c.b("WORKOUT_FEEL_ACTION", context.getString(R.string.lbl_workout_feel), null, new z3.e(495714249, true, new e(this, 1)), 4, null), new h82.c.b("WORKOUT_PERCEIVED_EFFORT_ACTION", context.getString(R.string.lbl_perceived_effort), null, new z3.e(618618186, true, new e(this, 2)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1925533917);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            j.f12013a.getClass();
            h82.e.a(j.f12015c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, i14, 2);
        }
    }

    public final void h(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(993142084);
        int i15 = ((i14 & 8) == 0 ? o0VarE.B(this) : o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-2050433576, new e(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, i14, 0);
        }
    }

    public final void i(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(549338583);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            j.f12013a.getClass();
            h82.e.a(j.f12014b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(this, i14, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Laq/h$a;", "", "<init>", "()V", "", "WORKOUT_FEEL_ACTION", "Ljava/lang/String;", "WORKOUT_PERCEIVED_EFFORT_ACTION", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
