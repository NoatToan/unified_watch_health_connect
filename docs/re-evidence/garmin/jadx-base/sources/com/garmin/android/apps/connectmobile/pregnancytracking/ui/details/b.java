package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.views.GCMPregnancyTwoLineButton;
import hx0.d0;
import hx0.n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p005kotlin.math.MathKt;
import p13.b1;
import p13.h0;
import p13.j0;
import r22.f2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/b;", "Landroidx/fragment/app/Fragment;", "Lhx0/n0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements n0 {
    public static final Logger A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f40456y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final db1.g f40457z = db1.g.GENERAL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMPregnancyTwoLineButton f40460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f40461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f40463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d3 f40464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f40465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public db1.a f40466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public db1.a f40467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ww0.b f40468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public db1.g f40469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40470m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f40474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w1 f40475r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f40476t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f40477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o13.t f40478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o13.t f40479x;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/pregnancytracking/ui/details/b$b", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0762b implements androidx.core.view.s {
        public C0762b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            menuItemFindItem.getClass();
            b.this.f40465h = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            b bVar = b.this;
            MenuItem menuItem = bVar.f40465h;
            if (menuItem != null) {
                boolean z14 = false;
                if (bVar.f40466i == null) {
                    GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = bVar.f40458a;
                    if (gCMPregnancyTwoLineButton == null) {
                        p005kotlin.jvm.internal.s.m("mEndTime");
                        throw null;
                    }
                    if (!p005kotlin.jvm.internal.s.g(gCMPregnancyTwoLineButton.getButtonValueLabel(), bVar.getString(R.string.no_value)) && h0.L(((d0) bVar.f40478w.getValue()).t())) {
                        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = bVar.f40459b;
                        if (gCMPregnancyTwoLineButton2 == null) {
                            p005kotlin.jvm.internal.s.m("mMovementTotal");
                            throw null;
                        }
                        if (!p005kotlin.jvm.internal.s.g(gCMPregnancyTwoLineButton2.getButtonValueLabel(), bVar.getString(R.string.no_value))) {
                            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = bVar.f40460c;
                            if (gCMPregnancyTwoLineButton3 == null) {
                                p005kotlin.jvm.internal.s.m("mStartTime");
                                throw null;
                            }
                            if (!p005kotlin.jvm.internal.s.g(gCMPregnancyTwoLineButton3.getButtonValueLabel(), bVar.getString(R.string.no_value)) && bVar.v6()) {
                                z14 = true;
                            }
                        }
                    }
                    menuItem.setEnabled(z14);
                    return;
                }
                if (!bVar.v6()) {
                    MenuItem menuItem2 = bVar.f40465h;
                    if (menuItem2 != null) {
                        menuItem2.setEnabled(false);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                        throw null;
                    }
                }
                boolean z15 = bVar.f40471n;
                MenuItem menuItem3 = bVar.f40465h;
                if (z15) {
                    if (menuItem3 != null) {
                        menuItem3.setEnabled(true);
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                        throw null;
                    }
                }
                if (menuItem3 == null) {
                    p005kotlin.jvm.internal.s.m("mSaveMenuItem");
                    throw null;
                }
                tb1.a.C3081a c3081a = tb1.a.f163743a;
                db1.a aVar = bVar.f40467j;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                    throw null;
                }
                db1.a aVar2 = bVar.f40466i;
                if (aVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mInitialBabyMovementDTO");
                    throw null;
                }
                c3081a.getClass();
                menuItem3.setEnabled(!tb1.a.C3081a.a(aVar, aVar2));
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.save_menu_item) {
                return false;
            }
            a aVar = b.f40456y;
            b.this.y6();
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40481a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f40481a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40481a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40481a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40482a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40482a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f40482a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar) {
            super(0);
            this.f40483a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f40483a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f40484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(o13.l lVar) {
            super(0);
            this.f40484a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f40484a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar, o13.l lVar) {
            super(0);
            this.f40485a = aVar;
            this.f40486b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40485a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40486b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f40488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment, o13.l lVar) {
            super(0);
            this.f40487a = fragment;
            this.f40488b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40488b.getValue();
            y yVar = viewModelStoreOwner instanceof y ? (y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f40487a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        A = gt2.b.f79005a.h("BabyMovementActivity");
    }

    public b() {
        o13.l lVarA = o13.m.a(o13.n.NONE, new e(new d(this)));
        this.f40475r = new w1(s0.f105811a.b(fb1.l.class), new f(lVarA), new h(this, lVarA), new g(null, lVarA));
        final int i14 = 0;
        this.f40476t = o13.m.b(new e23.a(this) { // from class: fb1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70244b;

            {
                this.f70244b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70244b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        Bundle arguments = bVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("extra_baby_movement_log_date", LocalDate.class);
                        } else {
                            Serializable serializable2 = arguments.getSerializable("extra_baby_movement_log_date");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar2 = this.f70244b;
                        double dDoubleValue = ((Number) bVar2.f40479x.getValue()).doubleValue();
                        int i16 = ww0.g.f187556a;
                        Context contextRequireContext = bVar2.requireContext();
                        contextRequireContext.getClass();
                        List<Enum> list = (List) bVar2.f40477v.getValue();
                        db1.g gVar = bVar2.f40469l;
                        HashSet hashSetC = gVar != null ? b1.c(gVar) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (Enum r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = hashSetC.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new hx0.b0(iOrdinal, zContains, fVar.a(contextRequireContext), fVar.b()));
                        }
                        return new hx0.d0(false, dDoubleValue, new ArrayList(arrayList), null, bVar2, 8, null);
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        bVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i17 = displayMetrics.widthPixels;
                        float fApplyDimension = TypedValue.applyDimension(1, 88.0f, bVar.getResources().getDisplayMetrics());
                        float dimension = bVar.getResources().getDimension(R.dimen.spacing_micro);
                        float dimension2 = i17 - bVar.getResources().getDimension(R.dimen.spacing_micro);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / ((dimension * 2) + fApplyDimension))) - 0.5d));
                }
            }
        });
        this.f40477v = o13.m.b(new ey0.a(29));
        final int i15 = 1;
        this.f40478w = o13.m.b(new e23.a(this) { // from class: fb1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70244b;

            {
                this.f70244b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70244b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        Bundle arguments = bVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("extra_baby_movement_log_date", LocalDate.class);
                        } else {
                            Serializable serializable2 = arguments.getSerializable("extra_baby_movement_log_date");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar2 = this.f70244b;
                        double dDoubleValue = ((Number) bVar2.f40479x.getValue()).doubleValue();
                        int i17 = ww0.g.f187556a;
                        Context contextRequireContext = bVar2.requireContext();
                        contextRequireContext.getClass();
                        List<Enum> list = (List) bVar2.f40477v.getValue();
                        db1.g gVar = bVar2.f40469l;
                        HashSet hashSetC = gVar != null ? b1.c(gVar) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (Enum r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = hashSetC.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new hx0.b0(iOrdinal, zContains, fVar.a(contextRequireContext), fVar.b()));
                        }
                        return new hx0.d0(false, dDoubleValue, new ArrayList(arrayList), null, bVar2, 8, null);
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        bVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i18 = displayMetrics.widthPixels;
                        float fApplyDimension = TypedValue.applyDimension(1, 88.0f, bVar.getResources().getDisplayMetrics());
                        float dimension = bVar.getResources().getDimension(R.dimen.spacing_micro);
                        float dimension2 = i18 - bVar.getResources().getDimension(R.dimen.spacing_micro);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / ((dimension * 2) + fApplyDimension))) - 0.5d));
                }
            }
        });
        final int i16 = 2;
        this.f40479x = o13.m.b(new e23.a(this) { // from class: fb1.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70244b;

            {
                this.f70244b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() {
                Object serializable;
                int i17 = i16;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70244b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        Bundle arguments = bVar.getArguments();
                        if (arguments == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = arguments.getSerializable("extra_baby_movement_log_date", LocalDate.class);
                        } else {
                            Serializable serializable2 = arguments.getSerializable("extra_baby_movement_log_date");
                            serializable = (LocalDate) (serializable2 instanceof LocalDate ? serializable2 : null);
                        }
                        return (LocalDate) serializable;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar2 = this.f70244b;
                        double dDoubleValue = ((Number) bVar2.f40479x.getValue()).doubleValue();
                        int i18 = ww0.g.f187556a;
                        Context contextRequireContext = bVar2.requireContext();
                        contextRequireContext.getClass();
                        List<Enum> list = (List) bVar2.f40477v.getValue();
                        db1.g gVar = bVar2.f40469l;
                        HashSet hashSetC = gVar != null ? b1.c(gVar) : new HashSet();
                        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                        for (Enum r14 : list) {
                            int iOrdinal = r14.ordinal();
                            boolean zContains = hashSetC.contains(r14);
                            ww0.f fVar = (ww0.f) r14;
                            arrayList.add(new hx0.b0(iOrdinal, zContains, fVar.a(contextRequireContext), fVar.b()));
                        }
                        return new hx0.d0(false, dDoubleValue, new ArrayList(arrayList), null, bVar2, 8, null);
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        bVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                        int i19 = displayMetrics.widthPixels;
                        float fApplyDimension = TypedValue.applyDimension(1, 88.0f, bVar.getResources().getDisplayMetrics());
                        float dimension = bVar.getResources().getDimension(R.dimen.spacing_micro);
                        float dimension2 = i19 - bVar.getResources().getDimension(R.dimen.spacing_micro);
                        return Double.valueOf(((double) dimension2) / (((double) MathKt.c(dimension2 / ((dimension * 2) + fApplyDimension))) - 0.5d));
                }
            }
        });
    }

    @Override // hx0.n0
    public final void B0() {
        db1.g gVar;
        HashSet<Integer> hashSetT = ((d0) this.f40478w.getValue()).t();
        if (h0.L(hashSetT)) {
            db1.g.a aVar = db1.g.f59011a;
            int i14 = 0;
            Integer num = (Integer) h0.W(hashSetT, 0);
            aVar.getClass();
            if (num == null) {
                gVar = null;
                break;
            }
            db1.g[] gVarArrValues = db1.g.values();
            int length = gVarArrValues.length;
            while (true) {
                if (i14 >= length) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i14];
                if (gVar.ordinal() == num.intValue()) {
                    break;
                } else {
                    i14++;
                }
            }
            this.f40469l = gVar;
            db1.a aVar2 = this.f40467j;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                throw null;
            }
            aVar2.j(gVar);
        } else {
            this.f40469l = null;
            db1.a aVar3 = this.f40467j;
            if (aVar3 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                throw null;
            }
            aVar3.j(null);
        }
        requireActivity().invalidateOptionsMenu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40464g = (d3) context;
        } catch (Exception unused) {
            A.error("BabyMovementActivity", context + " must implement ToolbarListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        this.f40474q = DateFormat.is24HourFormat(requireContext());
        Bundle arguments = getArguments();
        o13.t tVar = this.f40476t;
        if (arguments != null) {
            LocalDate localDate = (LocalDate) tVar.getValue();
            if (localDate == null) {
                localDate = new LocalDate();
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("extra_daily_menstrual_cycle_log_dto", ww0.b.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("extra_daily_menstrual_cycle_log_dto");
                if (!(parcelable2 instanceof ww0.b)) {
                    parcelable2 = null;
                }
                parcelable = (ww0.b) parcelable2;
            }
            ww0.b bVarA = (ww0.b) parcelable;
            if (bVarA == null) {
                ww0.b.f187523n.getClass();
                bVarA = ww0.b.a.a(localDate);
            }
            this.f40468k = bVarA;
            List<db1.a> listD = bVarA.d();
            List listZ = listD != null ? h0.Z(listD) : j0.f134944a;
            if (h0.L(listZ)) {
                d3 d3Var = this.f40464g;
                if (d3Var == null) {
                    p005kotlin.jvm.internal.s.m("mToolbarListener");
                    throw null;
                }
                d3Var.updateActionBar(getString(R.string.pregnancy_edit_baby_movement), 3);
                this.f40471n = false;
            }
            int i14 = arguments.getInt("extra_selected_index", -1);
            this.f40470m = i14;
            if (i14 >= 0 && i14 < listZ.size()) {
                db1.a.C1254a c1254a = db1.a.f58980e;
                db1.a aVar = (db1.a) listZ.get(this.f40470m);
                c1254a.getClass();
                this.f40467j = db1.a.C1254a.a(aVar);
                this.f40466i = db1.a.C1254a.a((db1.a) listZ.get(this.f40470m));
            }
        }
        if (this.f40467j == null) {
            db1.a aVar2 = new db1.a(null, null, null, null, 15, null);
            aVar2.h(10);
            aVar2.j(f40457z);
            aVar2.i(Integer.valueOf(DateTimeConstants.SECONDS_PER_HOUR));
            LocalDate localDate2 = (LocalDate) tVar.getValue();
            if (localDate2 == null) {
                localDate2 = new LocalDate();
            }
            DateTime dateTime = new DateTime();
            aVar2.k(new DateTime().withYear(localDate2.getYear()).withMonthOfYear(localDate2.getMonthOfYear()).withDayOfMonth(localDate2.getDayOfMonth()).withHourOfDay(dateTime.getHourOfDay() - 1).withMinuteOfHour(dateTime.getMinuteOfHour()).withZone(dateTime.getZone()).withSecondOfMinute(0).withMillisOfSecond(0));
            this.f40466i = aVar2;
            db1.a.f58980e.getClass();
            this.f40467j = db1.a.C1254a.a(aVar2);
            d3 d3Var2 = this.f40464g;
            if (d3Var2 == null) {
                p005kotlin.jvm.internal.s.m("mToolbarListener");
                throw null;
            }
            d3Var2.updateActionBar(getString(R.string.pregnancy_add_baby_movement), 3);
            this.f40471n = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.activity_baby_movement, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C0762b(), b0.b.RESUMED);
        View viewFindViewById = view2.findViewById(R.id.end_time);
        viewFindViewById.getClass();
        this.f40458a = (GCMPregnancyTwoLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.start_time);
        viewFindViewById2.getClass();
        this.f40460c = (GCMPregnancyTwoLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.movement_total);
        viewFindViewById3.getClass();
        this.f40459b = (GCMPregnancyTwoLineButton) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.movement_list);
        viewFindViewById4.getClass();
        this.f40461d = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.delete_movement);
        viewFindViewById5.getClass();
        this.f40462e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.baby_movement_help_lbl);
        viewFindViewById6.getClass();
        this.f40463f = (TextView) viewFindViewById6;
        db1.a aVar = this.f40467j;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        DateTime dateTimeG = aVar.getStartTimestamp();
        if (dateTimeG != null) {
            DateTime dateTime = new DateTime(dateTimeG.getMillis());
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton = this.f40460c;
            if (gCMPregnancyTwoLineButton == null) {
                p005kotlin.jvm.internal.s.m("mStartTime");
                throw null;
            }
            gCMPregnancyTwoLineButton.setButtonValueLabel(u6(dateTime.getHourOfDay(), dateTime.getMinuteOfHour()));
        } else {
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton2 = this.f40460c;
            if (gCMPregnancyTwoLineButton2 == null) {
                p005kotlin.jvm.internal.s.m("mStartTime");
                throw null;
            }
            gCMPregnancyTwoLineButton2.setButtonValueLabel(getString(R.string.no_value));
        }
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton3 = this.f40460c;
        if (gCMPregnancyTwoLineButton3 == null) {
            p005kotlin.jvm.internal.s.m("mStartTime");
            throw null;
        }
        final int i14 = 3;
        gCMPregnancyTwoLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70225b;

            {
                this.f70225b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r3v10, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Object, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r9v0, types: [T, org.joda.time.DateTime] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                int i16 = 0;
                int iIntValue = DateTimeConstants.SECONDS_PER_HOUR;
                int i17 = 1;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70225b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        View viewInflate = View.inflate(bVar.requireContext(), R.layout.gcm_create_manual_activity_number_of_lengths, null);
                        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(100);
                        db1.a aVar3 = bVar.f40467j;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer count = aVar3.getCount();
                        numberPicker.setValue(count != null ? count.intValue() : 0);
                        androidx.appcompat.app.e.a aVar4 = new androidx.appcompat.app.e.a(bVar.requireContext());
                        aVar4.setTitle(bVar.getString(R.string.pregnancy_movement_total));
                        aVar4.setView(viewInflate);
                        aVar4.setPositiveButton(R.string.lbl_ok, new ag0.d(24, numberPicker, bVar));
                        aVar4.setNegativeButton(R.string.lbl_cancel, new f20.i(3));
                        aVar4.show();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        o13.p pVar = new o13.p(bVar.getString(R.string.lbl_delete), new g(bVar, 2));
                        o13.p pVar2 = new o13.p(bVar.getString(R.string.lbl_cancel), new ex.b(18));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext = bVar.requireContext();
                        contextRequireContext.getClass();
                        fVar.getClass();
                        androidx.appcompat.app.e eVarA = c22.f.a(contextRequireContext, R.string.pregnancy_delete_movement_questions, R.string.pregnancy_delete_movement_message, pVar, pVar2);
                        eVarA.setOnShowListener(new c22.e(bVar, i17));
                        eVarA.show();
                        return;
                    case 2:
                        db1.a aVar6 = bVar.f40467j;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration = aVar6.getDuration();
                        if (duration != null) {
                            iIntValue = duration.intValue();
                        }
                        DateTime dateTime2 = new DateTime();
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        r0Var.f105810a = new DateTime();
                        db1.a aVar7 = bVar.f40467j;
                        if (aVar7 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp = aVar7.getStartTimestamp();
                        if (startTimestamp != null) {
                            ?? PlusMinutes = new DateTime(startTimestamp.getMillis()).plusMinutes(1);
                            PlusMinutes.getClass();
                            r0Var.f105810a = PlusMinutes;
                        }
                        DateTime dateTime3 = new DateTime(((DateTime) r0Var.f105810a).getMillis() + ((long) ((iIntValue - 60) * 1000)));
                        int hourOfDay = dateTime3.getHourOfDay();
                        int minuteOfHour = dateTime3.getMinuteOfHour();
                        int hourOfDay2 = ((DateTime) r0Var.f105810a).getHourOfDay();
                        int minuteOfHour2 = ((DateTime) r0Var.f105810a).getMinuteOfHour();
                        Days daysDaysBetween = Days.daysBetween((ReadableInstant) r0Var.f105810a, dateTime2);
                        f2 f2Var = new f2(bVar.requireContext(), new f(dateTime3, r0Var, bVar, i16), hourOfDay, minuteOfHour, hourOfDay2, minuteOfHour2, daysDaysBetween.getDays() > 0 ? 23 : dateTime2.getHourOfDay(), daysDaysBetween.getDays() > 0 ? 59 : dateTime2.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var.show();
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        og.a.W(f2Var, contextRequireContext2);
                        Context contextRequireContext3 = bVar.requireContext();
                        contextRequireContext3.getClass();
                        og.a.w(f2Var, contextRequireContext3);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = new DateTime();
                        db1.a aVar9 = bVar.f40467j;
                        if (aVar9 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp2 = aVar9.getStartTimestamp();
                        if (startTimestamp2 != null) {
                            r0Var2.f105810a = new DateTime(startTimestamp2.getMillis());
                        }
                        int hourOfDay3 = ((DateTime) r0Var2.f105810a).getHourOfDay();
                        int minuteOfHour3 = ((DateTime) r0Var2.f105810a).getMinuteOfHour();
                        db1.a aVar10 = bVar.f40467j;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration2 = aVar10.getDuration();
                        if (duration2 != null) {
                            iIntValue = duration2.intValue();
                        }
                        DateTime dateTimeMinusMinutes = new DateTime(((DateTime) r0Var2.f105810a).getMillis() + ((long) (iIntValue * 1000))).minusMinutes(1);
                        f2 f2Var2 = new f2(bVar.requireContext(), new f(r0Var2, dateTimeMinusMinutes, bVar), hourOfDay3, minuteOfHour3, 0, 0, dateTimeMinusMinutes.getHourOfDay(), dateTimeMinusMinutes.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var2.show();
                        Context contextRequireContext4 = bVar.requireContext();
                        contextRequireContext4.getClass();
                        og.a.W(f2Var2, contextRequireContext4);
                        Context contextRequireContext5 = bVar.requireContext();
                        contextRequireContext5.getClass();
                        og.a.w(f2Var2, contextRequireContext5);
                        return;
                }
            }
        });
        db1.a aVar2 = this.f40467j;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        Integer numD = aVar2.getDuration();
        int iIntValue = numD != null ? numD.intValue() : DateTimeConstants.SECONDS_PER_HOUR;
        db1.a aVar3 = this.f40467j;
        if (aVar3 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        DateTime dateTimeG2 = aVar3.getStartTimestamp();
        if (dateTimeG2 != null) {
            DateTime dateTime2 = new DateTime(dateTimeG2.getMillis() + ((long) (iIntValue * 1000)));
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton4 = this.f40458a;
            if (gCMPregnancyTwoLineButton4 == null) {
                p005kotlin.jvm.internal.s.m("mEndTime");
                throw null;
            }
            gCMPregnancyTwoLineButton4.setButtonValueLabel(u6(dateTime2.getHourOfDay(), dateTime2.getMinuteOfHour()));
        } else {
            GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton5 = this.f40458a;
            if (gCMPregnancyTwoLineButton5 == null) {
                p005kotlin.jvm.internal.s.m("mEndTime");
                throw null;
            }
            gCMPregnancyTwoLineButton5.setButtonValueLabel(getString(R.string.no_value));
        }
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton6 = this.f40458a;
        if (gCMPregnancyTwoLineButton6 == null) {
            p005kotlin.jvm.internal.s.m("mEndTime");
            throw null;
        }
        final int i15 = 2;
        gCMPregnancyTwoLineButton6.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70225b;

            {
                this.f70225b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r3v10, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Object, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r9v0, types: [T, org.joda.time.DateTime] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                int i17 = 0;
                int iIntValue2 = DateTimeConstants.SECONDS_PER_HOUR;
                int i18 = 1;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70225b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        View viewInflate = View.inflate(bVar.requireContext(), R.layout.gcm_create_manual_activity_number_of_lengths, null);
                        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(100);
                        db1.a aVar5 = bVar.f40467j;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer count = aVar5.getCount();
                        numberPicker.setValue(count != null ? count.intValue() : 0);
                        androidx.appcompat.app.e.a aVar6 = new androidx.appcompat.app.e.a(bVar.requireContext());
                        aVar6.setTitle(bVar.getString(R.string.pregnancy_movement_total));
                        aVar6.setView(viewInflate);
                        aVar6.setPositiveButton(R.string.lbl_ok, new ag0.d(24, numberPicker, bVar));
                        aVar6.setNegativeButton(R.string.lbl_cancel, new f20.i(3));
                        aVar6.show();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar7 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        o13.p pVar = new o13.p(bVar.getString(R.string.lbl_delete), new g(bVar, 2));
                        o13.p pVar2 = new o13.p(bVar.getString(R.string.lbl_cancel), new ex.b(18));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext = bVar.requireContext();
                        contextRequireContext.getClass();
                        fVar.getClass();
                        androidx.appcompat.app.e eVarA = c22.f.a(contextRequireContext, R.string.pregnancy_delete_movement_questions, R.string.pregnancy_delete_movement_message, pVar, pVar2);
                        eVarA.setOnShowListener(new c22.e(bVar, i18));
                        eVarA.show();
                        return;
                    case 2:
                        db1.a aVar8 = bVar.f40467j;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration = aVar8.getDuration();
                        if (duration != null) {
                            iIntValue2 = duration.intValue();
                        }
                        DateTime dateTime3 = new DateTime();
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        r0Var.f105810a = new DateTime();
                        db1.a aVar9 = bVar.f40467j;
                        if (aVar9 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp = aVar9.getStartTimestamp();
                        if (startTimestamp != null) {
                            ?? PlusMinutes = new DateTime(startTimestamp.getMillis()).plusMinutes(1);
                            PlusMinutes.getClass();
                            r0Var.f105810a = PlusMinutes;
                        }
                        DateTime dateTime4 = new DateTime(((DateTime) r0Var.f105810a).getMillis() + ((long) ((iIntValue2 - 60) * 1000)));
                        int hourOfDay = dateTime4.getHourOfDay();
                        int minuteOfHour = dateTime4.getMinuteOfHour();
                        int hourOfDay2 = ((DateTime) r0Var.f105810a).getHourOfDay();
                        int minuteOfHour2 = ((DateTime) r0Var.f105810a).getMinuteOfHour();
                        Days daysDaysBetween = Days.daysBetween((ReadableInstant) r0Var.f105810a, dateTime3);
                        f2 f2Var = new f2(bVar.requireContext(), new f(dateTime4, r0Var, bVar, i17), hourOfDay, minuteOfHour, hourOfDay2, minuteOfHour2, daysDaysBetween.getDays() > 0 ? 23 : dateTime3.getHourOfDay(), daysDaysBetween.getDays() > 0 ? 59 : dateTime3.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var.show();
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        og.a.W(f2Var, contextRequireContext2);
                        Context contextRequireContext3 = bVar.requireContext();
                        contextRequireContext3.getClass();
                        og.a.w(f2Var, contextRequireContext3);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar10 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = new DateTime();
                        db1.a aVar11 = bVar.f40467j;
                        if (aVar11 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp2 = aVar11.getStartTimestamp();
                        if (startTimestamp2 != null) {
                            r0Var2.f105810a = new DateTime(startTimestamp2.getMillis());
                        }
                        int hourOfDay3 = ((DateTime) r0Var2.f105810a).getHourOfDay();
                        int minuteOfHour3 = ((DateTime) r0Var2.f105810a).getMinuteOfHour();
                        db1.a aVar12 = bVar.f40467j;
                        if (aVar12 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration2 = aVar12.getDuration();
                        if (duration2 != null) {
                            iIntValue2 = duration2.intValue();
                        }
                        DateTime dateTimeMinusMinutes = new DateTime(((DateTime) r0Var2.f105810a).getMillis() + ((long) (iIntValue2 * 1000))).minusMinutes(1);
                        f2 f2Var2 = new f2(bVar.requireContext(), new f(r0Var2, dateTimeMinusMinutes, bVar), hourOfDay3, minuteOfHour3, 0, 0, dateTimeMinusMinutes.getHourOfDay(), dateTimeMinusMinutes.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var2.show();
                        Context contextRequireContext4 = bVar.requireContext();
                        contextRequireContext4.getClass();
                        og.a.W(f2Var2, contextRequireContext4);
                        Context contextRequireContext5 = bVar.requireContext();
                        contextRequireContext5.getClass();
                        og.a.w(f2Var2, contextRequireContext5);
                        return;
                }
            }
        });
        db1.a aVar4 = this.f40467j;
        if (aVar4 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        Integer numB = aVar4.getCount();
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton7 = this.f40459b;
        if (numB != null) {
            int iIntValue2 = numB.intValue();
            if (gCMPregnancyTwoLineButton7 == null) {
                p005kotlin.jvm.internal.s.m("mMovementTotal");
                throw null;
            }
            gCMPregnancyTwoLineButton7.setButtonValueLabel(String.valueOf(iIntValue2));
        } else {
            if (gCMPregnancyTwoLineButton7 == null) {
                p005kotlin.jvm.internal.s.m("mMovementTotal");
                throw null;
            }
            gCMPregnancyTwoLineButton7.setButtonValueLabel(getString(R.string.no_value));
        }
        GCMPregnancyTwoLineButton gCMPregnancyTwoLineButton8 = this.f40459b;
        if (gCMPregnancyTwoLineButton8 == null) {
            p005kotlin.jvm.internal.s.m("mMovementTotal");
            throw null;
        }
        final int i16 = 0;
        gCMPregnancyTwoLineButton8.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70225b;

            {
                this.f70225b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r3v10, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Object, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r9v0, types: [T, org.joda.time.DateTime] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                int i18 = 0;
                int iIntValue3 = DateTimeConstants.SECONDS_PER_HOUR;
                int i19 = 1;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70225b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        View viewInflate = View.inflate(bVar.requireContext(), R.layout.gcm_create_manual_activity_number_of_lengths, null);
                        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(100);
                        db1.a aVar6 = bVar.f40467j;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer count = aVar6.getCount();
                        numberPicker.setValue(count != null ? count.intValue() : 0);
                        androidx.appcompat.app.e.a aVar7 = new androidx.appcompat.app.e.a(bVar.requireContext());
                        aVar7.setTitle(bVar.getString(R.string.pregnancy_movement_total));
                        aVar7.setView(viewInflate);
                        aVar7.setPositiveButton(R.string.lbl_ok, new ag0.d(24, numberPicker, bVar));
                        aVar7.setNegativeButton(R.string.lbl_cancel, new f20.i(3));
                        aVar7.show();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar8 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        o13.p pVar = new o13.p(bVar.getString(R.string.lbl_delete), new g(bVar, 2));
                        o13.p pVar2 = new o13.p(bVar.getString(R.string.lbl_cancel), new ex.b(18));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext = bVar.requireContext();
                        contextRequireContext.getClass();
                        fVar.getClass();
                        androidx.appcompat.app.e eVarA = c22.f.a(contextRequireContext, R.string.pregnancy_delete_movement_questions, R.string.pregnancy_delete_movement_message, pVar, pVar2);
                        eVarA.setOnShowListener(new c22.e(bVar, i19));
                        eVarA.show();
                        return;
                    case 2:
                        db1.a aVar9 = bVar.f40467j;
                        if (aVar9 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration = aVar9.getDuration();
                        if (duration != null) {
                            iIntValue3 = duration.intValue();
                        }
                        DateTime dateTime3 = new DateTime();
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        r0Var.f105810a = new DateTime();
                        db1.a aVar10 = bVar.f40467j;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp = aVar10.getStartTimestamp();
                        if (startTimestamp != null) {
                            ?? PlusMinutes = new DateTime(startTimestamp.getMillis()).plusMinutes(1);
                            PlusMinutes.getClass();
                            r0Var.f105810a = PlusMinutes;
                        }
                        DateTime dateTime4 = new DateTime(((DateTime) r0Var.f105810a).getMillis() + ((long) ((iIntValue3 - 60) * 1000)));
                        int hourOfDay = dateTime4.getHourOfDay();
                        int minuteOfHour = dateTime4.getMinuteOfHour();
                        int hourOfDay2 = ((DateTime) r0Var.f105810a).getHourOfDay();
                        int minuteOfHour2 = ((DateTime) r0Var.f105810a).getMinuteOfHour();
                        Days daysDaysBetween = Days.daysBetween((ReadableInstant) r0Var.f105810a, dateTime3);
                        f2 f2Var = new f2(bVar.requireContext(), new f(dateTime4, r0Var, bVar, i18), hourOfDay, minuteOfHour, hourOfDay2, minuteOfHour2, daysDaysBetween.getDays() > 0 ? 23 : dateTime3.getHourOfDay(), daysDaysBetween.getDays() > 0 ? 59 : dateTime3.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var.show();
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        og.a.W(f2Var, contextRequireContext2);
                        Context contextRequireContext3 = bVar.requireContext();
                        contextRequireContext3.getClass();
                        og.a.w(f2Var, contextRequireContext3);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar11 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = new DateTime();
                        db1.a aVar12 = bVar.f40467j;
                        if (aVar12 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp2 = aVar12.getStartTimestamp();
                        if (startTimestamp2 != null) {
                            r0Var2.f105810a = new DateTime(startTimestamp2.getMillis());
                        }
                        int hourOfDay3 = ((DateTime) r0Var2.f105810a).getHourOfDay();
                        int minuteOfHour3 = ((DateTime) r0Var2.f105810a).getMinuteOfHour();
                        db1.a aVar13 = bVar.f40467j;
                        if (aVar13 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration2 = aVar13.getDuration();
                        if (duration2 != null) {
                            iIntValue3 = duration2.intValue();
                        }
                        DateTime dateTimeMinusMinutes = new DateTime(((DateTime) r0Var2.f105810a).getMillis() + ((long) (iIntValue3 * 1000))).minusMinutes(1);
                        f2 f2Var2 = new f2(bVar.requireContext(), new f(r0Var2, dateTimeMinusMinutes, bVar), hourOfDay3, minuteOfHour3, 0, 0, dateTimeMinusMinutes.getHourOfDay(), dateTimeMinusMinutes.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var2.show();
                        Context contextRequireContext4 = bVar.requireContext();
                        contextRequireContext4.getClass();
                        og.a.W(f2Var2, contextRequireContext4);
                        Context contextRequireContext5 = bVar.requireContext();
                        contextRequireContext5.getClass();
                        og.a.w(f2Var2, contextRequireContext5);
                        return;
                }
            }
        });
        db1.a aVar5 = this.f40467j;
        if (aVar5 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        db1.g gVarF = aVar5.getMovementType();
        if (gVarF != null) {
            this.f40469l = gVarF;
        }
        RecyclerView recyclerView = this.f40461d;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("mMovementTypeList");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecyclerView recyclerView2 = this.f40461d;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("mMovementTypeList");
            throw null;
        }
        recyclerView2.setAdapter((d0) this.f40478w.getValue());
        TextView textView = this.f40462e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mDeleteMovement");
            throw null;
        }
        textView.setVisibility(this.f40471n ? 8 : 0);
        TextView textView2 = this.f40462e;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mDeleteMovement");
            throw null;
        }
        final int i17 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: fb1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70225b;

            {
                this.f70225b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v6, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r3v10, types: [T, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.Object, org.joda.time.DateTime] */
            /* JADX WARN: Type inference failed for: r9v0, types: [T, org.joda.time.DateTime] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                int i19 = 0;
                int iIntValue3 = DateTimeConstants.SECONDS_PER_HOUR;
                int i110 = 1;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar = this.f70225b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        View viewInflate = View.inflate(bVar.requireContext(), R.layout.gcm_create_manual_activity_number_of_lengths, null);
                        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.create_activity_number_of_lengths_number_picker);
                        numberPicker.setMinValue(0);
                        numberPicker.setMaxValue(100);
                        db1.a aVar7 = bVar.f40467j;
                        if (aVar7 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer count = aVar7.getCount();
                        numberPicker.setValue(count != null ? count.intValue() : 0);
                        androidx.appcompat.app.e.a aVar8 = new androidx.appcompat.app.e.a(bVar.requireContext());
                        aVar8.setTitle(bVar.getString(R.string.pregnancy_movement_total));
                        aVar8.setView(viewInflate);
                        aVar8.setPositiveButton(R.string.lbl_ok, new ag0.d(24, numberPicker, bVar));
                        aVar8.setNegativeButton(R.string.lbl_cancel, new f20.i(3));
                        aVar8.show();
                        return;
                    case 1:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar9 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        o13.p pVar = new o13.p(bVar.getString(R.string.lbl_delete), new g(bVar, 2));
                        o13.p pVar2 = new o13.p(bVar.getString(R.string.lbl_cancel), new ex.b(18));
                        c22.f fVar = c22.f.f23050a;
                        Context contextRequireContext = bVar.requireContext();
                        contextRequireContext.getClass();
                        fVar.getClass();
                        androidx.appcompat.app.e eVarA = c22.f.a(contextRequireContext, R.string.pregnancy_delete_movement_questions, R.string.pregnancy_delete_movement_message, pVar, pVar2);
                        eVarA.setOnShowListener(new c22.e(bVar, i110));
                        eVarA.show();
                        return;
                    case 2:
                        db1.a aVar10 = bVar.f40467j;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration = aVar10.getDuration();
                        if (duration != null) {
                            iIntValue3 = duration.intValue();
                        }
                        DateTime dateTime3 = new DateTime();
                        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                        r0Var.f105810a = new DateTime();
                        db1.a aVar11 = bVar.f40467j;
                        if (aVar11 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp = aVar11.getStartTimestamp();
                        if (startTimestamp != null) {
                            ?? PlusMinutes = new DateTime(startTimestamp.getMillis()).plusMinutes(1);
                            PlusMinutes.getClass();
                            r0Var.f105810a = PlusMinutes;
                        }
                        DateTime dateTime4 = new DateTime(((DateTime) r0Var.f105810a).getMillis() + ((long) ((iIntValue3 - 60) * 1000)));
                        int hourOfDay = dateTime4.getHourOfDay();
                        int minuteOfHour = dateTime4.getMinuteOfHour();
                        int hourOfDay2 = ((DateTime) r0Var.f105810a).getHourOfDay();
                        int minuteOfHour2 = ((DateTime) r0Var.f105810a).getMinuteOfHour();
                        Days daysDaysBetween = Days.daysBetween((ReadableInstant) r0Var.f105810a, dateTime3);
                        f2 f2Var = new f2(bVar.requireContext(), new f(dateTime4, r0Var, bVar, i19), hourOfDay, minuteOfHour, hourOfDay2, minuteOfHour2, daysDaysBetween.getDays() > 0 ? 23 : dateTime3.getHourOfDay(), daysDaysBetween.getDays() > 0 ? 59 : dateTime3.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var.show();
                        Context contextRequireContext2 = bVar.requireContext();
                        contextRequireContext2.getClass();
                        og.a.W(f2Var, contextRequireContext2);
                        Context contextRequireContext3 = bVar.requireContext();
                        contextRequireContext3.getClass();
                        og.a.w(f2Var, contextRequireContext3);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar12 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                        p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = new DateTime();
                        db1.a aVar13 = bVar.f40467j;
                        if (aVar13 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        DateTime startTimestamp2 = aVar13.getStartTimestamp();
                        if (startTimestamp2 != null) {
                            r0Var2.f105810a = new DateTime(startTimestamp2.getMillis());
                        }
                        int hourOfDay3 = ((DateTime) r0Var2.f105810a).getHourOfDay();
                        int minuteOfHour3 = ((DateTime) r0Var2.f105810a).getMinuteOfHour();
                        db1.a aVar14 = bVar.f40467j;
                        if (aVar14 == null) {
                            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                            throw null;
                        }
                        Integer duration2 = aVar14.getDuration();
                        if (duration2 != null) {
                            iIntValue3 = duration2.intValue();
                        }
                        DateTime dateTimeMinusMinutes = new DateTime(((DateTime) r0Var2.f105810a).getMillis() + ((long) (iIntValue3 * 1000))).minusMinutes(1);
                        f2 f2Var2 = new f2(bVar.requireContext(), new f(r0Var2, dateTimeMinusMinutes, bVar), hourOfDay3, minuteOfHour3, 0, 0, dateTimeMinusMinutes.getHourOfDay(), dateTimeMinusMinutes.getMinuteOfHour(), DateFormat.is24HourFormat(bVar.requireContext()));
                        f2Var2.show();
                        Context contextRequireContext4 = bVar.requireContext();
                        contextRequireContext4.getClass();
                        og.a.W(f2Var2, contextRequireContext4);
                        Context contextRequireContext5 = bVar.requireContext();
                        contextRequireContext5.getClass();
                        og.a.w(f2Var2, contextRequireContext5);
                        return;
                }
            }
        });
        int iH = d53.w.H("Track timed sessions of baby movements on your wrist using the  <link>Garmin pregnancy app </link>for your watch.", "<link>", 0, false, 6);
        int iH2 = d53.w.H("Track timed sessions of baby movements on your wrist using the  <link>Garmin pregnancy app </link>for your watch.", "</link>", 0, false, 6) - 6;
        SpannableString spannableString = new SpannableString(d53.u.v(d53.u.v("Track timed sessions of baby movements on your wrist using the  <link>Garmin pregnancy app </link>for your watch.", "<link>", "", false), "</link>", "", false));
        spannableString.setSpan(new fb1.j(this), iH, iH2, 33);
        TextView textView3 = this.f40463f;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementHelpText");
            throw null;
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView4 = this.f40463f;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementHelpText");
            throw null;
        }
        textView4.setHighlightColor(0);
        TextView textView5 = this.f40463f;
        if (textView5 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementHelpText");
            throw null;
        }
        textView5.setLinksClickable(true);
        TextView textView6 = this.f40463f;
        if (textView6 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementHelpText");
            throw null;
        }
        textView6.setText(spannableString);
        requireActivity().invalidateOptionsMenu();
    }

    public final String u6(int i14, int i15) {
        if (!this.f40474q) {
            return c22.j0.u((i14 * 60) + i15);
        }
        l3.f23124b.getClass();
        String strD1 = l3.a.d1((i14 * 60) + i15);
        return strD1 == null ? "" : strD1;
    }

    public final boolean v6() {
        db1.a aVar = this.f40467j;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        if (aVar.getDuration() == null) {
            return false;
        }
        db1.a aVar2 = this.f40467j;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        Integer numD = aVar2.getDuration();
        numD.getClass();
        if (numD.intValue() > 35940) {
            return false;
        }
        db1.a aVar3 = this.f40467j;
        if (aVar3 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        if (aVar3.getMovementType() == null) {
            return false;
        }
        db1.a aVar4 = this.f40467j;
        if (aVar4 == null) {
            p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
            throw null;
        }
        if (aVar4.getCount() == null) {
            return false;
        }
        db1.a aVar5 = this.f40467j;
        if (aVar5 != null) {
            return aVar5.getStartTimestamp() != null;
        }
        p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
        throw null;
    }

    public final void w6(cx0.a<ww0.b> aVar) {
        g22.e.f(this);
        if (aVar != null) {
            if (aVar.f56599a != null) {
                A.info("Returning to caller activity");
                requireActivity().setResult(-1, new Intent());
                requireActivity().finish();
                return;
            }
            if (aVar.f56602d) {
                return;
            }
            Integer num = aVar.f56601c;
            if (num != null && num.intValue() == 412) {
                DataStorageConsentActivity.a aVar2 = DataStorageConsentActivity.f32194t;
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                DataStorageConsentActivity.a.c(aVar2, contextRequireContext);
            } else if (this.f40473p < 3) {
                o13.p pVar = new o13.p(getString(R.string.lbl_retry), new fb1.g(this, 0));
                o13.p pVar2 = new o13.p(getString(R.string.lbl_cancel), new fb1.g(this, 1));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext2 = requireContext();
                contextRequireContext2.getClass();
                fVar.getClass();
                c22.f.a(contextRequireContext2, R.string.pregnancy_something_went_wrong, R.string.connect_iq_try_again, pVar, pVar2).show();
            } else {
                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(requireContext());
                aVar3.setMessage(getString(R.string.pregnancy_something_went_wrong));
                aVar3.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
                androidx.appcompat.app.e eVarCreate = aVar3.create();
                eVarCreate.getClass();
                eVarCreate.show();
                this.f40473p = 0;
            }
            aVar.f56602d = true;
        }
    }

    public final void y6() {
        LocalDate localDate = (LocalDate) this.f40476t.getValue();
        if (localDate != null) {
            boolean z14 = this.f40471n;
            w1 w1Var = this.f40475r;
            if (z14) {
                g22.e.l(this);
                fb1.l lVar = (fb1.l) w1Var.getValue();
                ww0.b bVar = this.f40468k;
                if (bVar == null) {
                    p005kotlin.jvm.internal.s.m("mDailyMenstrualCycleLogDTO");
                    throw null;
                }
                db1.a aVar = this.f40467j;
                if (aVar == null) {
                    p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                    throw null;
                }
                y0 y0VarX4 = lVar.x4(localDate, bVar, aVar, -1);
                final int i14 = 0;
                dh.b.L(y0VarX4, this, new c(new e23.l(this) { // from class: fb1.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70248b;

                    {
                        this.f70248b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar2 = this.f70248b;
                        cx0.a<ww0.b> aVar2 = (cx0.a) obj;
                        switch (i15) {
                            case 0:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar2.w6(aVar2);
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar2.w6(aVar2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar2.w6(aVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return;
            }
            if (this.f40472o) {
                g22.e.l(this);
                fb1.l lVar2 = (fb1.l) w1Var.getValue();
                ww0.b bVar2 = this.f40468k;
                if (bVar2 == null) {
                    p005kotlin.jvm.internal.s.m("mDailyMenstrualCycleLogDTO");
                    throw null;
                }
                y0 y0VarX5 = lVar2.x4(localDate, bVar2, null, this.f40470m);
                final int i15 = 1;
                dh.b.L(y0VarX5, this, new c(new e23.l(this) { // from class: fb1.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70248b;

                    {
                        this.f70248b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar3 = this.f70248b;
                        cx0.a<ww0.b> aVar2 = (cx0.a) obj;
                        switch (i16) {
                            case 0:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar3.w6(aVar2);
                                break;
                            case 1:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar3.w6(aVar2);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                                bVar3.w6(aVar2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                return;
            }
            g22.e.l(this);
            fb1.l lVar3 = (fb1.l) w1Var.getValue();
            ww0.b bVar3 = this.f40468k;
            if (bVar3 == null) {
                p005kotlin.jvm.internal.s.m("mDailyMenstrualCycleLogDTO");
                throw null;
            }
            db1.a aVar2 = this.f40467j;
            if (aVar2 == null) {
                p005kotlin.jvm.internal.s.m("mBabyMovementDTO");
                throw null;
            }
            y0 y0VarX6 = lVar3.x4(localDate, bVar3, aVar2, this.f40470m);
            final int i16 = 2;
            dh.b.L(y0VarX6, this, new c(new e23.l(this) { // from class: fb1.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b f70248b;

                {
                    this.f70248b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b bVar4 = this.f70248b;
                    cx0.a<ww0.b> aVar3 = (cx0.a) obj;
                    switch (i17) {
                        case 0:
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar4 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                            bVar4.w6(aVar3);
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                            bVar4.w6(aVar3);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                            bVar4.w6(aVar3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DAILY_MENSTRUAL_CYCLE_LOG_DTO", "EXTRA_BABY_MOVEMENT_LOG_DATE", "", "INITIAL_TIME", "I", "MAX_DURATION", "DEFAULT_MOVEMENT_COUNT", "BABY_MOVEMENT_HELP_TEXT", "EXTRA_SELECTED_INDEX", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
