package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp3/x2;", "Lp3/p3;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x2 implements p3<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2 f135386a = new x2();

    private x2() {
    }

    @Override // p3.p3
    public final boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}
