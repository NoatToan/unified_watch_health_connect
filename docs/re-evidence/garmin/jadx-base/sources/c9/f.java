package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/f;", "", "", "value", "Lc9/f$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/f$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25986c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f25987d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25989b;

    static {
        b[] bVarArrValues = b.values();
        int iA = t0.a(bVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(bVar, new f(0.0d, bVar));
        }
        f25987d = linkedHashMap;
    }

    private f(double d14, b bVar) {
        this.f25988a = d14;
        this.f25989b = bVar;
    }

    public final double a() {
        return this.f25989b.getF25995d() * this.f25988a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f fVar2 = fVar;
        fVar2.getClass();
        return this.f25989b == fVar2.f25989b ? Double.compare(this.f25988a, fVar2.f25988a) : Double.compare(a(), fVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f25989b == fVar.f25989b) {
            return this.f25988a == fVar.f25988a;
        }
        return a() == fVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f25988a + ' ' + this.f25989b.getF25996e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/f$a;", "", "<init>", "()V", "", "Lc9/f$b;", "Lc9/f;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0390b f25990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f25991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f25992c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Power.Type.KILOCALORIES_PER_DAY", "Lc9/f$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25993d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25994e;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f25993d = 0.0484259259d;
                this.f25994e = "kcal/day";
            }

            @Override // c9.f.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF25996e() {
                return this.f25994e;
            }

            @Override // c9.f.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final double getF25995d() {
                return this.f25993d;
            }
        }

        /* JADX INFO: renamed from: c9.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Power.Type.WATTS", "Lc9/f$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0390b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25995d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25996e;

            public C0390b(String str, int i14) {
                super(str, i14, null);
                this.f25995d = 1.0d;
                this.f25996e = "Watts";
            }

            @Override // c9.f.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF25996e() {
                return this.f25996e;
            }

            @Override // c9.f.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final double getF25995d() {
                return this.f25995d;
            }
        }

        static {
            C0390b c0390b = new C0390b("WATTS", 0);
            f25990a = c0390b;
            a aVar = new a("KILOCALORIES_PER_DAY", 1);
            f25991b = aVar;
            f25992c = new b[]{c0390b, aVar};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25992c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF25996e();

        /* JADX INFO: renamed from: b */
        public abstract double getF25995d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ f(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
