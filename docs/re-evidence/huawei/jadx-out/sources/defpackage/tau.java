package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.data.msgcontent.NotificationMsgContent;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.smartcard.SmartCardViewHolder;
import com.huawei.ui.main.stories.smartcenter.activity.SmartMsgSkipActivity;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class tau extends AbstractBaseCardData implements View.OnClickListener {
    private static int d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f48903b;
    private Context e;
    private MessageCenterApi f;
    private Handler g;
    private qop k;
    private SmartCardViewHolder o;
    private int n = 0;
    private int i = 0;
    private int m = 0;
    private String h = "";
    private String j = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48902a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48904c = 0;

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        refreshCardData();
        ReleaseLogUtil.d("SmartCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("SmartCardData", "onClick view is null");
            return;
        }
        if (view.getId() == R.id.hw_health_smart_card_more && SystemClock.elapsedRealtime() - this.f48904c > 1000) {
            this.f48904c = SystemClock.elapsedRealtime();
            try {
                qop qopVar = new qop(this.e, this.o.d);
                this.k = qopVar;
                qopVar.e(view, 0);
                return;
            } catch (IllegalStateException e) {
                LogUtil.e("SmartCardData", "popView exception", e.getMessage());
                return;
            }
        }
        if (view.getId() == R.id.hw_health_smart_card_pop_text1) {
            HashMap map = new HashMap();
            map.put("click", "1");
            map.put("type", Integer.valueOf(this.n));
            map.put("title", this.j);
            lmf.d().c(this.e, AnalyticsValue.HEALTH_HOME_SMART_CARD_MORE_IGNORE_CLICK_2010055.value(), map, 0);
            this.k.e();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 2);
            nsv.e(this.e).d(this.m, contentValues);
            SmartCardViewHolder smartCardViewHolder = this.o;
            if (smartCardViewHolder != null) {
                smartCardViewHolder.e.setVisibility(8);
                SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_show_smartcard", "false", new StorageParams());
            }
            if (this.n == 100000) {
                Context context = this.e;
                String string = Integer.toString(20009);
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferenceManager.e(context, string, "last_partiactivity_disappear_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
            }
            this.f = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
            d(this.h, this.i);
            return;
        }
        if (view.getId() != R.id.hw_health_smart_card_layout || SystemClock.elapsedRealtime() - this.f48904c <= 1000) {
            LogUtil.j("SmartCardData", "onClick else");
        } else {
            LogUtil.d("SmartCardData", "SmartCard_mSmartMsgKeyId1", Integer.valueOf(this.m));
            d();
        }
    }

    private void d() {
        this.f48904c = SystemClock.elapsedRealtime();
        a();
        Intent intent = new Intent();
        intent.putExtra("id", this.m);
        intent.putExtra("msgType", this.n);
        intent.putExtra("msgContent", this.h);
        intent.putExtra(CommonUtil.MSG_TITLE, this.j);
        intent.putExtra("from", 0);
        intent.setClass(this.e, SmartMsgSkipActivity.class);
        this.e.startActivity(intent);
        if (this.n == 100000) {
            Context context = this.e;
            String string = Integer.toString(20009);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferenceManager.e(context, string, "last_partiactivity_disappear_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            LogUtil.j("SmartCardData", "getCardViewHolder layoutInflater is null");
            return this.o;
        }
        SmartCardViewHolder smartCardViewHolder = new SmartCardViewHolder(layoutInflater.inflate(R.layout.home_item_layout_smart, viewGroup, false), this.e, false);
        this.o = smartCardViewHolder;
        smartCardViewHolder.f26089a.setOnClickListener(this);
        this.o.h.setOnClickListener(this);
        this.o.e.setOnClickListener(this);
        refreshCardData();
        return this.o;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "SmartCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        if (Utils.o()) {
            this.g.sendEmptyMessage(1);
            return;
        }
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_show_smartcard");
        LogUtil.a("SmartCardData", "showSmartCard = ", strE);
        if ("false".equals(strE)) {
            return;
        }
        String strE2 = SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_msg_switch_smartcard");
        LogUtil.a("SmartCardData", "querySmartMsg smartcardRecommend = ", strE2);
        if ("0".equals(strE2)) {
            this.g.sendEmptyMessage(1);
        } else {
            nsr.b(this.e).e(0, this.m, new IBaseResponseCallback() { // from class: tau.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SmartCardData", "querySmartMsg onResponse");
                    if (obj instanceof List) {
                        tau.this.c((List<SmartMsgDbObject>) obj);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SmartMsgDbObject> list) {
        if (list != null && list.size() > 0) {
            Message messageObtainMessage = this.g.obtainMessage(0);
            messageObtainMessage.obj = list.get(0);
            if (messageObtainMessage.obj != null) {
                boolean zSendMessageAtFrontOfQueue = this.g.sendMessageAtFrontOfQueue(messageObtainMessage);
                LogUtil.a("SmartCardData", "querySmartMsgData result1 = ", Boolean.valueOf(zSendMessageAtFrontOfQueue));
                if (!zSendMessageAtFrontOfQueue) {
                    this.g.sendMessage(messageObtainMessage);
                }
                LogUtil.d("SmartCardData", "MSG_SHOW_SMART_CARD_getSmartMsgData", Integer.valueOf(list.get(0).getMsgType()));
                return;
            }
            return;
        }
        this.g.sendEmptyMessage(1);
    }

    public static void d(int i) {
        d = i;
    }

    private void d(final String str, int i) {
        if (i != 5) {
            return;
        }
        LogUtil.a("SmartCardData", "MsgCenter set expired");
        if (this.f48903b == null) {
            this.f48903b = Executors.newSingleThreadExecutor();
        }
        ExecutorService executorService = this.f48903b;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: tau.5
                @Override // java.lang.Runnable
                public void run() {
                    NotificationMsgContent notificationMsgContent = (NotificationMsgContent) HiJsonUtil.d(str, NotificationMsgContent.class);
                    if (notificationMsgContent == null) {
                        return;
                    }
                    tau.this.f.setMessageRead(notificationMsgContent.getNotificationId());
                }
            });
        }
    }

    private void a() {
        int i;
        if (this.i == 4) {
            try {
                i = Integer.parseInt(SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_information_click_count"));
            } catch (NumberFormatException e) {
                LogUtil.e("SmartCardData", "parseInt Exception", e.getMessage());
                i = 0;
            }
            LogUtil.a("SmartCardData", "StepsCardData_refreshCardData = ", Integer.valueOf(i));
            SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_information_click_count", Integer.toString(i + 1), new StorageParams());
            Context context = this.e;
            String string = Integer.toString(10000);
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferenceManager.e(context, string, "health_information_click_time", String.valueOf(jCurrentTimeMillis), new StorageParams());
        }
    }
}
