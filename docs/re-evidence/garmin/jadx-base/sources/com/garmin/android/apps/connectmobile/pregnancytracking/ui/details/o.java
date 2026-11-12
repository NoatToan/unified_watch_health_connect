package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.google.android.flexbox.FlexboxLayoutManager;
import fb1.d0;
import fb1.k0;
import fb1.p0;
import hx0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/o;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends Fragment implements q.b {
    public static final a E = new a(null);
    public static final Logger F;
    public final o13.t A;
    public final o13.t B;
    public final o13.t C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f40751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f40752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f40753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f40754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f40755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MultiLineImeEditText f40756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f40757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f40758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f40759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f40760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f40761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f40762n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f40763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f40764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f40765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f40766r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f40767t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RecyclerView f40768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f40769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f40770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ww0.c f40771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o13.t f40772z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40749a = o13.m.a(o13.n.NONE, new f(this, null, new e(this), null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f40750b = new w1(s0.f105811a.b(p0.class), new g(this), new i(this), new h(null, this));
    public final o13.t D = o13.m.b(new d0(3));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40773a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40773a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/o$c", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocalDate f40774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f40775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f40776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f40777d;

        public c(LocalDate localDate, Context context, ArrayList<String> arrayList, o oVar) {
            this.f40774a = localDate;
            this.f40775b = context;
            this.f40776c = arrayList;
            this.f40777d = oVar;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40778a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f40778a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40778a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40778a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40779a;

        public e(Fragment fragment) {
            this.f40779a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f40779a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f40784e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f40780a = fragment;
            this.f40781b = qualifier;
            this.f40782c = aVar;
            this.f40783d = aVar2;
            this.f40784e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40782c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f40780a;
            e23.a aVar = this.f40783d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f40781b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f40784e, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f40785a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40785a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40786a = aVar;
            this.f40787b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40786a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40787b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f40788a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40788a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        F = gt2.b.f79005a.h("PregnancyDetailsLoggingFragment");
    }

    public o() {
        final int i14 = 0;
        this.f40772z = o13.m.b(new e23.a(this) { // from class: fb1.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70250b;

            {
                this.f70250b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70250b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Bundle arguments = oVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("EXTRA_DATE", LocalDate.class);
                        } else {
                            Object serializable2 = arguments.getSerializable("EXTRA_DATE");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context = oVar.getContext();
                        if (context != null) {
                            return new hx0.r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
        final int i15 = 1;
        this.A = o13.m.b(new e23.a(this) { // from class: fb1.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70250b;

            {
                this.f70250b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70250b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Bundle arguments = oVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("EXTRA_DATE", LocalDate.class);
                        } else {
                            Object serializable2 = arguments.getSerializable("EXTRA_DATE");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context = oVar.getContext();
                        if (context != null) {
                            return new hx0.r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
        final int i16 = 2;
        this.B = o13.m.b(new e23.a(this) { // from class: fb1.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70250b;

            {
                this.f70250b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70250b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Bundle arguments = oVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("EXTRA_DATE", LocalDate.class);
                        } else {
                            Object serializable2 = arguments.getSerializable("EXTRA_DATE");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context = oVar.getContext();
                        if (context != null) {
                            return new hx0.r(context);
                        }
                        vb.h.z("Can't generate icon adapter without a valid context.");
                        return null;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            return new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e(context2);
                        }
                        vb.h.z("Can't generate chip adapter without a valid context.");
                        return null;
                }
            }
        });
        this.C = o13.m.b(new d0(i16));
    }

    public final void A6() {
        ww0.b bVarA;
        Context context = getContext();
        if (context != null) {
            LocalDate localDateU6 = u6();
            if (localDateU6 == null) {
                localDateU6 = new LocalDate();
            }
            LocalDate localDate = localDateU6;
            ww0.c cVar = this.f40771y;
            if (cVar == null || (bVarA = cVar.getLog()) == null) {
                ww0.b.f187523n.getClass();
                bVarA = ww0.b.a.a(localDate);
            }
            ww0.b bVar = bVarA;
            ew2.c cVar2 = new ew2.c(this, localDate, context, bVar, 2);
            List<db1.a> listD = bVar.d();
            List listZ = listD != null ? h0.Z(listD) : j0.f134944a;
            if (!h0.L(listZ)) {
                View view2 = this.f40770x;
                if (view2 == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDisplayView");
                    throw null;
                }
                view2.setVisibility(8);
                View view3 = this.f40769w;
                if (view3 == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementOption");
                    throw null;
                }
                view3.setOnClickListener(cVar2);
                View view4 = this.f40769w;
                if (view4 != null) {
                    view4.setVisibility(i52.a.k() ? 0 : 8);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mBabyMovementOption");
                    throw null;
                }
            }
            View view5 = this.f40769w;
            if (view5 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementOption");
                throw null;
            }
            view5.setVisibility(8);
            View view6 = this.f40770x;
            if (view6 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDisplayView");
                throw null;
            }
            view6.setVisibility(0);
            fb1.a aVar = new fb1.a();
            View view7 = this.f40770x;
            if (view7 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDisplayView");
                throw null;
            }
            RecyclerView recyclerView = (RecyclerView) view7.findViewById(R.id.baby_movement_recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            recyclerView.setAdapter(aVar);
            aVar.f70203c = new p(this, localDate, context, bVar, listZ);
            ArrayList arrayList = aVar.f70202b;
            arrayList.clear();
            if (h0.L(listZ)) {
                arrayList.addAll(h0.N0(listZ, new fb1.b()));
            }
            aVar.notifyDataSetChanged();
            View view8 = this.f40770x;
            if (view8 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDisplayView");
                throw null;
            }
            ((TextView) view8.findViewById(R.id.baby_movement_display_add)).setOnClickListener(cVar2);
            View view9 = this.f40770x;
            if (view9 != null) {
                ((TextView) view9.findViewById(R.id.baby_movement_display_add)).setVisibility(i52.a.k() ? 0 : 8);
            } else {
                p005kotlin.jvm.internal.s.m("mBabyMovementDisplayView");
                throw null;
            }
        }
    }

    public final void C6() {
        ww0.b log;
        String notes;
        ww0.c cVar = this.f40771y;
        if (cVar == null || (log = cVar.getLog()) == null || (notes = log.getNotes()) == null) {
            View view2 = this.f40751c;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mAddNotesOption");
                throw null;
            }
            v22.e.q(view2);
            View view3 = this.f40755g;
            if (view3 != null) {
                v22.e.j(view3);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mNotesLayout");
                throw null;
            }
        }
        MultiLineImeEditText multiLineImeEditText = this.f40756h;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(notes));
        View view4 = this.f40755g;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mNotesLayout");
            throw null;
        }
        v22.e.q(view4);
        View view5 = this.f40751c;
        if (view5 != null) {
            v22.e.j(view5);
        } else {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.b
    public final void M4(ww0.c cVar) {
        this.f40771y = cVar;
        y6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 24 && i15 == -1) {
            v6().D4(u6(), this.f40771y);
            return;
        }
        if (i14 == 25 && i15 == -1) {
            v6().D4(u6(), this.f40771y);
            return;
        }
        if (i14 == 201) {
            v6().D4(u6(), this.f40771y);
        } else if (i14 == 26 && i15 == -1) {
            v6().D4(u6(), this.f40771y);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_details_logging, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        final m0 m0Var = new m0();
        final m0 m0Var2 = new m0();
        LocalDate localDateU6 = u6();
        if (localDateU6 != null) {
            hx0.s sVarV6 = v6();
            sVarV6.getClass();
            y0 y0Var = new y0();
            y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(sVarV6), null, null, new v(localDateU6, y0Var, null), 3);
            final int i14 = 0;
            dh.b.L(y0Var, this, new d(new e23.l(this) { // from class: fb1.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70262b;

                {
                    this.f70262b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i15 = i14;
                    p005kotlin.jvm.internal.m0 m0Var3 = m0Var2;
                    p005kotlin.jvm.internal.m0 m0Var4 = m0Var;
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70262b;
                    switch (i15) {
                        case 0:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                            mVar.getClass();
                            int i16 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.b.f40773a[mVar.f73769b.ordinal()];
                            if (i16 == 1) {
                                g22.e.l(oVar);
                                m0Var4.f105804a = true;
                            } else if (i16 != 2) {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                            } else {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                                oVar.w6((db1.s) mVar.f73770c);
                            }
                            break;
                        default:
                            cx0.a aVar2 = (cx0.a) obj;
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                            if (aVar2 == null) {
                                g22.e.l(oVar);
                                m0Var4.f105804a = true;
                            } else {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                                T t7 = aVar2.f56599a;
                                if (t7 != 0) {
                                    oVar.f40771y = (ww0.c) t7;
                                    oVar.y6();
                                }
                                if (!aVar2.f56602d) {
                                    g22.e.d(oVar, cx0.b.a(aVar2.f56600b));
                                    aVar2.f56602d = true;
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
            final int i15 = 1;
            dh.b.L(v6().A4(localDateU6), this, new d(new e23.l(this) { // from class: fb1.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70262b;

                {
                    this.f70262b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    p005kotlin.jvm.internal.m0 m0Var3 = m0Var;
                    p005kotlin.jvm.internal.m0 m0Var4 = m0Var2;
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70262b;
                    switch (i16) {
                        case 0:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                            mVar.getClass();
                            int i17 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.b.f40773a[mVar.f73769b.ordinal()];
                            if (i17 == 1) {
                                g22.e.l(oVar);
                                m0Var4.f105804a = true;
                            } else if (i17 != 2) {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                            } else {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                                oVar.w6((db1.s) mVar.f73770c);
                            }
                            break;
                        default:
                            cx0.a aVar2 = (cx0.a) obj;
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                            if (aVar2 == null) {
                                g22.e.l(oVar);
                                m0Var4.f105804a = true;
                            } else {
                                m0Var4.f105804a = false;
                                if (!m0Var3.f105804a) {
                                    g22.e.f(oVar);
                                }
                                T t7 = aVar2.f56599a;
                                if (t7 != 0) {
                                    oVar.f40771y = (ww0.c) t7;
                                    oVar.y6();
                                }
                                if (!aVar2.f56602d) {
                                    g22.e.d(oVar, cx0.b.a(aVar2.f56600b));
                                    aVar2.f56602d = true;
                                }
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ww0.c cVar;
        int i14;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_PREGNANCY_DETAILS", ww0.c.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_PREGNANCY_DETAILS");
                if (!(parcelable2 instanceof ww0.c)) {
                    parcelable2 = null;
                }
                parcelable = (ww0.c) parcelable2;
            }
            cVar = (ww0.c) parcelable;
        } else {
            cVar = null;
        }
        this.f40771y = cVar;
        View viewFindViewById = view2.findViewById(R.id.logging_add_notes);
        viewFindViewById.getClass();
        this.f40751c = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.logging_symptoms);
        viewFindViewById2.getClass();
        this.f40752d = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.log_delivery_date);
        viewFindViewById3.getClass();
        this.f40753e = viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.logging_tracking_options);
        viewFindViewById4.getClass();
        this.f40754f = (Button) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.logging_notes_layout);
        viewFindViewById5.getClass();
        this.f40755g = viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.logging_notes_edit_text);
        viewFindViewById6.getClass();
        this.f40756h = (MultiLineImeEditText) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.logging_display_symptoms_list);
        viewFindViewById7.getClass();
        this.f40758j = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.logging_display_symptoms_flexbox);
        viewFindViewById8.getClass();
        this.f40759k = (RecyclerView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.logging_edit_symptoms);
        viewFindViewById9.getClass();
        this.f40757i = viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.logging_edit_symptoms_button);
        viewFindViewById10.getClass();
        this.f40760l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.logging_todays_symptoms_label);
        viewFindViewById11.getClass();
        this.f40761m = (TextView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.logging_blood_glucose);
        viewFindViewById12.getClass();
        this.f40762n = viewFindViewById12;
        ((TextView) viewFindViewById12.findViewById(R.id.left_option_label)).setText(getString(R.string.pregnancy_add_blood_glucose));
        View viewFindViewById13 = view2.findViewById(R.id.blood_glucose_display_view);
        viewFindViewById13.getClass();
        this.f40764p = viewFindViewById13;
        View viewFindViewById14 = viewFindViewById13.findViewById(R.id.blood_glucose_reading_view);
        viewFindViewById14.getClass();
        this.f40765q = viewFindViewById14;
        View view3 = this.f40764p;
        if (view3 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
            throw null;
        }
        View viewFindViewById15 = view3.findViewById(R.id.blood_glucose_readings_label);
        viewFindViewById15.getClass();
        this.f40766r = (TextView) viewFindViewById15;
        View view4 = this.f40764p;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
            throw null;
        }
        View viewFindViewById16 = view4.findViewById(R.id.blood_glucose_readings_arrow);
        viewFindViewById16.getClass();
        this.f40767t = (ImageView) viewFindViewById16;
        View view5 = this.f40764p;
        if (view5 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
            throw null;
        }
        View viewFindViewById17 = view5.findViewById(R.id.blood_glucose_recycler_view);
        viewFindViewById17.getClass();
        this.f40768v = (RecyclerView) viewFindViewById17;
        View view6 = this.f40764p;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
            throw null;
        }
        View viewFindViewById18 = view6.findViewById(R.id.blood_glucose_display_add);
        viewFindViewById18.getClass();
        this.f40763o = (TextView) viewFindViewById18;
        RecyclerView recyclerView = this.f40768v;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
            throw null;
        }
        recyclerView.setVisibility(8);
        View view7 = this.f40751c;
        if (view7 == null) {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
        ((TextView) view7.findViewById(R.id.left_option_label)).setText(getString(R.string.mct_add_notes));
        View view8 = this.f40752d;
        if (view8 == null) {
            p005kotlin.jvm.internal.s.m("mSymptomsOption");
            throw null;
        }
        ((TextView) view8.findViewById(R.id.left_option_label)).setText(getString(R.string.mct_add_symptoms));
        View view9 = this.f40753e;
        if (view9 == null) {
            p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
            throw null;
        }
        ((TextView) view9.findViewById(R.id.left_option_label)).setText(getString(R.string.pregnancy_log_delivery_date));
        View viewFindViewById19 = view2.findViewById(R.id.logging_baby_movement);
        viewFindViewById19.getClass();
        this.f40769w = viewFindViewById19;
        ((TextView) viewFindViewById19.findViewById(R.id.left_option_label)).setText(getString(R.string.pregnancy_add_baby_movement));
        View viewFindViewById20 = view2.findViewById(R.id.baby_movement_display_view);
        viewFindViewById20.getClass();
        this.f40770x = viewFindViewById20;
        mx0.d dVar = new mx0.d(getResources().getDimension(R.dimen.spacing_normal));
        RecyclerView recyclerView2 = this.f40758j;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("mListRecyclerView");
            throw null;
        }
        mx0.d.e(dVar, recyclerView2, 26);
        Context context = recyclerView2.getContext();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        float fA = c22.b.a(contextRequireContext);
        if (fA >= 1.5f) {
            i14 = 3;
        } else {
            i14 = fA > 1.0f ? 4 : 5;
        }
        recyclerView2.setLayoutManager(new GridLayoutManager(context, i14));
        recyclerView2.setAdapter((hx0.r) this.A.getValue());
        RecyclerView recyclerView3 = this.f40759k;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("mFlexRecyclerView");
            throw null;
        }
        mx0.d.e(dVar, recyclerView3, 28);
        recyclerView3.setLayoutManager(new FlexboxLayoutManager(recyclerView3.getContext()));
        recyclerView3.setAdapter((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e) this.B.getValue());
        View view10 = this.f40751c;
        if (view10 == null) {
            p005kotlin.jvm.internal.s.m("mAddNotesOption");
            throw null;
        }
        final int i15 = 4;
        view10.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view11) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar2, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar3 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar3.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar6 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar6.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar8 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar8, mVarRequireActivity2, 101);
                            return;
                        }
                        View view12 = oVar.f40751c;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view12.setVisibility(8);
                        View view13 = oVar.f40755g;
                        if (view13 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view13.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText = oVar.f40756h;
                        if (multiLineImeEditText == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText2, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar10 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar10.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        View view11 = this.f40752d;
        if (view11 == null) {
            p005kotlin.jvm.internal.s.m("mSymptomsOption");
            throw null;
        }
        final int i16 = 5;
        view11.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view12) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar2, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar3 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar3.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar6 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar6.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar8 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar8, mVarRequireActivity2, 101);
                            return;
                        }
                        View view13 = oVar.f40751c;
                        if (view13 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view13.setVisibility(8);
                        View view14 = oVar.f40755g;
                        if (view14 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view14.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText = oVar.f40756h;
                        if (multiLineImeEditText == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText2, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar10 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar10.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        View view12 = this.f40753e;
        if (view12 == null) {
            p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
            throw null;
        }
        final int i17 = 0;
        view12.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view13) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar2, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar3 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar3.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar6 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar6.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar8 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar8, mVarRequireActivity2, 101);
                            return;
                        }
                        View view14 = oVar.f40751c;
                        if (view14 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view14.setVisibility(8);
                        View view15 = oVar.f40755g;
                        if (view15 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view15.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText = oVar.f40756h;
                        if (multiLineImeEditText == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText2, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar10 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar10.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        Button button = this.f40754f;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("mTrackingOptions");
            throw null;
        }
        tb1.e.a aVar = tb1.e.f163745a;
        androidx.fragment.app.m activity = getActivity();
        PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
        db1.m mVarTa = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
        aVar.getClass();
        button.setVisibility(tb1.e.a.g(mVarTa) ? 8 : 0);
        Button button2 = this.f40754f;
        if (button2 == null) {
            p005kotlin.jvm.internal.s.m("mTrackingOptions");
            throw null;
        }
        final int i18 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view13) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar3 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar3, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar4 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar4.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar7 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar7.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar9 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar9, mVarRequireActivity2, 101);
                            return;
                        }
                        View view14 = oVar.f40751c;
                        if (view14 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view14.setVisibility(8);
                        View view15 = oVar.f40755g;
                        if (view15 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view15.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText = oVar.f40756h;
                        if (multiLineImeEditText == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText2, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar10 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar11 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar11.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        MultiLineImeEditText multiLineImeEditText = this.f40756h;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
            throw null;
        }
        multiLineImeEditText.setTextEntryDoneListener(new en0.n(this, 16));
        TextView textView = this.f40760l;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mEditSymptomsButton");
            throw null;
        }
        final int i19 = 2;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view13) {
                int i110 = i19;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar3 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar3, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar4 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar4.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar7 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar7.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar9 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar9, mVarRequireActivity2, 101);
                            return;
                        }
                        View view14 = oVar.f40751c;
                        if (view14 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view14.setVisibility(8);
                        View view15 = oVar.f40755g;
                        if (view15 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view15.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText2.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText3 = oVar.f40756h;
                        if (multiLineImeEditText3 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText3, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar10 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar11 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar11.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        View view13 = this.f40765q;
        if (view13 == null) {
            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingButton");
            throw null;
        }
        final int i24 = 3;
        view13.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70253b;

            {
                this.f70253b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view14) {
                int i110 = i24;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70253b;
                switch (i110) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar3 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.d(aVar3, mVarRequireActivity, 101);
                            return;
                        }
                        PregnancyLogDeliveryDateActivity.a aVar4 = PregnancyLogDeliveryDateActivity.f40875e;
                        Context contextRequireContext2 = oVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar4.getClass();
                        androidx.room.a0.r(contextRequireContext2, PregnancyLogDeliveryDateActivity.class);
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context2 = oVar.getContext();
                        if (context2 != null) {
                            oVar.startActivity(MenstrualCycleSettingsActivity.a.a(MenstrualCycleSettingsActivity.f39030c, context2, null, true, false, false, 48));
                            return;
                        }
                        return;
                    case 2:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context3 = oVar.getContext();
                        LocalDate localDateU6 = oVar.u6();
                        if (context3 == null || localDateU6 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar7 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar2 = oVar.f40771y;
                        ww0.b log = cVar2 != null ? cVar2.getLog() : null;
                        Integer numValueOf = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar7.getClass();
                        Intent intentA = MenstrualCycleSymptomActivity.a.a(context3, log, localDateU6, null, numValueOf);
                        if (intentA != null) {
                            oVar.startActivityForResult(intentA, 24);
                            return;
                        }
                        return;
                    case 3:
                        RecyclerView recyclerView4 = oVar.f40768v;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                        boolean zD = v22.e.d(recyclerView4);
                        ImageView imageView = oVar.f40767t;
                        if (zD) {
                            if (imageView == null) {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                                throw null;
                            }
                            imageView.startAnimation((RotateAnimation) oVar.D.getValue());
                            RecyclerView recyclerView5 = oVar.f40768v;
                            if (recyclerView5 != null) {
                                recyclerView5.setVisibility(8);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                                throw null;
                            }
                        }
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseExpandCollapseIcon");
                            throw null;
                        }
                        imageView.startAnimation((RotateAnimation) oVar.C.getValue());
                        RecyclerView recyclerView6 = oVar.f40768v;
                        if (recyclerView6 != null) {
                            recyclerView6.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                            throw null;
                        }
                    case 4:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        if (!d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                            DataStorageConsentActivity.a aVar9 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity2 = oVar.requireActivity();
                            mVarRequireActivity2.getClass();
                            DataStorageConsentActivity.a.d(aVar9, mVarRequireActivity2, 101);
                            return;
                        }
                        View view15 = oVar.f40751c;
                        if (view15 == null) {
                            p005kotlin.jvm.internal.s.m("mAddNotesOption");
                            throw null;
                        }
                        view15.setVisibility(8);
                        View view16 = oVar.f40755g;
                        if (view16 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesLayout");
                            throw null;
                        }
                        view16.setVisibility(0);
                        MultiLineImeEditText multiLineImeEditText2 = oVar.f40756h;
                        if (multiLineImeEditText2 == null) {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                        multiLineImeEditText2.requestFocus();
                        Context context4 = oVar.getContext();
                        Object systemService = context4 != null ? context4.getSystemService("input_method") : null;
                        systemService.getClass();
                        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                        MultiLineImeEditText multiLineImeEditText3 = oVar.f40756h;
                        if (multiLineImeEditText3 != null) {
                            inputMethodManager.showSoftInput(multiLineImeEditText3, 0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("mNotesEditTextView");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar10 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                        Context context5 = oVar.getContext();
                        LocalDate localDateU7 = oVar.u6();
                        if (context5 == null || localDateU7 == null) {
                            return;
                        }
                        MenstrualCycleSymptomActivity.a aVar11 = MenstrualCycleSymptomActivity.f38817c;
                        ww0.c cVar3 = oVar.f40771y;
                        ww0.b log2 = cVar3 != null ? cVar3.getLog() : null;
                        Integer numValueOf2 = Integer.valueOf(ww0.a.PREGNANT.ordinal());
                        aVar11.getClass();
                        Intent intentA2 = MenstrualCycleSymptomActivity.a.a(context5, log2, localDateU7, null, numValueOf2);
                        if (intentA2 != null) {
                            oVar.startActivityForResult(intentA2, 24);
                            return;
                        }
                        return;
                }
            }
        });
        A6();
        y6();
        ((p0) this.f40750b.getValue()).f70286a.f(getViewLifecycleOwner(), new d(new k0(this, 0)));
    }

    public final LocalDate u6() {
        return (LocalDate) this.f40772z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final hx0.s v6() {
        return (hx0.s) this.f40749a.getValue();
    }

    public final void w6(db1.s sVar) {
        List<db1.r> listB;
        List<db1.r> listB2;
        Context context = getContext();
        if (context != null) {
            ArrayList arrayList = new ArrayList();
            if (sVar != null && (listB2 = sVar.b()) != null) {
                Iterator<db1.r> it = listB2.iterator();
                while (it.hasNext()) {
                    DateTime userMeasurementTimestamp = it.next().getUserMeasurementTimestamp();
                    if (userMeasurementTimestamp != null) {
                        DateTime dateTime = new DateTime(userMeasurementTimestamp.getMillis());
                        arrayList.add(c22.j0.u(dateTime.getMinuteOfHour() + (dateTime.getHourOfDay() * 60)));
                    }
                }
            }
            LocalDate localDateU6 = u6();
            if (localDateU6 == null) {
                localDateU6 = new LocalDate();
            }
            LocalDate localDate = localDateU6;
            ew2.c cVar = new ew2.c(localDate, context, arrayList, this, 1);
            View view2 = this.f40762n;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseOption");
                throw null;
            }
            view2.setOnClickListener(cVar);
            TextView textView = this.f40763o;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseAddButton");
                throw null;
            }
            textView.setOnClickListener(cVar);
            if (sVar == null || (listB = sVar.b()) == null || listB.isEmpty()) {
                i52.a.n();
                View view3 = this.f40762n;
                if (view3 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseOption");
                    throw null;
                }
                view3.setVisibility(i52.a.n() ? 0 : 8);
                View view4 = this.f40764p;
                if (view4 != null) {
                    view4.setVisibility(8);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
                    throw null;
                }
            }
            View view5 = this.f40762n;
            if (view5 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseOption");
                throw null;
            }
            view5.setVisibility(8);
            View view6 = this.f40764p;
            if (view6 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
                throw null;
            }
            view6.setVisibility(0);
            RecyclerView recyclerView = this.f40759k;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("mFlexRecyclerView");
                throw null;
            }
            if (v22.e.d(recyclerView)) {
                View view7 = this.f40764p;
                if (view7 == null) {
                    p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
                    throw null;
                }
                RelativeLayout relativeLayout = (RelativeLayout) view7.findViewById(R.id.header_view);
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                relativeLayout.setLayoutParams(marginLayoutParams);
            }
            TextView textView2 = this.f40763o;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseAddButton");
                throw null;
            }
            textView2.setVisibility(i52.a.n() ? 0 : 8);
            View view8 = this.f40764p;
            if (view8 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseDisplayView");
                throw null;
            }
            View viewFindViewById = view8.findViewById(R.id.blood_glucose_display_label);
            viewFindViewById.getClass();
            viewFindViewById.setVisibility(0);
            List<db1.r> listB3 = sVar.b();
            ArrayList arrayList2 = new ArrayList();
            for (db1.r rVar : listB3) {
                db1.r.f59064j.getClass();
                arrayList2.add(db1.r.a.a(rVar));
            }
            fb1.m mVar = new fb1.m();
            TextView textView3 = this.f40766r;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingButtonLabel");
                throw null;
            }
            textView3.setText(arrayList2.size() == 1 ? getString(R.string.pregnancy_single_reading, String.valueOf(arrayList2.size())) : getString(R.string.pregnancy_multiple_readings, String.valueOf(arrayList2.size())));
            RecyclerView recyclerView2 = this.f40768v;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("mBloodGlucoseReadingRecyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
            recyclerView2.setAdapter(mVar);
            ArrayList arrayList3 = mVar.f70266b;
            arrayList3.clear();
            if (h0.L(arrayList2)) {
                arrayList3.addAll(h0.N0(arrayList2, new fb1.n()));
            }
            mVar.notifyDataSetChanged();
            mVar.f70267c = new c(localDate, context, arrayList, this);
            List<db1.r> listB4 = sVar.b();
            ArrayList arrayList4 = new ArrayList();
            for (db1.r rVar2 : listB4) {
                db1.r.f59064j.getClass();
                arrayList4.add(db1.r.a.a(rVar2));
            }
            db1.s sVar2 = new db1.s(sVar.getMin(), sVar.getMax(), arrayList4);
            androidx.fragment.app.v fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                m.f40713m.getClass();
                m mVar2 = new m();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PREGNANCY_GLUCOSE_CHART_DATA", sVar2);
                mVar2.setArguments(bundle);
                aVar.l(R.id.glucose_detail_chart, mVar2, null);
                aVar.e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    public final void y6() {
        Object obj;
        Object obj2;
        ww0.l cycleSummary;
        Integer currentPhase;
        View view2;
        ww0.b log;
        ww0.b log2;
        ww0.c cVar = this.f40771y;
        if (cVar == null || (log2 = cVar.getLog()) == null) {
            obj = j0.f134944a;
        } else {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            ArrayList arrayList = new ArrayList();
            ww0.h flow = log2.getFlow();
            if (flow != null) {
                arrayList.add(flow);
            }
            List<ww0.t> listO = log2.o();
            if (listO != null) {
                ww0.t.a aVar = ww0.t.f187658a;
                ArrayList arrayListZ = h0.Z(listO);
                aVar.getClass();
                arrayList.addAll(ww0.t.a.a(contextRequireContext, arrayListZ));
            }
            List<ww0.p> listI = log2.i();
            if (listI != null) {
                ww0.p.a aVar2 = ww0.p.f187627a;
                ArrayList arrayListZ2 = h0.Z(listI);
                aVar2.getClass();
                arrayList.addAll(h0.N0(arrayListZ2, new ww0.o()));
            }
            List<ww0.e> listG = log2.g();
            if (listG != null) {
                ww0.e.a aVar3 = ww0.e.f187542a;
                ArrayList arrayListZ3 = h0.Z(listG);
                aVar3.getClass();
                arrayList.addAll(ww0.e.a.a(contextRequireContext, arrayListZ3));
            }
            ww0.s sexualActivity = log2.getSexualActivity();
            obj = arrayList;
            if (sexualActivity != null) {
                arrayList.add(sexualActivity);
                obj = arrayList;
            }
        }
        ww0.c cVar2 = this.f40771y;
        if (cVar2 == null || (log = cVar2.getLog()) == null) {
            obj2 = j0.f134944a;
        } else {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (p005kotlin.jvm.internal.s.g(log.getIsOvulationDay(), Boolean.TRUE)) {
                String string = contextRequireContext2.getString(R.string.mct_ovulation_day);
                string.getClass();
                arrayList2.add(new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e.a(string));
            }
            ww0.r sexDrive = log.getSexDrive();
            obj2 = arrayList2;
            if (sexDrive != null) {
                String string2 = contextRequireContext2.getString(R.string.mct_level_sex_drive, sexDrive.a(contextRequireContext2));
                string2.getClass();
                arrayList2.add(new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e.a(string2));
                obj2 = arrayList2;
            }
        }
        MenstrualCycleSymptomActivity.f38817c.getClass();
        boolean zB = MenstrualCycleSymptomActivity.a.b(null);
        if (h0.L((Iterable) obj) || h0.L((Iterable) obj2)) {
            z6(true);
            ((hx0.r) this.A.getValue()).u(obj);
            ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.e) this.B.getValue()).u(obj2);
            TextView textView = this.f40760l;
            if (zB) {
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mEditSymptomsButton");
                    throw null;
                }
                textView.setVisibility(0);
            } else {
                if (textView == null) {
                    p005kotlin.jvm.internal.s.m("mEditSymptomsButton");
                    throw null;
                }
                textView.setVisibility(8);
            }
        } else {
            z6(false);
            View view3 = this.f40752d;
            if (zB) {
                if (view3 == null) {
                    p005kotlin.jvm.internal.s.m("mSymptomsOption");
                    throw null;
                }
                view3.setVisibility(0);
            } else {
                if (view3 == null) {
                    p005kotlin.jvm.internal.s.m("mSymptomsOption");
                    throw null;
                }
                view3.setVisibility(8);
            }
        }
        A6();
        C6();
        ww0.c cVar3 = this.f40771y;
        if (cVar3 == null || (cycleSummary = cVar3.getCycleSummary()) == null || (currentPhase = cycleSummary.getCurrentPhase()) == null) {
            View view4 = this.f40753e;
            if (view4 == null) {
                p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
                throw null;
            }
            view4.setVisibility(8);
        } else {
            int iIntValue = currentPhase.intValue();
            tb1.e.a aVar4 = tb1.e.f163745a;
            androidx.fragment.app.m activity = getActivity();
            PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
            db1.m mVarTa = pregnancyDetailsActivity != null ? pregnancyDetailsActivity.ta() : null;
            aVar4.getClass();
            F.info("Is past pregnancy ", Boolean.valueOf(!tb1.e.a.g(mVarTa)));
            if (iIntValue == 7) {
                androidx.fragment.app.m activity2 = getActivity();
                PregnancyDetailsActivity pregnancyDetailsActivity2 = activity2 instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity2 : null;
                if (tb1.e.a.g(pregnancyDetailsActivity2 != null ? pregnancyDetailsActivity2.ta() : null)) {
                    view2 = this.f40753e;
                    if (view2 != null) {
                        p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
                        throw null;
                    }
                    view2.setVisibility(8);
                } else {
                    View view5 = this.f40753e;
                    if (view5 == null) {
                        p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
                        throw null;
                    }
                    view5.setVisibility(0);
                }
            } else {
                view2 = this.f40753e;
                if (view2 != null) {
                    p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
                    throw null;
                }
                view2.setVisibility(8);
            }
        }
        hx0.s sVarV6 = v6();
        View view6 = this.f40753e;
        if (view6 == null) {
            p005kotlin.jvm.internal.s.m("mLogDeliveryDateOption");
            throw null;
        }
        sVarV6.f86147k = v22.e.d(view6);
        requireActivity().invalidateOptionsMenu();
    }

    public final void z6(boolean z14) {
        if (!z14) {
            View view2 = this.f40757i;
            if (view2 == null) {
                p005kotlin.jvm.internal.s.m("mTodaySymptomsGroup");
                throw null;
            }
            view2.setVisibility(8);
            RecyclerView recyclerView = this.f40758j;
            if (recyclerView == null) {
                p005kotlin.jvm.internal.s.m("mListRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(8);
            RecyclerView recyclerView2 = this.f40759k;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("mFlexRecyclerView");
                throw null;
            }
            recyclerView2.setVisibility(8);
            View view3 = this.f40752d;
            if (view3 != null) {
                view3.setVisibility(0);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("mSymptomsOption");
                throw null;
            }
        }
        TextView textView = this.f40761m;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mSymptomsHeaderTextView");
            throw null;
        }
        textView.setText(getString(p005kotlin.jvm.internal.s.g(LocalDate.now(), u6()) ? R.string.mct_todays_symptoms : R.string.mct_logged_symptoms));
        View view4 = this.f40757i;
        if (view4 == null) {
            p005kotlin.jvm.internal.s.m("mTodaySymptomsGroup");
            throw null;
        }
        view4.setVisibility(0);
        RecyclerView recyclerView3 = this.f40758j;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("mListRecyclerView");
            throw null;
        }
        recyclerView3.setVisibility(0);
        RecyclerView recyclerView4 = this.f40759k;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("mFlexRecyclerView");
            throw null;
        }
        recyclerView4.setVisibility(0);
        View view5 = this.f40752d;
        if (view5 != null) {
            view5.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("mSymptomsOption");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_PREGNANCY_DETAILS", "EXTRA_DATE", "", "SYMPTOMS_COLUMN_COUNT_DEFAULT_FONT_SCALE", "I", "SYMPTOMS_COLUMN_COUNT_FONT_SCALE_BIGGER_THAN_ONE", "SYMPTOMS_COLUMN_COUNT_FONT_SCALE_BIGGER_THAN_ONE_POINT_FIVE", "PREGNANCY_SYMPTOMS_REQUEST_CODE", "BABY_MOVEMENT_REQUEST_CODE", "BLOOD_GLUCOSE_REQUEST_CODE", "CONSENT_REQUEST_CODE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
