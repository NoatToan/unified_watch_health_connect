package com.xiaomi.fitness.devicesettings.bluttooth.music;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.dlf;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.wzi;
import defpackage.xc6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "loadConfig", "", "success", "Lkotlin/Function1;", "", "fail", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicPushViewModel extends AbsViewModel {
    public final void loadConfig(@NotNull final Function1<? super Integer, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        s7r s7rVar = new s7r();
        s7rVar.e = 18;
        s7rVar.f = 3;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicPushViewModel.loadConfig.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                xc6.b("loadConfig onError code:" + code);
                success.invoke2(15);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                vkf vkfVarA;
                dlf dlfVarV;
                if (result == null || (packet = result.getPacket()) == null || (vkfVarA = packet.A()) == null || (dlfVarV = vkfVarA.v()) == null) {
                    Function1<String, Unit> function1 = fail;
                    xc6.b("loadConfig onSuccess songSummary is null");
                    function1.invoke2(ResourceExtKt.getString(wzi.common_hint_unkonwn_error));
                    return;
                }
                Function1<Integer, Unit> function2 = success;
                xc6.d("loadConfig onSuccess " + dlfVarV.c + " " + dlfVarV.d + " " + dlfVarV.f.length + " " + dlfVarV.e);
                function2.invoke2(Integer.valueOf(dlfVarV.c));
            }
        }, 0, 8, null);
    }
}
