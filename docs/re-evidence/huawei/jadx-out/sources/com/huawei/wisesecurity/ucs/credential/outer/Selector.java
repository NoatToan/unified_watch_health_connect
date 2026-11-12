package com.huawei.wisesecurity.ucs.credential.outer;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.common.report.ReportOption;
import com.huawei.wisesecurity.ucs.credential.outer.impl.QuietHACapabilityImpl;
import com.huawei.wisesecurity.ucs_credential.i0;
import com.huawei.wisesecurity.ucs_credential.o;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yrd;
import defpackage.yrn;
import defpackage.yrp;

/* JADX INFO: loaded from: classes20.dex */
public class Selector {
    private static final String GRS_FEATURE_CLASS = "com.huawei.hms.framework.network.grs.GrsClient";
    private static final String HA_FEATURE_CLASS = "com.huawei.hianalytics.process.HiAnalyticsInstance";
    private static final String NETWORK_FEATURE_CLASS = "com.huawei.hms.network.restclient.RestClient";
    private static final int NETWORK_RETRY_TIME_MAX = 5;
    private static final int NETWORK_RETRY_TIME_MIN = 1;
    private static final int NETWORK_TIME_OUT_MAX = 20000;
    private static final int NETWORK_TIME_OUT_MIN = 10000;
    private static final int SER_COUNTRY_LENGTH_MAX = 7;
    private static final int SER_COUNTRY_LENGTH_MIN = 2;
    private static final String TAG = "Selector";

    public static NetworkCapability selectNetWorkCapability(NetworkCapability networkCapability, Context context, int i, int i2) throws yqj {
        if (networkCapability != null) {
            networkCapability.initConfig(i, i2);
            return networkCapability;
        }
        try {
            Class.forName(NETWORK_FEATURE_CLASS);
            if (i < 10000 || i > 20000 || i2 < 1 || i2 > 5) {
                throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "networkTimeOut or networkRetryTime param error");
            }
            i0 i0Var = new i0(context);
            i0Var.initConfig(i, i2);
            yqi.a(TAG, "outer Network capability is null, use inner capability", new Object[0]);
            return i0Var;
        } catch (ClassNotFoundException e) {
            StringBuilder sbB = yql.b("Network capability not found : ");
            sbB.append(e.getMessage());
            throw new yqj(1025L, sbB.toString());
        }
    }

    public static HACapability selectHACapability(HACapability hACapability, o oVar, ReportOption reportOption) throws yqj {
        if (hACapability != null) {
            return hACapability;
        }
        if (ReportOption.REPORT_CLOSE == reportOption) {
            return new QuietHACapabilityImpl();
        }
        try {
            Class.forName(HA_FEATURE_CLASS);
            yqi.a(TAG, "outer HA capability is null, use inner capability", new Object[0]);
            return new yrn(oVar, reportOption);
        } catch (ClassNotFoundException e) {
            StringBuilder sbB = yql.b("HA capability not found : ");
            sbB.append(e.getMessage());
            throw new yqj(1025L, sbB.toString());
        }
    }

    public static o selectGrsCapability(GrsCapability grsCapability, Context context, String str) throws yqj {
        if (grsCapability != null) {
            return new yrd(grsCapability);
        }
        try {
            Class.forName(GRS_FEATURE_CLASS);
            if (!TextUtils.isEmpty(str) && (str.length() < 2 || str.length() > 7)) {
                throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "serCountry param error");
            }
            yqi.a(TAG, "outer GRS capability is null, use inner capability", new Object[0]);
            return new yrp(context, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sbB = yql.b("GRS capability not found : ");
            sbB.append(e.getMessage());
            throw new yqj(1025L, sbB.toString());
        }
    }
}
