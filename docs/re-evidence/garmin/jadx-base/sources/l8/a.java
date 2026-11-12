package l8;

import e23.l;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\f\r\u000eB5\b\u0000\u0012\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ll8/a;", "", "T", "Ll8/a$c;", "converter", "", "dataTypeName", "Ll8/a$a;", "aggregationType", "aggregationField", "<init>", "(Ll8/a$c;Ljava/lang/String;Ll8/a$a;Ljava/lang/String;)V", "c", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f111475a = new b(null);

    /* JADX INFO: renamed from: l8.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll8/a$a;", "", "", "aggregationTypeString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC2129a {
        DURATION("duration"),
        AVERAGE("avg"),
        MINIMUM("min"),
        MAXIMUM("max"),
        TOTAL("total"),
        COUNT("count");

        EnumC2129a(String str) {
        }
    }

    public interface c<T, R> extends l<T, R> {

        /* JADX INFO: renamed from: l8.a$c$a, reason: collision with other inner class name */
        public interface InterfaceC2130a<R> extends c<Double, R> {
        }

        public interface b<R> extends c<Long, R> {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements c.InterfaceC2130a, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f111483a;

        public d(l lVar) {
            lVar.getClass();
            this.f111483a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c.InterfaceC2130a) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f111483a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // e23.l
        public final /* synthetic */ Object invoke(Object obj) {
            return this.f111483a.invoke(Double.valueOf(((Number) obj).doubleValue()));
        }
    }

    public a(c<?, ? extends T> cVar, String str, EnumC2129a enumC2129a, String str2) {
        cVar.getClass();
        str.getClass();
        enumC2129a.getClass();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll8/a$b;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static void a(String str, EnumC2129a enumC2129a, String str2) {
            enumC2129a.getClass();
            new a(new l8.c(), str, enumC2129a, str2);
        }

        public static void b(String str, EnumC2129a enumC2129a, String str2, l lVar) {
            enumC2129a.getClass();
            new a(new d(lVar), str, enumC2129a, str2);
        }

        public static void c(String str, EnumC2129a enumC2129a, String str2) {
            enumC2129a.getClass();
            new a(e.f111485a, str, enumC2129a, str2);
        }

        public static void d(String str, EnumC2129a enumC2129a, String str2) {
            enumC2129a.getClass();
            new a(new l8.b(), str, enumC2129a, str2);
        }

        private b() {
        }
    }
}
