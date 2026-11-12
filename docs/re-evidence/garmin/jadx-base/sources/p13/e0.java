package p13;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class e0 extends d0 {
    public static final int H(int i14, List list) {
        if (i14 >= 0 && i14 <= list.size() - 1) {
            return (list.size() - 1) - i14;
        }
        StringBuilder sbI = b71.i.i(i14, "Element index ", " must be in range [");
        sbI.append(new j23.l(0, list.size() - 1));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public static final int I(int i14, List list) {
        if (i14 >= 0 && i14 <= list.size()) {
            return list.size() - i14;
        }
        StringBuilder sbI = b71.i.i(i14, "Position index ", " must be in range [");
        sbI.append(new j23.l(0, list.size()));
        sbI.append("].");
        throw new IndexOutOfBoundsException(sbI.toString());
    }

    public static y0 J(List list) {
        list.getClass();
        return new y0(list);
    }
}
