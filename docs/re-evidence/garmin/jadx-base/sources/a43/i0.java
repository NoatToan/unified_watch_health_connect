package a43;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i0[] f1157c;

    public static final class a extends i0 {
        public a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // a43.i0
        public final String a(String str) {
            str.getClass();
            return d53.u.v(d53.u.v(str, "<", "&lt;", false), ">", "&gt;", false);
        }
    }

    public static final class b extends i0 {
        public b(String str, int i14) {
            super(str, i14, null);
        }

        @Override // a43.i0
        public final String a(String str) {
            str.getClass();
            return str;
        }
    }

    static {
        b bVar = new b("PLAIN", 0);
        f1155a = bVar;
        a aVar = new a("HTML", 1);
        f1156b = aVar;
        f1157c = new i0[]{bVar, aVar};
    }

    public /* synthetic */ i0(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, i14);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f1157c.clone();
    }

    public abstract String a(String str);

    private i0(String str, int i14) {
        super(str, i14);
    }
}
