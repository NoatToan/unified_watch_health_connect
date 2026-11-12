package com.huawei.ui.commonui.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.uikit.hwprogressindicator.R;
import com.huawei.uikit.phone.hwprogressindicator.widget.HwProgressIndicator;
import defpackage.qor;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HealthProgressIndicator extends HwProgressIndicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23810c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float h;
    private float i;
    private int j;
    private Map<Integer, qor> l;
    private double m;

    public HealthProgressIndicator(Context context) {
        super(context);
        this.f23809b = -1;
        this.f23810c = -1;
        this.g = 3;
        this.h = 0.0f;
        e(getResources());
    }

    public HealthProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23809b = -1;
        this.f23810c = -1;
        this.g = 3;
        this.h = 0.0f;
        e(getResources());
    }

    public HealthProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23809b = -1;
        this.f23810c = -1;
        this.g = 3;
        this.h = 0.0f;
        e(getResources());
    }

    @Override // com.huawei.uikit.hwprogressindicator.widget.HwProgressIndicator
    public void setProgress(int i) {
        if (this.j == 0) {
            LogUtil.d("HealthProgressIndicator", "onIndicatorWidthChanged again");
            c();
        }
        super.setProgress(i);
        this.f = i;
        b();
        if (!this.l.containsKey(Integer.valueOf(i))) {
            int iSin = (this.f23809b / 2) + ((int) (((double) this.j) * Math.sin(this.m)));
            int i2 = this.f23810c / 2;
            int iCos = (int) (((double) this.j) * Math.cos(this.m));
            if (LanguageUtil.ba(getContext())) {
                iSin = (this.f23809b / 2) - ((int) (((double) this.j) * Math.sin(this.m)));
            }
            this.l.put(Integer.valueOf(i), new qor(iSin, i2 - iCos));
        }
        this.d = this.l.get(Integer.valueOf(i)).a();
        int iD = this.l.get(Integer.valueOf(i)).d();
        this.f23808a = iD;
        if (this.d == iD) {
            this.l.remove(Integer.valueOf(i));
        }
    }

    public qor getPosition() {
        return new qor(this.d, this.f23808a);
    }

    private void b() {
        float f = this.f / 100.0f;
        this.h = f;
        float f2 = f * 360.0f;
        this.i = f2;
        this.m = Math.toRadians(f2);
    }

    private void e(Resources resources) {
        int i = this.g;
        if (i == 0) {
            this.f23810c = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_height);
            this.f23809b = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_width);
        } else if (i == 3) {
            this.f23810c = resources.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.hwprogressindicator_new_large_height);
            this.f23809b = resources.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.hwprogressindicator_new_large_width);
        } else if (i == 1) {
            this.f23810c = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_height);
            this.f23809b = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_width);
        } else {
            this.f23810c = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_height);
            this.f23809b = resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_width);
        }
        if (this.e == -1) {
            this.e = a(resources);
        }
        this.l = new HashMap();
        b(resources);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    private void c() {
        this.j = Math.min((getHeight() - getPaddingBottom()) - getPaddingTop(), (getWidth() - getPaddingLeft()) - getPaddingRight()) / 2;
    }

    private int a(Resources resources) {
        int i = this.g;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_bar_width);
        }
        if (i == 2) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_bar_width);
        }
        return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_bar_width);
    }

    private int d(Resources resources) {
        int i = this.g;
        if (i == 1) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_middle_padding);
        }
        if (i == 2) {
            return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_small_padding);
        }
        return resources.getDimensionPixelSize(R.dimen.hwprogressindicator_large_padding);
    }

    private void b(Resources resources) {
        int iA = a(resources);
        if (iA == 0) {
            return;
        }
        int iD = (int) ((this.e * d(resources)) / iA);
        setPadding(iD, iD, iD, iD);
    }
}
