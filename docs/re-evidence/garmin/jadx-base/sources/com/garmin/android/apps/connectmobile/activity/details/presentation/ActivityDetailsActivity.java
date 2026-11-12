package com.garmin.android.apps.connectmobile.activity.details.presentation;

import am.x0;
import am.z0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.h1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import b.g;
import ca0.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.gncs.NotificationConstants;
import e23.p;
import en.f;
import java.util.ArrayList;
import java.util.List;
import jr.x;
import lc.h0;
import nr.p0;
import nr.w0;
import o13.l;
import o13.m;
import o13.n;
import o13.r;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.y;
import qr.o6;
import qr.t;
import r22.k0;
import r53.j;
import r53.p2;
import ro1.b0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/social/share/b$b;", "Lro1/b0$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityDetailsActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b, b0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f29967g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f29969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f29971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f29973f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsActivity$b", "Landroid/content/BroadcastReceiver;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String action = intent.getAction();
            if (action != null && action.hashCode() == -733201298 && action.equals("ACTIVITY_DETAILS_REFRESH")) {
                int i14 = ActivityDetailsActivity.f29967g;
                ActivityDetailsActivity.this.fa().B5();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity$onCreate$2", f = "ActivityDetailsActivity.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29975a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity$onCreate$2$1", f = "ActivityDetailsActivity.kt", l = {107}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f29977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivityDetailsActivity f29978b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0462a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ActivityDetailsActivity f29979a;

                public C0462a(ActivityDetailsActivity activityDetailsActivity) {
                    this.f29979a = activityDetailsActivity;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    nr.i iVar = (nr.i) obj;
                    boolean zIsEmpty = iVar.f127194d.isEmpty();
                    ActivityDetailsActivity activityDetailsActivity = this.f29979a;
                    if (!zIsEmpty) {
                        for (w0 w0Var : iVar.f127194d) {
                            if (w0Var instanceof w0.f) {
                                ActivityDetailsActivity.ea(activityDetailsActivity, (w0.f) w0Var);
                                activityDetailsActivity.fa().M5(w0Var);
                            } else if (w0Var instanceof w0.d2) {
                                activityDetailsActivity.initActionBar(true, ((w0.d2) w0Var).f127432a);
                                int i14 = ActivityDetailsActivity.f29967g;
                                activityDetailsActivity.fa().M5(w0Var);
                            } else if (w0Var instanceof w0.p1) {
                                w0.p1 p1Var = (w0.p1) w0Var;
                                int i15 = ActivityDetailsActivity.f29967g;
                                activityDetailsActivity.getClass();
                                activityDetailsActivity.startActivity(new f(activityDetailsActivity, p1Var.f127512a).b());
                                if (p1Var.f127513b) {
                                    activityDetailsActivity.finish();
                                }
                                activityDetailsActivity.fa().M5(w0Var);
                            }
                        }
                    }
                    if (activityDetailsActivity.getResources().getConfiguration().orientation == 1 || activityDetailsActivity.f29972e) {
                        activityDetailsActivity.showActionBar();
                    } else {
                        activityDetailsActivity.hideActionBar();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ActivityDetailsActivity activityDetailsActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f29978b = activityDetailsActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f29978b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f29977a;
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = ActivityDetailsActivity.f29967g;
                    ActivityDetailsActivity activityDetailsActivity = this.f29978b;
                    p2 p2Var = activityDetailsActivity.fa().L1;
                    C0462a c0462a = new C0462a(activityDetailsActivity);
                    this.f29977a = 1;
                    if (p2Var.collect(c0462a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ActivityDetailsActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f29975a;
            if (i14 == 0) {
                r.b(obj);
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                ActivityDetailsActivity activityDetailsActivity = ActivityDetailsActivity.this;
                a aVar2 = new a(activityDetailsActivity, null);
                this.f29975a = 1;
                if (h1.b(activityDetailsActivity, bVar, aVar2, this) == aVar) {
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
    public static final class d implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29983d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f29980a = gVar;
            this.f29981b = qualifier;
            this.f29982c = aVar;
            this.f29983d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f29980a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f29982c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), viewModelStore, null, defaultViewModelCreationExtras, this.f29981b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f29983d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<o6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29987d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f29984a = gVar;
            this.f29985b = qualifier;
            this.f29986c = aVar;
            this.f29987d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, qr.o6] */
        @Override // e23.a
        public final o6 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f29984a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f29986c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o6.class), viewModelStore, null, defaultViewModelCreationExtras, this.f29985b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f29987d, 4, null);
        }
    }

    static {
        new a(null);
    }

    public ActivityDetailsActivity() {
        o13.t tVarB = m.b(new qn0.m(8));
        qr.b bVar = new qr.b(this, 2);
        n nVar = n.NONE;
        this.f29968a = m.a(nVar, new d(this, null, null, bVar));
        this.f29969b = ((am.d) tVarB.getValue()).O(this);
        this.f29970c = m.a(nVar, new e(this, null, null, null));
        this.f29971d = x0.f4346x;
        this.f29973f = new b();
    }

    public static boolean ca(ActivityDetailsActivity activityDetailsActivity) {
        return super.onNavigateUp();
    }

    public static void da(ActivityDetailsActivity activityDetailsActivity) {
        super.onBackPressed();
    }

    public static final void ea(ActivityDetailsActivity activityDetailsActivity, w0.f fVar) {
        activityDetailsActivity.getClass();
        boolean z14 = fVar.f127439a;
        boolean z15 = fVar.f127440b;
        if (z14) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle(3);
            if (z15) {
                bundle.putBoolean("GCM_extra_activity_deleted", true);
                bundle.putBoolean("GCM_extra_activity_updated", true);
                ActivityListItemDTO activityListItemDTO = activityDetailsActivity.fa().f146569x;
                bundle.putLong("GCM_extra_activity_id", activityListItemDTO != null ? activityListItemDTO.f29250b : -1L);
            } else {
                bundle.putBoolean("GCM_extra_activity_updated", true);
                bundle.putParcelable("GCM_extra_activity_metadata", activityDetailsActivity.fa().f146569x);
                ActivityListItemDTO activityListItemDTO2 = activityDetailsActivity.fa().f146569x;
                bundle.putLong("GCM_conversation_resource_id", activityListItemDTO2 != null ? activityListItemDTO2.f29250b : -1L);
            }
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            activityDetailsActivity.setResult(-1, intent);
            ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(activityDetailsActivity, fVar.f127441c, z15);
        }
        super.finish();
    }

    @Override // ro1.b0.b
    public final void O2() {
        ps.a accessControlRuleDTO;
        t tVarFa = fa();
        tVarFa.f146565v2 = false;
        ps.r value = tVarFa.W4().getValue();
        if (((value == null || (accessControlRuleDTO = value.getAccessControlRuleDTO()) == null) ? null : accessControlRuleDTO.b()) != PrivacyType.EVERYONE) {
            tVarFa.E4(w0.a2.f127401a);
            return;
        }
        ps.r value2 = tVarFa.W4().getValue();
        if (value2 != null) {
            String strValueOf = String.valueOf(tVarFa.f146575z);
            String activityName = value2.getActivityName();
            if (activityName == null) {
                activityName = "";
            }
            tVarFa.E4(new w0.z0(strValueOf, activityName, value2.h()));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void T() {
        t tVarFa = fa();
        int i14 = t.A2;
        tVarFa.F5("ActivityShareTemplateCancelled", null, false, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final t fa() {
        return (t) this.f29968a.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        fa().I4();
    }

    public final boolean ga(e23.a<Boolean> aVar) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        ArrayList arrayList2;
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        h0 h0VarJ = ((NavHostFragment) fragmentF).u6().f111904b.j();
        Integer numValueOf = h0VarJ != null ? Integer.valueOf(h0VarJ.f111773b.f144346e) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.activityDetailsJumpMetricFragment) {
            getOnBackPressedDispatcher().d();
            updateActionBarNavigation(2);
            updateActionBarTitle(dh.b.A(this, this.f29971d.f4360c));
            this.f29972e = false;
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.activityShareFragment) {
            getOnBackPressedDispatcher().d();
            p2 p2Var = fa().X;
            do {
                value3 = p2Var.getValue();
                List<p0> list = (List) value3;
                arrayList2 = new ArrayList(y.r(list, 10));
                for (p0 p0VarA : list) {
                    p0.a aVar2 = p0VarA.f127286e;
                    if (aVar2 instanceof p0.a.h) {
                        p0VarA = p0.a(p0VarA, new p0.a.h(true));
                    } else if (aVar2 instanceof p0.a.i) {
                        p0VarA = p0.a(p0VarA, new p0.a.i(((p0.a.i) aVar2).f127302a, true));
                    }
                    arrayList2.add(p0VarA);
                }
            } while (!p2Var.b(value3, arrayList2));
            updateActionBarTitle(getString(R.string.activity_history_share_activity_title));
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.selectRatioFragment) {
            getOnBackPressedDispatcher().d();
            t tVarFa = fa();
            ds.n.f61011h.getClass();
            tVarFa.O5(ds.n.f61012i);
            updateActionBarTitle(dh.b.A(this, this.f29971d.f4360c));
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.editCustomImageFragment) {
            if (!((Boolean) fa().f146537l2.f150540a.getValue()).booleanValue()) {
                getOnBackPressedDispatcher().d();
                fa().f146518f2.setValue(j0.f134944a);
                updateActionBarTitle(getString(R.string.activity_history_share_activity_title));
                return true;
            }
            String string = getString(R.string.title_exit_without_saving);
            string.getClass();
            String string2 = getString(R.string.unsaved_changes_alert_message);
            string2.getClass();
            new k0(this, new k0.a(string, string2, true, false, null, null, getString(R.string.lbl_exit), null, new qd0.a(this, 24), getString(R.string.social_photo_sharing_edit_image_keep_editing), null, null, 3248, null)).show();
            return true;
        }
        if (numValueOf == null || numValueOf.intValue() != R.id.activityCustomShareFragment) {
            return aVar.invoke().booleanValue();
        }
        p2 p2Var2 = fa().f146506b2;
        do {
            value = p2Var2.getValue();
        } while (!p2Var2.b(value, null));
        p2 p2Var3 = fa().Y;
        do {
            value2 = p2Var3.getValue();
            List<p0> list2 = (List) value2;
            arrayList = new ArrayList(y.r(list2, 10));
            for (p0 p0Var : list2) {
                p0.a.c cVar = (p0.a.c) p0Var.f127286e;
                arrayList.add(p0.a(p0Var, p0.a.c.a(cVar, x.a(cVar.f127293e, true, j0.f134944a))));
            }
        } while (!p2Var3.b(value2, arrayList));
        getOnBackPressedDispatcher().d();
        updateActionBarTitle(getString(R.string.activity_history_share_activity_title));
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void i8(ro1.e eVar, Intent intent) {
        eVar.getClass();
        intent.getClass();
        t tVarFa = fa();
        long j8 = tVarFa.f146575z;
        sr.b bVar = tVarFa.f146541n;
        ps.r value = tVarFa.W4().getValue();
        if (value != null) {
            x0 x0VarH = value.h();
            bVar.getClass();
            Context context = bVar.f160540a;
            x0VarH.getClass();
            tVarFa.E4(new w0.m1(eVar, intent, ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).I(context, x0VarH, String.valueOf(j8)), ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).P(String.valueOf(j8)), ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).D(context)));
        }
    }

    @Override // ro1.b0.b
    public final void o5() {
        t tVarFa = fa();
        tVarFa.f146565v2 = false;
        tVarFa.E4(w0.x0.f127570a);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        ga(new qr.b(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Object value;
        ds.n nVarA;
        super.onCreate(bundle);
        setContentView(R.layout.activity_details_host);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTIVITY_DETAILS_REFRESH");
        z9.a.a(getApplicationContext()).b(intentFilter, this.f29973f);
        if (bundle != null) {
            t tVarFa = fa();
            Uri uri = (Uri) bundle.getParcelable("image_cropped_uri");
            p2 p2Var = tVarFa.f146506b2;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, uri));
            String string = bundle.getString("ratio_state");
            if (string != null) {
                ds.n.f61011h.getClass();
                nVarA = ds.n.a.a(string);
                if (nVarA == null) {
                    ds.n.f61011h.getClass();
                    nVarA = ds.n.f61012i;
                }
            } else {
                ds.n.f61011h.getClass();
                nVarA = ds.n.f61012i;
            }
            fa().O5(nVarA);
        }
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            x0 x0VarM = z0.m(extras.getString("GCM_extra_activity_type"));
            if (x0VarM == null) {
                x0VarM = x0.f4346x;
            }
            this.f29971d = x0VarM;
            initActionBar(true, dh.b.A(this, x0VarM.f4360c));
            Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
            fragmentF.getClass();
            ((NavHostFragment) fragmentF).u6().a(new v1(this, 1));
        }
        a2 a2Var = a2.ACTIVITIES;
        String str = "View model created for activity with state " + fa().L1;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ActivityDetailsActivity", str);
        i2.a.b(a2Var, "ActivityDetailsActivity", "View model created for activity " + ((o6) this.f29970c.getValue()).f146411a);
        ((ub1.a) this.f29969b.getValue()).x4(fa().f146562u2);
        ge1.b.T(f0.w(this), null, null, new c(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        return ga(new qr.b(this, 1));
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        z9.a.a(getApplicationContext()).c(new Intent("ACTIVITY_DETAILS_CLOSE"));
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        t tVarFa = fa();
        if (tVarFa.Z.V2()) {
            tVarFa.Q4(tVarFa.f146575z);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p(NotificationConstants.KEY_DATA_MIME_TYPE, z0.g(this.f29971d).f4358a));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewActivityDetail");
        Intent intent = new Intent("ACTIVITY_DETAILS_OPEN");
        ActivityListItemDTO activityListItemDTO = fa().f146569x;
        intent.putExtra("activityId", activityListItemDTO != null ? Long.valueOf(activityListItemDTO.f29250b) : null);
        z9.a.a(getApplicationContext()).c(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("image_cropped_uri", (Parcelable) fa().f146509c2.f150540a.getValue());
        bundle.putString("ratio_state", ((ds.n) fa().f146503a2.f150540a.getValue()).f61017a);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/ActivityDetailsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY_DETAILS_OPEN", "ACTIVITY_DETAILS_CLOSE", "ACTIVITY_DETAILS_REFRESH", "SAVED_STATE_KEY_IMAGE_URI", "SAVED_STATE_KEY_RATIO", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
