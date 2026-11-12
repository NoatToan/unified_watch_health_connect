package dl2;

import il2.g;
import java.util.Arrays;
import java.util.Set;
import pk2.f0;
import pk2.z;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f60317b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f60316a = i14;
        this.f60317b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        f0 f0Var;
        gl2.a aVar;
        Object obj = null;
        Object[] objArr = 0;
        boolean z14 = false;
        switch (this.f60316a) {
            case 0:
                b bVar = this.f60317b;
                int i14 = b.f60318s;
                com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
                f0[] f0VarArr = (f0[]) bVar.f132627g.toArray(new f0[0]);
                z[] zVarArr = (z[]) Arrays.copyOf(f0VarArr, f0VarArr.length);
                c1027a.getClass();
                return com.garmin.device.filetransfer.core.background.a.C1027a.b(zVarArr);
            case 1:
                b bVar2 = this.f60317b;
                int i15 = b.f60318s;
                com.garmin.device.filetransfer.core.background.a.C1027a c1027a2 = com.garmin.device.filetransfer.core.background.a.f50783c;
                f0[] f0VarArr2 = (f0[]) bVar2.f132627g.toArray(new f0[0]);
                z[] zVarArr2 = (z[]) Arrays.copyOf(f0VarArr2, f0VarArr2.length);
                c1027a2.getClass();
                return com.garmin.device.filetransfer.core.background.a.C1027a.c(zVarArr2);
            case 2:
                b bVar3 = this.f60317b;
                int i16 = b.f60318s;
                for (Object obj2 : bVar3.f132627g) {
                    if (((f0) obj2) instanceof gl2.a) {
                        obj = obj2;
                        f0Var = (f0) obj;
                        if (f0Var instanceof gl2.a) {
                            return (Set) bVar3.f60324q.getValue();
                        }
                        aVar = (gl2.a) f0Var;
                        synchronized (aVar.f77894p) {
                            Set<String> set = aVar.f77895q;
                        }
                        return set;
                    }
                }
                f0Var = (f0) obj;
                if (f0Var instanceof gl2.a) {
                    return (Set) bVar3.f60324q.getValue();
                }
                aVar = (gl2.a) f0Var;
                synchronized (aVar.f77894p) {
                    Set<String> set2 = aVar.f77895q;
                    return set2;
                }
            case 3:
                return (Set) this.f60317b.f60325r.getValue();
            default:
                b bVar4 = this.f60317b;
                g.a aVar2 = g.f94050g;
                return new jl2.b(bVar4, z14, 2, objArr == true ? 1 : 0);
        }
    }
}
