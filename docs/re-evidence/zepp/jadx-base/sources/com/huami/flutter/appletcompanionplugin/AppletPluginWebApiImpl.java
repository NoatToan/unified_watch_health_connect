package com.huami.flutter.appletcompanionplugin;

import com.google.gson.reflect.TypeToken;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.http.ConverterKt;
import com.huami.http.HttpError;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApiImpl;", "Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;", "Lcom/huami/http/HttpKit;", "", "deviceSource", "idListStr", "", "Lcom/huami/flutter/appletcompanionplugin/Datum;", "getJsAppListInfoFromCloud", "hostUrl", "Lcom/huami/flutter/appletcompanionplugin/JsAppDeveloperInfoData;", "getJsAppDeveloperInfo", "<init>", "()V", "Companion", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AppletPluginWebApiImpl implements AppletPluginWebApi, HttpKit {

    @NotNull
    private static final String a = "Applet-plugin-WebApiImpl";

    @NotNull
    private static final String b = "page";

    @NotNull
    private static final String c = "per_page";

    @NotNull
    private static final String d = "app_ids";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ JsAppDeveloperInfoData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JsAppDeveloperInfoData jsAppDeveloperInfoData) {
            super(0);
            this.a = jsAppDeveloperInfoData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Get js app developer info: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Get js app developer info failed, error is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Get AccountService read user id/ region/ token country code exception > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ AppListInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AppListInfo appListInfo) {
            super(0);
            this.a = appListInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Get app info list from cloud is > " + this.a + "  ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Parse datum exception > ", this.a);
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.flutter.appletcompanionplugin.AppletPluginWebApi
    @Nullable
    public JsAppDeveloperInfoData getJsAppDeveloperInfo(@NotNull String hostUrl) {
        Object objM3845constructorimpl;
        String strStringPlus = Intrinsics.stringPlus(hostUrl, "v2/developer");
        try {
            Result.Companion companion = Result.Companion;
            Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, strStringPlus, null, null, 6, null);
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (!responseHttpGet$default.isSuccessful()) {
                throw new HttpError(responseHttpGet$default);
            }
            ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
            ResponseBody responseBodyBody = responseHttpGet$default.body();
            if (responseBodyBody == null) {
                Intrinsics.throwNpe();
            }
            JsAppDeveloperInfoData jsAppDeveloperInfoData = (JsAppDeveloperInfoData) converter.convert(responseBodyBody, new TypeToken<JsAppDeveloperInfoData>() { // from class: com.huami.flutter.appletcompanionplugin.AppletPluginWebApiImpl$getJsAppDeveloperInfo$lambda-4$$inlined$deserializeOrThrow$1
            }.getType());
            HMLog.info$default(null, new a(jsAppDeveloperInfoData), 1, null);
            objM3845constructorimpl = Result.m3845constructorimpl(jsAppDeveloperInfoData);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(null, null, null, new b(thM3848exceptionOrNullimpl), 7, null);
            }
            return (JsAppDeveloperInfoData) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.flutter.appletcompanionplugin.AppletPluginWebApi
    @Nullable
    public List<Datum> getJsAppListInfoFromCloud(@NotNull String deviceSource, @NotNull String idListStr) {
        Object objM3845constructorimpl;
        List<Datum> data;
        String str = "market/devices/" + deviceSource + "/app";
        HashMap map = new HashMap();
        try {
            AccountService accountService = (AccountService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
            if (accountService != null) {
                map.put("userid", accountService.userIdOrThrow());
                String strUserRegion = AccountServiceExtKt.userRegion(accountService);
                if (strUserRegion != null) {
                    map.put("user_region", strUserRegion);
                }
                map.put("user_country", accountService.userCountryCode());
            }
            map.put("page", "1");
            map.put(c, "1000");
            map.put(d, idListStr);
        } catch (Exception e2) {
            HMLog.error$default(a, null, null, new c(e2), 6, null);
        }
        try {
            Result.Companion companion = Result.Companion;
            try {
                Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, str, map, null, 4, null);
                ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                if (!responseHttpGet$default.isSuccessful()) {
                    throw new HttpError(responseHttpGet$default);
                }
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                AppListInfo appListInfo = (AppListInfo) converter.convert(responseBodyBody, new TypeToken<AppListInfo>() { // from class: com.huami.flutter.appletcompanionplugin.AppletPluginWebApiImpl$getJsAppListInfoFromCloud$lambda-3$$inlined$deserializeOrThrow$1
                }.getType());
                HMLog.info(a, new d(appListInfo));
                data = appListInfo.getData();
                objM3845constructorimpl = Result.m3845constructorimpl(data);
                return (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
            } catch (Exception e3) {
                HMLog.error$default(a, null, null, new e(e3), 6, null);
                data = null;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }
}
