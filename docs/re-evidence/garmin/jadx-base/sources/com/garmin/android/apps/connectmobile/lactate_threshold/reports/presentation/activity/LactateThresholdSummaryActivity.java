package com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import e32.c;
import e32.f;
import e32.i;
import e32.j;
import e32.k;
import e32.n;
import e32.o;
import o13.p;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ro0.l;
import yr.o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/presentation/activity/LactateThresholdSummaryActivity;", "Le32/n;", "Lit0/b;", "Le32/f;", "<init>", "()V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LactateThresholdSummaryActivity extends n<it0.b> implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f37141p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f37142q = "LactateThresholdSummaryActivity";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jt0.a f37143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem f37144o;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/lactate_threshold/reports/presentation/activity/LactateThresholdSummaryActivity$b", "Le32/k;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends k {
        public b() {
            super(null, 1, null);
        }

        @Override // e32.k
        public final Fragment c(DateTime dateTime) {
            gt0.b.a aVar = gt0.b.f78925o;
            long millis = DateTime.now().getMillis();
            aVar.getClass();
            gt0.b bVar = new gt0.b();
            Bundle bundle = new Bundle();
            c.f62777m.getClass();
            bundle.putLong("extra.date.time", millis);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        it0.b bVar = (it0.b) obj;
        bVar.getClass();
        if (bVar instanceof it0.a) {
            ua();
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, f37142q, "[navigateTo] destination " + bVar + " not handled by navigateTo!");
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        Integer num;
        Integer num2 = o.f62808k.f62822d;
        if ((num2 != null && i14 == num2.intValue()) || ((num = o.f62816t.f62822d) != null && i14 == num.intValue())) {
            jt0.a aVar = this.f37143n;
            if (aVar == null) {
                s.m("viewModel");
                throw null;
            }
            if (aVar.f100682a != xs0.a.GENERIC) {
                gt0.c.f78931q.getClass();
                i.f62791o.getClass();
                Bundle bundleA = i.a.a(i14, j8, j14);
                gt0.c cVar = new gt0.c();
                cVar.setArguments(bundleA);
                return cVar;
            }
            gt0.a.f78919q.getClass();
            i.f62791o.getClass();
            Bundle bundleA2 = i.a.a(i14, j8, j14);
            gt0.a aVar2 = new gt0.a();
            aVar2.setArguments(bundleA2);
            return aVar2;
        }
        Integer num3 = o.f62810m.f62822d;
        if (num3 != null && i14 == num3.intValue()) {
            gt0.c.f78931q.getClass();
            i.f62791o.getClass();
            Bundle bundleA3 = i.a.a(i14, j8, j14);
            gt0.c cVar2 = new gt0.c();
            cVar2.setArguments(bundleA3);
            return cVar2;
        }
        Integer num4 = o.f62812o.f62822d;
        if (num4 != null && i14 == num4.intValue()) {
            gt0.a.f78919q.getClass();
            i.f62791o.getClass();
            Bundle bundleA4 = i.a.a(i14, j8, j14);
            gt0.a aVar3 = new gt0.a();
            aVar3.setArguments(bundleA4);
            return aVar3;
        }
        gt0.b.f78925o.getClass();
        gt0.b bVar = new gt0.b();
        Bundle bundle = new Bundle();
        c.f62777m.getClass();
        bundle.putLong("extra.date.time", j8);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra_lactate_threshold_sport_type") : null;
            parcelable = (xs0.a) (parcelableExtra instanceof xs0.a ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("extra_lactate_threshold_sport_type", xs0.a.class);
        }
        xs0.a aVar = (xs0.a) parcelable;
        if (aVar == null) {
            aVar = xs0.a.GENERIC;
        }
        this.f37143n = (jt0.a) GetViewModelKt.resolveViewModel$default(s0.f105811a.b(jt0.a.class), getF189591b(), null, getDefaultViewModelCreationExtras(), null, AndroidKoinScopeExtKt.getKoinScope(this), new o0(aVar, 2), 4, null);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItemAdd = menu.add(0, 48, 0, R.string.lbl_help);
        menuItemAdd.getClass();
        this.f37144o = menuItemAdd;
        menuItemAdd.setShowAsActionFlags(1);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 48) {
            return super.onOptionsItemSelected(menuItem);
        }
        ua();
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        jt0.a aVar = this.f37143n;
        if (aVar != null) {
            return new j(this, dateTime, aVar.f100682a != xs0.a.GENERIC ? new o[]{o.f62805h, o.f62808k, o.f62810m, o.f62816t} : new o[]{o.f62808k, o.f62812o, o.f62816t}, new b());
        }
        s.m("viewModel");
        throw null;
    }

    @Override // e32.n
    public final String ta() {
        jt0.a aVar = this.f37143n;
        if (aVar != null) {
            return dh.b.A(this, aVar.f100682a.f192069b);
        }
        s.m("viewModel");
        throw null;
    }

    public final void ua() {
        HelpActivity.a aVar = HelpActivity.f36653a;
        jt0.a aVar2 = this.f37143n;
        if (aVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        l lVar = aVar2.f100682a == xs0.a.GENERIC ? l.LACTATE_THRESHOLD : l.SPORT_SPECIFIC_LACTATE_THRESHOLD;
        Bundle bundleA = h7.c.a(new p("LACTATE_THRESHOLD_EXTRA", aVar2.f100688g));
        aVar.getClass();
        HelpActivity.a.d(this, lVar, null, bundleA);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/presentation/activity/LactateThresholdSummaryActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "EXTRA_LACTATE_THRESHOLD_SPORT_TYPE", "", "MENU_ITEM_ITEM_HELP", "I", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, xs0.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) LactateThresholdSummaryActivity.class);
            intent.putExtra("extra_lactate_threshold_sport_type", (Parcelable) aVar);
            return intent;
        }

        private a() {
        }
    }
}
