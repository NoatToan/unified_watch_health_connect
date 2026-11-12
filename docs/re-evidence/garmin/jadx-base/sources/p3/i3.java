package p3;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/i3;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j3 f135115a = new f3();

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[LOOP:0: B:22:0x004d->B:34:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[EDGE_INSN: B:53:0x0095->B:35:0x0095 BREAK  A[LOOP:0: B:22:0x004d->B:34:0x0092], SYNTHETIC] */
    public final Object a(q53.i iVar, e23.a aVar) {
        f3 f3Var;
        q53.w<? super Unit> wVar;
        if (this.f135115a == null) {
            j2.b("Called runAndWatch on a manager that has been disposed of");
        }
        j3 j3Var = this.f135115a;
        if ((j3Var instanceof f3) && (wVar = (f3Var = (f3) j3Var).f135083f) != null && !wVar.equals(iVar)) {
            k1 k1Var = new k1();
            q53.w<? super Unit> wVar2 = f3Var.f135083f;
            if (wVar2 == null) {
                j2.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            p1.u0<Object> u0Var = f3Var.f135081d;
            ArrayList arrayList = k1Var.f135138c;
            if (u0Var != null) {
                Object[] objArr = u0Var.f134733b;
                long[] jArr = u0Var.f134732a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j8 = jArr[i14];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j8 & 255) < 128) {
                                    arrayList.add(new k1.a(objArr[(i14 << 3) + i17], wVar2));
                                }
                                j8 >>= i15;
                                i17++;
                                i15 = i15;
                            }
                            if (i16 != i15) {
                                break;
                            }
                            if (i14 != length) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
            } else {
                Object obj = f3Var.f135079b;
                obj.getClass();
                arrayList.add(new k1.a(obj, wVar2));
            }
            k1Var.b();
            f3Var.c();
            this.f135115a = k1Var;
        }
        j3 j3Var2 = this.f135115a;
        j3Var2.getClass();
        f4.f.a aVar2 = f4.f.f68735e;
        e23.l<Object, Unit> lVarD = j3Var2.d(iVar);
        aVar2.getClass();
        f4.f fVarU = f4.l.i().u(lVarD);
        j3Var2.a(iVar);
        try {
            f4.f fVarJ = fVarU.j();
            try {
                Object objInvoke = aVar.invoke();
                f4.f.q(fVarJ);
                fVarU.c();
                j3Var2.b();
                return objInvoke;
            } catch (Throwable th3) {
                f4.f.q(fVarJ);
                throw th3;
            }
        } catch (Throwable th4) {
            fVarU.c();
            throw th4;
        }
    }
}
