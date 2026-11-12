package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.marketing.datatype.ColumRecommendInfo;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListContent;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<Integer> f34697b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34698c;
    private ResourceBriefInfo d;
    private long e;
    private String i;

    public fxm(int i, String str, ResourceBriefInfo resourceBriefInfo) {
        this.f34698c = i;
        this.i = str;
        this.d = resourceBriefInfo;
        if (resourceBriefInfo != null) {
            this.f34696a = resourceBriefInfo.getResourceId();
        }
        this.e = System.currentTimeMillis();
    }

    public void e(final String str, final String str2, final ColumRecommendInfo columRecommendInfo, final int i, final View view) {
        HandlerExecutor.c(new Runnable() { // from class: fxm.5
            @Override // java.lang.Runnable
            public void run() {
                fxm.this.b(str, str2, columRecommendInfo, i, view);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, ColumRecommendInfo columRecommendInfo, int i, View view) {
        if (view == null || e(str, str2, view)) {
            return;
        }
        qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) new b(view, str, str2, i, columRecommendInfo));
        qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) new b(view, str, str2, i, columRecommendInfo));
    }

    public boolean e(String str, String str2, View view) {
        return this.f34697b.contains(Integer.valueOf(Objects.hash(str, str2, view)));
    }

    public void e(String str) {
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(this.f34698c));
        map.put("resourceId", this.f34696a);
        map.put("resourceName", this.i + " " + str);
        map.put("event", 3);
        map.put("algId", "");
        map.put("smartRecommend", false);
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.e));
        this.e = System.currentTimeMillis();
        LogUtil.a("MarketingBiUtil", "marketing biEvent: mPositionId: ", Integer.valueOf(this.f34698c), ", mResourceName: ", str, ", biMap: ", map.toString());
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f34702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ColumRecommendInfo f34703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f34704c;
        private final String d;
        private final String j;

        public b(View view, String str, String str2, int i, ColumRecommendInfo columRecommendInfo) {
            this.f34702a = new WeakReference<>(view);
            this.d = str2;
            this.j = str;
            this.f34704c = i;
            this.f34703b = columRecommendInfo;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = this.f34702a.get();
            if (view == null) {
                return;
            }
            if (!fxm.this.e(this.j, this.d, view)) {
                fxm.this.a(this.d, view, this.j, this.f34704c, this.f34703b);
            } else {
                qsp.b(view, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            View view = this.f34702a.get();
            if (view == null) {
                return;
            }
            if (!fxm.this.e(this.j, this.d, view)) {
                fxm.this.a(this.d, view, this.j, this.f34704c, this.f34703b);
            } else {
                qsp.c(view, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, View view, String str2, int i, ColumRecommendInfo columRecommendInfo) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        if (view.getLocalVisibleRect(rect) && b(rect, height, width) && !e(str2, str, view)) {
            this.f34697b.add(Integer.valueOf(Objects.hash(str2, str, view)));
            if (columRecommendInfo instanceof SingleCourseRecommendListStandardContent) {
                d(1, "", (SingleCourseRecommendListStandardContent) columRecommendInfo, i);
            } else {
                b(1, str, str2, i, columRecommendInfo);
            }
        }
    }

    private boolean b(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.right >= Math.min(i2 / 2, 200) && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min((i * 2) / 3, 400);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(final int i, final String str, final String str2, final int i2, final ColumRecommendInfo columRecommendInfo) {
        if (this.d == null) {
            LogUtil.a("MarketingBiUtil", "biEvent resourceBriefInfo is null, return");
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fxj
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(i, str, str2, i2, columRecommendInfo);
                }
            });
            return;
        }
        String resourceId = this.d.getResourceId();
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(this.f34698c));
        map.put("resourceName", this.i + " " + str2);
        map.put("resourceId", resourceId);
        map.put("event", Integer.valueOf(i));
        if (i == 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.e));
            this.e = jCurrentTimeMillis;
        }
        map.put("itemCardName", str);
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        LogUtil.a("MarketingBiUtil", "marketing biEvent: mPositionId: ", Integer.valueOf(this.f34698c), ", mResourceName: ", str2, ", biMap: ", map.toString());
        if (columRecommendInfo != null) {
            map.put("itemId", columRecommendInfo.getItemId());
            map.put("algId", columRecommendInfo.getAlgId());
            map.put("smartRecommend", Boolean.valueOf(columRecommendInfo.isSmartRecommend()));
            lmf.d().e(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, columRecommendInfo.getAbInfo(), 0);
            return;
        }
        map.put("algId", "");
        map.put("smartRecommend", Boolean.valueOf(this.d.getSmartRecommend()));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public void d(int i, String str, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, int i2) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        if (i == 2) {
            map.put(FunctionSetBeanReader.BI_ELEMENT, str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.e));
            this.e = jCurrentTimeMillis;
        }
        map.put("resourcePositionId", Integer.valueOf(this.f34698c));
        map.put("resourceId", this.d.getResourceId());
        map.put("resourceName", this.d.getResourceName());
        map.put("resourceTopic", this.i);
        map.put("itemTopic", singleCourseRecommendListStandardContent.getTheme());
        map.put("subItemTopic", singleCourseRecommendListStandardContent.getSubTheme());
        map.put("moreEntryName", singleCourseRecommendListStandardContent.getButtonDescription());
        map.put("itemId", singleCourseRecommendListStandardContent.getItemId());
        map.put("algId", singleCourseRecommendListStandardContent.getAlgId());
        map.put("smartRecommend", Boolean.valueOf(singleCourseRecommendListStandardContent.isSmartRecommend()));
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        lmf.d().e(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, singleCourseRecommendListStandardContent.getAbInfo(), 0);
    }

    public void b(View view, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, SingleCourseRecommendListContent singleCourseRecommendListContent, int i) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        if (view.getLocalVisibleRect(rect) && b(rect, height, width) && !e(singleCourseRecommendListStandardContent.getTheme(), singleCourseRecommendListContent.getTheme(), view)) {
            this.f34697b.add(Integer.valueOf(Objects.hash(singleCourseRecommendListStandardContent.getTheme(), singleCourseRecommendListContent.getTheme(), view)));
            d(1, singleCourseRecommendListStandardContent, singleCourseRecommendListContent, i);
        }
    }

    public void d(int i, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, SingleCourseRecommendListContent singleCourseRecommendListContent, int i2) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        if (i == 2) {
            map.put(FunctionSetBeanReader.BI_ELEMENT, "e3");
            long jCurrentTimeMillis = System.currentTimeMillis();
            map.put("durationTime", Long.valueOf(jCurrentTimeMillis - this.e));
            this.e = jCurrentTimeMillis;
        }
        map.put("resourcePositionId", Integer.valueOf(this.f34698c));
        map.put("resourceId", this.d.getResourceId());
        map.put("resourceName", this.d.getResourceName());
        map.put("resourceTopic", this.i);
        map.put("itemTopic", singleCourseRecommendListStandardContent.getTheme());
        map.put("subItemTopic", singleCourseRecommendListStandardContent.getSubTheme());
        map.put("moreEntryName", singleCourseRecommendListStandardContent.getButtonDescription());
        map.put("itemCardName", singleCourseRecommendListContent.getTheme());
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("itemId", singleCourseRecommendListContent.getItemId());
        map.put("algId", singleCourseRecommendListContent.getAlgId());
        map.put("smartRecommend", Boolean.valueOf(singleCourseRecommendListContent.isSmartRecommend()));
        lmf.d().e(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, singleCourseRecommendListContent.getAbInfo(), 0);
    }
}
