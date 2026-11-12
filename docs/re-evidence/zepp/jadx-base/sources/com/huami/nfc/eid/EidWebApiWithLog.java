package com.huami.nfc.eid;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.eid.api.EidWebApi;
import com.huami.nfc.eid.entities.EidDigitalInfo;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.huami.nfc.eid.entities.EidStatus;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J@\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0016\u0010\u001c\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/nfc/eid/EidWebApiWithLog;", "Lcom/huami/nfc/eid/api/EidWebApi;", "", "queryType", "requestId", "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", Constant.KEY_SESSION_KEY, "image", "imageType", "", "auth", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "", "postResult", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "getEidQrCode", "revoke", "issueEid", "deleteEid", "a", "Lcom/huami/nfc/eid/api/EidWebApi;", "api", "<init>", "(Lcom/huami/nfc/eid/api/EidWebApi;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidWebApiWithLog implements EidWebApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidWebApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "人脸识别失败";
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
            return "删除eID";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends EidDigitalInfo>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<EidDigitalInfo> payResponse) {
            return "获取eID数字身份";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidStatus;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends EidStatus>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<EidStatus> payResponse) {
            return "云端校验身份证的状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "个人化eID";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends Boolean>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Boolean> payResponse) {
            return "eID开卡失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends Unit>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Unit> payResponse) {
            return "注销eID";
        }
    }

    public EidWebApiWithLog(@NotNull EidWebApi eidWebApi) {
        this.api = eidWebApi;
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Unit> auth(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String sessionKey, @NotNull String image, @NotNull String imageType) {
        return PayResponseExtensionsKt.logcat(this.api.auth(bizSerialNumber, requestId, sessionKey, image, imageType), ErrorCodeConstant.NFC_EID_FACE_COMPARE, a.a);
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> deleteEid(@NotNull String bizSerialNumber) {
        return PayResponseExtensionsKt.logcat(this.api.deleteEid(bizSerialNumber), ErrorCodeConstant.NFC_EID_DELETE, b.a);
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<EidDigitalInfo> getEidQrCode() {
        return PayResponseExtensionsKt.logcat(this.api.getEidQrCode(), ErrorCodeConstant.NFC_EID_DIGITAL_INFO, c.a);
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<EidStatus> getEidStatus(@NotNull String queryType, @Nullable String requestId) {
        return PayResponseExtensionsKt.logcat(this.api.getEidStatus(queryType, requestId), ErrorCodeConstant.NFC_EID_REQID_STATUS, d.a);
    }

    @Override // com.huami.nfc.eid.api.EidAppletApi
    @NotNull
    public PayResponse<Unit> issueEid(@NotNull String bizSerialNumber) {
        return PayResponseExtensionsKt.logcat(this.api.issueEid(bizSerialNumber), ErrorCodeConstant.NFC_EID_ISSUE, e.a);
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Boolean> postResult(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo) {
        return PayResponseExtensionsKt.logcat(this.api.postResult(bizSerialNumber, requestId, eidLevel, carrierType, phoneNum, eidInfo), ErrorCodeConstant.NFC_EID_OPEN, f.a);
    }

    @Override // com.huami.nfc.eid.api.EidWebApi
    @NotNull
    public PayResponse<Unit> revoke() {
        return PayResponseExtensionsKt.logcat(this.api.revoke(), ErrorCodeConstant.NFC_EID_REVOKE, g.a);
    }
}
