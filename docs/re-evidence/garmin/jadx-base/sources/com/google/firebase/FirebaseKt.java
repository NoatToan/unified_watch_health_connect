package com.google.firebase;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import java.lang.annotation.Annotation;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f\u001a)\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\r\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/Firebase;", "", "name", "Lcom/google/firebase/FirebaseApp;", "app", "(Lcom/google/firebase/Firebase;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "initialize", "(Lcom/google/firebase/Firebase;Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/FirebaseOptions;", "options", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/Firebase;Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;", "", "T", "Lcom/google/firebase/components/Component;", "Lo53/z;", "coroutineDispatcher", "()Lcom/google/firebase/components/Component;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;", "com.google.firebase-firebase-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FirebaseKt {
    public static final FirebaseApp app(Firebase firebase, String str) {
        firebase.getClass();
        str.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        firebaseApp.getClass();
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<z> coroutineDispatcher() {
        s.l();
        throw null;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        firebase.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        firebaseApp.getClass();
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        firebase.getClass();
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        options.getClass();
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions, String str) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        str.getClass();
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        firebaseAppInitializeApp.getClass();
        return firebaseAppInitializeApp;
    }

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements ComponentFactory {
        public static final AnonymousClass1<T> INSTANCE = new AnonymousClass1<>();

        @Override // com.google.firebase.components.ComponentFactory
        public final z create(ComponentContainer componentContainer) {
            s.l();
            throw null;
        }
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions firebaseOptions) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        firebaseAppInitializeApp.getClass();
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        firebase.getClass();
        context.getClass();
        return FirebaseApp.initializeApp(context);
    }
}
