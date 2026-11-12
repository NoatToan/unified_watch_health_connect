package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class k7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, byte[]> f23568a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Integer> f23569b = new HashMap();
    public g0q.a c;

    public k7q(g0q.a aVar) {
        this.c = aVar;
    }

    public void a(int i, int i2, int i3, boolean z) {
        g0q.a aVar = this.c;
        if (aVar != null) {
            aVar.a(new j6q(i, i2, i3), z);
        }
    }

    public void b(int i, int i2, int i3, boolean z) {
        g0q.a aVar = this.c;
        if (aVar != null) {
            aVar.c(new j6q(i, i2, i3), z);
        }
    }

    public void c(int i, int i2, int i3, byte[] bArr, int i4) {
        g0q.a aVar = this.c;
        if (aVar != null) {
            aVar.b(new j6q(i, i2, i3), bArr, i4);
        }
    }

    public void d(int i, int i2, int i3, byte[] bArr, int i4) {
        int iIntValue;
        g0q.a aVar;
        String str = i + ":" + i2 + ":" + i3;
        byte[] bArr2 = this.f23568a.get(str);
        if (bArr2 == null) {
            bArr2 = new byte[i4];
            this.f23568a.put(str, bArr2);
            iIntValue = 0;
        } else {
            iIntValue = this.f23569b.remove(str).intValue();
        }
        System.arraycopy(bArr, 0, bArr2, iIntValue, bArr.length);
        if (i4 != bArr.length + iIntValue || (aVar = this.c) == null) {
            this.f23569b.put(str, Integer.valueOf(iIntValue + bArr.length));
            return;
        }
        aVar.h(new j6q(i, i2, i3), bArr2, i4);
        this.c.g(new j6q(i, i2, i3));
        this.f23568a.remove(str);
        this.f23569b.remove(str);
    }

    public void e(int i, int i2, int i3, byte[] bArr, int i4) {
        g0q.a aVar = this.c;
        if (aVar != null) {
            aVar.e(new j6q(i, i2, i3), bArr, i4);
        }
    }

    public void f(int i, int i2, int i3) {
        String str = i + ":" + i2 + ":" + i3;
        byte[] bArrRemove = this.f23568a.remove(str);
        if (bArrRemove == null || this.c == null) {
            return;
        }
        this.c.h(new j6q(i, i2, i3), bArrRemove, this.f23569b.remove(str).intValue());
        this.c.g(new j6q(i, i2, i3));
    }

    public void g(int i, int i2, int i3) {
        g0q.a aVar = this.c;
        if (aVar != null) {
            aVar.d(new j6q(i, i2, i3));
        }
    }
}
