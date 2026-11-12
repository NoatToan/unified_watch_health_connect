package defpackage;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.featureuserprofile.account.data.IAccountDataMgr;
import com.huawei.featureuserprofile.common.IUserInfomationHandler;
import com.huawei.featureuserprofile.media.UserInfoMedia;
import com.huawei.featureuserprofile.util.AsyncSelectorSerialize;
import com.huawei.featureuserprofile.util.MessageHandler;
import com.huawei.featureuserprofile.util.RunnableEx;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes23.dex */
public class cuv implements IAccountDataMgr, IUserInfomationHandler {
    private static final Object d = new Object();
    private boolean g = false;
    private UserInfomation o = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f31335b = null;
    private Context e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UserInfoMedia.UserInfoReader f31336c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UserInfoMedia.UserInfoReader f31334a = null;
    private UserInfoMedia.UserInfoWriter f = null;
    private boolean h = false;
    private boolean i = false;
    private AtomicBoolean k = new AtomicBoolean(false);
    private AtomicBoolean j = new AtomicBoolean(false);
    private dac m = new dac();

    class d extends MessageHandler {
        d(Context context) {
            super(context, "AccountDataMgrByAllowLoginArea", cuv.this);
            addRunningMsg(5, new AnonymousClass3(cuv.this));
            addRunningMsg(8, new AnonymousClass1(cuv.this));
            addRunningMsg(9, null);
            addRunningMsg(6, new AnonymousClass2(cuv.this));
            addRunningMsg(7, new AnonymousClass5(cuv.this));
        }

        /* JADX INFO: renamed from: cuv$d$3, reason: invalid class name */
        class AnonymousClass3 extends RunnableEx {
            final /* synthetic */ cuv e;

            AnonymousClass3(cuv cuvVar) {
                this.e = cuvVar;
            }

