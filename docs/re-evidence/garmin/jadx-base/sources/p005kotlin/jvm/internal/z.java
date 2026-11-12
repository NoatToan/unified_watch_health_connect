package p005kotlin.jvm.internal;

import k23.d;
import k23.f;

/* JADX INFO: loaded from: classes3.dex */
public class z extends y {
    public z(f fVar, String str, String str2) {
        super(e.NO_RECEIVER, ((g) fVar).j(), str, str2, !(fVar instanceof d) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public z(Class cls, String str, String str2, int i14) {
        super(e.NO_RECEIVER, cls, str, str2, i14);
    }

    public z(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
