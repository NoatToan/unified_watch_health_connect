package vz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f180958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f180959b;

    public static enum a extends k {
        public a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "diary";
        }
    }

    static {
        a aVar = new a("Diary", 0);
        f180958a = aVar;
        f180959b = new k[]{aVar, new k("DiaryReadOnly", 1) { // from class: vz2.k.b
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "diary_readonly";
            }
        }};
    }

    private k(String str, int i14) {
        super(str, i14);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f180959b.clone();
    }

    public /* synthetic */ k(String str, int i14, a aVar) {
        this(str, i14);
    }
}
