package m6;

import i3.e5;
import java.util.Arrays;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f116802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f116803c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116801a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116804d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f116805e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f116806f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f116807g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f116808h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f116809i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f116810j = false;

    public a(b bVar, c cVar) {
        this.f116802b = bVar;
        this.f116803c = cVar;
    }

    @Override // m6.b.a
    public final boolean a(h hVar) {
        int i14 = this.f116808h;
        if (i14 != -1) {
            for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
                if (this.f116805e[i14] == hVar.f116855c) {
                    return true;
                }
                i14 = this.f116806f[i14];
            }
        }
        return false;
    }

    @Override // m6.b.a
    public final float b(h hVar, boolean z14) {
        int i14 = this.f116808h;
        if (i14 == -1) {
            return 0.0f;
        }
        int i15 = 0;
        int i16 = -1;
        while (i14 != -1 && i15 < this.f116801a) {
            if (this.f116805e[i14] == hVar.f116855c) {
                int i17 = this.f116808h;
                int[] iArr = this.f116806f;
                if (i14 == i17) {
                    this.f116808h = iArr[i14];
                } else {
                    iArr[i16] = iArr[i14];
                }
                if (z14) {
                    hVar.b(this.f116802b);
                }
                hVar.f116865m--;
                this.f116801a--;
                this.f116805e[i14] = -1;
                if (this.f116810j) {
                    this.f116809i = i14;
                }
                return this.f116807g[i14];
            }
            i15++;
            i16 = i14;
            i14 = this.f116806f[i14];
        }
        return 0.0f;
    }

    @Override // m6.b.a
    public final float c(b bVar, boolean z14) {
        float fI = i(bVar.f116811a);
        b(bVar.f116811a, z14);
        b.a aVar = bVar.f116814d;
        int iJ = aVar.j();
        for (int i14 = 0; i14 < iJ; i14++) {
            h hVarH = aVar.h(i14);
            g(hVarH, aVar.i(hVarH) * fI, z14);
        }
        return fI;
    }

    @Override // m6.b.a
    public final void clear() {
        int i14 = this.f116808h;
        for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
            h hVar = this.f116803c.f116818c[this.f116805e[i14]];
            if (hVar != null) {
                hVar.b(this.f116802b);
            }
            i14 = this.f116806f[i14];
        }
        this.f116808h = -1;
        this.f116809i = -1;
        this.f116810j = false;
        this.f116801a = 0;
    }

    @Override // m6.b.a
    public final void d(float f14) {
        int i14 = this.f116808h;
        for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
            float[] fArr = this.f116807g;
            fArr[i14] = fArr[i14] / f14;
            i14 = this.f116806f[i14];
        }
    }

    @Override // m6.b.a
    public final void e() {
        int i14 = this.f116808h;
        for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
            float[] fArr = this.f116807g;
            fArr[i14] = fArr[i14] * (-1.0f);
            i14 = this.f116806f[i14];
        }
    }

    @Override // m6.b.a
    public final float f(int i14) {
        int i15 = this.f116808h;
        for (int i16 = 0; i15 != -1 && i16 < this.f116801a; i16++) {
            if (i16 == i14) {
                return this.f116807g[i15];
            }
            i15 = this.f116806f[i15];
        }
        return 0.0f;
    }

    @Override // m6.b.a
    public final void g(h hVar, float f14, boolean z14) {
        if (f14 <= -0.001f || f14 >= 0.001f) {
            int i14 = this.f116808h;
            b bVar = this.f116802b;
            if (i14 == -1) {
                this.f116808h = 0;
                this.f116807g[0] = f14;
                this.f116805e[0] = hVar.f116855c;
                this.f116806f[0] = -1;
                hVar.f116865m++;
                hVar.a(bVar);
                this.f116801a++;
                if (this.f116810j) {
                    return;
                }
                int i15 = this.f116809i + 1;
                this.f116809i = i15;
                int[] iArr = this.f116805e;
                if (i15 >= iArr.length) {
                    this.f116810j = true;
                    this.f116809i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i16 = -1;
            for (int i17 = 0; i14 != -1 && i17 < this.f116801a; i17++) {
                int i18 = this.f116805e[i14];
                int i19 = hVar.f116855c;
                if (i18 == i19) {
                    float[] fArr = this.f116807g;
                    float f15 = fArr[i14] + f14;
                    if (f15 > -0.001f && f15 < 0.001f) {
                        f15 = 0.0f;
                    }
                    fArr[i14] = f15;
                    if (f15 == 0.0f) {
                        int i24 = this.f116808h;
                        int[] iArr2 = this.f116806f;
                        if (i14 == i24) {
                            this.f116808h = iArr2[i14];
                        } else {
                            iArr2[i16] = iArr2[i14];
                        }
                        if (z14) {
                            hVar.b(bVar);
                        }
                        if (this.f116810j) {
                            this.f116809i = i14;
                        }
                        hVar.f116865m--;
                        this.f116801a--;
                        return;
                    }
                    return;
                }
                if (i18 < i19) {
                    i16 = i14;
                }
                i14 = this.f116806f[i14];
            }
            int length = this.f116809i;
            int i25 = length + 1;
            if (this.f116810j) {
                int[] iArr3 = this.f116805e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i25;
            }
            int[] iArr4 = this.f116805e;
            if (length >= iArr4.length && this.f116801a < iArr4.length) {
                int i26 = 0;
                while (true) {
                    int[] iArr5 = this.f116805e;
                    if (i26 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i26] == -1) {
                        length = i26;
                        break;
                    }
                    i26++;
                }
            }
            int[] iArr6 = this.f116805e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i27 = this.f116804d * 2;
                this.f116804d = i27;
                this.f116810j = false;
                this.f116809i = length - 1;
                this.f116807g = Arrays.copyOf(this.f116807g, i27);
                this.f116805e = Arrays.copyOf(this.f116805e, this.f116804d);
                this.f116806f = Arrays.copyOf(this.f116806f, this.f116804d);
            }
            this.f116805e[length] = hVar.f116855c;
            this.f116807g[length] = f14;
            int[] iArr7 = this.f116806f;
            if (i16 != -1) {
                iArr7[length] = iArr7[i16];
                iArr7[i16] = length;
            } else {
                iArr7[length] = this.f116808h;
                this.f116808h = length;
            }
            hVar.f116865m++;
            hVar.a(bVar);
            this.f116801a++;
            if (!this.f116810j) {
                this.f116809i++;
            }
            int i28 = this.f116809i;
            int[] iArr8 = this.f116805e;
            if (i28 >= iArr8.length) {
                this.f116810j = true;
                this.f116809i = iArr8.length - 1;
            }
        }
    }

    @Override // m6.b.a
    public final h h(int i14) {
        int i15 = this.f116808h;
        for (int i16 = 0; i15 != -1 && i16 < this.f116801a; i16++) {
            if (i16 == i14) {
                return this.f116803c.f116818c[this.f116805e[i15]];
            }
            i15 = this.f116806f[i15];
        }
        return null;
    }

    @Override // m6.b.a
    public final float i(h hVar) {
        int i14 = this.f116808h;
        for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
            if (this.f116805e[i14] == hVar.f116855c) {
                return this.f116807g[i14];
            }
            i14 = this.f116806f[i14];
        }
        return 0.0f;
    }

    @Override // m6.b.a
    public final int j() {
        return this.f116801a;
    }

    @Override // m6.b.a
    public final void k(h hVar, float f14) {
        if (f14 == 0.0f) {
            b(hVar, true);
            return;
        }
        int i14 = this.f116808h;
        b bVar = this.f116802b;
        if (i14 == -1) {
            this.f116808h = 0;
            this.f116807g[0] = f14;
            this.f116805e[0] = hVar.f116855c;
            this.f116806f[0] = -1;
            hVar.f116865m++;
            hVar.a(bVar);
            this.f116801a++;
            if (this.f116810j) {
                return;
            }
            int i15 = this.f116809i + 1;
            this.f116809i = i15;
            int[] iArr = this.f116805e;
            if (i15 >= iArr.length) {
                this.f116810j = true;
                this.f116809i = iArr.length - 1;
                return;
            }
            return;
        }
        int i16 = -1;
        for (int i17 = 0; i14 != -1 && i17 < this.f116801a; i17++) {
            int i18 = this.f116805e[i14];
            int i19 = hVar.f116855c;
            if (i18 == i19) {
                this.f116807g[i14] = f14;
                return;
            }
            if (i18 < i19) {
                i16 = i14;
            }
            i14 = this.f116806f[i14];
        }
        int length = this.f116809i;
        int i24 = length + 1;
        if (this.f116810j) {
            int[] iArr2 = this.f116805e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i24;
        }
        int[] iArr3 = this.f116805e;
        if (length >= iArr3.length && this.f116801a < iArr3.length) {
            int i25 = 0;
            while (true) {
                int[] iArr4 = this.f116805e;
                if (i25 >= iArr4.length) {
                    break;
                }
                if (iArr4[i25] == -1) {
                    length = i25;
                    break;
                }
                i25++;
            }
        }
        int[] iArr5 = this.f116805e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i26 = this.f116804d * 2;
            this.f116804d = i26;
            this.f116810j = false;
            this.f116809i = length - 1;
            this.f116807g = Arrays.copyOf(this.f116807g, i26);
            this.f116805e = Arrays.copyOf(this.f116805e, this.f116804d);
            this.f116806f = Arrays.copyOf(this.f116806f, this.f116804d);
        }
        this.f116805e[length] = hVar.f116855c;
        this.f116807g[length] = f14;
        int[] iArr6 = this.f116806f;
        if (i16 != -1) {
            iArr6[length] = iArr6[i16];
            iArr6[i16] = length;
        } else {
            iArr6[length] = this.f116808h;
            this.f116808h = length;
        }
        hVar.f116865m++;
        hVar.a(bVar);
        int i27 = this.f116801a + 1;
        this.f116801a = i27;
        if (!this.f116810j) {
            this.f116809i++;
        }
        int[] iArr7 = this.f116805e;
        if (i27 >= iArr7.length) {
            this.f116810j = true;
        }
        if (this.f116809i >= iArr7.length) {
            this.f116810j = true;
            this.f116809i = iArr7.length - 1;
        }
    }

    public final String toString() {
        int i14 = this.f116808h;
        String string = "";
        for (int i15 = 0; i14 != -1 && i15 < this.f116801a; i15++) {
            StringBuilder sbK = e5.k(e0.e(this.f116807g[i14], " : ", e5.k(string.concat(" -> "))));
            sbK.append(this.f116803c.f116818c[this.f116805e[i14]]);
            string = sbK.toString();
            i14 = this.f116806f[i14];
        }
        return string;
    }
}
