package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.api.pojo.BaseSettingBean;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "Lcom/huami/femalehealth/logiclib/api/pojo/BaseSettingBean;", "toSettingBean", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class VoToBeanKt {
    @NotNull
    public static final BaseSettingBean toSettingBean(@NotNull SettingVo settingVo) {
        boolean appPush = settingVo.getAppPush();
        long appBeforeMenstruationPush = settingVo.getAppBeforeMenstruationPush();
        long appBeforeOvulationPush = settingVo.getAppBeforeOvulationPush();
        boolean hardwarePush = settingVo.getHardwarePush();
        return new BaseSettingBean(Long.valueOf(appBeforeMenstruationPush), Long.valueOf(appBeforeOvulationPush), Boolean.valueOf(appPush), Long.valueOf(settingVo.getEstimatedMenstrualDays()), (Long) null, Long.valueOf(settingVo.getHardwareBeforeMenstruationPush()), Long.valueOf(settingVo.getHardwareBeforeOvulationPush()), Boolean.valueOf(hardwarePush), (String) null, Long.valueOf(settingVo.getIntelligentPrediction() ? 1L : 0L), Long.valueOf(settingVo.getLastMenstrualTime()), Integer.valueOf(settingVo.getMenstrualCycle()), (String) null, 4368, (DefaultConstructorMarker) null);
    }
}
