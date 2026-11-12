package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class i {
    public static boolean a(Context context, String str, long j) {
        hw.b("AgentUtil", "start jump agent");
        try {
            SafeIntent safeIntent = new SafeIntent(Intent.parseUri(Constants.WHY_THIS_AD_DEFAULT_URL, 1));
            safeIntent.setFlags(335544320);
            safeIntent.setPackage("com.huawei.hwid");
            safeIntent.putExtra(ParamConstants.Param.AGENT_ID, j);
            safeIntent.putExtra(ParamConstants.Param.IS_INTERACTIVE_MARKETING, true);
            safeIntent.putExtra(ParamConstants.Param.CLICK_URL, str);
            context.startActivity(safeIntent);
            return true;
        } catch (Throwable th) {
            hw.c("AgentUtil", "start agent err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(Context context, long j) {
        if (j < 1) {
            hw.c("AgentUtil", "can't jump agent, agent id is invalid, cur agent id: %s", Long.valueOf(j));
            return false;
        }
        int iA = y.a(context);
        hw.b("AgentUtil", "cur dc version is %d", Integer.valueOf(iA));
        if (iA >= 30476310) {
            return true;
        }
        hw.c("AgentUtil", "can't jump agent, dc version is invalid");
        return false;
    }
}
