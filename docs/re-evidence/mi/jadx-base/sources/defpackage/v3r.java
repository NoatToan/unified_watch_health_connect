package defpackage;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miui.tsmclient.net.TSMAuthContants;
import com.service.mi.common.MiPayStatus;
import com.service.mi.common.apdu.ApduResp;
import com.service.mi.common.apdu.BaseApduManager;
import com.service.mi.common.apdu.Rapdu;
import com.service.mi.common.entity.SpsdInfo;
import com.service.mi.sei.entity.ApduNotifyResp;
import com.service.mi.visa.VisaApi;
import com.service.mi.wallet.entity.AccountHolderData;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.CardAccountData;
import com.service.mi.wallet.entity.EncryptedPayload;
import com.service.mi.wallet.entity.FundingAccountData;
import com.service.mi.wallet.entity.FundingAccountInfo;
import com.service.mi.wallet.entity.resp.ApduCommandBaseResp;
import com.service.mi.wallet.entity.resp.AuthenticationMethodsResp;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import com.service.mi.wallet.entity.resp.CardListResp;
import com.service.mi.wallet.entity.resp.CardResp;
import com.service.mi.wallet.entity.resp.DigitizeResp;
import com.service.mi.wallet.entity.resp.GetAidResp;
import com.service.mi.wallet.entity.resp.GetRegistrationCode2Resp;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import com.service.mi.wallet.entity.tds.GetRegistrationCodeResp;
import com.service.mi.wallet.entity.tds.GetTransactionsResp;
import com.service.mi.wallet.entity.tds.RegisterResp;
import com.service.mi.wallet.entity.tds.TransactionParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public class v3r {
    public static v3r i;
    public String f;
    public SpsdInfo h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36451a = getClass().getSimpleName();
    public String c = "";
    public String d = "";
    public String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Gson f36452b = new GsonBuilder().disableHtmlEscaping().create();
    public BaseApduManager g = new BaseApduManager("MiChannel", qvf.f31885k);

    public class a implements bg4<String> {
        public a() {
        }

        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(String str) throws Exception {
            xac.c(str);
        }
    }

    public class b implements bg4<Throwable> {
        public b() {
        }

        @Override // defpackage.bg4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            fpe.f(th.getMessage());
        }
    }

    public class c implements j5h<String> {
        public c() {
        }

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
    }

    public v3r() {
        qvf.a();
    }

    public static v3r m() {
        if (i == null) {
            synchronized (v3r.class) {
                try {
                    if (i == null) {
                        i = new v3r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public BaseWalletResponse A(String str, String str2) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/unsuspend").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).a(TSMAuthContants.PARAM_RETURN_CARD_REASON, str2).b());
            if (!TextUtils.isEmpty(strI)) {
                return (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "UnSuspendCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public final PreDigitizeResp a(String str, String str2, String str3, String str4, SpsdInfo spsdInfo, String str5) throws Exception {
        FundingAccountInfo fundingAccountInfo;
        b();
        CardAccountData cardAccountData = new CardAccountData();
        cardAccountData.setAccountNumber(str);
        cardAccountData.setExpiryYear(str2);
        cardAccountData.setExpiryMonth(str3);
        AccountHolderData accountHolderData = new AccountHolderData();
        accountHolderData.setAccountHolderName(str4);
        if (TextUtils.isEmpty(str5)) {
            fundingAccountInfo = h(cardAccountData, accountHolderData);
        } else {
            fundingAccountInfo = new FundingAccountInfo();
            fundingAccountInfo.setPushAccountReceipt(str5);
        }
        String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/checkEligibility").d(this.g.getCplc(), this.g.getMiSeid()).a("taskId", this.e).a("fundingAccountInfo", fundingAccountInfo).a("spsdInfo", spsdInfo).a("pushTargetId", qvf.s).b());
        if (!TextUtils.isEmpty(strI)) {
            return (PreDigitizeResp) this.f36452b.fromJson(strI, PreDigitizeResp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new PreDigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    @SuppressLint({"CheckResult"})
    public void b() {
        if (TextUtils.isEmpty(qvf.e)) {
            o4h.f(new c()).O(new a(), new b());
        }
    }

    public BaseWalletResponse c() {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/checkUserBand").d(this.g.getCplc(), this.g.getMiSeid()).b());
            if (!TextUtils.isEmpty(strI)) {
                return (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "CheckUserBin Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public void d() {
        BaseApduManager baseApduManager = this.g;
        if (baseApduManager != null) {
            baseApduManager.clearCplc();
        }
        i = null;
    }

    public final void e() {
        this.d = "";
        this.c = "";
    }

    public BaseWalletResponse f(String str, String str2, String str3, boolean z) {
        b();
        try {
            j7i.d(com.service.mi.common.util.a.a().getApplicationContext(), str);
            if (z) {
                ApduNotifyResp apduNotifyRespH = t3q.i().h(str3, null);
                return new BaseWalletResponse(apduNotifyRespH.getResultCode(), apduNotifyRespH.getMsg());
            }
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/delete").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).a(TSMAuthContants.PARAM_RETURN_CARD_REASON, str2).b());
            if (TextUtils.isEmpty(strI)) {
                MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
                return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
            }
            BaseWalletResponse baseWalletResponse = (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            if (!baseWalletResponse.isStatusOk()) {
                return baseWalletResponse;
            }
            ApduNotifyResp apduNotifyRespH2 = t3q.i().h(str3, null);
            return new BaseWalletResponse(apduNotifyRespH2.getResultCode(), apduNotifyRespH2.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "DeleteCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        } finally {
            e();
        }
    }

    public DigitizeResp g(Map<String, String> map) {
        DigitizeResp digitizeRespX;
        b();
        try {
            if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f)) {
                String str = map.get("security_code");
                String str2 = map.get("redigitize_token");
                String str3 = map.get("push_account_receipt");
                if (TextUtils.isEmpty(str2)) {
                    digitizeRespX = v(str, str3);
                    if (!digitizeRespX.isStatusOk()) {
                        return digitizeRespX;
                    }
                } else {
                    digitizeRespX = x(str2);
                    if (!digitizeRespX.isStatusOk()) {
                        return digitizeRespX;
                    }
                }
                y(zgc.c().i(new w3r.b().c(qvf.e).e("/provision").d(this.g.getCplc(), this.g.getMiSeid()).a("taskId", this.e).b()));
                digitizeRespX.setResultCode(this.c);
                digitizeRespX.setMsg(this.d);
                return digitizeRespX;
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_TASK_ID_IS_NULL;
            return new DigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "DigitizeCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new DigitizeResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        } finally {
            this.e = null;
            this.f = null;
            e();
        }
    }

    public final FundingAccountInfo h(CardAccountData cardAccountData, AccountHolderData accountHolderData) throws Exception {
        FundingAccountData fundingAccountData = new FundingAccountData();
        fundingAccountData.setCardAccountData(cardAccountData);
        fundingAccountData.setAccountHolderData(accountHolderData);
        fundingAccountData.setSource("ACCOUNT_ADDED_MANUALLY");
        String json = this.f36452b.toJson(fundingAccountData);
        fpe.e(this.f36451a, "FundingAccountData AES加密前:" + json);
        String strB = s0.b();
        fpe.e(this.f36451a, "AES KEY:" + strB);
        EncryptedPayload encryptedPayload = new EncryptedPayload();
        String strA = s0.a(strB, json);
        fpe.e(this.f36451a, "FundingAccountData AES加密后:" + strA);
        encryptedPayload.setEncryptedData(strA);
        String strB2 = t9j.b(strB, this.f);
        fpe.e(this.f36451a, "AES KEY RSA加密后:" + strB2);
        encryptedPayload.setEncryptedKey(strB2);
        encryptedPayload.setOaepHashingAlgorithm("SHA256");
        return new FundingAccountInfo(encryptedPayload);
    }

    public final GetAidResp i(String str) throws ExecutionException, InterruptedException {
        b();
        String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/aid").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).b());
        if (!TextUtils.isEmpty(strI)) {
            return (GetAidResp) this.f36452b.fromJson(strI, GetAidResp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new GetAidResp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    public AuthenticationMethodsResp j(String str) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/authenticationMethodsList").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).b());
            if (!TextUtils.isEmpty(strI)) {
                return (AuthenticationMethodsResp) this.f36452b.fromJson(strI, AuthenticationMethodsResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new AuthenticationMethodsResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "GetAuthenticationMethods Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new AuthenticationMethodsResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public CardResp k(String str) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e(VisaApi.CARD_DETAIL).d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).b());
            if (!TextUtils.isEmpty(strI)) {
                return (CardResp) this.f36452b.fromJson(strI, CardResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new CardResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "UpdateCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new CardResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public CardListResp l() {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/v2/cardlist").d(this.g.getCplc(), this.g.getMiSeid()).b());
            if (!TextUtils.isEmpty(strI)) {
                return (CardListResp) this.f36452b.fromJson(strI, CardListResp.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new CardListResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "GetCardList Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new CardListResp(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public final GetRegistrationCodeResp n(String str, String str2) throws ExecutionException, InterruptedException {
        String strG = zgc.c().g(new r1p.b().c(str).d("/getRegistrationCode").a("tokenUniqueReference", str2).b());
        if (!TextUtils.isEmpty(strG)) {
            return (GetRegistrationCodeResp) this.f36452b.fromJson(strG, GetRegistrationCodeResp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new GetRegistrationCodeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    public final GetRegistrationCode2Resp o(String str) throws ExecutionException, InterruptedException {
        b();
        String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/getRegistationCode2").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).b());
        if (!TextUtils.isEmpty(strI)) {
            return (GetRegistrationCode2Resp) this.f36452b.fromJson(strI, GetRegistrationCode2Resp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new GetRegistrationCode2Resp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    public GetTransactionsResp p(String str, String str2, String str3) {
        TransactionParams transactionParams;
        try {
            String strB = j7i.b(com.service.mi.common.util.a.a().getApplicationContext(), str, null);
            fpe.e(this.f36451a, "Transaction Json:" + strB);
            if (TextUtils.isEmpty(strB)) {
                TransactionParams transactionParams2 = new TransactionParams();
                RegisterResp registerRespS = s(str2, str);
                if (!TextUtils.isEmpty(registerRespS.getResultCode())) {
                    return new GetTransactionsResp(registerRespS.getResultCode(), registerRespS.getMsg());
                }
                transactionParams2.setAuthenticationCode(registerRespS.getAuthenticationCode());
                str3 = registerRespS.getTdsUrl();
                transactionParams = transactionParams2;
            } else {
                transactionParams = (TransactionParams) this.f36452b.fromJson(strB, TransactionParams.class);
            }
            String strG = zgc.c().g(new r1p.b().c(str3).d("/getTransactions").a("tokenUniqueReference", str).a("authenticationCode", transactionParams.getAuthenticationCode()).b());
            if (TextUtils.isEmpty(strG)) {
                MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
                return new GetTransactionsResp(miPayStatus.getStatus(), miPayStatus.getMsg());
            }
            GetTransactionsResp getTransactionsResp = (GetTransactionsResp) this.f36452b.fromJson(strG, GetTransactionsResp.class);
            String resultCode = getTransactionsResp.getResultCode();
            if (!TextUtils.isEmpty(resultCode)) {
                if ("INVALID_AUTHENTICATION_CODE".equalsIgnoreCase(resultCode)) {
                    j7i.d(com.service.mi.common.util.a.a().getApplicationContext(), str);
                }
                return getTransactionsResp;
            }
            String authenticationCode = getTransactionsResp.getAuthenticationCode();
            if (!TextUtils.isEmpty(authenticationCode)) {
                transactionParams.setAuthenticationCode(authenticationCode);
            }
            String lastUpdatedTag = getTransactionsResp.getLastUpdatedTag();
            if (!TextUtils.isEmpty(lastUpdatedTag)) {
                transactionParams.setLastUpdatedTag(lastUpdatedTag);
            }
            j7i.c(com.service.mi.common.util.a.a().getApplicationContext(), str, this.f36452b.toJson(transactionParams));
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_OK;
            getTransactionsResp.setResultCode(miPayStatus2.getStatus());
            getTransactionsResp.setMsg(miPayStatus2.getMsg());
            return getTransactionsResp;
        } catch (Exception e) {
            fpe.g(this.f36451a, "GetTransactions Exception:" + e.getMessage());
            MiPayStatus miPayStatus3 = MiPayStatus.STATUS_BIZ_ERROR;
            return new GetTransactionsResp(miPayStatus3.getStatus(), miPayStatus3.getMsg());
        }
    }

    public PreDigitizeResp q(Map<String, String> map) {
        try {
            try {
                String str = map.get("account_number");
                String str2 = map.get("expiry_year");
                String str3 = map.get("expiry_month");
                String str4 = map.get("account_holder_name");
                String str5 = map.get("redigitize_token");
                String str6 = map.get("push_account_receipt");
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6)) {
                    MiPayStatus miPayStatus = MiPayStatus.STATUS_PARAMS_IS_NULL;
                    return new PreDigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg() + ":参数不可为空");
                }
                if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6)) {
                    if (TextUtils.isEmpty(str)) {
                        MiPayStatus miPayStatus2 = MiPayStatus.STATUS_PARAMS_IS_NULL;
                        return new PreDigitizeResp(miPayStatus2.getStatus(), miPayStatus2.getMsg() + ":卡号不可为空");
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        GetAidResp getAidRespI = i(null);
                        if (!getAidRespI.isStatusOk()) {
                            return new PreDigitizeResp(getAidRespI.getResultCode(), getAidRespI.getMsg());
                        }
                        this.f = getAidRespI.getMcPK();
                        this.e = getAidRespI.getTaskId();
                        ApduNotifyResp apduNotifyRespJ = t3q.i().j(getAidRespI.getAppletInstanceAid(), getAidRespI.getSdAid(), this.e);
                        return !apduNotifyRespJ.isStatusOK() ? new PreDigitizeResp(apduNotifyRespJ.getResultCode(), apduNotifyRespJ.getMsg()) : a(str, str2, str3, str4, apduNotifyRespJ.getExtra().getSpsdInfo(), null);
                    }
                    MiPayStatus miPayStatus3 = MiPayStatus.STATUS_PARAMS_IS_NULL;
                    return new PreDigitizeResp(miPayStatus3.getStatus(), miPayStatus3.getMsg() + ":卡片有效期不可为空");
                }
                if (!TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6)) {
                    GetAidResp getAidRespI2 = i(str5);
                    if (!getAidRespI2.isStatusOk()) {
                        return new PreDigitizeResp(getAidRespI2.getResultCode(), getAidRespI2.getMsg());
                    }
                    this.f = getAidRespI2.getMcPK();
                    this.e = getAidRespI2.getTaskId();
                    ApduNotifyResp apduNotifyRespJ2 = t3q.i().j(getAidRespI2.getAppletInstanceAid(), getAidRespI2.getSdAid(), this.e);
                    if (!apduNotifyRespJ2.isStatusOK()) {
                        return new PreDigitizeResp(apduNotifyRespJ2.getResultCode(), apduNotifyRespJ2.getMsg());
                    }
                    this.h = apduNotifyRespJ2.getExtra().getSpsdInfo();
                    MiPayStatus miPayStatus4 = MiPayStatus.STATUS_OK;
                    return new PreDigitizeResp(miPayStatus4.getStatus(), miPayStatus4.getMsg());
                }
                if (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                    GetAidResp getAidRespI3 = i(null);
                    if (!getAidRespI3.isStatusOk()) {
                        return new PreDigitizeResp(getAidRespI3.getResultCode(), getAidRespI3.getMsg());
                    }
                    this.f = getAidRespI3.getMcPK();
                    this.e = getAidRespI3.getTaskId();
                    ApduNotifyResp apduNotifyRespJ3 = t3q.i().j(getAidRespI3.getAppletInstanceAid(), getAidRespI3.getSdAid(), this.e);
                    if (!apduNotifyRespJ3.isStatusOK()) {
                        return new PreDigitizeResp(apduNotifyRespJ3.getResultCode(), apduNotifyRespJ3.getMsg());
                    }
                    SpsdInfo spsdInfo = apduNotifyRespJ3.getExtra().getSpsdInfo();
                    this.h = spsdInfo;
                    return a(null, null, null, null, spsdInfo, str6);
                }
                MiPayStatus miPayStatus5 = MiPayStatus.STATUS_BIZ_ERROR;
                return new PreDigitizeResp(miPayStatus5.getStatus(), miPayStatus5.getMsg());
            } catch (Exception e) {
                fpe.g(this.f36451a, "PrepareDigitize Exception:" + e.getMessage());
            }
        } finally {
            e();
        }
    }

    public final void r(String str) throws ExecutionException, InterruptedException {
        if (TextUtils.isEmpty(str)) {
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.c = miPayStatus.getStatus();
            this.d = miPayStatus.getMsg();
            return;
        }
        ApduCommandBaseResp apduCommandBaseResp = (ApduCommandBaseResp) this.f36452b.fromJson(str, ApduCommandBaseResp.class);
        if (apduCommandBaseResp == null) {
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_REQUEST_FAILURE;
            this.c = miPayStatus2.getStatus();
            this.d = miPayStatus2.getMsg();
        } else {
            if (!apduCommandBaseResp.isStatusOk() || apduCommandBaseResp.isApduCommandsNull()) {
                this.c = apduCommandBaseResp.getResultCode();
                this.d = apduCommandBaseResp.getMsg();
                return;
            }
            ApduResp apduRespExecuteApdus = this.g.executeApdus(apduCommandBaseResp.getApduCommands());
            if (apduRespExecuteApdus.isExecuteError()) {
                return;
            }
            w(apduRespExecuteApdus.getRapduList(), apduRespExecuteApdus.isExecuteSuccess());
        }
    }

    public final RegisterResp s(String str, String str2) throws ExecutionException, InterruptedException {
        GetRegistrationCodeResp getRegistrationCodeRespN = n(str, str2);
        if (!TextUtils.isEmpty(getRegistrationCodeRespN.getResultCode())) {
            return new RegisterResp(getRegistrationCodeRespN.getResultCode(), getRegistrationCodeRespN.getMsg());
        }
        String registrationCode1 = getRegistrationCodeRespN.getRegistrationCode1();
        GetRegistrationCode2Resp getRegistrationCode2RespO = o(str2);
        if (!getRegistrationCode2RespO.getResultCode().equalsIgnoreCase(MiPayStatus.STATUS_OK.getStatus())) {
            return new RegisterResp(getRegistrationCode2RespO.getResultCode(), getRegistrationCode2RespO.getMsg());
        }
        String registrationCode2 = getRegistrationCode2RespO.getRegistrationCode2();
        String strG = zgc.c().g(new r1p.b().c(str).d("/register").a("tokenUniqueReference", str2).a("registrationHash", mlb.a(registrationCode1 + registrationCode2)).b());
        if (TextUtils.isEmpty(strG)) {
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new RegisterResp(miPayStatus.getStatus(), miPayStatus.getMsg());
        }
        RegisterResp registerResp = (RegisterResp) this.f36452b.fromJson(strG, RegisterResp.class);
        registerResp.setTdsUrl(getRegistrationCode2RespO.getTdsUrl());
        return registerResp;
    }

    public BaseWalletResponse t(String str, String str2) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/activate").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).a("authenticationCode", str2).b());
            if (!TextUtils.isEmpty(strI)) {
                return (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "RequestActivateCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public BaseWalletResponse u(String str, AuthenticationMethod authenticationMethod) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/requestActivationCode").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).a("authenticationMethodId", authenticationMethod.getId()).b());
            if (!TextUtils.isEmpty(strI)) {
                return (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "RequestActivationCode Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }

    public final DigitizeResp v(String str, String str2) throws Exception {
        b();
        CardAccountData cardAccountData = new CardAccountData();
        cardAccountData.setSecurityCode(str);
        FundingAccountInfo fundingAccountInfoH = h(cardAccountData, null);
        if (!TextUtils.isEmpty(str2)) {
            fundingAccountInfoH.setPushAccountReceipt(str2);
        }
        String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/digitize").d(this.g.getCplc(), this.g.getMiSeid()).a("taskId", this.e).a("fundingAccountInfo", fundingAccountInfoH).b());
        if (!TextUtils.isEmpty(strI)) {
            return (DigitizeResp) this.f36452b.fromJson(strI, DigitizeResp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new DigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    public final void w(List<Rapdu> list, boolean z) throws ExecutionException, InterruptedException {
        b();
        if (list == null) {
            list = new ArrayList<>();
        }
        r(zgc.c().i(new w3r.b().c(qvf.e).e("/apdu/notify").d(this.g.getCplc(), this.g.getMiSeid()).a("taskId", this.e).a("apduReslult", Boolean.valueOf(z)).a("apduResponses", list).b()));
    }

    public final DigitizeResp x(String str) throws Exception {
        b();
        String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/redigitize").d(this.g.getCplc(), this.g.getMiSeid()).a("taskId", this.e).a("spsdInfo", this.h).a("tokenUniqueReference", str).b());
        if (!TextUtils.isEmpty(strI)) {
            return (DigitizeResp) this.f36452b.fromJson(strI, DigitizeResp.class);
        }
        MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
        return new DigitizeResp(miPayStatus.getStatus(), miPayStatus.getMsg());
    }

    public final void y(String str) throws ExecutionException, InterruptedException {
        try {
            try {
                this.g.open();
                r(str);
                this.g.close();
            } catch (IOException e) {
                throw new ExecutionException(e);
            }
        } catch (Throwable th) {
            this.g.close();
            throw th;
        }
    }

    public BaseWalletResponse z(String str, String str2) {
        b();
        try {
            String strI = zgc.c().i(new w3r.b().c(qvf.e).e("/suspend").d(this.g.getCplc(), this.g.getMiSeid()).a("tokenUniqueReference", str).a(TSMAuthContants.PARAM_RETURN_CARD_REASON, str2).b());
            if (!TextUtils.isEmpty(strI)) {
                return (BaseWalletResponse) this.f36452b.fromJson(strI, BaseWalletResponse.class);
            }
            MiPayStatus miPayStatus = MiPayStatus.STATUS_REQUEST_FAILURE;
            return new BaseWalletResponse(miPayStatus.getStatus(), miPayStatus.getMsg());
        } catch (Exception e) {
            fpe.g(this.f36451a, "SuspendCard Exception:" + e.getMessage());
            MiPayStatus miPayStatus2 = MiPayStatus.STATUS_BIZ_ERROR;
            return new BaseWalletResponse(miPayStatus2.getStatus(), miPayStatus2.getMsg());
        }
    }
}
