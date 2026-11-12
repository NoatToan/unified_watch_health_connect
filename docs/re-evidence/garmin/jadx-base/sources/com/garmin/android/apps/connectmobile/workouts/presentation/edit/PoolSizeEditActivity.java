package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/PoolSizeEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PoolSizeEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48844c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f48845a = new w1(s0.f105811a.b(f62.l.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f48846b = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/workouts/presentation/edit/PoolSizeEditActivity$b", "Lb/s;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            Intent intent = new Intent();
            a aVar = PoolSizeEditActivity.f48844c;
            PoolSizeEditActivity poolSizeEditActivity = PoolSizeEditActivity.this;
            if (poolSizeEditActivity.ca().y4().f69253a != null) {
                intent.putExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", poolSizeEditActivity.ca().y4().f69253a);
            }
            intent.putExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", poolSizeEditActivity.ca().y4().f69254b);
            poolSizeEditActivity.setResult(-1, intent);
            poolSizeEditActivity.finish();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48848a;

        public c(b.g gVar) {
            this.f48848a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f48848a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f48849a;

        public d(b.g gVar) {
            this.f48849a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f48849a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f48850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f48851b;

        public e(e23.a aVar, b.g gVar) {
            this.f48850a = aVar;
            this.f48851b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f48850a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f48851b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final f62.l ca() {
        return (f62.l) this.f48845a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        super.onCreate(bundle);
        setContentView();
        getOnBackPressedDispatcher().b(this.f48846b, this);
        double doubleExtra = getIntent().getDoubleExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_value", Double.NaN);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit", m52.j.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("com.garmin.android.apps.connectmobile.workouts.step.PoolSizeEditActivity.extra.pool_size_unit") : null;
            if (!(serializableExtra2 instanceof m52.j)) {
                serializableExtra2 = null;
            }
            serializableExtra = (m52.j) serializableExtra2;
        }
        ca().f69268a = new f62.i(Double.valueOf(doubleExtra), (m52.j) serializableExtra);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.e.f48957k.getClass();
        aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.e(), null);
        aVarB.e();
        initActionBar(true, getString(R.string.workout_pool_size));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (!ca().f69270c) {
            getOnBackPressedDispatcher().d();
            return true;
        }
        ((y0) ca().f69275h.getValue()).j(Boolean.valueOf(ca().f69270c));
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/PoolSizeEditActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_POOL_SIZE_VALUE", "EXTRA_POOL_SIZE_UNIT", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
