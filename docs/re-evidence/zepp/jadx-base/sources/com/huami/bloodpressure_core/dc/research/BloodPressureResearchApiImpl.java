package com.huami.bloodpressure_core.dc.research;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.server.HMServerDef;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchApiImpl;", "Lcom/huami/bloodpressure_core/dc/research/IResearchApi;", "", "url", "b", "packageName", "a", BloodPressureConst.ParamKey.PLANID, "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "getResearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getResearchUrl", "Ljava/lang/String;", "RESEARCH_TEST_HOST", "RESEARCH_PRODUCT_HOST", "c", "RESEARCH_APP_SETTINGS", GoogleApiAvailabilityLight.a, "RESEARCH_APPNAME_KEY", "e", "RESEARCH_SETTING_NAME_KEY", "f", "RESEARCH_SETTING_NAME", "g", "RESEARCH_SETTING_MODE_KEY", "h", "RESEARCH_SETTING_MODE", "i", "RESEARCH_URL", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureResearchApiImpl implements IResearchApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_TEST_HOST = "https://api-doctor-staging.huami.com/";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_PRODUCT_HOST = "https://api-doctor-cn.huami.com/";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_APP_SETTINGS = "apps/%s/settings";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_APPNAME_KEY = "appName";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_SETTING_NAME_KEY = "settingName";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_SETTING_NAME = "zepp.h5.url";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_SETTING_MODE_KEY = "mode";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_SETTING_MODE = "SINGLE";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String RESEARCH_URL = "health-bp-crc";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.research.BloodPressureResearchApiImpl", f = "IResearchApi.kt", i = {}, l = {75}, m = "getResearch", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureResearchApiImpl.this.getResearch(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_core.dc.research.BloodPressureResearchApiImpl", f = "IResearchApi.kt", i = {}, l = {87}, m = "getResearchUrl", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureResearchApiImpl.this.getResearchUrl(null, this);
        }
    }

    private final String a(String packageName) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return HMServerDef.getUrl(String.format(this.RESEARCH_APP_SETTINGS, Arrays.copyOf(new Object[]{packageName}, 1)));
    }

    private final String b(String url) {
        if (HMServerDef.isProductUrl()) {
            return HMServerDef.getUrl(url);
        }
        return this.RESEARCH_TEST_HOST + url;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return IResearchApi.DefaultImpls.baseUrl(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.research.IResearchApi
    @Nullable
    public Object getResearch(@NotNull String str, @NotNull Continuation<? super BloodPressureResearchVo> continuation) throws HttpError {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objAwaitHttpGet$default = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
            String strB = b(m.replace$default(BloodPressureConst.Path.RESEARCH_EVENT, "{planId}", str, false, 4, (Object) null));
            aVar2.c = 1;
            objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, strB, null, null, aVar2, 6, null);
            if (objAwaitHttpGet$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
        }
        Response response = (Response) objAwaitHttpGet$default;
        ConverterKt.checkToken(response, ConverterKt.responseToJsonStr(response));
        if (!response.isSuccessful()) {
            throw new HttpError(response);
        }
        ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            Intrinsics.throwNpe();
        }
        return converter.convert(responseBodyBody, new TypeToken<BloodPressureResearchVo>() { // from class: com.huami.bloodpressure_core.dc.research.BloodPressureResearchApiImpl$getResearch$$inlined$deserializeOrThrow$1
        }.getType());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bloodpressure_core.dc.research.IResearchApi
    @Nullable
    public Object getResearchUrl(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        b bVar;
        BloodPressureResearchApiImpl bloodPressureResearchApiImpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objAwaitHttpGet$default = bVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
            HashMap map = new HashMap();
            map.put(this.RESEARCH_APPNAME_KEY, str);
            map.put(this.RESEARCH_SETTING_NAME_KEY, this.RESEARCH_SETTING_NAME);
            map.put(this.RESEARCH_SETTING_MODE_KEY, this.RESEARCH_SETTING_MODE);
            String strA = a(str);
            bVar2.a = this;
            bVar2.d = 1;
            objAwaitHttpGet$default = HttpKitKtxKt.awaitHttpGet$default(this, strA, map, null, bVar2, 4, null);
            if (objAwaitHttpGet$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            bloodPressureResearchApiImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bloodPressureResearchApiImpl = (BloodPressureResearchApiImpl) bVar2.a;
            ResultKt.throwOnFailure(objAwaitHttpGet$default);
        }
        JSONObject jSONObject = new JSONObject(ConverterKt.responseToJsonStr((Response) objAwaitHttpGet$default));
        JSONArray jSONArray = jSONObject.has(bloodPressureResearchApiImpl.RESEARCH_SETTING_NAME) ? new JSONArray(jSONObject.getString(bloodPressureResearchApiImpl.RESEARCH_SETTING_NAME)) : null;
        if (jSONArray == null) {
            return null;
        }
        int i3 = 0;
        int length = jSONArray.length();
        if (length <= 0) {
            return null;
        }
        while (true) {
            int i4 = i3 + 1;
            JSONObject jSONObject2 = new JSONObject(jSONArray.get(i3).toString());
            if (Intrinsics.areEqual(jSONObject2.getString("id"), bloodPressureResearchApiImpl.RESEARCH_URL)) {
                return jSONObject2.getString("url");
            }
            if (i4 >= length) {
                return null;
            }
            i3 = i4;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return IResearchApi.DefaultImpls.okHttpClient(this);
    }
}
