package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import ds0.m;
import e23.l;
import e32.j;
import e32.n;
import e32.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.h;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u;
import r22.b0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/JetLagSummaryActivity;", "Le32/n;", "Lds0/m;", "Le32/f;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JetLagSummaryActivity extends n<m> implements e32.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f36977o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f36978n = new w1(s0.f105811a.b(is0.c.class), new e(this), new d(this), new f(null, this));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/presentation/edit/JetLagSummaryActivity$b", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            JetLagSummaryActivity.this.invalidateOptionsMenu();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36980a;

        public c(l lVar) {
            lVar.getClass();
            this.f36980a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36980a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36980a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36981a;

        public d(g gVar) {
            this.f36981a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36981a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36982a;

        public e(g gVar) {
            this.f36982a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36982a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f36984b;

        public f(e23.a aVar, g gVar) {
            this.f36983a = aVar;
            this.f36984b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36983a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36984b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        ((m) obj).getClass();
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        Bundle extras;
        Bundle extras2;
        Intent intent = getIntent();
        boolean z14 = (intent == null || (extras2 = intent.getExtras()) == null) ? false : extras2.getBoolean("GCM_extra_top_navigation");
        Intent intent2 = getIntent();
        long j15 = (intent2 == null || (extras = intent2.getExtras()) == null) ? -1L : extras.getLong("EXTRA_TRIP_ID");
        com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
        Long lValueOf = Long.valueOf(j15);
        aVar.getClass();
        return com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a.a(j8, z14, lValueOf);
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        pa().setVisibility(8);
        int iE = fb2.g.e(16, this);
        CoordinatorLayout coordinatorLayout = this.f188536h;
        if (coordinatorLayout == null) {
            s.m("rootLayout");
            throw null;
        }
        coordinatorLayout.setPadding(0, iE, 0, 0);
        qa().c(new b());
        w1 w1Var = this.f36978n;
        is0.c cVar = (is0.c) w1Var.getValue();
        w9.a aVarA = v1.a(cVar);
        x53.c cVar2 = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new is0.d(cVar, null), 2);
        ((is0.c) w1Var.getValue()).f94907d.f(this, new c(new hy.h(25, bundle, this)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        j jVar = (j) oa();
        if (jVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.c) {
            com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.c cVar = (com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.c) jVar;
            o oVar = o.f62806i;
            oVar.getClass();
            int iM = u.M(cVar.f62798j, oVar);
            DateTime dateTimeU6 = null;
            Fragment fragment = iM >= 0 ? cVar.f62800l.get(iM) : null;
            e32.h hVar = fragment instanceof e32.h ? (e32.h) fragment : null;
            if (hVar instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a) {
                b0 b0VarV6 = ((com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.a) hVar).v6();
                Object obj = b0VarV6.f149914k.get(b0VarV6.f149911h);
                if (obj instanceof com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b) {
                    dateTimeU6 = ((com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b) obj).U6();
                }
            }
            bundle.putSerializable("EXTRA_INITIAL_DATE", dateTimeU6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e32.n
    public final j sa(DateTime dateTime) {
        Object next;
        LocalDate localDate;
        DateTime dateTimeAtStartOfDay;
        LocalDate localDateD;
        Bundle extras;
        Bundle extras2;
        Intent intent = getIntent();
        boolean z14 = (intent == null || (extras2 = intent.getExtras()) == null) ? false : extras2.getBoolean("GCM_extra_top_navigation");
        Intent intent2 = getIntent();
        long j8 = (intent2 == null || (extras = intent2.getExtras()) == null) ? -1L : extras.getLong("EXTRA_TRIP_ID");
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        ns0.b bVar = ns0.b.f127812a;
        List<yr0.o> list = (List) ((is0.c) this.f36978n.getValue()).f94907d.d();
        bVar.getClass();
        DateTime dateTimeMinusDays = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (yr0.o oVar : list) {
                p pVar = (oVar == null || (localDateD = oVar.d()) == null) ? null : new p(localDateD, oVar);
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    LocalDate localDate2 = (LocalDate) ((p) next).f128594a;
                    do {
                        Object next2 = it.next();
                        LocalDate localDate3 = (LocalDate) ((p) next2).f128594a;
                        if (localDate2.compareTo(localDate3) > 0) {
                            next = next2;
                            localDate2 = localDate3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            p pVar2 = (p) next;
            if (pVar2 != null && (localDate = (LocalDate) pVar2.f128594a) != null && (dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay()) != null) {
                dateTimeMinusDays = dateTimeAtStartOfDay.minusDays(2);
            }
        }
        if (dateTimeMinusDays == null) {
            dateTimeMinusDays = dateTimeWithTimeAtStartOfDay;
        }
        DateTime dateTime2 = dateTimeMinusDays.isAfter(dateTimeWithTimeAtStartOfDay) ? dateTimeWithTimeAtStartOfDay : dateTimeMinusDays;
        dateTime2.getClass();
        return new com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.c(this, dateTime, dateTime2, z14, j8);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_jet_lag_advisor);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/JetLagSummaryActivity$a;", "", "<init>", "()V", "", "EXTRA_TRIP_ID", "Ljava/lang/String;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, Long l14, LocalDate localDate) {
            Intent intent = new Intent(context, (Class<?>) JetLagSummaryActivity.class);
            intent.putExtra("GCM_extra_top_navigation", z14);
            intent.putExtra("EXTRA_TRIP_ID", l14);
            if (localDate != null) {
                n.a aVar = n.f62802m;
                DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                aVar.getClass();
                n.a.a(intent, dateTimeAtStartOfDay, null);
            }
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, boolean z14, Long l14, int i14) {
            if ((i14 & 2) != 0) {
                z14 = true;
            }
            if ((i14 & 4) != 0) {
                l14 = null;
            }
            aVar.getClass();
            return a(context, z14, l14, null);
        }

        private a() {
        }
    }
}
