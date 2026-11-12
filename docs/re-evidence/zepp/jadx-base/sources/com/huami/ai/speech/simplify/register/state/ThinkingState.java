package com.huami.ai.speech.simplify.register.state;

import com.huami.ai.notify.DialogState;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.simplify.register.DeviceVoiceCallback;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.DelicateCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/speech/simplify/register/state/ThinkingState;", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "", "startSession", "", "byteArray", "onAudioData", "onStopSession", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "a", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "voiceCallback", "Lcom/huami/ai/notify/DialogState;", "b", "Lkotlin/Lazy;", "()Lcom/huami/ai/notify/DialogState;", "dialogState", "<init>", "(Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class ThinkingState implements SpeechState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceVoiceCallback voiceCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Thinking state. Send audio data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Thinking state. onStopSession";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Thinking state. Do nothing";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThinkingState(@NotNull DeviceVoiceCallback deviceVoiceCallback) {
        this.voiceCallback = deviceVoiceCallback;
        Koin koin = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.dialogState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DialogState>() { // from class: com.huami.ai.speech.simplify.register.state.ThinkingState$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.notify.DialogState, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final DialogState getA() {
                return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(DialogState.class), qualifier, objArr);
            }
        });
    }

    private final DialogState a() {
        return (DialogState) this.dialogState.getValue();
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onAudioData(@NotNull byte[] byteArray) {
        DialogState dialogStateA = a();
        if (dialogStateA != null && dialogStateA.compareAndSet(0, 1)) {
            HMLog.info("speech", a.a);
            this.voiceCallback.setState(new InitState(this.voiceCallback));
            this.voiceCallback.getState().onAudioData(byteArray);
        }
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onStopSession() {
        HMLog.info("speech", b.a);
        this.voiceCallback.destroy();
        this.voiceCallback.setState(new IdleState(this.voiceCallback));
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void startSession(@NotNull VoiceConfig config) {
        HMLog.info("speech", c.a);
    }
}
