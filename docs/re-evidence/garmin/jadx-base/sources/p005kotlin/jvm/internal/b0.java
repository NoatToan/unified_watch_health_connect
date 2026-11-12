package p005kotlin.jvm.internal;

import k23.d;
import k23.f;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends a0 {
    public b0(f fVar, String str, String str2) {
        super(e.NO_RECEIVER, ((g) fVar).j(), str, str2, !(fVar instanceof d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void p(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public b0(Class cls, String str, String str2, int i14) {
        super(e.NO_RECEIVER, cls, str, str2, i14);
    }

    public b0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
