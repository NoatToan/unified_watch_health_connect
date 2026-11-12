package com.garmin.android.apps.connectmobile.leaderboard.model;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.leaderboard.model.v[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.leaderboard.model.v[]) from 0x004d: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.leaderboard.model.v[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/v;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;II)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {
    READY(0),
    STARTED(1),
    STOPPED(2),
    LOCKED(3),
    COMPLETED(4),
    /* JADX INFO: Fake field, exist only in values array */
    FULL(5),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38356b = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f38364j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38365a;

    static {
        f38364j = new w13.c(new v[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private v(int i14) {
        super(str, i);
        this.f38365a = i14;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f38363i.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/v$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a(Integer num) {
            if (num == null) {
                return v.UNKNOWN;
            }
            w13.c cVar = v.f38364j;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                v vVar = (v) bVarN.next();
                if (vVar.f38365a == num.intValue()) {
                    return vVar;
                }
            }
            return v.UNKNOWN;
        }

        private a() {
        }
    }
}
