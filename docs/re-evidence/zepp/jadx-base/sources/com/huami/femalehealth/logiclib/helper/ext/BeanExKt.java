package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "symptomType", "Lcom/huami/femalehealth/logiclib/db/po/Symptom;", "toSymptomPo", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "Lcom/huami/femalehealth/logiclib/vo/SettingVo;", "toSettingVo", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class BeanExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SymptomType.values().length];
            iArr[SymptomType.PAIN.ordinal()] = 1;
            iArr[SymptomType.BLOOD.ordinal()] = 2;
            iArr[SymptomType.MOOD.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SettingVo toSettingVo(@NotNull FirstUseInfoBean firstUseInfoBean) {
        Long appBeforeMenstruationPush = firstUseInfoBean.getAppBeforeMenstruationPush();
        int iLongValue = (int) (appBeforeMenstruationPush == null ? 0L : appBeforeMenstruationPush.longValue());
        Long appBeforeOvulationPush = firstUseInfoBean.getAppBeforeOvulationPush();
        int iLongValue2 = (int) (appBeforeOvulationPush == null ? 0L : appBeforeOvulationPush.longValue());
        Boolean appPush = firstUseInfoBean.getAppPush();
        boolean zBooleanValue = appPush == null ? true : appPush.booleanValue();
        Long estimatedMenstrualDays = firstUseInfoBean.getEstimatedMenstrualDays();
        int iLongValue3 = (int) (estimatedMenstrualDays == null ? 0L : estimatedMenstrualDays.longValue());
        Long firstTime = firstUseInfoBean.getFirstTime();
        boolean z = (firstTime == null ? 0L : firstTime.longValue()) == 0;
        Long hardwareBeforeMenstruationPush = firstUseInfoBean.getHardwareBeforeMenstruationPush();
        int iLongValue4 = (int) (hardwareBeforeMenstruationPush == null ? 0L : hardwareBeforeMenstruationPush.longValue());
        Long hardwareBeforeOvulationPush = firstUseInfoBean.getHardwareBeforeOvulationPush();
        int iLongValue5 = (int) (hardwareBeforeOvulationPush == null ? 0L : hardwareBeforeOvulationPush.longValue());
        Boolean hardwarePush = firstUseInfoBean.getHardwarePush();
        boolean zBooleanValue2 = hardwarePush == null ? true : hardwarePush.booleanValue();
        Long intelligentPrediction = firstUseInfoBean.getIntelligentPrediction();
        boolean z2 = (intelligentPrediction == null ? 0L : intelligentPrediction.longValue()) == 1;
        Long lastMenstrualTime = firstUseInfoBean.getLastMenstrualTime();
        long jLongValue = lastMenstrualTime == null ? 0L : lastMenstrualTime.longValue();
        Long menstrualCycle = firstUseInfoBean.getMenstrualCycle();
        return new SettingVo(iLongValue, iLongValue2, zBooleanValue, iLongValue3, z, iLongValue4, iLongValue5, zBooleanValue2, z2, jLongValue, (int) (menstrualCycle != null ? menstrualCycle.longValue() : 0L));
    }

    @NotNull
    public static final Symptom toSymptomPo(@NotNull HistoryDetailBean historyDetailBean, @NotNull SymptomType symptomType) {
        Integer pain;
        int i = WhenMappings.$EnumSwitchMapping$0[symptomType.ordinal()];
        if (i == 1) {
            pain = historyDetailBean.getPain();
        } else if (i == 2) {
            pain = historyDetailBean.getBlood();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pain = historyDetailBean.getMood();
        }
        return new Symptom(new Date(historyDetailBean.getMenstruationTime()), symptomType, Degree.INSTANCE.covertByWebBeanIntType(pain));
    }
}