            @Override // com.huawei.featureuserprofile.util.RunnableEx
            public void run(Message message) {
                if (cuv.this.k.get()) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "isSyncing");
                } else {
                    ThreadPoolManager.c().b("AccountDataMgrByAllowLoginArea", new Runnable() { // from class: cut
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f31332b.a();
                        }
                    });
                }
            }

            /* synthetic */ void a() {
                cuv.this.d();
            }
        }

        /* JADX INFO: renamed from: cuv$d$1, reason: invalid class name */
        class AnonymousClass1 extends RunnableEx {
            final /* synthetic */ cuv d;

            AnonymousClass1(cuv cuvVar) {
                this.d = cuvVar;
            }

            /* synthetic */ void c() {
                cuv.this.c();
            }

            @Override // com.huawei.featureuserprofile.util.RunnableEx
            public void run(Message message) {
                ThreadPoolManager.c().b("AccountDataMgrByAllowLoginArea", new Runnable() { // from class: cuw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c();
                    }
                });
            }
        }

        /* JADX INFO: renamed from: cuv$d$2, reason: invalid class name */
        class AnonymousClass2 extends RunnableEx {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ cuv f31355a;

            AnonymousClass2(cuv cuvVar) {
                this.f31355a = cuvVar;
            }

            @Override // com.huawei.featureuserprofile.util.RunnableEx
            public void run(Message message) {
                final int iIntValue = ((Integer) message.obj).intValue();
                ThreadPoolManager.c().b("AccountDataMgrByAllowLoginArea", new Runnable() { // from class: cux
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(iIntValue);
                    }
                });
            }

            /* synthetic */ void b(int i) {
                UserInfomation userInfomation;
                cuv.this.k.set(false);
                synchronized (cuv.d) {
                    userInfomation = cuv.this.o;
                }
                cuv.this.m.c(i, userInfomation);
            }
        }

        /* JADX INFO: renamed from: cuv$d$5, reason: invalid class name */
        class AnonymousClass5 extends RunnableEx {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ cuv f31359c;

            AnonymousClass5(cuv cuvVar) {
                this.f31359c = cuvVar;
            }

            @Override // com.huawei.featureuserprofile.util.RunnableEx
            public void run(Message message) {
                final UserInfoMedia.UserInfoReader.Callback callback = (UserInfoMedia.UserInfoReader.Callback) message.obj;
                ThreadPoolManager.c().b("AccountDataMgrByAllowLoginArea", new Runnable() { // from class: cuu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c(callback);
                    }
                });
            }

            /* synthetic */ void c(UserInfoMedia.UserInfoReader.Callback callback) {
                cuv.this.m.b(callback);
            }
        }
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void init(Context context) {
        LogUtil.d("AccountDataMgrByAllowLoginArea", "init");
        d dVar = new d(context);
        this.f31335b = dVar;
        dVar.init(context);
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processInit(Message message) {
        if (message == null) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "processInit msg is null");
            return;
        }
        LogUtil.a("AccountDataMgrByAllowLoginArea", "processInit what:", Integer.valueOf(message.what));
        this.g = LoginInit.getInstance(this.e).isLoginedByWear();
        UserInfomation userInfomation = new UserInfomation();
        this.o = userInfomation;
        userInfomation.setPicPath("default");
        if (message.obj instanceof Context) {
            Context context = (Context) message.obj;
            this.e = context;
            this.f31336c = cwo.c(context).obtainReader();
            this.f31334a = cwn.c(context).obtainReader();
            this.f = cwn.c(context).a(1);
            this.f31336c.unBlock();
            this.f31334a.unBlock();
            this.f.unBlock();
        }
        final int i = message.what;
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31335b) { // from class: cuv.1
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "processInit end onFailed");
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PEOPLE_INFORMATION_INIT_85070024.value(), -1);
                cuv.this.f31335b.postResult(i, -1);
                cuv.this.f31335b.obtainMessage(5).sendToTarget();
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "processInit end onSuccess");
                cuv.this.h = true;
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PEOPLE_INFORMATION_INIT_85070024.value(), 0);
                cuv.this.f31335b.postResult(i, 0);
                cuv.this.f31335b.obtainMessage(5).sendToTarget();
            }
        };
        b(asyncSelectorSerialize);
        asyncSelectorSerialize.run();
    }

    private void b(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.7
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cuv.this.f31334a.read(new UserInfoMedia.UserInfoReader.Callback() { // from class: cuv.7.4
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onSuccess(UserInfomation userInfomation) {
                        HashMap map2 = new HashMap();
                        if (userInfomation == null) {
                            LogUtil.j("AccountDataMgrByAllowLoginArea", "addProcessInitAction init from HiHealth error,obj null");
                            asyncSelectorSerialize.postError();
                        } else {
                            LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessInitAction init from HiHealth success:", userInfomation.toString());
                            map2.put("userInfo", userInfomation);
                            asyncSelectorSerialize.next(map2);
                        }
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onFail(int i) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessInitAction init from HiHealth failed:", Integer.valueOf(i));
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.8
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    LogUtil.j("AccountDataMgrByAllowLoginArea", "addProcessInitAction write memory error arg null");
                    asyncSelectorSerialize.postError();
                    return;
                }
                UserInfomation userInfomation = (UserInfomation) map.get("userInfo");
                if (userInfomation != null) {
                    synchronized (cuv.d) {
                        cuv.this.o.loadAccountData(userInfomation);
                        LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessInitAction write memory success(refresh):", cuv.this.o.toString());
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
        if (this.f31335b == null) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "checkInit mHandler is null.");
            return false;
        }
        LogUtil.a("AccountDataMgrByAllowLoginArea", "checkInit mHandler is not null.");
        return this.f31335b.checkInit();
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void refreshAccountDataCache(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "refreshAccountDataCache userInfo is null");
            return;
        }
        synchronized (d) {
            UserInfomation userInfomation2 = this.o;
            if (userInfomation2 == null) {
                this.o = userInfomation.copyFrom();
            } else {
                userInfomation2.loadAccountData(userInfomation);
            }
        }
        LogUtil.a("AccountDataMgrByAllowLoginArea", "refreshAccountDataCache end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        UserInfomation userInfomationCopyFrom;
        if (this.g) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "k scence read account error");
            return;
        }
        this.k.set(true);
        synchronized (d) {
            userInfomationCopyFrom = this.o.copyFrom();
        }
        AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31335b) { // from class: cuv.9
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i) {
                ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "processSync onFail or data no change");
                cuv.this.f31335b.obtainMessage(6, -1).sendToTarget();
                cuv.this.f31335b.obtainMessage(8).sendToTarget();
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "processSync onSuccess");
                cuv.this.i = true;
                cuv.this.f31335b.obtainMessage(6, 0).sendToTarget();
                cuv.this.f31335b.obtainMessage(8).sendToTarget();
                dab.d(cuv.this.e, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED");
            }
        };
        LoginInit.getInstance(this.e);
        boolean zShouldLogin = LoginInit.shouldLogin();
        LogUtil.a("AccountDataMgrByAllowLoginArea", "shouldLogin: ", Boolean.valueOf(zShouldLogin));
        if (!CommonUtil.ca() && zShouldLogin) {
            d(asyncSelectorSerialize);
        }
        a(asyncSelectorSerialize);
        e(userInfomationCopyFrom, asyncSelectorSerialize);
        asyncSelectorSerialize.run();
    }

    private void d(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.6
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                cuv.this.f31336c.read(new UserInfoMedia.UserInfoReader.Callback() { // from class: cuv.6.1
                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onSuccess(UserInfomation userInfomation) {
                        ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessReadAction AccountReader read onSuccess");
                        if (userInfomation != null) {
                            LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessReadAction AccountReader read:", userInfomation.toString());
                        }
                        HashMap map2 = new HashMap();
                        map2.put("userInfo", userInfomation);
                        asyncSelectorSerialize.next(map2);
                    }

                    @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoReader.Callback
                    public void onFail(int i) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessReadAction AccountReader read onFail");
                        asyncSelectorSerialize.postError();
                    }
                });
            }
        });
    }

    private void e(final UserInfomation userInfomation, final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.10
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                UserInfomation userInfomationCopyFrom;
                if (map == null) {
                    ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessHeadImageSyncAction arg is null");
                    asyncSelectorSerialize.postError();
                    return;
                }
                UserInfomation userInfomation2 = (UserInfomation) map.get("userInfo");
                synchronized (cuv.d) {
                    if (TextUtils.isEmpty(userInfomation2.getPortraitUrl())) {
                        cuv.this.o.setPortraitUrl("");
                        czz.b("");
                    }
                    cuv.this.o.loadAccountData(userInfomation2);
                    userInfomationCopyFrom = cuv.this.o.copyFrom();
                    LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessHeadImageSyncAction write memory success(refresh):", cuv.this.o.toString());
                }
                if (cuv.this.c(userInfomation, userInfomationCopyFrom)) {
                    cuv.this.i = true;
                    ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessHeadImageSyncAction isAccountDataEquals");
                    asyncSelectorSerialize.postError();
                    return;
                }
                asyncSelectorSerialize.next(null);
            }
        });
    }

    private void a(final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.11
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map == null) {
                    ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "addProcessGenderSyncAction arg is null");
                    asyncSelectorSerialize.postError();
                    return;
                }
                if (map.get("userInfo") instanceof UserInfomation) {
                    final UserInfomation userInfomation = (UserInfomation) map.get("userInfo");
                    synchronized (cuv.d) {
                        cuv.this.o.setBirthdayStatus(userInfomation.getBirthdayStatus());
                        LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessGenderSyncAction write memory success(refresh) only birthdayStatus:", cuv.this.o.getBirthdayStatus());
                    }
                    if (userInfomation.getGender() == -1) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "account's gender is unknown, try to use hihealth gender");
                        synchronized (cuv.d) {
                            userInfomation.setGender(Integer.valueOf(cuv.this.o.getGender()));
                        }
                    }
                    cuv.this.f.write(userInfomation, new UserInfoMedia.UserInfoWriter.Callback() { // from class: cuv.11.5
                        @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                        public void onSuccess() {
                            LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessGenderSyncAction write hihealth success:", userInfomation.toString());
                            HashMap map2 = new HashMap();
                            map2.put("userInfo", userInfomation);
                            asyncSelectorSerialize.next(map2);
                        }

                        @Override // com.huawei.featureuserprofile.media.UserInfoMedia.UserInfoWriter.Callback
                        public void onFail(int i) {
                            LogUtil.d("AccountDataMgrByAllowLoginArea", "addProcessGenderSyncAction write hihealth fail:", userInfomation.toString());
                            asyncSelectorSerialize.postError();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(UserInfomation userInfomation, UserInfomation userInfomation2) {
        if (userInfomation == null && userInfomation2 == null) {
            LogUtil.a("AccountDataMgrByAllowLoginArea", "userInfo1 and userInfo2 null,equals");
            return true;
        }
        if (userInfomation == null || userInfomation2 == null) {
            LogUtil.a("AccountDataMgrByAllowLoginArea", "userInfo1 or userInfo2 null,no equals");
            return false;
        }
        boolean zEquals = TextUtils.equals(userInfomation.getName(), userInfomation2.getName());
        if (!TextUtils.equals(userInfomation.getLanguageCode(), userInfomation2.getLanguageCode())) {
            zEquals = false;
        }
        if (!TextUtils.equals(userInfomation.getBirthday(), userInfomation2.getBirthday())) {
            zEquals = false;
        }
        if (userInfomation.getGender() != userInfomation2.getGender()) {
            zEquals = false;
        }
        if (TextUtils.equals(userInfomation.getPortraitUrl(), userInfomation2.getPortraitUrl())) {
            return zEquals;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String portraitUrl;
        synchronized (d) {
            portraitUrl = this.o.getPortraitUrl();
        }
        if (TextUtils.isEmpty(portraitUrl)) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "userInfo portraitUrl empty,force default");
            return;
        }
        if (czz.e(portraitUrl)) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "userInfo picPath validate,return");
            this.f31335b.obtainMessage(9, -1).sendToTarget();
        } else {
            AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31335b) { // from class: cuv.12
                @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
                public void onFailed(int i) {
                    cuv.this.f31335b.obtainMessage(9, -1).sendToTarget();
                }

                @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
                public void onSuccess(Map map) {
                    cuv.this.f31335b.obtainMessage(9, 0).sendToTarget();
                }
            };
            a(portraitUrl, asyncSelectorSerialize);
            asyncSelectorSerialize.run();
        }
    }

    private void a(final String str, final AsyncSelectorSerialize asyncSelectorSerialize) {
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.14
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                czz.b(cuv.this.e, str, new BaseResponseCallback<String>() { // from class: cuv.14.2
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onResponse(int i, String str2) {
                        if (i != 0) {
                            asyncSelectorSerialize.postError();
                            return;
                        }
                        czz.a(str);
                        czz.b(str2);
                        HashMap map2 = new HashMap();
                        map2.put("newPath", str2);
                        LogUtil.a("AccountDataMgrByAllowLoginArea", "downloadHeadPic newPath:", str2);
                        asyncSelectorSerialize.next(map2);
                    }
                });
            }
        });
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.2
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (map.get("newPath") instanceof String) {
                    String str2 = (String) map.get("newPath");
                    synchronized (cuv.d) {
                        cuv.this.o.setPicPath(str2);
                        LogUtil.d("AccountDataMgrByAllowLoginArea", "addHeadPicAsyncSelectorSerializeAction write memory(refresh):", cuv.this.o.toString());
                    }
                }
                asyncSelectorSerialize.next(null);
            }
        });
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public UserInfomation getUserInfo() {
        UserInfomation userInfomation;
        b();
        synchronized (d) {
            userInfomation = this.o;
        }
        return userInfomation;
    }

    private void b() {
        if (this.h) {
            if (this.g || CommonUtil.ca() || this.i) {
                LogUtil.a("AccountDataMgrByAllowLoginArea", "mIsSyncSuccess: ", Boolean.valueOf(this.i));
                return;
            } else {
                if (this.k.get()) {
                    return;
                }
                ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "checkInitRetry need sync account data");
                sync();
                imz.b("AccountDataMgrByAllowLoginArea");
                return;
            }
        }
        d dVar = this.f31335b;
        if (dVar != null && dVar.checkInit() && this.j.compareAndSet(false, true)) {
            ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "checkInitRetry need init account data");
            HiHealthNativeApi.a(this.e).fetchUserData(new HiCommonListener() { // from class: cuv.3
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i, Object obj) {
                    cuv.this.j.set(false);
                    if (obj == null) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "checkInitRetry data is null");
                        return;
                    }
                    ArrayList arrayList = (ArrayList) obj;
                    if (njy.e(arrayList)) {
                        ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "checkInitRetry hiUserList isEmpty");
                        return;
                    }
                    HiUserInfo hiUserInfo = (HiUserInfo) arrayList.get(0);
                    synchronized (cuv.d) {
                        cuv.this.o.loadAccountData(hiUserInfo);
                        if (TextUtils.isEmpty(cuv.this.o.getPicPath()) || "default".equals(cuv.this.o.getPicPath())) {
                            cuv.this.o.setPicPath(czz.a());
                        }
                    }
                    cuv.this.h = true;
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i, Object obj) {
                    ReleaseLogUtil.e("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "checkInitRetry onFailure errorCode:", Integer.valueOf(i), " errorMessage:", obj);
                    cuv.this.j.set(false);
                }
            });
        }
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync(UserInfoMedia.UserInfoReader.Callback callback) {
        if (callback == null) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "not allow get data by account with no callback");
        } else {
            if (this.g) {
                LogUtil.j("AccountDataMgrByAllowLoginArea", "k scence read account error");
                return;
            }
            LogUtil.a("AccountDataMgrByAllowLoginArea", "Synchronizing Account Information");
            this.f31335b.obtainMessage(5).sendToTarget();
            this.f31335b.obtainMessage(7, callback).sendToTarget();
        }
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void sync() {
        if (this.g) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "k scence read account error");
        } else {
            LogUtil.a("AccountDataMgrByAllowLoginArea", "Synchronize with the account cloud");
            this.f31335b.obtainMessage(5).sendToTarget();
        }
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void setUserInfo(UserInfomation userInfomation, UserInfoMedia.UserInfoWriter.Callback callback) {
        ReleaseLogUtil.d("R_PersonalInfo_AccountDataMgrByAllowLoginArea", "setUserInfo enter isInitSuccess = ", Boolean.valueOf(this.h), ", accountInfo isSyncSuccess = ", Boolean.valueOf(this.i));
        d dVar = this.f31335b;
        if (dVar == null) {
            return;
        }
        dVar.setUserInfo(userInfomation, callback);
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processModifyUserInfo(Message message, final UserInfomation userInfomation, final UserInfoMedia.UserInfoWriter.Callback callback) {
        if (message == null) {
            LogUtil.j("AccountDataMgrByAllowLoginArea", "processModifyUserInfo msg is null");
            return;
        }
        final int i = message.what;
        final AsyncSelectorSerialize asyncSelectorSerialize = new AsyncSelectorSerialize(this.f31335b) { // from class: cuv.5
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onFailed(int i2) {
                LogUtil.j("AccountDataMgrByAllowLoginArea", "processModifyUserInfo onFailed (AccountDataMgrByAllowLoginArea)");
                cuv.this.f31335b.postResult(i, -1);
                cwq.c(callback, -1);
            }

            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize
            public void onSuccess(Map map) {
                LogUtil.a("AccountDataMgrByAllowLoginArea", "processModifyUserInfo onSuccess");
                cuv.this.f31335b.postResult(i, 0);
                cwq.b(callback);
            }
        };
        asyncSelectorSerialize.add(new AsyncSelectorSerialize.BaseAction() { // from class: cuv.4
            @Override // com.huawei.featureuserprofile.util.AsyncSelectorSerialize.BaseAction, com.huawei.featureuserprofile.util.AsyncSelectorSerialize.Action
            public void execute(Map map) {
                if (cuv.this.o != null) {
                    synchronized (cuv.d) {
                        cuv.this.o.loadAccountData(userInfomation);
                        LogUtil.d("AccountDataMgrByAllowLoginArea", "processModifyUserInfo write memory success(refresh):", cuv.this.o.toString());
                    }
                    asyncSelectorSerialize.next(null);
                    return;
                }
                LogUtil.j("AccountDataMgrByAllowLoginArea", "processModifyUserInfo mUserInfomation is null.");
            }
        });
        asyncSelectorSerialize.run();
    }

    @Override // com.huawei.featureuserprofile.account.data.IAccountDataMgr
    public void destroy() {
        LogUtil.j("AccountDataMgrByAllowLoginArea", "destroy to enter");
    }

    @Override // com.huawei.featureuserprofile.common.IUserInfomationHandler
    public void processDestroy() {
        this.m.d();
        for (int i = 5; i < 10; i++) {
            this.f31335b.removeMessages(i);
        }
    }
}
