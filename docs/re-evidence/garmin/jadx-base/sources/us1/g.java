package us1;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 us1.g[], still in use, count: 1, list:
  (r0v1 us1.g[]) from 0x008a: CONSTRUCTOR (r0v1 us1.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lus1/g;", "", "", Action.KEY_ATTRIBUTE, "", "labelStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    /* JADX INFO: Fake field, exist only in values array */
    TEMPORARY_CLOSURE("TEMPORARY_CLOSURE", R.string.trail_condition_temporary_closure),
    /* JADX INFO: Fake field, exist only in values array */
    TRAIL_DAMAGE("TRAIL_DAMAGE", R.string.trail_condition_trail_damage),
    /* JADX INFO: Fake field, exist only in values array */
    WET("WET", R.string.trail_condition_wet),
    MUDDY("MUDDY", R.string.trail_condition_muddy),
    ICE_AND_SNOW("ICE_AND_SNOW", R.string.trail_condition_ice_and_snow),
    /* JADX INFO: Fake field, exist only in values array */
    FLOODED_SECTIONS("FLOODED_SECTIONS", R.string.trail_condition_flooded_sections),
    BUGS("BUGS", R.string.trail_condition_bugs),
    /* JADX INFO: Fake field, exist only in values array */
    DUSTY("DUSTY", R.string.trail_condition_dusty),
    /* JADX INFO: Fake field, exist only in values array */
    SANDY("SANDY", R.string.trail_condition_sandy),
    /* JADX INFO: Fake field, exist only in values array */
    OVERGROWN("OVERGROWN", R.string.trail_condition_overgrown),
    /* JADX INFO: Fake field, exist only in values array */
    CROWDED("CROWDED", R.string.trail_condition_crowded);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f172395c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172400h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172402b;

    static {
        f172400h = new w13.c(new g[]{r0, r1, r2, r3, r4, r5, r6, new g("DUSTY", R.string.trail_condition_dusty), new g("SANDY", R.string.trail_condition_sandy), new g("OVERGROWN", R.string.trail_condition_overgrown), new g("CROWDED", R.string.trail_condition_crowded)});
    }

    private g(String str, int i14) {
        super(str, i);
        this.f172401a = str;
        this.f172402b = i14;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f172399g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/g$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(Context context, String str) {
            context.getClass();
            str.getClass();
            for (g gVar : g.values()) {
                if (s.g(context.getString(gVar.f172402b), str)) {
                    return gVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
