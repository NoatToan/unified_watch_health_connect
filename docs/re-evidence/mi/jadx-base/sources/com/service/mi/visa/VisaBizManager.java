package com.service.mi.visa;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.mi.common.MiPayStatus;
import com.service.mi.common.apdu.ApduResp;
import com.service.mi.common.apdu.BaseApduManager;
import com.service.mi.common.util.a;
import com.service.mi.entity.SpError;
import com.service.mi.sei.entity.ApduNotifyResp;
import com.service.mi.visa.entity.EncryptedPaymentInstrument;
import com.service.mi.visa.entity.ExpirationDate;
import com.service.mi.visa.entity.SsdData;
import com.service.mi.visa.entity.resp.ConfirmProvisioningResp;
import com.service.mi.visa.entity.resp.EnrollDeviceResp;
import com.service.mi.visa.entity.resp.EnrollPanResp;
import com.service.mi.visa.entity.resp.ProvisionTokenResp;
import com.service.mi.visa.entity.resp.SubmitStepUpMethodResp;
import com.service.mi.visa.entity.transactionresp.EncTransactionInfo;
import com.service.mi.visa.entity.transactionresp.VisaTransactionRecords;
import com.service.mi.visa.entity.transactionresp.VisaTransactionRecordsNoDecode;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.resp.AuthenticationMethodsResp;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import com.service.mi.wallet.entity.resp.CardResp;
import com.service.mi.wallet.entity.resp.DigitizeResp;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import defpackage.bg4;
import defpackage.czd;
import defpackage.dzd;
import defpackage.fpe;
import defpackage.j5h;
import defpackage.j7i;
import defpackage.o4h;
import defpackage.qvf;
import defpackage.t3q;
import defpackage.v4h;
import defpackage.xac;
import defpackage.zgc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public class VisaBizManager implements VisaApi {
    private static VisaBizManager instance;
    private EnrollDeviceResp deviceResp;
    private List<SpError> spErrors;
    private SsdData ssdData;
    private final String TAG = getClass().getSimpleName();
    private String taskId = "";
    private String resultCode = "";
    private String resultDesc = "";
    private Gson mGson = new GsonBuilder().disableHtmlEscaping().create();
    private BaseApduManager apduManager = new BaseApduManager("MiChannel", qvf.f31885k);

    private VisaBizManager() {
        qvf.a();
    }

    private void clearCache() {
        this.resultDesc = "";
        this.resultCode = "";
        this.spErrors = null;
    }

    private EnrollDeviceResp enrollDevice() {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.ENROLL_DEVICE).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("clientPublicKey", dzd.d()).create());
            if (!TextUtils.isEmpty(strH)) {
                return (EnrollDeviceResp) this.mGson.fromJson(strH, EnrollDeviceResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new EnrollDeviceResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "enrollDevice Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new EnrollDeviceResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    private EnrollPanResp enrollPan(String str, String str2) {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.ENROLL_PAN).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("encPaymentInstrument", str).addParams("messageId", str2).create());
            if (!TextUtils.isEmpty(strH)) {
                return (EnrollPanResp) this.mGson.fromJson(strH, EnrollPanResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new EnrollPanResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "enrollPan Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new EnrollPanResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public static VisaBizManager getInstance() {
        if (instance == null) {
            synchronized (VisaBizManager.class) {
                try {
                    if (instance == null) {
                        instance = new VisaBizManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private void processApduCommand(String str) throws ExecutionException, InterruptedException {
        if (TextUtils.isEmpty(str)) {
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.resultCode = miPayStatus.getStatus();
            this.resultDesc = miPayStatus.getMsg();
            return;
        }
        ProvisionTokenResp provisionTokenResp = (ProvisionTokenResp) this.mGson.fromJson(str, ProvisionTokenResp.class);
        if (provisionTokenResp == null) {
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.resultCode = miPayStatus2.getStatus();
            this.resultDesc = miPayStatus2.getMsg();
            return;
        }
        if (!provisionTokenResp.isStatusOk() || provisionTokenResp.getApduCommands() == null) {
            this.resultCode = provisionTokenResp.getResultCode();
            this.resultDesc = provisionTokenResp.getMsg();
            this.spErrors = provisionTokenResp.getSpErrors();
            return;
        }
        ApduResp apduRespExecuteApdus = this.apduManager.executeApdus(provisionTokenResp.getApduCommands());
        if (apduRespExecuteApdus.isExecuteError()) {
            MiPayStatus miPayStatus3 = MiPayStatus.STATUS_APDU_ERROR;
            this.resultCode = miPayStatus3.getStatus();
            this.resultDesc = miPayStatus3.getMsg();
            return;
        }
        checkHostUrl();
        ConfirmProvisioningResp confirmProvisioningResp = (ConfirmProvisioningResp) this.mGson.fromJson(zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.CONFIRM_PROVISIONING).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("taskId", this.taskId).addParams("apduResult", Boolean.valueOf(apduRespExecuteApdus.isExecuteSuccess())).addParams("apduResponses", apduRespExecuteApdus.getRapduList()).create()), ConfirmProvisioningResp.class);
        this.resultCode = confirmProvisioningResp.getResultCode();
        this.resultDesc = confirmProvisioningResp.getMsg();
        this.spErrors = confirmProvisioningResp.getSpErrors();
    }

    private void startProcessApduCommand(String str) throws ExecutionException, InterruptedException {
        try {
            try {
                this.apduManager.open();
                processApduCommand(str);
                this.apduManager.close();
            } catch (IOException e) {
                throw new ExecutionException(e);
            }
        } catch (Throwable th) {
            this.apduManager.close();
            throw th;
        }
    }

    @SuppressLint({"CheckResult"})
    public void checkHostUrl() {
        if (TextUtils.isEmpty(qvf.d)) {
            o4h.f(new j5h<String>() { // from class: com.service.mi.visa.VisaBizManager.3
                @Override // defpackage.j5h
                public void subscribe(v4h<String> v4hVar) throws Exception {
                    String strB = zgc.c().b(qvf.c);
                    if (TextUtils.isEmpty(strB)) {
                        v4hVar.onError(new Throwable("host url cannot be null"));
                    } else {
                        v4hVar.onNext(strB);
                    }
                    v4hVar.onComplete();
                }
            }).O(new bg4<String>() { // from class: com.service.mi.visa.VisaBizManager.1
                @Override // defpackage.bg4
                public void accept(String str) throws Exception {
                    xac.c(str);
                }
            }, new bg4<Throwable>() { // from class: com.service.mi.visa.VisaBizManager.2
                @Override // defpackage.bg4
                public void accept(Throwable th) throws Exception {
                    fpe.f(th.getMessage());
                }
            });
        }
    }

    public void cleaeCplc() {
        BaseApduManager baseApduManager = this.apduManager;
        if (baseApduManager != null) {
            baseApduManager.clearCplc();
        }
        instance = null;
    }

    @Override // com.service.mi.visa.VisaApi
    public DigitizeResp digitizeCard(Map<String, String> map) {
        if (TextUtils.isEmpty(this.taskId)) {
            MiPayStatus miPayStatus = MiPayStatus.STATUS_TASK_ID_IS_NULL;
            return new DigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        }
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.PROVISION_TOKEN).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("taskId", this.taskId).addParams("ssdData", this.ssdData).addParams("encRiskData", map.get("security_code")).addParams("messageId", null).create());
            ProvisionTokenResp provisionTokenResp = (ProvisionTokenResp) this.mGson.fromJson(strH, ProvisionTokenResp.class);
            if (!provisionTokenResp.isStatusOk()) {
                return new DigitizeResp(provisionTokenResp.getResultCode(), provisionTokenResp.getMsg(), provisionTokenResp.getSpErrors());
            }
            startProcessApduCommand(strH);
            DigitizeResp digitizeResp = new DigitizeResp(provisionTokenResp.getResultCode(), provisionTokenResp.getMsg(), provisionTokenResp.getSpErrors());
            digitizeResp.setNeedAdditionalAuth(provisionTokenResp.isNeedAdditionalAuth());
            digitizeResp.setAuthenticationMethods(provisionTokenResp.getAuthenticationMethods());
            digitizeResp.setTokenUniqueReference(provisionTokenResp.getTokenUniqueReference());
            if (!this.resultCode.isEmpty()) {
                digitizeResp.setResultCode(this.resultCode);
                digitizeResp.setMsg(this.resultDesc);
                digitizeResp.setSpErrors(this.spErrors);
            }
            return digitizeResp;
        } catch (Exception e) {
            fpe.g(this.TAG, "provisionToken Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new DigitizeResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        } finally {
            clearCache();
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public AuthenticationMethodsResp getAuthenticationMethods(String str) {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.GET_STEP_UP_OPTIONS).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).create());
            if (!TextUtils.isEmpty(strH)) {
                return (AuthenticationMethodsResp) this.mGson.fromJson(strH, AuthenticationMethodsResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new AuthenticationMethodsResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "getStepUpOptions Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new AuthenticationMethodsResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public CardResp getCardInfo(String str) {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.CARD_DETAIL).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).create());
            if (!TextUtils.isEmpty(strH)) {
                return (CardResp) this.mGson.fromJson(strH, CardResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new CardResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "UpdateCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new CardResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public VisaTransactionRecords getTransactionHistory(String str, int i, int i2) {
        checkHostUrl();
        try {
            if (TextUtils.isEmpty(j7i.a(a.a().getApplicationContext(), qvf.i))) {
                enrollDevice();
            }
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.GET_TRANSACTION_HISTORY).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).addParams("count", Integer.valueOf(i)).addParams("lastUpdateTimestamp", Integer.valueOf(i2)).create());
            if (TextUtils.isEmpty(strH)) {
                MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
                return new VisaTransactionRecords(miPayStatus.getStatus(), miPayStatus.getMsg(), null);
            }
            List<String> encTransactionInfoList = ((VisaTransactionRecordsNoDecode) this.mGson.fromJson(strH, VisaTransactionRecordsNoDecode.class)).getEncTransactionInfoList();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = encTransactionInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add((EncTransactionInfo) this.mGson.fromJson(czd.b(it.next()), EncTransactionInfo.class));
            }
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_OK;
            return new VisaTransactionRecords(miPayStatus2.getStatus(), miPayStatus2.getMsg(), arrayList);
        } catch (Exception e) {
            fpe.g(this.TAG, "getTransactionHistory Exception:" + e.getMessage());
            MiPayStatus miPayStatus3 = MiPayStatus.STATUS_BIZ_ERROR;
            return new VisaTransactionRecords(miPayStatus3.getStatus(), miPayStatus3.getMsg(), null);
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public PreDigitizeResp prepareDigitize(Map<String, String> map) {
        try {
            String str = map.get("account_number");
            String str2 = map.get("cvv2");
            String str3 = map.get("expiry_year");
            String str4 = map.get("expiry_month");
            String str5 = map.get("account_holder_name");
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
                MiPayStatus miPayStatus = MiPayStatus.STATUS_PARAMS_IS_NULL;
                return new PreDigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg() + ":参数不可为空");
            }
            EncryptedPaymentInstrument encryptedPaymentInstrument = new EncryptedPaymentInstrument();
            encryptedPaymentInstrument.setAccountNumber(str);
            encryptedPaymentInstrument.setCvv2(str2);
            encryptedPaymentInstrument.setName(str5);
            ExpirationDate expirationDate = new ExpirationDate();
            if (str4 != null) {
                expirationDate.setMonth(Integer.parseInt(str4));
            }
            if (str3 != null) {
                expirationDate.setYear(Integer.parseInt(str3));
            }
            encryptedPaymentInstrument.setExpirationDate(expirationDate);
            String strB = j7i.b(a.a().getApplicationContext(), qvf.j, null);
            if (TextUtils.isEmpty(strB)) {
                EnrollDeviceResp enrollDeviceRespEnrollDevice = enrollDevice();
                this.deviceResp = enrollDeviceRespEnrollDevice;
                if (!enrollDeviceRespEnrollDevice.isStatusOk()) {
                    return new PreDigitizeResp(this.deviceResp.getResultCode(), this.deviceResp.getMsg(), this.deviceResp.getSpErrors());
                }
                j7i.c(a.a().getApplicationContext(), qvf.j, this.deviceResp.getVisaPK());
                strB = this.deviceResp.getVisaPK();
            }
            String json = new Gson().toJson(encryptedPaymentInstrument);
            fpe.e(this.TAG, "User info:" + json);
            fpe.e(this.TAG, "visaRuturnPubulicKey:" + strB);
            EnrollPanResp enrollPanRespEnrollPan = enrollPan(dzd.a(strB, json, this.apduManager.getCplc()), null);
            if (!enrollPanRespEnrollPan.isStatusOk()) {
                return new PreDigitizeResp(enrollPanRespEnrollPan.getResultCode(), enrollPanRespEnrollPan.getMsg(), enrollPanRespEnrollPan.getSpErrors());
            }
            this.taskId = enrollPanRespEnrollPan.getTaskId();
            ApduNotifyResp apduNotifyRespK = t3q.i().k(enrollPanRespEnrollPan.getAppletInstanceAid(), enrollPanRespEnrollPan.getSdAid(), this.taskId, enrollPanRespEnrollPan.getvEphemeralVisaPublicKeyID(), enrollPanRespEnrollPan.getvEphemeralVisaPublicCertValue());
            if (!apduNotifyRespK.isStatusOK()) {
                return new PreDigitizeResp(apduNotifyRespK.getResultCode(), apduNotifyRespK.getMsg(), apduNotifyRespK.getSpErrors());
            }
            this.ssdData = apduNotifyRespK.getExtra().getSsdData();
            PreDigitizeResp preDigitizeResp = new PreDigitizeResp(enrollPanRespEnrollPan.getResultCode(), enrollPanRespEnrollPan.getMsg());
            preDigitizeResp.setSecurityCodeApplicable(enrollPanRespEnrollPan.isSecurityCodeApplicable());
            preDigitizeResp.setTermsAndConditionsContent(enrollPanRespEnrollPan.getTermsAndConditionsContent());
            return preDigitizeResp;
        } catch (Exception e) {
            fpe.g(this.TAG, "PrepareDigitize Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new PreDigitizeResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        } finally {
            clearCache();
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public BaseWalletResponse tokenManagement(String str, int i, String str2, boolean z) {
        checkHostUrl();
        try {
            if (i == 1 && z) {
                ApduNotifyResp apduNotifyRespH = t3q.i().h(str2, null);
                BaseWalletResponse baseWalletResponse = new BaseWalletResponse(apduNotifyRespH.getResultCode(), apduNotifyRespH.getMsg());
                clearCache();
                return baseWalletResponse;
            }
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.TOKEN_MANAGEMENT).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).addParams("operType", Integer.valueOf(i)).create());
            if (TextUtils.isEmpty(strH)) {
                MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
                BaseWalletResponse baseWalletResponse2 = new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
                clearCache();
                return baseWalletResponse2;
            }
            if (i != 1) {
                BaseWalletResponse baseWalletResponse3 = (BaseWalletResponse) this.mGson.fromJson(strH, BaseWalletResponse.class);
                clearCache();
                return baseWalletResponse3;
            }
            BaseWalletResponse baseWalletResponse4 = (BaseWalletResponse) this.mGson.fromJson(strH, BaseWalletResponse.class);
            if (!baseWalletResponse4.isStatusOk()) {
                clearCache();
                return baseWalletResponse4;
            }
            ApduNotifyResp apduNotifyRespH2 = t3q.i().h(str2, null);
            BaseWalletResponse baseWalletResponse5 = new BaseWalletResponse(apduNotifyRespH2.getResultCode(), apduNotifyRespH2.getMsg(), apduNotifyRespH2.getSpErrors());
            clearCache();
            return baseWalletResponse5;
        } catch (Exception e) {
            fpe.g(this.TAG, "tokenManagement Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        } finally {
            clearCache();
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public BaseWalletResponse visaActivate(String str, String str2, String str3) {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.VISA_ACTIVATE).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).addParams("authenticationCode", str2).addParams("methodType", str3).create());
            if (!TextUtils.isEmpty(strH)) {
                return (BaseWalletResponse) this.mGson.fromJson(strH, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "visaActivate Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    @Override // com.service.mi.visa.VisaApi
    public SubmitStepUpMethodResp requestActivationCode(String str, AuthenticationMethod authenticationMethod) {
        checkHostUrl();
        try {
            String strH = zgc.c().h(new VisaRequest.WalletBuilder().host(qvf.d).path(VisaApi.SUBMIT_STEP_UP_METHOD).initBaseInfo(this.apduManager.getCplc(), this.apduManager.getMiSeid()).addParams("tokenUniqueReference", str).addParams("authenticationMethodId", authenticationMethod.getId()).create());
            if (!TextUtils.isEmpty(strH)) {
                return (SubmitStepUpMethodResp) this.mGson.fromJson(strH, SubmitStepUpMethodResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new SubmitStepUpMethodResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.TAG, "submitStepUpMethod Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new SubmitStepUpMethodResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }
}
