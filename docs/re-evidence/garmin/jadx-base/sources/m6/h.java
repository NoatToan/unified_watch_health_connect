package m6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h implements Comparable<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f116853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f116854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f116858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f116859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f116860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f116861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f116862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f116863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f116864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f116865m;

    public enum a {
        UNRESTRICTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public h(String str, a aVar) {
        this.f116855c = -1;
        this.f116856d = -1;
        this.f116857e = 0;
        this.f116859g = false;
        this.f116860h = new float[9];
        this.f116861i = new float[9];
        this.f116863k = new b[16];
        this.f116864l = 0;
        this.f116865m = 0;
        this.f116854b = str;
        this.f116862j = aVar;
    }

    public final void a(b bVar) {
        int i14 = 0;
        while (true) {
            int i15 = this.f116864l;
            b[] bVarArr = this.f116863k;
            if (i14 >= i15) {
                if (i15 >= bVarArr.length) {
                    this.f116863k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f116863k;
                int i16 = this.f116864l;
                bVarArr2[i16] = bVar;
                this.f116864l = i16 + 1;
                return;
            }
            if (bVarArr[i14] == bVar) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void b(b bVar) {
        int i14 = this.f116864l;
        int i15 = 0;
        while (i15 < i14) {
            if (this.f116863k[i15] == bVar) {
                while (i15 < i14 - 1) {
                    b[] bVarArr = this.f116863k;
                    int i16 = i15 + 1;
                    bVarArr[i15] = bVarArr[i16];
                    i15 = i16;
                }
                this.f116864l--;
                return;
            }
            i15++;
        }
    }

    public final void c() {
        this.f116854b = null;
        this.f116862j = a.UNKNOWN;
        this.f116857e = 0;
        this.f116855c = -1;
        this.f116856d = -1;
        this.f116858f = 0.0f;
        this.f116859g = false;
        int i14 = this.f116864l;
        for (int i15 = 0; i15 < i14; i15++) {
            this.f116863k[i15] = null;
        }
        this.f116864l = 0;
        this.f116865m = 0;
        this.f116853a = false;
        Arrays.fill(this.f116861i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return this.f116855c - hVar.f116855c;
    }

    public final void d(d dVar, float f14) {
        this.f116858f = f14;
        this.f116859g = true;
        int i14 = this.f116864l;
        this.f116856d = -1;
        for (int i15 = 0; i15 < i14; i15++) {
            this.f116863k[i15].h(dVar, this, false);
        }
        this.f116864l = 0;
    }

    public final void e(d dVar, b bVar) {
        int i14 = this.f116864l;
        for (int i15 = 0; i15 < i14; i15++) {
            this.f116863k[i15].i(dVar, bVar, false);
        }
        this.f116864l = 0;
    }

    public final String toString() {
        if (this.f116854b != null) {
            return "" + this.f116854b;
        }
        return "" + this.f116855c;
    }

    public h(a aVar, String str) {
        this.f116855c = -1;
        this.f116856d = -1;
        this.f116857e = 0;
        this.f116859g = false;
        this.f116860h = new float[9];
        this.f116861i = new float[9];
        this.f116863k = new b[16];
        this.f116864l = 0;
        this.f116865m = 0;
        this.f116862j = aVar;
    }
}
