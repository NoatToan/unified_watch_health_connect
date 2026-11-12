package com.huami.nfc.bus.api;

import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.ApduAction;
import com.huami.nfc.bus.ExtraInfo;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002H&J<\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¨\u0006\u0013"}, d2 = {"Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;", "", "", "appCode", "deviceId", "orderNum", "Lcom/huami/nfc/bus/ExtraInfo;", "extra", "actionType", "Lcom/huami/nfc/base/PayResponse;", "", "issueCard", "charge", "deleteApp", "safeDeleteApp", "shiftOutCard", "shiftInCard", "snbTicket", "returnCard", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface ISnowballAppletWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ PayResponse charge$default(ISnowballAppletWebApi iSnowballAppletWebApi, String str, String str2, String str3, String str4, ExtraInfo extraInfo, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: charge");
            }
            if ((i & 8) != 0) {
                str4 = ApduAction.Charge.getValue();
            }
            String str5 = str4;
            if ((i & 16) != 0) {
                extraInfo = null;
            }
            return iSnowballAppletWebApi.charge(str, str2, str3, str5, extraInfo);
        }

        public static /* synthetic */ PayResponse issueCard$default(ISnowballAppletWebApi iSnowballAppletWebApi, String str, String str2, String str3, ExtraInfo extraInfo, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueCard");
            }
            if ((i & 16) != 0) {
                str4 = ApduAction.IssueCard.getValue();
            }
            return iSnowballAppletWebApi.issueCard(str, str2, str3, extraInfo, str4);
        }
    }

    @NotNull
    PayResponse<Unit> charge(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull String actionType, @Nullable ExtraInfo extra);

    @NotNull
    PayResponse<Unit> deleteApp(@NotNull String appCode, @NotNull String deviceId);

    @NotNull
    PayResponse<Unit> issueCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra, @NotNull String actionType);

    @NotNull
    PayResponse<Unit> returnCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String snbTicket);

    @NotNull
    PayResponse<Unit> safeDeleteApp(@NotNull String appCode, @NotNull String deviceId);

    @NotNull
    PayResponse<Unit> shiftInCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra);

    @NotNull
    PayResponse<Unit> shiftOutCard(@NotNull String appCode, @NotNull String deviceId, @NotNull String orderNum, @NotNull ExtraInfo extra);
}
