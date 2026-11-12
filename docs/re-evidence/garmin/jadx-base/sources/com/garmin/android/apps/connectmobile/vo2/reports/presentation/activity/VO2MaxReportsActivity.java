package com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import java.io.Serializable;
import li0.y;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import q71.e;
import w32.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/vo2/reports/presentation/activity/VO2MaxReportsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "recordingStartedForCurrentSession", "vo2MaxEstimationCompleted", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VO2MaxReportsActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47876b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47877a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f47879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f47880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f47881d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f47878a = gVar;
            this.f47879b = qualifier;
            this.f47880c = aVar;
            this.f47881d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, w32.l] */
        @Override // e23.a
        public final l invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f47878a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f47880c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(l.class), viewModelStore, null, defaultViewModelCreationExtras, this.f47879b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f47881d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("vo2MaxType");
        Parcelable parcelable = null;
        e eVar = serializableExtra instanceof e ? (e) serializableExtra : null;
        boolean booleanExtra = getIntent().getBooleanExtra("open_walking_test_extra", false);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("vo2_max_extra_data") : null;
            parcelable = (c42.b) (parcelableExtra instanceof c42.b ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("vo2_max_extra_data", c42.b.class);
        }
        initComposeScreen(new z3.e(794730965, true, new y(this, eVar, (c42.b) parcelable, booleanExtra, 27)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/vo2/reports/presentation/activity/VO2MaxReportsActivity$a;", "", "<init>", "()V", "", "VO2_MAX_TYPE", "Ljava/lang/String;", "OPEN_WALKING_TEST_EXTRA", "VO2_MAX_EXTRA_DATA", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
