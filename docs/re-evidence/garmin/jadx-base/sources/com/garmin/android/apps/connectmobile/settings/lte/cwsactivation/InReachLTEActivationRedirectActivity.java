package com.garmin.android.apps.connectmobile.settings.lte.cwsactivation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ri1.o;
import z02.d;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/cwsactivation/InReachLTEActivationRedirectActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InReachLTEActivationRedirectActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43507a = new a(null);

    public final void ca(m mVar, int i14) {
        o0 o0VarE = mVar.E(1111757392);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            e eVarC = f.c(-1248123861, new o(this), o0VarE);
            ri1.a.f152811a.getClass();
            d.a(false, eVarC, null, null, null, ri1.a.f152812b, o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_composable_container);
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("isFromLiveTrackFlow", false);
        if (longExtra <= 0 && !booleanExtra) {
            finish();
            return;
        }
        boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_IS_FROM_ONBOARDING", false);
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1332835344, true, new ri1.m(s3.b(), this, longExtra, booleanExtra, booleanExtra2, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/lte/cwsactivation/InReachLTEActivationRedirectActivity$a;", "", "<init>", "()V", "", "IS_FROM_LIVETRACK_FLOW", "Ljava/lang/String;", "EXTRA_IS_FROM_ONBOARDING", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, Long l14, int i14) {
            boolean z14 = (i14 & 4) == 0;
            boolean z15 = (i14 & 8) == 0;
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) InReachLTEActivationRedirectActivity.class);
            intent.putExtra("GCM_deviceUnitID", l14);
            intent.putExtra("isFromLiveTrackFlow", z15);
            intent.putExtra("EXTRA_IS_FROM_ONBOARDING", z14);
            return intent;
        }

        private a() {
        }
    }
}
