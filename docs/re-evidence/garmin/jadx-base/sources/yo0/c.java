package yo0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.i0;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.service.model.u;
import com.garmin.android.apps.connectmobile.bic.device.DeviceReconnectActivity;
import com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceActivity;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.material.snackbar.Snackbar;
import hk0.p;
import o13.r;
import o53.c2;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r70.w;
import xk1.v;
import zo0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyo0/c;", "Lr70/w;", "Lzo0/q;", "Landroidx/lifecycle/n;", "Landroidx/fragment/app/m;", "activity", "Lcom/garmin/android/apps/connectmobile/s2;", "progressOverlayListener", "<init>", "(Landroidx/fragment/app/m;Lcom/garmin/android/apps/connectmobile/s2;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends w implements q, androidx.lifecycle.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.m f198339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f198340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f198341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f198342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f198343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f198344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.c<Intent> f198345h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yo0/c$a", "Lxf0/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends xf0.b {
        public a() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            Parcelable parcelable;
            gVar.getClass();
            Bundle eventData = gVar.getEventData();
            if (eventData != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) eventData.getParcelable("GCM_extra_device_profile", DeviceProfile.class);
                } else {
                    Parcelable parcelable2 = eventData.getParcelable("GCM_extra_device_profile");
                    if (!(parcelable2 instanceof DeviceProfile)) {
                        parcelable2 = null;
                    }
                    parcelable = (DeviceProfile) parcelable2;
                }
                DeviceProfile deviceProfile = (DeviceProfile) parcelable;
                if (deviceProfile != null) {
                    c cVar = c.this;
                    Long l14 = cVar.f198342e;
                    long f172494b = deviceProfile.getF92746j();
                    if (l14 != null && l14.longValue() == f172494b) {
                        cVar.f198342e = null;
                        String f172496d = deviceProfile.getF92742f();
                        f172496d.getClass();
                        cVar.d(f172496d);
                    }
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f198347a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f198347a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f198347a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f198347a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: yo0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3713c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f198348a;

        public C3713c(b.g gVar) {
            this.f198348a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f198348a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f198349a;

        public d(b.g gVar) {
            this.f198349a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f198349a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f198350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f198351b;

        public e(e23.a aVar, b.g gVar) {
            this.f198350a = aVar;
            this.f198351b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f198350a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f198351b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.fragment.app.m mVar, s2 s2Var) {
        super(mVar, s2Var);
        mVar.getClass();
        s2Var.getClass();
        this.f198339b = mVar;
        this.f198340c = s2Var;
        this.f198341d = new w1(s0.f105811a.b(i.class), new d(mVar), new C3713c(mVar), new e(null, mVar));
        final int i14 = 0;
        this.f198343f = mVar.registerForActivityResult(new g.h(), new f.b(this) { // from class: yo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f198338b;

            {
                this.f198338b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                String stringExtra3;
                Bundle extras;
                f.a aVar = (f.a) obj;
                switch (i14) {
                    case 0:
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            boolean booleanExtra = intent != null ? intent.getBooleanExtra("EXTRA_RECONNECT_SUCCESSFUL", false) : false;
                            long longExtra = intent != null ? intent.getLongExtra("EXTRA_DEVICE_UNIT_ID", -1L) : -1L;
                            if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_DEVICE_MAC_ADDRESS")) == null) {
                                stringExtra = "";
                            }
                            String str = (intent == null || (stringExtra3 = intent.getStringExtra("EXTRA_DEVICE_PRODUCT_NUMBER")) == null) ? "" : stringExtra3;
                            String str2 = (intent == null || (stringExtra2 = intent.getStringExtra("EXTRA_DEVICE_NAME")) == null) ? "" : stringExtra2;
                            c cVar = this.f198338b;
                            if (!booleanExtra) {
                                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(cVar.f198339b).setTitle(R.string.lbl_failed_to_reconnect).setMessage(R.string.msg_reconnect_fail_set_up_device).setPositiveButton(R.string.lbl_set_up_device, new bn0.i(cVar, longExtra, str, str2, 2)).setNegativeButton(R.string.lbl_cancel, new v(9)).setNeutralButton(R.string.common_learn_more, (DialogInterface.OnClickListener) null).setCancelable(false).create();
                                eVarCreate.getClass();
                                eVarCreate.setOnShowListener(new bi2.d(eVarCreate, cVar, 5));
                                eVarCreate.show();
                            } else {
                                da2.l lVarF = da2.d.b().f58886a.f111646e.f(stringExtra);
                                if (lVarF != null && lVarF.isHandshakeCompleted()) {
                                    cVar.d(str2);
                                } else {
                                    cVar.f198342e = Long.valueOf(longExtra);
                                }
                            }
                        }
                        break;
                    default:
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent2 = aVar.f67586b;
                            Long lValueOf = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : Long.valueOf(extras.getLong("extra_device_unit_id"));
                            if (lValueOf != null) {
                                DeviceDetailsActivity.na(this.f198338b.f198339b, lValueOf.longValue());
                            }
                        }
                        break;
                }
            }
        });
        this.f198344g = new a();
        final int i15 = 1;
        this.f198345h = mVar.registerForActivityResult(new g.h(), new f.b(this) { // from class: yo0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f198338b;

            {
                this.f198338b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                String stringExtra3;
                Bundle extras;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        if (aVar.f67585a == -1) {
                            boolean booleanExtra = intent != null ? intent.getBooleanExtra("EXTRA_RECONNECT_SUCCESSFUL", false) : false;
                            long longExtra = intent != null ? intent.getLongExtra("EXTRA_DEVICE_UNIT_ID", -1L) : -1L;
                            if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_DEVICE_MAC_ADDRESS")) == null) {
                                stringExtra = "";
                            }
                            String str = (intent == null || (stringExtra3 = intent.getStringExtra("EXTRA_DEVICE_PRODUCT_NUMBER")) == null) ? "" : stringExtra3;
                            String str2 = (intent == null || (stringExtra2 = intent.getStringExtra("EXTRA_DEVICE_NAME")) == null) ? "" : stringExtra2;
                            c cVar = this.f198338b;
                            if (!booleanExtra) {
                                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(cVar.f198339b).setTitle(R.string.lbl_failed_to_reconnect).setMessage(R.string.msg_reconnect_fail_set_up_device).setPositiveButton(R.string.lbl_set_up_device, new bn0.i(cVar, longExtra, str, str2, 2)).setNegativeButton(R.string.lbl_cancel, new v(9)).setNeutralButton(R.string.common_learn_more, (DialogInterface.OnClickListener) null).setCancelable(false).create();
                                eVarCreate.getClass();
                                eVarCreate.setOnShowListener(new bi2.d(eVarCreate, cVar, 5));
                                eVarCreate.show();
                            } else {
                                da2.l lVarF = da2.d.b().f58886a.f111646e.f(stringExtra);
                                if (lVarF != null && lVarF.isHandshakeCompleted()) {
                                    cVar.d(str2);
                                } else {
                                    cVar.f198342e = Long.valueOf(longExtra);
                                }
                            }
                        }
                        break;
                    default:
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent2 = aVar.f67586b;
                            Long lValueOf = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : Long.valueOf(extras.getLong("extra_device_unit_id"));
                            if (lValueOf != null) {
                                DeviceDetailsActivity.na(this.f198338b.f198339b, lValueOf.longValue());
                            }
                        }
                        break;
                }
            }
        });
        mVar.getF158016a().a(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zo0.q
    public final Object C6(v13.c cVar) {
        yo0.d dVar;
        androidx.fragment.app.m mVar;
        if (cVar instanceof yo0.d) {
            dVar = (yo0.d) cVar;
            int i14 = dVar.f198355d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f198355d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new yo0.d(this, cVar);
            }
        } else {
            dVar = new yo0.d(this, cVar);
        }
        Object objD = dVar.f198353b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f198355d;
        if (i15 == 0) {
            r.b(objD);
            ub1.i iVar = (ub1.i) KoinJavaComponent.get$default(ub1.i.class, null, null, 6, null);
            androidx.fragment.app.m mVar2 = this.f198339b;
            dVar.f198352a = mVar2;
            dVar.f198355d = 1;
            objD = iVar.d(mVar2, dVar);
            if (objD == aVar) {
                return aVar;
            }
            mVar = mVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mVar = dVar.f198352a;
            r.b(objD);
        }
        mVar.startActivity((Intent) objD);
        return Unit.INSTANCE;
    }

    @Override // zo0.q
    public final void I5() {
        SafetyFeaturesActivity.a aVar = SafetyFeaturesActivity.f43691f;
        androidx.fragment.app.m mVar = this.f198339b;
        mVar.startActivity(SafetyFeaturesActivity.a.a(aVar, mVar));
    }

    @Override // zo0.q
    public final void O4() {
        DeviceSetupActivity.f33758b.b(this.f198339b, o1.ADD_DEVICE, 0);
    }

    @Override // zo0.q
    public final i0 Q7() {
        return f0.w(this.f198339b);
    }

    @Override // zo0.q
    public final f U1(String str, ub1.k kVar) {
        str.getClass();
        kVar.getClass();
        return new f(str, this, kVar);
    }

    @Override // zo0.q
    public final void V1(long j8, String str, String str2, String str3, String str4) {
        DeviceReconnectActivity.f30728d.getClass();
        androidx.fragment.app.m mVar = this.f198339b;
        mVar.getClass();
        Intent intent = new Intent(mVar, (Class<?>) DeviceReconnectActivity.class);
        intent.putExtra("EXTRA_DEVICE_UNIT_ID", j8);
        intent.putExtra("EXTRA_DEVICE_MAC_ADDRESS", str);
        intent.putExtra("EXTRA_DEVICE_PRODUCT_NUMBER", str2);
        intent.putExtra("EXTRA_DEVICE_NAME", str3);
        intent.putExtra("EXTRA_DEVICE_IMAGE_URL", str4);
        this.f198343f.a(intent, null);
    }

    @Override // zo0.q
    public final void Y0(zo0.f fVar, zo0.f fVar2) {
        r70.v.a aVar = r70.v.f151104f;
        androidx.fragment.app.m mVar = this.f198339b;
        String string = mVar.getString(R.string.onboarding_want_a_reminder);
        aVar.getClass();
        r70.v vVarA = r70.v.a.a("BleUpgradeFollowUpDialog", string, fVar, fVar2, R.string.not_now_lbl, null);
        vVarA.setCancelable(false);
        vVarA.show(mVar.getSupportFragmentManager(), "GCMThreeButtonDialogFragment");
    }

    @Override // r70.w
    public final void a(r70.e eVar) {
        i iVar = (i) this.f198341d.getValue();
        y0 y0Var = new y0();
        c2 c2Var = iVar.f198397d;
        if (c2Var == null || !c2Var.isActive()) {
            iVar.f198399f.clear();
            iVar.f198397d = ge1.b.T(v1.a(iVar), iVar.f198396c, null, new g(iVar, this, y0Var, null), 2);
        }
        y0Var.f(this.f198339b, new b(new x9.b(27, this, eVar)));
    }

    @Override // r70.w
    public final void b(o31.a aVar, e23.a<Unit> aVar2) {
        aVar.getClass();
        aVar.Y2(this.f198339b, new ya0.l(aVar2, 7));
    }

    @Override // r70.w
    public final void c(e23.a<Unit> aVar) {
        i iVar = (i) this.f198341d.getValue();
        y0 y0Var = new y0();
        c2 c2Var = iVar.f198398e;
        if (c2Var == null || !c2Var.isActive()) {
            iVar.f198400g.clear();
            iVar.f198398e = ge1.b.T(v1.a(iVar), iVar.f198396c, null, new h(iVar, this, y0Var, null), 2);
        }
        y0Var.f(this.f198339b, new b(new x9.b(this, aVar, 26)));
    }

    public final void d(String str) {
        androidx.fragment.app.m mVar = this.f198339b;
        Snackbar snackbarMake = Snackbar.make(mVar.findViewById(R.id.content_frame), mVar.getString(R.string.dialog_title_device_connected_device_known_yes, str), 0);
        snackbarMake.getClass();
        v22.c.a(snackbarMake);
        snackbarMake.show();
    }

    @Override // zo0.q
    public final void d4() {
        WeatherLocationPreferenceActivity.f47895d.getClass();
        androidx.fragment.app.m mVar = this.f198339b;
        mVar.getClass();
        mVar.startActivity(new Intent(mVar, (Class<?>) WeatherLocationPreferenceActivity.class));
    }

    @Override // zo0.q
    public final Context getContext() {
        return this.f198339b;
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public final void hideProgressOverlay() {
        this.f198340c.hideProgressOverlay();
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public final boolean isProgressOverlayVisible() {
        return this.f198340c.isProgressOverlayVisible();
    }

    @Override // zo0.q
    public final void m0() {
        TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
        DateTime dateTimeNow = DateTime.now();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        TrainingInitiativeEventActivity.a.c(this.f198339b, dateTimeNow, null, bool);
    }

    @Override // androidx.lifecycle.n
    public final void onPause(n0 n0Var) {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f198344g);
    }

    @Override // androidx.lifecycle.n
    public final void onResume(n0 n0Var) {
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f198344g);
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public final void requestProgressOverlayFocus(String str) {
        this.f198340c.requestProgressOverlayFocus(str);
    }

    @Override // zo0.q
    public final void s6(u uVar) {
        uVar.getClass();
        BadgeChallengeDetailsActivity.a aVar = BadgeChallengeDetailsActivity.f37204e;
        String badgeChallengeUUID = uVar.getBadgeChallengeUUID();
        aVar.getClass();
        androidx.fragment.app.m mVar = this.f198339b;
        mVar.startActivity(BadgeChallengeDetailsActivity.a.a(mVar, badgeChallengeUUID));
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public final void showProgressOverlay() {
        this.f198340c.showProgressOverlay();
    }

    @Override // zo0.q
    public final void t3() {
        MCTSetupActivity.f39100c.getClass();
        androidx.fragment.app.m mVar = this.f198339b;
        mVar.getClass();
        Intent intent = new Intent(mVar, (Class<?>) MCTSetupActivity.class);
        intent.putExtra("DETAILS_KEY", false);
        intent.putExtra("FROM_STOP_TRACKING_KEY", false);
        mVar.startActivity(intent);
    }

    @Override // zo0.q
    public final Resources u5() {
        Resources resources = this.f198339b.getResources();
        resources.getClass();
        return resources;
    }

    @Override // zo0.q
    public final void y6(long j8, boolean z14) {
        if (!p.k(j8)) {
            String str = a2.ONBOARDING.f28756a;
            return;
        }
        androidx.fragment.app.m mVar = this.f198339b;
        if (!z14) {
            SensorsFirmwareUpdateActivity.f30877a.getClass();
            mVar.startActivity(SensorsFirmwareUpdateActivity.a.a(mVar, j8, true));
        } else {
            SensorsFirmwareUpdateActivity.f30877a.getClass();
            this.f198345h.a(SensorsFirmwareUpdateActivity.a.a(mVar, j8, true), null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.s2
    public final void showProgressOverlay(String str) {
        this.f198340c.showProgressOverlay(str);
    }
}
