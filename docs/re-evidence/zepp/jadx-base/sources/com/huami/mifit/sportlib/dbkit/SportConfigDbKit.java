package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.model.SportingConfig;

/* JADX INFO: loaded from: classes11.dex */
public class SportConfigDbKit implements ISportConfigDbCallback {
    private static volatile SportConfigDbKit b;
    private ISportConfigDbCallback a;

    private SportConfigDbKit() {
    }

    public static SportConfigDbKit getInstance() {
        if (b == null) {
            synchronized (SportConfigDbKit.class) {
                if (b == null) {
                    b = new SportConfigDbKit();
                }
            }
        }
        return b;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public void deleteSportConfigInDb(int... iArr) {
        ISportConfigDbCallback iSportConfigDbCallback = this.a;
        if (iSportConfigDbCallback != null) {
            iSportConfigDbCallback.deleteSportConfigInDb(iArr);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public void insertOrReplaceConfigInDb(SportingConfig sportingConfig) {
        ISportConfigDbCallback iSportConfigDbCallback = this.a;
        if (iSportConfigDbCallback != null) {
            iSportConfigDbCallback.insertOrReplaceConfigInDb(sportingConfig);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback
    public SportingConfig querySportConfigByType(int i) {
        ISportConfigDbCallback iSportConfigDbCallback = this.a;
        if (iSportConfigDbCallback != null) {
            return iSportConfigDbCallback.querySportConfigByType(i);
        }
        return null;
    }

    public void setConfigDbClient(ISportConfigDbCallback iSportConfigDbCallback) {
        this.a = iSportConfigDbCallback;
    }
}
