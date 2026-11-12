package c9;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/i;", "", "", "value", "Lc9/i$b;", "temperatureUnit", "<init>", "(DLc9/i$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26008c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26010b;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26016a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f26011a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f26012b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26016a = iArr;
        }
    }

    private i(double d14, b bVar) {
        this.f26009a = d14;
        this.f26010b = bVar;
    }

    public final double a() {
        int i14 = c.f26016a[this.f26010b.ordinal()];
        double d14 = this.f26009a;
        if (i14 == 1) {
            return d14;
        }
        if (i14 == 2) {
            return d14 / 1.8d;
        }
        u0.r();
        return 0.0d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i iVar2 = iVar;
        iVar2.getClass();
        return this.f26010b == iVar2.f26010b ? Double.compare(this.f26009a, iVar2.f26009a) : Double.compare(a(), iVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f26010b == iVar.f26010b) {
            return this.f26009a == iVar.f26009a;
        }
        return a() == iVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f26009a + ' ' + this.f26010b.getF26015d();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/i$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/i$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0392b f26012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f26013c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/TemperatureDelta.TemperatureUnit.CELSIUS", "Lc9/i$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26014d;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f26014d = "Celsius";
            }

            @Override // c9.i.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF26015d() {
                return this.f26014d;
            }
        }

        /* JADX INFO: renamed from: c9.i$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/TemperatureDelta.TemperatureUnit.FAHRENHEIT", "Lc9/i$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0392b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26015d;

            public C0392b(String str, int i14) {
                super(str, i14, null);
                this.f26015d = "Fahrenheit";
            }

            @Override // c9.i.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF26015d() {
                return this.f26015d;
            }
        }

        static {
            a aVar = new a("CELSIUS", 0);
            f26011a = aVar;
            C0392b c0392b = new C0392b("FAHRENHEIT", 1);
            f26012b = c0392b;
            f26013c = new b[]{aVar, c0392b};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26013c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF26015d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ i(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
