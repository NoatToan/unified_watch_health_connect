package com.huawei.ui.homehealth.knit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TextGeneralTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
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

/* JADX INFO: loaded from: classes43.dex */
public class OperaMSGCardProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f25620a;
    private Context d;
    private List<ResourceBriefInfo> e;
    private MarketingApi f;
    private SectionBean k;
    private LinearLayout l;
    private LinearLayout m;
    private LinearLayout n;
    private MessageCenterApi o;
    private Timer s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<View> f25621b = new ArrayList<>();
    private List<MessageObject> g = new ArrayList(4);
    private boolean j = true;
    private boolean i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25622c = false;
    private HashMap<String, Object> h = new HashMap<>();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.d = context;
        this.k = sectionBean;
        this.o = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        if (this.j) {
            this.f25620a = new d(this);
            this.s = new Timer();
            this.j = false;
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.clear();
        map.putAll(this.h);
        LogUtil.a("OperaMSGCardProvider", map.toString());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("OperaMSGCardProvider", "resume");
        i();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        ReleaseLogUtil.d("R_OperaMSGCardProvider", "onDestroy ");
        Handler handler = this.f25620a;
        if (handler != null) {
            handler.removeMessages(0);
            this.f25620a.removeMessages(1);
        }
        Timer timer = this.s;
        if (timer != null) {
            timer.cancel();
            this.s = null;
        }
    }

    private void i() {
        LogUtil.a("OperaMSGCardProvider", "refreshCardData");
        if (Utils.k() || !VersionControlUtil.isSupportOperationAccount()) {
            this.f25620a.sendEmptyMessage(1);
        } else if (Utils.o() && !ddv.b().switchToMarketingTwo()) {
            d();
        } else {
            e();
        }
    }

    private void d() {
        ReleaseLogUtil.d("R_OperaMSGCardProvider", "dealOverseaMessage");
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.1
            @Override // java.lang.Runnable
            public void run() {
                List<MessageObject> messages = OperaMSGCardProvider.this.o.getMessages(21);
                Handler handler = OperaMSGCardProvider.this.f25620a;
                if (handler == null) {
                    ReleaseLogUtil.e("R_OperaMSGCardProvider", "dealOverseaMessage handler is null");
                    return;
                }
                if (njy.b(messages)) {
                    LogUtil.d("OperaMSGCardProvider", "getOperationPositionMsg msgDbObject size== ", Integer.valueOf(messages.size()));
                    Message messageObtainMessage = handler.obtainMessage(0);
                    messageObtainMessage.obj = messages;
                    boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                    LogUtil.a("OperaMSGCardProvider", "queryOperationPositionMsg result = ", Boolean.valueOf(zSendMessageAtFrontOfQueue));
                    if (zSendMessageAtFrontOfQueue) {
                        return;
                    }
                    handler.sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.a("OperaMSGCardProvider", "msgDbObject is null");
                handler.sendEmptyMessage(1);
            }
        });
    }

    private void e() {
        MarketingApi marketingApiA = a();
        this.f = marketingApiA;
        if (marketingApiA == null) {
            Handler handler = this.f25620a;
            if (handler != null) {
                handler.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this.i) {
            List<ResourceBriefInfo> listC = c();
            this.e = listC;
            if (!njy.e(listC) && this.f25620a != null) {
                ReleaseLogUtil.d("R_OperaMSGCardProvider", "return cached resource");
                c(this.e, this.f25620a);
                this.f25622c = true;
            }
            this.i = false;
        }
        if (!this.f25622c) {
            h();
        } else if (this.s == null) {
            ReleaseLogUtil.e("R_OperaMSGCardProvider", "mTimer is null");
        } else {
            ReleaseLogUtil.d("R_OperaMSGCardProvider", "mTimer schedule");
            this.s.schedule(new TimerTask() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("R_OperaMSGCardProvider", "mTimer schedule");
                    OperaMSGCardProvider.this.h();
                }
            }, 2000L);
        }
    }

    static class a implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MarketingApi f25629b;
        private WeakReference<OperaMSGCardProvider> d;
        private Handler e;

        a(OperaMSGCardProvider operaMSGCardProvider, MarketingApi marketingApi, Handler handler) {
            this.d = new WeakReference<>(operaMSGCardProvider);
            this.f25629b = marketingApi;
            this.e = handler;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            OperaMSGCardProvider operaMSGCardProvider = this.d.get();
            if (operaMSGCardProvider == null) {
                ReleaseLogUtil.e("R_OperaMSGCardProvider", "cardData is null");
                return;
            }
            ReleaseLogUtil.d("R_OperaMSGCardProvider", "marketing2.0 handler is null = ", Boolean.valueOf(this.e == null));
            if (this.e == null) {
                return;
            }
            Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.f25629b.filterMarketingRules(map);
            if (mapFilterMarketingRules == null || !mapFilterMarketingRules.containsKey(9001)) {
                ReleaseLogUtil.e("R_OperaMSGCardProvider", "marketing2.0 filterResultInfoMap == null");
                operaMSGCardProvider.b(this.e);
                return;
            }
            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(9001);
            if (resourceResultInfo == null) {
                ReleaseLogUtil.e("R_OperaMSGCardProvider", "marketing2.0 no data");
                operaMSGCardProvider.b(this.e);
                return;
            }
            List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
            if (njy.e(resources)) {
                ReleaseLogUtil.e("R_OperaMSGCardProvider", "resource list is empty");
                operaMSGCardProvider.b(this.e);
            } else {
                ReleaseLogUtil.d("R_OperaMSGCardProvider", "Marketing resInfoList size = ", Integer.valueOf(resources.size()));
                operaMSGCardProvider.b(resources);
                operaMSGCardProvider.c(resources, this.e);
            }
        }
    }

    static class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f25630a;
        private WeakReference<OperaMSGCardProvider> d;

        b(OperaMSGCardProvider operaMSGCardProvider, Handler handler) {
            this.d = new WeakReference<>(operaMSGCardProvider);
            this.f25630a = handler;
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            OperaMSGCardProvider operaMSGCardProvider = this.d.get();
            if (operaMSGCardProvider == null) {
                ReleaseLogUtil.e("R_OperaMSGCardProvider", "cardData is null");
                return;
            }
            ReleaseLogUtil.a("R_OperaMSGCardProvider", "Failed to request the marketing2.0 text link data.");
            Handler handler = this.f25630a;
            if (handler != null) {
                operaMSGCardProvider.b(handler);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ReleaseLogUtil.d("R_OperaMSGCardProvider", "request resource");
        this.f.getResourceResultInfo(9001).addOnSuccessListener(TaskExecutors.immediate(), new a(this, this.f, this.f25620a)).addOnFailureListener(new b(this, this.f25620a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ResourceBriefInfo> list, Handler handler) {
        new Gson();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ResourceBriefInfo> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            ResourceBriefInfo next = it.next();
            if (next == null || next.getContentType() != 3 || next.getContent() == null || TextUtils.isEmpty(next.getContent().getContent())) {
                LogUtil.j("OperaMSGCardProvider", "resource brief info isUnValid");
            } else {
                String content = next.getContent().getContent();
                LogUtil.a("OperaMSGCardProvider", " marketing2.0: ", content);
                TextGeneralTemplate textGeneralTemplate = (TextGeneralTemplate) qqt.e(content, TextGeneralTemplate.class);
                if (textGeneralTemplate == null) {
                    LogUtil.e("OperaMSGCardProvider", "resource template parse exception");
                    b(handler);
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
            }
        }
        LogUtil.a("OperaMSGCardProvider", "messageObjects size = ", Integer.valueOf(arrayList.size()));
        if (njy.e(arrayList)) {
            LogUtil.a("OperaMSGCardProvider", "messageObjects is empty");
            b(handler);
            return;
        }
        LogUtil.d("OperaMSGCardProvider", "getOperationPositionMsg messageObjects size== ", Integer.valueOf(arrayList.size()));
        Message messageObtainMessage = handler.obtainMessage(0);
        messageObtainMessage.obj = arrayList;
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(messageObtainMessage);
        LogUtil.a("OperaMSGCardProvider", "queryOperationPositionMsg messageObjects result = ", Boolean.valueOf(zSendMessageAtFrontOfQueue));
        if (zSendMessageAtFrontOfQueue) {
            return;
        }
        handler.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Handler handler) {
        handler.sendEmptyMessage(1);
        b();
    }

    class d extends BaseHandler<OperaMSGCardProvider> {
        d(OperaMSGCardProvider operaMSGCardProvider) {
            super(operaMSGCardProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OperaMSGCardProvider operaMSGCardProvider, Message message) {
            OperaMSGCardProvider.this.h.clear();
            int i = message.what;
            if (i == 0) {
                LogUtil.a("OperaMSGCardProvider", "show opera msg");
                if (message.obj instanceof List) {
                    operaMSGCardProvider.a((List<MessageObject>) message.obj);
                } else {
                    operaMSGCardProvider.j();
                }
            } else if (i == 1) {
                LogUtil.a("OperaMSGCardProvider", "hide opera msg");
                operaMSGCardProvider.j();
                OperaMSGCardProvider.this.h.put("VIEW_FLIPPER_VISIBILITY", 8);
            }
            OperaMSGCardProvider.this.k.c(new Object());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<MessageObject> list) {
        if (njy.e(list)) {
            LogUtil.j("OperaMSGCardProvider", "no data");
            return;
        }
        if (!d(list)) {
            LogUtil.j("OperaMSGCardProvider", "message lists need not to update");
            return;
        }
        this.f25621b.clear();
        j();
        this.g = list;
        LogUtil.a("OperaMSGCardProvider", "updateOperaMsg");
        for (int i = 0; i < list.size(); i++) {
            MessageObject messageObject = list.get(i);
            if (i == 0) {
                View viewInflate = View.inflate(this.d, R.layout.home_item_layout_opera_msg_item, null);
                if (viewInflate instanceof LinearLayout) {
                    this.n = (LinearLayout) viewInflate;
                }
                d(this.n, messageObject, i);
            }
            if (i == 1) {
                View viewInflate2 = View.inflate(this.d, R.layout.home_item_layout_opera_msg_item, null);
                if (viewInflate2 instanceof LinearLayout) {
                    this.m = (LinearLayout) viewInflate2;
                }
                d(this.m, messageObject, i);
            }
            if (i == 2) {
                View viewInflate3 = View.inflate(this.d, R.layout.home_item_layout_opera_msg_item, null);
                if (viewInflate3 instanceof LinearLayout) {
                    this.l = (LinearLayout) viewInflate3;
                }
                d(this.l, messageObject, i);
                break;
            }
        }
        this.h.put("ADD_VIEW", this.f25621b);
        this.h.put("VIEW_FLIPPER_VISIBILITY", 0);
        this.h.put("FLIPPING_INTERVAL", 3000);
        if (this.f25621b.size() > 1) {
            this.h.put("START_FLIPPING", true);
        } else {
            this.h.put("STOP_FLIPPING", true);
        }
    }

    private boolean d(List<MessageObject> list) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.h.put("STOP_FLIPPING", true);
        this.h.put("REMOVE_ALL_VIEWS", true);
        this.n = null;
        this.m = null;
        this.l = null;
    }

    private void d(final View view, final MessageObject messageObject, final int i) {
        if (view == null || messageObject == null) {
            return;
        }
        boolean z = messageObject.getPageType() == 3;
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.opera_msg_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.opera_msg_layout_icon);
        if (z) {
            b(messageObject, imageView, healthTextView, view);
        } else {
            if (LanguageUtil.ba(this.d)) {
                imageView.setBackground(qqz.e(this.d, R.drawable.opera_msg_icon));
            }
            healthTextView.setText(messageObject.getMsgTitle());
        }
        final boolean z2 = z;
        view.setOnClickListener(new View.OnClickListener() { // from class: sqe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.d(z2, messageObject, i, view, view2);
            }
        });
        this.f25621b.add(view);
        if (z) {
            a(messageObject, 0L, 1);
        } else {
            b(messageObject, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_2010074);
        }
    }

    public /* synthetic */ void d(boolean z, MessageObject messageObject, int i, View view, View view2) {
        this.h.clear();
        if (z) {
            a(view2, messageObject, i);
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(messageObject.getDetailUri());
            }
            Object tag = view2.getTag(R.id.opera_msg_text);
            a(messageObject, tag instanceof Long ? ((Long) tag).longValue() : 0L, 2);
        } else {
            a(view, messageObject);
        }
        this.k.c(new Object());
    }

    private void a(final View view, final MessageObject messageObject, final int i) {
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (browsingBiEvent != null) {
                browsingBiEvent.showFullServiceDialog(this.d);
            }
            LogUtil.j("OperaMSGCardProvider", "marketingMsgClick basic model, return");
            return;
        }
        boolean zB = fxk.b(messageObject.getDetailUri());
        LogUtil.a("OperaMSGCardProvider", "marketingMsgClick linkUrl = ", messageObject.getDetailUri());
        if (!zB) {
            c(view, messageObject, i);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: sqd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f48520c.d(view, messageObject, i, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void d(View view, MessageObject messageObject, int i, int i2, Object obj) {
        if (i2 == 0) {
            c(view, messageObject, i);
        } else {
            LogUtil.j("OperaMSGCardProvider", "marketingMsgClick errorCode = ", Integer.valueOf(i2));
        }
    }

    private void c(View view, MessageObject messageObject, int i) {
        fxl.e(messageObject.getDetailUri(), 9001, e(messageObject), i + 1);
        Object tag = view.getTag(R.id.opera_msg_text);
        a(messageObject, tag instanceof Long ? ((Long) tag).longValue() : 0L, 2);
    }

    private ResourceBriefInfo e(MessageObject messageObject) {
        return new ResourceBriefInfo.Builder().setResourceId(messageObject.getMsgId()).setResourceName(messageObject.getMetadata()).build();
    }

    private void b(MessageObject messageObject, ImageView imageView, HealthTextView healthTextView, View view) {
        if (a(this.d)) {
            if (!TextUtils.isEmpty(messageObject.getImgUri())) {
                imageView.setVisibility(4);
                try {
                    Glide.with(imageView).load(messageObject.getImgUri()).into(new e(imageView));
                } catch (IllegalArgumentException e2) {
                    LogUtil.e("OperaMSGCardProvider", " Exception ", e2.getMessage());
                }
            } else {
                imageView.setVisibility(0);
                if (LanguageUtil.ba(this.d)) {
                    imageView.setBackground(qqz.e(this.d, R.drawable.opera_msg_icon));
                }
            }
        }
        healthTextView.setText(messageObject.getMsgTitle());
        healthTextView.setVisibility(messageObject.getFlag());
        view.setTag(R.id.opera_msg_text, Long.valueOf(System.currentTimeMillis()));
    }

    static class e extends DrawableImageViewTarget {
        e(ImageView imageView) {
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

    private void a(MessageObject messageObject, long j, int i) {
        if (messageObject == null) {
            LogUtil.j("OperaMSGCardProvider", "marketingBiEvent messageObject is null");
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
        lmf.d().c(this.d, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
        if (i == 2) {
            this.f = a();
            final ResourceBriefInfo resBriefInfo = messageObject.getResBriefInfo();
            if (this.f == null || resBriefInfo == null) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: sqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48515c.a(resBriefInfo);
                }
            });
        }
    }

    public /* synthetic */ void a(ResourceBriefInfo resourceBriefInfo) {
        this.f.recordResourcePresent(9001, 1, resourceBriefInfo);
    }

    private MarketingApi a() {
        if (this.f == null) {
            this.f = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        return this.f;
    }

    private void a(View view, final MessageObject messageObject) {
        LogUtil.a("OperaMSGCardProvider", "operaMsg click");
        b(messageObject, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075);
        boolean z = LoginInit.getInstance(this.d).isBrowseMode() && fxk.b(messageObject.getDetailUri());
        if (!TextUtils.isEmpty(messageObject.getDetailUri())) {
            if (z) {
                LoginInit.getInstance(this.d).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            OperaMSGCardProvider.this.d(messageObject);
                        }
                    }
                }, AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075.value());
                return;
            } else {
                d(messageObject);
                return;
            }
        }
        if (messageObject.getMsgType() == 2) {
            c(messageObject);
            this.f25621b.remove(view);
            if (this.f25621b.size() > 1) {
                this.h.put("START_FLIPPING", true);
            } else {
                this.h.put("STOP_FLIPPING", true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<ResourceBriefInfo> list) {
        LogUtil.a("OperaMSGCardProvider", "setResourceCache");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG", qqt.a(list, new TypeToken<List<ResourceBriefInfo>>() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.4
        }.getType()), null);
    }

    private List<ResourceBriefInfo> c() {
        LogUtil.a("OperaMSGCardProvider", "getResourceCache");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG");
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (List) qqt.c(strE, new TypeToken<List<ResourceBriefInfo>>() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.5
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("OperaMSGCardProvider", "getResourceCache json syntax exception: ", strE);
            return null;
        }
    }

    private void b() {
        LogUtil.a("OperaMSGCardProvider", "clearResourceCache");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "CACHE_KEY_OPERA_MSG", null, null);
    }

    private void c(final MessageObject messageObject) {
        if (messageObject == null || messageObject.getReadFlag() == 1) {
            LogUtil.j("OperaMSGCardProvider", "message is empty or status is read");
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.knit.OperaMSGCardProvider.6
                @Override // java.lang.Runnable
                public void run() {
                    OperaMSGCardProvider.this.o.setMessageRead(messageObject.getMsgId());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MessageObject messageObject) {
        if (messageObject.getDetailUri().startsWith("huaweischeme")) {
            c(messageObject);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(messageObject.getDetailUri()));
            intent.setPackage(this.d.getPackageName());
            lsx.c(intent, this.d);
            return;
        }
        a(messageObject);
    }

    private void a(MessageObject messageObject) {
        if (messageObject == null) {
            LogUtil.j("OperaMSGCardProvider", "gotoMassageDetailPage messageObject is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("msgId", messageObject.getMsgId());
        bundle.putString(CommonUtil.DETAIL_URI, messageObject.getDetailUri());
        bundle.putString("EXTRA_BI_NAME", messageObject.getMsgTitle());
        bundle.putString("EXTRA_BI_SOURCE", "HomePageFlipper");
        bundle.putString("EXTRA_BI_SHOWTIME", "SHOW_TIME_BI");
        bundle.putString(MessageConstant.MESSAGE_TITLE, messageObject.getMsgTitle());
        AppRouter.c("/PluginMessageCenter/DispatchSkipEventActivity").d(bundle).b(this.d);
    }

    private void b(MessageObject messageObject, AnalyticsValue analyticsValue) {
        if (messageObject == null || analyticsValue == null) {
            LogUtil.j("OperaMSGCardProvider", "processBiEvent messageObject is null");
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

    private boolean a(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
