package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.OnGuideItemTouchListener;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmGuideEntity;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmGuidePageAdapter;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmGuideHelper;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.iji;
import defpackage.jui;
import defpackage.lo0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J)\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmMonitorGuideActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Llo0;", "", "openSleepRhythmSuccess", "()V", "removeAutoPlayRunnable", "postAutoPlayRunnable", "initViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "removeOverScroll", "(Landroidx/viewpager2/widget/ViewPager2;)V", "initTitleBar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselIndicator;", "indicator", "Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselIndicator;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "autoPlayRunnable", "Ljava/lang/Runnable;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmMonitorGuideActivity extends Hilt_SleepRhythmMonitorGuideActivity<SleepRhythmMonitorViewModel, lo0> {
    public static final long INDICATOR_DELAY_DURATION = 6000;
    public static final int REQUEST_OPEN = 100;

    @NotNull
    public static final String TAG = "SleepRhythmMonitorUI";
    private Runnable autoPlayRunnable;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private SleepGuideCarouselIndicator indicator;
    private ViewPager2 viewPager;

    private final void initTitleBar() {
        setTitle(c0j.vj);
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewPager() {
        ViewPager2 viewPager2 = ((lo0) getMBinding()).B;
        this.viewPager = viewPager2;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        removeOverScroll(viewPager2);
        this.indicator = ((lo0) getMBinding()).C;
        List<SleepRhythmGuideEntity> listBuildSleepRhythmGuideList = SleepRhythmGuideHelper.INSTANCE.buildSleepRhythmGuideList(this);
        int size = listBuildSleepRhythmGuideList.size();
        final SleepRhythmGuidePageAdapter sleepRhythmGuidePageAdapter = new SleepRhythmGuidePageAdapter(listBuildSleepRhythmGuideList, this);
        sleepRhythmGuidePageAdapter.setOnGuideItemTouchListener(new OnGuideItemTouchListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity.initViewPager.1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.adapter.OnGuideItemTouchListener
            public void touchDown() {
                SleepRhythmMonitorGuideActivity.this.removeAutoPlayRunnable();
            }

            @Override // com.xiaomi.fitness.health.sleep.rhythm.adapter.OnGuideItemTouchListener
            public void touchUp() {
                SleepRhythmMonitorGuideActivity.this.postAutoPlayRunnable();
            }
        });
        SleepGuideCarouselIndicator sleepGuideCarouselIndicator = this.indicator;
        if (sleepGuideCarouselIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicator");
            sleepGuideCarouselIndicator = null;
        }
        sleepGuideCarouselIndicator.setColor(iji.s3, iji.w3);
        SleepGuideCarouselIndicator sleepGuideCarouselIndicator2 = this.indicator;
        if (sleepGuideCarouselIndicator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("indicator");
            sleepGuideCarouselIndicator2 = null;
        }
        sleepGuideCarouselIndicator2.initIndicatorCount(size);
        ViewPager2 viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager4 = null;
        }
        viewPager4.setOffscreenPageLimit(size);
        ViewPager2 viewPager5 = this.viewPager;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager5 = null;
        }
        viewPager5.setClipChildren(false);
        ViewPager2 viewPager6 = this.viewPager;
        if (viewPager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager6 = null;
        }
        viewPager6.setPageTransformer(new b(ExtUtilsKt.getDp(Float.valueOf(13.0f))));
        ViewPager2 viewPager7 = this.viewPager;
        if (viewPager7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager7 = null;
        }
        viewPager7.setAdapter(sleepRhythmGuidePageAdapter);
        ViewPager2 viewPager8 = this.viewPager;
        if (viewPager8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        } else {
            viewPager3 = viewPager8;
        }
        viewPager3.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorGuideActivity.initViewPager.2
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                SleepGuideCarouselIndicator sleepGuideCarouselIndicator3 = SleepRhythmMonitorGuideActivity.this.indicator;
                if (sleepGuideCarouselIndicator3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("indicator");
                    sleepGuideCarouselIndicator3 = null;
                }
                sleepGuideCarouselIndicator3.onPageScrolled(position, positionOffset, positionOffsetPixels);
                SleepRhythmMonitorGuideActivity.this.removeAutoPlayRunnable();
                SleepRhythmMonitorGuideActivity.this.postAutoPlayRunnable();
            }
        });
        this.autoPlayRunnable = new Runnable() { // from class: ztm
            @Override // java.lang.Runnable
            public final void run() {
                SleepRhythmMonitorGuideActivity.initViewPager$lambda$2(this.f41666a, sleepRhythmGuidePageAdapter);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewPager$lambda$2(SleepRhythmMonitorGuideActivity this$0, SleepRhythmGuidePageAdapter viewPagerAdapter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewPagerAdapter, "$viewPagerAdapter");
        ViewPager2 viewPager2 = this$0.viewPager;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        int currentItem = viewPager2.getCurrentItem();
        if (currentItem < viewPagerAdapter.getItemCount() - 1) {
            ViewPager2 viewPager4 = this$0.viewPager;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager3 = viewPager4;
            }
            viewPager3.setCurrentItem(currentItem + 1);
        } else {
            ViewPager2 viewPager5 = this$0.viewPager;
            if (viewPager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            } else {
                viewPager3 = viewPager5;
            }
            viewPager3.setCurrentItem(0);
        }
        this$0.postAutoPlayRunnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(final SleepRhythmMonitorGuideActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmOpenClick(1);
        SleepRhythmExtKt.checkDeviceSupportEffective(this$0, new Function1() { // from class: aum
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepRhythmMonitorGuideActivity.onCreate$lambda$1$lambda$0(this.f3466a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(SleepRhythmMonitorGuideActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BaseFragmentExKt.gotoFragmentPageForResult(this$0, SleepRhythmMonitorSettingFragment.class, null, true, 100);
        }
        return Unit.INSTANCE;
    }

    private final void openSleepRhythmSuccess() {
        SleepRhythmExtKt.startSleepRhythmActivity(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postAutoPlayRunnable() {
        Handler handler = this.handler;
        Runnable runnable = this.autoPlayRunnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoPlayRunnable");
            runnable = null;
        }
        handler.postDelayed(runnable, INDICATOR_DELAY_DURATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAutoPlayRunnable() {
        Handler handler = this.handler;
        Runnable runnable = this.autoPlayRunnable;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoPlayRunnable");
            runnable = null;
        }
        handler.removeCallbacks(runnable);
    }

    private final void removeOverScroll(ViewPager2 viewPager2) {
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Logger.i(TAG, "onActivityResult request " + requestCode + ";resultCode " + resultCode);
        if (requestCode == 100 && resultCode == 200) {
            openSleepRhythmSuccess();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.sleep.rhythm.ui.Hilt_SleepRhythmMonitorGuideActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTitleBar();
        initViewPager();
        ((lo0) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: bum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmMonitorGuideActivity.onCreate$lambda$1(this.f4621a, view);
            }
        });
        SleepTrackHelper.INSTANCE.trackSleepRhythmLandingPageExpose(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        removeAutoPlayRunnable();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        postAutoPlayRunnable();
    }
}
