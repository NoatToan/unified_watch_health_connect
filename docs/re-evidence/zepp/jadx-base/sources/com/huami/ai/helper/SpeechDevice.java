package com.huami.ai.helper;

import com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&J\b\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/helper/SpeechDevice;", "", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "command", "Lkotlin/Function1;", "", "", "result", "", "sendCommand", "batteryInfo", "Lcom/xiaomi/hm/health/bt/profile/speech/HMSpeechInfo;", "speechInfo", "sendSpeechInfoSync", "", "getFirmwareVersion", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public interface SpeechDevice {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean sendCommand$default(SpeechDevice speechDevice, VoiceCommand voiceCommand, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommand");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return speechDevice.sendCommand(voiceCommand, function1);
        }
    }

    int batteryInfo();

    @Nullable
    String getFirmwareVersion();

    boolean sendCommand(@NotNull VoiceCommand command, @Nullable Function1<? super Integer, Unit> result);

    boolean sendSpeechInfoSync(@NotNull HMSpeechInfo speechInfo);
}
