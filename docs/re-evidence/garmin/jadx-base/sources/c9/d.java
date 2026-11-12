package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import java.util.Locale;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/d;", "", "", "value", "Lc9/d$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/d$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements Comparable<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25972c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f25973d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25975b;

    static {
        b[] bVarArrValues = b.values();
        int iA = t0.a(bVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(bVar, new d(0.0d, bVar));
        }
        f25973d = linkedHashMap;
    }

    private d(double d14, b bVar) {
        this.f25974a = d14;
        this.f25975b = bVar;
    }

    public final double a() {
        return this.f25975b.getF25984d() * this.f25974a;
    }

    public final double b() {
        b.C0388b c0388b = b.f25977b;
        return this.f25975b == c0388b ? this.f25974a : a() / c0388b.f25980d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        dVar2.getClass();
        return this.f25975b == dVar2.f25975b ? Double.compare(this.f25974a, dVar2.f25974a) : Double.compare(a(), dVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f25975b == dVar.f25975b) {
            return this.f25974a == dVar.f25974a;
        }
        return a() == dVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f25974a);
        sb3.append(' ');
        String lowerCase = this.f25975b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb3.append(lowerCase);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/d$a;", "", "<init>", "()V", "", "Lc9/d$b;", "Lc9/d;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(double d14) {
            return new d(d14, b.f25976a, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0388b f25977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f25978c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.GRAMS", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25979d;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f25979d = 1.0d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25979d;
            }
        }

        /* JADX INFO: renamed from: c9.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.KILOGRAMS", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0388b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25980d;

            public C0388b(String str, int i14) {
                super(str, i14, null);
                this.f25980d = 1000.0d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25980d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.MICROGRAMS", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25981d;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f25981d = 1.0E-6d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25981d;
            }
        }

        /* JADX INFO: renamed from: c9.d$b$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.MILLIGRAMS", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0389d extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25982d;

            public C0389d(String str, int i14) {
                super(str, i14, null);
                this.f25982d = 0.001d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25982d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.OUNCES", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25983d;

            public e(String str, int i14) {
                super(str, i14, null);
                this.f25983d = 28.34952d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25983d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Mass.Type.POUNDS", "Lc9/d$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class f extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25984d;

            public f(String str, int i14) {
                super(str, i14, null);
                this.f25984d = 453.59237d;
            }

            @Override // c9.d.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25984d() {
                return this.f25984d;
            }
        }

        static {
            a aVar = new a("GRAMS", 0);
            f25976a = aVar;
            C0388b c0388b = new C0388b("KILOGRAMS", 1);
            f25977b = c0388b;
            f25978c = new b[]{aVar, c0388b, new C0389d("MILLIGRAMS", 2), new c("MICROGRAMS", 3), new e("OUNCES", 4), new f("POUNDS", 5)};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25978c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract double getF25984d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ d(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
