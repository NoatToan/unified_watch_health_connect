package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.hms.network.embedded.y;
import com.huawei.wisesecurity.kfs.ha.message.BaseReportMsgBuilder;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotNull;
import com.huawei.wisesecurity.ucs.common.log.ILogUcs;
import com.huawei.wisesecurity.ucs.common.report.ReportOption;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.GrsCapability;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.Selector;
import com.huawei.wisesecurity.ucs_credential.o;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqg;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yqt;
import defpackage.yqz;
import defpackage.yra;
import defpackage.yrh;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public class CredentialClient {
    private static final String TAG = "CredentialClient";
    private String appId;
    private Context context;
    private yrh credentialManager;
    private HACapability haCapability;

    public Credential applyCredential(String str, String str2) throws yqj {
        checkParams(str);
        checkThread();
        yqt yqtVarCreateReportMsgBuilder = createReportMsgBuilder(str, str2);
        yqi.a(TAG, "start apply credential for {0} , appId is {1},", str, this.appId);
        try {
            try {
                Credential credentialB = this.credentialManager.b(1, str, str2);
                yqi.a(TAG, "finish apply credential for {0} , appId is {1}", str, this.appId);
                yqtVarCreateReportMsgBuilder.e(this.credentialManager.i).setStatusCode(0);
                reportLogs(yqtVarCreateReportMsgBuilder);
                return credentialB;
            } catch (yqj e) {
                yqi.e(TAG, "get Credential get UcsException : " + e.getMessage(), new Object[0]);
                yqtVarCreateReportMsgBuilder.setStatusCode((int) e.e()).setErrorMsg(e.getMessage());
                throw e;
            } catch (Exception e2) {
                String str3 = "get Credential get exception : " + e2.getMessage();
                yqi.e(TAG, str3, new Object[0]);
                yqtVarCreateReportMsgBuilder.setStatusCode(2001).setErrorMsg(str3);
                throw new yqj(2001L, str3);
            }
        } catch (Throwable th) {
            reportLogs(yqtVarCreateReportMsgBuilder);
            throw th;
        }
    }

    public Credential applyCredentialByEC(String str, String str2) throws yqj {
        checkParams(str);
        checkThread();
        yqt yqtVarCreateReportMsgBuilder = createReportMsgBuilder(str, str2);
        yqi.a(TAG, "start apply credential by EC for {0} , appId is {1}", str, this.appId);
        try {
            try {
                Credential credentialB = this.credentialManager.b(2, str, str2);
                yqi.a(TAG, "finish apply credential by EC for {0} , appId is {1}", str, this.appId);
                yqtVarCreateReportMsgBuilder.e(this.credentialManager.i).setStatusCode(0);
                reportLogs(yqtVarCreateReportMsgBuilder);
                return credentialB;
            } catch (yqj e) {
                yqi.e(TAG, "get Credential by EC get UcsException : " + e.getMessage(), new Object[0]);
                yqtVarCreateReportMsgBuilder.setStatusCode((int) e.e()).setErrorMsg(e.getMessage());
                throw e;
            } catch (Exception e2) {
                String str3 = "get Credential by EC get exception : " + e2.getMessage();
                yqi.e(TAG, str3, new Object[0]);
                yqtVarCreateReportMsgBuilder.setStatusCode(2001).setErrorMsg(str3);
                throw new yqj(2001L, str3);
            }
        } catch (Throwable th) {
            reportLogs(yqtVarCreateReportMsgBuilder);
            throw th;
        }
    }

    public void reportLogs(BaseReportMsgBuilder baseReportMsgBuilder) {
        baseReportMsgBuilder.setAppId(this.appId).setPackageName(this.context.getPackageName()).setVersion("1.0.4.321");
        Context context = this.context;
        try {
            this.haCapability.onEvent(context, baseReportMsgBuilder.getEventId(), baseReportMsgBuilder.setCostTime());
        } catch (Throwable th) {
            StringBuilder sbB = yql.b("onEvent get exception : ");
            sbB.append(th.getMessage());
            yqi.a("ReportUtil", sbB.toString(), new Object[0]);
        }
    }

    public static class Builder {
        private String appId;

        @KfsNotNull
        private Context context;
        private GrsCapability grsCapability;
        private HACapability haCapability;
        private NetworkCapability networkCapability;
        private String serCountry;
        private int networkTimeOut = y.f15619c;
        private int networkRetryTime = 2;
        private ReportOption reportOption = ReportOption.REPORT_NORMAL;

        public Builder serCountry(String str) {
            this.serCountry = str;
            return this;
        }

        public Builder reportOption(ReportOption reportOption) {
            this.reportOption = reportOption;
            return this;
        }

        public Builder networkTimeOut(int i) {
            this.networkTimeOut = i;
            return this;
        }

        public Builder networkRetryTime(int i) {
            this.networkRetryTime = i;
            return this;
        }

        public Builder networkCapability(NetworkCapability networkCapability) {
            this.networkCapability = networkCapability;
            return this;
        }

        public Builder logInstance(ILogUcs iLogUcs) {
            yqi.d(iLogUcs);
            return this;
        }

        public Builder haCapability(HACapability hACapability) {
            this.haCapability = hACapability;
            return this;
        }

        public Builder grsCapability(GrsCapability grsCapability) {
            this.grsCapability = grsCapability;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public CredentialClient build() throws yqj {
            try {
                String str = this.appId;
                if (str != null && str.length() > 30) {
                    throw new yqg("appId length is too long");
                }
                yoj.d(this);
                o oVarSelectGrsCapability = Selector.selectGrsCapability(this.grsCapability, this.context, this.serCountry);
                return new CredentialClient(this.context, this.appId, oVarSelectGrsCapability, Selector.selectNetWorkCapability(this.networkCapability, this.context, this.networkTimeOut, this.networkRetryTime), Selector.selectHACapability(this.haCapability, oVarSelectGrsCapability, this.reportOption));
            } catch (yny e) {
                StringBuilder sbB = yql.b("CredentialClient check param error : ");
                sbB.append(e.getMessage());
                throw new yqg(sbB.toString());
            } catch (yqj e2) {
                long jE = e2.e();
                yqi.e(CredentialClient.TAG, "CredentialClient build get UCS exception : errorCode : {0} errorMsg : {1}", Long.valueOf(jE), e2.getMessage());
                throw e2;
            } catch (Throwable th) {
                StringBuilder sbB2 = yql.b("CredentialClient build get exception : ");
                sbB2.append(th.getMessage());
                String string = sbB2.toString();
                throw yra.e(CredentialClient.TAG, string, new Object[0], 2001L, string);
            }
        }

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }
    }

    public Credential genCredentialFromString(String str) throws yqj {
        yqz yqzVar = (yqz) new yqz().d().setApiName("appAuth.credentialFromString").setCallTime();
        try {
            try {
                try {
                    Credential credentialFromString = Credential.fromString(this.context, str, yqzVar);
                    yqzVar.setStatusCode(0);
                    reportLogs(yqzVar);
                    return credentialFromString;
                } catch (Exception e) {
                    String str2 = "credential from string get exception : " + e.getMessage();
                    yqi.e(TAG, "{0}", str2);
                    yqzVar.setStatusCode(2001).setErrorMsg(str2);
                    throw new yqj(2001L, str2);
                }
            } catch (yqj e2) {
                yqi.e(TAG, "credential from string get UcsException : {0}", e2.getMessage());
                yqzVar.setStatusCode((int) e2.e()).setErrorMsg(e2.getMessage());
                throw e2;
            }
        } catch (Throwable th) {
            reportLogs(yqzVar);
            throw th;
        }
    }

    public Credential applyCredentialByEC(String str) throws yqj {
        return applyCredentialByEC(str, UUID.randomUUID().toString());
    }

    public Credential applyCredential(String str) throws yqj {
        return applyCredential(str, UUID.randomUUID().toString());
    }

    private yqt createReportMsgBuilder(String str, String str2) {
        return (yqt) new yqt().b().d(str).setTransId(str2).setApiName("appAuth.applyCredential").setCallTime();
    }

    private void checkThread() throws yqj {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new yqj(1015L, "can not apply in main looper...");
        }
    }

    private void checkParams(String str) throws yqj {
        if (TextUtils.isEmpty(str)) {
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "serviceName illegal...");
        }
    }

    private CredentialClient(Context context, String str, o oVar, NetworkCapability networkCapability, HACapability hACapability) throws yqj {
        this.context = context;
        this.appId = str;
        this.haCapability = hACapability;
        this.credentialManager = new yrh(this, context, networkCapability, oVar, str);
        UcsLib.checkNativeLibrary();
    }
}
