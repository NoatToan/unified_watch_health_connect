package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.datatype.templates.DailyRecommendTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.servicesui.R;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.webview.WebViewActivity;
import defpackage.ddv;
import defpackage.fxl;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionOperationCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DailyRecommendTemplate> f7504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionOperationCardAdapter f7505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7506c;
    private long d;
    private HealthColumnSystem e;
    private List<MessageObject> f;
    private int g;
    private GridLayoutManager h;
    private a i;
    private LinearLayout j;
    private OnClickSectionListener k;
    private LinearLayout m;
    private List<View> n;
    private HealthRecycleView o;

    static /* synthetic */ int c(SectionOperationCard sectionOperationCard) {
        int i = sectionOperationCard.g + 1;
        sectionOperationCard.g = i;
        return i;
    }

    public SectionOperationCard(Context context) {
        super(context);
        this.d = System.currentTimeMillis();
        this.g = 0;
        this.f = new ArrayList();
        this.i = new a(this);
        this.n = new ArrayList();
        this.f7504a = new ArrayList();
        this.k = new OnClickSectionListener() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.c(SectionOperationCard.this.f, i)) {
                    MessageObject messageObject = (MessageObject) SectionOperationCard.this.f.get(i);
                    String detailUri = messageObject.getDetailUri();
                    if (!Utils.o() || ddv.b().switchToMarketingTwo()) {
                        SectionOperationCard.this.b(messageObject, 2);
                        SectionOperationCard.this.c(fxl.d(detailUri, messageObject.getCategory()), messageObject);
                        LogUtil.a("SectionOperationCard", "is marking 2.0");
                    } else {
                        SectionOperationCard.this.d(messageObject);
                        if (TextUtils.isEmpty(detailUri)) {
                            return;
                        }
                        a(detailUri);
                    }
                }
            }

            private void a(final String str) {
                GRSManager.c(SectionOperationCard.this.f7506c).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3.1
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str2) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackSuccess url = ", str2);
                        SectionOperationCard.this.d(SectionOperationCard.this.a(str, str2 + "/messageH5/html/launchFitness.html?url="), str);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackFail code = ", Integer.valueOf(i));
                        SectionOperationCard.this.a(str);
                    }
                });
            }
        };
    }

    public SectionOperationCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = System.currentTimeMillis();
        this.g = 0;
        this.f = new ArrayList();
        this.i = new a(this);
        this.n = new ArrayList();
        this.f7504a = new ArrayList();
        this.k = new OnClickSectionListener() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.c(SectionOperationCard.this.f, i)) {
                    MessageObject messageObject = (MessageObject) SectionOperationCard.this.f.get(i);
                    String detailUri = messageObject.getDetailUri();
                    if (!Utils.o() || ddv.b().switchToMarketingTwo()) {
                        SectionOperationCard.this.b(messageObject, 2);
                        SectionOperationCard.this.c(fxl.d(detailUri, messageObject.getCategory()), messageObject);
                        LogUtil.a("SectionOperationCard", "is marking 2.0");
                    } else {
                        SectionOperationCard.this.d(messageObject);
                        if (TextUtils.isEmpty(detailUri)) {
                            return;
                        }
                        a(detailUri);
                    }
                }
            }

            private void a(final String str) {
                GRSManager.c(SectionOperationCard.this.f7506c).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3.1
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str2) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackSuccess url = ", str2);
                        SectionOperationCard.this.d(SectionOperationCard.this.a(str, str2 + "/messageH5/html/launchFitness.html?url="), str);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackFail code = ", Integer.valueOf(i));
                        SectionOperationCard.this.a(str);
                    }
                });
            }
        };
    }

    public SectionOperationCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = System.currentTimeMillis();
        this.g = 0;
        this.f = new ArrayList();
        this.i = new a(this);
        this.n = new ArrayList();
        this.f7504a = new ArrayList();
        this.k = new OnClickSectionListener() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, int i3) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
                if (njy.c(SectionOperationCard.this.f, i2)) {
                    MessageObject messageObject = (MessageObject) SectionOperationCard.this.f.get(i2);
                    String detailUri = messageObject.getDetailUri();
                    if (!Utils.o() || ddv.b().switchToMarketingTwo()) {
                        SectionOperationCard.this.b(messageObject, 2);
                        SectionOperationCard.this.c(fxl.d(detailUri, messageObject.getCategory()), messageObject);
                        LogUtil.a("SectionOperationCard", "is marking 2.0");
                    } else {
                        SectionOperationCard.this.d(messageObject);
                        if (TextUtils.isEmpty(detailUri)) {
                            return;
                        }
                        a(detailUri);
                    }
                }
            }

            private void a(final String str) {
                GRSManager.c(SectionOperationCard.this.f7506c).d("messageCenterUrl", new GrsQueryCallback() { // from class: com.huawei.health.knit.section.homesection.SectionOperationCard.3.1
                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackSuccess(String str2) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackSuccess url = ", str2);
                        SectionOperationCard.this.d(SectionOperationCard.this.a(str, str2 + "/messageH5/html/launchFitness.html?url="), str);
                    }

                    @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                    public void onCallBackFail(int i2) {
                        LogUtil.d("SectionOperationCard", "GRSManager onCallBackFail code = ", Integer.valueOf(i2));
                        SectionOperationCard.this.a(str);
                    }
                });
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7506c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.home_item_layout_operation, (ViewGroup) this, false);
        d(viewInflate, this.f7506c);
        return viewInflate;
    }

    private void d(View view, Context context) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.operation_rv);
        this.o = healthRecycleView;
        healthRecycleView.b(false);
        this.o.e(false);
        this.o.setFocusableInTouchMode(false);
        this.j = (LinearLayout) view.findViewById(R.id.health_grid_operation_card);
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f7506c, 1);
        this.e = healthColumnSystem;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, Math.min(healthColumnSystem.j() / 4, 2), 1, false);
        this.h = gridLayoutManager;
        this.o.setLayoutManager(gridLayoutManager);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        this.o.addItemDecoration(new RecyclerItemDecoration(qqp.b(this.f7506c), 0, arrayList));
        this.m = (LinearLayout) view.findViewById(R.id.operation_card_layout);
        BaseActivity.setViewSafeRegion(true, view.findViewById(R.id.operation_rv));
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.operation_card_sub_header);
        healthSubHeader.setSubHeaderBackgroundColor(0);
        healthSubHeader.setSubHeaderSafeRegion();
        SectionOperationCardAdapter sectionOperationCardAdapter = new SectionOperationCardAdapter(this.f7506c, this.f);
        this.f7505b = sectionOperationCardAdapter;
        sectionOperationCardAdapter.b(this.k);
        this.o.setAdapter(this.f7505b);
        setCardVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardVisibility(int i) {
        qsp.c((View) this.m, i);
    }

    public void setData(List<MessageObject> list) {
        SectionOperationCardAdapter sectionOperationCardAdapter = this.f7505b;
        if (sectionOperationCardAdapter == null) {
            SectionOperationCardAdapter sectionOperationCardAdapter2 = new SectionOperationCardAdapter(this.f7506c, list);
            this.f7505b = sectionOperationCardAdapter2;
            this.o.setAdapter(sectionOperationCardAdapter2);
        } else {
            sectionOperationCardAdapter.b(list);
        }
        this.f7505b.d(this.f7504a);
        OnClickSectionListener onClickSectionListener = this.k;
        if (onClickSectionListener != null) {
            this.f7505b.b(onClickSectionListener);
        }
        if (njy.e(this.n)) {
            LogUtil.a("SectionOperationCard", "GRID INFO VIEW IS EMPTY.");
            return;
        }
        LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            LogUtil.a("SectionOperationCard", "mGridLayout == null.");
            return;
        }
        linearLayout.removeAllViews();
        Iterator<View> it = this.n.iterator();
        while (it.hasNext()) {
            this.j.addView(it.next());
        }
    }

    public boolean e() {
        LogUtil.a("SectionOperationCard", "notifyDataSetChanged start");
        a();
        if (this.f7505b != null) {
            if (this.o.getScrollState() == 0 && !this.o.isComputingLayout()) {
                try {
                    this.o.getRecycledViewPool().clear();
                    this.f7505b.notifyDataSetChanged();
                    LogUtil.a("SectionOperationCard", "notifyDataSetChanged succ");
                    return true;
                } catch (Exception unused) {
                    LogUtil.e("SectionOperationCard", "notifyDataSetChanged occurred unknown exception");
                    return false;
                }
            }
            LogUtil.e("SectionOperationCard", "notifyDataSetChanged ----------- fail");
        }
        return false;
    }

    private void a() {
        HealthColumnSystem healthColumnSystem = this.e;
        if (healthColumnSystem != null) {
            healthColumnSystem.b(this.f7506c);
            if (this.h != null) {
                int iMin = Math.min(this.e.j() / 4, 2);
                this.h.setSpanCount(iMin);
                this.f7505b.e(iMin);
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionOperationCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        Object obj = map.get("VIEW_LIST");
        List<View> list = njy.b(obj, View.class) ? (List) obj : null;
        if (list != null && !njy.c(list, this.n, true)) {
            this.n = list;
        }
        Object obj2 = map.get("TEMPLATE_LIST");
        List<DailyRecommendTemplate> list2 = njy.b(obj2, DailyRecommendTemplate.class) ? (List) obj2 : null;
        if (list2 != null && !njy.c(list2, this.f7504a, true)) {
            this.f7504a = list2;
        }
        Object obj3 = map.get("DATA_LIST");
        List<MessageObject> list3 = njy.b(obj3, MessageObject.class) ? (List) obj3 : null;
        if (list3 != null && !njy.c(list3, this.f, true)) {
            this.f = list3;
            setData(list3);
        }
        if (qqw.a(map, "NOTIFY_UPDATE", false)) {
            this.i.sendEmptyMessage(0);
        }
    }

    static class a extends BaseHandler<SectionOperationCard> {
        public a(SectionOperationCard sectionOperationCard) {
            super(sectionOperationCard);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SectionOperationCard sectionOperationCard, Message message) {
            if (message.what != 0) {
                return;
            }
            b(sectionOperationCard);
        }

        private void b(SectionOperationCard sectionOperationCard) {
            if (!njy.e(sectionOperationCard.f)) {
                sectionOperationCard.setCardVisibility(0);
                LogUtil.a("SectionOperationCard", "handleMessage UPDATE mList size is ", Integer.valueOf(sectionOperationCard.f.size()));
                if (!sectionOperationCard.e()) {
                    if (sectionOperationCard.g < 5) {
                        LogUtil.a("SectionOperationCard", "handleMessage UPDATE again");
                        SectionOperationCard.c(sectionOperationCard);
                        sectionOperationCard.i.sendEmptyMessageDelayed(0, 300L);
                        return;
                    }
                    return;
                }
                sectionOperationCard.g = 0;
                return;
            }
            LogUtil.j("SectionOperationCard", "handleMessage UPDATE mList is empty");
            sectionOperationCard.setCardVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, MessageObject messageObject) {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(d(str, messageObject));
        }
    }

    private String d(String str, MessageObject messageObject) {
        if (str.contains("?")) {
            return str + "&pullfrom=1001&resourceName=" + messageObject.getMsgFrom() + "&resourceId=" + messageObject.getMsgId() + "&pullOrder=1&algId=&itemId=" + messageObject.getMsgId();
        }
        return str + "?pullfrom=1001&resourceName=" + messageObject.getMsgTitle() + "&resourceId=" + messageObject.getMsgId() + "&pullOrder=1&algId=&itemId=" + messageObject.getMsgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String queryParameter = Constants.SUFFIX_HTML;
        if (zIsEmpty) {
            return Constants.SUFFIX_HTML;
        }
        if (str.startsWith(str2)) {
            queryParameter = Uri.parse(str.replace(str2, "")).getQueryParameter("type");
        }
        LogUtil.d("SectionOperationCard", "跳转类型：", queryParameter);
        return queryParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        str.hashCode();
        if (str.equals(Constants.SUFFIX_HTML)) {
            a(str2);
        } else if (str.equals("medal")) {
            ((AchieveNavigationApi) Services.b("PluginAchievement", AchieveNavigationApi.class)).showAchieveMedal(this.f7506c);
        } else {
            a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Intent intent = new Intent(this.f7506c, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        qrs.b(this.f7506c, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MessageObject messageObject) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("msgId", messageObject.getMsgId());
        map.put(CommonUtil.MSG_TITLE, messageObject.getMsgTitle());
        lmf.d().c(this.f7506c, AnalyticsValue.HEALTH_HOME_OPERATION_CARD_DATA_2010085.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MessageObject messageObject, int i) {
        if (messageObject == null) {
            LogUtil.j("SectionOperationCard", "biEvent messageObject is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("resourcePositionId", 1001);
        map.put("resourceId", messageObject.getMsgId());
        map.put("event", Integer.valueOf(i));
        map.put("resourceName", messageObject.getMsgFrom());
        map.put("itemCardName", messageObject.getMsgTitle());
        map.put("itemId", "");
        map.put("pullOrder", 1);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.d));
            this.d = System.currentTimeMillis();
        }
        if (messageObject.getResBriefInfo() != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(messageObject.getResBriefInfo().getSmartRecommend()));
        }
        lmf.d().c(this.f7506c, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }
}
