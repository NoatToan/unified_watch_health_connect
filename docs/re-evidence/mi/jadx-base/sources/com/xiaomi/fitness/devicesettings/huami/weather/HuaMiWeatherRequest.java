package com.xiaomi.fitness.devicesettings.huami.weather;

import com.google.gson.Gson;
import com.xiaomi.fitness.devicesettings.huami.weather.HuaMiWeatherRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.sync.export.model.HuamiCurrentWeatherRequest;
import com.xiaomi.fitness.sync.export.model.HuamiDailyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiHourlyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherAlertsResponse;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherResponse;
import defpackage.gv5;
import defpackage.ka3;
import java.net.URLDecoder;
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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0007\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/HuaMiWeatherRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/devicesettings/huami/weather/HuamiWeatherService;", "Lcom/xiaomi/fitness/sync/export/model/HuamiCurrentWeatherRequest;", "data", "Lka3;", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResponse;", "getHuamiCurrentWeather", "(Lcom/xiaomi/fitness/sync/export/model/HuamiCurrentWeatherRequest;)Lka3;", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherAlertsResponse;", "getHuamiAlertsWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiHourlyWeather;", "getHuamiHoulyWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiDailyWeather;", "getHuamiDailyWeather", "", "url", "keyWord", "getOneParameter", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "(Lcom/xiaomi/fitness/sync/export/model/HuamiCurrentWeatherRequest;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeatherRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherRequest.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/HuaMiWeatherRequest\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 4 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,69:1\n37#2:70\n36#2,3:71\n108#3:74\n80#3,22:75\n104#4,8:97\n*S KotlinDebug\n*F\n+ 1 WeatherRequest.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/HuaMiWeatherRequest\n*L\n41#1:70\n41#1:71,3\n46#1:74\n46#1:75,22\n63#1:97,8\n*E\n"})
public final class HuaMiWeatherRequest extends BaseRequest<HuamiWeatherService> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.HuaMiWeatherRequest$getHuamiCurrentWeather$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/HuamiWeatherService;", "it", "Lka3;", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResponse;", "<anonymous>", "(Lcom/xiaomi/fitness/devicesettings/huami/weather/HuamiWeatherService;)Lka3;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.HuaMiWeatherRequest$getHuamiCurrentWeather$2", f = "WeatherRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<HuamiWeatherService, Continuation<? super ka3<HuamiWeatherResponse>>, Object> {
        final /* synthetic */ HuamiCurrentWeatherRequest $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HuamiCurrentWeatherRequest huamiCurrentWeatherRequest, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = huamiCurrentWeatherRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$data, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(HuamiWeatherService huamiWeatherService, Continuation<? super ka3<HuamiWeatherResponse>> continuation) {
            return ((AnonymousClass2) create(huamiWeatherService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiWeatherService huamiWeatherService = (HuamiWeatherService) this.L$0;
            String json = new Gson().toJson(this.$data);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return huamiWeatherService.getHuamiCurrentWeather(json);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getHuamiCurrentWeather$default(HuaMiWeatherRequest huaMiWeatherRequest, HuamiCurrentWeatherRequest huamiCurrentWeatherRequest, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: ijc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return HuaMiWeatherRequest.getHuamiCurrentWeather$lambda$1((ApiException) obj2);
                }
            };
        }
        huaMiWeatherRequest.getHuamiCurrentWeather(huamiCurrentWeatherRequest, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHuamiCurrentWeather$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @NotNull
    public final ka3<HuamiWeatherAlertsResponse> getHuamiAlertsWeather(@NotNull HuamiCurrentWeatherRequest data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HuamiWeatherService mService = getMService();
        String json = new Gson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return mService.getHuamiAlertsWeather(json);
    }

    @NotNull
    public final ka3<HuamiWeatherResponse> getHuamiCurrentWeather(@NotNull HuamiCurrentWeatherRequest data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HuamiWeatherService mService = getMService();
        String json = new Gson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return mService.getHuamiCurrentWeather(json);
    }

    @NotNull
    public final ka3<HuamiDailyWeather> getHuamiDailyWeather(@NotNull HuamiCurrentWeatherRequest data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HuamiWeatherService mService = getMService();
        String json = new Gson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return mService.getHuamiDailyWeather(json);
    }

    @NotNull
    public final ka3<HuamiHourlyWeather> getHuamiHoulyWeather(@NotNull HuamiCurrentWeatherRequest data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HuamiWeatherService mService = getMService();
        String json = new Gson().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return mService.getHuamiHourlyWeather(json);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    @Nullable
    public final String getOneParameter(@NotNull String url, @NotNull String keyWord) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        String str = "";
        try {
            String strDecode = URLDecoder.decode(url, "utf-8");
            if (StringsKt__StringsKt.indexOf$default((CharSequence) strDecode, '?', 0, false, 6, (Object) null) == -1) {
                return "";
            }
            String strSubstring = strDecode.substring(StringsKt__StringsKt.indexOf$default((CharSequence) strDecode, '?', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i = 0;
            String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{gv5.CONNECT_STR}, false, 0, 6, (Object) null).toArray(new String[0]);
            int length = strArr.length;
            String str2 = "";
            int i2 = 0;
            while (i2 < length) {
                try {
                    String str3 = strArr[i2];
                    String strSubstring2 = str3.substring(i, StringsKt__StringsKt.indexOf$default((CharSequence) str3, "=", 0, false, 6, (Object) null));
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    String str4 = strArr[i2];
                    String strSubstring3 = str4.substring(StringsKt__StringsKt.indexOf$default((CharSequence) str4, "=", 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    if (Intrinsics.areEqual(strSubstring2, keyWord)) {
                        if (strSubstring3 == null) {
                            int length2 = strSubstring3.length() - 1;
                            int i3 = 0;
                            boolean z = false;
                            while (i3 <= length2) {
                                boolean z2 = Intrinsics.compare((int) strSubstring3.charAt(!z ? i3 : length2), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        break;
                                    }
                                    length2--;
                                } else if (z2) {
                                    i3++;
                                } else {
                                    z = true;
                                }
                            }
                            if (!Intrinsics.areEqual("", strSubstring3.subSequence(i3, length2 + 1).toString())) {
                                str2 = strSubstring3;
                            }
                        } else {
                            str2 = strSubstring3;
                        }
                    }
                    i2++;
                    i = 0;
                } catch (Exception e) {
                    e = e;
                    str = str2;
                }
            }
            return str2;
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return str;
    }

    public final void getHuamiCurrentWeather(@NotNull HuamiCurrentWeatherRequest data, @NotNull Function1<? super HuamiWeatherResponse, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(data, null)).error(error).success(success);
    }
}
