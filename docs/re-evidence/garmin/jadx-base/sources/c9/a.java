package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/a;", "", "", "value", "Lc9/a$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/a$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0381a f25937c = new C0381a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f25938d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25940b;

    static {
        b[] bVarArrValues = b.values();
        int iA = t0.a(bVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (b bVar : bVarArrValues) {
            linkedHashMap.put(bVar, new a(0.0d, bVar));
        }
        f25938d = linkedHashMap;
    }

    private a(double d14, b bVar) {
        this.f25939a = d14;
        this.f25940b = bVar;
    }

    public final double a() {
        return this.f25940b.getF25945c() * this.f25939a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        return this.f25940b == aVar2.f25940b ? Double.compare(this.f25939a, aVar2.f25939a) : Double.compare(a(), aVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f25940b == aVar.f25940b) {
            return this.f25939a == aVar.f25939a;
        }
        return a() == aVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f25939a + ' ' + this.f25940b.getF25944d();
    }

    /* JADX INFO: renamed from: c9.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/a$a;", "", "<init>", "()V", "", "Lc9/a$b;", "Lc9/a;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0381a {
        public /* synthetic */ C0381a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0381a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0383b f25941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f25942b;

        /* JADX INFO: renamed from: c9.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/BloodGlucose.Type.MILLIGRAMS_PER_DECILITER", "Lc9/a$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0382a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f25943c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f25944d;

            public C0382a(String str, int i14) {
                super(str, i14, null);
                this.f25943c = 0.05555555555555555d;
                this.f25944d = "mg/dL";
            }

            @Override // c9.a.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25945c() {
                return this.f25943c;
            }

            @Override // c9.a.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF25944d() {
                return this.f25944d;
            }
        }

        /* JADX INFO: renamed from: c9.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/BloodGlucose.Type.MILLIMOLES_PER_LITER", "Lc9/a$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0383b extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f25945c;

            public C0383b(String str, int i14) {
                super(str, i14, null);
                this.f25945c = 1.0d;
            }

            @Override // c9.a.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25945c() {
                return this.f25945c;
            }

            @Override // c9.a.b
            /* JADX INFO: renamed from: b */
            public final String getF25944d() {
                return "mmol/L";
            }
        }

        static {
            C0383b c0383b = new C0383b("MILLIMOLES_PER_LITER", 0);
            f25941a = c0383b;
            f25942b = new b[]{c0383b, new C0382a("MILLIGRAMS_PER_DECILITER", 1)};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25942b.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract double getF25945c();

        /* JADX INFO: renamed from: b */
        public abstract String getF25944d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ a(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
