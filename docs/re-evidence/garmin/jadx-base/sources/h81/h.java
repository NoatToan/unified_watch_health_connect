package h81;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import f2.o;
import fp0.l;
import g81.t;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lh81/h;", "Lh82/c;", "<init>", "()V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h82.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f82423h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f82424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f82425g;

    static {
        new a(null);
    }

    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        Parcelable parcelable;
        o0 o0VarE = mVar.E(281385083);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("extra_endurance_stamina_help_screen_ui_state", t.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("extra_endurance_stamina_help_screen_ui_state");
                if (!(parcelable2 instanceof t)) {
                    parcelable2 = null;
                }
                parcelable = (t) parcelable2;
            }
            this.f82424f = (t) parcelable;
            this.f82425g = bundle.getString("GCM_extra_activity_type", null);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (am.z0.b(am.x0.f4312o, r14.f82425g) != false) goto L8;
     */
    @Override // h82.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        if (k1Var.X()) {
            String str = this.f82425g;
            z0 z0Var = z0.f4390a;
            if (!z0.b(x0.f4308n, str)) {
            }
            String string = context.getString(R.string.lbl_stamina_zones);
            b.f82406a.getClass();
            return w.c(new h82.c.b("DEFAULT_ACTION", string, null, b.f82407b, 4, null));
        }
        bv.b.a();
        int i14 = 1;
        if (!k1Var.X()) {
            return w.c(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-2017135025, true, new g(this, 2)), 4, null));
        }
        h82.c.b bVar = new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(2075542000, true, new g(this, 0)), 4, null);
        h82.c.b bVar2 = new h82.c.b("endurance_score_action", context.getString(R.string.lbl_endurance_score), null, new z3.e(-1048216625, true, new g(this, i14)), 4, null);
        String string2 = context.getString(R.string.lbl_stamina);
        b.f82406a.getClass();
        return x.k(bVar, bVar2, new h82.c.b("stamina_action", string2, null, b.f82408c, 4, null), new h82.c.b("stamina_zones_action", context.getString(R.string.lbl_stamina_zones), null, b.f82409d, 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(1084037779);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(1458172543, new g(this, 3), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(this, i14, 11);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lh81/h$a;", "", "<init>", "()V", "", "EXTRA_ENDURANCE_STAMINA_HELP_SCREEN_UI_STATE", "Ljava/lang/String;", "ENDURANCE_SCORE_ACTION", "STAMINA_ACTION", "STAMINA_ZONES_ACTION", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
