package com.garmin.android.apps.connectmobile.activities.powercurve;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import com.garmin.android.apps.connectmobile.R;
import ep.d;
import ep.e;
import ep.h;
import ep.o;
import o13.m;
import o13.n;
import o4.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/powercurve/PowerCurveDetailsActivity;", "Lb/g;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerCurveDetailsActivity extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29752b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29753a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f29754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f29755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f29756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f29757d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f29754a = gVar;
            this.f29755b = qualifier;
            this.f29756c = aVar;
            this.f29757d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, ep.o] */
        @Override // e23.a
        public final o invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f29754a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f29756c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o.class), f189591b, null, defaultViewModelCreationExtras, this.f29755b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f29757d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, o13.l] */
    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("dataConfig", ep.g.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("dataConfig") : null;
            if (!(parcelableExtra instanceof ep.g)) {
                parcelableExtra = null;
            }
            parcelable = (ep.g) parcelableExtra;
        }
        ep.g gVar = (ep.g) parcelable;
        if (gVar == null) {
            finish();
            return;
        }
        ((o) this.f29753a.getValue()).f64850i.k(null, new ep.n(getIntent().getDoubleExtra("userWeight", 0.0d), getIntent().getBooleanExtra("isWattsPerKg", false), null, new e(i53.a.e(ep.a.a(gVar.f64817a)), i53.a.e(d.a(gVar.f64818b)), f0.b(a7.b.getColor(this, R.color.gds_data_viz_blue_secondary)), f0.b(a7.b.getColor(this, R.color.gds_data_viz_neutral_secondary)), null), 4, null));
        j.a(this, new z3.e(589434399, true, new h(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/powercurve/PowerCurveDetailsActivity$a;", "", "<init>", "()V", "", "POWER_CURVE_DETAILS", "Ljava/lang/String;", "WATTS_PER_KG", "USER_WEIGHT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
