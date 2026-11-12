package com.xiaomi.fitness.medal.request;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.medal.bean.BackgroundPopUp;
import com.xiaomi.fitness.medal.request.MedalToappRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseData;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JX\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fJ8\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/medal/request/MedalToappRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/medal/request/MedalToappService;", "<init>", "()V", "getBackgroundPopup", "", "terminalType", "", "terminalVersion", "", "appVersion", "deviceModel", "type", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "postPopupStatus", "data", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedalToappRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalToappRequest.kt\ncom/xiaomi/fitness/medal/request/MedalToappRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,38:1\n104#2,8:39\n104#2,8:47\n*S KotlinDebug\n*F\n+ 1 MedalToappRequest.kt\ncom/xiaomi/fitness/medal/request/MedalToappRequest\n*L\n20#1:39,8\n34#1:47,8\n*E\n"})
public final class MedalToappRequest extends BaseRequest<MedalToappService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalToappRequest$getBackgroundPopup$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseData;", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp;", "it", "Lcom/xiaomi/fitness/medal/request/MedalToappService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalToappRequest$getBackgroundPopup$2", f = "MedalToappRequest.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<MedalToappService, Continuation<? super BaseData<BackgroundPopUp>>, Object> {
        final /* synthetic */ String $appVersion;
        final /* synthetic */ String $deviceModel;
        final /* synthetic */ int $terminalType;
        final /* synthetic */ String $terminalVersion;
        final /* synthetic */ int $type;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, String str, String str2, String str3, int i2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$terminalType = i;
            this.$terminalVersion = str;
            this.$appVersion = str2;
            this.$deviceModel = str3;
            this.$type = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$terminalType, this.$terminalVersion, this.$appVersion, this.$deviceModel, this.$type, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalToappService medalToappService, Continuation<? super BaseData<BackgroundPopUp>> continuation) {
            return ((AnonymousClass2) create(medalToappService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalToappService medalToappService = (MedalToappService) this.L$0;
                Logger.i("MedalRequest", "getBackgroundPopup params terminalType:" + this.$terminalType + ";terminalVersion:" + this.$terminalVersion + ";appVersion:" + this.$appVersion + ";deviceModel:" + this.$deviceModel + ";");
                int i2 = this.$terminalType;
                String str = this.$terminalVersion;
                String str2 = this.$appVersion;
                String str3 = this.$deviceModel;
                int i3 = this.$type;
                this.label = 1;
                obj = medalToappService.getBackgroundPopup(i2, str, str2, str3, i3, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.medal.request.MedalToappRequest$postPopupStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseData;", "Lcom/xiaomi/fitness/medal/bean/BackgroundPopUp;", "it", "Lcom/xiaomi/fitness/medal/request/MedalToappService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.medal.request.MedalToappRequest$postPopupStatus$2", f = "MedalToappRequest.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26012 extends SuspendLambda implements Function2<MedalToappService, Continuation<? super BaseData<BackgroundPopUp>>, Object> {
        final /* synthetic */ String $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26012(String str, Continuation<? super C26012> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26012 c26012 = new C26012(this.$data, continuation);
            c26012.L$0 = obj;
            return c26012;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MedalToappService medalToappService, Continuation<? super BaseData<BackgroundPopUp>> continuation) {
            return ((C26012) create(medalToappService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MedalToappService medalToappService = (MedalToappService) this.L$0;
                String str = this.$data;
                this.label = 1;
                obj = medalToappService.postPopupStatus(str, this);
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
    public static final Unit getBackgroundPopup$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postPopupStatus$default(MedalToappRequest medalToappRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: yhf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MedalToappRequest.postPopupStatus$lambda$1((ApiException) obj2);
                }
            };
        }
        medalToappRequest.postPopupStatus(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postPopupStatus$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getBackgroundPopup(int terminalType, @NotNull String terminalVersion, @NotNull String appVersion, @NotNull String deviceModel, int type, @NotNull Function1<? super BackgroundPopUp, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(terminalVersion, "terminalVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(terminalType, terminalVersion, appVersion, deviceModel, type, null)).error(error).success(success);
    }

    public final void postPopupStatus(@NotNull String data, @NotNull Function1<? super BackgroundPopUp, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C26012(data, null)).error(error).success(success);
    }
}
