package f82;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf82/b;", "Lf82/c;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements c {
    @Override // f82.c
    public final ArrayList a(ArrayList arrayList, ArrayList arrayList2, int i14) {
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (arrayList3.contains(Integer.valueOf(i14))) {
            arrayList3.remove(Integer.valueOf(i14));
            return arrayList3;
        }
        arrayList3.clear();
        arrayList3.add(Integer.valueOf(i14));
        return arrayList3;
    }
}
