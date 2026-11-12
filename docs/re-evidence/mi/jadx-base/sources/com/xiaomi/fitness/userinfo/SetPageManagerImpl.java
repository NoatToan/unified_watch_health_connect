package com.xiaomi.fitness.userinfo;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.userinfo.goal.GoalManagerActivity;
import com.xiaomi.fitness.userinfo.goal.SetGoalPageActivity;
import com.xiaomi.fitness.userinfo.information.UserIndicatorsActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdHomeActivity;
import com.xiaomi.fitness.userinfo.preference.GuidePreference;
import com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditBirthdayActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditGenderActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditHeightActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditUserInfoActivity;
import com.xiaomi.fitness.userinfo.ui.GuideEditWeightActivity;
import com.xiaomi.fitness.userinfo.utils.GoalConfigSupport;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.av6;
import defpackage.o1j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J \u0010\u001d\u001a\u00020\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016J \u0010\"\u001a\u00020\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020 H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\b\u0010-\u001a\u00020\u0015H\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00182\u0006\u0010$\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u0010$\u001a\u000203H\u0016J\u0010\u00105\u001a\u00020\u00182\u0006\u0010$\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u000103H\u0016J\b\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0015H\u0016J\u001c\u0010?\u001a\u00020\u00182\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180AH\u0016J\u001c\u0010B\u001a\u00020\u00182\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180AH\u0016J\u001c\u0010C\u001a\u00020\u00182\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180AH\u0016J\u001c\u0010D\u001a\u00020\u00182\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180AH\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/userinfo/SetPageManagerImpl;", "Lcom/xiaomi/fitness/user/info/export/SetPageManager;", "<init>", "()V", "guidPages", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getProfile", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setProfile", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mFirstGuidPage", "", "showSkipEnable", "updateGuidPage", "", "requestUserInfoGuide", "requestList", "", "", "goFirstGuidPage", "referenceActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "index", "goNextGuidPage", "goSetThreeGoalPage", LifecycleConstantKt.TYPE_ACTIVITY, "isLastPage", "getFirstGuidPageIndex", "onFinishClick", "FLAG_SET_COMPLETE", "destroyActivity", "startGoalManagerActivity", "isDeviceSupportMhs", "isDeviceSupportStand", "isDeviceSupportAll", "setDefaultSupport", "", "data", "supportMhs", "startUserIndicatorsActivity", "Landroid/content/Context;", "startUserIndicatorsActivityForCreateAbilityPlan", "showUserInfoDialog", "Landroidx/fragment/app/FragmentActivity;", "isFirstGoalGuidPage", "getMedicalIdHomePageIntent", "Landroid/content/Intent;", "goMedicalIdEditPage", "context", "getShowGuidePageFinish", "setShowGuidePageFinish", "finished", "addGuideFinishListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "removeGuideFinishListener", "addDeviceUpdateAllGoalSupportListener", "removeDeviceUpdateAllGoalSupportListener", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSetPageManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetPageManagerImpl.kt\ncom/xiaomi/fitness/userinfo/SetPageManagerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,348:1\n37#2:349\n36#2,3:350\n37#2:353\n36#2,3:354\n*S KotlinDebug\n*F\n+ 1 SetPageManagerImpl.kt\ncom/xiaomi/fitness/userinfo/SetPageManagerImpl\n*L\n80#1:349\n80#1:350,3\n109#1:353\n109#1:354,3\n*E\n"})
public final class SetPageManagerImpl implements SetPageManager {
    public static final int BIRTH = 4;
    public static final int GENDER = 8;
    public static final int HEIGHT = 1;

    @NotNull
    public static final String TAG = "SetPageManagerImpl";
    public static final int WEIGHT = 2;
    private boolean mFirstGuidPage;
    public UserInfoManager mUserInfoManager;

    @Nullable
    private UserProfile profile;
    private boolean showSkipEnable = true;
    private final int FLAG_SET_COMPLETE = -1;

