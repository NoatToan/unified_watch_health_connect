package com.huami.nfc.eid;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.eid.api.PostResultApi;
import com.huami.nfc.eid.entities.DeviceCertificate;
import com.huami.nfc.eid.entities.EidInfoEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0014\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/nfc/eid/PostResultApiWithLog;", "Lcom/huami/nfc/eid/api/PostResultApi;", "", "orderNum", "requestId", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/DeviceCertificate;", "getCertificate", "result", "errorCode", "idCarrier", "", "openStepTwo", "a", "Lcom/huami/nfc/eid/api/PostResultApi;", "api", "<init>", "(Lcom/huami/nfc/eid/api/PostResultApi;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class PostResultApiWithLog implements PostResultApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PostResultApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/DeviceCertificate;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends DeviceCertificate>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<DeviceCertificate> payResponse) {
            return "穿戴设备eID卡信息上传失败(俗称stepOne)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "上传穿戴设备写入的证书(俗称stepTwo)";
        }
    }

    public PostResultApiWithLog(@NotNull PostResultApi postResultApi) {
        this.api = postResultApi;
    }

    @Override // com.huami.nfc.eid.api.PostResultApi
    @NotNull
    public PayResponse<DeviceCertificate> getCertificate(@NotNull String orderNum, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo) {
        return PayResponseExtensionsKt.logcat(this.api.getCertificate(orderNum, requestId, eidLevel, carrierType, phoneNum, eidInfo), ErrorCodeConstant.NFC_EID_UPLOAD_INFO, a.a);
    }

    @Override // com.huami.nfc.eid.api.PostResultApi
    @NotNull
    public PayResponse<Unit> openStepTwo(@NotNull String orderNum, @NotNull String result, @NotNull String errorCode, @NotNull String idCarrier) {
        return PayResponseExtensionsKt.logcat(this.api.openStepTwo(orderNum, result, errorCode, idCarrier), ErrorCodeConstant.NFC_EID_UPLOAD_CERT_RESULT, b.a);
    }
}
