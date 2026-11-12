package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.openalliance.ad.analysis.BaseAnalysisInfo;
import com.huawei.openalliance.ad.db.bean.ContentRecord;

/* JADX INFO: loaded from: classes12.dex */
public class sh extends sf {
    private static final String[] e = {"com.huawei.openalliance.ad.views.ScanningRelativeLayout", "com.huawei.openalliance.ad.views.ParticleRelativeLayout"};
    private View f;
    private double g;
    private double h;
    private int i;
    private int j;
    private int k;
    private int l;
    private double m;
    private String n;

    @Override // com.huawei.openalliance.ad.sf
    public boolean a() {
        View view = this.f;
        if (view == null || !a(view)) {
            return false;
        }
        this.g = this.f.getWidth() * this.f.getHeight();
        Rect rect = new Rect();
        this.f.getGlobalVisibleRect(rect);
        this.i = rect.left;
        this.j = rect.right;
        this.k = rect.top;
        this.l = rect.bottom;
        if (b(this.f) >= 0.5d) {
            a(rect, "4");
            return true;
        }
        if (this.d != null) {
            return this.d.a();
        }
        return false;
    }

    private boolean c(View view) {
        if (view == null) {
            return false;
        }
        for (String str : e) {
            if (str.equals(view.getClass().getName())) {
                hw.a("ShadeDetector", "shaded by animator view.");
                this.m = 0.0d;
                return true;
            }
        }
        return false;
    }

    private double b(View view) {
        if (view == null) {
            return this.m;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return this.m;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(view);
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= viewGroup.getChildCount()) {
                double d = this.m;
                return d < 0.5d ? b(viewGroup) : d;
            }
            View childAt = viewGroup.getChildAt(iIndexOfChild);
            if (childAt.getVisibility() == 0) {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                a(rect);
                if (this.m >= 0.5d && !c(childAt)) {
                    this.n = childAt.getClass().getName();
                    return this.m;
                }
            }
        }
    }

    private void a(Rect rect, String str) {
        BaseAnalysisInfo baseAnalysisInfo = new BaseAnalysisInfo();
        baseAnalysisInfo.ak("2100040");
        baseAnalysisInfo.am(this.f.getClass().getSimpleName() + "_" + str);
        baseAnalysisInfo.an(String.valueOf(this.f.getAlpha()));
        baseAnalysisInfo.ao(String.valueOf(rect.width()));
        baseAnalysisInfo.ap(String.valueOf(rect.height()));
        baseAnalysisInfo.aq(this.n);
        this.f20253c.b(this.f20252b, baseAnalysisInfo);
    }

    private void a(Rect rect) {
        int iA = this.j - this.i;
        int iMin = this.l - this.k;
        if (rect.bottom <= this.l) {
            iMin -= (this.k - rect.top <= 0 ? rect.top - this.k : 0) + Math.min(this.l - rect.bottom, iMin);
        } else if (rect.top < this.k) {
            if (rect.top < this.k && rect.bottom > this.l) {
            }
            this.m = ((double) (iA * iMin)) / this.g;
        } else {
            int iMin2 = Math.min(rect.top - this.k, iMin);
            int i = rect.bottom;
            int i2 = this.l;
            iMin -= iMin2 + (i - i2 <= 0 ? i2 - rect.bottom : 0);
        }
        iA = a(rect, iA);
        this.m = ((double) (iA * iMin)) / this.g;
    }

    private int a(Rect rect, int i) {
        if (rect.right <= this.j) {
            return (this.j - this.i) - (Math.max(rect.left - this.i, 0) + Math.min(this.j - rect.right, i));
        }
        if (rect.left >= this.i) {
            int iMin = Math.min(rect.left - this.i, i);
            int i2 = rect.right;
            int i3 = this.j;
            return (this.j - this.i) - (iMin + (i2 - i3 <= 0 ? i3 - rect.right : 0));
        }
        if (rect.left < this.i) {
            int i4 = rect.right;
            int i5 = this.j;
            if (i4 > i5) {
                return i5 - this.i;
            }
        }
        return 0;
    }

    public sh(Context context, ContentRecord contentRecord, View view) {
        super(context, contentRecord);
        this.g = 0.0d;
        this.h = 0.0d;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0.0d;
        this.f = view;
    }
}
