package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class PullRecyclerViewGroup extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Rect> f10199c;
    private boolean d;
    private int e;
    private Rect f;
    private List<View> h;
    private float i;

    public PullRecyclerViewGroup(Context context) {
        this(context, null);
    }

    public PullRecyclerViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullRecyclerViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new Rect();
        this.h = new ArrayList(16);
        this.f10199c = new ArrayList(16);
        this.d = false;
        a();
    }

    private void a() {
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        for (int i = 0; i < getChildCount(); i++) {
            if ((getChildAt(i) instanceof RecyclerView) || (getChildAt(i) instanceof ListView) || (getChildAt(i) instanceof HealthScrollView)) {
                if (this.f10198b == null) {
                    this.f10198b = getChildAt(i);
                } else {
                    throw new RuntimeException("PullRecyclerViewGroup on have one RecyclerView or ListView or HealthScrollView");
                }
            }
        }
        if (this.f10198b == null) {
            throw new RuntimeException("PullRecyclerViewGroup mChildView is null.");
        }
        super.onFinishInflate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f.set(this.f10198b.getLeft(), this.f10198b.getTop(), this.f10198b.getRight(), this.f10198b.getBottom());
        for (int i5 = 0; i5 < this.h.size(); i5++) {
            this.h.get(i5).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.huawei.health.suggestion.ui.view.PullRecyclerViewGroup.4
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                    Rect rect = new Rect();
                    rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    PullRecyclerViewGroup.this.f10199c.add(rect);
                    view.removeOnLayoutChangeListener(this);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getY() >= this.f.bottom || motionEvent.getY() <= this.f.top) {
            if (this.d) {
                c();
            }
            motionEvent.setAction(1);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            LogUtil.e("Suggestion_PullRecyclerViewGroup", LogAnonymous.c(e));
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                a(motionEvent);
            }
        } else if (this.d) {
            c();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        int y = (int) (motionEvent.getY() - this.i);
        if (!d() && y < 0) {
            int i = (int) (y * 0.5f);
            this.f10198b.layout(this.f.left, this.f.top + i, this.f.right, this.f.bottom + i);
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                if (this.h.get(i2) != null) {
                    this.h.get(i2).layout(this.f10199c.get(i2).left, this.f10199c.get(i2).top + i, this.f10199c.get(i2).right, this.f10199c.get(i2).bottom + i);
                }
            }
            this.d = true;
        } else {
            this.i = motionEvent.getY();
            this.d = false;
            c();
        }
        this.f10197a = (int) motionEvent.getX();
        this.e = (int) motionEvent.getY();
    }

    private void c() {
        if (this.d) {
            for (int i = 0; i < this.h.size(); i++) {
                if (this.f10199c.get(i) != null) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.h.get(i).getTop(), this.f10199c.get(i).top);
                    translateAnimation.setDuration(400L);
                    this.h.get(i).startAnimation(translateAnimation);
                    this.h.get(i).layout(this.f10199c.get(i).left, this.f10199c.get(i).top, this.f10199c.get(i).right, this.f10199c.get(i).bottom);
                }
            }
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, this.f10198b.getTop() - this.f.top, 0.0f);
            translateAnimation2.setDuration(400L);
            this.f10198b.startAnimation(translateAnimation2);
            this.f10198b.layout(this.f.left, this.f.top, this.f.right, this.f.bottom);
            this.d = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getY();
            this.e = (int) motionEvent.getY();
            this.f10197a = (int) motionEvent.getX();
            return false;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float y = motionEvent.getY();
            float x = motionEvent.getX();
            int i = (int) (y - this.i);
            int i2 = (int) (y - this.e);
            int i3 = (int) (x - this.f10197a);
            if (!d() && i < 0 && Math.abs(i2) > Math.abs(i3)) {
                z = true;
            }
            this.e = (int) motionEvent.getY();
            this.f10197a = (int) motionEvent.getX();
        }
        return z;
    }

    private boolean d() {
        View view = this.f10198b;
        if (view != null) {
            return ViewCompat.canScrollVertically(view, 1);
        }
        return true;
    }
}
