package com.xiaomi.fitness.eco.device.manager.api;

import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest;
import com.xiaomi.fitness.eco.device.manager.api.model.EcoProxyData;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JJ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\rH\u0002J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0002\u0010\u0012J>\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001bJf\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/api/EcoProxyRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoProxyService;", "<init>", "()V", "getEcoApiProxy", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "eco_api", "", "params", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProxyData;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getEcoApiProxySync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDeviceSport", "data", "uid", "did", "model", MiuiCursorConstants.CREATE_TIME, "", "update_time", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordToEcoServer", "mac", "sn", DeviceContractKt.COLUMN_DEVICE_TYPE, "firmware_version", "activation_time", "", "other_data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoProxyRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoProxyRequest.kt\ncom/xiaomi/fitness/eco/device/manager/api/EcoProxyRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,102:1\n110#2,2:103\n141#2:105\n31#3:106\n28#3,2:107\n*S KotlinDebug\n*F\n+ 1 EcoProxyRequest.kt\ncom/xiaomi/fitness/eco/device/manager/api/EcoProxyRequest\n*L\n28#1:103,2\n45#1:105\n45#1:106\n45#1:107,2\n*E\n"})
public final class EcoProxyRequest extends BaseRequest<EcoProxyService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest$getEcoApiProxy$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/eco/device/manager/api/model/EcoProxyData;", "it", "Lcom/xiaomi/fitness/eco/device/manager/api/EcoProxyService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest$getEcoApiProxy$2", f = "EcoProxyRequest.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<EcoProxyService, Continuation<? super BaseResult<EcoProxyData>>, Object> {
        final /* synthetic */ Ref.ObjectRef<JSONObject> $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<JSONObject> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EcoProxyService ecoProxyService, Continuation<? super BaseResult<EcoProxyData>> continuation) {
            return ((AnonymousClass2) create(ecoProxyService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EcoProxyService ecoProxyService = (EcoProxyService) this.L$0;
                String string = this.$data.element.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = ecoProxyService.getEcoApiProxy(string, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest$getEcoApiProxySync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.eco.device.manager.api.EcoProxyRequest", f = "EcoProxyRequest.kt", i = {}, l = {45}, m = "getEcoApiProxySync", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcoProxyRequest.this.getEcoApiProxySync(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    private final void getEcoApiProxy(CoroutineScope scope, String eco_api, String params, Function1<? super EcoProxyData, Unit> success, Function1<? super ApiException, Unit> error) throws JSONException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? jSONObject = new JSONObject();
        objectRef.element = jSONObject;
        jSONObject.put("eco_api", eco_api);
        ((JSONObject) objectRef.element).put("params", params);
        EcoDeviceModelExtKt.logd("EcoProxyRequest", "getEcoApiProxy() data = " + objectRef.element);
        Intrinsics.checkNotNull(scope);
        new HttpFlow(scope, getMService(), new AnonymousClass2(objectRef, null)).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getEcoApiProxy$default(EcoProxyRequest ecoProxyRequest, CoroutineScope coroutineScope, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) throws JSONException {
        if ((i & 16) != 0) {
            function2 = new Function1() { // from class: bw7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return EcoProxyRequest.getEcoApiProxy$lambda$0((ApiException) obj2);
                }
            };
        }
        ecoProxyRequest.getEcoApiProxy(coroutineScope, str, str2, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEcoApiProxy$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEcoApiProxySync(String str, String str2, Continuation<? super EcoProxyData> continuation) throws JSONException {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object ecoApiProxy = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(ecoApiProxy);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eco_api", str);
            jSONObject.put("params", str2);
            EcoDeviceModelExtKt.logd("EcoProxyRequest", "getEcoApiProxySync() data = " + jSONObject);
            EcoProxyService mService = getMService();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            anonymousClass1.label = 1;
            ecoApiProxy = mService.getEcoApiProxy(string, anonymousClass1);
            if (ecoApiProxy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(ecoApiProxy);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(ecoApiProxy);
    }

    @Nullable
    public final Object addDeviceSport(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2, @NotNull Continuation<? super EcoProxyData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", str);
        jSONObject.put("uid", str2);
        jSONObject.put("did", str3);
        jSONObject.put("model", str4);
        jSONObject.put(MiuiCursorConstants.CREATE_TIME, i);
        jSONObject.put("update_time", i2);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("eco/general-equipment/common/sport/add", string, continuation);
    }

    @Nullable
    public final Object recordToEcoServer(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j, @NotNull String str8, long j2, long j3, @NotNull Continuation<? super EcoProxyData> continuation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", str);
        jSONObject.put("mac", str2);
        jSONObject.put("did", str3);
        jSONObject.put("sn", str4);
        jSONObject.put("deviceType", str5);
        jSONObject.put("model", str6);
        jSONObject.put("firmwareVersion", str7);
        jSONObject.put("activationTime", j);
        jSONObject.put("otherData", str8);
        jSONObject.put("createTime", j2);
        jSONObject.put("updateTime", j3);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return getEcoApiProxySync("eco/general-equipment/common/device/add", string, continuation);
    }
}
