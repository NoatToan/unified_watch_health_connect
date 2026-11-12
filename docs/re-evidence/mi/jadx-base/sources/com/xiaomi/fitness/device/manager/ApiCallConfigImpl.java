package com.xiaomi.fitness.device.manager;

import android.util.Base64;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fit.device.bind.BindToServer;
import com.xiaomi.fit.device.bind.BindToServerKt;
import com.xiaomi.fitness.device.manager.ApiCallConfigImpl;
import com.xiaomi.fitness.device.manager.api.DeviceRequest;
import com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.BindECDHInfo;
import com.xiaomi.fitness.device.manager.api.model.BindHelloInfo;
import com.xiaomi.fitness.device.manager.api.model.BindSignInfo;
import com.xiaomi.fitness.device.manager.api.model.BindThirdParty;
import com.xiaomi.fitness.device.manager.api.model.ConfirmBindInfo;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.wearable.ApplyBindInfo;
import com.xiaomi.wearable.BindResult;
import com.xiaomi.wearable.LocalBindResult;
import com.xiaomi.wearable.VerifyBindInfo;
import defpackage.ea0;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J;\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJC\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\u000eJC\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0083\u0001\u0010 \u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b \u0010!Jc\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b'\u0010(Jc\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b,\u0010(JK\u0010-\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b-\u0010.JS\u00100\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00040\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ApiCallConfigImpl;", "Lcom/xiaomi/fit/device/bind/BindToServer;", "Lkotlin/Function1;", "", "", "success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fail", "getBindKey", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", q.f13858b, "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "error", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lea0;", "bindInfo", "", "bindWithSign", "(Lea0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "verifyMode", "model", "mac", "randomMac", "phoneId", "nodeId", "sn", "did", "", "deviceRandom", "Lcom/xiaomi/wearable/ApplyBindInfo;", "applyBind", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindIndex", "bindDid", CommonConstants.KEY_PUB_KEY, "deviceSign", "Lcom/xiaomi/wearable/VerifyBindInfo;", "verifyBind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "locale", "bindSign", "Lcom/xiaomi/wearable/BindResult;", "confirmBind", "unbind", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/wearable/LocalBindResult;", "recordToServer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mDeviceRequest$delegate", "Lkotlin/Lazy;", "getMDeviceRequest", "()Lcom/xiaomi/fitness/device/manager/api/DeviceRequest;", "mDeviceRequest", "Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest;", "mThirdPartyRequest$delegate", "getMThirdPartyRequest", "()Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest;", "mThirdPartyRequest", "<init>", "()V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ApiCallConfigImpl implements BindToServer {

    @NotNull
    public static final ApiCallConfigImpl INSTANCE = new ApiCallConfigImpl();

    /* JADX INFO: renamed from: mDeviceRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDeviceRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sd1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiCallConfigImpl.mDeviceRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mThirdPartyRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mThirdPartyRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: td1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiCallConfigImpl.mThirdPartyRequest_delegate$lambda$1();
        }
    });

    private ApiCallConfigImpl() {
    }

    private final DeviceRequest getMDeviceRequest() {
        return (DeviceRequest) mDeviceRequest.getValue();
    }

    private final ThirdPartyDeviceRequest getMThirdPartyRequest() {
        return (ThirdPartyDeviceRequest) mThirdPartyRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceRequest mDeviceRequest_delegate$lambda$0() {
        return new DeviceRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThirdPartyDeviceRequest mThirdPartyRequest_delegate$lambda$1() {
        return new ThirdPartyDeviceRequest();
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void applyBind(int verifyMode, @NotNull String model, @NotNull String mac, @NotNull String randomMac, @NotNull String phoneId, @NotNull String nodeId, @NotNull String sn, @NotNull String did, @NotNull byte[] deviceRandom, @NotNull Function1<? super ApplyBindInfo, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(randomMac, "randomMac");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceRandom, "deviceRandom");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        String strEncodeToString = Base64.encodeToString(deviceRandom, 10);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        getMDeviceRequest().applyBind(new BindHelloInfo(verifyMode, model, mac, randomMac, phoneId, nodeId, sn, did, strEncodeToString), success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void bindWithSign(@NotNull ea0 bindInfo, @NotNull Function1<? super Boolean, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(bindInfo, "bindInfo");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        String bindKey = bindInfo.c;
        Intrinsics.checkNotNullExpressionValue(bindKey, "bindKey");
        String did = bindInfo.d;
        Intrinsics.checkNotNullExpressionValue(did, "did");
        String model = bindInfo.e;
        Intrinsics.checkNotNullExpressionValue(model, "model");
        String mac = bindInfo.f;
        Intrinsics.checkNotNullExpressionValue(mac, "mac");
        String sign = bindInfo.g;
        Intrinsics.checkNotNullExpressionValue(sign, "sign");
        BindSignInfo bindSignInfo = new BindSignInfo(bindKey, did, model, mac, sign, BindToServerKt.getToken(bindInfo), null, 64, null);
        String str = bindInfo.h;
        String nodeId = BindToServerKt.getNodeId(bindInfo);
        boolean z = !(str == null || str.length() == 0);
        boolean z2 = !(nodeId == null || nodeId.length() == 0);
        if (z || z2) {
            HashMap map = new HashMap(2);
            if (z) {
                map.put("sn", str);
            }
            if (z2) {
                Intrinsics.checkNotNull(nodeId);
                map.put("third_node_id", nodeId);
            }
            bindSignInfo.setExtraValues(map);
        }
        getMDeviceRequest().bindWithSign(bindSignInfo, success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void confirmBind(@NotNull String locale, @NotNull String bindIndex, @NotNull String bindDid, @NotNull String bindSign, @NotNull String model, @NotNull Function1<? super BindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMDeviceRequest().confirmBind(new ConfirmBindInfo(bindIndex, bindDid, bindSign), success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void getBindKey(@NotNull Function1<? super String, Unit> success, @NotNull Function1<? super Exception, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getMDeviceRequest().getBindKey(success, fail);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void recordToServer(@NotNull String sn, @NotNull String did, @NotNull String model, @NotNull Function1<? super LocalBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMDeviceRequest().recordLocalBind(sn, did, model, success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void unbind(@NotNull String did, @NotNull String model, @NotNull Function1<? super BindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMDeviceRequest().unbind(did, model, success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void verifyBind(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String pubKey, @NotNull String deviceSign, @NotNull String model, @NotNull Function1<? super VerifyBindInfo, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        Intrinsics.checkNotNullParameter(deviceSign, "deviceSign");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMDeviceRequest().verifyBind(new BindECDHInfo(bindIndex, bindDid, pubKey, deviceSign), success, error);
    }

    @Override // com.xiaomi.fit.device.bind.BindToServer
    public void getBindKey(@NotNull String appId, @NotNull Function1<? super BindThirdParty, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMThirdPartyRequest().getBindKey(appId, success, error);
    }
}
