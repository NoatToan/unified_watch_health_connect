package ca2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ca2.a[], still in use, count: 1, list:
  (r0v1 ca2.a[]) from 0x0044: CONSTRUCTOR (r0v1 ca2.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lca2/a;", "", "", Action.KEY_ATTRIBUTE, "", "title", "completeMessage", "Lca2/b;", "startDestination", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILca2/b;)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {
    CHANGE_PASSCODE("change_passcode", R.string.lbl_change_passcode, R.string.msg_passcode_set, b.f26605d),
    SET_PASSCODE("set_passcode", R.string.lbl_set_passcode, R.string.msg_passcode_set, b.f26607f),
    CONFIRM_PASSCODE("confirm_passcode", R.string.lbl_confirm_passcode, R.string.msg_passcode_confirmed, b.f26609h);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0407a f26595e = new C0407a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f26600j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f26604d;

    static {
        f26600j = new w13.c(new a[]{r0, r1, r2});
    }

    private a(String str, int i14, int i15, b bVar) {
        super(str, i);
        this.f26601a = str;
        this.f26602b = i14;
        this.f26603c = i15;
        this.f26604d = bVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f26599i.clone();
    }

    /* JADX INFO: renamed from: ca2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lca2/a$a;", "", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0407a {
        public /* synthetic */ C0407a(j jVar) {
            this();
        }

        private C0407a() {
        }
    }
}
