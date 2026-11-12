package com.huawei.ui.commonui.recycleview;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.phone.hwrecyclerview.widget.HwRecyclerView;
import defpackage.lmd;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class HealthRecycleView extends HwRecyclerView implements LifecycleObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static CopyOnWriteArrayList<lmd> f23815c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23816b;
    private Map<Integer, Long> d;
    private OnCardExposureTimeListener e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int n;
    private int o;

    public interface OnCardExposureTimeListener {
        void onCardExposed(int i, long j, TimeUnit timeUnit);
    }

    public HealthRecycleView(Context context) {
        super(context);
        this.j = false;
        this.k = true;
        this.h = false;
        this.f23816b = false;
        this.i = false;
        this.g = false;
        this.d = new ConcurrentHashMap();
        c();
    }

    public HealthRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = true;
        this.h = false;
        this.f23816b = false;
        this.i = false;
        this.g = false;
        this.d = new ConcurrentHashMap();
        c();
    }

    public HealthRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = true;
        this.h = false;
        this.f23816b = false;
        this.i = false;
        this.g = false;
        this.d = new ConcurrentHashMap();
        c();
    }

    private void c() {
        setOverScrollMode(2);
    }

    private void v() {
        qsp.a((View) this, (ViewTreeObserver.OnGlobalLayoutListener) new a(this));
        qsp.a((View) this, (ViewTreeObserver.OnScrollChangedListener) new a(this));
    }

    public void setIsScroll(boolean z) {
        this.k = z;
    }

    public void setIsIntercept(boolean z) {
        this.h = z;
    }

    public void setIsConsumption(boolean z) {
        this.f23816b = z;
    }

    public void setIsConsumptionMoving(boolean z) {
        this.i = z;
    }

    public void setIsFling(boolean z) {
        this.g = z;
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.o = (int) motionEvent.getY();
        } else if (action == 2 && this.f && c(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private boolean c(MotionEvent motionEvent) {
        return (u() && ((motionEvent.getY() - ((float) this.o)) > 0.0f ? 1 : ((motionEvent.getY() - ((float) this.o)) == 0.0f ? 0 : -1)) > 0) || (w() && ((motionEvent.getY() - ((float) this.o)) > 0.0f ? 1 : ((motionEvent.getY() - ((float) this.o)) == 0.0f ? 0 : -1)) < 0);
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23816b) {
            return true;
        }
        if (this.i && motionEvent.getAction() == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        super.dispatchWindowFocusChanged(z);
        setScrollTopEnable(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            if (!this.k) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            } else {
                super.onMeasure(i, i2);
            }
        } catch (Exception e) {
            int id = getId();
            String strJ = qre.j(id);
            StringBuilder sb = new StringBuilder("on measure recycler view exception happened,");
            sb.append(e);
            sb.append(", id = ");
            sb.append(id);
            sb.append(" resourceName ");
            sb.append(strJ);
            sb.append(", adapter = ");
            sb.append(getAdapter() != null ? getAdapter() : Constants.NULL);
            String string = sb.toString();
            LogUtil.c("HealthRecycleView", string);
            throw new RuntimeException(string + System.lineSeparator() + DfxUtils.d(Thread.currentThread(), e));
        }
    }

    @Override // com.huawei.uikit.hwrecyclerview.widget.HwRecyclerView, androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.g) {
            if (Math.abs(i) >= 60) {
                return super.fling(i, i2);
            }
            if (i < 0) {
                return super.fling(-600, i2);
            }
            return super.fling(600, i2);
        }
        return super.fling(i, i2);
    }

    public void setIsPriorityScroll(boolean z) {
        this.f = z;
    }

    private boolean w() {
        return computeVerticalScrollExtent() + computeVerticalScrollOffset() >= computeVerticalScrollRange();
    }

    private boolean u() {
        return computeVerticalScrollOffset() <= 0;
    }

    public void setIsOpenExposedTime(boolean z) {
        this.j = z;
        if (z) {
            this.n = getResources().getDisplayMetrics().widthPixels / 2;
            v();
        }
    }

    public void setCollectExposedTime(lmd lmdVar) {
        if (lmdVar == null) {
            return;
        }
        if (f23815c == null) {
            f23815c = new CopyOnWriteArrayList<>();
        }
        for (lmd lmdVar2 : f23815c) {
            if (lmdVar2.equals(lmdVar)) {
                lmdVar2.a(lmdVar2.e() + lmdVar.e());
                return;
            }
        }
        f23815c.add(lmdVar);
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<HealthRecycleView> f23817a;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        public a(HealthRecycleView healthRecycleView) {
            this.f23817a = new WeakReference<>(healthRecycleView);
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            HealthRecycleView healthRecycleView = this.f23817a.get();
            if (healthRecycleView != null && healthRecycleView.j) {
                int height = healthRecycleView.getHeight();
                int width = healthRecycleView.getWidth();
                Rect rect = new Rect();
                if (!healthRecycleView.getLocalVisibleRect(rect) || !healthRecycleView.d(rect, height, width)) {
                    healthRecycleView.y();
                } else {
                    healthRecycleView.e();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Rect rect, int i, int i2) {
        return rect != null && rect.left >= 0 && rect.left < i2 && rect.top >= 0 && rect.top < i && rect.bottom >= Math.min(i / 2, 400);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        OnCardExposureTimeListener onCardExposureTimeListener;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int i = iFindFirstVisibleItemPosition; i <= iFindLastVisibleItemPosition; i++) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (viewFindViewByPosition != null) {
                    int measuredWidth = viewFindViewByPosition.getMeasuredWidth();
                    int measuredHeight = viewFindViewByPosition.getMeasuredHeight();
                    Rect rect = new Rect();
                    viewFindViewByPosition.getGlobalVisibleRect(rect);
                    boolean z = linearLayoutManager.getOrientation() == 0;
                    int iWidth = z ? rect.width() : rect.height();
                    int i2 = z ? measuredWidth / 2 : measuredHeight / 2;
                    if (i2 == 0) {
                        i2 = this.n;
                    }
                    this.n = i2;
                    e(iWidth, i);
                }
            }
            for (Integer num : this.d.keySet()) {
                int iIntValue = num.intValue();
                if (iIntValue < iFindFirstVisibleItemPosition || iIntValue > iFindLastVisibleItemPosition) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.d.get(num).longValue();
                    if (jCurrentTimeMillis >= 1000 && (onCardExposureTimeListener = this.e) != null) {
                        onCardExposureTimeListener.onCardExposed(iIntValue, jCurrentTimeMillis, TimeUnit.MILLISECONDS);
                    }
                    this.d.remove(num);
                }
            }
        }
    }

    private void e(int i, int i2) {
        OnCardExposureTimeListener onCardExposureTimeListener;
        if (i >= this.n) {
            if (this.d.containsKey(Integer.valueOf(i2))) {
                return;
            }
            this.d.put(Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis()));
        } else if (this.d.containsKey(Integer.valueOf(i2))) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.d.get(Integer.valueOf(i2)).longValue();
            if (jCurrentTimeMillis >= 1000 && (onCardExposureTimeListener = this.e) != null) {
                onCardExposureTimeListener.onCardExposed(i2, jCurrentTimeMillis, TimeUnit.MILLISECONDS);
            }
            this.d.remove(Integer.valueOf(i2));
        }
    }

    public void setOnCardExposureTimeListener(OnCardExposureTimeListener onCardExposureTimeListener) {
        this.e = onCardExposureTimeListener;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (this.j) {
            LogUtil.e("HealthRecycleView", "Item at position onStop");
            y();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (!this.j || this.d == null) {
            return;
        }
        LogUtil.e("HealthRecycleView", "Item at position onResume");
        this.d.clear();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        OnCardExposureTimeListener onCardExposureTimeListener;
        Map<Integer, Long> map = this.d;
        if (map == null || map.isEmpty()) {
            return;
        }
        LogUtil.e("HealthRecycleView", "stopAllExposureCalculation");
        for (Map.Entry<Integer, Long> entry : this.d.entrySet()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - entry.getValue().longValue();
            if (jCurrentTimeMillis >= 1000 && (onCardExposureTimeListener = this.e) != null) {
                onCardExposureTimeListener.onCardExposed(entry.getKey().intValue(), jCurrentTimeMillis, TimeUnit.MILLISECONDS);
            }
        }
        this.d.clear();
    }
}
