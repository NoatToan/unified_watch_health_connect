package com.garmin.android.apps.connectmobile.solarcharge;

import a61.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e32.f;
import e32.j;
import e32.n;
import e32.o;
import ep1.g;
import f.c;
import g.h;
import lc.u0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ro0.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/solarcharge/EdgeSolarChargeActivity;", "Le32/n;", "Lep1/g;", "Le32/f;", "<init>", "()V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EdgeSolarChargeActivity extends n<g> implements f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f44765o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c<Intent> f44766n = registerForActivityResult(new h(), new i(this, 17));

    @Override // e32.l
    public final void I8(Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        if (!(gVar instanceof ep1.a)) {
            u0.r();
            return;
        }
        Long activityId = ((ep1.a) gVar).f64919a.getActivityId();
        if (activityId != null) {
            this.f44766n.a(((ep1.f) KoinJavaComponent.get$default(ep1.f.class, null, null, 6, null)).a(this, activityId.longValue()), null);
        }
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.solarcharge.a.f44773o.getClass();
            com.garmin.android.apps.connectmobile.solarcharge.a aVar = new com.garmin.android.apps.connectmobile.solarcharge.a();
            Bundle bundle = new Bundle();
            e32.c.f62777m.getClass();
            bundle.putLong("extra.date.time", j8);
            aVar.setArguments(bundle);
            return aVar;
        }
        if (i14 == 4 || i14 == 5) {
            b.f44781q.getClass();
            b bVar = new b();
            e32.i.f62791o.getClass();
            bVar.setArguments(e32.i.a.a(i14, j8, j14));
            return bVar;
        }
        com.garmin.android.apps.connectmobile.solarcharge.a.f44773o.getClass();
        com.garmin.android.apps.connectmobile.solarcharge.a aVar2 = new com.garmin.android.apps.connectmobile.solarcharge.a();
        Bundle bundle2 = new Bundle();
        e32.c.f62777m.getClass();
        bundle2.putLong("extra.date.time", j8);
        aVar2.setArguments(bundle2);
        return aVar2;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        if (longExtra == -1) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.EDGE_SOLAR_CHARGE_HELP, null, null, 12);
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new j(this, dateTime, new o[]{o.f62806i, o.f62807j, o.f62808k}, null, 8, null);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.onboarding_solar_intensity_title);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/solarcharge/EdgeSolarChargeActivity$a;", "", "<init>", "()V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
