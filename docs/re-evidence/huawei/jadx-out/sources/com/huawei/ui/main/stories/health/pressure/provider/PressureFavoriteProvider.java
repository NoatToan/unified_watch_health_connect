package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.listener.IViewCreatedCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.stories.health.pressure.provider.PressureFavoriteProvider;
import defpackage.fua;
import defpackage.njy;
import defpackage.nuv;
import defpackage.ubo;
import defpackage.ucu;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class PressureFavoriteProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28014c;
    private WeakReference<Context> e;
    private SectionBean h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28013b = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f28012a = Collections.synchronizedList(new ArrayList(1));
    private HashMap<String, Object> d = new HashMap<>();

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        if (fua.t()) {
            this.e = new WeakReference<>(context);
            this.h = sectionBean;
            this.d.clear();
            d();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        LogUtil.a("PressureFavoriteProvider", "resume");
        if (fua.t()) {
            this.d.clear();
            d();
        }
    }

    private void d() {
        ucu.a(3, new c());
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap map, Object obj) {
        map.putAll(this.d);
        LogUtil.a("PressureFavoriteProvider", "outParams: " + map.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        String strC;
        LogUtil.a("PressureFavoriteProvider", "setSleepFavoritesCard");
        ubo uboVar = obj instanceof ubo ? (ubo) obj : null;
        if (uboVar == null) {
            strC = "";
        } else {
            strC = nuv.c(uboVar.toString());
        }
        String str = this.f28013b;
        if (str != null && str.equals(strC)) {
            LogUtil.a("PressureFavoriteProvider", "setSleepFavoritesCard same content");
            return;
        }
        this.f28013b = strC;
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("PressureFavoriteProvider", "setSleepFavoritesCard marketingApi is null");
            return;
        }
        final Map<Integer, ResourceResultInfo> mapD = ucu.d(uboVar);
        if (uboVar == null || mapD.isEmpty()) {
            this.f28012a.add(Integer.valueOf(this.f28014c));
        } else {
            this.f28014c = uboVar.c();
            this.f28012a.clear();
        }
        this.d.put("FAVORITES_CALL_BACK", new IViewCreatedCallback() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureFavoriteProvider.1
            @Override // com.huawei.health.knit.section.listener.IViewCreatedCallback
            public void onLayoutUpdate(final LinearLayout linearLayout) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.pressure.provider.PressureFavoriteProvider.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            PressureFavoriteProvider.this.a(linearLayout, marketingApi.getMarketingViewList(PressureFavoriteProvider.this.e(), mapD), PressureFavoriteProvider.this.f28012a);
                        }
                    });
                } else {
                    PressureFavoriteProvider pressureFavoriteProvider = PressureFavoriteProvider.this;
                    pressureFavoriteProvider.a(linearLayout, marketingApi.getMarketingViewList(pressureFavoriteProvider.e(), mapD), PressureFavoriteProvider.this.f28012a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context e() {
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null) {
            return BaseApplication.b();
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup, List<View> list, List<Integer> list2) {
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
                map.remove(list2.get(i2));
            }
        }
        ArrayList<Integer> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new Comparator() { // from class: uyo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PressureFavoriteProvider.e((Integer) obj, (Integer) obj2);
            }
        });
        LogUtil.a("PressureFavoriteProvider", "layoutMap: " + map.toString());
        for (Integer num : arrayList) {
            num.intValue();
            LogUtil.a("PressureFavoriteProvider", "add view");
            viewGroup.addView((View) map.get(num));
        }
    }

    public static /* synthetic */ int e(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    static class c implements CommonUiBaseResponse {
        private final WeakReference<PressureFavoriteProvider> e;

        private c(PressureFavoriteProvider pressureFavoriteProvider) {
            this.e = new WeakReference<>(pressureFavoriteProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            PressureFavoriteProvider pressureFavoriteProvider = this.e.get();
            if (pressureFavoriteProvider == null) {
                return;
            }
            LogUtil.a("PressureFavoriteProvider", "FavoritesUiResponse");
            pressureFavoriteProvider.c(obj);
            pressureFavoriteProvider.h.c(new Object());
        }
    }
}
