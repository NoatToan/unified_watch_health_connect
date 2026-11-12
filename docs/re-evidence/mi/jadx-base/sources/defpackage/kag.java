package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class kag {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v5d f23657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v5d f23658b;

        public v5d a() {
            return this.f23657a;
        }

        public v5d b() {
            return this.f23658b;
        }

        public b(v5d v5dVar, v5d v5dVar2) {
            this.f23657a = v5dVar;
            this.f23658b = v5dVar2;
        }
    }

    public static b a(int i, int i2, List<v5d> list) {
        return b(i, i2, list, 1.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b b(int i, int i2, List<v5d> list, double d) {
        v5d v5dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        if (list.isEmpty()) {
            return new b(v5dVar, objArr8 == true ? 1 : 0);
        }
        if (list.size() == 1) {
            return new b(list.get(0), objArr6 == true ? 1 : 0);
        }
        if (i <= 0 || i2 <= 0) {
            return new b(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0);
        }
        j5d j5dVarI = m5d.k().i();
        double d2 = ((double) (i * i2)) * d;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        v5d v5dVar2 = null;
        v5d v5dVar3 = null;
        for (v5d v5dVar4 : list) {
            double dAbs = Math.abs(1.0d - (v5dVar4.c() / d2));
            if (dAbs < d3) {
                v5dVar3 = v5dVar4;
                d3 = dAbs;
            }
            if (dAbs < d4 && (j5dVarI.l(v5dVar4.e()) || j5dVarI.n(v5dVar4.e()))) {
                v5dVar2 = v5dVar4;
                d4 = dAbs;
            }
        }
        if (v5dVar2 != null && v5dVar3 != null && v5dVar2.d().equals(v5dVar3.d())) {
            v5dVar2 = null;
        }
        return new b(v5dVar3, v5dVar2);
    }
}
