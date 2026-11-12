package wn0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lwn0/q;", "", "<init>", "()V", "b", "a", "c", "Lwn0/q$a;", "Lwn0/q$b;", "Lwn0/q$c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwn0/q$a;", "Lwn0/q;", "Lin0/m;", "metricType", "Lkotlin/Function0;", "", "onRetry", "<init>", "(Lin0/m;Le23/a;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final in0.m f186169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f186170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(in0.m mVar, e23.a<Unit> aVar) {
            super(null);
            mVar.getClass();
            aVar.getClass();
            this.f186169a = mVar;
            this.f186170b = aVar;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final in0.m getF186172a() {
            return this.f186169a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f186169a == aVar.f186169a && s.g(this.f186170b, aVar.f186170b);
        }

        public final int hashCode() {
            return this.f186170b.hashCode() + (this.f186169a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(metricType=" + this.f186169a + ", onRetry=" + this.f186170b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwn0/q$b;", "Lwn0/q;", "Lin0/m;", "metricType", "<init>", "(Lin0/m;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final in0.m f186171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(in0.m mVar) {
            super(null);
            mVar.getClass();
            this.f186171a = mVar;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final in0.m getF186172a() {
            return this.f186171a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f186171a == ((b) obj).f186171a;
        }

        public final int hashCode() {
            return this.f186171a.hashCode();
        }

        public final String toString() {
            return "Loading(metricType=" + this.f186171a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwn0/q$c;", "Lwn0/q;", "Lin0/m;", "metricType", "Lin0/j;", "details", "<init>", "(Lin0/m;Lin0/j;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final in0.m f186172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final in0.j f186173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(in0.m mVar, in0.j jVar) {
            super(null);
            mVar.getClass();
            jVar.getClass();
            this.f186172a = mVar;
            this.f186173b = jVar;
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: from getter */
        public final in0.m getF186172a() {
            return this.f186172a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f186172a == cVar.f186172a && s.g(this.f186173b, cVar.f186173b);
        }

        public final int hashCode() {
            return this.f186173b.hashCode() + (this.f186172a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(metricType=" + this.f186172a + ", details=" + this.f186173b + ")";
        }
    }

    public /* synthetic */ q(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract in0.m getF186172a();

    private q() {
    }
}
