package com.huami.nfc.car.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/nfc/car/api/CarApi;", "Lcom/huami/nfc/car/api/CarAppletApi;", "", "carSubType", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/car/entity/VCardInfo;", "getVCardInfo", "", "Lcom/huami/nfc/car/entity/SupportCar;", "getCarSupportDevices", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public interface CarApi extends CarAppletApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse getVCardInfo$default(CarApi carApi, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVCardInfo");
            }
            if ((i & 1) != 0) {
                str = CarSubType.XiaoPeng.getValue();
            }
            return carApi.getVCardInfo(str);
        }
    }

    @NotNull
    PayResponse<List<SupportCar>> getCarSupportDevices();

    @NotNull
    PayResponse<VCardInfo> getVCardInfo(@Nullable String carSubType);
}
