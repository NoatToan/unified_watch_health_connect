package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "", "init", "setCustomKeys", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Le23/l;)V", "", "throwable", "recordException", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ljava/lang/Throwable;Le23/l;)V", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        firebase.getClass();
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.getClass();
        return firebaseCrashlytics;
    }

    public static final void recordException(FirebaseCrashlytics firebaseCrashlytics, Throwable th3, l<? super KeyValueBuilder, Unit> lVar) {
        firebaseCrashlytics.getClass();
        th3.getClass();
        lVar.getClass();
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        lVar.invoke(keyValueBuilder);
        firebaseCrashlytics.recordException(th3, keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, l<? super KeyValueBuilder, Unit> lVar) {
        firebaseCrashlytics.getClass();
        lVar.getClass();
        KeyValueBuilder keyValueBuilder = new KeyValueBuilder();
        lVar.invoke(keyValueBuilder);
        firebaseCrashlytics.setCustomKeys(keyValueBuilder.build$com_google_firebase_firebase_crashlytics());
    }
}
