package us1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 us1.m[], still in use, count: 1, list:
  (r0v1 us1.m[]) from 0x0029: CONSTRUCTOR (r0v1 us1.m[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lus1/m;", "", "", Action.KEY_ATTRIBUTE, "", "labelStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {
    /* JADX INFO: Fake field, exist only in values array */
    LOOP("LOOP", R.string.trail_type_loop),
    /* JADX INFO: Fake field, exist only in values array */
    OUT_AND_BACK("OUT_AND_BACK", R.string.trail_type_out_and_back),
    /* JADX INFO: Fake field, exist only in values array */
    POINT_TO_POINT("POINT_TO_POINT", R.string.trail_type_point_to_point);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f172438c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172440e = new w13.c(new m[]{new m("LOOP", R.string.trail_type_loop), new m("OUT_AND_BACK", R.string.trail_type_out_and_back), new m("POINT_TO_POINT", R.string.trail_type_point_to_point)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f172442b;

    static {
    }

    private m(String str, int i14) {
        super(str, i);
        this.f172441a = str;
        this.f172442b = i14;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f172439d.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus1/m$a;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(String str) {
            Object next;
            w13.c cVar = m.f172440e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((m) next).f172441a, str)) {
                    return (m) next;
                }
            }
            next = null;
            return (m) next;
        }

        private a() {
        }
    }
}
