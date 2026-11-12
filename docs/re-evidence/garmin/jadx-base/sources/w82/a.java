package w82;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lw82/a;", "PageDataType", "", "Lw82/a$a;", RemoteConfigConstants.ResponseFieldKey.STATE, "data", "<init>", "(Lw82/a$a;Ljava/lang/Object;)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a<PageDataType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3402a f183552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PageDataType f183553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f183554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f183555d;

    public a(InterfaceC3402a interfaceC3402a, PageDataType pagedatatype) {
        interfaceC3402a.getClass();
        this.f183552a = interfaceC3402a;
        this.f183553b = pagedatatype;
        this.f183554c = interfaceC3402a instanceof InterfaceC3402a.b;
        this.f183555d = interfaceC3402a instanceof InterfaceC3402a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f183552a.equals(aVar.f183552a) && s.g(this.f183553b, aVar.f183553b);
    }

    public final int hashCode() {
        int iHashCode = this.f183552a.hashCode() * 31;
        PageDataType pagedatatype = this.f183553b;
        return iHashCode + (pagedatatype == null ? 0 : pagedatatype.hashCode());
    }

    public final String toString() {
        return "ReportsPageData(state=" + this.f183552a + ", data=" + this.f183553b + ")";
    }

    /* JADX INFO: renamed from: w82.a$a, reason: collision with other inner class name */
    public interface InterfaceC3402a {

        /* JADX INFO: renamed from: w82.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw82/a$a$b;", "Lw82/a$a;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC3402a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f183558a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -536663149;
            }

            public final String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: w82.a$a$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw82/a$a$c;", "Lw82/a$a;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC3402a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f183559a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2146612619;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: w82.a$a$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw82/a$a$d;", "Lw82/a$a;", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d implements InterfaceC3402a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f183560a = new d();

            private d() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -57207726;
            }

            public final String toString() {
                return "Success";
            }
        }

        /* JADX INFO: renamed from: w82.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw82/a$a$a;", "Lw82/a$a;", "", "throwable", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3403a implements InterfaceC3402a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f183556a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f183557b;

            public /* synthetic */ C3403a(Throwable th3, String str, int i14, j jVar) {
                this((i14 & 1) != 0 ? null : th3, (i14 & 2) != 0 ? null : str);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3403a)) {
                    return false;
                }
                C3403a c3403a = (C3403a) obj;
                return s.g(this.f183556a, c3403a.f183556a) && s.g(this.f183557b, c3403a.f183557b);
            }

            public final int hashCode() {
                Throwable th3 = this.f183556a;
                int iHashCode = (th3 == null ? 0 : th3.hashCode()) * 31;
                String str = this.f183557b;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "Failure(throwable=" + this.f183556a + ", message=" + this.f183557b + ")";
            }

            public C3403a(Throwable th3, String str) {
                this.f183556a = th3;
                this.f183557b = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3403a() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }
    }
}