    @Nullable
    private Class<?>[] guidPages = {GuideEditBirthdayActivity.class, GuideEditGenderActivity.class, GuideEditHeightActivity.class, GuideEditWeightActivity.class};

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.SetPageManagerImpl$onFinishClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.SetPageManagerImpl$onFinishClick$1", f = "SetPageManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MedalAssistResult medalAssistResult) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).doMedalAssist(7, new Function1() { // from class: com.xiaomi.fitness.userinfo.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SetPageManagerImpl.AnonymousClass1.invokeSuspend$lambda$0((MedalAssistResult) obj2);
                }
            });
            Logger.i("doMedalAssist\n", new Object[0]);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void updateGuidPage() {
        ArrayList arrayList = new ArrayList();
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        if (TextUtils.isEmpty(userProfile$default.getBirth())) {
            arrayList.add(GuideEditBirthdayActivity.class);
        }
        if (TextUtils.isEmpty(userProfile$default.getSex())) {
            arrayList.add(GuideEditGenderActivity.class);
        }
        if (userProfile$default.getHeight() == 0.0f) {
            arrayList.add(GuideEditHeightActivity.class);
        }
        if (userProfile$default.getWeight() == 0.0f) {
            arrayList.add(GuideEditWeightActivity.class);
        }
        Logger.i(" UserProfile updateGuidPage userProfile = " + userProfile$default + ", classes.size() = " + arrayList.size(), new Object[0]);
        this.guidPages = (Class[]) arrayList.toArray(new Class[0]);
        this.showSkipEnable = true;
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void addDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        GoalConfigSupport.INSTANCE.addDeviceUpdateAllGoalSupportListener(listener);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void addGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        GuidePreference.INSTANCE.addGuideFinishListener(listener);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void destroyActivity() {
        ApplicationExtKt.getApplication().sendBroadcast(new Intent(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY));
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public int getFirstGuidPageIndex(@NotNull UserProfile profile) {
        Class<?>[] clsArr;
        Intrinsics.checkNotNullParameter(profile, "profile");
        if (profile.getWeight() != 0.0f && profile.getSex() != null && (clsArr = this.guidPages) != null) {
            Intrinsics.checkNotNull(clsArr);
            if (clsArr.length <= 4) {
                return this.FLAG_SET_COMPLETE;
            }
        }
        if (this.guidPages == null) {
            return this.FLAG_SET_COMPLETE;
        }
        if (profile.getWeight() == 0.0f || profile.getSex() == null) {
            return 0;
        }
        Class<?>[] clsArr2 = this.guidPages;
        Intrinsics.checkNotNull(clsArr2);
        return clsArr2.length - 5;
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

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    @NotNull
    public Intent getMedicalIdHomePageIntent() {
        return new Intent(AppUtil.getApp(), (Class<?>) MedicalIdHomeActivity.class);
    }

    @Nullable
    public final UserProfile getProfile() {
        return this.profile;
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean getShowGuidePageFinish() {
        return GuidePreference.INSTANCE.getShowGuidePageFinish();
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void goFirstGuidPage(@Nullable WeakReference<Activity> referenceActivity, int index) {
        updateGuidPage();
        Class<?>[] clsArr = this.guidPages;
        if (clsArr != null) {
            if (clsArr == null || !(clsArr == null || clsArr.length == 0)) {
                Activity activity = referenceActivity != null ? referenceActivity.get() : null;
                Intent intent = new Intent();
                Logger.i(TAG, "go First Guid Page");
                if (activity != null) {
                    intent.setClass(activity, GuideEditUserInfoActivity.class);
                    activity.startActivity(intent);
                } else {
                    intent.setClass(ApplicationExtKt.getApplication(), GuideEditUserInfoActivity.class);
                    intent.addFlags(268435456);
                    ApplicationExtKt.getApplication().startActivity(intent);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void goMedicalIdEditPage(@Nullable Context context) {
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) MedicalIdEditActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void goNextGuidPage(@Nullable WeakReference<Activity> referenceActivity, int index) {
        Class<?>[] clsArr = this.guidPages;
        if (clsArr != null && index >= 0) {
            Intrinsics.checkNotNull(clsArr);
            if (index < clsArr.length) {
                this.mFirstGuidPage = false;
                Class<?>[] clsArr2 = this.guidPages;
                Intrinsics.checkNotNull(clsArr2);
                Class<?> cls = clsArr2[index];
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("goFirstGuidPage,index:%d,class:%s activity is " + referenceActivity, Arrays.copyOf(new Object[]{Integer.valueOf(index), cls.getName()}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Logger.i(str, new Object[0]);
                Intent intent = new Intent();
                intent.putExtra(GuidePageUtil.KEY_PAGE_INDEX, index);
                intent.putExtra(GuidePageUtil.KEY_PAGE_SKIP_ENABLE, this.showSkipEnable);
                Activity activity = referenceActivity != null ? referenceActivity.get() : null;
                if (activity != null) {
                    intent.setClass(activity, cls);
                    activity.startActivity(intent);
                    return;
                } else {
                    intent.setClass(ApplicationExtKt.getApplication(), cls);
                    intent.addFlags(268435456);
                    ApplicationExtKt.getApplication().startActivity(intent);
                    return;
                }
            }
        }
        Logger.i(TAG, "goNextGuidPage index " + index + ",guidePage " + this.guidPages);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void goSetThreeGoalPage(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, SetGoalPageActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean isDeviceSupportAll() {
        return GoalConfigSupport.INSTANCE.isDeviceSupportAllGoal();
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean isDeviceSupportMhs() {
        return GoalConfigSupport.INSTANCE.isDeviceSupportMhs();
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean isDeviceSupportStand() {
        return GoalConfigSupport.INSTANCE.isDeviceCurrentSupportStand();
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean isFirstGoalGuidPage(int index) {
        return index == 0 && this.mFirstGuidPage;
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public boolean isLastPage(int index) {
        Class<?>[] clsArr = this.guidPages;
        Intrinsics.checkNotNull(clsArr);
        return index == clsArr.length - 1;
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void onFinishClick() {
        this.mFirstGuidPage = false;
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        this.profile = userProfile$default;
        Intrinsics.checkNotNull(userProfile$default);
        boolean zIsEmpty = TextUtils.isEmpty(userProfile$default.getBirth());
        UserProfile userProfile = this.profile;
        Intrinsics.checkNotNull(userProfile);
        boolean zIsEmpty2 = TextUtils.isEmpty(userProfile.getSex());
        UserProfile userProfile2 = this.profile;
        Intrinsics.checkNotNull(userProfile2);
        float weight = userProfile2.getWeight();
        UserProfile userProfile3 = this.profile;
        Intrinsics.checkNotNull(userProfile3);
        Logger.i("onFinishClick, birthday is " + zIsEmpty + ", sex is " + zIsEmpty2 + ", weight is " + weight + ", height is " + userProfile3.getHeight(), new Object[0]);
        UserProfile userProfile4 = this.profile;
        if (userProfile4 != null) {
            Intrinsics.checkNotNull(userProfile4);
            if (!TextUtils.isEmpty(userProfile4.getBirth())) {
                UserProfile userProfile5 = this.profile;
                Intrinsics.checkNotNull(userProfile5);
                if (!TextUtils.isEmpty(userProfile5.getSex())) {
                    UserProfile userProfile6 = this.profile;
                    Intrinsics.checkNotNull(userProfile6);
                    if (userProfile6.getWeight() > 0.0f) {
                        UserProfile userProfile7 = this.profile;
                        Intrinsics.checkNotNull(userProfile7);
                        if (userProfile7.getHeight() > 0.0f) {
                            AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
                        }
                    }
                }
            }
        }
        Logger.i("onFinishClick,goMainActivity\n", new Object[0]);
        destroyActivity();
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void removeDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        GoalConfigSupport.INSTANCE.removeDeviceUpdateAllGoalSupportListener(listener);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void removeGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        GuidePreference.INSTANCE.removeGuideFinishListener(listener);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void requestUserInfoGuide(@NotNull List<Integer> requestList) {
        Intrinsics.checkNotNullParameter(requestList, "requestList");
        Logger.i(TAG, "requestUserInfoGuide list " + requestList);
        if (requestList.isEmpty()) {
            return;
        }
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        ArrayList arrayList = new ArrayList();
        if (requestList.contains(4) && TextUtils.isEmpty(userProfile$default.getBirth())) {
            arrayList.add(GuideEditBirthdayActivity.class);
        }
        if (requestList.contains(8) && TextUtils.isEmpty(userProfile$default.getSex())) {
            arrayList.add(GuideEditGenderActivity.class);
        }
        if (requestList.contains(1) && userProfile$default.getHeight() == 0.0f) {
            arrayList.add(GuideEditHeightActivity.class);
        }
        if (requestList.contains(2) && userProfile$default.getWeight() == 0.0f) {
            arrayList.add(GuideEditWeightActivity.class);
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(GuideBodyCompositionFinishActivity.class);
        }
        Logger.i(TAG, "final need request guide page list size " + arrayList.size());
        if (!arrayList.isEmpty()) {
            Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            this.guidPages = clsArr;
            this.showSkipEnable = false;
            if (clsArr != null) {
                Intrinsics.checkNotNull(clsArr);
                if (!(clsArr.length == 0)) {
                    goNextGuidPage(null, 0);
                }
            }
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                return;
            }
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    @NotNull
    public String setDefaultSupport(@NotNull UserProfile data, boolean supportMhs) {
        Intrinsics.checkNotNullParameter(data, "data");
        return GoalConfigSupport.INSTANCE.setDefaultSupport(data, supportMhs);
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setProfile(@Nullable UserProfile userProfile) {
        this.profile = userProfile;
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void setShowGuidePageFinish(boolean finished) {
        GuidePreference.INSTANCE.setShowGuidePageFinish(finished);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.xiaomi.fitness.baseui.dialog.CommonDialog] */
    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void showUserInfoDialog(@NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (CommonDialog) activity.getSupportFragmentManager().l0("userInfo");
        activity.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.xiaomi.fitness.userinfo.SetPageManagerImpl.showUserInfoDialog.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    CommonDialog<?> commonDialog = objectRef.element;
                    if (commonDialog != null) {
                        commonDialog.dismissAllowingStateLoss();
                    }
                    source.getLifecycle().removeObserver(this);
                }
            }
        });
        CommonDialog commonDialog = (CommonDialog) objectRef.element;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (objectRef.element == 0) {
                ?? Create = new CommonDialog.c("userInfo").setDialogDescription(o1j.q).setNegativeText(o1j.R).setPositiveText(o1j.f0).create();
                objectRef.element = Create;
                if (Create != 0) {
                    Create.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.userinfo.SetPageManagerImpl.showUserInfoDialog.2
                        @Override // defpackage.av6
                        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                            Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                            Intrinsics.checkNotNullParameter(dialog, "dialog");
                            super.onDialogClick(dialogName, dialog, which);
                            if (which == -2) {
                                dialog.dismiss();
                            } else {
                                if (which != -1) {
                                    return;
                                }
                                SetPageManagerImpl.this.goFirstGuidPage(new WeakReference<>(activity), 0);
                                dialog.dismiss();
                            }
                        }
                    });
                }
            }
            CommonDialog commonDialog2 = (CommonDialog) objectRef.element;
            if (commonDialog2 != null) {
                commonDialog2.showIfNeed(activity.getSupportFragmentManager());
            }
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void startGoalManagerActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, GoalManagerActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void startUserIndicatorsActivity(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, UserIndicatorsActivity.class);
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.user.info.export.SetPageManager
    public void startUserIndicatorsActivityForCreateAbilityPlan(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, UserIndicatorsActivity.class);
        intent.putExtra("from", 2);
        activity.startActivity(intent);
    }
}
