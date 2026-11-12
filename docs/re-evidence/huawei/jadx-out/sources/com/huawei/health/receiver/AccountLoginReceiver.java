package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.loj;
import defpackage.lvj;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes30.dex */
public class AccountLoginReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        LogUtil.a("AccountLoginReceiver", " == AccountLoginReceiver enter ");
        if (CommonUtil.ck() && loj.c(53) && intent != null) {
            DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(context).d();
            if (deviceCapabilityD == null) {
                LogUtil.j("AccountLoginReceiver", "deviceCapability is null!");
                return;
            }
            if (!deviceCapabilityD.isSupportPay() && !deviceCapabilityD.isSupportWalletOpenCard()) {
                LogUtil.j("AccountLoginReceiver", "AccountLoginReceiver is not SupportPay : ");
                return;
            }
            try {
                action = intent.getAction();
            } catch (Exception unused) {
                LogUtil.e("AccountLoginReceiver", "AccountLoginReceiver getAction Exception");
                action = null;
            }
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (TextUtils.isEmpty(accountInfo)) {
                LogUtil.j("AccountLoginReceiver", "AccountLoginReceiver userId is empty");
                return;
            }
            if (action != null) {
                if ("com.huawei.plugin.account.login".equals(action)) {
                    LogUtil.a("AccountLoginReceiver", "AccountLoginReceiver sendAccount ");
                    lvj.c().e(accountInfo, (IBaseResponseCallback) null);
                } else if ("com.huawei.plugin.account.logout".equals(action)) {
                    LogUtil.a("AccountLoginReceiver", "AccountLoginReceiver logout sendAccount ");
                } else {
                    LogUtil.a("AccountLoginReceiver", "AccountLoginReceiver receive unknown localBroadCast action = ", action);
                }
            }
        }
    }
}
