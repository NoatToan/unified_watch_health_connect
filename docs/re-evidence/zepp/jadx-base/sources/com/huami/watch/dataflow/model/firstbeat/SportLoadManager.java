package com.huami.watch.dataflow.model.firstbeat;

import com.activeandroid.query.Select;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.sport.BaseSportManager;
import com.huami.watch.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SportLoadManager extends BaseSportManager<SportLoadDataItem> {
    private static SportLoadManager a;

    public static SportLoadManager getManager() {
        if (a == null) {
            a = new SportLoadManager();
        }
        return a;
    }

    public SportLoadDataItem get(String str) {
        SportLoadDataItem sportLoadDataItem = (SportLoadDataItem) new Select().from(itemClassType()).where("date=?", str).executeSingle();
        Log.d(tag(), "Get SportsLoadDayInfo : " + sportLoadDataItem, new Object[0]);
        return sportLoadDataItem;
    }

    public SportLoadDataItem getLatest() {
        SportLoadDataItem sportLoadDataItem = (SportLoadDataItem) new Select().from(itemClassType()).orderBy("date DESC").executeSingle();
        Log.d(tag(), "Get Latest SportsLoadDayInfo : " + sportLoadDataItem, new Object[0]);
        return sportLoadDataItem;
    }

    public SportLoadDataItem getOldest() {
        SportLoadDataItem sportLoadDataItem = (SportLoadDataItem) new Select().from(itemClassType()).orderBy("date ASC").executeSingle();
        Log.d(tag(), "Get Oldest SportsLoadDayInfo : " + sportLoadDataItem, new Object[0]);
        return sportLoadDataItem;
    }

    public int getSportLoadMaxValue(String str, String str2) {
        SportLoadDataItem sportLoadDataItem;
        int dailyTL;
        List listExecute = new Select().from(itemClassType()).where("date<=?", str2).and("date>=?", str).orderBy("dailyTL DESC").execute();
        if (listExecute == null || listExecute.size() <= 0 || (sportLoadDataItem = (SportLoadDataItem) listExecute.get(0)) == null || (dailyTL = sportLoadDataItem.getDailyTL() / 65535) > 5000) {
            return 5000;
        }
        return dailyTL;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public Class<SportLoadDataItem> itemClassType() {
        return SportLoadDataItem.class;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String tag() {
        return "SportsLoadManager";
    }

    public List<SportLoadDataItem> get(String str, String str2) {
        List<SportLoadDataItem> listExecute = new Select().from(itemClassType()).where("date<=?", str2).and("date>=?", str).orderBy("date DESC").execute();
        Log.d(tag(), "startDate:" + str + " endDate:" + str2 + ">>" + itemsToShortString(listExecute), new Object[0]);
        return listExecute;
    }
}
