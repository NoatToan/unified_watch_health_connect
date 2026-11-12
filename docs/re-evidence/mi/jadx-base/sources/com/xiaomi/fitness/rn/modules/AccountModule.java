package com.xiaomi.fitness.rn.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.bean.RNAccountBean;
import com.xiaomi.fitness.rn.extetions.RNLogKt;
import com.xiaomi.fitness.rn.log.RnPluginLog;
import com.xiaomi.fitness.rn.modules.AccountModule;
import defpackage.h4b;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/rn/modules/AccountModule;", "Lcom/xiaomi/fitness/rn/modules/BaseNativeModule;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getAccountInfo", "", "callback", "Lcom/facebook/react/bridge/Callback;", "setUserInfoFromPlugin", "json", "setUserInfoAndCallBackFromPlugin", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountModule extends BaseNativeModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountInfo$lambda$0(UserInfoManager infoManager, WritableMap writableMap, Callback callback, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(infoManager, "$infoManager");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (accountCoreInfo != null) {
            UserProfile userProfile$default = UserInfoManager.getUserProfile$default(infoManager, false, 1, null);
            writableMap.putString("uid", accountCoreInfo.getUserId());
            String userName = accountCoreInfo.getUserName();
            if (userName == null && (userName = accountCoreInfo.getNickName()) == null) {
                userName = "";
            }
            writableMap.putString("name", userName);
            writableMap.putInt("age", userProfile$default.getAge());
            String sex = userProfile$default.getSex();
            if (sex == null) {
                sex = "";
            }
            writableMap.putString("gender", sex);
            String avatarAddress = accountCoreInfo.getAvatarAddress();
            writableMap.putString("icon", avatarAddress != null ? avatarAddress : "");
            callback.invoke(Boolean.TRUE, writableMap);
        } else {
            RnPluginLog.INSTANCE.addFrameworkLog("AccountCoreInfo is null");
            callback.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setUserInfoAndCallBackFromPlugin$lambda$3(Ref.ObjectRef profile, Callback callback, boolean z) {
        Intrinsics.checkNotNullParameter(profile, "$profile");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        RNLogKt.logi("setUserInfoAndCallBackFromPlugin success " + z);
        if (z) {
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile((UserProfile) profile.element);
        }
        callback.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserInfoAndCallBackFromPlugin$lambda$4(Callback callback, ApiException it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke(Boolean.FALSE);
        RNLogKt.logi("setUserInfoAndCallBackFromPlugin " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setUserInfoFromPlugin$lambda$1(Ref.ObjectRef profile, boolean z) {
        Intrinsics.checkNotNullParameter(profile, "$profile");
        RNLogKt.logi("setUserInfoFromPlugin success " + z);
        if (z) {
            AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile((UserProfile) profile.element);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserInfoFromPlugin$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RNLogKt.logi("setUserInfoFromPlugin " + it);
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void getAccountInfo(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        final WritableMap writableMapCreateMap = Arguments.createMap();
        final UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
        UserInfoManager.getAccountCoreInfo$default(accountManagerExtKt, false, new Function1() { // from class: g90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountModule.getAccountInfo$lambda$0(accountManagerExtKt, writableMapCreateMap, callback, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return LogExtKt.ACCOUNT_TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.xiaomi.fitness.account.api.bean.UserProfile] */
    @ReactMethod
    public final void setUserInfoAndCallBackFromPlugin(@NotNull String json, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(callback, "callback");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        RNAccountBean rNAccountBean = (RNAccountBean) h4b.d(json, RNAccountBean.class);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        objectRef.element = userProfile;
        userProfile.setSex(Intrinsics.areEqual(rNAccountBean.getSex(), "1") ? "male" : "female");
        ((UserProfile) objectRef.element).setBirth(simpleDateFormat.format(new Date(rNAccountBean.getBirth())));
        ((UserProfile) objectRef.element).setHeight(rNAccountBean.getHeight());
        RNLogKt.logi("setUserInfoAndCallBackFromPlugin profile " + objectRef.element);
        AccountRequest.setUserProfile$default(new AccountRequest(), null, (UserProfile) objectRef.element, new Function1() { // from class: j90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountModule.setUserInfoAndCallBackFromPlugin$lambda$3(objectRef, callback, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: k90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountModule.setUserInfoAndCallBackFromPlugin$lambda$4(callback, (ApiException) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.xiaomi.fitness.account.api.bean.UserProfile] */
    @ReactMethod
    public final void setUserInfoFromPlugin(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        RNAccountBean rNAccountBean = (RNAccountBean) h4b.d(json, RNAccountBean.class);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        objectRef.element = userProfile;
        userProfile.setSex(Intrinsics.areEqual(rNAccountBean.getSex(), "1") ? "male" : "female");
        ((UserProfile) objectRef.element).setBirth(simpleDateFormat.format(new Date(rNAccountBean.getBirth())));
        ((UserProfile) objectRef.element).setHeight(rNAccountBean.getHeight());
        RNLogKt.logi("setUserInfoFromPlugin profile " + objectRef.element);
        AccountRequest.setUserProfile$default(new AccountRequest(), null, (UserProfile) objectRef.element, new Function1() { // from class: h90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountModule.setUserInfoFromPlugin$lambda$1(objectRef, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: i90
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AccountModule.setUserInfoFromPlugin$lambda$2((ApiException) obj);
            }
        }, 1, null);
    }
}
