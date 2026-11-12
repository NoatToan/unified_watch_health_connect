package com.huawei.ui.device.views.music;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.StatusBarClickedListener;
import defpackage.rfu;

/* JADX INFO: loaded from: classes16.dex */
public class MusicNestedScrollLayout extends NestedScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StatusBarClickedListener f25025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f25026c;
    private ViewGroup d;
    private int e;
    private int j;

    static /* synthetic */ int b(MusicNestedScrollLayout musicNestedScrollLayout, int i) {
        int i2 = musicNestedScrollLayout.e + i;
        musicNestedScrollLayout.e = i2;
        return i2;
    }

    public MusicNestedScrollLayout(Context context) {
        this(context, null);
    }

    public MusicNestedScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MusicNestedScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        this.f25024a = false;
        d();
    }

    private void d() {
        setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.huawei.ui.device.views.music.MusicNestedScrollLayout.1
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (MusicNestedScrollLayout.this.f25024a) {
                    MusicNestedScrollLayout.this.e = 0;
                    MusicNestedScrollLayout.this.f25024a = false;
                }
                if (i2 == MusicNestedScrollLayout.this.getChildAt(0).getMeasuredHeight() - view.getMeasuredHeight()) {
                    LogUtil.d("MusicNestedScrollLayout", "bottom scroll");
                    MusicNestedScrollLayout.this.c();
                }
                MusicNestedScrollLayout.b(MusicNestedScrollLayout.this, i2 - i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int i = this.j;
        if (i != 0) {
            double d = rfu.d(i);
            Double dValueOf = Double.valueOf(d);
            dValueOf.getClass();
            if (d > this.e) {
                dValueOf.getClass();
                double d2 = this.e;
                Double.valueOf(d2).getClass();
                a(rfu.d(d - d2));
            }
        }
        this.e = 0;
        this.j = 0;
    }

    private void a(int i) {
        RecyclerView recyclerViewE = e(this.f25026c);
        if (recyclerViewE != null) {
            recyclerViewE.fling(0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("MusicNestedScrollLayout", "enter, scrollToTop");
        if (getScrollY() != 0) {
            smoothScrollTo(0, 0);
            RecyclerView recyclerViewE = e(this.f25026c);
            if (recyclerViewE != null) {
                recyclerViewE.scrollToPosition(0);
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildAt(0) instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (viewGroup.getChildAt(0) instanceof ViewGroup) {
                this.d = (ViewGroup) viewGroup.getChildAt(0);
            }
            if (viewGroup.getChildAt(1) instanceof ViewGroup) {
                this.f25026c = (ViewGroup) viewGroup.getChildAt(1);
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ViewGroup.LayoutParams layoutParams = this.f25026c.getLayoutParams();
        layoutParams.height = getMeasuredHeight();
        this.f25026c.setLayoutParams(layoutParams);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i2 <= 0 || getScrollY() >= this.d.getMeasuredHeight()) {
            return;
        }
        scrollBy(0, i2);
        iArr[1] = i2;
    }

    @Override // androidx.core.widget.NestedScrollView
    public void fling(int i) {
        super.fling(i);
        if (i <= 0) {
            this.j = 0;
        } else {
            this.f25024a = true;
            this.j = i;
        }
    }

    private RecyclerView e(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                RecyclerView recyclerViewE = e((ViewGroup) childAt);
                if (recyclerViewE != null) {
                    return recyclerViewE;
                }
            } else {
                LogUtil.j("MusicNestedScrollLayout", "getChildRecyclerView, default.");
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LogUtil.a("MusicNestedScrollLayout", "onDetachedFromWindow");
        StatusBarClickedListener statusBarClickedListener = this.f25025b;
        if (statusBarClickedListener != null) {
            statusBarClickedListener.unregister();
            this.f25025b = null;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LogUtil.a("MusicNestedScrollLayout", "onAttachedToWindow");
        if (this.f25025b == null) {
            this.f25025b = new StatusBarClickedListener() { // from class: com.huawei.ui.device.views.music.MusicNestedScrollLayout.3
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    MusicNestedScrollLayout.this.b();
                }
            };
        }
    }
}
