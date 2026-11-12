package com.huami.userproperty.api;

import android.net.Uri;
import android.util.Log;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.gson.reflect.TypeToken;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.datasource.impl.SerializeHelper;
import com.huami.userproperty.entity.ParseResult;
import com.huami.userproperty.service.entity.ErrorCode;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushProperty;
import com.huami.userproperty.service.entity.remote.PushResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J0\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0003J2\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\u001c\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0006\u001a\u00020\u0003R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/huami/userproperty/api/UserPropertyApi;", "Lcom/huami/http/HttpKit;", "", "", "key", "mode", "apiUrl", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", RemoteConfigComponent.FETCH_FILE_NAME, "batchFetch", "value", "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "Lcom/huami/userproperty/service/entity/remote/PushProperty;", "properties", "a", "Ljava/lang/String;", "PUSH_ROOT_KEY", "b", "QUERY_PROPERTY_NAME", "c", "QUERY_PROPERTY_MODE", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class UserPropertyApi implements HttpKit {

    @NotNull
    public static final UserPropertyApi INSTANCE = new UserPropertyApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String PUSH_ROOT_KEY = "properties";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String QUERY_PROPERTY_NAME = "propertyName";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String QUERY_PROPERTY_MODE = "mode";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, String str, String str2) {
            super(0);
            this.a = list;
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch: key=" + this.a + ", mode=" + this.b + ", api=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch 成功: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ParseResult<LinkedHashMap<String, String>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ParseResult<LinkedHashMap<String, String>> parseResult) {
            super(0);
            this.a = parseResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch 成功，解析失败: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list, Exception exc) {
            super(0);
            this.a = list;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch 错误：" + this.a + '\n' + Log.getStackTraceString(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PushProperty> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<PushProperty> list, String str) {
            super(0);
            this.a = list;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("push: key=");
            List<PushProperty> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PushProperty) it2.next()).getKey());
            }
            sb.append(arrayList);
            sb.append(", api=");
            sb.append(this.b);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PushProperty> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<PushProperty> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<PushProperty> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PushProperty) it2.next()).getKey());
            }
            return Intrinsics.stringPlus("push 成功: ", arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PushProperty> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<PushProperty> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<PushProperty> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PushProperty) it2.next()).getKey());
            }
            return Intrinsics.stringPlus("push 失败: ", arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("push 错误：\n", Log.getStackTraceString(this.a));
        }
    }

    private UserPropertyApi() {
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @NotNull
    public final FetchResult<Map<String, String>> batchFetch(@NotNull List<String> key, @NotNull String apiUrl) {
        return fetch(key, "BATCH", apiUrl);
    }

    @NotNull
    public final FetchResult<Map<String, String>> fetch(@NotNull List<String> key, @NotNull String mode, @NotNull String apiUrl) {
        HMLog.info(UserPropertyModuleKt.MODULE_TAG, new a(key, mode, apiUrl));
        if (!Intrinsics.areEqual(mode, "BATCH") && key.size() > 1) {
            throw new IllegalArgumentException("只有 BATCH 模式允许传入多于一个 property key 参数");
        }
        if (m.isBlank(apiUrl)) {
            return new FetchResult.Failed(ErrorCode.ApiMissed.INSTANCE);
        }
        try {
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, Uri.parse(apiUrl).buildUpon().appendQueryParameter("mode", mode).appendQueryParameter(QUERY_PROPERTY_NAME, CollectionsKt___CollectionsKt.joinToString$default(key, ",", null, null, 0, null, null, 62, null)).build().toString(), null, null, 6, null);
            if (!responseHttpGet$default.isSuccessful()) {
                String strValueOf = String.valueOf(responseHttpGet$default.code());
                String strMessage = responseHttpGet$default.message();
                return Intrinsics.areEqual(strValueOf, "401") ? new FetchResult.Failed(new ErrorCode.InvalidToken(strMessage)) : new FetchResult.Failed(new ErrorCode.ApiError(strValueOf, strMessage));
            }
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            String strString = responseBodyBody == null ? null : responseBodyBody.string();
            ParseResult parseResult = SerializeHelper.INSTANCE.parse(new TypeToken<LinkedHashMap<String, String>>() { // from class: com.huami.userproperty.api.UserPropertyApi$fetch$$inlined$parse$1
            }.getType(), strString);
            if (parseResult instanceof ParseResult.Success) {
                HMLog.verbose$default(null, new b(key), 1, null);
            } else {
                HMLog.verbose$default(null, new c(parseResult), 1, null);
            }
            if (parseResult instanceof ParseResult.Success) {
                return new FetchResult.Success(((ParseResult.Success) parseResult).getValue());
            }
            if (parseResult instanceof ParseResult.Failed.JsonEmpty) {
                return new FetchResult.Success(null);
            }
            if (parseResult instanceof ParseResult.Failed.ParseFailed) {
                return new FetchResult.Failed(new ErrorCode.Unknown(Intrinsics.stringPlus("转换失败：json=", strString)));
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            HMLog.info(UserPropertyModuleKt.MODULE_TAG, new d(key, e2));
            String message = e2.getMessage();
            if (message == null) {
                message = "未知错误";
            }
            return new FetchResult.Failed(new ErrorCode.Unknown(message));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @NotNull
    public final PushResult push(@NotNull String key, @Nullable String value, @NotNull String apiUrl) {
        return push(kotlin.collections.e.listOf(new PushProperty(key, value)), apiUrl);
    }

    @NotNull
    public final PushResult push(@NotNull List<PushProperty> properties, @NotNull String apiUrl) {
        String str;
        HMLog.info(UserPropertyModuleKt.MODULE_TAG, new e(properties, apiUrl));
        if (m.isBlank(apiUrl)) {
            return new PushResult.Failed(ErrorCode.ApiMissed.INSTANCE);
        }
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(properties, 10));
            Iterator<T> it2 = properties.iterator();
            while (true) {
                str = "";
                if (!it2.hasNext()) {
                    break;
                }
                PushProperty pushProperty = (PushProperty) it2.next();
                String key = pushProperty.getKey();
                String value = pushProperty.getValue();
                if (value != null) {
                    str = value;
                }
                arrayList.add(TuplesKt.to(key, str));
            }
            String stringOrJson = SerializeHelper.INSTANCE.toStringOrJson(q.mapOf(TuplesKt.to("properties", r.toMap(arrayList))));
            if (stringOrJson != null) {
                str = stringOrJson;
            }
            Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(this, apiUrl, OkHttpKtxKt.buildRequestJsonBody(str), null, null, 12, null);
            if (responseHttpPost$default.isSuccessful()) {
                HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new f(properties));
                return PushResult.Success.INSTANCE;
            }
            HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new g(properties));
            return new PushResult.Failed(new ErrorCode.ApiError(String.valueOf(responseHttpPost$default.code()), responseHttpPost$default.message()));
        } catch (Exception e2) {
            HMLog.info(UserPropertyModuleKt.MODULE_TAG, new h(e2));
            String message = e2.getMessage();
            if (message == null) {
                message = "未知错误";
            }
            return new PushResult.Failed(new ErrorCode.Unknown(message));
        }
    }

    @NotNull
    public final FetchResult<Map<String, String>> fetch(@NotNull String key, @NotNull String mode, @NotNull String apiUrl) {
        return fetch(kotlin.collections.e.listOf(key), mode, apiUrl);
    }
}
