package com.huami.ai.speech.alexa.capability.recognizer;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.huami.ai.speech.alexa.directive.AlexaCommander;
import com.huami.ai.speech.alexa.entity.DirectiveContent;
import com.huami.ai.speech.alexa.entity.payload.ExpectSpeechPayload;
import com.huami.ai.speech.alexa.entity.payload.Payload;
import com.huami.ai.speech.api.Commander;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerCommander;", "Lcom/huami/ai/speech/api/Commander;", "Lcom/huami/ai/speech/alexa/entity/DirectiveContent;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "Lcom/huami/ai/speech/alexa/entity/payload/ExpectSpeechPayload;", "payload", "a", "(Lcom/huami/ai/speech/alexa/entity/payload/ExpectSpeechPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "direct", "(Lcom/huami/ai/speech/alexa/entity/DirectiveContent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirective;", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirective;", "directiveApi", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "b", "Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;", "eventApi", "Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "c", "Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;", "initiatorWrapper", "", "getType", "()Ljava/lang/String;", "type", "<init>", "(Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerDirective;Lcom/huami/ai/speech/alexa/capability/recognizer/SpeechRecognizerEvent;Lcom/huami/ai/speech/alexa/capability/recognizer/InitiatorWrapper;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechRecognizerCommander implements Commander<DirectiveContent<Payload>, Unit> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechRecognizerDirective directiveApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SpeechRecognizerEvent eventApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final InitiatorWrapper initiatorWrapper;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerCommander", f = "SpeechRecognizerCommander.kt", i = {}, l = {31}, m = "direct", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return SpeechRecognizerCommander.this.direct((DirectiveContent<Payload>) null, (Continuation<? super Unit>) this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerCommander", f = "SpeechRecognizerCommander.kt", i = {0}, l = {36}, m = "expectSpeech", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SpeechRecognizerCommander.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.capability.recognizer.SpeechRecognizerCommander$expectSpeech$result$1", f = "SpeechRecognizerCommander.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ ExpectSpeechPayload c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExpectSpeechPayload expectSpeechPayload, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = expectSpeechPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SpeechRecognizerCommander.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SpeechRecognizerCommander.this.initiatorWrapper.setInitiator(this.c.getInitiator());
                SpeechRecognizerDirective speechRecognizerDirective = SpeechRecognizerCommander.this.directiveApi;
                this.a = 1;
                if (speechRecognizerDirective.expectSpeech(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(true);
        }
    }

    public SpeechRecognizerCommander(@NotNull SpeechRecognizerDirective speechRecognizerDirective, @NotNull SpeechRecognizerEvent speechRecognizerEvent, @NotNull InitiatorWrapper initiatorWrapper) {
        this.directiveApi = speechRecognizerDirective;
        this.eventApi = speechRecognizerEvent;
        this.initiatorWrapper = initiatorWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ExpectSpeechPayload expectSpeechPayload, Continuation<? super Unit> continuation) {
        b bVar;
        SpeechRecognizerCommander speechRecognizerCommander;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeoutOrNull = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            long timeoutInMilliseconds = expectSpeechPayload.getTimeoutInMilliseconds();
            c cVar = new c(expectSpeechPayload, null);
            bVar.a = this;
            bVar.d = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(timeoutInMilliseconds, cVar, bVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            speechRecognizerCommander = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            speechRecognizerCommander = (SpeechRecognizerCommander) bVar.a;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        if (((Boolean) objWithTimeoutOrNull) == null) {
            speechRecognizerCommander.eventApi.expectSpeechTimedOut();
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.ai.speech.api.Commander
    @NotNull
    public String getType() {
        return AlexaCommander.SpeechRecognizer.getNamespace();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.ai.speech.api.Commander
    @Nullable
    public Object direct(@NotNull DirectiveContent<Payload> directiveContent, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String name = directiveContent.getHeader().getName();
            if (Intrinsics.areEqual(name, AVSAPIConstants.SpeechRecognizer.Directives.StopCapture.NAME)) {
                this.directiveApi.stopCapture();
            } else if (Intrinsics.areEqual(name, AVSAPIConstants.SpeechRecognizer.Directives.ExpectSpeech.NAME)) {
                ExpectSpeechPayload expectSpeechPayload = (ExpectSpeechPayload) directiveContent.getPayload();
                aVar.c = 1;
                if (a(expectSpeechPayload, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
