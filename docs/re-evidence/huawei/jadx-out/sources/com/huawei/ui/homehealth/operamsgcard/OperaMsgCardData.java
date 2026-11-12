package com.huawei.ui.homehealth.operamsgcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TextGeneralTemplate;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.TaskExecutors;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import defpackage.ddv;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.lmf;
import defpackage.lsx;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qqz;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes17.dex */
public class OperaMsgCardData extends AbstractBaseCardData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25658c;
    private List<ResourceBriefInfo> d;
    private Handler e;
    private MessageCenterApi f;
    private MarketingApi i;
    private LinearLayout j;
    private LinearLayout k;
    private OperaMsgCardViewHolder m;
    private Timer n;
    private LinearLayout o;
    private List<MessageObject> g = new ArrayList(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25656a = 0;
    private boolean h = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25657b = false;

    public OperaMsgCardData(Context context) {
        this.mPositionTag = 45;
        CommonUtil.u("OperaMsgCardData-OperaMSGCardData constructor enter");
        this.f25658c = context;
        this.e = new d(this);
        CommonUtil.u("OperaMsgCardData-OperaMSGCardData constructor end");
        this.f = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        this.n = new Timer();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        refreshCardData();
        ReleaseLogUtil.d("OperaMsgCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("R_OperaMsgCardData", "onDestroy ");
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(0);
            this.e.removeMessages(1);
        }
        Timer timer = this.n;
        if (timer != null) {
            timer.cancel();
            this.n = null;
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        OperaMsgCardViewHolder operaMsgCardViewHolder = new OperaMsgCardViewHolder(layoutInflater.inflate(R.layout.home_item_layout_opera_msg, viewGroup, false), this.f25658c, false);
        this.m = operaMsgCardViewHolder;
        return operaMsgCardViewHolder;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "OperaMsgCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        ReleaseLogUtil.d("R_OperaMsgCardData", "refreshCardData ");
        if (Utils.k() || !VersionControlUtil.isSupportOperationAccount()) {
            ReleaseLogUtil.e("R_OperaMsgCardData", " hide opera msg");
            this.e.sendEmptyMessage(1);
        } else if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            c();
        } else {
            b();
        }
    }

    private void b() {
        ReleaseLogUtil.d("R_OperaMsgCardData", "dealLocalMessage ");
        MarketingApi marketingApiD = d();
        this.i = marketingApiD;
        if (marketingApiD == null) {
            Handler handler = this.e;
            if (handler != null) {
                handler.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this.h) {
            List<ResourceBriefInfo> listE = e();
            this.d = listE;
            if (!njy.e(listE) && this.e != null) {
                ReleaseLogUtil.d("R_OperaMsgCardData", "return cached resource");
                d(this.d, this.e);
                this.f25657b = true;
            }
            this.h = false;
        }
        if (!this.f25657b) {
            j();
        } else if (this.n != null) {
            ReleaseLogUtil.d("R_OperaMsgCardData", "mTimer schedule");
            this.n.schedule(new TimerTask() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("R_OperaMsgCardData", "mTimer schedule");
                    OperaMsgCardData.this.j();
                }
            }, 2000L);
        }
    }

    static class e implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f25664b;
        private WeakReference<OperaMsgCardData> d;
        private MarketingApi e;

        e(OperaMsgCardData operaMsgCardData, MarketingApi marketingApi, Handler handler) {
            this.d = new WeakReference<>(operaMsgCardData);
            this.e = marketingApi;
            this.f25664b = handler;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            OperaMsgCardData operaMsgCardData = this.d.get();
            if (operaMsgCardData == null) {
                ReleaseLogUtil.e("R_OperaMsgCardData", "cardData is null");
                return;
            }
            ReleaseLogUtil.d("R_OperaMsgCardData", "marketing2.0 handler is null = ", Boolean.valueOf(this.f25664b == null));
            if (this.f25664b == null) {
                return;
            }
            Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.e.filterMarketingRules(map);
            if (mapFilterMarketingRules == null || !mapFilterMarketingRules.containsKey(9001)) {
                ReleaseLogUtil.e("R_OperaMsgCardData", "marketing2.0 filterResultInfoMap == null");
                operaMsgCardData.a(this.f25664b);
                return;
            }
            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(9001);
            if (resourceResultInfo == null) {
                ReleaseLogUtil.e("R_OperaMsgCardData", "marketing2.0 no data");
                operaMsgCardData.a(this.f25664b);
                return;
            }
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (njy.e(resources)) {
                ReleaseLogUtil.e("R_OperaMsgCardData", "resource list is empty");
                operaMsgCardData.a(this.f25664b);
            } else {
                ReleaseLogUtil.d("R_OperaMsgCardData", "Marketing resInfoList size = ", Integer.valueOf(resources.size()));
                operaMsgCardData.c(resources);
                operaMsgCardData.d(resources, this.f25664b);
            }
        }
    }

    static class a implements OnFailureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f25663b;
        private WeakReference<OperaMsgCardData> e;

        a(OperaMsgCardData operaMsgCardData, Handler handler) {
            this.e = new WeakReference<>(operaMsgCardData);
            this.f25663b = handler;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            OperaMsgCardData operaMsgCardData = this.e.get();
            if (operaMsgCardData == null) {
                ReleaseLogUtil.e("R_OperaMsgCardData", "cardData is null");
                return;
            }
            ReleaseLogUtil.a("R_OperaMsgCardData", "Failed to request the marketing2.0 text link data.");
            Handler handler = this.f25663b;
            if (handler != null) {
                operaMsgCardData.a(handler);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ReleaseLogUtil.d("R_OperaMsgCardData", "request resource");
        this.i.getResourceResultInfo(9001).addOnSuccessListener(TaskExecutors.immediate(), new e(this, this.i, this.e)).addOnFailureListener(new a(this, this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<ResourceBriefInfo> list, Handler handler) {
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ResourceBriefInfo> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            ResourceBriefInfo next = it.next();
            if (next == null || next.getContentType() != 3 || next.getContent() == null || TextUtils.isEmpty(next.getContent().getContent())) {
                LogUtil.j("OperaMsgCardData", "resource brief info isUnValid");
            } else {
                String content = next.getContent().getContent();
                LogUtil.a("OperaMsgCardData", " marketing2.0: ", content);
                try {
                    TextGeneralTemplate textGeneralTemplate = (TextGeneralTemplate) gson.fromJson(content, TextGeneralTemplate.class);
                    if (textGeneralTemplate == null) {
                        LogUtil.a("OperaMsgCardData", "resource template parse exception");
                    } else {
                        MessageObject messageObject = new MessageObject();
                        messageObject.setDetailUri(textGeneralTemplate.getLinkValue());
                        messageObject.setImgUri(textGeneralTemplate.getPicture());
                        messageObject.setMsgTitle(textGeneralTemplate.getTheme());
                        if (textGeneralTemplate.isThemeVisibility() != null && !textGeneralTemplate.isThemeVisibility().booleanValue()) {
                            i = 8;
                        }
                        messageObject.setFlag(i);
                        messageObject.setMsgContent(textGeneralTemplate.getExtend());
                        messageObject.setCreateTime(next.getEffectiveTime());
                        messageObject.setExpireTime(next.getExpirationTime());
                        messageObject.setPageType(3);
                        messageObject.setMsgId(next.getResourceId());
                        messageObject.setWeight(next.getPriority());
                        messageObject.setMetadata(next.getResourceName());
                        messageObject.setResBriefInfo(next);
                        arrayList.add(messageObject);
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("OperaMsgCardData", "JsonSyntaxException");
                    a(handler);
                    return;
                } catch (Exception unused2) {
                    LogUtil.e("OperaMsgCardData", "Exception");
                    a(handler);
                    return;
                }
            }
        }
        LogUtil.a("OperaMsgCardData", "messageObjects size = ", Integer.valueOf(arrayList.size()));
        if (njy.e(arrayList)) {
            LogUtil.a("OperaMsgCardData", "messageObjects is empty");
            a(handler);
            return;
        }
        LogUtil.d("OperaMsgCardData", "getOperationPositionMsg messageObjects size== ", Integer.valueOf(arrayList.size()));
        Message messageObtainMessage = handler.obtainMessage(0);
        messageObtainMessage.obj = arrayList;
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(messageObtainMessage);
        LogUtil.a("OperaMsgCardData", "queryOperationPositionMsg messageObjects result = ", Boolean.valueOf(zSendMessageAtFrontOfQueue));
        if (zSendMessageAtFrontOfQueue) {
            return;
        }
        handler.sendMessage(messageObtainMessage);
    }

    private void c() {
        ReleaseLogUtil.d("R_OperaMsgCardData", "dealOverseaMessage");
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.2
            @Override // java.lang.Runnable
            public void run() {
                List<MessageObject> messages = OperaMsgCardData.this.f.getMessages(21);
                Handler handler = OperaMsgCardData.this.e;
                if (handler == null) {
                    ReleaseLogUtil.e("R_OperaMsgCardData", "dealOverseaMessage handler is null");
                    return;
                }
                if (!njy.b(messages)) {
                    ReleaseLogUtil.d("R_OperaMsgCardData", "msgDbObject is null");
                    handler.sendEmptyMessage(1);
                    return;
                }
                LogUtil.d("OperaMsgCardData", "getOperationPositionMsg msgDbObject size== ", Integer.valueOf(messages.size()));
                Message messageObtainMessage = handler.obtainMessage(0);
                messageObtainMessage.obj = messages;
                boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                ReleaseLogUtil.d("R_OperaMsgCardData", "queryOperationPositionMsg result = ", Boolean.valueOf(zSendMessageAtFrontOfQueue));
                if (zSendMessageAtFrontOfQueue) {
                    return;
                }
                handler.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Handler handler) {
        handler.sendEmptyMessage(1);
        a();
    }

    private MarketingApi d() {
        if (this.i == null) {
            this.i = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MessageObject> list) {
        if (njy.e(list) || this.m == null) {
            LogUtil.j("OperaMsgCardData", "mOperaMSGCardViewHolder is null or no data");
            return;
        }
        if (!b(list)) {
            LogUtil.j("OperaMsgCardData", "message lists need not to update");
            return;
        }
        f();
        this.g = list;
        LogUtil.a("OperaMsgCardData", "updateOperaMsg");
        for (int i = 0; i < list.size(); i++) {
            MessageObject messageObject = list.get(i);
            if (i == 0) {
                LinearLayout linearLayout = (LinearLayout) View.inflate(this.f25658c, R.layout.home_item_layout_opera_msg_item, null);
                this.j = linearLayout;
                d(linearLayout, messageObject, i);
            }
            if (i == 1) {
                LinearLayout linearLayout2 = (LinearLayout) View.inflate(this.f25658c, R.layout.home_item_layout_opera_msg_item, null);
                this.o = linearLayout2;
                d(linearLayout2, messageObject, i);
            }
            if (i == 2) {
                LinearLayout linearLayout3 = (LinearLayout) View.inflate(this.f25658c, R.layout.home_item_layout_opera_msg_item, null);
                this.k = linearLayout3;
                d(linearLayout3, messageObject, i);
                break;
            }
            this.f25656a++;
        }
        this.m.d.setVisibility(0);
        this.m.d.setFlipInterval(3000);
        if (this.f25656a > 1) {
            this.m.d.startFlipping();
        }
    }

    private boolean b(List<MessageObject> list) {
        if (list.size() != this.g.size()) {
            return true;
        }
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getMsgId().equals(this.g.get(i).getMsgId())) {
                z = true;
            }
        }
        return z;
    }

    static class d extends BaseHandler<OperaMsgCardData> {
        d(OperaMsgCardData operaMsgCardData) {
            super(operaMsgCardData);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OperaMsgCardData operaMsgCardData, Message message) {
            int i = message.what;
            if (i == 0) {
                LogUtil.a("OperaMsgCardData", "show opera msg");
                if (message.obj instanceof List) {
                    operaMsgCardData.a((List<MessageObject>) message.obj);
                    return;
                } else {
                    operaMsgCardData.f();
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            LogUtil.a("OperaMsgCardData", "hide opera msg");
            if (operaMsgCardData.m != null) {
                operaMsgCardData.f();
                operaMsgCardData.m.d.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.m.d.isFlipping()) {
            this.m.d.stopFlipping();
        }
        this.m.d.removeAllViews();
        this.f25656a = 0;
        this.j = null;
        this.o = null;
        this.k = null;
    }

    private boolean b(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    private void d(final View view, final MessageObject messageObject, final int i) {
        boolean z = messageObject.getPageType() == 3;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.opera_msg_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.opera_msg_layout_icon);
        if (z) {
            b(messageObject, imageView, healthTextView, view);
        } else {
            if (LanguageUtil.ba(this.f25658c)) {
                imageView.setBackground(qqz.e(this.f25658c, R.drawable.opera_msg_icon));
            }
            healthTextView.setText(messageObject.getMsgTitle());
        }
        final boolean z2 = z;
        view.setOnClickListener(new View.OnClickListener() { // from class: srq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f48569c.d(z2, messageObject, i, view, view2);
            }
        });
        this.m.d.addView(view);
        if (z) {
            c(messageObject, 0L, 1);
        } else {
            a(messageObject, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_2010074);
        }
    }

    public /* synthetic */ void d(boolean z, MessageObject messageObject, int i, View view, View view2) {
        if (z) {
            a(view2, messageObject, i);
        } else {
            b(view, messageObject);
        }
    }

    private void a(final View view, final MessageObject messageObject, final int i) {
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(this.f25658c);
            }
            LogUtil.j("OperaMsgCardData", "marketingMsgClick basic model, return");
            return;
        }
        boolean zB = fxk.b(messageObject.getDetailUri());
        LogUtil.a("OperaMsgCardData", "marketingMsgClick linkUrl = ", messageObject.getDetailUri());
        if (!zB) {
            e(view, messageObject, i);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: sro
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f48564c.a(view, messageObject, i, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void a(View view, MessageObject messageObject, int i, int i2, Object obj) {
        if (i2 == 0) {
            e(view, messageObject, i);
        } else {
            LogUtil.j("OperaMsgCardData", "marketingMsgClick errorCode = ", Integer.valueOf(i2));
        }
    }

    private void e(View view, MessageObject messageObject, int i) {
        fxl.e(messageObject.getDetailUri(), 9001, e(messageObject), i + 1);
        Object tag = view.getTag(R.id.opera_msg_text);
        c(messageObject, tag instanceof Long ? ((Long) tag).longValue() : 0L, 2);
    }

    private ResourceBriefInfo e(MessageObject messageObject) {
        return new ResourceBriefInfo.Builder().setResourceId(messageObject.getMsgId()).setResourceName(messageObject.getMetadata()).build();
    }

    private void b(MessageObject messageObject, ImageView imageView, HealthTextView healthTextView, View view) {
        if (b(this.f25658c)) {
            if (!TextUtils.isEmpty(messageObject.getImgUri())) {
                imageView.setVisibility(4);
                try {
                    Glide.with(imageView).load(messageObject.getImgUri()).into(new c(imageView));
                } catch (IllegalArgumentException e2) {
                    LogUtil.e("OperaMsgCardData", " Exception ", e2.getMessage());
                }
            } else {
                imageView.setVisibility(0);
                if (LanguageUtil.ba(this.f25658c)) {
                    imageView.setBackground(qqz.e(this.f25658c, R.drawable.opera_msg_icon));
                }
            }
        }
        healthTextView.setText(messageObject.getMsgTitle());
        healthTextView.setVisibility(messageObject.getFlag());
        view.setTag(R.id.opera_msg_text, Long.valueOf(System.currentTimeMillis()));
    }

    private void c(MessageObject messageObject, long j, int i) {
        if (messageObject == null) {
            LogUtil.j("OperaMsgCardData", "marketingBiEvent messageObject is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("resourcePositionId", 9001);
        map.put("resourceId", messageObject.getMsgId());
        map.put("resourceName", messageObject.getMetadata());
        map.put("itemCardName", messageObject.getMsgTitle());
        map.put("itemId", "");
        map.put("pullOrder", 1);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(this.f25658c, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
        if (i == 2) {
            this.i = d();
            final ResourceBriefInfo resBriefInfo = messageObject.getResBriefInfo();
            if (this.i == null || resBriefInfo == null) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: srp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48565a.d(resBriefInfo);
                }
            });
        }
    }

    public /* synthetic */ void d(ResourceBriefInfo resourceBriefInfo) {
        this.i.recordResourcePresent(9001, 1, resourceBriefInfo);
    }

    private void b(View view, final MessageObject messageObject) {
        LogUtil.a("OperaMsgCardData", "operaMsg click");
        a(messageObject, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075);
        boolean z = LoginInit.getInstance(this.f25658c).isBrowseMode() && fxk.b(messageObject.getDetailUri());
        if (!TextUtils.isEmpty(messageObject.getDetailUri())) {
            if (z) {
                LoginInit.getInstance(this.f25658c).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            OperaMsgCardData.this.b(messageObject);
                        }
                    }
                }, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075.value());
                return;
            } else {
                b(messageObject);
                return;
            }
        }
        if (messageObject.getMsgType() == 2) {
            a(messageObject);
            if (this.m.d.isFlipping()) {
                this.m.d.stopFlipping();
            }
            this.m.d.removeView(view);
            int i = this.f25656a - 1;
            this.f25656a = i;
            if (i > 1) {
                this.m.d.startFlipping();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ResourceBriefInfo> list) {
        LogUtil.a("OperaMsgCardData", "setResourceCache");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG", qqt.a(list, new TypeToken<List<ResourceBriefInfo>>() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.4
        }.getType()), null);
    }

    private List<ResourceBriefInfo> e() {
        LogUtil.a("OperaMsgCardData", "getResourceCache");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (List) qqt.c(strE, new TypeToken<List<ResourceBriefInfo>>() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.5
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("OperaMsgCardData", "getResourceCache json syntax exception: ", strE);
            return null;
        }
    }

    private void a() {
        LogUtil.a("OperaMsgCardData", "clearResourceCache");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG", null, null);
    }

    static class c extends DrawableImageViewTarget {
        c(ImageView imageView) {
            super(imageView);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.request.target.DrawableImageViewTarget, com.bumptech.glide.request.target.ImageViewTarget
        public void setResource(Drawable drawable) {
            if (drawable != null) {
                Context context = ((ImageView) this.view).getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                    if (LanguageUtil.ba(context)) {
                        drawable = qqz.e(context, drawable);
                    }
                    ((ImageView) this.view).setImageDrawable(drawable);
                    ((ImageView) this.view).setBackground(null);
                    ((ImageView) this.view).setBackgroundTintMode(PorterDuff.Mode.SRC);
                    ((ImageView) this.view).setBackgroundTintList(null);
                    ((ImageView) this.view).setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MessageObject messageObject) {
        if (messageObject.getDetailUri().startsWith("huaweischeme")) {
            a(messageObject);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(messageObject.getDetailUri()));
            intent.setPackage(this.f25658c.getPackageName());
            lsx.c(intent, this.f25658c);
            return;
        }
        c(messageObject);
    }

    private void c(MessageObject messageObject) {
        if (messageObject == null) {
            LogUtil.j("OperaMsgCardData", "gotoMassageDetailPage messageObject is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("msgId", messageObject.getMsgId());
        bundle.putString(com.huawei.health.messagecenter.model.CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        bundle.putString("EXTRA_BI_NAME", messageObject.getMsgTitle());
        bundle.putString("EXTRA_BI_SOURCE", "HomePageFlipper");
        bundle.putString("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        bundle.putString(MessageConstant.MESSAGE_TITLE, messageObject.getMsgTitle());
        AppRouter.c("/PluginMessageCenter/DispatchSkipEventActivity").d(bundle).b(this.f25658c);
    }

    private void a(MessageObject messageObject, AnalyticsValue analyticsValue) {
        if (messageObject == null || analyticsValue == null) {
            LogUtil.j("OperaMsgCardData", "processBiEvent messageObject is null");
            return;
        }
        HashMap map = new HashMap(4);
        map.put("type", 50001);
        map.put("title", messageObject.getMsgTitle());
        if (AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075.equals(analyticsValue)) {
            map.put("click", 1);
        }
        lmf.d().c(BaseApplication.getContext(), analyticsValue.value(), map, 0);
    }

    private void a(final MessageObject messageObject) {
        if (messageObject == null || messageObject.getReadFlag() == 1) {
            LogUtil.j("OperaMsgCardData", "message is empty or status is read");
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData.9
                @Override // java.lang.Runnable
                public void run() {
                    OperaMsgCardData.this.f.setMessageRead(messageObject.getMsgId());
                }
            });
        }
    }
}
