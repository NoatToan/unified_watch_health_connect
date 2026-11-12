package com.huami.moving.datacenter;

import androidx.collection.LongSparseArray;
import com.huami.mifit.sportlib.dbkit.SportDetailDbKit;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportRawDataTransformer;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.model.ParsedSportDetailData;
import com.huami.moving.datacenter.filter.GpsFilterConfig;
import com.huami.moving.datacenter.filter.GpsFilterHandler;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.xiaomi.hm.health.databases.model.Trackdata;

/* JADX INFO: loaded from: classes11.dex */
public class TrackDataManager {
    private static volatile TrackDataManager b;
    private LongSparseArray<ParsedSportDetailData> a = new LongSparseArray<>();

    private TrackDataManager() {
    }

    public static TrackDataManager getInstance() {
        if (b == null) {
            synchronized (TrackDataManager.class) {
                if (b == null) {
                    b = new TrackDataManager();
                }
            }
        }
        return b;
    }

    public void clearData() {
        this.a.clear();
        b = null;
    }

    public void genChildTrackData(long j, int i, int i2) {
        this.a.put(j, SportRawDataTransformer.INSTANCE.getInstance().parseDetailBulkData(j, i, i2));
    }

    public ParsedSportDetailData getChildBulkDataFromCacheById(long j, int i, int i2) {
        LongSparseArray<ParsedSportDetailData> longSparseArray = this.a;
        if (longSparseArray == null || longSparseArray.get(j) == null) {
            genChildTrackData(j, i, i2);
        }
        return this.a.get(j);
    }

    public ParsedSportDetailData getTrackData(long j, int i, int i2) {
        ParsedSportDetailData childBulkDataFromCacheById = SportTypeIdentifier.isSubSport(i2) ? getChildBulkDataFromCacheById(j, i, i2) : SportRawDataTransformer.INSTANCE.getInstance().parseDetailBulkDataUseCache(j, i, i2);
        if (GpsFilterConfig.INSTANCE.getEnable()) {
            GpsFilterHandler gpsFilterHandler = new GpsFilterHandler((Trackdata) DataFormatter.gson().fromJson(DataFormatter.gson().toJson(SportDetailDbKit.getInstance().getSportDetailData(new DataCondition(j, i, i2))), Trackdata.class));
            if (childBulkDataFromCacheById != null) {
                childBulkDataFromCacheById.parsePointLocationList(gpsFilterHandler.filter().getBulkll());
            }
        }
        return childBulkDataFromCacheById;
    }

    public void setFilterEnable(boolean z) {
        GpsFilterConfig.INSTANCE.setEnable(z);
    }

    public boolean tryDeleteParsedDetailDataFile(long j, int i, int i2) {
        return SportRawDataTransformer.INSTANCE.getInstance().tryDeleteParsedDetailDataFile(j, i, i2);
    }
}
