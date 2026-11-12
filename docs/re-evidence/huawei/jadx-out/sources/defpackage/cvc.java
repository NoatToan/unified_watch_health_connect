package defpackage;

import android.content.Context;
import com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class cvc implements IAccountDataExtMgr {
    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void init(Context context) {
        LogUtil.j("NullAccountDataExtMgr", "NullAccountDataExtMgr init,error");
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void destroy(Context context) {
        LogUtil.j("NullAccountDataExtMgr", "NullAccountDataExtMgr destroy,error");
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void setUserInfo(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        LogUtil.j("NullAccountDataExtMgr", "NullAccountDataExtMgr setUserInfo,error");
        cwq.c(callback, -1);
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public UserInfomation getUserInfo() {
        LogUtil.j("NullAccountDataExtMgr", "NullAccountDataExtMgr getUserInfo,error");
        return null;
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public boolean checkInit() {
        ReleaseLogUtil.d("R_PersonalInfo_NullAccountDataExtMgr", "NullAccountDataExtMgr checkInit isInit = false");
        return false;
    }
}
