package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyListActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import db1.m;
import db1.u;
import e23.l;
import ew1.h1;
import fw.p;
import h62.j;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import lc.u0;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import z6.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/editPregnancy/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0766a f40578o = new C0766a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f40579p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f40584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MultiLineImeEditText f40586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f40587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d3 f40588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f40589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f40590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f40591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f40592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f40593n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40594a;

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
            f40594a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/editPregnancy/a$c", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            menuItemFindItem.getClass();
            a.this.f40589j = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            a aVar = a.this;
            if (aVar.f40589j != null) {
                tb1.a.C3081a c3081a = tb1.a.f163743a;
                m mVar = aVar.f40590k;
                if (mVar == null) {
                    p005kotlin.jvm.internal.s.m("mInitialPregnancyDTO");
                    throw null;
                }
                String title = mVar.getTitle();
                m mVar2 = aVar.f40592m;
                if (mVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                String title2 = mVar2.getTitle();
                c3081a.getClass();
                boolean zB = tb1.a.C3081a.b(title, title2);
                m mVar3 = aVar.f40590k;
                if (mVar3 == null) {
                    p005kotlin.jvm.internal.s.m("mInitialPregnancyDTO");
                    throw null;
                }
                String notes = mVar3.getNotes();
                m mVar4 = aVar.f40592m;
                if (mVar4 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                boolean zB2 = tb1.a.C3081a.b(notes, mVar4.getNotes());
                String str = aVar.f40591l;
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = aVar.f40582c;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                boolean zB3 = tb1.a.C3081a.b(str, gCMPregnancyTwoLineButton.getButtonValueLabel());
                MenuItem menuItem = aVar.f40589j;
                if (menuItem != null) {
                    menuItem.setEnabled(zB || zB2 || zB3);
                } else {
                    p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                    throw null;
                }
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.save_menu_item) {
                return false;
            }
            a aVar = a.this;
            if (!g22.e.e(aVar)) {
                return true;
            }
            C0766a c0766a = a.f40578o;
            aVar.u6();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40596a;

        public d(l lVar) {
            lVar.getClass();
            this.f40596a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40596a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40596a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40597a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f40597a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f40597a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar) {
            super(0);
            this.f40598a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f40598a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f40599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(o13.l lVar) {
            super(0);
            this.f40599a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f40599a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, o13.l lVar) {
            super(0);
            this.f40600a = aVar;
            this.f40601b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40600a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40601b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment, o13.l lVar) {
            super(0);
            this.f40602a = fragment;
            this.f40603b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40603b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f40602a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f40579p = gt2.b.f79005a.h("EditPregnancyFragment");
    }

    public a() {
        o13.l lVarA = o13.m.a(o13.n.NONE, new f(new e(this)));
        this.f40580a = new w1(s0.f105811a.b(kb1.e.class), new g(lVarA), new i(this, lVarA), new h(null, lVarA));
        this.f40593n = o13.m.b(new j(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40588i = (d3) context;
        } catch (Exception unused) {
            f40579p.error("EditPregnancyFragment", context + " must implement and ToolbarListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("PREGNANCY_SNAPSHOT_DTO_KEY", m.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("PREGNANCY_SNAPSHOT_DTO_KEY");
                if (!(parcelable2 instanceof m)) {
                    parcelable2 = null;
                }
                parcelable = (m) parcelable2;
            }
            m mVar = (m) parcelable;
            if (mVar != null) {
                u weightGoalUserInputs = mVar.getWeightGoalUserInputs();
                this.f40592m = m.b(mVar, weightGoalUserInputs != null ? u.b(weightGoalUserInputs) : null);
                u weightGoalUserInputs2 = mVar.getWeightGoalUserInputs();
                this.f40590k = m.b(mVar, weightGoalUserInputs2 != null ? u.b(weightGoalUserInputs2) : null);
                return;
            }
        }
        f40579p.error("PreviousPregnancyDetailsFragment", "PregnancySnapshotDTO is null developer fix this use case");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_previous_pregnancy_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f40592m;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        LocalDate deliveryDate = mVar.getDeliveryDate();
        if (deliveryDate == null) {
            m mVar2 = this.f40592m;
            if (mVar2 == null) {
                p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                throw null;
            }
            deliveryDate = mVar2.getEndDate();
            if (deliveryDate == null) {
                m mVar3 = this.f40592m;
                if (mVar3 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                deliveryDate = mVar3.getDueDate();
            }
        }
        m mVar4 = this.f40592m;
        if (mVar4 == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        String title = mVar4.getTitle();
        if (title == null) {
            title = getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
        }
        d3 d3Var = this.f40588i;
        if (d3Var != null) {
            d3Var.updateActionBar(title, 3);
        } else {
            p005kotlin.jvm.internal.s.m("mToolbarListener");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r2v29, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r2v50, types: [T, java.util.Calendar] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws Throwable {
        final a aVar;
        Throwable th3;
        boolean zBooleanValue;
        DateTime dateTimeAtStartOfDay;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), b0.b.RESUMED);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            View viewFindViewById = view2.findViewById(R.id.previous_pregnancy_name);
            viewFindViewById.getClass();
            this.f40581b = (GCMPregnancyTwoLineButton) viewFindViewById;
            androidx.fragment.app.m activity2 = getActivity();
            if (activity2 != null) {
                m mVar = this.f40592m;
                if (mVar == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate deliveryDate = mVar.getDeliveryDate();
                if (deliveryDate == null) {
                    m mVar2 = this.f40592m;
                    if (mVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    deliveryDate = mVar2.getEndDate();
                    if (deliveryDate == null) {
                        m mVar3 = this.f40592m;
                        if (mVar3 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                            throw null;
                        }
                        deliveryDate = mVar3.getDueDate();
                    }
                }
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f40581b;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNameButton");
                    throw null;
                }
                m mVar4 = this.f40592m;
                if (mVar4 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                String title = mVar4.getTitle();
                if (title == null) {
                    title = activity2.getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(title);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = this.f40581b;
                if (gCMPregnancyTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNameButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton2.setOnClickListener(new cw2.b(23, activity2, this));
            }
            View viewFindViewById2 = view2.findViewById(R.id.previous_pregnancy_date);
            viewFindViewById2.getClass();
            this.f40582c = (GCMPregnancyTwoLineButton) viewFindViewById2;
            androidx.fragment.app.m activity3 = getActivity();
            if (activity3 != null) {
                m mVar5 = this.f40592m;
                if (mVar5 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate pregnancyCycleStart = mVar5.getPregnancyCycleStart();
                if (pregnancyCycleStart == null || (dateTimeAtStartOfDay = pregnancyCycleStart.toDateTimeAtStartOfDay()) == null) {
                    dateTimeAtStartOfDay = LocalDate.now().toDateTimeAtStartOfDay();
                }
                long millis = dateTimeAtStartOfDay.getMillis();
                DateTime dateTimeAtStartOfDay2 = LocalDate.now().toDateTimeAtStartOfDay();
                DateTime dateTimePlusDays = dateTimeAtStartOfDay.plusDays(315);
                if (dateTimePlusDays.isAfter(dateTimeAtStartOfDay2)) {
                    dateTimePlusDays = dateTimeAtStartOfDay2;
                }
                long millis2 = dateTimePlusDays.getMillis();
                r0 r0Var = new r0();
                th3 = null;
                r0Var.f105810a = dateTimeAtStartOfDay2 != null ? dateTimeAtStartOfDay2.toCalendar(Locale.getDefault()) : 0;
                m0 m0Var = new m0();
                m0Var.f105804a = true;
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = this.f40582c;
                if (gCMPregnancyTwoLineButton3 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                m mVar6 = this.f40592m;
                if (mVar6 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                gCMPregnancyTwoLineButton3.setButtonValueLabel(mVar6.getTitle());
                m mVar7 = this.f40592m;
                if (mVar7 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate deliveryDate2 = mVar7.getDeliveryDate();
                if (deliveryDate2 != null) {
                    m0Var.f105804a = true;
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton4 = this.f40582c;
                    if (gCMPregnancyTwoLineButton4 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                        throw null;
                    }
                    gCMPregnancyTwoLineButton4.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(deliveryDate2.toDate()));
                    DateTime dateTimeAtStartOfDay3 = deliveryDate2.toDateTimeAtStartOfDay();
                    if (dateTimeAtStartOfDay3.compareTo((ReadableInstant) dateTimePlusDays) < 0) {
                        r0Var.f105810a = dateTimeAtStartOfDay3.toCalendar(Locale.getDefault());
                    }
                } else {
                    m0Var.f105804a = false;
                    m mVar8 = this.f40592m;
                    if (mVar8 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    LocalDate endDate = mVar8.getEndDate();
                    if (endDate != null) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton5 = this.f40582c;
                        if (gCMPregnancyTwoLineButton5 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                            throw null;
                        }
                        gCMPregnancyTwoLineButton5.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(endDate.toDate()));
                        DateTime dateTimeAtStartOfDay4 = endDate.toDateTimeAtStartOfDay();
                        if (dateTimeAtStartOfDay4.compareTo((ReadableInstant) dateTimePlusDays) < 0) {
                            r0Var.f105810a = dateTimeAtStartOfDay4.toCalendar(Locale.getDefault());
                        }
                    } else {
                        m mVar9 = this.f40592m;
                        if (mVar9 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                            throw null;
                        }
                        LocalDate dueDate = mVar9.getDueDate();
                        if (dueDate != null) {
                            m0Var.f105804a = false;
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton6 = this.f40582c;
                            if (gCMPregnancyTwoLineButton6 == null) {
                                p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                                throw null;
                            }
                            gCMPregnancyTwoLineButton6.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(dueDate.toDate()));
                            DateTime dateTimeAtStartOfDay5 = dueDate.toDateTimeAtStartOfDay();
                            if (dateTimeAtStartOfDay5.compareTo((ReadableInstant) dateTimePlusDays) < 0) {
                                r0Var.f105810a = dateTimeAtStartOfDay5.toCalendar(Locale.getDefault());
                            }
                        }
                    }
                }
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton7 = this.f40582c;
                if (gCMPregnancyTwoLineButton7 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton7.setButtonTopLabel(activity3.getString(m0Var.f105804a ? R.string.pregnancy_delivery_date : R.string.pregnancy_end_date));
                String string = activity3.getString(m0Var.f105804a ? R.string.pregnancy_change_delivery_date_question : R.string.pregnancy_change_end_date_question);
                string.getClass();
                String string2 = activity3.getString(m0Var.f105804a ? R.string.pregnancy_change_delivery_date_affect : R.string.pregnancy_change_end_date_message);
                string2.getClass();
                Calendar calendar = (Calendar) r0Var.f105810a;
                if (calendar != null) {
                    Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
                    calendar.set(10, calendar2.get(10));
                    calendar.set(12, calendar2.get(12));
                    calendar.set(13, calendar2.get(13));
                    calendar.set(9, calendar2.get(9));
                }
                aVar = this;
                o13.p pVar = new o13.p(activity3.getString(R.string.lbl_common_continue), new f71.b(activity3, millis, millis2, r0Var, this, m0Var, 1));
                o13.p pVar2 = new o13.p(activity3.getString(R.string.lbl_cancel), new h51.a(18));
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton8 = aVar.f40582c;
                if (gCMPregnancyTwoLineButton8 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton8.setOnClickListener(new hb1.f(activity3, string, string2, pVar, pVar2, 0));
            } else {
                aVar = this;
                th3 = null;
            }
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton9 = aVar.f40582c;
            if (gCMPregnancyTwoLineButton9 == null) {
                p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                throw th3;
            }
            aVar.f40591l = gCMPregnancyTwoLineButton9.getButtonValueLabel();
            View viewFindViewById3 = view2.findViewById(R.id.previous_pregnancy_due_date);
            viewFindViewById3.getClass();
            aVar.f40583d = (GCMPregnancyTwoLineButton) viewFindViewById3;
            m mVar10 = aVar.f40592m;
            if (mVar10 == null) {
                p005kotlin.jvm.internal.s.m(r12);
                throw th3;
            }
            LocalDate dueDate2 = mVar10.getDueDate();
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton10 = aVar.f40583d;
            if (dueDate2 != null) {
                if (gCMPregnancyTwoLineButton10 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDueDateButton");
                    throw th3;
                }
                gCMPregnancyTwoLineButton10.setButtonValueLabel(DateFormat.getDateInstance(2, Locale.getDefault()).format(dueDate2.toDate()));
            } else {
                if (gCMPregnancyTwoLineButton10 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDueDateButton");
                    throw th3;
                }
                gCMPregnancyTwoLineButton10.setButtonValueLabel(activity.getString(R.string.no_value));
            }
            View viewFindViewById4 = view2.findViewById(R.id.previous_pregnancy_due_date_bottom_divider);
            viewFindViewById4.getClass();
            aVar.f40584e = viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.previous_pregnancy_weight);
            viewFindViewById5.getClass();
            aVar.f40585f = (GCMPregnancyTwoLineButton) viewFindViewById5;
            androidx.fragment.app.m activity4 = aVar.getActivity();
            if (activity4 == null) {
                zBooleanValue = false;
            } else {
                m mVar11 = aVar.f40592m;
                if (mVar11 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw th3;
                }
                u weightGoalUserInputs = mVar11.getWeightGoalUserInputs();
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton11 = aVar.f40585f;
                if (weightGoalUserInputs != null) {
                    Double weightInGram = weightGoalUserInputs.getWeightInGram();
                    if (weightInGram != null) {
                        double dDoubleValue = weightInGram.doubleValue();
                        if (gCMPregnancyTwoLineButton11 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        tb1.e.a aVar2 = tb1.e.f163745a;
                        l3.f23124b.getClass();
                        double dP1 = l3.a.P1(dDoubleValue);
                        aVar2.getClass();
                        gCMPregnancyTwoLineButton11.setButtonValueLabel(tb1.e.a.f(activity4, dP1));
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton12 = aVar.f40585f;
                        if (gCMPregnancyTwoLineButton12 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton12.setVisibility(0);
                        View view3 = aVar.f40584e;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                            throw th3;
                        }
                        view3.setVisibility(8);
                        zBooleanValue = false;
                    } else {
                        if (gCMPregnancyTwoLineButton11 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton11.setButtonValueLabel(activity4.getString(R.string.no_value));
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton13 = aVar.f40585f;
                        if (gCMPregnancyTwoLineButton13 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton13.setVisibility(8);
                        View view4 = aVar.f40584e;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                            throw th3;
                        }
                        zBooleanValue = false;
                        view4.setVisibility(0);
                    }
                } else {
                    if (gCMPregnancyTwoLineButton11 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                        throw th3;
                    }
                    gCMPregnancyTwoLineButton11.setButtonValueLabel(activity4.getString(R.string.no_value));
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton14 = aVar.f40585f;
                    if (gCMPregnancyTwoLineButton14 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                        throw th3;
                    }
                    gCMPregnancyTwoLineButton14.setVisibility(8);
                    View view5 = aVar.f40584e;
                    if (view5 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                        throw th3;
                    }
                    zBooleanValue = false;
                    view5.setVisibility(0);
                }
            }
            View viewFindViewById6 = view2.findViewById(R.id.pregnancy_notes_edit_text);
            viewFindViewById6.getClass();
            aVar.f40586g = (MultiLineImeEditText) viewFindViewById6;
            m mVar12 = aVar.f40592m;
            if (mVar12 == null) {
                p005kotlin.jvm.internal.s.m(r12);
                throw th3;
            }
            String notes = mVar12.getNotes();
            if (notes != null) {
                MultiLineImeEditText multiLineImeEditText = aVar.f40586g;
                if (multiLineImeEditText == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
                    throw th3;
                }
                multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(notes));
            }
            MultiLineImeEditText multiLineImeEditText2 = aVar.f40586g;
            if (multiLineImeEditText2 == null) {
                p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
                throw th3;
            }
            multiLineImeEditText2.setTextUpdatedListener(new gw.j(aVar, 3));
            View viewFindViewById7 = view2.findViewById(R.id.delete_previous_record);
            viewFindViewById7.getClass();
            aVar.f40587h = (TextView) viewFindViewById7;
            androidx.fragment.app.m activity5 = aVar.getActivity();
            if (activity5 != null) {
                Boolean bool = (Boolean) aVar.f40593n.getValue();
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                TextView textView = aVar.f40587h;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mDeletePregnancyRecordButtonButton");
                    throw th3;
                }
                textView.setOnClickListener(new hb1.c(activity5, zBooleanValue, aVar));
            }
        } else {
            aVar = this;
        }
        w1 w1Var = aVar.f40580a;
        final int i14 = 0;
        ((kb1.e) w1Var.getValue()).f103822b.f(aVar.getViewLifecycleOwner(), new d(new l(aVar) { // from class: hb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a f82763b;

            {
                this.f82763b = aVar;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                int i16 = 2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar3 = this.f82763b;
                switch (i15) {
                    case 0:
                        cx0.a aVar4 = (cx0.a) obj;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                        aVar4.getClass();
                        g22.e.f(aVar3);
                        if (aVar4.f56599a != 0) {
                            PregnancyListActivity.a aVar5 = PregnancyListActivity.f40524f;
                            androidx.fragment.app.m mVarRequireActivity = aVar3.requireActivity();
                            tb1.e.f163745a.getClass();
                            PregnancyListActivity.a.b(aVar5, mVarRequireActivity, tb1.e.a.h());
                            androidx.fragment.app.m activity6 = aVar3.getActivity();
                            if (activity6 != null) {
                                activity6.finish();
                            }
                        } else if (aVar4.f56602d) {
                            PregnancyListActivity.a aVar6 = PregnancyListActivity.f40524f;
                            androidx.fragment.app.m mVarRequireActivity2 = aVar3.requireActivity();
                            tb1.e.f163745a.getClass();
                            PregnancyListActivity.a.b(aVar6, mVarRequireActivity2, tb1.e.a.h());
                            androidx.fragment.app.m activity7 = aVar3.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                            }
                        } else {
                            Integer num = aVar4.f56601c;
                            if (num != null && num.intValue() == 409) {
                                androidx.appcompat.app.e.a aVar7 = new androidx.appcompat.app.e.a(aVar3.requireContext());
                                aVar7.setTitle(R.string.pregnancy_error_saving_title);
                                aVar7.setMessage(aVar3.getString(R.string.pregnancy_error_saving_message));
                                aVar7.setPositiveButton(R.string.lbl_ok, new h1(aVar3, 13));
                                androidx.appcompat.app.e eVarCreate = aVar7.create();
                                eVarCreate.getClass();
                                eVarCreate.show();
                            } else {
                                o13.p pVar3 = new o13.p(aVar3.getString(R.string.lbl_retry), new b(aVar3, i16));
                                o13.p pVar4 = new o13.p(aVar3.getString(R.string.lbl_cancel), new h51.a(19));
                                c22.f fVar = c22.f.f23050a;
                                Context contextRequireContext = aVar3.requireContext();
                                contextRequireContext.getClass();
                                fVar.getClass();
                                c22.f.a(contextRequireContext, R.string.pregnancy_something_went_wrong, R.string.pregnancy_save_again, pVar3, pVar4).show();
                            }
                            aVar4.f56602d = true;
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar13 = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                        int i17 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.b.f40594a[mVar13.f73769b.ordinal()];
                        if (i17 != 1) {
                            int i18 = 0;
                            if (i17 == 2) {
                                g22.e.f(aVar3);
                                Boolean bool2 = (Boolean) aVar3.f40593n.getValue();
                                if (bool2 != null ? bool2.booleanValue() : false) {
                                    f12.l.f68084a.getClass();
                                    f12.l lVarA = f12.l.a.a();
                                    tb1.e.f163745a.getClass();
                                    if (tb1.e.a.h()) {
                                        cb1.a.C0408a c0408a = cb1.a.f26640a;
                                        Context contextRequireContext2 = aVar3.requireContext();
                                        contextRequireContext2.getClass();
                                        c0408a.getClass();
                                        cb1.a.C0408a.b(contextRequireContext2);
                                        lVarA.T3(true);
                                    } else {
                                        lVarA.T3(true);
                                        lVarA.P1(false);
                                        lVarA.a2(false);
                                        Context contextRequireContext3 = aVar3.requireContext();
                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                        Intent intent = new Intent(contextRequireContext3, (Class<?>) DashboardActivity.class);
                                        intent.addFlags(335544320);
                                        aVar3.startActivity(intent);
                                    }
                                } else {
                                    Context contextRequireContext4 = aVar3.requireContext();
                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                    Intent intent2 = new Intent(contextRequireContext4, (Class<?>) DashboardActivity.class);
                                    intent2.addFlags(67108864);
                                    h0 h0VarE = h0.e(aVar3.requireContext());
                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                    arrayList.add(intent2);
                                    PregnancyListActivity.a aVar8 = PregnancyListActivity.f40524f;
                                    androidx.fragment.app.m mVarRequireActivity3 = aVar3.requireActivity();
                                    tb1.e.f163745a.getClass();
                                    boolean zH = tb1.e.a.h();
                                    aVar8.getClass();
                                    Intent intent3 = new Intent(mVarRequireActivity3, (Class<?>) PregnancyListActivity.class);
                                    intent3.putExtra("GCM_extra_top_navigation", zH);
                                    if (zH) {
                                        intent3.addFlags(335544320);
                                    }
                                    arrayList.add(intent3);
                                    h0VarE.g();
                                }
                            } else {
                                if (i17 != 3) {
                                    u0.r();
                                    return null;
                                }
                                g22.e.f(aVar3);
                                g22.e.a(aVar3, mVar13.f73771d);
                                o13.p pVar5 = new o13.p(aVar3.getString(R.string.lbl_retry), new b(aVar3, i18));
                                o13.p pVar6 = new o13.p(aVar3.getString(R.string.lbl_cancel), new h51.a(16));
                                c22.f fVar2 = c22.f.f23050a;
                                androidx.fragment.app.m mVarRequireActivity4 = aVar3.requireActivity();
                                mVarRequireActivity4.getClass();
                                fVar2.getClass();
                                c22.f.a(mVarRequireActivity4, R.string.pregnancy_unable_to_delete_data, R.string.pregnancy_something_went_wrong_delete_again, pVar5, pVar6).show();
                            }
                        } else {
                            g22.e.l(aVar3);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        ((kb1.e) w1Var.getValue()).f103823c.f(aVar.getViewLifecycleOwner(), new d(new l(aVar) { // from class: hb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a f82763b;

            {
                this.f82763b = aVar;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                int i17 = 2;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a aVar3 = this.f82763b;
                switch (i16) {
                    case 0:
                        cx0.a aVar4 = (cx0.a) obj;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                        aVar4.getClass();
                        g22.e.f(aVar3);
                        if (aVar4.f56599a != 0) {
                            PregnancyListActivity.a aVar5 = PregnancyListActivity.f40524f;
                            androidx.fragment.app.m mVarRequireActivity = aVar3.requireActivity();
                            tb1.e.f163745a.getClass();
                            PregnancyListActivity.a.b(aVar5, mVarRequireActivity, tb1.e.a.h());
                            androidx.fragment.app.m activity6 = aVar3.getActivity();
                            if (activity6 != null) {
                                activity6.finish();
                            }
                        } else if (aVar4.f56602d) {
                            PregnancyListActivity.a aVar6 = PregnancyListActivity.f40524f;
                            androidx.fragment.app.m mVarRequireActivity2 = aVar3.requireActivity();
                            tb1.e.f163745a.getClass();
                            PregnancyListActivity.a.b(aVar6, mVarRequireActivity2, tb1.e.a.h());
                            androidx.fragment.app.m activity7 = aVar3.getActivity();
                            if (activity7 != null) {
                                activity7.finish();
                            }
                        } else {
                            Integer num = aVar4.f56601c;
                            if (num != null && num.intValue() == 409) {
                                androidx.appcompat.app.e.a aVar7 = new androidx.appcompat.app.e.a(aVar3.requireContext());
                                aVar7.setTitle(R.string.pregnancy_error_saving_title);
                                aVar7.setMessage(aVar3.getString(R.string.pregnancy_error_saving_message));
                                aVar7.setPositiveButton(R.string.lbl_ok, new h1(aVar3, 13));
                                androidx.appcompat.app.e eVarCreate = aVar7.create();
                                eVarCreate.getClass();
                                eVarCreate.show();
                            } else {
                                o13.p pVar3 = new o13.p(aVar3.getString(R.string.lbl_retry), new b(aVar3, i17));
                                o13.p pVar4 = new o13.p(aVar3.getString(R.string.lbl_cancel), new h51.a(19));
                                c22.f fVar = c22.f.f23050a;
                                Context contextRequireContext = aVar3.requireContext();
                                contextRequireContext.getClass();
                                fVar.getClass();
                                c22.f.a(contextRequireContext, R.string.pregnancy_something_went_wrong, R.string.pregnancy_save_again, pVar3, pVar4).show();
                            }
                            aVar4.f56602d = true;
                        }
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar13 = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.C0766a c0766a2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.f40578o;
                        int i18 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a.b.f40594a[mVar13.f73769b.ordinal()];
                        if (i18 != 1) {
                            int i19 = 0;
                            if (i18 == 2) {
                                g22.e.f(aVar3);
                                Boolean bool2 = (Boolean) aVar3.f40593n.getValue();
                                if (bool2 != null ? bool2.booleanValue() : false) {
                                    f12.l.f68084a.getClass();
                                    f12.l lVarA = f12.l.a.a();
                                    tb1.e.f163745a.getClass();
                                    if (tb1.e.a.h()) {
                                        cb1.a.C0408a c0408a = cb1.a.f26640a;
                                        Context contextRequireContext2 = aVar3.requireContext();
                                        contextRequireContext2.getClass();
                                        c0408a.getClass();
                                        cb1.a.C0408a.b(contextRequireContext2);
                                        lVarA.T3(true);
                                    } else {
                                        lVarA.T3(true);
                                        lVarA.P1(false);
                                        lVarA.a2(false);
                                        Context contextRequireContext3 = aVar3.requireContext();
                                        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                        Intent intent = new Intent(contextRequireContext3, (Class<?>) DashboardActivity.class);
                                        intent.addFlags(335544320);
                                        aVar3.startActivity(intent);
                                    }
                                } else {
                                    Context contextRequireContext4 = aVar3.requireContext();
                                    com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
                                    Intent intent2 = new Intent(contextRequireContext4, (Class<?>) DashboardActivity.class);
                                    intent2.addFlags(67108864);
                                    h0 h0VarE = h0.e(aVar3.requireContext());
                                    ArrayList<Intent> arrayList = h0VarE.f202637a;
                                    arrayList.add(intent2);
                                    PregnancyListActivity.a aVar8 = PregnancyListActivity.f40524f;
                                    androidx.fragment.app.m mVarRequireActivity3 = aVar3.requireActivity();
                                    tb1.e.f163745a.getClass();
                                    boolean zH = tb1.e.a.h();
                                    aVar8.getClass();
                                    Intent intent3 = new Intent(mVarRequireActivity3, (Class<?>) PregnancyListActivity.class);
                                    intent3.putExtra("GCM_extra_top_navigation", zH);
                                    if (zH) {
                                        intent3.addFlags(335544320);
                                    }
                                    arrayList.add(intent3);
                                    h0VarE.g();
                                }
                            } else {
                                if (i18 != 3) {
                                    u0.r();
                                    return null;
                                }
                                g22.e.f(aVar3);
                                g22.e.a(aVar3, mVar13.f73771d);
                                o13.p pVar5 = new o13.p(aVar3.getString(R.string.lbl_retry), new b(aVar3, i19));
                                o13.p pVar6 = new o13.p(aVar3.getString(R.string.lbl_cancel), new h51.a(16));
                                c22.f fVar2 = c22.f.f23050a;
                                androidx.fragment.app.m mVarRequireActivity4 = aVar3.requireActivity();
                                mVarRequireActivity4.getClass();
                                fVar2.getClass();
                                c22.f.a(mVarRequireActivity4, R.string.pregnancy_unable_to_delete_data, R.string.pregnancy_something_went_wrong_delete_again, pVar5, pVar6).show();
                            }
                        } else {
                            g22.e.l(aVar3);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    public final void u6() {
        m mVar = this.f40592m;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        LocalDate originalDueDate = mVar.getOriginalDueDate();
        if (originalDueDate != null) {
            kb1.e eVar = (kb1.e) this.f40580a.getValue();
            m mVar2 = this.f40592m;
            if (mVar2 != null) {
                ge1.b.T(v1.a(eVar), null, null, new kb1.f(mVar2, originalDueDate, eVar, null), 3);
            } else {
                p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.editPregnancy.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/editPregnancy/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_DATE_LIMIT", "I", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "PREGNANCY_SNAPSHOT_DTO_KEY", "IS_LAST_PREGNANCY_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0766a {
        public /* synthetic */ C0766a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0766a() {
        }
    }
}
