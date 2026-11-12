package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.db.po.MenstruationHistory;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationHistory;", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "toHistoryItemVo", "Lcom/huami/femalehealth/logiclib/db/po/Symptom;", "Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", "toSymptomVo", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "toMenstruationVo", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoKt {
    @NotNull
    public static final HistoryItemVo toHistoryItemVo(@NotNull MenstruationHistory menstruationHistory) {
        return new HistoryItemVo(menstruationHistory.getId(), menstruationHistory.getMenstrualPeriod().getTime(), menstruationHistory.getMenstrualEndTime().getTime(), menstruationHistory.getCycle(), menstruationHistory.getMonth().getTime(), menstruationHistory.getUserId(), menstruationHistory.isEnd());
    }

    @NotNull
    public static final MenstruationVo toMenstruationVo(@NotNull MenstruationRecord menstruationRecord) {
        String sId = menstruationRecord.getSId();
        Date date = menstruationRecord.getDate();
        Boolean isEnd = menstruationRecord.getIsEnd();
        boolean zBooleanValue = isEnd == null ? true : isEnd.booleanValue();
        boolean inPeriod = menstruationRecord.getInPeriod();
        Long l = menstruationRecord.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String();
        return new MenstruationVo(sId, date, zBooleanValue, inPeriod, l == null ? 0L : l.longValue());
    }

    @NotNull
    public static final SymptomVo toSymptomVo(@NotNull Symptom symptom) {
        return new SymptomVo(symptom.getDegree(), symptom.getType(), symptom.getDate().getTime());
    }
}
