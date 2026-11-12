package com.huawei.openalliance.ad;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.views.dsa.DomesticDsaView;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class ue extends ub {
    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSTransparencyDialog", "onDetachedFromWindow");
        c();
    }

    public void l() {
        if (this.i instanceof DomesticDsaView) {
            ((DomesticDsaView) this.i).a();
        }
    }

    public void k() {
        if (this.i instanceof DomesticDsaView) {
            ((DomesticDsaView) this.i).b();
        }
    }

    public String getScreenOrientation() {
        this.f20294a = com.huawei.openalliance.ad.utils.d.b(this.p);
        this.f20295b = com.huawei.openalliance.ad.utils.d.a(this.p);
        return this.f20294a > this.f20295b ? "2" : "1";
    }

    @Override // com.huawei.openalliance.ad.ub
    protected int getLayoutId() {
        if (g()) {
            return R.layout.hiad_transparency_dialog_splash;
        }
        return com.huawei.openalliance.ad.utils.ab.t(getContext()) ? R.layout.hiad_transparency_dialog_tv : R.layout.hiad_transparency_dialog;
    }

    @Override // com.huawei.openalliance.ad.ub
    protected void e() {
        ImageView imageView;
        float f;
        int iH;
        int iA;
        if (!f()) {
            c();
            return;
        }
        int iA2 = com.huawei.openalliance.ad.utils.as.a(this.p, 36.0f);
        String screenOrientation = getScreenOrientation();
        int iA3 = 0;
        if (!com.huawei.openalliance.ad.utils.dk.c() || Objects.equals(screenOrientation, "1")) {
            int i = this.d[0];
            int i2 = this.e[0];
            iA = (i + i2) - com.huawei.openalliance.ad.utils.as.a(this.p, 6.0f);
            iH = iA2 / 2;
            iA3 = a(iA2, iA - iH);
        } else {
            if (com.huawei.openalliance.ad.utils.d.q(this.p) == 1) {
                iA = ((this.d[0] + this.e[0]) - com.huawei.openalliance.ad.utils.as.a(this.p, 6.0f)) - (iA2 / 2);
                iH = com.huawei.openalliance.ad.utils.as.h(this.p);
            } else if (com.huawei.openalliance.ad.utils.d.q(this.p) == 0) {
                iA = ((this.d[0] + this.e[0]) - com.huawei.openalliance.ad.utils.as.a(this.p, 6.0f)) - (iA2 / 2);
                iH = com.huawei.openalliance.ad.utils.as.h(this.p) * 2;
            }
            iA3 = a(iA2, iA - iH);
        }
        if (com.huawei.openalliance.ad.utils.dk.c()) {
            imageView = this.o;
            f = -iA3;
        } else {
            imageView = this.o;
            f = iA3;
        }
        imageView.setX(f);
    }

    @Override // com.huawei.openalliance.ad.ub
    protected void d() {
        this.f = 16.0f;
        super.d();
    }

    public void a(boolean z, Integer num, jj jjVar) {
        if (this.i instanceof DomesticDsaView) {
            ((DomesticDsaView) this.i).a(z, num, jjVar);
        }
    }

    @Override // com.huawei.openalliance.ad.ub
    protected void a() {
        this.f20296c = (RelativeLayout) findViewById(R.id.haid_transparency_dialog_root);
        this.k = findViewById(R.id.margin_view);
        this.l = findViewById(R.id.anchor_view);
        this.g = (com.huawei.openalliance.ad.views.i) findViewById(R.id.top_dsa_view);
        this.m = (ImageView) findViewById(R.id.top_dsa_iv);
        this.h = (com.huawei.openalliance.ad.views.i) findViewById(R.id.bottom_dsa_view);
        this.n = (ImageView) findViewById(R.id.bottom_dsa_iv);
        m();
    }

    /* JADX INFO: loaded from: classes41.dex */
    class a implements hp {
        @Override // com.huawei.openalliance.ad.hp
        public void a() {
            ue.this.c();
        }

        private a() {
        }
    }

    public int a(int i, int i2) {
        int i3 = this.j;
        int i4 = (this.f20294a - i3) - i;
        if (i2 < i3) {
            i2 = i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    private void m() {
        a aVar = new a();
        if (this.h instanceof DomesticDsaView) {
            ((DomesticDsaView) this.h).setDsaJumpListener(aVar);
        }
        if (this.g instanceof DomesticDsaView) {
            ((DomesticDsaView) this.g).setDsaJumpListener(aVar);
        }
    }

    public ue(Context context, int[] iArr, int[] iArr2, Boolean bool) {
        super(context, iArr, iArr2, bool);
    }

    public ue(Context context, int[] iArr, int[] iArr2, int i) {
        super(context, iArr, iArr2, i);
    }
}
