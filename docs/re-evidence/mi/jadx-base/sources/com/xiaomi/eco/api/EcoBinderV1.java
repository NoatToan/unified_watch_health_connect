package com.xiaomi.eco.api;

import android.os.Build;
import com.xiaomi.eco.EcoApiCallConfig;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.api.EcoBinderV1;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.ec0;
import defpackage.ga0;
import defpackage.ob0;
import defpackage.r90;
import defpackage.u7r;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/eco/api/EcoBinderV1;", "Lcom/xiaomi/eco/api/e;", "", "bindKey", "", "getBindInfo", "(Ljava/lang/String;)V", "getBindKey", "()V", "Lga0;", "bindInfo", "bindToServer", "(Lga0;)V", "userId", "token", "model", "did", "mac", "sn", "sendBindResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mNodeId", "Ljava/lang/String;", "Lcom/xiaomi/eco/api/EcoBindToServer;", "mBindToServer", "Lcom/xiaomi/eco/api/EcoBindToServer;", "getBindStatus", "()Lkotlin/Unit;", "bindStatus", "Lcom/xiaomi/eco/api/a;", "apiCall", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/eco/api/a;)V", "Companion", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public class EcoBinderV1 extends e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "EcoBinderV1";

    @NotNull
    private EcoBindToServer mBindToServer;

    @Nullable
    private final String mNodeId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/eco/api/EcoBinderV1$Companion;", "", "<init>", "()V", "TAG", "", "generateToken", "", "MD5_12", "text", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] MD5_12(String text) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
                byte[] bytes = text.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                messageDigest.update(bytes, 0, text.length());
                byte[] bArrDigest = messageDigest.digest();
                int length = bArrDigest.length;
                if (length < 12) {
                    return ByteUtil.EMPTY_BYTES;
                }
                int i = length / 2;
                return Arrays.copyOfRange(bArrDigest, i - 6, i + 6);
            } catch (NoSuchAlgorithmException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] generateToken() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            double dNextDouble = new Random(System.currentTimeMillis()).nextDouble();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("token.%d.%f", Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis), Double.valueOf(dNextDouble)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return MD5_12(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoBinderV1(@NotNull String userId, @Nullable String str, @NotNull a<?> apiCall) {
        super(userId, apiCall);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        this.mNodeId = str;
        EcoApiCallConfig mEcoApiCallConfig = EcoApiCallManager.INSTANCE.get().getMEcoApiCallConfig();
        Intrinsics.checkNotNull(mEcoApiCallConfig, "null cannot be cast to non-null type com.xiaomi.eco.api.EcoBindToServer");
        this.mBindToServer = (EcoBindToServer) mEcoApiCallConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_bindStatus_$lambda$0(EcoBinderV1 this$0, EcoApiResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this$0.isCancelled()) {
            return;
        }
        if (result.f()) {
            if (result.e().o().s()) {
                this$0.mCallback.onBindFailure(1003, "device have bound");
                return;
            } else {
                this$0.getBindKey();
                return;
            }
        }
        this$0.mCallback.onBindFailure(1002, "apiCode:" + result.a());
    }

    private final void bindToServer(final ga0 bindInfo) {
        Logger.i(TAG, "bindToServer() called");
        EcoBindToServerKt.setNodeId(bindInfo, this.mNodeId);
        EcoBindToServerKt.setToken(bindInfo, ByteUtil.byteToString(INSTANCE.generateToken()));
        this.mBindToServer.bindWithSign(bindInfo, new Function1() { // from class: ei7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBinderV1.bindToServer$lambda$4(this.f16671a, bindInfo, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: fi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBinderV1.bindToServer$lambda$5(this.f17806a, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToServer$lambda$4(EcoBinderV1 this$0, ga0 bindInfo, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindInfo, "$bindInfo");
        String mUserId = this$0.mUserId;
        Intrinsics.checkNotNullExpressionValue(mUserId, "mUserId");
        String token = EcoBindToServerKt.getToken(bindInfo);
        String model = bindInfo.e;
        Intrinsics.checkNotNullExpressionValue(model, "model");
        String did = bindInfo.d;
        Intrinsics.checkNotNullExpressionValue(did, "did");
        String mac = bindInfo.f;
        Intrinsics.checkNotNullExpressionValue(mac, "mac");
        String serialNumber = bindInfo.h;
        Intrinsics.checkNotNullExpressionValue(serialNumber, "serialNumber");
        this$0.sendBindResult(mUserId, token, model, did, mac, serialNumber);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToServer$lambda$5(EcoBinderV1 this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mCallback.onBindFailure(1008, "message:" + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void getBindInfo(String bindKey) {
        Logger.i(TAG, "getBindInfo() called ");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 1;
        r90 r90Var = new r90();
        r90Var.N(bindKey);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, true, new p.a() { // from class: di7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                EcoBinderV1.getBindInfo$lambda$1(this.f15548a, ecoApiResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBindInfo$lambda$1(EcoBinderV1 this$0, EcoApiResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this$0.isCancelled()) {
            return;
        }
        if (!result.f()) {
            this$0.mCallback.onBindFailure(1005, "apiCode: " + result.a());
            return;
        }
        ga0 ga0VarQ = result.e().o().q();
        if (ga0VarQ != null) {
            this$0.bindToServer(ga0VarQ);
            return;
        }
        int iT = result.e().o().t();
        if (iT == 1) {
            this$0.mCallback.onBindFailure(1003, "device have bound");
            return;
        }
        this$0.mCallback.onBindFailure(1005, "apiCode:" + iT);
    }

    private final void getBindKey() {
        Logger.i(TAG, "getBindKey() called");
        this.mBindToServer.getBindKey(new Function1() { // from class: ai7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBinderV1.getBindKey$lambda$2(this.f1047a, (String) obj);
            }
        }, new Function1() { // from class: bi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBinderV1.getBindKey$lambda$3(this.f4239a, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$2(EcoBinderV1 this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getBindInfo(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$3(EcoBinderV1 this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mCallback.onBindFailure(1005, "message:" + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void sendBindResult(String userId, String token, final String model, final String did, final String mac, final String sn) {
        Logger.i(TAG, "sendBindResult() called()");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 2;
        ec0 ec0Var = new ec0();
        ec0Var.c = 0;
        ec0Var.d = Build.VERSION.SDK_INT;
        ob0 ob0Var = new ob0();
        ob0Var.c = userId;
        ob0Var.d = token;
        ob0Var.e = ec0Var;
        r90 r90Var = new r90();
        r90Var.O(ob0Var);
        u7rVar.z(r90Var);
        this.mApiTask = this.mApiCall.call(u7rVar, false, new p.a() { // from class: zh7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                EcoBinderV1.sendBindResult$lambda$6(this.f41267a, did, model, mac, sn, ecoApiResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendBindResult$lambda$6(EcoBinderV1 this$0, String did, String model, String mac, String sn, EcoApiResult result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(sn, "$sn");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this$0.isCancelled()) {
            return;
        }
        if (result.f()) {
            this$0.mApiCall.updateDid(did);
            this$0.mCallback.onBindSuccess(model, did, mac, sn);
            return;
        }
        this$0.mCallback.onBindFailure(1009, "apiCode: " + result.a());
    }

    @NotNull
    public final Unit getBindStatus() {
        Logger.i(TAG, "getBindStatus() called");
        u7r u7rVar = new u7r();
        u7rVar.e = 1;
        u7rVar.f = 0;
        this.mApiTask = this.mApiCall.callTimeout(u7rVar, true, new p.a() { // from class: ci7
            @Override // com.xiaomi.eco.api.p.a
            public final void onCallback(EcoApiResult ecoApiResult) {
                EcoBinderV1._get_bindStatus_$lambda$0(this.f5366a, ecoApiResult);
            }
        }, 15000);
        return Unit.INSTANCE;
    }
}
