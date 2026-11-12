package com.huami.account.ui.simplify.external;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.utils.AppChannelKt;
import com.huami.discovery.bridge.BridgeCallbackBinder;
import com.huami.http.serverfault.handler.AccountFaultHandler;
import com.huami.http.serverfault.handler.HomeFaultHandler;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.callback.IHMHttpCallback;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.callback.IHMAppInfoCallback;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.passport.net.tools.RequestHandler;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.LoganTree;
import com.huami.tools.log.SimpleConsoleLogTree;
import com.huami.util.HmUtilModule;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.keeper.HMWebKeeper;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/account/ui/simplify/external/DefaultExternalInitializer;", "Lcom/huami/account/ui/simplify/external/ExternalInitializer;", "", "url", "", "statusCode", "", "a", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "flavorProduction", "flavorChannel", "", "isDebug", "initGlobalUtil", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "initLog", "name", "initWebKeeper", "initHttp", "", "miAppId", "appName", "initAppConfig", "initWebContainer", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public class DefaultExternalInitializer implements ExternalInitializer {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/android/volley/Request;", "kotlin.jvm.PlatformType", "request", "Lcom/android/volley/NetworkResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onReceive", "(Lcom/android/volley/Request;Lcom/android/volley/NetworkResponse;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements RequestHandler.OnReceiveNetworkResponse {
        public a() {
        }

        @Override // com.huami.passport.net.tools.RequestHandler.OnReceiveNetworkResponse
        public final void onReceive(Request<?> request, NetworkResponse networkResponse) {
            DefaultExternalInitializer.this.a(request.getUrl(), networkResponse.statusCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String url, int statusCode) {
        AccountFaultHandler.INSTANCE.updateApiStatus(url, statusCode);
        HomeFaultHandler.INSTANCE.updateApiStatus(url, statusCode);
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initAppConfig(@NotNull Context context, long miAppId, @NotNull String appName) {
        HMAppConfig.init(context, miAppId, AppChannelKt.getAppName());
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initGlobalUtil(@NotNull Application application, @NotNull String flavorProduction, @NotNull String flavorChannel, boolean isDebug) {
        GlobalUtil.init(flavorProduction, flavorChannel, isDebug);
        HmUtilModule.INSTANCE.init(application);
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initHttp(@NotNull final Context context) {
        HMWebUtil.initHttp(new IHMHttpCallback() { // from class: com.huami.account.ui.simplify.external.DefaultExternalInitializer.initHttp.1
            @Override // com.huami.network.base.callback.IHMHttpCallback
            @NotNull
            public Map<String, String> getHeader() {
                return HMWebUtil.getSystemHeader();
            }

            @Override // com.huami.network.base.callback.IHMHttpCallback
            public void log(@Nullable HMHttpResponseData data) {
            }

            @Override // com.huami.network.base.callback.IHMHttpCallback
            public boolean needCancelBeforeResponse(@Nullable HMHttpRequestData request, @Nullable HMHttpResponseData response, @Nullable IHMBasicHttpResponseHandler handler) {
                String url;
                if (response != null && (url = response.getUrl()) != null) {
                    DefaultExternalInitializer.this.a(url, response.getStatusCode());
                }
                return false;
            }

            @Override // com.huami.network.base.callback.IHMHttpCallback
            public boolean onPreRequest(@Nullable Map<String, String> header, @Nullable HMHttpRequestData data) {
                String tag;
                if (header == null) {
                    return true;
                }
                if (TextUtils.isEmpty(data != null ? data.getTag() : null)) {
                    return true;
                }
                if (data == null || (tag = data.getTag()) == null) {
                    tag = "";
                }
                header.put("X-Request-Id", tag);
                return true;
            }
        }, new IHMAppInfoCallback() { // from class: com.huami.account.ui.simplify.external.DefaultExternalInitializer.initHttp.2
            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            @NotNull
            public String getUserId() {
                return String.valueOf(HMLoginManager.getValidUid());
            }

            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            public boolean isAdultForAds() {
                return HMLoginManager.isAdult();
            }

            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            public boolean isHuamiSDKLogin() {
                return HMLoginManager.isHuamiSDKLogin();
            }

            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            public boolean isNetworkConnected() {
                return NetUtil.isNetworkConnected(context);
            }

            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            public boolean isUserValid() {
                return HMLoginManager.isUserValid();
            }

            @Override // com.huami.network.hmnetwork.callback.IHMAppInfoCallback
            public void processHeader(@Nullable Map<String, String> header) throws GettingTokenErrorException {
                if (header != null) {
                    header.put("hm-privacy-diagnostics", String.valueOf(HMLoginManager.getHmPrivacyDiagnostics()));
                    header.put("hm-privacy-ceip", String.valueOf(HMAccountKeeper.INSTANCE.readAgreeUserExperience()));
                    if (HMLoginManager.isOldAccount()) {
                        header.put("security", HMLoginManager.getSecurity());
                    } else if (HMLoginManager.isHuamiSDKLogin()) {
                        String token = HMWebAccess.getToken();
                        if (TextUtils.isEmpty(token)) {
                            throw new GettingTokenErrorException();
                        }
                        header.put("apptoken", token);
                    }
                }
            }
        }, HMHttpConfig.getDefault());
        RequestHandler.setHandler(new a());
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initLog(@NotNull Context context) {
        SimpleConsoleLogTree.Builder builder = new SimpleConsoleLogTree.Builder();
        builder.setShowMetadata(true);
        builder.setShowThreadInfo(true);
        builder.setShowTraceInfo(true);
        builder.setShowMetadata(true);
        builder.setShowMetadataInTail(true);
        HMLog.plant(builder.build());
        HMLog.plant(new LoganTree(2, context.getFilesDir().getAbsolutePath(), FileUtils.getLogRootDir(context)));
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initWebContainer() {
        BridgeCallbackBinder.getInstance().setAppNativeFunctionCallback(new AppNativeImpl());
    }

    @Override // com.huami.account.ui.simplify.external.ExternalInitializer
    public void initWebKeeper(@NotNull Context context, @NotNull String name) {
        HMWebKeeper.init(context.getSharedPreferences(name, 0));
    }
}
