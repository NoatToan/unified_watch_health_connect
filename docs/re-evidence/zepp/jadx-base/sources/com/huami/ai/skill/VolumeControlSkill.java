package com.huami.ai.skill;

import com.huami.ai.helper.DeviceVoiceType;
import com.huami.ai.helper.UnitType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/skill/VolumeControlSkill;", "", "Lcom/huami/ai/helper/DeviceVoiceType;", "voiceType", "", "value", "Lcom/huami/ai/helper/UnitType;", "unitType", "", "setVolume", "valueDelta", "adjustVolume", "isMute", "mute", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public interface VolumeControlSkill {
    boolean adjustVolume(@NotNull DeviceVoiceType voiceType, int valueDelta, @NotNull UnitType unitType);

    boolean mute(boolean isMute);

    boolean setVolume(@NotNull DeviceVoiceType voiceType, int value, @NotNull UnitType unitType);
}
