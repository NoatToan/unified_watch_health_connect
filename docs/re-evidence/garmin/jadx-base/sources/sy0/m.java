package sy0;

import c22.c3;
import c22.g2;
import c22.x0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sy0.m[], still in use, count: 1, list:
  (r0v1 sy0.m[]) from 0x005e: CONSTRUCTOR (r0v1 sy0.m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lsy0/m;", "", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "title", "Lc22/c3;", "subtitle", "<init>", "(Ljava/lang/String;IILjava/lang/String;ILc22/c3;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    ONLY_ME(1, "private", R.string.privacy_only_me, g2.b(x0.La)),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTIONS(2, "subscribers", R.string.privacy_my_connections, g2.b(x0.Ca)),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTIONS_AND_GROUPS(3, "groups", R.string.privacy_my_connections_groups, g2.b(x0.Da)),
    EVERYONE(4, "public", R.string.privacy_everyone, g2.b(x0.f23509la));


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f161251d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f161255h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f161258c;

    static {
        x0.f23314a.getClass();
        f161255h = new w13.c(mVarArr);
        f161251d = new a(null);
    }

    private m(int i14, String str, int i15, c3 c3Var) {
        super(str, i);
        this.f161256a = str;
        this.f161257b = i15;
        this.f161258c = c3Var;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f161254g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsy0/m$a;", "", "<init>", "()V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
