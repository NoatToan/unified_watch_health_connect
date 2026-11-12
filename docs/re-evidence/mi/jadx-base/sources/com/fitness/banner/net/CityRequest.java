package com.fitness.banner.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\nJQ\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fj\b\u0012\u0004\u0012\u00020\u0006`\u000e2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fitness/banner/net/CityRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/fitness/banner/net/CityService;", "<init>", "()V", "getCityInfoSync", "Lcom/fitness/banner/net/CityInfoResponseResult;", "longitude", "", "latitude", "(FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityInfoAsync", "", "onSuccess", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lkotlin/Function1;", "onFail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "banner_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCityRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CityRequest.kt\ncom/fitness/banner/net/CityRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,30:1\n141#2:31\n89#2,5:35\n31#3:32\n28#3,2:33\n*S KotlinDebug\n*F\n+ 1 CityRequest.kt\ncom/fitness/banner/net/CityRequest\n*L\n19#1:31\n26#1:35,5\n19#1:32\n19#1:33,2\n*E\n"})
public final class CityRequest extends BaseRequest<CityService> {

    /* JADX INFO: renamed from: com.fitness.banner.net.CityRequest$getCityInfoAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/fitness/banner/net/CityInfoResponseResult;", "it", "Lcom/fitness/banner/net/CityService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.net.CityRequest$getCityInfoAsync$1", f = "CityRequest.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CityService, Continuation<? super BaseResult<CityInfoResponseResult>>, Object> {
        final /* synthetic */ float $latitude;
        final /* synthetic */ float $longitude;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, float f2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$latitude = f;
            this.$longitude = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = CityRequest.this.new AnonymousClass1(this.$latitude, this.$longitude, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CityService cityService, Continuation<? super BaseResult<CityInfoResponseResult>> continuation) {
            return ((AnonymousClass1) create(cityService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CityService cityService = (CityService) this.L$0;
                String json = CityRequest.this.getMGson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("latitude", Boxing.boxFloat(this.$latitude)), TuplesKt.to("longitude", Boxing.boxFloat(this.$longitude))));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = cityService.getCityInfo(json, this);
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

    /* JADX INFO: renamed from: com.fitness.banner.net.CityRequest$getCityInfoSync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.fitness.banner.net.CityRequest", f = "CityRequest.kt", i = {}, l = {17}, m = "getCityInfoSync", n = {}, s = {})
    public static final class C13511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13511(Continuation<? super C13511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CityRequest.this.getCityInfoSync(0.0f, 0.0f, this);
        }
    }

    public final void getCityInfoAsync(float longitude, float latitude, @NotNull Function1<? super CityInfoResponseResult, Unit> onSuccess, @NotNull Function1<? super ApiException, Unit> onFail) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(latitude, longitude, null)).error(onFail).success(onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCityInfoSync(float f, float f2, @NotNull Continuation<? super CityInfoResponseResult> continuation) {
        C13511 c13511;
        if (continuation instanceof C13511) {
            c13511 = (C13511) continuation;
            int i = c13511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13511.label = i - Integer.MIN_VALUE;
            } else {
                c13511 = new C13511(continuation);
            }
        } else {
            c13511 = new C13511(continuation);
        }
        Object cityInfo = c13511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cityInfo);
            CityService mService = getMService();
            String json = getMGson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("latitude", Boxing.boxFloat(f2)), TuplesKt.to("longitude", Boxing.boxFloat(f))));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            c13511.label = 1;
            cityInfo = mService.getCityInfo(json, c13511);
            if (cityInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cityInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(cityInfo);
    }
}
