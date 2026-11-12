package bc;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;
import fa.g;
import fa.r;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import yb.c;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f17390a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17391b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0244a f17392c = new C0244a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f17393d;

    /* JADX INFO: renamed from: bc.a$a, reason: collision with other inner class name */
    public static final class C0244a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f17394a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f17395b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17399f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17401h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17402i;
    }

    @Override // yb.n
    public final int a() {
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, g<c> gVar) {
        char c14;
        r rVar;
        int[] iArr;
        ArrayList arrayList;
        ea.a aVarA;
        int i16;
        int i17;
        int iU;
        r rVar2;
        int i18;
        int i19;
        int iX;
        r rVar3 = this.f17390a;
        rVar3.E(bArr, i14 + i15);
        rVar3.G(i14);
        char c15 = 255;
        if (rVar3.a() > 0 && (rVar3.f70054a[rVar3.f70055b] & UnsignedBytes.MAX_VALUE) == 120) {
            if (this.f17393d == null) {
                this.f17393d = new Inflater();
            }
            Inflater inflater = this.f17393d;
            r rVar4 = this.f17391b;
            if (z.G(rVar3, rVar4, inflater)) {
                rVar3.E(rVar4.f70054a, rVar4.f70056c);
            }
        }
        C0244a c0244a = this.f17392c;
        int i24 = 0;
        c0244a.f17397d = 0;
        int[] iArr2 = c0244a.f17395b;
        r rVar5 = c0244a.f17394a;
        c0244a.f17398e = 0;
        c0244a.f17399f = 0;
        c0244a.f17400g = 0;
        c0244a.f17401h = 0;
        c0244a.f17402i = 0;
        rVar5.D(0);
        c0244a.f17396c = false;
        ArrayList arrayList2 = new ArrayList();
        while (rVar3.a() >= 3) {
            int i25 = rVar3.f70056c;
            int iU2 = rVar3.u();
            int iA = rVar3.A();
            int i26 = rVar3.f70055b + iA;
            if (i26 > i25) {
                rVar3.G(i25);
                c14 = c15;
                rVar2 = rVar3;
                i16 = i24;
                iArr = iArr2;
                arrayList = arrayList2;
                aVarA = null;
            } else {
                char c16 = 128;
                if (iU2 != 128) {
                    switch (iU2) {
                        case 20:
                            if (iA % 5 == 2) {
                                rVar3.H(2);
                                Arrays.fill(iArr2, i24);
                                int i27 = iA / 5;
                                int i28 = i24;
                                while (i28 < i27) {
                                    int iU3 = rVar3.u();
                                    char c17 = c16;
                                    double dU = rVar3.u();
                                    double dU2 = rVar3.u() - 128;
                                    int[] iArr3 = iArr2;
                                    double dU3 = rVar3.u() - 128;
                                    iArr3[iU3] = (z.i((int) ((1.402d * dU2) + dU), 0, 255) << 16) | (rVar3.u() << 24) | (z.i((int) ((dU - (0.34414d * dU3)) - (dU2 * 0.71414d)), 0, 255) << 8) | z.i((int) ((dU3 * 1.772d) + dU), 0, 255);
                                    i28++;
                                    arrayList2 = arrayList2;
                                    c15 = 255;
                                    iArr2 = iArr3;
                                    rVar3 = rVar3;
                                    c16 = c17;
                                }
                                c14 = c15;
                                rVar = rVar3;
                                iArr = iArr2;
                                arrayList = arrayList2;
                                c0244a.f17396c = true;
                            } else {
                                c14 = c15;
                                rVar = rVar3;
                                iArr = iArr2;
                                arrayList = arrayList2;
                            }
                            break;
                        case 21:
                            if (iA >= 4) {
                                rVar3.H(3);
                                int i29 = iA - 4;
                                if (((128 & rVar3.u()) != 0 ? 1 : i24) == 0) {
                                    i18 = rVar5.f70055b;
                                    i19 = rVar5.f70056c;
                                    if (i18 < i19 && i29 > 0) {
                                        int iMin = Math.min(i29, i19 - i18);
                                        rVar3.e(rVar5.f70054a, i18, iMin);
                                        rVar5.G(i18 + iMin);
                                    }
                                } else if (i29 >= 7 && (iX = rVar3.x()) >= 4) {
                                    c0244a.f17401h = rVar3.A();
                                    c0244a.f17402i = rVar3.A();
                                    rVar5.D(iX - 4);
                                    i29 = iA - 11;
                                    i18 = rVar5.f70055b;
                                    i19 = rVar5.f70056c;
                                    if (i18 < i19) {
                                        int iMin2 = Math.min(i29, i19 - i18);
                                        rVar3.e(rVar5.f70054a, i18, iMin2);
                                        rVar5.G(i18 + iMin2);
                                    }
                                }
                            }
                            c14 = c15;
                            rVar = rVar3;
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (iA >= 19) {
                                c0244a.f17397d = rVar3.A();
                                c0244a.f17398e = rVar3.A();
                                rVar3.H(11);
                                c0244a.f17399f = rVar3.A();
                                c0244a.f17400g = rVar3.A();
                            }
                            c14 = c15;
                            rVar = rVar3;
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        default:
                            c14 = c15;
                            rVar = rVar3;
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                    }
                    aVarA = null;
                    i16 = 0;
                } else {
                    c14 = c15;
                    rVar = rVar3;
                    iArr = iArr2;
                    arrayList = arrayList2;
                    if (c0244a.f17397d == 0 || c0244a.f17398e == 0 || c0244a.f17401h == 0 || c0244a.f17402i == 0 || (i17 = rVar5.f70056c) == 0 || rVar5.f70055b != i17 || !c0244a.f17396c) {
                        aVarA = null;
                    } else {
                        rVar5.G(0);
                        int i30 = c0244a.f17401h * c0244a.f17402i;
                        int[] iArr4 = new int[i30];
                        int i34 = 0;
                        while (i34 < i30) {
                            int iU4 = rVar5.u();
                            if (iU4 != 0) {
                                iU = i34 + 1;
                                iArr4[i34] = iArr[iU4];
                            } else {
                                int iU5 = rVar5.u();
                                if (iU5 != 0) {
                                    iU = ((iU5 & 64) == 0 ? iU5 & 63 : ((iU5 & 63) << 8) | rVar5.u()) + i34;
                                    Arrays.fill(iArr4, i34, iU, (iU5 & 128) == 0 ? iArr[0] : iArr[rVar5.u()]);
                                }
                            }
                            i34 = iU;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, c0244a.f17401h, c0244a.f17402i, Bitmap.Config.ARGB_8888);
                        ea.a.b bVar2 = new ea.a.b();
                        bVar2.f63569b = bitmapCreateBitmap;
                        float f14 = c0244a.f17399f;
                        float f15 = c0244a.f17397d;
                        bVar2.f63575h = f14 / f15;
                        bVar2.f63576i = 0;
                        float f16 = c0244a.f17400g;
                        float f17 = c0244a.f17398e;
                        bVar2.f63572e = f16 / f17;
                        bVar2.f63573f = 0;
                        bVar2.f63574g = 0;
                        bVar2.f63579l = c0244a.f17401h / f15;
                        bVar2.f63580m = c0244a.f17402i / f17;
                        aVarA = bVar2.a();
                    }
                    i16 = 0;
                    c0244a.f17397d = 0;
                    c0244a.f17398e = 0;
                    c0244a.f17399f = 0;
                    c0244a.f17400g = 0;
                    c0244a.f17401h = 0;
                    c0244a.f17402i = 0;
                    rVar5.D(0);
                    c0244a.f17396c = false;
                }
                rVar2 = rVar;
                rVar2.G(i26);
            }
            arrayList2 = arrayList;
            if (aVarA != null) {
                arrayList2.add(aVarA);
            }
            rVar3 = rVar2;
            c15 = c14;
            i24 = i16;
            iArr2 = iArr;
        }
        gVar.accept(new c(arrayList2, C.TIME_UNSET, C.TIME_UNSET));
    }
}
