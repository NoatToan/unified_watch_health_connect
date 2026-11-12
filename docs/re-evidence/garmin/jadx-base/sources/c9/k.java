package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/k;", "", "", "value", "Lc9/k$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/k$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements Comparable<k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26017c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f26018d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26020b;

    static {
        b[] bVarArrValues = b.values();
        int iA = t0.a(bVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(bVar, new k(0.0d, bVar));
        }
        f26018d = linkedHashMap;
    }

    private k(double d14, b bVar) {
        this.f26019a = d14;
        this.f26020b = bVar;
    }

    public final double a() {
        return this.f26020b.getF26027c() * this.f26019a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(k kVar) {
        k kVar2 = kVar;
        kVar2.getClass();
        return this.f26020b == kVar2.f26020b ? Double.compare(this.f26019a, kVar2.f26019a) : Double.compare(a(), kVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f26020b == kVar.f26020b) {
            return this.f26019a == kVar.f26019a;
        }
        return a() == kVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f26019a + ' ' + this.f26020b.getF26028d();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/k$a;", "", "<init>", "()V", "", "Lc9/k$b;", "Lc9/k;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/k$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0393b f26021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f26022b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Velocity.Type.KILOMETERS_PER_HOUR", "Lc9/k$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26023c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26024d;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f26023c = 0.2777777777777778d;
                this.f26024d = "km/h";
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26027c() {
                return this.f26023c;
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26028d() {
                return this.f26024d;
            }
        }

        /* JADX INFO: renamed from: c9.k$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Velocity.Type.METERS_PER_SECOND", "Lc9/k$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0393b extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26025c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26026d;

            public C0393b(String str, int i14) {
                super(str, i14, null);
                this.f26025c = 1.0d;
                this.f26026d = "meters/sec";
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26027c() {
                return this.f26025c;
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26028d() {
                return this.f26026d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Velocity.Type.MILES_PER_HOUR", "Lc9/k$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26027c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26028d;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f26027c = 0.447040357632d;
                this.f26028d = "miles/h";
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26027c() {
                return this.f26027c;
            }

            @Override // c9.k.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26028d() {
                return this.f26028d;
            }
        }

        static {
            C0393b c0393b = new C0393b("METERS_PER_SECOND", 0);
            f26021a = c0393b;
            f26022b = new b[]{c0393b, new a("KILOMETERS_PER_HOUR", 1), new c("MILES_PER_HOUR", 2)};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26022b.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract double getF26027c();

        /* JADX INFO: renamed from: b */
        public abstract String getF26028d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ k(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
