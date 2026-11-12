package qy1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqy1/b;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f148554a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public b(d60.b bVar) {
        bVar.getClass();
        this.f148554a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ab1.g gVar, my1.c cVar, v13.c cVar2) {
        a aVar;
        v2 v2Var;
        a01.a aVar2;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i14 = aVar.f148553d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f148553d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar2);
            }
        } else {
            aVar = new a(this, cVar2);
        }
        a aVar3 = aVar;
        Object objG = aVar3.f148551b;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar3.f148553d;
        if (i15 == 0) {
            r.b(objG);
            d60.b bVar = this.f148554a;
            if (cVar == null) {
                Long l14 = gVar.f2568a;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    aVar3.f148550a = cVar;
                    aVar3.f148553d = 1;
                    objG = bVar.h(jLongValue, aVar3);
                }
            } else {
                Integer num = gVar.f2581n;
                Double d14 = cVar.f121481a;
                Float f14 = gVar.f2580m;
                Double d15 = f14 != null ? new Double(f14.floatValue()) : null;
                Double d16 = cVar.f121482b;
                Integer num2 = cVar.f121483c;
                aVar3.f148550a = cVar;
                aVar3.f148553d = 2;
                objG = bVar.g(num, d14, d15, d16, num2, aVar3);
            }
            return aVar4;
        }
        if (i15 == 1) {
            cVar = aVar3.f148550a;
            r.b(objG);
            v2Var = (v2) objG;
            if (v2Var instanceof v2.b) {
                if (cVar != null) {
                    aVar2 = a01.a.EVENT;
                } else {
                    aVar2 = a01.a.TODAY;
                }
                return w01.c.b((w01.c) ((v2.b) v2Var).f47386a, null, null, null, null, aVar2, 767);
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = aVar3.f148550a;
            r.b(objG);
            v2Var = (v2) objG;
            if (v2Var instanceof v2.b) {
                if (cVar != null) {
                    aVar2 = a01.a.EVENT;
                } else {
                    aVar2 = a01.a.TODAY;
                }
                return w01.c.b((w01.c) ((v2.b) v2Var).f47386a, null, null, null, null, aVar2, 767);
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
        }
        return null;
    }
}
