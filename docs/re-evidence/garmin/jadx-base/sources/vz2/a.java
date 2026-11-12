package vz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3373a f180927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f180928b;

    /* JADX INFO: renamed from: vz2.a$a, reason: collision with other inner class name */
    public static enum C3373a extends a {
        public C3373a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "offline";
        }
    }

    static {
        C3373a c3373a = new C3373a("Offline", 0);
        f180927a = c3373a;
        f180928b = new a[]{c3373a};
    }

    private a(String str, int i14) {
        super(str, i14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f180928b.clone();
    }

    public /* synthetic */ a(String str, int i14, C3373a c3373a) {
        this(str, i14);
    }
}
