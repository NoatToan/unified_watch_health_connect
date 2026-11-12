package com.huawei.healthcloud.plugintrack.wearengine.rqmanager;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eey;
import defpackage.ieg;
import defpackage.ies;
import defpackage.jyd;
import defpackage.lsy;
import defpackage.ltb;
import health.compact.a.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RqDataPushReceiver implements IpushBase {
    private static final String PUSH_DATA_TYPE = "RQ";
    private static final String PUSH_EVENT = "RQ_CALCULATE_SUCCESS";
    private static final String SYNC_DATA_PUSH_TYPE = "301";
    private static final String TAG = "RQData";
    private boolean mIsCorrect = false;

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("301");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(final Context context, String str) {
        LogUtil.a(TAG, "get push msg time:", ltb.d(new Date()));
        if (str != null) {
            if (str.length() >= 1) {
                LogUtil.a(TAG, "PushRqData: processPushMsg():message=", str);
                d dVar = (d) ies.b(str, d.class);
                b bVar = (b) ies.b(dVar.e, b.class);
                boolean z = bVar.e.contains(PUSH_DATA_TYPE) && bVar.d.contains(PUSH_EVENT) && dVar.f11442b.contains("301");
                this.mIsCorrect = z;
                if (!z) {
                    ReleaseLogUtil.b(TAG, "processPushMsg Error PushMsg is error");
                    return;
                } else {
                    lsy.a(new Runnable(this) { // from class: com.huawei.healthcloud.plugintrack.wearengine.rqmanager.RqDataPushReceiver.5
                        @Override // java.lang.Runnable
                        public void run() {
                            HiUserPreference hiUserPreference = new HiUserPreference();
                            hiUserPreference.setKey("track.rq_config");
                            HashMap map = new HashMap();
                            map.put("isSyncOrNot", Boolean.toString(false));
                            hiUserPreference.setValue(ies.c(map));
                            HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
                            if (!RqDataPushReceiver.checkDeviceRqDataCapability()) {
                                ReleaseLogUtil.d(RqDataPushReceiver.TAG, "sendRqDataToDevice failed with device not support");
                            } else {
                                new jyd().b(context, ieg.b(new Date(System.currentTimeMillis())));
                            }
                        }
                    });
                    return;
                }
            }
        }
        LogUtil.e(TAG, "processPushMsg Error PushMsg is Empty");
    }

    /* JADX INFO: loaded from: classes33.dex */
    class b {

        @SerializedName("pushEvent")
        private String d;

        @SerializedName("pushDataType")
        private String e;

        public String toString() {
            return "RQDataMsgPushBean{, pushDataType='" + this.e + "', pushEvent='" + this.d + "'}";
        }
    }

    /* JADX INFO: loaded from: classes33.dex */
    class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("pushType")
        private String f11442b;

        @SerializedName("pushId")
        private String d;

        @SerializedName(CommonUtil.MSG_CONTENT)
        private String e;

        public String toString() {
            return "RqDataMsgPushBean1{msgContext='" + this.e + "', pushId='" + this.d + "', pushType='" + this.f11442b + "'}";
        }
    }

    public static boolean checkDeviceRqDataCapability() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.e(TAG, "checkDeviceRqDataCapability : deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 53);
    }
}
