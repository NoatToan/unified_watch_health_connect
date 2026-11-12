package c9;

import com.garmin.android.gncs.NotificationConstants;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/b;", "", "", "value", "Lc9/b$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/b$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25946c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f25947d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f25948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0384b f25949b;

    static {
        EnumC0384b[] enumC0384bArrValues = EnumC0384b.values();
        int iA = t0.a(enumC0384bArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (EnumC0384b enumC0384b : enumC0384bArrValues) {
            linkedHashMap.put(enumC0384b, new b(0.0d, enumC0384b));
        }
        f25947d = linkedHashMap;
    }

    private b(double d14, EnumC0384b enumC0384b) {
        this.f25948a = d14;
        this.f25949b = enumC0384b;
    }

    public final double a() {
        return this.f25949b.getF25959d() * this.f25948a;
    }

    public final double b() {
        EnumC0384b.c cVar = EnumC0384b.f25951b;
        return this.f25949b == cVar ? this.f25948a : a() / cVar.f25957d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        return this.f25949b == bVar2.f25949b ? Double.compare(this.f25948a, bVar2.f25948a) : Double.compare(a(), bVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25949b == bVar.f25949b) {
            return this.f25948a == bVar.f25948a;
        }
        return a() == bVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f25948a + ' ' + this.f25949b.getF25960e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/b$a;", "", "<init>", "()V", "", "Lc9/b$b;", "Lc9/b;", "ZEROS", "Ljava/util/Map;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(double d14) {
            return new b(d14, EnumC0384b.f25951b, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: c9.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumC0384b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f25951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0384b[] f25952c;

        /* JADX INFO: renamed from: c9.b$b$a */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Energy.Type.CALORIES", "Lc9/b$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends EnumC0384b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25953d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25954e;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f25953d = 1.0d;
                this.f25954e = "cal";
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25959d() {
                return this.f25953d;
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF25960e() {
                return this.f25954e;
            }
        }

        /* JADX INFO: renamed from: c9.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Energy.Type.JOULES", "Lc9/b$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0385b extends EnumC0384b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25955d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25956e;

            public C0385b(String str, int i14) {
                super(str, i14, null);
                this.f25955d = 0.2390057361d;
                this.f25956e = "J";
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25959d() {
                return this.f25955d;
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF25960e() {
                return this.f25956e;
            }
        }

        /* JADX INFO: renamed from: c9.b$b$c */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Energy.Type.KILOCALORIES", "Lc9/b$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends EnumC0384b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25957d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25958e;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f25957d = 1000.0d;
                this.f25958e = "kcal";
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25959d() {
                return this.f25957d;
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF25960e() {
                return this.f25958e;
            }
        }

        /* JADX INFO: renamed from: c9.b$b$d */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Energy.Type.KILOJOULES", "Lc9/b$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class d extends EnumC0384b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final double f25959d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f25960e;

            public d(String str, int i14) {
                super(str, i14, null);
                this.f25959d = 239.0057361d;
                this.f25960e = "kJ";
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getF25959d() {
                return this.f25959d;
            }

            @Override // c9.b.EnumC0384b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF25960e() {
                return this.f25960e;
            }
        }

        static {
            a aVar = new a("CALORIES", 0);
            f25950a = aVar;
            c cVar = new c("KILOCALORIES", 1);
            f25951b = cVar;
            f25952c = new EnumC0384b[]{aVar, cVar, new C0385b("JOULES", 2), new d("KILOJOULES", 3)};
        }

        public /* synthetic */ EnumC0384b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static EnumC0384b valueOf(String str) {
            return (EnumC0384b) Enum.valueOf(EnumC0384b.class, str);
        }

        public static EnumC0384b[] values() {
            return (EnumC0384b[]) f25952c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract double getF25959d();

        /* JADX INFO: renamed from: b */
        public abstract String getF25960e();

        private EnumC0384b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ b(double d14, EnumC0384b enumC0384b, p005kotlin.jvm.internal.j jVar) {
        this(d14, enumC0384b);
    }
}
