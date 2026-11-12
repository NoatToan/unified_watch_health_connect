package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/g3;", "", "<init>", "()V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23060a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/g3$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Integer[] a(int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            int i24 = 0;
            bm.k0 k0Var = new bm.k0(i16, 0, 0, 0, 14, null);
            bm.k0 k0Var2 = new bm.k0(i17, 0, 0, 0, 14, null);
            int i25 = k0Var.f18823b;
            int i26 = k0Var2.f18823b;
            int i27 = 59;
            if (i25 == i26) {
                i18 = k0Var.f18824c;
                int i28 = k0Var2.f18824c;
                if (i15 == i18) {
                    i24 = k0Var.f18825d;
                    if (i18 == i28) {
                        i27 = k0Var2.f18825d;
                    }
                } else if (i15 == i28) {
                    i24 = i18 == i28 ? k0Var.f18825d : 0;
                    i27 = k0Var2.f18825d;
                }
                i19 = i24;
                i24 = i27;
                i27 = i28;
            } else {
                if (i14 == i25) {
                    i18 = k0Var.f18824c;
                    i19 = i15 == i18 ? k0Var.f18825d : 0;
                } else if (i14 == i26) {
                    int i29 = k0Var2.f18824c;
                    if (i29 == 0 && k0Var2.f18825d == 0) {
                        i27 = i29;
                        i18 = 0;
                        i19 = 0;
                    } else {
                        i27 = i15 == i29 ? k0Var2.f18825d : 59;
                        i19 = 0;
                        i24 = i27;
                        i27 = i29;
                        i18 = 0;
                    }
                } else {
                    i18 = 0;
                    i19 = 0;
                }
                i24 = 59;
            }
            return new Integer[]{Integer.valueOf(i25), Integer.valueOf(i26), Integer.valueOf(i18), Integer.valueOf(i27), Integer.valueOf(i19), Integer.valueOf(i24)};
        }

        private a() {
        }
    }
}
