package com.huami.nfc.eid;

import com.huami.nfc.base.ErrorCodeConstant;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseExtensionsKt;
import com.huami.nfc.eid.api.EidDeviceApi;
import com.huami.nfc.eid.entities.EidInfoEntity;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/nfc/eid/EidDeviceApiWithLog;", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "", Constant.h, "Lcom/huami/nfc/base/PayResponse;", "writeCert", "getRequestId", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "getEidInfo", "", "checkPwdStatus", "unlock", "sign", "a", "Lcom/huami/nfc/eid/api/EidDeviceApi;", "api", "<init>", "(Lcom/huami/nfc/eid/api/EidDeviceApi;)V", "nfc-eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidDeviceApiWithLog implements EidDeviceApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EidDeviceApi api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<PayResponse<? extends Boolean>, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Boolean> payResponse) {
            return "设备未设置锁屏密码(SE)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/eid/entities/EidInfoEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<PayResponse<? extends EidInfoEntity>, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<EidInfoEntity> payResponse) {
            return "穿戴设备读取eID卡信息(SE)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "获取REQID(SE)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "在线认证 eid签名(SE)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<PayResponse<? extends Boolean>, String> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<Boolean> payResponse) {
            return "穿戴设备解锁(SE)";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<PayResponse<? extends String>, String> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull PayResponse<String> payResponse) {
            return "穿戴设备写证书失败(SE)";
        }
    }

    public EidDeviceApiWithLog(@NotNull EidDeviceApi eidDeviceApi) {
        this.api = eidDeviceApi;
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<Boolean> checkPwdStatus() {
        return PayResponseExtensionsKt.logcat(this.api.checkPwdStatus(), ErrorCodeConstant.NFC_EID_UNSET_PWD, a.a);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<EidInfoEntity> getEidInfo() {
        return PayResponseExtensionsKt.logcat(this.api.getEidInfo(), ErrorCodeConstant.NFC_EID_GET_INFO, b.a);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> getRequestId() {
        return PayResponseExtensionsKt.logcat(this.api.getRequestId(), ErrorCodeConstant.NFC_EID_GET_REQID, c.a);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> sign(@NotNull String cmd) {
        return PayResponseExtensionsKt.logcat(this.api.sign(cmd), ErrorCodeConstant.NFC_EID_SIGN, d.a);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<Boolean> unlock() {
        return PayResponseExtensionsKt.logcat(this.api.unlock(), ErrorCodeConstant.NFC_EID_UNLOCK, e.a);
    }

    @Override // com.huami.nfc.eid.api.EidDeviceApi
    @NotNull
    public PayResponse<String> writeCert(@NotNull String cmd) {
        return PayResponseExtensionsKt.logcat(this.api.writeCert(cmd), ErrorCodeConstant.NFC_EID_WRITE_CERT, f.a);
    }
}
