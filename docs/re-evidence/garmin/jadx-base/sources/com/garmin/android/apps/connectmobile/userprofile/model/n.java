package com.garmin.android.apps.connectmobile.userprofile.model;

import com.garmin.android.gncs.NotificationConstants;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.userprofile.model.n[], still in use, count: 1, list:
  (r0v1 com.garmin.android.apps.connectmobile.userprofile.model.n[]) from 0x0034: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.userprofile.model.n[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/n;", "", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements Comparable<n> {
    PRIVATE("private"),
    CONNECTION("following"),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_AND_CONNECTION("groups"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC("public");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46925b = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f46929f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46930a;

    static {
        f46929f = new w13.c(new n[]{r0, r1, new n("groups"), new n("public")});
    }

    private n(String str) {
        super(str, i);
        this.f46930a = str;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f46928e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/n$a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static n a(String str) {
            if (StringUtils.isNotEmpty(str)) {
                w13.c cVar = n.f46929f;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    n nVar = (n) bVarN.next();
                    if (StringUtils.equalsIgnoreCase(nVar.f46930a, str)) {
                        return nVar;
                    }
                }
            }
            return n.PRIVATE;
        }

        private a() {
        }
    }
}
