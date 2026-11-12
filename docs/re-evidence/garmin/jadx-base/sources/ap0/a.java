package ap0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ap0.a[], still in use, count: 1, list:
  (r0v1 ap0.a[]) from 0x0024: CONSTRUCTOR (r0v1 ap0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lap0/a;", "", "Lyl2/b;", "deviceType", "", "Lap0/g;", "onboardingFeatures", "<init>", "(Ljava/lang/String;ILyl2/b;Ljava/util/List;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    CINEMA(yl2.b.f197763p6, x.k(g.f11670c, g.f11671d, g.f11672e, g.f11673f, g.f11674g));


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0167a f11648c = new C0167a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f11650e = new w13.c(new a[]{new a(yl2.b.f197763p6, x.k(g.f11670c, g.f11671d, g.f11672e, g.f11673f, g.f11674g))});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl2.b f11651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f11652b;

    static {
    }

    private a(yl2.b bVar, List list) {
        super(str, i);
        this.f11651a = bVar;
        this.f11652b = list;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11649d.clone();
    }

    /* JADX INFO: renamed from: ap0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lap0/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0167a {
        public /* synthetic */ C0167a(j jVar) {
            this();
        }

        private C0167a() {
        }
    }
}
