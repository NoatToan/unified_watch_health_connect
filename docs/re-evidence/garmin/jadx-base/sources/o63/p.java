package o63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo63/p;", "", "<init>", "()V", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f129874a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f129875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129876c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo63/p$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f129877a = new a();

        private a() {
        }
    }

    public p() {
        int[] iArr = new int[8];
        for (int i14 = 0; i14 < 8; i14++) {
            iArr[i14] = -1;
        }
        this.f129875b = iArr;
        this.f129876c = -1;
    }

    public final String a() {
        StringBuilder sb3 = new StringBuilder("$");
        int i14 = this.f129876c + 1;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = this.f129874a[i15];
            if (obj instanceof k63.e) {
                k63.e eVar = (k63.e) obj;
                boolean zG = p005kotlin.jvm.internal.s.g(eVar.getKind(), k63.m.b.f103254a);
                int[] iArr = this.f129875b;
                if (!zG) {
                    int i16 = iArr[i15];
                    if (i16 >= 0) {
                        sb3.append(".");
                        sb3.append(eVar.d(i16));
                    }
                } else if (iArr[i15] != -1) {
                    sb3.append("[");
                    sb3.append(this.f129875b[i15]);
                    sb3.append("]");
                }
            } else if (obj != a.f129877a) {
                sb3.append("['");
                sb3.append(obj);
                sb3.append("']");
            }
        }
        return sb3.toString();
    }

    public final String toString() {
        return a();
    }
}
