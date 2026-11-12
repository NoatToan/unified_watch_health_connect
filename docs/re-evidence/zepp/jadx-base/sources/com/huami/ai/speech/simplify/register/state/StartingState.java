package com.huami.ai.speech.simplify.register.state;

import com.huami.ai.speech.api.engine.Engine;
import com.huami.ai.speech.simplify.register.DeviceVoiceCallback;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelicateCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/simplify/register/state/StartingState;", "Lcom/huami/ai/speech/simplify/register/state/SpeechState;", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "config", "", "startSession", "", "byteArray", "onAudioData", "onStopSession", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "a", "Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;", "voiceCallback", "<init>", "(Lcom/huami/ai/speech/simplify/register/DeviceVoiceCallback;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
@DelicateCoroutinesApi
public final class StartingState implements SpeechState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceVoiceCallback voiceCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Starting state onAudioData";
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
        public final String invoke() {
            return "Starting state onStopSession";
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
        public final String invoke() {
            return "Starting state startSession";
        }
    }

    public StartingState(@NotNull DeviceVoiceCallback deviceVoiceCallback) {
        this.voiceCallback = deviceVoiceCallback;
    }

    @Override // com.huami.ai.speech.simplify.register.state.SpeechState
    public void onAudioData(@NotNull byte[] byteArray) {
        HMLog.info("speech", a.a);
        byte[] bArrDecodeBytes = this.voiceCallback.decodeBytes(byteArray);
        Engine engine = this.voiceCallback.getEngine();
        if (engine == null) {
            return;
        }
        engine.putData(bArrDecodeBytes, bArrDecodeBytes.length, 0);
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
