package zb0;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 zb0.l[], still in use, count: 1, list:
  (r1v7 zb0.l[]) from 0x0102: CONSTRUCTOR (r1v7 zb0.l[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lzb0/l;", "", "", "deviceTag", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "b", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {
    /* JADX INFO: Fake field, exist only in values array */
    APPROACH("Approach", R.string.device_family_approach),
    /* JADX INFO: Fake field, exist only in values array */
    EDGE("Edge", R.string.device_family_edge),
    /* JADX INFO: Fake field, exist only in values array */
    EPIX("Epix", R.string.device_family_epix),
    /* JADX INFO: Fake field, exist only in values array */
    FENIX("Fenix", R.string.device_family_fenix),
    FORERUNNER("Forerunner", R.string.device_family_forerunner),
    /* JADX INFO: Fake field, exist only in values array */
    GPSMAP("GPSMAP", R.string.device_family_gpsmap),
    /* JADX INFO: Fake field, exist only in values array */
    INDEX("Index", R.string.device_family_index),
    /* JADX INFO: Fake field, exist only in values array */
    INSTINCT("Instinct", R.string.device_family_instinct),
    /* JADX INFO: Fake field, exist only in values array */
    LILY("Lily", R.string.device_family_lily),
    /* JADX INFO: Fake field, exist only in values array */
    MARQ("MARQ", R.string.device_family_marq),
    /* JADX INFO: Fake field, exist only in values array */
    TACTIX("Tactix", R.string.device_family_tactix),
    /* JADX INFO: Fake field, exist only in values array */
    VENU("Venu", R.string.device_family_venu),
    /* JADX INFO: Fake field, exist only in values array */
    VIVO("Vivo", R.string.device_family_vivo),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_SERIES("Legacy Series", R.string.device_family_legacy_series),
    OTHER(null, R.string.lbl_other),
    ALL(null, R.string.device_category_all),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(null, R.string.device_category_notfound);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f203548c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.t f203549d = o13.m.b(new z41.j(28));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f203554i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203556b;

    static {
        f203554i = new w13.c(new l[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, new l(null, R.string.device_category_notfound)});
    }

    private l(String str, int i14) {
        super(str, i);
        this.f203555a = str;
        this.f203556b = i14;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f203553h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzb0/l$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lzb0/l$b;", "", "<init>", "()V", "b", "a", "d", "c", "Lzb0/l$b$a;", "Lzb0/l$b$b;", "Lzb0/l$b$c;", "Lzb0/l$b$d;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/l$b$a;", "Lzb0/l$b;", TtmlNode.LEFT, TtmlNode.RIGHT, "<init>", "(Lzb0/l$b;Lzb0/l$b;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f203557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f203558b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, b bVar2) {
                super(null);
                bVar.getClass();
                bVar2.getClass();
                this.f203557a = bVar;
                this.f203558b = bVar2;
            }

            @Override // zb0.l.b
            public final boolean a(String str, String str2) {
                str2.getClass();
                return this.f203557a.a(str, str2) && this.f203558b.a(str, str2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p005kotlin.jvm.internal.s.g(this.f203557a, aVar.f203557a) && p005kotlin.jvm.internal.s.g(this.f203558b, aVar.f203558b);
            }

            public final int hashCode() {
                return this.f203558b.hashCode() + (this.f203557a.hashCode() * 31);
            }

            public final String toString() {
                return "And(left=" + this.f203557a + ", right=" + this.f203558b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/l$b$c;", "Lzb0/l$b;", "", "code", "<init>", "(Ljava/lang/String;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f203561a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                str.getClass();
                this.f203561a = str;
            }

            @Override // zb0.l.b
            public final boolean a(String str, String str2) {
                str2.getClass();
                return str2.length() == 0 || str2.equalsIgnoreCase(this.f203561a);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f203561a, ((c) obj).f203561a);
            }

            public final int hashCode() {
                return this.f203561a.hashCode();
            }

            public final String toString() {
                return am.j.m("Country(code=", this.f203561a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/l$b$d;", "Lzb0/l$b;", TtmlNode.LEFT, TtmlNode.RIGHT, "<init>", "(Lzb0/l$b;Lzb0/l$b;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f203562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f203563b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b bVar, b bVar2) {
                super(null);
                bVar.getClass();
                bVar2.getClass();
                this.f203562a = bVar;
                this.f203563b = bVar2;
            }

            @Override // zb0.l.b
            public final boolean a(String str, String str2) {
                str2.getClass();
                return this.f203562a.a(str, str2) || this.f203563b.a(str, str2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p005kotlin.jvm.internal.s.g(this.f203562a, dVar.f203562a) && p005kotlin.jvm.internal.s.g(this.f203563b, dVar.f203563b);
            }

            public final int hashCode() {
                return this.f203563b.hashCode() + (this.f203562a.hashCode() * 31);
            }

            public final String toString() {
                return "Or(left=" + this.f203562a + ", right=" + this.f203563b + ")";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public abstract boolean a(String str, String str2);

        private b() {
        }

        /* JADX INFO: renamed from: zb0.l$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzb0/l$b$b;", "Lzb0/l$b;", "", "name", "", "ignoreCase", "<init>", "(Ljava/lang/String;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3800b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f203559a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f203560b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3800b(String str, boolean z14) {
                super(null);
                str.getClass();
                this.f203559a = str;
                this.f203560b = z14;
            }

            @Override // zb0.l.b
            public final boolean a(String str, String str2) {
                str2.getClass();
                return d53.w.z(str, this.f203559a, this.f203560b);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3800b)) {
                    return false;
                }
                C3800b c3800b = (C3800b) obj;
                return p005kotlin.jvm.internal.s.g(this.f203559a, c3800b.f203559a) && this.f203560b == c3800b.f203560b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f203560b) + (this.f203559a.hashCode() * 31);
            }

            public final String toString() {
                return n23.j.g("Contains(name=", this.f203559a, ", ignoreCase=", this.f203560b, ")");
            }

            public /* synthetic */ C3800b(String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, (i14 & 2) != 0 ? true : z14);
            }
        }
    }
}
