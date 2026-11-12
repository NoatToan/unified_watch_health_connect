package com.mi.fitness.lpamanagement.init;

import com.mi.fitness.lpamanagement.service.BaseESimService;
import com.mi.fitness.lpamanagement.ui.download.DownloadProfileViewModel;
import com.mi.fitness.lpamanagement.util.BluetoothSender;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.gve;
import defpackage.l7h;
import defpackage.s7r;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u00060\nR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/lpamanagement/init/LpaComponent;", "", "", "initDevice", "()V", "initTask", "Lgve;", "request", "requestHttp", "(Lgve;)V", "Lcom/mi/fitness/lpamanagement/init/LpaComponent$DataHandlerImpl;", "curDataHandler", "Lcom/mi/fitness/lpamanagement/init/LpaComponent$DataHandlerImpl;", "<init>", "Companion", "DataHandlerImpl", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@AppComponent(namespace = LpaComponent.TAG)
public class LpaComponent {

    @NotNull
    public static final String TAG = "LpaComponent";

    @NotNull
    private final DataHandlerImpl curDataHandler = new DataHandlerImpl();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/mi/fitness/lpamanagement/init/LpaComponent$DataHandlerImpl;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "<init>", "(Lcom/mi/fitness/lpamanagement/init/LpaComponent;)V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DataHandlerImpl extends DataHandlerWrapper {
        public DataHandlerImpl() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet == null || packet.e != 9 || packet.f != 8) {
                return false;
            }
            gve gveVarQ = packet.x().q();
            Logger.i(LpaComponent.TAG, "request_http:" + gveVarQ.d + " " + gveVarQ.e + " " + gveVarQ.c);
            AnyExtKt.io$default(null, new LpaComponent$DataHandlerImpl$handlePacket$1(LpaComponent.this, gveVarQ, null), 1, null);
            return true;
        }
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = false)
    public final void initDevice() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceFullStatusListener() { // from class: com.mi.fitness.lpamanagement.init.LpaComponent.initDevice.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                if (isRemoved) {
                    BaseESimService.INSTANCE.resetEsimService();
                }
            }
        });
    }

    @ComponentTask(notEarlierThan = 4, onMainThread = false, processName = ":device")
    public final void initTask() {
        Logger.i(TAG, "initTask");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(9, this.curDataHandler);
    }

    public final void requestHttp(@NotNull final gve request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        l7h.d().f(request.d, request.e, new Callback() { // from class: com.mi.fitness.lpamanagement.init.LpaComponent.requestHttp.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                String did;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                Logger.i(DownloadProfileViewModel.TAG, "requestHttp failure : " + e.getMessage());
                BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
                WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                if (wearableDeviceModel2 == null || (did = wearableDeviceModel2.getDid()) == null) {
                    did = "";
                }
                bluetoothSender.responseHttp(did, request.c, -1, "");
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                String did;
                String strString;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                ResponseBody responseBodyBody = response.body();
                String str = (responseBodyBody == null || (strString = responseBodyBody.string()) == null) ? "" : strString;
                Logger.i(DownloadProfileViewModel.TAG, "requestHttp onResponse body.string: " + str + " code:" + response.code());
                BluetoothSender bluetoothSender = BluetoothSender.INSTANCE;
                WearableDeviceModel wearableDeviceModel2 = wearableDeviceModel;
                bluetoothSender.responseHttp((wearableDeviceModel2 == null || (did = wearableDeviceModel2.getDid()) == null) ? "" : did, request.c, response.code(), str);
            }
        });
    }
}
