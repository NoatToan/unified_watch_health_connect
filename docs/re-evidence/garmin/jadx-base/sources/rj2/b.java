package rj2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lrj2/b;", "", "Landroid/content/Context;", "ctx", "Landroid/bluetooth/BluetoothDevice;", "device", "Lorg/slf4j/Logger;", "logger", "", "logWarnIfPermissionsNotSatisfied", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lorg/slf4j/Logger;Z)V", "a", "ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f153011f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BluetoothDevice f153013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f153014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f153015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f153016e;

    /* JADX INFO: renamed from: rj2.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C2895b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153020a;

        static {
            int[] iArr = new int[a.EnumC2894a.values().length];
            try {
                iArr[a.EnumC2894a.GET_BOND_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC2894a.SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f153020a = iArr;
        }
    }

    static {
        new a(null);
        f153011f = u0.e(new p(21, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN"})), new p(22, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN"})), new p(23, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(24, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(25, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(26, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(27, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(28, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "LOCATION_COARSE_OR_FINE"})), new p(29, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_FINE_LOCATION"})), new p(30, new p(new String[]{"android.permission.BLUETOOTH"}, new String[]{"android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_FINE_LOCATION"})), new p(31, new p(new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_SCAN"})));
    }

    public b(Context context, BluetoothDevice bluetoothDevice, Logger logger, boolean z14) {
        context.getClass();
        this.f153012a = context;
        this.f153013b = bluetoothDevice;
        this.f153014c = logger;
        this.f153015d = z14;
    }

    public final boolean a(a.EnumC2894a enumC2894a, String[] strArr) {
        boolean zB;
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                return true;
            }
            String str = strArr[i14];
            boolean zG = s.g(str, "LOCATION_COARSE_OR_FINE");
            Context context = this.f153012a;
            if (zG) {
                if (a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || a7.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    zB = b();
                } else {
                    c("not granted, at least one of [android.permission.ACCESS_COARSE_LOCATION], [android.permission.ACCESS_FINE_LOCATION]");
                    zB = false;
                }
            } else {
                if (s.g(str, "android.permission.ACCESS_FINE_LOCATION")) {
                    if (a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        return b();
                    }
                    c("not granted [" + str + "] to perform " + enumC2894a);
                    return false;
                }
                zB = a7.b.checkSelfPermission(context, str) == 0;
                if (!zB) {
                    c("not granted [" + str + "] to perform " + enumC2894a);
                }
            }
            if (!zB) {
                return false;
            }
            i14++;
        }
    }

    @SuppressLint({Action.SCOPE_ATTRIBUTE})
    public final boolean b() {
        boolean z14 = false;
        try {
            if (Settings.Secure.getInt(this.f153012a.getContentResolver(), "location_mode") != 0) {
                z14 = true;
            }
        } catch (Settings.SettingNotFoundException e4) {
            Logger logger = this.f153014c;
            if (logger != null) {
                logger.error("isLocationModeOn", (Throwable) e4);
            } else {
                e4.printStackTrace();
            }
        }
        if (!z14) {
            c("location not enabled");
        }
        return z14;
    }

    public final void c(String str) {
        Logger logger;
        if (!this.f153015d || (logger = this.f153014c) == null) {
            return;
        }
        logger.warn(this.f153016e + ": Android API " + Build.VERSION.SDK_INT + ", " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final boolean d(a.EnumC2894a enumC2894a) {
        int i14 = C2895b.f153020a[enumC2894a.ordinal()];
        ?? r14 = f153011f;
        if (i14 == 1) {
            p pVar = (p) r14.get(Integer.valueOf(Build.VERSION.SDK_INT));
            if (pVar == null) {
                pVar = (p) ((Map.Entry) h0.l0(r14.entrySet())).getValue();
            }
            return a(enumC2894a, (String[]) pVar.f128594a);
        }
        if (i14 != 2) {
            lc.u0.r();
            return false;
        }
        p pVar2 = (p) r14.get(Integer.valueOf(Build.VERSION.SDK_INT));
        if (pVar2 == null) {
            pVar2 = (p) ((Map.Entry) h0.l0(r14.entrySet())).getValue();
        }
        return a(enumC2894a, (String[]) pVar2.f128595b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lrj2/b$a;", "", "<init>", "()V", "", "LOCATION_COARSE_OR_FINE", "Ljava/lang/String;", "a", "ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: rj2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrj2/b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC2894a {
            GET_BOND_STATE,
            SCAN
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(Context context, BluetoothDevice bluetoothDevice, Logger logger, boolean z14, int i14, j jVar) {
        this(context, bluetoothDevice, logger, (i14 & 8) != 0 ? true : z14);
    }
}
