package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportDetailData;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportDetailDbCallback {
    void deleteSportDetailDatas(DataCondition dataCondition);

    SportDetailData getSportDetailData(DataCondition dataCondition);

    void insertOrReplaceSportDetailData(SportDetailData sportDetailData);

    void updateSportDetailData(SportDetailData sportDetailData);
}
