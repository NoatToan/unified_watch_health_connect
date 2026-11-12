package com.huawei.hihealthservice.sync.util;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kym;
import defpackage.liz;
import defpackage.ltb;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HiSyncMsgReceiver implements IpushBase {
    private static final String RELEASE_LOG_TAG = "HiH_HiSyncMsgReceiver";
    private static final String SYNC_DATA_PUSH_TYPE = "3";
    private static final String TAG = "Debug_HiSyncMsgReceiver";

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("3");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        LogUtil.a(TAG, "get push msg time:" + ltb.d(new Date()));
        if (str == null || str.length() < 1) {
            LogUtil.j(TAG, "processPushMsg  Error PushMsg is Empty");
            return;
        }
        LogUtil.d(TAG, "processPushMsg():msg=" + str);
        try {
            if ("3".equals(((HiSyncMsgPushBean) new Gson().fromJson(str, HiSyncMsgPushBean.class)).pushType)) {
                LogUtil.d(TAG, "processPushMsg, pushType = SYNC_DATA");
                if (context == null) {
                    return;
                }
                if ("com.huawei.bone".equals(context.getPackageName())) {
                    LogUtil.d(TAG, "processPushMsg,package is bone sendPushBroadcast");
                    HiBroadcastUtil.e(context);
                    liz.a().a(201, "HiSyncMsgReceiver", new kym(context.getPackageName()));
                    return;
                }
                HiSyncOption hiSyncOption = new HiSyncOption();
                hiSyncOption.setSyncModel(2);
                hiSyncOption.setSyncAction(2);
                hiSyncOption.setSyncDataType(20000);
                hiSyncOption.setSyncScope(1);
                hiSyncOption.setSyncMethod(2);
                LogUtil.a(TAG, "processPushMsg, startSync,time:" + ltb.d(new Date()));
                HiHealthNativeApi.a(context).synCloud(hiSyncOption, null);
            }
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a(RELEASE_LOG_TAG, "processPushMsg JsonSyntaxException:" + e.getMessage());
        }
    }

    /* JADX INFO: loaded from: classes33.dex */
    class HiSyncMsgPushBean {
        public String pushType = "";
        public String pushContent = "";

        private HiSyncMsgPushBean() {
        }

        public String toString() {
            return "HiSyncMsgPushBean{, pushType='" + this.pushType + "', pushId='" + this.pushContent + "'}";
        }
    }
}
