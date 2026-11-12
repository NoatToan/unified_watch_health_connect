package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ExerciseUploadCloudListener implements DataReceiveCallback {
    private static final String APP_PKG_NAME = "hw.unitedevice.uploadrecord";
    private static final long EVENT_ID = 800100031;
    private static final int IS_NEED_SYNC = 1;
    private static final String TAG = "ExerciseUploadCloudListener";
    private static final String TAG_RELEASE = "R_ExerciseUploadCloudListener";
    private static final String TRIGGER_KEYWORD = "triggerCloud";

    static class SingletonHolder {
        private static final ExerciseUploadCloudListener INSTANCE = new ExerciseUploadCloudListener();

        private SingletonHolder() {
        }
    }

    public static final ExerciseUploadCloudListener getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void registerExerciseUploadCloudListener() {
        edc.e().registerDeviceSampleListener(APP_PKG_NAME, this);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.b(TAG, "onDataReceived enter");
        if (eecVar instanceof eee) {
            eee eeeVar = (eee) eecVar;
            if (eecVar.getCommandId() != 2) {
                LogUtil.e(TAG, "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
                return;
            }
            long jD = eeeVar.d();
            if (jD != EVENT_ID) {
                LogUtil.b(TAG, "do nothing for id does not match eventId is", Long.valueOf(jD));
                return;
            }
            String str = new String(eeeVar.c(), StandardCharsets.UTF_8);
            if (TextUtils.isEmpty(str)) {
                LogUtil.b(TAG, "eventData is null");
                return;
            }
            try {
                if (new JSONObject(str).getInt(TRIGGER_KEYWORD) == 1) {
                    syncCloud();
                }
            } catch (JSONException e) {
                LogUtil.d(TAG, LogAnonymous.b(e));
            }
        }
    }

    public void syncCloud() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(2);
        hiSyncOption.setPushAction(0);
        hiSyncOption.setForceSync(true);
        ReleaseLogUtil.d(TAG_RELEASE, "syncCloud!");
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void unRegisterExerciseUploadCloudListener() {
        edc.e().unRegisterDeviceSampleListener(APP_PKG_NAME);
    }
}
