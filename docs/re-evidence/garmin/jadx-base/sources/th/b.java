package th;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class b extends ViewPager {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ArrayList<h03.a> f164546g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f164547h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f164548i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f164549j1;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164547h1 = true;
        this.f164548i1 = false;
        this.f164549j1 = 0;
    }

    public ArrayList<h03.a> getDatesInMonth() {
        return this.f164546g1;
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.f164547h1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f164547h1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int size = this.f164546g1.size() / 7;
        boolean z14 = View.MeasureSpec.getMode(i15) == Integer.MIN_VALUE;
        int measuredHeight = getMeasuredHeight();
        if (z14 && this.f164549j1 == 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                childAt.measure(i14, View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                this.f164549j1 = childAt.getMeasuredHeight() / size;
            }
        }
        boolean z15 = this.f164548i1;
        int i16 = this.f164549j1;
        super.onMeasure(i14, View.MeasureSpec.makeMeasureSpec((z15 ? i16 * 6 : i16 * size) + 3, 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f164547h1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(fe.a aVar) {
        super.setAdapter(aVar);
        setCurrentItem(1000);
    }

    public void setDatesInMonth(ArrayList<h03.a> arrayList) {
        this.f164546g1 = arrayList;
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        this.f164547h1 = z14;
    }

    public void setSixWeeksInCalendar(boolean z14) {
        this.f164548i1 = z14;
        this.f164549j1 = 0;
    }

    public b(Context context) {
        super(context);
        this.f164547h1 = true;
        this.f164548i1 = false;
        this.f164549j1 = 0;
    }
}
