package com.huami.hid.takepic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hid.HidSdk;
import com.huami.hid.bluetooth.BluetoothUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0004H\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010$R+\u0010,\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010-¨\u0006/"}, d2 = {"Lcom/huami/hid/takepic/DeviceConnectionHelper;", "", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "a", "", TakePicSettingActivity.KEY_ADDRESS, "Landroid/bluetooth/BluetoothProfile;", "bluetoothProfile", "", "e", "f", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "c", "b", "Lcom/huami/hid/takepic/BluetoothServiceListener;", "callback", "initProfile$hid_release", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/hid/takepic/BluetoothServiceListener;)V", "initProfile", "isDevicePairedAndConnected$hid_release", "(Ljava/lang/String;)Z", "isDevicePairedAndConnected", "createBond$hid_release", "(Landroid/content/Context;Ljava/lang/String;)V", "createBond", "connectHid$hid_release", "connectHid", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "unPairDevice$hid_release", "unPairDevice", "disconnect$hid_release", "()V", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "Ljava/lang/String;", "TAG", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", GoogleApiAvailabilityLight.a, "()Landroid/bluetooth/BluetoothDevice;", "g", "(Landroid/bluetooth/BluetoothDevice;)V", "remoteDevice", "Landroid/bluetooth/BluetoothProfile;", "<init>", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceConnectionHelper {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "BluetoothUtil";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static BluetoothProfile bluetoothProfile;
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceConnectionHelper.class, "remoteDevice", "getRemoteDevice()Landroid/bluetooth/BluetoothDevice;", 0))};

    @NotNull
    public static final DeviceConnectionHelper INSTANCE = new DeviceConnectionHelper();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty remoteDevice = Delegates.INSTANCE.notNull();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bluetoothProfile is null";
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
            return Intrinsics.stringPlus("connectHid bluetoothProfile ", DeviceConnectionHelper.bluetoothProfile);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothProfile;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<BluetoothProfile, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull BluetoothProfile bluetoothProfile) {
            DeviceConnectionHelper deviceConnectionHelper = DeviceConnectionHelper.INSTANCE;
            DeviceConnectionHelper.bluetoothProfile = bluetoothProfile;
            BluetoothUtil.INSTANCE.connectHidDevice$hid_release(bluetoothProfile, deviceConnectionHelper.d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BluetoothProfile bluetoothProfile) {
            a(bluetoothProfile);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bluetoothProfile is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "already connected. something is wrong.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isMIUIBased11 already bonded";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isMIUIBased11 ready to create bond";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "already bonded";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ready to create bond";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "already connected. something is wrong.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bluetoothProfile is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ BluetoothDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(BluetoothDevice bluetoothDevice) {
            super(0);
            this.a = bluetoothDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("hit device: ", this.a.getAddress());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Exception exc) {
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
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            try {
                return Intrinsics.stringPlus("disconnect hid, address is ", this.a);
            } catch (Exception e) {
                return Intrinsics.stringPlus("disconnect hid exception: ", e.getLocalizedMessage());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothProfile;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<BluetoothProfile, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull BluetoothProfile bluetoothProfile) {
            DeviceConnectionHelper.INSTANCE.b(bluetoothProfile, this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BluetoothProfile bluetoothProfile) {
            a(bluetoothProfile);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothProfile;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function1<BluetoothProfile, Unit> {
        public final /* synthetic */ BluetoothServiceListener a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(BluetoothServiceListener bluetoothServiceListener) {
            super(1);
            this.a = bluetoothServiceListener;
        }

        public final void a(@NotNull BluetoothProfile bluetoothProfile) {
            DeviceConnectionHelper deviceConnectionHelper = DeviceConnectionHelper.INSTANCE;
            DeviceConnectionHelper.bluetoothProfile = bluetoothProfile;
            this.a.connected();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BluetoothProfile bluetoothProfile) {
            a(bluetoothProfile);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Exception exc) {
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
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bonded: " + this.a + " connected " + this.b;
        }
    }

    private DeviceConnectionHelper() {
    }

    private final void a(BluetoothDevice bluetoothDevice) {
        Unit unit;
        BluetoothUtil bluetoothUtil = BluetoothUtil.INSTANCE;
        if (bluetoothUtil.inWrongConnectionState$hid_release()) {
            BluetoothProfile bluetoothProfile2 = bluetoothProfile;
            if (bluetoothProfile2 == null) {
                unit = null;
            } else {
                bluetoothUtil.disconnectHidDevice$hid_release(bluetoothProfile2, bluetoothDevice);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                HMLog.error$default("BluetoothUtil", null, null, a.a, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(BluetoothProfile bluetoothProfile2, String macAddress) {
        if (bluetoothProfile2 == null) {
            return;
        }
        try {
            List<BluetoothDevice> connectedDevices = bluetoothProfile2.getConnectedDevices();
            if (connectedDevices == null) {
                return;
            }
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                if (Intrinsics.areEqual(bluetoothDevice.getAddress(), macAddress)) {
                    HMLog.info("BluetoothUtil", new l(bluetoothDevice));
                    BluetoothUtil.INSTANCE.disconnectHidDevice$hid_release(bluetoothProfile2, bluetoothDevice);
                }
            }
        } catch (Exception e2) {
            HMLog.error$default(null, null, null, new m(e2), 7, null);
        }
    }

    private final void c(Context context, String macAddress) {
        HMLog.info("BluetoothUtil", new n(macAddress));
        BluetoothProfile bluetoothProfile2 = bluetoothProfile;
        if (bluetoothProfile2 == null) {
            BluetoothUtil.INSTANCE.getProfileProxy$hid_release(context, new o(macAddress));
        } else {
            b(bluetoothProfile2, macAddress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothDevice d() {
        return (BluetoothDevice) remoteDevice.getValue(this, a[0]);
    }

    private final boolean e(String macAddress, BluetoothProfile bluetoothProfile2) {
        if (bluetoothProfile2 == null) {
            return false;
        }
        try {
            List<BluetoothDevice> connectedDevices = bluetoothProfile2.getConnectedDevices();
            if (connectedDevices == null) {
                return false;
            }
            Iterator<BluetoothDevice> it2 = connectedDevices.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(it2.next().getAddress(), macAddress)) {
                    z = true;
                }
            }
            return z;
        } catch (Exception e2) {
            HMLog.error$default(null, null, null, new q(e2), 7, null);
            return false;
        }
    }

    private final boolean f(String macAddress, BluetoothProfile bluetoothProfile2) {
        return !e(macAddress, bluetoothProfile2);
    }

    private final void g(BluetoothDevice bluetoothDevice) {
        remoteDevice.setValue(this, a[0], bluetoothDevice);
    }

    public final void connectHid$hid_release(@NotNull Context context, @NotNull String macAddress) {
        Unit unit;
        if (BluetoothAdapter.checkBluetoothAddress(macAddress)) {
            HMLog.info("BluetoothUtil", b.a);
            if (!f(macAddress, bluetoothProfile)) {
                HMLog.info("BluetoothUtil", e.a);
                return;
            }
            if (bluetoothProfile == null) {
                BluetoothUtil.INSTANCE.getProfileProxy$hid_release(context, c.a);
                return;
            }
            a(d());
            BluetoothProfile bluetoothProfile2 = bluetoothProfile;
            if (bluetoothProfile2 == null) {
                unit = null;
            } else {
                BluetoothUtil.INSTANCE.connectHidDevice$hid_release(bluetoothProfile2, INSTANCE.d());
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                HMLog.error$default("BluetoothUtil", null, null, d.a, 6, null);
            }
        }
    }

    public final void createBond$hid_release(@NotNull Context context, @NotNull String macAddress) {
        if (BluetoothAdapter.checkBluetoothAddress(macAddress)) {
            if (HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
                g(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(macAddress));
                if (d().getBondState() == 12) {
                    HMLog.info("BluetoothUtil", f.a);
                    return;
                } else {
                    HMLog.info("BluetoothUtil", g.a);
                    d().createBond();
                    return;
                }
            }
            if (!f(macAddress, bluetoothProfile)) {
                HMLog.info("BluetoothUtil", j.a);
                return;
            }
            g(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(macAddress));
            if (d().getBondState() == 12) {
                HMLog.info("BluetoothUtil", h.a);
                connectHid$hid_release(context, macAddress);
            } else {
                HMLog.info("BluetoothUtil", i.a);
                d().createBond();
            }
        }
    }

    public final void disconnect$hid_release() {
        Unit unit;
        BluetoothProfile bluetoothProfile2 = bluetoothProfile;
        if (bluetoothProfile2 == null) {
            unit = null;
        } else {
            BluetoothUtil.INSTANCE.disconnectHidDevice$hid_release(bluetoothProfile2, INSTANCE.d());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.error$default("BluetoothUtil", null, null, k.a, 6, null);
        }
    }

    public final void initProfile$hid_release(@NotNull Context context, @NotNull String macAddress, @NotNull BluetoothServiceListener callback) {
        if (BluetoothAdapter.checkBluetoothAddress(macAddress)) {
            g(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(macAddress));
            BluetoothUtil.INSTANCE.getProfileProxy$hid_release(context, new p(callback));
        }
    }

    public final boolean isDevicePairedAndConnected$hid_release(@NotNull String macAddress) {
        boolean zIsDeviceBonded$hid_release = BluetoothUtil.INSTANCE.isDeviceBonded$hid_release(macAddress);
        if (HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
            return zIsDeviceBonded$hid_release;
        }
        boolean zE = e(macAddress, bluetoothProfile);
        HMLog.info("BluetoothUtil", new r(zIsDeviceBonded$hid_release, zE));
        return zE & zIsDeviceBonded$hid_release;
    }

    public final void unPairDevice$hid_release(@NotNull Context context, @NotNull String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            ArrayList arrayList = new ArrayList();
            for (Object obj : bondedDevices) {
                if (Intrinsics.areEqual(((BluetoothDevice) obj).getAddress(), address)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                if (!HidSdk.INSTANCE.isMIUIBased11$hid_release()) {
                    INSTANCE.c(context, address);
                }
                BluetoothUtil.INSTANCE.removeBondedService$hid_release((BluetoothDevice) arrayList.get(0));
            }
        }
    }
}
