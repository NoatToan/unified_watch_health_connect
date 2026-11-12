package com.garmin.android.apps.connectmobile.training.fbtap.dashboard;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerView;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.google.android.exoplayer2.util.MimeTypes;
import e23.p;
import h4.k;
import h5.e0;
import h5.g;
import java.util.Locale;
import java.util.Map;
import kotlin.w3;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p3.b4;
import p3.h0;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ty1.g2;
import v.h;
import v13.i;
import vc0.v;
import vg1.z0;
import zy0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTTrainingGuidancePlayerActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "<init>", "()V", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FBTTrainingGuidancePlayerActivity extends z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45483c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ExoPlayer f45484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f45485b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTTrainingGuidancePlayerActivity$b;", "Landroidx/lifecycle/a;", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "<init>", "(Landroid/app/Application;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.lifecycle.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f45486a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application) {
            super(application);
            application.getClass();
            this.f45486a = m.b(new v(application, 13));
        }

        @Override // androidx.lifecycle.u1
        public final void onCleared() {
            super.onCleared();
            ((ExoPlayer) this.f45486a.getValue()).release();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTTrainingGuidancePlayerActivity$c", "Landroidx/media3/ui/PlayerView$c;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements PlayerView.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PlayerView f45488b;

        public c(PlayerView playerView) {
            this.f45488b = playerView;
        }

        @Override // androidx.media3.ui.PlayerView.c
        public final void a(int i14) {
            a aVar = FBTTrainingGuidancePlayerActivity.f45483c;
            FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity = FBTTrainingGuidancePlayerActivity.this;
            fBTTrainingGuidancePlayerActivity.getClass();
            this.f45488b.findViewById(R.id.exo_settings).setOnClickListener(new z0(fBTTrainingGuidancePlayerActivity, 3));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity$PlayerUI$1$1", f = "FBTTrainingGuidancePlayerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f45489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<String> f45490b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTTrainingGuidancePlayerActivity$PlayerUI$1$1$1", f = "FBTTrainingGuidancePlayerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p1<String> f45491a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p1<String> p1Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f45491a = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f45491a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f45491a.setValue(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p1<String> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f45490b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f45490b, dVar);
            dVar2.f45489a = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f45489a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x53.c cVar = s0.f129406a;
            ge1.b.T(b0Var, x53.b.f189152a, null, new a(this.f45490b, null), 2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTTrainingGuidancePlayerActivity$e", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements h0 {
        public e() {
        }

        @Override // p3.h0
        public final void dispose() {
            FBTTrainingGuidancePlayerActivity fBTTrainingGuidancePlayerActivity = FBTTrainingGuidancePlayerActivity.this;
            ExoPlayer exoPlayer = fBTTrainingGuidancePlayerActivity.f45484a;
            if (exoPlayer != null) {
                exoPlayer.release();
            }
            fBTTrainingGuidancePlayerActivity.f45484a = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    public final void aa(ExoPlayer exoPlayer, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-350097280);
        int i15 = (o0VarE.r(exoPlayer) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarA = h4.p.a(x2.d(aVar, 1.0f));
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = y.a(cVar, h4.d.a.f81537o, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarA, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            boolean zR = o0VarE.r(exoPlayer) | o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new g2(24, exoPlayer, this);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g2(24, exoPlayer, this);
                    o0VarE.K(objQ);
                }
            }
            p002j6.c.b((e23.l) objQ, x2.d(aVar, 1.0f), null, o0VarE, 48, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(this, exoPlayer, i14, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ba(Uri uri, p3.m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(-2124504572);
        int i15 = (o0VarE.r(uri) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            ExoPlayer exoPlayer = null;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new d(p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, unit, o0VarE);
            String str = (String) p1Var.getF182175a();
            if (str == null) {
                o0VarE.C(-477264423);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-477264422);
                b bVar = this.f45485b;
                if (bVar == null) {
                    s.m("playerViewModel");
                    throw null;
                }
                ExoPlayer exoPlayer2 = (ExoPlayer) bVar.f45486a.getValue();
                this.f45484a = exoPlayer2;
                if (exoPlayer2 != null) {
                    if (exoPlayer2.getMediaItemCount() == 0) {
                        androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
                        cVar.f8447b = uri;
                        cVar.f8448c = MimeTypes.APPLICATION_M3U8;
                        androidx.media3.common.t tVarA = cVar.a();
                        ha.i.b bVar2 = new ha.i.b();
                        Map mapB = t0.b(new o13.p("authorization", "Bearer ".concat(str)));
                        ha.k kVar = bVar2.f82604a;
                        synchronized (kVar) {
                            kVar.f82613b = null;
                            kVar.f82612a.clear();
                            kVar.f82612a.putAll(mapB);
                        }
                        exoPlayer2.f(new HlsMediaSource.Factory(new ha.h.a(context, bVar2)).b(tVarA));
                        exoPlayer2.prepare();
                        exoPlayer2.e(new vu1.z(this));
                        exoPlayer2.c(exoPlayer2.getTrackSelectionParameters().a().h(Locale.getDefault().getLanguage()).a());
                        exoPlayer2.setPlayWhenReady(true);
                    }
                    exoPlayer = exoPlayer2;
                }
                this.f45484a = exoPlayer;
                if (exoPlayer == null) {
                    o0VarE.C(-1145020344);
                    z14 = false;
                    o0VarE.g0(false);
                } else {
                    z14 = false;
                    o0VarE.C(-1145020343);
                    aa(exoPlayer, o0VarE, i15 & 112);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            boolean zR = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new vu1.b(this, i16);
                o0VarE.K(objQ3);
            }
            l0.a(unit, (e23.l) objQ3, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vq0.a(this, uri, i14, 8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        getWindow().addFlags(256);
        String stringExtra = getIntent().getStringExtra("extra_content_ref_url");
        ComposeView composeView = (ComposeView) findViewById(R.id.composable_container);
        this.f45485b = (b) new androidx.lifecycle.x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(b.class));
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(765175476, true, new vu1.y(this, stringExtra, 0)));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        ExoPlayer exoPlayer = this.f45484a;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        ExoPlayer exoPlayer = this.f45484a;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/dashboard/FBTTrainingGuidancePlayerActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "AUTHORIZATION_HEADER", "AUTHORIZATION_TOKEN", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
