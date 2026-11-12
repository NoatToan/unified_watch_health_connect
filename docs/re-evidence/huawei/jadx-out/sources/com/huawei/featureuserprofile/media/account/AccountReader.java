package com.huawei.featureuserprofile.media.account;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.util.AsyncSelectorSerialize;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.up.model.UserInfomation;
import defpackage.cwq;
import defpackage.imz;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class AccountReader implements UserInfoMedia.UserInfoReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5607b;
    private boolean e = true;

    public AccountReader(Context context) {
        this.f5607b = context;
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void read(UserInfoMedia.UserInfoReader.Callback callback) {
        synchronized (this) {
            if (this.e) {
                LogUtil.j("AccountReader", "read block!!!");
            } else if (LoginInit.getInstance(this.f5607b).isLoginedByWear()) {
                LogUtil.a("AccountReader", "K Scence logined by wear,dircet return null");
                cwq.b(callback, -1);
            } else {
                LogUtil.a("AccountReader", "sync(AccountReader) callback:", callback);
                a(callback);
            }
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void block() {
        synchronized (this) {
            LogUtil.a("AccountReader", "block(AccountReader)");
            this.e = true;
        }
    }

    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader
    public void unBlock() {
        synchronized (this) {
            LogUtil.a("AccountReader", "unBlock(AccountReader)");
            this.e = false;
        }
    }

    private void a(final UserInfoMedia.UserInfoReader.Callback callback) {
        synchronized (this) {
            if (this.e) {
                LogUtil.j("AccountReader", "sync block!!!");
                return;
            }
            LogUtil.a("AccountReader", " downloadUserInfo Entry");
            final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(new Handler(Looper.getMainLooper())) { // from class: com.huawei.featureuserprofile.media.account.AccountReader.3
                @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
                public void onFailed(int i) {
                    cwq.b(callback, i);
                }

                @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
                public void onSuccess(Map map) {
                    if (map.get("userInfomation") instanceof UserInfomation) {
                        cwq.d(callback, (UserInfomation) map.get("userInfomation"));
                    }
                }
            };
            asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: com.huawei.featureuserprofile.media.account.AccountReader.2
                @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
                public void execute(Map map) {
                    AccountReader.this.c(asyncSelectorSerialize);
                }
            });
            asyncSelectorSerialize.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AsyncSelectorSerialize asyncSelectorSerialize) {
        synchronized (this) {
            if (this.e) {
                LogUtil.j("AccountReader", "downloadUserInfoFromUp block!!!");
            } else {
                LogUtil.a("AccountReader", " downloadUserInfoFromUp Entry");
                b(asyncSelectorSerialize);
            }
        }
    }

    private void b(final AsyncSelectorSerialize asyncSelectorSerialize) {
        imz.b("AccountReader");
        ThirdPartyLoginManager.getInstance().m1459x26edc259(new IBaseResponseCallback() { // from class: com.huawei.featureuserprofile.media.account.AccountReader.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                UserInfomation userInfomation;
                ReleaseLogUtil.d("R_PersonalInfo_AccountReader", "queryUserInfo onResponse errorCode is ", Integer.valueOf(i));
                if (i == -1 || obj == null || !(obj instanceof HiUserInfo)) {
                    LogUtil.j("AccountReader", "queryUserInfo fail");
                    asyncSelectorSerialize.postError();
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) obj;
                if (UnitUtil.f()) {
                    userInfomation = new UserInfomation(1);
                } else {
                    userInfomation = new UserInfomation(0);
                }
                userInfomation.setPicPath(SharedPreferenceManager.e(AccountReader.this.f5607b, String.valueOf(PrebakedEffectId.RT_FLY), "key_user_pic_path"));
                userInfomation.loadAccountData(hiUserInfo);
                HashMap map = new HashMap();
                map.put("userInfomation", userInfomation);
                asyncSelectorSerialize.next(map);
            }
        }, false);
    }
}
