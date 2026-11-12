package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.algorithm.api.SleepMonitorAlgorithmApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ddb;
import defpackage.ddj;
import defpackage.gzx;
import defpackage.lsl;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionWebview extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer f7972c;
    private HashMap<String, Object> d;
    private LinearLayout e;
    private LinearLayout f;
    private View g;
    private int h;
    private CustomH5ProWebview j;

    public SectionWebview(Context context) {
        this(context, null);
    }

    public SectionWebview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionWebview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7971b = context;
        a();
        return this.g;
    }

    private void a() {
        if (this.g == null) {
            LogUtil.j("SectionWebView", "initView mainView is null, start to inflate");
            View viewInflate = LayoutInflater.from(this.f7971b).inflate(R.layout.section_webview_layout, (ViewGroup) this, false);
            this.g = viewInflate;
            this.f = (LinearLayout) viewInflate.findViewById(R.id.section_webview_ll);
            this.e = (LinearLayout) this.g.findViewById(R.id.webview_title);
            this.f7970a = (HealthTextView) this.g.findViewById(R.id.section_webview_subhead);
            this.j = (CustomH5ProWebview) this.g.findViewById(R.id.section_webview);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public List<Bitmap> getShareBitmap() {
        ArrayList arrayList = new ArrayList();
        if (isSupportShare()) {
            View viewInflate = LayoutInflater.from(this.f7971b).inflate(R.layout.section_webview_share_layout, (ViewGroup) null, false);
            d(viewInflate);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            viewInflate.setPadding(BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue(), 0, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue(), 0);
            viewInflate.measure(View.MeasureSpec.makeMeasureSpec(qrs.q(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qrs.m(), Integer.MIN_VALUE));
            viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
            int height = viewInflate.getHeight();
            int width = viewInflate.getWidth();
            if (height != 0 && width != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                viewInflate.draw(new Canvas(bitmapCreateBitmap));
                arrayList.add(bitmapCreateBitmap);
            }
        }
        return arrayList;
    }

    private void d(View view) {
        LogUtil.a("SectionWebView", "SectionWebview: ", this);
        long startTime = getStartTime();
        long endTime = getEndTime();
        LogUtil.a("SectionWebView", "startTime: ", Long.valueOf(startTime), ", endTime: ", Long.valueOf(endTime));
        Map<String, Integer> mapE = e(startTime, endTime);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.up_sleep_item_left_text);
        HealthTextView healthTextView2 = (HealthTextView) view.findViewById(R.id.up_sleep_item_right_text);
        HealthTextView healthTextView3 = (HealthTextView) view.findViewById(R.id.down_sleep_item_left_text);
        HealthTextView healthTextView4 = (HealthTextView) view.findViewById(R.id.down_sleep_item_right_text);
        Integer num = mapE.get("DreamFrequency");
        qsp.a(healthTextView, this.f7971b.getResources().getQuantityString(R.plurals.IDS_share_dream_talk_sleep, num.intValue(), num), true);
        int iIntValue = mapE.get("DreamDuration").intValue() / 60;
        int iIntValue2 = mapE.get("DreamDuration").intValue() % 60;
        qsp.a(healthTextView2, gzx.c(this.f7971b, R.string.IDS_share_dream_talk_snore_sleep, this.f7971b.getResources().getQuantityString(R.plurals.IDS_sleep_minute, iIntValue, UnitUtil.e(iIntValue, 1, 0)), this.f7971b.getResources().getQuantityString(R.plurals.IDS_sleep_second, iIntValue2, UnitUtil.e(iIntValue2, 1, 0))), true);
        Integer num2 = mapE.get("SnoreFrequency");
        qsp.a(healthTextView3, this.f7971b.getResources().getQuantityString(R.plurals.IDS_share_snore_sleep, num2.intValue(), num2), true);
        int iIntValue3 = mapE.get("SnoreDuration").intValue() / 60;
        int iIntValue4 = mapE.get("SnoreDuration").intValue() % 60;
        qsp.a(healthTextView4, gzx.c(this.f7971b, R.string.IDS_share_dream_talk_snore_sleep, this.f7971b.getResources().getQuantityString(R.plurals.IDS_sleep_minute, iIntValue3, UnitUtil.e(iIntValue3, 1, 0)), this.f7971b.getResources().getQuantityString(R.plurals.IDS_sleep_second, iIntValue4, UnitUtil.e(iIntValue4, 1, 0))), true);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionWebView";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionWebView", "start to bindViewParams, ", this);
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionWebView", "no need to bind");
            return;
        }
        if (qrs.ah(BaseApplication.getContext())) {
            this.e.setVisibility(8);
            this.j.setVisibility(8);
        } else {
            this.d = map;
            qsp.b(this.f7970a, qqw.d((Map) map, "TITLE", ""));
            Consumer consumer = (Consumer) qqw.a(map, "CALL_BACK", (Class<Object>) Consumer.class, (Object) null);
            if (consumer != null) {
                consumer.accept(this.j);
            }
        }
        d();
    }

    private void d() {
        if (this.f7972c == null) {
            Observer observer = new Observer() { // from class: com.huawei.health.knit.section.view.SectionWebview.3
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    Object obj;
                    if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Integer)) {
                        return;
                    }
                    SectionWebview.this.h = ((Integer) obj).intValue();
                    LogUtil.a("SectionWebView", "webview height is: " + SectionWebview.this.h);
                    HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionWebview.3.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ViewGroup.LayoutParams layoutParams = SectionWebview.this.j.getLayoutParams();
                            layoutParams.height = (int) Utils.convertDpToPixel(SectionWebview.this.h);
                            SectionWebview.this.j.setLayoutParams(layoutParams);
                        }
                    });
                }
            };
            this.f7972c = observer;
            ObserverManagerUtil.d(observer, "REFRESH_H5_HEIGHT");
        }
    }

    public static Map<String, Integer> e(long j, long j2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(((SleepMonitorAlgorithmApi) Services.b("SleepMonitor", SleepMonitorAlgorithmApi.class)).querySleepVoiceInfo(j / 1000, j2 / 1000));
        Collections.sort(arrayList, new ddj());
        LogUtil.a("SectionWebView", "sleepVoiceInfoWrappersList size: " + arrayList.size());
        int i = 0;
        int i2 = 0;
        int iB = 0;
        int iB2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ddb.c cVarC = ((ddj) arrayList.get(i3)).c();
            int iE = cVarC.e();
            if (1 == iE && i < 10) {
                iB += cVarC.b();
                i++;
            } else if (2 == iE && i2 < 10) {
                iB2 += cVarC.b();
                i2++;
            } else {
                LogUtil.a("SectionWebView", "not dream and snore");
            }
        }
        map.put("SnoreFrequency", Integer.valueOf(i));
        map.put("DreamFrequency", Integer.valueOf(i2));
        map.put("SnoreDuration", Integer.valueOf(iB));
        map.put("DreamDuration", Integer.valueOf(iB2));
        return map;
    }

    private long getStartTime() {
        return qqw.e((Map) this.d, "SLEEP_START_TIME", lsl.a(lsl.d(System.currentTimeMillis(), -1), 20, 0));
    }

    private long getEndTime() {
        return qqw.e((Map) this.d, "SLEEP_END_TIME", lsl.a(System.currentTimeMillis(), 20, 0));
    }
}
