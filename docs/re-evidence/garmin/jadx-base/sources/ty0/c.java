package ty0;

import java.util.ArrayList;
import java.util.List;
import p13.h0;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166946a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.K1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.D1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.J1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.G1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.Q1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f166855a2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.S1.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.X1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.Q2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.F1.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.f166858b2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.Z1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.Y1.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.I1.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[b.M1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[b.R1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[b.f166878i1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[b.f166881j1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[b.f166898n1.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[b.P2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[b.E1.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[b.H1.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[b.T1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[b.U1.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[b.N1.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[b.O1.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[b.V1.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[b.J2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[b.W1.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[b.L1.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[b.R0.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            f166946a = iArr;
        }
    }

    public static final List a(ArrayList arrayList) {
        List listD0 = j0.f134944a;
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            b bVar = (b) obj;
            b bVar2 = b.f166889l;
            if (bVar != bVar2 || i14 <= 0 || arrayList.get(i14 - 1) != bVar2) {
                listD0 = h0.D0(listD0, bVar);
            }
            i14 = i15;
        }
        return listD0;
    }
}
