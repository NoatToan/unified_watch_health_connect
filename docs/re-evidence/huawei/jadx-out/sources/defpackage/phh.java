package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessagePushBean;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class phh implements IpushBase {
    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Collections.singletonList(String.valueOf(9001));
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TC_PushReceiver", "processPushMsg, message is empty");
            return;
        }
        ReleaseLogUtil.d("TC_PushReceiver", "processPushMsg, message = ", str);
        Gson gson = new Gson();
        MessagePushBean messagePushBean = (MessagePushBean) gson.fromJson(str, MessagePushBean.class);
        if (messagePushBean == null) {
            LogUtil.e("TC_PushReceiver", "processPushMsg handleMsg is null");
            return;
        }
        c cVar = (c) gson.fromJson(messagePushBean.getMsgContext(), c.class);
        if (cVar == null) {
            LogUtil.e("TC_PushReceiver", "msgContext is null");
            return;
        }
        ReleaseLogUtil.d("TC_PushReceiver", "messagePushBean:", messagePushBean.getMsgContext(), " msgContext:", Integer.valueOf(cVar.e), Integer.valueOf(cVar.f45371c));
        String strB = b(cVar.e);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), "com.huawei.health.threeCircle.remind.receiver.SportRemindReceiver");
        intent.putExtra("remindType", strB);
        intent.putExtra("reportDate", cVar.f45371c);
        BroadcastManagerUtil.e(BaseApplication.b(), intent);
    }

    private String b(int i) {
        if (i == 201) {
            return "WeekSummary";
        }
        if (i == 202) {
            return "MonthSummary";
        }
        if (i == 301) {
            return "ActiveWeek";
        }
        if (i == 302) {
            return "PerfectMonth";
        }
        LogUtil.e("TC_PushReceiver", "changePushTypeToRequireType other remindType", Integer.valueOf(i));
        return "";
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("reportDate")
        private int f45371c;

        @SerializedName(HealthZonePushReceiver.DETAIL_TYPE)
        private int e;

        public String toString() {
            return "MsgContext{detailType=" + this.e + ", reportDate='" + this.f45371c + '}';
        }
    }
}
