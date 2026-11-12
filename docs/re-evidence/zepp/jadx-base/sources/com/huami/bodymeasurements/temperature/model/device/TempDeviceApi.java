package com.huami.bodymeasurements.temperature.model.device;

import com.huami.bodymeasurements.temperature.model.device.dto.AllDayTemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.device.dto.EightySecondsTemperatureDo;
import com.huami.bodymeasurements.temperature.model.device.dto.SingleTemperatureDo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "", "", "Lcom/huami/bodymeasurements/temperature/model/device/dto/AllDayTemperatureDataDo;", "getAllDayTempFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/device/dto/SingleTemperatureDo;", "getSingleTempFromDevice", "Lcom/huami/bodymeasurements/temperature/model/device/dto/EightySecondsTemperatureDo;", "getEightySecondsTempFromDevice", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface TempDeviceApi {
    @Nullable
    Object getAllDayTempFromDevice(@NotNull Continuation<? super List<AllDayTemperatureDataDo>> continuation);

    @Nullable
    Object getEightySecondsTempFromDevice(@NotNull Continuation<? super List<EightySecondsTemperatureDo>> continuation);

    @Nullable
    Object getSingleTempFromDevice(@NotNull Continuation<? super List<SingleTemperatureDo>> continuation);
}
