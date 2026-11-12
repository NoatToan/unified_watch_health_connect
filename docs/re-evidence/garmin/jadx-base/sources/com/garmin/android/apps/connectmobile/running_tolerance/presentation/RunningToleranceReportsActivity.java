package com.garmin.android.apps.connectmobile.running_tolerance.presentation;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/running_tolerance/presentation/RunningToleranceReportsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RunningToleranceReportsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41161b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41162a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<jf1.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41166d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41163a = gVar;
            this.f41164b = qualifier;
            this.f41165c = aVar;
            this.f41166d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, jf1.b] */
        @Override // e23.a
        public final jf1.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41163a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f41165c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(jf1.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f41164b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41166d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new e(2026772761, true, new ik1.c(this, 10)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/running_tolerance/presentation/RunningToleranceReportsActivity$a;", "", "<init>", "()V", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
