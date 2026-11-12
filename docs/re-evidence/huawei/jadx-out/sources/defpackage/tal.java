package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.marketing.request.GlobalSearchResult;
import com.huawei.health.marketing.request.HighLight;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.SearchResultFragment;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes43.dex */
public class tal {
    public static void d(Context context, final String str, Map<String, Object> map, final int i) {
        if (str == null) {
            return;
        }
        map.put(str, new OnClickSectionListener() { // from class: tal.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, int i3) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, String str2) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str2) {
                SearchResultFragment searchResultFragmentE;
                if (!str.equals(str2) || (searchResultFragmentE = SearchResultFragment.e()) == null) {
                    return;
                }
                searchResultFragmentE.d(i);
            }
        });
    }

    public static void e(Context context, SectionBean sectionBean, int i) {
        LogUtil.b("SearchProviderUtil", "loadOverallData pageType: ", Integer.valueOf(i));
        SearchResultFragment searchResultFragmentE = SearchResultFragment.e();
        if (searchResultFragmentE == null) {
            sectionBean.c((Object) null);
            return;
        }
        List<GlobalSearchContent> listE = searchResultFragmentE.e(i == 300 ? 206 : i);
        if (njy.e(listE)) {
            sectionBean.c((Object) null);
            return;
        }
        if (i == 206) {
            listE = c(listE, true);
        }
        if (i == 300) {
            listE = c(listE, false);
        }
        if (njy.e(listE)) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(listE);
        }
    }

    public static List<GlobalSearchContent> b(int i) {
        List<GlobalSearchContent> listE;
        ArrayList arrayList = new ArrayList();
        SearchResultFragment searchResultFragmentE = SearchResultFragment.e();
        if (searchResultFragmentE == null || (listE = searchResultFragmentE.e(i)) == null) {
            return arrayList;
        }
        arrayList.addAll(listE);
        return arrayList;
    }

    public static List<GlobalSearchContent> a() {
        ArrayList arrayList = new ArrayList();
        SearchResultFragment searchResultFragmentE = SearchResultFragment.e();
        return searchResultFragmentE == null ? arrayList : searchResultFragmentE.e(301);
    }

    public static boolean d(BaseKnitDataProvider baseKnitDataProvider) {
        Bundle extra = baseKnitDataProvider.getExtra();
        if (extra == null) {
            return false;
        }
        return extra.getBoolean("IS_OVERALL", false);
    }

    public static List<Map<String, Object>> b(int i, int i2, String str, List<String> list, List<String> list2) {
        if (str == null || njy.e(list) || njy.e(list2) || list2.size() != list.size()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i3 = 0; i3 < list2.size(); i3++) {
            arrayList.add(b(i, i2, str, list.get(i3), list2.get(i3)));
        }
        return arrayList;
    }

    public static Map<String, Object> b(int i, int i2, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(ParamConstants.CallbackMethod.ON_SHOW, "1");
        map.put("word", str);
        map.put("category", Integer.valueOf(i));
        map.put("page", Integer.valueOf(i2));
        map.put("id", str2);
        map.put("name", str3);
        return map;
    }

    public static List<GlobalSearchContent> c(List<GlobalSearchContent> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (GlobalSearchContent globalSearchContent : list) {
            if (globalSearchContent != null && ((z && globalSearchContent.getType() != 4) || (!z && globalSearchContent.getType() == 4))) {
                arrayList.add(globalSearchContent);
            }
        }
        return arrayList;
    }

    public static void e(List<GlobalSearchContent> list, int i, boolean z, Context context, boolean z2) {
        if (njy.e(list, i)) {
            LogUtil.d("SearchProviderUtil", "click out out bounds");
            return;
        }
        GlobalSearchContent globalSearchContent = list.get(i);
        if (globalSearchContent == null) {
            LogUtil.d("SearchProviderUtil", "click content is null");
            return;
        }
        if (z) {
            String productDetailUrl = globalSearchContent.getProductDetailUrl();
            LogUtil.b("SearchProviderUtil", "detail url: ", productDetailUrl);
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(e(productDetailUrl));
            }
        }
    }

    public static void c(SectionBean sectionBean, Map<Integer, ResourceResultInfo> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.d("SearchProviderUtil", "marketingResponse is invalid");
            sectionBean.c((Object) null);
        }
    }

    public static void b(SectionBean sectionBean, Map<Integer, ResourceResultInfo> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.d("SearchProviderUtil", "filterResultInfoMap is invalid");
            sectionBean.c((Object) null);
        }
    }

    public static String d(GlobalSearchContent globalSearchContent, int i) {
        if (globalSearchContent == null) {
            return "";
        }
        if (i != 201) {
            if (i != 300) {
                switch (i) {
                    case 204:
                        return globalSearchContent.getActivityName();
                    case 205:
                    case 206:
                        break;
                    default:
                        switch (i) {
                            case a.z /* 208 */:
                            case a.A /* 209 */:
                            case a.C /* 210 */:
                                break;
                            default:
                                return "";
                        }
                        break;
                }
            }
            return globalSearchContent.getName();
        }
        return globalSearchContent.getLessonName();
    }

    public static void c(List<GlobalSearchResult> list, SectionBean sectionBean, Context context, String str, int i) {
        for (GlobalSearchResult globalSearchResult : list) {
            if (globalSearchResult != null && str.equals(globalSearchResult.getCategoryId()) && !njy.e(globalSearchResult.getContent())) {
                sectionBean.c(globalSearchResult.getContent());
                return;
            }
        }
        LogUtil.b("SearchProviderUtil", "no results found, show products in the overall result");
        e(context, sectionBean, i);
    }

    public static String b(GlobalSearchContent globalSearchContent, boolean z) {
        if (globalSearchContent == null || globalSearchContent.getHeatCount() <= 0) {
            LogUtil.e("SearchProviderUtil", "getJoinNumberString content.getJoinNumber()= 0");
            return "";
        }
        if (globalSearchContent.getHeatCount() < 10000) {
            StringBuilder sb = new StringBuilder();
            sb.append(gzx.d(z ? R.plurals.IDS_person_join : R.plurals.IDS_attended_person, (int) globalSearchContent.getHeatCount(), Long.valueOf(globalSearchContent.getHeatCount())));
            sb.append("  ");
            return sb.toString();
        }
        String strE = UnitUtil.e(globalSearchContent.getHeatCount() / 10000.0f, 1, globalSearchContent.getHeatCount() == 10000 ? 0 : 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gzx.d(z ? R.plurals.IDS_join_number : R.plurals.IDS_sleep_music_unit_ten_thousand, (int) (globalSearchContent.getHeatCount() / 1000), strE));
        sb2.append("  ");
        return sb2.toString();
    }

    public static String e(GlobalSearchContent globalSearchContent, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : globalSearchContent.getLabels()) {
            if (ezi.c(str2, str) && i < 3) {
                sb.append(str2);
                sb.append("  ");
                i++;
            }
        }
        return sb.toString();
    }

    public static void b(GlobalSearchContent globalSearchContent, List<String> list, List<String> list2, HashSet<String> hashSet) {
        String description = globalSearchContent.getDescription();
        String strA = a(hashSet);
        boolean zC = ezi.c(description, strA);
        list.add((njy.b(globalSearchContent.getLabels()) && ezi.c(globalSearchContent.getLabels().toString(), strA)) ? e(globalSearchContent, strA) : "");
        if (description.length() > 15 && !ezi.c(description.substring(0, 15), strA)) {
            description = GlobalSearchActivity.b() + "#" + description;
        }
        list2.add(zC ? description : "");
    }

    public static void c(GlobalSearchContent globalSearchContent, HashSet<String> hashSet) {
        if (njy.e(globalSearchContent.getHighLights())) {
            LogUtil.e("SearchProviderUtil", "getHighlightText content.getHighLights() is null");
            return;
        }
        Pattern patternCompile = Pattern.compile("<[a-zA-Z]+.*?>([\\s\\S]*?)</[a-zA-Z]*?>");
        Iterator<HighLight> it = globalSearchContent.getHighLights().iterator();
        while (it.hasNext()) {
            String highlightStr = it.next().getHighlightStr();
            if (!TextUtils.isEmpty(highlightStr)) {
                Matcher matcher = patternCompile.matcher(highlightStr);
                while (matcher.find()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        hashSet.add(matcher.group(1));
                    }
                }
            }
        }
    }

    public static String a(HashSet<String> hashSet) {
        if (njy.e(hashSet)) {
            hashSet.add(GlobalSearchActivity.b());
            LogUtil.e("SearchProviderUtil", "content highlightText is null ");
        }
        LogUtil.b("SearchProviderUtil", "getHighlightText= ", hashSet.toString());
        return hashSet.toString();
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append("pullfrom=globalsearch");
        return sb.toString();
    }
}
