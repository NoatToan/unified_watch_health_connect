package com.xiaomi.fitness.mine.v4;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.example.habit.export.HabitBean;
import com.example.habit.export.HabitManager;
import com.example.habit.export.HabitManagerKt;
import com.example.habit.export.Today;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemV2;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.mine.MineModel;
import com.xiaomi.fitness.mine.company.CompanyUserEntranceResult;
import com.xiaomi.fitness.mine.company.CompanyUserRepository;
import com.xiaomi.fitness.mine.export.IWebSyncKt;
import com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportItem;
import com.xiaomi.fitness.mine.weeklyreport.WeekReportRequest;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.m0j;
import defpackage.pji;
import defpackage.vni;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002efB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010#\u001a\u00020$2\"\u0010%\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020$\u0018\u00010'0&J\f\u0010*\u001a\u00020(*\u00020)H\u0002J\u0006\u00100\u001a\u00020$J\u0006\u00107\u001a\u00020$J\u0006\u0010;\u001a\u00020$J\u0006\u0010F\u001a\u00020$J\b\u0010G\u001a\u00020$H\u0007J\u0006\u0010K\u001a\u00020$J\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MJ\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MJ\b\u0010P\u001a\u00020(H\u0002J\u0006\u0010Q\u001a\u00020$J\b\u0010R\u001a\u00020$H\u0002J\b\u0010S\u001a\u00020$H\u0002J&\u0010Y\u001a\u00020$2\u001e\u0010Z\u001a\u001a\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020$0[J\u0006\u0010^\u001a\u00020$J\u0006\u0010c\u001a\u00020$R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020,¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0019\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050,¢\u0006\b\n\u0000\u001a\u0004\b6\u0010/R\u0019\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090,¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0,¢\u0006\b\n\u0000\u001a\u0004\b>\u0010/R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0,¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0,¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/R \u0010T\u001a\b\u0012\u0004\u0012\u00020U0,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010/\"\u0004\bW\u0010XR#\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b^\u0010/R#\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\bc\u0010/¨\u0006g"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/mine/MineModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "companyUserRepository", "Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;", "getCompanyUserRepository", "()Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;", "setCompanyUserRepository", "(Lcom/xiaomi/fitness/mine/company/CompanyUserRepository;)V", "appUpgradeHelper", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "getAppUpgradeHelper", "()Lcom/example/appupgrade/export/AppUpgradeHelper;", "setAppUpgradeHelper", "(Lcom/example/appupgrade/export/AppUpgradeHelper;)V", "weekReportRequest", "Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest;", "getWeekReportRequest", "()Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest;", "setWeekReportRequest", "(Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportRequest;)V", "needShowWeekReport", "", "needShowTime", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "", "", "isInThisWeek", "accountCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getAccountCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "onAccountCoreInfoChange", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getUserProfile", "userWearMedalIcon", "", "getUserWearMedalIcon", "onUserProfileChange", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemV2;", "getBannerItem", "queryBannerListV2LiveData", "companyUserEntranceResult", "Lcom/xiaomi/fitness/mine/company/CompanyUserEntranceResult;", "getCompanyUserEntranceResult", "remoteItemList", "", "Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "getRemoteItemList", "itemList", "vipItem", "dataManagerItem", "updateCompanyUserEntranceResult", "freshItemList", "updateHabit", "Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel$UpdateHabit;", "getUpdateHabit", "onHabitRefresh", "queryProcessPkCountLiveData", "Landroidx/lifecycle/LiveData;", "", "queryPkEntranceModel", "whetherToShowAidongPaymentEntrance", "showOrHideAidongCoursePaymentEntrance", "addVipItem", "sendGetAidongVipUseInfoRequestOnce", "medalToPopLiveData", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getMedalToPopLiveData", "setMedalToPopLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getWearMedalDetail", "success", "Lkotlin/Function3;", "vipInfo", "Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "getVipInfo", "vipInfo$delegate", "Lkotlin/Lazy;", "vipConfig", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", "getVipConfig", "vipConfig$delegate", "Companion", "UpdateHabit", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineV4ViewModel extends BaseViewModel<MineModel> {

    @NotNull
    public static final String TAG_MINE = "MineV4ViewModel";
    public AppUpgradeHelper appUpgradeHelper;
    public CompanyUserRepository companyUserRepository;
    public AccountManager mAccountManager;
    public UserInfoManager mUserInfoManager;
    public WeekReportRequest weekReportRequest;

    @NotNull
    private final MutableLiveData<AccountCoreInfo> accountCoreInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<UserProfile> userProfile = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<String> userWearMedalIcon = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<BannerItemV2> bannerItem = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<CompanyUserEntranceResult> companyUserEntranceResult = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<MineItemListModel.MineItem>> remoteItemList = new MutableLiveData<>();

    @NotNull
    private final List<MineItemListModel.MineItem> itemList = new ArrayList();

    @NotNull
    private final MineItemListModel.MineItem vipItem = new MineItemListModel.MineItem(5, ResourceExtKt.getString(m0j.J), vni.K, true, null, null, null, null, 240, null);

    @NotNull
    private final MineItemListModel.MineItem dataManagerItem = new MineItemListModel.MineItem(4, ResourceExtKt.getString(m0j.U), vni.u, true, null, null, null, null, 240, null);

    @NotNull
    private final MutableLiveData<UpdateHabit> updateHabit = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<PopMedalData> medalToPopLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: vipInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vipInfo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o3g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MineV4ViewModel.vipInfo_delegate$lambda$5();
        }
    });

    /* JADX INFO: renamed from: vipConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vipConfig = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p3g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MineV4ViewModel.vipConfig_delegate$lambda$6();
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel$UpdateHabit;", "", "name", "", "icon", "padIcon", "isMyHabitBean", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getIcon", "getPadIcon", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateHabit {

        @NotNull
        private final String icon;
        private final boolean isMyHabitBean;

        @NotNull
        private final String name;

        @NotNull
        private final String padIcon;

        public UpdateHabit(@NotNull String name, @NotNull String icon, @NotNull String padIcon, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(padIcon, "padIcon");
            this.name = name;
            this.icon = icon;
            this.padIcon = padIcon;
            this.isMyHabitBean = z;
        }

        public static /* synthetic */ UpdateHabit copy$default(UpdateHabit updateHabit, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateHabit.name;
            }
            if ((i & 2) != 0) {
                str2 = updateHabit.icon;
            }
            if ((i & 4) != 0) {
                str3 = updateHabit.padIcon;
            }
            if ((i & 8) != 0) {
                z = updateHabit.isMyHabitBean;
            }
            return updateHabit.copy(str, str2, str3, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPadIcon() {
            return this.padIcon;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMyHabitBean() {
            return this.isMyHabitBean;
        }

        @NotNull
        public final UpdateHabit copy(@NotNull String name, @NotNull String icon, @NotNull String padIcon, boolean isMyHabitBean) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(padIcon, "padIcon");
            return new UpdateHabit(name, icon, padIcon, isMyHabitBean);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateHabit)) {
                return false;
            }
            UpdateHabit updateHabit = (UpdateHabit) other;
            return Intrinsics.areEqual(this.name, updateHabit.name) && Intrinsics.areEqual(this.icon, updateHabit.icon) && Intrinsics.areEqual(this.padIcon, updateHabit.padIcon) && this.isMyHabitBean == updateHabit.isMyHabitBean;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPadIcon() {
            return this.padIcon;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.icon.hashCode()) * 31) + this.padIcon.hashCode()) * 31) + Boolean.hashCode(this.isMyHabitBean);
        }

        public final boolean isMyHabitBean() {
            return this.isMyHabitBean;
        }

        @NotNull
        public String toString() {
            return "UpdateHabit(name=" + this.name + ", icon=" + this.icon + ", padIcon=" + this.padIcon + ", isMyHabitBean=" + this.isMyHabitBean + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$getVipConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$getVipConfig$1", f = "MineV4ViewModel.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VipConfigInfo vipConfigInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                    this.label = 1;
                    obj = membershipHelperExtKt.getOperationConfig(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                vipConfigInfo = (VipConfigInfo) obj;
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e(MineV4ViewModel.TAG_MINE, "getVipInfo fail: " + e);
                vipConfigInfo = null;
            }
            MineV4ViewModel.this.getVipConfig().postValue(vipConfigInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$getVipInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$getVipInfo$1", f = "MineV4ViewModel.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C26451(Continuation<? super C26451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26451(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            VipInfo vipInfo = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
                    this.label = 1;
                    obj = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt, false, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                vipInfo = (VipInfo) obj;
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e(MineV4ViewModel.TAG_MINE, "getVipInfo fail: " + e);
            }
            MineV4ViewModel.this.getVipInfo().postValue(vipInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$needShowWeekReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$needShowWeekReport$1", f = "MineV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WeakReference<Function2<Boolean, Long, Unit>> $needShowTime;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26461(WeakReference<Function2<Boolean, Long, Unit>> weakReference, Continuation<? super C26461> continuation) {
            super(2, continuation);
            this.$needShowTime = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WeakReference weakReference, MineV4ViewModel mineV4ViewModel, List list) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                Function2 function2 = (Function2) weakReference.get();
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, null);
                }
            } else {
                long weeklyTimeStamp = ((WeekReportItem) list.get(0)).getWeeklyTimeStamp();
                if (mineV4ViewModel.isInThisWeek(weeklyTimeStamp)) {
                    if (weeklyTimeStamp > WeeklyReportSharePreference.INSTANCE.getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP()) {
                        Function2 function3 = (Function2) weakReference.get();
                        if (function3 != null) {
                            function3.invoke(Boolean.TRUE, Long.valueOf(weeklyTimeStamp));
                        }
                    } else {
                        Function2 function4 = (Function2) weakReference.get();
                        if (function4 != null) {
                            function4.invoke(Boolean.FALSE, null);
                        }
                    }
                } else if (weeklyTimeStamp > WeeklyReportSharePreference.INSTANCE.getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP()) {
                    Function2 function5 = (Function2) weakReference.get();
                    if (function5 != null) {
                        function5.invoke(Boolean.TRUE, Long.valueOf(weeklyTimeStamp));
                    }
                } else {
                    Function2 function6 = (Function2) weakReference.get();
                    if (function6 != null) {
                        function6.invoke(Boolean.FALSE, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26461(this.$needShowTime, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeekReportRequest weekReportRequest = MineV4ViewModel.this.getWeekReportRequest();
            final WeakReference<Function2<Boolean, Long, Unit>> weakReference = this.$needShowTime;
            final MineV4ViewModel mineV4ViewModel = MineV4ViewModel.this;
            weekReportRequest.getWeekReportList(new Function1() { // from class: com.xiaomi.fitness.mine.v4.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MineV4ViewModel.C26461.invokeSuspend$lambda$0(weakReference, mineV4ViewModel, (List) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$onAccountCoreInfoChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$onAccountCoreInfoChange$1", f = "MineV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C26471(Continuation<? super C26471> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(MineV4ViewModel mineV4ViewModel, AccountCoreInfo accountCoreInfo) {
            Logger.d(mineV4ViewModel.getTAG(), "getAccountCoreInfo is " + accountCoreInfo);
            mineV4ViewModel.getAccountCoreInfo().postValue(accountCoreInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26471(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserInfoManager mUserInfoManager = MineV4ViewModel.this.getMUserInfoManager();
            final MineV4ViewModel mineV4ViewModel = MineV4ViewModel.this;
            mUserInfoManager.getAccountCoreInfo(true, new Function1() { // from class: com.xiaomi.fitness.mine.v4.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return MineV4ViewModel.C26471.invokeSuspend$lambda$0(mineV4ViewModel, (AccountCoreInfo) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$onHabitRefresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$onHabitRefresh$1", f = "MineV4ViewModel.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$onHabitRefresh$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$onHabitRefresh$1$1", f = "MineV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMineV4ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineV4ViewModel.kt\ncom/xiaomi/fitness/mine/v4/MineV4ViewModel$onHabitRefresh$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,446:1\n1863#2,2:447\n*S KotlinDebug\n*F\n+ 1 MineV4ViewModel.kt\ncom/xiaomi/fitness/mine/v4/MineV4ViewModel$onHabitRefresh$1$1\n*L\n332#1:447,2\n*E\n"})
        public static final class C06441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MineV4ViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06441(MineV4ViewModel mineV4ViewModel, Continuation<? super C06441> continuation) {
                super(2, continuation);
                this.this$0 = mineV4ViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5(final MineV4ViewModel mineV4ViewModel, List list) {
                if (list.isEmpty()) {
                    HabitManagerKt.getHabitManager().loadHabitList(new Function1() { // from class: com.xiaomi.fitness.mine.v4.c
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$5$lambda$0(mineV4ViewModel, (ArrayList) obj);
                        }
                    }, new Function1() { // from class: com.xiaomi.fitness.mine.v4.d
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$5$lambda$1(mineV4ViewModel, (String) obj);
                        }
                    });
                } else {
                    Iterator it = list.iterator();
                    long j = Long.MAX_VALUE;
                    Today today = null;
                    while (it.hasNext()) {
                        Today today2 = (Today) it.next();
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, today2.getPunchTime().getHour());
                        calendar.set(12, today2.getPunchTime().getMinute());
                        long timeInMillis = calendar.getTimeInMillis();
                        if (System.currentTimeMillis() + 1 <= timeInMillis && timeInMillis < j) {
                            today = today2;
                            j = timeInMillis;
                        }
                    }
                    if (today == null) {
                        HabitManagerKt.getHabitManager().loadHabitList(new Function1() { // from class: com.xiaomi.fitness.mine.v4.e
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$5$lambda$3(mineV4ViewModel, (ArrayList) obj);
                            }
                        }, new Function1() { // from class: com.xiaomi.fitness.mine.v4.f
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$5$lambda$4(mineV4ViewModel, (String) obj);
                            }
                        });
                    } else {
                        mineV4ViewModel.getUpdateHabit().postValue(new UpdateHabit(today.getName(), today.getIcon(), today.getIconPad(), true));
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5$lambda$0(MineV4ViewModel mineV4ViewModel, ArrayList arrayList) {
                HabitBean habitBean = (HabitBean) CollectionsKt___CollectionsKt.random(arrayList, Random.Default);
                MutableLiveData<UpdateHabit> updateHabit = mineV4ViewModel.getUpdateHabit();
                String name = habitBean.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                String icon = habitBean.icon;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                String iconPad = habitBean.iconPad;
                Intrinsics.checkNotNullExpressionValue(iconPad, "iconPad");
                updateHabit.postValue(new UpdateHabit(name, icon, iconPad, false));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5$lambda$1(MineV4ViewModel mineV4ViewModel, String str) {
                mineV4ViewModel.getUpdateHabit().postValue(null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5$lambda$3(MineV4ViewModel mineV4ViewModel, ArrayList arrayList) {
                HabitBean habitBean = (HabitBean) CollectionsKt___CollectionsKt.random(arrayList, Random.Default);
                MutableLiveData<UpdateHabit> updateHabit = mineV4ViewModel.getUpdateHabit();
                String name = habitBean.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                String icon = habitBean.icon;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                String iconPad = habitBean.iconPad;
                Intrinsics.checkNotNullExpressionValue(iconPad, "iconPad");
                updateHabit.postValue(new UpdateHabit(name, icon, iconPad, false));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5$lambda$4(MineV4ViewModel mineV4ViewModel, String str) {
                mineV4ViewModel.getUpdateHabit().postValue(null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$8(final MineV4ViewModel mineV4ViewModel) {
                HabitManagerKt.getHabitManager().loadHabitList(new Function1() { // from class: com.xiaomi.fitness.mine.v4.g
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$8$lambda$6(mineV4ViewModel, (ArrayList) obj);
                    }
                }, new Function1() { // from class: com.xiaomi.fitness.mine.v4.h
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$8$lambda$7(mineV4ViewModel, (String) obj);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$8$lambda$6(MineV4ViewModel mineV4ViewModel, ArrayList arrayList) {
                HabitBean habitBean = (HabitBean) CollectionsKt___CollectionsKt.random(arrayList, Random.Default);
                MutableLiveData<UpdateHabit> updateHabit = mineV4ViewModel.getUpdateHabit();
                String name = habitBean.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                String icon = habitBean.icon;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                String iconPad = habitBean.iconPad;
                Intrinsics.checkNotNullExpressionValue(iconPad, "iconPad");
                updateHabit.postValue(new UpdateHabit(name, icon, iconPad, false));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$8$lambda$7(MineV4ViewModel mineV4ViewModel, String str) {
                mineV4ViewModel.getUpdateHabit().postValue(null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06441(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Application application;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UIUtils uIUtils = UIUtils.INSTANCE;
                if (uIUtils.isTablet() && (application = ApplicationExtKt.getApplication()) != null) {
                    uIUtils.isLandscape(application);
                }
                HabitManager habitManager = HabitManagerKt.getHabitManager();
                final MineV4ViewModel mineV4ViewModel = this.this$0;
                Function1<? super List<Today>, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.mine.v4.i
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$5(mineV4ViewModel, (List) obj2);
                    }
                };
                final MineV4ViewModel mineV4ViewModel2 = this.this$0;
                habitManager.loadTodayHabitList(function1, new Function0() { // from class: com.xiaomi.fitness.mine.v4.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MineV4ViewModel.C26481.C06441.invokeSuspend$lambda$8(mineV4ViewModel2);
                    }
                });
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C26481(Continuation<? super C26481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26481(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06441 c06441 = new C06441(MineV4ViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06441, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$onUserProfileChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$onUserProfileChange$1", f = "MineV4ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C26491(Continuation<? super C26491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26491(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MineV4ViewModel.this.getUserProfile().postValue(UserInfoManager.getUserProfile$default(MineV4ViewModel.this.getMUserInfoManager(), false, 1, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$queryBannerListV2LiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$queryBannerListV2LiveData$1", f = "MineV4ViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$queryBannerListV2LiveData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$queryBannerListV2LiveData$1$1", f = "MineV4ViewModel.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMineV4ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineV4ViewModel.kt\ncom/xiaomi/fitness/mine/v4/MineV4ViewModel$queryBannerListV2LiveData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,446:1\n1485#2:447\n1510#2,3:448\n1513#2,3:458\n1246#2,4:463\n381#3,7:451\n462#3:461\n412#3:462\n*S KotlinDebug\n*F\n+ 1 MineV4ViewModel.kt\ncom/xiaomi/fitness/mine/v4/MineV4ViewModel$queryBannerListV2LiveData$1$1\n*L\n168#1:447\n168#1:448,3\n168#1:458,3\n169#1:463,4\n168#1:451,7\n169#1:461\n169#1:462\n*E\n"})
        public static final class C06451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MineV4ViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06451(MineV4ViewModel mineV4ViewModel, Continuation<? super C06451> continuation) {
                super(2, continuation);
                this.this$0 = mineV4ViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06451(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
                    List listListOf = CollectionsKt__CollectionsJVMKt.listOf(Boxing.boxInt(14));
                    String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null);
                    this.label = 1;
                    obj = instance.getBannerListV2(bannerRequestParamV2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (List) obj) {
                    Integer numBoxInt = Boxing.boxInt(((BannerItemV2) obj2).getResourceId());
                    Object arrayList = linkedHashMap.get(numBoxInt);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(numBoxInt, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (BannerItemV2) CollectionsKt___CollectionsKt.first((List) entry.getValue()));
                }
                BannerItemV2 bannerItemV2 = (BannerItemV2) linkedHashMap2.get(Boxing.boxInt(14));
                Logger.d(this.this$0.getTAG(), "queryBannerListV2LiveData:" + bannerItemV2);
                this.this$0.getBannerItem().postValue(bannerItemV2);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C26501(Continuation<? super C26501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26501(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06451 c06451 = new C06451(MineV4ViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06451, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$updateCompanyUserEntranceResult$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$updateCompanyUserEntranceResult$1", f = "MineV4ViewModel.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    public static final class C26511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.mine.v4.MineV4ViewModel$updateCompanyUserEntranceResult$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.mine.v4.MineV4ViewModel$updateCompanyUserEntranceResult$1$1", f = "MineV4ViewModel.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ MineV4ViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06461(MineV4ViewModel mineV4ViewModel, Continuation<? super C06461> continuation) {
                super(2, continuation);
                this.this$0 = mineV4ViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06461(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableLiveData mutableLiveData;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableLiveData<CompanyUserEntranceResult> companyUserEntranceResult = this.this$0.getCompanyUserEntranceResult();
                    CompanyUserRepository companyUserRepository = this.this$0.getCompanyUserRepository();
                    this.L$0 = companyUserEntranceResult;
                    this.label = 1;
                    Object companyUserEntrance = companyUserRepository.getCompanyUserEntrance(this);
                    if (companyUserEntrance == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = companyUserEntranceResult;
                    obj = companyUserEntrance;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableLiveData.postValue(obj);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C26511(Continuation<? super C26511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineV4ViewModel.this.new C26511(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06461 c06461 = new C06461(MineV4ViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06461, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C26511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addVipItem() {
        if (this.itemList.contains(this.vipItem)) {
            return;
        }
        sendGetAidongVipUseInfoRequestOnce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedalDetail$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInThisWeek(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(1);
        calendar.setTime(Calendar.getInstance().getTime());
        calendar.set(7, 2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() / ((long) 1000);
        Logger.d("WeekReportRequest", "isInThisWeek:" + timeInMillis);
        return j >= timeInMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryPkEntranceModel$lambda$1(EntranceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPkCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int queryProcessPkCountLiveData$lambda$0(int i) {
        return i;
    }

    private final void sendGetAidongVipUseInfoRequestOnce() {
        CourseApiKt.getCourseApi().getAidongMemberUserInfo(new Function1() { // from class: q3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineV4ViewModel.sendGetAidongVipUseInfoRequestOnce$lambda$2(this.f31043a, (AidongVipUserInfo) obj);
            }
        }, new Function1() { // from class: r3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineV4ViewModel.sendGetAidongVipUseInfoRequestOnce$lambda$3((ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendGetAidongVipUseInfoRequestOnce$lambda$2(MineV4ViewModel this$0, AidongVipUserInfo userInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        AnyExtKt.main$default(null, new MineV4ViewModel$sendGetAidongVipUseInfoRequestOnce$1$1(this$0, userInfo, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendGetAidongVipUseInfoRequestOnce$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData vipConfig_delegate$lambda$6() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData vipInfo_delegate$lambda$5() {
        return new MutableLiveData();
    }

    private final boolean whetherToShowAidongPaymentEntrance() {
        return !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && IWebSyncKt.getSHOW_AIDONG_PAYMENT_ENTRANCE();
    }

    @SuppressLint({"ResourceAsColor"})
    public final void freshItemList() {
        this.itemList.clear();
        AppUtil appUtil = AppUtil.INSTANCE;
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            this.companyUserEntranceResult.postValue(null);
        } else {
            updateCompanyUserEntranceResult();
        }
        if (!appUtil.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            this.itemList.add(new MineItemListModel.MineItem(1, ResourceExtKt.getString(m0j.K), vni.H, true, null, null, null, null, 240, null));
        }
        this.itemList.add(new MineItemListModel.MineItem(3, ResourceExtKt.getString(m0j.i), vni.p, true, null, null, null, null, 240, null));
        this.itemList.add(new MineItemListModel.MineItem(4, ResourceExtKt.getString(m0j.U), vni.u, true, null, null, null, null, 240, null));
        if (whetherToShowAidongPaymentEntrance()) {
            addVipItem();
        }
        this.itemList.add(new MineItemListModel.MineItem(6, ResourceExtKt.getString(m0j.w), vni.f37067r, true, null, null, null, null, 240, null));
        this.itemList.add(new MineItemListModel.MineItem(8, ResourceExtKt.getString(m0j.g0), vni.w, true, null, null, null, null, 240, null));
        this.itemList.add(new MineItemListModel.MineItem(9, ResourceExtKt.getString(m0j.t), vni.m, true, null, null, null, null, 240, null));
        if (!appUtil.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            this.itemList.add(new MineItemListModel.MineItem(7, ResourceExtKt.getString(m0j.x), vni.s, true, null, null, null, null, 240, null));
        }
        if (!appUtil.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            Integer numValueOf = getAppUpgradeHelper().hasNewVersion() ? Integer.valueOf(ExtUtilsKt.getColor(pji.f30466b)) : null;
            this.itemList.add(new MineItemListModel.MineItem(10, ResourceExtKt.getString(m0j.n0), vni.I, true, null, null, "V" + AppUtil.getVersionName(), numValueOf));
        }
        this.itemList.add(new MineItemListModel.MineItem(11, ResourceExtKt.getString(m0j.c), vni.f, true, null, null, null, null, 240, null));
        this.remoteItemList.postValue(this.itemList);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getAccountCoreInfo() {
        return this.accountCoreInfo;
    }

    @NotNull
    public final AppUpgradeHelper getAppUpgradeHelper() {
        AppUpgradeHelper appUpgradeHelper = this.appUpgradeHelper;
        if (appUpgradeHelper != null) {
            return appUpgradeHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appUpgradeHelper");
        return null;
    }

    @NotNull
    public final MutableLiveData<BannerItemV2> getBannerItem() {
        return this.bannerItem;
    }

    @NotNull
    public final MutableLiveData<CompanyUserEntranceResult> getCompanyUserEntranceResult() {
        return this.companyUserEntranceResult;
    }

    @NotNull
    public final CompanyUserRepository getCompanyUserRepository() {
        CompanyUserRepository companyUserRepository = this.companyUserRepository;
        if (companyUserRepository != null) {
            return companyUserRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("companyUserRepository");
        return null;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
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

    @NotNull
    public final MutableLiveData<PopMedalData> getMedalToPopLiveData() {
        return this.medalToPopLiveData;
    }

    @NotNull
    public final MutableLiveData<List<MineItemListModel.MineItem>> getRemoteItemList() {
        return this.remoteItemList;
    }

    @NotNull
    public final MutableLiveData<UpdateHabit> getUpdateHabit() {
        return this.updateHabit;
    }

    @NotNull
    public final MutableLiveData<UserProfile> getUserProfile() {
        return this.userProfile;
    }

    @NotNull
    public final MutableLiveData<String> getUserWearMedalIcon() {
        return this.userWearMedalIcon;
    }

    @NotNull
    public final MutableLiveData<VipConfigInfo> getVipConfig() {
        return (MutableLiveData) this.vipConfig.getValue();
    }

    @NotNull
    public final MutableLiveData<VipInfo> getVipInfo() {
        return (MutableLiveData) this.vipInfo.getValue();
    }

    public final void getWearMedalDetail(@NotNull Function3<? super Long, ? super String, ? super Integer, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getWearMedalDetail(success, new Function1() { // from class: n3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineV4ViewModel.getWearMedalDetail$lambda$4((String) obj);
            }
        });
    }

    @NotNull
    public final WeekReportRequest getWeekReportRequest() {
        WeekReportRequest weekReportRequest = this.weekReportRequest;
        if (weekReportRequest != null) {
            return weekReportRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("weekReportRequest");
        return null;
    }

    public final void needShowWeekReport(@NotNull WeakReference<Function2<Boolean, Long, Unit>> needShowTime) {
        Intrinsics.checkNotNullParameter(needShowTime, "needShowTime");
        WeeklyReportSharePreference weeklyReportSharePreference = WeeklyReportSharePreference.INSTANCE;
        if (weeklyReportSharePreference.getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP() == 0 || !isInThisWeek(weeklyReportSharePreference.getKEY_WEEKLY_REPORT_REVIEW_TIME_TEMP())) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26461(needShowTime, null), 3, null);
            return;
        }
        Function2<Boolean, Long, Unit> function2 = needShowTime.get();
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, null);
        }
    }

    public final void onAccountCoreInfoChange() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26471(null), 3, null);
    }

    public final void onHabitRefresh() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26481(null), 3, null);
    }

    public final void onUserProfileChange() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26491(null), 3, null);
    }

    public final void queryBannerListV2LiveData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26501(null), 3, null);
    }

    @NotNull
    public final LiveData<Integer> queryPkEntranceModel() {
        return Transformations.map(ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).queryPkEntranceModel(), new Function1() { // from class: t3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(MineV4ViewModel.queryPkEntranceModel$lambda$1((EntranceModel) obj));
            }
        });
    }

    @NotNull
    public final LiveData<Integer> queryProcessPkCountLiveData() {
        return Transformations.map(ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).getPkCountInProgress(), new Function1() { // from class: s3g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(MineV4ViewModel.queryProcessPkCountLiveData$lambda$0(((Integer) obj).intValue()));
            }
        });
    }

    public final void setAppUpgradeHelper(@NotNull AppUpgradeHelper appUpgradeHelper) {
        Intrinsics.checkNotNullParameter(appUpgradeHelper, "<set-?>");
        this.appUpgradeHelper = appUpgradeHelper;
    }

    public final void setCompanyUserRepository(@NotNull CompanyUserRepository companyUserRepository) {
        Intrinsics.checkNotNullParameter(companyUserRepository, "<set-?>");
        this.companyUserRepository = companyUserRepository;
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setMedalToPopLiveData(@NotNull MutableLiveData<PopMedalData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalToPopLiveData = mutableLiveData;
    }

    public final void setWeekReportRequest(@NotNull WeekReportRequest weekReportRequest) {
        Intrinsics.checkNotNullParameter(weekReportRequest, "<set-?>");
        this.weekReportRequest = weekReportRequest;
    }

    public final void showOrHideAidongCoursePaymentEntrance() {
        if (whetherToShowAidongPaymentEntrance()) {
            addVipItem();
            this.remoteItemList.postValue(this.itemList);
        }
    }

    public final void updateCompanyUserEntranceResult() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C26511(null), 3, null);
    }

    /* JADX INFO: renamed from: getVipConfig, reason: collision with other method in class */
    public final void m500getVipConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: getVipInfo, reason: collision with other method in class */
    public final void m501getVipInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C26451(null), 2, null);
    }
}
