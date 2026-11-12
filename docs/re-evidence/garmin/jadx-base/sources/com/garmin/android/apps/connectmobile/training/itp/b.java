package com.garmin.android.apps.connectmobile.training.itp;

import am.a2;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTPagerTitleNavigationStrip;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import f12.l;
import g22.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.c0;
import p13.j0;
import r22.b0;
import tw1.f;
import tw1.j;
import tw1.m;
import tw1.r;
import vu1.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/b;", "Lvu1/x;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f45607i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f45608d = new w1(s0.f105811a.b(ow1.d.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<Integer, ArrayList<vw1.e>> f45609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DateTime f45610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DateTime f45611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45612h;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.itp.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/training/itp/b$b", "Lr22/b0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0881b extends b0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b f45613v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0881b(x22.b bVar, b bVar2, v vVar, DateTime dateTime, DateTime dateTime2) {
            super(vVar, 4, dateTime, dateTime2, bVar);
            this.f45613v = bVar2;
            vVar.getClass();
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            int iC = c(new DateTime(j8)) + 1;
            HashMap<Integer, ArrayList<vw1.e>> map = this.f45613v.f45609e;
            ArrayList<vw1.e> arrayList = map != null ? map.get(Integer.valueOf(iC)) : null;
            com.garmin.android.apps.connectmobile.training.itp.a.f45600c.getClass();
            com.garmin.android.apps.connectmobile.training.itp.a aVar = new com.garmin.android.apps.connectmobile.training.itp.a();
            Bundle bundle = new Bundle();
            a2.a("EXTRA_ITEMS", bundle, arrayList);
            l2.f37135b.getClass();
            l2.a.c(aVar, bundle);
            return aVar;
        }

        @Override // r22.b0, fe.a
        public final CharSequence getPageTitle(int i14) {
            ArrayList arrayList;
            a aVar = b.f45607i;
            b bVar = this.f45613v;
            bVar.w6().f134301b = i14;
            HashMap<Integer, ArrayList<vw1.e>> map = bVar.f45609e;
            ArrayList<vw1.e> arrayList2 = map != null ? map.get(Integer.valueOf(i14 + 1)) : null;
            if (arrayList2 != null) {
                arrayList = new ArrayList();
                for (vw1.e eVar : arrayList2) {
                    boolean z14 = eVar.f180588x;
                    DateTime dateTime = eVar.f180583q;
                    if (z14) {
                        arrayList.add(new lu1.e((!eVar.f180571e || eVar.f180577k) ? null : eVar.f180590z, dateTime == null ? new DateTime() : dateTime, eVar.f180575i, eVar.f180585t, k.f(dateTime, DateTime.now()), false, null, false, false, 480, null));
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
        public final /* synthetic */ Fragment f45614a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f45614a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45614a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f45616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f45615a = aVar;
            this.f45616b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45615a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45616b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f45617a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f45617a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45617a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0436  */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fg0.k kVar;
        ArrayList<vw1.e> arrayList;
        int i14;
        Context context;
        Integer num;
        DateTime dateTime;
        int size;
        int i15;
        vw1.e eVar;
        DateTime dateTime2;
        int size2;
        int i16;
        vw1.e eVar2;
        DateTime dateTime3;
        vw1.e eVar3;
        Object next;
        vw1.e eVar4;
        DateTime dateTime4;
        ArrayList arrayList2;
        vw1.e eVar5;
        fg0.k kVar2;
        Iterable iterable;
        Object next2;
        m52.k kVarT;
        DateTime dateTimeJ;
        super.onCreate(bundle);
        m mVar = w6().f134305f;
        if (mVar != null) {
            Long l14 = null;
            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
            this.f45612h = vw1.c.h(lVar.e1().f77271c, mVar.getStartDate(), mVar.o());
            DateTime startDate = mVar.getStartDate();
            this.f45610f = startDate != null ? k.o(lVar.e1().f77271c, startDate) : null;
            DateTime dateTimeO = mVar.o();
            this.f45611g = dateTimeO != null ? k.b(lVar.e1().f77271c, dateTimeO) : null;
            m mVar2 = w6().f134305f;
            DateTime dateTime5 = this.f45610f;
            DateTime dateTime6 = this.f45611g;
            if (mVar2 == null || dateTime5 == null || dateTime6 == null) {
                return;
            }
            int i17 = this.f45612h;
            fg0.k kVar3 = w6().f134304e;
            Iterable iterable2 = w6().f134306g;
            if (iterable2 == null) {
                iterable2 = j0.f134944a;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            boolean z14 = true;
            iterable2.getClass();
            List<r> listU = mVar2.u();
            if (listU != null) {
                DateTime dateTimeC = vw1.c.c();
                ArrayList arrayList3 = new ArrayList();
                for (r rVar : listU) {
                    rVar.getClass();
                    boolean z15 = rVar.getTaskWorkout() != null ? z14 : false;
                    boolean z16 = rVar.getTaskWorkout() == null ? z14 : false;
                    j taskWorkout = rVar.getTaskWorkout();
                    boolean z17 = ((taskWorkout != null ? taskWorkout.getAssociatedActivityId() : l14) == null || rVar.getTaskWorkout().b() == null || rVar.getTaskWorkout().j() == null || k.f(rVar.getTaskWorkout().b(), rVar.getTaskWorkout().j())) ? false : z14;
                    j taskWorkout2 = rVar.getTaskWorkout();
                    boolean z18 = ((taskWorkout2 != null ? taskWorkout2.getAssociatedActivityId() : null) == null || rVar.getTaskWorkout().b() == null || rVar.getTaskWorkout().j() == null || !k.f(rVar.getTaskWorkout().b(), rVar.getTaskWorkout().j())) ? false : z14;
                    j taskWorkout3 = rVar.getTaskWorkout();
                    Long lValueOf = taskWorkout3 != null ? Long.valueOf(taskWorkout3.getWorkoutId()) : null;
                    j taskWorkout4 = rVar.getTaskWorkout();
                    Long workoutScheduleId = taskWorkout4 != null ? taskWorkout4.getWorkoutScheduleId() : null;
                    j taskWorkout5 = rVar.getTaskWorkout();
                    Long associatedActivityId = taskWorkout5 != null ? taskWorkout5.getAssociatedActivityId() : null;
                    Integer weekId = rVar.getWeekId();
                    boolean z19 = (z18 || z17) ? z14 : false;
                    boolean z24 = (rVar.getTaskWorkout() == null || rVar.getTaskWorkout().getAssociatedActivityId() != null || (dateTimeJ = rVar.getTaskWorkout().j()) == null || dateTimeJ.isBefore(dateTimeC) != z14) ? false : z14;
                    j taskWorkout6 = rVar.getTaskWorkout();
                    String workoutName = taskWorkout6 != null ? taskWorkout6.getWorkoutName() : null;
                    j taskWorkout7 = rVar.getTaskWorkout();
                    Integer estimatedDurationInSecs = taskWorkout7 != null ? taskWorkout7.getEstimatedDurationInSecs() : null;
                    DateTime dateTimeB = rVar.b();
                    j taskWorkout8 = rVar.getTaskWorkout();
                    DateTime dateTimeB2 = taskWorkout8 != null ? taskWorkout8.b() : null;
                    boolean z25 = (z15 || z16) ? z14 : false;
                    Iterator it = iterable2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            kVar2 = kVar3;
                            iterable = iterable2;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) next2;
                        j taskWorkout9 = rVar.getTaskWorkout();
                        kVar2 = kVar3;
                        iterable = iterable2;
                        if (taskWorkout9 != null) {
                            long j8 = activityListItemDTO.f29250b;
                            Long associatedActivityId2 = taskWorkout9.getAssociatedActivityId();
                            if (associatedActivityId2 != null && j8 == associatedActivityId2.longValue()) {
                                break;
                            }
                        }
                        kVar3 = kVar2;
                        iterable2 = iterable;
                    }
                    ActivityListItemDTO activityListItemDTO2 = (ActivityListItemDTO) next2;
                    j taskWorkout10 = rVar.getTaskWorkout();
                    if (taskWorkout10 == null || (kVarT = taskWorkout10.t()) == null) {
                        kVarT = m52.k.f116755o;
                    }
                    arrayList3.add(new vw1.e(lValueOf, workoutScheduleId, associatedActivityId, weekId, z15, z16, false, false, z19, z17, z24, null, workoutName, estimatedDurationInSecs, null, null, dateTimeB, dateTimeB2, false, null, false, z25, activityListItemDTO2, kVarT, 1835008, null));
                    kVar3 = kVar2;
                    iterable2 = iterable;
                    l14 = null;
                    z14 = true;
                }
                kVar = kVar3;
                if (arrayList3.size() > 1) {
                    c0.u(arrayList3, new vw1.b());
                }
                arrayList = arrayList3;
            } else {
                kVar = kVar3;
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i18 = -1;
                        break;
                    } else if (k.f(((vw1.e) it3.next()).f180583q, mVar2.o())) {
                        break;
                    } else {
                        i18++;
                    }
                }
                i14 = i18;
            } else {
                i14 = -1;
            }
            if (i14 <= -1 || arrayList == null || (eVar5 = (vw1.e) arrayList.get(i14)) == null) {
                context = contextRequireContext;
                num = 1;
            } else {
                Parcelable.Creator<vw1.e> creator = vw1.e.CREATOR;
                Long l15 = eVar5.f180567a;
                int i19 = i14;
                Long l16 = eVar5.f180568b;
                Long l17 = eVar5.f180569c;
                Integer num2 = eVar5.f180570d;
                boolean z26 = eVar5.f180571e;
                boolean z27 = eVar5.f180572f;
                boolean z28 = eVar5.f180573g;
                boolean z29 = eVar5.f180574h;
                boolean z34 = eVar5.f180575i;
                boolean z35 = eVar5.f180576j;
                boolean z36 = eVar5.f180577k;
                String str = eVar5.f180578l;
                String str2 = eVar5.f180579m;
                Integer num3 = eVar5.f180580n;
                String str3 = eVar5.f180581o;
                String str4 = eVar5.f180582p;
                DateTime dateTime7 = eVar5.f180583q;
                DateTime dateTime8 = eVar5.f180584r;
                boolean z37 = eVar5.f180587w;
                boolean z38 = eVar5.f180588x;
                ActivityListItemDTO activityListItemDTO3 = eVar5.f180589y;
                m52.k kVar4 = eVar5.f180590z;
                kVar4.getClass();
                num = 1;
                context = contextRequireContext;
                arrayList.set(i19, new vw1.e(l15, l16, l17, num2, z26, z27, z28, z29, z34, z35, z36, str, str2, num3, str3, str4, dateTime7, dateTime8, true, kVar, z37, z38, activityListItemDTO3, kVar4));
            }
            if (arrayList != null) {
                for (vw1.e eVar6 : arrayList) {
                    if (eVar6.f180571e) {
                        Integer num4 = eVar6.f180580n;
                        long jIntValue = num4 != null ? num4.intValue() : 0L;
                        if (jIntValue > 0) {
                            l3.f23124b.getClass();
                            String strE1 = l3.a.e1(jIntValue);
                            if (strE1 == null) {
                                strE1 = "00:00:00";
                            }
                            eVar6.f180581o = strE1;
                            eVar6.f180582p = context.getString(R.string.estimated_duration, l3.a.k1(new l22.a(context), true, (int) jIntValue));
                        }
                    }
                }
            }
            HashMap<Integer, ArrayList<vw1.e>> map = new HashMap<>();
            int i24 = 0;
            while (i24 < i17) {
                DateTime dateTimePlusWeeks = dateTime5.plusWeeks(i24);
                i24++;
                DateTime dateTimePlusWeeks2 = dateTime5.plusWeeks(i24);
                DateTime dateTimeMinusDays = dateTimePlusWeeks2 != null ? dateTimePlusWeeks2.minusDays(1) : null;
                if (arrayList != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (k.e(((vw1.e) obj).f180583q, dateTimePlusWeeks, dateTimeMinusDays)) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    map.put(Integer.valueOf(i24), new ArrayList<>(arrayList2));
                }
            }
            Integer num5 = num;
            if (mVar2.getBaseWeeks() > 0) {
                ArrayList<vw1.e> arrayList4 = map.get(num5);
                DateTime dateTimeWithTimeAtStartOfDay = (arrayList4 == null || (eVar4 = arrayList4.get(0)) == null || (dateTime4 = eVar4.f180583q) == null) ? null : dateTime4.withTimeAtStartOfDay();
                ArrayList<vw1.e> arrayList5 = map.get(num5);
                if (arrayList5 != null) {
                    arrayList5.add(0, new vw1.e(true, context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.itp_begin_base_phase), vw1.c.g(vw1.c.a(mVar2), context)), dateTimeWithTimeAtStartOfDay));
                }
            }
            ArrayList<vw1.e> arrayList6 = map.get(num5);
            if (arrayList6 != null) {
                Iterator<T> it4 = arrayList6.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((vw1.e) next).f180583q == null);
                vw1.e eVar7 = (vw1.e) next;
                if (eVar7 != null) {
                    dateTime = eVar7.f180583q;
                } else {
                    dateTime = null;
                }
            } else {
                dateTime = null;
            }
            int iA = dateTime != null ? k.a(dateTime5, dateTime) : 0;
            for (int i25 = 0; i25 < iA; i25++) {
                ArrayList<vw1.e> arrayList7 = map.get(num5);
                if (arrayList7 != null) {
                    arrayList7.add(0, new vw1.e(true, dateTime != null ? dateTime.minusDays(i25 + 1) : null, false));
                }
            }
            ArrayList<vw1.e> arrayList8 = map.get(Integer.valueOf(i17));
            int size3 = arrayList8 != null ? arrayList8.size() : 0;
            if (size3 > 0) {
                ArrayList<vw1.e> arrayList9 = map.get(Integer.valueOf(i17));
                DateTime dateTime9 = (arrayList9 == null || (eVar3 = arrayList9.get(size3 + (-1))) == null) ? null : eVar3.f180583q;
                Integer numValueOf = dateTime9 != null ? Integer.valueOf(k.a(dateTime9, dateTime6)) : null;
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                for (int i26 = 0; i26 < iIntValue; i26++) {
                    ArrayList<vw1.e> arrayList10 = map.get(Integer.valueOf(i17));
                    if (arrayList10 != null) {
                        arrayList10.add(new vw1.e(true, dateTime9 != null ? dateTime9.plusDays(i26 + 1) : null, true));
                    }
                }
            }
            f recoveryWeeks = mVar2.getRecoveryWeeks();
            List<Integer> listB = recoveryWeeks != null ? recoveryWeeks.b() : null;
            if (listB != null && !listB.isEmpty()) {
                Iterator<Integer> it5 = listB.iterator();
                while (it5.hasNext()) {
                    ArrayList<vw1.e> arrayList11 = map.get(Integer.valueOf(it5.next().intValue()));
                    if (arrayList11 != null) {
                        DateTime dateTime10 = arrayList11.get(0).f180583q;
                        arrayList11.add(0, new vw1.e(true, context.getString(R.string.itp_recovery_week), dateTime10 != null ? dateTime10.withTimeAtStartOfDay() : null));
                    }
                }
            }
            if (mVar2.getBuildWeeks() > 0 && 1 <= (size2 = map.size())) {
                int i27 = 1;
                while (true) {
                    ArrayList<vw1.e> arrayList12 = map.get(Integer.valueOf(i27));
                    if (arrayList12 == null) {
                        i16 = -1;
                        break;
                    }
                    Iterator<vw1.e> it6 = arrayList12.iterator();
                    i16 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i16 = -1;
                            break;
                        }
                        Integer num6 = it6.next().f180570d;
                        int baseWeeks = mVar2.getBaseWeeks() + 1;
                        if (num6 != null && num6.intValue() == baseWeeks) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (i16 > -1) {
                        ArrayList<vw1.e> arrayList13 = map.get(Integer.valueOf(i27));
                        DateTime dateTimeWithTimeAtStartOfDay2 = (arrayList13 == null || (eVar2 = arrayList13.get(i16)) == null || (dateTime3 = eVar2.f180583q) == null) ? null : dateTime3.withTimeAtStartOfDay();
                        ArrayList<vw1.e> arrayList14 = map.get(Integer.valueOf(i27));
                        if (arrayList14 == null) {
                            break;
                        }
                        arrayList14.add(i16, new vw1.e(true, context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.itp_begin_build_phase), vw1.c.g(vw1.c.b(mVar2), context)), dateTimeWithTimeAtStartOfDay2));
                        break;
                    }
                    if (i27 == size2) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            if (mVar2.getPeakWeeks() > 0 && 1 <= (size = map.size())) {
                int i28 = 1;
                while (true) {
                    ArrayList<vw1.e> arrayList15 = map.get(Integer.valueOf(i28));
                    if (arrayList15 == null) {
                        i15 = -1;
                        break;
                    }
                    Iterator<vw1.e> it7 = arrayList15.iterator();
                    i15 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            i15 = -1;
                            break;
                        }
                        Integer num7 = it7.next().f180570d;
                        int buildWeeks = mVar2.getBuildWeeks() + mVar2.getBaseWeeks() + 1;
                        if (num7 != null && num7.intValue() == buildWeeks) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 > -1) {
                        ArrayList<vw1.e> arrayList16 = map.get(Integer.valueOf(i28));
                        DateTime dateTimeWithTimeAtStartOfDay3 = (arrayList16 == null || (eVar = arrayList16.get(i15)) == null || (dateTime2 = eVar.f180583q) == null) ? null : dateTime2.withTimeAtStartOfDay();
                        ArrayList<vw1.e> arrayList17 = map.get(Integer.valueOf(i28));
                        if (arrayList17 == null) {
                            break;
                        }
                        arrayList17.add(i15, new vw1.e(true, context.getString(R.string.string_space_bullet_string_pattern, context.getString(R.string.itp_begin_peak_phase), vw1.c.g(vw1.c.e(mVar2), context)), dateTimeWithTimeAtStartOfDay3));
                        break;
                    }
                    if (i28 == size) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            this.f45609e = map;
        }
    }

    @Override // vu1.x, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (w6().f134302c > -1) {
            int i14 = w6().f134302c;
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
        return new C0881b(new x22.b(contextRequireContext), this, getChildFragmentManager(), this.f45610f, this.f45611g);
    }

    public final ow1.d w6() {
        return (ow1.d) this.f45608d.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/itp/b$a;", "", "<init>", "()V", "", "EXTRA_TRAINING_PLAN", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
