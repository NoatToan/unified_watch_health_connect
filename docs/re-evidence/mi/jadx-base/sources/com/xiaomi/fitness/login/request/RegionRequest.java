package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.account.api.bean.CountryRegion;
import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import com.xiaomi.fitness.account.api.bean.UserRegion;
import com.xiaomi.fitness.login.request.RegionRequest;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ>\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ>\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\bJ8\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00142\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/login/request/RegionService;", "<init>", "()V", "getUserRegion", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/account/api/bean/UserRegion;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getCountryRegions", "info", "Lcom/xiaomi/fitness/account/api/bean/CountryInfo;", "", "Lcom/xiaomi/fitness/account/api/bean/CountryRegion;", "country", "", "setUserRegion", "Lcom/xiaomi/fitness/account/api/bean/RegionBean$CountryInfo;", "Lcom/xiaomi/fitness/account/api/bean/RegionInfo;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionRequest.kt\ncom/xiaomi/fitness/login/request/RegionRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,68:1\n104#2,8:69\n104#2,8:77\n104#2,8:85\n*S KotlinDebug\n*F\n+ 1 RegionRequest.kt\ncom/xiaomi/fitness/login/request/RegionRequest\n*L\n18#1:69,8\n32#1:77,8\n54#1:85,8\n*E\n"})
public final class RegionRequest extends BaseRequest<RegionService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.RegionRequest$getCountryRegions$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "Lcom/xiaomi/fitness/account/api/bean/CountryRegion;", "it", "Lcom/xiaomi/fitness/login/request/RegionService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.RegionRequest$getCountryRegions$2", f = "RegionRequest.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<RegionService, Continuation<? super BaseResult<List<? extends CountryRegion>>>, Object> {
        final /* synthetic */ CountryInfo $info;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CountryInfo countryInfo, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$info = countryInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = RegionRequest.this.new AnonymousClass2(this.$info, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(RegionService regionService, Continuation<? super BaseResult<List<CountryRegion>>> continuation) {
            return ((AnonymousClass2) create(regionService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionService regionService = (RegionService) this.L$0;
                String json = RegionRequest.this.getMGson().toJson(this.$info);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = regionService.getCountryRegions(json, this);
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

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(RegionService regionService, Continuation<? super BaseResult<List<? extends CountryRegion>>> continuation) {
            return invoke2(regionService, (Continuation<? super BaseResult<List<CountryRegion>>>) continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.RegionRequest$getUserRegion$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/api/bean/UserRegion;", "it", "Lcom/xiaomi/fitness/login/request/RegionService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.RegionRequest$getUserRegion$2", f = "RegionRequest.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25882 extends SuspendLambda implements Function2<RegionService, Continuation<? super BaseResult<UserRegion>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C25882(Continuation<? super C25882> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25882 c25882 = new C25882(continuation);
            c25882.L$0 = obj;
            return c25882;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RegionService regionService, Continuation<? super BaseResult<UserRegion>> continuation) {
            return ((C25882) create(regionService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionService regionService = (RegionService) this.L$0;
                this.label = 1;
                obj = regionService.getUserRegion(this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.request.RegionRequest$setUserRegion$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/api/bean/RegionInfo;", "it", "Lcom/xiaomi/fitness/login/request/RegionService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.login.request.RegionRequest$setUserRegion$2", f = "RegionRequest.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25892 extends SuspendLambda implements Function2<RegionService, Continuation<? super BaseResult<RegionInfo>>, Object> {
        final /* synthetic */ RegionBean.CountryInfo $info;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25892(RegionBean.CountryInfo countryInfo, Continuation<? super C25892> continuation) {
            super(2, continuation);
            this.$info = countryInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25892 c25892 = RegionRequest.this.new C25892(this.$info, continuation);
            c25892.L$0 = obj;
            return c25892;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RegionService regionService, Continuation<? super BaseResult<RegionInfo>> continuation) {
            return ((C25892) create(regionService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionService regionService = (RegionService) this.L$0;
                String json = RegionRequest.this.getMGson().toJson(this.$info);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = regionService.setUserRegion(json, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCountryRegions$default(RegionRequest regionRequest, CountryInfo countryInfo, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: cck
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return RegionRequest.getCountryRegions$lambda$1((ApiException) obj2);
                }
            };
        }
        regionRequest.getCountryRegions(countryInfo, (Function1<? super List<CountryRegion>, Unit>) function1, (Function1<? super ApiException, Unit>) function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCountryRegions$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCountryRegions$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUserRegion$default(RegionRequest regionRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: ack
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return RegionRequest.getUserRegion$lambda$0((ApiException) obj2);
                }
            };
        }
        regionRequest.getUserRegion(function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserRegion$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUserRegion$default(RegionRequest regionRequest, RegionBean.CountryInfo countryInfo, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: bck
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return RegionRequest.setUserRegion$lambda$3((ApiException) obj2);
                }
            };
        }
        regionRequest.setUserRegion(countryInfo, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserRegion$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getCountryRegions(@NotNull CountryInfo info, @NotNull Function1<? super List<CountryRegion>, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(info, null)).error(error).success(success);
    }

    public final void getUserRegion(@NotNull Function1<? super UserRegion, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C25882(null)).error(error).success(success);
    }

    public final void setUserRegion(@NotNull RegionBean.CountryInfo info, @NotNull Function1<? super RegionInfo, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C25892(info, null)).error(error).success(success);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCountryRegions$default(RegionRequest regionRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: zbk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return RegionRequest.getCountryRegions$lambda$2((ApiException) obj2);
                }
            };
        }
        regionRequest.getCountryRegions(str, (Function1<? super List<CountryRegion>, Unit>) function1, (Function1<? super ApiException, Unit>) function2);
    }

    public final void getCountryRegions(@NotNull String country, @NotNull Function1<? super List<CountryRegion>, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getCountryRegions(new CountryInfo(country, null, null, 6, null), success, error);
    }
}
