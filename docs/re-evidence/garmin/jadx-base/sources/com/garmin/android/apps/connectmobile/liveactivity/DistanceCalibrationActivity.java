package com.garmin.android.apps.connectmobile.liveactivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import au0.q;
import b.g;
import b.j;
import java.io.Serializable;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import r1.q2;
import v.h;
import z3.e;
import zf2.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveactivity/DistanceCalibrationActivity;", "Lb/g;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DistanceCalibrationActivity extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38470b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38471a = m.a(n.NONE, new c(this, null, null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f38478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38481d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f38478a = gVar;
            this.f38479b = qualifier;
            this.f38480c = aVar;
            this.f38481d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, au0.q] */
        @Override // e23.a
        public final q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f38478a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f38480c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(q.class), f189591b, null, defaultViewModelCreationExtras, this.f38479b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f38481d, 4, null);
        }
    }

    @Override // b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this);
        b.a aVar = b.f38472f;
        Intent intent = getIntent();
        intent.getClass();
        aVar.getClass();
        long longExtra = intent.getLongExtra("extra.device.unit.id", -1L);
        int intExtra = intent.getIntExtra("extra.request.id", -1);
        Serializable serializableExtra = intent.getSerializableExtra("extra.activity.type");
        b bVar = null;
        d dVar = serializableExtra instanceof d ? (d) serializableExtra : null;
        int intExtra2 = intent.getIntExtra("extra.distance.meters", -1);
        boolean booleanExtra = intent.getBooleanExtra("extra.is.calibration", false);
        if (longExtra != -1 && intExtra != -1 && dVar != null && intExtra2 != -1) {
            bVar = new b(longExtra, intExtra, dVar, intExtra2, booleanExtra);
        }
        if (bVar == null) {
            finish();
        } else {
            c.j.a(this, new e(-170401487, true, new au0.b(this, bVar, 0)));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveactivity/DistanceCalibrationActivity$b;", "", "", "deviceUnitId", "", "requestId", "Lzf2/d;", "activityType", "initialDistanceMeters", "", "isCalibration", "<init>", "(JILzf2/d;IZ)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f38472f = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f38473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f38475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f38476d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f38477e;

        public b(long j8, int i14, d dVar, int i15, boolean z14) {
            this.f38473a = j8;
            this.f38474b = i14;
            this.f38475c = dVar;
            this.f38476d = i15;
            this.f38477e = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38473a == bVar.f38473a && this.f38474b == bVar.f38474b && this.f38475c == bVar.f38475c && this.f38476d == bVar.f38476d && this.f38477e == bVar.f38477e;
        }

        public final int hashCode() {
            int iD = q2.d(this.f38474b, Long.hashCode(this.f38473a) * 31, 31);
            d dVar = this.f38475c;
            return Boolean.hashCode(this.f38477e) + q2.d(this.f38476d, (iD + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbW = h.w(this.f38474b, "IntentData(deviceUnitId=", ", requestId=", this.f38473a);
            sbW.append(", activityType=");
            sbW.append(this.f38475c);
            sbW.append(", initialDistanceMeters=");
            sbW.append(this.f38476d);
            return com.airbnb.lottie.animation.keyframe.a.i(sbW, ", isCalibration=", this.f38477e, ")");
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveactivity/DistanceCalibrationActivity$b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveactivity/DistanceCalibrationActivity$a;", "", "<init>", "()V", "", "EXTRA_REQUEST_ID", "Ljava/lang/String;", "EXTRA_ACTIVITY_TYPE", "EXTRA_IS_CALIBRATION", "EXTRA_DISTANCE_METERS", "EXTRA_DEVICE_UNIT_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
