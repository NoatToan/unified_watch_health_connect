package com.xmlywind.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    public static final Comparator<byte[]> a = new Comparator<byte[]>() { // from class: com.xmlywind.volley.toolbox.c.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final int d;
    private final List<byte[]> b = new ArrayList();
    private final List<byte[]> c = new ArrayList(64);
    private int e = 0;

    public c(int i) {
        this.d = i;
    }

    private void a() {
        synchronized (this) {
            while (this.e > this.d) {
                byte[] bArrRemove = this.b.remove(0);
                this.c.remove(bArrRemove);
                this.e -= bArrRemove.length;
            }
        }
    }

    public void a(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length <= this.d) {
                    this.b.add(bArr);
                    int iBinarySearch = Collections.binarySearch(this.c, bArr, a);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    this.c.add(iBinarySearch, bArr);
                    this.e += bArr.length;
                    a();
                }
            }
        }
    }

    public byte[] a(int i) {
        byte[] bArr;
        synchronized (this) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                bArr = this.c.get(i2);
                if (bArr.length >= i) {
                    this.e -= bArr.length;
                    this.c.remove(i2);
                    this.b.remove(bArr);
                }
            }
            bArr = new byte[i];
        }
        return bArr;
    }
}
