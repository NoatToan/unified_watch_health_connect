package com.huami.femalehealth.logiclib.device;

import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J(\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0015\u0010\u000e\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/DeviceDataTransfer;", "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "data", "Lcom/huami/femalehealth/logiclib/device/DeviceCallback;", "writeCallback", "", "writeToDevice", "Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "config", "writeConfigToDevice", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "writeRecentToDevice", "readConfigFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFromDevice", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceDataTransfer {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void writeConfigToDevice$default(DeviceDataTransfer deviceDataTransfer, MenstruationConfigDto menstruationConfigDto, DeviceCallback deviceCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeConfigToDevice");
            }
            if ((i & 2) != 0) {
                deviceCallback = null;
            }
            deviceDataTransfer.writeConfigToDevice(menstruationConfigDto, deviceCallback);
        }

        public static /* synthetic */ void writeRecentToDevice$default(DeviceDataTransfer deviceDataTransfer, List list, DeviceCallback deviceCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeRecentToDevice");
            }
            if ((i & 2) != 0) {
                deviceCallback = null;
            }
            deviceDataTransfer.writeRecentToDevice(list, deviceCallback);
        }

        public static /* synthetic */ void writeToDevice$default(DeviceDataTransfer deviceDataTransfer, MenstruationTotalDto menstruationTotalDto, DeviceCallback deviceCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeToDevice");
            }
            if ((i & 2) != 0) {
                deviceCallback = null;
            }
            deviceDataTransfer.writeToDevice(menstruationTotalDto, deviceCallback);
        }
    }

    @Nullable
    Object readConfigFromDevice(@NotNull Continuation<? super MenstruationConfigDto> continuation);

    @Nullable
    Object readFromDevice(@NotNull Continuation<? super MenstruationTotalDto> continuation);

    void writeConfigToDevice(@NotNull MenstruationConfigDto config, @Nullable DeviceCallback writeCallback);

    void writeRecentToDevice(@NotNull List<? extends List<MenstruationVo>> data, @Nullable DeviceCallback writeCallback);

    void writeToDevice(@NotNull MenstruationTotalDto data, @Nullable DeviceCallback writeCallback);
}
