package com.xiaomi.fitness.widget.carousel;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u00010\u0018\u0000 2*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 J\b\u0010!\u001a\u00020\u001aH\u0014J/\u0010\"\u001a\u00020\u001a2\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00028\u0000`\u0018¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\bH\u0014J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/widget/carousel/CarouselBanner;", "T", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "mAdapter", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerAdapter;", "roundIndicator", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerRoundIndicator;", "currentPosition", "mStartX", "", "mStartY", "mHandler", "Landroid/os/Handler;", "onCarouselBannerSelectListener", "Lcom/xiaomi/fitness/widget/carousel/OnCarouselBannerSelectListener;", "Lkotlin/Function2;", "", "Lkotlin/jvm/functions/Function2;", "setCarouselBannerAdapter", "adapter", "setData", "dataList", "", "onFinishInflate", "setOnBannerSelectListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function2;)V", "addListener", "onWindowVisibilityChanged", "visibility", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "autoPlayLooper", "com/xiaomi/fitness/widget/carousel/CarouselBanner$autoPlayLooper$1", "Lcom/xiaomi/fitness/widget/carousel/CarouselBanner$autoPlayLooper$1;", "Companion", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CarouselBanner<T> extends FrameLayout {
    public static final long BANNER_CHANGE_TIME = 3000;

    @NotNull
    private static final String TAG = "CarouselBanner";

    @NotNull
    private final CarouselBanner$autoPlayLooper$1 autoPlayLooper;
    private int currentPosition;
    private CarouselBannerAdapter<T> mAdapter;

    @NotNull
    private final Handler mHandler;
    private float mStartX;
    private float mStartY;

    @Nullable
    private Function2<? super Integer, ? super T, Unit> onCarouselBannerSelectListener;

    @Nullable
    private CarouselBannerRoundIndicator roundIndicator;

    @NotNull
    private ViewPager2 viewPager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselBanner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addListener() {
        this.viewPager.h(new ViewPager2.i(this) { // from class: com.xiaomi.fitness.widget.carousel.CarouselBanner.addListener.1
            final /* synthetic */ CarouselBanner<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int state) {
                Logger.d(CarouselBanner.TAG, "onPageScrollStateChanged state: " + state + " currentPosition: " + ((CarouselBanner) this.this$0).currentPosition);
                if (state == 0) {
                    int i = ((CarouselBanner) this.this$0).currentPosition;
                    CarouselBannerAdapter carouselBannerAdapter = ((CarouselBanner) this.this$0).mAdapter;
                    CarouselBannerAdapter carouselBannerAdapter2 = null;
                    if (carouselBannerAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        carouselBannerAdapter = null;
                    }
                    if (i == carouselBannerAdapter.getItemCount() - 1) {
                        ((CarouselBanner) this.this$0).viewPager.k(1, false);
                        Function2 function2 = ((CarouselBanner) this.this$0).onCarouselBannerSelectListener;
                        if (function2 != null) {
                            CarouselBannerAdapter carouselBannerAdapter3 = ((CarouselBanner) this.this$0).mAdapter;
                            if (carouselBannerAdapter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            } else {
                                carouselBannerAdapter2 = carouselBannerAdapter3;
                            }
                            function2.invoke(1, carouselBannerAdapter2.getMDataList().get(1));
                            return;
                        }
                        return;
                    }
                    if (i != 0) {
                        Function2 function3 = ((CarouselBanner) this.this$0).onCarouselBannerSelectListener;
                        if (function3 != null) {
                            Integer numValueOf = Integer.valueOf(((CarouselBanner) this.this$0).currentPosition);
                            CarouselBannerAdapter carouselBannerAdapter4 = ((CarouselBanner) this.this$0).mAdapter;
                            if (carouselBannerAdapter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            } else {
                                carouselBannerAdapter2 = carouselBannerAdapter4;
                            }
                            function3.invoke(numValueOf, carouselBannerAdapter2.getMDataList().get(((CarouselBanner) this.this$0).currentPosition));
                            return;
                        }
                        return;
                    }
                    ViewPager2 viewPager2 = ((CarouselBanner) this.this$0).viewPager;
                    CarouselBannerAdapter carouselBannerAdapter5 = ((CarouselBanner) this.this$0).mAdapter;
                    if (carouselBannerAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        carouselBannerAdapter5 = null;
                    }
                    viewPager2.k(carouselBannerAdapter5.getMDataList().size() - 2, false);
                    Function2 function4 = ((CarouselBanner) this.this$0).onCarouselBannerSelectListener;
                    if (function4 != null) {
                        CarouselBannerAdapter carouselBannerAdapter6 = ((CarouselBanner) this.this$0).mAdapter;
                        if (carouselBannerAdapter6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            carouselBannerAdapter6 = null;
                        }
                        Integer numValueOf2 = Integer.valueOf(carouselBannerAdapter6.getMDataList().size() - 2);
                        CarouselBannerAdapter carouselBannerAdapter7 = ((CarouselBanner) this.this$0).mAdapter;
                        if (carouselBannerAdapter7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            carouselBannerAdapter7 = null;
                        }
                        List<T> mDataList = carouselBannerAdapter7.getMDataList();
                        CarouselBannerAdapter carouselBannerAdapter8 = ((CarouselBanner) this.this$0).mAdapter;
                        if (carouselBannerAdapter8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            carouselBannerAdapter2 = carouselBannerAdapter8;
                        }
                        function4.invoke(numValueOf2, mDataList.get(carouselBannerAdapter2.getMDataList().size() - 2));
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
                Logger.d(CarouselBanner.TAG, "onPageSelected position: " + position);
                ((CarouselBanner) this.this$0).currentPosition = position;
                CarouselBannerRoundIndicator carouselBannerRoundIndicator = ((CarouselBanner) this.this$0).roundIndicator;
                if (carouselBannerRoundIndicator != null) {
                    CarouselBannerAdapter carouselBannerAdapter = ((CarouselBanner) this.this$0).mAdapter;
                    if (carouselBannerAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        carouselBannerAdapter = null;
                    }
                    CarouselBannerRoundIndicator.onPageChanged$default(carouselBannerRoundIndicator, carouselBannerAdapter.getMDataList().size() - 2, position - 1, 0, 0, 12, null);
                }
                Logger.d(CarouselBanner.TAG, "onPageSelected: " + position);
            }
        });
    }

    private final void start() {
        stop();
        CarouselBannerAdapter<T> carouselBannerAdapter = this.mAdapter;
        if (carouselBannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            carouselBannerAdapter = null;
        }
        if (carouselBannerAdapter.getMDataList().size() <= 3) {
            return;
        }
        this.mHandler.postDelayed(this.autoPlayLooper, 3000L);
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

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0) {
            CarouselBannerAdapter<T> carouselBannerAdapter = this.mAdapter;
            if (carouselBannerAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                carouselBannerAdapter = null;
            }
            if (!carouselBannerAdapter.getMDataList().isEmpty()) {
                start();
                return;
            }
        }
        stop();
    }

    public final void setCarouselBannerAdapter(@NotNull CarouselBannerAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.mAdapter = adapter;
        ViewPager2 viewPager2 = this.viewPager;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            adapter = null;
        }
        viewPager2.setAdapter(adapter);
    }

    public final void setData(@NotNull List<? extends T> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Logger.d(TAG, "setData: " + dataList.size());
        int i = dataList.size() <= 1 ? 1 : 0;
        if (i == 0) {
            ListExtKt.add(dataList, 0, dataList.get(dataList.size() - 1));
            ListExtKt.add(dataList, dataList.get(1));
        }
        CarouselBannerAdapter<T> carouselBannerAdapter = this.mAdapter;
        CarouselBannerAdapter<T> carouselBannerAdapter2 = null;
        if (carouselBannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            carouselBannerAdapter = null;
        }
        carouselBannerAdapter.bindData(dataList);
        CarouselBannerRoundIndicator carouselBannerRoundIndicator = this.roundIndicator;
        if (carouselBannerRoundIndicator != null) {
            CarouselBannerAdapter<T> carouselBannerAdapter3 = this.mAdapter;
            if (carouselBannerAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                carouselBannerAdapter2 = carouselBannerAdapter3;
            }
            CarouselBannerRoundIndicator.onPageChanged$default(carouselBannerRoundIndicator, carouselBannerAdapter2.getMDataList().size() - 2, 0, 0, 0, 12, null);
        }
        this.viewPager.k(i ^ 1, false);
        start();
    }

    public final void setOnBannerSelectListener(@NotNull Function2<? super Integer, ? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onCarouselBannerSelectListener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselBanner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CarouselBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.xiaomi.fitness.widget.carousel.CarouselBanner$autoPlayLooper$1] */
    @JvmOverloads
    public CarouselBanner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mHandler = new Handler(Looper.getMainLooper());
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, ExtUtilsKt.getDp(Float.valueOf(154.0f))));
        this.viewPager = viewPager2;
        addView(viewPager2);
        this.roundIndicator = new CarouselBannerRoundIndicator(context, null, 1, 2, null);
        new LinearLayout.LayoutParams(-1, -2).bottomMargin = ExtUtilsKt.getDp(Float.valueOf(10.0f));
        addView(this.roundIndicator);
        this.autoPlayLooper = new Runnable(this) { // from class: com.xiaomi.fitness.widget.carousel.CarouselBanner$autoPlayLooper$1
            final /* synthetic */ CarouselBanner<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewPager2 viewPager3 = ((CarouselBanner) this.this$0).viewPager;
                int currentItem = ((CarouselBanner) this.this$0).viewPager.getCurrentItem() + 1;
                CarouselBannerAdapter carouselBannerAdapter = ((CarouselBanner) this.this$0).mAdapter;
                if (carouselBannerAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    carouselBannerAdapter = null;
                }
                viewPager3.setCurrentItem(currentItem % carouselBannerAdapter.getItemCount());
                ((CarouselBanner) this.this$0).mHandler.postDelayed(this, 3000L);
            }
        };
    }
}
