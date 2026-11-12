package com.huami.mifit.sportlib.dbkit;

import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.SportRecord;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SportRecordDbKit implements ISportRecordDbCallback {
    private static volatile SportRecordDbKit b;
    private ISportRecordDbCallback a;

    private SportRecordDbKit() {
    }

    public static SportRecordDbKit getInstance() {
        if (b == null) {
            synchronized (SportRecordDbKit.class) {
                if (b == null) {
                    b = new SportRecordDbKit();
                }
            }
        }
        return b;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void deleteSportRecords(DataCondition dataCondition) {
        ISportRecordDbCallback iSportRecordDbCallback = this.a;
        if (iSportRecordDbCallback != null) {
            iSportRecordDbCallback.deleteSportRecords(dataCondition);
        }
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public List<SportRecord> getSportRecords(DataCondition dataCondition) {
        ISportRecordDbCallback iSportRecordDbCallback = this.a;
        if (iSportRecordDbCallback != null) {
            return iSportRecordDbCallback.getSportRecords(dataCondition);
        }
        return null;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void insertOrReplaceSportRecord(SportRecord sportRecord) {
        ISportRecordDbCallback iSportRecordDbCallback = this.a;
        if (iSportRecordDbCallback != null) {
            iSportRecordDbCallback.insertOrReplaceSportRecord(sportRecord);
        }
    }

    public void setRecordDbClient(ISportRecordDbCallback iSportRecordDbCallback) {
        this.a = iSportRecordDbCallback;
    }

    @Override // com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback
    public void updateSportRecord(SportRecord sportRecord) {
        ISportRecordDbCallback iSportRecordDbCallback = this.a;
        if (iSportRecordDbCallback != null) {
            iSportRecordDbCallback.updateSportRecord(sportRecord);
        }
    }
}
