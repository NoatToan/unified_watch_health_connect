package com.huami.watch.dataflow.model.sport;

import android.content.Context;
import com.activeandroid.query.Delete;
import com.activeandroid.query.From;
import com.activeandroid.query.Select;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import com.huami.watch.util.FilesUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.StorageUtil;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class SportDetailManager extends BaseSportManager<SportDetail> {
    private static final String[] a = {"Id", "trackid", "source", "synced"};
    private static SportDetailManager b;

    private List<String> b() {
        ArrayList arrayList = new ArrayList(24);
        arrayList.add("trackid");
        arrayList.add("source");
        arrayList.add(SportDetail.COLUMN_SEGMENT);
        arrayList.add("longitude_latitude");
        arrayList.add("gait");
        arrayList.add("altitude");
        arrayList.add("version");
        arrayList.add("accuracy");
        arrayList.add("time");
        arrayList.add("pause");
        arrayList.add("kilo_pace");
        arrayList.add("mile_pace");
        arrayList.add("synced");
        arrayList.add("distance");
        arrayList.add("air_pressure_altitude");
        arrayList.add("flag");
        arrayList.add(SportDetail.COLUMN_DELTA_TIME_ALTITUDE);
        arrayList.add("stroke_speed");
        arrayList.add("cadence");
        arrayList.add("lap");
        arrayList.add("pace");
        arrayList.add("speed");
        arrayList.add("heart_rate");
        arrayList.add(SportDetail.COLUMN_PERFORMANCE_STATUS);
        arrayList.add("weather_info");
        return arrayList;
    }

    private SportDetail c(SportDetail sportDetail, SportDetail sportDetail2) {
        Field[] declaredFields = sportDetail.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            try {
                declaredFields[i].setAccessible(true);
                Object obj = declaredFields[i].get(sportDetail);
                if (obj != null) {
                    declaredFields[i].set(sportDetail2, obj);
                }
                declaredFields[i].setAccessible(false);
            } catch (Exception unused) {
            }
        }
        return sportDetail2;
    }

    private SportDetail d(long j, String str, int i) {
        int i2 = i <= 0 ? 2 : i;
        List<String> listB = b();
        int size = listB.size();
        if (i2 >= size) {
            i2 = size;
        }
        int iCeil = (int) Math.ceil(((double) size) / ((double) i2));
        Log.d(tag(), "total number is " + i2 + ", perNumber is " + iCeil, new Object[0]);
        SportDetail sportDetail = new SportDetail();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * iCeil;
            int i5 = i4 + iCeil;
            int i6 = size - 1;
            if (i4 >= i6) {
                i4 = size;
            }
            if (i5 >= i6) {
                i5 = size;
            }
            ArrayList arrayList = new ArrayList(iCeil + 1);
            arrayList.add("Id");
            arrayList.addAll(listB.subList(i4, i5));
            Log.d(tag(), "startIndex is " + i4 + ", endIndex is " + i5, new Object[0]);
            From from = new Select((String[]) arrayList.toArray(new String[arrayList.size()])).from(itemClassType());
            from.where("trackid = ?", Long.valueOf(j));
            from.and("source = ?", str);
            SportDetail sportDetail2 = (SportDetail) from.executeSingle();
            if (sportDetail2 == null) {
                Log.d(tag(), "detail is null and reload", new Object[0]);
                return null;
            }
            c(sportDetail2, sportDetail);
            if (i4 >= i6) {
                break;
            }
        }
        return sportDetail;
    }

    public static SportDetailManager getManager() {
        if (b == null) {
            b = new SportDetailManager();
        }
        return b;
    }

    public boolean deleteRawData(Context context, long j, String str) {
        File sportDetailRawDataFile = StorageUtil.getSportDetailRawDataFile(context, j, str);
        Log.d(tag(), "Delete SportDetail RawData: " + j + ", Source: " + str + " <= " + sportDetailRawDataFile, new Object[0]);
        return FilesUtil.delete(sportDetailRawDataFile);
    }

    public void deleteRecord(long j, String str) {
        new Delete().from(itemClassType()).where("trackid=?", Long.valueOf(j)).and("source=?", str).execute();
        Log.w(tag(), "Delete SportDetail [" + j + ", " + str + "]", new Object[0]);
    }

    public SportDetail get(long j, String str) {
        SportDetail sportDetail = (SportDetail) new Select().from(itemClassType()).where("trackid=?", Long.valueOf(j)).and("source=?", str).executeSingle();
        if (sportDetail == null && isDetailExist(j, str)) {
            Log.d(tag(), "detail is too large", new Object[0]);
            SportDetail sportDetailD = d(j, str, 2);
            if (sportDetailD == null) {
                for (int i = 2; i < 5 && (sportDetailD = d(j, str, (int) Math.pow(2.0d, i))) == null; i++) {
                }
            }
            sportDetail = sportDetailD;
        }
        Log.d(tag(), "Get : " + sportDetail, new Object[0]);
        return sportDetail;
    }

    public String getRawData(Context context, long j, String str) {
        File sportDetailRawDataFile = StorageUtil.getSportDetailRawDataFile(context, j, str);
        Log.d(tag(), "Read SportDetail RawData: " + j + ", Source: " + str + " <= " + sportDetailRawDataFile, new Object[0]);
        return getRawData(j, str, sportDetailRawDataFile);
    }

    public SportDetail getSyncState(long j, String str) {
        SportDetail sportDetail = (SportDetail) new Select(a).from(itemClassType()).where("trackid=?", Long.valueOf(j)).and("source=?", str).executeSingle();
        Log.d(tag(), "Get SyncState <" + j + ", " + str + ">: " + itemToShortString(sportDetail), new Object[0]);
        return sportDetail;
    }

    public boolean isDetailExist(long j, String str) {
        boolean z = new Select().from(itemClassType()).where("trackid=?", Long.valueOf(j)).and("source=?", str).count() != 0;
        Log.d(tag(), "Detail is Exist :" + z, new Object[0]);
        return z;
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public Class<SportDetail> itemClassType() {
        return SportDetail.class;
    }

    public boolean saveRawData(Context context, long j, String str, String str2) {
        File sportDetailRawDataFile = StorageUtil.getSportDetailRawDataFile(context, j, str);
        Log.d(tag(), "Save SportDetail RawData: " + j + ", Source: " + str + " => " + sportDetailRawDataFile, new Object[0]);
        return saveRawData(j, str, str2, sportDetailRawDataFile);
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String tag() {
        return "DataFlow-SportDetailManager";
    }

    @Override // com.huami.watch.dataflow.model.sport.BaseSportManager
    public String itemToShortString(SportDetail sportDetail) {
        if (sportDetail == null) {
            return null;
        }
        return SearchCriteria.LT + sportDetail.getTrackid() + SearchCriteria.GT;
    }
}
