package vz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f180954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f180955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f180956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f180957d;

    public static enum a extends j {
        public a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "code";
        }
    }

    public static enum b extends j {
        public b(String str, int i14) {
            super(str, i14, null);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "token";
        }
    }

    public static enum c extends j {
        public c(String str, int i14) {
            super(str, i14, null);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "code,token";
        }
    }

    static {
        a aVar = new a("Code", 0);
        f180954a = aVar;
        b bVar = new b("Token", 1);
        f180955b = bVar;
        c cVar = new c("Both", 2);
        f180956c = cVar;
        f180957d = new j[]{aVar, bVar, cVar};
    }

    private j(String str, int i14) {
        super(str, i14);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f180957d.clone();
    }

    public /* synthetic */ j(String str, int i14, a aVar) {
        this(str, i14);
    }
}
