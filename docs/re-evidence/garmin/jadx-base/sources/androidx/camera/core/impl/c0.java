package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface c0 {

    public static final class a implements c0 {
        @Override // androidx.camera.core.impl.c0
        public final w2 a() {
            return w2.f5840b;
        }

        @Override // androidx.camera.core.impl.c0
        public final b0 b() {
            return b0.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c0
        public final y d() {
            return y.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c0
        public final a0 e() {
            return a0.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c0
        public final w f() {
            return w.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.c0
        public final CaptureResult g() {
            return null;
        }

        @Override // androidx.camera.core.impl.c0
        public final long getTimestamp() {
            return -1L;
        }
    }

    w2 a();

    b0 b();

    default void c(j0.j.b bVar) {
        int i14;
        ArrayList arrayList = bVar.f95937a;
        b0 b0VarB = b();
        if (b0VarB == b0.UNKNOWN) {
            return;
        }
        int i15 = j0.j.a.f95932a[b0VarB.ordinal()];
        if (i15 == 1) {
            i14 = 0;
        } else if (i15 == 2) {
            i14 = 32;
        } else {
            if (i15 != 3) {
                b0VarB.toString();
                return;
            }
            i14 = 1;
        }
        if ((i14 & 1) == 1) {
            bVar.c("LightSource", String.valueOf(4), arrayList);
        }
        bVar.c("Flash", String.valueOf(i14), arrayList);
    }

    y d();

    a0 e();

    w f();

    default CaptureResult g() {
        return null;
    }

    long getTimestamp();
}
