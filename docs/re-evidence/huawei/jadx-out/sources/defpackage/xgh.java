package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwViewPager f52876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52878c = 0.125f;
    private float d = 0.125f;
    private float e;

    public xgh(HwViewPager hwViewPager) {
        this.f52876a = hwViewPager;
    }

    public void a(float f) {
        this.f52878c = f;
    }

    public void c(MotionEvent motionEvent) {
        if (this.f52876a == null) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.f52876a.isPageScrollHorizontal()) {
            c(this.f52877b - y);
            return;
        }
        float f = this.e - x;
        if (d()) {
            f = -f;
        }
        b(f);
    }

    public void d(float f) {
        this.d = f;
    }

    public void d(MotionEvent motionEvent) {
        this.e = motionEvent.getX();
        this.f52877b = motionEvent.getY();
    }

    private void b(float f) {
        HwViewPager hwViewPager = this.f52876a;
        if (hwViewPager == null) {
            return;
        }
        if (Float.compare(Math.abs(f), ((this.f52876a.getWidth() - this.f52876a.getPaddingLeft()) - hwViewPager.getPaddingRight()) * this.d) < 0) {
            Log.w("HwPageTurningHelper", "the horizontal condition is not met.");
            return;
        }
        if (f < 0.0f) {
            this.f52876a.prePage(false);
        } else if (f > 0.0f) {
            this.f52876a.nextPage(false, false);
        } else {
            Log.d("HwPageTurningHelper", "the horizontal deltaX is zero.");
        }
    }

    private void c(float f) {
        HwViewPager hwViewPager = this.f52876a;
        if (hwViewPager == null) {
            return;
        }
        if (Float.compare(Math.abs(f), ((this.f52876a.getHeight() - this.f52876a.getPaddingTop()) - hwViewPager.getPaddingBottom()) * this.f52878c) < 0) {
            Log.w("HwPageTurningHelper", "the vertical condition is not met.");
            return;
        }
        if (f < 0.0f) {
            this.f52876a.prePage(false);
        } else if (f > 0.0f) {
            this.f52876a.nextPage(false, false);
        } else {
            Log.d("HwPageTurningHelper", "the vertical deltaY is zero.");
        }
    }

    private boolean d() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
