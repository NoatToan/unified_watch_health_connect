package fg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f71509a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71510a;

        static {
            int[] iArr = new int[sf2.e.C3005e.a.values().length];
            try {
                iArr[sf2.e.C3005e.a.WORKOUT_WARMUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sf2.e.C3005e.a.WORKOUT_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sf2.e.C3005e.a.WORKOUT_COOLDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sf2.e.C3005e.a.WORKOUT_REST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f71510a = iArr;
        }
    }

    public g0(d0 d0Var) {
        this.f71509a = d0Var;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Iterable, java.lang.Object] */
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
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        rf2.b bVar;
        mt2.l lVar;
        yg2.h0 next;
        yg2.h0 h0Var;
        yg2.h0 next2;
        yg2.h0 next3;
        yg2.h0 next4;
        yg2.h0 next5;
        Object next6;
        T next7;
        T next8;
        Object next9;
        yg2.h0 h0Var2;
        Object next10;
        int i14;
        int i15;
        sf2.e eVar = (sf2.e) obj;
        boolean z14 = eVar instanceof sf2.e.l;
        d0 d0Var = this.f71509a;
        if (z14) {
            zg2.c cVar = zg2.c.f204692a;
            sf2.e.l lVar2 = (sf2.e.l) eVar;
            int i16 = lVar2.f158982b;
            int i17 = lVar2.f158981a;
            cVar.getClass();
            zg2.c.a("WorkoutStateHolder", "WorkoutStepStartedRequest - " + i17);
            p2 p2Var = d0Var.f71427b;
            p2 p2Var2 = d0Var.f71428c;
            if (p2Var.getValue() instanceof rf2.l.a) {
                i53.c<yg2.h0> cVarD = ((yg2.o) p2Var2.getValue()).d();
                int i18 = d0Var.f71435j;
                cVarD.getClass();
                if (cVarD.isEmpty()) {
                    i14 = 0;
                } else {
                    Iterator<yg2.h0> it = cVarD.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        if (!it.next().f197048o && (i14 = i14 + 1) < 0) {
                            p13.x.p();
                            throw null;
                        }
                    }
                }
                d0Var.f71434i = ((i17 / i14) % i18) + 1;
                i53.c<yg2.h0> cVarD2 = ((yg2.o) p2Var2.getValue()).d();
                cVarD2.getClass();
                if (cVarD2.isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator<yg2.h0> it3 = cVarD2.iterator();
                    i15 = 0;
                    while (it3.hasNext()) {
                        if (!it3.next().f197048o && (i15 = i15 + 1) < 0) {
                            p13.x.p();
                            throw null;
                        }
                    }
                }
                i17 %= i15;
            }
            yg2.h0 h0Var3 = (yg2.h0) d0Var.f71430e.getValue();
            yg2.o oVar = (yg2.o) p2Var2.getValue();
            i53.c<yg2.h0> cVarD3 = oVar.d();
            Map<Integer, Integer> map = oVar.f197113d;
            yg2.h0 h0VarA = yg2.g0.a(cVarD3, new Integer(i17));
            yg2.a aVarF = h0VarA != null ? h0.f(h0VarA, oVar) : null;
            if (h0VarA != null) {
                int iIntValue = new Integer(h0VarA.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()).intValue();
                ArrayList arrayListG = h0.g(oVar.d(), aVarF != null ? aVarF.getStartStepIndex() : 0, aVarF != null ? aVarF.getEndStepIndex() : 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListG) {
                    yg2.h0 h0Var4 = (yg2.h0) obj2;
                    if (h0Var4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != (aVarF != null ? aVarF.getEndStepIndex() : 0) || !h0Var4.f197048o) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it4 = h0.h(arrayList).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next10 = null;
                        break;
                    }
                    next10 = it4.next();
                    yg2.h0 h0Var5 = (yg2.h0) next10;
                    Integer numK = h0.k(h0Var5);
                    int i19 = h0Var5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                    if (numK != null && new j23.l(numK.intValue(), i19).d(iIntValue)) {
                        break;
                    }
                }
                yg2.h0 h0Var6 = (yg2.h0) next10;
                Integer numK2 = h0Var6 != null ? h0.k(h0Var6) : null;
                if (h0Var6 != null && numK2 != null && numK2.intValue() == iIntValue) {
                    lt2.b primaryTarget = h0Var6.getPrimaryTarget();
                    int i24 = primaryTarget != null ? (int) primaryTarget.f114871b : 1;
                    Integer num = (Integer) q6.f.l(h0Var6.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String(), map);
                    int iIntValue2 = (num != null ? num.intValue() : 0) + 1;
                    if (iIntValue2 > i24) {
                        iIntValue2 = 1;
                    }
                    map.put(new Integer(h0Var6.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()), new Integer(iIntValue2));
                }
            }
            if (h0VarA != null && !h0VarA.f197048o) {
                d0.d(d0Var, h0VarA.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
            }
            if (aVarF != null) {
                if (aVarF.getStartStepIndex() != h0VarA.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() || i16 <= 1) {
                    zg2.c cVar2 = zg2.c.f204692a;
                    String str = "Completing Workout Step: " + (h0Var3 != null ? new Integer(h0Var3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null);
                    cVar2.getClass();
                    zg2.c.a("WorkoutStateHolder", str);
                    if (h0Var3 != null) {
                        d0.a(d0Var, h0Var3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
                    }
                } else {
                    d0.b(d0Var, aVarF.getClusterIndex());
                }
                aVarF.f196937d = i16;
                return Unit.INSTANCE;
            }
            zg2.c cVar3 = zg2.c.f204692a;
            String str2 = "Completing Workout Step: " + (h0Var3 != null ? new Integer(h0Var3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) : null);
            cVar3.getClass();
            zg2.c.a("WorkoutStateHolder", str2);
            if (h0Var3 != null) {
                d0.a(d0Var, h0Var3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
                h0Var2 = h0Var3;
            } else {
                h0Var2 = null;
            }
            if (h0Var2 == null) {
                zg2.c.a("WorkoutStateHolder", "No Active Workout Step");
                Unit unit = Unit.INSTANCE;
            }
        } else if (eVar instanceof sf2.e.j) {
            yg2.o oVar2 = (yg2.o) d0Var.f71428c.getValue();
            ArrayList arrayListC0 = p13.h0.C0(oVar2.b(), oVar2.c());
            sf2.e.j jVar = (sf2.e.j) eVar;
            List<Integer> list = jVar.f158975a;
            List<Integer> list2 = jVar.f158976b;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it5 = list2.iterator();
            while (it5.hasNext()) {
                int iIntValue3 = ((Number) it5.next()).intValue();
                Iterator it6 = arrayListC0.iterator();
                do {
                    if (!it6.hasNext()) {
                        next9 = null;
                        break;
                    }
                    next9 = it6.next();
                } while (((yg2.a) next9).getClusterIndex() != iIntValue3);
                yg2.a aVar = (yg2.a) next9;
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
            }
            ?? r14 = d0Var.f71433h;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : r14) {
                yg2.a aVar2 = (yg2.a) obj3;
                Iterator<T> it7 = list.iterator();
                do {
                    if (!it7.hasNext()) {
                        next7 = (T) null;
                        break;
                    }
                    next7 = it7.next();
                } while (((Number) next7).intValue() != aVar2.getClusterIndex());
                if (next7 == null) {
                    Iterator<T> it8 = list2.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next8 = (T) null;
                            break;
                        }
                        next8 = it8.next();
                    } while (((Number) next8).intValue() != aVar2.getClusterIndex());
                    if (next8 == null) {
                        arrayList3.add(obj3);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it9 = list.iterator();
            while (it9.hasNext()) {
                int iIntValue4 = ((Number) it9.next()).intValue();
                Iterator it10 = arrayListC0.iterator();
                do {
                    if (!it10.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it10.next();
                } while (((yg2.a) next6).getClusterIndex() != iIntValue4);
                yg2.a aVar3 = (yg2.a) next6;
                if (aVar3 != null) {
                    arrayList4.add(aVar3);
                }
            }
            d0Var.f71428c.k(null, yg2.o.a(oVar2, null, i53.a.e(p13.h0.C0(arrayList3, arrayList4)), i53.a.e(arrayList2), 9));
            Unit unit2 = Unit.INSTANCE;
        } else if (eVar instanceof sf2.e.C3005e) {
            zg2.c.f204692a.getClass();
            zg2.c.a("WorkoutStateHolder", "QuickWorkoutEvent - " + eVar);
            yg2.h0 h0Var7 = (yg2.h0) d0Var.f71430e.getValue();
            if ((d0Var.f71427b.getValue() instanceof rf2.l.b) && h0Var7 != null) {
                yg2.o oVar3 = (yg2.o) d0Var.f71428c.getValue();
                int i25 = a.f71510a[((sf2.e.C3005e) eVar).f158955a.ordinal()];
                if (i25 == 1 || i25 == 2) {
                    lVar = mt2.l.INTERVAL;
                } else {
                    if (i25 != 3 && i25 != 4) {
                        u0.r();
                        return null;
                    }
                    lVar = mt2.l.REST;
                }
                oVar3.getClass();
                lVar.getClass();
                Iterator<yg2.h0> it11 = oVar3.d().iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it11.next();
                    yg2.h0 h0Var8 = next;
                    if (h0Var8.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == lVar || h0Var8.f197048o) {
                        if (h0Var8.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() > h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                            break;
                        }
                    }
                }
                yg2.h0 h0Var9 = next;
                if (h0Var9 == null || !h0Var9.f197048o) {
                    h0Var = h0Var9;
                } else {
                    yg2.a aVarF2 = h0.f(h0Var7, oVar3);
                    if (aVarF2 == null) {
                        h0Var = null;
                    } else if (h0.n(aVarF2, oVar3)) {
                        Iterator<yg2.h0> it12 = oVar3.d().iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it12.next();
                            yg2.h0 h0Var10 = next4;
                            j23.l lVar3 = new j23.l(aVarF2.getStartStepIndex(), aVarF2.getEndStepIndex());
                            int i26 = h0Var10.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                            if (lVar3.f96796a <= i26 && i26 <= lVar3.f96797b && h0Var10.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == lVar) {
                                break;
                            }
                        }
                        h0Var = next4;
                        if (h0Var == null) {
                            Iterator<yg2.h0> it13 = oVar3.d().iterator();
                            do {
                                if (!it13.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it13.next();
                            } while (next5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != aVarF2.getStartStepIndex());
                            h0Var = next5;
                        }
                    } else {
                        Iterator<yg2.h0> it14 = oVar3.d().iterator();
                        while (true) {
                            if (!it14.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it14.next();
                            yg2.h0 h0Var11 = next2;
                            if (h0Var11.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() >= h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 2 && h0Var11.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == lVar) {
                                break;
                            }
                        }
                        h0Var = next2;
                        if (h0Var == null) {
                            Iterator<yg2.h0> it15 = oVar3.d().iterator();
                            do {
                                if (!it15.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it15.next();
                            } while (next3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 2);
                            h0Var = next3;
                        }
                    }
                }
                if (h0Var != null) {
                    d0.d(d0Var, h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
                }
                yg2.a aVarF3 = h0Var != null ? h0.f(h0Var, oVar3) : null;
                if (aVarF3 != null) {
                    if (aVarF3.getStartStepIndex() == h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                        d0.b(d0Var, aVarF3.getClusterIndex());
                        aVarF3.f196937d++;
                    } else {
                        d0.a(d0Var, h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
                    }
                    return Unit.INSTANCE;
                }
                d0.a(d0Var, h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
            }
            Unit unit3 = Unit.INSTANCE;
        } else if (eVar instanceof sf2.e.h) {
            yg2.h0 h0Var12 = (yg2.h0) d0Var.f71430e.getValue();
            if (h0Var12 != null) {
                d0.a(d0Var, new Integer(h0Var12.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()).intValue());
            }
            d0Var.f71430e.setValue(null);
            Unit unit4 = Unit.INSTANCE;
        } else {
            if (eVar instanceof sf2.e.d) {
                p2 p2Var3 = d0Var.f71432g;
                Iterator<T> it16 = ((sf2.e.d) eVar).f158954a.iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        bVar = null;
                        break;
                    }
                    T next11 = it16.next();
                    if (((rf2.b) next11).f152455a == rf2.a.LAPS) {
                        bVar = next11;
                        break;
                    }
                }
                p2Var3.setValue(bVar);
            }
            Unit unit5 = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
