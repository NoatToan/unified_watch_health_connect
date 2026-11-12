package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class g2n {
    public static final Comparator<b> h = new Comparator() { // from class: e2n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g2n.g((g2n.b) obj, (g2n.b) obj2);
        }
    };
    public static final Comparator<b> i = new Comparator() { // from class: f2n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g2n.h((g2n.b) obj, (g2n.b) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18508a;
    public int e;
    public int f;
    public int g;
    public final b[] c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f18509b = new ArrayList<>();
    public int d = -1;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18511b;
        public float c;

        public b() {
        }
    }

    public g2n(int i2) {
        this.f18508a = i2;
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f18510a - bVar2.f18510a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.c, bVar2.c);
    }

    public void c(int i2, float f) {
        b bVar;
        d();
        int i3 = this.g;
        if (i3 > 0) {
            b[] bVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new b();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bVar.f18510a = i5;
        bVar.f18511b = i2;
        bVar.c = f;
        this.f18509b.add(bVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.f18508a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            b bVar2 = this.f18509b.get(0);
            int i9 = bVar2.f18511b;
            if (i9 <= i8) {
                this.f -= i9;
                this.f18509b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    b[] bVarArr2 = this.c;
                    this.g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.f18511b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    public final void d() {
        if (this.d != 1) {
            Collections.sort(this.f18509b, h);
            this.d = 1;
        }
    }

    public final void e() {
        if (this.d != 0) {
            Collections.sort(this.f18509b, i);
            this.d = 0;
        }
    }

    public float f(float f) {
        e();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18509b.size(); i3++) {
            b bVar = this.f18509b.get(i3);
            i2 += bVar.f18511b;
            if (i2 >= f2) {
                return bVar.c;
            }
        }
        if (this.f18509b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f18509b;
        return arrayList.get(arrayList.size() - 1).c;
    }

    public void i() {
        this.f18509b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }
}
