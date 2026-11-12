package com.huami.eid.ui.api;

import com.huami.nfc.eid.entities.EidDigitalInfo;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.eid.entities.EidStatus;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H&J>\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0012H&J\b\u0010\u001b\u001a\u00020\u0014H&J\b\u0010\u001c\u001a\u00020\u0014H&J\b\u0010\u001e\u001a\u00020\u001dH&J\b\u0010\u001f\u001a\u00020\u000bH&¨\u0006 "}, d2 = {"Lcom/huami/eid/ui/api/EidApi;", "", "", "queryType", "requestId", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", Constant.KEY_SESSION_KEY, "image", "imageType", "", "auth", "issueEid", "deleteEid", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "", "postResult", com.tekartik.sqflite.Constant.h, "writeCert", "sign", "getRequestId", "getEidInfo", "checkPwdStatus", "unlock", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "getEidQrCode", "revoke", "eid_release"}, k = 1, mv = {1, 5, 1})
public interface EidApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ EidStatus getEidStatus$default(EidApi eidApi, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEidStatus");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return eidApi.getEidStatus(str, str2);
        }

        public static /* synthetic */ boolean postResult$default(EidApi eidApi, String str, String str2, String str3, String str4, String str5, EidInfoEntity eidInfoEntity, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postResult");
            }
            if ((i & 4) != 0) {
                str3 = "2";
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str5 = "";
            }
            return eidApi.postResult(str, str2, str6, str4, str5, eidInfoEntity);
        }
    }

    void auth(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String sessionKey, @NotNull String image, @NotNull String imageType);

    boolean checkPwdStatus();

    void deleteEid(@NotNull String bizSerialNumber);

    @NotNull
    EidInfoEntity getEidInfo();

    @NotNull
    EidDigitalInfo getEidQrCode();

    @NotNull
    EidStatus getEidStatus(@NotNull String queryType, @Nullable String requestId);

    @NotNull
    String getRequestId();

    void issueEid(@NotNull String bizSerialNumber);

    boolean postResult(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo);

    void revoke();

    @NotNull
    String sign(@NotNull String cmd);

    boolean unlock();

    @NotNull
    String writeCert(@NotNull String cmd);
}
