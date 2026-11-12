package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.util.Consumer;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.bff.impl.IResponseParseCallback;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.views.ResourceBriefInfoOwnable;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class foi {
    public static void b(JSONObject jSONObject, List<Integer> list, boolean z, BasePageResTrigger basePageResTrigger, final Consumer<List<SectionBean>> consumer, final List<View> list2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jSONObject, list, z, basePageResTrigger.getPageType(), basePageResTrigger.getResPosId(), new IResponseParseCallback() { // from class: foi.5
            @Override // com.huawei.health.knit.bff.impl.IResponseParseCallback
            public void onCompleted(List<SectionBean> list3) {
                foi.d(list3, list2);
                consumer.accept(list3);
                LogUtil.a("ResParseUtil", "bff parse time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<SectionBean> list, List<View> list2) {
        if (list2 == null || njy.e(list)) {
            return;
        }
        list2.clear();
        for (SectionBean sectionBean : list) {
            if (sectionBean != null && sectionBean.q() != null) {
                list2.add(sectionBean.q());
            }
        }
    }

    public static List<SectionBean> a(List<ResourceBriefInfo> list, List<View> list2, boolean z, int i, int i2) {
        ResourceBriefInfoOwnable resourceBriefInfoOwnable;
        int i3;
        View view;
        LogUtil.a("ResParseUtil", "parseMarketingData");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ResourceBriefInfo resourceBriefInfo = list.get(i4);
            if (resourceBriefInfo != null) {
                if (njy.e(list2)) {
                    resourceBriefInfoOwnable = null;
                    break;
                }
                Iterator<View> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        resourceBriefInfoOwnable = null;
                        break;
                    }
                    KeyEvent.Callback callback = (View) it.next();
                    if (callback instanceof ResourceBriefInfoOwnable) {
                        resourceBriefInfoOwnable = (ResourceBriefInfoOwnable) callback;
                        if (resourceBriefInfoOwnable.isOwnedByBriefInfo(resourceBriefInfo)) {
                            LogUtil.a("ResParseUtil", "isOwnedByBriefInfo");
                            break;
                        }
                    }
                }
                if (resourceBriefInfoOwnable != null) {
                    int resourcePositionId = resourceBriefInfoOwnable.getResourcePositionId();
                    view = (View) resourceBriefInfoOwnable;
                    i3 = resourcePositionId;
                } else {
                    i3 = i2;
                    view = null;
                }
                arrayList.add(new SectionBean(resourceBriefInfo, view, i, i3, z));
            }
        }
        return arrayList;
    }

    private static void a(JSONObject jSONObject, List<Integer> list, boolean z, int i, int i2, final IResponseParseCallback iResponseParseCallback) {
        final ArrayList arrayList = new ArrayList();
        String str = "ResParseUtil";
        if (jSONObject == null) {
            LogUtil.a("ResParseUtil", "response is null");
            iResponseParseCallback.onCompleted(arrayList);
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.a("ResParseUtil", "data is null");
            iResponseParseCallback.onCompleted(arrayList);
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("sections");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            int length = jSONArrayOptJSONArray.length();
            int i3 = 0;
            int i4 = 9999;
            while (i3 < length) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject2 == null) {
                    LogUtil.a(str, "item is null");
                } else {
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("data");
                    if (jSONObjectOptJSONObject3 == null) {
                        LogUtil.a(str, "sectionData is null");
                    } else {
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("allData");
                        if (jSONObjectOptJSONObject4 == null) {
                            LogUtil.a(str, "allData is null: i = ", Integer.valueOf(i3));
                        } else {
                            int iOptInt = jSONObjectOptJSONObject2.optInt("templateType");
                            arrayList.add(new SectionBean(iOptInt, i4, i, fog.c(i, iOptInt), i2, jSONObjectOptJSONObject4));
                            i4--;
                        }
                        i3++;
                        str = str;
                    }
                }
                i3++;
                str = str;
            }
        }
        d(jSONObjectOptJSONObject.optJSONObject("configurationData"), list, z, i, i2, new IResponseParseCallback() { // from class: foi.4
            @Override // com.huawei.health.knit.bff.impl.IResponseParseCallback
            public void onCompleted(List<SectionBean> list2) {
                if (!njy.e(list2)) {
                    arrayList.addAll(foi.e(list2, arrayList));
                } else {
                    LogUtil.a("ResParseUtil", "marketingSectionBeans is empty");
                }
                LogUtil.a("ResParseUtil", "SectionBean size: ", Integer.valueOf(arrayList.size()));
                iResponseParseCallback.onCompleted(arrayList);
            }
        });
    }

    private static void d(JSONObject jSONObject, final List<Integer> list, final boolean z, final int i, final int i2, final IResponseParseCallback iResponseParseCallback) {
        LogUtil.a("ResParseUtil", "getMarketingSectionBeanList");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            iResponseParseCallback.onCompleted(null);
            return;
        }
        Map<Integer, ResourceResultInfo> marketingResource = marketingApi.parseMarketingResource(jSONObject, list);
        if (marketingResource == null || marketingResource.isEmpty()) {
            LogUtil.e("ResParseUtil", "sectionMap is empty");
            iResponseParseCallback.onCompleted(null);
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(marketingResource);
        if (mapFilterMarketingRules == null) {
            LogUtil.e("ResParseUtil", "no section map for " + list, ", after ruling");
            iResponseParseCallback.onCompleted(null);
            return;
        }
        final HashMap map = new HashMap(mapFilterMarketingRules);
        HandlerExecutor.b(new Runnable() { // from class: foi.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                List<View> marketingViewList = marketingApi.getMarketingViewList(BaseApplication.getContext(), map);
                StringBuilder sb = new StringBuilder("views: ");
                sb.append(marketingViewList != null ? marketingViewList.size() : -1);
                LogUtil.a("ResParseUtil", sb.toString());
                for (Integer num : list) {
                    int iIntValue = num.intValue();
                    ResourceResultInfo resourceResultInfo = (ResourceResultInfo) map.get(num);
                    if (resourceResultInfo == null) {
                        LogUtil.e("ResParseUtil", "no resourceResultInfo for " + iIntValue);
                    } else {
                        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                        if (njy.e(resources)) {
                            LogUtil.e("ResParseUtil", "no briefInfoList for " + iIntValue);
                        } else {
                            LogUtil.a("ResParseUtil", "resPosId: ", num);
                            Iterator<ResourceBriefInfo> it = resources.iterator();
                            while (it.hasNext()) {
                                LogUtil.a("ResParseUtil", "resourceBriefInfo: ", it.next().toString());
                            }
                            List<SectionBean> listA = foi.a(resources, marketingViewList, z, i, i2);
                            LogUtil.a("ResParseUtil", "request successfully sectionBeans size = ", Integer.valueOf(listA.size()));
                            arrayList.addAll(listA);
                        }
                    }
                }
                iResponseParseCallback.onCompleted(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<SectionBean> e(List<SectionBean> list, List<SectionBean> list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (SectionBean sectionBean : list) {
            Iterator<SectionBean> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    SectionBean next = it.next();
                    if (sectionBean.l() == next.l() && sectionBean.s()) {
                        next.b(sectionBean.s());
                        break;
                    }
                } else {
                    arrayList.add(sectionBean);
                    break;
                }
            }
        }
        return arrayList;
    }
}
