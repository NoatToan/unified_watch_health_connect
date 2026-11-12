package vt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vt1.g[], still in use, count: 1, list:
  (r0v1 vt1.g[]) from 0x0026: CONSTRUCTOR (r0v1 vt1.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB\u001b\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lvt1/g;", "Lvt1/f;", "", "", "displayResId", "", "jsonKey", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements f {
    FINISH(R.string.finish_goal, "COMPLETION"),
    FINISH_GOAL_TIME(R.string.finish_with_a_time_goal, "PACE");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f180106c = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180110g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180112b;

    static {
        f180110g = new w13.c(new g[]{r0, r1});
    }

    private g(int i14, String str) {
        super(str, i);
        this.f180111a = i14;
        this.f180112b = str;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f180109f.clone();
    }

    @Override // vt1.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF180088a() {
        return this.f180111a;
    }

    @Override // vt1.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF180089b() {
        return this.f180112b;
    }

    @Override // vt1.f
    public final String c(Context context) {
        context.getClass();
        String string = context.getString(this.f180111a);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/g$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
