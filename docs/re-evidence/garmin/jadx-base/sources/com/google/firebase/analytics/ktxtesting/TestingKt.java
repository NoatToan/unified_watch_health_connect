package com.google.firebase.analytics.ktxtesting;

import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "Lkotlin/Function0;", "", "block", "withAnalyticsForTest", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Le23/a;)V", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TestingKt {
    public static final void withAnalyticsForTest(FirebaseAnalytics firebaseAnalytics, a<Unit> aVar) {
        firebaseAnalytics.getClass();
        aVar.getClass();
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(firebaseAnalytics);
            try {
                aVar.invoke();
                AnalyticsKt.setANALYTICS(analytics);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                AnalyticsKt.setANALYTICS(analytics);
                throw th3;
            }
        }
    }
}
