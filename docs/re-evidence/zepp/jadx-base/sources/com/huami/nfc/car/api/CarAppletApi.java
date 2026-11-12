package com.huami.nfc.car.api;

import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&JD\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/nfc/car/api/CarAppletApi;", "", "", "token", "keyToken", "productSubType", "watchId", "vin", "Lcom/huami/nfc/base/PayResponse;", "", "installVCardAndKeyCard", "deleteVCardAndKeyCard", "installKeyCard", "nfc-car_release"}, k = 1, mv = {1, 5, 1})
public interface CarAppletApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse deleteVCardAndKeyCard$default(CarAppletApi carAppletApi, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteVCardAndKeyCard");
            }
            if ((i & 1) != 0) {
                str = "7";
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return carAppletApi.deleteVCardAndKeyCard(str, str2, str3);
        }

        public static /* synthetic */ PayResponse installKeyCard$default(CarAppletApi carAppletApi, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installKeyCard");
            }
            if ((i & 4) != 0) {
                str3 = "7";
            }
            return carAppletApi.installKeyCard(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public static /* synthetic */ PayResponse installVCardAndKeyCard$default(CarAppletApi carAppletApi, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installVCardAndKeyCard");
            }
            if ((i & 4) != 0) {
                str3 = "7";
            }
            return carAppletApi.installVCardAndKeyCard(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    @NotNull
    PayResponse<Unit> deleteVCardAndKeyCard(@NotNull String productSubType, @Nullable String watchId, @Nullable String vin);

    @NotNull
    PayResponse<Unit> installKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin);

    @NotNull
    PayResponse<Unit> installVCardAndKeyCard(@Nullable String token, @Nullable String keyToken, @NotNull String productSubType, @Nullable String watchId, @Nullable String vin);
}
