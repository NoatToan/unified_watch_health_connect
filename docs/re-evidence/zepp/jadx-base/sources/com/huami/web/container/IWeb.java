package com.huami.web.container;

import androidx.fragment.app.FragmentActivity;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.model.JsCashierReq;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH&J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&J \u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H&¨\u0006\u001b"}, d2 = {"Lcom/huami/web/container/IWeb;", "", "", "startRunning", "logoutByExpire", "", "mutexTime", "mutex", "", AbstractJSONTokenResponse.RESPONSE, "dealWebActivityLoginInvalid", SOAP.XMLNS, "downloadSuccessStrKeeper", "id", "keepDownloadApkId", "name", "downloadManagerPut", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/discovery/bridge/model/JsCashierReq;", "req", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "showCashierDesk", "mActivity", "params", "aliPay", "web_release"}, k = 1, mv = {1, 5, 1})
public interface IWeb {
    void aliPay(@NotNull FragmentActivity mActivity, @NotNull String params, @NotNull JsCallBackFunction function);

    void dealWebActivityLoginInvalid(@Nullable String response);

    void downloadManagerPut(long id, @NotNull String name);

    void downloadSuccessStrKeeper(@NotNull String s);

    void keepDownloadApkId(long id);

    void logoutByExpire();

    void mutex(long mutexTime);

    void showCashierDesk(@NotNull FragmentActivity activity, @NotNull JsCashierReq req, @NotNull JsCallBackFunction function);

    void startRunning();
}
