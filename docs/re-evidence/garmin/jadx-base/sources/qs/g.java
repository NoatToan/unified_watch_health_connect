package qs;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qs.g[], still in use, count: 1, list:
  (r0v1 qs.g[]) from 0x00ba: CONSTRUCTOR (r0v1 qs.g[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lqs/g;", "", "", "typeId", "sortOrder", "", "eventKey", "displayLabelRes", "<init>", "(Ljava/lang/String;IIILjava/lang/String;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {
    UNCATEGORIZED(9, 10, "uncategorized", R.string.lbl_uncategorized_event_type),
    FITNESS(8, 3, "fitness", R.string.lbl_fitness),
    GEOCAHING(7, 2, "geocaching", R.string.lbl_geocaching),
    RACE(1, 5, "race", R.string.lbl_race),
    RECREATION(2, 4, "recreation", R.string.lbl_recreation),
    SPECIAL_EVENT(3, 6, "specialEvent", R.string.lbl_special_event),
    TOURING(6, 9, "touring", R.string.lbl_touring),
    TRAINING(4, 7, "training", R.string.lbl_training),
    TRANSPORTATION(5, 8, "transportation", R.string.lbl_transportation),
    GROUP_RIDE(10, 11, "groupride", R.string.lbl_group_ride);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f147071e = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w13.c f147083q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f147087d;

    static {
        f147083q = new w13.c(new g[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    private g(int i14, int i15, String str, int i16) {
        super(str, i);
        this.f147084a = i14;
        this.f147085b = i15;
        this.f147086c = str;
        this.f147087d = i16;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f147082p.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF147084a() {
        return this.f147084a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqs/g$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static g a(String str) {
            w13.c cVar = g.f147083q;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                g gVar = (g) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(gVar.f147086c, str)) {
                    return gVar;
                }
            }
            return g.UNCATEGORIZED;
        }

        private a() {
        }
    }
}
