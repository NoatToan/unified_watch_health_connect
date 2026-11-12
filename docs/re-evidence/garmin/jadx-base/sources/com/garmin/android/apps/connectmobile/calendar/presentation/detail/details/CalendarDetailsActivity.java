package com.garmin.android.apps.connectmobile.calendar.presentation.detail.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import e32.f;
import e32.h;
import e32.k;
import e32.n;
import hy.g;
import hy.j;
import hy.m;
import hy.o;
import hy.p;
import hy.t;
import hy.u;
import java.util.WeakHashMap;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/CalendarDetailsActivity;", "Le32/n;", "Lhy/g;", "Le32/f;", "<init>", "()V", "b", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalendarDetailsActivity extends n<g> implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f31194p = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f31195n = new w1(s0.f105811a.b(fy.a.class), new d(this), new hy.e(this, 1), new e(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vx.f f31196o = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/CalendarDetailsActivity$a;", "Le32/k;", "", "isGroupCalendar", "<init>", "(Z)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31197b;

        public a(boolean z14) {
            super(null, 1, null);
            this.f31197b = z14;
        }

        @Override // e32.k
        public final Fragment b(int i14, DateTime dateTime, DateTime dateTime2) {
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a.f31202j.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a aVar = new com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a();
            Bundle bundle = new Bundle();
            h.f62784h.getClass();
            bundle.putInt("ARG_INTERVAL_TYPE", i14);
            bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
            bundle.putSerializable("ARG_END_DATE", null);
            bundle.putBoolean("is_group_calendar_key", this.f31197b);
            aVar.setArguments(bundle);
            return aVar;
        }

        @Override // e32.k
        public final Fragment c(DateTime dateTime) {
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a.f31202j.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a aVar = new com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.a();
            Bundle bundle = new Bundle();
            h.f62784h.getClass();
            bundle.putInt("ARG_INTERVAL_TYPE", 1);
            bundle.putSerializable("ARG_INITIAL_DATE", dateTime);
            bundle.putSerializable("ARG_END_DATE", null);
            bundle.putBoolean("is_group_calendar_key", this.f31197b);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f31198a;

        public c(l lVar) {
            lVar.getClass();
            this.f31198a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f31198a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31198a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31199a;

        public d(b.g gVar) {
            this.f31199a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31199a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f31201b;

        public e(e23.a aVar, b.g gVar) {
            this.f31200a = aVar;
            this.f31201b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31200a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31201b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        boolean z14 = gVar instanceof hy.k;
        vx.f fVar = this.f31196o;
        if (z14) {
            fVar.h(this, ((hy.k) gVar).f86341a);
            return;
        }
        if (gVar instanceof u) {
            fVar.u(this, ((u) gVar).f86362a);
            return;
        }
        if (gVar instanceof p) {
            fVar.r(this, ((p) gVar).f86349a);
            return;
        }
        if (gVar instanceof hy.a) {
            fVar.p(this, ((hy.a) gVar).f86318a);
            return;
        }
        if (gVar instanceof m) {
            fVar.K(this, ((m) gVar).f86344a);
            return;
        }
        if (gVar instanceof o) {
            o oVar = (o) gVar;
            fVar.J(this, oVar.f86347a, oVar.f86348b);
            return;
        }
        if (gVar instanceof t) {
            CalendarItemDTO calendarItemDTO = ((t) gVar).f86361a;
            if (calendarItemDTO.f30973d != CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT) {
                fVar.e(this, calendarItemDTO);
                return;
            }
            String str = calendarItemDTO.O1;
            if (str != null) {
                fVar.f(this, str, calendarItemDTO.f30998p == CalendarItemDTO.c.MULTISPORT);
                return;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CalendarDetailsActivity", "FBT Workout did not have uuid");
            return;
        }
        if (gVar instanceof j) {
            fVar.n(this, ((j) gVar).f86340a);
            return;
        }
        if (gVar instanceof hy.l) {
            hy.l lVar = (hy.l) gVar;
            fVar.A(this, lVar.f86342a, lVar.f86343b);
            return;
        }
        if (!(gVar instanceof hy.n)) {
            if (gVar instanceof hy.b) {
                fVar.y(this);
                return;
            } else {
                u0.r();
                return;
            }
        }
        hy.n nVar = (hy.n) gVar;
        Long l14 = nVar.f86345a;
        LocalDate localDateNow = nVar.f86346b;
        if (localDateNow == null) {
            localDateNow = LocalDate.now();
        }
        localDateNow.getClass();
        fVar.L(this, l14, localDateNow);
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (ua().f73852a != null) {
            iy.a.f95765o.getClass();
            iy.a aVar = new iy.a();
            Bundle bundle = new Bundle();
            bundle.putLong("extra.date.time", j8);
            aVar.setArguments(bundle);
            return aVar;
        }
        com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b.C.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b bVar = new com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("extra.date.time", j8);
        bVar.setArguments(bundle2);
        return bVar;
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final void da() {
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(a7.b.getColor(this, R.color.gcm_background_hero));
        hy.d dVar = new hy.d(this, 0);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, dVar);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 != 206 && i14 != 1241) {
                if (i14 == 1503) {
                    if (intent == null || !intent.getBooleanExtra("CYCLE_DATA_ALTERED", false)) {
                        return;
                    }
                    ua().f73858g = true;
                    e32.j jVar = (e32.j) oa();
                    if (jVar != null) {
                        jVar.a();
                    }
                    setResult(-1);
                    return;
                }
                if (i14 == 1620) {
                    if (intent != null && intent.getBooleanExtra("GCM_extra_event_updated", false)) {
                        ua().f73858g = true;
                        e32.j jVar2 = (e32.j) oa();
                        if (jVar2 != null) {
                            jVar2.a();
                        }
                        setResult(-1);
                        return;
                    }
                    if ((intent == null || !intent.getBooleanExtra("extra_event_unsubscribed", false)) && (intent == null || !intent.getBooleanExtra("GCM_extra_event_deleted", false))) {
                        return;
                    }
                    String stringExtra = intent.getStringExtra("GCM_extra_event_name");
                    if (stringExtra != null) {
                        View viewFindViewById = findViewById(android.R.id.content);
                        viewFindViewById.getClass();
                        String string = getString(R.string.event_removed_from_calendar, stringExtra);
                        string.getClass();
                        eg0.c.c(viewFindViewById, string);
                    }
                    ua().f73858g = true;
                    e32.j jVar3 = (e32.j) oa();
                    if (jVar3 != null) {
                        jVar3.a();
                    }
                    setResult(-1);
                    return;
                }
                if (i14 == 99999) {
                    Intent intent2 = new Intent();
                    ua().f73858g = true;
                    e32.j jVar4 = (e32.j) oa();
                    if (jVar4 != null) {
                        jVar4.a();
                    }
                    setResult(-1, intent2);
                    return;
                }
                if (i14 != 9487 && i14 != 9488) {
                    switch (i14) {
                    }
                    return;
                }
            }
            ua().f73858g = true;
            e32.j jVar5 = (e32.j) oa();
            if (jVar5 != null) {
                jVar5.a();
            }
            setResult(-1);
        }
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ua().f73852a != null) {
            setRequestedOrientation(1);
        }
        b00.b.f14135a.getClass();
        b00.b.a.f14137b.f(this, new c(new ho0.g(this, 9)));
        pa().setVisibility(8);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.f31196o.b(applicationContext);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.f31196o.M(applicationContext, new hy.e(this, 0));
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new o13.p("PageAction", "Opened"), new o13.p("page", "day"));
        aVar.getClass();
        ht.a.a(bundleA, "PageViewCalendar");
    }

    @Override // e32.n
    public final e32.j sa(DateTime dateTime) {
        return new e32.j(this, dateTime, new e32.o[]{e32.o.f62806i}, new a(ua().f73852a != null));
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_daily_details);
        string.getClass();
        return string;
    }

    public final fy.a ua() {
        return (fy.a) this.f31195n.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/detail/details/CalendarDetailsActivity$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
