package com.huawei.openalliance.ad.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hn;
import com.huawei.openalliance.ad.hs;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.utils.ah;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.i;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ComplianceActivity extends a {
    private static d q;
    private final ContentRecord r = new ContentRecord();
    private boolean s;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m();
        d dVar = q;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected boolean i() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        String stringExtra = safeIntent.getStringExtra(MapKeyNames.WHY_THIS_AD_URL);
        String stringExtra2 = safeIntent.getStringExtra(MapKeyNames.COMPLIANCE);
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.r.k((List<AdvertiserInfo>) bk.b(stringExtra2, List.class, AdvertiserInfo.class));
        }
        this.s = safeIntent.getBooleanExtra(MapKeyNames.SHOW_WHY_THIS_AD, false);
        String stringExtra3 = safeIntent.getStringExtra(MapKeyNames.DSA_URL);
        boolean booleanExtra = safeIntent.getBooleanExtra(MapKeyNames.DSA_SWITCH, false);
        this.r.u(stringExtra);
        this.r.e(booleanExtra);
        this.r.T(stringExtra3);
        return super.i();
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void finish() {
        super.finish();
        d dVar = q;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public void e() {
        f();
        this.l.a(this.h, this.i);
        this.l.setShowWhyThisAd(this.s);
        this.l.setAdContent(this.r);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected int d() {
        return R.layout.hiad_activity_compliance;
    }

    @Override // com.huawei.openalliance.ad.activity.a
    protected void c() {
        this.e = (RelativeLayout) findViewById(R.id.compliance_activity_root);
        this.f = findViewById(R.id.margin_view);
        this.g = findViewById(R.id.compliance_anchor_view);
        this.j = (i) findViewById(R.id.top_compliance_view);
        this.m = (ImageView) findViewById(R.id.top_compliance_iv);
        this.k = (i) findViewById(R.id.bottom_compliance_view);
        this.n = (ImageView) findViewById(R.id.bottom_compliance_iv);
    }

    private void m() {
        if (this.e == null || this.j == null || this.k == null) {
            return;
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.ComplianceActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ComplianceActivity.this.finish();
            }
        });
        this.j.setViewClickListener(new hs() { // from class: com.huawei.openalliance.ad.activity.ComplianceActivity.2
            @Override // com.huawei.openalliance.ad.hs
            public void a() {
                ComplianceActivity.this.finish();
            }
        });
        this.k.setViewClickListener(new hs() { // from class: com.huawei.openalliance.ad.activity.ComplianceActivity.3
            @Override // com.huawei.openalliance.ad.hs
            public void a() {
                ComplianceActivity.this.finish();
            }
        });
    }

    public static void l() {
        q = null;
    }

    private static boolean a(ContentRecord contentRecord) {
        if (!ah.a()) {
            return contentRecord == null;
        }
        hw.b("ComplianceActivity", "repeat click too fast");
        return true;
    }

    public static void a(d dVar) {
        q = dVar;
    }

    public static void a(Context context, int[] iArr, int[] iArr2, ContentRecord contentRecord, boolean z) {
        if (a(contentRecord)) {
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) ComplianceActivity.class);
            intent.putExtra(MapKeyNames.ANCHOR_LOCATION, iArr);
            intent.putExtra(MapKeyNames.ANCHOR_SIZE, iArr2);
            intent.setFlags(65536);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            String strAm = contentRecord.am();
            if (TextUtils.isEmpty(strAm)) {
                strAm = contentRecord.ab();
            }
            intent.putExtra(MapKeyNames.WHY_THIS_AD_URL, strAm);
            intent.putExtra(MapKeyNames.COMPLIANCE, bk.b(contentRecord.aU()));
            intent.putExtra(MapKeyNames.SHOW_WHY_THIS_AD, z);
            intent.putExtra(MapKeyNames.DSA_URL, contentRecord.be());
            intent.putExtra(MapKeyNames.DSA_SWITCH, contentRecord.bf());
            intent.setClipData(Constants.CLIP_DATA);
            dk.a(context, intent);
        } catch (Throwable th) {
            hw.c("ComplianceActivity", "start Activity error: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Context context, View view, ContentRecord contentRecord, boolean z) {
        if (view == null) {
            return;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            hw.b("ComplianceActivity", "startFeedbackActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new hn(view, context, iArr2));
            a(context, iArr, new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()}, contentRecord, z);
        } catch (Throwable th) {
            hw.c("ComplianceActivity", "start Activity error: %s", th.getClass().getSimpleName());
        }
    }
}
