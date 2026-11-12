package com.xiaomi.fitness.device.manager.api;

import androidx.collection.ArrayMapKt;
import com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest;
import com.xiaomi.fitness.device.manager.api.model.BindThirdParty;
import com.xiaomi.fitness.device.manager.api.model.DeviceRecordInfo;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0010J\u0089\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u001a`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceBindService;", "<init>", "()V", "getBindKey", "", q.f13858b, "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "thirdPartyBind", "identifier", "model", "name", "mac", "sn", "userId", "bindToken", "appName", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceRecordInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThirdPartyDeviceRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyDeviceRequest.kt\ncom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,66:1\n89#2,5:67\n89#2,5:72\n*S KotlinDebug\n*F\n+ 1 ThirdPartyDeviceRequest.kt\ncom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceRequest\n*L\n25#1:67,5\n50#1:72,5\n*E\n"})
public final class ThirdPartyDeviceRequest extends BaseRequest<ThirdPartyDeviceBindService> {

    @NotNull
    private static final String TAG = "ThirdPartyDeviceRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest$getBindKey$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/BindThirdParty;", "it", "Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceBindService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest$getBindKey$1", f = "ThirdPartyDeviceRequest.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ThirdPartyDeviceBindService, Continuation<? super BaseResult<BindThirdParty>>, Object> {
        final /* synthetic */ String $appId;
        int label;
        final /* synthetic */ ThirdPartyDeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, ThirdPartyDeviceRequest thirdPartyDeviceRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$appId = str;
            this.this$0 = thirdPartyDeviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$appId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThirdPartyDeviceBindService thirdPartyDeviceBindService, Continuation<? super BaseResult<BindThirdParty>> continuation) {
            return ((AnonymousClass1) create(thirdPartyDeviceBindService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(g.d, this.$appId);
                ThirdPartyDeviceBindService thirdPartyDeviceBindServiceAccess$getMService = ThirdPartyDeviceRequest.access$getMService(this.this$0);
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = thirdPartyDeviceBindServiceAccess$getMService.getBindToken(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest$thirdPartyBind$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/device/manager/api/model/DeviceRecordInfo;", "it", "Lcom/xiaomi/fitness/device/manager/api/ThirdPartyDeviceBindService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.manager.api.ThirdPartyDeviceRequest$thirdPartyBind$1", f = "ThirdPartyDeviceRequest.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C19311 extends SuspendLambda implements Function2<ThirdPartyDeviceBindService, Continuation<? super BaseResult<DeviceRecordInfo>>, Object> {
        final /* synthetic */ String $appId;
        final /* synthetic */ String $appName;
        final /* synthetic */ String $bindToken;
        final /* synthetic */ String $identifier;
        final /* synthetic */ String $mac;
        final /* synthetic */ String $model;
        final /* synthetic */ String $name;
        final /* synthetic */ String $sn;
        int label;
        final /* synthetic */ ThirdPartyDeviceRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19311(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ThirdPartyDeviceRequest thirdPartyDeviceRequest, Continuation<? super C19311> continuation) {
            super(2, continuation);
            this.$identifier = str;
            this.$appId = str2;
            this.$model = str3;
            this.$name = str4;
            this.$appName = str5;
            this.$mac = str6;
            this.$sn = str7;
            this.$bindToken = str8;
            this.this$0 = thirdPartyDeviceRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C19311(this.$identifier, this.$appId, this.$model, this.$name, this.$appName, this.$mac, this.$sn, this.$bindToken, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ThirdPartyDeviceBindService thirdPartyDeviceBindService, Continuation<? super BaseResult<DeviceRecordInfo>> continuation) {
            return ((C19311) create(thirdPartyDeviceBindService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("identifier", this.$identifier);
                linkedHashMap.put(g.d, this.$appId);
                linkedHashMap.put("model", this.$model);
                linkedHashMap.put("name", this.$name);
                linkedHashMap.put("package_name", "com.mi.health");
                linkedHashMap.put("third_app_name", this.$appName);
                linkedHashMap.put("extra_values", ArrayMapKt.arrayMapOf(TuplesKt.to("mac", this.$mac), TuplesKt.to("sn", this.$sn)));
                linkedHashMap.put("third_bind_token", this.$bindToken);
                ThirdPartyDeviceBindService thirdPartyDeviceBindServiceAccess$getMService = ThirdPartyDeviceRequest.access$getMService(this.this$0);
                String json = this.this$0.getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = thirdPartyDeviceBindServiceAccess$getMService.thirdPartyBind(json, this);
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

    public static final /* synthetic */ ThirdPartyDeviceBindService access$getMService(ThirdPartyDeviceRequest thirdPartyDeviceRequest) {
        return thirdPartyDeviceRequest.getMService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$0(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBindKey$lambda$1(Function1 success, BindThirdParty it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    public final void getBindKey(@NotNull String appId, @NotNull final Function1<? super BindThirdParty, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(appId, this, null)).error(new Function1() { // from class: vbp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdPartyDeviceRequest.getBindKey$lambda$0(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: wbp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdPartyDeviceRequest.getBindKey$lambda$1(success, (BindThirdParty) obj);
            }
        });
    }

    public final void thirdPartyBind(@NotNull String identifier, @NotNull String appId, @NotNull String model, @NotNull String name, @NotNull String mac, @NotNull String sn, @NotNull String userId, @NotNull String bindToken, @NotNull String appName, @NotNull Function1<? super DeviceRecordInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(bindToken, "bindToken");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C19311(identifier, appId, model, name, appName, mac, sn, bindToken, this, null)).error(error).success(success);
    }
}
