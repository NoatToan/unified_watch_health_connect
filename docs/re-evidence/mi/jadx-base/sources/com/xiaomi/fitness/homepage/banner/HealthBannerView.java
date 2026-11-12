package com.xiaomi.fitness.homepage.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.homepage.banner.HealthBannerView;
import defpackage.eri;
import defpackage.ili;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001+\u0018\u0000 22\u00020\u0001:\u00012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020%H\u0007J\u0014\u0010'\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0)J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\u001fH\u0016J\u0012\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/HealthBannerView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mDataList", "", "Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "mAdapter", "Lcom/xiaomi/fitness/homepage/banner/BannerAdapter;", "getMAdapter", "()Lcom/xiaomi/fitness/homepage/banner/BannerAdapter;", "setMAdapter", "(Lcom/xiaomi/fitness/homepage/banner/BannerAdapter;)V", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "autoFlag", "", "getAutoFlag", "()Z", "setAutoFlag", "(Z)V", "onFinishInflate", "", "addListener", "bindData", "dataList", "", "mLooper", "com/xiaomi/fitness/homepage/banner/HealthBannerView$mLooper$1", "Lcom/xiaomi/fitness/homepage/banner/HealthBannerView$mLooper$1;", "onWindowFocusChanged", "hasFocus", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthBannerView extends RelativeLayout {
    public static final long BANNER_CHANGE_TIME = 3000;

    @NotNull
    public static final String TAG = "HealthBannerView";
    private boolean autoFlag;

    @Nullable
    private RelativeLayout container;
    private int currentPosition;
    public BannerAdapter mAdapter;

    @NotNull
    private List<HomeBannerModel> mDataList;

    @NotNull
    private final HealthBannerView$mLooper$1 mLooper;
    private ViewPager2 viewPager;

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.banner.HealthBannerView$addListener$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/xiaomi/fitness/homepage/banner/HealthBannerView$addListener$1", "Landroidx/viewpager2/widget/ViewPager2$i;", "", "position", "", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends ViewPager2.i {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPageScrollStateChanged$lambda$0(HealthBannerView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ViewPager2 viewPager2 = this$0.viewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager2 = null;
            }
            viewPager2.k(this$0.getMAdapter().getCount() - 2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPageScrollStateChanged$lambda$1(HealthBannerView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ViewPager2 viewPager2 = this$0.viewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager2 = null;
            }
            viewPager2.k(1, false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int state) {
            if (state == 0 && HealthBannerView.this.getAutoFlag()) {
                ViewPager2 viewPager2 = null;
                if (HealthBannerView.this.getCurrentPosition() == 0) {
                    ViewPager2 viewPager3 = HealthBannerView.this.viewPager;
                    if (viewPager3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    } else {
                        viewPager2 = viewPager3;
                    }
                    final HealthBannerView healthBannerView = HealthBannerView.this;
                    viewPager2.postDelayed(new Runnable() { // from class: kob
                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthBannerView.AnonymousClass1.onPageScrollStateChanged$lambda$0(healthBannerView);
                        }
                    }, 3000L);
                    return;
                }
                if (HealthBannerView.this.getCurrentPosition() == HealthBannerView.this.getMAdapter().getCount() - 1) {
                    ViewPager2 viewPager4 = HealthBannerView.this.viewPager;
                    if (viewPager4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    } else {
                        viewPager2 = viewPager4;
                    }
                    final HealthBannerView healthBannerView2 = HealthBannerView.this;
                    viewPager2.postDelayed(new Runnable() { // from class: lob
                        @Override // java.lang.Runnable
                        public final void run() {
                            HealthBannerView.AnonymousClass1.onPageScrollStateChanged$lambda$1(healthBannerView2);
                        }
                    }, 3000L);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int position) {
            HealthBannerView.this.setCurrentPosition(position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.xiaomi.fitness.homepage.banner.HealthBannerView$mLooper$1] */
    public HealthBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDataList = new ArrayList();
        LayoutInflater.from(context).inflate(jui.i4, this);
        this.mLooper = new Runnable() { // from class: com.xiaomi.fitness.homepage.banner.HealthBannerView$mLooper$1
            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.getAutoFlag()) {
                    ViewPager2 viewPager2 = this.this$0.viewPager;
                    ViewPager2 viewPager3 = null;
                    if (viewPager2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                        viewPager2 = null;
                    }
                    ViewPager2 viewPager4 = this.this$0.viewPager;
                    if (viewPager4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                        viewPager4 = null;
                    }
                    viewPager4.setCurrentItem(viewPager4.getCurrentItem() + 1);
                    viewPager2.setCurrentItem(viewPager4.getCurrentItem());
                    ViewPager2 viewPager5 = this.this$0.viewPager;
                    if (viewPager5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                    } else {
                        viewPager3 = viewPager5;
                    }
                    viewPager3.postDelayed(this, 3000L);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addListener$lambda$0(HealthBannerView this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int action = motionEvent.getAction();
        ViewPager2 viewPager2 = null;
        if (action == 0) {
            ViewPager2 viewPager3 = this$0.viewPager;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager2 = viewPager3;
            }
            viewPager2.removeCallbacks(this$0.mLooper);
            return false;
        }
        if (action != 1) {
            return false;
        }
        ViewPager2 viewPager4 = this$0.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewPager2 = viewPager4;
        }
        viewPager2.postDelayed(this$0.mLooper, 3000L);
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void addListener() {
        ViewPager2 viewPager2 = this.viewPager;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.h(new AnonymousClass1());
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewPager3 = viewPager4;
        }
        viewPager3.getChildAt(0).setOnTouchListener(new View.OnTouchListener() { // from class: job
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return HealthBannerView.addListener$lambda$0(this.f22974a, view, motionEvent);
            }
        });
    }

    public final void bindData(@NotNull List<HomeBannerModel> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDataList.clear();
        ViewPager2 viewPager2 = this.viewPager;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.removeCallbacks(this.mLooper);
        if (dataList.size() > 1) {
            this.autoFlag = true;
            this.mDataList.add(dataList.get(dataList.size() - 1));
            this.mDataList.addAll(dataList);
            this.mDataList.add(dataList.get(0));
        } else {
            this.autoFlag = false;
            this.mDataList.addAll(dataList);
        }
        getMAdapter().notifyDataSetChanged();
        if (this.autoFlag) {
            ViewPager2 viewPager4 = this.viewPager;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager3 = viewPager4;
            }
            viewPager3.postDelayed(this.mLooper, 3000L);
        }
    }

    public final boolean getAutoFlag() {
        return this.autoFlag;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    @NotNull
    public final BannerAdapter getMAdapter() {
        BannerAdapter bannerAdapter = this.mAdapter;
        if (bannerAdapter != null) {
            return bannerAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    @NotNull
    public final List<HomeBannerModel> getMDataList() {
        return this.mDataList;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ViewExtKt.getDimen(this, ili.j);
        RelativeLayout relativeLayout = this.container;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
            marginLayoutParams.setMarginStart(dimen);
            marginLayoutParams.setMarginEnd(dimen);
            relativeLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.container = (RelativeLayout) findViewById(eri.V1);
        this.viewPager = (ViewPager2) findViewById(eri.So);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setMAdapter(new BannerAdapter(context, this.mDataList));
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(getMAdapter());
        addListener();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        ViewPager2 viewPager2 = null;
        if (hasFocus) {
            ViewPager2 viewPager3 = this.viewPager;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager2 = viewPager3;
            }
            viewPager2.postDelayed(this.mLooper, 3000L);
            return;
        }
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewPager2 = viewPager4;
        }
        viewPager2.removeCallbacks(this.mLooper);
    }

    public final void setAutoFlag(boolean z) {
        this.autoFlag = z;
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public final void setMAdapter(@NotNull BannerAdapter bannerAdapter) {
        Intrinsics.checkNotNullParameter(bannerAdapter, "<set-?>");
        this.mAdapter = bannerAdapter;
    }

    public final void setMDataList(@NotNull List<HomeBannerModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }
}
