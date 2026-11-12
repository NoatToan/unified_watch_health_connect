package com.huawei.profile.coordinator.task;

import android.content.Context;
import com.huawei.profile.account.AccountClientSdk;
import com.huawei.profile.coordinator.RequestAgentSdk;
import com.huawei.profile.profile.ProfileUtilsSdk;
import com.huawei.profile.utils.logger.DsLog;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileUploadTaskSdk extends ProfileTask {
    private static final int DELETE_CHARACTER_ARRAY_SIZE = 3;
    private static final int DELETE_CHARACTER_TIME_INDEX = 2;
    private static final int DELETE_SERVICE_TIME_INDEX = 1;
    private static final int LOCAL_DEV_ID_INDEX = 0;
    private static final long MAX_RETRY_TIME = 2;
    private static final long MAX_TIME_OUT_MS = 10000;
    private static final int PUT_CHARACTER_ARRAY_SIZE = 2;
    private static final int SERVICE_ARRAY_SIZE = 2;
    private static final int SERVICE_ID_INDEX = 1;
    private static final String TAG = "ProfileUploadTaskSdk";
    private Context context;
    private boolean isExpiredAccount = false;
    private Vector<String> rePutDevList = new Vector<>();
    private Vector<String> reDeleteDevList = new Vector<>();
    private Vector<String> rePutServiceList = new Vector<>();
    private Vector<String> reDeleteServiceList = new Vector<>();
    private Vector<String> rePutCharacterList = new Vector<>();
    private Vector<String> reDeleteCharacterList = new Vector<>();

    @Override // com.huawei.profile.coordinator.task.ProfileTask
    public String getName() {
        return TAG;
    }

    @Override // com.huawei.profile.coordinator.task.ProfileTask
    public void setContext(Context context) {
        this.context = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        DsLog.dt(TAG, "start to upload", new Object[0]);
        synchronized (ProfileUploadTaskSdk.class) {
            try {
                boolean zIsExpiredAccount = AccountClientSdk.getInstance(this.context).isExpiredAccount();
                this.isExpiredAccount = zIsExpiredAccount;
                if (zIsExpiredAccount) {
                    DsLog.it(TAG, "the account has expired", new Object[0]);
                    ProfileTaskPoolSdk.setIsWaitingForUpload(false);
                } else {
                    resendIndexProfile();
                    ProfileTaskPoolSdk.setIsWaitingForUpload(false);
                }
            } catch (Throwable th) {
                ProfileTaskPoolSdk.setIsWaitingForUpload(false);
                throw th;
            }
        }
    }

    private void resendIndexProfile() {
        getResendIndex();
        resendDeviceProfile();
        resendServiceProfile();
        resendCharacterProfile();
    }

    private void resendDeviceProfile() {
        Iterator<String> it = this.rePutDevList.iterator();
        while (it.hasNext()) {
            new RequestAgentSdk().putDeviceToCloud(this.context, it.next(), 10000L);
            it.remove();
        }
        Iterator<String> it2 = this.reDeleteDevList.iterator();
        while (it2.hasNext()) {
            new RequestAgentSdk().deleteDeviceFromCloud(this.context, it2.next(), 10000L);
            it2.remove();
        }
    }

    private void resendServiceProfile() {
        Iterator<String> it = this.rePutServiceList.iterator();
        while (it.hasNext()) {
            new RequestAgentSdk().putServicesToCloud(this.context, it.next(), 10000L);
            it.remove();
        }
        Iterator<String> it2 = this.reDeleteServiceList.iterator();
        while (it2.hasNext()) {
            String[] strArrSplit = it2.next().split("/");
            if (strArrSplit.length != 2) {
                DsLog.et(TAG, "delete service fail: format error", new Object[0]);
            } else {
                new RequestAgentSdk().deleteServiceFromCloud(this.context, strArrSplit[0], strArrSplit[1], 10000L);
                it2.remove();
            }
        }
    }

    private void resendCharacterProfile() {
        Iterator<String> it = this.rePutCharacterList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split("/");
            if (strArrSplit.length != 2) {
                DsLog.et(TAG, "put characterInfo fail: format error", new Object[0]);
            } else {
                new RequestAgentSdk().putServiceCharacteristicToCloud(this.context, strArrSplit[0], strArrSplit[1], 10000L);
                it.remove();
            }
        }
        Iterator<String> it2 = this.reDeleteCharacterList.iterator();
        while (it2.hasNext()) {
            String[] strArrSplit2 = it2.next().split("/");
            if (strArrSplit2.length != 3) {
                DsLog.et(TAG, "delete characterInfo fail: format error", new Object[0]);
            } else {
                String str = strArrSplit2[0];
                String str2 = strArrSplit2[1];
                String str3 = strArrSplit2[2];
                new RequestAgentSdk().deleteCharacteristicFromCloud(this.context, str + "/" + str2, str3, 10000L);
                it2.remove();
            }
        }
    }

    private void getResendIndex() {
        Map<String, Map<String, String>> allResendIndex = ProfileUtilsSdk.getInstance(this.context).getAllResendIndex();
        if (allResendIndex == null || allResendIndex.isEmpty()) {
            DsLog.wt(TAG, "getResendIndex, allResendIndexMap is null or empty", new Object[0]);
            return;
        }
        getResendIndexForDevice(allResendIndex);
        getResendIndexForService(allResendIndex);
        getResendIndexForCharacter(allResendIndex);
    }

    private void getResendIndexForDevice(Map<String, Map<String, String>> map) {
        Map<String, String> map2 = map.get("devices");
        if (map2 == null) {
            DsLog.wt(TAG, "there is no device to upload.", new Object[0]);
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String value = entry.getValue();
            value.hashCode();
            if (value.equals("deleteDevice")) {
                this.reDeleteDevList.add(entry.getKey());
            } else if (!value.equals("putDevice")) {
                DsLog.et(TAG, "Illegal value when getting devices to be uploaded!", new Object[0]);
            } else {
                this.rePutDevList.add(entry.getKey());
            }
        }
    }

    private void getResendIndexForService(Map<String, Map<String, String>> map) {
        Map<String, String> map2 = map.get("services");
        if (map2 == null) {
            DsLog.wt(TAG, "there is no service to upload.", new Object[0]);
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry.getValue().equals("putService")) {
                this.rePutServiceList.add(entry.getKey());
            } else if (!entry.getValue().split("/")[0].equals("deleteService")) {
                DsLog.et(TAG, "Illegal value when getting services to be uploaded!", new Object[0]);
            } else {
                this.reDeleteServiceList.add(entry.getKey() + "/" + entry.getValue().split("/")[1]);
            }
        }
    }

    private void getResendIndexForCharacter(Map<String, Map<String, String>> map) {
        Map<String, String> map2 = map.get("characteristics");
        if (map2 == null) {
            DsLog.wt(TAG, "there is no character to upload.", new Object[0]);
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            if (entry.getValue().equals("putCharacter")) {
                this.rePutCharacterList.add(entry.getKey());
            } else if (!entry.getValue().split("/")[0].equals("deleteCharacter")) {
                DsLog.et(TAG, "Illegal value when getting character to be uploaded!", new Object[0]);
            } else {
                this.reDeleteCharacterList.add(entry.getKey() + "/" + entry.getValue().split("/")[1]);
            }
        }
    }
}
