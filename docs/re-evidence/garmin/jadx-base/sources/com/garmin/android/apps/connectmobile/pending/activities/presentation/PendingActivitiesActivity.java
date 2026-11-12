package com.garmin.android.apps.connectmobile.pending.activities.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.d;
import f.c;
import g.h;
import lc.m0;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import tr2.y;
import w51.h0;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/PendingActivitiesActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PendingActivitiesActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39793d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f39795b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39794a = m.a(n.NONE, new b(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<Intent> f39796c = registerForActivityResult(new h(), new y(this, 8));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f39797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39800d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f39797a = gVar;
            this.f39798b = qualifier;
            this.f39799c = aVar;
            this.f39800d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, w51.h0] */
        @Override // e23.a
        public final h0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f39797a;
            y1 f185700a = gVar.getF189591b();
            e23.a aVar = this.f39799c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(h0.class), f185700a, null, defaultViewModelCreationExtras, this.f39798b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f39800d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extraStartDestination") : null;
            parcelable = (com.garmin.android.apps.connectmobile.pending.activities.presentation.a) (parcelableExtra instanceof com.garmin.android.apps.connectmobile.pending.activities.presentation.a ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("extraStartDestination", com.garmin.android.apps.connectmobile.pending.activities.presentation.a.class);
        }
        com.garmin.android.apps.connectmobile.pending.activities.presentation.a aVar = (com.garmin.android.apps.connectmobile.pending.activities.presentation.a) parcelable;
        if (aVar == null) {
            aVar = com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE;
        }
        initComposeScreen(new e(416956890, true, new w51.e(this, !s.g(aVar, com.garmin.android.apps.connectmobile.pending.activities.presentation.a.C0723a.INSTANCE), aVar, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pending/activities/presentation/PendingActivitiesActivity$a;", "", "<init>", "()V", "", "ACTIVITY_TYPE_RESULT_KEY", "Ljava/lang/String;", "EXTRA_START_DESTINATION", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, com.garmin.android.apps.connectmobile.pending.activities.presentation.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) PendingActivitiesActivity.class);
            intent.putExtra("extraStartDestination", aVar);
            return intent;
        }

        private a() {
        }
    }
}
