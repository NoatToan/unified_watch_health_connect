package com.huawei.hwdevice.phoneprocess.mgr.intelligentlifemgr;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.profile.client.profile.ProfileClient;
import defpackage.lsy;

/* JADX INFO: loaded from: classes11.dex */
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
        lsy.a(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.intelligentlifemgr.ProfileAgent.5
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
