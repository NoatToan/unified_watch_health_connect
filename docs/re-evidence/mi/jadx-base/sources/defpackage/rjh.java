package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class rjh {
    public static final c f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f32605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f0p> f32606b;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Map<f0p, e> c = new ArrayMap();
    public final e e = a();

    public static class a implements c {
        @Override // rjh.c
        public boolean a(int i, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e> f32607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f32608b;
        public final List<f0p> c;
        public int d;
        public int e;
        public int f;
        public final List<c> g;
        public Rect h;

        public class a extends AsyncTask<Bitmap, Void, rjh> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f32609a;

            public a(d dVar) {
                this.f32609a = dVar;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public rjh doInBackground(Bitmap... bitmapArr) {
                try {
                    return b.this.a();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(rjh rjhVar) {
                this.f32609a.onGenerated(rjhVar);
            }
        }

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.d = 16;
            this.e = 12544;
            this.f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(rjh.f);
            this.f32608b = bitmap;
            this.f32607a = null;
            arrayList.add(f0p.e);
            arrayList.add(f0p.f);
            arrayList.add(f0p.g);
            arrayList.add(f0p.h);
            arrayList.add(f0p.i);
            arrayList.add(f0p.j);
        }

        public rjh a() {
            List<e> listD;
            c[] cVarArr;
            Bitmap bitmap = this.f32608b;
            if (bitmap != null) {
                Bitmap bitmapD = d(bitmap);
                Rect rect = this.h;
                if (bitmapD != this.f32608b && rect != null) {
                    double width = ((double) bitmapD.getWidth()) / ((double) this.f32608b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapD.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapD.getHeight());
                }
                int[] iArrC = c(bitmapD);
                int i = this.d;
                if (this.g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                q44 q44Var = new q44(iArrC, i, cVarArr);
                if (bitmapD != this.f32608b) {
                    bitmapD.recycle();
                }
                listD = q44Var.d();
            } else {
                listD = this.f32607a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            rjh rjhVar = new rjh(listD, this.c);
            rjhVar.c();
            return rjhVar;
        }

        public AsyncTask<Bitmap, Void, rjh> b(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f32608b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public final int[] c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }

        public final Bitmap d(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.e;
                if (width > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f)) {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }
    }

    public interface c {
        boolean a(int i, float[] fArr);
    }

    public interface d {
        void onGenerated(rjh rjhVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32612b;
        public final int c;
        public final int d;
        public final int e;
        public boolean f;
        public int g;
        public int h;
        public float[] i;

        public e(int i, int i2) {
            this.f32611a = Color.red(i);
            this.f32612b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        public final void a() {
            if (this.f) {
                return;
            }
            int iF = z44.f(-1, this.d, 4.5f);
            int iF2 = z44.f(-1, this.d, 3.0f);
            if (iF != -1 && iF2 != -1) {
                this.h = z44.p(-1, iF);
                this.g = z44.p(-1, iF2);
                this.f = true;
                return;
            }
            int iF3 = z44.f(-16777216, this.d, 4.5f);
            int iF4 = z44.f(-16777216, this.d, 3.0f);
            if (iF3 == -1 || iF4 == -1) {
                this.h = iF != -1 ? z44.p(-1, iF) : z44.p(-16777216, iF3);
                this.g = iF2 != -1 ? z44.p(-1, iF2) : z44.p(-16777216, iF4);
                this.f = true;
            } else {
                this.h = z44.p(-16777216, iF3);
                this.g = z44.p(-16777216, iF4);
                this.f = true;
            }
        }

        public int b() {
            a();
            return this.h;
        }

        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            z44.a(this.f32611a, this.f32612b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.e == eVar.e && this.d == eVar.d;
        }

        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + AbstractJsonLexerKt.END_LIST + " [HSL: " + Arrays.toString(c()) + AbstractJsonLexerKt.END_LIST + " [Population: " + this.e + AbstractJsonLexerKt.END_LIST + " [Title Text: #" + Integer.toHexString(f()) + AbstractJsonLexerKt.END_LIST + " [Body Text: #" + Integer.toHexString(b()) + AbstractJsonLexerKt.END_LIST;
        }
    }

    public rjh(List<e> list, List<f0p> list2) {
        this.f32605a = list;
        this.f32606b = list2;
    }

    public static b b(Bitmap bitmap) {
        return new b(bitmap);
    }

    public final e a() {
        int size = this.f32605a.size();
        int iD = Integer.MIN_VALUE;
        e eVar = null;
        for (int i = 0; i < size; i++) {
            e eVar2 = this.f32605a.get(i);
            if (eVar2.d() > iD) {
                iD = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public void c() {
        int size = this.f32606b.size();
        for (int i = 0; i < size; i++) {
            f0p f0pVar = this.f32606b.get(i);
            f0pVar.k();
            this.c.put(f0pVar, e(f0pVar));
        }
        this.d.clear();
    }

    public final float d(e eVar, f0p f0pVar) {
        float[] fArrC = eVar.c();
        e eVar2 = this.e;
        return (f0pVar.g() > 0.0f ? f0pVar.g() * (1.0f - Math.abs(fArrC[1] - f0pVar.i())) : 0.0f) + (f0pVar.a() > 0.0f ? f0pVar.a() * (1.0f - Math.abs(fArrC[2] - f0pVar.h())) : 0.0f) + (f0pVar.f() > 0.0f ? f0pVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    public final e e(f0p f0pVar) {
        e eVarG = g(f0pVar);
        if (eVarG != null && f0pVar.j()) {
            this.d.append(eVarG.e(), true);
        }
        return eVarG;
    }

    public e f() {
        return this.e;
    }

    public final e g(f0p f0pVar) {
        int size = this.f32605a.size();
        float f2 = 0.0f;
        e eVar = null;
        for (int i = 0; i < size; i++) {
            e eVar2 = this.f32605a.get(i);
            if (j(eVar2, f0pVar)) {
                float fD = d(eVar2, f0pVar);
                if (eVar == null || fD > f2) {
                    eVar = eVar2;
                    f2 = fD;
                }
            }
        }
        return eVar;
    }

    public e h(f0p f0pVar) {
        return this.c.get(f0pVar);
    }

    public e i() {
        return h(f0p.f);
    }

    public final boolean j(e eVar, f0p f0pVar) {
        float[] fArrC = eVar.c();
        return fArrC[1] >= f0pVar.e() && fArrC[1] <= f0pVar.c() && fArrC[2] >= f0pVar.d() && fArrC[2] <= f0pVar.b() && !this.d.get(eVar.e());
    }
}
