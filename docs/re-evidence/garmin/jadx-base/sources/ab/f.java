package ab;

import fa.q;
import fa.r;
import fa.z;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<e.a> a(r rVar) {
        char c14;
        ArrayList<e.a> arrayList;
        boolean z14;
        int i14;
        Object aVar;
        r rVar2 = rVar;
        ArrayList<e.a> arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (rVar2.u() == 0) {
            char c15 = 7;
            rVar2.H(7);
            int iG = rVar2.g();
            boolean z15 = true;
            if (iG == 1684433976) {
                r rVar3 = new r();
                Inflater inflater = new Inflater(true);
                try {
                    if (!z.G(rVar2, rVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    rVar2 = rVar3;
                } catch (Throwable th3) {
                    inflater.end();
                    throw th3;
                }
            } else if (iG == 1918990112) {
            }
            ArrayList<e.a> arrayList3 = new ArrayList<>();
            int i15 = rVar2.f70055b;
            int i16 = rVar2.f70056c;
            while (i15 < i16) {
                int iG2 = rVar2.g() + i15;
                if (iG2 > i15 && iG2 <= i16) {
                    if (rVar2.g() == 1835365224) {
                        int iG3 = rVar2.g();
                        if (iG3 > 10000) {
                            c14 = c15;
                            ArrayList<e.a> arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            z14 = z15;
                            i14 = i16;
                            aVar = arrayList4;
                        } else {
                            float[] fArr = new float[iG3];
                            for (int i17 = 0; i17 < iG3; i17++) {
                                fArr[i17] = Float.intBitsToFloat(rVar2.g());
                            }
                            int iG4 = rVar2.g();
                            if (iG4 > 32000) {
                                c14 = c15;
                                ArrayList<e.a> arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                z14 = z15;
                                i14 = i16;
                                aVar = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                c14 = c15;
                                ArrayList<e.a> arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iG3) * 2.0d) / dLog);
                                z14 = z15;
                                q qVar = new q(rVar2.f70054a);
                                qVar.m(rVar2.f70055b * 8);
                                float[] fArr2 = new float[iG4 * 5];
                                int i18 = 5;
                                int[] iArr = new int[5];
                                ArrayList<e.a> arrayList7 = arrayList6;
                                int i19 = 0;
                                int i24 = 0;
                                while (true) {
                                    if (i19 < iG4) {
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 < i18) {
                                                int i26 = iArr[i25];
                                                int iG5 = qVar.g(iCeil);
                                                int i27 = ((iG5 >> 1) ^ (-(iG5 & 1))) + i26;
                                                if (i27 < iG3 && i27 >= 0) {
                                                    fArr2[i24] = fArr[i27];
                                                    iArr[i25] = i27;
                                                    i25++;
                                                    i24++;
                                                    i18 = 5;
                                                }
                                            } else {
                                                i19++;
                                                i18 = 5;
                                            }
                                        }
                                    } else {
                                        qVar.m((qVar.e() + 7) & (-8));
                                        int i28 = 32;
                                        int iG6 = qVar.g(32);
                                        e.b[] bVarArr = new e.b[iG6];
                                        int i29 = 0;
                                        while (true) {
                                            if (i29 < iG6) {
                                                int iG7 = qVar.g(8);
                                                int iG8 = qVar.g(8);
                                                int iG9 = qVar.g(i28);
                                                if (iG9 <= 128000) {
                                                    int i30 = iG6;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iG4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iG9 * 3];
                                                    float[] fArr5 = new float[iG9 * 2];
                                                    i14 = i16;
                                                    int i34 = 0;
                                                    int i35 = 0;
                                                    while (true) {
                                                        if (i34 < iG9) {
                                                            int iG10 = qVar.g(iCeil2);
                                                            q qVar2 = qVar;
                                                            int i36 = ((iG10 >> 1) ^ (-(iG10 & 1))) + i35;
                                                            if (i36 >= 0 && i36 < iG4) {
                                                                int i37 = i34 * 3;
                                                                int i38 = i36 * 5;
                                                                fArr4[i37] = fArr3[i38];
                                                                fArr4[i37 + 1] = fArr3[i38 + 1];
                                                                fArr4[i37 + 2] = fArr3[i38 + 2];
                                                                int i39 = i34 * 2;
                                                                fArr5[i39] = fArr3[i38 + 3];
                                                                fArr5[i39 + 1] = fArr3[i38 + 4];
                                                                i34++;
                                                                i35 = i36;
                                                                qVar = qVar2;
                                                            }
                                                        } else {
                                                            bVarArr[i29] = new e.b(iG7, fArr4, fArr5, iG8);
                                                            i29++;
                                                            iG6 = i30;
                                                            fArr2 = fArr3;
                                                            i16 = i14;
                                                            qVar = qVar;
                                                            i28 = 32;
                                                        }
                                                    }
                                                }
                                                aVar = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i14 = i16;
                                                aVar = new e.a(bVarArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i14 = i16;
                                    aVar = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (aVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(aVar);
                    } else {
                        c14 = c15;
                        arrayList = arrayList2;
                        z14 = z15;
                        i14 = i16;
                    }
                    rVar2.G(iG2);
                    i15 = iG2;
                    c15 = c14;
                    z15 = z14;
                    arrayList2 = arrayList;
                    i16 = i14;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
