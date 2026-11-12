package com.miui.tsmclient.sesdk;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.entity.VersionControlInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.EnvironmentConfig;
import defpackage.fns;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceProtocolData {
    private String mCardType;
    private VersionControlInfo mVersionInfo;

    public ServiceProtocolData(VersionControlInfo versionControlInfo, String str) {
        this.mVersionInfo = versionControlInfo;
        this.mCardType = str;
    }

    public void confirm() {
        Context context = EnvironmentConfig.getContext();
        VersionControlInfo versionControlInfo = this.mVersionInfo;
        fns.o(context, versionControlInfo.mServiceName, versionControlInfo.mVersionControlId);
        fns.c().e(EnvironmentConfig.getContext(), this.mVersionInfo.mVersionControlId, null);
    }

    public int getCaptchaVerifyType() {
        return this.mVersionInfo.mCaptchaVerifyType;
    }

    public String getRichText() {
        return this.mVersionInfo.mRichText;
    }

    public String getUrl() {
        return this.mVersionInfo.mContent;
    }

    public boolean isNeedConfirm() {
        if (this.mVersionInfo.mNeedConfirm) {
            long jA = fns.a(EnvironmentConfig.getContext(), this.mVersionInfo.mServiceName);
            VersionControlInfo versionControlInfo = this.mVersionInfo;
            if (jA < versionControlInfo.mVersionControlId && !TextUtils.isEmpty(versionControlInfo.mContent)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNeedPhone() {
        return this.mVersionInfo.mNeedPhone;
    }

    public BaseResponse requestCaptcha(String str) {
        return requestCaptcha(str, 1);
    }

    public BaseResponse requestCaptcha(String str, int i) {
        if (i == 0) {
            i = 1;
        }
        return new TSMAuthManager().sendVerificationCode(EnvironmentConfig.getContext(), str, this.mCardType, Integer.toString(i));
    }
}
