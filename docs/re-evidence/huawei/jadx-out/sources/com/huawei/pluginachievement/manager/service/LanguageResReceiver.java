package com.huawei.pluginachievement.manager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.ouh;

/* JADX INFO: loaded from: classes13.dex */
public class LanguageResReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.a("PLGACHIEVE_LanguageResReceiver", "onReceive action is null!");
            return;
        }
        if (intent.getAction() == null) {
            LogUtil.a("PLGACHIEVE_LanguageResReceiver", "onReceive action ,intent.getAction() is null!");
            return;
        }
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            LogUtil.a("PLGACHIEVE_LanguageResReceiver", "onReceive action:", intent.getAction());
            ouh ouhVarB = ouh.b(context);
            LogUtil.a("PLGACHIEVE_LanguageResReceiver", "onReceive languageRes:", ouhVarB == null ? Constants.NULL : ouhVarB.toString());
            if (ouhVarB == null || !ouhVarB.e()) {
                return;
            }
            ouhVarB.c();
        }
    }
}
