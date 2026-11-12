package com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity;
import com.garmin.android.apps.connectmobile.d;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import yv.f;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/firmwareupdate/SensorsFirmwareUpdateActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lyv/d;", "viewModel", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SensorsFirmwareUpdateActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30877a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<yv.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30881d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f30878a = gVar;
            this.f30879b = qualifier;
            this.f30880c = aVar;
            this.f30881d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, yv.d] */
        @Override // e23.a
        public final yv.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f30878a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f30880c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(yv.d.class), f189591b, null, defaultViewModelCreationExtras, this.f30879b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f30881d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        final long j8 = extras != null ? extras.getLong("GCM_deviceUnitID") : -1L;
        if (j8 == -1) {
            finish();
        }
        Bundle extras2 = getIntent().getExtras();
        final boolean z14 = extras2 != null ? extras2.getBoolean("EXTRA_IS_FROM_HOME") : false;
        initComposeScreen(new e(1301929118, true, new f(z14, this, j8, m.a(n.NONE, new b(this, null, null, new e23.a() { // from class: yv.e
            @Override // e23.a
            public final Object invoke() {
                SensorsFirmwareUpdateActivity.a aVar = SensorsFirmwareUpdateActivity.f30877a;
                return ParametersHolderKt.parametersOf(Long.valueOf(j8), Boolean.valueOf(z14));
            }
        })), 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/firmwareupdate/SensorsFirmwareUpdateActivity$a;", "", "<init>", "()V", "", "EXTRA_IS_FROM_HOME", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, boolean z14) {
            Intent intentD = sn.a.d(context, context, SensorsFirmwareUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong("GCM_deviceUnitID", j8);
            bundle.putBoolean("EXTRA_IS_FROM_HOME", z14);
            intentD.putExtras(bundle);
            return intentD;
        }

        private a() {
        }
    }
}
