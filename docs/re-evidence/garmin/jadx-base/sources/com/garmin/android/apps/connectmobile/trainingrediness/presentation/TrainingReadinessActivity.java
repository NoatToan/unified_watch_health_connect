package com.garmin.android.apps.connectmobile.trainingrediness.presentation;

import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import b63.o;
import com.garmin.android.apps.connectmobile.d;
import g22.k;
import g22.l;
import java.io.Serializable;
import o13.m;
import o13.n;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import sz1.b;
import sz1.t;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/trainingrediness/presentation/TrainingReadinessActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingReadinessActivity extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46481b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46482a = m.a(n.NONE, new a(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f46484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f46485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f46486d;

        public a(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f46483a = gVar;
            this.f46484b = qualifier;
            this.f46485c = aVar;
            this.f46486d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, sz1.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f46483a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f46485c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f46484b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f46486d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        DateTime dateTime = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("EXTRA_INITIAL_DATE", DateTime.class);
            } else {
                Serializable serializable2 = extras.getSerializable("EXTRA_INITIAL_DATE");
                serializable = (DateTime) (serializable2 instanceof DateTime ? serializable2 : null);
            }
            dateTime = (DateTime) serializable;
        }
        String.valueOf(dateTime);
        initComposeScreen(new e(130867765, true, new b(this, dateTime != null ? k.z(dateTime).b() : l.d(o.INSTANCE), 0)));
    }
}
