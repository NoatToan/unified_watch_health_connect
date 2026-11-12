package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportRecord;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportRecordDbCallback {
    void deleteSportRecords(DataCondition dataCondition);

    List<SportRecord> getSportRecords(DataCondition dataCondition);

    void insertOrReplaceSportRecord(SportRecord sportRecord);

    void updateSportRecord(SportRecord sportRecord);
}
