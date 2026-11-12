package mv;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import yl2.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmv/a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f121121a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f121122b;

    /* JADX INFO: renamed from: mv.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2295a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121123a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Z5.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f197662a6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121123a = iArr;
        }
    }

    private a() {
    }

    public static void a() {
        a2 a2Var = a2.DEVICES;
        String strM = j.m(".endDeviceSetup() -> Resetting sync upload block device macAddress[", f121122b, "]");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "DeviceSyncUploadBlocker", strM);
        f121122b = null;
    }
}
