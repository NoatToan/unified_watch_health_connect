package yr0;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yr0.m[], still in use, count: 1, list:
  (r0v1 yr0.m[]) from 0x0061: CONSTRUCTOR (r0v1 yr0.m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyr0/m;", "", "", "", Action.KEY_ATTRIBUTE, "", "toolTipPriorityOrder", "<init>", "(Ljava/lang/String;ILjava/util/List;I)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    SLEEP(x.k("SLEEP", "LHA_JET_LAG_RECOMMENDATION_TYPE_SLEEP", "LHA_JET_LAG_NOTIFICATION_TYPE_SLEEP"), 4),
    LIGHT_AVOIDANCE(x.k("LIGHT_AVOIDANCE", "LHA_JET_LAG_RECOMMENDATION_TYPE_LIGHT_AVOID", "LHA_JET_LAG_NOTIFICATION_TYPE_LIGHT_AVOID"), 2),
    LIGHT_EXPOSURE(x.k("LIGHT_EXPOSURE", "LHA_JET_LAG_RECOMMENDATION_TYPE_LIGHT_EXPOSE", "LHA_JET_LAG_NOTIFICATION_TYPE_LIGHT_EXPOSE"), 1),
    ACTIVITY(x.k("ACTIVITY", "LHA_JET_LAG_RECOMMENDATION_TYPE_ACTIVITIES", "LHA_JET_LAG_NOTIFICATION_TYPE_ACTIVITIES"), 3);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f199030h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f199031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f199032b;

    static {
        f199030h = new w13.c(mVarArr);
    }

    private m(List list, int i14) {
        super(str, i);
        this.f199031a = list;
        this.f199032b = i14;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f199029g.clone();
    }
}
