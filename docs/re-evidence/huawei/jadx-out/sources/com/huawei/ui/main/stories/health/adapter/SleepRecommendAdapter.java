package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.MultiGridsTemplate;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.request.ActivityInfoListFactory;
import com.huawei.health.marketing.request.RespSleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfo;
import com.huawei.health.marketing.request.SleepAudioInfoApi;
import com.huawei.health.marketing.request.SleepAudioInfoReq;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.coq;
import defpackage.fxl;
import defpackage.haa;
import defpackage.lsx;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.yls;
import health.compact.a.Services;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class SleepRecommendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27752a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MultiGridsTemplate f27754c;
    private Context d;
    private long f;
    private long h;
    private int i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SingleGridContent> f27753b = new ArrayList();
    private List<SingleGridContent> j = new ArrayList();
    private int e = -1;
    private Set<View> g = new HashSet();

    public SleepRecommendAdapter(Context context) {
        this.d = context;
    }

    public void c(int i, final MultiGridsTemplate multiGridsTemplate, int i2, List<RcmItem> list) {
        this.f27752a = i;
        this.i = i2;
        this.f27754c = multiGridsTemplate;
        e(i, multiGridsTemplate.getGridContents());
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                SleepRecommendAdapter.this.e(multiGridsTemplate.getGridContents());
            }
        });
        this.h = SystemClock.elapsedRealtime();
    }

    private void e(int i, List<SingleGridContent> list) {
        LogUtil.a("SleepRecommendAdapter", "updateData, gridContents: ", list.toString());
        this.f27753b.clear();
        this.j.clear();
        if (i == 21) {
            this.e = 1;
            this.f27753b.addAll(new ArrayList(list));
        } else if (i == 20) {
            this.e = 2;
            this.j.addAll(new ArrayList(list));
        } else {
            this.e = -1;
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter.5
                @Override // java.lang.Runnable
                public void run() {
                    SleepRecommendAdapter.this.e();
                }
            });
        } else {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<SingleGridContent> list) {
        LogUtil.a("SleepRecommendAdapter", "requestNumber");
        if (coq.d(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            SingleGridContent singleGridContent = list.get(i);
            if (singleGridContent != null && !TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
                String dynamicDataId = singleGridContent.getDynamicDataId();
                if (i == list.size() - 1) {
                    sb.append(dynamicDataId);
                } else {
                    sb.append(dynamicDataId);
                    sb.append(",");
                }
            }
        }
        String string = sb.toString();
        LogUtil.a("SleepRecommendAdapter", "ids: ", string);
        d(string, list);
    }

    private void d(String str, List<SingleGridContent> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SleepAudioInfoReq sleepAudioInfoReq = new SleepAudioInfoReq();
        sleepAudioInfoReq.setIds(str);
        sleepAudioInfoReq.setPageNo("1");
        sleepAudioInfoReq.setPageSize("100");
        ActivityInfoListFactory activityInfoListFactory = new ActivityInfoListFactory(BaseApplication.getContext());
        Map<String, Object> body = activityInfoListFactory.getBody(sleepAudioInfoReq);
        body.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        String strC = ofe.c(body);
        SleepAudioInfoApi sleepAudioInfoApi = (SleepAudioInfoApi) oet.d().e(SleepAudioInfoApi.class);
        if (sleepAudioInfoApi == null) {
            return;
        }
        e(sleepAudioInfoReq, activityInfoListFactory, strC, sleepAudioInfoApi, list);
    }

    private void e(SleepAudioInfoReq sleepAudioInfoReq, ParamsFactory paramsFactory, String str, SleepAudioInfoApi sleepAudioInfoApi, List<SingleGridContent> list) {
        try {
            Response<RespSleepAudioInfo> responseExecute = sleepAudioInfoApi.getSleepAudioList(sleepAudioInfoReq.getUrl(), paramsFactory.getHeaders(), str).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("SleepRecommendAdapter", "requestSleepAudioData response is OK.");
                RespSleepAudioInfo body = responseExecute.getBody();
                if (body == null) {
                    LogUtil.j("SleepRecommendAdapter", "requestSleepAudioData result is null");
                    return;
                }
                List<SleepAudioInfo> sleepAudios = body.getSleepAudios();
                if (body.getResultCode() == 0 && !coq.d(sleepAudios)) {
                    for (SingleGridContent singleGridContent : list) {
                        if (singleGridContent != null) {
                            String dynamicDataId = singleGridContent.getDynamicDataId();
                            if (!TextUtils.isEmpty(dynamicDataId)) {
                                for (SleepAudioInfo sleepAudioInfo : sleepAudios) {
                                    if (sleepAudioInfo != null && TextUtils.equals(String.valueOf(sleepAudioInfo.getId()), dynamicDataId)) {
                                        singleGridContent.setHeatCount(sleepAudioInfo.getHeatCount());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    e(this.f27752a, list);
                    return;
                }
                LogUtil.j("SleepRecommendAdapter", "requestSleepAudioData result is error.");
                return;
            }
            LogUtil.a("SleepRecommendAdapter", "requestSleepAudioData response is fail.");
        } catch (IOException unused) {
            LogUtil.j("SleepRecommendAdapter", "requestSleepAudioData exception.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new a(LayoutInflater.from(this.d).inflate(R.layout.sleep_single_item, viewGroup, false));
        }
        if (i == 2) {
            return new c(LayoutInflater.from(this.d).inflate(R.layout.sleep_series_item, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder == null) {
            LogUtil.a("SleepRecommendAdapter", "holder is null");
            return;
        }
        if (viewHolder instanceof a) {
            LogUtil.a("SleepRecommendAdapter", "RecommendCourseViewHolder");
            if (yls.e(this.f27753b, i)) {
                LogUtil.a("SleepRecommendAdapter", "position is invalid: ", Integer.valueOf(i));
                return;
            }
            a aVar = (a) viewHolder;
            aVar.itemView.setLayoutParams(c(aVar.d.getLayoutParams(), i));
            a(aVar, i);
            b(aVar.itemView, i);
            return;
        }
        if (viewHolder instanceof c) {
            LogUtil.a("SleepRecommendAdapter", "RecommendSeriesViewHolder");
            if (yls.e(this.j, i)) {
                LogUtil.a("SleepRecommendAdapter", "series position is invalid: ", Integer.valueOf(i));
                return;
            }
            c cVar = (c) viewHolder;
            cVar.itemView.setLayoutParams(c(cVar.i.getLayoutParams(), i));
            e(cVar, i);
            b(cVar.itemView, i);
        }
    }

    private void b(final View view, final int i) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                SingleGridContent singleGridContent;
                SingleGridContent singleGridContent2;
                if (SleepRecommendAdapter.this.e == 2 && (singleGridContent2 = (SingleGridContent) SleepRecommendAdapter.this.j.get(i)) != null) {
                    SleepRecommendAdapter.this.d(singleGridContent2.getTheme(), view, i);
                }
                if (SleepRecommendAdapter.this.e != 1 || (singleGridContent = (SingleGridContent) SleepRecommendAdapter.this.f27753b.get(i)) == null) {
                    return;
                }
                SleepRecommendAdapter.this.d(singleGridContent.getTheme(), view, i);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, View view, int i) {
        if (view == null || a(view)) {
            return;
        }
        qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) new e(this, view, str, i));
        qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) new e(this, view, str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        return view != null && this.g.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, View view, int i) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        if (!a(rect, height, width) || a(view)) {
            return;
        }
        LogUtil.a("SleepRecommendAdapter", "item visible to user, theme: ", str, ", positionId: ", Integer.valueOf(this.i), ", height: ", Integer.valueOf(height), ", width: ", Integer.valueOf(width), ", rect: ", rect);
        this.g.add(view);
        LogUtil.a("SleepRecommendAdapter", "item visible to user, theme: ", this.f27754c.getName(), ", positionId: ", Integer.valueOf(this.i), ", mContentType: ", Integer.valueOf(this.f27752a));
        this.f = System.currentTimeMillis();
        c(1, i);
        this.h = SystemClock.elapsedRealtime();
    }

    private boolean a(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.right >= Math.min(i2 / 2, 400) && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min(i / 2, 400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("resourcePositionId", Integer.valueOf(this.i));
        map.put("resourceName", this.f27754c.getName());
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("smartRecommend", Boolean.valueOf(this.f27754c.isIntelligentFlag()));
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.f));
            this.f = System.currentTimeMillis();
        }
        SingleGridContent singleGridContent = this.e == 2 ? this.j.get(i2) : null;
        if (this.e == 1) {
            singleGridContent = this.f27753b.get(i2);
        }
        if (singleGridContent != null) {
            map.put("itemId", this.f27754c.isIntelligentFlag() ? singleGridContent.getItemId() : singleGridContent.getDynamicDataId());
            map.put("resourceId", singleGridContent.getItemId());
            map.put("itemCardName", singleGridContent.getTheme());
            map.put("algId", singleGridContent.getAlgId());
        }
        haa.b(map);
    }

    private RecyclerView.LayoutParams c(ViewGroup.LayoutParams layoutParams, int i) {
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.a("SleepRecommendAdapter", "params error");
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.d.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.d.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_8dp);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            return layoutParams2;
        }
        if (i == getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
            layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
            return layoutParams2;
        }
        layoutParams2.setMarginStart(dimensionPixelSize3);
        return layoutParams2;
    }

    private void a(a aVar, final int i) {
        LogUtil.a("SleepRecommendAdapter", "bindCourse");
        SingleGridContent singleGridContent = this.f27753b.get(i);
        qqf.b(aVar.f27763a, singleGridContent.getPicture(), 0, 0, R.drawable.blank_1008);
        c(aVar.f27765c, singleGridContent);
        aVar.e.setText(singleGridContent.getTheme());
        aVar.f27764b.setBackground(this.d.getResources().getDrawable(R.drawable.course_play_icon));
        final String linkValue = singleGridContent.getLinkValue();
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SleepRecommendAdapter", "course is clicked: ", Integer.valueOf(i));
                SleepRecommendAdapter.this.d(linkValue);
                SleepRecommendAdapter.this.c(2, i);
                SleepRecommendAdapter.this.h = SystemClock.elapsedRealtime();
            }
        });
    }

    private void e(c cVar, final int i) {
        LogUtil.a("SleepRecommendAdapter", "bindSeries");
        SingleGridContent singleGridContent = this.j.get(i);
        qqf.b(cVar.f27766a, singleGridContent.getPicture(), 0, 0, R.drawable.blank_1008);
        c(cVar.d, singleGridContent);
        cVar.f27768c.setText(singleGridContent.getTheme());
        final String linkValue = singleGridContent.getLinkValue();
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.SleepRecommendAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SleepRecommendAdapter", "series is clicked: ", Integer.valueOf(i));
                SleepRecommendAdapter.this.c(linkValue);
                SleepRecommendAdapter.this.c(2, i);
                SleepRecommendAdapter.this.h = SystemClock.elapsedRealtime();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (TextUtils.isEmpty(str) || qrs.r()) {
            return;
        }
        String strA = haa.a(str);
        LogUtil.a("SleepRecommendAdapter", "linkValue: ", strA);
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(strA));
        intent.setPackage(this.d.getPackageName());
        intent.setFlags(268435456);
        lsx.c(intent, this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (TextUtils.isEmpty(str) || qrs.r()) {
            return;
        }
        String strA = haa.a(str);
        LogUtil.a("SleepRecommendAdapter", "linkValue: ", strA);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(strA);
        }
    }

    private void c(HealthTextView healthTextView, SingleGridContent singleGridContent) {
        String strE = haa.e(singleGridContent.getHeatCount());
        if (TextUtils.isEmpty(strE)) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(strE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.e;
        if (i == -1) {
            return 0;
        }
        if (i == 2) {
            return this.j.size();
        }
        return this.f27753b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.e;
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f27763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f27764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27765c;
        private LinearLayout d;
        private HealthTextView e;

        public a(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(R.id.root_layout);
            this.f27763a = (ImageView) view.findViewById(R.id.item_series_courses_image);
            this.f27765c = (HealthTextView) view.findViewById(R.id.number);
            this.e = (HealthTextView) view.findViewById(R.id.name);
            this.f27764b = (ImageView) view.findViewById(R.id.play_icon);
        }
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f27766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthCardView f27767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27768c;
        private HealthTextView d;
        private HealthCardView e;
        private LinearLayout i;

        public c(View view) {
            super(view);
            this.i = (LinearLayout) view.findViewById(R.id.root_layout);
            this.f27766a = (ImageView) view.findViewById(R.id.item_series_courses_image);
            this.d = (HealthTextView) view.findViewById(R.id.number);
            this.f27768c = (HealthTextView) view.findViewById(R.id.name);
            this.f27767b = (HealthCardView) view.findViewById(R.id.bottom_card);
            this.e = (HealthCardView) view.findViewById(R.id.middle_card);
            Context context = view.getContext();
            if (context != null) {
                if (qqs.e(context)) {
                    this.f27767b.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                    this.e.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_white_10alpha));
                } else {
                    this.f27767b.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                    this.e.setCardBackgroundColor(view.getContext().getColor(com.huawei.health.servicesui.R.color.common_black_5alpha));
                }
            }
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<View> f27770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SleepRecommendAdapter> f27771c;
        private int e;

        public e(SleepRecommendAdapter sleepRecommendAdapter, View view, String str, int i) {
            this.f27771c = new WeakReference<>(sleepRecommendAdapter);
            this.f27770b = new WeakReference<>(view);
            this.f27769a = str;
            this.e = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SleepRecommendAdapter sleepRecommendAdapter = this.f27771c.get();
            View view = this.f27770b.get();
            if (sleepRecommendAdapter == null || view == null) {
                return;
            }
            if (!sleepRecommendAdapter.a(view)) {
                sleepRecommendAdapter.a(this.f27769a, view, this.e);
            } else {
                qsp.b(view, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            SleepRecommendAdapter sleepRecommendAdapter = this.f27771c.get();
            View view = this.f27770b.get();
            if (sleepRecommendAdapter == null || view == null) {
                return;
            }
            if (!sleepRecommendAdapter.a(view)) {
                sleepRecommendAdapter.a(this.f27769a, view, this.e);
            } else {
                qsp.c(view, this);
            }
        }
    }
}
