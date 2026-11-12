package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vcr implements soo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ocr> f36755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f36756b;
    public final long[] c;

    public vcr(List<ocr> list) {
        this.f36755a = Collections.unmodifiableList(new ArrayList(list));
        this.f36756b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            ocr ocrVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f36756b;
            jArr[i2] = ocrVar.f29016b;
            jArr[i2 + 1] = ocrVar.c;
        }
        long[] jArr2 = this.f36756b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static /* synthetic */ int f(ocr ocrVar, ocr ocrVar2) {
        return Long.compare(ocrVar.f29016b, ocrVar2.f29016b);
    }

    @Override // defpackage.soo
    public long a(int i) {
        rk1.a(i >= 0);
        rk1.a(i < this.c.length);
        return this.c[i];
    }

    @Override // defpackage.soo
    public int b() {
        return this.c.length;
    }

    @Override // defpackage.soo
    public int c(long j) {
        int iE = wlq.e(this.c, j, false, false);
        if (iE < this.c.length) {
            return iE;
        }
        return -1;
    }

    @Override // defpackage.soo
    public List<h55> d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f36755a.size(); i++) {
            long[] jArr = this.f36756b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                ocr ocrVar = this.f36755a.get(i);
                h55 h55Var = ocrVar.f29015a;
                if (h55Var.e == -3.4028235E38f) {
                    arrayList2.add(ocrVar);
                } else {
                    arrayList.add(h55Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ucr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vcr.f((ocr) obj, (ocr) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((ocr) arrayList2.get(i3)).f29015a.a().h((-1) - i3, 1).a());
        }
        return arrayList;
    }
}
