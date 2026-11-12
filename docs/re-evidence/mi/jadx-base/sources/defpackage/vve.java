package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

/* JADX INFO: loaded from: classes4.dex */
public class vve implements bq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3i<Bitmap> f37269a = new eq2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37270b;
    public int c;
    public final k3i d;
    public int e;

    public vve(int i, int i2, k3i k3iVar, spf spfVar) {
        this.f37270b = i;
        this.c = i2;
        this.d = k3iVar;
        if (spfVar != null) {
            spfVar.registerMemoryTrimmable(this);
        }
    }

    private Bitmap a(int i) {
        this.d.a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    @Override // defpackage.f3i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i) {
        try {
            int i2 = this.e;
            int i3 = this.f37270b;
            if (i2 > i3) {
                e(i3);
            }
            Bitmap bitmap = this.f37269a.get(i);
            if (bitmap == null) {
                return a(i);
            }
            int iA = this.f37269a.a(bitmap);
            this.e -= iA;
            this.d.b(iA);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.f3i, defpackage.frk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void release(Bitmap bitmap) {
        int iA = this.f37269a.a(bitmap);
        if (iA <= this.c) {
            this.d.f(iA);
            this.f37269a.put(bitmap);
            synchronized (this) {
                this.e += iA;
            }
        }
    }

    @Override // defpackage.rpf
    public void d(MemoryTrimType memoryTrimType) {
        e((int) (((double) this.f37270b) * (1.0d - memoryTrimType.getSuggestedTrimRatio())));
    }

    public final synchronized void e(int i) {
        Bitmap bitmapPop;
        while (this.e > i && (bitmapPop = this.f37269a.pop()) != null) {
            int iA = this.f37269a.a(bitmapPop);
            this.e -= iA;
            this.d.e(iA);
        }
    }
}
