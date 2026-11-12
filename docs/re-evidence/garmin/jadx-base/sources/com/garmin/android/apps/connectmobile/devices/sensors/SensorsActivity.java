package com.garmin.android.apps.connectmobile.devices.sensors;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import ov1.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/sensors/SensorsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SensorsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34344b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34345a = m.a(n.NONE, new a(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<qc0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f34346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34349d;

        public a(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34346a = gVar;
            this.f34347b = qualifier;
            this.f34348c = aVar;
            this.f34349d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, qc0.d] */
        @Override // e23.a
        public final qc0.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f34346a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f34348c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qc0.d.class), f189591b, null, defaultViewModelCreationExtras, this.f34347b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34349d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new e(480589822, true, new q(this, 21)));
    }
}
