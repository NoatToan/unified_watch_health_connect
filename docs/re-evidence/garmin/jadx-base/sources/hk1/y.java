package hk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhk1/y;", "", "<init>", "()V", "b", "a", "Lhk1/y$a;", "Lhk1/y$b;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class y {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhk1/y$b;", "Lhk1/y;", "Lhk1/s;", "data", "<init>", "(Lhk1/s;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f84220a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar) {
            super(null);
            sVar.getClass();
            this.f84220a = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f84220a, ((b) obj).f84220a);
        }

        public final int hashCode() {
            return this.f84220a.hashCode();
        }

        public final String toString() {
            return "Supported(data=" + this.f84220a + ")";
        }
    }

    public /* synthetic */ y(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private y() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhk1/y$a;", "Lhk1/y;", "Lhk1/k;", "reason", "", "applicationName", "<init>", "(Lhk1/k;Ljava/lang/String;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f84218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, String str) {
            super(null);
            kVar.getClass();
            this.f84218a = kVar;
            this.f84219b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84218a == aVar.f84218a && p005kotlin.jvm.internal.s.g(this.f84219b, aVar.f84219b);
        }

        public final int hashCode() {
            int iHashCode = this.f84218a.hashCode() * 31;
            String str = this.f84219b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NotSupported(reason=" + this.f84218a + ", applicationName=" + this.f84219b + ")";
        }

        public /* synthetic */ a(k kVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(kVar, (i14 & 2) != 0 ? null : str);
        }
    }
}
