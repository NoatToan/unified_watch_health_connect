package com.xiaomi.passport.ui.presenter;

import android.content.Context;
import com.xiaomi.accountsdk.account.XMPassport;
import com.xiaomi.accountsdk.account.data.ActivatorPhoneInfo;
import com.xiaomi.accountsdk.account.data.QueryPhoneInfoParams;
import com.xiaomi.accountsdk.account.data.RegisterUserInfo;
import com.xiaomi.accountsdk.account.exception.InvalidPhoneNumException;
import com.xiaomi.accountsdk.account.exception.InvalidVerifyCodeException;
import com.xiaomi.accountsdk.request.AccessDeniedException;
import com.xiaomi.accountsdk.request.AuthenticationFailureException;
import com.xiaomi.accountsdk.request.InvalidResponseException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.ui.data.PhoneAccount;
import com.xiaomi.passport.ui.settings.utils.NetworkCircleImageSaver;
import com.xiaomi.phonenum.data.AccountCertification;
import com.xiaomi.phonenum.procedure.AccountPhoneNumberSourceFlag;
import defpackage.m90;
import defpackage.roc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PhoneAutoLoginFragmentPresenter extends BaseLoginPresenter {
    private static final String TAG = "PhoneAutoPresenter";

    public static List<PhoneAccount> getPhoneAccount(Context context, String str, AccountPhoneNumberSourceFlag accountPhoneNumberSourceFlag) {
        roc rocVarA = m90.a(context);
        AccountLogger.log(TAG, "query sid=" + str + ", flag=" + accountPhoneNumberSourceFlag.f14017a);
        AccountCertification[] accountCertificationArrA = rocVarA.a(context, str, accountPhoneNumberSourceFlag);
        int length = accountCertificationArrA.length;
        PhoneAccount[] phoneAccountArr = new PhoneAccount[length];
        for (int i = 0; i < length; i++) {
            if (accountCertificationArrA[i] != null) {
                AccountLogger.log(TAG, "query account slot " + i + " is valid, accountCert=" + accountCertificationArrA[i]);
                try {
                    RegisterUserInfo registerUserInfoQueryPhoneUserInfo = XMPassport.queryPhoneUserInfo(new QueryPhoneInfoParams.Builder().serviceId(str).subId(String.valueOf(accountCertificationArrA[i].f14010a)).phoneHashActivatorToken(new ActivatorPhoneInfo.Builder().slotId(i).activatorToken(accountCertificationArrA[i].c).phoneHash(accountCertificationArrA[i].f14011b).build()).build());
                    phoneAccountArr[i] = new PhoneAccount(accountCertificationArrA[i], registerUserInfoQueryPhoneUserInfo);
                    if (registerUserInfoQueryPhoneUserInfo != null) {
                        NetworkCircleImageSaver.saveNetworkImageDefault(context, registerUserInfoQueryPhoneUserInfo.avatarAddress);
                    }
                } catch (InvalidPhoneNumException e) {
                    e = e;
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e);
                } catch (InvalidVerifyCodeException e2) {
                    rocVarA.c(context, str, accountCertificationArrA[i]);
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e2);
                } catch (AccessDeniedException e3) {
                    e = e3;
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e);
                } catch (AuthenticationFailureException e4) {
                    e = e4;
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e);
                } catch (InvalidResponseException e5) {
                    e = e5;
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e);
                } catch (IOException e6) {
                    e = e6;
                    AccountLogger.log(TAG, "queryPhoneUserInfo", e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            PhoneAccount phoneAccount = phoneAccountArr[i2];
            if (phoneAccount != null) {
                arrayList.add(phoneAccount);
            }
        }
        return arrayList;
    }
}
