package c9;

import com.garmin.android.gncs.NotificationConstants;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lc9/h;", "", "", "value", "Lc9/h$b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(DLc9/h$b;)V", "a", "b", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25999c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f26000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26001b;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26007a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f26002a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f26003b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26007a = iArr;
        }
    }

    private h(double d14, b bVar) {
        this.f26000a = d14;
        this.f26001b = bVar;
    }

    public final double a() {
        int i14 = c.f26007a[this.f26001b.ordinal()];
        double d14 = this.f26000a;
        if (i14 == 1) {
            return d14;
        }
        if (i14 == 2) {
            return (d14 - 32.0d) / 1.8d;
        }
        u0.r();
        return 0.0d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        hVar2.getClass();
        return this.f26001b == hVar2.f26001b ? Double.compare(this.f26000a, hVar2.f26000a) : Double.compare(a(), hVar2.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f26001b == hVar.f26001b) {
            return this.f26000a == hVar.f26000a;
        }
        return a() == hVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.f26000a + ' ' + this.f26001b.getF26006d();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/h$a;", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc9/h$b;", "", "<init>", "(Ljava/lang/String;I)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0391b f26003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f26004c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Temperature.Type.CELSIUS", "Lc9/h$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26005d;

            public a(String str, int i14) {
                super(str, i14, null);
                this.f26005d = "Celsius";
            }

            @Override // c9.h.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF26006d() {
                return this.f26005d;
            }
        }

        /* JADX INFO: renamed from: c9.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/health/connect/client/units/Temperature.Type.FAHRENHEIT", "Lc9/h$b;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0391b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26006d;

            public C0391b(String str, int i14) {
                super(str, i14, null);
                this.f26006d = "Fahrenheit";
            }

            @Override // c9.h.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF26006d() {
                return this.f26006d;
            }
        }

        static {
            a aVar = new a("CELSIUS", 0);
            f26002a = aVar;
            C0391b c0391b = new C0391b("FAHRENHEIT", 1);
            f26003b = c0391b;
            f26004c = new b[]{aVar, c0391b};
        }

        public /* synthetic */ b(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26004c.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF26006d();

        private b(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ h(double d14, b bVar, p005kotlin.jvm.internal.j jVar) {
        this(d14, bVar);
    }
}
