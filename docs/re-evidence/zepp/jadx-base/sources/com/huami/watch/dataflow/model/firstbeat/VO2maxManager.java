package com.huami.watch.dataflow.model.firstbeat;

import com.activeandroid.query.Select;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.huami.watch.dataflow.model.sport.BaseSportManager;
import com.huami.watch.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class VO2maxManager extends BaseSportManager<VO2maxDataItem> {
    private static VO2maxManager a;

    public static VO2maxManager getManager() {
        if (a == null) {
            a = new VO2maxManager();
        }
        return a;
    }

    public VO2maxDataItem get(String str) {
        VO2maxDataItem vO2maxDataItem = (VO2maxDataItem) new Select().from(itemClassType()).where("date=?", str).executeSingle();
        Log.d(tag(), "Get Vo2MaxDayInfo [" + str + "] : " + vO2maxDataItem, new Object[0]);
        return vO2maxDataItem;
    }

    public VO2maxDataItem getLatest() {
        VO2maxDataItem vO2maxDataItem = (VO2maxDataItem) new Select().from(itemClassType()).orderBy("date DESC").executeSingle();
        Log.d(tag(), "Get Latest Vo2MaxDayInfo : " + vO2maxDataItem, new Object[0]);
        return vO2maxDataItem;
    }

    public VO2maxDataItem getOldest(String str) {
        VO2maxDataItem vO2maxDataItem = (VO2maxDataItem) new Select().from(itemClassType()).where(str + ">=0").orderBy("date ASC").executeSingle();
        Log.d(tag(), "Get Oldest VO2maxDataItem : " + vO2maxDataItem, new Object[0]);
        return vO2maxDataItem;
    }

    public VO2maxDataItem getRangeMaxInfo(String str, String str2, String str3) {
        VO2maxDataItem vO2maxDataItem = (VO2maxDataItem) new Select().from(itemClassType()).where("date<=?", str2).and("date>=?", str).orderBy(str3 + " DESC").executeSingle();
        Log.d(tag(), "GetRangeMaxInfo : " + vO2maxDataItem, new Object[0]);
        return vO2maxDataItem;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public Class<VO2maxDataItem> itemClassType() {
        return VO2maxDataItem.class;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String tag() {
        return "Vo2MaxManager";
    }

    public List<VO2maxDataItem> get(String str, String str2) {
        List<VO2maxDataItem> listExecute = new Select().from(itemClassType()).where("date<=?", str2).and("date>=?", str).orderBy("date DESC").execute();
        String strTag = tag();
        StringBuilder sb = new StringBuilder();
        sb.append("startDate:");
        sb.append(str);
        sb.append(" endDate:");
        sb.append(str2);
        sb.append(">>size:");
        sb.append(listExecute == null ? 0 : listExecute.size());
        Log.d(strTag, sb.toString(), new Object[0]);
        return listExecute;
    }
}
