package com.huawei.health.marketing.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleTextContent;
import com.huawei.health.marketing.datatype.TextLinkTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fya;
import defpackage.njy;
import defpackage.qsp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public class TextLinkNestingLayout extends BaseLifeCycleLinearLayout implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SingleTextContent> f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8428c;
    private Fragment d;
    private final Context e;
    private FragmentManager f;
    private final List<KnitFragment> g;
    private boolean[] h;
    private boolean i;
    private boolean j;
    private LinearLayout k;
    private boolean l;
    private ResourceBriefInfo m;
    private List<SingleTextContent> n;
    private int o;
    private TextLinkNestingTitleAdapter p;
    private HealthSubHeader q;
    private c r;
    private String s;
    private ExtendHandler t;

    public TextLinkNestingLayout(Context context) {
        super(context);
        this.g = new ArrayList();
        this.f8427b = -1;
        this.n = new ArrayList();
        this.f8426a = new ArrayList();
        this.l = false;
        this.i = true;
        this.j = false;
        this.e = context;
        this.t = HandlerCenter.b(new d(this), "text_link_nesting_handler");
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, TextLinkTemplate textLinkTemplate, FragmentManager fragmentManager) {
        LogUtil.a("TextLinkNestingLayout", "initData enter");
        this.m = resourceBriefInfo;
        this.f = fragmentManager;
        this.o = i;
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.text_link_nesting_layout, (ViewGroup) this, true);
        this.k = (LinearLayout) viewInflate.findViewById(R.id.text_link_layout);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.sub_header);
        this.q = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        this.q.setHeadTitleText(textLinkTemplate.getName());
        this.s = textLinkTemplate.getName();
        this.l = textLinkTemplate.isNameVisible();
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.titles_list);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.e, 0, false));
        c(healthRecycleView);
        TextLinkNestingTitleAdapter textLinkNestingTitleAdapter = new TextLinkNestingTitleAdapter(this.e);
        this.p = textLinkNestingTitleAdapter;
        healthRecycleView.setAdapter(textLinkNestingTitleAdapter);
        healthRecycleView.setOnScrollListener(new MarketingBiUtils.FitnessOnScrollListener(22, this.s, 5));
        List<SingleTextContent> gridContents = textLinkTemplate.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.j("TextLinkNestingLayout", "init failed singleTextContentList isEmpty");
            setVisibility(8);
            return;
        }
        View viewFindViewById = viewInflate.findViewById(R.id.discovery_course_content);
        int iGenerateViewId = View.generateViewId();
        this.f8428c = iGenerateViewId;
        viewFindViewById.setId(iGenerateViewId);
        List<SingleTextContent> listB = b(gridContents);
        this.f8426a.clear();
        this.f8426a.addAll(listB);
        e(listB);
        this.i = false;
    }

    private void c(HealthRecycleView healthRecycleView) {
        healthRecycleView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.health.marketing.views.TextLinkNestingLayout.1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int dimensionPixelSize = TextLinkNestingLayout.this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
                int dimensionPixelSize2 = TextLinkNestingLayout.this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
                int dimensionPixelSize3 = TextLinkNestingLayout.this.e.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
                int size = TextLinkNestingLayout.this.p.e().size() - 1;
                if (childAdapterPosition == size) {
                    rect.right = ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() + dimensionPixelSize2;
                    rect.left = dimensionPixelSize3 / 2;
                }
                if (childAdapterPosition == 0) {
                    rect.left = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() + dimensionPixelSize;
                    rect.right = dimensionPixelSize3 / 2;
                }
                if (childAdapterPosition <= 0 || childAdapterPosition >= size) {
                    return;
                }
                int i = dimensionPixelSize3 / 2;
                rect.left = i;
                rect.right = i;
            }
        });
    }

    private void e(final List<SingleTextContent> list) {
        if (njy.e(list)) {
            LogUtil.e("TextLinkNestingLayout", "schedulePreloadFragmentList failed, singleTextContentList is empty!");
            setVisibility(8);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gao
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34831b.d(list);
                }
            });
        }
    }

    public /* synthetic */ void d(List list) {
        int size = list.size();
        final SingleTextContent[] singleTextContentArr = new SingleTextContent[size];
        final BasePageResTrigger[] basePageResTriggerArr = new BasePageResTrigger[size];
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        int i = 0;
        while (i < size) {
            final SingleTextContent singleTextContent = (SingleTextContent) list.get(i);
            final BasePageResTrigger basePageResTrigger = new BasePageResTrigger(this.e, singleTextContent.getPositionId(), null);
            final int i2 = i;
            basePageResTrigger.onPageLoadOnlineSections(new Consumer() { // from class: com.huawei.health.marketing.views.TextLinkNestingLayout$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    TextLinkNestingLayout.a(countDownLatch, i2, singleTextContentArr, singleTextContent, basePageResTriggerArr, basePageResTrigger, (List) obj);
                }
            }, this.f);
            i++;
            size = size;
        }
        try {
            if (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                LogUtil.e("TextLinkNestingLayout", "schedulePreloadFragmentList count down time out!");
            }
        } catch (InterruptedException e) {
            LogUtil.e("TextLinkNestingLayout", "schedulePreloadFragmentList interrupted, exception = ", e.getMessage());
        }
        HandlerExecutor.b(new Runnable() { // from class: gam
            @Override // java.lang.Runnable
            public final void run() {
                this.f34830b.a(singleTextContentArr, basePageResTriggerArr);
            }
        });
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, int i, SingleTextContent[] singleTextContentArr, SingleTextContent singleTextContent, BasePageResTrigger[] basePageResTriggerArr, BasePageResTrigger basePageResTrigger, List list) {
        if (njy.e(list)) {
            countDownLatch.countDown();
            LogUtil.a("TextLinkNestingLayout", "schedulePreloadFragmentList count down empty at position =", Integer.valueOf(i));
            return;
        }
        singleTextContentArr[i] = singleTextContent;
        basePageResTriggerArr[i] = basePageResTrigger;
        basePageResTrigger.setCacheBeansList(list);
        countDownLatch.countDown();
        LogUtil.a("TextLinkNestingLayout", "schedulePreloadFragmentList count down at position =", Integer.valueOf(i));
    }

    private List<SingleTextContent> b(List<SingleTextContent> list) {
        ArrayList arrayList = new ArrayList();
        for (SingleTextContent singleTextContent : list) {
            if (singleTextContent != null) {
                if (singleTextContent.getPositionId() <= 0) {
                    LogUtil.j("TextLinkNestingLayout", "addValidSingleTextContents rule out singleTextContent theme = ", singleTextContent.getTheme(), ", positionId = ", Integer.valueOf(singleTextContent.getPositionId()));
                } else {
                    arrayList.add(singleTextContent);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(SingleTextContent[] singleTextContentArr, BasePageResTrigger[] basePageResTriggerArr) {
        this.n.clear();
        this.g.clear();
        if (singleTextContentArr == null || singleTextContentArr.length <= 0) {
            LogUtil.j("TextLinkNestingLayout", "singleTextContents is empty, hide TextLinkNestingLayout");
            setVisibility(8);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < singleTextContentArr.length; i2++) {
            SingleTextContent singleTextContent = singleTextContentArr[i2];
            BasePageResTrigger basePageResTrigger = basePageResTriggerArr[i2];
            if (singleTextContent != null && basePageResTrigger != null) {
                KnitFragment knitFragmentNewInstance = KnitFragment.newInstance("", basePageResTrigger);
                knitFragmentNewInstance.setIsBottomPadding(false);
                this.g.add(knitFragmentNewInstance);
                singleTextContent.setOnClickListener(new b(this, i));
                this.n.add(singleTextContent);
                i++;
            }
        }
        if (njy.e(this.g)) {
            LogUtil.j("TextLinkNestingLayout", "mFragmentList is empty, hide TextLinkNestingLayout");
            setVisibility(8);
            return;
        }
        fya.b(this.l, this.q);
        this.h = new boolean[this.n.size()];
        if (this.r == null) {
            this.r = new c(this);
        }
        qsp.a(this.k, this.r);
        this.p.a(this.n);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        boolean z = (resourceBriefInfo == null || this.m == null || !resourceBriefInfo.getResourceId().equals(this.m.getResourceId())) ? false : true;
        LogUtil.a("TextLinkNestingLayout", "isOwnedByBriefInfo: " + z);
        return z;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.m;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.o;
    }

    private FragmentTransaction getTransaction() {
        if (this.f == null) {
            LogUtil.j("TextLinkNestingLayout", "mFragmentManager not init by setFragmentManger, generate by top activity!");
            Activity activityJ = BaseApplication.j();
            if (!(activityJ instanceof FragmentActivity)) {
                LogUtil.e("TextLinkNestingLayout", "switchFragment failed, topActivity is not FragmentActivity: ", activityJ);
                return null;
            }
            try {
                this.f = FragmentManager.findFragment(this).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                LogUtil.j("TextLinkNestingLayout", "find fragment fail");
                this.f = ((FragmentActivity) activityJ).getSupportFragmentManager();
            }
        }
        return this.f.beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        int i2;
        if (njy.e(this.g, i)) {
            LogUtil.e("TextLinkNestingLayout", "switchFragment failed, cause position = ", Integer.valueOf(i), ", total fragments' size = ", Integer.valueOf(this.g.size()));
            return;
        }
        KnitFragment knitFragment = this.g.get(i);
        if (knitFragment == this.d) {
            return;
        }
        if (!njy.e(this.n, this.f8427b)) {
            this.n.get(this.f8427b).setSelected(false);
        }
        if (!njy.e(this.n, i)) {
            this.n.get(i).setSelected(true);
        }
        this.p.notifyDataSetChanged();
        FragmentTransaction transaction = getTransaction();
        if (transaction == null) {
            LogUtil.e("TextLinkNestingLayout", "switchFragment failed, transaction is null!");
            return;
        }
        Fragment fragment = this.d;
        if (fragment != null) {
            transaction.hide(fragment);
        }
        if (!this.h[i] && (i2 = this.f8428c) != 0) {
            transaction.add(i2, knitFragment);
            this.h[i] = true;
        }
        transaction.show(knitFragment);
        this.d = knitFragment;
        this.f8427b = i;
        transaction.commitNowAllowingStateLoss();
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        super.onResume();
        if (this.i || !this.j) {
            return;
        }
        e();
        e(this.f8426a);
        this.j = false;
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onStop() {
        super.onStop();
        c(true);
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        List<KnitFragment> list = this.g;
        if (list != null) {
            list.clear();
            this.d = null;
        }
    }

    private void d() {
        ExtendHandler extendHandler = this.t;
        if (extendHandler == null) {
            return;
        }
        extendHandler.sendEmptyMessage(1001, 60000L);
    }

    private void e() {
        ExtendHandler extendHandler = this.t;
        if (extendHandler == null) {
            return;
        }
        extendHandler.removeMessages(1001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        boolean zIsEmpty = this.g.isEmpty();
        e();
        if (this.i || zIsEmpty) {
            return;
        }
        if (z) {
            d();
        } else {
            c();
        }
    }

    private void c() {
        List<KnitFragment> list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a("TextLinkNestingLayout", "cleanAllFragment");
        for (KnitFragment knitFragment : this.g) {
        }
        this.g.clear();
        this.j = true;
    }

    static final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<TextLinkNestingLayout> f8432a;
        private final int e;

        public b(TextLinkNestingLayout textLinkNestingLayout, int i) {
            this.f8432a = new WeakReference<>(textLinkNestingLayout);
            this.e = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TextLinkNestingLayout textLinkNestingLayout = this.f8432a.get();
            if (textLinkNestingLayout != null) {
                MarketingBiUtils.c(22, textLinkNestingLayout.s, 4);
                textLinkNestingLayout.d(this.e);
            }
        }
    }

    static class d extends BaseHandlerCallback<TextLinkNestingLayout> {
        d(TextLinkNestingLayout textLinkNestingLayout) {
            super(textLinkNestingLayout);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(TextLinkNestingLayout textLinkNestingLayout, Message message) {
            LogUtil.a("TextLinkNestingLayout", "TextLinkNestingLayout, message is: ", Integer.valueOf(message.what));
            if (message.what != 1001) {
                LogUtil.a("TextLinkNestingLayout", "TextLinkNestingHandler, unknown message code");
                return false;
            }
            if (textLinkNestingLayout == null) {
                return true;
            }
            textLinkNestingLayout.c(false);
            return true;
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TextLinkNestingLayout> f8433c;

        public c(TextLinkNestingLayout textLinkNestingLayout) {
            this.f8433c = new WeakReference<>(textLinkNestingLayout);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            TextLinkNestingLayout textLinkNestingLayout = this.f8433c.get();
            if (textLinkNestingLayout != null) {
                textLinkNestingLayout.d(0);
                qsp.b(textLinkNestingLayout.k, this);
            } else {
                LogUtil.j("TextLinkNestingLayout", "onScrollChanged layout is null");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qsp.b(this.k, this.r);
    }
}
