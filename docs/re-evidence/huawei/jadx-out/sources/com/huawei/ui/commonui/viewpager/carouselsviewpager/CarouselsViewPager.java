package com.huawei.ui.commonui.viewpager.carouselsviewpager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes43.dex */
public class CarouselsViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f24040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PageScrolledListener f24041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f24042c;
    private float d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;

    public interface OnCarouselsClickListener {
        void onClick(int i);
    }

    public interface PageScrolledListener {
        void pageScrolled(int i);
    }

    public CarouselsViewPager(Context context) {
        this(context, null);
    }

    public CarouselsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f24040a = new d();
        this.f24042c = 0.0f;
        this.g = 1500;
        this.h = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        this.i = 1;
        this.f = -1;
        FixedSpeedScroller fixedSpeedScroller = new FixedSpeedScroller(context, new LinearOutSlowInInterpolator());
        fixedSpeedScroller.c(this.g);
        a(fixedSpeedScroller);
        setRotation(180.0f);
    }

    public final void a(Scroller scroller) {
        Log.i("CarouselsViewPager", "replaceScroller");
        try {
            Field declaredField = Class.forName("androidx.viewpager.widget.ViewPager").getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, scroller);
            declaredField.setAccessible(false);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            Log.i("CarouselsViewPager", "replace scroller fail");
        }
    }

    public void b() {
        d(this.h);
    }

    public void d(int i) {
        Log.i("CarouselsViewPager", "enablePagesAutoLoop");
        Handler handler = this.f24040a;
        if (handler != null) {
            handler.removeMessages(1);
        }
        this.e = false;
        int i2 = this.f;
        if (i2 == -1) {
            b(0);
        } else {
            b(i2);
        }
        this.h = i;
        if (this.i >= 2) {
            int i3 = this.f;
            if (i3 == -1) {
                setCurrentItem(getSurfaceCount() + 2, false);
            } else {
                setCurrentItem(i3, false);
            }
        }
        Handler handler2 = this.f24040a;
        if (handler2 != null) {
            handler2.sendEmptyMessageDelayed(1, i);
        }
    }

    public void c() {
        Log.i("CarouselsViewPager", "disablePagesAutoLoop");
        this.e = true;
        Handler handler = this.f24040a;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Log.i("CarouselsViewPager", "setAutoScrollPager");
        int realCount = getRealCount();
        if (realCount == -1) {
            Log.i("CarouselsViewPager", "acquire pages count fail");
            return;
        }
        int currentItem = getCurrentItem();
        Log.i("CarouselsViewPager", "pagersCount: " + realCount + ", curPageIndex: " + currentItem);
        if (currentItem == getRealCount() - 3) {
            setCurrentItem(d() - 2, false);
            this.f24040a.sendEmptyMessageDelayed(1, 0L);
        } else {
            if (this.e) {
                return;
            }
            Log.i("CarouselsViewPager", "postDelayed, curPageIndex: " + currentItem);
            setCurrentItem(currentItem + 1, true);
            this.f24040a.sendEmptyMessageDelayed(1, 2000L);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        LogUtil.a("CarouselsViewPager", "item: " + i);
        super.setCurrentItem(i, z);
        if (this.f != i) {
            b(i);
        }
        this.f = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f24040a.removeMessages(1);
            this.e = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            Log.i("CarouselsViewPager", "MotionEvent: " + motionEvent.getAction());
            this.e = false;
            this.f24040a.sendEmptyMessageDelayed(1, 2000L);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24042c = x;
        } else if (action == 1) {
            this.d = 0.0f;
        } else if (action == 2) {
            this.d = x - this.f24042c;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        int iA;
        if (this.d >= 0.0f || i != getRealCount() - 1) {
            iA = i;
        } else {
            setCurrentItem(d(), false);
            iA = d();
        }
        float f2 = this.d;
        if (f2 > 0.0f) {
            if (i == getSurfaceCount() + 1) {
                setCurrentItem(a(), false);
                iA = a();
            }
            if (f > 0.0f && f < 1.0f) {
                b(iA);
            }
        } else if (f2 < 0.0f && f > 0.0f && f < 1.0f) {
            b(iA + 1);
        }
        this.f = iA;
        super.onPageScrolled(iA, f, i2);
    }

    private void b(int i) {
        PageScrolledListener pageScrolledListener = this.f24041b;
        if (pageScrolledListener == null) {
            Log.i("CarouselsViewPager", "mPageScrolledListener is null");
        } else {
            pageScrolledListener.pageScrolled(getSurfaceCount() == 0 ? 0 : ((i + getSurfaceCount()) - 2) % getSurfaceCount());
        }
    }

    public void setPageScrolledListener(PageScrolledListener pageScrolledListener) {
        this.f24041b = pageScrolledListener;
    }

    public int getCurrentRealItem() {
        if (getSurfaceCount() == 0) {
            LogUtil.a("CarouselsViewPager", "getSurfaceCount is 0");
            return 0;
        }
        return e(this.f);
    }

    public int e(int i) {
        if (getSurfaceCount() == 0) {
            LogUtil.a("CarouselsViewPager", "getSurfaceCount is 0");
            return 0;
        }
        return (i - 2) % getSurfaceCount();
    }

    private int getRealCount() {
        if (getAdapter() == null) {
            Log.i("CarouselsViewPager", "adapter is null");
            return 0;
        }
        return getAdapter().getCount();
    }

    private int getSurfaceCount() {
        if (getAdapter() == null) {
            Log.i("CarouselsViewPager", "adapter is null");
            return 0;
        }
        return getRealCount() / 3;
    }

    public int d() {
        return ((getRealCount() * 2) / 3) - 1;
    }

    public int a() {
        return ((getRealCount() * 2) / 3) + 2;
    }

    public void setQuantityOfShowPages(int i) {
        this.i = i;
    }

    public void setScrollerDuration(int i) {
        this.g = i;
    }

    public static class FixedSpeedScroller extends Scroller {
        private int d;

        public FixedSpeedScroller(Context context, Interpolator interpolator) {
            super(context, interpolator, false);
            this.d = 1500;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            startScroll(i, i2, i3, i4, this.d);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, this.d);
        }

        public void c(int i) {
            this.d = i;
        }
    }

    static class d extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CarouselsViewPager> f24043b;

        private d(CarouselsViewPager carouselsViewPager) {
            this.f24043b = new WeakReference<>(carouselsViewPager);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WeakReference<CarouselsViewPager> weakReference = this.f24043b;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("CarouselsViewPager", "instance is null");
                return;
            }
            CarouselsViewPager carouselsViewPager = this.f24043b.get();
            if (message.what != 1 || carouselsViewPager.e) {
                return;
            }
            carouselsViewPager.e();
        }
    }
}
