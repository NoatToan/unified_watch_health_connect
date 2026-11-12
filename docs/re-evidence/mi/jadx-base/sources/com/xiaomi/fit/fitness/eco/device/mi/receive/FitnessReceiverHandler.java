package com.xiaomi.fit.fitness.eco.device.mi.receive;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessReceiverHandler;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDataHandlerWrapper;", "<init>", "()V", "TAG", "", "dataReceiverMap", "", "Lcom/xiaomi/fit/fitness/eco/device/mi/receive/FitnessDataReceiver;", "handleData", "", "did", "type", "", "data", "", "fitness-eco-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessReceiverHandler extends EcoDataHandlerWrapper {

    @NotNull
    private final String TAG = "FitnessDataReceiverHandler";

    @NotNull
    private final Map<String, FitnessDataReceiver> dataReceiverMap = new LinkedHashMap();

    @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (!TextUtils.isEmpty(did) && data != null && type == 102) {
            FitnessDataReceiver fitnessDataReceiver = this.dataReceiverMap.get(did);
            if (fitnessDataReceiver == null) {
                fitnessDataReceiver = new FitnessDataReceiver(did, true);
                this.dataReceiverMap.put(did, fitnessDataReceiver);
            }
            fitnessDataReceiver.onReceive(data);
            return true;
        }
        FitnessLogUtils.i(this.TAG, "handleData(did = " + did + ", type = " + type + "), invalid and abort");
        return false;
    }
}
