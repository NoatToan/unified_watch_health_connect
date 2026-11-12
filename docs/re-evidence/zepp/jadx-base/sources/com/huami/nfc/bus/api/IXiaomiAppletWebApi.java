package com.huami.nfc.bus.api;

import com.huami.nfc.applet.City;
import com.huami.nfc.base.PayResponse;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H&J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J>\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H&¨\u0006\u0015"}, d2 = {"Lcom/huami/nfc/bus/api/IXiaomiAppletWebApi;", "", "", "appCode", "aid", "deviceId", "orderToken", "userProtocolId", "cityId", "Lcom/huami/nfc/base/PayResponse;", "", "issueCard", "charge", "deleteApp", "miCardName", "actionType", "shiftCard", "checkShiftCard", "Lcom/huami/nfc/applet/City;", "city", "returnCard", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface IXiaomiAppletWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse issueCard$default(IXiaomiAppletWebApi iXiaomiAppletWebApi, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueCard");
            }
            if ((i & 32) != 0) {
                str6 = null;
            }
            return iXiaomiAppletWebApi.issueCard(str, str2, str3, str4, str5, str6);
        }
    }

    @NotNull
    PayResponse<Unit> charge(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken);

    @NotNull
    PayResponse<Unit> checkShiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId);

    @NotNull
    PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId);

    @NotNull
    PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String aid, @NotNull String deviceId, @NotNull String orderToken, @Nullable String userProtocolId, @Nullable String cityId);

    @NotNull
    PayResponse<Unit> returnCard(@NotNull City city, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType);

    @NotNull
    PayResponse<Unit> shiftCard(@NotNull String appCode, @NotNull String aid, @NotNull String miCardName, @NotNull String deviceId, @NotNull String orderToken, @NotNull String actionType);
}
