package com.huami.watch.transport.httpsupport.global;

import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ManualDataSyncMonitor {
    private List<String> a;

    public static final class TransState {
        public static final int APP_BROKEN_SERVICE_2_APP = 5;
        public static final int BLT_BROKEN_ASSIST_2_CLOUD = 8;
        public static final int BLT_BROKEN_ASSIST_2_WATCH = 2;
        public static final int BLT_BROKEN_SERVICE_2_APP = 3;
        public static final int BLT_BROKEN_SRV_2_ASSIST = 7;
        public static final int FAILED = -1;
        public static final int RESPONSE_FROM_SERVER_IS_INVALID = 9;
        public static final int SRV_BROKEN_APP_2_SERVICE = 6;
        public static final int SRV_BROKEN_ASSIST_2_SERVICE = 4;
        public static final int SUCCESS = 0;
    }

    public ManualDataSyncMonitor() {
        String[] strArrInterestAt = interestAt();
        if (strArrInterestAt == null || strArrInterestAt.length <= 0) {
            return;
        }
        this.a = Arrays.asList(strArrInterestAt);
    }

    public String[] interestAt() {
        return null;
    }

    public boolean isInterested(String str) {
        List<String> list = this.a;
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    public final void notifyStateChangeFor(DataItem dataItem, int i) {
        if (dataItem == null) {
            return;
        }
        String owner = dataItem.getOwner();
        if (isInterested(owner)) {
            String action = dataItem.getAction();
            String extraValByKey = dataItem.getExtraValByKey("time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                jCurrentTimeMillis = Long.valueOf(extraValByKey).longValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            onStateChange(owner, action, i, jCurrentTimeMillis);
        }
    }

    public void onStateChange(String str, String str2, int i, long j) {
    }
}
