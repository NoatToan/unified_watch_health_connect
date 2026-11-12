package com.huami.hid.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Build;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J(\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010 \u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u001c0\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/huami/hid/bluetooth/BluetoothUtil;", "", "", "profileName", "", "c", "classPath", "Landroid/bluetooth/BluetoothProfile;", "proxy", "Landroid/bluetooth/BluetoothDevice;", "device", "", "a", "b", "methodName", GoogleApiAvailabilityLight.a, TakePicSettingActivity.KEY_ADDRESS, "isDeviceBonded$hid_release", "(Ljava/lang/String;)Z", "isDeviceBonded", "inWrongConnectionState$hid_release", "()Z", "inWrongConnectionState", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "action", "getProfileProxy$hid_release", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getProfileProxy", "removeBondedService$hid_release", "(Landroid/bluetooth/BluetoothDevice;)Z", "removeBondedService", "connectHidDevice$hid_release", "(Landroid/bluetooth/BluetoothProfile;Landroid/bluetooth/BluetoothDevice;)V", "connectHidDevice", "disconnectHidDevice$hid_release", "disconnectHidDevice", "TAG", "Ljava/lang/String;", "PATH_BLUETOOTH_HID_HOST", "PATH_BLUETOOTH_INPUT_DEVICE", "PROFILE_INPUT_DEVICE", "PROFILE_HID_HOST", "e", "f", "profileProxyPath", "g", LogUtil.I, "targetProfile", "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothUtil {

    @NotNull
    public static final BluetoothUtil INSTANCE = new BluetoothUtil();

    @NotNull
    public static final String TAG = "BluetoothUtil";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PATH_BLUETOOTH_HID_HOST = "android.bluetooth.BluetoothHidHost";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PATH_BLUETOOTH_INPUT_DEVICE = "android.bluetooth.BluetoothInputDevice";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PROFILE_INPUT_DEVICE = "INPUT_DEVICE";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PROFILE_HID_HOST = "HID_HOST";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String profileName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String profileProxyPath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int targetProfile = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("profileName: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Field a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Field field) {
            super(0);
            this.a = field;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("BluetoothProfile name: ", this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getLocalizedMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("profile connection state :", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("invokeBluetoothProfileProxyMethod: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ReflectiveOperationException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ReflectiveOperationException reflectiveOperationException) {
            super(0);
            this.a = reflectiveOperationException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unPair device exception: ", this.a);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        profileName = i >= 28 ? PROFILE_HID_HOST : PROFILE_INPUT_DEVICE;
        profileProxyPath = i >= 28 ? PATH_BLUETOOTH_HID_HOST : PATH_BLUETOOTH_INPUT_DEVICE;
    }

    private BluetoothUtil() {
    }

    private final boolean a(String classPath, BluetoothProfile proxy, BluetoothDevice device) {
        return d(classPath, proxy, device, WifiSetActivity.KEY_CONNECT);
    }

    private final boolean b(String classPath, BluetoothProfile proxy, BluetoothDevice device) {
        return d(classPath, proxy, device, ConstantKt.CONNECT_FAIL_REASON_DISCONNECT);
    }

    private final int c(String profileName2) {
        HMLog.info(TAG, new a(profileName2));
        for (Field field : BluetoothProfile.class.getDeclaredFields()) {
            HMLog.info(TAG, new b(field));
            try {
                if (Intrinsics.areEqual(field.getName(), profileName2)) {
                    return field.getInt(null);
                }
                continue;
            } catch (Exception e2) {
                HMLog.info(TAG, new c(e2));
            }
        }
        return -1;
    }

    private final boolean d(String classPath, BluetoothProfile proxy, BluetoothDevice device, String methodName) {
        try {
            Method declaredMethod = Class.forName(classPath).getDeclaredMethod(methodName, BluetoothDevice.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(proxy, device);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e2) {
            HMLog.info(TAG, new e(e2));
            return false;
        }
    }

    public final void connectHidDevice$hid_release(@NotNull BluetoothProfile proxy, @NotNull BluetoothDevice device) {
        a(profileProxyPath, proxy, device);
    }

    public final void disconnectHidDevice$hid_release(@NotNull BluetoothProfile proxy, @NotNull BluetoothDevice device) {
        b(profileProxyPath, proxy, device);
    }

    public final void getProfileProxy$hid_release(@NotNull Context context, @NotNull final Function1<? super BluetoothProfile, Unit> action) {
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(context.getApplicationContext(), new BluetoothProfile.ServiceListener() { // from class: com.huami.hid.bluetooth.BluetoothUtil$getProfileProxy$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onServiceConnected";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Service is connected, but proxy is null.";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public static final c a = new c();

                public c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Service is disconnected.";
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int profile, @Nullable BluetoothProfile proxy) {
                if (proxy == null) {
                    proxy = null;
                } else {
                    Function1<BluetoothProfile, Unit> function1 = action;
                    HMLog.info(BluetoothUtil.TAG, a.a);
                    function1.invoke(proxy);
                }
                if (proxy == null) {
                    HMLog.info(BluetoothUtil.TAG, b.a);
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int profile) {
                HMLog.info(BluetoothUtil.TAG, c.a);
            }
        }, 4);
    }

    public final boolean inWrongConnectionState$hid_release() {
        int profileConnectionState = BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(4);
        HMLog.info(TAG, new d(profileConnectionState));
        return (profileConnectionState == 1) | (profileConnectionState == 3);
    }

    public final boolean isDeviceBonded$hid_release(@NotNull String macAddress) {
        Iterator<BluetoothDevice> it2 = BluetoothAdapter.getDefaultAdapter().getBondedDevices().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(it2.next().getAddress(), macAddress)) {
                return true;
            }
        }
        return false;
    }

    public final boolean removeBondedService$hid_release(@NotNull BluetoothDevice device) {
        try {
            Object objInvoke = device.getClass().getMethod("removeBond", new Class[0]).invoke(device, new Object[0]);
            if (objInvoke != null) {
                return ((Boolean) objInvoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (ReflectiveOperationException e2) {
            HMLog.info(TAG, new f(e2));
            return false;
        }
    }
}
