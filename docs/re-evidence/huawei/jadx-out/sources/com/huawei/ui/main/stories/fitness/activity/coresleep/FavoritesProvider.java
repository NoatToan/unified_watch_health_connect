package com.huawei.ui.main.stories.fitness.activity.coresleep;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.listener.IViewCreatedCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider;
import defpackage.ddv;
import defpackage.dlo;
import defpackage.njy;
import defpackage.nuv;
import defpackage.trd;
import defpackage.ubo;
import defpackage.ucu;
import defpackage.vdo;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class FavoritesProvider extends BaseKnitDataProvider {
    private WeakReference<Context> d;
    private int e;
    private SectionBean f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26660c = "";
    private List<Integer> g = Collections.synchronizedList(new ArrayList(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f26658a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f26659b = new Object();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.f = sectionBean;
        c();
        this.f26658a.clear();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        this.d = new WeakReference<>(context);
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider.4
            @Override // java.lang.Runnable
            public void run() {
                FavoritesProvider.this.d();
            }
        }, 1000L);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("FavoritesProvider", "resume");
        d();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        LogUtil.a("FavoritesProvider", "parseParams");
        map.putAll(this.f26658a);
        LogUtil.a("FavoritesProvider", "outParams: " + map.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ucu.a(1, new b());
    }

    private void c() {
        LogUtil.a("FavoritesProvider", "configureService");
        if (Utils.o() && vdo.c("FavoritesProvider", a()) && !ddv.b().switchToMarketingTwo()) {
            LogUtil.a("FavoritesProvider", "isOversea");
            this.f26658a.put("CONFIG_CALL_BACK", new IViewCreatedCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider.1
                @Override // com.huawei.health.knit.section.listener.IViewCreatedCallback
                public void onLayoutUpdate(final LinearLayout linearLayout) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider.1.5
                            @Override // java.lang.Runnable
                            public void run() {
                                trd.a(1, linearLayout, (ConfiguredPageDataCallback) null);
                            }
                        });
                    } else {
                        trd.a(1, linearLayout, (ConfiguredPageDataCallback) null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Object obj) {
        LogUtil.a("FavoritesProvider", "setSleepFavoritesCard, obj: ", obj);
        ubo uboVar = obj instanceof ubo ? (ubo) obj : null;
        String strC = "";
        if (uboVar != null) {
            String strReplaceAll = uboVar.toString().replaceAll("mHeatCount=[0-9]+,", "");
            LogUtil.a("FavoritesProvider", "model: ", uboVar.toString());
            strC = nuv.c(strReplaceAll);
        }
        String str = this.f26660c;
        if (str != null && str.equals(strC) && !this.f26658a.isEmpty()) {
            LogUtil.a("FavoritesProvider", "setSleepFavoritesCard same content");
            return false;
        }
        this.f26660c = strC;
        if (Utils.o()) {
            CopyOnWriteArrayList<dlo> copyOnWriteArrayListB = ucu.b(uboVar);
            LogUtil.a("FavoritesProvider", "isOversea favorites list size ", Integer.valueOf(copyOnWriteArrayListB.size()));
            e(copyOnWriteArrayListB);
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("FavoritesProvider", "setSleepFavoritesCard marketingApi is null");
            return false;
        }
        Map<Integer, ResourceResultInfo> mapA = ucu.a(uboVar);
        if (uboVar == null || mapA.isEmpty()) {
            this.g.add(Integer.valueOf(this.e));
        } else {
            this.e = uboVar.c();
            this.g.clear();
        }
        this.f26658a.put("FAVORITES_CALL_BACK", new AnonymousClass2(marketingApi, mapA));
        return true;
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider$2, reason: invalid class name */
    public class AnonymousClass2 implements IViewCreatedCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f26664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MarketingApi f26665c;

        AnonymousClass2(MarketingApi marketingApi, Map map) {
            this.f26665c = marketingApi;
            this.f26664b = map;
        }

        @Override // com.huawei.health.knit.section.listener.IViewCreatedCallback
        public void onLayoutUpdate(final LinearLayout linearLayout) {
            LogUtil.a("FavoritesProvider", "onLayoutUpdate");
            if (Looper.myLooper() != Looper.getMainLooper()) {
                final MarketingApi marketingApi = this.f26665c;
                final Map map = this.f26664b;
                HandlerExecutor.c(new Runnable() { // from class: txf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49754c.e(linearLayout, marketingApi, map);
                    }
                });
            } else {
                FavoritesProvider favoritesProvider = FavoritesProvider.this;
                favoritesProvider.c(linearLayout, this.f26665c.getMarketingViewList(favoritesProvider.a(), this.f26664b), FavoritesProvider.this.g);
            }
        }

        public /* synthetic */ void e(LinearLayout linearLayout, MarketingApi marketingApi, Map map) {
            FavoritesProvider favoritesProvider = FavoritesProvider.this;
            favoritesProvider.c(linearLayout, marketingApi.getMarketingViewList(favoritesProvider.a(), map), FavoritesProvider.this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ViewGroup viewGroup, List<View> list, List<Integer> list2) {
        if (viewGroup == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ColumnLinearLayout) {
                map.put(Integer.valueOf(((ColumnLinearLayout) childAt).getResourceBriefPriority()), childAt);
            }
        }
        viewGroup.removeAllViews();
        if (!njy.e(list)) {
            for (View view : list) {
                if (view instanceof ColumnLinearLayout) {
                    map.put(Integer.valueOf(((ColumnLinearLayout) view).getResourceBriefPriority()), view);
                }
            }
        }
        if (!njy.e(list2)) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (map.containsKey(list2.get(i2))) {
                    map.remove(list2.get(i2));
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: txh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FavoritesProvider.c((Integer) obj, (Integer) obj2);
            }
        });
        LogUtil.a("FavoritesProvider", "layoutMap: " + map.toString());
        for (Integer num : arrayList) {
            num.intValue();
            LogUtil.a("FavoritesProvider", "add view");
            viewGroup.addView((View) map.get(num));
        }
    }

    public static /* synthetic */ int c(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    private void e(final CopyOnWriteArrayList<dlo> copyOnWriteArrayList) {
        LogUtil.a("FavoritesProvider", "setSleepFavoritesCard enter");
        this.f26658a.put("FAVORITES_CALL_BACK", new IViewCreatedCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider.5
            @Override // com.huawei.health.knit.section.listener.IViewCreatedCallback
            public void onLayoutUpdate(final LinearLayout linearLayout) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.FavoritesProvider.5.3
                        @Override // java.lang.Runnable
                        public void run() {
                            trd.c(1, linearLayout, (CopyOnWriteArrayList<dlo>) copyOnWriteArrayList);
                        }
                    });
                } else {
                    trd.c(1, linearLayout, (CopyOnWriteArrayList<dlo>) copyOnWriteArrayList);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context a() {
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null) {
            return BaseApplication.b();
        }
        return weakReference.get();
    }

    static class b implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FavoritesProvider> f26669a;

        private b(FavoritesProvider favoritesProvider) {
            this.f26669a = new WeakReference<>(favoritesProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            FavoritesProvider favoritesProvider = this.f26669a.get();
            if (favoritesProvider == null) {
                return;
            }
            if (i != 0 || obj == null) {
                LogUtil.e("FavoritesProvider", "response error");
                return;
            }
            LogUtil.a("FavoritesProvider", "FavoritesUiResponse");
            if (favoritesProvider.b(obj)) {
                favoritesProvider.f.c(favoritesProvider.f26659b);
            }
        }
    }
}
