package com.huawei.uikit.phone.hwsubtab.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.uikit.hwcolumnsystem.widget.HwColumnSystem;
import com.huawei.uikit.phone.hwsubtab.R;

/* JADX INFO: loaded from: classes45.dex */
public class HwSubTabViewContainer extends com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwColumnSystem f29852c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private float j;

    public class d extends com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer.c {
        public d() {
            super();
        }

        @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer.c
        public void b(View view, boolean z) {
            if (HwSubTabViewContainer.this.getResources() != null) {
                int dimensionPixelSize = HwSubTabViewContainer.this.getResources().getDimensionPixelSize(R.dimen.hwsubtab_padding_default);
                view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
        }

        @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer.c
        public void d(View view) {
            int startOriginPadding = HwSubTabViewContainer.this.getStartOriginPadding() - HwSubTabViewContainer.this.getSubTabItemMargin();
            view.setPadding(startOriginPadding, 0, startOriginPadding, 0);
        }
    }

    public HwSubTabViewContainer(Context context) {
        this(context, null);
    }

    private void c(Context context) {
        this.h = context;
        HwColumnSystem hwColumnSystem = new HwColumnSystem(this.h);
        this.f29852c = hwColumnSystem;
        this.f29851b = false;
        hwColumnSystem.d(this.d);
        this.f29852c.b(this.h);
        this.f = getResources().getDimensionPixelOffset(R.dimen.hwsubtab_padding_start);
        this.g = getResources().getDimensionPixelOffset(R.dimen.hwsubtab_padding_start_pad);
        f();
    }

    private void g() {
        this.f29852c.d(-1);
        this.f29852c.b(this.h);
    }

    private void h() {
        this.f29852c.d(-1);
        this.f29852c.d(this.h, this.e, this.f29850a, this.j);
    }

    @Override // com.huawei.uikit.hwsubtab.widget.HwSubTabViewContainer
    public void c() {
        setChildPaddingClient(new d());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f29851b) {
            h();
        } else {
            g();
        }
        f();
    }

    public HwSubTabViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        c(context);
    }

    private void f() {
        if (this.f29852c.j() >= 8) {
            setStartOriginPadding(this.g);
            setStartScrollPadding(32);
        } else {
            setStartOriginPadding(this.f);
            setStartScrollPadding(28);
        }
    }

    public HwSubTabViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        c(context);
    }
}
