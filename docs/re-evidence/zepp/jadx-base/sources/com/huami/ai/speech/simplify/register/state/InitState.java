package com.huami.ai.speech.simplify.register.state;

import com.huami.ai.notify.DialogState;
import com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent;
import com.huami.ai.speech.api.KoinHelperKt;
import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.simplify.register.DeviceVoiceCallback;
import com.huami.ai.speech.simplify.utils.AudioSave;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import java.io.IOException;
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
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/simplify/register/state/InitState;", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "", "startSession", "", "byteArray", "onAudioData", "onStopSession", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "a", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "voiceCallback", "Lcom/huami/ai/notify/DialogState;", "b", "Lkotlin/Lazy;", "()Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "c", "()Lcom/huami/ai/speech/alexa/capability/synthesizer/SpeechSynthesizerEvent;", "speechSynthesizerEvent", "<init>", "(Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class InitState implements SpeechState, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceVoiceCallback voiceCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialogState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy speechSynthesizerEvent;

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
            return "Init state onAudioData";
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
            return "Init state onStopSession";
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
            return "Init state,Do nothing";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitState(@NotNull DeviceVoiceCallback deviceVoiceCallback) {
        this.voiceCallback = deviceVoiceCallback;
        Koin koin = KoinHelperKt.getKoin();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Scope rootScope = koin.getScopeRegistry().getRootScope();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.dialogState = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DialogState>() { // from class: com.huami.ai.speech.simplify.register.state.InitState$special$$inlined$injectOrNull$default$1
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
        Koin koin2 = KoinHelperKt.getKoin();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Scope rootScope2 = koin2.getScopeRegistry().getRootScope();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.speechSynthesizerEvent = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<SpeechSynthesizerEvent>() { // from class: com.huami.ai.speech.simplify.register.state.InitState$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.ai.speech.alexa.capability.synthesizer.SpeechSynthesizerEvent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke */
            public final SpeechSynthesizerEvent getA() {
                return rootScope2.getOrNull(Reflection.getOrCreateKotlinClass(SpeechSynthesizerEvent.class), objArr2, objArr3);
            }
        });
    }

    private final DialogState a() {
        return (DialogState) this.dialogState.getValue();
    }

    private final SpeechSynthesizerEvent b() {
        return (SpeechSynthesizerEvent) this.speechSynthesizerEvent.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onAudioData(@NotNull byte[] byteArray) throws IOException {
        HMLog.info("speech", a.a);
        SpeechSynthesizerEvent speechSynthesizerEventB = b();
        if (speechSynthesizerEventB != null) {
            speechSynthesizerEventB.speechFinished();
        }
        Engine engine = this.voiceCallback.getEngine();
        if (engine != null) {
            engine.start();
        }
        DialogState dialogStateA = a();
        if (dialogStateA != null) {
            dialogStateA.set(1);
        }
        AudioSave opusAudioSave = this.voiceCallback.getOpusAudioSave();
        if (opusAudioSave != null) {
            opusAudioSave.saveAudio(byteArray);
        }
        byte[] bArrDecodeBytes = this.voiceCallback.decodeBytes(byteArray);
        Engine engine2 = this.voiceCallback.getEngine();
        if (engine2 != null) {
            engine2.putData(bArrDecodeBytes, bArrDecodeBytes.length, 0);
        }
        AudioSave pcmAudioSave = this.voiceCallback.getPcmAudioSave();
        if (pcmAudioSave != null) {
            pcmAudioSave.saveAudio(bArrDecodeBytes);
        }
        DeviceVoiceCallback deviceVoiceCallback = this.voiceCallback;
        deviceVoiceCallback.setState(new ListeningState(deviceVoiceCallback));
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
