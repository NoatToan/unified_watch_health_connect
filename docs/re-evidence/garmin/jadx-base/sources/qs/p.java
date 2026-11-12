package qs;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.p[], still in use, count: 1, list:
  (r0v1 qs.p[]) from 0x0043: CONSTRUCTOR (r0v1 qs.p[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lqs/p;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "polylineColor", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {
    ASCENT("ASCENT_SPLIT", R.color.gcm_polyline_activity_lap_ascent),
    DESCENT("DESCENT_SPLIT", R.color.gcm_polyline_activity_lap_descent),
    TRANSITION("TRANSITION", R.color.gray_30_static),
    /* JADX INFO: Fake field, exist only in values array */
    CLIMB_ACTIVE("CLIMB_ACTIVE", 0),
    /* JADX INFO: Fake field, exist only in values array */
    CLIMB_REST("CLIMB_REST", 0);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147142g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147144b;

    static {
        f147142g = new w13.c(pVarArr);
        new a(null);
    }

    private p(String str, int i14) {
        super(str, i);
        this.f147143a = str;
        this.f147144b = i14;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f147141f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/p$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
