package com.garmin.android.apps.connectmobile.consent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.insights.InsightsDisclaimerActivity;
import com.garmin.android.apps.connectmobile.insights.presentation.InsightsActivity;
import hb2.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p92.o;
import q92.u;
import q92.v;
import q92.x;
import z10.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/InsightsConsentActivity;", "Lz10/y0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InsightsConsentActivity extends y0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f32207t = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32208r = 1;

    @Override // z10.y0
    public final x[] Aa() {
        return new x[]{x.DI_CONNECT_INSIGHTS};
    }

    @Override // z10.y0
    public final void Ba() {
        if (this.f32208r == 1) {
            InsightsDisclaimerActivity.f36901f.getClass();
            o oVar = o.f136619a;
            x xVar = x.DI_CONNECT_INSIGHTS;
            oVar.getClass();
            v vVarN = o.n(xVar);
            boolean z14 = vVarN == null || (vVarN.b() && vVarN.f143785c == u.DEFAULT);
            mq0.c.f120214a.getClass();
            if (mq0.c.a(this).getBoolean(getString(R.string.key_insights_disclaimer_agreed), false) || !z14) {
                InsightsActivity.f36903f.getClass();
                startActivity(new Intent(this, (Class<?>) InsightsActivity.class));
            } else {
                Intent intent = new Intent(this, (Class<?>) InsightsDisclaimerActivity.class);
                intent.putExtra("extra_insights_redirect", 1);
                startActivity(intent);
            }
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "INSIGHTS";
    }

    @Override // z10.y0, com.garmin.android.apps.connectmobile.consent.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f32208r == 1) {
            ca("INSIGHTS");
        }
    }

    @Override // z10.y0, com.garmin.android.apps.connectmobile.consent.a
    public final void sa() {
        hideProgressOverlay();
        if (i.a(this)) {
            displayFailedMessage();
            finish();
            return;
        }
        initActionBar(true, getString(R.string.title_insights));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content_frame);
        TextView textView = (TextView) View.inflate(getApplicationContext(), R.layout.screen_error_text, null).findViewById(R.id.error_message);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.spacing_xxlarge);
        textView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        textView.setText(R.string.insights_home_error_msg);
        frameLayout.addView(textView);
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
        this.f32208r = getIntent().getIntExtra("extra_insights_redirect", -1);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/InsightsConsentActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
