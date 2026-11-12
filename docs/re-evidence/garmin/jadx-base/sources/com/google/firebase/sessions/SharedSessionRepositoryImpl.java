package com.google.firebase.sessions;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.mlkit.common.MlKitException;
import e23.p;
import e23.q;
import java.util.Map;
import java.util.Objects;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.j;
import r53.w;
import t13.g;
import u7.k;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0001\u0018\u00002\u00020\u0001:\u0001=BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\"\u0010*\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\"\u00105\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lu7/k;", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "Lcom/google/firebase/sessions/ProcessDataManager;", "processDataManager", "Lt13/g;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/SessionGenerator;Lcom/google/firebase/sessions/SessionFirelogPublisher;Lcom/google/firebase/sessions/TimeProvider;Lu7/k;Lcom/google/firebase/sessions/ProcessDataManager;Lt13/g;)V", "", "sessionId", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "notifySubscribers", "(Ljava/lang/String;Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;Lt13/d;)Ljava/lang/Object;", "sessionData", "", "isSessionExpired", "(Lcom/google/firebase/sessions/SessionData;)Z", "isColdStart", "isMyProcessStale", "appBackground", "()V", "appForeground", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "Lcom/google/firebase/sessions/SessionGenerator;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/TimeProvider;", "Lu7/k;", "Lcom/google/firebase/sessions/ProcessDataManager;", "Lt13/g;", "localSessionData", "Lcom/google/firebase/sessions/SessionData;", "getLocalSessionData$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SessionData;", "setLocalSessionData$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;)V", "value", "isInForeground", "Z", "()Z", "pendingForegroundCheck", "previousNotificationType", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;)V", "previousSessionId", "Ljava/lang/String;", "NotificationType", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedSessionRepositoryImpl implements SharedSessionRepository {
    private final g backgroundDispatcher;
    private boolean isInForeground;
    public SessionData localSessionData;
    private boolean pendingForegroundCheck;
    private NotificationType previousNotificationType;
    private String previousSessionId;
    private final ProcessDataManager processDataManager;
    private final k<SessionData> sessionDataStore;
    private final SessionFirelogPublisher sessionFirelogPublisher;
    private final SessionGenerator sessionGenerator;
    private final SessionsSettings sessionsSettings;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {96}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/google/firebase/sessions/SessionData;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
        public static final class C11551 extends i implements q<j<? super SessionData>, Throwable, t13.d<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11551(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, t13.d<? super C11551> dVar) {
                super(3, dVar);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // e23.q
            public final Object invoke(j<? super SessionData> jVar, Throwable th3, t13.d<? super Unit> dVar) {
                C11551 c11551 = new C11551(this.this$0, dVar);
                c11551.L$0 = jVar;
                c11551.L$1 = th3;
                return c11551.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    j jVar = (j) this.L$0;
                    Throwable th3 = (Throwable) this.L$1;
                    SessionData sessionData = new SessionData(this.this$0.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 4, (p005kotlin.jvm.internal.j) null);
                    th3.getMessage();
                    sessionData.getSessionDetails().getSessionId();
                    this.L$0 = null;
                    this.label = 1;
                    if (jVar.emit(sessionData, this) == aVar) {
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
        }

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SharedSessionRepositoryImpl.this.new AnonymousClass1(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                w wVar = new w(SharedSessionRepositoryImpl.this.sessionDataStore.getData(), new C11551(SharedSessionRepositoryImpl.this, null));
                final SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                j<? super Object> jVar = new j() { // from class: com.google.firebase.sessions.SharedSessionRepositoryImpl.1.2
                    public final Object emit(SessionData sessionData, t13.d<? super Unit> dVar) {
                        sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(sessionData);
                        if (sharedSessionRepositoryImpl.pendingForegroundCheck) {
                            sharedSessionRepositoryImpl.pendingForegroundCheck = false;
                            sharedSessionRepositoryImpl.appForeground();
                        }
                        Object objNotifySubscribers = sharedSessionRepositoryImpl.notifySubscribers(sessionData.getSessionDetails().getSessionId(), NotificationType.GENERAL, dVar);
                        return objNotifySubscribers == u13.a.COROUTINE_SUSPENDED ? objNotifySubscribers : Unit.INSTANCE;
                    }

                    @Override // r53.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                        return emit((SessionData) obj2, (t13.d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (wVar.collect(jVar, this) == aVar) {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/SharedSessionRepositoryImpl$NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "FALLBACK", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum NotificationType {
        GENERAL,
        FALLBACK;

        private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());

        public static w13.a<NotificationType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {118}, m = "invokeSuspend")
    public static final class C39211 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "sessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class C11561 extends i implements p<SessionData, t13.d<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11561(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, t13.d<? super C11561> dVar) {
                super(2, dVar);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C11561 c11561 = new C11561(this.this$0, dVar);
                c11561.L$0 = obj;
                return c11561;
            }

            @Override // e23.p
            public final Object invoke(SessionData sessionData, t13.d<? super SessionData> dVar) {
                return ((C11561) create(sessionData, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    r.b(obj);
                    return SessionData.copy$default((SessionData) this.L$0, null, this.this$0.timeProvider.currentTime(), null, 5, null);
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        public C39211(t13.d<? super C39211> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SharedSessionRepositoryImpl.this.new C39211(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39211) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    k kVar = SharedSessionRepositoryImpl.this.sessionDataStore;
                    C11561 c11561 = new C11561(SharedSessionRepositoryImpl.this, null);
                    this.label = 1;
                    if (kVar.a(c11561, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                e4.getMessage();
                SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                sharedSessionRepositoryImpl.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(sharedSessionRepositoryImpl.getLocalSessionData$com_google_firebase_firebase_sessions(), null, SharedSessionRepositoryImpl.this.timeProvider.currentTime(), null, 5, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {142, 193}, m = "invokeSuspend")
    public static final class C39221 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ SessionData $sessionData;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/SessionData;", "currentSessionData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        public static final class C11571 extends i implements p<SessionData, t13.d<? super SessionData>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SharedSessionRepositoryImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11571(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, t13.d<? super C11571> dVar) {
                super(2, dVar);
                this.this$0 = sharedSessionRepositoryImpl;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C11571 c11571 = new C11571(this.this$0, dVar);
                c11571.L$0 = obj;
                return c11571;
            }

            @Override // e23.p
            public final Object invoke(SessionData sessionData, t13.d<? super SessionData> dVar) {
                return ((C11571) create(sessionData, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapUpdateProcessDataMap;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                SessionData sessionData = (SessionData) this.L$0;
                boolean zIsSessionExpired = this.this$0.isSessionExpired(sessionData);
                boolean zIsColdStart = this.this$0.isColdStart(sessionData);
                boolean zIsMyProcessStale = this.this$0.isMyProcessStale(sessionData);
                if (zIsColdStart) {
                    mapUpdateProcessDataMap = this.this$0.processDataManager.generateProcessDataMap();
                } else {
                    mapUpdateProcessDataMap = zIsMyProcessStale ? this.this$0.processDataManager.updateProcessDataMap(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                }
                SessionDetails sessionDetails = zIsColdStart ? null : sessionData.getSessionDetails();
                if (!zIsSessionExpired && !zIsColdStart) {
                    return zIsMyProcessStale ? SessionData.copy$default(sessionData, null, null, this.this$0.processDataManager.updateProcessDataMap(mapUpdateProcessDataMap), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsGenerateNewSession = this.this$0.sessionGenerator.generateNewSession(sessionDetails);
                this.this$0.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                this.this$0.processDataManager.onSessionGenerated();
                return sessionData.copy(sessionDetailsGenerateNewSession, null, mapUpdateProcessDataMap);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39221(SessionData sessionData, t13.d<? super C39221> dVar) {
            super(2, dVar);
            this.$sessionData = sessionData;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SharedSessionRepositoryImpl.this.new C39221(this.$sessionData, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39221) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r10.a(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        
            if (r10.notifySubscribers(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
        
            return r1;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                k kVar = SharedSessionRepositoryImpl.this.sessionDataStore;
                C11571 c11571 = new C11571(SharedSessionRepositoryImpl.this, null);
                this.label = 1;
            } catch (Exception e4) {
                e4.getMessage();
                if (SharedSessionRepositoryImpl.this.isSessionExpired(this.$sessionData)) {
                    SessionDetails sessionDetailsGenerateNewSession = SharedSessionRepositoryImpl.this.sessionGenerator.generateNewSession(this.$sessionData.getSessionDetails());
                    SharedSessionRepositoryImpl.this.setLocalSessionData$com_google_firebase_firebase_sessions(SessionData.copy$default(this.$sessionData, sessionDetailsGenerateNewSession, null, null, 4, null));
                    SharedSessionRepositoryImpl.this.sessionFirelogPublisher.mayLogSession(sessionDetailsGenerateNewSession);
                    SharedSessionRepositoryImpl sharedSessionRepositoryImpl = SharedSessionRepositoryImpl.this;
                    String sessionId = sessionDetailsGenerateNewSession.getSessionId();
                    NotificationType notificationType = NotificationType.FALLBACK;
                    this.label = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$notifySubscribers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "notifySubscribers")
    public static final class C39231 extends v13.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39231(t13.d<? super C39231> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSessionRepositoryImpl.this.notifySubscribers(null, null, this);
        }
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, k<SessionData> kVar, ProcessDataManager processDataManager, @Background g gVar) {
        sessionsSettings.getClass();
        sessionGenerator.getClass();
        sessionFirelogPublisher.getClass();
        timeProvider.getClass();
        kVar.getClass();
        processDataManager.getClass();
        gVar.getClass();
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = kVar;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = gVar;
        this.previousNotificationType = NotificationType.GENERAL;
        this.previousSessionId = "";
        ge1.b.T(c0.a(gVar), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isColdStart(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        if (processDataMap != null) {
            return this.processDataManager.isColdStart(processDataMap);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProcessStale(SessionData sessionData) {
        Map<String, ProcessData> processDataMap = sessionData.getProcessDataMap();
        ProcessDataManager processDataManager = this.processDataManager;
        if (processDataMap == null) {
            processDataManager.getMyProcessName();
            return true;
        }
        boolean zIsMyProcessStale = processDataManager.isMyProcessStale(processDataMap);
        if (zIsMyProcessStale) {
            this.processDataManager.getMyProcessName();
        }
        return zIsMyProcessStale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSessionExpired(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            sessionData.getSessionDetails().getSessionId();
            return false;
        }
        boolean z14 = e53.c.d(this.timeProvider.currentTime().m100minus5sfh64U(backgroundTime), this.sessionsSettings.m104getSessionRestartTimeoutUwyO8pc()) > 0;
        if (z14) {
            sessionData.getSessionDetails().getSessionId();
        }
        return z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object notifySubscribers(String str, NotificationType notificationType, t13.d<? super Unit> dVar) {
        C39231 c39231;
        if (dVar instanceof C39231) {
            c39231 = (C39231) dVar;
            int i14 = c39231.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39231.label = i14 - Integer.MIN_VALUE;
            } else {
                c39231 = new C39231(dVar);
            }
        } else {
            c39231 = new C39231(dVar);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = c39231.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c39231.label;
        if (i15 == 0) {
            r.b(registeredSubscribers$com_google_firebase_firebase_sessions);
            this.previousNotificationType = notificationType;
            if (s.g(this.previousSessionId, str)) {
                return Unit.INSTANCE;
            }
            this.previousSessionId = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            c39231.L$0 = str;
            c39231.L$1 = notificationType;
            c39231.label = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(c39231);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            notificationType = (NotificationType) c39231.L$1;
            str = (String) c39231.L$0;
            r.b(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (SessionSubscriber sessionSubscriber : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            int i16 = WhenMappings.$EnumSwitchMapping$0[notificationType.ordinal()];
            if (i16 == 1) {
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            } else {
                if (i16 != 2) {
                    u0.r();
                    return null;
                }
                Objects.toString(sessionSubscriber.getSessionSubscriberName());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appBackground() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            return;
        }
        this.processDataManager.getMyProcessName();
        ge1.b.T(c0.a(this.backgroundDispatcher), null, null, new C39211(null), 3);
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    public void appForeground() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            this.pendingForegroundCheck = true;
            return;
        }
        SessionData localSessionData$com_google_firebase_firebase_sessions = getLocalSessionData$com_google_firebase_firebase_sessions();
        this.processDataManager.getMyProcessName();
        if (isSessionExpired(localSessionData$com_google_firebase_firebase_sessions) || isMyProcessStale(localSessionData$com_google_firebase_firebase_sessions)) {
            ge1.b.T(c0.a(this.backgroundDispatcher), null, null, new C39221(localSessionData$com_google_firebase_firebase_sessions, null), 3);
        }
    }

    public final SessionData getLocalSessionData$com_google_firebase_firebase_sessions() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        s.m("localSessionData");
        throw null;
    }

    /* JADX INFO: renamed from: getPreviousNotificationType$com_google_firebase_firebase_sessions, reason: from getter */
    public final NotificationType getPreviousNotificationType() {
        return this.previousNotificationType;
    }

    @Override // com.google.firebase.sessions.SharedSessionRepository
    /* JADX INFO: renamed from: isInForeground, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final void setLocalSessionData$com_google_firebase_firebase_sessions(SessionData sessionData) {
        sessionData.getClass();
        this.localSessionData = sessionData;
    }

    public final void setPreviousNotificationType$com_google_firebase_firebase_sessions(NotificationType notificationType) {
        notificationType.getClass();
        this.previousNotificationType = notificationType;
    }
}
