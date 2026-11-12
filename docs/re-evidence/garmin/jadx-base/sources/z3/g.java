package z3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz3/g;", "", "", "element", "<init>", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202099a;

    public /* synthetic */ g(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntRef(element = ");
        sb3.append(this.f202099a);
        sb3.append(")@");
        int iHashCode = hashCode();
        d53.a.a(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb3.append(string);
        return sb3.toString();
    }

    public g(int i14) {
        this.f202099a = i14;
    }

    public g() {
        this(0, 1, null);
    }
}
