package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.model.SportingConfig;

/* JADX INFO: loaded from: classes11.dex */
public interface ISportConfigDbCallback {
    void deleteSportConfigInDb(int... iArr);

    void insertOrReplaceConfigInDb(SportingConfig sportingConfig);

    SportingConfig querySportConfigByType(int i);
}
