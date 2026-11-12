package com.huami.ai.speech.xiaoai.capability.instruction;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.skill.CaptionChannel;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SpeechRecognizerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/SpeechRecognizer$RecognizeResult;", "payload", "", "a", "Lcom/xiaomi/ai/api/common/Instruction;", "", "instruction", "", "process", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "voiceCaptureNotify", "Lcom/huami/ai/skill/CaptionChannel;", "b", "Lcom/huami/ai/skill/CaptionChannel;", "captionChannel", "Lcom/huami/ai/notify/EngineExceptionNotify;", "c", "Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "<init>", "(Lcom/huami/ai/notify/VoiceCaptureNotify;Lcom/huami/ai/skill/CaptionChannel;Lcom/huami/ai/notify/EngineExceptionNotify;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechRecognizerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VoiceCaptureNotify voiceCaptureNotify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CaptionChannel captionChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EngineExceptionNotify engineExceptionNotify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "config not need asr";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Instruction<Object> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "full name: " + ((Object) this.a.getFullName()) + ", name: " + ((Object) this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.instruction.SpeechRecognizerInstruction$process$2", f = "SpeechRecognizerInstruction.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SpeechRecognizerInstruction.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceCaptureNotify voiceCaptureNotify = SpeechRecognizerInstruction.this.voiceCaptureNotify;
                this.a = 1;
                if (voiceCaptureNotify.expectCapture(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Instruction<Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Instruction<Object> instruction) {
            super(0);
            this.a = instruction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("processSpeechRecognizer: unhandled name:", this.a.getFullName());
        }
    }

    public SpeechRecognizerInstruction(@NotNull VoiceCaptureNotify voiceCaptureNotify, @NotNull CaptionChannel captionChannel, @NotNull EngineExceptionNotify engineExceptionNotify, @NotNull VoiceConfig voiceConfig) {
        this.voiceCaptureNotify = voiceCaptureNotify;
        this.captionChannel = captionChannel;
        this.engineExceptionNotify = engineExceptionNotify;
        this.voiceConfig = voiceConfig;
    }

    private final void a(SpeechRecognizer.RecognizeResult payload) {
        if (!VoiceConfigFuncKt.needASR(this.voiceConfig)) {
            HMLog.info("speech", a.a);
            return;
        }
        if (payload.getResults().size() == 0) {
            return;
        }
        String text = payload.getResults().get(0).getText();
        if (!(text == null || text.length() == 0)) {
            this.captionChannel.showQuerySpeechText(text, payload.isFinal());
        } else if (payload.isFinal()) {
            this.engineExceptionNotify.engineException(9);
        }
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<Object> instruction) throws InterruptedException {
        HMLog.info("speech", new b(instruction));
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != 1327948931) {
                if (iHashCode != 1631722339) {
                    if (iHashCode == 1963775772 && fullName.equals(AIApiConstants.SpeechRecognizer.StopCapture)) {
                        this.voiceCaptureNotify.stopCapture();
                        return true;
                    }
                } else if (fullName.equals(AIApiConstants.SpeechRecognizer.ExpectSpeech)) {
                    kotlinx.coroutines.d.b(null, new c(null), 1, null);
                    return true;
                }
            } else if (fullName.equals(AIApiConstants.SpeechRecognizer.RecognizeResult)) {
                Object payload = instruction.getPayload();
                Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.SpeechRecognizer.RecognizeResult");
                a((SpeechRecognizer.RecognizeResult) payload);
                return true;
            }
        }
        HMLog.error$default("speech", null, null, new d(instruction), 6, null);
        return false;
    }
}
