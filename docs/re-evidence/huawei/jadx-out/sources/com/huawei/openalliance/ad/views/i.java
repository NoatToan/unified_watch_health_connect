package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hs;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f21241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f21242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected View f21243c;
    protected float d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected Boolean i;
    protected ViewTreeObserver.OnGlobalLayoutListener j;
    private int[] k;
    private int[] l;

    /* JADX INFO: loaded from: classes.dex */
    public interface a {
        void l();
    }

    protected abstract void a(Context context);

    protected abstract void b(Context context);

    protected abstract void c();

    public void e() {
    }

    public void setAdContent(ContentRecord contentRecord) {
    }

    public void setFeedbackListener(com.huawei.openalliance.ad.views.feedback.b bVar) {
    }

    public void setScreenLockCallBack(a aVar) {
    }

    public void setViewClickListener(hs hsVar) {
    }

    public void setShowWhyThisAd(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    public void setPaddingStart(int i) {
        if (dk.c()) {
            this.g = 0;
            this.h = i;
        } else {
            this.g = i;
            this.h = 0;
        }
        c();
    }

    public int getViewWith() {
        return this.f;
    }

    public float getViewWidthPercent() {
        return this.d;
    }

    protected boolean d() {
        return (this.l == null || this.k == null) ? false : true;
    }

    public void d(Context context) {
        int iWidth;
        int iHeight;
        if (this.f21243c != null) {
            int iB = com.huawei.openalliance.ad.utils.d.b(context);
            int iA = com.huawei.openalliance.ad.utils.d.a(context);
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 30) {
                    Activity activity = (Activity) context;
                    iWidth = activity.getWindowManager().getCurrentWindowMetrics().getBounds().width();
                    iHeight = activity.getWindowManager().getCurrentWindowMetrics().getBounds().height();
                } else {
                    Point point = new Point();
                    ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
                    iWidth = point.x;
                    iHeight = point.y;
                }
                int i = iWidth;
                iA = iHeight;
                iB = i;
            }
            ViewGroup.LayoutParams layoutParams = this.f21243c.getLayoutParams();
            int iMin = (int) ((dk.k(context) == 1 ? iB : Math.min(iB, iA)) * this.d);
            this.f = iMin;
            layoutParams.width = iMin;
            this.f21243c.setLayoutParams(layoutParams);
        }
    }

    protected void c(Context context) {
        if (com.huawei.openalliance.ad.utils.ab.n(context)) {
            this.d = 0.6f;
        } else if (com.huawei.openalliance.ad.utils.ab.q(context) && com.huawei.openalliance.ad.utils.ab.r(context)) {
            this.d = 0.6f;
        } else {
            this.d = 0.86f;
        }
    }

    public void a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr2 == null) {
            return;
        }
        this.k = Arrays.copyOf(iArr, iArr.length);
        this.l = Arrays.copyOf(iArr2, iArr2.length);
    }

    public void a(int i) {
        int i2 = this.g;
        if (i2 > i) {
            this.g = i2 - i;
        }
        int i3 = this.h;
        if (i3 > i) {
            this.h = i3 - i;
        }
        c();
    }

    private void e(Context context) {
        try {
            a(context);
            c(context);
            d(context);
            b(context);
            c();
        } catch (Throwable th) {
            hw.c("PPSBaseDialogContentView", "init ex: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public i(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = (int) (com.huawei.openalliance.ad.utils.d.a(getContext()) * 0.8f);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.openalliance.ad.views.i.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    if (i.this.f21242b == null) {
                        return;
                    }
                    i.this.f21242b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredHeight = i.this.f21242b.getMeasuredHeight();
                    i iVar = i.this;
                    iVar.a(iVar.f21242b, Math.min(measuredHeight, i.this.e));
                } catch (Throwable th) {
                    hw.c("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
                }
            }
        };
        e(context);
    }

    public i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = (int) (com.huawei.openalliance.ad.utils.d.a(getContext()) * 0.8f);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.openalliance.ad.views.i.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    if (i.this.f21242b == null) {
                        return;
                    }
                    i.this.f21242b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredHeight = i.this.f21242b.getMeasuredHeight();
                    i iVar = i.this;
                    iVar.a(iVar.f21242b, Math.min(measuredHeight, i.this.e));
                } catch (Throwable th) {
                    hw.c("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
                }
            }
        };
        e(context);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = (int) (com.huawei.openalliance.ad.utils.d.a(getContext()) * 0.8f);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.openalliance.ad.views.i.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    if (i.this.f21242b == null) {
                        return;
                    }
                    i.this.f21242b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredHeight = i.this.f21242b.getMeasuredHeight();
                    i iVar = i.this;
                    iVar.a(iVar.f21242b, Math.min(measuredHeight, i.this.e));
                } catch (Throwable th) {
                    hw.c("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
                }
            }
        };
        e(context);
    }

    public i(Context context) {
        super(context);
        this.e = (int) (com.huawei.openalliance.ad.utils.d.a(getContext()) * 0.8f);
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.openalliance.ad.views.i.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    if (i.this.f21242b == null) {
                        return;
                    }
                    i.this.f21242b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredHeight = i.this.f21242b.getMeasuredHeight();
                    i iVar = i.this;
                    iVar.a(iVar.f21242b, Math.min(measuredHeight, i.this.e));
                } catch (Throwable th) {
                    hw.c("PPSBaseDialogContentView", "onGlobalLayout error: %s", th.getClass().getSimpleName());
                }
            }
        };
        e(context);
    }
}
