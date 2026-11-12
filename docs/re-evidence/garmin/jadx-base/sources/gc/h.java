package gc;

import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import yb.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f76828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f76829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f76830c;

    public h(List<d> list) {
        this.f76828a = Collections.unmodifiableList(new ArrayList(list));
        this.f76829b = new long[list.size() * 2];
        for (int i14 = 0; i14 < list.size(); i14++) {
            d dVar = list.get(i14);
            int i15 = i14 * 2;
            long[] jArr = this.f76829b;
            jArr[i15] = dVar.f76799b;
            jArr[i15 + 1] = dVar.f76800c;
        }
        long[] jArr2 = this.f76829b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f76830c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yb.i
    public final List<ea.a> getCues(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            List<d> list = this.f76828a;
            if (i14 >= list.size()) {
                break;
            }
            int i15 = i14 * 2;
            long[] jArr = this.f76829b;
            if (jArr[i15] <= j8 && j8 < jArr[i15 + 1]) {
                d dVar = list.get(i14);
                ea.a aVar = dVar.f76798a;
                if (aVar.f63555e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
            i14++;
        }
        Collections.sort(arrayList2, new androidx.browser.trusted.c(13));
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            ea.a aVar2 = ((d) arrayList2.get(i16)).f76798a;
            aVar2.getClass();
            ea.a.b bVar = new ea.a.b();
            bVar.f63572e = (-1) - i16;
            bVar.f63573f = 1;
            arrayList.add(bVar.a());
        }
        return arrayList;
    }

    @Override // yb.i
    public final long getEventTime(int i14) {
        fa.a.a(i14 >= 0);
        long[] jArr = this.f76830c;
        fa.a.a(i14 < jArr.length);
        return jArr[i14];
    }

    @Override // yb.i
    public final int getEventTimeCount() {
        return this.f76830c.length;
    }

    @Override // yb.i
    public final int getNextEventTimeIndex(long j8) {
        long[] jArr = this.f76830c;
        int iA = z.a(jArr, j8, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }
}
