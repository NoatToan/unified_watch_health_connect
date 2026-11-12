package nw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnw0/j0;", "", "<init>", "()V", "b", "a", "Lnw0/j0$a;", "Lnw0/j0$b;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class j0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw0/j0$a;", "Lnw0/j0;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f128055a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2063680558;
        }

        public final String toString() {
            return "EditMode";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnw0/j0$b;", "Lnw0/j0;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f128056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f128056a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f128056a, ((b) obj).f128056a);
        }

        public final int hashCode() {
            return this.f128056a.hashCode();
        }

        public final String toString() {
            return am.j.m("SearchMode(searchQuery=", this.f128056a, ")");
        }
    }

    public /* synthetic */ j0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private j0() {
    }
}
