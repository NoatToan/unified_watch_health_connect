package com.garmin.android.apps.connectmobile.race_time_prediction.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c.j;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import fg0.k;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r53.p2;
import u91.i;
import uc1.f;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/race_time_prediction/presentation/RaceTimePredictionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RaceTimePredictionActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41078b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41079a = m.a(n.NONE, new b(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f41080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f41081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f41082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f41083d;

        public b(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f41080a = gVar;
            this.f41081b = qualifier;
            this.f41082c = aVar;
            this.f41083d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, uc1.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f41080a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f41082c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), f189591b, null, defaultViewModelCreationExtras, this.f41081b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f41083d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        k kVar = null;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_sharable_event_dto", k.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_sharable_event_dto");
                parcelable = (k) (parcelable2 instanceof k ? parcelable2 : null);
            }
            kVar = (k) parcelable;
        }
        if (kVar != null) {
            p2 p2Var = ((f) this.f41079a.getValue()).f169986d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, k.d((k) value, kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null, null, null, null, kVar.getShareableEventUuid(), null, -8388610)));
        }
        j.a(this, new e(227665459, true, new i(3, kVar, this)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/race_time_prediction/presentation/RaceTimePredictionActivity$a;", "", "<init>", "()V", "gcm-race-time-prediction_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
