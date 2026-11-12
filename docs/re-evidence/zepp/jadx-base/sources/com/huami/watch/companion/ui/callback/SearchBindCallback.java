package com.huami.watch.companion.ui.callback;

import android.bluetooth.BluetoothDevice;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ui.activity.SearchBindDeviceActivity;
import com.huami.watch.companion.ui.callback.SearchBindCallback;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/watch/companion/ui/callback/SearchBindCallback;", "Lcom/xiaomi/hm/health/bt/scan/IBleScanCallback;", "Lcom/xiaomi/hm/health/bt/scan/AdvData;", "data", "Lcom/xiaomi/hm/health/bt/scan/BleScanOption;", "option", "", "onScanedDevice", "onScanStop", "onScanStart", "onScanError", "Ljava/lang/ref/WeakReference;", "Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity;", "a", "Ljava/lang/ref/WeakReference;", "activityReference", "activity", "<init>", "(Lcom/huami/watch/companion/ui/activity/SearchBindDeviceActivity;)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class SearchBindCallback implements IBleScanCallback {

    @NotNull
    private static final String b = "SearchBindCallback";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<SearchBindDeviceActivity> activityReference;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onScanError";
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
            return "onScanStart";
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
            return "onScanStop";
        }
    }

    public SearchBindCallback(@NotNull SearchBindDeviceActivity searchBindDeviceActivity) {
        this.activityReference = new WeakReference<>(searchBindDeviceActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SearchBindDeviceActivity searchBindDeviceActivity, BluetoothDevice bluetoothDevice, AdvData advData) {
        searchBindDeviceActivity.handleDevice(bluetoothDevice, (short) advData.rssi);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(@Nullable BleScanOption option) {
        HMLog.info(b, a.a);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(@Nullable BleScanOption option) {
        HMLog.info(b, b.a);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(@Nullable BleScanOption option) {
        HMLog.info(b, c.a);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(@Nullable final AdvData data, @Nullable BleScanOption option) {
        final SearchBindDeviceActivity searchBindDeviceActivity;
        final BluetoothDevice bluetoothDevice = data == null ? null : data.device;
        if (bluetoothDevice == null || (searchBindDeviceActivity = this.activityReference.get()) == null) {
            return;
        }
        searchBindDeviceActivity.runOnUiThread(new Runnable() { // from class: nk6
            @Override // java.lang.Runnable
            public final void run() {
                SearchBindCallback.b(searchBindDeviceActivity, bluetoothDevice, data);
            }
        });
    }
}
