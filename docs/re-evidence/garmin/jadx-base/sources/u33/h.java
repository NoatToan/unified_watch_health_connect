package u33;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p13.x;
import p13.y;
import s33.s;
import s33.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s> f168330a;

    public h(v vVar) {
        vVar.getClass();
        List<s> list = vVar.f156964c;
        if ((vVar.f156963b & 1) == 1) {
            int i14 = vVar.f156965d;
            list.getClass();
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                s sVarI = (s) obj;
                if (i15 >= i14) {
                    sVarI.getClass();
                    s.c cVarO = s.o(sVarI);
                    cVarO.f156890d |= 2;
                    cVarO.f156892f = true;
                    sVarI = cVarO.i();
                    if (!sVarI.isInitialized()) {
                        throw new UninitializedMessageException(sVarI);
                    }
                }
                arrayList.add(sVarI);
                i15 = i16;
            }
            list = arrayList;
        }
        list.getClass();
        this.f168330a = list;
    }

    public final s a(int i14) {
        return this.f168330a.get(i14);
    }
}
