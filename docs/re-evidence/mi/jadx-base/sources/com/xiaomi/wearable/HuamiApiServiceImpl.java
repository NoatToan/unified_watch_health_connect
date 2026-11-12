package com.xiaomi.wearable;

import android.os.RemoteException;
import com.xiaomi.wearable.hm.m;
import defpackage.dtc;
import defpackage.etc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiServiceImpl;", "Letc$a;", "", "mac", "did", "Lcom/xiaomi/wearable/hm/m;", "getHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/wearable/hm/m;", "Ldtc;", "callback", "", "addHuamiApiChanageListener", "(Ljava/lang/String;Ldtc;)V", "removeHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)V", "<init>", "()V", "Companion", "huami_release"}, k = 1, mv = {2, 0, 0})
public final class HuamiApiServiceImpl extends etc.a {
    public static final int KEY_CONNECT_BINDER = 1;

    @Override // defpackage.etc
    public void addHuamiApiChanageListener(@NotNull String mac, @NotNull final dtc callback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(callback, "callback");
        HuamiApiFactory.INSTANCE.get().addHuamiApiChangeListener(mac, new HuamiApiChangeListener() { // from class: com.xiaomi.wearable.HuamiApiServiceImpl.addHuamiApiChanageListener.1
            @Override // com.xiaomi.wearable.HuamiApiChangeListener
            public void onHuamiApiChange(m huamiApi) {
                Intrinsics.checkNotNullParameter(huamiApi, "huamiApi");
                try {
                    callback.onHuamiApiChange(huamiApi);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // defpackage.etc
    @NotNull
    public m getHuamiApi(@NotNull String mac, @Nullable String did) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return HuamiApiFactory.INSTANCE.get().getHuamiApi(mac, did);
    }

    @Override // defpackage.etc
    public void removeHuamiApi(@NotNull String mac, @Nullable String did) throws RemoteException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        HuamiApiFactory.INSTANCE.get().removeHuamiApi(mac);
    }
}
