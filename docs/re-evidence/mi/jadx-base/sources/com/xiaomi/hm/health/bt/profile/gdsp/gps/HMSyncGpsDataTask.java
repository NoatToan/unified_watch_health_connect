package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import defpackage.f4s;
import defpackage.i7t;
import defpackage.jet;
import defpackage.qd;
import defpackage.t5t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HMSyncGpsDataTask extends i7t {
    private static final String TAG = "gps.HMSyncGpsDataTask";
    private SyncDataCallback<List<GpsRecord>> mCallback;
    private HMSyncGpsDataProfile mGpsDataProfile;
    private Calendar mStartTime;

    public HMSyncGpsDataTask(jet jetVar, qd qdVar, Calendar calendar, SyncDataCallback<List<GpsRecord>> syncDataCallback) {
        this.mGpsDataProfile = new HMSyncGpsDataProfile(jetVar, qdVar);
        this.mCallback = syncDataCallback;
        this.mStartTime = calendar;
    }

    @Override // defpackage.i7t
    public void doWork() {
        this.mCallback.onStart();
        int iA = 2;
        if (!this.mGpsDataProfile.init()) {
            t5t.m(TAG, "init gps data profile failed!!!");
            this.mCallback.onFinish(new HMDeviceError(2));
            return;
        }
        Calendar calendar = (Calendar) this.mStartTime.clone();
        ArrayList arrayList = new ArrayList();
        t5t.d(TAG, "gps startTime:" + calendar.getTime());
        while (true) {
            f4s summaryHeader = this.mGpsDataProfile.getSummaryHeader(calendar);
            t5t.d(TAG, "gps summary header:" + summaryHeader);
            if (summaryHeader == null) {
                break;
            }
            if (!summaryHeader.d()) {
                iA = summaryHeader.a();
                break;
            }
            if (summaryHeader.f17407b != 0) {
                GpsRecord gpsRecord = new GpsRecord();
                SportSummary sportSummaryFetchSummaryData = this.mGpsDataProfile.fetchSummaryData(summaryHeader.f17407b);
                if (sportSummaryFetchSummaryData != null) {
                    sportSummaryFetchSummaryData.setTimezone(ProfileUtils.getTimezoneKey(summaryHeader.f17406a.getTimeZone()));
                    long endTime = sportSummaryFetchSummaryData.getEndTime() - sportSummaryFetchSummaryData.getStartTime();
                    sportSummaryFetchSummaryData.setStartTime(summaryHeader.f17406a.getTimeInMillis());
                    sportSummaryFetchSummaryData.setEndTime(sportSummaryFetchSummaryData.getStartTime() + endTime);
                    t5t.d(TAG, "gps summary:" + sportSummaryFetchSummaryData);
                    gpsRecord.setSummary(sportSummaryFetchSummaryData);
                    f4s detailHeader = this.mGpsDataProfile.getDetailHeader(calendar);
                    t5t.d(TAG, "gps detail header:" + detailHeader);
                    if (detailHeader == null) {
                        break;
                    }
                    if (!detailHeader.d()) {
                        iA = detailHeader.a();
                        break;
                    }
                    int i = detailHeader.f17407b;
                    if (i != 0) {
                        SportDetail sportDetailFetchDetailData = this.mGpsDataProfile.fetchDetailData(sportSummaryFetchSummaryData, i);
                        if (sportDetailFetchDetailData == null) {
                            break;
                        }
                        t5t.d(TAG, "gps detail:" + sportDetailFetchDetailData.toSimpleString());
                        gpsRecord.setDetail(sportDetailFetchDetailData);
                        arrayList.add(gpsRecord);
                        calendar.setTimeInMillis(sportSummaryFetchSummaryData.getStartTime() + 1000);
                        t5t.d(TAG, "update gps startTime:" + calendar.getTime());
                    }
                } else {
                    break;
                }
            }
            iA = 0;
            break;
        }
        this.mCallback.onProgress(new Progress(100, 100));
        this.mGpsDataProfile.stopTransfer();
        this.mGpsDataProfile.deInit();
        this.mCallback.onData(arrayList);
        this.mCallback.onFinish(new HMDeviceError(iA));
    }
}
