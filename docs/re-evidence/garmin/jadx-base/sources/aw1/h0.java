package aw1;

import am.x0;
import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonTrainingHistory$1", f = "FBTPlanWizardViewModel.kt", l = {4315, 4316, 4317}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f13420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f13421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13424e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/y;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonTrainingHistory$1$cyclingHistory$1", f = "FBTPlanWizardViewModel.kt", l = {4316}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends jv1.y>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13426b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f13426b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends jv1.y>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13425a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f13426b.I;
            String str = x0.f4312o.f4358a;
            this.f13425a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.k(bVar, str, "distance", null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/y;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonTrainingHistory$1$runningHistory$1", f = "FBTPlanWizardViewModel.kt", l = {4317}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends jv1.y>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f13428b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f13428b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends jv1.y>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13427a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f13428b.I;
            String str = x0.f4308n.f4358a;
            this.f13427a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.k(bVar, str, "duration", null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ljv1/y;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonTrainingHistory$1$swimmingHistory$1", f = "FBTPlanWizardViewModel.kt", l = {4315}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends jv1.y>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f13430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f13430b = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f13430b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends jv1.y>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f13429a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            kv1.b bVar = this.f13430b.I;
            String str = x0.f4324r.f4358a;
            this.f13429a = 1;
            bVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new kv1.k(bVar, str, "distance", null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h hVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f13424e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h0 h0Var = new h0(this.f13424e, dVar);
        h0Var.f13423d = obj;
        return h0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x014f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        v2 v2Var;
        Object objC2;
        v2 v2Var2;
        Object objC3;
        v2 v2Var3;
        v2 v2Var4;
        jv1.d0 d0Var;
        Double recentWeeklyAvgValue;
        double dDoubleValue;
        hv1.j jVarB;
        Double recentWeeklyAvgValue2;
        hv1.f fVarA;
        jv1.b0 swimAbility;
        hv1.i iVarA;
        o53.b0 b0Var = (o53.b0) this.f13423d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13422c;
        h hVar = this.f13424e;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            ((y0) hVar.f13381n1.getValue()).j(g3.a.c(g3.f35298f));
            jv1.s sVarI6 = hVar.i6();
            if ((sVarI6 != null ? sVarI6.I : null) == null) {
                o53.j0 j0VarJ = ge1.b.j(b0Var, null, null, new c(hVar, null), 3);
                this.f13423d = b0Var;
                this.f13422c = 1;
                objC = j0VarJ.C(this);
                if (objC != aVar) {
                }
                return aVar;
            }
            y0 y0Var = (y0) hVar.f13381n1.getValue();
            jv1.s sVarI7 = hVar.i6();
            y0Var.j(g3.a.d(sVarI7 != null ? sVarI7.I : null));
            return Unit.INSTANCE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objC = obj;
        } else {
            if (i14 == 2) {
                v2Var = this.f13420a;
                o13.r.b(obj);
                objC2 = obj;
                v2Var2 = (v2) objC2;
                o53.j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(hVar, null), 3);
                this.f13423d = b0Var;
                this.f13420a = v2Var;
                this.f13421b = v2Var2;
                this.f13422c = 3;
                objC3 = j0VarJ2.C(this);
                if (objC3 != aVar) {
                    v2Var3 = v2Var;
                }
                return aVar;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 v2Var5 = this.f13421b;
            v2Var3 = this.f13420a;
            o13.r.b(obj);
            v2Var2 = v2Var5;
            objC3 = obj;
        }
        v2Var4 = (v2) objC3;
        d0Var = new jv1.d0(null, null, null, 7, null);
        if (v2Var3 instanceof v2.b) {
            swimAbility = ((jv1.y) ((v2.b) v2Var3).f47386a).getSwimAbility();
            if (swimAbility != null) {
                hv1.i.a aVar2 = hv1.i.f85867c;
                String strName = swimAbility.name();
                aVar2.getClass();
                iVarA = hv1.i.a.a(strName);
                if (iVarA == null) {
                    iVarA = hv1.i.NOVICE;
                }
                d0Var = jv1.d0.a(d0Var, iVarA, null, null, 6);
            }
        } else {
            if (v2Var3 instanceof v2.a) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error retrieving triathlon swimming history, using NOVICE. Exception=");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
        }
        if (v2Var2 instanceof v2.b) {
            recentWeeklyAvgValue2 = ((jv1.y) ((v2.b) v2Var2).f47386a).getRecentWeeklyAvgValue();
            if (recentWeeklyAvgValue2 != null) {
                double dDoubleValue2 = recentWeeklyAvgValue2.doubleValue();
                hv1.f.a aVar4 = hv1.f.f85850c;
                l3.f23124b.getClass();
                int i16 = ((int) dDoubleValue2) / DateTimeConstants.SECONDS_PER_HOUR;
                aVar4.getClass();
                fVarA = hv1.f.a.a(i16);
                if (fVarA == null) {
                    fVarA = hv1.f.ZERO_FOUR;
                }
            } else {
                fVarA = hv1.f.ZERO_FOUR;
            }
            d0Var = jv1.d0.a(d0Var, null, fVarA, null, 5);
        } else {
            if (v2Var2 instanceof v2.a) {
                u0.r();
                return null;
            }
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error retrieving triathlon cycling history, using 0-4 hours. Exception=");
            i2.a aVar5 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var2, "FBTPlanWizardViewModel", strD2);
        }
        if (v2Var4 instanceof v2.b) {
            hv1.j.a aVar6 = hv1.j.f85874d;
            jv1.y yVar = (jv1.y) ((v2.b) v2Var4).f47386a;
            recentWeeklyAvgValue = yVar.getRecentWeeklyAvgValue();
            if (recentWeeklyAvgValue != null) {
                dDoubleValue = recentWeeklyAvgValue.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            aVar6.getClass();
            jVarB = hv1.j.a.b(dDoubleValue);
            l3.a aVar7 = l3.f23124b;
            Double avgSpeed = yVar.getAvgSpeed();
            double dDoubleValue3 = avgSpeed != null ? avgSpeed.doubleValue() : 0.0d;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            aVar7.getClass();
            int iU = l3.a.u(dDoubleValue3, zY);
            if (jVarB == null) {
                jVarB = hv1.j.ZERO;
            }
            d0Var = jv1.d0.a(d0Var, null, null, new jv1.d(jVarB, iU, yVar), 3);
        } else {
            if (v2Var4 instanceof v2.a) {
                u0.r();
                return null;
            }
            String strH = androidx.room.a0.h("Error retrieving triathlon cycling history, using defaults. Exception=", v2Var4, ".exception}");
            i2.a aVar8 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar8.getClass();
            i2.a.f(a2Var3, "FBTPlanWizardViewModel", strH);
        }
        int i17 = h.S1;
        y0 y0Var2 = (y0) hVar.f13381n1.getValue();
        g3.f35298f.getClass();
        y0Var2.j(g3.a.d(d0Var));
        return Unit.INSTANCE;
        v2Var = (v2) objC;
        o53.j0 j0VarJ3 = ge1.b.j(b0Var, null, null, new a(hVar, null), 3);
        this.f13423d = b0Var;
        this.f13420a = v2Var;
        this.f13422c = 2;
        objC2 = j0VarJ3.C(this);
        if (objC2 != aVar) {
            v2Var2 = (v2) objC2;
            o53.j0 j0VarJ4 = ge1.b.j(b0Var, null, null, new b(hVar, null), 3);
            this.f13423d = b0Var;
            this.f13420a = v2Var;
            this.f13421b = v2Var2;
            this.f13422c = 3;
            objC3 = j0VarJ4.C(this);
            if (objC3 != aVar) {
                v2Var3 = v2Var;
                v2Var4 = (v2) objC3;
                d0Var = new jv1.d0(null, null, null, 7, null);
                if (v2Var3 instanceof v2.b) {
                    swimAbility = ((jv1.y) ((v2.b) v2Var3).f47386a).getSwimAbility();
                    if (swimAbility != null) {
                        hv1.i.a aVar9 = hv1.i.f85867c;
                        String strName2 = swimAbility.name();
                        aVar9.getClass();
                        iVarA = hv1.i.a.a(strName2);
                        if (iVarA == null) {
                            iVarA = hv1.i.NOVICE;
                        }
                        d0Var = jv1.d0.a(d0Var, iVarA, null, null, 6);
                    }
                } else {
                    if (v2Var3 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var3).f47383a, "Error retrieving triathlon swimming history, using NOVICE. Exception=");
                    i2.a aVar10 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar10.getClass();
                    i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD3);
                }
                if (v2Var2 instanceof v2.b) {
                    recentWeeklyAvgValue2 = ((jv1.y) ((v2.b) v2Var2).f47386a).getRecentWeeklyAvgValue();
                    if (recentWeeklyAvgValue2 != null) {
                        double dDoubleValue4 = recentWeeklyAvgValue2.doubleValue();
                        hv1.f.a aVar11 = hv1.f.f85850c;
                        l3.f23124b.getClass();
                        int i18 = ((int) dDoubleValue4) / DateTimeConstants.SECONDS_PER_HOUR;
                        aVar11.getClass();
                        fVarA = hv1.f.a.a(i18);
                        if (fVarA == null) {
                            fVarA = hv1.f.ZERO_FOUR;
                        }
                    } else {
                        fVarA = hv1.f.ZERO_FOUR;
                    }
                    d0Var = jv1.d0.a(d0Var, null, fVarA, null, 5);
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error retrieving triathlon cycling history, using 0-4 hours. Exception=");
                    i2.a aVar12 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar12.getClass();
                    i2.a.f(a2Var5, "FBTPlanWizardViewModel", strD4);
                }
                if (v2Var4 instanceof v2.b) {
                    hv1.j.a aVar13 = hv1.j.f85874d;
                    jv1.y yVar2 = (jv1.y) ((v2.b) v2Var4).f47386a;
                    recentWeeklyAvgValue = yVar2.getRecentWeeklyAvgValue();
                    if (recentWeeklyAvgValue != null) {
                        dDoubleValue = recentWeeklyAvgValue.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    aVar13.getClass();
                    jVarB = hv1.j.a.b(dDoubleValue);
                    l3.a aVar14 = l3.f23124b;
                    Double avgSpeed2 = yVar2.getAvgSpeed();
                    if (avgSpeed2 != null) {
                    }
                    boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                    aVar14.getClass();
                    int iU2 = l3.a.u(dDoubleValue3, zY2);
                    if (jVarB == null) {
                        jVarB = hv1.j.ZERO;
                    }
                    d0Var = jv1.d0.a(d0Var, null, null, new jv1.d(jVarB, iU2, yVar2), 3);
                } else {
                    if (v2Var4 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strH2 = androidx.room.a0.h("Error retrieving triathlon cycling history, using defaults. Exception=", v2Var4, ".exception}");
                    i2.a aVar15 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar15.getClass();
                    i2.a.f(a2Var6, "FBTPlanWizardViewModel", strH2);
                }
                int i19 = h.S1;
                y0 y0Var3 = (y0) hVar.f13381n1.getValue();
                g3.f35298f.getClass();
                y0Var3.j(g3.a.d(d0Var));
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
