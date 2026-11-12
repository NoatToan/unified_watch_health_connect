package defpackage;

import android.os.Bundle;
import android.os.Looper;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.request.InvoiceApplicationApi;
import com.huawei.ui.main.stories.health.request.InvoiceInfoFactory;
import com.huawei.ui.main.stories.health.request.InvoiceRequestInfo;
import com.huawei.ui.main.stories.health.request.InvoiceResponse;
import com.huawei.ui.main.stories.health.request.RespDownloadInvoice;
import com.huawei.ui.main.stories.health.request.RespQueryResult;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vdb {
    private static void b(uyq uyqVar, Bundle bundle) {
        String string = bundle.getString("invoiceType");
        String string2 = bundle.getString("content");
        int i = bundle.getInt("customerType");
        String string3 = bundle.getString("customerName");
        String string4 = bundle.getString("taxNo");
        String string5 = bundle.getString("email");
        String string6 = bundle.getString("orderCode");
        double d = bundle.getDouble(HwPayConstant.KEY_AMOUNT);
        String string7 = bundle.getString("locale");
        uyqVar.c(string);
        uyqVar.d(string2);
        uyqVar.a(String.valueOf(i));
        uyqVar.b(string3);
        uyqVar.i(string4);
        uyqVar.e(string5);
        uyqVar.h(string6);
        uyqVar.e(Double.valueOf(d));
        uyqVar.j(string7);
    }

    public static void e(final Bundle bundle, final UiCallback<Integer> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vdb.4
                @Override // java.lang.Runnable
                public void run() {
                    vdb.e(bundle, uiCallback);
                }
            });
            return;
        }
        uyq uyqVar = new uyq();
        b(uyqVar, bundle);
        InvoiceApplicationApi invoiceApplicationApi = (InvoiceApplicationApi) oet.d().e(InvoiceApplicationApi.class);
        InvoiceInfoFactory invoiceInfoFactory = new InvoiceInfoFactory(BaseApplication.getContext());
        String strC = ofe.c(invoiceInfoFactory.getBody(uyqVar));
        LogUtil.a("InvoiceRequestUtil", "invoice apply url: ", uyqVar.getUrl());
        LogUtil.a("InvoiceRequestUtil", "invoice apply headers:", invoiceInfoFactory.getHeaders());
        LogUtil.a("InvoiceRequestUtil", "invoice apply body: ", strC);
        try {
            Response<InvoiceResponse> responseExecute = invoiceApplicationApi.getInvoiceApply(uyqVar.getUrl(), invoiceInfoFactory.getHeaders(), strC).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("InvoiceRequestUtil", "requestInvoiceApply response is OK.");
                InvoiceResponse body = responseExecute.getBody();
                if (body == null) {
                    uiCallback.onFailure(1, "requestInvoiceApply result is null");
                    return;
                }
                LogUtil.a("InvoiceRequestUtil", "invoice apply result code: ", Integer.valueOf(body.getResultCode()));
                LogUtil.a("InvoiceRequestUtil", "invoice apply result desc: ", body.getResultDesc());
                if (body.getResultCode() != 0) {
                    ReleaseLogUtil.b("InvoiceRequestUtil", "invoice apply result code: ", Integer.valueOf(body.getResultCode()));
                    ReleaseLogUtil.b("InvoiceRequestUtil", "invoice apply result desc: ", body.getResultDesc());
                    uiCallback.onFailure(1, "requestInvoiceApply result is error");
                    return;
                }
                uiCallback.onSuccess(Integer.valueOf(body.getResultCode()));
                return;
            }
            uiCallback.onFailure(1, "requestInvoiceApply response is not ok, response code: " + responseExecute.getCode());
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.e("InvoiceRequestUtil", "requestInvoiceApply exception");
        }
    }

    public static void c(final String str, final UiCallback<List<InvoiceRequestInfo>> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vdb.3
                @Override // java.lang.Runnable
                public void run() {
                    vdb.c(str, uiCallback);
                }
            });
            return;
        }
        uyu uyuVar = new uyu();
        uyuVar.e(a(str));
        InvoiceApplicationApi invoiceApplicationApi = (InvoiceApplicationApi) oet.d().e(InvoiceApplicationApi.class);
        InvoiceInfoFactory invoiceInfoFactory = new InvoiceInfoFactory(BaseApplication.getContext());
        LogUtil.a("InvoiceRequestUtil", "query result url: ", uyuVar.getUrl());
        LogUtil.a("InvoiceRequestUtil", "query result headers:", invoiceInfoFactory.getHeaders());
        try {
            Response<RespQueryResult> responseExecute = invoiceApplicationApi.getQueryResult(uyuVar.getUrl(), invoiceInfoFactory.getHeaders()).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("InvoiceRequestUtil", "requestQueryResult response is OK.");
                RespQueryResult body = responseExecute.getBody();
                if (body == null) {
                    uiCallback.onFailure(1, "requestQueryResult result is null");
                    return;
                }
                if (body.getResultCode() != 0) {
                    ReleaseLogUtil.b("InvoiceRequestUtil", "query result result code: ", Integer.valueOf(body.getResultCode()));
                    ReleaseLogUtil.b("InvoiceRequestUtil", "query result result desc: ", body.getResultDesc());
                    uiCallback.onFailure(1, "requestQueryResult result is error");
                    return;
                } else {
                    List<InvoiceRequestInfo> invoiceRequestInfos = body.getInvoiceRequestInfos();
                    ReleaseLogUtil.c("InvoiceRequestUtil", "results: ", body.getInvoiceRequestInfos());
                    if (njy.e(invoiceRequestInfos)) {
                        uiCallback.onFailure(1, "requestQueryResult result is empty");
                        return;
                    } else {
                        uiCallback.onSuccess(invoiceRequestInfos);
                        return;
                    }
                }
            }
            uiCallback.onFailure(1, "requestQueryResult response is not ok, response code: " + responseExecute.getCode());
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.e("InvoiceRequestUtil", "requestQueryResult exception");
        }
    }

    public static void d(final String str, final UiCallback<String> uiCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vdb.2
                @Override // java.lang.Runnable
                public void run() {
                    vdb.d(str, uiCallback);
                }
            });
            return;
        }
        uym uymVar = new uym();
        uymVar.c(a(str));
        InvoiceApplicationApi invoiceApplicationApi = (InvoiceApplicationApi) oet.d().e(InvoiceApplicationApi.class);
        InvoiceInfoFactory invoiceInfoFactory = new InvoiceInfoFactory(BaseApplication.getContext());
        LogUtil.a("InvoiceRequestUtil", "download invoice url: ", uymVar.getUrl());
        LogUtil.a("InvoiceRequestUtil", "download invoice headers:", invoiceInfoFactory.getHeaders());
        try {
            Response<RespDownloadInvoice> responseExecute = invoiceApplicationApi.getDownloadInvoice(uymVar.getUrl(), invoiceInfoFactory.getHeaders()).execute();
            if (responseExecute.isOK()) {
                LogUtil.a("InvoiceRequestUtil", "requestDownloadInvoice response is OK.");
                RespDownloadInvoice body = responseExecute.getBody();
                if (body == null) {
                    uiCallback.onFailure(1, "requestDownloadInvoice result is null");
                    return;
                }
                if (body.getResultCode() != 0) {
                    ReleaseLogUtil.b("InvoiceRequestUtil", "download invoice result code: ", Integer.valueOf(body.getResultCode()));
                    uiCallback.onFailure(1, "requestDownloadInvoice response is error");
                    return;
                } else {
                    String message = body.getMessage();
                    ReleaseLogUtil.c("InvoiceRequestUtil", "download invoice file type: ", body.getFileType());
                    ReleaseLogUtil.c("InvoiceRequestUtil", "download invoice message: ", message);
                    uiCallback.onSuccess(message);
                    return;
                }
            }
            uiCallback.onFailure(1, "requestDownloadInvoice response is not ok, response code: " + responseExecute.getCode());
        } catch (JsonSyntaxException | IOException | IllegalStateException unused) {
            LogUtil.e("InvoiceRequestUtil", "requestDownloadInvoice exception");
        }
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("InvoiceRequestUtil", "getEncodedOrderCode encode for orderCode = ", str, " failed, ", "using orderCode! exception = ", ExceptionUtils.c(e));
            return str;
        }
    }
}
