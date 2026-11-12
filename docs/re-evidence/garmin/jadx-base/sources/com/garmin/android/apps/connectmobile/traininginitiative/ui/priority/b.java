package com.garmin.android.apps.connectmobile.traininginitiative.ui.priority;

import am.l1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c2.x2;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import e23.l;
import fg0.j;
import fg0.k;
import fw.p;
import h4.r;
import h5.e0;
import i3.d6;
import i3.mh;
import iz1.i;
import l72.f0;
import l72.p2;
import o13.h;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Ldg0/a;", "selectedItem", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46192e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f46193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iz1.g f46195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f46196d;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0895b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46197a;

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
            f46197a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/ui/priority/b$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            k kVar;
            a aVar = b.f46192e;
            b bVar = b.this;
            if (!bVar.v6().X) {
                m activity = bVar.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (!bVar.v6().Y) {
                m activity2 = bVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                    return;
                }
                return;
            }
            if (bVar.v6().Z) {
                Intent intent = new Intent();
                intent.putExtra("extra_show_event_added_snack_bar", true);
                m activity3 = bVar.getActivity();
                if (activity3 != null) {
                    activity3.setResult(-1, intent);
                }
                m activity4 = bVar.getActivity();
                if (activity4 != null) {
                    activity4.finish();
                    return;
                }
                return;
            }
            CalendarItemDTO calendarItemDTO = bVar.v6().T;
            if (calendarItemDTO != null && (kVar = bVar.v6().I) != null) {
                EventDetailsActivity.a aVar2 = EventDetailsActivity.f45692o;
                Context contextRequireContext = bVar.requireContext();
                contextRequireContext.getClass();
                aVar2.getClass();
                bVar.requireActivity().startActivity(EventDetailsActivity.a.b(contextRequireContext, calendarItemDTO, kVar, false));
            }
            m activity5 = bVar.getActivity();
            if (activity5 != null) {
                activity5.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46199a;

        public d(l lVar) {
            lVar.getClass();
            this.f46199a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46199a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46199a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f46200a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f46200a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f46201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f46202b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f46201a = aVar;
            this.f46202b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f46201a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f46202b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f46203a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f46203a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f46203a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        super(R.layout.composable_container);
        this.f46193a = new w1(s0.f105811a.b(i.class), new e(this), new g(this), new f(null, this));
        this.f46195c = new iz1.g(this, 0);
        this.f46196d = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m activity = getActivity();
        TrainingPrioritySelectionActivity trainingPrioritySelectionActivity = activity instanceof TrainingPrioritySelectionActivity ? (TrainingPrioritySelectionActivity) activity : null;
        if (trainingPrioritySelectionActivity != null) {
            String string = getString(R.string.training_priority);
            string.getClass();
            trainingPrioritySelectionActivity.updateActionBar(string, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new iz1.h(this), b0.b.RESUMED);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f46196d, viewLifecycleOwner);
        v6().M4().f(getViewLifecycleOwner(), this.f46195c);
        v6().M0.f(getViewLifecycleOwner(), new d(new hy.h(27, this, view2)));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0403  */
    /* JADX WARN: Code duplicated, block: B:105:0x0436  */
    /* JADX WARN: Code duplicated, block: B:106:0x043a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0467  */
    /* JADX WARN: Code duplicated, block: B:112:0x0481  */
    /* JADX WARN: Code duplicated, block: B:114:0x0486  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x024e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0254  */
    /* JADX WARN: Code duplicated, block: B:61:0x0259  */
    /* JADX WARN: Code duplicated, block: B:64:0x0267  */
    /* JADX WARN: Code duplicated, block: B:65:0x026c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0281  */
    /* JADX WARN: Code duplicated, block: B:71:0x0285  */
    /* JADX WARN: Code duplicated, block: B:74:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0327  */
    /* JADX WARN: Code duplicated, block: B:92:0x035c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0371  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:99:0x03cf  */
    public final void u6(jz1.b bVar, p3.m mVar, int i14) {
        b bVar2;
        jz1.b bVar3;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        o0 o0Var;
        k kVar;
        b bVar4;
        String string;
        String str;
        z zVarA2;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        byte b14;
        Object objQ;
        int i15;
        boolean zR;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        Integer num;
        int iIntValue;
        LocalDate date;
        DateTime dateTimeAtStartOfDay;
        dg0.a aVar;
        j eventCustomization;
        o0 o0VarE = mVar.E(536896213);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ5 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ5 == c2565a2) {
                k kVar2 = v6().I;
                if (kVar2 == null || (eventCustomization = kVar2.getEventCustomization()) == null) {
                    aVar = dg0.a.SUPPORTING_EVENT;
                } else {
                    Boolean isPrimaryEvent = eventCustomization.getIsPrimaryEvent();
                    Boolean bool = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(isPrimaryEvent, bool)) {
                        aVar = dg0.a.PRIMARY_EVENT;
                    } else {
                        aVar = p005kotlin.jvm.internal.s.g(eventCustomization.getIsTrainingEvent(), bool) ? dg0.a.SUPPORTING_EVENT : dg0.a.NO_PRIORITY;
                    }
                    if (aVar == null) {
                        aVar = dg0.a.SUPPORTING_EVENT;
                    }
                }
                objQ5 = p0.n(aVar);
                o0VarE.K(objQ5);
            }
            p1 p1Var2 = (p1) objQ5;
            r.a aVar2 = r.S;
            r rVarD = x2.d(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar5 = d92.b.f58625c;
            bVar5.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            r rVarA = c2.l.A(rVarD, 0.0f, f14, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar3 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA3 = y.a(kVar3, aVar3, o0VarE, 0);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar6 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar2, 1.0f), 1.0f, true), a2.a(o0VarE), true);
                zVarA = y.a(kVar3, h4.d.a.f81537o, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
                }
                b4.c(fVar, rVarC, o0VarE);
                r rVarF = x2.f(aVar2, 1.0f);
                bVar5.getClass();
                r rVarA2 = c2.l.A(rVarF, f15, 0.0f, 2);
                d6.h.f57752b.getClass();
                int i17 = d6.h.f57755e;
                String strQ = gl1.y.Q(o0VarE, R.string.choose_training_priority);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0Var = j92.f.f97931h;
                mh.c(strQ, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 130044);
                r rVarF2 = x2.f(aVar2, 1.0f);
                bVar5.getClass();
                float f16 = eVar.f97918c;
                bVar5.getClass();
                float f17 = eVar.f97920e;
                bVar5.getClass();
                r rVarC4 = c2.l.C(rVarF2, f17, f16, eVar.f97920e, 0.0f, 8);
                String strQ2 = gl1.y.Q(o0VarE, R.string.choose_training_priority_detail);
                fVar2.getClass();
                mh.c(strQ2, rVarC4, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 130044);
                bVar3 = bVar;
                o0Var = o0VarE;
                kVar = bVar3.f101907d;
                if (kVar == null) {
                    bVar4 = this;
                    string = bVar4.getString(dg0.a.PRIMARY_EVENT.f59513b);
                    string.getClass();
                } else {
                    num = dg0.a.PRIMARY_EVENT.f59514c;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Parcelable.Creator<k> creator = k.CREATOR;
                    String strR = kVar.r(false);
                    date = kVar.getDate();
                    if (date != null) {
                        dateTimeAtStartOfDay = date.toDateTimeAtStartOfDay();
                    } else {
                        dateTimeAtStartOfDay = null;
                    }
                    string = context.getString(iIntValue, strR, j0.a(dateTimeAtStartOfDay, 'L'));
                    if (string == null) {
                        bVar4 = this;
                        string = bVar4.getString(dg0.a.PRIMARY_EVENT.f59513b);
                        string.getClass();
                    } else {
                        bVar4 = this;
                    }
                }
                str = string;
                bVar5.getClass();
                r rVarC5 = c2.l.C(aVar2, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
                zVarA2 = y.a(kVar3, aVar3, o0Var, 0);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarC5, o0Var);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar4);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, zVarA2, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar6);
                }
                b4.c(fVar, rVarC2, o0Var);
                if (bVar3.f101905b) {
                    bVar2 = bVar4;
                    c2565a = c2565a2;
                    p1Var = p1Var2;
                    o0Var.C(-624246453);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-625137300);
                    p2 p2Var = p2.f111205a;
                    String string2 = bVar4.getString(dg0.a.PRIMARY_EVENT.f59512a);
                    string2.getClass();
                    z3.e eVarC = z3.f.c(-205522881, new l1(p1Var2, 14, (byte) 0), o0Var);
                    objQ4 = o0Var.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new i11.i(p1Var2, 22);
                        o0Var.K(objQ4);
                    }
                    bVar2 = bVar4;
                    p1Var = p1Var2;
                    c2565a = c2565a2;
                    p2Var.h(string2, str, null, null, null, false, false, null, eVarC, null, (e23.a) objQ4, o0Var, 100663296, 6, 764);
                    o0Var = o0Var;
                    o0Var.g0(false);
                }
                if (bVar3.f101906c) {
                    b14 = 0;
                    o0Var.C(-623219733);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-624156708);
                    p2 p2Var2 = p2.f111205a;
                    dg0.a aVar5 = dg0.a.SUPPORTING_EVENT;
                    String string3 = bVar2.getString(aVar5.f59512a);
                    string3.getClass();
                    String string4 = bVar2.getString(aVar5.f59513b);
                    string4.getClass();
                    z3.e eVarC2 = z3.f.c(-1256848970, new l1(p1Var, 15, (byte) 0), o0Var);
                    objQ3 = o0Var.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new i11.i(p1Var, 23);
                        o0Var.K(objQ3);
                    }
                    o0 o0Var2 = o0Var;
                    p2Var2.h(string3, string4, null, null, null, false, false, null, eVarC2, null, (e23.a) objQ3, o0Var2, 100663296, 6, 764);
                    o0Var = o0Var2;
                    b14 = 0;
                    o0Var.g0(false);
                }
                p2 p2Var3 = p2.f111205a;
                dg0.a aVar6 = dg0.a.NO_PRIORITY;
                String string5 = bVar2.getString(aVar6.f59512a);
                string5.getClass();
                String string6 = bVar2.getString(aVar6.f59513b);
                string6.getClass();
                z3.e eVarC3 = z3.f.c(-2045372956, new l1(p1Var, 16, b14), o0Var);
                objQ = o0Var.q();
                if (objQ == c2565a) {
                    objQ = new i11.i(p1Var, 24);
                    o0Var.K(objQ);
                }
                o0 o0Var3 = o0Var;
                p2Var3.h(string5, string6, null, null, null, false, false, null, eVarC3, null, (e23.a) objQ, o0Var3, 100663296, 6, 764);
                o0VarE = o0Var3;
                o0VarE.g0(true);
                o0VarE.g0(true);
                if (bVar2.v6().X) {
                    i15 = R.string.lbl_finish;
                } else {
                    i15 = R.string.lbl_save;
                }
                f0 f0Var = f0.f110999a;
                String strQ3 = gl1.y.Q(o0VarE, i15);
                r rVarF3 = x2.f(aVar2, 1.0f);
                bVar5.getClass();
                r rVarA3 = c2.l.A(rVarF3, f15, 0.0f, 2);
                zR = o0VarE.r(bVar2) | o0VarE.r(bVar3);
                objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new d6(bVar2, 17, bVar3, p1Var);
                    o0VarE.K(objQ2);
                }
                f0Var.d(0, 9, (e23.a) objQ2, rVarA3, strQ3, o0VarE, null, false);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar6);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            r rVarB2 = a2.b(c2.b0.f22601a.a(x2.f(aVar2, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            zVarA = y.a(kVar3, h4.d.a.f81537o, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar6);
            }
            b4.c(fVar, rVarC, o0VarE);
            r rVarF4 = x2.f(aVar2, 1.0f);
            bVar5.getClass();
            r rVarA4 = c2.l.A(rVarF4, f15, 0.0f, 2);
            d6.h.f57752b.getClass();
            int i18 = d6.h.f57755e;
            String strQ4 = gl1.y.Q(o0VarE, R.string.choose_training_priority);
            j92.f fVar3 = d92.b.f58624b;
            fVar3.getClass();
            x0 x0Var2 = j92.f.f97931h;
            mh.c(strQ4, rVarA4, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, o0VarE), o0VarE, 0, 0, 130044);
            r rVarF5 = x2.f(aVar2, 1.0f);
            bVar5.getClass();
            float f18 = eVar.f97918c;
            bVar5.getClass();
            float f19 = eVar.f97920e;
            bVar5.getClass();
            r rVarC6 = c2.l.C(rVarF5, f19, f18, eVar.f97920e, 0.0f, 8);
            String strQ5 = gl1.y.Q(o0VarE, R.string.choose_training_priority_detail);
            fVar3.getClass();
            mh.c(strQ5, rVarC6, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.f(x0Var2, o0VarE), o0VarE, 0, 0, 130044);
            bVar3 = bVar;
            o0Var = o0VarE;
            kVar = bVar3.f101907d;
            if (kVar == null) {
                bVar4 = this;
                string = bVar4.getString(dg0.a.PRIMARY_EVENT.f59513b);
                string.getClass();
            } else {
                num = dg0.a.PRIMARY_EVENT.f59514c;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Parcelable.Creator<k> creator2 = k.CREATOR;
                String strR2 = kVar.r(false);
                date = kVar.getDate();
                if (date != null) {
                    dateTimeAtStartOfDay = date.toDateTimeAtStartOfDay();
                } else {
                    dateTimeAtStartOfDay = null;
                }
                string = context.getString(iIntValue, strR2, j0.a(dateTimeAtStartOfDay, 'L'));
                if (string == null) {
                    bVar4 = this;
                    string = bVar4.getString(dg0.a.PRIMARY_EVENT.f59513b);
                    string.getClass();
                } else {
                    bVar4 = this;
                }
            }
            str = string;
            bVar5.getClass();
            r rVarC7 = c2.l.C(aVar2, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
            zVarA2 = y.a(kVar3, aVar3, o0Var, 0);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(rVarC7, o0Var);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar4);
            } else {
                o0Var.c();
            }
            b4.c(eVar2, zVarA2, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar6);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar6);
            }
            b4.c(fVar, rVarC2, o0Var);
            if (bVar3.f101905b) {
                o0Var.C(-625137300);
                p2 p2Var4 = p2.f111205a;
                String string7 = bVar4.getString(dg0.a.PRIMARY_EVENT.f59512a);
                string7.getClass();
                z3.e eVarC4 = z3.f.c(-205522881, new l1(p1Var2, 14, (byte) 0), o0Var);
                objQ4 = o0Var.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new i11.i(p1Var2, 22);
                    o0Var.K(objQ4);
                }
                bVar2 = bVar4;
                p1Var = p1Var2;
                c2565a = c2565a2;
                p2Var4.h(string7, str, null, null, null, false, false, null, eVarC4, null, (e23.a) objQ4, o0Var, 100663296, 6, 764);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                bVar2 = bVar4;
                c2565a = c2565a2;
                p1Var = p1Var2;
                o0Var.C(-624246453);
                o0Var.g0(false);
            }
            if (bVar3.f101906c) {
                o0Var.C(-624156708);
                p2 p2Var5 = p2.f111205a;
                dg0.a aVar7 = dg0.a.SUPPORTING_EVENT;
                String string8 = bVar2.getString(aVar7.f59512a);
                string8.getClass();
                String string9 = bVar2.getString(aVar7.f59513b);
                string9.getClass();
                z3.e eVarC5 = z3.f.c(-1256848970, new l1(p1Var, 15, (byte) 0), o0Var);
                objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new i11.i(p1Var, 23);
                    o0Var.K(objQ3);
                }
                o0 o0Var4 = o0Var;
                p2Var5.h(string8, string9, null, null, null, false, false, null, eVarC5, null, (e23.a) objQ3, o0Var4, 100663296, 6, 764);
                o0Var = o0Var4;
                b14 = 0;
                o0Var.g0(false);
            } else {
                b14 = 0;
                o0Var.C(-623219733);
                o0Var.g0(false);
            }
            p2 p2Var6 = p2.f111205a;
            dg0.a aVar8 = dg0.a.NO_PRIORITY;
            String string10 = bVar2.getString(aVar8.f59512a);
            string10.getClass();
            String string11 = bVar2.getString(aVar8.f59513b);
            string11.getClass();
            z3.e eVarC6 = z3.f.c(-2045372956, new l1(p1Var, 16, b14), o0Var);
            objQ = o0Var.q();
            if (objQ == c2565a) {
                objQ = new i11.i(p1Var, 24);
                o0Var.K(objQ);
            }
            o0 o0Var5 = o0Var;
            p2Var6.h(string10, string11, null, null, null, false, false, null, eVarC6, null, (e23.a) objQ, o0Var5, 100663296, 6, 764);
            o0VarE = o0Var5;
            o0VarE.g0(true);
            o0VarE.g0(true);
            if (bVar2.v6().X) {
                i15 = R.string.lbl_finish;
            } else {
                i15 = R.string.lbl_save;
            }
            f0 f0Var2 = f0.f110999a;
            String strQ6 = gl1.y.Q(o0VarE, i15);
            r rVarF6 = x2.f(aVar2, 1.0f);
            bVar5.getClass();
            r rVarA5 = c2.l.A(rVarF6, f15, 0.0f, 2);
            zR = o0VarE.r(bVar2) | o0VarE.r(bVar3);
            objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new d6(bVar2, 17, bVar3, p1Var);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new d6(bVar2, 17, bVar3, p1Var);
                o0VarE.K(objQ2);
            }
            f0Var2.d(0, 9, (e23.a) objQ2, rVarA5, strQ6, o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            bVar2 = this;
            bVar3 = bVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new iz1.e(bVar2, bVar3, i14);
        }
    }

    public final i v6() {
        return (i) this.f46193a.getValue();
    }

    public final void w6() {
        m activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("GCM_extra_sharable_event_dto", v6().I);
            intent.putExtra("extra_show_event_added_snack_bar", true);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/priority/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
