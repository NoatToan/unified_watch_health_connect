package com.huami.account;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.auth.repository.LastLoginInfoRepository;
import com.huami.account.bean.LoginResult;
import com.huami.account.constants.LoginType;
import com.huami.account.di.LifecycleModuleKt;
import com.huami.account.event.EventAccountStatus;
import com.huami.account.keeper.AnonymousKeeper;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.UserInfoService;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.LoginStateType;
import com.huami.account.ui.BindPhoneForLoginActivity;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.usecase.LoginSuccessUseCase;
import com.huami.account.usecase.UpdateUserDataBeginTimeUseCase;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.BindAccount;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.keeper.HMWebKeeper;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import de.greenrobot.event.EventBus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
public class HMProcessLoginDataManager {
    public static final String ACCOUNT_NOT_EXIST = "404";
    public static final String LOGIN_ERROR_EMAIL_OR_PASSWORD_INCORRECT = "401";
    public static final String REGISTER_ERROR_EMAIL_HAD_REGISTERED = "400:1";
    private static final String a = "HMProcessLoginDataManager";
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public interface LoginCallBack {
        void onResult(LoginResult loginResult);
    }

    public static class a implements IAccount.Callback<List<BindAccount>, ErrorCode> {
        private final LoginCallBack a;

        public a(LoginCallBack loginCallBack) {
            this.a = loginCallBack;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "onError:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            HMLog.info(HMProcessLoginDataManager.a, new Function0() { // from class: com.huami.account.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMProcessLoginDataManager.a.b(errorCode);
                }
            });
            this.a.onResult(new LoginResult.Failed.Account(errorCode));
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BindAccount> list) {
            Iterator<BindAccount> it2 = list.iterator();
            while (it2.hasNext()) {
                if (HMLoginManager.isPhoneEmailAccount(it2.next().getThirdType())) {
                    HMAccountKeeper.INSTANCE.saveAlreadyBindPhone(true);
                    this.a.onResult(LoginResult.Success.INSTANCE);
                    return;
                }
            }
            HMAccountKeeper.INSTANCE.saveAlreadyBindPhone(false);
            this.a.onResult(LoginResult.Success.INSTANCE);
        }
    }

    public static class b extends AsyncTask<Void, Void, LoginResult> {
        private final LoginCallBack a;

        @LoginType
        private final int b;

        public b(@LoginType int i, LoginCallBack loginCallBack) {
            this.a = loginCallBack;
            this.b = i;
        }

        private void a(LoginResult loginResult) {
            boolean zIsPhoneEmailAccountLogin = HMLoginManager.isPhoneEmailAccountLogin();
            if (loginResult.isSuccess() && !zIsPhoneEmailAccountLogin) {
                AccountManager.getDefault(AccountExternalsKt.getAppContext()).listAccount(false, new a(this.a));
            } else {
                HMAccountKeeper.INSTANCE.saveAlreadyBindPhone(zIsPhoneEmailAccountLogin);
                this.a.onResult(loginResult);
            }
        }

        private void b() {
            AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
            AccountExternalsKt.getAccountDelegate().keepDataRemoveData(accountManager.getCurrentUid());
            HMAccountKeeper.INSTANCE.keepLoginData(accountManager.getCurrentUid(), accountManager.getUserInfo().getThirdId(), null);
            HMLoginManager.refreshHttpDns();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public LoginResult doInBackground(Void... voidArr) {
            try {
                b();
                return HMProcessLoginDataManager.process(this.b);
            } catch (Exception e) {
                return new LoginResult.Failed.ProcessData.Unknown(e);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(LoginResult loginResult) {
            super.onPostExecute(loginResult);
            a(loginResult);
        }
    }

    private static void d(int i) {
        if (i == 1) {
            LifecycleModuleKt.getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.LoggedIn(LoginStateType.NORMAL));
        }
        if (i == 3) {
            LifecycleModuleKt.getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.LoggedIn(LoginStateType.MUTEX));
        }
    }

    private static boolean e() {
        return AccountExternalsKt.getAccountDelegate().getDeviceListFromServer();
    }

    private static boolean f() {
        return HMLoginManager.isInMainland() || (SelectAreaHelper.isUnknown(SelectAreaHelper.getAreaBySave()) && AccountExternalsKt.getConfigDelegate().supportNoAreaBindPhone());
    }

    public static void fetchAndSavePersonInfo() {
        HMBeanPersonInfo personInfoFromServer = ((UserInfoService) KoinJavaComponent.get(UserInfoService.class)).getPersonInfoFromServer();
        if (personInfoFromServer == null) {
            return;
        }
        l(personInfoFromServer);
    }

    private static void g() {
        HMAccountKeeper.INSTANCE.saveCreateTime(HMPersonInfo.getInstance().getUserInfo().getCreatTime());
    }

    public static void goBindPhoneOrMainTabPage(Context context) {
        boolean alreadyBindPhone = HMAccountKeeper.INSTANCE.getAlreadyBindPhone();
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        boolean zHasPromptBindPhone = AnonymousKeeper.hasPromptBindPhone(currentUid);
        if (alreadyBindPhone || zHasPromptBindPhone || !f()) {
            goMainTabPage(context, Boolean.FALSE);
        } else {
            k(context, currentUid);
        }
    }

    public static void goBindPhoneOrSetInfoPage(Context context, final Intent intent) {
        String currentUid = AccountManager.getDefault(context).getCurrentUid();
        boolean zHasPromptBindPhone = AnonymousKeeper.hasPromptBindPhone(currentUid);
        if (HMAccountKeeper.INSTANCE.getAlreadyBindPhone() || zHasPromptBindPhone || !HMLoginManager.isInMainland()) {
            skipToSetInfoPage(context, intent);
        } else {
            k(context, currentUid);
            HMLog.verbose(a, new Function0() { // from class: jd3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMProcessLoginDataManager.h(intent);
                }
            });
        }
    }

    public static void goMainTabPage(Context context, Boolean bool) {
        AccountExternalsKt.getAccountDelegate().goMainTabPage(context, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Intent intent) {
        return "startActivity: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit i(Context context) {
        AccountExternalsKt.getAccountDelegate().processExitingUser();
        LifecycleModuleKt.getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.LoggedIn(LoginStateType.COMPLETE_USER_INFO));
        goMainTabPage(context, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static boolean isInLoginProcess() {
        return b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "startActivity: $it";
    }

    private static void k(Context context, String str) {
        context.startActivity(new Intent(context, (Class<?>) BindPhoneForLoginActivity.class));
        AnonymousKeeper.setHashPromptBindPhone(str);
    }

    private static void l(HMBeanPersonInfo hMBeanPersonInfo) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        String avatar = hMBeanPersonInfo.getAvatar();
        LastLoginInfoRepository lastLoginInfoRepository = (LastLoginInfoRepository) KoinJavaComponent.get(LastLoginInfoRepository.class);
        if (!TextUtils.isEmpty(avatar)) {
            hMPersonInfo.getUserInfo().setAvatar(avatar);
            lastLoginInfoRepository.updateAvatar(avatar);
        }
        String nickname = hMBeanPersonInfo.getNickname();
        if (!TextUtils.isEmpty(nickname)) {
            hMPersonInfo.getUserInfo().setNickname(nickname);
            lastLoginInfoRepository.updateNickname(nickname);
        }
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        hMAccountKeeper.setManualAuditNickName(hMBeanPersonInfo.getManualAuditNickName());
        hMAccountKeeper.setManualAuditAvatar(hMBeanPersonInfo.getManualAuditAvatar());
    }

    public static LoginResult process(@LoginType int i) {
        try {
            try {
                AtomicBoolean atomicBoolean = b;
                atomicBoolean.set(true);
                LoginResult loginResultProcessInner = processInner(i);
                atomicBoolean.set(false);
                return loginResultProcessInner;
            } catch (Exception e) {
                LoginResult.Failed.ProcessData.Unknown unknown = new LoginResult.Failed.ProcessData.Unknown(e);
                b.set(false);
                return unknown;
            }
        } catch (Throwable th) {
            b.set(false);
            throw th;
        }
    }

    public static LoginResult processInner(@LoginType int i) {
        HMBeanPersonInfo personInfoFromServer;
        AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
        if (i != 3) {
            AccountExternalsKt.getAccountDelegate().initDB(AccountExternalsKt.getAppContext(), accountManager.getUserInfo().getThirdId(), accountManager.getCurrentUid());
        }
        HMLoginManager.initCountryCode();
        if (i == 2) {
            personInfoFromServer = new HMBeanPersonInfo();
        } else {
            personInfoFromServer = ((UserInfoService) KoinJavaComponent.get(UserInfoService.class)).getPersonInfoFromServer();
            if (personInfoFromServer == null) {
                return LoginResult.Failed.ProcessData.UserData.INSTANCE;
            }
        }
        personInfoFromServer.setUserid(accountManager.getCurrentUid());
        if (i != 3) {
            HMPersonInfo hMPersonInfoUpdateFromServer = HMPersonInfo.getInstance().updateFromServer(personInfoFromServer);
            if (hMPersonInfoUpdateFromServer.getUserInfo().getCreatTime() <= 0) {
                hMPersonInfoUpdateFromServer.getUserInfo().setNickname(accountManager.getUserInfo().getNickName());
            }
            hMPersonInfoUpdateFromServer.saveInfoAsync();
            HMLoginManager.migrate(accountManager.getCurrentUid(), accountManager.getUserInfo().getThirdId());
        } else {
            HMDaoManager.getInstance().getDaoSession().getAlarmDao().deleteAll();
            HMDaoManager.getInstance().getDaoSession().getConfigDao().deleteAll();
            HMPersonInfo.getInstance().updateFromServer(personInfoFromServer).saveInfoAsync();
        }
        l(personInfoFromServer);
        if (HMLoginManager.isExistingUser() && !syncExistingUserData()) {
            return LoginResult.Failed.ProcessData.SyncData.INSTANCE;
        }
        HMWebKeeper.setNeedUpdateRunning(true);
        try {
            AccountExternalsKt.getAccountDelegate().afterLoginSuccess(i, personInfoFromServer);
            new LoginSuccessUseCase().invoke(i);
            if (i != 3) {
                EventBus.getDefault().post(new EventAccountStatus(1));
                g();
            }
            d(i);
            return LoginResult.Success.INSTANCE;
        } catch (Exception e) {
            return new LoginResult.Failed.ProcessData.External(e);
        }
    }

    public static void processLoginSuccess(LoginCallBack loginCallBack) {
        new b(1, loginCallBack).execute(new Void[0]);
    }

    public static void processRegisterLoginSuccess(LoginCallBack loginCallBack) {
        new b(2, loginCallBack).execute(new Void[0]);
    }

    public static void skipToSetInfoPage(final Context context, Intent intent) {
        ((UserInfoService) KoinJavaComponent.get(UserInfoService.class)).navigateToNewUserGuide(context, new Function0() { // from class: id3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMProcessLoginDataManager.i(context);
            }
        });
        LifecycleModuleKt.getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.NewUser(false));
        Analytics.recordEvent(new CountEventBuilder("SetNewUserInfo_ViewNum"));
        HMLog.verbose(a, new Function0() { // from class: kd3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMProcessLoginDataManager.j();
            }
        });
    }

    public static boolean syncExistingUserData() {
        if (!AccountExternalsKt.getAccountDelegate().syncUserSettings(AccountExternalsKt.getAppContext())) {
            return false;
        }
        UpdateUserDataBeginTimeUseCase.execute();
        if (!e()) {
            return false;
        }
        HMAccountWebAPI.getUserWeightGoalList();
        AccountExternalsKt.getAccountDelegate().syncNeededUserData();
        AccountExternalsKt.getAccountDelegate().initData();
        return true;
    }
}
