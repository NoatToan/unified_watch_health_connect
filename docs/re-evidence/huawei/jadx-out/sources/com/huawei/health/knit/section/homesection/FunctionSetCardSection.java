package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.functionsetcard.FunctionSetPagerSnapHelper;
import com.huawei.health.functionsetcard.FunctionSetViewAdapter;
import com.huawei.health.functionsetcard.FunctionSetViewTouchHelperCallback;
import com.huawei.health.health.utils.functionsetcard.ICardChangedCallback;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ewm;
import defpackage.fac;
import defpackage.fto;
import defpackage.fua;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class FunctionSetCardSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7480b;
    private ICardChangedCallback d;
    private FunctionSetViewTouchHelperCallback f;
    private HealthTextView g;
    private HealthColumnSystem h;
    private RelativeLayout i;
    private Context j;
    private ItemTouchHelper k;
    private List<FunctionSetSubCardData> l;
    private long m;
    private boolean n;
    private boolean o;
    private FunctionSetViewAdapter q;
    private HealthRecycleView r;
    private HealthButton s;
    private WrapperStaggeredGridLayoutManager t;
    private static final int e = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_130dp);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7478c = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_200dp);

    public FunctionSetCardSection(Context context) {
        super(context);
        this.m = 0L;
        this.l = new ArrayList(10);
        this.n = false;
    }

    public FunctionSetCardSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 0L;
        this.l = new ArrayList(10);
        this.n = false;
    }

    public FunctionSetCardSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0L;
        this.l = new ArrayList(10);
        this.n = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.j = context;
        this.f7480b = LayoutInflater.from(context).inflate(R.layout.home_item_layout_function_set, (ViewGroup) this, false);
        this.o = qrs.af(BaseApplication.getActivity());
        this.d = new e(this);
        c();
        return this.f7480b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "FunctionSetCardSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        HealthRecycleView healthRecycleView;
        HealthRecycleView healthRecycleView2;
        LogUtil.a("FunctionSetCardSection", "bindParamsToView");
        if (map == null || map.size() == 0) {
            LogUtil.a("FunctionSetCardSection", "no need to bind");
            return;
        }
        setTextAndListener(map);
        if (qqw.a(map, "SET_ADAPTER", false) && (healthRecycleView2 = this.r) != null) {
            healthRecycleView2.setAdapter(this.q);
        }
        if (qqw.a(map, "REFRESH_NO_CARD_LAYOUT_SHOW_STATUS", false)) {
            e();
        }
        if (qqw.a(map, "NOTIFY_DATA_SET_CHANGED", false) && this.q != null && (healthRecycleView = this.r) != null) {
            healthRecycleView.post(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.5
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardSection.this.q.notifyDataSetChanged();
                }
            });
        }
        this.n = qqw.a(map, "SMART_RECOMMEND", false);
        a(map);
        d(map);
    }

    private void a(HashMap<String, Object> map) {
        HealthRecycleView healthRecycleView;
        final List listA = qqw.a((Map) map, "NOTIFY_ITEM_MOVED", Integer.class, (List) null);
        if (listA == null || listA.size() != 2 || this.q == null || (healthRecycleView = this.r) == null) {
            return;
        }
        healthRecycleView.post(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.3
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetCardSection.this.q.notifyItemMoved(((Integer) listA.get(0)).intValue(), ((Integer) listA.get(1)).intValue());
            }
        });
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        b();
    }

    private void b() {
        HealthColumnSystem healthColumnSystem = this.h;
        if (healthColumnSystem != null) {
            healthColumnSystem.b(this.j);
            WrapperStaggeredGridLayoutManager wrapperStaggeredGridLayoutManager = this.t;
            if (wrapperStaggeredGridLayoutManager != null) {
                wrapperStaggeredGridLayoutManager.setSpanCount(getCardColumNum());
            }
            boolean zAf = qrs.af(BaseApplication.getActivity());
            if (zAf != this.o && !fua.b(getContext())) {
                LogUtil.a("FunctionSetCardSection", "Screen changed, notify all card, isWidescreen:", Boolean.valueOf(zAf));
                this.q.notifyDataSetChanged();
            }
            this.o = zAf;
        }
    }

    private void c() {
        this.h = new HealthColumnSystem(this.j, 1);
        this.t = new WrapperStaggeredGridLayoutManager(getCardColumNum(), 1);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.f7480b.findViewById(R.id.function_set_view);
        this.r = healthRecycleView;
        healthRecycleView.setFocusableInTouchMode(false);
        this.r.setIsScroll(false);
        if (this.r.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r.getLayoutParams();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            int iA = fac.a(this.j);
            int iD = fac.d(this.j);
            int iC = fac.c(this.j) / 2;
            layoutParams.setMarginStart((iA - iC) + ((Integer) safeRegionWidth.first).intValue());
            layoutParams.setMarginEnd((iD - iC) + ((Integer) safeRegionWidth.first).intValue());
        }
        FunctionSetViewAdapter functionSetViewAdapter = new FunctionSetViewAdapter(this.l, this.j);
        this.q = functionSetViewAdapter;
        functionSetViewAdapter.setHasStableIds(true);
        ewm.d().d(this.q);
        this.r.setLayoutManager(this.t);
        this.r.setItemAnimator(null);
        this.r.setAdapter(this.q);
        FunctionSetPagerSnapHelper functionSetPagerSnapHelper = new FunctionSetPagerSnapHelper(this.l.size());
        if (!qrs.af(this.j.getApplicationContext())) {
            functionSetPagerSnapHelper.attachToRecyclerView(this.r);
        }
        this.f = new FunctionSetViewTouchHelperCallback(this.q, this.r);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(this.f);
        this.k = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.r);
        this.i = (RelativeLayout) this.f7480b.findViewById(R.id.function_set_no_card);
        this.f7479a = (HealthTextView) this.f7480b.findViewById(R.id.add_card);
        this.s = (HealthButton) this.f7480b.findViewById(R.id.btn_modify_cards);
        a();
        e();
    }

    private int getCardColumNum() {
        int iJ = this.h.j() / 2;
        int i = e;
        int i2 = f7478c;
        LogUtil.a("FunctionSetCardSection", "getCardColumNum CARD_WIDTH_MIN:", Integer.valueOf(i), ", CARD_WIDTH_MAX", Integer.valueOf(i2), ", columNum", Integer.valueOf(iJ), ", SingleColumnWidth:", Float.valueOf(this.h.f()), ", getGutter:", Integer.valueOf(this.h.b()));
        if (this.h.a()) {
            if (i2 < (this.h.f() * 2.0f) + this.h.b()) {
                return iJ + 1;
            }
            LogUtil.a("FunctionSetCardSection", "getCardColumNum isPhoneScreen columNum:", Integer.valueOf(iJ));
            return iJ;
        }
        if (i > (this.h.f() * 2.0f) + this.h.b()) {
            return iJ - 1;
        }
        LogUtil.a("FunctionSetCardSection", "getCardColumNum is not PhoneScreen columNum:", Integer.valueOf(iJ));
        return iJ;
    }

    private void a() {
        this.g = (HealthTextView) this.f7480b.findViewById(R.id.empty_card_prompt_text);
        if (LanguageUtil.p(this.j.getApplicationContext())) {
            this.g.setTextSize(1, 9.0f);
        } else {
            this.g.setTextSize(0, this.j.getResources().getDimensionPixelSize(R.dimen.textSizeBody2));
        }
    }

    private void e() {
        if (njy.e(this.l)) {
            this.i.setVisibility(0);
            this.s.setVisibility(8);
        } else {
            this.i.setVisibility(8);
            this.s.setVisibility(0);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        LogUtil.a("FunctionSetCardSection", "onDestroy");
        ItemTouchHelper itemTouchHelper = this.k;
        if (itemTouchHelper != null) {
            itemTouchHelper.attachToRecyclerView(null);
            this.k = null;
        }
        HealthRecycleView healthRecycleView = this.r;
        if (healthRecycleView != null) {
            healthRecycleView.setOnScrollListener(null);
            this.r = null;
        }
        this.f = null;
        FunctionSetViewAdapter functionSetViewAdapter = this.q;
        if (functionSetViewAdapter != null) {
            functionSetViewAdapter.c();
        }
    }

    private void setTextAndListener(HashMap<String, Object> map) {
        qsp.b(this.f7479a, qqw.d((Map) map, "ADD_CARD_TEXT", ""));
        qsp.b(this.g, qqw.d((Map) map, "EMPTY_CARD_PROMPT_TEXT", ""));
        qsp.b(this.s, qqw.d((Map) map, "BTN_MODIFY_CARDS", ""));
        final View.OnClickListener onClickListener = (View.OnClickListener) qqw.a(map, "FUNCTION_SET_NO_CARD_CLICK_EVENT", (Class<Object>) View.OnClickListener.class, (Object) null);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickListener.onClick(view);
                FunctionSetCardSection.this.q.d(false);
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                onClickListener.onClick(view);
                FunctionSetCardSection.this.q.d(false);
            }
        });
        List listA = qqw.a((Map) map, "DATA_LIST", FunctionSetSubCardData.class, (List) null);
        this.l.clear();
        if (njy.e(listA)) {
            return;
        }
        this.l.addAll(listA);
        Iterator<FunctionSetSubCardData> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().setNotifyCardChangedCallback(this.d);
        }
    }

    private void d(HashMap<String, Object> map) {
        HealthRecycleView healthRecycleView;
        HealthRecycleView healthRecycleView2;
        HealthRecycleView healthRecycleView3;
        final int iC = qqw.c(map, "NOTIFY_ITEM_INSERTED", -1);
        if (iC != -1 && this.q != null && (healthRecycleView3 = this.r) != null) {
            healthRecycleView3.post(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.2
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardSection.this.q.notifyItemInserted(iC);
                }
            });
        }
        final int iC2 = qqw.c(map, "NOTIFY_ITEM_REMOVED", -1);
        if (iC2 != -1 && this.q != null && (healthRecycleView2 = this.r) != null) {
            healthRecycleView2.post(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.10
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardSection.this.q.notifyItemRemoved(iC2);
                }
            });
        }
        final List listA = qqw.a((Map) map, "NOTIFY_ITEM_RANGE_CHANGED", Integer.class, (List) null);
        if (listA == null || listA.size() != 2 || this.q == null || (healthRecycleView = this.r) == null) {
            return;
        }
        healthRecycleView.post(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.8
            @Override // java.lang.Runnable
            public void run() {
                FunctionSetCardSection.this.q.notifyItemRangeChanged(((Integer) listA.get(0)).intValue(), ((Integer) listA.get(1)).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FunctionSetSubCardData functionSetSubCardData) {
        LogUtil.a("FunctionSetCardSection", "notify recevied");
        FunctionSetViewAdapter functionSetViewAdapter = this.q;
        if (functionSetViewAdapter == null) {
            LogUtil.a("FunctionSetCardSection", "mViewAdapter is null");
            return;
        }
        int iA = functionSetViewAdapter.a(functionSetSubCardData);
        LogUtil.a("FunctionSetCardSection", "data changed, position: " + iA);
        if (!this.q.c(this.l, iA)) {
            LogUtil.a("FunctionSetCardSection", "out of bounds: " + iA + ", mList size: " + this.l.size());
            return;
        }
        if (this.m == 0 || SystemClock.elapsedRealtime() - this.m > 2000) {
            if (functionSetSubCardData.hasCardData() && !functionSetSubCardData.hasCardDataLastTime()) {
                fto.b(functionSetSubCardData, 1, this.n);
            }
            this.m = SystemClock.elapsedRealtime();
        }
        c(iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        HealthRecycleView healthRecycleView = this.r;
        if (healthRecycleView == null) {
            LogUtil.j("FunctionSetCardSection", "notifyItemChanged mRecyclerView is null");
        } else if (healthRecycleView.isComputingLayout()) {
            LogUtil.a("FunctionSetCardSection", "mRecyclerView isComputingLayout");
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.homesection.FunctionSetCardSection.7
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardSection.this.c(i);
                }
            }, 50L);
        } else {
            LogUtil.a("FunctionSetCardSection", "mViewAdapter notifyItemChanged");
            this.q.notifyItemChanged(i);
        }
    }

    static class WrapperStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public WrapperStaggeredGridLayoutManager(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                ReleaseLogUtil.a("R_FunctionSetCardSection", "functionSetCardViewHolder RecyclerView onLayoutChildren exception. message = ", e.getMessage());
            }
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
            super.onDetachedFromWindow(recyclerView, recycler);
        }
    }

    public static class e implements ICardChangedCallback {
        private WeakReference<FunctionSetCardSection> d;

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public View loadMarketingView(String str, int i) {
            return null;
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardDelete(FunctionSetSubCardData functionSetSubCardData) {
        }

        e(FunctionSetCardSection functionSetCardSection) {
            this.d = new WeakReference<>(functionSetCardSection);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardChanged(final FunctionSetSubCardData functionSetSubCardData) {
            if (!HandlerExecutor.d()) {
                HandlerExecutor.c(new Runnable() { // from class: frq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.a(functionSetSubCardData);
                    }
                });
            } else {
                a(functionSetSubCardData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(FunctionSetSubCardData functionSetSubCardData) {
            FunctionSetCardSection functionSetCardSection = this.d.get();
            if (functionSetCardSection != null) {
                functionSetCardSection.c(functionSetSubCardData);
            } else {
                LogUtil.j("FunctionSetCardSection", "CardChangedCallback provider is null");
            }
        }

        @Override // com.huawei.health.health.utils.functionsetcard.ICardChangedCallback
        public void notifyCardScrolled(FunctionSetSubCardData functionSetSubCardData) {
            FunctionSetCardSection functionSetCardSection = this.d.get();
            if (functionSetCardSection != null) {
                if (functionSetCardSection.q != null) {
                    int iA = functionSetCardSection.q.a(functionSetSubCardData);
                    if (functionSetCardSection.q.c(functionSetCardSection.l, iA)) {
                        functionSetCardSection.q.d(iA);
                        return;
                    }
                    LogUtil.a("FunctionSetCardSection", "out of bounds: " + iA + ", mList size: " + functionSetCardSection.l.size());
                    return;
                }
                LogUtil.a("FunctionSetCardSection", "mViewAdapter is null");
                return;
            }
            LogUtil.j("FunctionSetCardSection", "CardChangedCallback provider is null");
        }
    }
}
