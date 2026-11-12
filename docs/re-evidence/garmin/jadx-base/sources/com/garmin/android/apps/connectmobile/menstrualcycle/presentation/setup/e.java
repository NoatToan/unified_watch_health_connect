package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import f12.l;
import java.util.Calendar;
import java.util.Date;
import lp2.h;
import o13.m;
import o13.n;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import xz2.j;
import xz2.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "c", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39159b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39160c = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39161a = m.a(n.NONE, new C0695e(this, null, new d(this), null, null));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/e$b;", "Lxz2/j;", "Lxz2/b;", "minimumDate", "maximumDate", "<init>", "(Lxz2/b;Lxz2/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xz2.b f39162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xz2.b f39163b;

        public b(xz2.b bVar, xz2.b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f39162a = bVar;
            this.f39163b = bVar2;
        }

        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            return bVar.i(this.f39162a) || bVar.h(this.f39163b);
        }

        @Override // xz2.j
        public final void b(k kVar) {
            kVar.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/e$c;", "Lxz2/j;", "<init>", "(Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/e;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f39164a;

        public c() {
            Context context = e.this.getContext();
            if (context != null) {
                this.f39164a = a7.b.getDrawable(context, R.drawable.gcm4_calendar_selected_day_bck);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
        @Override // xz2.j
        public final boolean a(xz2.b bVar) {
            bVar.getClass();
            a aVar = e.f39159b;
            return s.g(xz2.b.d(((lx0.k) e.this.f39161a.getValue()).f115191g), bVar);
        }

        @Override // xz2.j
        public final void b(k kVar) {
            Drawable drawable = this.f39164a;
            if (drawable != null) {
                kVar.b(drawable);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39166a;

        public d(Fragment fragment) {
            this.f39166a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f39166a.requireActivity();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0695e implements e23.a<lx0.k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f39171e;

        public C0695e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f39167a = fragment;
            this.f39168b = qualifier;
            this.f39169c = aVar;
            this.f39170d = aVar2;
            this.f39171e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final lx0.k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f39169c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f39167a;
            e23.a aVar = this.f39170d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(lx0.k.class), f189591b, null, defaultViewModelCreationExtras, this.f39168b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f39171e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_mct_setup_period_date, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        View view3;
        view2.getClass();
        super.onCreate(bundle);
        MaterialCalendarView materialCalendarView = (MaterialCalendarView) view2.findViewById(R.id.period_start_calendar);
        ?? r14 = this.f39161a;
        materialCalendarView.setSelectedDate(xz2.b.d(((lx0.k) r14.getValue()).f115191g));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new LocalDate().minusMonths(12).toDate());
        Date date = ((lx0.k) r14.getValue()).f115196l.toDate();
        date.getClass();
        Date time = calendar.getTime();
        time.getClass();
        calendar.setTime((Date) r13.b.d(date, time));
        if (xz2.b.b(calendar).h(xz2.b.b(xz2.g.a()))) {
            String string = ((lx0.k) r14.getValue()).f115197m ? getString(R.string.pregnancy_conflicting_dates_message) : getString(R.string.pregnancy_date_conflict_with_menstrual_cycle);
            string.getClass();
            calendar.setTime(new LocalDate().toDate());
            Fragment parentFragment = getParentFragment();
            Button button = (parentFragment == null || (view3 = parentFragment.getView()) == null) ? null : (Button) view3.findViewById(R.id.next_button);
            if (button != null) {
                button.setEnabled(false);
            }
            if (button != null) {
                button.setClickable(false);
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
            aVar.setTitle(R.string.pregnancy_conflicting_dates);
            aVar.setMessage(string);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            androidx.appcompat.app.e eVarCreate = aVar.create();
            eVarCreate.getClass();
            eVarCreate.show();
        }
        xz2.b bVarB = xz2.b.b(calendar);
        bVarB.getClass();
        xz2.b bVarB2 = xz2.b.b(xz2.g.a());
        bVarB2.getClass();
        materialCalendarView.a(new b(bVarB, bVarB2), new c());
        Calendar calendar2 = Calendar.getInstance();
        calendar.set(5, calendar.getActualMinimum(5));
        calendar2.set(5, calendar2.getActualMaximum(5));
        MaterialCalendarView.h hVarA = materialCalendarView.A.a();
        hVarA.f54800d = xz2.b.d(calendar.getTime());
        hVarA.f54801e = xz2.b.d(calendar2.getTime());
        hVarA.f54798b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().a();
        hVarA.a();
        materialCalendarView.setOnDateChangedListener(new h(this, 21));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/e$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
