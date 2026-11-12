package com.google.firebase.analytics;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\f\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ParametersBuilder;", "", "block", "logEvent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;Le23/l;)V", "Lcom/google/firebase/analytics/ConsentBuilder;", "setConsent", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Le23/l;)V", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "", "LOCK", "Ljava/lang/Object;", "getLOCK", "()Ljava/lang/Object;", "Lcom/google/firebase/Firebase;", "getAnalytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKt {
    private static volatile FirebaseAnalytics zza;
    private static final Object zzb = new Object();

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase firebase) {
        firebase.getClass();
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String str, l<? super ParametersBuilder, Unit> lVar) {
        firebaseAnalytics.getClass();
        str.getClass();
        lVar.getClass();
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        lVar.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getZza());
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, l<? super ConsentBuilder, Unit> lVar) {
        firebaseAnalytics.getClass();
        lVar.getClass();
        ConsentBuilder consentBuilder = new ConsentBuilder();
        lVar.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
