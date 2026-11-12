package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.google.android.material.tabs.TabLayout;
import f2.o0;
import fb1.d0;
import gb1.x;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o53.l1;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "c", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40695p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TabLayout f40697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager f40698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f40699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public db1.m f40700l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f40702n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f40696h = o13.m.b(new d0(1));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w1 f40701m = new w1(s0.f105811a.b(gb1.t.class), new f(this), new h(this), new g(null, this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f40703o = new d();

    public interface b {
        void C2();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$c;", "Landroidx/fragment/app/e0;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroidx/fragment/app/v;Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends e0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Context f40704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final LocalDate f40705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LocalDate f40706j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v vVar, Context context, LocalDate localDate, LocalDate localDate2) {
            super(vVar);
            vVar.getClass();
            context.getClass();
            localDate.getClass();
            localDate2.getClass();
            this.f40704h = context;
            this.f40705i = localDate;
            this.f40706j = localDate2;
        }

        @Override // fe.a
        /* JADX INFO: renamed from: getCount */
        public final int getF44034e() {
            return 4;
        }

        @Override // androidx.fragment.app.e0
        public final Fragment getItem(int i14) {
            LocalDate localDate = this.f40706j;
            LocalDate localDate2 = this.f40705i;
            if (i14 == 0) {
                t.f40857f.getClass();
                localDate2.getClass();
                localDate.getClass();
                t tVar = new t();
                Bundle bundle = new Bundle();
                bundle.putSerializable("START_DATE_KEY", localDate2);
                bundle.putSerializable("END_DATE_KEY", localDate);
                tVar.setArguments(bundle);
                return tVar;
            }
            if (i14 == 1) {
                j.f40667v.getClass();
                localDate2.getClass();
                localDate.getClass();
                j jVar = new j();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("START_DATE_KEY", localDate2);
                bundle2.putSerializable("END_DATE_KEY", localDate);
                jVar.setArguments(bundle2);
                return jVar;
            }
            if (i14 != 2) {
                s.f40826f.getClass();
                localDate2.getClass();
                localDate.getClass();
                s sVar = new s();
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("START_DATE_KEY", localDate2);
                bundle3.putSerializable("END_DATE_KEY", localDate);
                sVar.setArguments(bundle3);
                return sVar;
            }
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w.getClass();
            localDate2.getClass();
            localDate.getClass();
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f fVar = new com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f();
            Bundle bundle4 = new Bundle();
            bundle4.putSerializable("START_DATE_KEY", localDate2);
            bundle4.putSerializable("END_DATE_KEY", localDate);
            fVar.setArguments(bundle4);
            return fVar;
        }

        @Override // fe.a
        public final int getItemPosition(Object obj) {
            obj.getClass();
            if (obj instanceof b) {
                ((b) obj).C2();
            }
            return super.getItemPosition(obj);
        }

        @Override // fe.a
        public final CharSequence getPageTitle(int i14) {
            Context context = this.f40704h;
            if (i14 == 0) {
                return context.getString(R.string.mct_lbl_symptoms);
            }
            if (i14 == 1) {
                return context.getString(R.string.pregnancy_blood_glucose);
            }
            if (i14 != 2) {
                return i14 != 3 ? "" : context.getString(R.string.mct_cycle_notes);
            }
            return context.getString(R.string.pregnancy_baby_movement);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$d", "Landroidx/viewpager/widget/ViewPager$j;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements ViewPager.j {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            a aVar = l.f40695p;
            l lVar = l.this;
            Integer numD = lVar.K6().f76718j.d();
            if (numD != null && numD.intValue() == i14) {
                return;
            }
            lVar.K6().f76718j.j(Integer.valueOf(i14));
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40708a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f40708a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40708a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40708a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40709a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40709a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40709a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40711b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40710a = aVar;
            this.f40711b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40710a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40711b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40712a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f40712a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40712a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        M6();
    }

    public final LocalDate I6() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("END_DATE_KEY", LocalDate.class);
            } else {
                Object serializable2 = arguments.getSerializable("END_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                return localDate;
            }
        }
        vb.h.z("Can't display Pregnancy Reports with out end date");
        return null;
    }

    public final LocalDate J6() {
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("START_DATE_KEY", LocalDate.class);
            } else {
                Object serializable2 = arguments.getSerializable("START_DATE_KEY");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                return localDate;
            }
        }
        vb.h.z("Can't display Pregnancy Reports with out start date");
        return null;
    }

    public final gb1.t K6() {
        return (gb1.t) this.f40701m.getValue();
    }

    public final void M6() {
        LocalDate endDate;
        db1.m mVar = this.f40700l;
        if (mVar == null || (endDate = mVar.getDeliveryDate()) == null) {
            db1.m mVar2 = this.f40700l;
            endDate = mVar2 != null ? mVar2.getEndDate() : null;
            if (endDate == null) {
                endDate = new LocalDate();
            }
        }
        if (!endDate.isBefore(I6())) {
            endDate = I6();
        }
        LocalDate localDate = endDate;
        gb1.t tVarK6 = K6();
        LocalDate localDateJ6 = J6();
        LinkedHashMap linkedHashMap = tVarK6.f76715g;
        ReentrantLock reentrantLock = tVarK6.f76714f;
        reentrantLock.lock();
        try {
            tVarK6.f76716h.clear();
            tVarK6.f76717i.clear();
            l1 l1Var = (l1) linkedHashMap.get(localDateJ6);
            cx0.a<gb1.t.a> aVarD = tVarK6.B4().d();
            gb1.t.a aVar = aVarD != null ? aVarD.f56599a : null;
            if (l1Var == null || !l1Var.isActive()) {
                tVarK6.B4().d();
                linkedHashMap.put(localDateJ6, ge1.b.T(v1.a(tVarK6), null, null, new x(tVarK6, localDateJ6, aVar, localDate, null), 3));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.pregnancy_title);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 24 && i15 == -1) {
            androidx.fragment.app.m activity = getActivity();
            PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
            if (pregnancyDetailsActivity != null) {
                pregnancyDetailsActivity.ua();
            }
        }
        if (i14 == 25 && i15 == -1) {
            androidx.fragment.app.m activity2 = getActivity();
            PregnancyDetailsActivity pregnancyDetailsActivity2 = activity2 instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity2 : null;
            if (pregnancyDetailsActivity2 != null) {
                pregnancyDetailsActivity2.ua();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        this.f40700l = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        return A6(viewGroup, layoutInflater, R.layout.fragment_pregnancy_details_four_weeks);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ViewPager viewPager = this.f40698j;
        if (viewPager != null) {
            viewPager.z(this.f40703o);
        } else {
            p005kotlin.jvm.internal.s.m("mViewPager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        M6();
        ViewPager viewPager = this.f40698j;
        if (viewPager != null) {
            viewPager.c(this.f40703o);
        } else {
            p005kotlin.jvm.internal.s.m("mViewPager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pregnancy_reports_linear_layout);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_reports_tab_layout);
        viewFindViewById2.getClass();
        this.f40697i = (TabLayout) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.pregnancy_reports_view_pager);
        viewFindViewById3.getClass();
        this.f40698j = (ViewPager) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.pregnancy_weeks_title);
        viewFindViewById4.getClass();
        this.f40699k = (TextView) viewFindViewById4;
        androidx.lifecycle.s0 s0Var = (androidx.lifecycle.s0) K6().f76720l.getValue();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(s0Var, viewLifecycleOwner, new e(new o0(this, 11)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/l$a;", "", "<init>", "()V", "", "START_DATE_KEY", "Ljava/lang/String;", "END_DATE_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
