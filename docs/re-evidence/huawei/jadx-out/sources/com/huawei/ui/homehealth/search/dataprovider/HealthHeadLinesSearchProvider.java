package com.huawei.ui.homehealth.search.dataprovider;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.HealthHeadLinesSearchProvider;
import defpackage.btx;
import defpackage.fyb;
import defpackage.gvi;
import defpackage.gzx;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.tal;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class HealthHeadLinesSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    public static /* synthetic */ void d(int i, Object obj) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        e(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        map.clear();
        boolean zD = tal.d(this);
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_health_headlines_title));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, a.A);
            map.put("ITEM_LIMIT", 3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null) {
                LogUtil.b("HealthHeadLinesSearchProvider", "content: ", HiJsonUtil.d(globalSearchContent));
                arrayList3.add(b(globalSearchContent, arrayList7));
                arrayList.add(globalSearchContent.getId());
                arrayList6.add(globalSearchContent.getPicUrl());
                arrayList2.add(globalSearchContent.getLessonName());
                tal.c(globalSearchContent, (HashSet<String>) hashSet);
                tal.b(globalSearchContent, arrayList5, arrayList4, hashSet);
            }
        }
        map.put("ITEM_IMAGE", arrayList6);
        map.put("ITEM_TITLE", arrayList2);
        map.put("ITEM_SUBTITLE", arrayList3);
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
        map.put("ITEM_DESCRIPTION", arrayList4);
        map.put("ITEM_PAGE_ATTRIBUTE", arrayList5);
        map.put("RIGHT_ICON_IMAGE", arrayList7);
        b(context, map, list, zD);
    }

    private String b(GlobalSearchContent globalSearchContent, List<Object> list) {
        if (globalSearchContent.getHeatCount() == 0 && globalSearchContent.getDuration() == 0 && TextUtils.isEmpty(globalSearchContent.getAuthor())) {
            LogUtil.e("HealthHeadLinesSearchProvider", "getHealthHeadingSubTitle all info is zero");
            return "";
        }
        LogUtil.b("HealthHeadLinesSearchProvider", "getHealthHeadingSubTitle join：", Long.valueOf(globalSearchContent.getHeatCount()), " duration: ", Integer.valueOf(globalSearchContent.getDuration()), " author: ", globalSearchContent.getAuthor());
        list.add(qqf.a(qre.c(R.drawable.ic_device_earphone)));
        StringBuilder sb = new StringBuilder();
        sb.append(tal.b(globalSearchContent, false));
        if (globalSearchContent.getDuration() / 60 > 0) {
            sb.append(gzx.c(btx.c(), R.string.sug_fitness_min, (globalSearchContent.getDuration() / 60) + ""));
        }
        if (!TextUtils.isEmpty(globalSearchContent.getAuthor())) {
            sb.append("  ");
            sb.append(globalSearchContent.getAuthor());
        }
        return sb.toString();
    }

    private void b(final Context context, Map<String, Object> map, final List<GlobalSearchContent> list, final boolean z) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.homehealth.search.dataprovider.HealthHeadLinesSearchProvider.1
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
                GlobalSearchContent globalSearchContent;
                if (njy.e(list, i) || (globalSearchContent = (GlobalSearchContent) list.get(i)) == null) {
                    return;
                }
                if (TextUtils.isEmpty(globalSearchContent.getId()) && !TextUtils.isEmpty(globalSearchContent.getDate())) {
                    LogUtil.d("HealthHeadLinesSearchProvider", "GlobalSearchContent id or date is null");
                    return;
                }
                HealthHeadLinesSearchProvider.this.e(context, "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-headlines?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse&type=2&enterPosition=7&pullfrom=globalsearch&workoutId=" + globalSearchContent.getId() + "&time=" + globalSearchContent.getDate());
                gvi.d(context, GlobalSearchActivity.b(), a.A, globalSearchContent.getId(), globalSearchContent.getLessonName(), z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str) {
        if (LoginInit.getInstance(context).isBrowseMode()) {
            LoginInit.getInstance(context).browsingToLogin(new IBaseResponseCallback() { // from class: tah
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    HealthHeadLinesSearchProvider.d(i, obj);
                }
            }, "");
            return;
        }
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            LogUtil.d("HealthHeadLinesSearchProvider", "jumpToHealthHeadingDetail marketRouterApi == null");
        } else {
            marketRouterApi.router(str);
            LogUtil.b("HealthHeadLinesSearchProvider", "jumpToHealthHeadingDetail url: ", str);
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void a(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: tae
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, a.A);
        } else {
            fyb.c(GlobalSearchActivity.b(), "healthheadlines", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.HealthHeadLinesSearchProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.b("HealthHeadLinesSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, a.A);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    tal.c(list, sectionBean, context, "healthheadlines", a.A);
                }
            });
        }
    }
}
