package cq0;

import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cq0.f[], still in use, count: 1, list:
  (r0v1 cq0.f[]) from 0x0058: CONSTRUCTOR (r0v1 cq0.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq0/f;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    NONE,
    FROM_GCM_CANCELLED_TIMER_NO_CONTACTS_NOTIFIED,
    FROM_GCM_UNABLE_TO_NOTIFY_EMERGENCY_CONTACTS,
    FROM_GCM_I_AM_OKAY,
    FROM_GCM_I_AM_OKAY_TIMER_EXPIRED,
    FROM_DEVICE_CANCELLED_COUNTDOWN_TIMER_NO_CONTACTS_NOTIFIED,
    FROM_DEVICE_I_AM_OKAY,
    FROM_DEVICE_FINISH_UNKNOWN_COMMUNICATION;


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w13.c f55138j;

    static {
        f55138j = new w13.c(fVarArr);
    }

    private f() {
        super(str, i);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f55137i.clone();
    }
}
