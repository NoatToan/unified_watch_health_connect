package com.xiaomi.fitness.electronic.scale;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\"J*\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0018J8\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0012R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/UserinfoSelectViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "TAG", "", "getAccountCoreInfo", "", "getUserInfoFromWeb", "getBirthdayRange", "", "checkUserInfoFromWeb", "userProfile", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "birthStringToMillis", "", "sendProfile", "type", "", "value", "", "isRecordHeartAuto", "", "sValue", "userInfoManager", "accountRequest", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserinfoSelectViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/electronic/scale/UserinfoSelectViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,161:1\n37#2:162\n36#2,3:163\n*S KotlinDebug\n*F\n+ 1 UserinfoSelectViewModel.kt\ncom/xiaomi/fitness/electronic/scale/UserinfoSelectViewModel\n*L\n101#1:162\n101#1:163,3\n*E\n"})
public final class UserinfoSelectViewModel extends ElectronicScaleBaseViewModel {
    public AccountRequest mAccountRequest;
    public UserInfoManager mUserInfoManager;

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @NotNull
    private final String TAG = "EcoUserinfoSelectViewModel";

    private final void checkUserInfoFromWeb(UserInfoProfile userProfile) {
        UserProfile userProfile2 = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        if (TextUtils.isEmpty(userProfile.getBirth())) {
            userProfile.setBirth(userProfile2.getBirth());
        }
        if (userProfile.getHeight() == 0.0f) {
            userProfile.setHeight(userProfile2.getHeight());
        }
        if (userProfile.getWeight() == 0.0f) {
            userProfile.setWeight(userProfile2.getWeight());
        }
        Logger.i(this.TAG, "UserInfoSelectViewModel userProfile.sex is " + userProfile.getSex());
        if (TextUtils.isEmpty(userProfile.getSex())) {
            userProfile.setSex(userProfile2.getSex());
        }
        if (userProfile.getDailySleepGoal() == 0) {
            userProfile.setDailySleepGoal(userProfile2.getDailySleepGoal());
        }
        Logger.d(this.TAG, "UserInfoSelectViewModel checkAndSendDefault getUserProfile userprofile after " + userProfile + ", database is " + userProfile2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountCoreInfo$lambda$0(UserinfoSelectViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "getAccountCoreInfo is " + accountCoreInfo);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new UserinfoSelectViewModel$getAccountCoreInfo$1$1(this$0, accountCoreInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$1(UserinfoSelectViewModel this$0, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "come userinfo second page getUserInfoFromWeb getUserProfile userinfo " + it);
        this$0.checkUserInfoFromWeb(it);
        if (!Intrinsics.areEqual(AccountManagerExtKt.toUserProfile$default(it, null, 1, null), UserInfoManager.getUserProfile$default(this$0.getMUserInfoManager(), false, 1, null))) {
            Logger.i(this$0.TAG, "getUserInfoFromWeb getUserProfile userinfo save user info " + it);
            this$0.getMUserInfoManager().saveUserProfile(AccountManagerExtKt.toUserProfile$default(it, null, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUserInfoFromWeb$lambda$2(UserinfoSelectViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.TAG, "getUserInfoFromWeb getUserProfile error is " + it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sendProfile$default(UserinfoSelectViewModel userinfoSelectViewModel, int i, float f, boolean z, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        userinfoSelectViewModel.sendProfile(i, f, z, str);
    }

    public final long birthStringToMillis() {
        long dateInMonth;
        List<String> listSplit;
        String[] strArr = null;
        String birth = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null).getBirth();
        if (birth != null && (listSplit = new Regex("-").split(birth, 0)) != null) {
            strArr = (String[]) listSplit.toArray(new String[0]);
        }
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d(this.TAG, "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }

    public final void getAccountCoreInfo() {
        getMUserInfoManager().getAccountCoreInfo(true, new Function1() { // from class: ykq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserinfoSelectViewModel.getAccountCoreInfo$lambda$0(this.f40277a, (AccountCoreInfo) obj);
            }
        });
    }

    @NotNull
    public final long[] getBirthdayRange() {
        return UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).getBirthdaySelectRange();
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    public final void getUserInfoFromWeb() {
        getMAccountRequest().getUserProfile(ViewModelKt.getViewModelScope(this), new Function1() { // from class: ukq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserinfoSelectViewModel.getUserInfoFromWeb$lambda$1(this.f35893a, (UserInfoProfile) obj);
            }
        }, new Function1() { // from class: wkq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserinfoSelectViewModel.getUserInfoFromWeb$lambda$2(this.f38074a, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void sendProfile(int type, float value, boolean isRecordHeartAuto, @Nullable String sValue) {
        sendProfile(type, value, sValue, isRecordHeartAuto, getMUserInfoManager(), getMAccountRequest());
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }

    public final void sendProfile(final int type, float value, @Nullable String sValue, boolean isRecordHeartAuto, @NotNull UserInfoManager userInfoManager, @NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE).sendProfile(type, value, new SendProfileCallBack() { // from class: com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel.sendProfile.1
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
                Logger.i(UserinfoSelectViewModel.this.TAG, "onProfileToDBSuccess " + result);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int i) {
                SendProfileCallBack.DefaultImpls.onSendError(this, i);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                UserProfile.RecordMaxHrm recordMaxHrm;
                Logger.i(UserinfoSelectViewModel.this.TAG, "onSendSuccess " + profile);
                if (type == 8) {
                    if (Intrinsics.areEqual("auto", (profile == null || (recordMaxHrm = profile.getRecordMaxHrm()) == null) ? null : recordMaxHrm.getSource())) {
                        UserinfoSelectViewModel.this.sendProfile(2, profile.computeAutoMaxHr(), true, profile.getBirth());
                    }
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
                Logger.i(UserinfoSelectViewModel.this.TAG, "onSendError");
            }
        }, userInfoManager, accountRequest, sValue, Boolean.valueOf(isRecordHeartAuto), ViewModelKt.getViewModelScope(this));
    }
}
