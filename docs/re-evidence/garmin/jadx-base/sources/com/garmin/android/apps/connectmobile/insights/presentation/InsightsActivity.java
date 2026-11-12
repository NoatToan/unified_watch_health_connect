package com.garmin.android.apps.connectmobile.insights.presentation;

import android.os.Bundle;
import c.j;
import com.garmin.android.apps.connectmobile.r0;
import h7.c;
import lc.m0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q92.x;
import z10.d1;
import z10.l0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/insights/presentation/InsightsActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InsightsActivity extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f36903f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0 f36904e;

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "INSIGHTS";
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final boolean ga() {
        m0 m0Var = this.f36904e;
        if (m0Var == null) {
            s.m("navHostController");
            throw null;
        }
        if (m0Var.f111904b.i() == null) {
            return false;
        }
        m0 m0Var2 = this.f36904e;
        if (m0Var2 != null) {
            return m0Var2.n();
        }
        s.m("navHostController");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.INSIGHTS;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new e(1711735455, true, new uq0.a(this, 0)));
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = c.a(new p("PageAction", "Opened"));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewInsights");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (d1.h(x.DI_CONNECT_INSIGHTS, true)) {
            return;
        }
        finish();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/insights/presentation/InsightsActivity$a;", "", "<init>", "()V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
