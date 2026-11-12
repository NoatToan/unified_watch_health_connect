package qr;

import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsStateCollector$1", f = "ActivityDetailsViewModel.kt", l = {3494}, m = "invokeSuspend", v = 2)
public final class o5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146401b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lnr/c;", "detailsChartsData", "Lnr/v;", "deviceData", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/q0;", "targetData", "Lnr/n0;", "roundsExerciseSets", "Lnr/t$a;", "<anonymous>", "(Lnr/c;Lnr/v;Landroid/util/SparseArray;Lnr/n0;)Lnr/t$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsStateCollector$1$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.s<nr.c, nr.v, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0>, nr.n0, t13.d<? super nr.t.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ nr.c f146402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ nr.v f146403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ SparseArray f146404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ nr.n0 f146405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f146406e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, t13.d<? super a> dVar) {
            super(5, dVar);
            this.f146406e = tVar;
        }

        @Override // e23.s
        public final Object invoke(nr.c cVar, nr.v vVar, SparseArray<com.garmin.android.apps.connectmobile.activities.newmodel.q0> sparseArray, nr.n0 n0Var, t13.d<? super nr.t.a> dVar) {
            a aVar = new a(this.f146406e, dVar);
            aVar.f146402a = cVar;
            aVar.f146403b = vVar;
            aVar.f146404c = sparseArray;
            aVar.f146405d = n0Var;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0179  */
        /* JADX WARN: Code duplicated, block: B:102:0x017d  */
        /* JADX WARN: Code duplicated, block: B:103:0x0182  */
        /* JADX WARN: Code duplicated, block: B:105:0x0186  */
        /* JADX WARN: Code duplicated, block: B:106:0x018d  */
        /* JADX WARN: Code duplicated, block: B:108:0x0191  */
        /* JADX WARN: Code duplicated, block: B:109:0x0198  */
        /* JADX WARN: Code duplicated, block: B:111:0x019c  */
        /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:115:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:116:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:118:0x01df  */
        /* JADX WARN: Code duplicated, block: B:120:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:121:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:123:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:126:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:127:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:129:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:130:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:136:0x0217  */
        /* JADX WARN: Code duplicated, block: B:142:0x022b  */
        /* JADX WARN: Code duplicated, block: B:96:0x016b  */
        /* JADX WARN: Code duplicated, block: B:97:0x0170  */
        /* JADX WARN: Code duplicated, block: B:99:0x0174  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Double d14;
            String str;
            Double d15;
            ps.s0 s0Var;
            com.garmin.android.apps.connectmobile.activities.newmodel.f fVar;
            ps.k0 diveInfoDTO;
            com.garmin.android.apps.connectmobile.activities.newmodel.p deviceDisplayUnitsDTO;
            ps.a1 metadataDTO;
            List<List<jr.f>> list;
            List<im.b> list2;
            List<im.b> list3;
            com.garmin.android.apps.connectmobile.activities.newmodel.l0 l0Var;
            boolean zJ;
            boolean z14;
            List listB;
            List listB2;
            Double dValueOf;
            ps.p pVar;
            ps.a1 metadataDTO2;
            to.o typeDTO;
            ps.p pVar2;
            nr.o oVar;
            nr.c cVar = this.f146402a;
            nr.v vVar = this.f146403b;
            SparseArray sparseArray = this.f146404c;
            nr.n0 n0Var = this.f146405d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            nr.a aVar2 = cVar != null ? cVar.f126996a : null;
            ps.r rVar = (aVar2 == null || (oVar = aVar2.f126975b) == null) ? null : oVar.f127269a;
            List<ps.x0> listG = (aVar2 == null || (pVar2 = aVar2.f126977d) == null) ? null : pVar2.g();
            String strJ = (rVar == null || (typeDTO = rVar.getTypeDTO()) == null) ? null : typeDTO.j();
            ps.q1 summaryDTO = rVar != null ? rVar.getSummaryDTO() : null;
            List<ps.o1> listT = rVar != null ? rVar.t() : null;
            List<ps.c0> list4 = vVar != null ? vVar.f127379b : null;
            ActivityDetailChartDTO activityDetailChartDTO = aVar2 != null ? aVar2.f126976c : null;
            t tVar = this.f146406e;
            nr.a aVar3 = aVar2;
            double dH = o72.t.H(activityDetailChartDTO, tVar.Q1.getValue() == rr.k.DISTANCE ? fz.c.DISTANCE : fz.c.TIME);
            ps.r rVar2 = rVar;
            List<ps.x0> list5 = listG;
            Double d16 = listG != null ? new Double(og.a.H(list5)) : null;
            ps.e2 e2VarX0 = (rVar2 == null || (metadataDTO2 = rVar2.getMetadataDTO()) == null) ? null : metadataDTO2.x0();
            if (list5 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list5.iterator();
                while (it.hasNext()) {
                    Double averageSpeed = ((ps.x0) it.next()).getAverageSpeed();
                    Double d17 = zf.b.D(averageSpeed) ? averageSpeed : null;
                    if (d17 != null) {
                        arrayList.add(d17);
                    }
                }
                Double dP0 = p13.h0.p0(arrayList);
                d14 = new Double(dP0 != null ? dP0.doubleValue() : 0.0d);
            } else {
                d14 = null;
            }
            List<ps.x1> listI = (aVar3 == null || (pVar = aVar3.f126977d) == null) ? null : pVar.i();
            if (listI != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listI) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.g0.a aVar4 = com.garmin.android.apps.connectmobile.activities.newmodel.g0.f29436c;
                    String internalType = ((ps.x1) obj2).getInternalType();
                    aVar4.getClass();
                    if (com.garmin.android.apps.connectmobile.activities.newmodel.g0.a.b(internalType)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    Double avgPower = ((ps.x1) it3.next()).getAvgPower();
                    double dDoubleValue = avgPower != null ? avgPower.doubleValue() : 0.0d;
                    for (Iterator it4 = it3; it4.hasNext(); it4 = it4) {
                        Double avgPower2 = ((ps.x1) it4.next()).getAvgPower();
                        dDoubleValue = Math.max(dDoubleValue, avgPower2 != null ? avgPower2.doubleValue() : 0.0d);
                        strJ = strJ;
                    }
                    str = strJ;
                    dValueOf = Double.valueOf(dDoubleValue);
                } else {
                    str = strJ;
                    dValueOf = null;
                }
                double dDoubleValue2 = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                if (aVar3 != null) {
                    d15 = aVar3.f126978e;
                } else {
                    d15 = null;
                }
                if (n0Var != null) {
                    s0Var = n0Var.f127266b;
                } else {
                    s0Var = null;
                }
                if (n0Var != null) {
                    fVar = n0Var.f127265a;
                } else {
                    fVar = null;
                }
                if (rVar2 != null) {
                    diveInfoDTO = rVar2.getDiveInfoDTO();
                } else {
                    diveInfoDTO = null;
                }
                if (rVar2 != null) {
                    deviceDisplayUnitsDTO = rVar2.getDeviceDisplayUnitsDTO();
                } else {
                    deviceDisplayUnitsDTO = null;
                }
                if (rVar2 != null) {
                    metadataDTO = rVar2.getMetadataDTO();
                } else {
                    metadataDTO = null;
                }
                ls.a aVar5 = new ls.a(str, summaryDTO, metadataDTO, list4, false, null, null, listT, new Double(dH), d16, e2VarX0, d14, new Double(dDoubleValue2), d15, null, null, null, null, s0Var, fVar, diveInfoDTO, null, null, null, deviceDisplayUnitsDTO, 14925936, null);
                rr.h hVar = new rr.h(tVar.f146555r2);
                if (cVar != null) {
                    list = cVar.f127000e;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = p13.j0.f134944a;
                }
                if (cVar != null) {
                    list2 = cVar.f126998c;
                } else {
                    list2 = null;
                }
                if (cVar != null) {
                    list3 = cVar.f126999d;
                } else {
                    list3 = null;
                }
                if (cVar != null) {
                    l0Var = cVar.f126997b;
                } else {
                    l0Var = null;
                }
                if (rVar2 != null) {
                    zJ = oe2.f.J(rVar2);
                } else {
                    zJ = false;
                }
                am.e eVar = tVar.X1;
                list.getClass();
                eVar.getClass();
                if (list2 == null && (!list2.isEmpty())) {
                    z14 = zJ;
                    listB = hVar.b(list, list2, aVar5, l0Var, sparseArray, z14);
                } else {
                    z14 = zJ;
                    listB = p13.j0.f134944a;
                }
                if (list3 == null && (!list3.isEmpty())) {
                    listB2 = hVar.b(list, list3, aVar5, l0Var, sparseArray, z14);
                } else {
                    listB2 = p13.j0.f134944a;
                }
                return new nr.t.a(null, listB, listB2, sparseArray, 1, null);
            }
            str = strJ;
            if (aVar3 != null) {
                d15 = aVar3.f126978e;
            } else {
                d15 = null;
            }
            if (n0Var != null) {
                s0Var = n0Var.f127266b;
            } else {
                s0Var = null;
            }
            if (n0Var != null) {
                fVar = n0Var.f127265a;
            } else {
                fVar = null;
            }
            if (rVar2 != null) {
                diveInfoDTO = rVar2.getDiveInfoDTO();
            } else {
                diveInfoDTO = null;
            }
            if (rVar2 != null) {
                deviceDisplayUnitsDTO = rVar2.getDeviceDisplayUnitsDTO();
            } else {
                deviceDisplayUnitsDTO = null;
            }
            if (rVar2 != null) {
                metadataDTO = rVar2.getMetadataDTO();
            } else {
                metadataDTO = null;
            }
            ls.a aVar6 = new ls.a(str, summaryDTO, metadataDTO, list4, false, null, null, listT, new Double(dH), d16, e2VarX0, d14, new Double(dDoubleValue2), d15, null, null, null, null, s0Var, fVar, diveInfoDTO, null, null, null, deviceDisplayUnitsDTO, 14925936, null);
            rr.h hVar2 = new rr.h(tVar.f146555r2);
            if (cVar != null) {
                list = cVar.f127000e;
            } else {
                list = null;
            }
            if (list == null) {
                list = p13.j0.f134944a;
            }
            if (cVar != null) {
                list2 = cVar.f126998c;
            } else {
                list2 = null;
            }
            if (cVar != null) {
                list3 = cVar.f126999d;
            } else {
                list3 = null;
            }
            if (cVar != null) {
                l0Var = cVar.f126997b;
            } else {
                l0Var = null;
            }
            if (rVar2 != null) {
                zJ = oe2.f.J(rVar2);
            } else {
                zJ = false;
            }
            am.e eVar2 = tVar.X1;
            list.getClass();
            eVar2.getClass();
            if (list2 == null) {
                z14 = zJ;
                listB = p13.j0.f134944a;
            } else {
                z14 = zJ;
                listB = p13.j0.f134944a;
            }
            if (list3 == null) {
                listB2 = p13.j0.f134944a;
            } else {
                listB2 = p13.j0.f134944a;
            }
            return new nr.t.a(null, listB, listB2, sparseArray, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lnr/t$a;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initChartsStateCollector$1$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.q<r53.j<? super nr.t.a>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f146407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f146408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f146409c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, t13.d<? super b> dVar) {
            super(3, dVar);
            this.f146409c = tVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super nr.t.a> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            b bVar = new b(this.f146409c, dVar);
            bVar.f146407a = jVar;
            bVar.f146408b = th3;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f146408b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strConcat = "ChartsState ".concat(o13.g.b(th3));
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strConcat);
            this.f146409c.L1.k(null, new nr.i(null, false, true, null, 11, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146410a;

        public c(t tVar) {
            this.f146410a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f146410a.P1.setValue((nr.t.a) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(t tVar, t13.d<? super o5> dVar) {
        super(2, dVar);
        this.f146401b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o5(this.f146401b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146400a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = t.A2;
            t tVar = this.f146401b;
            r53.w wVar = new r53.w(r53.s.m(tVar.b5(), tVar.h5(), (r53.z1) tVar.f146551q1.getValue(), (r53.z1) tVar.Z0.getValue(), new a(tVar, null)), new b(tVar, null));
            c cVar = new c(tVar);
            this.f146400a = 1;
            if (wVar.collect(cVar, this) == aVar) {
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
