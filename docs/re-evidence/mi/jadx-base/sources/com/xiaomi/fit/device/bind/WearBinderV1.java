package com.xiaomi.fit.device.bind;

import android.os.Build;
import com.xiaomi.fit.device.bind.WearBinderV1;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.ApiCallConfigImpl;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.cc0;
import defpackage.dsf;
import defpackage.ea0;
import defpackage.mb0;
import defpackage.om5;
import defpackage.p90;
import defpackage.s7r;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/device/bind/WearBinderV1;", "Lcom/xiaomi/fit/device/bind/a;", "", "bindKey", "", "getBindInfo", "(Ljava/lang/String;)V", "getBindKey", "()V", "Lea0;", "bindInfo", "bindToServer", "(Lea0;)V", "userId", "token", "model", "did", "mac", "sn", "sendBindResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mNodeId", "Ljava/lang/String;", "Lcom/xiaomi/fit/device/bind/BindToServer;", "mBindToServer", "Lcom/xiaomi/fit/device/bind/BindToServer;", "getBindStatus", "()Lkotlin/Unit;", "bindStatus", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "<init>", "(Ljava/lang/String;Lcom/xiaomi/wearable/core/DeviceInfo;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class WearBinderV1 extends a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "WearBinderV1";

    @NotNull
    private BindToServer mBindToServer;

    @Nullable
    private final String mNodeId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/device/bind/WearBinderV1$Companion;", "", "<init>", "()V", "TAG", "", "generateToken", "", "MD5_12", "text", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public WearBinderV1(@Nullable String str, @NotNull DeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.mNodeId = str;
        this.mBindToServer = ApiCallConfigImpl.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindToServer(final ea0 bindInfo) {
        Logger.i(TAG, "bindToServer() called " + bindInfo.e);
        BindToServerKt.setNodeId(bindInfo, this.mNodeId);
        BindToServerKt.setToken(bindInfo, ByteUtil.byteToString(INSTANCE.generateToken()));
        this.mBindToServer.bindWithSign(bindInfo, new Function1() { // from class: a7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearBinderV1.bindToServer$lambda$2(this.f744a, bindInfo, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: b7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearBinderV1.bindToServer$lambda$3(this.f3901a, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToServer$lambda$2(WearBinderV1 this$0, ea0 bindInfo, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindInfo, "$bindInfo");
        String mUserId = this$0.mUserId;
        Intrinsics.checkNotNullExpressionValue(mUserId, "mUserId");
        String token = BindToServerKt.getToken(bindInfo);
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
    public static final Unit bindToServer$lambda$3(WearBinderV1 this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mCallback.onBindFailure(1008, "message:" + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void getBindInfo(String bindKey) {
        Logger.i(TAG, "getBindInfo() called ");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 1;
        p90 p90Var = new p90();
        p90Var.E(bindKey);
        s7rVar.M(p90Var);
        byte[] bArrI = dsf.i(s7rVar);
        IMiWearCoreClient companion = IMiWearCoreClient.INSTANCE.getInstance();
        String address = this.mDeviceInfo.getAddress();
        Intrinsics.checkNotNull(bArrI);
        companion.unauthCall(address, bArrI, true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.WearBinderV1.getBindInfo.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult result) {
                if (WearBinderV1.this.isCancelled()) {
                    return;
                }
                if (result == null || !result.d()) {
                    WearBinderV1.this.mCallback.onBindFailure(1005, "apiCode: " + (result != null ? Integer.valueOf(result.a()) : null));
                    return;
                }
                s7r s7rVarB = om5.b(result.c());
                ea0 ea0VarO = s7rVarB.o().o();
                if (ea0VarO != null) {
                    WearBinderV1.this.bindToServer(ea0VarO);
                    return;
                }
                int iR = s7rVarB.o().r();
                if (iR == 1) {
                    WearBinderV1.this.mCallback.onBindFailure(1003, "device have bound");
                    return;
                }
                WearBinderV1.this.mCallback.onBindFailure(1005, "apiCode:" + iR);
            }
        }, 15000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBindKey() {
        Logger.i(TAG, "getBindKey() called");
        this.mBindToServer.getBindKey(new Function1() { // from class: c7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearBinderV1.getBindKey$lambda$0(this.f5030a, (String) obj);
            }
        }, new Function1() { // from class: d7r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearBinderV1.getBindKey$lambda$1(this.f15200a, (Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$0(WearBinderV1 this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getBindInfo(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$1(WearBinderV1 this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mCallback.onBindFailure(1005, "message:" + it.getMessage());
        return Unit.INSTANCE;
    }

    private final void sendBindResult(String userId, String token, final String model, final String did, final String mac, final String sn) {
        Logger.i(TAG, "sendBindResult() called()");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 2;
        cc0 cc0Var = new cc0();
        cc0Var.c = 0;
        cc0Var.d = Build.VERSION.SDK_INT;
        mb0 mb0Var = new mb0();
        mb0Var.c = userId;
        mb0Var.d = token;
        mb0Var.e = cc0Var;
        p90 p90Var = new p90();
        p90Var.F(mb0Var);
        s7rVar.M(p90Var);
        byte[] bArrI = dsf.i(s7rVar);
        IMiWearCoreClient companion = IMiWearCoreClient.INSTANCE.getInstance();
        String address = this.mDeviceInfo.getAddress();
        Intrinsics.checkNotNull(bArrI);
        companion.unauthCall(address, bArrI, false, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.WearBinderV1.sendBindResult.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult result) {
                if (WearBinderV1.this.isCancelled()) {
                    return;
                }
                if (result != null && result.d()) {
                    WearBinderV1.this.mCallback.onBindSuccess(model, did, mac, sn);
                    return;
                }
                WearBinderV1.this.mCallback.onBindFailure(1009, "apiCode: " + (result != null ? Integer.valueOf(result.a()) : null));
            }
        }, 8000);
    }

    @NotNull
    public final Unit getBindStatus() {
        Logger.i(TAG, "getBindStatus() called");
        s7r s7rVar = new s7r();
        s7rVar.e = 1;
        s7rVar.f = 0;
        byte[] bArrI = dsf.i(s7rVar);
        IMiWearCoreClient companion = IMiWearCoreClient.INSTANCE.getInstance();
        String address = this.mDeviceInfo.getAddress();
        Intrinsics.checkNotNull(bArrI);
        companion.unauthCall(address, bArrI, true, new ICallback.Stub() { // from class: com.xiaomi.fit.device.bind.WearBinderV1$bindStatus$1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult result) {
                if (this.this$0.isCancelled()) {
                    return;
                }
                if (result != null && result.d()) {
                    if (om5.b(result.c()).o().q()) {
                        this.this$0.mCallback.onBindFailure(1003, "device have bound");
                        return;
                    } else {
                        this.this$0.getBindKey();
                        return;
                    }
                }
                this.this$0.mCallback.onBindFailure(1002, "apiCode:" + (result != null ? Integer.valueOf(result.a()) : null));
            }
        }, 15000);
        return Unit.INSTANCE;
    }
}
