package ag2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v62.j1;
import v62.o4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 ag2.e[], still in use, count: 1, list:
  (r0v4 ag2.e[]) from 0x00e8: CONSTRUCTOR (r0v4 ag2.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lag2/e;", "", "", Action.KEY_ATTRIBUTE, "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {
    LAP("lap", R.string.lbl_lap),
    NEXT("next", R.string.lbl_next),
    MARK_ROUND("markRound", R.string.lbl_mark_round),
    NEXT_POSE("nextPose", R.string.lbl_next_pose),
    NEXT_MOVE("nextMove", R.string.lbl_next_move),
    NEXT_MOVE_ROUND("nextMoveRound", R.string.workout_next_move_round),
    NEXT_SET("nextSet", R.string.lbl_next_set),
    NEXT_PHASE("nextPhase", R.string.mct_next_phase),
    NEXT_MATCH("nextMatch", R.string.lbl_next_match),
    REST("rest", R.string.workout_step_type_rest),
    START_RECORDING("start_recording", R.string.lbl_start_recording),
    STOP_RECORDING("stop", R.string.lbl_stop),
    START(TtmlNode.START, R.string.lbl_start),
    END(TtmlNode.END, R.string.lbl_end);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3224c = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w13.c f3240t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3242b;

    static {
        f3240t = new w13.c(new e[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
    }

    private e(String str, int i14) {
        super(str, i);
        this.f3241a = str;
        this.f3242b = i14;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3239r.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lag2/e$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: ag2.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0055a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3243a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.LAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.NEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.MARK_ROUND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.NEXT_POSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.NEXT_MOVE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[e.NEXT_MOVE_ROUND.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[e.NEXT_SET.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[e.NEXT_PHASE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[e.NEXT_MATCH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[e.REST.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[e.START_RECORDING.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[e.STOP_RECORDING.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[e.START.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[e.END.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                f3243a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static e a(String str) {
            Object next;
            w13.c cVar = e.f3240t;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (s.g(((e) next).f3241a, str)) {
                    return (e) next;
                }
            }
            next = null;
            return (e) next;
        }

        public static u4.d b(e eVar) {
            eVar.getClass();
            switch (C0055a.f3243a[eVar.ordinal()]) {
                case 1:
                    return o4.a(t62.b.f162798a);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return j1.a(t62.b.f162798a);
                case 11:
                case 12:
                case 13:
                case 14:
                    return null;
                default:
                    u0.r();
                    return null;
            }
        }

        private a() {
        }
    }
}
