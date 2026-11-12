package fv1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.s;
import b.u;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import ew1.r1;
import f2.o0;
import fw.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Locale;
import kotlin.w3;
import l72.p2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.p0;
import s5.x0;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfv1/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lgv1/a;", "goalData", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f73711d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f73712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f73714c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73715a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73715a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fv1/g$c", "Lb/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            g gVar = g.this;
            gVar.f73714c.f(false);
            m activity = gVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f73717a;

        public d(l lVar) {
            lVar.getClass();
            this.f73717a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f73717a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73717a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f73718a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f73718a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f73719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f73720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f73719a = aVar;
            this.f73720b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f73719a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f73720b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: fv1.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C1493g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1493g(Fragment fragment) {
            super(0);
            this.f73721a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f73721a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public g() {
        super(R.layout.composable_container);
        this.f73712a = new w1(s0.f105811a.b(ev1.b.class), new e(this), new C1493g(this), new f(null, this));
        this.f73714c = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        h hVar = new h(this);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        mVarRequireActivity.addMenuProvider(hVar, viewLifecycleOwner);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        onBackPressedDispatcher.b(this.f73714c, viewLifecycleOwner2);
        v6().M4().f(getViewLifecycleOwner(), new d(new o0(this, 23)));
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-214515334, true, new fv1.e(this, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:43:0x017c  */
    /* JADX WARN: Code duplicated, block: B:46:0x019c  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0205  */
    /* JADX WARN: Code duplicated, block: B:62:0x0209  */
    /* JADX WARN: Code duplicated, block: B:65:0x0212  */
    /* JADX WARN: Code duplicated, block: B:68:0x0230  */
    /* JADX WARN: Code duplicated, block: B:70:0x0237  */
    /* JADX WARN: Code duplicated, block: B:74:0x026b  */
    public final void u6(gv1.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        b0 b0Var;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        final int i15;
        int f180111a;
        p2 p2Var;
        boolean zR;
        Object objQ;
        p3.m.a aVar2;
        jv1.m mVar2;
        String strW6;
        int i16;
        boolean zR2;
        Object objQ2;
        vt1.f fVar2 = aVar.f79442a;
        p3.o0 o0VarE = mVar.E(1402498530);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i17 & 1, (i17 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar3 = r.S;
            r rVarD = x2.d(aVar3, 1.0f);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81536n;
            z zVarA2 = y.a(gVar, aVar4, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                r rVarA = b0Var.a(aVar3, 1.0f, true);
                zVarA = y.a(j.f22694d, aVar4, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                String upperCase = gl1.y.Q(o0VarE, R.string.event_goal).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97921f;
                float f15 = eVar2.f97920e;
                org.apache.commons.lang3.e.j(bVar2);
                i15 = 0;
                mh.c(upperCase, b0Var.b(x2.f(c2.l.B(aVar3, f15, f14, f15, eVar2.f97917b), 1.0f), aVar4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                context.getClass();
                if (fVar2 != null) {
                    f180111a = fVar2.getF180129a();
                } else {
                    f180111a = vt1.g.FINISH.f180111a;
                }
                String string = context.getString(f180111a);
                string.getClass();
                p2Var = p2.f111205a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_goal);
                zR = o0VarE.r(this);
                objQ = o0VarE.q();
                aVar2 = p3.m.f135153a;
                if (zR) {
                    objQ = new e23.a(this) { // from class: fv1.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f73710b;

                        {
                            this.f73710b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i15;
                            g gVar2 = this.f73710b;
                            switch (i18) {
                                case 0:
                                    g.a aVar6 = g.f73711d;
                                    ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                    break;
                                default:
                                    g.a aVar7 = g.f73711d;
                                    ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.a(this) { // from class: fv1.f

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ g f73710b;

                            {
                                this.f73710b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i15;
                                g gVar2 = this.f73710b;
                                switch (i18) {
                                    case 0:
                                        g.a aVar6 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                        break;
                                    default:
                                        g.a aVar7 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                p2Var.h(strQ, string, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
                o0Var = o0VarE;
                if (fVar2 != vt1.g.FINISH_GOAL_TIME || fVar2 == vt1.c.RUN_WITH_GOAL_TIME) {
                    o0Var.C(1190701744);
                    mVar2 = aVar.f79443b;
                    if (mVar2 == null) {
                        o0Var.C(-1742951599);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(-1742951598);
                        strW6 = w6(context, mVar2, false);
                        String strW7 = w6(context, mVar2, true);
                        if (mVar2.f101078c == gg0.h.TIME) {
                            i16 = R.string.lbl_time_goal;
                        } else {
                            i16 = R.string.distance_goal;
                        }
                        String strQ2 = gl1.y.Q(o0Var, i16);
                        if (strW6 == null) {
                            strW6 = "";
                        }
                        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                        c0235a.f16962a.put("label_secondary", strW7);
                        b92.a aVarB = c0235a.b();
                        zR2 = o0Var.r(this);
                        objQ2 = o0Var.q();
                        if (zR2) {
                            final int i18 = 1;
                            objQ2 = new e23.a(this) { // from class: fv1.f

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ g f73710b;

                                {
                                    this.f73710b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    g gVar2 = this.f73710b;
                                    switch (i19) {
                                        case 0:
                                            g.a aVar6 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                            break;
                                        default:
                                            g.a aVar7 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                final int i19 = 1;
                                objQ2 = new e23.a(this) { // from class: fv1.f

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ g f73710b;

                                    {
                                        this.f73710b = this;
                                    }

                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i110 = i19;
                                        g gVar2 = this.f73710b;
                                        switch (i110) {
                                            case 0:
                                                g.a aVar6 = g.f73711d;
                                                ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                                break;
                                            default:
                                                g.a aVar7 = g.f73711d;
                                                ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0Var.K(objQ2);
                            }
                        }
                        int i24 = b92.a.f16960b;
                        p2Var.h(strQ2, strW6, null, null, aVarB, false, false, null, null, null, (e23.a) objQ2, o0Var, 0, 0, 1004);
                        o0Var = o0Var;
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1742201460);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            r rVarA2 = b0Var.a(aVar3, 1.0f, true);
            zVarA = y.a(j.f22694d, aVar4, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            String upperCase2 = gl1.y.Q(o0VarE, R.string.event_goal).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF2 = d92.c.f(j92.f.f97934k, o0VarE);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f16 = eVar3.f97921f;
            float f17 = eVar3.f97920e;
            org.apache.commons.lang3.e.j(bVar3);
            i15 = 0;
            mh.c(upperCase2, b0Var.b(x2.f(c2.l.B(aVar3, f17, f16, f17, eVar3.f97917b), 1.0f), aVar4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
            context.getClass();
            if (fVar2 != null) {
                f180111a = fVar2.getF180129a();
            } else {
                f180111a = vt1.g.FINISH.f180111a;
            }
            String string2 = context.getString(f180111a);
            string2.getClass();
            p2Var = p2.f111205a;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_goal);
            zR = o0VarE.r(this);
            objQ = o0VarE.q();
            aVar2 = p3.m.f135153a;
            if (zR) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a(this) { // from class: fv1.f

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f73710b;

                        {
                            this.f73710b = this;
                        }

                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i15;
                            g gVar2 = this.f73710b;
                            switch (i110) {
                                case 0:
                                    g.a aVar6 = g.f73711d;
                                    ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                    break;
                                default:
                                    g.a aVar7 = g.f73711d;
                                    ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new e23.a(this) { // from class: fv1.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f73710b;

                    {
                        this.f73710b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i15;
                        g gVar2 = this.f73710b;
                        switch (i110) {
                            case 0:
                                g.a aVar6 = g.f73711d;
                                ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                break;
                            default:
                                g.a aVar7 = g.f73711d;
                                ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            }
            p2Var.h(strQ3, string2, null, null, null, false, false, null, null, null, (e23.a) objQ, o0VarE, 0, 0, 1020);
            o0Var = o0VarE;
            if (fVar2 != vt1.g.FINISH_GOAL_TIME) {
                o0Var.C(1190701744);
                mVar2 = aVar.f79443b;
                if (mVar2 == null) {
                    o0Var.C(-1742951599);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1742951598);
                    strW6 = w6(context, mVar2, false);
                    String strW8 = w6(context, mVar2, true);
                    if (mVar2.f101078c == gg0.h.TIME) {
                        i16 = R.string.lbl_time_goal;
                    } else {
                        i16 = R.string.distance_goal;
                    }
                    String strQ4 = gl1.y.Q(o0Var, i16);
                    if (strW6 == null) {
                        strW6 = "";
                    }
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("label_secondary", strW8);
                    b92.a aVarB2 = c0235a2.b();
                    zR2 = o0Var.r(this);
                    objQ2 = o0Var.q();
                    if (zR2) {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i110 = 1;
                            objQ2 = new e23.a(this) { // from class: fv1.f

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ g f73710b;

                                {
                                    this.f73710b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i111 = i110;
                                    g gVar2 = this.f73710b;
                                    switch (i111) {
                                        case 0:
                                            g.a aVar6 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                            break;
                                        default:
                                            g.a aVar7 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var.K(objQ2);
                        }
                    } else {
                        final int i111 = 1;
                        objQ2 = new e23.a(this) { // from class: fv1.f

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ g f73710b;

                            {
                                this.f73710b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                int i112 = i111;
                                g gVar2 = this.f73710b;
                                switch (i112) {
                                    case 0:
                                        g.a aVar6 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                        break;
                                    default:
                                        g.a aVar7 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var.K(objQ2);
                    }
                    int i25 = b92.a.f16960b;
                    p2Var.h(strQ4, strW6, null, null, aVarB2, false, false, null, null, null, (e23.a) objQ2, o0Var, 0, 0, 1004);
                    o0Var = o0Var;
                    Unit unit2 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(false);
            } else {
                o0Var.C(1190701744);
                mVar2 = aVar.f79443b;
                if (mVar2 == null) {
                    o0Var.C(-1742951599);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-1742951598);
                    strW6 = w6(context, mVar2, false);
                    String strW9 = w6(context, mVar2, true);
                    if (mVar2.f101078c == gg0.h.TIME) {
                        i16 = R.string.lbl_time_goal;
                    } else {
                        i16 = R.string.distance_goal;
                    }
                    String strQ5 = gl1.y.Q(o0Var, i16);
                    if (strW6 == null) {
                        strW6 = "";
                    }
                    b92.a.C0235a c0235a3 = new b92.a.C0235a(null, 1, null);
                    c0235a3.f16962a.put("label_secondary", strW9);
                    b92.a aVarB3 = c0235a3.b();
                    zR2 = o0Var.r(this);
                    objQ2 = o0Var.q();
                    if (zR2) {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i112 = 1;
                            objQ2 = new e23.a(this) { // from class: fv1.f

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ g f73710b;

                                {
                                    this.f73710b = this;
                                }

                                @Override // e23.a
                                public final Object invoke() {
                                    int i113 = i112;
                                    g gVar2 = this.f73710b;
                                    switch (i113) {
                                        case 0:
                                            g.a aVar6 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                            break;
                                        default:
                                            g.a aVar7 = g.f73711d;
                                            ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var.K(objQ2);
                        }
                    } else {
                        final int i113 = 1;
                        objQ2 = new e23.a(this) { // from class: fv1.f

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ g f73710b;

                            {
                                this.f73710b = this;
                            }

                            @Override // e23.a
                            public final Object invoke() {
                                int i114 = i113;
                                g gVar2 = this.f73710b;
                                switch (i114) {
                                    case 0:
                                        g.a aVar6 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditTrainingGoalFragment");
                                        break;
                                    default:
                                        g.a aVar7 = g.f73711d;
                                        ((y0) gVar2.v6().X.getValue()).m("FBTEditGoalDataFragment");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var.K(objQ2);
                    }
                    int i26 = b92.a.f16960b;
                    p2Var.h(strQ5, strW6, null, null, aVarB3, false, false, null, null, null, (e23.a) objQ2, o0Var, 0, 0, 1004);
                    o0Var = o0Var;
                    Unit unit3 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(this, aVar, i14, 19);
        }
    }

    public final ev1.b v6() {
        return (ev1.b) this.f73712a.getValue();
    }

    public final String w6(Context context, jv1.m mVar, boolean z14) {
        Number numberValueOf;
        Double dB;
        gg0.i iVar;
        gg0.i unit;
        Double value;
        Double d14;
        fg0.d dVarC = mVar != null ? mVar.c() : null;
        if ((mVar != null ? mVar.f101076a : null) == null) {
            if ((mVar != null ? mVar.f101077b : null) == null) {
                if ((mVar != null ? mVar.f101078c : null) == null) {
                    return null;
                }
            }
        }
        double dDoubleValue = 0.0d;
        if (mVar.f101078c != gg0.h.TIME) {
            double dDoubleValue2 = (dVarC == null || (dB = dVarC.b()) == null) ? 0.0d : dB.doubleValue();
            jv1.m mVarX4 = v6().X4();
            if (mVarX4 == null || (numberValueOf = mVarX4.a()) == null) {
                numberValueOf = Double.valueOf(0.0d);
            }
            fy1.i.a aVar = fy1.i.f73924a;
            double dDoubleValue3 = numberValueOf.doubleValue();
            boolean z15 = v6().I == o.f180176g;
            aVar.getClass();
            return fy1.i.a.i(context, dDoubleValue2, dDoubleValue3, z15, true, z14);
        }
        jv1.m mVarX5 = v6().X4();
        og0.a aVar2 = og0.a.f131967a;
        double dDoubleValue4 = (mVarX5 == null || (d14 = mVarX5.f101076a) == null) ? 0.0d : d14.doubleValue();
        if (mVarX5 == null || (iVar = mVarX5.f101077b) == null) {
            iVar = gg0.i.METER;
        }
        aVar2.getClass();
        double dG = og0.a.g(dDoubleValue4, iVar);
        if (dVarC != null && (value = dVarC.getValue()) != null) {
            dDoubleValue = value.doubleValue();
        }
        if (dVarC == null || (unit = dVarC.getUnit()) == null) {
            unit = gg0.i.SECOND;
        }
        double dJ = og0.a.j(dDoubleValue, unit);
        fy1.i.a aVar3 = fy1.i.f73924a;
        boolean z16 = v6().I == o.f180176g;
        aVar3.getClass();
        return fy1.i.a.i(context, dG, dJ, z16, false, z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
