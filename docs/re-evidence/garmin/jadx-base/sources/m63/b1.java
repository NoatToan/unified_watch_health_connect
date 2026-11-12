package m63;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/b1;", "Lm63/z1;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b1 extends z1<String> {
    @Override // m63.z1
    public final String R(k63.e eVar, int i14) {
        eVar.getClass();
        String strU = U(eVar, i14);
        strU.getClass();
        String str = (String) p13.h0.n0(this.f117055b);
        if (str == null) {
            str = "";
        }
        return T(str, strU);
    }

    public String T(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }

    public String U(k63.e eVar, int i14) {
        eVar.getClass();
        return eVar.d(i14);
    }

    public final String V() {
        ArrayList<Tag> arrayList = this.f117055b;
        return arrayList.isEmpty() ? "$" : p13.h0.k0(arrayList, ".", "$.", null, null, 60);
    }
}
