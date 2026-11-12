package com.garmin.android.apps.connectmobile.settings.devices.index;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import c22.u1;
import ch1.h6;
import ch1.m0;
import ch1.m1;
import ch1.s4;
import ch1.w1;
import ch1.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import e23.p;
import fb2.k;
import java.util.ArrayList;
import java.util.Observable;
import mh1.j;
import mh1.l;
import ng1.k0;
import o13.r;
import o53.b0;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import rd2.f;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import zb0.d0;
import zb0.t;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/IndexDevicesGeneralSettingActivity;", "Lng1/k0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexDevicesGeneralSettingActivity extends k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f43030o = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.IndexDevicesGeneralSettingActivity$onActivityResult$1", f = "IndexDevicesGeneralSettingActivity.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x1 f43032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceSettingsDTO f43033c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1 x1Var, DeviceSettingsDTO deviceSettingsDTO, d<? super b> dVar) {
            super(2, dVar);
            this.f43032b = x1Var;
            this.f43033c = deviceSettingsDTO;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f43032b, this.f43033c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f43031a;
            if (i14 == 0) {
                r.b(obj);
                this.f43031a = 1;
                if (this.f43032b.v(this.f43033c, this) == aVar) {
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

    static {
        new a(null);
    }

    @Override // ng1.k0
    public final void ea() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new h6(this));
        if (u0.r(this.f125978d)) {
            arrayList.add(new s4(this));
            arrayList.add(new m0(this));
            arrayList.add(new k(this));
            if (this.f125985k != null) {
                x1 x1Var = new x1(this);
                if (this.f125977c.N1()) {
                    String string = getString(R.string.lbl_location_settings);
                    string.getClass();
                    String string2 = getString(R.string.lbl_help);
                    string2.getClass();
                    arrayList.add(new m1(this, string, string2, new mh1.i(this, 0)));
                    arrayList.add(x1Var);
                }
            }
            String string3 = getString(R.string.lbl_software);
            string3.getClass();
            arrayList.add(new m1(this, string3, null, null, 12, null));
            arrayList.add(new w1(this));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, mh1.l] */
    @Override // ng1.k0
    public final void fa() {
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            for (fb2.e eVar : this.f125956m) {
                if (eVar instanceof w1) {
                    String str = this.f125982h;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = this.f125979e;
                    w1 w1Var = (w1) eVar;
                    w1Var.f70344b = new l(str, str2 != null ? str2 : "");
                    w1Var.p();
                    w1Var.addObserver(this);
                    w1Var.m(true);
                } else if (eVar instanceof x1) {
                    x1 x1Var = (x1) eVar;
                    boolean zG = x1Var.g(this, deviceSettingsDTO);
                    x1Var.addObserver(this);
                    x1Var.m(zG);
                    ge1.b.T(f0.w(this), null, null, new j(eVar, deviceSettingsDTO, null), 3);
                } else {
                    boolean zG2 = eVar.g(this, deviceSettingsDTO);
                    eVar.addObserver(this);
                    eVar.m(zG2);
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 100) {
            hk0.a aVarF = hk0.a.f();
            hk0.a.EnumC1667a enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS;
            long j8 = this.f125976b;
            aVarF.getClass();
            String strA = u1.a(j8);
            if (strA != null) {
                aVarF.n(enumC1667a, strA);
                return;
            } else {
                aVarF.d(j8, "sendSetupWizardState");
                return;
            }
        }
        if (i15 == -1 && i14 == 200) {
            ArrayList arrayList = this.f125956m;
            arrayList.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof x1) {
                    arrayList2.add(obj);
                }
            }
            x1 x1Var = (x1) h0.d0(arrayList2);
            if (x1Var != null) {
                Double dValueOf = (intent == null || !intent.hasExtra("extra_result_latitude")) ? null : Double.valueOf(intent.getDoubleExtra("extra_result_latitude", Double.NaN));
                Double dValueOf2 = (intent == null || !intent.hasExtra("extra_result_longitude")) ? null : Double.valueOf(intent.getDoubleExtra("extra_result_longitude", Double.NaN));
                DeviceSettingsDTO deviceSettingsDTO = new DeviceSettingsDTO();
                deviceSettingsDTO.C1 = dValueOf;
                deviceSettingsDTO.S1("latitude");
                deviceSettingsDTO.D1 = dValueOf2;
                deviceSettingsDTO.S1("longitude");
                ge1.b.T(f0.w(this), null, null, new b(x1Var, deviceSettingsDTO, null), 3);
            }
            com.garmin.android.apps.connectmobile.settings.devices.index.a.C0800a c0800a = com.garmin.android.apps.connectmobile.settings.devices.index.a.f43064a;
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            c0800a.getClass();
            new com.garmin.android.apps.connectmobile.settings.devices.index.a().show(supportFragmentManager, "IndexS2LocationSyncDialog");
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.lbl_general);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        if (obj != null) {
            if (observable instanceof h6) {
                rd2.j jVar = f.a().f152045a;
                long j8 = this.f125976b;
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                GCMWiFiNetworksActivity.f43245f.h(this, 100, this.f125976b, fVarI != null ? fVarI.getProductNumber() : null, fVarI != null ? fVarI.getProductDisplayName() : null, t.d(fVarI), false);
                return;
            }
            if (observable instanceof x1) {
                Bundle bundleD = tn.k.d("Screen", "IndexS2GeneralSettings", "Action", "LocationTapped");
                ht.a.f85464a.getClass();
                ht.a.a(bundleD, "UserAction");
                ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).k(this, this.f125976b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/index/IndexDevicesGeneralSettingActivity$a;", "", "<init>", "()V", "", "WIFI_SETUP_REQUEST_CODE", "I", "SYNC_NOTIFICATION_REQUEST_CODE", "", "EXTRA_RESULT_LATITUDE", "Ljava/lang/String;", "EXTRA_RESULT_LONGITUDE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
