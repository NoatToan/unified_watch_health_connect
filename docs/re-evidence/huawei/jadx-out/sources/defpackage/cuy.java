package defpackage;

import android.content.Context;
import com.huawei.featureuserprofile.account.data.IAccountDataMgr;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class cuy implements IAccountDataMgr {
    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void init(Context context) {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr init,error");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void destroy() {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr destroy,error");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public UserInfomation getUserInfo() {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr getUserInfo,error");
        return null;
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void setUserInfo(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr setUserInfo,error");
        cwq.c(callback, -1);
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync() {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr sync,error");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync(UserInfoMedia.UserInfoReader.Callback callback) {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr sync,error");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public boolean checkInit() {
        ReleaseLogUtil.d("R_PersonalInfo_NullAccountDataMgr", "NullAccountDataMgr checkInit isInit = false");
        return false;
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void refreshAccountDataCache(UserInfomation userInfomation) {
        LogUtil.j("NullAccountDataMgr", "NullAccountDataMgr refreshAccountDataCache");
    }
}
