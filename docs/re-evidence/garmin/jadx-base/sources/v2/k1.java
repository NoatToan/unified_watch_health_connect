package v2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/k1;", "Lv2/p;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k1 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f175073a = new k1();

    private k1() {
    }

    @Override // v2.p
    public final int a(int i14) {
        if (i14 == 10) {
            return 32;
        }
        if (i14 == 13) {
            return 65279;
        }
        return i14;
    }

    public final String toString() {
        return "SingleLineCodepointTransformation";
    }
}
