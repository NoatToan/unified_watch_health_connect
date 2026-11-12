package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;

/* JADX INFO: loaded from: classes43.dex */
public class wpc implements HwViewPager.PageTransformer, HwViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f52299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwViewPager f52300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52301c;
    private boolean d;
    private int e;
    private int g;
    private float h;

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }

    public wpc() {
        this(0.9f);
    }

    public wpc(float f) {
        this.d = false;
        this.f52299a = new Handler(Looper.getMainLooper()) { // from class: wpc.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if ((message.what == 0 || message.what == 2) && wpc.this.f52300b != null && wpc.this.g > 0 && wpc.this.f52300b.getChildCount() > 0) {
                    int currentItem = wpc.this.f52300b.getCurrentItem();
                    if (currentItem < 0 || currentItem >= wpc.this.g) {
                        currentItem = 0;
                    }
                    int i = wpc.this.g;
                    int i2 = wpc.this.g;
                    int i3 = wpc.this.g;
                    for (int i4 = 0; i4 < wpc.this.f52300b.getChildCount(); i4++) {
                        Object tag = wpc.this.f52300b.getChildAt(i4).getTag();
                        int iIntValue = tag instanceof Integer ? ((Integer) tag).intValue() : -1;
                        if (iIntValue == currentItem) {
                            wpc wpcVar = wpc.this;
                            wpcVar.e(wpcVar.f52300b.getChildAt(i4), 0.0f);
                        } else if (iIntValue == ((currentItem - 1) + i) % i2) {
                            wpc wpcVar2 = wpc.this;
                            wpcVar2.e(wpcVar2.f52300b.getChildAt(i4), -1.0f);
                        } else if (iIntValue == (currentItem + 1) % i3) {
                            wpc wpcVar3 = wpc.this;
                            wpcVar3.e(wpcVar3.f52300b.getChildAt(i4), 1.0f);
                        }
                    }
                    if (message.what == 2) {
                        wpc.this.d = false;
                    }
                    if (wpc.this.d) {
                        return;
                    }
                    wpc.this.d = true;
                    if (SystemClock.elapsedRealtime() - wpc.this.f52301c > 1000) {
                        wpc.this.f52301c = 0L;
                    } else {
                        sendEmptyMessageAtTime(2, SystemClock.elapsedRealtime() + 20);
                    }
                }
            }
        };
        this.h = f;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.PageTransformer
    public void transformPage(View view, float f) {
        float fD = d(view, f);
        if (this.e != 0) {
            float fMax = Math.max(1.0f - Math.abs(Math.min(Math.abs(fD), 1.0f) * 0.1f), this.h);
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        }
    }

    private float d(View view, float f) {
        HwViewPager hwViewPager;
        if (view == null || (hwViewPager = this.f52300b) == null) {
            return wvg.d(f, 0.2f);
        }
        int measuredWidth = (hwViewPager.getMeasuredWidth() - this.f52300b.getPaddingStart()) - this.f52300b.getPaddingEnd();
        if (measuredWidth <= 0) {
            return wvg.d(f, 0.2f);
        }
        return wvg.e((view.getLeft() - this.f52300b.getPaddingStart()) - this.f52300b.getScrollX(), measuredWidth, 3);
    }

    public void e(View view, float f) {
        if (view != null) {
            float fMax = Math.max(1.0f - Math.abs(Math.min(Math.abs(f), 1.0f) * 0.1f), this.h);
            view.setScaleX(fMax);
            view.setScaleY(fMax);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.e = i;
        if (i == 0) {
            this.f52301c = SystemClock.elapsedRealtime();
            Handler handler = this.f52299a;
            handler.handleMessage(Message.obtain(handler, 0));
        } else {
            this.f52301c = 0L;
            this.f52299a.removeMessages(0);
            this.f52299a.removeMessages(2);
            this.d = false;
        }
    }

    public void a(HwViewPager hwViewPager) {
        this.f52300b = hwViewPager;
    }

    public void c(int i) {
        this.g = i;
    }

    public void b() {
        this.g = 0;
        this.e = 0;
        this.f52300b = null;
    }

    public void e() {
        this.f52299a.removeMessages(0);
        this.f52299a.removeMessages(2);
        this.d = false;
        b();
    }
}
