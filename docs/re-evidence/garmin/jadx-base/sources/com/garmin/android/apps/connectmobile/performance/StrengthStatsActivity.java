package com.garmin.android.apps.connectmobile.performance;

import a61.l;
import am.x0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c53.a0;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity;
import e23.p;
import e32.k;
import e32.n;
import e32.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import lc.u0;
import n23.j;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o71.i;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.d0;
import p13.h0;
import p13.u;
import p13.w;
import p13.x;
import p13.y;
import r22.v1;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/StrengthStatsActivity;", "Le32/n;", "Lcom/garmin/android/apps/connectmobile/performance/a;", "Le32/f;", "<init>", "()V", "b", "c", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StrengthStatsActivity extends n<com.garmin.android.apps.connectmobile.performance.a> implements e32.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f39815r = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f39816n = new w1(s0.f105811a.b(i.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f39817o = m.b(new a03.d(15));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DateTime f39818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f.c<ItemPickerActivity.c.a<b>> f39819q;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/StrengthStatsActivity$b;", "Landroid/os/Parcelable;", "Lp71/f;", "filter", "", "shouldShowNoData", "<init>", "(Lp71/f;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p71.f f39820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f39821b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b((p71.f) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(p71.f fVar, boolean z14) {
            fVar.getClass();
            this.f39820a = fVar;
            this.f39821b = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39820a.equals(bVar.f39820a) && this.f39821b == bVar.f39821b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f39821b) + (this.f39820a.hashCode() * 31);
        }

        public final String toString() {
            return "FilterHolder(filter=" + this.f39820a + ", shouldShowNoData=" + this.f39821b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeParcelable(this.f39820a, i14);
            parcel.writeInt(this.f39821b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/StrengthStatsActivity$c;", "Lq61/a;", "Lcom/garmin/android/apps/connectmobile/performance/StrengthStatsActivity$b;", "", "firstItemBottomSpacingInPx", "<init>", "(I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements q61.a<b> {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39822a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c(int i14) {
            this.f39822a = i14;
        }

        @Override // q61.a
        public final List G2(ItemPickerActivity itemPickerActivity) {
            Resources resources = itemPickerActivity.getResources();
            resources.getClass();
            v1 v1Var = new v1((int) (this.f39822a / resources.getDisplayMetrics().density), false, false, false, true, 14, null);
            Resources resources2 = itemPickerActivity.getResources();
            resources2.getClass();
            return x.k(v1Var, new v1((int) (resources2.getDimensionPixelSize(R.dimen.spacing_normal) / resources2.getDisplayMetrics().density), false, false, true, false, 22, null));
        }

        @Override // q61.a
        public final n71.g X(Parcelable parcelable) {
            return ((b) parcelable).f39820a.getF136309a();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // q61.a
        public final n71.g o4(Parcelable parcelable) {
            n71.g.a aVar = new n71.g.a(R.string.no_data_for_this_time_period);
            if (((b) parcelable).f39821b) {
                return aVar;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeInt(this.f39822a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity$onStart$3", f = "StrengthStatsActivity.kt", l = {361}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39823a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return StrengthStatsActivity.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f39823a;
            StrengthStatsActivity strengthStatsActivity = StrengthStatsActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    a aVar2 = StrengthStatsActivity.f39815r;
                    i iVar = (i) strengthStatsActivity.f39816n.getValue();
                    this.f39823a = 1;
                    if (iVar.E4(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable unused) {
                strengthStatsActivity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39825a;

        public e(b.g gVar) {
            this.f39825a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39825a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39826a;

        public f(b.g gVar) {
            this.f39826a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39826a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f39828b;

        public g(e23.a aVar, b.g gVar) {
            this.f39827a = aVar;
            this.f39828b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39827a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39828b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public StrengthStatsActivity() {
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        this.f39818p = dateTimeNow;
    }

    public static b ua(q13.b bVar, p71.f fVar) {
        b bVar2;
        ListIterator listIterator = bVar.listIterator(0);
        do {
            q13.b.c cVar = (q13.b.c) listIterator;
            bVar2 = null;
            bVar2 = null;
            if (!cVar.hasNext()) {
                break;
            }
            com.garmin.android.apps.connectmobile.performance.picker.b bVar3 = (com.garmin.android.apps.connectmobile.performance.picker.b) cVar.next();
            if (!(bVar3 instanceof com.garmin.android.apps.connectmobile.performance.picker.b.a)) {
                if (!(bVar3 instanceof com.garmin.android.apps.connectmobile.performance.picker.b.C0742b)) {
                    u0.r();
                    return null;
                }
                for (T t7 : ((com.garmin.android.apps.connectmobile.performance.picker.b.C0742b) bVar3).f39997b) {
                    if (!t7.f39820a.equals(fVar)) {
                        t7 = null;
                    }
                    if (t7 != null) {
                        bVar2 = t7;
                        break;
                    }
                }
            } else {
                Object obj = ((com.garmin.android.apps.connectmobile.performance.picker.b.a) bVar3).f39995a;
                bVar2 = (b) (((b) obj).f39820a.equals(fVar) ? obj : null);
            }
        } while (bVar2 == null);
        if (bVar2 != null) {
            return bVar2;
        }
        j.s("No element of the collection was transformed to a non-null value.");
        return null;
    }

    public static boolean va(o71.a aVar, Set set) {
        List<zw1.a> listB = aVar.b();
        ArrayList arrayList = new ArrayList(y.r(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((zw1.a) it.next()).f207225a);
        }
        return h0.h0(arrayList, set).isEmpty();
    }

    @Override // e32.f
    public final void H8(int i14, DateTime dateTime) {
        e32.j jVar;
        dateTime.getClass();
        o.f62804g.getClass();
        o oVarA = o.a.a(i14);
        if (oVarA != null) {
            if (oVarA == o.f62809l || ((jVar = (e32.j) oa()) != null && qa().getCurrentItem() == u.M(jVar.f62798j, oVarA))) {
                this.f39818p = dateTime;
            }
        }
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        a61.m mVar = new a61.m();
        e32.i.f62791o.getClass();
        mVar.setArguments(e32.i.a.a(i14, j8, j14));
        return mVar;
    }

    @Override // x22.d
    public final int na() {
        return R.layout.activity_reports;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() > 0) {
            getSupportFragmentManager().b0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_YEAR_MONTH_DESTINATION", LocalDate.class) : null;
        } else {
            Object serializableExtra3 = intent != null ? intent.getSerializableExtra("EXTRA_YEAR_MONTH_DESTINATION") : null;
            if (!(serializableExtra3 instanceof LocalDate)) {
                serializableExtra3 = null;
            }
            serializableExtra = (LocalDate) serializableExtra3;
        }
        LocalDate localDate = (LocalDate) serializableExtra;
        if (localDate != null) {
            pa().setVisibility(8);
            I8(new com.garmin.android.apps.connectmobile.performance.a.b(new YearMonth(localDate.getYear(), localDate.getMonthOfYear())));
        }
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("EXTRA_AVAILABLE_ACTIVITIES", mp.b[].class) : null;
        } else {
            Object serializableExtra4 = intent2 != null ? intent2.getSerializableExtra("EXTRA_AVAILABLE_ACTIVITIES") : null;
            if (!(serializableExtra4 instanceof mp.b[])) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (mp.b[]) serializableExtra4;
        }
        ((ComposeView) findViewById(R.id.tabbed_pager_top_optional_view)).setContent(new z3.e(1379409797, true, new a61.g(serializableExtra2 instanceof mp.b[] ? (mp.b[]) serializableExtra2 : null, this, 0)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (getSupportFragmentManager().M() <= 0) {
            return super.onNavigateUp();
        }
        getSupportFragmentManager().b0();
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        v supportFragmentManager = getSupportFragmentManager();
        int i14 = 0;
        supportFragmentManager.b(new a61.h(supportFragmentManager, this, i14));
        this.f39819q = registerForActivityResult(new ItemPickerActivity.c(), new a61.i(this, i14));
        ge1.b.T(f0.w(this), null, null, new d(null), 3);
    }

    @Override // e32.n
    public final e32.j sa(DateTime dateTime) {
        o71.g.f130199e.getClass();
        return new e32.j(this, dateTime, (o[]) o71.g.f130200f.getValue(), (k) this.f39817o.getValue());
    }

    @Override // e32.n
    public final String ta() {
        return dh.b.A(this, x0.f4316p.f4360c);
    }

    @Override // e32.l
    /* JADX INFO: renamed from: wa, reason: merged with bridge method [inline-methods] */
    public final void I8(com.garmin.android.apps.connectmobile.performance.a aVar) {
        aVar.getClass();
        if (aVar instanceof com.garmin.android.apps.connectmobile.performance.a.C0729a) {
            aq.b bVar = new aq.b();
            com.garmin.android.apps.connectmobile.performance.a.C0729a c0729a = (com.garmin.android.apps.connectmobile.performance.a.C0729a) aVar;
            bVar.f11823b = c0729a.f39829a;
            bVar.f11827f = c0729a.f39830b;
            startActivity(bVar.a(this));
            return;
        }
        boolean z14 = true;
        if (aVar instanceof com.garmin.android.apps.connectmobile.performance.a.b) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
            aVarB.j(R.id.view_pager_container, ((k) this.f39817o.getValue()).a(o.f62809l, ((com.garmin.android.apps.connectmobile.performance.a.b) aVar).f39831a.toLocalDate(1).toDateTimeAtStartOfDay()), null, 1);
            aVarB.d("month_view");
            aVarB.e();
            return;
        }
        boolean z15 = aVar instanceof com.garmin.android.apps.connectmobile.performance.a.d;
        w1 w1Var = this.f39816n;
        if (z15) {
            f.c<ItemPickerActivity.c.a<b>> cVar = this.f39819q;
            if (cVar == null) {
                s.m("pickFilterLauncher");
                throw null;
            }
            Set<com.garmin.android.apps.connectmobile.performance.dto.c> set = ((com.garmin.android.apps.connectmobile.performance.a.d) aVar).f39833a;
            i.b bVarD = ((i) w1Var.getValue()).f130240b.d();
            p71.f fVar = bVarD != null ? bVarD.f130245b : null;
            if (fVar == null) {
                h.s("Required value was null.");
                return;
            }
            q13.b bVarB = w.b();
            com.garmin.android.apps.connectmobile.performance.picker.d dVar = new com.garmin.android.apps.connectmobile.performance.picker.d(bVarB);
            l.f1621a.getClass();
            com.garmin.android.apps.connectmobile.performance.picker.b.a aVar2 = new com.garmin.android.apps.connectmobile.performance.picker.b.a(new b((p71.a) l.f1622b.getValue(), set.isEmpty()));
            List<com.garmin.android.apps.connectmobile.performance.picker.b<Parcelable>> list = dVar.f39999a;
            list.add(aVar2);
            d0.x(list, c0.o(new a0(c0.o(new c53.c(new c53.m(new a61.j(set, fVar, null)), new com.google.maps.android.compose.clustering.d(21)), new a61.f(set, 0)), new a61.k(this)), com.garmin.android.apps.connectmobile.performance.picker.c.f39998a));
            q13.b bVarA = w.a(bVarB);
            b bVarUa = ua(bVarA, fVar);
            c cVar2 = new c(getResources().getDimensionPixelSize(R.dimen.spacing_xlarge));
            String string = getString(R.string.strength_training_exercises);
            string.getClass();
            cVar.a(new ItemPickerActivity.c.a<>(string, bVarA, bVarUa, cVar2), null);
            return;
        }
        if (!(aVar instanceof com.garmin.android.apps.connectmobile.performance.a.e)) {
            if (!(aVar instanceof com.garmin.android.apps.connectmobile.performance.a.c)) {
                u0.r();
                return;
            }
            am.d dVar2 = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            startActivity(dVar2.l0(applicationContext, am.g.f3952p));
            return;
        }
        f.c<ItemPickerActivity.c.a<b>> cVar3 = this.f39819q;
        if (cVar3 == null) {
            s.m("pickFilterLauncher");
            throw null;
        }
        Set<String> set2 = ((com.garmin.android.apps.connectmobile.performance.a.e) aVar).f39834a;
        i.b bVarD2 = ((i) w1Var.getValue()).f130240b.d();
        p71.f fVar2 = bVarD2 != null ? bVarD2.f130245b : null;
        if (fVar2 == null) {
            h.s("Required value was null.");
            return;
        }
        q13.b bVarB2 = w.b();
        com.garmin.android.apps.connectmobile.performance.picker.d dVar3 = new com.garmin.android.apps.connectmobile.performance.picker.d(bVarB2);
        l.f1621a.getClass();
        com.garmin.android.apps.connectmobile.performance.picker.b.a aVar3 = new com.garmin.android.apps.connectmobile.performance.picker.b.a(new b((p71.a) l.f1623c.getValue(), set2.isEmpty()));
        List<com.garmin.android.apps.connectmobile.performance.picker.b<Parcelable>> list2 = dVar3.f39999a;
        list2.add(aVar3);
        w13.c cVar4 = o71.a.f130130b;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
        while (bVarN.hasNext()) {
            o71.a aVar4 = (o71.a) bVarN.next();
            if (va(aVar4, set2)) {
                if (fVar2 instanceof p71.d) {
                    Set<zw1.a> set3 = ((p71.d) fVar2).f136310b;
                    ArrayList arrayList = new ArrayList(y.r(set3, 10));
                    Iterator<T> it = set3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((zw1.a) it.next()).f207225a);
                    }
                    if (va(aVar4, h0.g1(arrayList))) {
                    }
                }
            }
            String strA = n71.h.a(this, aVar4.getF130153d());
            q13.b bVarB3 = w.b();
            boolean z16 = z14;
            bVarB3.add(new b(new p71.d(aVar4.getF130154e(), h0.g1(aVar4.b())), false));
            List<zw1.a> listB = aVar4.b();
            ArrayList arrayList2 = new ArrayList(y.r(listB, 10));
            for (zw1.a aVar5 : listB) {
                arrayList2.add(new b(new p71.d(aVar5), !set2.contains(aVar5.f207225a)));
            }
            bVarB3.addAll(arrayList2);
            Unit unit = Unit.INSTANCE;
            q13.b bVarA2 = w.a(bVarB3);
            bVarA2.getClass();
            list2.add(new com.garmin.android.apps.connectmobile.performance.picker.b.C0742b(strA, h0.b1(bVarA2)));
            z14 = z16;
        }
        q13.b bVarA3 = w.a(bVarB2);
        b bVarUa2 = ua(bVarA3, fVar2);
        c cVar5 = new c(0);
        String string2 = getString(R.string.strength_training_muscles);
        string2.getClass();
        cVar3.a(new ItemPickerActivity.c.a<>(string2, bVarA3, bVarUa2, cVar5), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/StrengthStatsActivity$a;", "", "<init>", "()V", "", "MONTH_VIEW_TAG", "Ljava/lang/String;", "EXTRA_AVAILABLE_ACTIVITIES", "EXTRA_YEAR_MONTH_DESTINATION", "EXTRA_SELECTED_ACTIVITY_TYPE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
