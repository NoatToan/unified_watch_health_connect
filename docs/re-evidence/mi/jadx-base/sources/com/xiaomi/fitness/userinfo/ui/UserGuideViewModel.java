package com.xiaomi.fitness.userinfo.ui;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.Scopes;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.goal.GoalPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.userinfo.ui.UserGuideViewModel;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.fyi;
import defpackage.o1j;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.zu9;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001dB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020'J\b\u00107\u001a\u0004\u0018\u00010'J\u000e\u00108\u001a\u0002052\u0006\u0010.\u001a\u00020\nJ\u000e\u00109\u001a\u0002052\u0006\u0010,\u001a\u00020\nJ\u0010\u0010:\u001a\u0002052\b\u0010\"\u001a\u0004\u0018\u00010'J\u0006\u0010;\u001a\u000205J\u001e\u0010<\u001a\u0002052\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010@\u001a\u00020\u0006J\u001e\u0010A\u001a\u0002052\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010@\u001a\u00020\u0006J\u0016\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00062\u0006\u00106\u001a\u00020\nJ8\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020\u00062\u0006\u00106\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010'2\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u0014J\u0006\u0010H\u001a\u00020\u001bJ\u0006\u0010O\u001a\u000205J#\u0010S\u001a\u0002052\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010VJ\u000e\u0010W\u001a\u0002052\u0006\u0010X\u001a\u00020YJ\u0010\u0010\\\u001a\u0002052\u0006\u0010]\u001a\u00020^H\u0016J\u0006\u0010_\u001a\u00020'J\u0006\u0010`\u001a\u00020\nJ\u0006\u0010a\u001a\u00020\nJ\u0006\u0010b\u001a\u00020#J\u0006\u0010c\u001a\u000205R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010\bR\u0011\u0010,\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010\fR\u0011\u0010.\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u0010\fR\u0010\u00100\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bL\u0010\u001dR!\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bQ\u0010\u001dR\u0014\u0010Z\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010)¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideModel;", "<init>", "()V", "DEFAULT_HEIGHT", "", "getDEFAULT_HEIGHT", "()I", "DEFAULT_WEIGHT", "", "getDEFAULT_WEIGHT", "()F", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "mDatabaseChange", "Landroidx/lifecycle/MutableLiveData;", "", "getMDatabaseChange", "()Landroidx/lifecycle/MutableLiveData;", "setMDatabaseChange", "(Landroidx/lifecycle/MutableLiveData;)V", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "birthday", "", "getBirthday", "()J", "gender", "", "getGender", "()Ljava/lang/String;", "age", "getAge", "height", "getHeight", "weight", "getWeight", "oldGender", "oldHeight", "oldWeight", "oldBirthDay", "setUserSex", "", "value", "getUserSext", "setWeight", "setHeight", "setBirthday", "initUserProfile", "onNext", "referenceActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "index", "onSkip", "sendProfile", "type", "sValue", "isRecordHeartAuto", "userInfoManager", "accountRequest", "showNotifySwitch", "vitalityReminder", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel$VitalityReminderData;", "getVitalityReminderRet", "getGetVitalityReminderRet", "getVitalityReminderRet$delegate", "Lkotlin/Lazy;", "getVitalityReminder", "setVitalityReminderRet", "getSetVitalityReminderRet", "setVitalityReminderRet$delegate", "setVitalityReminder", "reachGoal", "reachHelp", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "saveAllProfile", "callback", "Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "TAG", "getTAG", "onCreate", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "getUserGender", "getUserHeight", "getUserWeight", "birthStringToMillis", "revertUserProfile", "VitalityReminderData", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGuideViewModel.kt\ncom/xiaomi/fitness/userinfo/ui/UserGuideViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,384:1\n37#2:385\n36#2,3:386\n*S KotlinDebug\n*F\n+ 1 UserGuideViewModel.kt\ncom/xiaomi/fitness/userinfo/ui/UserGuideViewModel\n*L\n361#1:385\n361#1:386,3\n*E\n"})
public final class UserGuideViewModel extends BaseViewModel<UserGuideModel> {
    public AccountRequest mAccountRequest;
    public UserInfoManager mUserInfoManager;

    @Nullable
    private String oldBirthDay;

    @Nullable
    private String oldGender;
    private float oldHeight;
    private float oldWeight;

    @Nullable
    private UserProfile profile;

    @Nullable
    private VitalityReminderData vitalityReminder;
    private final int DEFAULT_HEIGHT = 170;
    private final float DEFAULT_WEIGHT = 60.0f;

    @NotNull
    private MutableLiveData<Boolean> mDatabaseChange = new MutableLiveData<>();

