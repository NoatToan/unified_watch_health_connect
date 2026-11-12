package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import am.b1;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/MultisportConversionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lam/b1$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultisportConversionActivity extends com.garmin.android.apps.connectmobile.c implements b1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29306a = new a(null);

    public static void ca(MultisportConversionActivity multisportConversionActivity) {
        if (multisportConversionActivity.getSupportFragmentManager().M() > 1) {
            multisportConversionActivity.getSupportFragmentManager().a0(0, null);
        } else {
            multisportConversionActivity.setResult(-1);
            multisportConversionActivity.finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_multisport_edit);
        initActionBar(true);
        Intent intent = getIntent();
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        d.f29333t.getClass();
        Bundle bundle2 = new Bundle(1);
        bundle2.putInt("legIndex", 0);
        d dVar = new d();
        dVar.setArguments(bundle2);
        aVarB.l(R.id.multisport_content_frame, dVar, null);
        aVarB.d("");
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca(this);
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/MultisportConversionActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
