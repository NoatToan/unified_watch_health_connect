package com.huami.watch.dataflow.model.sport;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.gson.GsonBuilder;
import com.huami.watch.dataflow.model.DataItem;
import com.huami.watch.dataflow.model.sport.bean.SportStatistics;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.StorageUtil;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SportSummaryManager extends BaseSportManager<SportSummary> {
    public static final int MAX_KCAL = 30000;
    public static final int SPORT_CHILD_TYPE = 1000;
    public static final int SPORT_MIX_TYPE = 2000;
    private static final int a = 11;
    private static final int b = 17;
    private static final int c = 21;
    private static SportSummaryManager d;
    private static final String[] e = {"Id", "trackid", "synced"};
    private static final String[] f = {"Id", "trackid", "type", "end_time", "date", "run_time", "dis", "cal", "avg_heart_rate", "source", "version", "synced", "sport_mode", "climb_dis_descend", "strokes"};
    private static final String[] g = {"Id", "trackid", SportSummary.COLUMN_SOURCE_DATA};
    private static final String[] h = {"Id", "trackid", "source"};

    private SportSummary b(String str) {
        From from = new Select(e).from(itemClassType());
        if (!TextUtils.isEmpty(str)) {
            from.and("source = ?", str);
        }
        SportSummary sportSummary = (SportSummary) from.and("(type < ?", 1000).or("type > ?)", 2000).orderBy("trackid DESC").executeSingle();
        Log.d(tag(), "Get Latest SportSummary [" + str + "]: " + sportSummary, new Object[0]);
        return sportSummary;
    }

    private List<SportSummary.ChildItem> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                long jOptLong = jSONObject.optLong("trackid");
                if (jOptLong > ParserMinimalBase.MAX_INT_L) {
                    jOptLong /= 1000;
                }
                SportSummary.ChildItem childItem = new SportSummary.ChildItem();
                childItem.setTrackid(jOptLong);
                childItem.setType(jSONObject.optInt("type"));
                arrayList.add(childItem);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    private SportSummary d(Select select, long j, String str, int i) {
        From fromWhere = select.from(itemClassType()).where("trackid=?", Long.valueOf(j));
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[0] = str;
        return (SportSummary) fromWhere.and("source=?", objArr).and("type=?", Integer.valueOf(i)).executeSingle();
    }

    public static SportSummaryManager getManager() {
        if (d == null) {
            d = new SportSummaryManager();
        }
        return d;
    }

    public boolean deleteRawData(Context context, long j, String str) {
        File sportSummaryRawDataFile = StorageUtil.getSportSummaryRawDataFile(context, j, str);
        Log.d(tag(), "Delete SportSummary RawData: " + j + ", Source: " + str + " <= " + sportSummaryRawDataFile, new Object[0]);
        return FilesUtil.delete(sportSummaryRawDataFile);
    }

    public void deleteRecord(long j, String str, int i) {
        From fromWhere = new Delete().from(SportSummary.class).where("trackid=?", Long.valueOf(j));
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(str) ? "" : str;
        fromWhere.and("source=?", objArr).and("type=?", Integer.valueOf(i)).execute();
        Log.w(tag(), "Delete SportSummary [" + j + ", " + str + ", SportType: " + i + "]", new Object[0]);
    }

    public SportSummary get(long j, String str, int i) {
        String sourceData;
        String str2;
        SportSummary sportSummaryD = d(new Select(g), j, str, i);
        SportSummary sportSummary = null;
        if (sportSummaryD != null) {
            sourceData = sportSummaryD.getSourceData();
            Log.d(tag(), "Query SportSummary SourceData : " + sourceData, new Object[0]);
        } else {
            sourceData = null;
        }
        if (!TextUtils.isEmpty(sourceData)) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
            sportSummary = (SportSummary) gsonBuilder.create().fromJson(sourceData, SportSummary.class);
            sportSummary.setDate(DateDay.from(sportSummary.getTrackid() * 1000).str());
            sportSummary.setCal((int) new BigDecimal(sportSummary.getSourceCalorie()).setScale(0, 4).doubleValue());
            sportSummary.setDis((int) sportSummary.getSourceDistance());
            sportSummary.setAvgHr((int) sportSummary.getSourceAvgHR());
            sportSummary.setAvgFrequency((int) sportSummary.getSourceAvgFrequency());
            sportSummary.setChildList(c(sportSummary.getChildListData()));
        }
        String strTag = tag();
        StringBuilder sb = new StringBuilder();
        sb.append("Get SportSummary [");
        sb.append(j);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]: ");
        sb.append(sportSummary);
        if (sportSummary != null) {
            str2 = '\n' + sportSummary.toStringAll();
        } else {
            str2 = "";
        }
        sb.append(str2);
        Log.d(strTag, sb.toString(), new Object[0]);
        return sportSummary;
    }

    public List<SportSummary> getAll(long j, int i, int i2) {
        return getAll(0L, j, i, i2);
    }

    public List<SportSummary> getAllByTime(long j, long j2) {
        From from = new Select(f).from(itemClassType());
        from.where("(trackid >= ?", Long.valueOf(j)).and("trackid <= ?)", Long.valueOf(j2));
        return from.orderBy("trackid DESC").execute();
    }

    public List<SportSummary> getAllUnSynced() {
        From from = new Select(h).from(itemClassType());
        from.where("synced = ?", 3);
        from.and("(type < ?", 1000).or("type > ?)", 2000);
        List<SportSummary> listExecute = from.orderBy("trackid DESC").execute();
        Log.d(tag(), "Get All UnSynced SportSummary: , Size : " + listExecute.size() + itemsToShortString(listExecute), new Object[0]);
        return listExecute;
    }

    public SportSummary getLatest() {
        return b(null);
    }

    public SportSummary getLatestCloud() {
        SportSummary sportSummary = (SportSummary) new Select(e).from(itemClassType()).where("(type<?", 1000).or("type>?)", 2000).and("(synced=?", 3072).or("synced=?)", Integer.valueOf(DataItem.SYNCED_ALL)).orderBy("trackid DESC").executeSingle();
        Log.d(tag(), "Get Latest SportSummary Cloud: " + sportSummary, new Object[0]);
        return sportSummary;
    }

    public SportSummary getOldest(int i) {
        From from = new Select().from(itemClassType());
        if (i > 0) {
            from.where("type=?", Integer.valueOf(i));
        }
        SportSummary sportSummary = (SportSummary) from.orderBy("date ASC").executeSingle();
        Log.d(tag(), "Get Oldest SportSummary : " + sportSummary, new Object[0]);
        return sportSummary;
    }

    public String getRawData(Context context, long j, String str) {
        File sportSummaryRawDataFile = StorageUtil.getSportSummaryRawDataFile(context, j, str);
        Log.d(tag(), "Read SportSummary RawData: " + j + ", Source: " + str + " <= " + sportSummaryRawDataFile, new Object[0]);
        return getRawData(j, str, sportSummaryRawDataFile);
    }

    public SportStatistics getStat() {
        return getStat(-1, null, null);
    }

    public boolean has(long j, String str, int i) {
        boolean z = new Select().from(itemClassType()).where("trackid = ?", Long.valueOf(j)).and("source = ?", str).and("type = ?", Integer.valueOf(i)).count() > 0;
        Log.d(tag(), "Already has SportSummary : [" + j + ", " + str + ", " + i + "]", new Object[0]);
        return z;
    }

    public boolean hasDataByType(int i) {
        return new Select().from(itemClassType()).where("type=?", Integer.valueOf(i)).count() > 0;
    }

    public boolean isSwimUseYard() {
        SportSummary sportSummary = (SportSummary) new Select(g).from(itemClassType()).where("type=?", 14).or("type=?", 15).orderBy("trackid DESC").executeSingle();
        if (sportSummary == null || TextUtils.isEmpty(sportSummary.getSourceData())) {
            return false;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
        return ((SportSummary) gsonBuilder.create().fromJson(sportSummary.getSourceData(), SportSummary.class)).getUnit() == 1;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public Class<SportSummary> itemClassType() {
        return SportSummary.class;
    }

    public boolean saveRawData(Context context, long j, String str, String str2) {
        File sportSummaryRawDataFile = StorageUtil.getSportSummaryRawDataFile(context, j, str);
        Log.d(tag(), "Save SportSummary RawData: " + j + ", Source: " + str + " => " + sportSummaryRawDataFile, new Object[0]);
        return saveRawData(j, str, str2, sportSummaryRawDataFile);
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String tag() {
        return "DataFlow-SportSummaryManager";
    }

    public List<SportSummary> getAll(long j, long j2, int i, int i2) {
        From from = new Select(f).from(itemClassType());
        from.where("trackid < ?", Long.valueOf(j2)).and("trackid >= ?", Long.valueOf(j));
        if (i > 0) {
            from.and("type = ?", Integer.valueOf(i));
        } else {
            from.and("(type < ?", 1000).or("type > ?)", 2000);
        }
        List<SportSummary> listExecute = from.orderBy("trackid DESC").limit(i2).execute();
        Log.d(tag(), "Get All SportSummary : [From : " + TimeUtil.formatDateTime(j2 * 1000, "yyyy-MM-dd HH:mm:ss") + ", Type : " + i + ", Limit : :" + i2 + "], Size : " + listExecute.size() + itemsToShortString(listExecute), new Object[0]);
        return listExecute;
    }

    public SportStatistics getStat(int i) {
        return getStat(i, null, null);
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String itemToShortString(SportSummary sportSummary) {
        if (sportSummary == null) {
            return null;
        }
        return SearchCriteria.LT + sportSummary.getTrackid() + SearchCriteria.GT;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public SportStatistics getStat(int i, String str, String str2) throws Throwable {
        String str3;
        SportStatistics sportStatistics;
        Exception e2;
        Cursor cursorRawQuery;
        String str4 = "strokes";
        if (i == 11) {
            str4 = "climb_dis_descend";
        } else if (i != 17 && i != 21) {
            str4 = "dis";
        }
        String str5 = "SELECT SUM(" + str4 + "),SUM(CASE WHEN cal" + SearchCriteria.LE + "30000 THEN cal ELSE 0 END),SUM(run_time),COUNT(*) FROM sport_summary";
        if (i > 0) {
            str3 = str5 + " WHERE type = " + i;
        } else {
            str3 = str5 + " WHERE (type < 1000 OR type > 2000)";
        }
        if (DateDay.checkIsLegal(str)) {
            str3 = str3 + " AND date >= '" + str + "'";
        }
        if (DateDay.checkIsLegal(str2)) {
            str3 = str3 + " AND date <= '" + str2 + "'";
        }
        ?? r2 = 0;
        sportStatistics = null;
        SportStatistics sportStatistics2 = null;
        try {
            try {
                cursorRawQuery = ActiveAndroid.getDatabase().rawQuery(str3, null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0) {
                            cursorRawQuery.moveToNext();
                            int i2 = cursorRawQuery.getInt(0);
                            int i3 = cursorRawQuery.getInt(1);
                            int i4 = cursorRawQuery.getInt(2);
                            int i5 = cursorRawQuery.getInt(3);
                            sportStatistics = new SportStatistics();
                            try {
                                sportStatistics.setDis(i2);
                                sportStatistics.setCalorie(i3);
                                sportStatistics.setRuntime(i4);
                                sportStatistics.setCount(i5);
                                sportStatistics2 = sportStatistics;
                            } catch (Exception e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                sportStatistics2 = sportStatistics;
                            }
                        }
                    } catch (Exception e4) {
                        sportStatistics = null;
                        e2 = e4;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r2 = str3;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (Exception e5) {
            sportStatistics = null;
            e2 = e5;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        Log.d(tag(), "Get Stat : [Type : " + i + ", " + str + Constants.WAVE_SEPARATOR + str2 + "] : " + sportStatistics2, new Object[0]);
        return sportStatistics2;
    }
}
