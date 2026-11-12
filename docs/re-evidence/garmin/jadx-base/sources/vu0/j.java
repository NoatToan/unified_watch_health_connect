package vu0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvu0/j;", "Lh82/c;", "<init>", "()V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends h82.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f180247o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f180248f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f180249g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f180250h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f180251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f180252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f180253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f180254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f180255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f180256n;

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1277158753);
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
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            this.f180249g = bundle.getBoolean("GCM_extra_key_include_strava_help", false);
            this.f180250h = bundle.getBoolean("GCM_extra_key_include_course_sharing_help", true);
            this.f180251i = bundle.getBoolean("GCM_extra_key_include_spec_msg_help", false);
            this.f180252j = bundle.getBoolean("GCM_extra_key_include_premium_help", false);
            this.f180253k = bundle.getBoolean("GCM_extra_key_include_has_subscription", false);
            this.f180254l = bundle.getBoolean("GCM_extra_key_child_restrictions", false);
            this.f180255m = bundle.getString("GCM_extra_key_delete_profile_url");
            this.f180248f = !s3.b();
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(activity);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new pg2.d(activity, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new pg2.d(activity, 5);
                    o0VarE.K(objQ);
                }
            }
            this.f180256n = w.c(hVar, (l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(this, bundle, i14, 29);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(607652173, true, new e(this, 2)), 4, null), new h82.c.b("HOW_IT_WORKS", context.getString(R.string.lbl_how_it_works), null, new z3.e(-661017906, true, new e(this, 3)), 4, null), new h82.c.b("SHARING_OPTIONS", context.getString(R.string.lbl_sharing), null, new z3.e(-1929687985, true, new e(this, 4)), 4, null), new h82.c.b("PROFILE_AND_PRIVACY", context.getString(R.string.lbl_livetrack_profile_privacy), null, new z3.e(1096609232, true, new e(this, 5)), 4, null), new h82.c.b("GROUP_TRACK", context.getString(R.string.lbl_grouptrack), context.getString(R.string.lbl_group_track), new z3.e(-172060847, true, new e(this, 6))), new h82.c.b("AUTO_START", context.getString(R.string.live_track_auto_start), null, new z3.e(-1440730926, true, new e(this, 7)), 4, null), new h82.c.b("SHARE_COURSE", context.getString(R.string.lbl_show_course), null, new z3.e(1585566291, true, new e(this, 8)), 4, null), new h82.c.b("STRAVA_BEACON", context.getString(R.string.lbl_feature_tour_strava_beacon), null, new z3.e(316896212, true, new e(this, 9)), 4, null), new h82.c.b("ALLOW_MESSAGES", context.getString(R.string.live_track_spectator_messaging), null, new z3.e(-951773867, true, new e(this, 0)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(1373730506);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180227g, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 5);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(-616196020);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180224d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 7);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(64275255);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180223c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 2);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(109818748);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180222b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 0);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1007900815);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-691016322, new g(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 1);
        }
    }

    public final void l(m mVar, int i14) {
        o0 o0VarE = mVar.E(-417563575);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(z3.f.c(723158237, new e(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 8);
        }
    }

    public final void m(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1746542523);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180225e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 3);
        }
    }

    public final void n(m mVar, int i14) {
        o0 o0VarE = mVar.E(-190272543);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(z3.f.c(-222458188, new g(this, (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 6);
        }
    }

    public final void o(m mVar, int i14) {
        o0 o0VarE = mVar.E(-2036758360);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            vu0.a.f180221a.getClass();
            h82.e.a(vu0.a.f180226f, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, i14, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lvu0/j$a;", "", "<init>", "()V", "", "ACTION_HOW_IT_WORKS", "Ljava/lang/String;", "ACTION_SHARING_OPTIONS", "ACTION_PROFILE_AND_PRIVACY", "ACTION_GROUP_TRACK", "ACTION_AUTO_START", "ACTION_SHARE_COURSE", "ACTION_STRAVA_BEACON", "ACTION_ALLOW_MESSAGES", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
