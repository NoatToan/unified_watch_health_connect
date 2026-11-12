package z52;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import e23.p;
import f12.l;
import java.util.List;
import m52.k;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import o61.h;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lz52/g;", "<anonymous>", "(Lo53/b0;)Lz52/g;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.preview.BiometricsProviderFactory$createBiometricProvider$2", f = "BiometricsProviderFactory.kt", l = {37, 38, 39, 40}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f202518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f202519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f202520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vk1.b f202521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f202522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f202523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f202524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f202525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f202526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PowerZonesDTO f202527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f202528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<v> f202529l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lvk1/b;", "<anonymous>", "(Lo53/b0;)Lvk1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.preview.BiometricsProviderFactory$createBiometricProvider$2$heartRateZonesJob$1", f = "BiometricsProviderFactory.kt", l = {31}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super vk1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202530a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super vk1.b> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f202530a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            o52.e eVar = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
            this.f202530a = 1;
            Object objX = eVar.x(true, this);
            return objX == aVar ? aVar : objX;
        }
    }

    /* JADX INFO: renamed from: z52.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lz52/e;", "<anonymous>", "(Lo53/b0;)Lz52/e;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.preview.BiometricsProviderFactory$createBiometricProvider$2$latestLactateThresholdJob$1", f = "BiometricsProviderFactory.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class C3778b extends i implements p<b0, t13.d<? super e>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202531a;

        public C3778b(t13.d<? super C3778b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C3778b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super e> dVar) {
            return new C3778b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f202531a;
            if (i14 == 0) {
                r.b(obj);
                o52.e eVar = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
                this.f202531a = 1;
                obj = eVar.u(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return h0.d0((List) obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo61/h;", "<anonymous>", "(Lo53/b0;)Lo61/h;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.preview.BiometricsProviderFactory$createBiometricProvider$2$latestPowerToWeightDataJob$1", f = "BiometricsProviderFactory.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202532a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super h> dVar) {
            return new c(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f202532a;
            if (i14 == 0) {
                r.b(obj);
                o52.e eVar = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
                this.f202532a = 1;
                obj = eVar.j(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return h0.d0((List) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.common.preview.BiometricsProviderFactory$createBiometricProvider$2$latestWeightJob$1", f = "BiometricsProviderFactory.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super v2<? extends Double>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202533a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Double>> dVar) {
            return new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f202533a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            this.f202533a = 1;
            Object objM = dVar.m(dateTimeNow, true, this);
            return objM == aVar ? aVar : objM;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PowerZonesDTO powerZonesDTO, k kVar, List<v> list, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f202527j = powerZonesDTO;
        this.f202528k = kVar;
        this.f202529l = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f202527j, this.f202528k, this.f202529l, dVar);
        bVar.f202526i = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super g> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0172  */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        i0 i0VarJ;
        i0 i0VarJ2;
        double d14;
        Object objC;
        Object objAwait;
        i0 i0Var;
        vk1.b bVar;
        e eVar;
        Object objAwait2;
        i0 i0Var2;
        vk1.b bVar2;
        e eVar2;
        h hVar;
        Object objAwait3;
        vk1.b bVar3;
        h hVar2;
        double d15;
        v2 v2Var;
        int iU;
        double dDoubleValue;
        Double weight;
        b0 b0Var = (b0) this.f202526i;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202525h;
        if (i14 == 0) {
            r.b(obj);
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new C3778b(null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new c(null), 3);
            i0VarJ2 = ge1.b.j(b0Var, null, null, new d(null), 3);
            PowerZonesDTO powerZonesDTO = this.f202527j;
            d14 = powerZonesDTO != null ? powerZonesDTO.f43987b : 200.0d;
            this.f202526i = null;
            this.f202518a = j0VarJ;
            this.f202519b = i0VarJ;
            this.f202520c = i0VarJ2;
            this.f202524g = d14;
            this.f202525h = 1;
            objC = j0VarJ2.C(this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            double d16 = this.f202524g;
            i0VarJ2 = this.f202520c;
            i0 i0Var3 = this.f202519b;
            j0VarJ = this.f202518a;
            r.b(obj);
            d14 = d16;
            i0VarJ = i0Var3;
            objC = obj;
        } else {
            if (i14 == 2) {
                double d17 = this.f202524g;
                bVar = this.f202521d;
                i0Var = this.f202520c;
                i0 i0Var4 = this.f202519b;
                r.b(obj);
                d14 = d17;
                i0VarJ = i0Var4;
                objAwait = obj;
                eVar = (e) objAwait;
                this.f202526i = null;
                this.f202518a = null;
                this.f202519b = null;
                this.f202520c = i0Var;
                this.f202521d = bVar;
                this.f202522e = eVar;
                this.f202524g = d14;
                this.f202525h = 3;
                objAwait2 = i0VarJ.await(this);
                if (objAwait2 != aVar) {
                    i0Var2 = i0Var;
                    bVar2 = bVar;
                    eVar2 = eVar;
                    hVar = (h) objAwait2;
                    this.f202526i = null;
                    this.f202518a = null;
                    this.f202519b = null;
                    this.f202520c = null;
                    this.f202521d = bVar2;
                    this.f202522e = eVar2;
                    this.f202523f = hVar;
                    this.f202524g = d14;
                    this.f202525h = 4;
                    objAwait3 = i0Var2.await(this);
                    if (objAwait3 != aVar) {
                        bVar3 = bVar2;
                        hVar2 = hVar;
                        d15 = d14;
                    }
                }
                return aVar;
            }
            if (i14 == 3) {
                double d18 = this.f202524g;
                eVar2 = this.f202522e;
                bVar2 = this.f202521d;
                i0Var2 = this.f202520c;
                r.b(obj);
                d14 = d18;
                objAwait2 = obj;
                hVar = (h) objAwait2;
                this.f202526i = null;
                this.f202518a = null;
                this.f202519b = null;
                this.f202520c = null;
                this.f202521d = bVar2;
                this.f202522e = eVar2;
                this.f202523f = hVar;
                this.f202524g = d14;
                this.f202525h = 4;
                objAwait3 = i0Var2.await(this);
                if (objAwait3 != aVar) {
                    bVar3 = bVar2;
                    hVar2 = hVar;
                    d15 = d14;
                }
                return aVar;
            }
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d19 = this.f202524g;
            hVar2 = this.f202523f;
            e eVar3 = this.f202522e;
            vk1.b bVar4 = this.f202521d;
            r.b(obj);
            d15 = d19;
            eVar2 = eVar3;
            bVar3 = bVar4;
            objAwait3 = obj;
        }
        v2Var = (v2) objAwait3;
        l.f68084a.getClass();
        iU = l.a.a().u();
        if (this.f202528k == k.f116754n) {
            if ((hVar2 != null ? hVar2.getFunctionalThresholdPower() : null) != null) {
                Double functionalThresholdPower = hVar2.getFunctionalThresholdPower();
                functionalThresholdPower.getClass();
                dDoubleValue = functionalThresholdPower.doubleValue();
            } else if (eVar2 != null) {
                dDoubleValue = (((1.0d / new Double(((double) 1) / eVar2.f202539a).doubleValue()) * 1.234d) + 0.6031d) * new Double(((hVar2 != null || (weight = hVar2.getWeight()) == null) && (!(v2Var instanceof v2.b) || (weight = (Double) ((v2.b) v2Var).f47386a) == null)) ? 75.0d : weight.doubleValue()).doubleValue();
            } else {
                dDoubleValue = 355.0d;
            }
        } else {
            dDoubleValue = 355.0d;
        }
        double d24 = dDoubleValue;
        if (eVar2 == null) {
            double d25 = ((double) (220 - iU)) * 0.85d;
            eVar2 = new e(3.3528d, new Integer(MathKt.b(d25)), new Integer(MathKt.b(d25)));
        }
        return new g(iU, eVar2, d24, bVar3, d15, this.f202527j, this.f202529l);
        vk1.b bVar5 = (vk1.b) objC;
        this.f202526i = null;
        this.f202518a = null;
        this.f202519b = i0VarJ;
        this.f202520c = i0VarJ2;
        this.f202521d = bVar5;
        this.f202524g = d14;
        this.f202525h = 2;
        objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ2;
            bVar = bVar5;
            eVar = (e) objAwait;
            this.f202526i = null;
            this.f202518a = null;
            this.f202519b = null;
            this.f202520c = i0Var;
            this.f202521d = bVar;
            this.f202522e = eVar;
            this.f202524g = d14;
            this.f202525h = 3;
            objAwait2 = i0VarJ.await(this);
            if (objAwait2 != aVar) {
                i0Var2 = i0Var;
                bVar2 = bVar;
                eVar2 = eVar;
                hVar = (h) objAwait2;
                this.f202526i = null;
                this.f202518a = null;
                this.f202519b = null;
                this.f202520c = null;
                this.f202521d = bVar2;
                this.f202522e = eVar2;
                this.f202523f = hVar;
                this.f202524g = d14;
                this.f202525h = 4;
                objAwait3 = i0Var2.await(this);
                if (objAwait3 != aVar) {
                    bVar3 = bVar2;
                    hVar2 = hVar;
                    d15 = d14;
                    v2Var = (v2) objAwait3;
                    l.f68084a.getClass();
                    iU = l.a.a().u();
                    if (this.f202528k == k.f116754n) {
                        if ((hVar2 != null ? hVar2.getFunctionalThresholdPower() : null) != null) {
                            Double functionalThresholdPower2 = hVar2.getFunctionalThresholdPower();
                            functionalThresholdPower2.getClass();
                            dDoubleValue = functionalThresholdPower2.doubleValue();
                        } else if (eVar2 != null) {
                            dDoubleValue = (((1.0d / new Double(((double) 1) / eVar2.f202539a).doubleValue()) * 1.234d) + 0.6031d) * new Double(((hVar2 != null || (weight = hVar2.getWeight()) == null) && (!(v2Var instanceof v2.b) || (weight = (Double) ((v2.b) v2Var).f47386a) == null)) ? 75.0d : weight.doubleValue()).doubleValue();
                        } else {
                            dDoubleValue = 355.0d;
                        }
                    } else {
                        dDoubleValue = 355.0d;
                    }
                    double d26 = dDoubleValue;
                    if (eVar2 == null) {
                        double d27 = ((double) (220 - iU)) * 0.85d;
                        eVar2 = new e(3.3528d, new Integer(MathKt.b(d27)), new Integer(MathKt.b(d27)));
                    }
                    return new g(iU, eVar2, d26, bVar3, d15, this.f202527j, this.f202529l);
                }
            }
        }
        return aVar;
    }
}
