package vt1;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vt1.h[], still in use, count: 1, list:
  (r0v1 vt1.h[]) from 0x005b: CONSTRUCTOR (r0v1 vt1.h[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lvt1/h;", "", "", "displayOrder", "displayResId", "metaResId", "", "jsonKey", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {
    FULL_GYM(1, R.string.full_gym_and_body_weight, Integer.valueOf(R.string.requires_access_to_barbells_or_dumbbells), "STRENGTH_TRAINING_GYM"),
    DUMBBELLS(2, R.string.dumbbells_and_bodyweight, Integer.valueOf(R.string.requires_access_to_dumbbells), "STRENGTH_TRAINING_DUMBBELLS_ONLY"),
    BODYWEIGHT(3, R.string.body_weight_only, Integer.valueOf(R.string.no_additional_weights_required), "STRENGTH_TRAINING_BODYWEIGHT"),
    NONE(4, R.string.no_strength_workouts, null, "NONE");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f180113e = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180119k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f180121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f180122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f180123d;

    static {
        f180119k = new w13.c(new h[]{r0, r1, r2, r3});
    }

    private h(int i14, int i15, Integer num, String str) {
        super(str, i);
        this.f180120a = i14;
        this.f180121b = i15;
        this.f180122c = num;
        this.f180123d = str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f180118j.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvt1/h$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(String str) {
            Object next;
            w13.c cVar = h.f180119k;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((h) next).f180123d, str));
            h hVar = (h) next;
            return hVar == null ? h.NONE : hVar;
        }

        public static List b(boolean z14) {
            if (z14) {
                return h.f180119k;
            }
            w13.c cVar = h.f180119k;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((h) next) != h.DUMBBELLS) {
                    arrayListK.add(next);
                }
            }
            return arrayListK;
        }

        private a() {
        }
    }
}
