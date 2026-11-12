package com.huawei.health.manager.util;

import android.content.Context;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import health.compact.a.SharedPerferenceUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UserInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static UserInfo f8163c;
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8164a;
    private float f;
    private int i;
    private String l;
    private float o;
    private String j = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8165b = 0;
    private float h = 60.0f;
    private float d = 170.0f;
    private int g = -1;

    private UserInfo() {
        Context context = e;
        if (context == null) {
            LogUtil.a("Step_UserInfo", "UserInfo mContext is null");
            return;
        }
        String[] strArrW = SharedPerferenceUtils.w(context);
        if (strArrW == null || strArrW.length < 6) {
            LogUtil.a("Step_UserInfo", "UserInfo is invalid");
            return;
        }
        LogUtil.a("Step_UserInfo", "===userInfoStrings ", Arrays.toString(strArrW));
        try {
            if (!"0".equals(strArrW[0]) && Float.parseFloat(strArrW[1]) != 0.0f && Float.parseFloat(strArrW[2]) != 0.0f) {
                b(Float.parseFloat(strArrW[1]), Float.parseFloat(strArrW[2]), Integer.parseInt(strArrW[3]), Integer.parseInt(strArrW[4]), Integer.parseInt(strArrW[5]));
                LogUtil.a("Step_UserInfo", "UserInfo from sp");
            } else {
                LogUtil.a("Step_UserInfo", "UserInfo from default");
                b(this.h, this.d, this.f8165b, 1, new HiUserInfo().getAgeOrDefaultValue());
                h();
            }
        } catch (NumberFormatException e2) {
            LogUtil.e("Step_UserInfo", "NumberFormatException exception", e2.getMessage());
        }
    }

    private void h() {
        HiHealthManager.d(e).fetchUserData(new HiCommonListener() { // from class: com.huawei.health.manager.util.UserInfo.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.d("Step_UserInfo", "getUserInfoFromDb");
                if (obj == null) {
                    LogUtil.j("Step_UserInfo", "getUserInfoFromDb, data is null.");
                    return;
                }
                if (!njy.b(obj, HiUserInfo.class)) {
                    LogUtil.j("Step_UserInfo", "getUserInfoFromDb userInfoLists not isListTypeMatch");
                    return;
                }
                List<HiUserInfo> list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("Step_UserInfo", "getUserInfoFromDb userInfoLists is null or userInfoList.size() == 0");
                    return;
                }
                for (HiUserInfo hiUserInfo : list) {
                    if (hiUserInfo != null && hiUserInfo.getRelateType() == 0) {
                        if (hiUserInfo.isBirthdayValid() && hiUserInfo.isGenderValid() && hiUserInfo.isHeightValid() && hiUserInfo.isWeightValid()) {
                            UserInfo.this.b(hiUserInfo.getWeight(), hiUserInfo.getHeight(), hiUserInfo.getOwnerId(), hiUserInfo.getGender(), hiUserInfo.getAge());
                            LogUtil.a("Step_UserInfo", "setUserInfo sync");
                        } else {
                            LogUtil.a("Step_UserInfo", "setUserInfo sync isInValid");
                        }
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("Step_UserInfo", "getUserInfo onFailure = ", Integer.valueOf(i));
            }
        });
    }

    public static void d(Context context) {
        if (context != null) {
            e = context;
        }
    }

    public static UserInfo a() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            if (f8163c == null) {
                f8163c = new UserInfo();
            }
            userInfo = f8163c;
        }
        return userInfo;
    }

    public final void b(float f, float f2, int i, int i2, int i3) {
        if (f != this.o || f2 != this.f || i2 != this.g || i3 != this.f8164a) {
            LogUtil.a("Step_UserInfo", "userInfo changed detail");
        }
        String str = this.j;
        this.l = str;
        this.o = f;
        this.f = f2;
        this.i = i;
        this.g = i2;
        this.f8164a = i3;
        Context context = e;
        if (context != null) {
            SharedPerferenceUtils.b(context, str, f, f2, i, i2, i3);
        }
    }

    public int d() {
        return this.i;
    }

    public float c() {
        return this.f;
    }

    public float j() {
        return this.o;
    }

    public int b() {
        return this.g;
    }

    public int e() {
        return this.f8164a;
    }
}
