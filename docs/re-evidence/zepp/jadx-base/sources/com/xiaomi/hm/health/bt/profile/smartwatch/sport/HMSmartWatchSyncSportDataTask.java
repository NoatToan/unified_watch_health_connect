package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchSyncSportDataTask extends HMBaseTask {
    private static final String e = "SmartWatch-SyncSportDataTask";
    private HMSmartWatchSyncSportDataProfile b;
    private IHMSportDataCallback c;
    private Calendar d;

    public HMSmartWatchSyncSportDataTask(GattPeripheral gattPeripheral, Calendar calendar, IHMSportDataCallback callback) {
        this.b = new HMSmartWatchSyncSportDataProfile(gattPeripheral);
        this.c = callback;
        this.d = calendar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x013a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0140  */
    /* JADX WARN: Code duplicated, block: B:35:0x0157  */
    /* JADX WARN: Code duplicated, block: B:37:0x015b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0164  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a8  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0140, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x0164, please report this as an issue */
    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        DataHeader detailHRHeader;
        int i;
        BleSportDetailHR bleSportDetailHRFetchDetailHRData;
        this.c.onStart();
        boolean z = false;
        if (!this.b.init()) {
            Log.w(e, "Init SportData Profile Fail!!", new Object[0]);
            this.c.onFinish(false);
            return;
        }
        Calendar calendar = (Calendar) this.d.clone();
        Log.d(e, "Sync SportData StartTime: " + calendar.getTime(), new Object[0]);
        boolean zSendLastSyncTime = this.b.sendLastSyncTime(calendar);
        ArrayList arrayList = new ArrayList();
        if (zSendLastSyncTime) {
            Log.i(e, "Start Sync Sport Summary...", new Object[0]);
            DataHeader summaryHeader = this.b.getSummaryHeader(calendar);
            Log.d(e, "Summary Header: " + summaryHeader, new Object[0]);
            if (summaryHeader != null) {
                if (summaryHeader.size == 0) {
                    z = zSendLastSyncTime;
                } else {
                    BleSportData bleSportData = new BleSportData();
                    BleSportSummary bleSportSummaryFetchSummaryData = this.b.fetchSummaryData(summaryHeader.size);
                    if (bleSportSummaryFetchSummaryData != null) {
                        Log.d(e, "Summary: " + bleSportSummaryFetchSummaryData, new Object[0]);
                        bleSportData.summary = bleSportSummaryFetchSummaryData;
                        Log.i(e, "Start Sync Sport Detail <GPS>...", new Object[0]);
                        DataHeader detailGpsHeader = this.b.getDetailGpsHeader(calendar);
                        Log.d(e, "Detail GPS Header: " + detailGpsHeader, new Object[0]);
                        if (detailGpsHeader != null) {
                            if (detailGpsHeader.getErrorCode() != 1) {
                                Debug.fi(e, "return as cmd error:" + detailGpsHeader.getErrorCode());
                            } else {
                                int i2 = detailGpsHeader.size;
                                if (i2 <= 0) {
                                    Log.i(e, "Start Sync Sport Detail <HeartRate>...", new Object[0]);
                                    detailHRHeader = this.b.getDetailHRHeader(calendar);
                                    Log.d(e, "Detail HR Header: " + detailHRHeader, new Object[0]);
                                    if (detailHRHeader != null) {
                                        if (detailHRHeader.getErrorCode() != 1) {
                                            Debug.fi(e, "return as cmd error:" + detailHRHeader.getErrorCode());
                                        } else {
                                            i = detailHRHeader.size;
                                            if (i > 0) {
                                                bleSportDetailHRFetchDetailHRData = this.b.fetchDetailHRData(bleSportSummaryFetchSummaryData, i);
                                                if (bleSportDetailHRFetchDetailHRData != null) {
                                                    Log.d(e, "Detail HeartRate: " + bleSportDetailHRFetchDetailHRData.toShortString(), new Object[0]);
                                                    bleSportData.detailHR = bleSportDetailHRFetchDetailHRData;
                                                }
                                            }
                                            arrayList.add(bleSportData);
                                            calendar.setTimeInMillis(((long) (bleSportSummaryFetchSummaryData.trackId + 1)) * 1000);
                                            Log.d(e, "Update SportData StartTime: " + calendar.getTime(), new Object[0]);
                                            z = zSendLastSyncTime;
                                        }
                                    }
                                } else {
                                    BleSportDetailGps bleSportDetailGpsFetchDetailGpsData = this.b.fetchDetailGpsData(bleSportSummaryFetchSummaryData, i2);
                                    if (bleSportDetailGpsFetchDetailGpsData != null) {
                                        Log.d(e, "Detail Gps: " + bleSportDetailGpsFetchDetailGpsData.toShortString(), new Object[0]);
                                        bleSportData.detailGps = bleSportDetailGpsFetchDetailGpsData;
                                        Log.i(e, "Start Sync Sport Detail <HeartRate>...", new Object[0]);
                                        detailHRHeader = this.b.getDetailHRHeader(calendar);
                                        Log.d(e, "Detail HR Header: " + detailHRHeader, new Object[0]);
                                        if (detailHRHeader != null) {
                                            if (detailHRHeader.getErrorCode() != 1) {
                                                Debug.fi(e, "return as cmd error:" + detailHRHeader.getErrorCode());
                                            } else {
                                                i = detailHRHeader.size;
                                                if (i > 0) {
                                                    bleSportDetailHRFetchDetailHRData = this.b.fetchDetailHRData(bleSportSummaryFetchSummaryData, i);
                                                    if (bleSportDetailHRFetchDetailHRData != null) {
                                                        Log.d(e, "Detail HeartRate: " + bleSportDetailHRFetchDetailHRData.toShortString(), new Object[0]);
                                                        bleSportData.detailHR = bleSportDetailHRFetchDetailHRData;
                                                    }
                                                }
                                                arrayList.add(bleSportData);
                                                calendar.setTimeInMillis(((long) (bleSportSummaryFetchSummaryData.trackId + 1)) * 1000);
                                                Log.d(e, "Update SportData StartTime: " + calendar.getTime(), new Object[0]);
                                                z = zSendLastSyncTime;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z = zSendLastSyncTime;
        }
        this.c.onProgress(new Progress(100, 100));
        this.b.stopTransfer();
        this.b.deInit();
        this.c.onSportData(arrayList);
        this.c.onFinish(z);
    }
}
