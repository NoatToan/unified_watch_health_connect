package com.xiaomi.fitness.userinfo.goal;

import android.app.Activity;
import android.content.Intent;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.RainbowTargetGuide;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import defpackage.is9;
import defpackage.kad;
import defpackage.s7r;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\bC\u0010\u0014J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u0019\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010\u0006J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001eR\u0014\u0010&\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010*\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R,\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020%8\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020<0(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/userinfo/goal/SetGoalPageManager;", "Lcom/xiaomi/fitness/user/info/export/GoalPageManager;", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "goSwitchGuidePage", "(Landroid/app/Activity;)V", "", "isGoSwitchPage", "isGoFirstGuidPage", "(Landroid/app/Activity;Z)Z", "goFirstGuidPage", "", "index", "goNextGuidPage", "(Landroid/app/Activity;I)V", "isFirstGoalGuidPage", "(I)Z", "isLastPage", "onFinishClick", "()V", "destroy", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getUserProfile", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "mUserProfile", "setUserProfile", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "destoryActivity", "isShowGoalGuid", "()Z", "setCurrentTarget", "goFirstGuidPageFromRaindow", "isGoGuidPage", "updateSupportTarget", "(ZZ)V", "hasDeviceConnect", "", "TAG", "Ljava/lang/String;", "", "Ljava/lang/Class;", "mGuidPages", "[Ljava/lang/Class;", "mFirstGuidPage", "Z", "Ljava/util/ArrayList;", "mSupportTarget", "Ljava/util/ArrayList;", "mCurrentTarget", "mFirstGuideFromSportTarget", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "mInitSupportGuidPages", "getMInitSupportGuidPages", "()[Ljava/lang/Class;", "setMInitSupportGuidPages", "([Ljava/lang/Class;)V", "ACTION_SWITCH_DEVICE", "getACTION_SWITCH_DEVICE", "()Ljava/lang/String;", "Lis9;", "mSupportGoal", "[Lis9;", "getMSupportGoal", "()[Lis9;", "setMSupportGoal", "([Lis9;)V", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SetGoalPageManager implements GoalPageManager {
    private boolean mFirstGuidPage;
    private boolean mFirstGuideFromSportTarget;

    @Nullable
    private Class<?>[] mGuidPages;
    public is9[] mSupportGoal;

    @Nullable
    private UserProfile mUserProfile;

    @NotNull
    private final String TAG = "SetGoalPageManager";

    @NotNull
    private ArrayList<Integer> mSupportTarget = new ArrayList<>();

    @NotNull
    private ArrayList<Integer> mCurrentTarget = new ArrayList<>();

    @NotNull
    private Class<?>[] mInitSupportGuidPages = {GoalGuidPageActivity.class, CalorieGoalActivity.class, StepGoalActivity.class, StandTimesGoalActivity.class, MhsGoalActivity.class};

    @NotNull
    private final String ACTION_SWITCH_DEVICE = kad.ACTION_SWITCH_DEVICE;

    private final void goSwitchGuidePage(Activity activity) {
        List<Integer> deviceSupportGoal = GoalConfigSupport.INSTANCE.getDeviceSupportGoal();
        Intrinsics.checkNotNull(deviceSupportGoal, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
        ArrayList<Integer> arrayList = (ArrayList) deviceSupportGoal;
        this.mSupportTarget = arrayList;
        String str = this.TAG;
        Intrinsics.checkNotNull(arrayList);
        Logger.d(str, "mSupportTarget IS " + arrayList.size() + ", mSupportTarget == " + this.mSupportTarget);
        Intent intent = new Intent();
        intent.putExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        intent.putExtra(GuidePageUtil.KEY_SUPPORT_TARGET, this.mSupportTarget);
        if (activity != null) {
            intent.setClass(activity, GoalSwitchGuidPageActivity.class);
            activity.startActivity(intent);
        } else {
            intent.setClass(ApplicationExtKt.getApplication(), GoalSwitchGuidPageActivity.class);
            intent.setFlags(268435456);
            ApplicationExtKt.getApplication().startActivity(intent);
        }
    }

    public static /* synthetic */ boolean isGoFirstGuidPage$default(SetGoalPageManager setGoalPageManager, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return setGoalPageManager.isGoFirstGuidPage(activity, z);
    }

    public static /* synthetic */ void updateSupportTarget$default(SetGoalPageManager setGoalPageManager, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        setGoalPageManager.updateSupportTarget(z, z2);
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void destoryActivity() {
        Intent intent = new Intent("goal_action_finish_activity");
        this.mFirstGuideFromSportTarget = false;
        ApplicationExtKt.getApplication().sendBroadcast(intent);
    }

    public final void destroy() {
        this.mFirstGuidPage = false;
    }

    @NotNull
    public final String getACTION_SWITCH_DEVICE() {
        return this.ACTION_SWITCH_DEVICE;
    }

    @NotNull
    public final Class<?>[] getMInitSupportGuidPages() {
        return this.mInitSupportGuidPages;
    }

    @NotNull
    public final is9[] getMSupportGoal() {
        is9[] is9VarArr = this.mSupportGoal;
        if (is9VarArr != null) {
            return is9VarArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSupportGoal");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getUserProfile, reason: from getter */
    public final UserProfile getMUserProfile() {
        return this.mUserProfile;
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void goFirstGuidPage(@Nullable Activity activity) {
        List<Integer> deviceSupportGoal = GoalConfigSupport.INSTANCE.getDeviceSupportGoal();
        Intrinsics.checkNotNull(deviceSupportGoal, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
        ArrayList<Integer> arrayList = (ArrayList) deviceSupportGoal;
        this.mSupportTarget = arrayList;
        String str = this.TAG;
        Intrinsics.checkNotNull(arrayList);
        Logger.d(str, "mSupportTarget IS " + arrayList.size() + ", mSupportTarget == " + this.mSupportTarget);
        Class<?>[] clsArr = this.mInitSupportGuidPages;
        Class<?> cls = clsArr[0];
        ArrayList<Integer> arrayList2 = this.mSupportTarget;
        Intrinsics.checkNotNull(arrayList2);
        Integer num = arrayList2.get(0);
        Intrinsics.checkNotNullExpressionValue(num, "get(...)");
        Class<?> cls2 = clsArr[num.intValue()];
        Class<?>[] clsArr2 = this.mInitSupportGuidPages;
        ArrayList<Integer> arrayList3 = this.mSupportTarget;
        Intrinsics.checkNotNull(arrayList3);
        Integer num2 = arrayList3.get(1);
        Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
        Class<?> cls3 = clsArr2[num2.intValue()];
        Class<?>[] clsArr3 = this.mInitSupportGuidPages;
        ArrayList<Integer> arrayList4 = this.mSupportTarget;
        Intrinsics.checkNotNull(arrayList4);
        Integer num3 = arrayList4.get(2);
        Intrinsics.checkNotNullExpressionValue(num3, "get(...)");
        Class<?>[] clsArr4 = {cls, cls2, cls3, clsArr3[num3.intValue()]};
        this.mGuidPages = clsArr4;
        String str2 = this.TAG;
        Intrinsics.checkNotNull(clsArr4);
        Logger.d(str2, "mGuidPages IS " + clsArr4.length);
        Class<?>[] clsArr5 = this.mGuidPages;
        Intrinsics.checkNotNull(clsArr5);
        Class<?> cls4 = clsArr5[0];
        this.mFirstGuidPage = true;
        Logger.d(this.TAG, "mFirstGuideFromSportTarget IS " + this.mFirstGuideFromSportTarget);
        Intent intent = new Intent();
        intent.putExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        intent.putExtra(GuidePageUtil.KEY_SUPPORT_TARGET, this.mSupportTarget);
        intent.putExtra(GuidePageUtil.KEY_FIRST_GUIDE_FROM_SPORT_TARGET, this.mFirstGuideFromSportTarget);
        if (activity != null) {
            intent.setClass(activity, cls4);
            activity.startActivity(intent);
        } else {
            intent.setClass(ApplicationExtKt.getApplication(), cls4);
            intent.setFlags(268435456);
            ApplicationExtKt.getApplication().startActivity(intent);
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void goFirstGuidPageFromRaindow(@Nullable Activity activity) {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_RAINBOW_TARGET_GUIDE).valueToObject(RainbowTargetGuide.class);
        RainbowTargetGuide rainbowTargetGuide = objValueToObject instanceof RainbowTargetGuide ? (RainbowTargetGuide) objValueToObject : null;
        Logger.i(this.TAG + "go first guid page from raindow come", new Object[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 42;
        this.mFirstGuideFromSportTarget = true;
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.goal.SetGoalPageManager.goFirstGuidPageFromRaindow.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("go first guid page from raindow read ble watch info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null), new Object[0]);
                GoalConfigSupport.INSTANCE.updateTargetFromDevice(result);
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
        if ((rainbowTargetGuide == null || !rainbowTargetGuide.isRainbowTargetGuide()) && !hasDeviceConnect()) {
            goFirstGuidPage(activity);
            return;
        }
        String str = this.TAG;
        Boolean boolValueOf = rainbowTargetGuide != null ? Boolean.valueOf(rainbowTargetGuide.isRainbowTargetGuide()) : null;
        Logger.i(str + "isRainbowTargetGuide is " + boolValueOf + ", deviceconnect is " + hasDeviceConnect(), new Object[0]);
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void goNextGuidPage(@Nullable Activity activity, int index) {
        this.mFirstGuidPage = false;
        Class<?>[] clsArr = this.mGuidPages;
        if (clsArr != null) {
            Intrinsics.checkNotNull(clsArr);
            if (clsArr.length != 0 && index >= 0) {
                Class<?>[] clsArr2 = this.mGuidPages;
                Intrinsics.checkNotNull(clsArr2);
                if (index < clsArr2.length) {
                    Class<?>[] clsArr3 = this.mGuidPages;
                    Intrinsics.checkNotNull(clsArr3);
                    Class<?> cls = clsArr3[index];
                    Intent intent = new Intent();
                    Logger.d(this.TAG, "goNextGuidPage mFirstGuideFromSportTarget IS " + this.mFirstGuideFromSportTarget);
                    intent.putExtra(GuidePageUtil.KEY_PAGE_INDEX, index);
                    intent.putExtra(GuidePageUtil.KEY_FIRST_GUIDE_FROM_SPORT_TARGET, this.mFirstGuideFromSportTarget);
                    if (activity != null) {
                        intent.setClass(activity, cls);
                        activity.startActivity(intent);
                        return;
                    }
                    return;
                }
            }
        }
        destoryActivity();
    }

    public final boolean hasDeviceConnect() {
        return !DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels().isEmpty();
    }

    public final boolean isFirstGoalGuidPage(int index) {
        return index == 0 && this.mFirstGuidPage;
    }

    public final boolean isGoFirstGuidPage(@Nullable Activity activity, boolean isGoSwitchPage) {
        Logger.d(this.TAG, "isGoFirstGuidPage isGoSwitchPage" + isGoSwitchPage);
        try {
            GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
            Map<String, String> mapE = xpd.e(goalConfigSupport.getGoalList(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null)));
            List<Integer> deviceSupportGoal = goalConfigSupport.getDeviceSupportGoal();
            if (mapE != null && DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel() != 0 && deviceSupportGoal != null) {
                Logger.d(this.TAG, " Goal manager go guid page is " + mapE + ", device support goal is " + deviceSupportGoal.get(2));
                if (!mapE.containsKey(String.valueOf(deviceSupportGoal.get(2)))) {
                    Logger.d(this.TAG, " Goal manager isGoSwitchPage " + isGoSwitchPage + ", device support goal is " + deviceSupportGoal.get(2));
                    if (isGoSwitchPage) {
                        goSwitchGuidePage(activity);
                    } else {
                        goFirstGuidPage(activity);
                    }
                    return true;
                }
            }
        } catch (JSONException e) {
            Logger.i(this.TAG, "isGoFirstGuidPage method exception " + e);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public boolean isLastPage(int index) {
        Class<?>[] clsArr = this.mGuidPages;
        if (clsArr == null) {
            return true;
        }
        Intrinsics.checkNotNull(clsArr);
        if (clsArr.length == 0) {
            return true;
        }
        Class<?>[] clsArr2 = this.mGuidPages;
        Intrinsics.checkNotNull(clsArr2);
        return index == clsArr2.length - 1;
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public boolean isShowGoalGuid() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_RAINBOW_TARGET_GUIDE).valueToObject(RainbowTargetGuide.class);
        RainbowTargetGuide rainbowTargetGuide = objValueToObject instanceof RainbowTargetGuide ? (RainbowTargetGuide) objValueToObject : null;
        Logger.d(this.TAG, "isRainbowTargetGuide is " + (rainbowTargetGuide != null ? Boolean.valueOf(rainbowTargetGuide.isRainbowTargetGuide()) : null));
        if (wearableDeviceModel != null && rainbowTargetGuide != null && rainbowTargetGuide.isRainbowTargetGuide()) {
            if (DeviceModelExtKt.isPanGu(wearableDeviceModel) || DeviceModelExtKt.isKongMing(wearableDeviceModel)) {
                Logger.d(this.TAG, "isGoFirstGuidPage true");
                return isGoFirstGuidPage(null, true);
            }
            updateSupportTarget(false, true);
            Logger.d(this.TAG, "updateSupportTarget true");
            return false;
        }
        if (wearableDeviceModel == null) {
            Logger.d(this.TAG, "isShowGoalGuid END");
            return false;
        }
        if (DeviceModelExtKt.isPanGu(wearableDeviceModel) || DeviceModelExtKt.isKongMing(wearableDeviceModel)) {
            Logger.d(this.TAG, "isGoFirstGuidPage guide true");
            return isGoFirstGuidPage$default(this, null, false, 2, null);
        }
        updateSupportTarget$default(this, true, false, 2, null);
        Logger.d(this.TAG, "updateSupportTarget guide true");
        return false;
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void onFinishClick() {
        Logger.d(" Goal manager onFinishClick,goMainActivity\n", new Object[0]);
        destoryActivity();
        this.mFirstGuidPage = false;
    }

    @Override // com.xiaomi.fitness.user.info.export.GoalPageManager
    public void setCurrentTarget() {
        GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
        goalConfigSupport.setCurrentTarget(goalConfigSupport.getCurrentGoalList1());
    }

    public final void setMInitSupportGuidPages(@NotNull Class<?>[] clsArr) {
        Intrinsics.checkNotNullParameter(clsArr, "<set-?>");
        this.mInitSupportGuidPages = clsArr;
    }

    public final void setMSupportGoal(@NotNull is9[] is9VarArr) {
        Intrinsics.checkNotNullParameter(is9VarArr, "<set-?>");
        this.mSupportGoal = is9VarArr;
    }

    public final void setUserProfile(@Nullable UserProfile mUserProfile) {
        this.mUserProfile = mUserProfile;
    }

    public final void updateSupportTarget(final boolean isGoGuidPage, final boolean isGoSwitchPage) {
        try {
            Logger.i(this.TAG, "updateSupportTarget come isGoGuidPage " + isGoGuidPage + ";isGoSwitchPage " + isGoSwitchPage);
            s7r s7rVar = new s7r();
            s7rVar.e = 8;
            s7rVar.f = 42;
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.goal.SetGoalPageManager.updateSupportTarget.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(SetGoalPageManager.this.TAG, "onError did" + did + ";type " + type + ";code:" + code);
                    if (isGoGuidPage) {
                        SetGoalPageManager.isGoFirstGuidPage$default(SetGoalPageManager.this, null, false, 2, null);
                        return;
                    }
                    boolean z = isGoSwitchPage;
                    if (z) {
                        SetGoalPageManager.this.isGoFirstGuidPage(null, z);
                    }
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(SetGoalPageManager.this.TAG, "read ble watch info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                    GoalConfigSupport.INSTANCE.updateTargetFromDevice(result);
                    if (isGoGuidPage) {
                        SetGoalPageManager.isGoFirstGuidPage$default(SetGoalPageManager.this, null, false, 2, null);
                        return;
                    }
                    boolean z = isGoSwitchPage;
                    if (z) {
                        SetGoalPageManager.this.isGoFirstGuidPage(null, z);
                    }
                }
            }, ErrorCode.ERROR_CODE_INVALID_PARAM);
            Logger.i(this.TAG, "mCurrentTarget  = " + this.mCurrentTarget);
        } catch (Exception e) {
            Logger.i(this.TAG, "updateSupportTarget exception " + e);
        }
    }
}
