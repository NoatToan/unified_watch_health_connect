package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class sns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33827a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33828b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public sns(byte[] bArr) {
        if (bArr.length == 20) {
            a(afs.b(bArr, 0, 4));
            h(afs.b(bArr, 4, 4));
            e(afs.b(bArr, 8, 4));
            c(afs.b(bArr, 12, 2));
            d(afs.b(bArr, 14, 2));
            g(afs.b(bArr, 16, 2));
            f(afs.b(bArr, 18, 2));
        }
    }

    public void a(int i) {
        this.f33828b = i;
    }

    public byte[] b(boolean z, int i, int i2, int i3, byte[] bArr, Bitmap bitmap) {
        byte[] bArrG;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f33828b;
        int i5 = this.c;
        int i6 = this.d;
        int i7 = this.e;
        int i8 = this.f;
        int i9 = this.g;
        int i10 = this.h;
        if (i6 == 0 || i5 == 0) {
            bArrG = null;
        } else {
            int i11 = i9 * i10;
            int i12 = 0;
            bArrG = null;
            while (i12 < i6) {
                bArrG = afs.g(z, afs.e(bitmap, afs.j(bArr, (i11 * i12) + i4, i11), i, i2, i3, i9, i10, i7, i8));
                arrayList.add(bArrG);
                i12++;
                i10 = i10;
                i9 = i9;
            }
        }
        if (arrayList.size() > 0) {
            return arrayList.size() == 1 ? bArrG : r3s.a(arrayList);
        }
        return null;
    }

    public void c(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.f = i;
    }

    public void e(int i) {
        this.d = i;
    }

    public void f(int i) {
        this.h = i;
    }

    public void g(int i) {
        this.g = i;
    }

    public void h(int i) {
        this.c = i;
    }

    public String toString() {
        return "CustomModleDataA{address=" + this.f33828b + ", size=" + this.c + ", imgCount=" + this.d + ", coordinateX=" + this.e + ", coordinateY=" + this.f + ", imgWidth=" + this.g + ", imgHeight=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }
}
