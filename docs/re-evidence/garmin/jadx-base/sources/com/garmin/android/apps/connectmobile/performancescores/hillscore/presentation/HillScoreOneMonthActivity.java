package com.garmin.android.apps.connectmobile.performancescores.hillscore.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/HillScoreOneMonthActivity;", "Le32/n;", "Lo81/d;", "Le32/f;", "<init>", "()V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HillScoreOneMonthActivity extends n<o81.d> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f40268n = new a(null);

    @Override // e32.l
    public final void I8(Object obj) {
        ((o81.d) obj).getClass();
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        d.f40284r.getClass();
        d dVar = new d();
        i.f62791o.getClass();
        dVar.setArguments(i.a.a(3, j8, j14));
        return dVar;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pa().setVisibility(8);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.HILL_SCORE, null, null, 12);
        return true;
    }

    @Override // e32.n, e32.l
    public final void p4(o oVar, DateTime dateTime) {
        dateTime.getClass();
        oVar.getClass();
        Intent intent = new Intent();
        intent.putExtra("EXTRA_INITIAL_DATE", dateTime);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        if (dateTime == null) {
            dateTime = DateTime.now();
        }
        return new j(this, dateTime, new o[]{o.f62809l}, new o81.c());
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_hill_score);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performancescores/hillscore/presentation/HillScoreOneMonthActivity$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
