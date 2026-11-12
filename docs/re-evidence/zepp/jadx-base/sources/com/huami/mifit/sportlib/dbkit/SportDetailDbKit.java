package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportDetailData;

/* JADX INFO: loaded from: classes11.dex */
public class SportDetailDbKit implements ISportDetailDbCallback {
    private static volatile SportDetailDbKit b;
    public ISportDetailDbCallback a;

    private SportDetailDbKit() {
    }

    public static SportDetailDbKit getInstance() {
        if (b == null) {
            synchronized (SportDetailDbKit.class) {
                if (b == null) {
                    b = new SportDetailDbKit();
                }
            }
        }
        return b;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void deleteSportDetailDatas(DataCondition dataCondition) {
        ISportDetailDbCallback iSportDetailDbCallback = this.a;
        if (iSportDetailDbCallback != null) {
            iSportDetailDbCallback.deleteSportDetailDatas(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public SportDetailData getSportDetailData(DataCondition dataCondition) {
        ISportDetailDbCallback iSportDetailDbCallback = this.a;
        if (iSportDetailDbCallback != null) {
            return iSportDetailDbCallback.getSportDetailData(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void insertOrReplaceSportDetailData(SportDetailData sportDetailData) {
        ISportDetailDbCallback iSportDetailDbCallback = this.a;
        if (iSportDetailDbCallback != null) {
            iSportDetailDbCallback.insertOrReplaceSportDetailData(sportDetailData);
        }
    }

    public void setDetailDbClient(ISportDetailDbCallback iSportDetailDbCallback) {
        this.a = iSportDetailDbCallback;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback
    public void updateSportDetailData(SportDetailData sportDetailData) {
        ISportDetailDbCallback iSportDetailDbCallback = this.a;
        if (iSportDetailDbCallback != null) {
            iSportDetailDbCallback.updateSportDetailData(sportDetailData);
        }
    }
}
