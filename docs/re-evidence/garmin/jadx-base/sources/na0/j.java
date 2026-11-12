package na0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import d53.t;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lna0/j;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f125129e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f125130f = x.k("2", "5", "6", "2", "2");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f125131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f125132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f125133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f125134d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f125135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f125136b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f125137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f125138b;

            /* JADX INFO: renamed from: na0.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationViewModel$special$$inlined$map$1$2", f = "BikeWheelCircumferenceEstimationViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2410a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f125139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f125140b;

                public C2410a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f125139a = obj;
                    this.f125140b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, j jVar2) {
                this.f125137a = jVar;
                this.f125138b = jVar2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2410a c2410a;
                if (dVar instanceof C2410a) {
                    c2410a = (C2410a) dVar;
                    int i14 = c2410a.f125140b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2410a.f125140b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2410a = new C2410a(dVar);
                    }
                } else {
                    c2410a = new C2410a(dVar);
                }
                Object obj2 = c2410a.f125139a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2410a.f125140b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    a aVar2 = j.f125129e;
                    this.f125138b.getClass();
                    i iVarX4 = j.x4((List) obj);
                    c2410a.f125140b = 1;
                    if (this.f125137a.emit(iVarX4, c2410a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar, j jVar) {
            this.f125135a = iVar;
            this.f125136b = jVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super i> jVar, t13.d dVar) {
            Object objCollect = this.f125135a.collect(new a(jVar, this.f125136b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public j() {
        p2 p2VarA = q2.a(h0.d1(f125130f));
        this.f125131a = p2VarA;
        this.f125132b = r53.s.K(new b(p2VarA, this), v1.a(this), k2.a.a(k2.f150703a, 2), x4((List) p2VarA.getValue()));
        e2 e2VarB = g2.b(0, 1, null, 5);
        this.f125133c = e2VarB;
        this.f125134d = r53.s.c(e2VarB);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    public static i x4(List list) {
        boolean z14;
        int i14;
        if (list != null && list.isEmpty()) {
            z14 = true;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = true;
                break;
            }
            if (((String) it.next()).length() <= 0) {
                z14 = false;
                break;
            }
        }
        if (z14) {
            Integer numI = t.i((String) list.get(0));
            int iIntValue = (numI != null ? numI.intValue() : 0) * 10;
            Integer numI2 = t.i((String) list.get(1));
            int iIntValue2 = iIntValue + (numI2 != null ? numI2.intValue() : 0);
            Integer numI3 = t.i((String) list.get(2));
            int iIntValue3 = (numI3 != null ? numI3.intValue() : 0) * 100;
            Integer numI4 = t.i((String) list.get(3));
            int iIntValue4 = ((numI4 != null ? numI4.intValue() : 0) * 10) + iIntValue3;
            Integer numI5 = t.i((String) list.get(4));
            int iIntValue5 = iIntValue4 + (numI5 != null ? numI5.intValue() : 0);
            if (iIntValue2 <= 0 || iIntValue5 <= 0) {
                i14 = 0;
            } else {
                i14 = (int) (((double) ((iIntValue2 * 2) + iIntValue5)) * 3.141592653589793d);
            }
        } else {
            i14 = 0;
        }
        return new i(list, i14, z14 && i14 > 0, z14);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lna0/j$a;", "", "<init>", "()V", "", "DIGIT_COUNT", "I", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
