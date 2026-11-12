package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.blf;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.wkf;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0011\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R4\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/RecordViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "requestRecordStatus", "()V", "Landroid/content/Context;", "context", LoginPreferenceConfig.TYPE_REGISTER, "(Landroid/content/Context;)V", "unRegister", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "com/xiaomi/fitness/devicesettings/bluttooth/audio/RecordViewModel$audioRecordDataHandler$1", "audioRecordDataHandler", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/RecordViewModel$audioRecordDataHandler$1;", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lblf;", "", "recordLiveData", "Landroidx/lifecycle/MutableLiveData;", "getRecordLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setRecordLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecordViewModel extends AbsViewModel {
    public static final int sActionPause = 2;
    public static final int sActionStart = 0;
    public static final int sActionStop = 1;
    public static final int sCodeLowStorage = 2;
    public static final int sStatusPause = 2;
    public static final int sStatusRecording = 0;
    public static final int sStatusStop = 1;

    @Nullable
    private WearableDeviceModel deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private final RecordViewModel$audioRecordDataHandler$1 audioRecordDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.RecordViewModel$audioRecordDataHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            blf blfVarQ;
            vkf vkfVarA;
            blf blfVarQ2;
            vkf vkfVarA2;
            blf blfVarQ3;
            blf.a aVar;
            wkf wkfVar;
            Intrinsics.checkNotNullParameter(did, "did");
            xc6.d("RecordViewModel audioRecordDataHandler id:" + (packet != null ? Integer.valueOf(packet.f) : null) + " identifier:" + ((packet == null || (vkfVarA2 = packet.A()) == null || (blfVarQ3 = vkfVarA2.q()) == null || (aVar = blfVarQ3.e) == null || (wkfVar = aVar.c) == null) ? null : wkfVar.c) + " status:" + ((packet == null || (vkfVarA = packet.A()) == null || (blfVarQ2 = vkfVarA.q()) == null) ? null : blfVarQ2.e));
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            if (numValueOf == null || numValueOf.intValue() != 22) {
                return super.handlePacket(did, type, packet);
            }
            vkf vkfVarA3 = packet.A();
            if (vkfVarA3 == null || (blfVarQ = vkfVarA3.q()) == null) {
                return true;
            }
            this.this$0.getRecordLiveData().postValue(new Pair<>(blfVarQ, Boolean.TRUE));
            return true;
        }
    };

    @NotNull
    private MutableLiveData<Pair<blf, Boolean>> recordLiveData = new MutableLiveData<>();

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final MutableLiveData<Pair<blf, Boolean>> getRecordLiveData() {
        return this.recordLiveData;
    }

    public final void register(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(18, this.audioRecordDataHandler);
    }

    public final void requestRecordStatus() {
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 21;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.RecordViewModel.requestRecordStatus.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                xc6.d("requestRecordStatus onError code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                blf blfVarQ = (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null) ? null : vkfVarA.q();
                xc6.d("requestRecordStatus onSuccess " + blfVarQ);
                if (blfVarQ != null) {
                    RecordViewModel.this.getRecordLiveData().postValue(new Pair<>(blfVarQ, Boolean.FALSE));
                }
            }
        }, 0, 8, null);
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setRecordLiveData(@NotNull MutableLiveData<Pair<blf, Boolean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.recordLiveData = mutableLiveData;
    }

    public final void unRegister(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(18, this.audioRecordDataHandler);
    }
}
