package com.xiaomi.fitness.electronic.scale.widget.banner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.widget.carousel.CarouselBannerModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\b*\u0001(\u0018\u0000 .2\u00020\u0001:\u0002-.B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mAdapter", "Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter;", "mDataList", "", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerModel;", "currentPosition", "mStartX", "", "mStartY", "mHandler", "Landroid/os/Handler;", "onPageChangerListener", "Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner$OnPageChangerListener;", "setData", "", "dataList", "", "onFinishInflate", "addListener", "onDetachedFromWindow", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "autoPlayLooper", "com/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner$autoPlayLooper$1", "Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner$autoPlayLooper$1;", "setOnPageChangeListener", "setUserInputEnabled", "enable", "OnPageChangerListener", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoBanner.kt\ncom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2:171\n36#2,3:172\n*S KotlinDebug\n*F\n+ 1 EcoBanner.kt\ncom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner\n*L\n49#1:171\n49#1:172,3\n*E\n"})
public final class EcoBanner extends FrameLayout {
    public static final long BANNER_CHANGE_TIME = 4000;

    @NotNull
    private static final String TAG = "EcoCarouselBanner";

    @NotNull
    private final EcoBanner$autoPlayLooper$1 autoPlayLooper;
    private int currentPosition;

    @NotNull
    private EcoBannerAdapter mAdapter;

    @NotNull
    private final List<CarouselBannerModel> mDataList;

    @NotNull
    private final Handler mHandler;
    private float mStartX;
    private float mStartY;

    @Nullable
    private OnPageChangerListener onPageChangerListener;

    @NotNull
    private ViewPager2 viewPager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBanner$OnPageChangerListener;", "", "onPageChange", "", "page", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPageChangerListener {
        void onPageChange(int page);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoBanner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addListener() {
        this.viewPager.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner.addListener.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int state) {
                if (state == 0) {
                    int i = EcoBanner.this.currentPosition;
                    if (i == EcoBanner.this.mAdapter.getItemCount() - 1) {
                        EcoBanner.this.viewPager.k(1, false);
                    } else if (i == 0) {
                        EcoBanner.this.viewPager.k(EcoBanner.this.mDataList.size() - 2, false);
                    }
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                EcoBanner.this.currentPosition = position;
                OnPageChangerListener onPageChangerListener = EcoBanner.this.onPageChangerListener;
                if (onPageChangerListener != null) {
                    onPageChangerListener.onPageChange(position - 1);
                }
            }
        });
    }

    private final void start() {
        stop();
        if (this.mDataList.size() <= 3) {
            return;
        }
        this.mHandler.postDelayed(this.autoPlayLooper, BANNER_CHANGE_TIME);
    }

    private final void stop() {
        this.mHandler.removeCallbacks(this.autoPlayLooper);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (!this.viewPager.f()) {
            return super.dispatchTouchEvent(ev);
        }
        Integer numValueOf = ev != null ? Integer.valueOf(ev.getActionMasked()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 4))) {
            start();
        } else if (numValueOf != null && numValueOf.intValue() == 0) {
            stop();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addListener();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!this.viewPager.f()) {
            return super.onInterceptTouchEvent(ev);
        }
        int action = ev.getAction();
        if (action == 0) {
            this.mStartX = ev.getX();
            this.mStartY = ev.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            getParent().requestDisallowInterceptTouchEvent(ev.getX() - this.mStartX > ev.getY() - this.mStartY);
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void setData(@NotNull List<CarouselBannerModel> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        String string = Arrays.toString(dataList.toArray(new CarouselBannerModel[0]));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d(TAG, "setData: " + string);
        this.mDataList.clear();
        int i = dataList.size() <= 1 ? 1 : 0;
        if (i == 0) {
            ListExtKt.add(dataList, 0, dataList.get(dataList.size() - 1));
            ListExtKt.add(dataList, dataList.get(1));
        }
        this.mDataList.addAll(dataList);
        this.mAdapter.bindData(this.mDataList);
        this.viewPager.k(i ^ 1, false);
        start();
    }

    public final void setOnPageChangeListener(@NotNull OnPageChangerListener onPageChangerListener) {
        Intrinsics.checkNotNullParameter(onPageChangerListener, "onPageChangerListener");
        this.onPageChangerListener = onPageChangerListener;
    }

    public final void setUserInputEnabled(boolean enable) {
        this.viewPager.setUserInputEnabled(enable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EcoBanner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EcoBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner$autoPlayLooper$1] */
    @JvmOverloads
    public EcoBanner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDataList = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        EcoBannerAdapter ecoBannerAdapter = new EcoBannerAdapter();
        this.mAdapter = ecoBannerAdapter;
        viewPager2.setAdapter(ecoBannerAdapter);
        this.viewPager = viewPager2;
        addView(viewPager2);
        this.autoPlayLooper = new Runnable() { // from class: com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner$autoPlayLooper$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.viewPager.setCurrentItem((this.this$0.viewPager.getCurrentItem() + 1) % this.this$0.mAdapter.getItemCount());
                this.this$0.mHandler.postDelayed(this, EcoBanner.BANNER_CHANGE_TIME);
            }
        };
    }
}
