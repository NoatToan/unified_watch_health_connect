package com.huami.eid.ui.api;

import com.huami.eid.ui.exception.EidNormalException;
import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.eid.api.EidDeviceApi;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J:\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/eid/ui/api/EidApiImpl;", "Lcom/huami/eid/ui/api/EidApi;", "", "queryType", "requestId", "Lcom/huami/nfc/eid/entities/EidStatus;", "getEidStatus", "bizSerialNumber", Constant.KEY_SESSION_KEY, "image", "imageType", "", "auth", "issueEid", "deleteEid", "eidLevel", "carrierType", "phoneNum", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "eidInfo", "", "postResult", com.tekartik.sqflite.Constant.h, "writeCert", "sign", "getRequestId", "getEidInfo", "checkPwdStatus", "unlock", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "getEidQrCode", "revoke", "Lcom/huami/nfc/eid/api/EidWebApi;", "a", "Lcom/huami/nfc/eid/api/EidWebApi;", "webApi", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "b", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "eidDeviceApi", "<init>", "(Lcom/huami/nfc/eid/api/EidWebApi;Lcom/huami/nfc/eid/api/EidDeviceApi;)V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidApiImpl implements EidApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EidDeviceApi eidDeviceApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Unit> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends Boolean>, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<Boolean> payResponse) throws EidNormalException {
            Boolean data = payResponse.getData();
            if (data != null) {
                return data.booleanValue();
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_UNSET_PWD, null, "获取不到数据，查询密码失败", 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends Boolean> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Unit> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends EidInfoEntity>, EidInfoEntity> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EidInfoEntity invoke(@NotNull PayResponse<EidInfoEntity> payResponse) throws EidNormalException {
            EidInfoEntity data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_GET_INFO, null, "获取不到数据，获取EidInfoEntity失败", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidDigitalInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends EidDigitalInfo>, EidDigitalInfo> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EidDigitalInfo invoke(@NotNull PayResponse<EidDigitalInfo> payResponse) throws EidNormalException {
            EidDigitalInfo data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_DIGITAL_INFO, null, "获取不到数据，获取数字二维码信息失败", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends EidStatus>, EidStatus> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EidStatus invoke(@NotNull PayResponse<EidStatus> payResponse) throws EidNormalException {
            EidStatus data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_GET_STATUS, null, "eID是否开通状态检测失败", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) throws EidNormalException {
            String data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_GET_REQID, null, "获取不到数据，获取reqid失败", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Unit> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<PayResponse<? extends Boolean>, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<Boolean> payResponse) throws EidNormalException {
            Boolean data = payResponse.getData();
            if (data != null) {
                return data.booleanValue();
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_UPLOAD_CERT_RESULT, null, "获取不到数据，开卡第二阶段失败", 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends Boolean> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<PayResponse<? extends Unit>, Unit> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public final void a(@NotNull PayResponse<Unit> payResponse) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayResponse<? extends Unit> payResponse) {
            a(payResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) throws EidNormalException {
            String data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_SIGN, null, "获取不到数据，签名失败", 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<PayResponse<? extends Boolean>, Boolean> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        public final boolean a(@NotNull PayResponse<Boolean> payResponse) throws EidNormalException {
            Boolean data = payResponse.getData();
            if (data != null) {
                return data.booleanValue();
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_UNLOCK, null, "获取不到数据，验证解锁密码失败", 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(PayResponse<? extends Boolean> payResponse) {
            return Boolean.valueOf(a(payResponse));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final m a = new m();

        public m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) throws EidNormalException {
            String data = payResponse.getData();
            if (data != null) {
                return data;
            }
            throw new EidNormalException(ErrorCodeConstant.NFC_EID_WRITE_CERT, null, "获取不到数据，写证书失败", 2, null);
        }
    }

    public EidApiImpl(@NotNull EidWebApi eidWebApi, @NotNull EidDeviceApi eidDeviceApi) {
        this.webApi = eidWebApi;
        this.eidDeviceApi = eidDeviceApi;
    }

    @Override // com.huami.eid.ui.api.EidApi
    public void auth(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String sessionKey, @NotNull String image, @NotNull String imageType) throws Exception {
        EidRepoImplKt.onSuccess(this.webApi.auth(bizSerialNumber, requestId, sessionKey, image, imageType), a.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    public boolean checkPwdStatus() {
        return ((Boolean) EidRepoImplKt.onSuccess(this.eidDeviceApi.checkPwdStatus(), b.a)).booleanValue();
    }

    @Override // com.huami.eid.ui.api.EidApi
    public void deleteEid(@NotNull String bizSerialNumber) throws Exception {
        EidRepoImplKt.onSuccess(this.webApi.deleteEid(bizSerialNumber), c.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public EidInfoEntity getEidInfo() {
        return (EidInfoEntity) EidRepoImplKt.onSuccess(this.eidDeviceApi.getEidInfo(), d.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public EidDigitalInfo getEidQrCode() {
        return (EidDigitalInfo) EidRepoImplKt.onSuccess(this.webApi.getEidQrCode(), e.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public EidStatus getEidStatus(@NotNull String queryType, @Nullable String requestId) {
        return (EidStatus) EidRepoImplKt.onSuccess(this.webApi.getEidStatus(queryType, requestId), f.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public String getRequestId() {
        return (String) EidRepoImplKt.onSuccess(this.eidDeviceApi.getRequestId(), g.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    public void issueEid(@NotNull String bizSerialNumber) throws Exception {
        EidRepoImplKt.onSuccess(this.webApi.issueEid(bizSerialNumber), h.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    public boolean postResult(@NotNull String bizSerialNumber, @NotNull String requestId, @NotNull String eidLevel, @NotNull String carrierType, @Nullable String phoneNum, @NotNull EidInfoEntity eidInfo) {
        return ((Boolean) EidRepoImplKt.onSuccess(this.webApi.postResult(bizSerialNumber, requestId, eidLevel, carrierType, phoneNum, eidInfo), i.a)).booleanValue();
    }

    @Override // com.huami.eid.ui.api.EidApi
    public void revoke() throws Exception {
        EidRepoImplKt.onSuccess(this.webApi.revoke(), j.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public String sign(@NotNull String cmd) {
        return (String) EidRepoImplKt.onSuccess(this.eidDeviceApi.sign(cmd), k.a);
    }

    @Override // com.huami.eid.ui.api.EidApi
    public boolean unlock() {
        return ((Boolean) EidRepoImplKt.onSuccess(this.eidDeviceApi.unlock(), l.a)).booleanValue();
    }

    @Override // com.huami.eid.ui.api.EidApi
    @NotNull
    public String writeCert(@NotNull String cmd) {
        return (String) EidRepoImplKt.onSuccess(this.eidDeviceApi.writeCert(cmd), m.a);
    }
}
