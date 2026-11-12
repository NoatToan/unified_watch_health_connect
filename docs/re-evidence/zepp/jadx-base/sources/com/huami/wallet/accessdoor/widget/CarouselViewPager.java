package com.huami.wallet.accessdoor.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class CarouselViewPager extends ViewPager {
    private Handler a;
    private long b;
    private boolean c;
    private boolean d;
    private Runnable e;
    private ViewPager.OnPageChangeListener f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CarouselViewPager.this.c && CarouselViewPager.this.d) {
                CarouselViewPager.this.g();
                CarouselViewPager.this.a.postDelayed(CarouselViewPager.this.e, CarouselViewPager.this.b);
            }
        }
    }

    public class b extends ViewPager.SimpleOnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                CarouselViewPager.this.startCyclicSwitch();
            } else {
                if (i != 1) {
                    return;
                }
                CarouselViewPager.this.stopCyclicSwitch();
            }
        }
    }

    public CarouselViewPager(Context context) {
        super(context);
        this.a = new Handler();
        this.b = 4000L;
        this.c = true;
        this.d = false;
        this.e = new a();
        this.f = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        PagerAdapter adapter = getAdapter();
        Objects.requireNonNull(adapter);
        setCurrentItem((getCurrentItem() + 1) % adapter.getCount(), true);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnPageChangeListener(this.f);
        startCyclicSwitch();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnPageChangeListener(this.f);
        stopCyclicSwitch();
    }

    public void setEnableSwitch(boolean z) {
        this.c = z;
    }

    public void setSwitchPeriod(long j) {
        this.b = j;
    }

    public void startCyclicSwitch() {
        if (!this.c || this.d || getAdapter() == null || getAdapter().getCount() <= 1) {
            return;
        }
        this.d = true;
        this.a.removeCallbacks(this.e);
        this.a.postDelayed(this.e, this.b);
    }

    public void stopCyclicSwitch() {
        this.d = false;
        this.a.removeCallbacks(this.e);
    }

    public CarouselViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Handler();
        this.b = 4000L;
        this.c = true;
        this.d = false;
        this.e = new a();
        this.f = new b();
    }
}
