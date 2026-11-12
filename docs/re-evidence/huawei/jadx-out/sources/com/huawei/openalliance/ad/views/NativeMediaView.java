package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.jp;
import com.huawei.openalliance.ad.monitor.listener.ViewShowAreaListener;

/* JADX INFO: loaded from: classes12.dex */
public abstract class NativeMediaView extends AutoScaleSizeRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f20784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f20785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.huawei.openalliance.ad.inter.data.e f20786c;
    protected int d;
    protected int e;
    protected jp f;
    private ViewShowAreaListener g;

    protected void a() {
    }

    protected void b() {
    }

    protected void c() {
    }

    protected void d() {
    }

    protected void e() {
    }

    protected int getAutoPlayAreaPercentageThresshold() {
        return 100;
    }

    protected int getHiddenAreaPercentageThreshhold() {
        return 10;
    }

    public int getPlayedProgress() {
        return -1;
    }

    public int getPlayedTime() {
        return -1;
    }

    public void setViewShowAreaListener(ViewShowAreaListener viewShowAreaListener) {
        this.g = viewShowAreaListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNativeAd(INativeAd iNativeAd) {
        this.f20786c = iNativeAd instanceof com.huawei.openalliance.ad.inter.data.e ? (com.huawei.openalliance.ad.inter.data.e) iNativeAd : null;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jp jpVar = this.f;
        if (jpVar != null) {
            jpVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jp jpVar = this.f;
        if (jpVar != null) {
            jpVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jp jpVar = this.f;
        if (jpVar != null) {
            jpVar.h();
        }
    }

    void a(int i) {
        ViewShowAreaListener viewShowAreaListener = this.g;
        if (viewShowAreaListener != null) {
            viewShowAreaListener.onUpdateShowArea(i);
        }
        if (i >= getAutoPlayAreaPercentageThresshold()) {
            this.f20785b = false;
            if (this.f20784a) {
                return;
            }
            this.f20784a = true;
            c();
            return;
        }
        this.f20784a = false;
        if (i > 100 - getHiddenAreaPercentageThreshhold()) {
            if (this.f20785b) {
                e();
            }
            this.f20785b = false;
        } else {
            if (this.f20785b) {
                return;
            }
            this.f20785b = true;
            d();
        }
    }

    public NativeMediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20784a = false;
        this.f20785b = false;
        this.d = -1;
        this.e = 0;
        this.f = new jp(this) { // from class: com.huawei.openalliance.ad.views.NativeMediaView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i3) {
                NativeMediaView.this.a(0);
                NativeMediaView.this.a();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a(int i3) {
                NativeMediaView.this.a(i3);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                NativeMediaView.this.b();
            }
        };
    }

    public NativeMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20784a = false;
        this.f20785b = false;
        this.d = -1;
        this.e = 0;
        this.f = new jp(this) { // from class: com.huawei.openalliance.ad.views.NativeMediaView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i3) {
                NativeMediaView.this.a(0);
                NativeMediaView.this.a();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a(int i3) {
                NativeMediaView.this.a(i3);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                NativeMediaView.this.b();
            }
        };
    }

    public NativeMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20784a = false;
        this.f20785b = false;
        this.d = -1;
        this.e = 0;
        this.f = new jp(this) { // from class: com.huawei.openalliance.ad.views.NativeMediaView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i3) {
                NativeMediaView.this.a(0);
                NativeMediaView.this.a();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a(int i3) {
                NativeMediaView.this.a(i3);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                NativeMediaView.this.b();
            }
        };
    }

    public NativeMediaView(Context context) {
        super(context);
        this.f20784a = false;
        this.f20785b = false;
        this.d = -1;
        this.e = 0;
        this.f = new jp(this) { // from class: com.huawei.openalliance.ad.views.NativeMediaView.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i3) {
                NativeMediaView.this.a(0);
                NativeMediaView.this.a();
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a(int i3) {
                NativeMediaView.this.a(i3);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                NativeMediaView.this.b();
            }
        };
    }
}
