package defpackage;

import com.xiaomi.fit.device.bind.WearBinderV1;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.core.DeviceInfo;

/* JADX INFO: loaded from: classes7.dex */
public class mq2 extends WearBinderV1 {
    public mq2(DeviceInfo deviceInfo) {
        super(null, deviceInfo);
    }

    @Override // com.xiaomi.fit.device.bind.a
    public final void start(kj2 kj2Var) {
        super.start(kj2Var);
        Logger.i("BleBinderV1", "start createBond");
        getBindStatus();
    }
}
