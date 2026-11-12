package com.garmin.android.apps.connectmobile.traininginitiative.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.w3;
import mz1.e0;
import mz1.i0;
import mz1.j0;
import mz1.k0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p3.o0;
import p3.p1;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/g3;", "Lmy1/a;", "cyclingEventStrategyResult", "Lmy1/f;", "runningEventStrategyResult", "Lmy1/h;", "triathlonEventStrategyResult", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends Fragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45888e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy1.b f45890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fg0.k f45891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f45892d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45893a;

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
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45893a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f45894a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45894a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.traininginitiative.ui.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0886d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0886d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45895a = aVar;
            this.f45896b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45895a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45896b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45897a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f45897a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45897a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public d() {
        super(R.layout.composable_container);
        this.f45889a = new w1(s0.f105811a.b(e0.class), new c(this), new e(this), new C0886d(null, this));
        this.f45890b = (jy1.b) KoinJavaComponent.get$default(jy1.b.class, null, null, 6, null);
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new b50.h(4));
        cVarRegisterForActivityResult.getClass();
        this.f45892d = cVarRegisterForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1817228418);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(C6().Y0, o0VarE);
            int i16 = b.f45893a[((g3) p1VarC.getF182175a()).f35300a.ordinal()];
            if (i16 == 1) {
                o0VarE.C(1011200207);
                o0VarE.g0(false);
                g22.e.l(this);
            } else if (i16 == 2) {
                o0VarE.C(1011291037);
                g22.e.f(this);
                my1.h hVar = (my1.h) ((g3) p1VarC.getF182175a()).f35301b;
                fg0.k kVar = this.f45891c;
                z6(hVar, g22.n.d(kVar != null ? kVar.getShareableEventUuid() : null), o0VarE, (i15 << 6) & 896);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, 1695185449, false);
                }
                o0VarE.C(1011576392);
                o0VarE.g0(false);
                g22.e.f(this);
                g22.e.c(this);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ty1.q(this, i14, 2);
        }
    }

    public final e0 C6() {
        return (e0) this.f45889a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final void E6(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        fg0.d customGoal;
        Double value;
        Integer numValueOf;
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVarG;
        Double value2;
        Object next;
        fg0.k kVar = this.f45891c;
        if (kVar != null) {
            e0 e0VarC6 = C6();
            Long lValueOf = null;
            if (e0VarC6.z5()) {
                List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH = kVar.h();
                if (listH != null) {
                    Iterator<T> it = listH.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.RUNNING);
                    com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                    if (kVar2 != null) {
                        numValueOf = Integer.valueOf(kVar2.getLegIndex());
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                fg0.j eventCustomization = kVar.getEventCustomization();
                if (eventCustomization != null && (cVarG = eventCustomization.g(numValueOf)) != null && (value2 = cVarG.getValue()) != null) {
                    lValueOf = Long.valueOf((long) value2.doubleValue());
                }
            } else if (e0VarC6.y5()) {
                fg0.j eventCustomization2 = kVar.getEventCustomization();
                if (eventCustomization2 != null && (customGoal = eventCustomization2.getCustomGoal()) != null && (value = customGoal.getValue()) != null) {
                    lValueOf = Long.valueOf((long) value.doubleValue());
                }
            } else {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "EventDetailsViewModel", "Run Goal time not available");
            }
            jy1.b bVar = this.f45890b;
            if (lValueOf == null) {
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                bVar.v(mVarRequireActivity, eVar, kVar.r(false), C6().v5(kVar, eVar.q()));
                return;
            }
            androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
            mVarRequireActivity2.getClass();
            long jLongValue = lValueOf.longValue();
            Parcelable.Creator<fg0.k> creator2 = fg0.k.CREATOR;
            bVar.A(mVarRequireActivity2, eVar, jLongValue, kVar.r(false), C6().v5(kVar, eVar.q()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void F6() {
        Long lValueOf;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH;
        Object next;
        Integer courseId;
        com.garmin.android.apps.connectmobile.workouts.data.model.k kVar;
        Object next2;
        fg0.k kVar2 = this.f45891c;
        if (kVar2 != null) {
            C6();
            gg0.f eventType = kVar2.getEventType();
            Double dValueOf = null;
            dValueOf = null;
            if (eventType == null || !eventType.e()) {
                gg0.f eventType2 = kVar2.getEventType();
                if (eventType2 == null || !eventType2.g() || (listH = kVar2.h()) == null) {
                    lValueOf = null;
                } else {
                    Iterator<T> it = listH.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next).getEventLegActivityType() != m52.c.CYCLING);
                    com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next;
                    if (kVar3 == null || (courseId = kVar3.getCourseId()) == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(courseId.intValue());
                    }
                }
            } else {
                lValueOf = kVar2.getCourseId();
            }
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            String strValueOf = String.valueOf(lValueOf);
            C6();
            gg0.f eventType3 = kVar2.getEventType();
            if (eventType3 == null || !eventType3.e()) {
                gg0.f eventType4 = kVar2.getEventType();
                if (eventType4 != null && eventType4.g()) {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH2 = kVar2.h();
                    if (listH2 != null) {
                        Iterator<T> it3 = listH2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.k) next2).getEventLegActivityType() != m52.c.CYCLING);
                        kVar = (com.garmin.android.apps.connectmobile.workouts.data.model.k) next2;
                    } else {
                        kVar = null;
                    }
                    dValueOf = Double.valueOf(e0.b5(kVar != null ? kVar.j() : null));
                }
            } else {
                dValueOf = Double.valueOf(e0.b5(kVar2.getCompletionTarget()));
            }
            this.f45890b.p(mVarRequireActivity, strValueOf, dValueOf, kVar2.r(false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        fg0.k kVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("Event", fg0.k.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("Event");
                parcelable = (fg0.k) (parcelable2 instanceof fg0.k ? parcelable2 : null);
            }
            kVar = (fg0.k) parcelable;
        }
        this.f45891c = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        fg0.k kVar;
        super.onStart();
        if (C6().G5(this.f45891c)) {
            fg0.k kVar2 = this.f45891c;
            if (kVar2 != null) {
                e0 e0VarC6 = C6();
                ge1.b.T(v1.a(e0VarC6), null, null, new i0(e0VarC6, kVar2, null), 3);
                return;
            }
            return;
        }
        C6();
        if (e0.H5(this.f45891c)) {
            fg0.k kVar3 = this.f45891c;
            if (kVar3 != null) {
                e0 e0VarC7 = C6();
                ge1.b.T(v1.a(e0VarC7), null, null, new j0(e0VarC7, kVar3, null), 3);
                return;
            }
            return;
        }
        e0 e0VarC8 = C6();
        fg0.k kVar4 = this.f45891c;
        if ((e0VarC8.I5(kVar4) || e0.J5(kVar4)) && (kVar = this.f45891c) != null) {
            e0 e0VarC9 = C6();
            ge1.b.T(v1.a(e0VarC9), null, null, new k0(e0VarC9, kVar, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        boolean zG5 = C6().G5(this.f45891c);
        C6();
        boolean zH5 = e0.H5(this.f45891c);
        e0 e0VarC6 = C6();
        fg0.k kVar = this.f45891c;
        boolean z14 = e0VarC6.I5(kVar) || e0.J5(kVar);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-276851801, true, new ty1.t(zG5, this, zH5, z14, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    public final void u6(my1.a aVar, boolean z14, long j8, p3.m mVar, int i14) {
        int i15;
        bb1.g gVar;
        boolean z15;
        o0 o0VarE = mVar.E(-1538100173);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(this) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            ab1.g gVar2 = aVar != null ? aVar.f121476a : null;
            if (gVar2 == null) {
                o0VarE.C(1464023288);
                o0VarE.g0(false);
                gVar = null;
            } else {
                o0VarE.C(1464023289);
                gVar = (bb1.g) h0.d0(sa1.h.f((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), p13.w.c(gVar2)));
                o0VarE.g0(false);
            }
            p3.m.a aVar2 = p3.m.f135153a;
            if (gVar != null) {
                o0VarE.C(1464182040);
                w01.c cVar = aVar.f121477b;
                w01.d dVarR = cVar != null ? dh.b.R(cVar) : null;
                boolean zR = o0VarE.r(this);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new ty1.q(this, 0);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ty1.q(this, 0);
                        o0VarE.K(objQ);
                    }
                }
                e23.p pVar = (e23.p) objQ;
                boolean zR2 = o0VarE.r(cVar) | o0VarE.r(gVar2) | o0VarE.r(this);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new sg0.j(cVar, 26, gVar2, this);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sg0.j(cVar, 26, gVar2, this);
                        o0VarE.K(objQ2);
                    }
                }
                yy1.e.a(z14, gVar, dVarR, pVar, (e23.a) objQ2, o0VarE, (i15 >> 3) & 14);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1465355979);
                boolean zR3 = o0VarE.r(this);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    z15 = false;
                    objQ3 = new ty1.r(this, 0);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        z15 = false;
                        objQ3 = new ty1.r(this, 0);
                        o0VarE.K(objQ3);
                    } else {
                        z15 = false;
                    }
                }
                yy1.c.a((i15 >> 3) & 126, j8, (e23.a) objQ3, o0VarE, z14);
                o0VarE.g0(z15);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ty1.s(this, aVar, z14, j8, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(2129509152);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(C6().U0, o0VarE);
            int i16 = b.f45893a[((g3) p1VarC.getF182175a()).f35300a.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-754555155);
                o0VarE.g0(false);
                g22.e.l(this);
            } else if (i16 == 2) {
                o0VarE.C(-754460171);
                g22.e.f(this);
                fg0.k kVar = this.f45891c;
                Long courseId = kVar != null ? kVar.getCourseId() : null;
                if (courseId == null) {
                    o0VarE.C(-754387570);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-754387569);
                    long jLongValue = courseId.longValue();
                    my1.a aVar = (my1.a) ((g3) p1VarC.getF182175a()).f35301b;
                    fg0.k kVar2 = this.f45891c;
                    u6(aVar, g22.n.d(kVar2 != null ? kVar2.getShareableEventUuid() : null), jLongValue, o0VarE, (i15 << 9) & 7168);
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, 2053867791, false);
                }
                o0VarE.C(-754046042);
                o0VarE.g0(false);
                g22.e.f(this);
                g22.e.c(this);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ty1.q(this, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    public final void w6(my1.f fVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1747431693);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            ArrayList arrayListA = t41.e.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), fVar != null ? fVar.f121508a : null);
            int i16 = i15 & 14;
            boolean zR = (i16 == 4) | o0VarE.r(this);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new sy.i(26, fVar, this);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sy.i(26, fVar, this);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = o0VarE.r(this) | (i16 == 4);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new tb0.d(13, fVar, this);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new tb0.d(13, fVar, this);
                    o0VarE.K(objQ2);
                }
            }
            yy1.h.a(z14, arrayListA, lVar, (e23.a) objQ2, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(this, fVar, z14, i14, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y6(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1221477700);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(C6().W0, o0VarE);
            int i16 = b.f45893a[((g3) p1VarC.getF182175a()).f35300a.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-2079002159);
                o0VarE.g0(false);
                g22.e.l(this);
            } else if (i16 == 2) {
                o0VarE.C(-2078911453);
                g22.e.f(this);
                my1.f fVar = (my1.f) ((g3) p1VarC.getF182175a()).f35301b;
                fg0.k kVar = this.f45891c;
                w6(fVar, g22.n.d(kVar != null ? kVar.getShareableEventUuid() : null), o0VarE, (i15 << 6) & 896);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -1313992415, false);
                }
                o0VarE.C(-2078629942);
                o0VarE.g0(false);
                g22.e.f(this);
                g22.e.c(this);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ty1.q(this, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    public final void z6(my1.h hVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        boolean z15;
        bb1.g gVar;
        o0 o0VarE = mVar.E(597546125);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Long l14 = hVar != null ? hVar.f121517a : null;
            ab1.g gVar2 = hVar != null ? hVar.f121518b : null;
            if (gVar2 == null) {
                o0VarE.C(-1142549634);
                o0VarE.g0(false);
                gVar = null;
            } else {
                o0VarE.C(-1142549633);
                gVar = (bb1.g) h0.d0(sa1.h.f((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), p13.w.c(gVar2)));
                o0VarE.g0(false);
            }
            Long l15 = hVar != null ? hVar.f121519c : null;
            ArrayList arrayListA = t41.e.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), hVar != null ? hVar.f121520d : null);
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new ty1.r(this, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ty1.r(this, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            int i16 = i15 & 14;
            boolean zR2 = (i16 == 4) | o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new sy.i(25, hVar, this);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new sy.i(25, hVar, this);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR3 = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new ty1.q(this, 1);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ty1.q(this, 1);
                    o0VarE.K(objQ3);
                }
            }
            e23.p pVar = (e23.p) objQ3;
            boolean zR4 = (i16 == 4) | o0VarE.r(this);
            Object objQ4 = o0VarE.q();
            if (zR4) {
                objQ4 = new tb0.d(12, hVar, this);
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new tb0.d(12, hVar, this);
                    o0VarE.K(objQ4);
                }
            }
            yy1.w.a(z15, l14, gVar, l15, arrayListA, aVar2, lVar, pVar, (e23.a) objQ4, o0VarE, (i15 >> 3) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(this, hVar, z14, i14, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/d$a;", "", "<init>", "()V", "", "EXTRA_EVENT", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
