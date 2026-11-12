package g2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f75060a = a.f75061a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/b2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f75061a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1515a f75062b = new C1515a();

        /* JADX INFO: renamed from: g2.b2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g2/b2$a$a", "Lg2/b2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1515a implements b2 {
            @Override // g2.b2
            public final int a(ArrayList arrayList, int i14, int i15, int i16, int i17) {
                Object obj;
                int i18;
                long j8;
                int size = arrayList.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i19);
                    if (((t0) obj).getF68148a() != i14) {
                        break;
                    }
                    i19++;
                }
                t0 t0Var = (t0) obj;
                if (t0Var != null) {
                    long jO = t0Var.o(0);
                    if (t0Var.getF68150c()) {
                        g6.k.a aVar = g6.k.f76003b;
                        j8 = jO & 4294967295L;
                    } else {
                        g6.k.a aVar2 = g6.k.f76003b;
                        j8 = jO >> 32;
                    }
                    i18 = (int) j8;
                } else {
                    i18 = Integer.MIN_VALUE;
                }
                int iMax = i16 == Integer.MIN_VALUE ? -i17 : Math.max(-i17, i16);
                return i18 != Integer.MIN_VALUE ? Math.min(iMax, i18 - i15) : iMax;
            }

            @Override // g2.b2
            public final p1.h0 b(int i14, int i15, p1.l lVar) {
                int i16;
                if (i15 - i14 < 0 || (i16 = lVar.f134763b) == 0) {
                    return p1.m.f134768a;
                }
                j23.l lVarO = j23.t.o(0, i16);
                int i17 = lVarO.f96796a;
                int i18 = lVarO.f96797b;
                int iA = -1;
                if (i17 <= i18) {
                    while (lVar.a(i17) <= i14) {
                        iA = lVar.a(i17);
                        if (i17 == i18) {
                            break;
                        }
                        i17++;
                    }
                }
                if (iA == -1) {
                    return p1.m.f134768a;
                }
                p1.h0 h0Var = p1.m.f134768a;
                p1.h0 h0Var2 = new p1.h0(1);
                h0Var2.d(iA);
                return h0Var2;
            }
        }

        private a() {
        }
    }

    int a(ArrayList arrayList, int i14, int i15, int i16, int i17);

    p1.h0 b(int i14, int i15, p1.l lVar);
}
