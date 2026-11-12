package com.huawei.hwdevice.outofprocess.mgr.device;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.profile.client.profile.ProfileClient;
import defpackage.lsy;

/* JADX INFO: loaded from: classes10.dex */
public enum ProfileAgent {
    PROFILE_AGENT;

    private static final String TAG = "ProfileAgent";
    private ProfileClient clientAgent = new ProfileClient(BaseApplication.getContext());

    public boolean disconnectProfile() {
        return true;
    }

    public boolean getConnected() {
        return true;
    }

    public void setConnected(boolean z) {
    }

    ProfileAgent() {
    }

    public void connectProfile(final ServiceConnectCallback serviceConnectCallback) {
        LogUtil.a(TAG, "connectProfile start");
        lsy.a(new Runnable() { // from class: com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent.1
            @Override // java.lang.Runnable
            public void run() {
                serviceConnectCallback.onConnect();
            }
        });
    }

    public ProfileClient getClientAgent() {
        return this.clientAgent;
    }
}
