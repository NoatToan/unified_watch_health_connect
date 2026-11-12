package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.section.view.BaseBiItemView;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.SingleTextContent;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class gvi {
    private static final Map<Integer, String> e = new HashMap<Integer, String>() { // from class: gvi.2
        {
            put(200, AnalyticsValue.SEARCH_2130058.value());
            put(201, AnalyticsValue.SEARCH_2130059.value());
            put(203, AnalyticsValue.SEARCH_2130060.value());
            put(206, AnalyticsValue.SEARCH_2130062.value());
            put(204, AnalyticsValue.SEARCH_2130063.value());
            put(300, AnalyticsValue.SEARCH_2130059.value());
        }
    };
    private static final Map<Integer, String> d = new HashMap<Integer, String>() { // from class: gvi.4
        {
            put(200, AnalyticsValue.SEARCH_2130065.value());
            put(201, AnalyticsValue.SEARCH_2130066.value());
            put(203, AnalyticsValue.SEARCH_2130067.value());
            put(206, AnalyticsValue.SEARCH_2130069.value());
            put(204, AnalyticsValue.SEARCH_2130070.value());
            put(300, AnalyticsValue.SEARCH_2130066.value());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f36082c = new HashMap<Integer, String>() { // from class: gvi.5
        {
            put(200, AnalyticsValue.SEARCH_2130078.value());
            put(201, AnalyticsValue.SEARCH_2130079.value());
            put(203, AnalyticsValue.SEARCH_2130080.value());
            put(206, AnalyticsValue.SEARCH_2130082.value());
            put(204, AnalyticsValue.SEARCH_2130083.value());
            put(300, AnalyticsValue.SEARCH_2130079.value());
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f36081b = new HashMap<Integer, String>() { // from class: gvi.1
        {
            put(200, AnalyticsValue.SEARCH_2130085.value());
            put(201, AnalyticsValue.SEARCH_2130086.value());
            put(203, AnalyticsValue.SEARCH_2130087.value());
            put(206, AnalyticsValue.SEARCH_2130089.value());
            put(204, AnalyticsValue.SEARCH_2130090.value());
            put(300, AnalyticsValue.SEARCH_2130086.value());
            put(Integer.valueOf(a.z), AnalyticsValue.SEARCH_2130095.value());
            put(Integer.valueOf(a.A), AnalyticsValue.SEARCH_2130096.value());
        }
    };

    public static void a(Context context, int i, int i2, InputBoxTemplate inputBoxTemplate) {
        if (i2 == 1) {
            a(1, i, inputBoxTemplate);
            d(context, i, inputBoxTemplate);
        } else if (i2 == 2) {
            a(2, i, inputBoxTemplate);
            c(context, i, inputBoxTemplate);
        } else {
            LogUtil.j("SearchBIUtil", "biForSearchView event error");
        }
    }

    public static void d(Context context, int i, InputBoxTemplate inputBoxTemplate) {
        Map<String, Object> mapA = a();
        e(mapA, inputBoxTemplate);
        mapA.put("positionId", Integer.valueOf(i));
        e(context, AnalyticsValue.SEARCH_2130050.value(), mapA, 0);
    }

    public static void a(int i, int i2, InputBoxTemplate inputBoxTemplate) {
        if (inputBoxTemplate == null) {
            LogUtil.a("SearchBIUtil", "marketingBiEvent template is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(i2));
        map.put("resourceName", inputBoxTemplate.getResourceName());
        map.put("resourceId", inputBoxTemplate.getResourceId());
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", inputBoxTemplate.getTheme());
        map.put("itemId", inputBoxTemplate.getItemId());
        map.put("writingId", inputBoxTemplate.getWritingId());
        map.put("algId", inputBoxTemplate.getAlgId());
        map.put("smartRecommend", Boolean.valueOf(inputBoxTemplate.isSmartRecommend()));
        LogUtil.a("SearchBIUtil", "eventId: ", Integer.valueOf(i), " biMap: ", map);
        lmf.d().e(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, inputBoxTemplate.getAbInfo(), 0);
    }

    public static void d(Context context) {
        e(context, AnalyticsValue.SEARCH_2130051.value(), a(), 0);
    }

    public static void c(Context context, InputBoxTemplate inputBoxTemplate) {
        Map<String, Object> mapA = a();
        e(mapA, inputBoxTemplate);
        e(context, AnalyticsValue.SEARCH_2130052.value(), mapA, 0);
    }

    public static void e(Context context, String str) {
        Map<String, Object> mapA = a();
        mapA.put("theme", str);
        e(context, AnalyticsValue.SEARCH_2130053.value(), mapA, 0);
    }

    public static void d(Context context, SingleTextContent singleTextContent) {
        Map<String, Object> mapA = a();
        a(mapA, singleTextContent);
        e(context, AnalyticsValue.SEARCH_2130054.value(), mapA, 0);
    }

    public static void d(Context context, SingleGridContent singleGridContent) {
        Map<String, Object> mapA = a();
        d(mapA, singleGridContent);
        e(context, AnalyticsValue.SEARCH_2130055.value(), mapA, 0);
    }

    public static void b(Context context, String str) {
        Map<String, Object> mapA = a();
        mapA.put("word", str);
        e(context, AnalyticsValue.SEARCH_2130056.value(), mapA, 0);
    }

    public static void c(Context context, int i) {
        Map<String, Object> mapA = a();
        mapA.put("size", Integer.valueOf(i));
        e(context, AnalyticsValue.SEARCH_2130057.value(), mapA, 0);
    }

    public static void e(Context context, int i) {
        e(context, e.get(Integer.valueOf(i)), a(), 0);
    }

    public static void e(Context context, String str, Set<Integer> set) {
        Map<String, Object> mapA = a();
        mapA.put("event", 0);
        mapA.put("word", str);
        mapA.put("category", new ArrayList(set));
        e(context, AnalyticsValue.SEARCH_2130094.value(), mapA, 0);
    }

    public static void e(Context context, Map<String, Object> map) {
        if (map.get("category") instanceof Integer) {
            String str = d.get(Integer.valueOf(map.get("page") instanceof Integer ? ((Integer) map.get("page")).intValue() : 0));
            if (str == null) {
                return;
            }
            map.remove("page");
            e(context, str, map, 0);
        }
    }

    public static void c(Context context, int i, InputBoxTemplate inputBoxTemplate) {
        Map<String, Object> mapC = c();
        e(mapC, inputBoxTemplate);
        mapC.put("positionId", Integer.valueOf(i));
        e(context, AnalyticsValue.SEARCH_2130072.value(), mapC, 0);
    }

    public static void b(Context context, InputBoxTemplate inputBoxTemplate) {
        Map<String, Object> mapC = c();
        e(mapC, inputBoxTemplate);
        e(context, AnalyticsValue.SEARCH_2130073.value(), mapC, 0);
    }

    public static void c(Context context, String str) {
        Map<String, Object> mapC = c();
        mapC.put("theme", str);
        e(context, AnalyticsValue.SEARCH_2130074.value(), mapC, 0);
    }

    public static void e(Context context, SingleTextContent singleTextContent) {
        Map<String, Object> mapC = c();
        a(mapC, singleTextContent);
        e(context, AnalyticsValue.SEARCH_2130075.value(), mapC, 0);
    }

    public static void c(Context context, SingleGridContent singleGridContent) {
        Map<String, Object> mapC = c();
        d(mapC, singleGridContent);
        e(context, AnalyticsValue.SEARCH_2130076.value(), mapC, 0);
    }

    public static void d(Context context, String str) {
        Map<String, Object> mapC = c();
        mapC.put("theme", str);
        e(context, AnalyticsValue.SEARCH_2130077.value(), mapC, 0);
    }

    public static void a(Context context, String str, int i) {
        String str2 = f36082c.get(Integer.valueOf(i));
        Map<String, Object> mapC = c();
        e(context, str2, mapC, 0);
        mapC.put("event", 1);
        mapC.put("word", str);
        mapC.put("category", Integer.valueOf(i));
        e(context, AnalyticsValue.SEARCH_2130094.value(), mapC, 0);
    }

    public static void d(Context context, String str, int i, String str2, String str3, boolean z) {
        Map<String, Object> mapC = c();
        mapC.put("event", 2);
        mapC.put("word", str);
        mapC.put("category", Integer.valueOf(i));
        mapC.put("id", str2);
        mapC.put("name", str3);
        e(context, z ? AnalyticsValue.SEARCH_2130085.value() : f36081b.get(Integer.valueOf(i)), mapC, 0);
        e(context, AnalyticsValue.SEARCH_2130094.value(), mapC, 0);
    }

    public static void b(Context context, String str, String str2, String str3) {
        Map<String, Object> mapC = c();
        mapC.put("word", str);
        mapC.put("category", 301);
        mapC.put("id", str2);
        mapC.put("name", str2);
        mapC.put("url", str3);
        e(context, AnalyticsValue.SEARCH_2130085.value(), mapC, 0);
    }

    public static void a(Context context, String str) {
        Map<String, Object> mapC = c();
        mapC.put("word", str);
        e(context, AnalyticsValue.SEARCH_2130092.value(), mapC, 0);
    }

    private static void e(final Context context, final String str, final Map<String, Object> map, final int i) {
        if (str == null || map == null) {
            return;
        }
        LogUtil.a("SearchBIUtil", "eventId: ", str, " eventMap: ", map);
        ThreadPoolManager.c().execute(new Runnable() { // from class: gvi.3
            @Override // java.lang.Runnable
            public void run() {
                lmf.d().c(context, str, map, i);
            }
        });
    }

    private static Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put(ParamConstants.CallbackMethod.ON_SHOW, "1");
        return map;
    }

    private static Map<String, Object> c() {
        HashMap map = new HashMap();
        map.put("click", "1");
        return map;
    }

    private static void e(Map<String, Object> map, InputBoxTemplate inputBoxTemplate) {
        if (inputBoxTemplate == null) {
            return;
        }
        map.put("theme", inputBoxTemplate.getTheme());
        map.put("linkType", inputBoxTemplate.getLinkType());
        map.put("linkValue", inputBoxTemplate.getLinkValue());
    }

    private static void a(Map<String, Object> map, SingleTextContent singleTextContent) {
        if (singleTextContent == null) {
            return;
        }
        map.put("theme", singleTextContent.getTheme());
        map.put("marketingIcon", singleTextContent.getMarketingIcon());
        map.put("linkType", singleTextContent.getLinkType());
        map.put("linkValue", singleTextContent.getLinkValue());
    }

    private static void d(Map<String, Object> map, SingleGridContent singleGridContent) {
        if (singleGridContent == null) {
            return;
        }
        map.put("theme", singleGridContent.getTheme());
        map.put("description", singleGridContent.getDescription());
        map.put("category", singleGridContent.getItemCategory());
        map.put("linkValue", singleGridContent.getLinkValue());
    }

    public static String b(int i) {
        return "BI_" + i;
    }

    public static Observer e(final HealthRecycleView healthRecycleView) {
        return new Observer() { // from class: gvi.6
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                RecyclerView.LayoutManager layoutManager = healthRecycleView.getLayoutManager();
                int itemCount = layoutManager.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    View viewFindViewByPosition = layoutManager.findViewByPosition(i);
                    if (viewFindViewByPosition instanceof BaseBiItemView) {
                        Rect rect = new Rect();
                        viewFindViewByPosition.getLocalVisibleRect(rect);
                        if (rect.top == 0 && rect.bottom >= viewFindViewByPosition.getHeight() / 2) {
                            ((BaseBiItemView) viewFindViewByPosition).c();
                        }
                    }
                }
            }
        };
    }
}
