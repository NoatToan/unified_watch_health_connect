package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class xfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52842c;
    private float d;
    private HwRecyclerView e;
    private Deque<Integer> g;

    public xfj(HwRecyclerView hwRecyclerView) {
        if (hwRecyclerView == null) {
            Log.e("HwPageTurningScrollHelper", "The given hwRecyclerView can not be null!");
            return;
        }
        this.e = hwRecyclerView;
        this.g = new LinkedList();
        this.d = 0.125f;
        this.f52842c = 0.125f;
    }

    private void c(RecyclerView.LayoutManager layoutManager, float f) {
        int height = (this.e.getHeight() - this.e.getPaddingTop()) - this.e.getPaddingBottom();
        if (Float.compare(Math.abs(f), height * this.d) < 0) {
            return;
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            HwRecyclerView hwRecyclerView = this.e;
            if (((int) f) <= 0) {
                height = -height;
            }
            hwRecyclerView.scrollBy(0, height);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (Float.compare(f, 0.0f) <= 0) {
            b(linearLayoutManager);
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition) == null) {
            Log.e("HwPageTurningScrollHelper", "Page turning scroll vertically error, first visible item view is null.");
            return;
        }
        if (!b(true)) {
            this.g.push(Integer.valueOf(iFindFirstVisibleItemPosition));
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            Log.e("HwPageTurningScrollHelper", "Page turning scroll vertically error, last visible item view is null.");
        } else if (c(linearLayoutManager, viewFindViewByPosition, true)) {
            linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition, 0);
        } else {
            linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition + 1, 0);
        }
    }

    public void a(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.e("HwPageTurningScrollHelper", "The given motionEvent can not be null!");
        } else {
            this.f52841b = motionEvent.getX();
            this.f52840a = motionEvent.getY();
        }
    }

    public void c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.e("HwPageTurningScrollHelper", "The given motionEvent can not be null!");
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.LayoutManager layoutManager = this.e.getLayoutManager();
        if (layoutManager == null) {
            Log.e("HwPageTurningScrollHelper", "onMotionTouchUp error, the layout manager is null.");
            return;
        }
        boolean zCanScrollVertically = layoutManager.canScrollVertically();
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        if (zCanScrollVertically) {
            c(layoutManager, this.f52840a - y);
            return;
        }
        if (!zCanScrollHorizontally) {
            Log.i("HwPageTurningScrollHelper", "The RecyclerView can neither scroll horizontally nor vertically, do nothing.");
        } else if (c()) {
            a(layoutManager, this.f52841b - x);
        } else {
            e(layoutManager, this.f52841b - x);
        }
    }

    public void b(float f) {
        this.f52842c = f;
    }

    private void b(LinearLayoutManager linearLayoutManager) {
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        Integer numPeek = this.g.peek();
        while (numPeek != null && numPeek.intValue() > iFindFirstVisibleItemPosition) {
            this.g.pop();
            numPeek = this.g.peek();
        }
        if (!this.g.isEmpty()) {
            linearLayoutManager.scrollToPositionWithOffset(this.g.pop().intValue(), 0);
        } else {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
    }

    private boolean c(RecyclerView.LayoutManager layoutManager, View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            return false;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        if (z) {
            return layoutManager.getDecoratedBottom(view) + layoutParams2.bottomMargin > this.e.getHeight() - this.e.getPaddingBottom();
        }
        if (c()) {
            return layoutManager.getDecoratedLeft(view) - layoutParams2.leftMargin < this.e.getPaddingLeft();
        }
        return layoutManager.getDecoratedRight(view) + layoutParams2.rightMargin > this.e.getWidth() - this.e.getPaddingRight();
    }

    public void d(float f) {
        this.d = f;
    }

    private void a(RecyclerView.LayoutManager layoutManager, float f) {
        int width = (this.e.getWidth() - this.e.getPaddingRight()) - this.e.getPaddingLeft();
        if (Float.compare(Math.abs(f), width * this.f52842c) < 0) {
            return;
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            HwRecyclerView hwRecyclerView = this.e;
            if (((int) f) > 0) {
                width = -width;
            }
            hwRecyclerView.scrollBy(width, 0);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (Float.compare(f, 0.0f) < 0) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition) == null) {
                Log.e("HwPageTurningScrollHelper", "Page turning scroll horizontally rtl error, first visible item view is null.");
                return;
            }
            if (!b(false)) {
                this.g.push(Integer.valueOf(iFindFirstVisibleItemPosition));
            }
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                Log.e("HwPageTurningScrollHelper", "Page turning scroll horizontally rtl error, last visible item view is null.");
                return;
            } else if (c(linearLayoutManager, viewFindViewByPosition, false)) {
                linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition, 0);
                return;
            } else {
                linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition + 1, 0);
                return;
            }
        }
        b(linearLayoutManager);
    }

    private void e(RecyclerView.LayoutManager layoutManager, float f) {
        int width = (this.e.getWidth() - this.e.getPaddingRight()) - this.e.getPaddingLeft();
        if (Float.compare(Math.abs(f), width * this.f52842c) < 0) {
            return;
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            HwRecyclerView hwRecyclerView = this.e;
            if (Float.compare(f, 0.0f) <= 0) {
                width = -width;
            }
            hwRecyclerView.scrollBy(width, 0);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (Float.compare(f, 0.0f) > 0) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition) == null) {
                Log.e("HwPageTurningScrollHelper", "Page turning scroll horizontally error, first visible item view is null.");
                return;
            }
            if (!b(false)) {
                this.g.push(Integer.valueOf(iFindFirstVisibleItemPosition));
            }
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                Log.e("HwPageTurningScrollHelper", "Page turning scroll horizontally error, last visible item view is null.");
                return;
            } else if (c(linearLayoutManager, viewFindViewByPosition, false)) {
                linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition, 0);
                return;
            } else {
                linearLayoutManager.scrollToPositionWithOffset(iFindLastVisibleItemPosition + 1, 0);
                return;
            }
        }
        b(linearLayoutManager);
    }

    private boolean c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    private boolean b(boolean z) {
        if (z) {
            return this.e.computeVerticalScrollOffset() + this.e.computeVerticalScrollExtent() >= this.e.computeVerticalScrollRange();
        }
        return this.e.computeHorizontalScrollOffset() + this.e.computeHorizontalScrollExtent() >= this.e.computeHorizontalScrollRange();
    }
}
