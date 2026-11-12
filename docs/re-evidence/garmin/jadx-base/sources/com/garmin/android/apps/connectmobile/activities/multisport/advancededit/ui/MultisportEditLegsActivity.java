package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import am.b1;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import ap.l;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r2;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import yo.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/MultisportEditLegsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/r2;", "Lam/b1$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultisportEditLegsActivity extends com.garmin.android.apps.connectmobile.c implements r2, b1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29307b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ap.d f29308a;

    public static void da(MultisportEditLegsActivity multisportEditLegsActivity, String str, int i14) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        if (multisportEditLegsActivity.getSupportFragmentManager().M() > 1) {
            multisportEditLegsActivity.getSupportFragmentManager().a0(0, str);
            return;
        }
        ap.d dVar = multisportEditLegsActivity.f29308a;
        if (dVar == null) {
            s.m("viewModel");
            throw null;
        }
        if (dVar.f11590b != zo.k.CONVERT_TO_MULTISPORT) {
            multisportEditLegsActivity.setResult(-1);
            multisportEditLegsActivity.finish();
            return;
        }
        multisportEditLegsActivity.setResult(0);
        multisportEditLegsActivity.finish();
        jd0.j jVarM = ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M();
        ap.d dVar2 = multisportEditLegsActivity.f29308a;
        if (dVar2 != null) {
            jVarM.b(multisportEditLegsActivity, dVar2.f11589a);
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.r2
    public final void U7() {
    }

    public final void ca(boolean z14) {
        String name;
        String str = "";
        if (getSupportFragmentManager().M() > 0 && (name = getSupportFragmentManager().L(getSupportFragmentManager().M() - 1).getName()) != null) {
            str = name;
        }
        f.f29337i.getClass();
        String str2 = f.f29338j;
        if (!str.equals(str2)) {
            g.f29350h.getClass();
            if (str.equals(g.f29351i)) {
                da(this, str2, 2);
                return;
            } else {
                da(this, null, 3);
                return;
            }
        }
        if (z14) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            aVar.getClass();
            i2.a.a(a2Var, "Persisting local changes");
            ap.d dVar = this.f29308a;
            if (dVar == null) {
                s.m("viewModel");
                throw null;
            }
            w wVar = dVar.f11593e.f198237g;
            wVar.f198314d = new ArrayList(wVar.e());
        } else {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.ACTIVITIES;
            aVar2.getClass();
            i2.a.a(a2Var2, "Resetting changes to latest local version");
            ap.d dVar2 = this.f29308a;
            if (dVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            dVar2.z4();
        }
        da(this, null, 3);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca(false);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_multisport_edit);
        initActionBar(true);
        Intent intent = getIntent();
        long longExtra = intent != null ? intent.getLongExtra("GCM_extra_activity_id", 0L) : 0L;
        Intent intent2 = getIntent();
        this.f29308a = (ap.d) new x1(this, new l(longExtra, zo.k.values()[intent2 != null ? intent2.getIntExtra("multisportEditLegsEntryPoint", 0) : 0])).b(s0.f105811a.b(ap.d.class));
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.l(R.id.multisport_content_frame, new k(), null);
        aVarB.d("");
        aVarB.e();
        ht.a.f85464a.getClass();
        ht.a.a(null, "LegEdit");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca(false);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.r2
    public final void t8() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/MultisportEditLegsActivity$a;", "", "<init>", "()V", "", "MULTISPORT_EDIT_LEGS_ENTRY_POINT", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Fragment fragment, long j8, int i14, zo.k kVar) {
            kVar.getClass();
            Intent intent = new Intent(fragment.getActivity(), (Class<?>) MultisportEditLegsActivity.class);
            intent.putExtra("GCM_extra_activity_id", j8);
            intent.putExtra("multisportEditLegsEntryPoint", kVar.ordinal());
            fragment.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}
