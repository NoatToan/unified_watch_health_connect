package com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import e23.l;
import fw.m;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import rw.g;
import rw.h;
import rw.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/add_blood_pressure/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0493a f30916d = new C0493a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f30917a = new w1(s0.f105811a.b(i.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f30918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f30919c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/blood_pressure/presentation/add_blood_pressure/a$b", "Landroidx/core/view/s;", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.save_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
            menuItemFindItem.getClass();
            a aVar = a.this;
            aVar.f30918b = menuItemFindItem;
            aVar.v6().f154817c.f(aVar.getViewLifecycleOwner(), new c(new rw.a(aVar, 6)));
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
            g gVar = aVar.f30919c;
            if (gVar == null) {
                p005kotlin.jvm.internal.s.m("viewBinder");
                throw null;
            }
            gVar.f154797k.clearFocus();
            gVar.f154800n.clearFocus();
            gVar.f154803q.clearFocus();
            gVar.f154809w.clearFocus();
            i iVarV6 = aVar.v6();
            y0 y0Var = new y0();
            y0<pw.a> y0Var2 = iVarV6.f154816b;
            pw.a aVarD = y0Var2.d();
            if (aVarD != null) {
                Date time = iVarV6.f154818d.getTime();
                time.getClass();
                aVarD.q(j0.e(j0.g(time, "yyyy-MM-dd'T'HH:mm:ss.SSS", null), DateTimeZone.getDefault(), "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.getDefault()));
                j0 j0Var = j0.f23099a;
                Calendar calendar = iVarV6.f154818d;
                j0Var.getClass();
                calendar.getClass();
                aVarD.o(j0.e(j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", null), DateTimeZone.getDefault(), "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC));
                aVarD.s();
                y0Var2.j(aVarD);
                y0Var.m(m.a.f(m.f73767e, null, null, 3));
                ge1.b.T(v1.a(iVarV6), null, null, new h(iVarV6, aVarD, y0Var, null), 3);
            }
            y0Var.f(aVar.getViewLifecycleOwner(), new c(new rw.a(aVar, 5)));
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f30921a;

        public c(l lVar) {
            lVar.getClass();
            this.f30921a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30921a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30921a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f30922a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30922a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f30924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f30923a = aVar;
            this.f30924b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30923a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30924b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30925a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f30925a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30925a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_add_manual_blood_pressure_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), b0.b.RESUMED);
        Bundle arguments = getArguments();
        Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong("extra.date.time")) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            i iVarV6 = v6();
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            iVarV6.f154818d.setTimeInMillis(jLongValue);
            iVarV6.f154818d.set(10, calendar.get(10));
            iVarV6.f154818d.set(12, calendar.get(12));
            iVarV6.f154818d.set(13, calendar.get(13));
            iVarV6.f154818d.set(9, calendar.get(9));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final g gVar = new g(view2, new yw.b(contextRequireContext), new rw.a(this, 0), new r12.a(this, 25), new rw.a(this, 1), new rw.a(this, 2), new rw.a(this, 3), new rw.a(this, 4));
        this.f30919c = gVar;
        pw.a aVar = (pw.a) v6().f154817c.d();
        final Calendar calendar2 = v6().f154818d;
        calendar2.getClass();
        final int i14 = 0;
        gVar.f154794h.setOnClickListener(new View.OnClickListener() { // from class: rw.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        gVar.f154788b.invoke(calendar2);
                        break;
                    default:
                        g gVar2 = gVar;
                        gVar2.f154789c.invoke(calendar2, Boolean.valueOf(gVar2.c()));
                        break;
                }
            }
        });
        gVar.a(calendar2);
        final int i15 = 1;
        gVar.f154795i.setOnClickListener(new View.OnClickListener() { // from class: rw.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        gVar.f154788b.invoke(calendar2);
                        break;
                    default:
                        g gVar2 = gVar;
                        gVar2.f154789c.invoke(calendar2, Boolean.valueOf(gVar2.c()));
                        break;
                }
            }
        });
        gVar.b(calendar2);
        yw.b bVar = gVar.f154787a;
        l22.a aVar2 = bVar.f199875a;
        l3.a aVar3 = l3.f23124b;
        aVar3.getClass();
        gVar.f154798l.setText(aVar2.a(R.string.lbl_range_limits, l3.a.B(40.0d), l3.a.B(300.0d)));
        aVar3.getClass();
        gVar.f154801o.setText(aVar2.a(R.string.lbl_range_limits, l3.a.B(30.0d), l3.a.B(200.0d)));
        gVar.f154804r.setText(bVar.h());
        final int i16 = 2;
        gVar.f154797k.i(new h32.h.c(yw.b.d(aVar != null ? aVar.getSystolic() : null), "", null, null, null, new l() { // from class: rw.c
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:30:0x008c  */
            /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z14;
                boolean z15;
                boolean z16;
                String str = (String) obj;
                switch (i16) {
                    case 0:
                        str.getClass();
                        Double dValueOf = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar2 = gVar;
                        gVar2.f154791e.invoke(dValueOf);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = gVar2.f154800n;
                        yw.d.f199882a.getClass();
                        if (dValueOf == null) {
                            z14 = false;
                        } else {
                            double dDoubleValue = dValueOf.doubleValue();
                            if (30.0d > dDoubleValue || dDoubleValue > 200.0d) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                        }
                        styledInlineTextFieldViewDark.setHasError(true ^ z14);
                        gVar2.f154799m.setContentDescription(gVar2.f154787a.f(dValueOf));
                        break;
                    case 1:
                        str.getClass();
                        Double dValueOf2 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar3 = gVar;
                        gVar3.f154792f.invoke(dValueOf2);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = gVar3.f154803q;
                        yw.d.f199882a.getClass();
                        if (dValueOf2 == null) {
                            z15 = true;
                        } else {
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            if (1.0d > dDoubleValue2 || dDoubleValue2 > 300.0d) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                        }
                        styledInlineTextFieldViewDark2.setHasError(true ^ z15);
                        gVar3.f154802p.setContentDescription(gVar3.f154787a.i(dValueOf2));
                        break;
                    default:
                        str.getClass();
                        Double dValueOf3 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar4 = gVar;
                        gVar4.f154790d.invoke(dValueOf3);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = gVar4.f154797k;
                        yw.d.f199882a.getClass();
                        if (dValueOf3 == null) {
                            z16 = false;
                        } else {
                            double dDoubleValue3 = dValueOf3.doubleValue();
                            if (40.0d > dDoubleValue3 || dDoubleValue3 > 300.0d) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                        }
                        styledInlineTextFieldViewDark3.setHasError(true ^ z16);
                        gVar4.f154796j.setContentDescription(gVar4.f154787a.j(dValueOf3));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, null, 2, false, "0123456789", null, 2780, null));
        gVar.f154796j.setContentDescription(bVar.j(aVar != null ? aVar.getSystolic() : null));
        final int i17 = 0;
        gVar.f154800n.i(new h32.h.c(yw.b.d(aVar != null ? aVar.getDiastolic() : null), "", null, null, null, new l() { // from class: rw.c
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:30:0x008c  */
            /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z14;
                boolean z15;
                boolean z16;
                String str = (String) obj;
                switch (i17) {
                    case 0:
                        str.getClass();
                        Double dValueOf = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar2 = gVar;
                        gVar2.f154791e.invoke(dValueOf);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = gVar2.f154800n;
                        yw.d.f199882a.getClass();
                        if (dValueOf == null) {
                            z14 = false;
                        } else {
                            double dDoubleValue = dValueOf.doubleValue();
                            if (30.0d > dDoubleValue || dDoubleValue > 200.0d) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                        }
                        styledInlineTextFieldViewDark.setHasError(true ^ z14);
                        gVar2.f154799m.setContentDescription(gVar2.f154787a.f(dValueOf));
                        break;
                    case 1:
                        str.getClass();
                        Double dValueOf2 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar3 = gVar;
                        gVar3.f154792f.invoke(dValueOf2);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = gVar3.f154803q;
                        yw.d.f199882a.getClass();
                        if (dValueOf2 == null) {
                            z15 = true;
                        } else {
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            if (1.0d > dDoubleValue2 || dDoubleValue2 > 300.0d) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                        }
                        styledInlineTextFieldViewDark2.setHasError(true ^ z15);
                        gVar3.f154802p.setContentDescription(gVar3.f154787a.i(dValueOf2));
                        break;
                    default:
                        str.getClass();
                        Double dValueOf3 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar4 = gVar;
                        gVar4.f154790d.invoke(dValueOf3);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = gVar4.f154797k;
                        yw.d.f199882a.getClass();
                        if (dValueOf3 == null) {
                            z16 = false;
                        } else {
                            double dDoubleValue3 = dValueOf3.doubleValue();
                            if (40.0d > dDoubleValue3 || dDoubleValue3 > 300.0d) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                        }
                        styledInlineTextFieldViewDark3.setHasError(true ^ z16);
                        gVar4.f154796j.setContentDescription(gVar4.f154787a.j(dValueOf3));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, null, 2, false, "0123456789", null, 2780, null));
        gVar.f154799m.setContentDescription(bVar.f(aVar != null ? aVar.getDiastolic() : null));
        final int i18 = 1;
        gVar.f154803q.i(new h32.h.c(yw.b.d(aVar != null ? aVar.getPulse() : null), "", null, null, null, new l() { // from class: rw.c
            /* JADX WARN: Code duplicated, block: B:16:0x0041  */
            /* JADX WARN: Code duplicated, block: B:30:0x008c  */
            /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                boolean z14;
                boolean z15;
                boolean z16;
                String str = (String) obj;
                switch (i18) {
                    case 0:
                        str.getClass();
                        Double dValueOf = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar2 = gVar;
                        gVar2.f154791e.invoke(dValueOf);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = gVar2.f154800n;
                        yw.d.f199882a.getClass();
                        if (dValueOf == null) {
                            z14 = false;
                        } else {
                            double dDoubleValue = dValueOf.doubleValue();
                            if (30.0d > dDoubleValue || dDoubleValue > 200.0d) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                        }
                        styledInlineTextFieldViewDark.setHasError(true ^ z14);
                        gVar2.f154799m.setContentDescription(gVar2.f154787a.f(dValueOf));
                        break;
                    case 1:
                        str.getClass();
                        Double dValueOf2 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar3 = gVar;
                        gVar3.f154792f.invoke(dValueOf2);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = gVar3.f154803q;
                        yw.d.f199882a.getClass();
                        if (dValueOf2 == null) {
                            z15 = true;
                        } else {
                            double dDoubleValue2 = dValueOf2.doubleValue();
                            if (1.0d > dDoubleValue2 || dDoubleValue2 > 300.0d) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                        }
                        styledInlineTextFieldViewDark2.setHasError(true ^ z15);
                        gVar3.f154802p.setContentDescription(gVar3.f154787a.i(dValueOf2));
                        break;
                    default:
                        str.getClass();
                        Double dValueOf3 = str.length() == 0 ? null : Double.valueOf(Double.parseDouble(str));
                        g gVar4 = gVar;
                        gVar4.f154790d.invoke(dValueOf3);
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = gVar4.f154797k;
                        yw.d.f199882a.getClass();
                        if (dValueOf3 == null) {
                            z16 = false;
                        } else {
                            double dDoubleValue3 = dValueOf3.doubleValue();
                            if (40.0d > dDoubleValue3 || dDoubleValue3 > 300.0d) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                        }
                        styledInlineTextFieldViewDark3.setHasError(true ^ z16);
                        gVar4.f154796j.setContentDescription(gVar4.f154787a.j(dValueOf3));
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, null, 2, false, "0123456789", null, 2780, null));
        gVar.f154802p.setContentDescription(bVar.i(aVar != null ? aVar.getPulse() : null));
        ew1.l lVar = new ew1.l(5, gVar, aVar);
        EditText editText = gVar.f154809w;
        editText.setOnFocusChangeListener(lVar);
        editText.addTextChangedListener(new rw.f(gVar));
        pm0.h hVar = new pm0.h(15, gVar, aVar);
        RelativeLayout relativeLayout = gVar.f154805s;
        relativeLayout.setOnClickListener(hVar);
        gVar.f154808v.setOnClickListener(new oq.a(gVar, 20));
        String notes = aVar != null ? aVar.getNotes() : null;
        LinearLayout linearLayout = gVar.f154806t;
        if (notes == null) {
            v22.e.q(relativeLayout);
            v22.e.j(linearLayout);
        } else {
            String notes2 = aVar.getNotes();
            v22.e.j(relativeLayout);
            v22.e.q(linearLayout);
            editText.setText(notes2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(int i14) {
        Intent intent = new Intent();
        pw.a aVar = (pw.a) v6().f154817c.d();
        intent.putExtra("extra.date.time", aVar != null ? Long.valueOf(aVar.k()) : null);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.setResult(i14, intent);
        mVarRequireActivity.finish();
    }

    public final i v6() {
        return (i) this.f30917a.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/blood_pressure/presentation/add_blood_pressure/a$a;", "", "<init>", "()V", "", "WAIT_UNTIL_DIALOG_CLOSES", "J", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0493a {
        public /* synthetic */ C0493a(j jVar) {
            this();
        }

        private C0493a() {
        }
    }
}
