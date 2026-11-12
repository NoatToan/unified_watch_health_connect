package com.garmin.android.apps.connectmobile.devices.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.devices.model.c[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.devices.model.c[]) from 0x003a: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.devices.model.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/c;", "", "", Action.KEY_ATTRIBUTE, "", "displayResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    OFF("OFF", R.string.lbl_off),
    DAILY("DAILY", R.string.frequency_every_day),
    /* JADX INFO: Fake field, exist only in values array */
    WEEKDAYS("WEEKDAYS", R.string.frequency_weekdays),
    ON("ON", R.string.lbl_on);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34112c = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f34117h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34119b;

    static {
        f34117h = new w13.c(new c[]{r0, r1, r2, r3});
    }

    private c(String str, int i14) {
        super(str, i);
        this.f34118a = str;
        this.f34119b = i14;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f34116g.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/c$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(String str) {
            if (str != null) {
                w13.c cVar = c.f34117h;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    c cVar2 = (c) bVarN.next();
                    if (p005kotlin.jvm.internal.s.g(cVar2.f34118a, str)) {
                        return cVar2;
                    }
                }
            }
            return c.DAILY;
        }

        private a() {
        }
    }
}
