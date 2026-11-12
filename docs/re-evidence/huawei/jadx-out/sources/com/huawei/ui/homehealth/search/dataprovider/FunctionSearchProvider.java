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
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.dataprovider.FunctionSearchProvider;
import defpackage.foy;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class FunctionSearchProvider extends BaseKnitDataProvider<List<GlobalSearchContent>> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        b(context, map, list);
    }

    private void b(Context context, HashMap<String, Object> map, List<GlobalSearchContent> list) {
        boolean zD = tal.d(this);
        map.put("TITLE", context.getString(R.string.IDS_function_search));
        if (zD) {
            map.put("SHOWMORE", context.getString(R.string.IDS_device_show_more_heartrate_device));
            tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 206);
            map.put("ITEM_LIMIT", 3);
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<GlobalSearchContent> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            GlobalSearchContent next = it.next();
            if (next != null) {
                foy foyVar = new foy(next.getName(), next.getIconUrl());
                foyVar.c(next.getMemberShip() == 1 ? "VIP" : "");
                foyVar.a(tal.b(206, zD ? 200 : 206, GlobalSearchActivity.b(), next.getName(), next.getName()));
                arrayList.add(foyVar);
            }
        }
        map.put("SECTION21_9LIST_02BEAN", arrayList);
        map.put("BI_OBSERVER_LABEL", gvi.b(zD ? 200 : 206));
        map.put("HIGHLIGHTED_TEXT", tal.a(hashSet));
        d(context, map, list, zD);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.search.dataprovider.FunctionSearchProvider$2, reason: invalid class name */
    public class AnonymousClass2 implements OnClickSectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f26046b;
        final /* synthetic */ boolean d;

        public static /* synthetic */ void c(int i, Object obj) {
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

        AnonymousClass2(List list, Context context, boolean z) {
            this.f26045a = list;
            this.f26046b = context;
            this.d = z;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
            MarketRouterApi marketRouterApi;
            if (qrs.r() || njy.e(this.f26045a, i)) {
                return;
            }
            if (!LoginInit.getInstance(this.f26046b).getIsLogined()) {
                LoginInit.getInstance(this.f26046b).browsingToLogin(new IBaseResponseCallback() { // from class: tab
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i2, Object obj) {
                        FunctionSearchProvider.AnonymousClass2.c(i2, obj);
                    }
                }, "");
                return;
            }
            GlobalSearchContent globalSearchContent = (GlobalSearchContent) this.f26045a.get(i);
            if (globalSearchContent == null) {
                return;
            }
            String targetPage = globalSearchContent.getTargetPage();
            if (TextUtils.isEmpty(targetPage) || (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) == null) {
                return;
            }
            gvi.d(this.f26046b, GlobalSearchActivity.b(), 206, globalSearchContent.getName(), globalSearchContent.getName(), this.d);
            marketRouterApi.router(tal.e(targetPage));
        }
    }

    private void d(Context context, Map<String, Object> map, List<GlobalSearchContent> list, boolean z) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass2(list, context, z));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.search.dataprovider.FunctionSearchProvider.4
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSearchProvider.this.b(context, sectionBean);
                }
            });
        } else if (tal.d(this)) {
            tal.e(context, sectionBean, 206);
        } else {
            fyb.c(GlobalSearchActivity.b(), "function", new UiCallback<List<GlobalSearchResult>>() { // from class: com.huawei.ui.homehealth.search.dataprovider.FunctionSearchProvider.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("FunctionSearchProvider", "request failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    tal.e(context, sectionBean, 206);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<GlobalSearchResult> list) {
                    for (GlobalSearchResult globalSearchResult : list) {
                        if (globalSearchResult != null && "function".equals(globalSearchResult.getCategoryId()) && !njy.e(globalSearchResult.getContent())) {
                            List<GlobalSearchContent> listC = tal.c(globalSearchResult.getContent(), true);
                            SectionBean sectionBean2 = sectionBean;
                            if (njy.e(listC)) {
                                listC = null;
                            }
                            sectionBean2.c(listC);
                            return;
                        }
                    }
                    LogUtil.a("FunctionSearchProvider", "no functions found, show functions in the overall result");
                    tal.e(context, sectionBean, 206);
                }
            });
        }
    }
}
