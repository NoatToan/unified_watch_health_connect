package com.xiaomi.hm.health.mine;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/mine/MineViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/http/HttpKit;", "", "getMineOrderUrl", "getMedicalCardUrl", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "getOrderUrl", "()Landroidx/lifecycle/MutableLiveData;", "setOrderUrl", "(Landroidx/lifecycle/MutableLiveData;)V", "orderUrl", "b", "getMedicalUrl", "setMedicalUrl", "medicalUrl", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MineViewModel extends ViewModel implements HttpKit {

    @NotNull
    private static final String c = "apps/%s/settings";

    @NotNull
    private static final String d = "zepp.h5.url";

    @NotNull
    private static final String e = "SINGLE";

    @NotNull
    private static final String f = "medical-id";

    @NotNull
    private static final String g = "health-order";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<String> orderUrl = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<String> medicalUrl = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.hm.health.mine.MineViewModel$getMedicalCardUrl$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.mine.MineViewModel$getMedicalCardUrl$1", f = "MineViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MineViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i = 0;
            String url = HMServerDef.getUrl(String.format("apps/%s/settings", Arrays.copyOf(new Object[]{HMAppConfig.getPackageName()}, 1)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appName", HMAppConfig.getPackageName());
            linkedHashMap.put("settingName", MineViewModel.d);
            linkedHashMap.put("mode", "SINGLE");
            try {
                Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(MineViewModel.this, url, linkedHashMap, null, 4, null);
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (!responseHttpGet$default.isSuccessful()) {
                    throw new HttpError(responseHttpGet$default);
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                JSONArray jSONArray = new JSONArray(new JSONObject(converter.convert(responseBodyBody, new TypeToken<Object>() { // from class: com.xiaomi.hm.health.mine.MineViewModel$getMedicalCardUrl$1$invokeSuspend$$inlined$deserializeOrThrow$1
                }.getType()).toString()).getString(MineViewModel.d));
                int length = jSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
                        if (Intrinsics.areEqual(jSONObject.getString("id"), MineViewModel.f)) {
                            MineViewModel.this.getMedicalUrl().postValue(jSONObject.getString("url"));
                            return Unit.INSTANCE;
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                MineViewModel.this.getMedicalUrl().postValue("");
                return Unit.INSTANCE;
            } catch (Exception e) {
                MineViewModel.this.getMedicalUrl().postValue("");
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.mine.MineViewModel$getMineOrderUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.mine.MineViewModel$getMineOrderUrl$1", f = "MineViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public C16291(Continuation<? super C16291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MineViewModel.this.new C16291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            int i = 0;
            String url = HMServerDef.getUrl(String.format("apps/%s/settings", Arrays.copyOf(new Object[]{HMAppConfig.getPackageName()}, 1)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("appName", HMAppConfig.getPackageName());
            linkedHashMap.put("settingName", MineViewModel.d);
            linkedHashMap.put("mode", "SINGLE");
            try {
                Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(MineViewModel.this, url, linkedHashMap, null, 4, null);
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (!responseHttpGet$default.isSuccessful()) {
                    throw new HttpError(responseHttpGet$default);
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                JSONArray jSONArray = new JSONArray(new JSONObject(converter.convert(responseBodyBody, new TypeToken<Object>() { // from class: com.xiaomi.hm.health.mine.MineViewModel$getMineOrderUrl$1$invokeSuspend$$inlined$deserializeOrThrow$1
                }.getType()).toString()).getString(MineViewModel.d));
                int length = jSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = new JSONObject(jSONArray.get(i).toString());
                        if (Intrinsics.areEqual(jSONObject.getString("id"), MineViewModel.g)) {
                            MineViewModel.this.getOrderUrl().postValue(jSONObject.getString("url"));
                            return Unit.INSTANCE;
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                MineViewModel.this.getOrderUrl().postValue("");
                return Unit.INSTANCE;
            } catch (Exception e) {
                MineViewModel.this.getOrderUrl().postValue("");
                e.printStackTrace();
            }
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    public final void getMedicalCardUrl() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getMedicalUrl() {
        return this.medicalUrl;
    }

    public final void getMineOrderUrl() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C16291(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getOrderUrl() {
        return this.orderUrl;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public final void setMedicalUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        this.medicalUrl = mutableLiveData;
    }

    public final void setOrderUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        this.orderUrl = mutableLiveData;
    }
}
