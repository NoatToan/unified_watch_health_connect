package j02;

import java.util.ArrayList;
import lc.u0;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
public interface h<T> {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96070a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96070a = iArr;
        }
    }

    long a();

    default i0 b(b bVar) {
        long jA;
        bVar.getClass();
        float f14 = bVar.f96026a;
        float f15 = bVar.f96027b;
        int i14 = a.f96070a[getOrientation().ordinal()];
        if (i14 == 1) {
            jA = a() & 4294967295L;
        } else {
            if (i14 != 2) {
                u0.r();
                return null;
            }
            jA = a() >> 32;
        }
        return new i0(f14, ((int) jA) - f15);
    }

    ArrayList e();

    b2 getOrientation();
}
