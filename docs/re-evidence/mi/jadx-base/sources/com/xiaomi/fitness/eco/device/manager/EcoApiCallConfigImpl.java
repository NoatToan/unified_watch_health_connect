package com.xiaomi.fitness.eco.device.manager;

import android.util.Base64;
import com.google.gson.Gson;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.eco.Data;
import com.xiaomi.eco.EcoApiCallConfig;
import com.xiaomi.eco.EcoApplyBindInfo;
import com.xiaomi.eco.EcoBindResponse;
import com.xiaomi.eco.EcoBindResult;
import com.xiaomi.eco.EcoLocalBindResult;
import com.xiaomi.eco.EcoVerifyBindInfo;
import com.xiaomi.eco.api.EcoBindToServer;
import com.xiaomi.eco.api.EcoBindToServerKt;
import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.connect.export.EcoExternalRetryStrategy;
import com.xiaomi.fitness.device.eco.manager.api.model.BindHelloInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl;
import com.xiaomi.fitness.eco.device.manager.api.EcoDeviceRequest;
import com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest;
import com.xiaomi.fitness.eco.device.manager.api.model.BindECDHInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.BindSignInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.ConfirmBindInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.eco.device.manager.api.model.EcoProxyData;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoProductManager;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.ga0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b`\u0010aJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001d\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b\"\u0010#J{\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b-\u0010.Jc\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b4\u00105JC\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b7\u00108Jc\u0010<\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b<\u00105JM\u0010=\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b=\u0010>JK\u0010?\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\b?\u0010>J;\u0010B\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\bB\u0010CJ?\u0010H\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020$H\u0016¢\u0006\u0004\bH\u0010IJg\u0010O\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010K\u001a\u00020\u00032\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010F\u001a\u00020L2\u0006\u0010G\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010PJS\u0010R\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u000e0\u00182\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u000e0\u0018H\u0016¢\u0006\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoApiCallConfigImpl;", "Lcom/xiaomi/eco/EcoApiCallConfig;", "Lcom/xiaomi/eco/api/EcoBindToServer;", "", "model", "", "isEcoScale", "(Ljava/lang/String;)Z", "did", "Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "getDeviceInfoById", "(Ljava/lang/String;)Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "Lcom/xiaomi/fitness/connect/export/EcoExternalRetryStrategy;", "externalRetryStrategy", "", "registerRetryCondition", "(Ljava/lang/String;Lcom/xiaomi/fitness/connect/export/EcoExternalRetryStrategy;)V", "unregisterRetryCondition", "(Ljava/lang/String;)V", "getExternalRetryCondition", "(Ljava/lang/String;)Lcom/xiaomi/fitness/connect/export/EcoExternalRetryStrategy;", "isConnectActive", "getPhoneId", "()Ljava/lang/String;", "Lkotlin/Function1;", "success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fail", "getBindKey", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lga0;", "bindInfo", "error", "bindWithSign", "(Lga0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "verifyMode", "mac", "randomMac", "phoneId", "sn", "", "deviceRandom", "Lcom/xiaomi/eco/EcoApplyBindInfo;", "applyBind", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindIndex", "bindDid", CommonConstants.KEY_PUB_KEY, "deviceSign", "Lcom/xiaomi/eco/EcoVerifyBindInfo;", "verifyBind", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "shareId", "verifyShareBind", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "locale", "bindSign", "Lcom/xiaomi/eco/EcoBindResult;", "confirmBind", "confirmShareBind", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "unbind", "identifier", "name", "recordDevices", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "data", "uid", MiuiCursorConstants.CREATE_TIME, "update_time", "addDeviceSport", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", DeviceContractKt.COLUMN_DEVICE_TYPE, "firmware_version", "", "activation_time", "other_data", "recordToEcoServer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJ)V", "Lcom/xiaomi/eco/EcoLocalBindResult;", "recordToServer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;", "mEcoDeviceRequest$delegate", "Lkotlin/Lazy;", "getMEcoDeviceRequest", "()Lcom/xiaomi/fitness/eco/device/manager/api/EcoDeviceRequest;", "mEcoDeviceRequest", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "bindScaleRequest", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleRequest;", "Ljava/util/concurrent/ConcurrentHashMap;", "externalRetryStrategyMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoApiCallConfigImpl implements EcoApiCallConfig, EcoBindToServer {

    /* JADX INFO: renamed from: mEcoDeviceRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcoDeviceRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: md7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoApiCallConfigImpl.mEcoDeviceRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final ElectronicScaleRequest bindScaleRequest = ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE);

    @NotNull
    private final ConcurrentHashMap<String, EcoExternalRetryStrategy> externalRetryStrategyMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$addDeviceSport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$addDeviceSport$1", f = "EcoApiCallConfigImpl.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $create_time;
        final /* synthetic */ String $data;
        final /* synthetic */ String $did;
        final /* synthetic */ String $model;
        final /* synthetic */ String $uid;
        final /* synthetic */ int $update_time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = str;
            this.$uid = str2;
            this.$did = str3;
            this.$model = str4;
            this.$create_time = i;
            this.$update_time = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$data, this.$uid, this.$did, this.$model, this.$create_time, this.$update_time, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoProxyRequest ecoProxyRequest = new EcoProxyRequest();
                String str = this.$data;
                String str2 = this.$uid;
                String str3 = this.$did;
                String str4 = this.$model;
                int i2 = this.$create_time;
                int i3 = this.$update_time;
                this.label = 1;
                obj = ecoProxyRequest.addDeviceSport(str, str2, str3, str4, i2, i3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EcoDeviceModelExtKt.logi("addDeviceSport sid is " + ((EcoProxyData) obj));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$recordDevices$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$recordDevices$1", f = "EcoApiCallConfigImpl.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ String $model;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22431(String str, String str2, String str3, Function1<? super String, Unit> function1, Continuation<? super C22431> continuation) {
            super(2, continuation);
            this.$identifier = str;
            this.$model = str2;
            this.$name = str3;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EcoApiCallConfigImpl.this.new C22431(this.$identifier, this.$model, this.$name, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoDeviceRequest mEcoDeviceRequest = EcoApiCallConfigImpl.this.getMEcoDeviceRequest();
                String str = this.$identifier;
                String str2 = this.$model;
                String str3 = this.$name;
                this.label = 1;
                obj = mEcoDeviceRequest.recordDevices(str, str2, str3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceRecordInfo deviceRecordInfo = (DeviceRecordInfo) obj;
            this.$success.invoke2(deviceRecordInfo.getSid());
            EcoDeviceModelExtKt.logi("recordDevices sid is " + deviceRecordInfo.getSid());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$recordToEcoServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.EcoApiCallConfigImpl$recordToEcoServer$1", f = "EcoApiCallConfigImpl.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $activation_time;
        final /* synthetic */ long $create_time;
        final /* synthetic */ String $device_type;
        final /* synthetic */ String $did;
        final /* synthetic */ String $firmware_version;
        final /* synthetic */ String $mac;
        final /* synthetic */ String $model;
        final /* synthetic */ String $other_data;
        final /* synthetic */ String $sn;
        final /* synthetic */ String $uid;
        final /* synthetic */ long $update_time;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22441(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, long j2, long j3, Continuation<? super C22441> continuation) {
            super(2, continuation);
            this.$uid = str;
            this.$mac = str2;
            this.$did = str3;
            this.$sn = str4;
            this.$device_type = str5;
            this.$model = str6;
            this.$firmware_version = str7;
            this.$activation_time = j;
            this.$other_data = str8;
            this.$create_time = j2;
            this.$update_time = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22441(this.$uid, this.$mac, this.$did, this.$sn, this.$device_type, this.$model, this.$firmware_version, this.$activation_time, this.$other_data, this.$create_time, this.$update_time, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objRecordToEcoServer;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoProxyRequest ecoProxyRequest = new EcoProxyRequest();
                String str = this.$uid;
                String str2 = this.$mac;
                String str3 = this.$did;
                String str4 = this.$sn;
                String str5 = this.$device_type;
                String str6 = this.$model;
                String str7 = this.$firmware_version;
                long j = this.$activation_time;
                String str8 = this.$other_data;
                long j2 = this.$create_time;
                long j3 = this.$update_time;
                this.label = 1;
                objRecordToEcoServer = ecoProxyRequest.recordToEcoServer(str, str2, str3, str4, str5, str6, str7, j, str8, j2, j3, this);
                if (objRecordToEcoServer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objRecordToEcoServer = obj;
            }
            EcoDeviceModelExtKt.logi("recordToEcoServer result is " + ((EcoProxyData) objRecordToEcoServer));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addDeviceSport$lambda$8(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge$default("addDeviceSport errorMsg=" + it.getMessage(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyBind$lambda$2(Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = ((EcoBindResponse) new Gson().fromJson(it.getResp(), EcoBindResponse.class)).getData();
        success.invoke2(new EcoApplyBindInfo(data.getBindIndex(), data.getBindDid(), data.getPubS(), data.getSignS(), data.getRandomS()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmBind$lambda$5(Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = ((EcoBindResponse) new Gson().fromJson(it.getResp(), EcoBindResponse.class)).getData();
        success.invoke2(new EcoBindResult(Integer.parseInt(data.getRet()), data.isSuccess()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmShareBind$lambda$6(Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = ((EcoBindResponse) new Gson().fromJson(it.getResp(), EcoBindResponse.class)).getData();
        success.invoke2(new EcoBindResult(Integer.parseInt(data.getRet()), data.isSuccess()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcoDeviceRequest getMEcoDeviceRequest() {
        return (EcoDeviceRequest) this.mEcoDeviceRequest.getValue();
    }

    private final boolean isEcoScale(String model) {
        return EcoBindDeviceInfo.INSTANCE.isEcoScale(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceRequest mEcoDeviceRequest_delegate$lambda$0() {
        return new EcoDeviceRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordDevices$lambda$7(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge$default("recordDevices errorMsg=" + it.getMessage(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordToEcoServer$lambda$9(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDeviceModelExtKt.loge$default("recordToEcoServer errorMsg=" + it.getMessage(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyBind$lambda$3(Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = ((EcoBindResponse) new Gson().fromJson(it.getResp(), EcoBindResponse.class)).getData();
        success.invoke2(new EcoVerifyBindInfo(data.getDeviceKey(), Integer.parseInt(data.getOobCode()), data.getBindKey(), null, null, null, 56, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyShareBind$lambda$4(Function1 success, ScaleData it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = ((EcoBindResponse) new Gson().fromJson(it.getResp(), EcoBindResponse.class)).getData();
        success.invoke2(new EcoVerifyBindInfo("", 0, "", data.getSignShareData(), data.getEncShareData(), data.getShaTokenKey()));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void addDeviceSport(@NotNull String data, @NotNull String uid, @NotNull String did, @NotNull String model, int create_time, int update_time) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        ScopeExtKt.scopeNet$default(null, new AnonymousClass1(data, uid, did, model, create_time, update_time, null), 1, null).m503catch(new Function2() { // from class: jd7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoApiCallConfigImpl.addDeviceSport$lambda$8((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void applyBind(int verifyMode, @NotNull String model, @NotNull String mac, @NotNull String randomMac, @NotNull String phoneId, @NotNull String sn, @NotNull String did, @NotNull byte[] deviceRandom, @NotNull final Function1<? super EcoApplyBindInfo, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(randomMac, "randomMac");
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceRandom, "deviceRandom");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (!isEcoScale(model)) {
            String strEncodeToString = Base64.encodeToString(deviceRandom, 10);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            getMEcoDeviceRequest().applyBind(new BindHelloInfo(verifyMode, model, mac, randomMac, phoneId, sn, did, strEncodeToString), success, error);
        } else {
            String strEncodeToString2 = Base64.encodeToString(deviceRandom, 10);
            ElectronicScaleRequest electronicScaleRequest = this.bindScaleRequest;
            Intrinsics.checkNotNull(strEncodeToString2);
            EcoProduct ecoProduct = (EcoProduct) EcoDeviceManagerExtKt.getInstance(EcoProductManager.INSTANCE).getProductByModel(model);
            electronicScaleRequest.hello(verifyMode, did, model, sn, mac, strEncodeToString2, ecoProduct != null ? ecoProduct.getProductName() : null, new Function1() { // from class: kd7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoApiCallConfigImpl.applyBind$lambda$2(success, (ScaleData) obj);
                }
            }, error);
        }
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void bindWithSign(@NotNull ga0 bindInfo, @NotNull Function1<? super Boolean, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
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
        BindSignInfo bindSignInfo = new BindSignInfo(bindKey, did, model, mac, sign, EcoBindToServerKt.getToken(bindInfo), null, 64, null);
        String str = bindInfo.h;
        String nodeId = EcoBindToServerKt.getNodeId(bindInfo);
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
        getMEcoDeviceRequest().bindWithSign(bindSignInfo, success, error);
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void confirmBind(@NotNull String locale, @NotNull String bindIndex, @NotNull String bindDid, @NotNull String bindSign, @NotNull String model, @NotNull final Function1<? super EcoBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(bindSign, "bindSign");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (isEcoScale(model)) {
            this.bindScaleRequest.bind(bindIndex, bindSign, bindDid, "", "", "", "", new Function1() { // from class: ld7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoApiCallConfigImpl.confirmBind$lambda$5(success, (ScaleData) obj);
                }
            }, error);
        } else {
            getMEcoDeviceRequest().confirmBind(new ConfirmBindInfo(bindIndex, bindDid, bindSign), success, error);
        }
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void confirmShareBind(@NotNull String shareId, @Nullable String bindDid, @NotNull final Function1<? super EcoBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.shareBind(shareId, bindDid, "", "", new Function1() { // from class: gd7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoApiCallConfigImpl.confirmShareBind$lambda$6(success, (ScaleData) obj);
            }
        }, error);
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void getBindKey(@NotNull Function1<? super String, Unit> success, @NotNull Function1<? super Exception, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getMEcoDeviceRequest().getBindKey(success, fail);
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    @Nullable
    public EcoConnectDeviceInfo getDeviceInfoById(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        EcoConnectDeviceInfo.PrivateUUID privateUUID = null;
        if (ecoDeviceModel == null) {
            return null;
        }
        Product product = ecoDeviceModel.getProduct();
        EcoConnectDeviceInfo ecoConnectDeviceInfo = new EcoConnectDeviceInfo(null, null, 0, null, null, 0, null, false, 255, null);
        ecoConnectDeviceInfo.setAccessType(product.getAccessType());
        ecoConnectDeviceInfo.setDid(did);
        ecoConnectDeviceInfo.setMode(product.getModel());
        ecoConnectDeviceInfo.setProductName(product.getProductName());
        ecoConnectDeviceInfo.setType(product.getType());
        ecoConnectDeviceInfo.setMac(com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt.getMac(ecoDeviceModel));
        Product.PrivateUUID privateUUID2 = product.getPrivateUUID();
        if (privateUUID2 != null) {
            privateUUID = new EcoConnectDeviceInfo.PrivateUUID(null, null, null, null, null, null, null, null, 255, null);
            privateUUID.setFitness(privateUUID2.getFitness());
            privateUUID.setMass(privateUUID2.getMass());
            privateUUID.setOtaRX(privateUUID2.getOtaRX());
            privateUUID.setOtaTX(privateUUID2.getOtaTX());
            privateUUID.setProtoRX(privateUUID2.getProtoRX());
            privateUUID.setProtoTX(privateUUID2.getProtoTX());
            privateUUID.setService(privateUUID2.getService());
            privateUUID.setVoice(privateUUID2.getVoice());
        }
        ecoConnectDeviceInfo.setPrivateUUID(privateUUID);
        return ecoConnectDeviceInfo;
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    @Nullable
    public EcoExternalRetryStrategy getExternalRetryCondition(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return this.externalRetryStrategyMap.get(did);
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    @NotNull
    public String getPhoneId() {
        return EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getUniqueIdentify();
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    public boolean isConnectActive(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        return ecoDeviceModel != null && ecoDeviceModel.getIsConnectActive();
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void recordDevices(@NotNull String identifier, @NotNull String model, @NotNull String name, @NotNull Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(success, "success");
        ScopeExtKt.scopeNet$default(null, new C22431(identifier, model, name, success, null), 1, null).m503catch(new Function2() { // from class: od7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoApiCallConfigImpl.recordDevices$lambda$7((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void recordToEcoServer(@NotNull String uid, @NotNull String mac, @NotNull String did, @NotNull String sn, @NotNull String device_type, @NotNull String model, @NotNull String firmware_version, long activation_time, @NotNull String other_data, long create_time, long update_time) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmware_version, "firmware_version");
        Intrinsics.checkNotNullParameter(other_data, "other_data");
        ScopeExtKt.scopeNet$default(null, new C22441(uid, mac, did, sn, device_type, model, firmware_version, activation_time, other_data, create_time, update_time, null), 1, null).m503catch(new Function2() { // from class: hd7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EcoApiCallConfigImpl.recordToEcoServer$lambda$9((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void recordToServer(@NotNull String sn, @NotNull String did, @NotNull String model, @NotNull Function1<? super EcoLocalBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMEcoDeviceRequest().recordLocalBind(sn, did, model, success, error);
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    public void registerRetryCondition(@NotNull String did, @NotNull EcoExternalRetryStrategy externalRetryStrategy) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(externalRetryStrategy, "externalRetryStrategy");
        this.externalRetryStrategyMap.put(did, externalRetryStrategy);
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void unbind(@NotNull String did, @NotNull String model, @NotNull Function1<? super EcoBindResult, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMEcoDeviceRequest().unbind(did, model, success, error);
    }

    @Override // com.xiaomi.eco.EcoApiCallConfig
    public void unregisterRetryCondition(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.externalRetryStrategyMap.remove(did);
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void verifyBind(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String pubKey, @NotNull String deviceSign, @NotNull String model, @NotNull final Function1<? super EcoVerifyBindInfo, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        Intrinsics.checkNotNullParameter(deviceSign, "deviceSign");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        if (isEcoScale(model)) {
            ElectronicScaleRequest.DefaultImpls.ecdh$default(this.bindScaleRequest, bindIndex, bindDid, pubKey, deviceSign, null, new Function1() { // from class: nd7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoApiCallConfigImpl.verifyBind$lambda$3(success, (ScaleData) obj);
                }
            }, error, 16, null);
        } else {
            getMEcoDeviceRequest().verifyBind(new BindECDHInfo(bindIndex, bindDid, pubKey, deviceSign), success, error);
        }
    }

    @Override // com.xiaomi.eco.api.EcoBindToServer
    public void verifyShareBind(@NotNull String shareId, @NotNull final Function1<? super EcoVerifyBindInfo, Unit> success, @NotNull Function1<? super Exception, Unit> error) {
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.bindScaleRequest.shareEcdh(shareId, new Function1() { // from class: id7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoApiCallConfigImpl.verifyShareBind$lambda$4(success, (ScaleData) obj);
            }
        }, error);
    }
}
