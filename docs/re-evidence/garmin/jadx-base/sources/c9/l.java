package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/l;", "", "", "value", "Lc9/l$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/l$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26029c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f26030d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26032b;

    static {
        b[] bVarArrValues = b.values();
        int iA = t0.a(bVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(bVar, new l(0.0d, bVar));
        }
        f26030d = linkedHashMap;
    }

    private l(double d14, b bVar) {
        this.f26031a = d14;
        this.f26032b = bVar;
    }

    public final double a() {
        return this.f26032b.getF26039c() * this.f26031a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        l lVar2 = lVar;
        lVar2.getClass();
        return this.f26032b == lVar2.f26032b ? Double.compare(this.f26031a, lVar2.f26031a) : Double.compare(a(), lVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f26032b == lVar.f26032b) {
            return this.f26031a == lVar.f26031a;
        }
        return a() == lVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f26031a + ' ' + this.f26032b.getF26040d();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/l$a;", "", "<init>", "()V", "", "Lc9/l$b;", "Lc9/l;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/l$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0394b f26033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f26034b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Volume.Type.FLUID_OUNCES_US", "Lc9/l$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26035c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26036d;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f26035c = 0.02957353d;
                this.f26036d = "fl. oz (US)";
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26039c() {
                return this.f26035c;
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26040d() {
                return this.f26036d;
            }
        }

        /* JADX INFO: renamed from: c9.l$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Volume.Type.LITERS", "Lc9/l$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0394b extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26037c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26038d;

            public C0394b(String str, int i14) {
                super(str, i14, null);
                this.f26037c = 1.0d;
                this.f26038d = "L";
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26039c() {
                return this.f26037c;
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26040d() {
                return this.f26038d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Volume.Type.MILLILITERS", "Lc9/l$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f26039c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26040d;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f26039c = 0.001d;
                this.f26040d = "mL";
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF26039c() {
                return this.f26039c;
            }

            @Override // c9.l.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF26040d() {
                return this.f26040d;
            }
        }

        static {
            C0394b c0394b = new C0394b("LITERS", 0);
            f26033a = c0394b;
            f26034b = new b[]{c0394b, new c("MILLILITERS", 1), new a("FLUID_OUNCES_US", 2)};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26034b.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract double getF26039c();

        /* JADX INFO: renamed from: b */
        public abstract String getF26040d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ l(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
