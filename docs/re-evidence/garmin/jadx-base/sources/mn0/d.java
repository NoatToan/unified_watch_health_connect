package mn0;

import b63.q;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmn0/d;", "", "Lnm1/a;", "sleepRepository", "Lm41/a;", "overnightHRVRepository", "Lkn0/a;", "healthStatusRepository", "<init>", "(Lnm1/a;Lm41/a;Lkn0/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm1.a f119697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m41.a f119698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kn0.a f119699c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119700a;

        static {
            int[] iArr = new int[in0.m.values().length];
            try {
                iArr[in0.m.HRV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f119700a = iArr;
        }
    }

    public d(nm1.a aVar, m41.a aVar2, kn0.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.f119697a = aVar;
        this.f119698b = aVar2;
        this.f119699c = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(in0.m mVar, b63.o oVar, v13.c cVar) throws Exception {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f119703c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f119703c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.f119701a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f119703c;
        if (i15 == 0) {
            r.b(objB);
            if (a.f119700a[mVar.ordinal()] != 1) {
                return null;
            }
            eVar.f119703c = 1;
            objB = b(oVar, eVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        return new in0.h.b((i41.e) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(b63.o oVar, v13.c cVar) throws Exception {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f119706c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f119706c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA = fVar.f119704a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f119706c;
        if (i15 == 0) {
            r.b(objA);
            b63.i.INSTANCE.getClass();
            b63.o oVarC = q.c(oVar, 6, b63.i.f16190d);
            fVar.f119706c = 1;
            objA = this.f119698b.a(oVarC, oVar, fVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            return (i41.e) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }
}
