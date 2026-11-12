package defpackage;

import com.xiaomi.hm.health.bt.sdk.IBatteryChangeCallback;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.wearable.HuamiApiImpl;
import com.xiaomi.wearable.hm.c;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class njc implements IBatteryChangeCallback, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f27974a;

    public /* synthetic */ njc(c cVar) {
        this.f27974a = cVar;
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IBatteryChangeCallback
    public final void onBatteryInfo(DeviceBatteryInfo deviceBatteryInfo) {
        HuamiApiImpl.setBatteryChangedCallback$lambda$8(this.f27974a, deviceBatteryInfo);
    }
}
