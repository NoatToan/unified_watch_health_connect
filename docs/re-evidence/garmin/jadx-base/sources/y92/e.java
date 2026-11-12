package y92;

import com.garmin.proto.generated.GDIDeviceStatus;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y92.e[], still in use, count: 1, list:
  (r0v1 y92.e[]) from 0x0020: CONSTRUCTOR (r0v1 y92.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ly92/e;", "", "Lcom/garmin/proto/generated/GDIDeviceStatus$AppInitiatedPasscodeSetNotification$Source;", "source", "<init>", "(Ljava/lang/String;ILcom/garmin/proto/generated/GDIDeviceStatus$AppInitiatedPasscodeSetNotification$Source;)V", "a", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {
    DEVICE_SETTINGS(GDIDeviceStatus.AppInitiatedPasscodeSetNotification.Source.DEVICE_SETTINGS),
    GARMIN_PAY(GDIDeviceStatus.AppInitiatedPasscodeSetNotification.Source.GARMIN_PAY);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f195299b = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f195303f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GDIDeviceStatus.AppInitiatedPasscodeSetNotification.Source f195304a;

    static {
        f195303f = new w13.c(new e[]{r0, r1});
    }

    private e(GDIDeviceStatus.AppInitiatedPasscodeSetNotification.Source source) {
        super(str, i);
        this.f195304a = source;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f195302e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly92/e$a;", "", "<init>", "()V", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
