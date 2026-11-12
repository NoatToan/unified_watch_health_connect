package com.garmin.android.apps.connectmobile.ecg.presentation.stats;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.m;
import androidx.media3.common.t;
import androidx.media3.exoplayer.ExoPlayer;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.r;
import java.util.List;
import mg2.o;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import p3.h0;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p2;
import p3.q1;
import p3.x1;
import pf0.u;
import pf0.v;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/b;", "Lh82/c;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h82.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f34893h = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f34895g;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.ecg.presentation.stats.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0590b<T extends Throwable> implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f34896a;

        public C0590b(Context context) {
            this.f34896a = context;
        }

        @Override // androidx.media3.common.m
        public final Pair a(PlaybackException playbackException) {
            return new Pair(Integer.valueOf(playbackException.errorCode), this.f34896a.getString(R.string.lbl_video_load_failed));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/stats/b$c", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f34897a;

        public c(ExoPlayer exoPlayer) {
            this.f34897a = exoPlayer;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f34897a.release();
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1504351336);
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
            this.f34894f = bundle.getBoolean("SINGLE_PAGE_EXTRA");
            if (bundle.getString("ECG_VIDEO_URI_EXTRA") != null) {
                this.f34895g = Uri.parse(bundle.getString("ECG_VIDEO_URI_EXTRA"));
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, 15);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        boolean z14 = this.f34894f;
        int i14 = z14 ? R.string.lbl_help : R.string.lbl_results_you_might_see;
        int i15 = z14 ? R.string.lbl_help : R.string.lbl_important_things_to_know;
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new e(-502217388, true, new u(this, 6)), 4, null), new h82.c.b("SINUS_ACTION", context.getString(i14), null, new e(-1206080363, true, new u(this, 7)), 4, null), new h82.c.b("ATRIAL_ACTION", context.getString(i14), null, new e(-1909943338, true, new u(this, 8)), 4, null), new h82.c.b("HEART_RATE_ACTION", context.getString(i14), null, new e(1681160983, true, new u(this, 0)), 4, null), new h82.c.b("INCONCLUSIVE_ACTION", context.getString(i14), null, new e(977298008, true, new u(this, 1)), 4, null), new h82.c.b("ECG_CAPABILITIES_ACTION", context.getString(i15), null, new e(273435033, true, new u(this, 2)), 4, null), new h82.c.b("USING_THE_APP_ACTION", context.getString(i15), null, new e(-430427942, true, new u(this, 3)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1338323980);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            pf0.b.f137466a.getClass();
            h82.e.a(pf0.b.f137468c, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 0);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(557824488);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            pf0.b.f137466a.getClass();
            h82.e.a(pf0.b.f137471f, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 3);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1025109791);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            pf0.b.f137466a.getClass();
            h82.e.a(pf0.b.f137469d, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 4);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1340065237);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            pf0.b.f137466a.getClass();
            h82.e.a(pf0.b.f137470e, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 5);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1912856912);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.b(f.c(-1719419676, new u(this, 5), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 6);
        }
    }

    public final void l(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-693038287);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            pf0.b.f137466a.getClass();
            h82.e.a(pf0.b.f137467b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 1);
        }
    }

    public final void m(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1987631635);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            h82.e.a(f.c(-1689968282, new u(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(this, i14, 2);
        }
    }

    public final void n(Uri uri, p3.m mVar, int i14) {
        Object obj;
        o0 o0VarE = mVar.E(1556360722);
        int i15 = (o0VarE.r(uri) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                androidx.media3.exoplayer.v vVarA = new ExoPlayer.b(context).a();
                t.c cVar = new t.c();
                cVar.f8447b = uri;
                vVarA.k(cVar.a());
                vVarA.prepare();
                vVarA.setPlayWhenReady(true);
                vVarA.setRepeatMode(2);
                o0VarE.K(vVarA);
                obj = vVarA;
            }
            obj = objQ;
            ExoPlayer exoPlayer = (ExoPlayer) obj;
            exoPlayer.getClass();
            boolean zR = o0VarE.r(exoPlayer) | o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new o50.a(28, exoPlayer, context);
                o0VarE.K(objQ2);
            }
            l lVar = (l) objQ2;
            r rVarH = x2.h(x2.f(r.S, 1.0f), gl.b.q(o0VarE, R.dimen.gcm3_size_220dp));
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            bVar.getClass();
            p002j6.c.b(lVar, c2.l.B(rVarH, f14, f15, f15, eVar.f97918c), null, o0VarE, 0, 4);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(exoPlayer);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new q1(exoPlayer, 16);
                o0VarE.K(objQ3);
            }
            l0.a(unit, (l) objQ3, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oo0.f(this, uri, i14, 14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/stats/b$a;", "", "<init>", "()V", "", "SINGLE_PAGE_EXTRA", "Ljava/lang/String;", "ECG_VIDEO_URI_EXTRA", "SINUS_ACTION", "ATRIAL_ACTION", "HEART_RATE_ACTION", "INCONCLUSIVE_ACTION", "ECG_CAPABILITIES_ACTION", "USING_THE_APP_ACTION", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
