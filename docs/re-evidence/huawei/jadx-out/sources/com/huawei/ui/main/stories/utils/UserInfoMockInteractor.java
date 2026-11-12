package com.huawei.ui.main.stories.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import defpackage.lod;
import defpackage.pee;
import health.compact.a.Services;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes19.dex */
public class UserInfoMockInteractor {
    private Context e;

    public UserInfoMockInteractor(Context context) {
        this.e = context;
    }

    public void d() {
        LogUtil.a("UserInfoMockUtil", "insertUserInfoDataToDB");
        ThreadPoolManager.b(1, 1, "UserInfoMockUtil").execute(new Runnable() { // from class: com.huawei.ui.main.stories.utils.UserInfoMockInteractor.4
            @Override // java.lang.Runnable
            public void run() {
                UserInfomation userInfomation = new UserInfomation();
                userInfomation.setWeight(68.0f);
                userInfomation.setHeight(175);
                userInfomation.setGender(0);
                userInfomation.setPortraitUrl("https://");
                userInfomation.setName("小明");
                userInfomation.setBirthday("19950808");
                userInfomation.setPicPath(lod.b(UserInfoMockInteractor.this.e, "1", UserInfoMockInteractor.this.e()));
                userInfomation.setBirthdayStatus(UserInfomation.BIRTHDAY_SETED);
                userInfomation.setSetTime(System.currentTimeMillis());
                ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setUserInfo(userInfomation, new ICloudOperationResult<Boolean>() { // from class: com.huawei.ui.main.stories.utils.UserInfoMockInteractor.4.2
                    @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void operationResult(Boolean bool, String str, boolean z) {
                        LogUtil.a("UserInfoMockUtil", "setUserInfo result = ", Boolean.valueOf(z));
                    }
                });
            }
        });
    }

    public Bitmap e() {
        Bitmap bitmapDecodeStream = null;
        try {
            InputStream inputStreamE = pee.e("healthgroup", "pic_6.png");
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamE);
                if (inputStreamE != null) {
                    inputStreamE.close();
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("UserInfoMockUtil", "readProfileBitmapFromStoreDemo error");
            return bitmapDecodeStream;
        }
    }
}
