package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class cws implements UserInfoMedia.UserInfoWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f31449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31450b = true;
    private int e = 0;

    cws(Context context) {
        this.f31449a = null;
        if (context == null) {
            this.f31449a = BaseApplication.getContext();
        } else {
            this.f31449a = context.getApplicationContext();
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter
    public void write(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        synchronized (this) {
            if (this.f31450b) {
                LogUtil.j("HiHealthWriter", "block!!!");
            } else {
                e(userInfomation, callback);
            }
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter
    public void block() {
        synchronized (this) {
            this.f31450b = true;
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter
    public void unBlock() {
        synchronized (this) {
            this.f31450b = false;
        }
    }

    public void e(UserInfomation userInfomation, final UserInfoMedia.UserInfoWriter.Callback callback) {
        synchronized (this) {
            if (this.f31450b) {
                LogUtil.j("HiHealthWriter", "block!!!");
                return;
            }
            UserInfomation userInfomationCopyFrom = userInfomation.copyFrom();
            userInfomationCopyFrom.transSelf2METRIC();
            if (this.e == 0) {
                LogUtil.a("HiHealthWriter", "setUserData start :DATA_ALL");
                LogUtil.j("HiHealthWriter", "all data set in HiUserInfo to DB,warning,not permitted");
                return;
            }
            HiUserInfo hiUserInfoC = c(userInfomationCopyFrom);
            LogUtil.d("HiHealthWriter", " setUserData start, user=(1)", hiUserInfoC.getName(), " ", Integer.valueOf(hiUserInfoC.getBirthday()), " ", Integer.valueOf(hiUserInfoC.getGender()), " ", hiUserInfoC.getHeadImgUrl());
            LogUtil.d("HiHealthWriter", " setUserData start, user=(2)", Integer.valueOf(hiUserInfoC.getHeight()), " ", Float.valueOf(hiUserInfoC.getWeight()), " ", Integer.valueOf(hiUserInfoC.getUnitType()));
            HandlerExecutor.c(new Runnable() { // from class: cwv
                @Override // java.lang.Runnable
                public final void run() {
                    OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callSetUserdata", "HiHealthWriter");
                }
            }, 10000L);
            HiHealthNativeApi.a(this.f31449a).setUserData(hiUserInfoC, new HiCommonListener() { // from class: cws.3
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    LogUtil.a("HiHealthWriter", "setUserData onSuccess");
                    cwq.b(callback);
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    LogUtil.a("HiHealthWriter", "setUserData onFailure:", Integer.valueOf(i), " ", obj);
                    cwq.c(callback, -1);
                }
            });
        }
    }

    private HiUserInfo c(UserInfomation userInfomation) {
        HiUserInfo hiUserInfo = new HiUserInfo();
        hiUserInfo.setUser(1073741824);
        int i = this.e;
        if (i == 268435456) {
            LogUtil.a("HiHealthWriter", "setUserData start :UP_DATA_ONLY");
            hiUserInfo.setModifiedIntent(268435456);
        } else if (i == 536870912) {
            LogUtil.a("HiHealthWriter", "setUserData start :DP_DATA_ONLY");
            hiUserInfo.setModifiedIntent(536870912);
        } else {
            LogUtil.j("HiHealthWriter", "unknown data type in HiUserInfo to DB,warning");
        }
        if (!TextUtils.isEmpty(userInfomation.getName())) {
            hiUserInfo.setName(userInfomation.getName());
        }
        if (userInfomation.isGenderValid()) {
            int gender = userInfomation.getGender();
            if (gender == 0) {
                hiUserInfo.setGender(1);
            } else if (gender == 1) {
                hiUserInfo.setGender(0);
            } else {
                hiUserInfo.setGender(gender);
            }
        }
        if (userInfomation.isBirthdayValid()) {
            hiUserInfo.setBirthday(qrs.a(userInfomation.getBirthday()));
        }
        if (userInfomation.isHeightValid()) {
            hiUserInfo.setHeight(userInfomation.getHeight());
        }
        if (userInfomation.isWeightValid()) {
            hiUserInfo.setWeight(userInfomation.getWeight());
        }
        hiUserInfo.setUnitType(userInfomation.getClientSet());
        ReleaseLogUtil.d("R_PersonalInfo_HiHealthWriter", "is reset to default height:", Boolean.valueOf(hiUserInfo.getHeight() == 170), " default weight:", Boolean.valueOf(hiUserInfo.getWeight() == 60.0f), " default birthday:", Boolean.valueOf(hiUserInfo.getBirthday() == 19900801), " default gender:", Boolean.valueOf(hiUserInfo.getGender() == 1));
        hiUserInfo.setCreateTime(System.currentTimeMillis());
        return hiUserInfo;
    }

    public void a(int i) {
        synchronized (this) {
            this.e = i;
        }
    }
}
