package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HMSyncGpsDataTask extends HMBaseTask {
    private static final String e = "HMSyncGpsDataTask";
    private HMSyncGpsDataProfile b;
    private SyncDataCallback<List<GpsRecord>> c;
    private Calendar d;

    public HMSyncGpsDataTask(ITransport transport, Calendar calendar, SyncDataCallback<List<GpsRecord>> callback) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = new HMSyncGpsDataProfile(transport);
        this.c = callback;
        this.d = calendar;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.c.onStart();
        int deviceError = 2;
        if (!this.b.init()) {
            Debug.i(e, "init gps data profile failed!!!");
            this.c.onFinish(new HMDeviceError(2));
            return;
        }
        Calendar calendar = (Calendar) this.d.clone();
        ArrayList arrayList = new ArrayList();
        Debug.fi(e, "gps startTime:" + calendar.getTime());
        while (true) {
            DataHeader summaryHeader = this.b.getSummaryHeader(calendar);
            Debug.fi(e, "gps summary header:" + summaryHeader);
            if (summaryHeader == null) {
                break;
            }
            if (!summaryHeader.isSuccessfully()) {
                deviceError = summaryHeader.getDeviceError();
                break;
            }
            if (summaryHeader.size != 0) {
                GpsRecord gpsRecord = new GpsRecord();
                SportSummary sportSummaryFetchSummaryData = this.b.fetchSummaryData(summaryHeader.size);
                if (sportSummaryFetchSummaryData != null) {
                    sportSummaryFetchSummaryData.setTimezone(ProfileUtils.getTimezoneKey(summaryHeader.calendar.getTimeZone()));
                    long endTime = sportSummaryFetchSummaryData.getEndTime() - sportSummaryFetchSummaryData.getStartTime();
                    sportSummaryFetchSummaryData.setStartTime(summaryHeader.calendar.getTimeInMillis());
                    sportSummaryFetchSummaryData.setEndTime(sportSummaryFetchSummaryData.getStartTime() + endTime);
                    Debug.fi(e, "gps summary:" + sportSummaryFetchSummaryData);
                    gpsRecord.setSummary(sportSummaryFetchSummaryData);
                    DataHeader detailHeader = this.b.getDetailHeader(calendar);
                    Debug.fi(e, "gps detail header:" + detailHeader);
                    if (detailHeader == null) {
                        break;
                    }
                    if (!detailHeader.isSuccessfully()) {
                        deviceError = detailHeader.getDeviceError();
                        break;
                    }
                    int i = detailHeader.size;
                    if (i != 0) {
                        SportDetail sportDetailFetchDetailData = this.b.fetchDetailData(sportSummaryFetchSummaryData, i);
                        if (sportDetailFetchDetailData == null) {
                            break;
                        }
                        Debug.fi(e, "gps detail:" + sportDetailFetchDetailData.toSimpleString());
                        gpsRecord.setDetail(sportDetailFetchDetailData);
                        arrayList.add(gpsRecord);
                        calendar.setTimeInMillis(sportSummaryFetchSummaryData.getEndTime());
                        Debug.fi(e, "update gps startTime:" + calendar.getTime());
                    }
                } else {
                    break;
                }
            }
            deviceError = 0;
            break;
        }
        this.c.onProgress(new Progress(100, 100));
        this.b.stopTransfer();
        this.b.deInit();
        this.c.onData(arrayList);
        this.c.onFinish(new HMDeviceError(deviceError));
    }
}
