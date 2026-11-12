package com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.h1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import e32.e;
import fw.p;
import lc.u0;
import nf0.o;
import nf0.u;
import nf0.z;
import o13.r;
import o53.b0;
import o53.f0;
import of0.f;
import of0.h;
import of0.i;
import of0.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import r22.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/FirstTimeUseFragment;", "Lnf0/z;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FirstTimeUseFragment extends z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f34793m = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f34794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlayerView f34795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f34796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f34797l;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/FirstTimeUseFragment$b", "Le32/e;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends e<g3<? extends Boolean>> {

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34799a;

            static {
                int[] iArr = new int[p.values().length];
                try {
                    iArr[p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f34799a = iArr;
            }
        }

        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e32.e
        public final void a(g3<? extends Boolean> g3Var) {
            g3<? extends Boolean> g3Var2 = g3Var;
            int i14 = a.f34799a[g3Var2.f35300a.ordinal()];
            FirstTimeUseFragment firstTimeUseFragment = FirstTimeUseFragment.this;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        u0.r();
                        return;
                    } else {
                        int i15 = FirstTimeUseFragment.f34793m;
                        firstTimeUseFragment.F6();
                        return;
                    }
                }
                a2 a2Var = a2.ONBOARDING;
                String strN = fb1.c.n("[checkIsEcgAppEnabled] error: ", g3Var2.f35302c);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "FirstTimeUseFragment", strN);
                int i16 = FirstTimeUseFragment.f34793m;
                firstTimeUseFragment.hideProgressOverlay();
                if (g3Var2.f35303d instanceof IllegalStateException) {
                    firstTimeUseFragment.I6(new h(firstTimeUseFragment, 2));
                    return;
                } else {
                    FirstTimeUseFragment.G6(firstTimeUseFragment);
                    return;
                }
            }
            int i17 = FirstTimeUseFragment.f34793m;
            firstTimeUseFragment.hideProgressOverlay();
            Boolean bool = (Boolean) g3Var2.f35301b;
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "FirstTimeUseFragment", "[checkIsEcgAppEnabled] ECG app enabled=" + bool);
            if (s.g(bool, Boolean.FALSE)) {
                i2.a.b(a2Var2, "FirstTimeUseFragment", "[launchEcgAppOnDevice] launching ECG app");
                o oVarZ6 = firstTimeUseFragment.z6();
                y0 y0Var = new y0();
                y0Var.j(g3.a.c(g3.f35298f));
                ge1.b.T(v1.a(oVarZ6), null, null, new u(oVarZ6, y0Var, null), 3);
                y0Var.f(firstTimeUseFragment, new i(firstTimeUseFragment));
                return;
            }
            i2.a.b(a2Var2, "FirstTimeUseFragment", "[checkIsEcgAppEnabled] ECG app already enabled");
            o oVarZ7 = firstTimeUseFragment.z6();
            i2.a.b(a2Var2, "EcgOnboardingViewModel", "[ecgAppEnabledOnDevice] ECG app already enabled");
            oVarZ7.f125784a.d(oVarZ7.f125821c);
            y0<g3<Unit>> y0Var2 = oVarZ7.f125823e;
            if (y0Var2 != null) {
                y0Var2.j(g3.a.e(g3.f35298f));
            } else {
                s.m("ecgFirstReadingRecorded");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment$displayOnStarted$1", f = "FirstTimeUseFragment.kt", l = {503}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34800a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f34802c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.FirstTimeUseFragment$displayOnStarted$1$1", f = "FirstTimeUseFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f34803a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f34803a = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f34803a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f34803a.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f34802c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FirstTimeUseFragment.this.new c(this.f34802c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f34800a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(this.f34802c, null);
                this.f34800a = 1;
                if (h1.b(FirstTimeUseFragment.this, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34804a;

        public d(l lVar) {
            lVar.getClass();
            this.f34804a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f34804a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34804a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    public FirstTimeUseFragment() {
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new b50.h(3));
        cVarRegisterForActivityResult.getClass();
        this.f34797l = cVarRegisterForActivityResult;
    }

    public static final void G6(FirstTimeUseFragment firstTimeUseFragment) {
        firstTimeUseFragment.getClass();
        o0.a aVar = o0.f149771c;
        String string = firstTimeUseFragment.getString(R.string.lbl_unable_to_launch_ecg_app);
        String string2 = firstTimeUseFragment.getString(R.string.msg_unable_to_launch_ecg_app);
        of0.e eVar = new of0.e(firstTimeUseFragment, 7);
        of0.e eVar2 = new of0.e(firstTimeUseFragment, 8);
        aVar.getClass();
        firstTimeUseFragment.I6(new f(firstTimeUseFragment, o0.a.a(string, string2, R.string.lbl_retry, eVar, R.string.lbl_exit_setup_capitalized, eVar2), 0));
    }

    @Override // nf0.z
    public final void C6(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        this.f34794i = linearLayout;
        linearLayout.removeAllViewsInLayout();
        LayoutInflater layoutInflater2 = getLayoutInflater();
        LinearLayout linearLayout2 = this.f34794i;
        if (linearLayout2 == null) {
            s.m("rootContainer");
            throw null;
        }
        View viewInflate = layoutInflater2.inflate(R.layout.container_first_time_use, (ViewGroup) linearLayout2, false);
        LinearLayout linearLayout3 = this.f34794i;
        if (linearLayout3 == null) {
            s.m("rootContainer");
            throw null;
        }
        linearLayout3.addView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.ecg_video_content);
        viewFindViewById.getClass();
        this.f34795j = (PlayerView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.ecg_video_error_state);
        viewFindViewById2.getClass();
        this.f34796k = viewFindViewById2;
        final int i14 = 0;
        z6().f125833o.f(this, new d(new l(this) { // from class: of0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirstTimeUseFragment f131679b;

            {
                this.f131679b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Integer num;
                int i15 = i14;
                FirstTimeUseFragment firstTimeUseFragment = this.f131679b;
                int i16 = 0;
                int i17 = 1;
                switch (i15) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        int i18 = FirstTimeUseFragment.f34793m;
                        if (num2 != null && num2.intValue() == 1) {
                            if (firstTimeUseFragment.isAdded()) {
                                o0.a aVar = o0.f149771c;
                                String string = firstTimeUseFragment.getString(R.string.lbl_video_download_failed_dialog_title);
                                String string2 = firstTimeUseFragment.getString(R.string.connect_iq_try_again);
                                e eVar = new e(firstTimeUseFragment, i16);
                                e eVar2 = new e(firstTimeUseFragment, i17);
                                aVar.getClass();
                                o0.a.a(string, string2, R.string.lbl_retry, eVar, R.string.lbl_exit_setup_capitalized, eVar2).u6(firstTimeUseFragment);
                            }
                        } else if (num2 != null && num2.intValue() == 2) {
                            firstTimeUseFragment.M6();
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var = (g3) obj;
                        int i19 = FirstTimeUseFragment.f34793m;
                        firstTimeUseFragment.S6();
                        fw.p pVar = g3Var.f35300a;
                        if (pVar == fw.p.LOADING) {
                            firstTimeUseFragment.F6();
                        }
                        if (pVar == fw.p.SUCCESS) {
                            Uri uri = (Uri) g3Var.f35301b;
                            if (uri != null) {
                                View view2 = firstTimeUseFragment.f34796k;
                                if (view2 == null) {
                                    p005kotlin.jvm.internal.s.m("videoErrorView");
                                    throw null;
                                }
                                view2.setVisibility(4);
                                PlayerView playerView = firstTimeUseFragment.f34795j;
                                if (playerView == null) {
                                    p005kotlin.jvm.internal.s.m("videoView");
                                    throw null;
                                }
                                playerView.setVisibility(0);
                                androidx.media3.exoplayer.v vVarA = new ExoPlayer.b(firstTimeUseFragment.requireActivity()).a();
                                androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
                                cVar.f8447b = uri;
                                vVarA.k(cVar.a());
                                vVarA.prepare();
                                vVarA.setPlayWhenReady(true);
                                vVarA.setRepeatMode(2);
                                vVarA.f9751l.a(new k(firstTimeUseFragment));
                                PlayerView playerView2 = firstTimeUseFragment.f34795j;
                                if (playerView2 == null) {
                                    p005kotlin.jvm.internal.s.m("videoView");
                                    throw null;
                                }
                                playerView2.setPlayer(vVarA);
                            } else {
                                Integer num3 = (Integer) firstTimeUseFragment.z6().f125834p.d();
                                if ((num3 != null ? num3.intValue() : 0) > 0) {
                                    firstTimeUseFragment.S6();
                                    firstTimeUseFragment.hideProgressOverlay();
                                    firstTimeUseFragment.M6();
                                } else {
                                    Integer num4 = (Integer) firstTimeUseFragment.z6().f125833o.d();
                                    if (num4 != null && num4.intValue() == 0) {
                                        firstTimeUseFragment.z6().M4();
                                    }
                                }
                            }
                        } else {
                            fw.p pVar2 = fw.p.ERROR;
                            if (pVar == pVar2 && (num = (Integer) firstTimeUseFragment.z6().f125833o.d()) != null && num.intValue() == 0) {
                                firstTimeUseFragment.z6().M4();
                            } else if (pVar == pVar2) {
                                firstTimeUseFragment.hideProgressOverlay();
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        z6().f125825g.f(this, new d(new l(this) { // from class: of0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirstTimeUseFragment f131679b;

            {
                this.f131679b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                Integer num;
                int i16 = i15;
                FirstTimeUseFragment firstTimeUseFragment = this.f131679b;
                int i17 = 0;
                int i18 = 1;
                switch (i16) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        int i19 = FirstTimeUseFragment.f34793m;
                        if (num2 != null && num2.intValue() == 1) {
                            if (firstTimeUseFragment.isAdded()) {
                                o0.a aVar = o0.f149771c;
                                String string = firstTimeUseFragment.getString(R.string.lbl_video_download_failed_dialog_title);
                                String string2 = firstTimeUseFragment.getString(R.string.connect_iq_try_again);
                                e eVar = new e(firstTimeUseFragment, i17);
                                e eVar2 = new e(firstTimeUseFragment, i18);
                                aVar.getClass();
                                o0.a.a(string, string2, R.string.lbl_retry, eVar, R.string.lbl_exit_setup_capitalized, eVar2).u6(firstTimeUseFragment);
                            }
                        } else if (num2 != null && num2.intValue() == 2) {
                            firstTimeUseFragment.M6();
                        }
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var = (g3) obj;
                        int i110 = FirstTimeUseFragment.f34793m;
                        firstTimeUseFragment.S6();
                        fw.p pVar = g3Var.f35300a;
                        if (pVar == fw.p.LOADING) {
                            firstTimeUseFragment.F6();
                        }
                        if (pVar == fw.p.SUCCESS) {
                            Uri uri = (Uri) g3Var.f35301b;
                            if (uri != null) {
                                View view2 = firstTimeUseFragment.f34796k;
                                if (view2 == null) {
                                    p005kotlin.jvm.internal.s.m("videoErrorView");
                                    throw null;
                                }
                                view2.setVisibility(4);
                                PlayerView playerView = firstTimeUseFragment.f34795j;
                                if (playerView == null) {
                                    p005kotlin.jvm.internal.s.m("videoView");
                                    throw null;
                                }
                                playerView.setVisibility(0);
                                androidx.media3.exoplayer.v vVarA = new ExoPlayer.b(firstTimeUseFragment.requireActivity()).a();
                                androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
                                cVar.f8447b = uri;
                                vVarA.k(cVar.a());
                                vVarA.prepare();
                                vVarA.setPlayWhenReady(true);
                                vVarA.setRepeatMode(2);
                                vVarA.f9751l.a(new k(firstTimeUseFragment));
                                PlayerView playerView2 = firstTimeUseFragment.f34795j;
                                if (playerView2 == null) {
                                    p005kotlin.jvm.internal.s.m("videoView");
                                    throw null;
                                }
                                playerView2.setPlayer(vVarA);
                            } else {
                                Integer num3 = (Integer) firstTimeUseFragment.z6().f125834p.d();
                                if ((num3 != null ? num3.intValue() : 0) > 0) {
                                    firstTimeUseFragment.S6();
                                    firstTimeUseFragment.hideProgressOverlay();
                                    firstTimeUseFragment.M6();
                                } else {
                                    Integer num4 = (Integer) firstTimeUseFragment.z6().f125833o.d();
                                    if (num4 != null && num4.intValue() == 0) {
                                        firstTimeUseFragment.z6().M4();
                                    }
                                }
                            }
                        } else {
                            fw.p pVar2 = fw.p.ERROR;
                            if (pVar == pVar2 && (num = (Integer) firstTimeUseFragment.z6().f125833o.d()) != null && num.intValue() == 0) {
                                firstTimeUseFragment.z6().M4();
                            } else if (pVar == pVar2) {
                                firstTimeUseFragment.hideProgressOverlay();
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        w6().setText(getString(R.string.lbl_launch_ecg_app));
    }

    @Override // nf0.z
    public final void E6() {
        if (!z6().f125830l.l()) {
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "FirstTimeUseFragment", "[launchEcgApp] bluetooth off");
            o0.a aVar = o0.f149771c;
            String string = getString(R.string.lbl_no_bluetooth);
            String string2 = getString(R.string.msg_setup_no_bluetooth);
            of0.e eVar = new of0.e(this, 11);
            of0.e eVar2 = new of0.e(this, 12);
            aVar.getClass();
            I6(new f(this, o0.a.a(string, string2, R.string.lbl_settings, eVar, R.string.lbl_exit_setup_capitalized, eVar2), 1));
            return;
        }
        o oVarZ6 = z6();
        y0<g3<Unit>> y0Var = new y0<>();
        oVarZ6.f125823e = y0Var;
        y0Var.j(g3.a.c(g3.f35298f));
        y0<g3<Unit>> y0Var2 = oVarZ6.f125823e;
        if (y0Var2 == null) {
            s.m("ecgFirstReadingRecorded");
            throw null;
        }
        y0Var2.f(this, new j(this));
        getViewLifecycleOwner().getF158016a().a(new nf0.p(z6()));
        H6();
    }

    public final void H6() {
        o oVarZ6 = z6();
        y0 y0Var = new y0();
        y0Var.j(g3.a.c(g3.f35298f));
        ge1.b.T(v1.a(oVarZ6), null, null, new nf0.s(oVarZ6, y0Var, null), 3);
        y0Var.f(this, new b());
    }

    public final void I6(e23.a<Unit> aVar) {
        ge1.b.T(f0.w(this), null, null, new c(aVar, null), 3);
    }

    public final boolean J6() {
        Fragment fragmentG = getChildFragmentManager().G("ActivationFailedDialog");
        return fragmentG != null && fragmentG.isAdded();
    }

    public final boolean K6() {
        Fragment fragmentG = getChildFragmentManager().G("DeviceNotConnectedDialog");
        return fragmentG != null && fragmentG.isAdded();
    }

    public final void M6() {
        if (isAdded()) {
            o0.a.b(o0.f149771c, getString(R.string.lbl_video_unable_to_download_dialog_title), getString(R.string.lbl_video_unable_to_download_dialog_message), R.string.lbl_exit_setup_capitalized, new of0.e(this, 2), 0, null, 48).u6(this);
        }
    }

    public final void S6() {
        View view2 = this.f34796k;
        if (view2 == null) {
            s.m("videoErrorView");
            throw null;
        }
        view2.setVisibility(0);
        PlayerView playerView = this.f34795j;
        if (playerView != null) {
            playerView.setVisibility(4);
        } else {
            s.m("videoView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        PlayerView playerView = this.f34795j;
        if (playerView == null) {
            s.m("videoView");
            throw null;
        }
        if (playerView.getPlayer() != null) {
            View view2 = this.f34796k;
            if (view2 == null) {
                s.m("videoErrorView");
                throw null;
            }
            view2.setVisibility(4);
            PlayerView playerView2 = this.f34795j;
            if (playerView2 == null) {
                s.m("videoView");
                throw null;
            }
            playerView2.setVisibility(0);
            PlayerView playerView3 = this.f34795j;
            if (playerView3 == null) {
                s.m("videoView");
                throw null;
            }
            androidx.media3.common.z player = playerView3.getPlayer();
            if (player != null) {
                player.play();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ecg/presentation/onboarding/steps/FirstTimeUseFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TAG_DEVICE_NOT_CONNECTED_DIALOG", "TAG_ACTIVATION_FAILED_DIALOG", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
