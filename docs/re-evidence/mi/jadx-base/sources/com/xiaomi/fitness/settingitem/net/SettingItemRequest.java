package com.xiaomi.fitness.settingitem.net;

import com.google.gson.Gson;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.settingitem.net.SettingItemRequest;
import com.xiaomi.fitness.settingitem.net.model.SettingItemModel;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.HashMap;
import java.util.Set;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JP\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0013Jm\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0019j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\u0010\u001aJX\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0013JP\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0013JR\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0013R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/settingitem/net/SettingItemRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "sendDeviceSetting", "", "did", "", RnReportConst.ApiReport.PARAM_MODULE, "key", "value", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "keyValues", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getDeviceSetting", "updateTime", "", "lastId", "", "limit", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetConfigByModuleResult;", "getDeviceBigSetting", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "sendDeviceBigSetting", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingItemRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingItemRequest.kt\ncom/xiaomi/fitness/settingitem/net/SettingItemRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,57:1\n89#2,5:58\n89#2,5:63\n89#2,5:68\n89#2,5:73\n89#2,5:78\n*S KotlinDebug\n*F\n+ 1 SettingItemRequest.kt\ncom/xiaomi/fitness/settingitem/net/SettingItemRequest\n*L\n15#1:58,5\n23#1:63,5\n34#1:68,5\n42#1:73,5\n49#1:78,5\n*E\n"})
public final class SettingItemRequest extends BaseRequest<SettingItemService> {

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a2m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SettingItemRequest.gson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.net.SettingItemRequest$getDeviceBigSetting$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SettingItemResult;", "service", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.net.SettingItemRequest$getDeviceBigSetting$2", f = "SettingItemRequest.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SettingItemService, Continuation<? super BaseResult<SettingItemModel.SettingItemResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $key;
        final /* synthetic */ String $module;
        final /* synthetic */ long $updateTime;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingItemRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, long j, SettingItemRequest settingItemRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$module = str2;
            this.$key = str3;
            this.$updateTime = j;
            this.this$0 = settingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$did, this.$module, this.$key, this.$updateTime, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SettingItemService settingItemService, Continuation<? super BaseResult<SettingItemModel.SettingItemResult>> continuation) {
            return ((AnonymousClass2) create(settingItemService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingItemService settingItemService = (SettingItemService) this.L$0;
                String json = this.this$0.getGson().toJson(new SettingItemModel.GetBigSettingRequest(this.$did, this.$module, this.$key, this.$updateTime));
                this.label = 1;
                obj = settingItemService.getDeviceBigSetting(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.net.SettingItemRequest$getDeviceSetting$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$GetConfigByModuleResult;", "service", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.net.SettingItemRequest$getDeviceSetting$2", f = "SettingItemRequest.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29192 extends SuspendLambda implements Function2<SettingItemService, Continuation<? super BaseResult<SettingItemModel.GetConfigByModuleResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ int $lastId;
        final /* synthetic */ int $limit;
        final /* synthetic */ String $module;
        final /* synthetic */ long $updateTime;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingItemRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29192(String str, String str2, long j, int i, int i2, SettingItemRequest settingItemRequest, Continuation<? super C29192> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$module = str2;
            this.$updateTime = j;
            this.$lastId = i;
            this.$limit = i2;
            this.this$0 = settingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29192 c29192 = new C29192(this.$did, this.$module, this.$updateTime, this.$lastId, this.$limit, this.this$0, continuation);
            c29192.L$0 = obj;
            return c29192;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SettingItemService settingItemService, Continuation<? super BaseResult<SettingItemModel.GetConfigByModuleResult>> continuation) {
            return ((C29192) create(settingItemService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingItemService settingItemService = (SettingItemService) this.L$0;
                String json = this.this$0.getGson().toJson(new SettingItemModel.GetSettingRequest(this.$did, this.$module, this.$updateTime, this.$lastId, this.$limit));
                this.label = 1;
                obj = settingItemService.getDeviceSetting(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceBigSetting$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "service", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceBigSetting$2", f = "SettingItemRequest.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29202 extends SuspendLambda implements Function2<SettingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $key;
        final /* synthetic */ String $module;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingItemRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29202(String str, String str2, String str3, String str4, SettingItemRequest settingItemRequest, Continuation<? super C29202> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$module = str2;
            this.$key = str3;
            this.$value = str4;
            this.this$0 = settingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29202 c29202 = new C29202(this.$did, this.$module, this.$key, this.$value, this.this$0, continuation);
            c29202.L$0 = obj;
            return c29202;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SettingItemService settingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>> continuation) {
            return ((C29202) create(settingItemService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingItemService settingItemService = (SettingItemService) this.L$0;
                String json = this.this$0.getGson().toJson(new SettingItemModel.SetBigConfigRequest(this.$did, this.$module, this.$key, this.$value));
                this.label = 1;
                obj = settingItemService.sendDeviceBigSetting(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceSetting$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "settingItemService", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceSetting$2", f = "SettingItemRequest.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29212 extends SuspendLambda implements Function2<SettingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $key;
        final /* synthetic */ String $module;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingItemRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29212(String str, String str2, String str3, String str4, SettingItemRequest settingItemRequest, Continuation<? super C29212> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$module = str2;
            this.$key = str3;
            this.$value = str4;
            this.this$0 = settingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29212 c29212 = new C29212(this.$did, this.$module, this.$key, this.$value, this.this$0, continuation);
            c29212.L$0 = obj;
            return c29212;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SettingItemService settingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>> continuation) {
            return ((C29212) create(settingItemService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingItemService settingItemService = (SettingItemService) this.L$0;
                String json = this.this$0.getGson().toJson(new SettingItemModel.SendSettingRequest(this.$did, this.$module, this.$key, this.$value));
                this.label = 1;
                obj = settingItemService.sendDeviceSetting(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceSetting$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/settingitem/net/model/SettingItemModel$SetConfigResult;", "settingItemService", "Lcom/xiaomi/fitness/settingitem/net/SettingItemService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.settingitem.net.SettingItemRequest$sendDeviceSetting$4", f = "SettingItemRequest.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<SettingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ HashMap<String, String> $keyValues;
        final /* synthetic */ String $module;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingItemRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, HashMap<String, String> map, SettingItemRequest settingItemRequest, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$module = str2;
            this.$keyValues = map;
            this.this$0 = settingItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$did, this.$module, this.$keyValues, this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SettingItemService settingItemService, Continuation<? super BaseResult<SettingItemModel.SetConfigResult>> continuation) {
            return ((AnonymousClass4) create(settingItemService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingItemService settingItemService = (SettingItemService) this.L$0;
                SettingItemModel.SendSettingRequest sendSettingRequest = new SettingItemModel.SendSettingRequest(this.$did, this.$module);
                Set<String> setKeySet = this.$keyValues.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                for (String str : setKeySet) {
                    sendSettingRequest.addItem(str, this.$keyValues.get(str));
                }
                String json = this.this$0.getGson().toJson(sendSettingRequest);
                this.label = 1;
                obj = settingItemService.sendDeviceSetting(json, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceBigSetting$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeviceSetting$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendDeviceBigSetting$default(SettingItemRequest settingItemRequest, String str, String str2, String str3, String str4, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 32) != 0) {
            function2 = new Function1() { // from class: y1m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SettingItemRequest.sendDeviceBigSetting$lambda$5((ApiException) obj2);
                }
            };
        }
        settingItemRequest.sendDeviceBigSetting(str, str2, str3, str4, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDeviceBigSetting$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendDeviceSetting$default(SettingItemRequest settingItemRequest, String str, String str2, String str3, String str4, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 32) != 0) {
            function2 = new Function1() { // from class: x1m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SettingItemRequest.sendDeviceSetting$lambda$1((ApiException) obj2);
                }
            };
        }
        settingItemRequest.sendDeviceSetting(str, str2, str3, str4, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDeviceSetting$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendDeviceSetting$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getDeviceBigSetting(@NotNull String did, @NotNull String module, @NotNull String key, long updateTime, @NotNull Function1<? super SettingItemModel.SettingItemResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(did, module, key, updateTime, this, null)).error(error).success(success);
    }

    public final void getDeviceSetting(@NotNull String did, @NotNull String module, long updateTime, int lastId, int limit, @NotNull Function1<? super SettingItemModel.GetConfigByModuleResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C29192(did, module, updateTime, lastId, limit, this, null)).error(error).success(success);
    }

    public final void sendDeviceBigSetting(@NotNull String did, @NotNull String module, @NotNull String key, @Nullable String value, @NotNull Function1<? super SettingItemModel.SetConfigResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C29202(did, module, key, value, this, null)).error(error).success(success);
    }

    public final void sendDeviceSetting(@NotNull String did, @NotNull String module, @NotNull String key, @NotNull String value, @NotNull Function1<? super SettingItemModel.SetConfigResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C29212(did, module, key, value, this, null)).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendDeviceSetting$default(SettingItemRequest settingItemRequest, String str, String str2, HashMap map, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 16) != 0) {
            function2 = new Function1() { // from class: b2m
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SettingItemRequest.sendDeviceSetting$lambda$2((ApiException) obj2);
                }
            };
        }
        settingItemRequest.sendDeviceSetting(str, str2, map, function1, function2);
    }

    public final void sendDeviceSetting(@NotNull String did, @NotNull String module, @NotNull HashMap<String, String> keyValues, @NotNull Function1<? super SettingItemModel.SetConfigResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(keyValues, "keyValues");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass4(did, module, keyValues, this, null)).error(error).success(success);
    }
}
