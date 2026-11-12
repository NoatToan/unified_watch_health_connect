package com.garmin.android.apps.connectmobile.golf.badge;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d;
import com.garmin.android.apps.connectmobile.i2;
import dl0.b;
import dl0.i;
import dl0.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/badge/BadgeScorecardsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BadgeScorecardsActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35746a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i14 = extras.getInt("GCM_extra_badge_id", -1);
            Integer numValueOf = Integer.valueOf(i14);
            if (i14 == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                initComposeScreen(new e(-113839927, true, new b((i) new x1(this, new j(numValueOf.intValue())).b(s0.f105811a.b(i.class)), this, 0)));
                return;
            }
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "BadgeScorecardsActivity", "Not able to start activity with an invalid badgeId.");
        finish();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/badge/BadgeScorecardsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INVALID_BADGE_ID", "I", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
