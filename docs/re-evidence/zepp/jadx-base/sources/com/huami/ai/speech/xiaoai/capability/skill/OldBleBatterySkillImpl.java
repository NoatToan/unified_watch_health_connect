package com.huami.ai.speech.xiaoai.capability.skill;

import android.content.Context;
import com.huami.ai.helper.DeviceSpeechID;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.BatterySkill;
import com.huami.ai.speech.xiaoai.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.speech.ChatContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/OldBleBatterySkillImpl;", "Lcom/huami/ai/skill/BatterySkill;", "", "value", "", "queryBatteryInfo", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ai/helper/SpeechDevice;", "b", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/ai/helper/DeviceSpeechID;", "c", "Lcom/huami/ai/helper/DeviceSpeechID;", "deviceSpeechID", "<init>", "(Landroid/content/Context;Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/ai/helper/DeviceSpeechID;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class OldBleBatterySkillImpl implements BatterySkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceSpeechID deviceSpeechID;

    public OldBleBatterySkillImpl(@NotNull Context context, @NotNull SpeechDevice speechDevice, @NotNull DeviceSpeechID deviceSpeechID) {
        this.context = context;
        this.baseDevice = speechDevice;
        this.deviceSpeechID = deviceSpeechID;
    }

    @Override // com.huami.ai.skill.BatterySkill
    public void queryBatteryInfo(int value) {
        String strStringPlus = Intrinsics.stringPlus("电量剩余：", this.context.getString(R.string.battery_level_mili_setting, String.valueOf(value)));
        int id = this.deviceSpeechID.getId();
        SpeechType speechType = SpeechType.CHAT;
        ChatContent chatContent = new ChatContent();
        chatContent.setAnswer(strStringPlus);
        Unit unit = Unit.INSTANCE;
        this.baseDevice.sendSpeechInfoSync(new HMSpeechInfo(id, speechType, chatContent));
    }
}
