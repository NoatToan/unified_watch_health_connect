package uy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetUserSettingsItemsUseCase$invoke$2", f = "GetUserSettingsItemsUseCase.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ty0.o f173154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f173155c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173156a;

        static {
            int[] iArr = new int[ty0.o.values().length];
            try {
                iArr[ty0.o.f167045o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ty0.o.f167046p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ty0.o.f167053y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ty0.o.f167050v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ty0.o.f167051w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ty0.o.f167043m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ty0.o.f167044n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ty0.o.f167048r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ty0.o.f167049t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f173156a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ty0.o oVar, f1 f1Var, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f173154b = oVar;
        this.f173155c = f1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e1(this.f173154b, this.f173155c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:103:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4 A[LOOP:1: B:117:0x01ce->B:119:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ty0.o oVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        db1.u weightGoalUserInputs;
        boolean weightGoalRecommendation;
        e12.e eVarC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f173153a;
        ty0.o oVar2 = this.f173154b;
        f1 f1Var = this.f173155c;
        db1.m mVar = null;
        if (i14 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            if (oVar2 != null) {
                if (oVar2 == ty0.o.f167046p && f1.b(f1Var)) {
                    if (f1Var.f173166b.y1() == ww0.a.PREGNANT) {
                        this.f173153a = 1;
                        objA = f1.a(f1Var, this);
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                }
                List<ty0.o> list = oVar2.f167057c;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    switch (a.f173156a[((ty0.o) obj2).ordinal()]) {
                        case 6:
                        case 7:
                            if (mVar == null && (weightGoalUserInputs = mVar.getWeightGoalUserInputs()) != null) {
                                weightGoalRecommendation = weightGoalUserInputs.getWeightGoalRecommendation();
                            } else {
                                weightGoalRecommendation = false;
                            }
                            break;
                        case 8:
                            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
                            eVarC = bo1.a.a().c();
                            if (!eVarC.M() || eVarC.U()) {
                                weightGoalRecommendation = false;
                            } else {
                                weightGoalRecommendation = true;
                            }
                            break;
                        case 9:
                            weightGoalRecommendation = f1Var.f173165a.g0();
                            break;
                        default:
                            weightGoalRecommendation = true;
                            break;
                    }
                    if (weightGoalRecommendation) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.m(oVar2, (ty0.o) it.next()));
                }
                return arrayList2;
            }
            ty0.o oVar3 = ty0.o.f167052x;
            ty0.o oVar4 = ty0.o.f167053y;
            ty0.o oVar5 = ty0.o.f167054z;
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null && !arrayListE.isEmpty()) {
                Iterator it3 = arrayListE.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        oVar = oVar5;
                        break;
                    }
                    if (((sd2.f) it3.next()).q4()) {
                        oVar = null;
                        break;
                    }
                }
            } else {
                oVar = oVar5;
                break;
            }
            Iterator it4 = p13.u.C(new ty0.o[]{oVar3, oVar4, oVar, zb0.n0.b().size() > 0 ? ty0.o.A : null, ty0.o.B, z10.d1.i(q92.x.DI_CONNECT_UPLOAD) ? ty0.o.C : null, ty0.o.D, ty0.o.E}).iterator();
            while (it4.hasNext()) {
                List<ty0.o> list2 = ((ty0.o) it4.next()).f167058d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    ty0.o oVar6 = (ty0.o) obj3;
                    com.garmin.android.apps.connectmobile.b1 b1Var = f1Var.f173165a;
                    f12.l lVar = f1Var.f173166b;
                    com.garmin.android.apps.connectmobile.b1 b1Var2 = f1Var.f173165a;
                    boolean z14 = (b1Var.g0() || b1Var.Z()) && b1Var2.l0();
                    int i15 = a.f173156a[oVar6.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    if (i15 != 5) {
                                    }
                                } else if (z14) {
                                    z14 = false;
                                }
                                z14 = true;
                            } else if (b1Var2.g0() || b1Var2.Z()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else if (f1.b(f1Var) && lVar.y1() == ww0.a.PREGNANT) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else if (!f1.b(f1Var) || lVar.y1() == ww0.a.PREGNANT) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(new com.garmin.android.apps.connectmobile.navigation.more.b.m(f1Var.f173169e, (ty0.o) it5.next()));
                }
                arrayListX.addAll(arrayList4);
            }
            return arrayListX;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        objA = obj;
        mVar = (db1.m) objA;
        List<ty0.o> list3 = oVar2.f167057c;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            switch (a.f173156a[((ty0.o) obj2).ordinal()]) {
                case 6:
                case 7:
                    if (mVar == null) {
                        weightGoalRecommendation = false;
                    } else {
                        weightGoalRecommendation = false;
                    }
                    break;
                case 8:
                    Map<zb0.u0, vg1.t> map2 = zb0.n0.f203577a;
                    eVarC = bo1.a.a().c();
                    if (!eVarC.M()) {
                    }
                    weightGoalRecommendation = false;
                    break;
                case 9:
                    weightGoalRecommendation = f1Var.f173165a.g0();
                    break;
                default:
                    weightGoalRecommendation = true;
                    break;
            }
            if (weightGoalRecommendation) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.garmin.android.apps.connectmobile.navigation.more.b.m(oVar2, (ty0.o) it.next()));
        }
        return arrayList2;
    }
}
