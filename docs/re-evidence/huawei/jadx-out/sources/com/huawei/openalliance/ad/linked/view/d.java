package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.gz;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jp;
import com.huawei.openalliance.ad.views.AutoScaleSizeRelativeLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d extends AutoScaleSizeRelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected gz f19490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f19491c;
    boolean d;
    protected jp e;

    protected void a() {
    }

    protected void b() {
    }

    protected void c() {
    }

    protected void d() {
    }

    protected int getAutoPlayAreaPercentageThresshold() {
        return 100;
    }

    protected int getHiddenAreaPercentageThreshhold() {
        return 10;
    }

    public void setLinkedNativeAd(gz gzVar) {
        if (gzVar instanceof gz) {
            this.f19490b = gzVar;
        } else {
            this.f19490b = null;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jp jpVar = this.e;
        if (jpVar != null) {
            jpVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jp jpVar = this.e;
        if (jpVar != null) {
            jpVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jp jpVar = this.e;
        if (jpVar != null) {
            jpVar.h();
        }
    }

    void b(int i) {
        hw.b("LinkedMediaView", "visiblePercentage is " + i);
        if (i >= getAutoPlayAreaPercentageThresshold()) {
            this.d = false;
            if (this.f19491c) {
                return;
            }
            this.f19491c = true;
            a();
            return;
        }
        this.f19491c = false;
        int hiddenAreaPercentageThreshhold = getHiddenAreaPercentageThreshhold();
        hw.b("LinkedMediaView", "HiddenAreaPercentageThreshhold is " + hiddenAreaPercentageThreshhold);
        if (i > 100 - hiddenAreaPercentageThreshhold) {
            if (this.d) {
                c();
            }
            this.d = false;
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            b();
        }
    }

    public d(Context context) {
        super(context);
        this.f19491c = false;
        this.d = false;
        this.e = new jp(this) { // from class: com.huawei.openalliance.ad.linked.view.d.1
            @Override // com.huawei.openalliance.ad.jp
            public void a(long j, int i) {
                d.this.b(0);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a(int i) {
                d.this.b(i);
            }

            @Override // com.huawei.openalliance.ad.jp
            public void a() {
                d.this.d();
            }
        };
    }
}
