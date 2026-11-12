package com.garmin.android.apps.connectmobile.training.fbtap.workouts;

import am.a2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import f12.l;
import g22.k;
import hv1.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jv1.e0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.c0;
import p13.h0;
import p13.j0;
import p13.y;
import r22.b0;
import tu1.h;
import tu1.i;
import tw1.j;
import tw1.m;
import tw1.n;
import tw1.r;
import vt1.o;
import vu1.x;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/b;", "Lvu1/x;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends x {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f45573j = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f45574d = new w1(s0.f105811a.b(gw1.b.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f45575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<Integer, ArrayList<iw1.a>> f45576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DateTime f45577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f45578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45579i;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.fbtap.workouts.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/fbtap/workouts/b$b", "Lr22/b0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0879b extends b0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f45580v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0879b(x22.b bVar, b bVar2, v vVar, DateTime dateTime, DateTime dateTime2) {
            super(vVar, 4, dateTime, dateTime2, bVar);
            this.f45580v = bVar2;
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            ArrayList<iw1.a> arrayList;
            int iC = c(new DateTime(j8)) + 1;
            HashMap<Integer, ArrayList<iw1.a>> map = this.f45580v.f45576f;
            ArrayList arrayList2 = (map == null || (arrayList = map.get(Integer.valueOf(iC))) == null) ? null : new ArrayList(arrayList);
            com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.f45566c.getClass();
            com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar = new com.garmin.android.apps.connectmobile.training.fbtap.workouts.a();
            Bundle bundle = new Bundle();
            a2.a("EXTRA_ITEMS", bundle, arrayList2);
            l2.f37135b.getClass();
            l2.a.c(aVar, bundle);
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0088  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
        @Override // r22.b0, fe.a
        public final CharSequence getPageTitle(int i14) {
            ArrayList arrayList;
            boolean z14;
            DateTime dateTimeWithTimeAtStartOfDay;
            ArrayList<iw1.a> arrayList2;
            a aVar = b.f45573j;
            b bVar = this.f45580v;
            bVar.w6().N0 = i14;
            HashMap<Integer, ArrayList<iw1.a>> map = bVar.f45576f;
            ArrayList<iw1.a> arrayList3 = (map == null || (arrayList2 = map.get(Integer.valueOf(i14 + 1))) == null) ? null : new ArrayList(arrayList2);
            m mVar = bVar.w6().S0;
            if (mVar != null ? mVar.p0() : false) {
                if (arrayList3 != null) {
                    arrayList = new ArrayList();
                    for (iw1.a aVar2 : arrayList3) {
                        boolean z15 = aVar2.B;
                        DateTime dateTime = aVar2.f95330q;
                        if (z15) {
                            arrayList.add(new lu1.e(aVar2.f95318f ? aVar2.I : null, dateTime == null ? new DateTime() : dateTime, aVar2.f95323k, false, k.f(dateTime, DateTime.now()), false, null, false, false, 480, null));
                        }
                    }
                } else {
                    arrayList = null;
                }
            } else if (arrayList3 != null) {
                arrayList = new ArrayList();
                for (iw1.a aVar3 : arrayList3) {
                    boolean z16 = aVar3.B;
                    DateTime dateTime2 = aVar3.f95330q;
                    if (z16) {
                        if (dateTime2 != null && (dateTimeWithTimeAtStartOfDay = dateTime2.withTimeAtStartOfDay()) != null) {
                            z14 = dateTimeWithTimeAtStartOfDay.isBefore(DateTime.now().withTimeAtStartOfDay());
                        }
                        arrayList.add(new lu1.e((!aVar3.f95318f || z14) ? null : aVar3.I, dateTime2 == null ? new DateTime() : dateTime2, aVar3.f95323k, aVar3.f95332t, k.f(dateTime2, DateTime.now()), aVar3.f95335x, null, aVar3.Z, aVar3.f95319g, 64, null));
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                bVar.u6(arrayList);
            } else {
                FBTPagerTitleNavigationStrip fBTPagerTitleNavigationStrip = bVar.f180391c;
                if (fBTPagerTitleNavigationStrip == null) {
                    s.m("pagerTitleStrip");
                    throw null;
                }
                v22.e.j(fBTPagerTitleNavigationStrip.getComposeView());
            }
            return super.getPageTitle(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f45581a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45581a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45582a = aVar;
            this.f45583b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45582a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45583b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f45584a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45584a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        m52.k.a aVar = m52.k.f116753m;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0299  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x031a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x0322  */
    /* JADX WARN: Code duplicated, block: B:271:0x0530  */
    /* JADX WARN: Code duplicated, block: B:284:0x0559  */
    /* JADX WARN: Code duplicated, block: B:285:0x055e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0562  */
    /* JADX WARN: Code duplicated, block: B:289:0x056a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:399:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [int] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r27v2, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r2v24, types: [org.joda.time.DateTime, org.joda.time.ReadableInstant, org.joda.time.base.AbstractInstant] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, org.joda.time.DateTime, org.joda.time.ReadableInstant, org.joda.time.base.AbstractInstant] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v7, types: [org.joda.time.DateTime, org.joda.time.base.AbstractInstant] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [org.joda.time.DateTime] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DateTime dateTime;
        e0 e0Var;
        LocalDate localDate;
        int i14;
        m mVar;
        DateTime dateTime2;
        boolean z14;
        int i15;
        int i16;
        int i17;
        Context context;
        boolean z15;
        iw1.a aVar;
        DateTime dateTime3;
        ?? r14;
        ?? r27;
        fg0.k kVar;
        ?? r15;
        iw1.a aVar2;
        ?? A;
        Double dB;
        Double d14;
        boolean z16;
        Long l14;
        String shareableEventUuid;
        ?? r28;
        ?? r29;
        LocalDate localDate2;
        ?? PlusWeeks;
        String string;
        DateTime dateTime4;
        LocalDate localDate3;
        boolean z17;
        ArrayList<av1.d> arrayList;
        ArrayList arrayList2;
        int i18;
        Context context2;
        ActivityListItemDTO activityListItemDTO;
        Object next;
        iw1.a aVar3;
        iw1.a aVarB;
        av1.d dVar;
        Object next2;
        av1.d dVar2;
        Object next3;
        n trainingPlanType;
        o oVarB;
        m52.k kVar2;
        super.onCreate(bundle);
        m mVar2 = (m) a2.c(getArguments(), "EXTRA_TRAINING_PLAN");
        this.f45575e = mVar2;
        if (mVar2 != null) {
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            this.f45579i = vw1.c.h(lVar.e1().f77271c, mVar2.getStartDate(), mVar2.o());
            DateTime startDate = mVar2.getStartDate();
            this.f45577g = startDate != null ? k.o(lVar.e1().f77271c, startDate) : null;
            DateTime dateTimeO = mVar2.o();
            this.f45578h = dateTimeO != null ? k.b(lVar.e1().f77271c, dateTimeO) : null;
            m mVar3 = this.f45575e;
            if (mVar3 == null || (trainingPlanType = mVar3.getTrainingPlanType()) == null || (oVarB = trainingPlanType.b()) == null) {
                m52.k.a aVar4 = m52.k.f116753m;
            } else {
                switch (o.b.f180188a[oVarB.ordinal()]) {
                    case 1:
                        kVar2 = m52.k.f116755o;
                        break;
                    case 2:
                        kVar2 = m52.k.A;
                        break;
                    case 3:
                        kVar2 = m52.k.f116759t;
                        break;
                    case 4:
                        kVar2 = m52.k.f116754n;
                        break;
                    case 5:
                        kVar2 = m52.k.f116756p;
                        break;
                    case 6:
                        kVar2 = m52.k.f116757q;
                        break;
                    default:
                        kVar2 = m52.k.f116756p;
                        break;
                }
                if (kVar2 == null) {
                    m52.k.a aVar5 = m52.k.f116753m;
                }
            }
            DateTime dateTime5 = this.f45577g;
            if (dateTime5 == null || (dateTime = this.f45578h) == null || (e0Var = w6().P0) == null) {
                return;
            }
            i.a aVar6 = i.f166483a;
            ArrayList arrayListG = e0Var.g();
            fg0.k kVar3 = w6().Q0;
            List<av1.d> list = w6().R0;
            List<? extends ActivityListItemDTO> list2 = w6().T0;
            int i19 = this.f45579i;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            boolean z18 = (mVar2.g0() || mVar2.p0()) ? false : true;
            List<fg0.k> list3 = w6().U0;
            aVar6.getClass();
            ArrayList arrayList3 = new ArrayList(y.r(arrayListG, 10));
            Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((q) it.next()).f187133d));
            }
            List listB1 = h0.b1(arrayList3);
            boolean zP0 = mVar2.p0();
            List<r> listU = mVar2.u();
            ArrayList arrayList4 = listU != null ? new ArrayList(tu1.a.y(listU, zP0)) : new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            iw1.a aVar7 = (iw1.a) h0.d0(arrayList4);
            DateTime dateTime6 = aVar7 != null ? aVar7.f95330q : null;
            if (!k.h(dateTime6, dateTime) || dateTime6 == null || (localDate = dateTime6.toLocalDate()) == null) {
                localDate = dateTime.toLocalDate();
            }
            LocalDate localDate4 = localDate;
            if (k.h(dateTime6, dateTime5)) {
                mVar = mVar2;
                dateTime2 = dateTime5;
                z14 = zP0;
            } else {
                DateTime dateTimePlusDays = dateTime5;
                while (true) {
                    if (list != null) {
                        if (list.isEmpty()) {
                            i16 = 0;
                        } else {
                            Iterator it3 = list.iterator();
                            i16 = 0;
                            while (it3.hasNext()) {
                                if (k.f(dateTimePlusDays, ((av1.d) it3.next()).j()) && (i16 = i16 + 1) < 0) {
                                    p13.x.p();
                                    throw null;
                                }
                            }
                        }
                        i14 = i16;
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        mVar = mVar2;
                        boolean z19 = true;
                        dateTime2 = dateTime5;
                        z14 = zP0;
                        i15 = 1;
                        if (1 <= i14) {
                            while (true) {
                                arrayList5.add(new iw1.a(z19, dateTimePlusDays));
                                if (i15 != i14) {
                                    i15++;
                                    z19 = true;
                                } else {
                                    i15 = 1;
                                }
                            }
                        }
                    } else {
                        mVar = mVar2;
                        dateTime2 = dateTime5;
                        z14 = zP0;
                        if (!arrayList4.isEmpty()) {
                            Iterator it4 = arrayList4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    iw1.a aVar8 = (iw1.a) it4.next();
                                    if (k.f(aVar8.f95330q, dateTimePlusDays) && aVar8.f95320h) {
                                        i15 = 1;
                                    }
                                }
                            }
                        }
                        i15 = 1;
                        arrayList5.add(new iw1.a(true, dateTimePlusDays));
                    }
                    dateTimePlusDays = dateTimePlusDays.plusDays(i15);
                    dateTimePlusDays.getClass();
                    LocalDate localDate5 = localDate4;
                    if (dateTimePlusDays.toLocalDate().isBefore(localDate5)) {
                        localDate4 = localDate5;
                        zP0 = z14;
                        mVar2 = mVar;
                        dateTime5 = dateTime2;
                    } else if (!arrayList5.isEmpty()) {
                        arrayList4.addAll(0, arrayList5);
                    }
                }
            }
            if (z14) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Long l15 = ((iw1.a) it5.next()).f95316d;
                    if (l15 != null) {
                        arrayList6.add(l15);
                    }
                }
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (arrayList6.contains(Long.valueOf(((av1.d) obj).getActivityId()))) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    iw1.a aVar9 = (iw1.a) it6.next();
                    boolean z24 = aVar9.f95320h;
                    Long l16 = aVar9.f95316d;
                    boolean z25 = aVar9.f95318f;
                    Iterator it7 = it6;
                    DateTime dateTime7 = aVar9.f95330q;
                    if (z24) {
                        if (arrayList != null) {
                            Iterator it8 = arrayList.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next3 = it8.next();
                                    aVar3 = aVar9;
                                    if (!k.f(((av1.d) next3).j(), dateTime7)) {
                                        aVar9 = aVar3;
                                    }
                                } else {
                                    aVar3 = aVar9;
                                    next3 = null;
                                }
                            }
                            dVar2 = (av1.d) next3;
                        } else {
                            aVar3 = aVar9;
                            dVar2 = null;
                        }
                        if (dVar2 != null) {
                            aVarB = null;
                        }
                        if (aVarB != null) {
                            arrayList7.add(aVarB);
                        }
                        it6 = it7;
                    } else {
                        aVar3 = aVar9;
                    }
                    if (!z25 || l16 == null) {
                        iw1.a aVar10 = aVar3;
                        if (z25 || l16 == null) {
                            aVarB = aVar10;
                        } else {
                            aVarB = null;
                        }
                    } else {
                        if (arrayList != null) {
                            Iterator it9 = arrayList.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    next2 = it9.next();
                                    Iterator it10 = it9;
                                    if (!k.f(((av1.d) next2).j(), dateTime7)) {
                                        it9 = it10;
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            dVar = (av1.d) next2;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            iw1.a aVar11 = aVar3;
                            if (z25) {
                            }
                            aVarB = aVar11;
                        } else {
                            if (!arrayList4.isEmpty()) {
                                Iterator it11 = arrayList4.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        iw1.a aVar12 = (iw1.a) it11.next();
                                        Iterator it12 = it11;
                                        if (k.f(aVar12.f95330q, dateTime7) && (aVar12.f95316d == null || aVar12.f95320h)) {
                                            iw1.a aVar13 = aVar3;
                                            if (z25) {
                                            }
                                            aVarB = aVar13;
                                        } else {
                                            it11 = it12;
                                        }
                                    }
                                }
                            }
                            aVarB = iw1.a.b(aVar3, false, true, null, false, false, false, false, -161, 31);
                        }
                    }
                    if (aVarB != null) {
                        arrayList7.add(aVarB);
                    }
                    it6 = it7;
                }
                if (arrayList != null) {
                    arrayList2 = new ArrayList(y.r(arrayList, 10));
                    for (av1.d dVar3 : arrayList) {
                        if (list2 != null) {
                            Iterator it13 = list2.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next = it13.next();
                                    i18 = i19;
                                    context2 = contextRequireContext;
                                    if (((ActivityListItemDTO) next).f29250b != dVar3.getActivityId()) {
                                        i19 = i18;
                                        contextRequireContext = context2;
                                    }
                                } else {
                                    i18 = i19;
                                    context2 = contextRequireContext;
                                    next = null;
                                }
                            }
                            activityListItemDTO = (ActivityListItemDTO) next;
                        } else {
                            i18 = i19;
                            context2 = contextRequireContext;
                            activityListItemDTO = null;
                        }
                        arrayList2.add(iw1.a.b(tu1.a.v(dVar3, activityListItemDTO), false, false, dVar3.j(), false, false, false, false, -66689, 31));
                        i19 = i18;
                        contextRequireContext = context2;
                    }
                } else {
                    arrayList2 = null;
                }
                i17 = i19;
                context = contextRequireContext;
                Iterable iterable = arrayList2;
                if (arrayList2 == null) {
                    iterable = j0.f134944a;
                }
                arrayList4.clear();
                arrayList4.addAll(h0.C0(arrayList7, iterable));
                if (arrayList4.size() > 1) {
                    c0.u(arrayList4, new h());
                }
            } else {
                i17 = i19;
                context = contextRequireContext;
                tu1.a.A(arrayList4, list, list2, kVar3 != null ? kVar3.f() : null);
            }
            ArrayList arrayList8 = new ArrayList(arrayList4);
            ?? O = mVar.o();
            List<r> listU2 = mVar.u();
            if (listU2 != null) {
                if (listU2.isEmpty()) {
                    z17 = false;
                } else {
                    Iterator it14 = listU2.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            j taskWorkout = ((r) it14.next()).getTaskWorkout();
                            if (taskWorkout != null ? s.g(taskWorkout.getBenchmarkWorkout(), Boolean.TRUE) : false) {
                                z17 = true;
                            }
                        } else {
                            z17 = false;
                        }
                    }
                }
                z15 = z17;
            } else {
                z15 = false;
            }
            boolean zE0 = mVar.e0();
            if (O == 0 || (aVar = (iw1.a) h0.n0(h0.N0(arrayList8, new tu1.j()))) == null || (dateTime3 = aVar.f95330q) == null) {
                r14 = dateTime3;
                list3 = list3;
                i17 = i17;
                context = context;
                r15 = 1;
            } else {
                while (true) {
                    r14 = dateTime3;
                    if (r14.compareTo(dateTime) < 0) {
                        ?? PlusDays = r14.plusDays(1);
                        PlusDays.getClass();
                        DateTime.Property propertyDayOfWeek = PlusDays.dayOfWeek();
                        arrayList8.add((!h0.R(listB1, propertyDayOfWeek != null ? Integer.valueOf(propertyDayOfWeek.get()) : null) || PlusDays.compareTo(O) >= 0) ? iw1.a.b(new iw1.a(true, (DateTime) PlusDays), false, false, null, false, PlusDays.compareTo(O) < 0 || O.compareTo(PlusDays) < 0, PlusDays.compareTo(O) > 0, false, -2097153, 29) : iw1.a.b(new iw1.a(false, (DateTime) PlusDays), true, false, null, false, true, false, z15, -35651617, 23));
                        r14 = PlusDays;
                    } else {
                        if (z18) {
                            r27 = O;
                            if (kVar3 != null) {
                                boolean zN0 = kVar3.n0();
                                LocalDate date = kVar3.getDate();
                                if (date != null) {
                                    og0.a aVar14 = og0.a.f131967a;
                                    fg0.r eventTimeLocal = kVar3.getEventTimeLocal();
                                    aVar14.getClass();
                                    A = og0.a.a(date, eventTimeLocal);
                                } else {
                                    A = r27;
                                }
                                String strR = kVar3.r(false);
                                fg0.d completionTarget = kVar3.getCompletionTarget();
                                if (completionTarget == null || !completionTarget.o()) {
                                    fg0.d completionTarget2 = kVar3.getCompletionTarget();
                                    if (completionTarget2 != null) {
                                        dB = completionTarget2.b();
                                        d14 = dB;
                                    } else {
                                        d14 = null;
                                    }
                                } else {
                                    fg0.d completionTarget3 = kVar3.getCompletionTarget();
                                    if (completionTarget3 != null) {
                                        dB = completionTarget3.g();
                                        d14 = dB;
                                    } else {
                                        d14 = null;
                                    }
                                }
                                fg0.d completionTarget4 = kVar3.getCompletionTarget();
                                if (completionTarget4 != null) {
                                    z16 = true;
                                    boolean z26 = completionTarget4.o();
                                    fg0.r eventTimeLocal2 = kVar3.getEventTimeLocal();
                                    if (zN0) {
                                        l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                    } else {
                                        l14 = null;
                                    }
                                    if (zN0) {
                                        shareableEventUuid = null;
                                    } else {
                                        shareableEventUuid = kVar3.getShareableEventUuid();
                                    }
                                    kVar = kVar3;
                                    r15 = z16;
                                    aVar2 = new iw1.a(A, strR, d14, z26, eventTimeLocal2, l14, shareableEventUuid, kVar, true, false);
                                    r28 = r27;
                                } else {
                                    z16 = true;
                                }
                                fg0.r eventTimeLocal3 = kVar3.getEventTimeLocal();
                                if (zN0) {
                                    l14 = kVar3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                                } else {
                                    l14 = null;
                                }
                                if (zN0) {
                                    shareableEventUuid = kVar3.getShareableEventUuid();
                                } else {
                                    shareableEventUuid = null;
                                }
                                kVar = kVar3;
                                r15 = z16;
                                aVar2 = new iw1.a(A, strR, d14, z26, eventTimeLocal3, l14, shareableEventUuid, kVar, true, false);
                                r28 = r27;
                            } else {
                                list3 = list3;
                                kVar = kVar3;
                                r15 = 1;
                                aVar2 = null;
                            }
                        } else {
                            r29 = O;
                            aVar2 = iw1.a.b(new iw1.a(true), false, false, r29, false, false, false, false, -65537, 31);
                            list3 = list3;
                            kVar = kVar3;
                            r15 = 1;
                        }
                        if (aVar2 != null) {
                            r28 = r27;
                            r28 = r29;
                            Iterator it15 = arrayList8.iterator();
                            int i24 = 0;
                            while (true) {
                                if (it15.hasNext()) {
                                    DateTime dateTime8 = ((iw1.a) it15.next()).f95330q;
                                    if (!k.g(dateTime8 != null ? dateTime8.toLocalDate() : null, r28.toLocalDate())) {
                                        i24++;
                                    }
                                } else {
                                    i24 = -1;
                                }
                            }
                            if (i24 <= 0) {
                                i.a aVar15 = i.f166483a;
                                i2.a aVar16 = i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar16.getClass();
                                i2.a.b(a2Var, "FBTPlanUtil", "addWorkOutAndRestDaysUpcomingWeeks : last entry item is -1");
                            } else if (z18) {
                                iw1.a aVar17 = (iw1.a) arrayList8.get(i24);
                                if (!zE0) {
                                    arrayList8.set(i24, aVar2);
                                } else if ((kVar != null ? kVar.f() : null) == null || !s.g(kVar.f(), aVar17.f95316d)) {
                                    arrayList8.set(i24, aVar2);
                                } else {
                                    arrayList8.set(i24, aVar17);
                                }
                            } else {
                                iw1.a aVar18 = (iw1.a) arrayList8.get(i24);
                                arrayList8.set(i24, aVar2);
                                arrayList8.add(i24 + (r15 == true ? 1 : 0), aVar18);
                            }
                        }
                    }
                }
            }
            r28 = r27;
            r28 = r29;
            tu1.a.b(context, arrayList8);
            if (z18) {
                List<tw1.a> listK = mVar.k();
                DateTime dateTimeO2 = mVar.o();
                if (listK != null) {
                    for (tw1.a aVar19 : listK) {
                        ?? days = Days.daysBetween(aVar19.g(), aVar19.d()).getDays() + r15;
                        g.a aVar20 = g.f85858c;
                        String trainingPhase = aVar19.getTrainingPhase();
                        aVar20.getClass();
                        g gVarA = g.a.a(trainingPhase);
                        if (gVarA == null || (string = context.getString(gVarA.f85861a)) == null) {
                            string = null;
                        }
                        if (string == null) {
                            string = "";
                        }
                        String string2 = context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.lbl_begin_phase_type, string), vw1.c.g(days, context));
                        string2.getClass();
                        if (dateTimeO2 == null || k.f(dateTimeO2, aVar19.g().toDateTimeAtStartOfDay()) != r15) {
                            Iterator it16 = arrayList8.iterator();
                            int i25 = 0;
                            while (true) {
                                if (it16.hasNext()) {
                                    iw1.a aVar21 = (iw1.a) it16.next();
                                    DateTime dateTime9 = aVar21.f95330q;
                                    if (!k.g(dateTime9 != null ? dateTime9.toLocalDate() : null, aVar19.g()) && ((dateTime4 = aVar21.f95330q) == null || (localDate3 = dateTime4.toLocalDate()) == null || localDate3.isAfter(aVar19.g()) != r15)) {
                                        i25++;
                                    }
                                } else {
                                    i25 = -1;
                                }
                            }
                            if (i25 != -1) {
                                arrayList8.add(i25, iw1.a.b(new iw1.a((boolean) r15, string2), false, false, aVar19.g().toDateTimeAtStartOfDay(), false, false, false, false, -65537, 31));
                            }
                        }
                    }
                }
            }
            tu1.a.c(arrayList8, list3);
            LocalDate localDate6 = dateTime2.toLocalDate();
            HashMap<Integer, ArrayList<iw1.a>> map = new HashMap<>();
            for (int i26 = 0; i26 < i17; i26++) {
                LocalDate localDatePlusWeeks = localDate6 != null ? localDate6.plusWeeks(i26) : null;
                LocalDate localDateMinusDays = (localDate6 == null || (PlusWeeks = localDate6.plusWeeks(i26 + 1)) == 0) ? null : PlusWeeks.minusDays(r15);
                if (localDatePlusWeeks != null && localDateMinusDays != null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj2 : arrayList8) {
                        DateTime dateTime10 = ((iw1.a) obj2).f95330q;
                        if (dateTime10 != null && (localDate2 = dateTime10.toLocalDate()) != null && tu1.a.o(localDate2, localDatePlusWeeks, localDateMinusDays) == r15) {
                            arrayList9.add(obj2);
                        }
                    }
                    map.put(Integer.valueOf(i26 + 1), new ArrayList<>(arrayList9));
                }
            }
            this.f45576f = map;
        }
    }

    @Override // vu1.x, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fbt_date_infinite_view_pager_layout, viewGroup, false);
    }

    @Override // vu1.x, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (w6().O0 > -1) {
            int i14 = w6().O0;
            InfiniteViewPager infiniteViewPager = this.f180389a;
            if (infiniteViewPager != null) {
                infiniteViewPager.setDefaultPosition(i14);
                return;
            } else {
                s.m("viewPager");
                throw null;
            }
        }
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        InfiniteViewPager infiniteViewPager2 = this.f180389a;
        if (infiniteViewPager2 == null) {
            s.m("viewPager");
            throw null;
        }
        b0 b0Var = this.f180390b;
        if (b0Var == null) {
            s.m("adapter");
            throw null;
        }
        if (dateTimeWithTimeAtStartOfDay == null) {
            dateTimeWithTimeAtStartOfDay = DateTime.now();
        }
        dateTimeWithTimeAtStartOfDay.getClass();
        infiniteViewPager2.setDefaultPosition(b0Var.c(dateTimeWithTimeAtStartOfDay));
    }

    @Override // vu1.x
    public final b0 v6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return new C0879b(new x22.b(contextRequireContext), this, getChildFragmentManager(), this.f45577g, this.f45578h);
    }

    public final gw1.b w6() {
        return (gw1.b) this.f45574d.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/fbtap/workouts/b$a;", "", "<init>", "()V", "", "EXTRA_TRAINING_PLAN", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
