package c63;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lc63/y;", "Le63/k;", "Lc63/v0;", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(IILjava/util/List;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends e63.k<v0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<Integer> f25082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<Integer> f25083h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25085f;

    static {
        new a(null);
        f25082g = p13.x.k(0, 0, 0, 0, 0, 0, 0, 0, 0);
        f25083h = p13.x.k(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i14, int i15, List<Integer> list) {
        super(w0.f25072e, i14, i15, list);
        list.getClass();
        w0.f25068a.getClass();
        this.f25084e = i14;
        this.f25085f = i15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f25084e == yVar.f25084e && this.f25085f == yVar.f25085f;
    }

    public final int hashCode() {
        return (this.f25084e * 31) + this.f25085f;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/y$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ y(int i14, int i15, List list, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? f25082g : list);
    }
}
