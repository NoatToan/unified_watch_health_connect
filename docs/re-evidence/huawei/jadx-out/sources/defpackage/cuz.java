package defpackage;

import android.content.Context;
import android.os.Message;
import com.huawei.featureuserprofile.account.data.IAccountDataMgr;
import com.huawei.featureuserprofile.common.IUserInfomationHandler;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.util.AsyncSelectorSerialize;
import com.huawei.featureuserprofile.util.MessageHandler;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class cuz implements IAccountDataMgr, IUserInfomationHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f31361c = new Object();
    private a e = null;
    private UserInfomation j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UserInfoMedia.UserInfoReader f31362a = null;
    private UserInfoMedia.UserInfoWriter d = null;
    private boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31363b = null;
    private AtomicBoolean i = new AtomicBoolean(false);

    class a extends MessageHandler {
        a(Context context) {
            super(context, "AccountDataMgrByNotAllowLoginArea", cuz.this);
        }
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void init(Context context) {
        a aVar = new a(context);
        this.e = aVar;
        aVar.init(context);
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processInit(Message message) {
        if (message == null) {
            LogUtil.j("AccountDataMgrByNotAllowLoginArea", "processInit msg is null");
            return;
        }
        this.f31363b = (Context) message.obj;
        if (UnitUtil.f()) {
            this.j = new UserInfomation(1);
        } else {
            this.j = new UserInfomation(0);
        }
        this.f31362a = cwn.c(this.f31363b).obtainReader();
        this.d = cwn.c(this.f31363b).a(1);
        this.f31362a.unBlock();
        this.d.unBlock();
        final int i = message.what;
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.e) { // from class: cuz.3
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "processInit(AccountDataMgrByNotAllowLoginArea) end onFailed");
                cuz.this.e.postResult(i, -1);
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "processInit(AccountDataMgrByNotAllowLoginArea) end onSuccess");
                cuz.this.g = true;
                cuz.this.e.postResult(i, 0);
            }
        };
        b(asyncSelectorSerialize);
        asyncSelectorSerialize.run();
    }

    private void b(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuz.1
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cuz.this.f31362a.read(new UserInfoMedia.UserInfoReader.Callback() { // from class: cuz.1.5
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onSuccess(UserInfomation userInfomation) {
                        HashMap map2 = new HashMap();
                        if (userInfomation == null) {
                            ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "UserInfoReader read in init success (AccountDataMgrByNotAllowLoginArea) ,obj null");
                            asyncSelectorSerialize.next(null);
                        } else {
                            map2.put("userInfo", userInfomation);
                            asyncSelectorSerialize.next(map2);
                        }
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onFail(int i) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "MSG_INIT_DATA_FROM_HIHEALTH Fail:", Integer.valueOf(i));
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuz.4
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    LogUtil.j("AccountDataMgrByNotAllowLoginArea", "addAsyncSelectorSerializeAct write memory error arg null (AccountDataMgrByNotAllowLoginArea)");
                    asyncSelectorSerialize.postError();
                    return;
                }
                UserInfomation userInfomation = map.get("userInfo") instanceof UserInfomation ? (UserInfomation) map.get("userInfo") : null;
                if (userInfomation != null) {
                    synchronized (cuz.f31361c) {
                        cuz.this.j.loadAccountData(userInfomation);
                        LogUtil.d("AccountDataMgrByNotAllowLoginArea", "addAsyncSelectorSerializeAct write memory(refresh):", cuz.this.j.toString());
                    }
                    asyncSelectorSerialize.next(null);
                    return;
                }
                asyncSelectorSerialize.postError();
            }
        });
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public boolean checkInit() {
        a aVar = this.e;
        if (aVar == null) {
            LogUtil.j("AccountDataMgrByNotAllowLoginArea", "checkInit mHandler is null.");
            return false;
        }
        return aVar.checkInit();
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public UserInfomation getUserInfo() {
        UserInfomation userInfomation;
        a();
        synchronized (f31361c) {
            userInfomation = this.j;
        }
        return userInfomation;
    }

    private void a() {
        a aVar;
        if (this.g || (aVar = this.e) == null || !aVar.checkInit() || !this.i.compareAndSet(false, true)) {
            return;
        }
        ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "checkInitRetry need init account data");
        HiHealthNativeApi.a(this.f31363b).fetchUserData(new HiCommonListener() { // from class: cuz.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                cuz.this.i.set(false);
                if (obj == null) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "checkInitRetry data is null");
                    return;
                }
                ArrayList arrayList = (ArrayList) obj;
                if (njy.e(arrayList)) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "checkInitRetry hiUserList isEmpty");
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) arrayList.get(0);
                synchronized (cuz.f31361c) {
                    cuz.this.j.loadAccountData(hiUserInfo);
                    cuz.this.j.setPicPath(czz.a());
                }
                cuz.this.g = true;
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "checkInitRetry onFailure errorCode:", Integer.valueOf(i), " errorMessage:", obj);
                cuz.this.i.set(false);
            }
        });
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void refreshAccountDataCache(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("AccountDataMgrByNotAllowLoginArea", "refreshAccountDataCache userInfo is null");
            return;
        }
        synchronized (f31361c) {
            UserInfomation userInfomation2 = this.j;
            if (userInfomation2 == null) {
                this.j = userInfomation.copyFrom();
            } else {
                userInfomation2.loadAccountData(userInfomation);
            }
        }
        LogUtil.a("AccountDataMgrByNotAllowLoginArea", "refreshAccountDataCache end");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void setUserInfo(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByNotAllowLoginArea", "setUserInfo enter isInitSuccess = ", Boolean.valueOf(this.g));
        this.e.setUserInfo(userInfomation, callback);
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync() {
        LogUtil.j("AccountDataMgrByNotAllowLoginArea", "sync():", "NotAllowLoginArea cant sync with Account");
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync(UserInfoMedia.UserInfoReader.Callback callback) {
        LogUtil.j("AccountDataMgrByNotAllowLoginArea", "sync(UserInfoMedia.UserInfoReader.Callback callback):", "NotAllowLoginArea cant sync with Account");
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processModifyUserInfo(Message message, final UserInfomation userInfomation, final UserInfoMedia.UserInfoWriter.Callback callback) {
        if (message == null) {
            LogUtil.j("AccountDataMgrByNotAllowLoginArea", "processModifyUserInfo msg is null");
            return;
        }
        final int i = message.what;
        final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.e) { // from class: cuz.2
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                cuz.this.e.postResult(i, -1);
                cwq.c(callback, -1);
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                cuz.this.e.postResult(i, 0);
                cwq.b(callback);
            }
        };
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuz.8
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cuz.this.d.write(userInfomation, new UserInfoMedia.UserInfoWriter.Callback() { // from class: cuz.8.5
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onSuccess() {
                        LogUtil.d("AccountDataMgrByNotAllowLoginArea", "processModifyUserInfo write hihealth success:", userInfomation.toString());
                        asyncSelectorSerialize.next(null);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onFail(int i2) {
                        LogUtil.d("AccountDataMgrByNotAllowLoginArea", "processModifyUserInfo write hihealth fail:", userInfomation.toString());
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuz.10
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                UserInfomation userInfomation2 = userInfomation;
                synchronized (cuz.f31361c) {
                    cuz.this.j.loadAccountData(userInfomation2);
                    LogUtil.d("AccountDataMgrByNotAllowLoginArea", "processModifyUserInfo write memory(refresh):", cuz.this.j.toString());
                }
                asyncSelectorSerialize.next(null);
            }
        });
        asyncSelectorSerialize.run();
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void destroy() {
        LogUtil.j("AccountDataMgrByNotAllowLoginArea", "destroy to enter");
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processDestroy() {
        LogUtil.a("AccountDataMgrByNotAllowLoginArea", "processDestroy");
    }
}
