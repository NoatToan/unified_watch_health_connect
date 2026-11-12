package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr;
import com.huawei.featureuserprofile.common.IUserInfomationHandler;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.util.AsyncSelectorSerialize;
import com.huawei.featureuserprofile.util.MessageHandler;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.model.UserInfomation;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class cvb implements IAccountDataExtMgr, IUserInfomationHandler {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f31377a = null;
    private UserInfomation f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UserInfoMedia.UserInfoReader f31379c = null;
    private UserInfoMedia.UserInfoWriter g = null;
    private boolean i = false;
    private AtomicBoolean h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f31378b = new BroadcastReceiver() { // from class: cvb.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            cvb.this.f31377a.post(new Runnable() { // from class: cvb.2.5
                @Override // java.lang.Runnable
                public void run() {
                    e(intent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("AccountDataExtMgr", "onReceive hiHealthCloudSyncReceiver action is null");
                return;
            }
            LogUtil.a("AccountDataExtMgr", "onReceive hiHealthCloudSyncReceiver: ", action);
            if ("com.huawei.hihealth.action_sync".equals(action)) {
                if (intent.getIntExtra("com.huawei.hihealth.action_sync_status", -1) != 2) {
                    return;
                } else {
                    qra.c(true);
                }
            } else if ("com.huawei.hihealth.action_data_refresh".equals(action)) {
                if (intent.getIntExtra("refresh_type", -1) != 5) {
                    return;
                }
            } else {
                if (!"com.huawei.hihealth.action_sync_data".equals(action)) {
                    return;
                }
                int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_type", -1);
                int intExtra2 = intent.getIntExtra("com.huawei.hihealth.action_sync_status", -1);
                LogUtil.a("AccountDataExtMgr", "receive HiBroadcastAction.ACTION_SYNC_DATA type: ", Integer.valueOf(intExtra), " status: ", Integer.valueOf(intExtra2));
                if (intExtra == 10028 && intExtra2 == 2) {
                    qra.c(true);
                }
            }
            cvb.this.e(cvb.this.d());
        }
    };
    private Context e = null;

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void destroy(Context context) {
    }

    class b extends MessageHandler {
        b(Context context) {
            super(context, "AccountDataExtMgr", cvb.this);
        }
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void init(Context context) {
        b bVar = new b(context);
        this.f31377a = bVar;
        bVar.init(context);
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processInit(Message message) {
        if (message == null) {
            LogUtil.j("AccountDataExtMgr", "processInit msg is null");
            return;
        }
        this.e = (Context) message.obj;
        this.f = new UserInfomation();
        this.f31379c = cwn.c(this.e).obtainReader();
        this.g = cwn.c(this.e).a(2);
        this.f31379c.unBlock();
        this.g.unBlock();
        IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_sync_data");
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        BroadcastManagerUtil.d(this.e, this.f31378b, intentFilter, "com.huawei.hihealth.DEFAULT_PERMISSION", null);
        final int i = message.what;
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31377a) { // from class: cvb.1
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataExtMgr", "processInit AccountDataExtMgr end onFailed");
                if (i2 != 1) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PEOPLE_INFORMATION_INIT_85070024.value(), -1);
                }
                cvb.this.f31377a.postResult(i, -1);
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataExtMgr", "processInit AccountDataExtMgr end onSuccess");
                cvb.this.i = true;
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PEOPLE_INFORMATION_INIT_85070024.value(), 0);
                cvb.this.f31377a.postResult(i, 0);
            }
        };
        c(asyncSelectorSerialize);
        e(asyncSelectorSerialize);
    }

    private void c(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.4
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cvb.this.f31379c.read(new UserInfoMedia.UserInfoReader.Callback() { // from class: cvb.4.2
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onSuccess(UserInfomation userInfomation) {
                        HashMap map2 = new HashMap();
                        if (userInfomation == null) {
                            ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "UserInfoReader read in init success AccountDataExtMgr,obj null");
                            asyncSelectorSerialize.postError();
                        } else {
                            map2.put("userInfo", userInfomation);
                            asyncSelectorSerialize.next(map2);
                        }
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onFail(int i) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "MSG_INIT_DATA_FROM_HIHEALTH Fail: ", Integer.valueOf(i));
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public boolean checkInit() {
        return this.f31377a.checkInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AsyncSelectorSerialize d() {
        final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31377a) { // from class: cvb.6
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i) {
                LogUtil.j("AccountDataExtMgr", "ACTION_SYNC_DATA actions FAIL or data not change");
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                LogUtil.j("AccountDataExtMgr", "ACTION_SYNC_DATA actions SUCCESS");
                dab.d(cvb.this.e, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED");
            }
        };
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.10
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cvb.this.f31379c.read(new UserInfoMedia.UserInfoReader.Callback() { // from class: cvb.10.4
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onSuccess(UserInfomation userInfomation) {
                        if (userInfomation == null) {
                            LogUtil.j("AccountDataExtMgr", "UserInfoReader read in init success, obj null");
                            asyncSelectorSerialize.postError();
                            return;
                        }
                        ReleaseLogUtil.d("R_PersonalInfo_AccountDataExtMgr", "CloudSync read hihealth : success");
                        cup.c(cvb.this.e).e(userInfomation);
                        HashMap map2 = new HashMap(16);
                        map2.put("userInfo", userInfomation);
                        asyncSelectorSerialize.next(map2);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onFail(int i) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "ACTION_SYNC_DATA get data Fail: ", Integer.valueOf(i));
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
        return asyncSelectorSerialize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.8
            int d = -1;

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    LogUtil.j("AccountDataExtMgr", "processCloudSync write memory error map null AccountDataExtMgr");
                    asyncSelectorSerialize.postError();
                    return;
                }
                UserInfomation userInfomation = map.get("userInfo") instanceof UserInfomation ? (UserInfomation) map.get("userInfo") : null;
                if (userInfomation != null) {
                    synchronized (cvb.d) {
                        cvb cvbVar = cvb.this;
                        if (!cvbVar.a(cvbVar.f, userInfomation)) {
                            cvb.this.f.loadAccountExtData(userInfomation);
                            LogUtil.a("AccountDataExtMgr", "processCloudSync write memory success refresh");
                            asyncSelectorSerialize.next(null);
                            return;
                        } else {
                            this.d = 1;
                            asyncSelectorSerialize.postError();
                            return;
                        }
                    }
                }
                asyncSelectorSerialize.postError();
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public int getFailedValue() {
                return this.d;
            }
        });
        asyncSelectorSerialize.run();
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public UserInfomation getUserInfo() {
        UserInfomation userInfomation;
        e();
        synchronized (d) {
            userInfomation = this.f;
        }
        return userInfomation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(UserInfomation userInfomation, UserInfomation userInfomation2) {
        return userInfomation.getHeight() == userInfomation2.getHeight() && userInfomation.getWeight() == userInfomation2.getWeight();
    }

    private void e() {
        b bVar;
        if (this.i || (bVar = this.f31377a) == null || !bVar.checkInit() || !this.h.compareAndSet(false, true)) {
            return;
        }
        ReleaseLogUtil.d("R_PersonalInfo_AccountDataExtMgr", "checkInitRetry need init account extend data");
        HiHealthNativeApi.a(this.e).fetchUserData(new HiCommonListener() { // from class: cvb.9
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                cvb.this.h.set(false);
                if (obj == null) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "checkInitRetry data is null");
                    return;
                }
                ArrayList arrayList = (ArrayList) obj;
                if (njy.e(arrayList)) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "checkInitRetry hiUserList isEmpty");
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) arrayList.get(0);
                synchronized (cvb.d) {
                    cvb.this.f.loadAccountExtData(hiUserInfo);
                    cvb.this.f.transSelf2METRIC();
                }
                cvb.this.i = true;
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                ReleaseLogUtil.e("R_PersonalInfo_AccountDataExtMgr", "checkInitRetry onFailure errorCode: ", Integer.valueOf(i), " errorMessage: ", obj);
                cvb.this.h.set(false);
            }
        });
    }

    @Override // com.huawei.featureuserprofile.account.ext.IAccountDataExtMgr
    public void setUserInfo(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        ReleaseLogUtil.d("R_PersonalInfo_AccountDataExtMgr", "setUserInfo enter isInitSuccess: ", Boolean.valueOf(this.i));
        b bVar = this.f31377a;
        if (bVar != null) {
            bVar.setUserInfo(userInfomation, callback);
        } else {
            LogUtil.j("AccountDataExtMgr", "setUserInfo error: AccountDataExtMgr.MyHandler is null");
            cwq.c(callback, -1);
        }
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processModifyUserInfo(Message message, final UserInfomation userInfomation, final UserInfoMedia.UserInfoWriter.Callback callback) {
        LogUtil.a("AccountDataExtMgr", "enter processModifyUserInfo");
        final int i = message.what;
        userInfomation.transSelf2METRIC();
        final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31377a) { // from class: cvb.7
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                LogUtil.j("AccountDataExtMgr", "processModifyUserInfo onFailed AccountDataExtMgr");
                cvb.this.f31377a.postResult(i, -1);
                cwq.c(callback, -1);
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                LogUtil.a("AccountDataExtMgr", "processModifyUserInfo onSuccess");
                cvb.this.f31377a.postResult(i, 0);
                cwq.b(callback);
            }
        };
        e(userInfomation, asyncSelectorSerialize);
        d(userInfomation, asyncSelectorSerialize);
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.15
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                UserInfomation userInfomation2 = userInfomation;
                synchronized (cvb.d) {
                    cvb.this.f.loadAccountExtData(userInfomation2);
                }
                asyncSelectorSerialize.next(null);
            }
        });
        asyncSelectorSerialize.run();
    }

    private void d(final UserInfomation userInfomation, final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.3
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                HiHealthNativeApi.a(cvb.this.e).fetchUserData(new HiCommonListener() { // from class: cvb.3.1
                    @Override // com.huawei.hihealth.data.listener.HiCommonListener
                    public void onSuccess(int i, Object obj) {
                        LogUtil.a("AccountDataExtMgr", "addFetchUserInfoAct fetchUserData onSuccess data == null is ", Boolean.valueOf(obj == null));
                        if (obj == null) {
                            asyncSelectorSerialize.postError();
                            return;
                        }
                        try {
                            List list = (List) obj;
                            if (list.size() <= 0) {
                                LogUtil.e("AccountDataExtMgr", "addFetchUserInfoAct userInfo is null");
                                asyncSelectorSerialize.postError();
                            } else {
                                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                                userInfomation.setSetTime(hiUserInfo.getCreateTime());
                                LogUtil.a("AccountDataExtMgr", "addFetchUserInfoAct setTime = ", Long.valueOf(hiUserInfo.getCreateTime()));
                                asyncSelectorSerialize.next(null);
                            }
                        } catch (ClassCastException unused) {
                            LogUtil.e("AccountDataExtMgr", "addFetchUserInfoAct fetchUserData data ClassCastException");
                            asyncSelectorSerialize.postError();
                        }
                    }

                    @Override // com.huawei.hihealth.data.listener.HiCommonListener
                    public void onFailure(int i, Object obj) {
                        LogUtil.a("AccountDataExtMgr", "addFetchUserInfoAct fetchUserData onFailure");
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
    }

    private void e(final UserInfomation userInfomation, final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cvb.5
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cvb.this.g.write(userInfomation, new UserInfoMedia.UserInfoWriter.Callback() { // from class: cvb.5.1
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onSuccess() {
                        LogUtil.a("AccountDataExtMgr", "addUserInfoWriteAct write hihealth success");
                        asyncSelectorSerialize.next(null);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                    public void onFail(int i) {
                        LogUtil.j("AccountDataExtMgr", "addUserInfoWriteAct write hihealth failed");
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processDestroy() {
        this.e.unregisterReceiver(this.f31378b);
    }
}
