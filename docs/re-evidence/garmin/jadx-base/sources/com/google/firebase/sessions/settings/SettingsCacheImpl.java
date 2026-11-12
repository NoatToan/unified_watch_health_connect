package com.google.firebase.sessions.settings;

import android.util.Log;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.TimeProvider;
import e23.p;
import ge1.b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import r53.j;
import t13.d;
import t13.g;
import u13.a;
import u7.k;
import v13.c;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u001aH\u0081@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lt13/g;", "backgroundDispatcher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lu7/k;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "<init>", "(Lt13/g;Lcom/google/firebase/sessions/TimeProvider;Lu7/k;)V", "", "hasCacheExpired", "()Z", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "sessionConfigs", "", "updateConfigs", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lt13/d;)Ljava/lang/Object;", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lt13/d;)Ljava/lang/Object;", "removeConfigs", "Lt13/g;", "Lcom/google/firebase/sessions/TimeProvider;", "Lu7/k;", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigsAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", "getSessionConfigs", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsCacheImpl implements SettingsCache {
    private final g backgroundDispatcher;
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;
    private final k<SessionConfigs> sessionConfigsDataStore;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
    public static final class C39241 extends c {
        int label;
        /* synthetic */ Object result;

        public C39241(d<? super C39241> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCacheImpl.this.updateConfigs(null, this);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<SessionConfigs, d<? super SessionConfigs>, Object> {
        final /* synthetic */ SessionConfigs $sessionConfigs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionConfigs sessionConfigs, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$sessionConfigs = sessionConfigs;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$sessionConfigs, dVar);
        }

        @Override // e23.p
        public final Object invoke(SessionConfigs sessionConfigs, d<? super SessionConfigs> dVar) {
            return ((AnonymousClass2) create(sessionConfigs, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                r.b(obj);
                return this.$sessionConfigs;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public SettingsCacheImpl(@Background g gVar, TimeProvider timeProvider, k<SessionConfigs> kVar) {
        gVar.getClass();
        timeProvider.getClass();
        kVar.getClass();
        this.backgroundDispatcher = gVar;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = kVar;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        b.T(c0.a(gVar), null, null, new AnonymousClass1(null), 3);
    }

    private final SessionConfigs getSessionConfigs() throws Throwable {
        if (this.sessionConfigsAtomicReference.get() == null) {
            AtomicReference<SessionConfigs> atomicReference = this.sessionConfigsAtomicReference;
            Object objW = b.W(t13.h.f161748a, new SettingsCacheImpl$sessionConfigs$1(this, null));
            while (!atomicReference.compareAndSet(null, (SessionConfigs) objW) && atomicReference.get() == null) {
            }
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        sessionConfigs.getClass();
        return sessionConfigs;
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public boolean hasCacheExpired() {
        Long cacheUpdatedTimeSeconds = getSessionConfigs().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = getSessionConfigs().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.timeProvider.currentTime().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object removeConfigs$com_google_firebase_firebase_sessions(d<Object> dVar) {
        SettingsCacheImpl$removeConfigs$1 settingsCacheImpl$removeConfigs$1;
        if (dVar instanceof SettingsCacheImpl$removeConfigs$1) {
            settingsCacheImpl$removeConfigs$1 = (SettingsCacheImpl$removeConfigs$1) dVar;
            int i14 = settingsCacheImpl$removeConfigs$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                settingsCacheImpl$removeConfigs$1.label = i14 - Integer.MIN_VALUE;
            } else {
                settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, dVar);
            }
        } else {
            settingsCacheImpl$removeConfigs$1 = new SettingsCacheImpl$removeConfigs$1(this, dVar);
        }
        Object obj = settingsCacheImpl$removeConfigs$1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = settingsCacheImpl$removeConfigs$1.label;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            k<SessionConfigs> kVar = this.sessionConfigsDataStore;
            SettingsCacheImpl$removeConfigs$2 settingsCacheImpl$removeConfigs$2 = new SettingsCacheImpl$removeConfigs$2(null);
            settingsCacheImpl$removeConfigs$1.label = 1;
            Object objA = kVar.a(settingsCacheImpl$removeConfigs$2, settingsCacheImpl$removeConfigs$1);
            return objA == aVar ? aVar : objA;
        } catch (IOException e4) {
            return new Integer(Log.w(FirebaseSessions.TAG, "Failed to remove config values: " + e4));
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Integer sessionRestartTimeout() {
        return getSessionConfigs().getSessionTimeoutSeconds();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Double sessionSamplingRate() {
        return getSessionConfigs().getSessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Boolean sessionsEnabled() {
        return getSessionConfigs().getSessionsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.firebase.sessions.settings.SettingsCache
    public Object updateConfigs(SessionConfigs sessionConfigs, d<? super Unit> dVar) {
        C39241 c39241;
        if (dVar instanceof C39241) {
            c39241 = (C39241) dVar;
            int i14 = c39241.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39241.label = i14 - Integer.MIN_VALUE;
            } else {
                c39241 = new C39241(dVar);
            }
        } else {
            c39241 = new C39241(dVar);
        }
        Object obj = c39241.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39241.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                k<SessionConfigs> kVar = this.sessionConfigsDataStore;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(sessionConfigs, null);
                c39241.label = 1;
                if (kVar.a(anonymousClass2, c39241) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (IOException e4) {
            e4.toString();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$set(AtomicReference atomicReference, SessionConfigs sessionConfigs, d dVar) {
            atomicReference.set(sessionConfigs);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SettingsCacheImpl.this.new AnonymousClass1(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                r53.i data = SettingsCacheImpl.this.sessionConfigsDataStore.getData();
                C11581 c11581 = new C11581(SettingsCacheImpl.this.sessionConfigsAtomicReference);
                this.label = 1;
                if (data.collect(c11581, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C11581 implements j, n {
            final /* synthetic */ AtomicReference<SessionConfigs> $tmp0;

            public C11581(AtomicReference<SessionConfigs> atomicReference) {
                this.$tmp0 = atomicReference;
            }

            public final Object emit(SessionConfigs sessionConfigs, d<? super Unit> dVar) {
                Object objInvokeSuspend$set = AnonymousClass1.invokeSuspend$set(this.$tmp0, sessionConfigs, dVar);
                return objInvokeSuspend$set == a.COROUTINE_SUSPENDED ? objInvokeSuspend$set : Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof j) && (obj instanceof n)) {
                    return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p005kotlin.jvm.internal.n
            public final o13.h<?> getFunctionDelegate() {
                return new p005kotlin.jvm.internal.a(2, this.$tmp0, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // r53.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((SessionConfigs) obj, (d<? super Unit>) dVar);
            }
        }
    }
}
