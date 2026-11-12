package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.r0;
import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidListener;
import e32.o;
import fw.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import lc.u0;
import o13.t;
import o53.f0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import r22.m0;
import yr1.q;
import yr1.r;
import z10.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/GCMCalendarActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "Li/a$c;", "Lcom/garmin/android/apps/connectmobile/calendar/presentation/f$a;", "<init>", "()V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GCMCalendarActivity extends r0 implements i.a.c, com.garmin.android.apps.connectmobile.calendar.presentation.f.a {
    public static final a F = new a(null);
    public boolean A;
    public WorkoutScheduleSummaryDTO B;
    public ey.n C;
    public final x D;
    public final f.c<Intent> E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f31068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.calendar.presentation.b f31069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.calendar.presentation.f f31070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f31072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lj0.j f31073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f31075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f31078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Calendar f31080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CalendarDTO f31081r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DateTime f31082t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w1 f31083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f31084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f31085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31086y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f31087z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31089b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31088a = iArr;
            int[] iArr2 = new int[gg1.m.values().length];
            try {
                iArr2[gg1.m.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[gg1.m.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[gg1.m.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gg1.m.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[gg1.m.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[gg1.m.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[gg1.m.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            f31089b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f31090a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f31090a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f31090a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31090a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/calendar/presentation/GCMCalendarActivity$d", "Lcom/roomorama/caldroid/CaldroidListener;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends CaldroidListener {
        public d() {
        }

        @Override // com.roomorama.caldroid.CaldroidListener
        public final void onChangeMonth(int i14, int i15) {
            GCMCalendarActivity gCMCalendarActivity = GCMCalendarActivity.this;
            com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = gCMCalendarActivity.f31070g;
            fVar.getClass();
            InfiniteViewPager infiniteViewPager = fVar.f31109d;
            if (infiniteViewPager != null) {
                infiniteViewPager.setSixWeeksInCalendar(false);
            }
            com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV6 = fVar.v6(fVar.f31113h, fVar.f31114i);
            if (dVarV6 != null) {
                dVarV6.l();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(i15, i14 - 1, 1);
            gCMCalendarActivity.f31082t = new DateTime(calendar);
            DateTime dateTime = gCMCalendarActivity.f31082t;
            if (dateTime != null) {
                gCMCalendarActivity.na(null, dateTime);
            }
        }

        @Override // com.roomorama.caldroid.CaldroidListener
        public final void onSelectDate(Date date, View view2) {
            date.getClass();
            view2.getClass();
            GCMCalendarActivity gCMCalendarActivity = GCMCalendarActivity.this;
            com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = gCMCalendarActivity.f31070g;
            fVar.getClass();
            com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV6 = fVar.v6(fVar.f31113h, fVar.f31114i);
            CalendarDTO calendarDTO = dVarV6 != null ? dVarV6.f31157f : null;
            CalendarDetailsActivity.b bVar = CalendarDetailsActivity.f31194p;
            DateTime dateTime = new DateTime(date);
            bVar.getClass();
            Intent intent = new Intent(gCMCalendarActivity, (Class<?>) CalendarDetailsActivity.class);
            e32.n.a aVar = e32.n.f62802m;
            o oVar = o.f62806i;
            aVar.getClass();
            e32.n.a.a(intent, dateTime, oVar);
            l2.a aVar2 = l2.f37135b;
            Bundle bundleA = h7.c.a(new o13.p("GCM_calendar_data", calendarDTO));
            aVar2.getClass();
            l2.a.b().a(intent, bundleA);
            l2.a.b().a(intent, h7.c.a(new o13.p("GCM_extra_connection_group_id", null)));
            gCMCalendarActivity.startActivityForResult(intent, 1240);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31092a;

        public e(b.g gVar) {
            this.f31092a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31092a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31093a;

        public f(b.g gVar) {
            this.f31093a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31093a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f31095b;

        public g(e23.a aVar, b.g gVar) {
            this.f31094a = aVar;
            this.f31095b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31094a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31095b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31096a;

        public h(b.g gVar) {
            this.f31096a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31096a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31097a;

        public i(b.g gVar) {
            this.f31097a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31097a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f31099b;

        public j(e23.a aVar, b.g gVar) {
            this.f31098a = aVar;
            this.f31099b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31098a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31099b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31100a;

        public k(b.g gVar) {
            this.f31100a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f31100a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f31101a;

        public l(b.g gVar) {
            this.f31101a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f31101a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f31102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f31103b;

        public m(e23.a aVar, b.g gVar) {
            this.f31102a = aVar;
            this.f31103b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f31102a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f31103b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/calendar/presentation/GCMCalendarActivity$n", "Lyr1/r;", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n implements r {
        public n() {
        }

        @Override // yr1.r
        public final void B1(al2.c cVar) {
        }

        @Override // yr1.r
        public final void F1(al2.a aVar, boolean z14) {
        }

        @Override // yr1.r
        public final void g5(al2.c cVar, boolean z14) {
            GCMCalendarActivity gCMCalendarActivity = GCMCalendarActivity.this;
            DateTime dateTime = gCMCalendarActivity.f31082t;
            if (dateTime != null) {
                com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = gCMCalendarActivity.f31070g;
                if (fVar != null) {
                    fVar.u6();
                }
                gCMCalendarActivity.na(null, dateTime);
            }
        }
    }

    public GCMCalendarActivity() {
        e eVar = new e(this);
        t0 t0Var = s0.f105811a;
        this.f31068e = new w1(t0Var.b(ey.e.class), new f(this), eVar, new g(null, this));
        this.f31069f = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
        this.f31071h = -1;
        this.f31083v = new w1(t0Var.b(ey.s.class), new i(this), new h(this), new j(null, this));
        this.f31084w = new w1(t0Var.b(ey.h.class), new l(this), new k(this), new m(null, this));
        this.f31085x = o13.m.b(new e40.d(this, 19));
        this.D = new x(this, 21);
        this.E = registerForActivityResult(new g.h(), new a61.i(this, 18));
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (this.f31074k) {
            return "CALENDAR";
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.CALENDAR;
    }

    @Override // i.a.c
    public final void m2(int i14) {
        throw null;
    }

    public final void ma() {
        if (this.f31079p == 0) {
            hideProgressOverlay();
            if (this.f31076m) {
                m0 m0VarC = m0.a.c(m0.f149759e, getString(R.string.calendar_sync_message_title), getString(R.string.calendar_sync_message_description), R.string.sleep_advanced_sleep_got_it_button, this.D, -1, null, 128);
                v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                aVarB.j(0, m0VarC, "AUTO_SYNC_DIALOG_KEY", 1);
                aVarB.s(true, true);
            }
        }
    }

    public final void na(String str, DateTime dateTime) {
        dateTime.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = this.f31070g;
        fVar.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.b bVar = this.f31069f;
        bVar.getClass();
        List<CalendarItemDTO.b> listD = bVar.d();
        listD.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV6 = fVar.v6(fVar.f31113h, fVar.f31114i);
        if ((dVarV6 != null && listD.containsAll(dVarV6.f31168q) && dVarV6.f31168q.containsAll(listD)) ? dVarV6.i(str) : false) {
            return;
        }
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar2 = this.f31070g;
        fVar2.getClass();
        fVar2.u6();
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar3 = this.f31070g;
        fVar3.getClass();
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV7 = fVar3.v6(fVar3.f31113h, fVar3.f31114i);
        if (dVarV7 != null) {
            dVarV7.notifyDataSetChanged();
        }
        this.f31086y = false;
        invalidateOptionsMenu();
        showProgressOverlay();
        this.f31081r = null;
        w1 w1Var = this.f31084w;
        if (str != null) {
            ey.h hVar = (ey.h) w1Var.getValue();
            xy2.b.K(hVar, new ey.g(hVar, str, dateTime, null)).f(this, new c(new e52.b(9, this, dateTime)));
        } else {
            ey.h hVar2 = (ey.h) w1Var.getValue();
            y0 y0Var = new y0();
            ge1.b.T(v1.a(hVar2), null, null, new ey.f(y0Var, hVar2, dateTime, true, null), 3);
            y0Var.f(this, new ey.m(this, dateTime));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.f.a
    public final void o8(boolean z14) {
        int i14 = this.f31079p;
        if (z14) {
            this.f31079p = i14 + 1;
            return;
        }
        this.f31079p = i14 - 1;
        this.f31086y = true;
        invalidateOptionsMenu();
        ma();
    }

    public final void oa(sd2.f fVar) {
        String strK = ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).k(fVar);
        CalendarToDeviceSummaryActivity.a aVar = CalendarToDeviceSummaryActivity.f31052g;
        long unitID = fVar.getUnitID();
        WorkoutScheduleSummaryDTO workoutScheduleSummaryDTO = this.B;
        workoutScheduleSummaryDTO.getClass();
        int i14 = workoutScheduleSummaryDTO.f31051c;
        WorkoutScheduleSummaryDTO workoutScheduleSummaryDTO2 = this.B;
        workoutScheduleSummaryDTO2.getClass();
        String str = workoutScheduleSummaryDTO2.f31049a;
        WorkoutScheduleSummaryDTO workoutScheduleSummaryDTO3 = this.B;
        workoutScheduleSummaryDTO3.getClass();
        String str2 = workoutScheduleSummaryDTO3.f31050b;
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CalendarToDeviceSummaryActivity.class);
        intent.putExtra("extras.image.url", strK);
        intent.putExtra("extras.device.id", unitID);
        intent.putExtra("extras.workout.count", i14);
        intent.putExtra("extras.start.date", str);
        intent.putExtra("extras.end.date", str2);
        startActivityForResult(intent, 1238);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 1237) {
            if (i15 == -1) {
                intent.getClass();
                this.A = intent.getBooleanExtra("GCM_calendar_office_365_connected", false);
                invalidateOptionsMenu();
                return;
            }
            return;
        }
        if (i14 == 1239) {
            if (i15 == -1) {
                ge1.b.T(f0.w(this), null, null, new ey.o(this, null), 3);
            }
        } else if (i14 == 1240 && i15 == -1) {
            setResult(-1);
            com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = this.f31070g;
            if (fVar != null) {
                fVar.u6();
                DateTime dateTime = this.f31082t;
                if (dateTime != null) {
                    na(null, dateTime);
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, R.string.lbl_calendar);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i14 = extras.getInt("extra.specified_year");
            int i15 = extras.getInt("extra.specified_month", -1);
            this.f31074k = extras.getBoolean("extra.bottom.nav.bar.visibility", true);
            this.f31080q = (i14 == 0 || i15 == -1) ? Calendar.getInstance() : new GregorianCalendar(i14, i15 - 1, 1);
        }
        if (this.f31074k) {
            ca("CALENDAR");
        }
        this.f31087z = true;
        findViewById(R.id.content_frame).addOnLayoutChangeListener(new com.google.android.material.carousel.a(this, 2));
        this.C = new ey.n(this);
        vx.f fVar = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);
        ey.n nVar = this.C;
        nVar.getClass();
        this.f31072i = fVar.l(nVar);
        this.f31079p++;
        com.garmin.android.apps.connectmobile.calendar.presentation.b bVarA = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
        bVarA.getClass();
        ey.l lVar = new ey.l(this);
        lj0.f fVar2 = lj0.f.E;
        lj0.j jVar = new lj0.j(new com.garmin.android.apps.connectmobile.calendar.presentation.b.C0498b(bVarA, lVar));
        jVar.b(new lj0.i(fVar2, new Object[0]));
        this.f31073j = jVar;
        this.f31079p++;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        ArrayList arrayList;
        menu.getClass();
        getMenuInflater().inflate(R.menu.calendar_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_filter);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_office_365);
        menuItemFindItem.setEnabled(this.f31086y);
        menuItemFindItem.setVisible(this.f31087z);
        Drawable icon = menuItemFindItem.getIcon();
        icon.getClass();
        Drawable drawableMutate = icon.mutate();
        int color = a7.b.getColor(this, R.color.gcm_icon_primary);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableMutate.setColorFilter(color, mode);
        Drawable icon2 = menuItemFindItem2.getIcon();
        icon2.getClass();
        icon2.mutate().setColorFilter(a7.b.getColor(this, R.color.gcm_icon_primary), mode);
        boolean z14 = false;
        if (this.A) {
            menuItemFindItem2.setVisible(true).setShowAsActionFlags(0);
            menuItemFindItem.setShowAsActionFlags(0);
        } else {
            menuItemFindItem2.setVisible(false);
            menuItemFindItem.setShowAsActionFlags(1);
        }
        menu.findItem(R.id.menu_item_calendar_sync).setVisible(this.f31075l);
        if (menu.findItem(R.id.menu_item_calendar_sync).isVisible()) {
            menu.findItem(R.id.menu_item_send_to_device).setVisible(false);
            return true;
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_send_to_device);
        if (TextUtils.isEmpty(null) && !this.f31077n && (arrayList = this.f31078o) != null && !arrayList.isEmpty()) {
            z14 = true;
        }
        menuItemFindItem3.setVisible(z14);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(0L)) {
            cVar.a(0L);
        }
        if (cVar.e(Long.valueOf(this.f31072i))) {
            cVar.a(this.f31072i);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_filter) {
            this.E.a(new Intent(this, (Class<?>) GCMCalendarFilterActivity.class), null);
            return true;
        }
        if (itemId == R.id.menu_item_office_365) {
            startActivityForResult(((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).x(this), 1237);
            return true;
        }
        if (itemId == R.id.menu_item_send_to_device) {
            androidx.lifecycle.m.a(null, new ey.c((ey.e) this.f31068e.getValue(), null), 3).f(this, new c(new ey.k(this, 0)));
            return true;
        }
        if (itemId != R.id.menu_item_calendar_sync) {
            return super.onOptionsItemSelected(menuItem);
        }
        CompatibleDevicesHelpActivity.a aVar = CompatibleDevicesHelpActivity.f31065c;
        ArrayList arrayList = this.f31078o;
        arrayList.getClass();
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) CompatibleDevicesHelpActivity.class);
        intent.putParcelableArrayListExtra("DEVICE_LIST_KEY", new ArrayList<>(arrayList));
        startActivity(intent);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((q) this.f31085x.getValue()).e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f31070g != null) {
            ht.a aVar = ht.a.f85464a;
            Bundle bundleA = h7.c.a(new o13.p("PageAction", "Opened"), new o13.p("page", "self"));
            aVar.getClass();
            ht.a.a(bundleA, "PageViewCalendar");
        } else if (this.f31071h != -1) {
            pa();
        }
        ((q) this.f31085x.getValue()).b();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        lj0.j jVar = this.f31073j;
        if (jVar != null) {
            jVar.getClass();
            if (jVar.e()) {
                return;
            }
            lj0.j jVar2 = this.f31073j;
            jVar2.getClass();
            jVar2.a();
        }
    }

    public final void pa() {
        int i14;
        this.f31070g = new com.garmin.android.apps.connectmobile.calendar.presentation.f();
        Bundle bundle = new Bundle();
        f12.l.f68084a.getClass();
        switch (b.f31089b[f12.l.a.a().e1().ordinal()]) {
            case 1:
                i14 = 1;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = 3;
                break;
            case 4:
                i14 = 4;
                break;
            case 5:
                i14 = 5;
                break;
            case 6:
                i14 = 6;
                break;
            case 7:
                i14 = 7;
                break;
            default:
                u0.r();
                return;
        }
        Calendar calendar = this.f31080q;
        calendar.getClass();
        bundle.putInt(CaldroidFragment.MONTH, calendar.get(2) + 1);
        Calendar calendar2 = this.f31080q;
        calendar2.getClass();
        bundle.putInt(CaldroidFragment.YEAR, calendar2.get(1));
        bundle.putInt("CONTAINER_HEIGHT", this.f31071h);
        bundle.putBoolean(CaldroidFragment.ENABLE_SWIPE, true);
        bundle.putBoolean(CaldroidFragment.SIX_WEEKS_IN_CALENDAR, false);
        bundle.putInt(CaldroidFragment.START_DAY_OF_WEEK, i14);
        bundle.putInt(CaldroidFragment.THEME_RESOURCE, R.style.GCMCalendarDark);
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = this.f31070g;
        fVar.getClass();
        fVar.setArguments(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar2 = this.f31070g;
        fVar2.getClass();
        aVar.l(R.id.content_frame, fVar2, null);
        aVar.e();
        com.garmin.android.apps.connectmobile.calendar.presentation.f fVar3 = this.f31070g;
        fVar3.getClass();
        fVar3.C = new d();
    }

    public final void qa(DateTime dateTime) {
        if (this.f31081r != null) {
            com.garmin.android.apps.connectmobile.calendar.presentation.f fVar = this.f31070g;
            fVar.getClass();
            dateTime.getClass();
            int monthOfYear = dateTime.getMonthOfYear();
            int year = dateTime.getYear();
            CalendarDTO calendarDTO = this.f31081r;
            com.garmin.android.apps.connectmobile.calendar.presentation.f.a aVar = fVar.P;
            if (aVar != null) {
                aVar.o8(true);
            }
            com.garmin.android.apps.connectmobile.calendar.presentation.f.b bVar = new com.garmin.android.apps.connectmobile.calendar.presentation.f.b(fVar, calendarDTO, monthOfYear, year, null);
            bVar.c(new Void[0]);
            fVar.T = bVar;
            this.f31081r = null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/GCMCalendarActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_OFFICE_365_SYNC_SETTINGS", "I", "REQUEST_CODE_CALENDAR_TO_DEVICE", "REQUEST_CODE_SELECT_DEVICE", "REQUEST_AUTO_SYNC_STATUS", "EXTRA_SPECIFIED_YEAR", "EXTRA_SPECIFIED_MONTH", "EXTRA_BOTTOM_NAV_BAR_VISIBILITY", "AUTO_SYNC_DIALOG_KEY", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
