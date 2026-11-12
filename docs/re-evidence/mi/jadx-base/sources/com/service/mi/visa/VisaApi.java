package com.service.mi.visa;

import com.service.mi.visa.entity.transactionresp.VisaTransactionRecords;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.resp.AuthenticationMethodsResp;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import com.service.mi.wallet.entity.resp.CardResp;
import com.service.mi.wallet.entity.resp.DigitizeResp;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface VisaApi {
    public static final String CARD_DETAIL = "/cardDetail";
    public static final String CONFIRM_PROVISIONING = "/confirmProvisioning";
    public static final String ENROLL_DEVICE = "/enrollDevice";
    public static final String ENROLL_PAN = "/enrollPan";
    public static final String GET_STEP_UP_OPTIONS = "/getStepUpOptions";
    public static final String GET_TRANSACTION_HISTORY = "/getTransactionHistory";
    public static final String PROVISION_TOKEN = "/provisionToken";
    public static final String SUBMIT_STEP_UP_METHOD = "/submitStepUpMethod";
    public static final String TOKEN_MANAGEMENT = "/tokenManagement";
    public static final String VISA_ACTIVATE = "/visaActivate";

    DigitizeResp digitizeCard(Map<String, String> map);

    AuthenticationMethodsResp getAuthenticationMethods(String str);

    CardResp getCardInfo(String str);

    VisaTransactionRecords getTransactionHistory(String str, int i, int i2);

    PreDigitizeResp prepareDigitize(Map<String, String> map);

    BaseWalletResponse requestActivationCode(String str, AuthenticationMethod authenticationMethod);

    BaseWalletResponse tokenManagement(String str, int i, String str2, boolean z);

    BaseWalletResponse visaActivate(String str, String str2, String str3);
}
