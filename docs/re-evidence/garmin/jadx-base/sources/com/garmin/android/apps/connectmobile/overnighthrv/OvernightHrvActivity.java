package com.garmin.android.apps.connectmobile.overnighthrv;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import j41.c;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import ro0.l;
import t31.h;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/overnighthrv/OvernightHrvActivity;", "Le32/n;", "Lj41/b;", "Le32/f;", "<init>", "()V", "a", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OvernightHrvActivity extends n<j41.b> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f39738n = new a(null);

    @Override // e32.l
    public final void I8(Object obj) {
        ((j41.b) obj).getClass();
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.overnighthrv.a.f39739y.getClass();
            com.garmin.android.apps.connectmobile.overnighthrv.a aVar = new com.garmin.android.apps.connectmobile.overnighthrv.a();
            Bundle bundle = new Bundle();
            bundle.putLong("extra.date.time", j8);
            aVar.setArguments(bundle);
            return aVar;
        }
        if (i14 == 4) {
            b.f39745q.getClass();
            i.f62791o.getClass();
            Bundle bundleA = i.a.a(i14, j8, j14);
            b bVar = new b();
            bVar.setArguments(bundleA);
            return bVar;
        }
        if (i14 != 5) {
            com.garmin.android.apps.connectmobile.overnighthrv.a.f39739y.getClass();
            com.garmin.android.apps.connectmobile.overnighthrv.a aVar2 = new com.garmin.android.apps.connectmobile.overnighthrv.a();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("extra.date.time", j8);
            aVar2.setArguments(bundle2);
            return aVar2;
        }
        b.f39745q.getClass();
        i.f62791o.getClass();
        Bundle bundleA2 = i.a.a(i14, j8, j14);
        b bVar2 = new b();
        bVar2.setArguments(bundleA2);
        return bVar2;
    }

    @Override // x22.d
    public final int na() {
        return R.layout.activity_overnight_hrv_reports;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ComposeView) findViewById(R.id.tabbed_pager_top_optional_view)).setContent(new e(1465304321, true, new h(this, 0)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        menu.add(0, 0, 0, R.string.lbl_help).setShowAsActionFlags(2);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.OVERNIGHT_HRV, null, null, 12);
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new c(this, dateTime, null, 4, null);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.ohrv_status);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/overnighthrv/OvernightHrvActivity$a;", "", "<init>", "()V", "", "MENU_ITEM_HELP_ID", "I", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, DateTime dateTime, o oVar) {
            Intent intentD = sn.a.d(context, context, OvernightHrvActivity.class);
            n.f62802m.getClass();
            n.a.a(intentD, dateTime, oVar);
            return intentD;
        }

        private a() {
        }
    }
}
