package com.huami.ai.koin.common;

import com.facebook.share.internal.ShareConstants;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.ai.uitls.TrancateTextKt;
import com.huami.bluetooth.profile.channel.module.voice.command.ASRCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSTextCommand;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/koin/common/NewBleCaptionChannelImpl;", "Lcom/huami/ai/skill/CaptionChannel;", "", ShareConstants.FEED_CAPTION_PARAM, "", "showCaption", "text", "", "isFinal", "showQuerySpeechText", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/helper/VoiceConfigGot;", "b", "Lcom/huami/ai/helper/VoiceConfigGot;", "voiceConfigGot", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/helper/VoiceConfigGot;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleCaptionChannelImpl implements CaptionChannel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfigGot voiceConfigGot;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送TTS超时的错误的指令：" + this.a + ",因为收到的tts为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送TTS文本指令：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送ASR文本的指令：", this.a);
        }
    }

    public NewBleCaptionChannelImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceConfigGot voiceConfigGot) {
        this.baseDevice = hMBaseDevice;
        this.voiceConfigGot = voiceConfigGot;
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showCaption(@NotNull String caption) {
        if ((caption.length() == 0) || m.isBlank(caption)) {
            HMLog.info("speech", new a(DeviceUtilsKt.sendCommand$default(this.baseDevice, new ErrorCommand(9, "TTS empty"), null, 2, null)));
            return;
        }
        HMBaseDevice hMBaseDevice = this.baseDevice;
        String strTruncateSpeechChatCharacters = TrancateTextKt.truncateSpeechChatCharacters(caption, VoiceConfigFuncKt.maxTTSTextSize(this.voiceConfigGot.getVoiceConfig()));
        HMLog.info("speech", new b(strTruncateSpeechChatCharacters));
        Unit unit = Unit.INSTANCE;
        DeviceUtilsKt.sendCommand$default(hMBaseDevice, new TTSTextCommand(strTruncateSpeechChatCharacters), null, 2, null);
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showQuerySpeechText(@NotNull String text, boolean isFinal) {
        String strTruncateSpeechChatCharacters = TrancateTextKt.truncateSpeechChatCharacters(text, 50);
        if (isFinal) {
            HMLog.info("speech", new c(strTruncateSpeechChatCharacters));
        }
        DeviceUtilsKt.sendCommand$default(this.baseDevice, new ASRCommand(strTruncateSpeechChatCharacters, isFinal), null, 2, null);
    }
}
