package com.garmin.android.apps.connectmobile.workouts.presentation.selectworkout;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.i2;
import m52.k;
import mh1.i;
import n62.c;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/selectworkout/SelectWorkoutActivityActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Ln62/c;", "viewModel", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectWorkoutActivityActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49549a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f49550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f49551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f49552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f49553d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f49550a = gVar;
            this.f49551b = qualifier;
            this.f49552c = aVar;
            this.f49553d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, n62.c] */
        @Override // e23.a
        public final c invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f49550a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f49552c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(c.class), viewModelStore, null, defaultViewModelCreationExtras, this.f49551b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f49553d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        k kVarC;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("extra_activity_type_key");
        if (stringExtra != null) {
            k.f116753m.getClass();
            kVarC = k.a.c(stringExtra);
        } else {
            kVarC = null;
        }
        long longExtra = getIntent().getLongExtra("extra_device_id", -1L);
        if (kVarC != null && longExtra > 0) {
            initComposeScreen(new e(606101435, true, new n62.a(kVarC, this, longExtra, m.a(n.NONE, new b(this, null, null, new i(kVarC, 24))), 0)));
        } else {
            a2 a2Var = a2.WORKOUTS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SelectWorkoutActivityActivity", "Missing or invalid activityType/deviceId provided in intent extras.");
            finish();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/selectworkout/SelectWorkoutActivityActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_ACTIVITY_TYPE_KEY", "EXTRA_DEVICE_ID", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
