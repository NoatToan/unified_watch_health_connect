package kq;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkq/j0;", "Lh82/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106090g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.o.c f106091f;

    static {
        new a(null);
    }

    public static String h(double d14) {
        if (Double.isNaN(d14)) {
            return "";
        }
        l3.a aVar = l3.f23124b;
        Double dValueOf = Double.valueOf(d14);
        aVar.getClass();
        return l3.a.U(dValueOf, l3.f23131i);
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        p3.o0 o0VarE = mVar.E(-2026478753);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 18;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("extra_cycling_dynamics_dto", com.garmin.android.apps.connectmobile.activities.newmodel.o.c.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("extra_cycling_dynamics_dto");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.c)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.activities.newmodel.o.c) parcelable2;
            }
            this.f106091f = (com.garmin.android.apps.connectmobile.activities.newmodel.o.c) parcelable;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return p13.w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.activity_details_power_phase_help), null, new z3.e(-58691214, true, new i0(this, 0)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-423291529);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(-1799928477, new i0(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kk1.h(this, i14, 5);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq/j0$a;", "", "<init>", "()V", "", "EXTRA_CYCLING_DYNAMICS_DTO", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
