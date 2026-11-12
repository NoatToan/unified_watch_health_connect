package com.huami.ai.koin.common;

import com.facebook.share.internal.ShareConstants;
import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.skill.CaptionChannel;
import com.huami.ai.uitls.TrancateTextKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.ChatContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/koin/common/OldBelCaptionChannelImpl;", "Lcom/huami/ai/skill/CaptionChannel;", "", "text", "", "maxTextSize", "", "a", ShareConstants.FEED_CAPTION_PARAM, "showCaption", "", "isFinal", "showQuerySpeechText", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "b", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class OldBelCaptionChannelImpl implements CaptionChannel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    public OldBelCaptionChannelImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.baseDevice = hMBaseDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    private final void a(String text, int maxTextSize) {
        ChatContent chatContent = new ChatContent();
        chatContent.setAnswer(TrancateTextKt.truncateSpeechChatCharacters(text, maxTextSize));
        ((HMMiLiProDevice) this.baseDevice).sendSpeechInfoSync(new HMSpeechInfo(this.deviceSpeechID.getId(), SpeechType.CHAT, chatContent));
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showCaption(@NotNull String caption) {
        a(caption, 200);
    }

    @Override // com.huami.ai.skill.CaptionChannel
    public void showQuerySpeechText(@NotNull String text, boolean isFinal) {
        if (isFinal) {
            a(text, 50);
        }
    }
}
