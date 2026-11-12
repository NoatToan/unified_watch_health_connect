package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu21/e1;", "Landroidx/lifecycle/u1;", "Lu21/j1;", "weightData", "Lm42/b;", "weightsRepository", "Lal0/a;", "goalsRepository", "<init>", "(Lu21/j1;Lm42/b;Lal0/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f167942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m42.b f167943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al0.a f167944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f167945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f167946e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167947a;

        static {
            int[] iArr = new int[s21.s.values().length];
            try {
                iArr[s21.s.LOSE_WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.s.GAIN_WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f167947a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls21/b0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupWeightViewModel$weightState$1", f = "NutritionSetupWeightViewModel.kt", l = {56, 58}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super s21.b0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167948a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e1.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s21.b0> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
        
            if (r2 == r1) goto L40;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objX4;
            Object objY4;
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167948a;
            e1 e1Var = e1.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            j1 j1Var = e1Var.f167942a;
            boolean z14 = j1Var.f168019a;
            this.f167948a = 1;
            if (!zf.b.D(j1Var.f168021c) || z14) {
                objX4 = e1Var.x4(oVarD, this);
                if (objX4 != aVar) {
                    objX4 = Unit.INSTANCE;
                }
            } else {
                l3.a aVar2 = l3.f23124b;
                double dDoubleValue = j1Var.f168021c.doubleValue();
                aVar2.getClass();
                e1Var.C4(new Double(l3.a.P1(dDoubleValue)));
                objX4 = Unit.INSTANCE;
            }
            if (objX4 != aVar) {
            }
            return aVar;
            s21.s sVar = e1Var.f167942a.f168020b;
            if (sVar == s21.s.LOSE_WEIGHT || sVar == s21.s.GAIN_WEIGHT) {
                b63.o oVarD2 = g22.l.d(b63.o.INSTANCE);
                j1 j1Var2 = e1Var.f167942a;
                boolean z15 = j1Var2.f168019a;
                this.f167948a = 2;
                p2 p2Var = e1Var.f167945d;
                if (!zf.b.D(j1Var2.f168022d) || z15) {
                    objY4 = e1Var.y4(oVarD2, this);
                    if (objY4 != aVar) {
                        objY4 = Unit.INSTANCE;
                    }
                } else {
                    l3.a aVar3 = l3.f23124b;
                    double dDoubleValue2 = j1Var2.f168022d.doubleValue();
                    aVar3.getClass();
                    double dP1 = l3.a.P1(dDoubleValue2);
                    Double d14 = ((s21.b0) p2Var.getValue()).f156066a;
                    if (d14 != null && e1Var.B4(d14.doubleValue(), new Double(dP1))) {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, new Double(dP1), 0.0d, dP1, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
                    }
                    objY4 = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public e1(j1 j1Var, m42.b bVar, al0.a aVar) {
        j1Var.getClass();
        bVar.getClass();
        aVar.getClass();
        this.f167942a = j1Var;
        this.f167943b = bVar;
        this.f167944c = aVar;
        s21.s sVar = j1Var.f168020b;
        s21.s sVar2 = s21.s.MAINTAIN_WEIGHT;
        p2 p2VarA = q2.a(new s21.b0(null, null, A4(1.0d, 2.0d, 0.0d, 2.0d), A4(1.0d, 2.0d, 0.0d, 2.0d), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, sVar != sVar2, false, false, 7155, null));
        this.f167945d = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f167946e = r53.s.K(vVar, aVarA, k2.a.f150706c, new s21.b0(null, null, A4(1.0d, 2.0d, 0.0d, 2.0d), A4(1.0d, 2.0d, 0.0d, 2.0d), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, sVar != sVar2, false, false, 7155, null));
    }

    public static double A4(double d14, double d15, double d16, double d17) {
        k42.b.f102880a.getClass();
        int iL = k42.b.l();
        if (iL == 0) {
            return d14;
        }
        if (iL != 1) {
            l3.f23124b.getClass();
            return l3.a.W1(d16, d17);
        }
        l3.f23124b.getClass();
        return d15 / 2.20462d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o13.u z4(double d14, boolean z14) {
        o13.p pVar;
        l3.f23124b.getClass();
        int i14 = (int) ((d14 / 6350.0d) * ((double) 1000));
        double d15 = 0.0d;
        double dW1 = (d14 - l3.a.W1(i14, 0.0d)) * 2.20462d;
        double d16 = 13.9d;
        if (z14) {
            double d17 = dW1 - 0.1d;
            if (d17 < 0.0d) {
                i14--;
                if (i14 < 0) {
                    i14 = 0;
                }
            } else {
                d16 = d17;
            }
            if (i14 == 0 && d16 < 2.0d) {
                d16 = 2.0d;
            }
            pVar = new o13.p(Integer.valueOf(i14), Double.valueOf(d16));
        } else {
            double d18 = dW1 + 0.1d;
            if (d18 > 13.9d) {
                i14++;
                if (i14 > 71) {
                    i14 = 71;
                }
            } else {
                d15 = d18;
            }
            pVar = new o13.p(Integer.valueOf(i14), Double.valueOf(d15));
        }
        int iIntValue = ((Number) pVar.f128594a).intValue();
        double dDoubleValue = ((Number) pVar.f128595b).doubleValue();
        double d19 = iIntValue;
        return new o13.u(Double.valueOf(j23.t.c((dDoubleValue / 14.0d) + d19, 0.14d, 71.0d)), Double.valueOf(d19), Double.valueOf(dDoubleValue));
    }

    public final boolean B4(double d14, Double d15) {
        s21.s sVar = this.f167942a.f168020b;
        int i14 = sVar == null ? -1 : a.f167947a[sVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2 || d15.doubleValue() <= d14) {
                return false;
            }
        } else if (d15.doubleValue() >= d14) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void C4(Double d14) {
        double dDoubleValue;
        Object value;
        s21.b0 b0Var;
        double dC;
        double dC2;
        double dDoubleValue2;
        double dA4;
        double dDoubleValue3;
        Object value2;
        if (d14 == null) {
            return;
        }
        l3.a aVar = l3.f23124b;
        double dDoubleValue4 = d14.doubleValue();
        aVar.getClass();
        double d15 = dDoubleValue4 * 2.20462d;
        s21.s sVar = this.f167942a.f168020b;
        int i14 = sVar == null ? -1 : a.f167947a[sVar.ordinal()];
        p2 p2Var = this.f167945d;
        if (i14 != 1) {
            if (i14 != 2) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, s21.b0.a((s21.b0) value2, d14, null, d14.doubleValue(), 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8186)));
                return;
            }
            do {
                value = p2Var.getValue();
                b0Var = (s21.b0) value;
                dC = j23.t.c(d14.doubleValue() + 0.1d, 1.0d, 453.5d);
                dC2 = j23.t.c(d15 + 0.1d, 2.0d, 999.9d);
                o13.u uVarZ4 = z4(d14.doubleValue(), false);
                dDoubleValue2 = ((Number) uVarZ4.f128605a).doubleValue();
                dA4 = A4(dC, dC2, ((Number) uVarZ4.f128606b).doubleValue(), ((Number) uVarZ4.f128607c).doubleValue());
                dDoubleValue3 = d14.doubleValue();
                Double d16 = b0Var.f156067b;
                if (d16 != null) {
                    if (d16.doubleValue() <= d14.doubleValue()) {
                        d16 = null;
                    }
                    if (d16 != null) {
                        dA4 = d16.doubleValue();
                    }
                }
            } while (!p2Var.b(value, s21.b0.a(b0Var, d14, null, dDoubleValue3, dA4, 0.0d, 0.0d, 0.0d, dC, dC2, dDoubleValue2, false, false, 7282)));
            return;
        }
        double dC3 = j23.t.c(d14.doubleValue() - 0.1d, 1.0d, 453.5d);
        double dC4 = j23.t.c(d15 - 0.1d, 2.0d, 999.9d);
        o13.u uVarZ5 = z4(d14.doubleValue(), true);
        double dDoubleValue5 = ((Number) uVarZ5.f128605a).doubleValue();
        double dA5 = A4(dC3, dC4, ((Number) uVarZ5.f128606b).doubleValue(), ((Number) uVarZ5.f128607c).doubleValue());
        while (true) {
            Object value3 = p2Var.getValue();
            s21.b0 b0Var2 = (s21.b0) value3;
            double dDoubleValue6 = d14.doubleValue();
            Double d17 = b0Var2.f156067b;
            if (d17 == null) {
                dDoubleValue = dA5;
            } else {
                if (d17.doubleValue() >= d14.doubleValue()) {
                    d17 = null;
                }
                if (d17 != null) {
                    dDoubleValue = d17.doubleValue();
                } else {
                    dDoubleValue = dA5;
                }
            }
            double d18 = dC3;
            double d19 = dDoubleValue5;
            s21.b0 b0VarA = s21.b0.a(b0Var2, d14, null, dDoubleValue6, dDoubleValue, d18, dC4, d19, 0.0d, 0.0d, 0.0d, false, false, 8066);
            dC3 = d18;
            if (p2Var.b(value3, b0VarA)) {
                return;
            } else {
                dDoubleValue5 = d19;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x4(b63.o oVar, v13.c cVar) {
        f1 f1Var;
        Double d14;
        Double d15;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i14 = f1Var.f167960c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f1Var.f167960c = i14 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objJ = f1Var.f167958a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f1Var.f167960c;
        if (i15 == 0) {
            o13.r.b(objJ);
            f1Var.f167960c = 1;
            m42.b bVar = this.f167943b;
            bVar.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new m42.g(oVar, true, null), f1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Double weight = ((l42.h) ((v2.b) v2Var).f47386a).getWeight();
            if (weight == null) {
                d14 = this.f167942a.f168021c;
            } else {
                d14 = weight.doubleValue() > 0.0d ? weight : null;
                if (d14 == null) {
                    d14 = this.f167942a.f168021c;
                }
            }
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                l3.f23124b.getClass();
                d15 = new Double(l3.a.P1(dDoubleValue));
            } else {
                d15 = ((s21.b0) this.f167945d.getValue()).f156066a;
            }
            C4(d15);
        } else if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y4(b63.o oVar, v13.c cVar) {
        g1 g1Var;
        Object value;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f167977c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f167977c = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        Object objJ = g1Var.f167975a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f167977c;
        if (i15 == 0) {
            o13.r.b(objJ);
            String string = new fz0.c(null, oVar, 1, null).toString();
            g1Var.f167977c = 1;
            al0.a aVar2 = this.f167944c;
            aVar2.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar2, new al0.f(aVar2, "weight-grams", string, null), g1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Integer num = new Integer(((zk0.h) ((v2.b) v2Var).f47386a).C());
            Number number = num.intValue() > 0 ? num : null;
            if (number == null) {
                number = this.f167942a.f168022d;
            }
            if (number == null) {
                return Unit.INSTANCE;
            }
            double dDoubleValue = number.doubleValue();
            l3.f23124b.getClass();
            double dP1 = l3.a.P1(dDoubleValue);
            p2 p2Var = this.f167945d;
            Double d14 = ((s21.b0) p2Var.getValue()).f156066a;
            if (d14 == null) {
                return Unit.INSTANCE;
            }
            if (B4(d14.doubleValue(), new Double(dP1))) {
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, s21.b0.a((s21.b0) value, null, new Double(dP1), 0.0d, dP1, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, 8181)));
            }
        } else if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        return Unit.INSTANCE;
    }
}
