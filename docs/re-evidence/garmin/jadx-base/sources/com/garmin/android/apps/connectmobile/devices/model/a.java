package com.garmin.android.apps.connectmobile.devices.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.a[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.devices.model.a[]) from 0x007e: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/a;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    MONDAY("M", R.string.lbl_day_of_week_monday),
    TUESDAY("Tu", R.string.lbl_day_of_week_tuesday),
    WEDNESDAY("W", R.string.lbl_day_of_week_wednesday),
    THURSDAY("Th", R.string.lbl_day_of_week_thursday),
    FRIDAY("F", R.string.lbl_day_of_week_friday),
    SATURDAY("Sa", R.string.lbl_day_of_week_saturday),
    SUNDAY("Su", R.string.lbl_day_of_week_sunday),
    ONCE("ONCE", R.string.frequency_once);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0576a f34075c = new C0576a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f34085m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34087b;

    static {
        f34085m = new w13.c(new a[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private a(String str, int i14) {
        super(str, i);
        this.f34086a = str;
        this.f34087b = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f34084l.clone();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/a$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0576a {
        public /* synthetic */ C0576a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(String str) {
            if (str != null) {
                w13.c cVar = a.f34085m;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    a aVar = (a) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(aVar.f34086a, str)) {
                        return aVar;
                    }
                }
            }
            return a.ONCE;
        }

        private C0576a() {
        }
    }
}
