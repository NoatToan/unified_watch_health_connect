package com.huawei.hwdevice.phoneprocess.mgr.hwtwsmgr;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.profile.client.profile.CloudInteractionMode;
import com.huawei.profile.client.profile.ProfileClient;

/* JADX INFO: loaded from: classes11.dex */
public enum ProfileUpdate {
    PROFILE_UPDATE_BY_APK(CloudInteractionMode.BY_PROFILE),
    PROFILE_UPDATE_BY_AAR(CloudInteractionMode.DIRECTLY);

    private static final String TAG = "ProfileUpdate";
    private ProfileClient mProfileClient;

    public void disconnectProfile() {
    }

    public boolean isConnected() {
        return true;
    }

    ProfileUpdate(CloudInteractionMode cloudInteractionMode) {
        this.mProfileClient = new ProfileClient(BaseApplication.getContext(), cloudInteractionMode);
    }

    public ProfileClient getProfileClient() {
        return this.mProfileClient;
    }

    public void connectProfile(ServiceConnectCallback serviceConnectCallback) {
        if (isConnected()) {
            return;
        }
        serviceConnectCallback.onConnect();
    }
}
