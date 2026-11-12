package com.garmin.android.apps.connectmobile.home;

import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.model.u;
import e23.l;
import hc0.k;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import sd2.f;
import yo0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/home/MyDeviceActivity;", "Lcom/garmin/android/apps/connectmobile/devices/DeviceDetailsActivity;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MyDeviceActivity extends DeviceDetailsActivity {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w1 f36656r = new w1(s0.f105811a.b(m.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36657a;

        public a(l lVar) {
            lVar.getClass();
            this.f36657a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36657a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36657a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36658a;

        public b(g gVar) {
            this.f36658a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36658a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36659a;

        public c(g gVar) {
            this.f36659a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36659a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36661b;

        public d(e23.a aVar, g gVar) {
            this.f36660a = aVar;
            this.f36661b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36660a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36661b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Unit qa(MyDeviceActivity myDeviceActivity, u uVar) {
        f fVar = uVar.f34316a;
        if (fVar != null) {
            y0 y0Var = ((m) myDeviceActivity.f36656r.getValue()).f198411c;
            u uVar2 = (u) y0Var.d();
            int i14 = uVar2 != null ? uVar2.f34318c : 0;
            u uVar3 = (u) y0Var.d();
            int i15 = uVar3 != null ? uVar3.f34317b : 0;
            if (i14 == 1 || i15 == 1) {
                myDeviceActivity.f33807g = fVar.getUnitID();
                super.oa();
            } else {
                v supportFragmentManager = myDeviceActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                aVarB.l(R.id.content_frame, k.Y6(false), "DevicesDashboardFragment");
                aVarB.e();
                myDeviceActivity.initActionBar(true, R.string.concept_devices);
            }
        } else {
            v supportFragmentManager2 = myDeviceActivity.getSupportFragmentManager();
            androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
            aVarB2.l(R.id.content_frame, k.Y6(false), "DevicesDashboardFragment");
            aVarB2.e();
            myDeviceActivity.initActionBar(true, R.string.concept_devices);
        }
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity, com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "MY_DEVICE_CUSTOMIZABLE";
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void initActionBar(boolean z14, String str) {
        super.initActionBar(z14, str);
        if (ha()) {
            updateActionBarNavigation(1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity
    public final void oa() {
        w1 w1Var = this.f36656r;
        ((m) w1Var.getValue()).f198411c.f(this, new a(new xa2.g(this, 23)));
        m mVar = (m) w1Var.getValue();
        ge1.b.T(v1.a(mVar), null, null, new yo0.l(mVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 335544320);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ca("MY_DEVICE_CUSTOMIZABLE");
    }
}
