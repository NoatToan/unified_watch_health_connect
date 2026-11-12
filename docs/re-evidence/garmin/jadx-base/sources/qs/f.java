package qs;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.f[], still in use, count: 1, list:
  (r0v1 qs.f[]) from 0x005b: CONSTRUCTOR (r0v1 qs.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqs/f;", "", "", TtmlNode.ATTR_ID, "resId", "", "isSupportedInWorkout", "<init>", "(Ljava/lang/String;IIIZ)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    NONE(0, R.string.no_value, false, 4, null),
    KICK(1, R.string.pregnancy_kick, false, 4, null),
    PULL(2, R.string.lbl_workout_drill_type_pull, false, 4, null),
    DRILL(3, R.string.activity_details_swim_stroke_drill, false, 4, null),
    NULL(-1, R.string.gcm_prev_distance_placeholder, false);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f147060d = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147067k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147070c;

    static {
        f147067k = new w13.c(new f[]{r0, r1, r2, r3, r4});
    }

    public /* synthetic */ f(int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? true : z14);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f147066j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/f$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(int i14) {
            w13.c cVar = f.f147067k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                f fVar = (f) bVarN.next();
                if (fVar.f147068a == i14) {
                    return fVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private f(int i14, int i15, boolean z14) {
        super(str, i);
        this.f147068a = i14;
        this.f147069b = i15;
        this.f147070c = z14;
    }
}
