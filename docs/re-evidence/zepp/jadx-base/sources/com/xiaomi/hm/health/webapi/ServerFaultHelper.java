package com.xiaomi.hm.health.webapi;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.huami.account.HMLoginManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.http.serverfault.handler.AccountFaultHandler;
import com.huami.http.serverfault.handler.HomeFaultHandler;
import com.huami.http.serverfault.handler.LogoutFaultHandler;
import com.huami.passport.net.tools.RequestHandler;
import com.xiaomi.hm.health.webapi.ServerFaultHelper;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/webapi/ServerFaultHelper;", "", "", "enterSettingPage", "exitSettingPage", PointCategory.INIT, "resetStatus", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "handleApiStatus", "", "url", "", "statusCode", "", "a", "Z", "isInSettingPage", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ServerFaultHelper {

    @NotNull
    public static final ServerFaultHelper INSTANCE = new ServerFaultHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean isInSettingPage;

    private ServerFaultHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Request request, NetworkResponse networkResponse) {
        handleApiStatus(request.getUrl(), networkResponse.statusCode);
    }

    @JvmStatic
    public static final void enterSettingPage() {
        isInSettingPage = true;
    }

    @JvmStatic
    public static final void exitSettingPage() {
        isInSettingPage = false;
    }

    @JvmStatic
    public static final void handleApiStatus(@NotNull Response response) {
        handleApiStatus(response.request().url().toString(), response.code());
    }

    @JvmStatic
    public static final void init() {
        RequestHandler.setHandler(new RequestHandler.OnReceiveNetworkResponse() { // from class: xn6
            @Override // com.huami.passport.net.tools.RequestHandler.OnReceiveNetworkResponse
            public final void onReceive(Request request, NetworkResponse networkResponse) {
                ServerFaultHelper.b(request, networkResponse);
            }
        });
    }

    @JvmStatic
    public static final void resetStatus() {
        HomeFaultHandler.INSTANCE.resetStatus();
        LogoutFaultHandler.INSTANCE.resetStatus();
        AccountFaultHandler.INSTANCE.resetStatus();
    }

    @JvmStatic
    public static final void handleApiStatus(@NotNull String url, int statusCode) {
        if (isInSettingPage) {
            LogoutFaultHandler.INSTANCE.updateApiStatus(url, statusCode);
        } else if (HMLoginManager.isUnInit() || HMProcessLoginDataManager.isInLoginProcess()) {
            AccountFaultHandler.INSTANCE.updateApiStatus(url, statusCode);
        } else {
            HomeFaultHandler.INSTANCE.updateApiStatus(url, statusCode);
        }
    }
}
