package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.db.po.MenstruationWithSymptoms;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "toMenstruationDto", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class PoExKt {
    @NotNull
    public static final MenstruationDto toMenstruationDto(@NotNull MenstruationRecord menstruationRecord) {
        MenstruationDto menstruationDto = new MenstruationDto(menstruationRecord.getDate().getTime(), menstruationRecord.getInPeriod(), menstruationRecord.getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String());
        menstruationDto.setEnd(menstruationRecord.getIsEnd());
        menstruationDto.setSId(menstruationRecord.getSId());
        menstruationDto.setSyncServer(Boolean.valueOf(menstruationRecord.getIsSyncServer()));
        return menstruationDto;
    }

    @NotNull
    public static final MenstruationDto toMenstruationDto(@NotNull MenstruationWithSymptoms menstruationWithSymptoms) {
        MenstruationDto menstruationDto = new MenstruationDto(menstruationWithSymptoms.getRecord().getDate().getTime(), menstruationWithSymptoms.getRecord().getInPeriod(), menstruationWithSymptoms.getRecord().getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String());
        menstruationDto.setEnd(menstruationWithSymptoms.getRecord().getIsEnd());
        menstruationDto.setSId(menstruationWithSymptoms.getRecord().getSId());
        menstruationDto.setSyncServer(Boolean.valueOf(menstruationWithSymptoms.getRecord().getIsSyncServer()));
        return menstruationDto;
    }
}
