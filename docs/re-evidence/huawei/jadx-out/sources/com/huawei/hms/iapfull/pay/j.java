package com.huawei.hms.iapfull.pay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.huawei.hms.iapfull.R;
import com.huawei.hms.iapfull.a1;
import com.huawei.hms.iapfull.bean.PayRequest;
import com.huawei.hms.iapfull.bean.PayResult;
import com.huawei.hms.iapfull.e1;
import com.huawei.hms.iapfull.g0;
import com.huawei.hms.iapfull.network.model.AliPaySignResponse;
import com.huawei.hms.iapfull.network.model.DeveloperSignRequest;
import com.huawei.hms.iapfull.network.model.PaySignRequest;
import com.huawei.hms.iapfull.network.model.QueryOrderRequest;
import com.huawei.hms.iapfull.network.model.QueryOrderResponse;
import com.huawei.hms.iapfull.network.model.QueryWithholdResultRequest;
import com.huawei.hms.iapfull.network.model.QueryWithholdResultResponse;
import com.huawei.hms.iapfull.network.model.ReportEntity;
import com.huawei.hms.iapfull.network.model.ReportPayResultParams;
import com.huawei.hms.iapfull.network.model.WithholdQueryResultData;
import com.huawei.hms.iapfull.p0;
import com.huawei.hms.iapfull.r0;
import com.huawei.hms.iapfull.s0;
import com.huawei.hms.iapfull.t0;
import com.huawei.hms.iapfull.u0;
import com.huawei.hms.iapfull.v0;
import com.huawei.hms.iapfull.w0;
import com.huawei.hms.iapfull.x0;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.iapfull.z0;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.secure.android.common.util.SafeString;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.open.utils.HttpUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class j implements m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PayRequest f13743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f13744c;
    private p0 d;
    private String e;
    private String f;
    private String g;
    private ReportEntity h;

    static void a(j jVar) {
        DeveloperSignRequest developerSignRequest;
        PayRequest payRequest = jVar.f13743b;
        if (payRequest == null) {
            y0.a("PayPresenter", "getDevSignParams: request is null");
            jVar.a().a();
            developerSignRequest = null;
        } else {
            DeveloperSignRequest developerSignRequest2 = new DeveloperSignRequest(payRequest);
            developerSignRequest2.setDevelopUserSign(payRequest.getSign());
            developerSignRequest2.setPackageName(payRequest.getPackageName());
            developerSignRequest2.setExtUserName(payRequest.getMerchantName());
            developerSignRequest2.setVer("1");
            ArrayList arrayList = new ArrayList();
            arrayList.add("FP_PayTypePolices");
            arrayList.add("liteSdkWXNotSupportMerchants");
            developerSignRequest2.setDics(arrayList);
            String strA = a1.a();
            developerSignRequest2.setNoiseTamp(strA);
            y0.b("PayPresenter", "requestDeveloperSign, noiseTamp: " + strA);
            developerSignRequest = developerSignRequest2;
        }
        PayActivity payActivityA = jVar.a();
        i iVar = new i(jVar);
        if (TextUtils.isEmpty(g0.a().f13669a)) {
            y0.a("PayRepository", "startReportPayResult: Grs is fail");
            return;
        }
        if (developerSignRequest == null || payActivityA == null) {
            iVar.a(ResultCode.CODE_NO_NEW_DATA, "param error");
        } else if (!a1.b(payActivityA)) {
            iVar.a("-1", HttpUtils.NetworkUnavailableException.ERROR_INFO);
        } else {
            com.huawei.hms.iapfull.network.b.a(payActivityA.getApplicationContext(), g0.a().f13669a).developerSign(developerSignRequest).enqueue(new com.huawei.hms.iapfull.network.a(new com.huawei.hms.iapfull.d(iVar)));
        }
    }

    static void b(j jVar, AliPaySignResponse aliPaySignResponse) {
        if (jVar.f()) {
            jVar.f13744c.a(aliPaySignResponse);
            return;
        }
        aliPaySignResponse.parseJson();
        m mVar = jVar.f13744c;
        String aliPayOrderInfo = aliPaySignResponse.getAliPayOrderInfo();
        mVar.getClass();
        if (TextUtils.isEmpty(aliPayOrderInfo)) {
            y0.b("ThirdPayHelper", "callAliPaySDK,but strOrderInfo is empty");
        } else {
            new Thread(new l(mVar, aliPayOrderInfo)).start();
        }
    }

    private ReportPayResultParams c() throws JSONException {
        String string;
        Date date;
        StringBuilder sb;
        String str;
        if (this.f13743b == null) {
            str = "getReportPayResultParams payRequest is null";
        } else {
            if (this.h != null) {
                ReportPayResultParams reportPayResultParams = new ReportPayResultParams();
                reportPayResultParams.setMerchantID(this.f13743b.getMerchantId());
                reportPayResultParams.setRequestId(this.f13743b.getRequestId());
                reportPayResultParams.setApplicationID(this.f13743b.getApplicationID());
                reportPayResultParams.setOrderNo(this.h.getOrderNo());
                reportPayResultParams.setPkgName(this.f13743b.getPackageName());
                reportPayResultParams.setData(d());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("merchantID", this.f13743b.getMerchantId());
                jSONObject.put("requestId", this.f13743b.getRequestId());
                jSONObject.put(HwPayConstant.KEY_APPLICATIONID, this.f13743b.getApplicationID());
                jSONObject.put("orderNo", this.h.getOrderNo());
                jSONObject.put(SdkCfgSha256Record.PKGNAME, this.f13743b.getPackageName());
                jSONObject.put("at", this.f13742a);
                jSONObject.put(TagConstants.SCENE_TYPE, "fullSDK");
                jSONObject.put("data", d());
                String strA = a1.a(jSONObject);
                String str2 = this.e;
                reportPayResultParams.setSign(a1.a(str2, strA, a1.a(str2, HwPayConstant.SIGNTYPE_RSA256PSS)));
                reportPayResultParams.setSignType(a1.a(this.e, HwPayConstant.SIGNTYPE_RSA256PSS));
                reportPayResultParams.setScene("fullSDK");
                reportPayResultParams.setUserName(this.f13743b.getMerchantName());
                reportPayResultParams.setAt(this.f13742a);
                reportPayResultParams.setOrderID(this.h.getPayOrderId());
                reportPayResultParams.setAmount(this.h.getAmount());
                if (!TextUtils.isEmpty(this.h.getReturnCode())) {
                    reportPayResultParams.setReturnCode(this.h.getReturnCode());
                }
                if (!TextUtils.isEmpty(this.h.getTradeTime())) {
                    String tradeTime = this.h.getTradeTime();
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        if (TextUtils.isEmpty(tradeTime) || (date = simpleDateFormat.parse(tradeTime)) == null) {
                            sb = new StringBuilder();
                            sb.append(System.currentTimeMillis());
                            sb.append("");
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(date.getTime());
                            sb2.append("");
                            sb = sb2;
                        }
                        string = sb.toString();
                    } catch (ParseException unused) {
                        string = System.currentTimeMillis() + "";
                    }
                    reportPayResultParams.setTradeTime(string);
                }
                if (!TextUtils.isEmpty(this.f13743b.getCurrency())) {
                    reportPayResultParams.setCurrency(this.f13743b.getCurrency());
                }
                if (!TextUtils.isEmpty(this.f13743b.getCountry())) {
                    reportPayResultParams.setCountry(this.f13743b.getCountry());
                }
                return reportPayResultParams;
            }
            str = "getReportPayResultParams reportEntity is null";
        }
        y0.a("PayPresenter", str);
        return null;
    }

    private void e() {
        if (this.d == null) {
            y0.a("PayPresenter", "view is null");
            return;
        }
        if (this.f13743b == null) {
            y0.a("PayPresenter", "payRequest is null");
            a().finish();
            return;
        }
        m mVar = new m(a(), this.f13743b.getAmount());
        this.f13744c = mVar;
        mVar.a(this);
        a().a(a().getString(R.string.hwpay_loading));
        g0.a().a(a(), y0.a(this.f13743b.getReservedInfor()), new h(this));
    }

    protected void c(int i) {
        if (i == 17) {
            try {
                if (!a(a(), "com.tencent.mm")) {
                    y0.b("PayPresenter", "try to pay or subscribe but not install wechat");
                    a1.a(a(), R.string.hwpay_wechat_pay_err_tips, 0);
                    y0.b("PayPresenter", "not install wechat");
                    return;
                }
            } catch (JSONException unused) {
                y0.b("PayPresenter", "params error");
                return;
            }
        }
        y0.b("PayPresenter", "wechat installed");
        if (f() && i == 5 && !a(a(), "com.eg.android.AlipayGphone")) {
            y0.b("PayPresenter", "try to use alipay withhold but not install alipay");
            a1.a(a(), R.string.hwpay_ali_pay_sign_err_tips, 0);
            return;
        }
        a().a(a().getString(R.string.hwpay_jump_to_third));
        PaySignRequest paySignRequestA = a(i);
        if (paySignRequestA == null) {
            y0.b("PayPresenter", "params is null");
        } else {
            y0.b("PayPresenter", "params is in requestPaySign");
            t0.a().a(a(), paySignRequestA, new a(i));
        }
    }

    static void a(j jVar, AliPaySignResponse aliPaySignResponse) {
        jVar.getClass();
        y0.b("PayPresenter", "callWetchatPayChannel start");
        if (jVar.f()) {
            aliPaySignResponse.parseWeChatJson();
            m mVar = jVar.f13744c;
            PayActivity payActivityA = jVar.a();
            mVar.getClass();
            if (payActivityA != null) {
                String wechatPaySignAppid = aliPaySignResponse.getWeChatPayInfo().getWechatPaySignAppid();
                String preEntrustWebID = aliPaySignResponse.getWeChatPayInfo().getPreEntrustWebID();
                if (TextUtils.isEmpty(preEntrustWebID) || TextUtils.isEmpty(wechatPaySignAppid)) {
                    y0.b("ThirdPayHelper", "callWechatWithhold pre_entrustweb_id or appid is null");
                } else if (m.a(payActivityA, wechatPaySignAppid, preEntrustWebID)) {
                    y0.b("PayPresenter", "callWechatWithhold success");
                    return;
                }
            } else {
                y0.a("ThirdPayHelper", "callWechatWithhold, but paramters are empty");
            }
            y0.a("PayPresenter", "callWechatWithhold fail");
            ((PayActivity) jVar.d).a(new PayResult(30001, "params is error"));
            return;
        }
        aliPaySignResponse.parseWeChatJson();
        m mVar2 = jVar.f13744c;
        PayActivity payActivityA2 = jVar.a();
        mVar2.getClass();
        if (payActivityA2 != null) {
            String wechatPaySignAppid2 = aliPaySignResponse.getWeChatPayInfo().getWechatPaySignAppid();
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(payActivityA2, wechatPaySignAppid2);
            iwxapiCreateWXAPI.registerApp(wechatPaySignAppid2);
            PayReq payReq = new PayReq();
            payReq.appId = wechatPaySignAppid2;
            payReq.partnerId = aliPaySignResponse.getPartnerId();
            payReq.prepayId = aliPaySignResponse.getWeChatPayInfo().getPrepayId();
            payReq.packageValue = aliPaySignResponse.getWeChatPayInfo().getPackageValue();
            payReq.nonceStr = aliPaySignResponse.getWeChatPayInfo().getNonceStr();
            payReq.timeStamp = aliPaySignResponse.getWeChatPayInfo().getTimeStamp();
            payReq.sign = aliPaySignResponse.getWeChatPayInfo().getWeChatSign();
            y0.b("ThirdPayHelper", "callWeChatPay, req construction is complete");
            if (iwxapiCreateWXAPI.sendReq(payReq)) {
                y0.b("PayPresenter", "callWeChatPay success");
                return;
            }
        } else {
            y0.a("ThirdPayHelper", "callWeChatPay, but paramters are empty");
        }
        y0.a("PayPresenter", "callWeChatPay fail");
        ((PayActivity) jVar.d).a(new PayResult(30001, "params is error"));
    }

    static void a(j jVar, QueryOrderResponse queryOrderResponse) {
        jVar.getClass();
        if (1 != queryOrderResponse.getStatus()) {
            jVar.a().a();
            y0.b("PayPresenter", "queryOrder failed, status code is :" + queryOrderResponse.getStatus());
            e1.a().a(jVar.a(), queryOrderResponse.getStatus());
            return;
        }
        y0.b("PayPresenter", "pay success!");
        x0 x0Var = new x0();
        x0Var.d(jVar.f13743b.getProductName());
        x0Var.e(jVar.f13743b.getAmount());
        x0Var.c(queryOrderResponse.getPayType());
        queryOrderResponse.getPayType().equals(String.valueOf(5));
        if (jVar.h == null) {
            jVar.h = new ReportEntity();
        }
        jVar.h.setReturnCode(queryOrderResponse.getReturnCode());
        jVar.h.setReturnDesc(queryOrderResponse.getReturnDesc());
        jVar.h.setStatus(String.valueOf(queryOrderResponse.getStatus()));
        jVar.h.setErrMsg(queryOrderResponse.getReturnDesc());
        jVar.h.setAmount(jVar.f13743b.getAmount());
        jVar.h.setOrderNo(queryOrderResponse.getOrderId());
        jVar.h.setTradeNo(queryOrderResponse.getTradeNo());
        jVar.h.setTradeTime(queryOrderResponse.getTradeTime());
        jVar.h.setOrderTime(queryOrderResponse.getOrderTime());
        x0Var.f(jVar.h.getTradeTime());
        x0Var.b(jVar.h.getOrderNo());
        x0Var.a(jVar.h.getErrMsg());
        ((PayActivity) jVar.d).b(x0Var);
    }

    static boolean a(j jVar, QueryWithholdResultResponse queryWithholdResultResponse) {
        jVar.getClass();
        if (queryWithholdResultResponse.getData() != null && !queryWithholdResultResponse.getData().isEmpty()) {
            return true;
        }
        y0.b("PayPresenter", "isWithholdSuccess fail response.getData() is null");
        return false;
    }

    static void a(j jVar, QueryWithholdResultResponse queryWithholdResultResponse, String str) {
        jVar.getClass();
        x0 x0Var = new x0();
        List<WithholdQueryResultData> data = queryWithholdResultResponse.getData();
        if (data != null && data.size() > 0) {
            x0Var.b(data.get(0).getPactNo());
            x0Var.f(data.get(0).getPactTime());
            x0Var.c(data.get(0).getChannel());
        }
        x0Var.e(jVar.f13743b.getAmount());
        x0Var.d(jVar.f13743b.getProductName());
        x0Var.b(jVar.f);
        if (!TextUtils.isEmpty(str)) {
            x0Var.g(str);
        }
        if (jVar.h == null) {
            jVar.h = new ReportEntity();
        }
        List<WithholdQueryResultData> data2 = queryWithholdResultResponse.getData();
        if (data2 != null && data2.size() > 0) {
            jVar.h.setWithHoldId(data2.get(0).getPactNo());
            jVar.h.setTradeTime(data2.get(0).getPactTime());
            jVar.h.setPayType(data2.get(0).getChannel());
        }
        jVar.h.setReturnCode(queryWithholdResultResponse.getReturnCode());
        jVar.h.setReturnDesc(queryWithholdResultResponse.getReturnDesc());
        jVar.h.setStatus("1");
        jVar.h.setAmount(jVar.f13743b.getAmount());
        jVar.h.setErrMsg(queryWithholdResultResponse.getReturnDesc());
        jVar.h.setOrderNo(jVar.f);
        x0Var.a(jVar.h.getErrMsg());
        ((PayActivity) jVar.d).c(x0Var);
    }

    public void a(String str, String str2, String str3, String str4) {
        ReportEntity reportEntity = new ReportEntity();
        this.h = reportEntity;
        reportEntity.setReturnCode("0");
        this.h.setReturnDesc(str);
        this.h.setStatus("1");
        this.h.setErrMsg(str);
        this.h.setAmount(this.f13743b.getAmount());
        this.h.setOrderNo(str4);
        this.h.setTradeNo(null);
        this.h.setTradeTime();
        ReportEntity reportEntity2 = this.h;
        reportEntity2.setOrderTime(reportEntity2.getTradeTime());
        this.h.setYeeOrAliPaySign(str3);
        this.h.setYeeOrAliPaySignContent(str2);
        b(5);
    }

    public LinkedHashMap<String, String> a(PayRequest payRequest) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("packageName", payRequest.getPackageName());
        linkedHashMap.put("appId", payRequest.getApplicationID());
        linkedHashMap.put(HwPayConstant.KEY_PRODUCTNAME, payRequest.getProductName());
        linkedHashMap.put(ParsedFieldTag.PRICE, payRequest.getAmount());
        String country = payRequest.getCountry();
        if (!TextUtils.isEmpty(country)) {
            String requestId = payRequest.getRequestId();
            if (!"CN".equals(country)) {
                requestId = "";
            }
            linkedHashMap.put("requestId", requestId);
        }
        return linkedHashMap;
    }

    private PaySignRequest a(int i) throws JSONException {
        PayRequest payRequest = this.f13743b;
        if (payRequest == null) {
            y0.a("PayPresenter", "getDevSignParams: payRequest is null");
            return null;
        }
        PaySignRequest paySignRequest = new PaySignRequest(payRequest);
        paySignRequest.checkCountryAndCurrency();
        paySignRequest.setPackageName(this.f13743b.getPackageName());
        paySignRequest.setMerName(this.f13743b.getMerchantName());
        int i2 = z0.f13814a;
        paySignRequest.setManufacturer(Build.MANUFACTURER);
        paySignRequest.setDeviceBrand(Build.BRAND);
        paySignRequest.setAccessMode("0");
        if (!TextUtils.isEmpty(this.f13743b.getMerchantId())) {
            paySignRequest.setUserID(this.f13743b.getMerchantId());
        } else if (!TextUtils.isEmpty(this.f13743b.getMerchantName())) {
            paySignRequest.setUserName(this.f13743b.getMerchantName());
        }
        if (i == 5) {
            paySignRequest.setChannel("AliPay");
            if (TextUtils.isEmpty(paySignRequest.getTradeType())) {
                paySignRequest.setTradeType("App4");
            }
        } else if (i == 17) {
            paySignRequest.setChannel("TenPay");
            if (TextUtils.isEmpty(paySignRequest.getReservedInfor())) {
                paySignRequest.setReservedInfor("17");
            }
            if (f()) {
                paySignRequest.setTradeType("toSign4app");
            } else {
                paySignRequest.setTradeType(null);
            }
            paySignRequest.setWalletAppId(this.f13743b.getPackageName());
        }
        String str = System.currentTimeMillis() + "";
        paySignRequest.setTime(str);
        paySignRequest.setSerialNo(SafeString.substring(UUID.randomUUID().toString().replace(Constants.LINK, ""), 0, 16) + str + "_" + this.f13743b.getRequestId());
        String strA = a1.a();
        paySignRequest.setNoiseTamp(strA);
        StringBuilder sb = new StringBuilder("paySign , noiseTamp is: ");
        sb.append(strA);
        y0.b("PayPresenter", sb.toString());
        String reservedInfor = this.f13743b.getReservedInfor();
        if (TextUtils.isEmpty(reservedInfor)) {
            y0.b("PayPresenter", "reservedInfor is null!");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(new JSONObject(reservedInfor).optString("accountInfo"));
                String strOptString = jSONObject.optString("accessToken");
                this.f13742a = strOptString;
                paySignRequest.setAt(strOptString);
                paySignRequest.setCountry(jSONObject.optString("countryCode"));
            } catch (JSONException unused) {
                y0.a("PayPresenter", "setAccountInfo: JSONException");
            }
        }
        if (f()) {
            paySignRequest.setWeburl("hwid://" + this.f13743b.getPackageName() + ".iapfull/result");
        }
        paySignRequest.setScene("fullSDK");
        String strA2 = a1.a(new JSONObject(new Gson().toJson(paySignRequest)));
        String strA3 = a1.a(this.e, HwPayConstant.SIGNTYPE_RSA256PSS);
        paySignRequest.setSign(a1.a(this.e, strA2, strA3));
        paySignRequest.setSignType(strA3);
        return paySignRequest;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public boolean a(Context context, String str) {
        String str2;
        String str3;
        if (context == null) {
            str2 = "getVersion context is null.";
        } else {
            if (!TextUtils.isEmpty(str)) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        str3 = null;
                    } else {
                        if (TextUtils.isEmpty(str)) {
                            str = context.getPackageName();
                        }
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 16384);
                        if (packageInfo != null) {
                            str3 = packageInfo.versionName;
                        } else {
                            str3 = null;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    str2 = "getVersion, get the app version fail, NameNotFoundException";
                    y0.a("PayPresenter", str2);
                } catch (RuntimeException unused2) {
                    str2 = "getVersion, get the app version fail, RuntimeException";
                    y0.a("PayPresenter", str2);
                }
                return !TextUtils.isEmpty(str3);
            }
            str2 = "getVersion packageName is null.";
        }
        y0.a("PayPresenter", str2);
        str3 = null;
        return !TextUtils.isEmpty(str3);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            y0.b("PayPresenter", "processWithholdResult result is null");
            return;
        }
        Map<String, String> mapA = a1.a(str, "&", false);
        String strA = a1.a(mapA);
        HashMap map = (HashMap) mapA;
        String str2 = (String) map.get(HwPayConstant.KEY_SIGN);
        String str3 = (String) map.get("is_success");
        String str4 = (String) map.get("external_sign_no");
        if (ExifInterface.GPS_DIRECTION_TRUE.equals(str3)) {
            ReportEntity reportEntity = new ReportEntity();
            this.h = reportEntity;
            reportEntity.setReturnCode("0");
            this.h.setReturnDesc("success");
            this.h.setStatus("1");
            this.h.setErrMsg("success");
            this.h.setOrderNo(this.f);
            this.h.setYeeOrAliPaySign(str2);
            this.h.setYeeOrAliPaySignContent(strA);
            this.h.setWithHoldId(str4);
            a(str4, 5);
        }
    }

    protected void a(String str, int i) {
        a().a(a().getString(R.string.hwpay_loading));
        String str2 = TextUtils.isEmpty(str) ? this.g : str;
        QueryWithholdResultRequest queryWithholdResultRequest = new QueryWithholdResultRequest();
        queryWithholdResultRequest.setRequestId(this.f13743b.getRequestId());
        queryWithholdResultRequest.setPactNo(str2);
        queryWithholdResultRequest.setSourceID("fullSDK");
        queryWithholdResultRequest.setApplicationID(this.f13743b.getApplicationID());
        queryWithholdResultRequest.setAt(this.f13742a);
        queryWithholdResultRequest.setSrvCountry(this.f13743b.getCountry());
        String strA = a1.a();
        queryWithholdResultRequest.setNoiseTamp(strA);
        y0.b("PayPresenter", "queryWithholdResult , noiseTamp is: " + strA);
        PayActivity payActivityA = a();
        c cVar = new c(str);
        if (payActivityA == null) {
            cVar.a(ResultCode.CODE_NO_NEW_DATA, "param error");
            return;
        }
        if (!a1.b(payActivityA)) {
            cVar.a("-1", HttpUtils.NetworkUnavailableException.ERROR_INFO);
            return;
        }
        com.huawei.hms.iapfull.j jVar = new com.huawei.hms.iapfull.j(cVar);
        if (5 != i) {
            com.huawei.hms.iapfull.network.d.d(payActivityA.getApplicationContext(), g0.a().f13669a).queryWithhold(queryWithholdResultRequest).enqueue(new com.huawei.hms.iapfull.network.a(jVar));
        } else {
            y0.b("QueryRepository", "Query order poll start");
            com.huawei.hms.iapfull.network.d.b(payActivityA.getApplicationContext(), g0.a().f13669a).pollQueryWithhold(queryWithholdResultRequest).enqueue(new com.huawei.hms.iapfull.network.a(jVar));
        }
    }

    public void g() {
        y0.b("PayPresenter", "start query result");
        if (f()) {
            y0.a("PayPresenter", "activityFocusChanged withhold back");
            if (TextUtils.isEmpty(this.g)) {
                return;
            }
            a(this.g, 17);
            return;
        }
        y0.a("PayPresenter", "activityFocusChanged pay back");
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        b(17);
    }

    protected void b(int i) {
        try {
            a().a(a().getString(R.string.hwpay_loading));
            QueryOrderRequest queryOrderRequestB = b();
            y0.b("PayPresenter", "queryOrder, noiseTamp is: " + queryOrderRequestB.getNoiseTamp());
            w0.a().a(a(), i, queryOrderRequestB, new b());
        } catch (JSONException unused) {
            y0.a("PayPresenter", "queryOrder, param error");
        }
    }

    public void a(s0 s0Var) {
        try {
            ReportPayResultParams reportPayResultParamsC = c();
            if (reportPayResultParamsC != null) {
                t0.a().a(a(), reportPayResultParamsC, s0Var);
            } else {
                y0.b("PayPresenter", "params is null");
                s0Var.a(ResultCode.CODE_NO_NEW_DATA, "param error");
            }
        } catch (Exception unused) {
            y0.a("PayPresenter", "report fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        PayRequest payRequest = this.f13743b;
        if (payRequest != null) {
            return "toSign".equals(payRequest.getTradeType());
        }
        return false;
    }

    private String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HwPayConstant.KEY_USER_NAME, this.f13743b.getMerchantName());
        jSONObject.put(HwPayConstant.KEY_AMOUNT, this.h.getAmount());
        if (!TextUtils.isEmpty(this.h.getPayOrderId())) {
            jSONObject.put("orderID", this.h.getPayOrderId());
        }
        if (!TextUtils.isEmpty(this.h.getErrMsg())) {
            jSONObject.put("errMsg", this.h.getErrMsg());
        }
        if (!TextUtils.isEmpty(this.h.getTradeTime())) {
            jSONObject.put("time", this.h.getTradeTime());
        }
        if (!TextUtils.isEmpty(this.h.getReturnCode())) {
            jSONObject.put("returnCode", this.h.getReturnCode());
        }
        if (!TextUtils.isEmpty(this.h.getWithHoldId())) {
            jSONObject.put("withholdID", this.h.getWithHoldId());
        }
        jSONObject.put("requestId", this.f13743b.getRequestId());
        jSONObject.put(HwPayConstant.KEY_SIGN_TYPE, this.f13743b.getUsedSignType());
        return jSONObject.toString();
    }

    class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13745a;

        @Override // com.huawei.hms.iapfull.r0
        public void a(String str, String str2) {
            j.this.a().a();
            y0.b("PayPresenter", "requestPaySign failed, errorCode is: " + str + " desc is: " + str2);
            if (j.this.d == null) {
                y0.b("PayPresenter", "view is null");
                return;
            }
            ((PayActivity) j.this.d).a(new PayResult(-1, "pay fail"));
        }

        @Override // com.huawei.hms.iapfull.r0
        public void a(AliPaySignResponse aliPaySignResponse) {
            j.this.a().a();
            if (aliPaySignResponse == null) {
                new AliPaySignResponse().setReturnCode("-1");
                return;
            }
            y0.b("PayPresenter", "errorCode: " + aliPaySignResponse.getReturnCode());
            if (!"0".equals(aliPaySignResponse.getReturnCode())) {
                ((PayActivity) j.this.d).a(aliPaySignResponse.getReturnDesc(), aliPaySignResponse.getReturnCode());
                return;
            }
            y0.b("PayPresenter", "paySign success!");
            j.this.f = aliPaySignResponse.getOrderID();
            int i = this.f13745a;
            if (i == 5) {
                j.this.g = aliPaySignResponse.getPactNo();
                j.b(j.this, aliPaySignResponse);
            } else if (i == 17) {
                j.this.g = aliPaySignResponse.getPactNo();
                j.a(j.this, aliPaySignResponse);
            }
            j jVar = j.this;
            com.huawei.hms.iapfull.b.a(j.this.a(), "iap_payment_cashier_click_confirm", jVar.a(jVar.f13743b));
        }

        a(int i) {
            this.f13745a = i;
        }
    }

    class b implements u0 {
        @Override // com.huawei.hms.iapfull.u0
        public void a(String str, String str2) {
            j.this.a().a();
            y0.b("queryPayResult", "errorCode = " + str + ", desc = " + str2);
            if ("30005".equals(str)) {
                return;
            }
            e1.a().a(j.this.a(), R.string.hwpay_returnCodeE200999des);
        }

        @Override // com.huawei.hms.iapfull.u0
        public void a(QueryOrderResponse queryOrderResponse) {
            y0.b("queryPayResult", "returnCode = " + queryOrderResponse.getReturnCode() + ", status = " + queryOrderResponse.getStatus());
            if ("0".equals(queryOrderResponse.getReturnCode()) && (queryOrderResponse.getStatus() == 0 || 1 == queryOrderResponse.getStatus())) {
                j.a(j.this, queryOrderResponse);
                return;
            }
            j.this.a().a();
            if (!TextUtils.isEmpty(queryOrderResponse.getErrMsg())) {
                e1.a().a(j.this.a(), queryOrderResponse.getErrMsg());
            }
            y0.b("queryPayResult", "status is fail");
        }

        b() {
        }
    }

    class c implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13748a;

        @Override // com.huawei.hms.iapfull.v0
        public void a(String str, String str2) {
            j.this.a().a();
            y0.a("PayPresenter", "queryWithholdResult fail, errorCode:" + str + ", desc: " + str2);
            e1.a().a(j.this.a(), R.string.hwpay_returnCodeE200999des);
        }

        @Override // com.huawei.hms.iapfull.v0
        public void a(QueryWithholdResultResponse queryWithholdResultResponse) {
            if (queryWithholdResultResponse != null) {
                if ("0".equals(queryWithholdResultResponse.getReturnCode()) && j.a(j.this, queryWithholdResultResponse)) {
                    y0.b("PayPresenter", "queryWithholdResult success!");
                    j.a(j.this, queryWithholdResultResponse, this.f13748a);
                    return;
                } else if (!"0".equals(queryWithholdResultResponse.getReturnCode())) {
                    e1.a().a(j.this.a(), queryWithholdResultResponse.getReturnDesc());
                }
            }
            j.this.a().a();
            y0.a("PayPresenter", "queryWithholdResult fail! data is null");
        }

        c(String str) {
            this.f13748a = str;
        }
    }

    private QueryOrderRequest b() throws JSONException {
        QueryOrderRequest queryOrderRequest = new QueryOrderRequest();
        queryOrderRequest.setUserID(this.f13743b.getMerchantId());
        queryOrderRequest.setRequestId(this.f13743b.getRequestId());
        queryOrderRequest.setTime(System.currentTimeMillis());
        queryOrderRequest.setOrderNo(this.f);
        queryOrderRequest.setNoiseTamp(a1.a());
        String strA = a1.a(new JSONObject(new Gson().toJson(queryOrderRequest)));
        String strA2 = a1.a(this.e, HwPayConstant.SIGNTYPE_RSA256PSS);
        queryOrderRequest.setSign(a1.a(this.e, strA, strA2));
        queryOrderRequest.setSignType(strA2);
        return queryOrderRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PayActivity a() {
        p0 p0Var = this.d;
        return p0Var instanceof PayActivity ? (PayActivity) p0Var : new PayActivity();
    }

    public j(PayRequest payRequest, p0 p0Var) {
        this.f13743b = payRequest;
        this.d = p0Var;
        e();
    }
}
