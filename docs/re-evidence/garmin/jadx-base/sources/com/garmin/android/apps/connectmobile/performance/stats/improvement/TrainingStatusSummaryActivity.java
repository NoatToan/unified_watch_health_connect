package com.garmin.android.apps.connectmobile.performance.stats.improvement;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity;
import com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceActivity;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import e32.j;
import e32.k;
import e32.n;
import e32.o;
import f12.l;
import java.util.ArrayList;
import lc.u0;
import o13.r;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import v13.i;
import vb.h;
import vg1.z0;
import w61.p;
import w61.q;
import w61.r0;
import w61.x;
import zb0.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/TrainingStatusSummaryActivity;", "Le32/n;", "Lw61/p;", "Le32/f;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingStatusSummaryActivity extends n<p> implements e32.f, com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f40068w = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x61.p f40069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f40070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem f40072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40073r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f40074t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f40075v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40076a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40076a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/stats/improvement/TrainingStatusSummaryActivity$c", "Le32/k;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends k {
        public c() {
            super(null, 1, null);
        }

        @Override // e32.k
        public final Fragment c(DateTime dateTime) {
            com.garmin.android.apps.connectmobile.performance.stats.improvement.a.Z.getClass();
            return new com.garmin.android.apps.connectmobile.performance.stats.improvement.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity$onActivityResult$1$1", f = "TrainingStatusSummaryActivity.kt", l = {GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40079c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f40079c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return TrainingStatusSummaryActivity.this.new d(this.f40079c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40077a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = TrainingStatusSummaryActivity.this.f40070o;
                if (xVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                this.f40077a = 1;
                if (xVar.A4(this.f40079c, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/stats/improvement/TrainingStatusSummaryActivity$e", "Landroidx/viewpager/widget/ViewPager$j;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements ViewPager.j {
        public e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            TrainingStatusSummaryActivity trainingStatusSummaryActivity = TrainingStatusSummaryActivity.this;
            if (trainingStatusSummaryActivity.f40070o == null) {
                s.m("viewModel");
                throw null;
            }
            if (new q((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).f183243a.W2("keyShouldShowDeviceSyncTooltip", true)) {
                x xVar = trainingStatusSummaryActivity.f40070o;
                if (xVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                if (g22.n.d(xVar.D4()) && i14 > 0) {
                    if (trainingStatusSummaryActivity.f40070o == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    new q((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).f183243a.O2("keyShouldShowDeviceSyncTooltip", false);
                    RelativeLayout relativeLayout = trainingStatusSummaryActivity.f40075v;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    RelativeLayout relativeLayout2 = trainingStatusSummaryActivity.f40075v;
                    if (relativeLayout2 != null) {
                        relativeLayout2.setOnClickListener(new z0(trainingStatusSummaryActivity, 9));
                        return;
                    }
                    return;
                }
            }
            RelativeLayout relativeLayout3 = trainingStatusSummaryActivity.f40075v;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryActivity$onDeviceChanged$1", f = "TrainingStatusSummaryActivity.kt", l = {386}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40081a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40083c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f40083c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return TrainingStatusSummaryActivity.this.new f(this.f40083c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40081a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = TrainingStatusSummaryActivity.this.f40070o;
                if (xVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                this.f40081a = 1;
                if (xVar.A4(this.f40083c, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40084a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f40084a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40084a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40084a.invoke(obj);
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        ((p) obj).getClass();
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w.getClass();
        com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = new com.garmin.android.apps.connectmobile.performance.stats.improvement.d();
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_extra_start_date", j8);
        bundle.putLong("GCM_extra_end_date", j14);
        bundle.putInt("key_interval_type", i14);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new f(str, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        ArrayList parcelableArrayListExtra;
        com.garmin.android.apps.connectmobile.performance.model.a aVar;
        String str;
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 7777 && i15 == -1) {
            if (intent != null) {
                parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("EXTRA_ALL_USED_DEVICE", com.garmin.android.apps.connectmobile.performance.model.a.class) : intent.getParcelableArrayListExtra("EXTRA_ALL_USED_DEVICE");
            } else {
                parcelableArrayListExtra = null;
            }
            if (parcelableArrayListExtra != null && (!parcelableArrayListExtra.isEmpty())) {
                x xVar = this.f40070o;
                if (xVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                xVar.f183272h.m(h0.g1(parcelableArrayListExtra));
            }
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_LAST_USED_DEVICE", com.garmin.android.apps.connectmobile.performance.model.a.class);
                } else {
                    Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_LAST_USED_DEVICE");
                    if (!(parcelableExtra instanceof com.garmin.android.apps.connectmobile.performance.model.a)) {
                        parcelableExtra = null;
                    }
                    parcelable = (com.garmin.android.apps.connectmobile.performance.model.a) parcelableExtra;
                }
                aVar = (com.garmin.android.apps.connectmobile.performance.model.a) parcelable;
            } else {
                aVar = null;
            }
            if (aVar == null || (str = aVar.f39917a) == null) {
                return;
            }
            ge1.b.T(f0.w(this), null, null, new d(str, null), 3);
        }
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.tabbed_pager_collapsing_layout);
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        layoutParams.getClass();
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
        layoutParams2.setScrollFlags(0);
        collapsingToolbarLayout.setLayoutParams(layoutParams2);
        this.f40074t = (TextView) findViewById(R.id.sync_device_tool_tip_label);
        this.f40075v = (RelativeLayout) findViewById(R.id.sync_tool_tip_container);
        ComposeView composeView = (ComposeView) findViewById(R.id.promotion_container);
        if (composeView != null) {
            w61.b.f183149a.getClass();
            composeView.setContent(w61.b.f183151c);
        }
        Intent intent = getIntent();
        Boolean boolValueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("EXTRA_SUMMARY_VIEW"));
        l22.a aVar = new l22.a(this);
        Resources resources = getResources();
        resources.getClass();
        this.f40070o = (x) new x1(this, new r0(new x61.k(aVar, resources), null, null, false, 4, null)).b(s0.f105811a.b(x.class));
        qa().c(new e());
        x xVar = this.f40070o;
        if (xVar == null) {
            s.m("viewModel");
            throw null;
        }
        final int i14 = 0;
        xVar.f183282q.f(this, new g(new e23.l(this) { // from class: w61.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingStatusSummaryActivity f183245b;

            {
                this.f183245b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                gj1.e primaryTrainingDevices;
                Integer primaryTrainingDeviceCount;
                int i15 = i14;
                boolean z14 = false;
                z14 = false;
                final int i16 = 1;
                final TrainingStatusSummaryActivity trainingStatusSummaryActivity = this.f183245b;
                switch (i15) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        x xVar2 = trainingStatusSummaryActivity.f40070o;
                        if (xVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        String strD4 = xVar2.D4();
                        if (g22.n.d(strD4) && (textView = trainingStatusSummaryActivity.f40074t) != null) {
                            textView.setText(trainingStatusSummaryActivity.getString(R.string.sync_for_most_accurate_status, strD4));
                        }
                        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c;
                        if (aVar2 != null && aVar2.f39920d == 1) {
                            z14 = true;
                        }
                        trainingStatusSummaryActivity.f40071p = z14;
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar2 = (fw.m) obj;
                        TrainingStatusSummaryActivity.a aVar3 = TrainingStatusSummaryActivity.f40068w;
                        if (mVar2 != null) {
                            int i17 = TrainingStatusSummaryActivity.b.f40076a[mVar2.f73769b.ordinal()];
                            if (i17 == 1) {
                                trainingStatusSummaryActivity.showProgressOverlay();
                            } else if (i17 == 2) {
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                x61.p pVar = (x61.p) mVar2.f73770c;
                                if (pVar != null) {
                                    trainingStatusSummaryActivity.f40069n = pVar;
                                    if (pVar.f189270d) {
                                        com.garmin.android.apps.connectmobile.x.a aVar4 = com.garmin.android.apps.connectmobile.x.f49750f;
                                        String string = trainingStatusSummaryActivity.getString(R.string.lbl_adaptive_training_plan);
                                        String string2 = trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_prompt);
                                        string2.getClass();
                                        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar4, string, string2, trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_label), 2131232644, 40);
                                        xVarA.f49751a = new e23.a() { // from class: w61.s
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i16) {
                                                    case 0:
                                                        TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                                        x xVar3 = trainingStatusSummaryActivity2.f40070o;
                                                        if (xVar3 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        gj1.f fVar = xVar3.J0;
                                                        if (fVar != null) {
                                                            PrimaryDeviceActivity.f43662f.getClass();
                                                            trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar));
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        x xVar4 = trainingStatusSummaryActivity.f40070o;
                                                        if (xVar4 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        w0<fw.m<x61.p>> w0Var = xVar4.f183274j;
                                                        fw.m<x61.p> mVarD = w0Var.d();
                                                        x61.p pVar2 = mVarD != null ? mVarD.f73770c : null;
                                                        if (pVar2 != null) {
                                                            pVar2.f189270d = false;
                                                        }
                                                        w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                                        ge1.b.T(v1.a(xVar4), null, null, new l0(xVar4, pVar2, null), 3);
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        xVarA.f49752b = new w11.b(25);
                                        androidx.fragment.app.v supportFragmentManager = trainingStatusSummaryActivity.getSupportFragmentManager();
                                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                        aVarB.j(R.id.notification_layout, xVarA, null, 1);
                                        aVarB.e();
                                    }
                                    trainingStatusSummaryActivity.invalidateOptionsMenu();
                                }
                            } else {
                                if (i17 != 3) {
                                    u0.r();
                                    return null;
                                }
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                trainingStatusSummaryActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar5 = TrainingStatusSummaryActivity.f40068w;
                        pVar2.getClass();
                        new androidx.appcompat.app.e.a(trainingStatusSummaryActivity).setTitle((CharSequence) pVar2.f128594a).setMessage((CharSequence) pVar2.f128595b).setPositiveButton(R.string.lbl_ok, new vu1.k(3)).show();
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar3 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar6 = TrainingStatusSummaryActivity.f40068w;
                        pVar3.getClass();
                        String str = (String) pVar3.f128594a;
                        FrameLayout frameLayout = (FrameLayout) trainingStatusSummaryActivity.findViewById(R.id.notification_top_layout);
                        if (str != null && str.length() > 0) {
                            frameLayout.getClass();
                            frameLayout.setVisibility(0);
                            x xVar3 = trainingStatusSummaryActivity.f40070o;
                            if (xVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            gj1.f fVar = xVar3.J0;
                            String string3 = ((fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue()) > 1 ? trainingStatusSummaryActivity.getString(R.string.update_device_priority) : null;
                            com.garmin.android.apps.connectmobile.x.a aVar7 = com.garmin.android.apps.connectmobile.x.f49750f;
                            String string4 = trainingStatusSummaryActivity.getString(R.string.lbl_sync_or_update_device);
                            String string5 = trainingStatusSummaryActivity.getString(R.string.training_status_sync_device, str);
                            string5.getClass();
                            com.garmin.android.apps.connectmobile.x xVarA2 = com.garmin.android.apps.connectmobile.x.a.a(aVar7, string4, string5, string3, 0, 56);
                            final int i18 = z14 ? 1 : 0;
                            xVarA2.f49751a = new e23.a() { // from class: w61.s
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                            x xVar4 = trainingStatusSummaryActivity2.f40070o;
                                            if (xVar4 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            gj1.f fVar2 = xVar4.J0;
                                            if (fVar2 != null) {
                                                PrimaryDeviceActivity.f43662f.getClass();
                                                trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            x xVar5 = trainingStatusSummaryActivity.f40070o;
                                            if (xVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            w0<fw.m<x61.p>> w0Var = xVar5.f183274j;
                                            fw.m<x61.p> mVarD = w0Var.d();
                                            x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                            if (pVar4 != null) {
                                                pVar4.f189270d = false;
                                            }
                                            w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                            ge1.b.T(v1.a(xVar5), null, null, new l0(xVar5, pVar4, null), 3);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            xVarA2.f49752b = new w11.b(26);
                            androidx.fragment.app.v supportFragmentManager2 = trainingStatusSummaryActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                            aVarB2.l(R.id.notification_top_layout, xVarA2, xVarA2.getTag());
                            aVarB2.d(null);
                            aVarB2.e();
                        } else if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        if (str != null) {
                            RelativeLayout relativeLayout = trainingStatusSummaryActivity.f40075v;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(8);
                            }
                            if (trainingStatusSummaryActivity.f40070o == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            int i19 = x.O0;
                            new q((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f183243a.O2("keyShouldShowDeviceSyncTooltip", false);
                        }
                        if (((Boolean) pVar3.f128595b).booleanValue()) {
                            trainingStatusSummaryActivity.f40073r = true;
                            trainingStatusSummaryActivity.invalidateOptionsMenu();
                        }
                        x xVar4 = trainingStatusSummaryActivity.f40070o;
                        if (xVar4 != null) {
                            ((androidx.lifecycle.s0) xVar4.I.getValue()).l(trainingStatusSummaryActivity);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                }
            }
        }));
        x xVar2 = this.f40070o;
        if (xVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i15 = 1;
        xVar2.f183284t.f(this, new g(new e23.l(this) { // from class: w61.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingStatusSummaryActivity f183245b;

            {
                this.f183245b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                gj1.e primaryTrainingDevices;
                Integer primaryTrainingDeviceCount;
                int i16 = i15;
                boolean z14 = false;
                z14 = false;
                final int i17 = 1;
                final TrainingStatusSummaryActivity trainingStatusSummaryActivity = this.f183245b;
                switch (i16) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        x xVar3 = trainingStatusSummaryActivity.f40070o;
                        if (xVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        String strD4 = xVar3.D4();
                        if (g22.n.d(strD4) && (textView = trainingStatusSummaryActivity.f40074t) != null) {
                            textView.setText(trainingStatusSummaryActivity.getString(R.string.sync_for_most_accurate_status, strD4));
                        }
                        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c;
                        if (aVar2 != null && aVar2.f39920d == 1) {
                            z14 = true;
                        }
                        trainingStatusSummaryActivity.f40071p = z14;
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar2 = (fw.m) obj;
                        TrainingStatusSummaryActivity.a aVar3 = TrainingStatusSummaryActivity.f40068w;
                        if (mVar2 != null) {
                            int i18 = TrainingStatusSummaryActivity.b.f40076a[mVar2.f73769b.ordinal()];
                            if (i18 == 1) {
                                trainingStatusSummaryActivity.showProgressOverlay();
                            } else if (i18 == 2) {
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                x61.p pVar = (x61.p) mVar2.f73770c;
                                if (pVar != null) {
                                    trainingStatusSummaryActivity.f40069n = pVar;
                                    if (pVar.f189270d) {
                                        com.garmin.android.apps.connectmobile.x.a aVar4 = com.garmin.android.apps.connectmobile.x.f49750f;
                                        String string = trainingStatusSummaryActivity.getString(R.string.lbl_adaptive_training_plan);
                                        String string2 = trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_prompt);
                                        string2.getClass();
                                        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar4, string, string2, trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_label), 2131232644, 40);
                                        xVarA.f49751a = new e23.a() { // from class: w61.s
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i17) {
                                                    case 0:
                                                        TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                                        x xVar4 = trainingStatusSummaryActivity2.f40070o;
                                                        if (xVar4 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        gj1.f fVar2 = xVar4.J0;
                                                        if (fVar2 != null) {
                                                            PrimaryDeviceActivity.f43662f.getClass();
                                                            trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        x xVar5 = trainingStatusSummaryActivity.f40070o;
                                                        if (xVar5 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        w0<fw.m<x61.p>> w0Var = xVar5.f183274j;
                                                        fw.m<x61.p> mVarD = w0Var.d();
                                                        x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                                        if (pVar4 != null) {
                                                            pVar4.f189270d = false;
                                                        }
                                                        w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                                        ge1.b.T(v1.a(xVar5), null, null, new l0(xVar5, pVar4, null), 3);
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        xVarA.f49752b = new w11.b(25);
                                        androidx.fragment.app.v supportFragmentManager = trainingStatusSummaryActivity.getSupportFragmentManager();
                                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                        aVarB.j(R.id.notification_layout, xVarA, null, 1);
                                        aVarB.e();
                                    }
                                    trainingStatusSummaryActivity.invalidateOptionsMenu();
                                }
                            } else {
                                if (i18 != 3) {
                                    u0.r();
                                    return null;
                                }
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                trainingStatusSummaryActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar5 = TrainingStatusSummaryActivity.f40068w;
                        pVar2.getClass();
                        new androidx.appcompat.app.e.a(trainingStatusSummaryActivity).setTitle((CharSequence) pVar2.f128594a).setMessage((CharSequence) pVar2.f128595b).setPositiveButton(R.string.lbl_ok, new vu1.k(3)).show();
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar3 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar6 = TrainingStatusSummaryActivity.f40068w;
                        pVar3.getClass();
                        String str = (String) pVar3.f128594a;
                        FrameLayout frameLayout = (FrameLayout) trainingStatusSummaryActivity.findViewById(R.id.notification_top_layout);
                        if (str != null && str.length() > 0) {
                            frameLayout.getClass();
                            frameLayout.setVisibility(0);
                            x xVar4 = trainingStatusSummaryActivity.f40070o;
                            if (xVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            gj1.f fVar = xVar4.J0;
                            String string3 = ((fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue()) > 1 ? trainingStatusSummaryActivity.getString(R.string.update_device_priority) : null;
                            com.garmin.android.apps.connectmobile.x.a aVar7 = com.garmin.android.apps.connectmobile.x.f49750f;
                            String string4 = trainingStatusSummaryActivity.getString(R.string.lbl_sync_or_update_device);
                            String string5 = trainingStatusSummaryActivity.getString(R.string.training_status_sync_device, str);
                            string5.getClass();
                            com.garmin.android.apps.connectmobile.x xVarA2 = com.garmin.android.apps.connectmobile.x.a.a(aVar7, string4, string5, string3, 0, 56);
                            final int i19 = z14 ? 1 : 0;
                            xVarA2.f49751a = new e23.a() { // from class: w61.s
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                            x xVar5 = trainingStatusSummaryActivity2.f40070o;
                                            if (xVar5 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            gj1.f fVar2 = xVar5.J0;
                                            if (fVar2 != null) {
                                                PrimaryDeviceActivity.f43662f.getClass();
                                                trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            x xVar6 = trainingStatusSummaryActivity.f40070o;
                                            if (xVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            w0<fw.m<x61.p>> w0Var = xVar6.f183274j;
                                            fw.m<x61.p> mVarD = w0Var.d();
                                            x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                            if (pVar4 != null) {
                                                pVar4.f189270d = false;
                                            }
                                            w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                            ge1.b.T(v1.a(xVar6), null, null, new l0(xVar6, pVar4, null), 3);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            xVarA2.f49752b = new w11.b(26);
                            androidx.fragment.app.v supportFragmentManager2 = trainingStatusSummaryActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                            aVarB2.l(R.id.notification_top_layout, xVarA2, xVarA2.getTag());
                            aVarB2.d(null);
                            aVarB2.e();
                        } else if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        if (str != null) {
                            RelativeLayout relativeLayout = trainingStatusSummaryActivity.f40075v;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(8);
                            }
                            if (trainingStatusSummaryActivity.f40070o == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            int i110 = x.O0;
                            new q((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f183243a.O2("keyShouldShowDeviceSyncTooltip", false);
                        }
                        if (((Boolean) pVar3.f128595b).booleanValue()) {
                            trainingStatusSummaryActivity.f40073r = true;
                            trainingStatusSummaryActivity.invalidateOptionsMenu();
                        }
                        x xVar5 = trainingStatusSummaryActivity.f40070o;
                        if (xVar5 != null) {
                            ((androidx.lifecycle.s0) xVar5.I.getValue()).l(trainingStatusSummaryActivity);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                }
            }
        }));
        x xVar3 = this.f40070o;
        if (xVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i16 = 2;
        xVar3.E.f(this, new w61.g(new e23.l(this) { // from class: w61.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingStatusSummaryActivity f183245b;

            {
                this.f183245b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                gj1.e primaryTrainingDevices;
                Integer primaryTrainingDeviceCount;
                int i17 = i16;
                boolean z14 = false;
                z14 = false;
                final int i18 = 1;
                final TrainingStatusSummaryActivity trainingStatusSummaryActivity = this.f183245b;
                switch (i17) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        x xVar4 = trainingStatusSummaryActivity.f40070o;
                        if (xVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        String strD4 = xVar4.D4();
                        if (g22.n.d(strD4) && (textView = trainingStatusSummaryActivity.f40074t) != null) {
                            textView.setText(trainingStatusSummaryActivity.getString(R.string.sync_for_most_accurate_status, strD4));
                        }
                        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c;
                        if (aVar2 != null && aVar2.f39920d == 1) {
                            z14 = true;
                        }
                        trainingStatusSummaryActivity.f40071p = z14;
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar2 = (fw.m) obj;
                        TrainingStatusSummaryActivity.a aVar3 = TrainingStatusSummaryActivity.f40068w;
                        if (mVar2 != null) {
                            int i19 = TrainingStatusSummaryActivity.b.f40076a[mVar2.f73769b.ordinal()];
                            if (i19 == 1) {
                                trainingStatusSummaryActivity.showProgressOverlay();
                            } else if (i19 == 2) {
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                x61.p pVar = (x61.p) mVar2.f73770c;
                                if (pVar != null) {
                                    trainingStatusSummaryActivity.f40069n = pVar;
                                    if (pVar.f189270d) {
                                        com.garmin.android.apps.connectmobile.x.a aVar4 = com.garmin.android.apps.connectmobile.x.f49750f;
                                        String string = trainingStatusSummaryActivity.getString(R.string.lbl_adaptive_training_plan);
                                        String string2 = trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_prompt);
                                        string2.getClass();
                                        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar4, string, string2, trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_label), 2131232644, 40);
                                        xVarA.f49751a = new e23.a() { // from class: w61.s
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i18) {
                                                    case 0:
                                                        TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                                        x xVar5 = trainingStatusSummaryActivity2.f40070o;
                                                        if (xVar5 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        gj1.f fVar2 = xVar5.J0;
                                                        if (fVar2 != null) {
                                                            PrimaryDeviceActivity.f43662f.getClass();
                                                            trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        x xVar6 = trainingStatusSummaryActivity.f40070o;
                                                        if (xVar6 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        w0<fw.m<x61.p>> w0Var = xVar6.f183274j;
                                                        fw.m<x61.p> mVarD = w0Var.d();
                                                        x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                                        if (pVar4 != null) {
                                                            pVar4.f189270d = false;
                                                        }
                                                        w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                                        ge1.b.T(v1.a(xVar6), null, null, new l0(xVar6, pVar4, null), 3);
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        xVarA.f49752b = new w11.b(25);
                                        androidx.fragment.app.v supportFragmentManager = trainingStatusSummaryActivity.getSupportFragmentManager();
                                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                        aVarB.j(R.id.notification_layout, xVarA, null, 1);
                                        aVarB.e();
                                    }
                                    trainingStatusSummaryActivity.invalidateOptionsMenu();
                                }
                            } else {
                                if (i19 != 3) {
                                    u0.r();
                                    return null;
                                }
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                trainingStatusSummaryActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar5 = TrainingStatusSummaryActivity.f40068w;
                        pVar2.getClass();
                        new androidx.appcompat.app.e.a(trainingStatusSummaryActivity).setTitle((CharSequence) pVar2.f128594a).setMessage((CharSequence) pVar2.f128595b).setPositiveButton(R.string.lbl_ok, new vu1.k(3)).show();
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar3 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar6 = TrainingStatusSummaryActivity.f40068w;
                        pVar3.getClass();
                        String str = (String) pVar3.f128594a;
                        FrameLayout frameLayout = (FrameLayout) trainingStatusSummaryActivity.findViewById(R.id.notification_top_layout);
                        if (str != null && str.length() > 0) {
                            frameLayout.getClass();
                            frameLayout.setVisibility(0);
                            x xVar5 = trainingStatusSummaryActivity.f40070o;
                            if (xVar5 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            gj1.f fVar = xVar5.J0;
                            String string3 = ((fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue()) > 1 ? trainingStatusSummaryActivity.getString(R.string.update_device_priority) : null;
                            com.garmin.android.apps.connectmobile.x.a aVar7 = com.garmin.android.apps.connectmobile.x.f49750f;
                            String string4 = trainingStatusSummaryActivity.getString(R.string.lbl_sync_or_update_device);
                            String string5 = trainingStatusSummaryActivity.getString(R.string.training_status_sync_device, str);
                            string5.getClass();
                            com.garmin.android.apps.connectmobile.x xVarA2 = com.garmin.android.apps.connectmobile.x.a.a(aVar7, string4, string5, string3, 0, 56);
                            final int i110 = z14 ? 1 : 0;
                            xVarA2.f49751a = new e23.a() { // from class: w61.s
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                            x xVar6 = trainingStatusSummaryActivity2.f40070o;
                                            if (xVar6 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            gj1.f fVar2 = xVar6.J0;
                                            if (fVar2 != null) {
                                                PrimaryDeviceActivity.f43662f.getClass();
                                                trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            x xVar7 = trainingStatusSummaryActivity.f40070o;
                                            if (xVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            w0<fw.m<x61.p>> w0Var = xVar7.f183274j;
                                            fw.m<x61.p> mVarD = w0Var.d();
                                            x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                            if (pVar4 != null) {
                                                pVar4.f189270d = false;
                                            }
                                            w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                            ge1.b.T(v1.a(xVar7), null, null, new l0(xVar7, pVar4, null), 3);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            xVarA2.f49752b = new w11.b(26);
                            androidx.fragment.app.v supportFragmentManager2 = trainingStatusSummaryActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                            aVarB2.l(R.id.notification_top_layout, xVarA2, xVarA2.getTag());
                            aVarB2.d(null);
                            aVarB2.e();
                        } else if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        if (str != null) {
                            RelativeLayout relativeLayout = trainingStatusSummaryActivity.f40075v;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(8);
                            }
                            if (trainingStatusSummaryActivity.f40070o == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            int i111 = x.O0;
                            new q((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f183243a.O2("keyShouldShowDeviceSyncTooltip", false);
                        }
                        if (((Boolean) pVar3.f128595b).booleanValue()) {
                            trainingStatusSummaryActivity.f40073r = true;
                            trainingStatusSummaryActivity.invalidateOptionsMenu();
                        }
                        x xVar6 = trainingStatusSummaryActivity.f40070o;
                        if (xVar6 != null) {
                            ((androidx.lifecycle.s0) xVar6.I.getValue()).l(trainingStatusSummaryActivity);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                }
            }
        }));
        x xVar4 = this.f40070o;
        if (xVar4 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i17 = 3;
        ((androidx.lifecycle.s0) xVar4.I.getValue()).f(this, new w61.g(new e23.l(this) { // from class: w61.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrainingStatusSummaryActivity f183245b;

            {
                this.f183245b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                TextView textView;
                gj1.e primaryTrainingDevices;
                Integer primaryTrainingDeviceCount;
                int i18 = i17;
                boolean z14 = false;
                z14 = false;
                final int i19 = 1;
                final TrainingStatusSummaryActivity trainingStatusSummaryActivity = this.f183245b;
                switch (i18) {
                    case 0:
                        fw.m mVar = (fw.m) obj;
                        x xVar5 = trainingStatusSummaryActivity.f40070o;
                        if (xVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        String strD4 = xVar5.D4();
                        if (g22.n.d(strD4) && (textView = trainingStatusSummaryActivity.f40074t) != null) {
                            textView.setText(trainingStatusSummaryActivity.getString(R.string.sync_for_most_accurate_status, strD4));
                        }
                        com.garmin.android.apps.connectmobile.performance.model.a aVar2 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c;
                        if (aVar2 != null && aVar2.f39920d == 1) {
                            z14 = true;
                        }
                        trainingStatusSummaryActivity.f40071p = z14;
                        return Unit.INSTANCE;
                    case 1:
                        fw.m mVar2 = (fw.m) obj;
                        TrainingStatusSummaryActivity.a aVar3 = TrainingStatusSummaryActivity.f40068w;
                        if (mVar2 != null) {
                            int i110 = TrainingStatusSummaryActivity.b.f40076a[mVar2.f73769b.ordinal()];
                            if (i110 == 1) {
                                trainingStatusSummaryActivity.showProgressOverlay();
                            } else if (i110 == 2) {
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                x61.p pVar = (x61.p) mVar2.f73770c;
                                if (pVar != null) {
                                    trainingStatusSummaryActivity.f40069n = pVar;
                                    if (pVar.f189270d) {
                                        com.garmin.android.apps.connectmobile.x.a aVar4 = com.garmin.android.apps.connectmobile.x.f49750f;
                                        String string = trainingStatusSummaryActivity.getString(R.string.lbl_adaptive_training_plan);
                                        String string2 = trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_prompt);
                                        string2.getClass();
                                        com.garmin.android.apps.connectmobile.x xVarA = com.garmin.android.apps.connectmobile.x.a.a(aVar4, string, string2, trainingStatusSummaryActivity.getString(R.string.gcm_training_status_pause_plan_label), 2131232644, 40);
                                        xVarA.f49751a = new e23.a() { // from class: w61.s
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i19) {
                                                    case 0:
                                                        TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                                        x xVar6 = trainingStatusSummaryActivity2.f40070o;
                                                        if (xVar6 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        gj1.f fVar2 = xVar6.J0;
                                                        if (fVar2 != null) {
                                                            PrimaryDeviceActivity.f43662f.getClass();
                                                            trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        x xVar7 = trainingStatusSummaryActivity.f40070o;
                                                        if (xVar7 == null) {
                                                            p005kotlin.jvm.internal.s.m("viewModel");
                                                            throw null;
                                                        }
                                                        w0<fw.m<x61.p>> w0Var = xVar7.f183274j;
                                                        fw.m<x61.p> mVarD = w0Var.d();
                                                        x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                                        if (pVar4 != null) {
                                                            pVar4.f189270d = false;
                                                        }
                                                        w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                                        ge1.b.T(v1.a(xVar7), null, null, new l0(xVar7, pVar4, null), 3);
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        xVarA.f49752b = new w11.b(25);
                                        androidx.fragment.app.v supportFragmentManager = trainingStatusSummaryActivity.getSupportFragmentManager();
                                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                        aVarB.j(R.id.notification_layout, xVarA, null, 1);
                                        aVarB.e();
                                    }
                                    trainingStatusSummaryActivity.invalidateOptionsMenu();
                                }
                            } else {
                                if (i110 != 3) {
                                    u0.r();
                                    return null;
                                }
                                trainingStatusSummaryActivity.hideProgressOverlay();
                                trainingStatusSummaryActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar5 = TrainingStatusSummaryActivity.f40068w;
                        pVar2.getClass();
                        new androidx.appcompat.app.e.a(trainingStatusSummaryActivity).setTitle((CharSequence) pVar2.f128594a).setMessage((CharSequence) pVar2.f128595b).setPositiveButton(R.string.lbl_ok, new vu1.k(3)).show();
                        return Unit.INSTANCE;
                    default:
                        o13.p pVar3 = (o13.p) obj;
                        TrainingStatusSummaryActivity.a aVar6 = TrainingStatusSummaryActivity.f40068w;
                        pVar3.getClass();
                        String str = (String) pVar3.f128594a;
                        FrameLayout frameLayout = (FrameLayout) trainingStatusSummaryActivity.findViewById(R.id.notification_top_layout);
                        if (str != null && str.length() > 0) {
                            frameLayout.getClass();
                            frameLayout.setVisibility(0);
                            x xVar6 = trainingStatusSummaryActivity.f40070o;
                            if (xVar6 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            gj1.f fVar = xVar6.J0;
                            String string3 = ((fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue()) > 1 ? trainingStatusSummaryActivity.getString(R.string.update_device_priority) : null;
                            com.garmin.android.apps.connectmobile.x.a aVar7 = com.garmin.android.apps.connectmobile.x.f49750f;
                            String string4 = trainingStatusSummaryActivity.getString(R.string.lbl_sync_or_update_device);
                            String string5 = trainingStatusSummaryActivity.getString(R.string.training_status_sync_device, str);
                            string5.getClass();
                            com.garmin.android.apps.connectmobile.x xVarA2 = com.garmin.android.apps.connectmobile.x.a.a(aVar7, string4, string5, string3, 0, 56);
                            final int i111 = z14 ? 1 : 0;
                            xVarA2.f49751a = new e23.a() { // from class: w61.s
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i111) {
                                        case 0:
                                            TrainingStatusSummaryActivity trainingStatusSummaryActivity2 = trainingStatusSummaryActivity;
                                            x xVar7 = trainingStatusSummaryActivity2.f40070o;
                                            if (xVar7 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            gj1.f fVar2 = xVar7.J0;
                                            if (fVar2 != null) {
                                                PrimaryDeviceActivity.f43662f.getClass();
                                                trainingStatusSummaryActivity2.startActivity(PrimaryDeviceActivity.a.a(trainingStatusSummaryActivity2, false, fVar2));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            x xVar8 = trainingStatusSummaryActivity.f40070o;
                                            if (xVar8 == null) {
                                                p005kotlin.jvm.internal.s.m("viewModel");
                                                throw null;
                                            }
                                            w0<fw.m<x61.p>> w0Var = xVar8.f183274j;
                                            fw.m<x61.p> mVarD = w0Var.d();
                                            x61.p pVar4 = mVarD != null ? mVarD.f73770c : null;
                                            if (pVar4 != null) {
                                                pVar4.f189270d = false;
                                            }
                                            w0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
                                            ge1.b.T(v1.a(xVar8), null, null, new l0(xVar8, pVar4, null), 3);
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            xVarA2.f49752b = new w11.b(26);
                            androidx.fragment.app.v supportFragmentManager2 = trainingStatusSummaryActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                            aVarB2.l(R.id.notification_top_layout, xVarA2, xVarA2.getTag());
                            aVarB2.d(null);
                            aVarB2.e();
                        } else if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        if (str != null) {
                            RelativeLayout relativeLayout = trainingStatusSummaryActivity.f40075v;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(8);
                            }
                            if (trainingStatusSummaryActivity.f40070o == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            int i112 = x.O0;
                            new q((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).f183243a.O2("keyShouldShowDeviceSyncTooltip", false);
                        }
                        if (((Boolean) pVar3.f128595b).booleanValue()) {
                            trainingStatusSummaryActivity.f40073r = true;
                            trainingStatusSummaryActivity.invalidateOptionsMenu();
                        }
                        x xVar7 = trainingStatusSummaryActivity.f40070o;
                        if (xVar7 != null) {
                            ((androidx.lifecycle.s0) xVar7.I.getValue()).l(trainingStatusSummaryActivity);
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                }
            }
        }));
        if (s.g(boolValueOf, Boolean.TRUE)) {
            ra(1);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (!n0.h()) {
            getMenuInflater().inflate(R.menu.menu_help, menu);
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_training_status, menu);
        MenuItem menuItemFindItem2 = menu != null ? menu.findItem(R.id.menu_manage_device_priority) : null;
        this.f40072q = menuItemFindItem2;
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(this.f40073r);
        }
        x61.p pVar = this.f40069n;
        boolean z14 = pVar != null && pVar.f189269c;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_resume_training_status)) != null) {
            menuItemFindItem.setVisible(z14);
        }
        MenuItem menuItemFindItem3 = menu != null ? menu.findItem(R.id.menu_pause_training_status) : null;
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setVisible(!z14);
        }
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setEnabled(!this.f40071p);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gj1.e primaryTrainingDevices;
        Integer primaryTrainingDeviceCount;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_help) {
            x xVar = this.f40070o;
            if (xVar == null) {
                s.m("viewModel");
                throw null;
            }
            gj1.f fVar = xVar.J0;
            Bundle bundleA = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a.a(com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j, (fVar == null || (primaryTrainingDevices = fVar.getPrimaryTrainingDevices()) == null || (primaryTrainingDeviceCount = primaryTrainingDevices.getPrimaryTrainingDeviceCount()) == null) ? 0 : primaryTrainingDeviceCount.intValue());
            HelpActivity.a aVar = HelpActivity.f36653a;
            ro0.l lVar = ro0.l.TRAINING_STATUS;
            aVar.getClass();
            HelpActivity.a.d(this, lVar, "DEFAULT_ACTION", bundleA);
            return true;
        }
        if (itemId == R.id.menu_pause_training_status) {
            new androidx.appcompat.app.e.a(this).setTitle(R.string.training_status_pause_query).setMessage(R.string.training_status_pause_desc).setPositiveButton(R.string.lbl_pause, new sa2.b(this, 24)).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).show();
            return true;
        }
        if (itemId == R.id.menu_manage_device_priority) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
            Intent intent = new Intent(this, (Class<?>) MoreActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
        if (itemId != R.id.menu_resume_training_status) {
            return super.onOptionsItemSelected(menuItem);
        }
        x xVar2 = this.f40070o;
        if (xVar2 != null) {
            xVar2.K4(null);
            return true;
        }
        s.m("viewModel");
        throw null;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new j(this, dateTime, new o[]{o.f62805h, o.f62808k, o.f62810m, o.f62813p}, new c());
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_training_status);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/TrainingStatusSummaryActivity$a;", "", "<init>", "()V", "", "PAGE_POSITION_FOUR_WEEKS", "I", "", "EXTRA_SUMMARY_VIEW", "Ljava/lang/String;", "DEVICE_ID_REQUEST_CODE", "HEAT_ACCL_DEST", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) TrainingStatusSummaryActivity.class);
            intent.putExtra("EXTRA_NAVIGATION_DESTINATION", str);
            intent.setFlags(1073741824);
            return intent;
        }

        public static void b(Context context, boolean z14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) TrainingStatusSummaryActivity.class);
            intent.putExtra("EXTRA_SUMMARY_VIEW", z14);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
