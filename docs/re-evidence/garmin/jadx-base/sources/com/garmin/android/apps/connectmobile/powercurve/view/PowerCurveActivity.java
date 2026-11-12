package com.garmin.android.apps.connectmobile.powercurve.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import ja1.c;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import po.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/PowerCurveActivity;", "Le32/n;", "Lja1/c;", "Le32/f;", "<init>", "()V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerCurveActivity extends n<c> implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40339p = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ma1.a f40340n = ma1.a.CYCLING;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f40341o = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/powercurve/view/PowerCurveActivity$b", "Lqa1/a;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements qa1.a {
        public b() {
        }

        @Override // qa1.a
        public final void a() {
            PowerCurveActivity powerCurveActivity = PowerCurveActivity.this;
            powerCurveActivity.showProgressOverlay();
            new Handler(Looper.getMainLooper()).postDelayed(new g(powerCurveActivity, 4), 2000L);
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        if (cVar instanceof ja1.a) {
            com.garmin.android.apps.connectmobile.powercurve.view.a.C0757a c0757a = com.garmin.android.apps.connectmobile.powercurve.view.a.f40343c;
            long j8 = ((ja1.a) cVar).f98073a;
            c0757a.getClass();
            com.garmin.android.apps.connectmobile.powercurve.view.a aVar = new com.garmin.android.apps.connectmobile.powercurve.view.a();
            Bundle bundle = new Bundle();
            bundle.putLong("ACTIVITY_ID_KEY", j8);
            aVar.setArguments(bundle);
            aVar.f40344a = this.f40341o;
            aVar.show(getSupportFragmentManager(), "");
        }
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        com.garmin.android.apps.connectmobile.powercurve.view.b.a aVar = com.garmin.android.apps.connectmobile.powercurve.view.b.f40346q;
        ma1.a aVar2 = this.f40340n;
        aVar.getClass();
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.powercurve.view.b bVar = new com.garmin.android.apps.connectmobile.powercurve.view.b();
        i.f62791o.getClass();
        Bundle bundleA = i.a.a(i14, j8, j14);
        bundleA.putString("extra_power_curve_sport_key", aVar2.f117628a);
        bVar.setArguments(bundleA);
        return bVar;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ma1.a.C2227a c2227a = ma1.a.f117623d;
        String stringExtra = getIntent().getStringExtra("extra_power_curve_sport_key");
        c2227a.getClass();
        ma1.a aVarA = ma1.a.C2227a.a(stringExtra);
        if (aVarA == null) {
            aVarA = ma1.a.CYCLING;
        }
        this.f40340n = aVarA;
        super.onCreate(bundle);
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new j(this, dateTime, new o[]{o.f62808k, o.f62811n, o.f62815r}, null, 8, null);
    }

    @Override // e32.n
    public final String ta() {
        return dh.b.A(this, this.f40340n.f117629b);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/PowerCurveActivity$a;", "", "<init>", "()V", "", "REFRESH_DELAY_IN_MILLISECONDS", "J", "", "EXTRA_POWER_CURVE_SPORT_KEY", "Ljava/lang/String;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
