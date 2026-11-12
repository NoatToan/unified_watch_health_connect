package defpackage;

import android.content.Context;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cwu implements UserInfoMedia.UserInfoReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31454b;
    private boolean d = true;

    cwu(Context context) {
        this.f31454b = null;
        if (context == null) {
            this.f31454b = BaseApplication.getContext();
        } else {
            this.f31454b = context.getApplicationContext();
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void read(UserInfoMedia.UserInfoReader.Callback callback) {
        synchronized (this) {
            if (this.d) {
                LogUtil.j("HiHealthReader", "read block!!!");
            } else {
                LogUtil.a("HiHealthReader", "sync(HiHealthReader) callback:", callback);
                b(callback);
            }
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void block() {
        synchronized (this) {
            LogUtil.a("HiHealthReader", "block HiHealthReader");
            this.d = true;
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void unBlock() {
        synchronized (this) {
            LogUtil.a("HiHealthReader", "unBlock HiHealthReader");
            this.d = false;
        }
    }

    public void b(UserInfoMedia.UserInfoReader.Callback callback) {
        synchronized (this) {
            if (this.d) {
                LogUtil.j("HiHealthReader", "sync block!!!");
            } else {
                LogUtil.a("TimeEat_HiHealthReader", "start to fetchUserData");
                a(callback);
            }
        }
    }

    private void a(final UserInfoMedia.UserInfoReader.Callback callback) {
        HiHealthNativeApi.a(this.f31454b).fetchUserData(new HiCommonListener() { // from class: cwu.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                List list;
                LogUtil.a("TimeEat_HiHealthReader", "Enter fetchUserData onSuccess");
                if (obj != null) {
                    try {
                        list = (List) obj;
                    } catch (ClassCastException unused) {
                        LogUtil.e("HiHealthReader", "fetchUserData data ClassCastException");
                        list = null;
                    }
                    if (list == null || list.size() <= 0) {
                        ReleaseLogUtil.e("R_PersonalInfo_HiHealthReader", "fetchUserData data size = 0");
                        UserInfoMedia.UserInfoReader.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.onFail(300099);
                            return;
                        }
                        return;
                    }
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    if (hiUserInfo == null) {
                        ReleaseLogUtil.e("R_PersonalInfo_HiHealthReader", "hiUserInfo = null");
                        UserInfoMedia.UserInfoReader.Callback callback3 = callback;
                        if (callback3 != null) {
                            callback3.onFail(300099);
                            return;
                        }
                        return;
                    }
                    ReleaseLogUtil.d("R_PersonalInfo_HiHealthReader", "verify userInfo, isGenderValid: ", Boolean.valueOf(hiUserInfo.isGenderValid()), " isBirthdayValid: ", Boolean.valueOf(hiUserInfo.isBirthdayValid()), " isHeightValid: ", Boolean.valueOf(hiUserInfo.isHeightValid()), " isWeightValid: ", Boolean.valueOf(hiUserInfo.isWeightValid()));
                    cwu.this.d(hiUserInfo.getOwnerId());
                    UserInfomation userInfomation = new UserInfomation();
                    userInfomation.loadAccountData(hiUserInfo);
                    userInfomation.loadAccountExtData(hiUserInfo);
                    userInfomation.setPicPath(czz.a());
                    userInfomation.transSelf2METRIC();
                    cwq.d(callback, userInfomation);
                    LogUtil.a("TimeEat_HiHealthReader", "Leave fetchUserData onSuccess");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.e("R_PersonalInfo_HiHealthReader", "fetchUserData onFailure errCode: ", Integer.valueOf(i), " errMsg: ", obj);
                cwq.b(callback, -1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (!Utils.h() || qra.a()) {
            return;
        }
        boolean z = BaseApplication.getContext().getSharedPreferences("sync_record", 0).getBoolean("firstsynccompleteflag" + i, false);
        LogUtil.a("HiHealthReader", "updateSyncCompleteStatus isSyncComplete is ", Boolean.valueOf(z));
        qra.c(z);
    }
}
