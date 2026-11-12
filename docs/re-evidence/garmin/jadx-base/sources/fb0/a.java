package fb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gg1.o0;
import j23.l;
import j23.t;
import lc.u0;
import ne2.c0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import vb.h;
import z80.i;
import z80.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfb0/a;", "Landroidx/lifecycle/u1;", "Lz80/i;", "data", "Lt90/a;", "getHeightDataUseCase", "<init>", "(Lz80/i;Lt90/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f70169g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f70170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f70171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f70172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f70173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f70174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f70175f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgb0/a;", "heightData", "Lgg1/o0;", "measurementSystem", "<anonymous>", "(Lgb0/a;Lgg1/o0;)Lgb0/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.HeightPickerViewModel$heightData$1", f = "HeightPickerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements q<gb0.a, o0, t13.d<? super gb0.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ gb0.a f70176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ o0 f70177b;

        /* JADX INFO: renamed from: fb0.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1437a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f70178a;

            static {
                int[] iArr = new int[o0.values().length];
                try {
                    iArr[o0.METRIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f70178a = iArr;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(gb0.a aVar, o0 o0Var, t13.d<? super gb0.a> dVar) {
            b bVar = new b(dVar);
            bVar.f70176a = aVar;
            bVar.f70177b = o0Var;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            gb0.a aVar = this.f70176a;
            o0 o0Var = this.f70177b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (C1437a.f70178a[o0Var.ordinal()] == 1) {
                if (aVar instanceof gb0.a.c) {
                    gb0.a.c cVar = (gb0.a.c) aVar;
                    double d14 = (((double) cVar.f76639b) * 12.0d) + ((double) cVar.f76640c);
                    l3.f23124b.getClass();
                    return new gb0.a.b((float) (((double) ((float) d14)) * 2.54d));
                }
            } else if (aVar instanceof gb0.a.b) {
                return ((gb0.a.b) aVar).b();
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements r53.i<i53.f<? extends f>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f70179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f70180b;

        /* JADX INFO: renamed from: fb0.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1438a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f70181a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f70182b;

            /* JADX INFO: renamed from: fb0.a$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.HeightPickerViewModel$special$$inlined$map$1$2", f = "HeightPickerViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1439a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f70183a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f70184b;

                public C1439a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f70183a = obj;
                    this.f70184b |= Integer.MIN_VALUE;
                    return C1438a.this.emit(null, this);
                }
            }

            public C1438a(j jVar, a aVar) {
                this.f70181a = jVar;
                this.f70182b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1439a c1439a;
                i53.f fVarJ;
                Integer numValueOf;
                i53.f fVarA;
                if (dVar instanceof C1439a) {
                    c1439a = (C1439a) dVar;
                    int i14 = c1439a.f70184b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1439a.f70184b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1439a = new C1439a(dVar);
                    }
                } else {
                    c1439a = new C1439a(dVar);
                }
                Object obj2 = c1439a.f70183a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1439a.f70184b;
                if (i15 == 0) {
                    r.b(obj2);
                    gb0.a aVar2 = (gb0.a) obj;
                    int i16 = a.f70169g;
                    a aVar3 = this.f70182b;
                    aVar3.getClass();
                    boolean z14 = aVar2 instanceof gb0.a.b;
                    int i17 = 8;
                    if (z14) {
                        fVarJ = i53.a.j(h0.b1(new l(92, 254)));
                    } else {
                        if (!(aVar2 instanceof gb0.a.c)) {
                            u0.r();
                            return null;
                        }
                        fVarJ = i53.a.j(h0.b1(new l(3, 8)));
                    }
                    double d14 = aVar3.f70170a.f203061c == k.MALE ? 175 : 162;
                    if (z14) {
                        int iIndexOf = fVarJ.indexOf(Integer.valueOf((int) ((gb0.a.b) aVar2).f76637b));
                        numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
                        fVarA = i53.a.a(new f(numValueOf != null ? numValueOf.intValue() : 0, fVarJ, Integer.valueOf(R.string.lbl_cm), new c0(fVarJ, d14, aVar3)));
                    } else {
                        if (!(aVar2 instanceof gb0.a.c)) {
                            u0.r();
                            return null;
                        }
                        gb0.a.c cVar = (gb0.a.c) aVar2;
                        int i18 = cVar.f76639b;
                        int i19 = cVar.f76640c;
                        int iIndexOf2 = fVarJ.indexOf(Integer.valueOf(i18));
                        numValueOf = iIndexOf2 >= 0 ? Integer.valueOf(iIndexOf2) : null;
                        fVarA = i53.a.a(new f(numValueOf != null ? numValueOf.intValue() : 0, fVarJ, Integer.valueOf(R.string.lbl_foot), new e52.b(15, fVarJ, aVar3)), new f(t.f(i19, new l(0, i18 == 8 ? 4 : 11)), i53.a.j(new l(0, i18 == 8 ? 4 : 11)), Integer.valueOf(R.string.lbl_inch), new f2.o0(aVar3, i17)));
                    }
                    c1439a.f70184b = 1;
                    if (this.f70181a.emit(fVarA, c1439a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public c(r53.i iVar, a aVar) {
            this.f70179a = iVar;
            this.f70180b = aVar;
        }

        @Override // r53.i
        public final Object collect(j<? super i53.f<? extends f>> jVar, t13.d dVar) {
            Object objCollect = this.f70179a.collect(new C1438a(jVar, this.f70180b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new C1436a(null);
    }

    public a(i iVar, t90.a aVar) {
        iVar.getClass();
        aVar.getClass();
        this.f70170a = iVar;
        double d14 = iVar.f203059a;
        k kVar = iVar.f203061c;
        o0 o0Var = iVar.f203060b;
        gb0.a.b bVar = new gb0.a.b((float) ((Double.isNaN(d14) || d14 == 0.0d) ? (kVar == null || kVar == k.MALE) ? 175 : 162 : d14));
        gb0.a.b bVarB = o0Var.a() ? bVar : bVar.b();
        p2 p2VarA = q2.a(o0Var);
        this.f70171b = p2VarA;
        b2 b2VarD = s.d(p2VarA);
        this.f70172c = b2VarD;
        p2 p2VarA2 = q2.a(bVarB);
        this.f70173d = p2VarA2;
        r53.u1 u1Var = new r53.u1(p2VarA2, b2VarD, new b(null));
        w9.a aVarA = v1.a(this);
        k2.a aVar2 = k2.f150703a;
        b2 b2VarK = s.K(u1Var, aVarA, k2.a.a(aVar2, 2), bVarB);
        this.f70174e = b2VarK;
        this.f70175f = s.K(new c(b2VarK, this), v1.a(this), k2.a.a(aVar2, 2), j53.l.b());
    }

    /* JADX INFO: renamed from: fb0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lfb0/a$a;", "", "<init>", "()V", "", "MINIMUM_HEIGHT_METRIC", "I", "MAXIMUM_HEIGHT_METRIC", "MAXIMUM_HEIGHT_STATUTE_DECIMAL", "MAXIMUM_HEIGHT_STATUTE", "MINIMUM_HEIGHT_STATUTE", "MAXIMUM_HEIGHT_STATUTE_DECIMAL_WHEN_MAX_HEIGHT_WHOLE", "DEFAULT_HEIGHT_MALE", "DEFAULT_HEIGHT_FEMALE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1436a {
        public /* synthetic */ C1436a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1436a() {
        }
    }
}
