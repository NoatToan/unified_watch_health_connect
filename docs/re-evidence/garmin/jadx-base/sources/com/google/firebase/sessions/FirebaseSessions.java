package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import e23.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.c0;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.g;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "settings", "Lt13/g;", "backgroundDispatcher", "Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;", "sessionsActivityLifecycleCallbacks", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lt13/g;Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;)V", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "FirebaseSessions";
    private final FirebaseApp firebaseApp;
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ SessionsActivityLifecycleCallbacks $sessionsActivityLifecycleCallbacks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$sessionsActivityLifecycleCallbacks = sessionsActivityLifecycleCallbacks;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FirebaseSessions.this.new AnonymousClass1(this.$sessionsActivityLifecycleCallbacks, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (FirebaseSessions.this.settings.getSessionsEnabled()) {
                FirebaseApp firebaseApp = FirebaseSessions.this.firebaseApp;
                final SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks = this.$sessionsActivityLifecycleCallbacks;
                firebaseApp.addLifecycleEventListener(new FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.b
                    @Override // com.google.firebase.FirebaseAppLifecycleListener
                    public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
                        sessionsActivityLifecycleCallbacks.onAppDelete();
                    }
                });
                Unit unit = Unit.INSTANCE;
            } else {
                t.k(Log.d(FirebaseSessions.TAG, "Sessions SDK disabled. Not listening to lifecycle events."));
            }
            return Unit.INSTANCE;
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            SessionsSettings sessionsSettings = FirebaseSessions.this.settings;
                            this.label = 2;
                        }
                    }
                }
            }
            t.k(Log.d(FirebaseSessions.TAG, "No Sessions subscribers. Not listening to lifecycle events."));
            return Unit.INSTANCE;
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, @Background g gVar, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        firebaseApp.getClass();
        sessionsSettings.getClass();
        gVar.getClass();
        sessionsActivityLifecycleCallbacks.getClass();
        this.firebaseApp = firebaseApp;
        this.settings = sessionsSettings;
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            applicationContext.getClass().toString();
        } else {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            ge1.b.T(c0.a(gVar), null, null, new AnonymousClass1(sessionsActivityLifecycleCallbacks, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            obj.getClass();
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }
}
