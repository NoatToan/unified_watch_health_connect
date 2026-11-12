package com.huawei.openalliance.ad.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hp;
import com.huawei.openalliance.ad.hs;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.dsa.DomesticDsaView;
import com.huawei.openalliance.ad.views.i;

/* JADX INFO: loaded from: classes41.dex */
public class DomesticDsaActivity extends com.huawei.openalliance.ad.activity.a {
    private final ContentRecord q = new ContentRecord();
    private String r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        hw.a("DomesticDsaActivity", "onCreate");
        super.onCreate(bundle);
        m();
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected boolean i() {
        this.r = new SafeIntent(getIntent()).getStringExtra(MapKeyNames.DSA_URL);
        this.q.e(true);
        this.q.T(this.r);
        return super.i();
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected void g() {
        ImageView imageView;
        float f;
        int iA = as.a(this, 36.0f);
        int i = this.d;
        int i2 = (this.f18202a - i) - iA;
        hw.a("DomesticDsaActivity", "mAnchorViewLoc: %s, mAnchorViewSize: %s", Integer.valueOf(this.h[0]), Integer.valueOf(this.i[0]));
        int iA2 = ((this.h[0] + this.i[0]) - as.a(this, 6.0f)) - (iA / 2);
        if (iA2 >= i) {
            i = iA2;
        }
        if (i <= i2) {
            i2 = i;
        }
        if (dk.c()) {
            imageView = this.o;
            f = -i2;
        } else {
            imageView = this.o;
            f = i2;
        }
        imageView.setX(f);
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void finish() {
        hw.a("DomesticDsaActivity", "finish");
        super.finish();
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public void e() {
        f();
        this.l.a(this.h, this.i);
        this.l.setAdContent(this.q);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected int d() {
        return R.layout.hiad_activity_dsa;
    }

    class a implements hp {
        @Override // com.huawei.openalliance.ad.hp
        public void a() {
            DomesticDsaActivity.this.finish();
        }

        private a() {
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected void c() {
        this.e = (RelativeLayout) findViewById(R.id.dsa_activity_root);
        this.f = findViewById(R.id.margin_view);
        this.g = findViewById(R.id.dsa_anchor_view);
        this.j = (i) findViewById(R.id.top_dsa_view);
        this.m = (ImageView) findViewById(R.id.top_dsa_iv);
        this.k = (i) findViewById(R.id.bottom_dsa_view);
        this.n = (ImageView) findViewById(R.id.bottom_dsa_iv);
        l();
    }

    private void m() {
        if (this.e == null || this.j == null || this.k == null) {
            return;
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.DomesticDsaActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DomesticDsaActivity.this.finish();
            }
        });
        this.j.setViewClickListener(new hs() { // from class: com.huawei.openalliance.ad.activity.DomesticDsaActivity.2
            @Override // com.huawei.openalliance.ad.hs
            public void a() {
                DomesticDsaActivity.this.finish();
            }
        });
        this.k.setViewClickListener(new hs() { // from class: com.huawei.openalliance.ad.activity.DomesticDsaActivity.3
            @Override // com.huawei.openalliance.ad.hs
            public void a() {
                DomesticDsaActivity.this.finish();
            }
        });
    }

    private void l() {
        if (this.j instanceof DomesticDsaView) {
            ((DomesticDsaView) this.j).setDsaJumpListener(new a());
        }
        if (this.k instanceof DomesticDsaView) {
            ((DomesticDsaView) this.k).setDsaJumpListener(new a());
        }
    }
}
