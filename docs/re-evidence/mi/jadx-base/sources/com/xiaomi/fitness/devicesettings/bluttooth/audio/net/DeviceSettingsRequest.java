package com.xiaomi.fitness.devicesettings.bluttooth.audio.net;

import com.google.gson.Gson;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AsrResult;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.CommitTransTask;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.DeleteResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.GetUploadUrl;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.SummaryAllowed;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.SummaryResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.TransResultList;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.TransResultParams;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JK\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0010JU\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0014`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0015JQ\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0019`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u001aJQ\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u001c`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u001aJK\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0010JU\u0010\u001e\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u0014`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u0015JQ\u0010\u001f\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020 `\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u001aJQ\u0010!\u001a\u00020\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00182\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020\u001c`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010\u001aJA\u0010\"\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00060\fj\b\u0012\u0004\u0012\u00020#`\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;", "<init>", "()V", "getUploadUrl", "", "suffix", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "commitTransTask", "name", "key", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResult;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getTransResult", "nameList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TransResultList;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deleteAudio", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DeleteResultList;", "getSummaryUploadUrl", "commitSummaryTask", "getSummaryResult", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryResultList;", "deleteSummary", "summaryAllow", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryAllowed;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingsRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,126:1\n89#2,5:127\n89#2,5:132\n89#2,5:137\n89#2,5:142\n89#2,5:147\n89#2,5:152\n89#2,5:157\n89#2,5:162\n89#2,5:167\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsRequest.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsRequest\n*L\n27#1:127,5\n41#1:132,5\n52#1:137,5\n63#1:142,5\n74#1:147,5\n88#1:152,5\n99#1:157,5\n110#1:162,5\n120#1:167,5\n*E\n"})
public final class DeviceSettingsRequest extends BaseRequest<DeviceSettingsService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$commitSummaryTask$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResult;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$commitSummaryTask$1", f = "DeviceSettingsRequest.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<AsrResult>>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $name;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$key = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$name, this.$key, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<AsrResult>> continuation) {
            return ((AnonymousClass1) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new CommitTransTask(this.$name, this.$key));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.submitSummaryTask(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$commitTransTask$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResult;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$commitTransTask$1", f = "DeviceSettingsRequest.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20391 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<AsrResult>>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $name;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20391(String str, String str2, Continuation<? super C20391> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$key = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20391 c20391 = new C20391(this.$name, this.$key, continuation);
            c20391.L$0 = obj;
            return c20391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<AsrResult>> continuation) {
            return ((C20391) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new CommitTransTask(this.$name, this.$key));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.postTransTask(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$deleteAudio$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DeleteResultList;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$deleteAudio$1", f = "DeviceSettingsRequest.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20401 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<DeleteResultList>>, Object> {
        final /* synthetic */ List<String> $nameList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20401(List<String> list, Continuation<? super C20401> continuation) {
            super(2, continuation);
            this.$nameList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20401 c20401 = new C20401(this.$nameList, continuation);
            c20401.L$0 = obj;
            return c20401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<DeleteResultList>> continuation) {
            return ((C20401) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new TransResultParams(this.$nameList));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.deleteTransTask(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$deleteSummary$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DeleteResultList;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$deleteSummary$1", f = "DeviceSettingsRequest.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20411 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<DeleteResultList>>, Object> {
        final /* synthetic */ List<String> $nameList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20411(List<String> list, Continuation<? super C20411> continuation) {
            super(2, continuation);
            this.$nameList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20411 c20411 = new C20411(this.$nameList, continuation);
            c20411.L$0 = obj;
            return c20411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<DeleteResultList>> continuation) {
            return ((C20411) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new TransResultParams(this.$nameList));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.deleteSummary(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getSummaryResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryResultList;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getSummaryResult$1", f = "DeviceSettingsRequest.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20421 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<SummaryResultList>>, Object> {
        final /* synthetic */ List<String> $nameList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20421(List<String> list, Continuation<? super C20421> continuation) {
            super(2, continuation);
            this.$nameList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20421 c20421 = new C20421(this.$nameList, continuation);
            c20421.L$0 = obj;
            return c20421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<SummaryResultList>> continuation) {
            return ((C20421) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new TransResultParams(this.$nameList));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.getSummaryResult(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getSummaryUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getSummaryUploadUrl$1", f = "DeviceSettingsRequest.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20431 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<GetUploadUrl>>, Object> {
        final /* synthetic */ String $suffix;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20431(String str, Continuation<? super C20431> continuation) {
            super(2, continuation);
            this.$suffix = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20431 c20431 = new C20431(this.$suffix, continuation);
            c20431.L$0 = obj;
            return c20431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<GetUploadUrl>> continuation) {
            return ((C20431) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String str = "{\"suffix\":\"" + this.$suffix + "\"}";
                this.label = 1;
                obj = deviceSettingsService.getSummaryUploadUrl(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getTransResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/TransResultList;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getTransResult$1", f = "DeviceSettingsRequest.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20441 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<TransResultList>>, Object> {
        final /* synthetic */ List<String> $nameList;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20441(List<String> list, Continuation<? super C20441> continuation) {
            super(2, continuation);
            this.$nameList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20441 c20441 = new C20441(this.$nameList, continuation);
            c20441.L$0 = obj;
            return c20441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<TransResultList>> continuation) {
            return ((C20441) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String json = new Gson().toJson(new TransResultParams(this.$nameList));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = deviceSettingsService.getTransResult(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getUploadUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$getUploadUrl$1", f = "DeviceSettingsRequest.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20451 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<GetUploadUrl>>, Object> {
        final /* synthetic */ String $suffix;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20451(String str, Continuation<? super C20451> continuation) {
            super(2, continuation);
            this.$suffix = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20451 c20451 = new C20451(this.$suffix, continuation);
            c20451.L$0 = obj;
            return c20451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<GetUploadUrl>> continuation) {
            return ((C20451) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                String str = "{\"suffix\":\"" + this.$suffix + "\"}";
                this.label = 1;
                obj = deviceSettingsService.getUploadUrl(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$summaryAllow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryAllowed;", "it", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequest$summaryAllow$1", f = "DeviceSettingsRequest.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20461 extends SuspendLambda implements Function2<DeviceSettingsService, Continuation<? super BaseResult<SummaryAllowed>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C20461(Continuation<? super C20461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C20461 c20461 = new C20461(continuation);
            c20461.L$0 = obj;
            return c20461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceSettingsService deviceSettingsService, Continuation<? super BaseResult<SummaryAllowed>> continuation) {
            return ((C20461) create(deviceSettingsService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceSettingsService deviceSettingsService = (DeviceSettingsService) this.L$0;
                this.label = 1;
                obj = deviceSettingsService.allowSummary(this);
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

    public static /* synthetic */ void getSummaryUploadUrl$default(DeviceSettingsRequest deviceSettingsRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "json";
        }
        deviceSettingsRequest.getSummaryUploadUrl(str, function1, function2);
    }

    public static /* synthetic */ void getUploadUrl$default(DeviceSettingsRequest deviceSettingsRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "ogg";
        }
        deviceSettingsRequest.getUploadUrl(str, function1, function2);
    }

    public final void commitSummaryTask(@Nullable String name, @Nullable String key, @NotNull Function1<? super AsrResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (name == null || key == null) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(name, key, null)).error(onFail).success(onSuccess);
    }

    public final void commitTransTask(@Nullable String name, @Nullable String key, @NotNull Function1<? super AsrResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (name == null || key == null) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20391(name, key, null)).error(onFail).success(onSuccess);
    }

    public final void deleteAudio(@Nullable List<String> nameList, @NotNull Function1<? super DeleteResultList, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (nameList == null) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20401(nameList, null)).error(onFail).success(onSuccess);
    }

    public final void deleteSummary(@Nullable List<String> nameList, @NotNull Function1<? super DeleteResultList, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        List<String> list = nameList;
        if (list == null || list.isEmpty()) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20411(nameList, null)).error(onFail).success(onSuccess);
    }

    public final void getSummaryResult(@Nullable List<String> nameList, @NotNull Function1<? super SummaryResultList, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        List<String> list = nameList;
        if (list == null || list.isEmpty()) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20421(nameList, null)).error(onFail).success(onSuccess);
    }

    public final void getSummaryUploadUrl(@NotNull String suffix, @NotNull Function1<? super GetUploadUrl, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20431(suffix, null)).error(onFail).success(onSuccess);
    }

    public final void getTransResult(@Nullable List<String> nameList, @NotNull Function1<? super TransResultList, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        if (nameList == null) {
            return;
        }
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20441(nameList, null)).error(onFail).success(onSuccess);
    }

    public final void getUploadUrl(@NotNull String suffix, @NotNull Function1<? super GetUploadUrl, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20451(suffix, null)).error(onFail).success(onSuccess);
    }

    public final void summaryAllow(@NotNull Function1<? super SummaryAllowed, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C20461(null)).error(onFail).success(onSuccess);
    }
}
