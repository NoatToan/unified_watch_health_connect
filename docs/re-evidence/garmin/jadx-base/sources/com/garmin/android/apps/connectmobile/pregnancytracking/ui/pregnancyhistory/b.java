package com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory;

import android.content.Context;
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
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import db1.m;
import db1.u;
import e23.l;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import o13.h;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/pregnancyhistory/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f40906o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f40907p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40908a = new w1(s0.f105811a.b(kb1.e.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f40912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MultiLineImeEditText f40914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f40915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f40916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kb1.a f40917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d3 f40918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f40919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f40920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f40921n;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/pregnancyhistory/b$b", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0771b implements s {
        public C0771b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            menuItemFindItem.getClass();
            b.this.f40919l = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            b bVar = b.this;
            if (bVar.f40919l != null) {
                tb1.a.C3081a c3081a = tb1.a.f163743a;
                m mVar = bVar.f40920m;
                if (mVar == null) {
                    p005kotlin.jvm.internal.s.m("mInitialPregnancyDTO");
                    throw null;
                }
                String title = mVar.getTitle();
                m mVar2 = bVar.f40916i;
                if (mVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                String title2 = mVar2.getTitle();
                c3081a.getClass();
                boolean zB = tb1.a.C3081a.b(title, title2);
                m mVar3 = bVar.f40920m;
                if (mVar3 == null) {
                    p005kotlin.jvm.internal.s.m("mInitialPregnancyDTO");
                    throw null;
                }
                String notes = mVar3.getNotes();
                m mVar4 = bVar.f40916i;
                if (mVar4 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                boolean zB2 = tb1.a.C3081a.b(notes, mVar4.getNotes());
                String str = bVar.f40921n;
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar.f40910c;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                boolean zB3 = tb1.a.C3081a.b(str, gCMPregnancyTwoLineButton.getButtonValueLabel());
                MenuItem menuItem = bVar.f40919l;
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
            b bVar = b.this;
            if (!g22.e.e(bVar)) {
                return true;
            }
            a aVar = b.f40906o;
            bVar.u6();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40923a;

        public c(l lVar) {
            lVar.getClass();
            this.f40923a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40923a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40923a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40924a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40924a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40925a = aVar;
            this.f40926b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40925a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40926b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40927a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40927a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f40907p = gt2.b.f79005a.h("PreviousPregnancyDetailsFragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40917j = (kb1.a) context;
            this.f40918k = (d3) context;
        } catch (Exception unused) {
            f40907p.error("PreviousPregnancyDetailsFragment", context + " must implement IPregnancyHistoryHandler and ToolbarListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO", m.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_PREGNANCY_SNAPSHOT_DTO");
                if (!(parcelable2 instanceof m)) {
                    parcelable2 = null;
                }
                parcelable = (m) parcelable2;
            }
            m mVar = (m) parcelable;
            if (mVar != null) {
                u weightGoalUserInputs = mVar.getWeightGoalUserInputs();
                this.f40916i = m.b(mVar, weightGoalUserInputs != null ? u.b(weightGoalUserInputs) : null);
                u weightGoalUserInputs2 = mVar.getWeightGoalUserInputs();
                this.f40920m = m.b(mVar, weightGoalUserInputs2 != null ? u.b(weightGoalUserInputs2) : null);
                return;
            }
        }
        f40907p.error("PreviousPregnancyDetailsFragment", "PregnancySnapshotDTO is null developer fix this use case");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_previous_pregnancy_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f40916i;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        LocalDate deliveryDate = mVar.getDeliveryDate();
        if (deliveryDate == null) {
            m mVar2 = this.f40916i;
            if (mVar2 == null) {
                p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                throw null;
            }
            deliveryDate = mVar2.getEndDate();
            if (deliveryDate == null) {
                m mVar3 = this.f40916i;
                if (mVar3 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                deliveryDate = mVar3.getDueDate();
            }
        }
        m mVar4 = this.f40916i;
        if (mVar4 == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        String title = mVar4.getTitle();
        if (title == null) {
            title = getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
        }
        d3 d3Var = this.f40918k;
        if (d3Var != null) {
            d3Var.updateActionBar(title, 3);
        } else {
            p005kotlin.jvm.internal.s.m("mToolbarListener");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r2v42, types: [T, java.util.Calendar] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws Throwable {
        b bVar;
        Throwable th3;
        String str;
        int i14;
        DateTime dateTimeAtStartOfDay;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C0771b(), b0.b.RESUMED);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            View viewFindViewById = view2.findViewById(R.id.previous_pregnancy_name);
            viewFindViewById.getClass();
            this.f40909b = (GCMPregnancyTwoLineButton) viewFindViewById;
            androidx.fragment.app.m activity2 = getActivity();
            if (activity2 != null) {
                m mVar = this.f40916i;
                if (mVar == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate deliveryDate = mVar.getDeliveryDate();
                if (deliveryDate == null) {
                    m mVar2 = this.f40916i;
                    if (mVar2 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    deliveryDate = mVar2.getEndDate();
                    if (deliveryDate == null) {
                        m mVar3 = this.f40916i;
                        if (mVar3 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                            throw null;
                        }
                        deliveryDate = mVar3.getDueDate();
                    }
                }
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f40909b;
                if (gCMPregnancyTwoLineButton == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNameButton");
                    throw null;
                }
                m mVar4 = this.f40916i;
                if (mVar4 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                String title = mVar4.getTitle();
                if (title == null) {
                    title = activity2.getString(R.string.pregnancy_title) + StringUtils.SPACE + (deliveryDate != null ? Integer.valueOf(deliveryDate.getYear()) : null);
                }
                gCMPregnancyTwoLineButton.setButtonValueLabel(title);
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = this.f40909b;
                if (gCMPregnancyTwoLineButton2 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNameButton");
                    throw null;
                }
                gCMPregnancyTwoLineButton2.setOnClickListener(new kb1.h(this, activity2));
            }
            View viewFindViewById2 = view2.findViewById(R.id.previous_pregnancy_date);
            viewFindViewById2.getClass();
            this.f40910c = (GCMPregnancyTwoLineButton) viewFindViewById2;
            androidx.fragment.app.m activity3 = getActivity();
            if (activity3 != null) {
                m mVar5 = this.f40916i;
                if (mVar5 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate pregnancyCycleStart = mVar5.getPregnancyCycleStart();
                if (pregnancyCycleStart == null || (dateTimeAtStartOfDay = pregnancyCycleStart.toDateTimeAtStartOfDay()) == null) {
                    dateTimeAtStartOfDay = LocalDate.now().toDateTimeAtStartOfDay();
                }
                long millis = dateTimeAtStartOfDay.getMillis();
                DateTime dateTimePlusDays = dateTimeAtStartOfDay.plusDays(315);
                long millis2 = dateTimePlusDays.getMillis();
                DateTime dateTimeAtStartOfDay2 = LocalDate.now().toDateTimeAtStartOfDay();
                r0 r0Var = new r0();
                th3 = null;
                r0Var.f105810a = dateTimeAtStartOfDay2 != null ? dateTimeAtStartOfDay2.toCalendar(Locale.getDefault()) : 0;
                m0 m0Var = new m0();
                m0Var.f105804a = true;
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = this.f40910c;
                if (gCMPregnancyTwoLineButton3 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyDateButton");
                    throw null;
                }
                m mVar6 = this.f40916i;
                if (mVar6 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                gCMPregnancyTwoLineButton3.setButtonValueLabel(mVar6.getTitle());
                m mVar7 = this.f40916i;
                if (mVar7 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw null;
                }
                LocalDate deliveryDate2 = mVar7.getDeliveryDate();
                if (deliveryDate2 != null) {
                    m0Var.f105804a = true;
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton4 = this.f40910c;
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
                    m mVar8 = this.f40916i;
                    if (mVar8 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                        throw null;
                    }
                    LocalDate endDate = mVar8.getEndDate();
                    if (endDate != null) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton5 = this.f40910c;
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
                        m mVar9 = this.f40916i;
                        if (mVar9 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                            throw null;
                        }
                        LocalDate dueDate = mVar9.getDueDate();
                        if (dueDate != null) {
                            m0Var.f105804a = false;
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton6 = this.f40910c;
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
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton7 = this.f40910c;
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
                str = "mPregnancyDateButton";
                i14 = 0;
                bVar = this;
                p pVar = new p(activity3.getString(R.string.lbl_common_continue), new f71.b(activity3, millis, millis2, r0Var, this, m0Var, 2));
                p pVar2 = new p(activity3.getString(R.string.lbl_cancel), new kb0.f(11));
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton8 = bVar.f40910c;
                if (gCMPregnancyTwoLineButton8 == null) {
                    p005kotlin.jvm.internal.s.m(str);
                    throw null;
                }
                gCMPregnancyTwoLineButton8.setOnClickListener(new hb1.f(activity3, string, string2, pVar, pVar2, 1));
            } else {
                th3 = null;
                str = "mPregnancyDateButton";
                i14 = 0;
                bVar = this;
            }
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton9 = bVar.f40910c;
            if (gCMPregnancyTwoLineButton9 == null) {
                p005kotlin.jvm.internal.s.m(str);
                throw th3;
            }
            bVar.f40921n = gCMPregnancyTwoLineButton9.getButtonValueLabel();
            View viewFindViewById3 = view2.findViewById(R.id.previous_pregnancy_due_date);
            viewFindViewById3.getClass();
            bVar.f40911d = (GCMPregnancyTwoLineButton) viewFindViewById3;
            m mVar10 = bVar.f40916i;
            if (mVar10 == null) {
                p005kotlin.jvm.internal.s.m(r12);
                throw th3;
            }
            LocalDate dueDate2 = mVar10.getDueDate();
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton10 = bVar.f40911d;
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
            bVar.f40912e = viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.previous_pregnancy_weight);
            viewFindViewById5.getClass();
            bVar.f40913f = (GCMPregnancyTwoLineButton) viewFindViewById5;
            androidx.fragment.app.m activity4 = bVar.getActivity();
            if (activity4 != null) {
                m mVar11 = bVar.f40916i;
                if (mVar11 == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                    throw th3;
                }
                u weightGoalUserInputs = mVar11.getWeightGoalUserInputs();
                GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton11 = bVar.f40913f;
                if (weightGoalUserInputs != null) {
                    Double weightInGram = weightGoalUserInputs.getWeightInGram();
                    if (weightInGram != null) {
                        double dDoubleValue = weightInGram.doubleValue();
                        if (gCMPregnancyTwoLineButton11 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        tb1.e.a aVar = tb1.e.f163745a;
                        l3.f23124b.getClass();
                        double dP1 = l3.a.P1(dDoubleValue);
                        aVar.getClass();
                        gCMPregnancyTwoLineButton11.setButtonValueLabel(tb1.e.a.f(activity4, dP1));
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton12 = bVar.f40913f;
                        if (gCMPregnancyTwoLineButton12 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton12.setVisibility(i14);
                        View view3 = bVar.f40912e;
                        if (view3 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                            throw th3;
                        }
                        view3.setVisibility(8);
                    } else {
                        if (gCMPregnancyTwoLineButton11 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton11.setButtonValueLabel(activity4.getString(R.string.no_value));
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton13 = bVar.f40913f;
                        if (gCMPregnancyTwoLineButton13 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                            throw th3;
                        }
                        gCMPregnancyTwoLineButton13.setVisibility(8);
                        View view4 = bVar.f40912e;
                        if (view4 == null) {
                            p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                            throw th3;
                        }
                        view4.setVisibility(i14);
                    }
                } else {
                    if (gCMPregnancyTwoLineButton11 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                        throw th3;
                    }
                    gCMPregnancyTwoLineButton11.setButtonValueLabel(activity4.getString(R.string.no_value));
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton14 = bVar.f40913f;
                    if (gCMPregnancyTwoLineButton14 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyWeightButton");
                        throw th3;
                    }
                    gCMPregnancyTwoLineButton14.setVisibility(8);
                    View view5 = bVar.f40912e;
                    if (view5 == null) {
                        p005kotlin.jvm.internal.s.m("mPregnancyDueDateButtonDivider");
                        throw th3;
                    }
                    view5.setVisibility(i14);
                }
            }
            View viewFindViewById6 = view2.findViewById(R.id.pregnancy_notes_edit_text);
            viewFindViewById6.getClass();
            bVar.f40914g = (MultiLineImeEditText) viewFindViewById6;
            m mVar12 = bVar.f40916i;
            if (mVar12 == null) {
                p005kotlin.jvm.internal.s.m(r12);
                throw th3;
            }
            String notes = mVar12.getNotes();
            if (notes != null) {
                MultiLineImeEditText multiLineImeEditText = bVar.f40914g;
                if (multiLineImeEditText == null) {
                    p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
                    throw th3;
                }
                multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(notes));
            }
            MultiLineImeEditText multiLineImeEditText2 = bVar.f40914g;
            if (multiLineImeEditText2 == null) {
                p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
                throw th3;
            }
            multiLineImeEditText2.setTextUpdatedListener(new hy.d(bVar, 13));
            View viewFindViewById7 = view2.findViewById(R.id.delete_previous_record);
            viewFindViewById7.getClass();
            bVar.f40915h = (TextView) viewFindViewById7;
            androidx.fragment.app.m activity5 = bVar.getActivity();
            if (activity5 != null) {
                TextView textView = bVar.f40915h;
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mDeletePregnancyRecordButtonButton");
                    throw th3;
                }
                textView.setOnClickListener(new kb1.h(activity5, bVar));
            }
        } else {
            bVar = this;
        }
        ((kb1.e) bVar.f40908a.getValue()).f103822b.f(bVar.getViewLifecycleOwner(), new c(new iz1.f(bVar, 22)));
    }

    public final void u6() {
        m mVar = this.f40916i;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        LocalDate dueDate = mVar.getDueDate();
        if (dueDate != null) {
            kb1.e eVar = (kb1.e) this.f40908a.getValue();
            m mVar2 = this.f40916i;
            if (mVar2 != null) {
                ge1.b.T(v1.a(eVar), null, null, new kb1.f(mVar2, dueDate, eVar, null), 3);
            } else {
                p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/pregnancyhistory/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_DATE_LIMIT", "I", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
