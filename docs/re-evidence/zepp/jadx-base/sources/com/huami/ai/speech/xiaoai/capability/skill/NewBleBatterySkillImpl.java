package com.huami.ai.speech.xiaoai.capability.skill;

import android.content.Context;
import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.BatterySkill;
import com.huami.ai.speech.xiaoai.R;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSTextCommand;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NewBleBatterySkillImpl;", "Lcom/huami/ai/skill/BatterySkill;", "", "value", "", "queryBatteryInfo", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ai/helper/SpeechDevice;", "b", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Landroid/content/Context;Lcom/huami/ai/helper/SpeechDevice;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleBatterySkillImpl implements BatterySkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    public NewBleBatterySkillImpl(@NotNull Context context, @NotNull SpeechDevice speechDevice) {
        this.context = context;
        this.baseDevice = speechDevice;
    }

    @Override // com.huami.ai.skill.BatterySkill
    public void queryBatteryInfo(int value) {
        SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new TTSTextCommand(Intrinsics.stringPlus("电量剩余：", this.context.getString(R.string.battery_level_mili_setting, String.valueOf(value)))), null, 2, null);
    }
}
