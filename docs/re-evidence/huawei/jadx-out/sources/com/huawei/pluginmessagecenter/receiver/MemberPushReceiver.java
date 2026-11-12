package com.huawei.pluginmessagecenter.receiver;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.messagecenter.model.MessagePushBean;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.datatypes.MemberMessage;
import com.huawei.health.vip.datatypes.VipMessageInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import defpackage.irz;
import defpackage.lmf;
import defpackage.njy;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class MemberPushReceiver implements IpushBase {
    private static final int FIRST_POSITION = 0;
    private static final int REFUNDS_TYPE = 7002;
    private static final String TAG = "MemberPushReciver";

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList(String.valueOf(7002));
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "processPushMsg Error PushMsg is Empty");
            return;
        }
        try {
            LogUtil.c(TAG, "handleMsg get message", str);
            MessagePushBean messagePushBean = (MessagePushBean) new Gson().fromJson(str, MessagePushBean.class);
            if (messagePushBean == null) {
                LogUtil.e(TAG, "processPushMsg handleMsg is null");
                return;
            }
            if (messagePushBean.getPushType() == 7002) {
                LogUtil.b(TAG, "is refunds message");
                String msgContext = messagePushBean.getMsgContext();
                if (TextUtils.isEmpty(msgContext)) {
                    LogUtil.b(TAG, "messageId is empty");
                } else {
                    getVipMessage(msgContext);
                }
            }
        } catch (JsonSyntaxException unused) {
            LogUtil.d(TAG, "processPushMsg JsonSyntaxException");
        }
    }

    private void getVipMessage(String str) {
        VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
        if (vipApi == null) {
            LogUtil.e(TAG, "getVipMessages VipApi is null");
        } else {
            vipApi.getVipMessage(str, new IBaseResponseCallback() { // from class: com.huawei.pluginmessagecenter.receiver.MemberPushReceiver.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && (obj instanceof MemberMessage)) {
                        MemberPushReceiver.this.handleVipMessage((MemberMessage) obj);
                    } else {
                        LogUtil.e(MemberPushReceiver.TAG, "getVipMessage fail:", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVipMessage(MemberMessage memberMessage) {
        LogUtil.b(TAG, "enter handleVipMessage");
        VipMessageInfo vipMessageInfoC = irz.c(memberMessage.getInfoValue());
        if (vipMessageInfoC == null || TextUtils.isEmpty(irz.e(vipMessageInfoC))) {
            LogUtil.e(TAG, "vipMessageInfo == null or operateType not support");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(memberMessage);
        List<MessageObject> listE = irz.e((List<MemberMessage>) arrayList, true);
        if (njy.b(listE)) {
            MessageObject messageObject = listE.get(0);
            messageObject.setMsgId(CmcdData.Factory.STREAM_TYPE_LIVE + new SecureRandom().nextInt(1000));
            ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).showNotification(BaseApplication.b(), messageObject);
            doBiEvent(messageObject.getMsgTitle());
        }
    }

    private void doBiEvent(String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("title", str);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.VIP_MESSAGE.value(), map, 0);
    }
}
