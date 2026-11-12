package com.xiaomi.passport.jsb.method_impl;

import android.content.Context;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.passport.jsb.PassportFrontendMethodInvoker;
import com.xiaomi.passport.jsb.PassportJsbMethod;
import com.xiaomi.passport.jsb.PassportJsbMethodException;
import com.xiaomi.passport.jsb.PassportJsbMethodResult;
import com.xiaomi.passport.sim.SIMInfo;
import com.xiaomi.passport.task.BgTask;
import com.xiaomi.passport.webview.PassportJsbWebView;
import defpackage.m90;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class PassportJsbMethodGetSIMInfo extends PassportJsbMethod {
    private BgTask<JSONObject> mGetSIMInfoTask;

    public static class GetSIMInfoBgRunnable implements BgTask.BgTaskRunnable<JSONObject> {
        private final Context mContext;
        private final String[] mSIMInfoTypes;

        public GetSIMInfoBgRunnable(Context context, String[] strArr) {
            this.mContext = context;
            this.mSIMInfoTypes = strArr;
        }

        @Override // com.xiaomi.passport.task.BgTask.BgTaskRunnable
        public JSONObject run() throws Throwable {
            SIMInfo[] sIMInfoArrB = m90.a(this.mContext).b(this.mContext, "passportapi", this.mSIMInfoTypes);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slotCount", sIMInfoArrB.length);
            for (int i = 0; i < sIMInfoArrB.length; i++) {
                SIMInfo sIMInfo = sIMInfoArrB[i];
                if (sIMInfo != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(SIMInfo.SIM_INFO_TYPE_SLOT_INDEX, Integer.valueOf(sIMInfo.slotIndex)).putOpt(SIMInfo.SIM_INFO_TYPE_SUB_ID, Integer.valueOf(sIMInfo.subId)).putOpt(SIMInfo.SIM_INFO_TYPE_MCCMNC, sIMInfo.mccmnc).putOpt(SIMInfo.SIM_INFO_TYPE_NETWORK_MCCMNC, sIMInfo.networkMCCMNC).putOpt(SIMInfo.SIM_INFO_TYPE_IN_SERVICE, sIMInfo.inService).putOpt(SIMInfo.SIM_INFO_TYPE_MOBILE_DATA_ENABLE, sIMInfo.mobileDataEnable);
                    if (sIMInfo.accountCert != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(AuthorizeActivityBase.KEY_ACTIVATORTOKEN, sIMInfo.accountCert.c);
                        jSONObject3.put("hashedPhone", sIMInfo.accountCert.f14011b);
                        for (String str : this.mSIMInfoTypes) {
                            str.hashCode();
                            switch (str) {
                                case "activationOrOperatorAccountCert":
                                case "operatorAccountCert":
                                case "activationAccountCert":
                                    jSONObject2.put(str, jSONObject3);
                                    break;
                            }
                        }
                    }
                    jSONObject.put(String.valueOf(i), jSONObject2);
                }
            }
            return jSONObject;
        }
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public String getName() {
        return "getSIMInfo";
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public PassportJsbMethodResult invoke(final PassportJsbWebView passportJsbWebView, JSONObject jSONObject) throws PassportJsbMethodException {
        PassportJsbMethod.checkUrlDomainPermission(passportJsbWebView);
        Context context = passportJsbWebView.getContext();
        final String paramsStringFieldOrThrow = getParamsStringFieldOrThrow(jSONObject, "callbackId");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("simInfoTypes");
            String[] strArr = new String[jSONArray.length()];
            HashSet hashSet = new HashSet();
            hashSet.add(SIMInfo.SIM_INFO_TYPE_SLOT_INDEX);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_SUB_ID);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_MCCMNC);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_NETWORK_MCCMNC);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_IN_SERVICE);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_MOBILE_DATA_ENABLE);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_ACTIVATION_ACCOUNT_CERT);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_OPERATOR_ACCOUNT_CERT);
            hashSet.add(SIMInfo.SIM_INFO_TYPE_ACTIVATION_OR_OPERATOR_ACCOUNT_CERT);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                strArr[i] = string;
                if (!hashSet.contains(string)) {
                    return new PassportJsbMethodResult(false);
                }
            }
            BgTask<JSONObject> bgTask = this.mGetSIMInfoTask;
            if (bgTask != null) {
                bgTask.cancelAndRelease();
            }
            BgTask<JSONObject> bgTask2 = new BgTask<>(new GetSIMInfoBgRunnable(context, strArr), new BgTask.SuccessResultRunnable<JSONObject>() { // from class: com.xiaomi.passport.jsb.method_impl.PassportJsbMethodGetSIMInfo.1
                @Override // com.xiaomi.passport.task.BgTask.SuccessResultRunnable
                public void run(JSONObject jSONObject2) {
                    try {
                        new JSONObject().put("result", jSONObject2);
                        PassportFrontendMethodInvoker.invokeCallback(passportJsbWebView, paramsStringFieldOrThrow, jSONObject2);
                    } catch (JSONException e) {
                        throw new IllegalStateException("should never happen", e);
                    }
                }
            }, new BgTask.ErrorResultRunnable() { // from class: com.xiaomi.passport.jsb.method_impl.PassportJsbMethodGetSIMInfo.2
                @Override // com.xiaomi.passport.task.BgTask.ErrorResultRunnable
                public void run(Throwable th) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error", th.getMessage());
                        PassportFrontendMethodInvoker.invokeCallback(passportJsbWebView, paramsStringFieldOrThrow, jSONObject2);
                    } catch (JSONException e) {
                        throw new IllegalStateException("should never happen", e);
                    }
                }
            });
            this.mGetSIMInfoTask = bgTask2;
            bgTask2.execute();
            return new PassportJsbMethodResult(true);
        } catch (JSONException e) {
            throw new PassportJsbMethodException(104, e.getMessage(), e);
        }
    }

    @Override // com.xiaomi.passport.jsb.PassportJsbMethod
    public void release(PassportJsbWebView passportJsbWebView) {
        super.release(passportJsbWebView);
        BgTask<JSONObject> bgTask = this.mGetSIMInfoTask;
        if (bgTask != null) {
            bgTask.cancelAndRelease();
        }
    }
}
