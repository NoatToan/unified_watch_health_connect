package com.huami.ai.speech.alexa.capability.alerts;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.alexa.entity.payload.SetAlertPayload;
import com.huami.ai.speech.alexa.entity.payload.TokenPayload;
import com.huami.ai.speech.alexa.entity.payload.TokensPayload;
import com.huami.ai.speech.alexa.entity.payload.VolumePayload;
import com.huami.ai.speech.api.Commander;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/ai/speech/alexa/capability/alerts/AlertsCommander;", "Lcom/huami/ai/speech/api/Commander;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;", "payload", GoogleApiAvailabilityLight.a, "(Lcom/huami/ai/speech/alexa/entity/payload/SetAlertPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;", "b", "(Lcom/huami/ai/speech/alexa/entity/payload/TokenPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;", "c", "(Lcom/huami/ai/speech/alexa/entity/payload/TokensPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;", "e", "(Lcom/huami/ai/speech/alexa/entity/payload/VolumePayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "content", "direct", "(Lcom/huami/ai/speech/alexa/entity/DirectiveContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirective;", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirective;", "directiveApi", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsEvent;", "Lcom/huami/ai/speech/alexa/capability/alerts/AlertsEvent;", "eventApi", "", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/capability/alerts/AlertsDirective;Lcom/huami/ai/speech/alexa/capability/alerts/AlertsEvent;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AlertsCommander implements Commander<DirectiveContent<Payload>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlertsDirective directiveApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AlertsEvent eventApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertDirectName.values().length];
            iArr[AlertDirectName.SET_ALERT.ordinal()] = 1;
            iArr[AlertDirectName.DELETE_ALERT.ordinal()] = 2;
            iArr[AlertDirectName.DELETE_ALERTS.ordinal()] = 3;
            iArr[AlertDirectName.SET_VOLUME.ordinal()] = 4;
            iArr[AlertDirectName.ADJUST_VOLUME.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {0, 0}, l = {88}, m = "adjustVolume", n = {"this", "payload"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlertsCommander.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {0, 0, 0}, l = {60}, m = "deleteAlert", n = {"this", "payload", "$this$deleteAlert_u24lambda_u2d4"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AlertsCommander.this.b(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {0, 0, 0}, l = {72}, m = "deleteAlerts", n = {"this", "payload", "$this$deleteAlerts_u24lambda_u2d6"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AlertsCommander.this.c(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {}, l = {35, 36, 37, 38, 39}, m = "direct", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AlertsCommander.this.direct((DirectiveContent<Payload>) null, (Continuation<? super Unit>) this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Alert direct error:", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {0, 0, 0}, l = {48}, m = "setAlert", n = {"this", "payload", "$this$setAlert_u24lambda_u2d2"}, s = {"L$0", "L$1", "L$2"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AlertsCommander.this.d(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.alerts.AlertsCommander", f = "AlertsCommander.kt", i = {0, 0}, l = {83}, m = "setVolume", n = {"this", "payload"}, s = {"L$0", "L$1"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlertsCommander.this.e(null, this);
        }
    }

    public AlertsCommander(@NotNull AlertsDirective alertsDirective, @NotNull AlertsEvent alertsEvent) {
        this.directiveApi = alertsDirective;
        this.eventApi = alertsEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(VolumePayload volumePayload, Continuation<? super Unit> continuation) {
        a aVar;
        AlertsCommander alertsCommander;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AlertsDirective alertsDirective = this.directiveApi;
            aVar.a = this;
            aVar.b = volumePayload;
            aVar.e = 1;
            if (alertsDirective.setVolume(volumePayload, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            alertsCommander = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            volumePayload = (VolumePayload) aVar.b;
            alertsCommander = (AlertsCommander) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        alertsCommander.eventApi.volumeChanged(volumePayload.getVolume());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(TokenPayload tokenPayload, Continuation<? super Unit> continuation) {
        b bVar;
        AlertsCommander alertsCommander;
        TokenPayload tokenPayload2;
        Throwable th;
        AlertsCommander alertsCommander2;
        Object objM3845constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objDeleteAlert = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteAlert);
            try {
                Result.Companion companion = Result.Companion;
                AlertsDirective alertsDirective = this.directiveApi;
                bVar.a = this;
                bVar.b = tokenPayload;
                bVar.c = this;
                bVar.f = 1;
                objDeleteAlert = alertsDirective.deleteAlert(tokenPayload, bVar);
                if (objDeleteAlert == coroutine_suspended) {
                    return coroutine_suspended;
                }
                alertsCommander = this;
                tokenPayload2 = tokenPayload;
                alertsCommander2 = alertsCommander;
            } catch (Throwable th2) {
                alertsCommander = this;
                tokenPayload2 = tokenPayload;
                th = th2;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alertsCommander2 = (AlertsCommander) bVar.c;
            tokenPayload2 = (TokenPayload) bVar.b;
            alertsCommander = (AlertsCommander) bVar.a;
            try {
                ResultKt.throwOnFailure(objDeleteAlert);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        if (((Boolean) objDeleteAlert).booleanValue()) {
            alertsCommander2.eventApi.deleteAlertSucceeded(tokenPayload2.getToken());
        } else {
            alertsCommander2.eventApi.deleteAlertFailed(tokenPayload2.getToken());
        }
        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            alertsCommander.eventApi.deleteAlertFailed(tokenPayload2.getToken());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(TokensPayload tokensPayload, Continuation<? super Unit> continuation) {
        c cVar;
        AlertsCommander alertsCommander;
        TokensPayload tokensPayload2;
        Throwable th;
        AlertsCommander alertsCommander2;
        Object objM3845constructorimpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objDeleteAlerts = cVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteAlerts);
            try {
                Result.Companion companion = Result.Companion;
                AlertsDirective alertsDirective = this.directiveApi;
                cVar.a = this;
                cVar.b = tokensPayload;
                cVar.c = this;
                cVar.f = 1;
                objDeleteAlerts = alertsDirective.deleteAlerts(tokensPayload, cVar);
                if (objDeleteAlerts == coroutine_suspended) {
                    return coroutine_suspended;
                }
                alertsCommander = this;
                tokensPayload2 = tokensPayload;
                alertsCommander2 = alertsCommander;
            } catch (Throwable th2) {
                alertsCommander = this;
                tokensPayload2 = tokensPayload;
                th = th2;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alertsCommander2 = (AlertsCommander) cVar.c;
            tokensPayload2 = (TokensPayload) cVar.b;
            alertsCommander = (AlertsCommander) cVar.a;
            try {
                ResultKt.throwOnFailure(objDeleteAlerts);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        if (((Boolean) objDeleteAlerts).booleanValue()) {
            alertsCommander2.eventApi.deleteAlertsSucceeded(tokensPayload2.getToken());
        } else {
            alertsCommander2.eventApi.deleteAlertsFailed(tokensPayload2.getToken());
        }
        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            alertsCommander.eventApi.deleteAlertsFailed(tokensPayload2.getToken());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(SetAlertPayload setAlertPayload, Continuation<? super Unit> continuation) {
        f fVar;
        AlertsCommander alertsCommander;
        SetAlertPayload setAlertPayload2;
        Throwable th;
        AlertsCommander alertsCommander2;
        Object objM3845constructorimpl;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.f = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object alert = fVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = fVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(alert);
            try {
                Result.Companion companion = Result.Companion;
                AlertsDirective alertsDirective = this.directiveApi;
                fVar.a = this;
                fVar.b = setAlertPayload;
                fVar.c = this;
                fVar.f = 1;
                alert = alertsDirective.setAlert(setAlertPayload, fVar);
                if (alert == coroutine_suspended) {
                    return coroutine_suspended;
                }
                alertsCommander = this;
                setAlertPayload2 = setAlertPayload;
                alertsCommander2 = alertsCommander;
            } catch (Throwable th2) {
                alertsCommander = this;
                setAlertPayload2 = setAlertPayload;
                th = th2;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alertsCommander2 = (AlertsCommander) fVar.c;
            setAlertPayload2 = (SetAlertPayload) fVar.b;
            alertsCommander = (AlertsCommander) fVar.a;
            try {
                ResultKt.throwOnFailure(alert);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        if (((Boolean) alert).booleanValue()) {
            alertsCommander2.eventApi.setAlertSucceeded(setAlertPayload2.getToken());
        } else {
            alertsCommander2.eventApi.setAlertFailed(setAlertPayload2.getToken());
        }
        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            alertsCommander.eventApi.setAlertFailed(setAlertPayload2.getToken());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(VolumePayload volumePayload, Continuation<? super Unit> continuation) {
        g gVar;
        AlertsCommander alertsCommander;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i = gVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.e = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = gVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AlertsDirective alertsDirective = this.directiveApi;
            gVar.a = this;
            gVar.b = volumePayload;
            gVar.e = 1;
            if (alertsDirective.setVolume(volumePayload, gVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            alertsCommander = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            volumePayload = (VolumePayload) gVar.b;
            alertsCommander = (AlertsCommander) gVar.a;
            ResultKt.throwOnFailure(obj);
        }
        alertsCommander.eventApi.volumeChanged(volumePayload.getVolume());
        return Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.api.Commander
    @NotNull
    public String getType() {
        return AlexaCommander.Alerts.getNamespace();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.ai.speech.api.Commander
    @Nullable
    public Object direct(@NotNull DirectiveContent<Payload> directiveContent, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        Object objM3845constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (AlexaCommander.INSTANCE.from(directiveContent.getHeader().getNamespace()) != AlexaCommander.Alerts) {
                    return Unit.INSTANCE;
                }
                Result.Companion companion = Result.Companion;
                int i3 = WhenMappings.$EnumSwitchMapping$0[AlertDirectName.INSTANCE.fromName(directiveContent.getHeader().getName()).ordinal()];
                if (i3 == 1) {
                    SetAlertPayload setAlertPayload = (SetAlertPayload) directiveContent.getPayload();
                    dVar.c = 1;
                    if (d(setAlertPayload, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 2) {
                    TokenPayload tokenPayload = (TokenPayload) directiveContent.getPayload();
                    dVar.c = 2;
                    if (b(tokenPayload, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 3) {
                    TokensPayload tokensPayload = (TokensPayload) directiveContent.getPayload();
                    dVar.c = 3;
                    if (c(tokensPayload, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 4) {
                    VolumePayload volumePayload = (VolumePayload) directiveContent.getPayload();
                    dVar.c = 4;
                    if (e(volumePayload, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 5) {
                    VolumePayload volumePayload2 = (VolumePayload) directiveContent.getPayload();
                    dVar.c = 5;
                    if (a(volumePayload2, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("speech", null, new e(thM3848exceptionOrNullimpl), 2, null);
        }
        return Unit.INSTANCE;
    }
}
