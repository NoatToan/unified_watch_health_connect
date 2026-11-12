package wr;

import am.x0;
import am.z0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import com.garmin.android.apps.connectmobile.activities.stats.intervals.IntervalsExpandableListView;
import e23.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import mq.m;
import nr.t;
import o13.n;
import o53.b0;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import ps.o1;
import ps.q1;
import ps.r;
import ps.x1;
import ps.z1;
import qs.x;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwr/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IntervalsExpandableListView f186675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f186676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lq.e f186677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f186678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f186679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mq.e f186680g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwr/b$a;", "Ljava/util/Comparator;", "Llq/h;", "Lkotlin/Comparator;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Comparator<lq.h> {
        @Override // java.util.Comparator
        public final int compare(lq.h hVar, lq.h hVar2) {
            int i14;
            int i15;
            lq.h hVar3 = hVar;
            lq.h hVar4 = hVar2;
            if (hVar3 == null || hVar4 == null || (i14 = hVar3.f114313c) == (i15 = hVar4.f114313c)) {
                return 0;
            }
            return i14 > i15 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: wr.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsLapsFragment$onViewCreated$1", f = "ActivityDetailsLapsFragment.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class C3475b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186681a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f186683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f186684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f186685e;

        /* JADX INFO: renamed from: wr.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsLapsFragment$onViewCreated$1$1", f = "ActivityDetailsLapsFragment.kt", l = {87}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186686a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f186687b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecyclerView f186688c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TextView f186689d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ RecyclerView f186690e;

            /* JADX INFO: renamed from: wr.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3476a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ b f186691a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RecyclerView f186692b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ TextView f186693c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ RecyclerView f186694d;

                public C3476a(b bVar, RecyclerView recyclerView, TextView textView, RecyclerView recyclerView2) {
                    this.f186691a = bVar;
                    this.f186692b = recyclerView;
                    this.f186693c = textView;
                    this.f186694d = recyclerView2;
                }

                /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
                /* JADX WARN: Code duplicated, block: B:104:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:154:0x028c A[PHI: r5
                  0x028c: PHI (r5v21 ln.b) = (r5v20 ln.b), (r5v24 ln.b) binds: [B:163:0x02a8, B:152:0x0287] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:182:0x02ff  */
                /* JADX WARN: Code duplicated, block: B:77:0x0139  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    rs.b bVar;
                    Object next;
                    Object next2;
                    ln.b bVar2;
                    ln.b bVar3;
                    Object next3;
                    ln.b bVar4;
                    lq.h hVarA;
                    rs.b bVar5;
                    Double verticalOscillation;
                    Double avgStepSpeedLoss;
                    Double groundContactTime;
                    Double minSWOLF;
                    t.e eVar = (t.e) obj;
                    r rVar = eVar.f127331a;
                    ps.p pVar = eVar.f127332b;
                    if (rVar != null) {
                        q1 summaryDTO = rVar.getSummaryDTO();
                        if (summaryDTO != null) {
                            String str = rVar.h().f4358a;
                            q1 summaryDTO2 = rVar.getSummaryDTO();
                            z1 unitOfPoolLength = summaryDTO2 != null ? summaryDTO2.getUnitOfPoolLength() : null;
                            q1 summaryDTO3 = rVar.getSummaryDTO();
                            Double distance = summaryDTO3 != null ? summaryDTO3.getDistance() : null;
                            q1 summaryDTO4 = rVar.getSummaryDTO();
                            ar.c cVar = new ar.c(str, unitOfPoolLength, distance, summaryDTO4 != null ? summaryDTO4.getNumberOfActiveLengths() : null);
                            x0 x0VarH = rVar.h();
                            String str2 = rVar.h().f4358a;
                            q1 summaryDTO5 = rVar.getSummaryDTO();
                            double dDoubleValue = (summaryDTO5 == null || (minSWOLF = summaryDTO5.getMinSWOLF()) == null) ? Double.NaN : minSWOLF.doubleValue();
                            q1 summaryDTO6 = rVar.getSummaryDTO();
                            double dDoubleValue2 = (summaryDTO6 == null || (groundContactTime = summaryDTO6.getGroundContactTime()) == null) ? Double.NaN : groundContactTime.doubleValue();
                            q1 summaryDTO7 = rVar.getSummaryDTO();
                            double dDoubleValue3 = (summaryDTO7 == null || (avgStepSpeedLoss = summaryDTO7.getAvgStepSpeedLoss()) == null) ? Double.NaN : avgStepSpeedLoss.doubleValue();
                            q1 summaryDTO8 = rVar.getSummaryDTO();
                            rs.a aVar = new rs.a(str2, dDoubleValue, dDoubleValue2, dDoubleValue3, (summaryDTO8 == null || (verticalOscillation = summaryDTO8.getVerticalOscillation()) == null) ? Double.NaN : verticalOscillation.doubleValue());
                            boolean zD = oe2.f.D(rVar);
                            boolean zE = oe2.f.E(rVar);
                            List<o1> listT = rVar.t();
                            if (listT == null) {
                                listT = j0.f134944a;
                            }
                            bVar5 = new rs.b(x0VarH, summaryDTO, aVar, cVar, zD, false, zE, listT, 32, null);
                        } else {
                            bVar5 = null;
                        }
                        bVar = bVar5;
                    } else {
                        bVar = null;
                    }
                    ps.p pVar2 = eVar.f127332b;
                    ps.b0 b0Var = new ps.b0(eVar.f127333c);
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.j> list = eVar.f127334d;
                    Double d14 = eVar.f127335e;
                    double dDoubleValue4 = d14 != null ? d14.doubleValue() : Double.NaN;
                    b bVar6 = this.f186691a;
                    if (pVar2 == null || bVar6.getContext() == null || bVar == null || !bVar.f154299e) {
                        TextView textView = this.f186693c;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        String str3 = bVar.f154295a.f4358a;
                        ArrayList arrayList = new ArrayList(0);
                        arrayList.add(lq.h.ALL);
                        List<o1> listH = pVar2.h();
                        if (listH != null) {
                            Iterator<T> it = listH.iterator();
                            while (it.hasNext()) {
                                String splitType = ((o1) it.next()).getSplitType();
                                if (splitType != null) {
                                    g0 g0Var = g0.ACTIVE;
                                    if (splitType.equals(g0Var.f29446a) && z0.b(x0.f4308n, str3)) {
                                        hVarA = lq.h.RUN;
                                    } else if (splitType.equals(g0Var.f29446a)) {
                                        z0 z0Var = z0.f4390a;
                                        if (z0.b(x0.f4312o, str3)) {
                                            hVarA = lq.h.BIKE;
                                        } else {
                                            lq.h.f114305d.getClass();
                                            hVarA = lq.h.a.a(splitType);
                                        }
                                    } else {
                                        lq.h.f114305d.getClass();
                                        hVarA = lq.h.a.a(splitType);
                                    }
                                    if (!arrayList.contains(hVarA)) {
                                        arrayList.add(hVarA);
                                    }
                                }
                            }
                        }
                        Collections.sort(arrayList, new a());
                        lq.f fVar = new lq.f(arrayList, new wr.c(this.f186691a, pVar2, bVar, list, b0Var, dDoubleValue4), bVar6.v6().F1);
                        RecyclerView recyclerView = this.f186692b;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(fVar);
                        }
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                        }
                    }
                    RecyclerView recyclerView2 = this.f186694d;
                    if (bVar != null) {
                        x0 x0Var = bVar.f154295a;
                        bVar6.v6().getClass();
                        String str4 = x0Var != null ? x0Var.f4358a : null;
                        z0 z0Var2 = z0.f4390a;
                        if (!z0.b(x0.f4308n, str4)) {
                            if (z0.b(x0.D2, x0Var != null ? x0Var.f4358a : null)) {
                                if (!bVar.f154301g) {
                                    if (recyclerView2 != null) {
                                        recyclerView2.setVisibility(8);
                                    }
                                } else if (recyclerView2 != null) {
                                    recyclerView2.setVisibility(8);
                                }
                            } else if (recyclerView2 != null) {
                                recyclerView2.setVisibility(8);
                            }
                        } else if (!bVar.f154301g && pVar != null && zf.b.A(pVar.i()) && bVar6.getContext() != null) {
                            ArrayList arrayListD1 = h0.d1(m.a(x0Var, pVar2 != null ? pVar2.g() : null));
                            bVar6.v6().getClass();
                            ArrayList arrayList2 = new ArrayList();
                            if (!arrayListD1.isEmpty()) {
                                arrayList2.add(ln.b.f113632f);
                            }
                            if (qr.t.A5(pVar.i(), x.MARKER_MANUAL)) {
                                arrayList2.add(ln.b.f113633g);
                            }
                            if (qr.t.A5(pVar.i(), x.MARKER_MILE)) {
                                arrayList2.add(ln.b.f113634h);
                            }
                            if (qr.t.A5(pVar.i(), x.MARKER_HALF_MARATHON)) {
                                arrayList2.add(ln.b.f113635i);
                            }
                            if (qr.t.A5(pVar.i(), x.MARKER_KILOMETER)) {
                                arrayList2.add(ln.b.f113636j);
                            }
                            if (qr.t.A5(pVar.i(), x.MARKER_5K)) {
                                arrayList2.add(ln.b.f113637k);
                            }
                            qr.t tVarV6 = bVar6.v6();
                            tVarV6.getClass();
                            Iterator it3 = arrayList2.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (((ln.b) next) != ln.b.f113632f);
                            if (next != null) {
                                bVar3 = ln.b.f113632f;
                            } else {
                                bg0.a.f17827a.getClass();
                                if (bg0.a.C0255a.e()) {
                                    Iterator it4 = arrayList2.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it4.next();
                                    } while (((ln.b) next3) != ln.b.f113636j);
                                    bVar2 = (ln.b) next3;
                                    if (bVar2 == null) {
                                        bVar3 = tVarV6.G1;
                                    } else {
                                        bVar3 = bVar2;
                                    }
                                } else {
                                    Iterator it5 = arrayList2.iterator();
                                    do {
                                        if (!it5.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it5.next();
                                    } while (((ln.b) next2) != ln.b.f113634h);
                                    bVar2 = (ln.b) next2;
                                    if (bVar2 == null) {
                                        bVar3 = tVarV6.G1;
                                    } else {
                                        bVar3 = bVar2;
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty() && bVar3 != (bVar4 = ln.b.f113638l)) {
                                qr.t tVarV7 = bVar6.v6();
                                if (bVar6.v6().G1 != bVar4 && bVar3 != bVar6.v6().G1) {
                                    bVar3 = bVar6.v6().G1;
                                }
                                tVarV7.getClass();
                                bVar3.getClass();
                                tVarV7.G1 = bVar3;
                                l lVar = new l(arrayList2, new wr.d(this.f186691a, pVar2, bVar, list, b0Var, dDoubleValue4), bVar6.v6().G1);
                                if (recyclerView2 != null) {
                                    recyclerView2.setAdapter(lVar);
                                }
                                if (recyclerView2 != null) {
                                    recyclerView2.setVisibility(0);
                                }
                            } else if (recyclerView2 != null) {
                                recyclerView2.setVisibility(8);
                            }
                        } else if (recyclerView2 != null) {
                            recyclerView2.setVisibility(8);
                        }
                    } else if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    b.u6(this.f186691a, pVar2, bVar, list, b0Var, dDoubleValue4);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, RecyclerView recyclerView, TextView textView, RecyclerView recyclerView2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f186687b = bVar;
                this.f186688c = recyclerView;
                this.f186689d = textView;
                this.f186690e = recyclerView2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f186687b, this.f186688c, this.f186689d, this.f186690e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186686a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b bVar = this.f186687b;
                    p2 p2Var = bVar.v6().S1;
                    C3476a c3476a = new C3476a(bVar, this.f186688c, this.f186689d, this.f186690e);
                    this.f186686a = 1;
                    if (p2Var.collect(c3476a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3475b(RecyclerView recyclerView, TextView textView, RecyclerView recyclerView2, t13.d<? super C3475b> dVar) {
            super(2, dVar);
            this.f186683c = recyclerView;
            this.f186684d = textView;
            this.f186685e = recyclerView2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3475b(this.f186683c, this.f186684d, this.f186685e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3475b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186681a;
            if (i14 == 0) {
                o13.r.b(obj);
                n0 viewLifecycleOwner = b.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(b.this, this.f186683c, this.f186684d, this.f186685e, null);
                this.f186681a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186695a;

        public c(Fragment fragment) {
            this.f186695a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f186695a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<qr.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186700e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186696a = fragment;
            this.f186697b = qualifier;
            this.f186698c = aVar;
            this.f186699d = aVar2;
            this.f186700e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final qr.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186698c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186696a;
            e23.a aVar = this.f186699d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qr.t.class), f189591b, null, defaultViewModelCreationExtras, this.f186697b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186700e, 4, null);
        }
    }

    public b() {
        super(R.layout.activity_stats_laps_fragment_3_0);
        this.f186674a = o13.m.a(n.NONE, new d(this, null, new c(this), null, null));
        this.f186679f = am.j.z(f12.l.f68084a);
    }

    /* JADX WARN: Code duplicated, block: B:272:0x04d3  */
    public static final void u6(b bVar, ps.p pVar, rs.b bVar2, List list, ps.b0 b0Var, double d14) {
        boolean zContains;
        LinearLayout linearLayout;
        mq.e eVar;
        mq.e eVar2;
        List list2;
        List list3;
        Context context;
        double dDoubleValue;
        IntervalsExpandableListView intervalsExpandableListView;
        LinearLayout linearLayout2;
        rs.b bVar3 = bVar2;
        bVar.getClass();
        if (bVar3 != null) {
            boolean z14 = bVar3.f154301g;
            x0 x0Var = bVar3.f154295a;
            boolean z15 = bVar3.f154299e;
            if (pVar == null) {
                return;
            }
            List<ps.x0> listA = m.a(x0Var, pVar.g());
            LinearLayout linearLayout3 = bVar.f186676c;
            if (linearLayout3 != null) {
                linearLayout3.removeAllViews();
            }
            String str = x0Var.f4358a;
            if (!z15 || !bVar.w6() || z0.o(str)) {
                LinearLayout linearLayout4 = bVar.f186676c;
                boolean z16 = false;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                IntervalsExpandableListView intervalsExpandableListView2 = bVar.f186675b;
                if (intervalsExpandableListView2 != null) {
                    intervalsExpandableListView2.setVisibility(8);
                }
                x0 x0VarM = z0.m(str);
                if (x0VarM == null) {
                    zContains = false;
                } else {
                    z0.f4390a.getClass();
                    zContains = p13.x.k(x0.f4308n, x0.I0, x0.J0, x0.O0, x0.D2, x0.K0).contains(x0VarM);
                }
                boolean z17 = zContains && zf.b.A(pVar.i());
                if (bVar.f186680g == null) {
                    if (!z15 || z0.o(str)) {
                        if (z14 && z17) {
                            Context contextRequireContext = bVar.requireContext();
                            contextRequireContext.getClass();
                            ArrayList arrayListD1 = h0.d1(list == null ? j0.f134944a : list);
                            if (b0Var == null || (list2 = b0Var.f139688a) == null) {
                                list2 = j0.f134944a;
                            }
                            bVar3 = bVar2;
                            eVar = new mq.d(contextRequireContext, bVar3, pVar, arrayListD1, list2, d14, bVar.w6());
                        } else {
                            Context contextRequireContext2 = bVar.requireContext();
                            contextRequireContext2.getClass();
                            bVar3 = bVar2;
                            eVar = new mq.e(contextRequireContext2, bVar3, list, b0Var != null ? b0Var.f139688a : null, d14, bVar.w6(), ((t.b) bVar.v6().W1.getValue()).f127326b, ((t.b) bVar.v6().W1.getValue()).f127327c);
                        }
                        eVar2 = eVar;
                    } else {
                        Context contextRequireContext3 = bVar.requireContext();
                        contextRequireContext3.getClass();
                        ArrayList arrayListD2 = h0.d1(list == null ? j0.f134944a : list);
                        if (b0Var == null || (list3 = b0Var.f139688a) == null) {
                            list3 = j0.f134944a;
                        }
                        lq.b bVar4 = new lq.b(contextRequireContext3, bVar3, pVar, arrayListD2, list3, d14);
                        bVar3 = bVar2;
                        eVar2 = bVar4;
                        z16 = false;
                    }
                    bVar.f186680g = eVar2;
                } else {
                    z16 = false;
                }
                if (z15 && !z0.o(str)) {
                    mq.e eVar3 = bVar.f186680g;
                    if (eVar3 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    eVar3.n(listA, bVar.v6().F1);
                    if (z0.b(x0.f4313o1, str)) {
                        is.l.f94879a.getClass();
                        bVar3.f154300f = is.l.a(listA);
                    }
                } else if (z14 && z17) {
                    mq.e eVar4 = bVar.f186680g;
                    if (eVar4 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    List<x1> listI = pVar.i();
                    ln.b bVar5 = bVar.v6().G1;
                    qr.t tVarV6 = bVar.v6();
                    ln.b bVar6 = bVar.v6().G1;
                    boolean z18 = bVar.f186679f;
                    tVarV6.getClass();
                    bVar6.getClass();
                    int i14 = qr.t.c.f146593a[bVar6.ordinal()];
                    if (i14 == 1) {
                        z18 = z16;
                    } else if (i14 == 2 || i14 == 3) {
                        z18 = true;
                    } else if (i14 != 4 && i14 != 5) {
                        z18 = z16;
                    }
                    eVar4.m(listI, listA, bVar5, Boolean.valueOf(z18));
                } else {
                    mq.e eVar5 = bVar.f186680g;
                    if (eVar5 == null) {
                        s.m("adapter");
                        throw null;
                    }
                    eVar5.n(listA, bVar.v6().F1);
                    if (z0.b(x0.f4313o1, str)) {
                        is.l.f94879a.getClass();
                        bVar3.f154300f = is.l.a(listA);
                    }
                }
                mq.e eVar6 = bVar.f186680g;
                if (eVar6 == null) {
                    s.m("adapter");
                    throw null;
                }
                View viewK = eVar6.k();
                if (viewK == null || (linearLayout = bVar.f186676c) == null) {
                    return;
                }
                linearLayout.addView(viewK);
                return;
            }
            LinearLayout linearLayout5 = bVar.f186676c;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            IntervalsExpandableListView intervalsExpandableListView3 = bVar.f186675b;
            if (intervalsExpandableListView3 != null) {
                intervalsExpandableListView3.setVisibility(0);
            }
            if (bVar.f186677d == null && (intervalsExpandableListView = bVar.f186675b) != null && (linearLayout2 = bVar.f186678e) != null) {
                Context contextRequireContext4 = bVar.requireContext();
                contextRequireContext4.getClass();
                bVar.f186677d = new lq.e(contextRequireContext4, intervalsExpandableListView, linearLayout2);
            }
            lq.e eVar7 = bVar.f186677d;
            if (eVar7 != null) {
                Context context2 = eVar7.f114283a;
                lq.h hVar = bVar.v6().F1;
                hVar.getClass();
                eVar7.f114287e = pVar;
                eVar7.f114289g = bVar3.f154296b;
                ar.c cVar = bVar3.f154298d;
                eVar7.f114288f = cVar;
                eVar7.f114286d = hVar;
                View view2 = eVar7.f114293k;
                LinearLayout linearLayout6 = eVar7.f114285c;
                View view3 = eVar7.f114292j;
                IntervalsExpandableListView intervalsExpandableListView4 = eVar7.f114284b;
                if (cVar == null) {
                    s.m("distanceData");
                    throw null;
                }
                boolean zG = ar.b.g(cVar, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                ar.c cVar2 = eVar7.f114288f;
                if (cVar2 == null) {
                    s.m("distanceData");
                    throw null;
                }
                String str2 = cVar2.f12517a;
                boolean z19 = z0.Q(str2) || z0.b(x0.f4297k1, str2) || z0.b(x0.f4301l1, str2);
                boolean zB = z0.b(x0.I0, str2);
                ar.c cVar3 = eVar7.f114288f;
                if (cVar3 == null) {
                    s.m("distanceData");
                    throw null;
                }
                ps.p pVar2 = eVar7.f114287e;
                if (pVar2 == null) {
                    s.m("mActivitySplits");
                    throw null;
                }
                lq.c cVar4 = new lq.c(context2, cVar3, pVar2, eVar7.f114286d);
                eVar7.f114291i = cVar4;
                cVar4.f114271e = eVar7;
                intervalsExpandableListView4.setGroupIndicator(null);
                intervalsExpandableListView4.setAdapter(eVar7.f114291i);
                TextView textView = (TextView) view3.findViewById(R.id.distance_unit);
                TextView textView2 = (TextView) view3.findViewById(R.id.pace);
                if (z0.b(x0.f4312o, str2) || z0.c(str2)) {
                    textView2.setText(context2.getString(R.string.lbl_avg_speed));
                }
                l3.a aVar = l3.f23124b;
                boolean z24 = zG || z19 || zB;
                boolean z25 = (z19 || zB) ? false : true;
                aVar.getClass();
                textView.setText(l3.a.E1(context2, z24, z25));
                TextView textView3 = (TextView) view3.findViewById(R.id.pace_unit);
                String string = context2.getString(zG ? R.string.lbl_kmh : R.string.lbl_mph);
                string.getClass();
                if (z19) {
                    string = context2.getString(R.string.lbl_minute_500_meters);
                } else if (!z0.c(str2)) {
                    string = new l22.a(context2).getString(zG ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile);
                }
                textView3.setText(string);
                View viewFindViewById = view3.findViewById(R.id.card_expand_collapse_btn);
                viewFindViewById.getClass();
                ViewSwitcher viewSwitcher = (ViewSwitcher) viewFindViewById;
                eVar7.f114290h = viewSwitcher;
                viewSwitcher.setDisplayedChild(1);
                ViewSwitcher viewSwitcher2 = eVar7.f114290h;
                if (viewSwitcher2 == null) {
                    s.m("mExpandCollapseBtn");
                    throw null;
                }
                viewSwitcher2.setOnClickListener(new js0.d(eVar7, 16));
                ViewSwitcher viewSwitcher3 = eVar7.f114290h;
                if (viewSwitcher3 == null) {
                    s.m("mExpandCollapseBtn");
                    throw null;
                }
                lq.c cVar5 = eVar7.f114291i;
                viewSwitcher3.setVisibility((cVar5 == null || !cVar5.f114270d) ? 8 : 0);
                intervalsExpandableListView4.setSelector(a7.b.getDrawable(context2, android.R.color.transparent));
                if (linearLayout6.getChildCount() == 0) {
                    linearLayout6.addView(view3);
                    LayoutInflater.from(context2).inflate(R.layout.gcm_divider_line_thin, linearLayout6);
                }
                if (intervalsExpandableListView4.getFooterViewsCount() < 2) {
                    intervalsExpandableListView4.addFooterView(view2);
                    intervalsExpandableListView4.addFooterView(eVar7.f114294l);
                }
                view2.setBackgroundColor(a7.b.getColor(context2, intervalsExpandableListView4.getCount() % 2 == 0 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd));
                ar.c cVar6 = eVar7.f114288f;
                if (cVar6 == null) {
                    s.m("distanceData");
                    throw null;
                }
                boolean zG2 = ar.b.g(cVar6, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y());
                TextView textView4 = (TextView) view2.findViewById(R.id.type);
                TextView textView5 = (TextView) view2.findViewById(R.id.time);
                TextView textView6 = (TextView) view2.findViewById(R.id.distance);
                TextView textView7 = (TextView) view2.findViewById(R.id.pace);
                if (ge1.b.M(eVar7.f114286d) == lq.h.ALL) {
                    if (textView5 != null) {
                        q1 q1Var = eVar7.f114289g;
                        if (q1Var == null) {
                            s.m("summaryDTO");
                            throw null;
                        }
                        textView5.setText(aq.a.W(context2, q1Var.getDuration()));
                    }
                    if (textView6 != null) {
                        aq.a aVar2 = aq.a.f11807a;
                        ar.c cVar7 = eVar7.f114288f;
                        if (cVar7 == null) {
                            s.m("distanceData");
                            throw null;
                        }
                        String str3 = cVar7.f12517a;
                        q1 q1Var2 = eVar7.f114289g;
                        if (q1Var2 == null) {
                            s.m("summaryDTO");
                            throw null;
                        }
                        Double distance = q1Var2.getDistance();
                        textView6.setText(aq.a.c0(aVar2, context2, str3, distance != null ? distance.doubleValue() : 0.0d));
                    }
                    if (textView7 != null) {
                        aq.a aVar3 = aq.a.f11807a;
                        q1 q1Var3 = eVar7.f114289g;
                        if (q1Var3 == null) {
                            s.m("summaryDTO");
                            throw null;
                        }
                        Double distance2 = q1Var3.getDistance();
                        double dDoubleValue2 = distance2 != null ? distance2.doubleValue() : 0.0d;
                        q1 q1Var4 = eVar7.f114289g;
                        if (q1Var4 == null) {
                            s.m("summaryDTO");
                            throw null;
                        }
                        Double duration = q1Var4.getDuration();
                        dDoubleValue = duration != null ? duration.doubleValue() : 0.0d;
                        ar.c cVar8 = eVar7.f114288f;
                        if (cVar8 == null) {
                            s.m("distanceData");
                            throw null;
                        }
                        context = context2;
                        textView7.setText(aq.a.a(aVar3, context2, dDoubleValue2, dDoubleValue, cVar8.f12517a, zG2));
                    } else {
                        context = context2;
                    }
                } else {
                    context = context2;
                    ps.p pVar3 = eVar7.f114287e;
                    if (pVar3 == null) {
                        s.m("mActivitySplits");
                        throw null;
                    }
                    q1 q1VarH = ge1.b.H(pVar3.h(), eVar7.f114286d);
                    if (textView5 != null) {
                        textView5.setText(aq.a.W(context, q1VarH.getDuration()));
                    }
                    if (textView6 != null) {
                        aq.a aVar4 = aq.a.f11807a;
                        ar.c cVar9 = eVar7.f114288f;
                        if (cVar9 == null) {
                            s.m("distanceData");
                            throw null;
                        }
                        String str4 = cVar9.f12517a;
                        Double distance3 = q1VarH.getDistance();
                        textView6.setText(aq.a.c0(aVar4, context, str4, distance3 != null ? distance3.doubleValue() : 0.0d));
                    }
                    if (textView7 != null) {
                        aq.a aVar5 = aq.a.f11807a;
                        Double distance4 = q1VarH.getDistance();
                        double dDoubleValue3 = distance4 != null ? distance4.doubleValue() : 0.0d;
                        Double duration2 = q1VarH.getDuration();
                        dDoubleValue = duration2 != null ? duration2.doubleValue() : 0.0d;
                        ar.c cVar10 = eVar7.f114288f;
                        if (cVar10 == null) {
                            s.m("distanceData");
                            throw null;
                        }
                        textView7.setText(aq.a.a(aVar5, context, dDoubleValue3, dDoubleValue, cVar10.f12517a, zG2));
                    }
                }
                if (textView4 != null) {
                    textView4.setText(context.getText(R.string.lbl_total));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f186677d = null;
        this.f186675b = null;
        this.f186676c = null;
        this.f186678e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Integer numValueOf = Integer.valueOf(R.dimen.spacing_small);
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f186676c = (LinearLayout) view2.findViewById(R.id.activity_laps_container);
        this.f186675b = (IntervalsExpandableListView) view2.findViewById(R.id.expandableListView);
        this.f186678e = (LinearLayout) view2.findViewById(R.id.sticky_header_container);
        TextView textView = (TextView) view2.findViewById(R.id.filter_heading);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.filter_chip);
        RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(R.id.lap_split_filter_chips);
        if (textView != null) {
            textView.setText(R.string.select_step_type);
        }
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        }
        if (recyclerView != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            recyclerView.addItemDecoration(new r22.z0(contextRequireContext, numValueOf, null, null, null));
        }
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        recyclerView2.addItemDecoration(new r22.z0(contextRequireContext2, numValueOf, null, null, null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new C3475b(recyclerView, textView, recyclerView2, null), 3);
        if (w6()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.activity_stats_laps_container);
        vb.h hVar = new vb.h();
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewGroup, hVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final qr.t v6() {
        return (qr.t) this.f186674a.getValue();
    }

    public final boolean w6() {
        return getResources().getConfiguration().orientation == 1;
    }
}