    /* JADX INFO: renamed from: getVitalityReminderRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getVitalityReminderRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wfq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserGuideViewModel.getVitalityReminderRet_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: setVitalityReminderRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setVitalityReminderRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xfq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserGuideViewModel.setVitalityReminderRet_delegate$lambda$5();
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel$VitalityReminderData;", "", "reachGoal", "", "reachHelp", "<init>", "(ZZ)V", "getReachGoal", "()Z", "setReachGoal", "(Z)V", "getReachHelp", "setReachHelp", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VitalityReminderData {
        private boolean reachGoal;
        private boolean reachHelp;

        /* JADX WARN: Illegal instructions before constructor call */
        public VitalityReminderData() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ VitalityReminderData copy$default(VitalityReminderData vitalityReminderData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = vitalityReminderData.reachGoal;
            }
            if ((i & 2) != 0) {
                z2 = vitalityReminderData.reachHelp;
            }
            return vitalityReminderData.copy(z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getReachGoal() {
            return this.reachGoal;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getReachHelp() {
            return this.reachHelp;
        }

        @NotNull
        public final VitalityReminderData copy(boolean reachGoal, boolean reachHelp) {
            return new VitalityReminderData(reachGoal, reachHelp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VitalityReminderData)) {
                return false;
            }
            VitalityReminderData vitalityReminderData = (VitalityReminderData) other;
            return this.reachGoal == vitalityReminderData.reachGoal && this.reachHelp == vitalityReminderData.reachHelp;
        }

        public final boolean getReachGoal() {
            return this.reachGoal;
        }

        public final boolean getReachHelp() {
            return this.reachHelp;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.reachGoal) * 31) + Boolean.hashCode(this.reachHelp);
        }

        public final void setReachGoal(boolean z) {
            this.reachGoal = z;
        }

        public final void setReachHelp(boolean z) {
            this.reachHelp = z;
        }

        @NotNull
        public String toString() {
            return "VitalityReminderData(reachGoal=" + this.reachGoal + ", reachHelp=" + this.reachHelp + ")";
        }

        public VitalityReminderData(boolean z, boolean z2) {
            this.reachGoal = z;
            this.reachHelp = z2;
        }

        public /* synthetic */ VitalityReminderData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getVitalityReminderRet_delegate$lambda$3() {
        return new MutableLiveData();
    }

    public static /* synthetic */ void setVitalityReminder$default(UserGuideViewModel userGuideViewModel, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        userGuideViewModel.setVitalityReminder(bool, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setVitalityReminderRet_delegate$lambda$5() {
        return new MutableLiveData();
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
            Logger.d(getTAG(), "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }

    public final int getAge() {
        return 0;
    }

    public final long getBirthday() {
        return 631123200000L;
    }

    public final int getDEFAULT_HEIGHT() {
        return this.DEFAULT_HEIGHT;
    }

    public final float getDEFAULT_WEIGHT() {
        return this.DEFAULT_WEIGHT;
    }

    @NotNull
    public final String getGender() {
        return UserInfoConfigUtil.INSTANCE.getDefaultGender();
    }

    @NotNull
    public final MutableLiveData<VitalityReminderData> getGetVitalityReminderRet() {
        return (MutableLiveData) this.getVitalityReminderRet.getValue();
    }

    public final float getHeight() {
        return UserInfoConfigUtil.INSTANCE.getDefaultHeight();
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
    public final MutableLiveData<Boolean> getMDatabaseChange() {
        return this.mDatabaseChange;
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

    @NotNull
    public final MutableLiveData<Boolean> getSetVitalityReminderRet() {
        return (MutableLiveData) this.setVitalityReminderRet.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "UserGuideViewModel";
    }

    @NotNull
    public final String getUserGender() {
        UserProfile userProfile = this.profile;
        if (userProfile == null) {
            return "male";
        }
        Intrinsics.checkNotNull(userProfile);
        return userProfile.getSexOrDefault();
    }

    public final float getUserHeight() {
        UserProfile userProfile = this.profile;
        if (userProfile == null) {
            return UserInfoConfigUtil.INSTANCE.getDefaultHeight();
        }
        Intrinsics.checkNotNull(userProfile);
        if (userProfile.getHeight() == 0.0f) {
            return UserInfoConfigUtil.INSTANCE.getDefaultHeight();
        }
        UserProfile userProfile2 = this.profile;
        Intrinsics.checkNotNull(userProfile2);
        return userProfile2.getHeight();
    }

    @Nullable
    public final String getUserSext() {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        return userProfile.getSex();
    }

    public final float getUserWeight() {
        UserProfile userProfile = this.profile;
        if (userProfile == null) {
            return UserInfoConfigUtil.INSTANCE.getDefaultWeight();
        }
        Intrinsics.checkNotNull(userProfile);
        if (userProfile.getWeight() == 0.0f) {
            return UserInfoConfigUtil.INSTANCE.getDefaultWeight();
        }
        UserProfile userProfile2 = this.profile;
        Intrinsics.checkNotNull(userProfile2);
        return userProfile2.getWeight();
    }

    public final void getVitalityReminder() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 21;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.ui.UserGuideViewModel.getVitalityReminder.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                UserGuideViewModel.this.getGetVitalityReminderRet().postValue(null);
                UserGuideViewModel.this.vitalityReminder = null;
                Logger.i(UserGuideViewModel.this.getTAG(), "getVitalityReminder fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                    return;
                }
                s7r packet = result.getPacket();
                zu9 zu9VarY = (packet == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.Y();
                Logger.i(UserGuideViewModel.this.getTAG(), "getVitalityReminder success: " + zu9VarY);
                if (zu9VarY == null) {
                    onError(did, type, 255);
                } else {
                    UserGuideViewModel.this.vitalityReminder = new VitalityReminderData(zu9VarY.c, zu9VarY.d);
                    UserGuideViewModel.this.getGetVitalityReminderRet().postValue(UserGuideViewModel.this.vitalityReminder);
                }
            }
        }, 0, 8, null);
    }

    public final float getWeight() {
        return UserInfoConfigUtil.INSTANCE.getDefaultWeight();
    }

    public final void initUserProfile() {
        this.profile = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        Logger.d(getTAG(), "profile is " + this.profile);
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            this.oldGender = userProfile.getSex();
            this.oldHeight = userProfile.getHeight();
            this.oldBirthDay = userProfile.getBirth();
            this.oldWeight = userProfile.getWeight();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
    }

    public final void onNext(@Nullable final WeakReference<Activity> referenceActivity, final int index) {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            UserInfoConfigUtil.INSTANCE.sendAllProfile(ViewModelKt.getViewModelScope(this), userProfile, getMAccountRequest(), new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.ui.UserGuideViewModel$onNext$1$1
                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onProfileToDBSuccess(boolean result) {
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendError() {
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendSuccess(UserProfile profile) {
                    SetPageManager.Companion companion = SetPageManager.INSTANCE;
                    if (SetPageManageExtKt.getInstance(companion).isLastPage(index)) {
                        return;
                    }
                    SetPageManageExtKt.getInstance(companion).goNextGuidPage(referenceActivity, index + 1);
                }

                @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                public void onSendError(int i) {
                    SendProfileCallBack.DefaultImpls.onSendError(this, i);
                }
            });
        }
        SetPageManager.Companion companion = SetPageManager.INSTANCE;
        if (SetPageManageExtKt.getInstance(companion).isLastPage(index)) {
            Logger.i(getTAG(), "user info guide next last page");
            SetPageManageExtKt.getInstance(companion).setShowGuidePageFinish(true);
            SetPageManageExtKt.getInstance(companion).onFinishClick();
        }
    }

    public final void onSkip(@Nullable WeakReference<Activity> referenceActivity, int index) {
        SetPageManager.Companion companion = SetPageManager.INSTANCE;
        if (!SetPageManageExtKt.getInstance(companion).isLastPage(index)) {
            SetPageManageExtKt.getInstance(companion).goNextGuidPage(referenceActivity, index + 1);
            return;
        }
        Logger.i(getTAG(), "user info guide skip last page");
        SetPageManageExtKt.getInstance(companion).setShowGuidePageFinish(true);
        SetPageManageExtKt.getInstance(companion).onFinishClick();
    }

    public final void revertUserProfile() {
        Logger.i(getTAG(), "revert user info : weight: " + this.oldWeight + " height: " + this.oldHeight + " sex: " + this.oldGender + " birth: " + this.oldBirthDay);
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            userProfile.setWeight(this.oldWeight);
            userProfile.setHeight(this.oldHeight);
            userProfile.setSex(this.oldGender);
            userProfile.setBirth(this.oldBirthDay);
        }
    }

    public final void saveAllProfile(@NotNull SendProfileCallBack callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            UserInfoConfigUtil.INSTANCE.sendAllProfile(ViewModelKt.getViewModelScope(this), userProfile, getMAccountRequest(), callback);
        }
    }

    public final void sendProfile(int type, float value) {
        sendProfile(type, value, null, false, getMUserInfoManager(), getMAccountRequest());
    }

    public final void setBirthday(@Nullable String birthday) {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        userProfile.setBirth(birthday);
        getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("birthday is ");
        sb.append(birthday);
        new Exception();
        Logger.d(getTAG(), "birthday is " + birthday);
    }

    public final void setHeight(float height) {
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        userProfile.setHeight(height);
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMDatabaseChange(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mDatabaseChange = mutableLiveData;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setUserSex(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        userProfile.setSex(value);
    }

    public final void setVitalityReminder(@Nullable Boolean reachGoal, @Nullable Boolean reachHelp) {
        if (this.vitalityReminder == null) {
            boolean z = false;
            this.vitalityReminder = new VitalityReminderData(z, z, 3, null);
        }
        if (reachGoal != null) {
            VitalityReminderData vitalityReminderData = this.vitalityReminder;
            Intrinsics.checkNotNull(vitalityReminderData);
            vitalityReminderData.setReachGoal(reachGoal.booleanValue());
        }
        if (reachHelp != null) {
            VitalityReminderData vitalityReminderData2 = this.vitalityReminder;
            Intrinsics.checkNotNull(vitalityReminderData2);
            vitalityReminderData2.setReachHelp(reachHelp.booleanValue());
        }
        Logger.i(getTAG(), "setVitalityReminder vitalityReminder: " + this.vitalityReminder);
        zu9 zu9Var = new zu9();
        VitalityReminderData vitalityReminderData3 = this.vitalityReminder;
        Intrinsics.checkNotNull(vitalityReminderData3);
        zu9Var.d = vitalityReminderData3.getReachHelp();
        VitalityReminderData vitalityReminderData4 = this.vitalityReminder;
        Intrinsics.checkNotNull(vitalityReminderData4);
        zu9Var.c = vitalityReminderData4.getReachGoal();
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 22;
        ur9 ur9Var = new ur9();
        ur9Var.U0(zu9Var);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.ui.UserGuideViewModel.setVitalityReminder.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(UserGuideViewModel.this.getTAG(), "setVitalityReminder fail: " + code);
                UserGuideViewModel.this.getSetVitalityReminderRet().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(UserGuideViewModel.this.getTAG(), "setVitalityReminder success");
                UserGuideViewModel.this.getSetVitalityReminderRet().postValue(result != null ? Boolean.valueOf(result.isSuccess()) : null);
            }
        }, 0, 8, null);
    }

    public final void setWeight(float weight) {
        UserProfile userProfile = this.profile;
        if (userProfile != null) {
            userProfile.setWeight(weight);
            int defaultCalore = GoalPreference.INSTANCE.getDefaultCalore(weight);
            userProfile.setDailyCalGoal(defaultCalore);
            userProfile.setGoalConfig(userProfile, defaultCalore, 2);
        }
    }

    public final boolean showNotifySwitch() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        return (wearableDeviceModel == null || DeviceModelExtKt.isHuaMi(wearableDeviceModel) || (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 8192) != 8192) ? false : true;
    }

    public final void sendProfile(int type, float value, @Nullable String sValue, boolean isRecordHeartAuto, @NotNull final UserInfoManager userInfoManager, @NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        UserInfoConfigUtil.INSTANCE.sendProfile(new NetCoroutineScope(null, null, null, 7, null), type, value, sValue, isRecordHeartAuto, new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.ui.UserGuideViewModel.sendProfile.1
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
                WearableDeviceModel wearableDeviceModel;
                Logger.i(UserGuideViewModel.this.getTAG(), "onProfileToDBSuccess " + result);
                if (result && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) != null && wearableDeviceModel.isDeviceConnected()) {
                    if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                        UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null), wearableDeviceModel, null, 4, null);
                    } else {
                        UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null), wearableDeviceModel, null, null, 12, null);
                    }
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
                Logger.i(UserGuideViewModel.this.getTAG(), "onSendError");
                UserInfoConfigUtil.INSTANCE.showShortToast(o1j.common_set_error);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                Logger.i(UserGuideViewModel.this.getTAG(), "onSendSuccess " + profile);
                UserGuideViewModel.this.getMDatabaseChange().setValue(Boolean.TRUE);
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected() || profile == null) {
                    return;
                }
                if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, 4, null);
                } else {
                    UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, null, 12, null);
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int code) {
                Logger.i(UserGuideViewModel.this.getTAG(), "onSendError " + code);
                if (code == -8) {
                    UserInfoConfigUtil.INSTANCE.showShortToast(o1j.p1);
                    return;
                }
                UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
                if (code == userInfoConfigUtil.getDEFAULT_ERROR_CODE_REGION_LIMIT_AGE()) {
                    int limitAge = GuidePageUtil.INSTANCE.getLimitAge();
                    Intrinsics.checkNotNullExpressionValue(ApplicationExtKt.getApplication().getResources().getQuantityString(fyi.f18376b, limitAge, Integer.valueOf(limitAge)), "getQuantityString(...)");
                    userInfoConfigUtil.showShortToast(o1j.q1);
                    return;
                }
                userInfoConfigUtil.showShortToast(o1j.common_set_error);
            }
        }, userInfoManager, accountRequest);
    }
}
