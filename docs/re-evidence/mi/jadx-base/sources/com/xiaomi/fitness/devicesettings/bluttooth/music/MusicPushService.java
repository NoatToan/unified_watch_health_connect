package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import defpackage.clf;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushService;", "Landroid/app/Service;", "<init>", "()V", "musicPushImpl", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushImpl;", "mediaHandler", "com/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushService$mediaHandler$1", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushService$mediaHandler$1;", "onCreate", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", LifecycleConstantKt.ON_DESTROY, "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicPushService extends Service {

    @NotNull
    private MusicPushService$mediaHandler$1 mediaHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushService$mediaHandler$1
        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(String did, int type, s7r packet) {
            clf.g gVarU;
            Intrinsics.checkNotNullParameter(did, "did");
            xc6.d("MusicPushService mediaHandler handlePacket " + this.this$0.musicPushImpl + " id:" + (packet != null ? Integer.valueOf(packet.f) : null));
            Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
            if (numValueOf == null || numValueOf.intValue() != 12) {
                return false;
            }
            vkf vkfVarA = packet.A();
            if (vkfVarA != null && (gVarU = vkfVarA.u()) != null) {
                MusicPushService musicPushService = this.this$0;
                xc6.d("MusicPushService REPORT_SONG_RESULT " + gVarU.c + " " + gVarU.d);
                MusicPushImpl musicPushImpl = musicPushService.musicPushImpl;
                if (musicPushImpl != null) {
                    musicPushImpl.onPushDeviceResultSuccess(gVarU.c == 0, gVarU.d);
                }
            }
            return true;
        }
    };

    @Nullable
    private MusicPushImpl musicPushImpl;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        MusicPushImpl musicPushImpl = new MusicPushImpl(this);
        this.musicPushImpl = musicPushImpl;
        return musicPushImpl;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(18, this.mediaHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(18, this.mediaHandler);
    }
}
