package com.garmin.android.apps.connectmobile.running_economy.presentation;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import com.garmin.android.apps.connectmobile.c;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import wb1.i;
import we1.d;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/running_economy/presentation/RunningEconomyReportsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RunningEconomyReportsActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41149c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41150a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41151b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41155d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41152a = gVar;
            this.f41153b = qualifier;
            this.f41154c = aVar;
            this.f41155d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, we1.d] */
        @Override // e23.a
        public final d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41152a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f41154c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f41153b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41155d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Boolean boolValueOf = extras != null ? Boolean.valueOf(extras.getBoolean("SHOW_FOUR_WEEK_CHART")) : null;
        getIntent().removeExtra("SHOW_FOUR_WEEK_CHART");
        this.f41151b = getIntent().getBooleanExtra("HELP_NAVIGATION_EXTRA", false);
        j.a(this, new e(1542114154, true, new i(3, this, boolValueOf)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/running_economy/presentation/RunningEconomyReportsActivity$a;", "", "<init>", "()V", "", "HELP_NAVIGATION_EXTRA", "Ljava/lang/String;", "SHOW_FOUR_WEEK_CHART", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
