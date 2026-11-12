package com.huami.watch.companion.watchface.manager;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.watchface.manager.BasicDeviceController;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.RxBus;
import com.loc.z;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0016\u0010\u000b\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/BasicDeviceController;", "", "", z.j, "g", "onClear", "Lcom/huami/watch/transport/TransportDataItem;", "transportDataItem", "dataReceived", "", "available", "channelListener", "onConnected", "onDisconnected", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/lang/String;", "getMDeviceId", "()Ljava/lang/String;", "setMDeviceId", "(Ljava/lang/String;)V", "mDeviceId", "c", "Z", "isConnect", "()Z", "setConnect", "(Z)V", "Lcom/huami/watch/companion/device/Device;", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/companion/device/Device;", "getMDevice", "()Lcom/huami/watch/companion/device/Device;", "setMDevice", "(Lcom/huami/watch/companion/device/Device;)V", "mDevice", "Lcom/huami/watch/transport/Transporter;", "mTransporter", "Lcom/huami/watch/transport/Transporter;", "getMTransporter", "()Lcom/huami/watch/transport/Transporter;", "setMTransporter", "(Lcom/huami/watch/transport/Transporter;)V", "Lcom/huami/watch/companion/device/DeviceManager;", "e", "Lcom/huami/watch/companion/device/DeviceManager;", "mDeviceManager", "Lio/reactivex/disposables/Disposable;", "f", "Lio/reactivex/disposables/Disposable;", "mConnectSubscription", "Lcom/huami/watch/transport/Transporter$DataListener;", "Lcom/huami/watch/transport/Transporter$DataListener;", "dataListener", "Lcom/huami/watch/transport/Transporter$ChannelListener;", "h", "Lcom/huami/watch/transport/Transporter$ChannelListener;", "<init>", "(Landroid/content/Context;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public abstract class BasicDeviceController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String mDeviceId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isConnect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Device mDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private DeviceManager mDeviceManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Disposable mConnectSubscription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Transporter.DataListener dataListener = new Transporter.DataListener() { // from class: os
        @Override // com.huami.watch.transport.Transporter.DataListener
        public final void onDataReceived(TransportDataItem transportDataItem) {
            BasicDeviceController.f(this.a, transportDataItem);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Transporter.ChannelListener channelListener = new Transporter.ChannelListener() { // from class: ns
        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public final void onChannelChanged(boolean z) {
            BasicDeviceController.e(this.a, z);
        }
    };
    public Transporter mTransporter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    public BasicDeviceController(@NotNull Context context) {
        this.context = context;
        this.mDeviceManager = DeviceManager.getManager(context);
        Device currentDevice = this.mDeviceManager.getCurrentDevice();
        this.mDevice = currentDevice;
        this.isConnect = currentDevice.isConnected();
        this.mDeviceId = this.mDevice.getCpuId();
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BasicDeviceController basicDeviceController, boolean z) {
        basicDeviceController.channelListener(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BasicDeviceController basicDeviceController, TransportDataItem transportDataItem) {
        basicDeviceController.dataReceived(transportDataItem);
    }

    private final void g() {
        this.mConnectSubscription = RxBus.get().toObservable().subscribe(new Consumer() { // from class: ps
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BasicDeviceController.h(this.a, obj);
            }
        }, new Consumer() { // from class: qs
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BasicDeviceController.i((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BasicDeviceController basicDeviceController, Object obj) {
        if (obj instanceof ConnectedEvent) {
            basicDeviceController.onConnected();
        } else {
            if (!(obj instanceof DisconnectedEvent) || DeviceManager.getManager(basicDeviceController.context).getCurrentDevice() == null) {
                return;
            }
            basicDeviceController.onDisconnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    private final void j() {
        setMTransporter(Transporter.get(this.context, "com.huami.watchface"));
        getMTransporter().connectTransportService();
        getMTransporter().addDataListener(this.dataListener);
        getMTransporter().addChannelListener(this.channelListener);
    }

    public abstract void channelListener(boolean available);

    public abstract void dataReceived(@NotNull TransportDataItem transportDataItem);

    @NotNull
    public final Device getMDevice() {
        return this.mDevice;
    }

    @NotNull
    public final String getMDeviceId() {
        return this.mDeviceId;
    }

    @NotNull
    public final Transporter getMTransporter() {
        Transporter transporter = this.mTransporter;
        if (transporter != null) {
            return transporter;
        }
        return null;
    }

    /* JADX INFO: renamed from: isConnect, reason: from getter */
    public final boolean getIsConnect() {
        return this.isConnect;
    }

    public void onClear() {
        getMTransporter().removeDataListener(this.dataListener);
        getMTransporter().removeChannelListener(this.channelListener);
        Disposable disposable = this.mConnectSubscription;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public void onConnected() {
        this.isConnect = true;
    }

    public void onDisconnected() {
        this.isConnect = false;
    }

    public final void setConnect(boolean z) {
        this.isConnect = z;
    }

    public final void setMDevice(@NotNull Device device) {
        this.mDevice = device;
    }

    public final void setMDeviceId(@NotNull String str) {
        this.mDeviceId = str;
    }

    public final void setMTransporter(@NotNull Transporter transporter) {
        this.mTransporter = transporter;
    }
}
