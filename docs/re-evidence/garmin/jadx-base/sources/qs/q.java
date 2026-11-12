package qs;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.q[], still in use, count: 1, list:
  (r0v1 qs.q[]) from 0x008f: CONSTRUCTOR (r0v1 qs.q[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB5\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqs/q;", "", "", Action.KEY_ATTRIBUTE, "", "colorLabelRes", "colorRes", "iconRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/Integer;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {
    /* JADX INFO: Fake field, exist only in values array */
    GREEN("GREEN", R.string.lbl_green_color, R.color.gds_data_viz_green_primary, Integer.valueOf(R.drawable.ski_difficulty_green)),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE("BLUE", R.string.lbl_blue_color, R.color.gds_data_viz_blue_primary, Integer.valueOf(R.drawable.ski_difficulty_blue)),
    /* JADX INFO: Fake field, exist only in values array */
    RED("RED", R.string.lbl_red_color, R.color.gds_data_viz_red_primary, Integer.valueOf(R.drawable.ski_difficulty_red)),
    /* JADX INFO: Fake field, exist only in values array */
    BLACK("BLACK", R.string.lbl_black_color, R.color.gds_data_viz_neutral_secondary, Integer.valueOf(R.drawable.ski_difficulty_black)),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_BLACK("DOUBLE_BLACK", R.string.ski_difficulty_level_double_black, R.color.gds_data_viz_neutral_primary, Integer.valueOf(R.drawable.ski_difficulty_double_black)),
    /* JADX INFO: Fake field, exist only in values array */
    UNCATEGORIZED("", R.string.lbl_uncategorized, R.color.gray_40_static, null, 8, null);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f147145e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147147g = new w13.c(new q[]{new q("GREEN", R.string.lbl_green_color, R.color.gds_data_viz_green_primary, Integer.valueOf(R.drawable.ski_difficulty_green)), new q("BLUE", R.string.lbl_blue_color, R.color.gds_data_viz_blue_primary, Integer.valueOf(R.drawable.ski_difficulty_blue)), new q("RED", R.string.lbl_red_color, R.color.gds_data_viz_red_primary, Integer.valueOf(R.drawable.ski_difficulty_red)), new q("BLACK", R.string.lbl_black_color, R.color.gds_data_viz_neutral_secondary, Integer.valueOf(R.drawable.ski_difficulty_black)), new q("DOUBLE_BLACK", R.string.ski_difficulty_level_double_black, R.color.gds_data_viz_neutral_primary, Integer.valueOf(R.drawable.ski_difficulty_double_black)), new q("", R.string.lbl_uncategorized, R.color.gray_40_static, null, 8, null)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f147151d;

    static {
    }

    public /* synthetic */ q(String str, int i14, int i15, Integer num, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : str, i14, i15, (i16 & 8) != 0 ? null : num);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f147146f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/q$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q a(String str) {
            Object next;
            w13.c cVar = q.f147147g;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (p005kotlin.jvm.internal.s.g(((q) next).f147148a, str)) {
                    return (q) next;
                }
            }
            next = null;
            return (q) next;
        }

        private a() {
        }
    }

    private q(String str, int i14, int i15, Integer num) {
        super(str, i);
        this.f147148a = str;
        this.f147149b = i14;
        this.f147150c = i15;
        this.f147151d = num;
    }
}
