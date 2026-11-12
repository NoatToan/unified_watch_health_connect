package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.PlanSearchProvider;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qrs;
import defpackage.tal;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class PlanSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        a(context, map, list);
    }

    private void a(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        boolean zD = tal.d(this);
        map.put("TITLE", context.getString(R.string.IDS_hwh_fitness_plan));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 201);
            map.put("ITEM_LIMIT", 3);
        }
        a(context, map, list, zD);
        d(context, map, list, zD);
    }

    private void a(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null) {
                arrayList.add(100);
                arrayList2.add(globalSearchContent.getName());
                arrayList3.add(globalSearchContent.getDescription());
                arrayList4.add(globalSearchContent.getIconUrl());
                arrayList5.add(ContextCompat.getDrawable(context, R.drawable.section_member_corner));
                arrayList6.add(globalSearchContent.getMemberShip() == 1 ? context.getString(R.string.IDS_vip) : "");
                tal.c(globalSearchContent, (HashSet<String>) hashSet);
            }
        }
        map.put("ITEM_VIEW_TYPE", arrayList);
        map.put("ITEM_TITLE", arrayList2);
        map.put("ITEM_DESCRIPTION", arrayList3);
        map.put("ITEM_IMAGE", arrayList4);
        map.put("ITEM_STATUS_BACKGROUND", arrayList5);
        map.put("ITEM_STATUS", arrayList6);
        map.put("ITEM_BI_EVENT_MAP", tal.b(300, z ? 200 : 201, GlobalSearchActivity.b(), arrayList2, arrayList2));
        map.put("BI_OBSERVER_LABEL", gvi.b(z ? 200 : 201));
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.search.dataprovider.PlanSearchProvider$1, reason: invalid class name */
    public class AnonymousClass1 implements OnClickSectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26077a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26078c;
        final /* synthetic */ boolean e;

        public static /* synthetic */ void b(int i, Object obj) {
        }

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

        AnonymousClass1(List list, Context context, boolean z) {
            this.f26077a = list;
            this.f26078c = context;
            this.e = z;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
            MarketRouterApi marketRouterApi;
            if (qrs.r() || njy.e(this.f26077a, i)) {
                return;
            }
            if (!LoginInit.getInstance(this.f26078c).getIsLogined()) {
                LoginInit.getInstance(this.f26078c).browsingToLogin(new IBaseResponseCallback() { // from class: tak
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        PlanSearchProvider.AnonymousClass1.b(i2, obj);
                    }
                }, "");
                return;
            }
            GlobalSearchContent globalSearchContent = (GlobalSearchContent) this.f26077a.get(i);
            if (globalSearchContent == null) {
                return;
            }
            String targetPage = globalSearchContent.getTargetPage();
            if (TextUtils.isEmpty(targetPage) || (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) == null) {
                return;
            }
            gvi.d(this.f26078c, GlobalSearchActivity.b(), 300, globalSearchContent.getName(), globalSearchContent.getName(), this.e);
            marketRouterApi.router(targetPage);
        }
    }

    private void d(Context context, Map<String, Object> map, List<GlobalSearchContent> list, boolean z) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass1(list, context, z));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.search.dataprovider.PlanSearchProvider.3
                @Override // java.lang.Runnable
                public void run() {
                    PlanSearchProvider.this.b(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, 300);
        } else {
            fyb.c(GlobalSearchActivity.b(), "function", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.PlanSearchProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("PlanSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, 300);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    for (GlobalSearchResult globalSearchResult : list) {
                        if (globalSearchResult != null && "function".equals(globalSearchResult.getCategoryId()) && !njy.e(globalSearchResult.getContent())) {
                            List<GlobalSearchContent> listC = tal.c(globalSearchResult.getContent(), false);
                            SectionBean sectionBean2 = sectionBean;
                            if (njy.e(listC)) {
                                listC = null;
                            }
                            sectionBean2.c(listC);
                            return;
                        }
                    }
                    LogUtil.a("PlanSearchProvider", "no plans found, show functions in the overall result");
                    tal.e(context, sectionBean, 300);
                }
            });
        }
    }
}
