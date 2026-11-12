package ko2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lko2/a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f105768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2036a f105769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f105770c;

    /* JADX INFO: renamed from: ko2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/CurrencyUnit.CENT", "Lko2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2036a extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f105771d;

        public C2036a(String str, int i14) {
            super(str, i14, null);
            this.f105771d = 1L;
        }

        @Override // ko2.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF105772d() {
            return this.f105771d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/snowball/CurrencyUnit.DOLLAR", "Lko2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f105772d;

        public b(String str, int i14) {
            super(str, i14, null);
            this.f105772d = 100L;
        }

        @Override // ko2.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF105772d() {
            return this.f105772d;
        }
    }

    static {
        b bVar = new b("DOLLAR", 0);
        f105768a = bVar;
        C2036a c2036a = new C2036a("CENT", 1);
        f105769b = c2036a;
        f105770c = new a[]{bVar, c2036a};
    }

    public /* synthetic */ a(String str, int i14, j jVar) {
        this(str, i14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f105770c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF105772d();

    private a(String str, int i14) {
        super(str, i14);
    }
}
