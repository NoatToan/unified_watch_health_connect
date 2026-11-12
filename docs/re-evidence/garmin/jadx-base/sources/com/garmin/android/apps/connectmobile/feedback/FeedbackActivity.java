package com.garmin.android.apps.connectmobile.feedback;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import b71.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.help.HelpDetailsActivity;
import cw.l;
import wd2.h0;

/* JADX INFO: loaded from: classes8.dex */
public class FeedbackActivity extends c implements a.InterfaceC0603a, b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35205a = 0;

    @Override // com.garmin.android.apps.connectmobile.feedback.a.InterfaceC0603a
    public final void E2() {
        Bundle bundleD = i.d("ExperienceType", "Ok");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        ca(2131231945, 2, getString(R.string.feedback_ok_instructions));
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.b.d
    public final void M4() {
        Bundle bundleD = i.d("ActionType", "Rated");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        showProgressOverlay();
        m.a(null, new zg0.b(new zg0.a(), this, null), 3).f(this, new h0(this, 13));
        l.b().getClass();
        l.c();
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.a.InterfaceC0603a
    public final void R3() {
        Bundle bundleD = i.d("ExperienceType", "Bad");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        ca(2131231943, 1, getString(R.string.feedback_negative_instructions));
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.b.d
    public final void T6() {
        Intent intent = new Intent(this, (Class<?>) HelpDetailsActivity.class);
        intent.putExtra("START_DESTINATION", "PRODUCT_SUPPORT");
        startActivity(intent);
        finish();
    }

    public final void ca(int i14, int i15, String str) {
        b bVar = new b();
        Bundle bundle = new Bundle(3);
        bundle.putInt("imageResourceId", i14);
        bundle.putString("message", str);
        bundle.putInt("contentBodyType", i15);
        bVar.setArguments(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f7240h = 4097;
        aVar.l(R.id.content_frame, bVar, null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.a.InterfaceC0603a
    public final void d5() {
        Bundle bundleD = i.d("DismissType", "DoNotAskMeAgain");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        l.b().getClass();
        l.c();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.b.d
    public final void i1() {
        l.b().getClass();
        l.a();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.a.InterfaceC0603a
    public final void m7() {
        l.b().getClass();
        l.a();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.b.d
    public final void n5() {
        Bundle bundleD = i.d("DismissType", "DoNotAskMeAgain");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        l.b().getClass();
        l.c();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() == 0) {
            l.b().getClass();
            l.a();
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        initActionBar(false);
        a aVar = new a();
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.f7240h = 4097;
        aVarB.l(R.id.content_frame, aVar, null);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.feedback.a.InterfaceC0603a
    public final void y2() {
        Bundle bundleD = i.d("ExperienceType", "Good");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "FeedbackLoop");
        ca(2131231944, 3, getString(R.string.text_positive_feedback));
    }
}
