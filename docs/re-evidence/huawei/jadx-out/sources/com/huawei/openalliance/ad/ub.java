package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ub extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f20294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f20295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f20296c;
    protected int[] d;
    protected int[] e;
    protected float f;
    protected com.huawei.openalliance.ad.views.i g;
    protected com.huawei.openalliance.ad.views.i h;
    protected com.huawei.openalliance.ad.views.i i;
    protected int j;
    protected View k;
    protected View l;
    protected ImageView m;
    protected ImageView n;
    protected ImageView o;
    protected Context p;
    protected Boolean q;
    protected int r;
    private int s;
    private boolean t;

    protected abstract void a();

    protected abstract int getLayoutId();

    public void setScreenWidth(int i) {
        if (i > 0) {
            this.f20294a = i;
        }
    }

    public void setScreenHeight(int i) {
        if (i > 0) {
            this.f20295b = i;
        }
    }

    public void setAdContent(ContentRecord contentRecord) {
        this.i.setAdContent(contentRecord);
        b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    public boolean j() {
        RelativeLayout relativeLayout = this.f20296c;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public void i() {
        c();
    }

    public void h() {
        b();
    }

    public com.huawei.openalliance.ad.views.i getTopDialogView() {
        return this.g;
    }

    @Override // android.view.View
    public RelativeLayout getRootView() {
        return this.f20296c;
    }

    public com.huawei.openalliance.ad.views.i getBottomDialogView() {
        return this.h;
    }

    protected boolean g() {
        return this.r == 1;
    }

    protected boolean f() {
        int[] iArr = this.d;
        boolean z = iArr != null && iArr.length == 2;
        int[] iArr2 = this.e;
        return z && (iArr2 != null && iArr2.length == 2);
    }

    protected void e() {
        ImageView imageView;
        float f;
        if (!f()) {
            c();
            return;
        }
        int iA = com.huawei.openalliance.ad.utils.as.a(this.p, 36.0f);
        int i = this.j;
        int i2 = (this.f20294a - i) - iA;
        int i3 = (this.d[0] + (this.e[0] / 2)) - (iA / 2);
        if (i3 >= i) {
            i = i3;
        }
        if (i <= i2) {
            i2 = i;
        }
        if (com.huawei.openalliance.ad.utils.dk.c()) {
            imageView = this.o;
            f = -i2;
        } else {
            imageView = this.o;
            f = i2;
        }
        imageView.setX(f);
    }

    protected void d() {
        this.f20294a = com.huawei.openalliance.ad.utils.d.b(this.p);
        this.f20295b = com.huawei.openalliance.ad.utils.d.a(this.p);
        this.s = com.huawei.openalliance.ad.utils.dk.k(this.p);
        this.j = com.huawei.openalliance.ad.utils.as.a(this.p, this.f + 16.0f);
    }

    protected void c() {
        RelativeLayout relativeLayout = this.f20296c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    protected void b() {
        if (!f()) {
            c();
            return;
        }
        RelativeLayout relativeLayout = this.f20296c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        n();
        m();
        e();
        o();
    }

    private void o() {
        if (!f()) {
            c();
        } else if (g()) {
            uc.a(this.p, this.s, this.i, this.o, this.f20294a, 12);
        } else {
            uc.a(this.p, this.s, this.i, this.o, this.f20294a);
        }
    }

    private void n() {
        if (!f()) {
            c();
            return;
        }
        boolean zBooleanValue = this.d[1] + (this.e[1] / 2) <= this.f20295b / 2;
        Boolean bool = this.q;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        a(zBooleanValue);
        com.huawei.openalliance.ad.views.i iVar = this.i;
        if (iVar != null) {
            iVar.a(this.d, this.e);
            RelativeLayout.LayoutParams layoutParamsB = b(zBooleanValue);
            if (layoutParamsB != null) {
                this.i.setLayoutParams(layoutParamsB);
            }
        }
    }

    private void m() {
        if (!f()) {
            c();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.d[0];
            layoutParams2.height = this.t ? this.d[1] - this.e[1] : this.d[1];
            this.k.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.l.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.width = this.e[0];
            layoutParams4.height = this.e[1];
            this.l.setLayoutParams(layoutParams4);
        }
    }

    private void l() {
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f20296c.setForceDarkAllowed(false);
        }
        this.f20296c.setOnClickListener(new a(this.f20296c));
    }

    private void k() {
        if (f() && com.huawei.openalliance.ad.utils.dk.c()) {
            int[] iArr = this.d;
            int i = (this.f20294a - iArr[0]) - this.e[0];
            iArr[0] = i;
            hw.b("PPSBaseDialog", "rtl mAnchorViewLoc[x,y]= %d, %d", Integer.valueOf(i), Integer.valueOf(iArr[1]));
        }
    }

    private RelativeLayout.LayoutParams b(boolean z) {
        int iH;
        int i;
        com.huawei.openalliance.ad.views.i iVar = this.i;
        if (iVar == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) iVar.getLayoutParams();
        boolean zN = com.huawei.openalliance.ad.utils.ab.n(this.p);
        boolean z2 = com.huawei.openalliance.ad.utils.ab.o(this.p) && (1 == (i = this.s) || 9 == i);
        boolean z3 = com.huawei.openalliance.ad.utils.ab.q(this.p) && com.huawei.openalliance.ad.utils.ab.r(this.p);
        if (z) {
            if (!zN && !z2 && !z3) {
                return layoutParams;
            }
            layoutParams.setMargins(0, 0, 0, Math.max(com.huawei.openalliance.ad.utils.as.a(this.p, 40.0f), com.huawei.openalliance.ad.utils.dk.g(this.p)));
            return layoutParams;
        }
        if (this.t) {
            iH = com.huawei.openalliance.ad.utils.dk.y(this.p);
        } else {
            iH = com.huawei.openalliance.ad.utils.as.h(this.p);
            if (cc.a(this.p).a(this.p)) {
                iH = Math.max(iH, cc.a(this.p).a(this.f20296c));
            }
        }
        layoutParams.setMargins(0, iH, 0, 0);
        return layoutParams;
    }

    private void a(boolean z) {
        hw.b("PPSBaseDialog", "config %s", Boolean.valueOf(z));
        int i = z ? 8 : 0;
        int i2 = z ? 0 : 8;
        this.g.setVisibility(i);
        this.m.setVisibility(i);
        this.n.setVisibility(i2);
        this.h.setVisibility(i2);
        this.i = z ? this.h : this.g;
        this.o = z ? this.n : this.m;
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        this.p = context.getApplicationContext();
        this.t = com.huawei.openalliance.ad.utils.dk.b(com.huawei.openalliance.ad.utils.dk.d(this));
        d();
        l();
        k();
        b();
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<View> f20297a;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View view2 = this.f20297a.get();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }

        public a(View view) {
            this.f20297a = new WeakReference<>(view);
        }
    }

    public ub(Context context, int[] iArr, int[] iArr2, Boolean bool) {
        super(context);
        this.f = 6.0f;
        this.r = -1;
        if (bool != null) {
            this.q = bool;
        }
        this.d = iArr == null ? null : Arrays.copyOf(iArr, iArr.length);
        this.e = iArr2 != null ? Arrays.copyOf(iArr2, iArr2.length) : null;
        a(context);
    }

    public ub(Context context, int[] iArr, int[] iArr2, int i) {
        super(context);
        this.f = 6.0f;
        this.r = i;
        this.d = iArr == null ? null : Arrays.copyOf(iArr, iArr.length);
        this.e = iArr2 != null ? Arrays.copyOf(iArr2, iArr2.length) : null;
        a(context);
    }

    public ub(Context context, int[] iArr, int[] iArr2) {
        super(context);
        this.f = 6.0f;
        this.r = -1;
        this.d = iArr == null ? null : Arrays.copyOf(iArr, iArr.length);
        this.e = iArr2 != null ? Arrays.copyOf(iArr2, iArr2.length) : null;
        a(context);
    }
}
