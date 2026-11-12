package com.huawei.pluginsocialshare.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.huawei.caas.messageservice.HwShareMsgInfo;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.socialshare.model.CaasShareCallBack;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.interactors.HwCaasShareInteractors;
import defpackage.gxt;
import defpackage.pjm;
import defpackage.pkm;
import defpackage.pnq;

/* JADX INFO: loaded from: classes42.dex */
@ApiDefine(uri = SocialShareCenterApi.class)
@Singleton
public class SocialShareCenterImpl implements SocialShareCenterApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwCaasShareInteractors f22562a;

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void exeShare(gxt gxtVar, Context context) {
        pjm.d().a(gxtVar, context);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void exeShare(Context context, int i, gxt gxtVar) {
        pjm.d().a(context, i, gxtVar);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void choosePic(Activity activity) {
        pkm.c(activity);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void takePhoto(Activity activity) {
        pkm.d(activity);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void startCrop(Activity activity, Intent intent) {
        pkm.e(activity, intent);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void startCrop(Activity activity) {
        pkm.e(activity);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void saveToLocalGallery(Context context, Bitmap bitmap) {
        pnq.d(context, bitmap);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void initCaas(Context context, CaasShareCallBack caasShareCallBack) {
        HwCaasShareInteractors hwCaasShareInteractors = new HwCaasShareInteractors(context);
        this.f22562a = hwCaasShareInteractors;
        hwCaasShareInteractors.c(caasShareCallBack);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void sendShareMsgInfo(int i, HwShareMsgInfo hwShareMsgInfo) {
        HwCaasShareInteractors hwCaasShareInteractors = this.f22562a;
        if (hwCaasShareInteractors == null) {
            LogUtil.j("Share_SocialShareCenterImpl", "HwCaasShareInteractors is null");
        } else {
            hwCaasShareInteractors.e(i, hwShareMsgInfo);
        }
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void releaseCaas() {
        HwCaasShareInteractors hwCaasShareInteractors = this.f22562a;
        if (hwCaasShareInteractors == null) {
            LogUtil.j("Share_SocialShareCenterImpl", "HwCaasShareInteractors is null");
        } else {
            hwCaasShareInteractors.c();
        }
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public String getShareNickName() {
        return pnq.a();
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void setIsShowUserInfo(boolean z) {
        pnq.c(z);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public boolean isShowUserInfo() {
        return pnq.j();
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void updateShareUserView(String str, View... viewArr) {
        updateShareUserView(str, 4, viewArr);
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void updateShareUserView(String str, int i, View... viewArr) {
        if (isShowUserInfo()) {
            i = 0;
        }
        LogUtil.j("Share_SocialShareCenterImpl", "updateShareUserView tag:", str);
        for (View view : viewArr) {
            if (view == null) {
                LogUtil.j("Share_SocialShareCenterImpl", str + "updateShareUserView view null");
            } else {
                view.setVisibility(i);
            }
        }
    }

    @Override // com.huawei.health.socialshare.api.SocialShareCenterApi
    public void showUserinfoDisableDialog(Context context, int i, int i2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        pnq.b(context, i, i2, onClickListener, onClickListener2);
    }
}
