package p005kotlin.jvm.internal;

import k23.d;
import k23.f;

/* JADX INFO: loaded from: classes3.dex */
public class i0 extends h0 {
    public i0(f fVar, String str, String str2) {
        super(e.NO_RECEIVER, ((g) fVar).j(), str, str2, !(fVar instanceof d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public i0(Class cls, String str, String str2, int i14) {
        super(e.NO_RECEIVER, cls, str, str2, i14);
    }

    public i0(Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, i14);
    }
}
