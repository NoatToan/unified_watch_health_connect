package com.xiaomi.fitness.sport.model.weather;

import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sport.bean.WeatherRequestData;
import com.xiaomi.fitness.sport.model.weather.WeatherRequest;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/model/weather/WeatherRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/sport/model/weather/WeatherService;", "<init>", "()V", "getWeather", "", "locale", "", "data", "Lcom/xiaomi/fitness/sport/bean/WeatherRequestData;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWeatherRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherRequest.kt\ncom/xiaomi/fitness/sport/model/weather/WeatherRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,23:1\n104#2,8:24\n*S KotlinDebug\n*F\n+ 1 WeatherRequest.kt\ncom/xiaomi/fitness/sport/model/weather/WeatherRequest\n*L\n18#1:24,8\n*E\n"})
public final class WeatherRequest extends BaseRequest<WeatherService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.weather.WeatherRequest$getWeather$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "it", "Lcom/xiaomi/fitness/sport/model/weather/WeatherService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.model.weather.WeatherRequest$getWeather$2", f = "WeatherRequest.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<WeatherService, Continuation<? super BaseResult<WeatherResponse.Weather>>, Object> {
        final /* synthetic */ WeatherRequestData $data;
        final /* synthetic */ String $locale;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WeatherRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, WeatherRequest weatherRequest, WeatherRequestData weatherRequestData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$locale = str;
            this.this$0 = weatherRequest;
            this.$data = weatherRequestData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$locale, this.this$0, this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WeatherService weatherService, Continuation<? super BaseResult<WeatherResponse.Weather>> continuation) {
            return ((AnonymousClass2) create(weatherService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeatherService weatherService = (WeatherService) this.L$0;
                String str = this.$locale;
                String json = this.this$0.getMGson().toJson(this.$data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = weatherService.getWeather(str, json, this);
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
    public static /* synthetic */ void getWeather$default(WeatherRequest weatherRequest, String str, WeatherRequestData weatherRequestData, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: j9r
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return WeatherRequest.getWeather$lambda$0((ApiException) obj2);
                }
            };
        }
        weatherRequest.getWeather(str, weatherRequestData, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeather$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void getWeather(@NotNull String locale, @NotNull WeatherRequestData data, @NotNull Function1<? super WeatherResponse.Weather, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(locale, this, data, null)).error(error).success(success);
    }
}
