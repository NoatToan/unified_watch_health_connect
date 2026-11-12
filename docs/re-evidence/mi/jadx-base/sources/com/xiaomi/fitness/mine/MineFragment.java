package com.xiaomi.fitness.mine;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.example.habit.export.HabitManagerKt;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.IBanner;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.AidongVipUserInfo;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.widget.ScrollTitleBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.BaseMainFragment;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.Medal;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.mine.MineFragment;
import com.xiaomi.fitness.mine.company.CompanyUserEntranceResult;
import com.xiaomi.fitness.mine.company.CompanyUserWebViewActivity;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.mine.export.IWebSyncKt;
import com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity;
import com.xiaomi.fitness.mine.preference.WeeklyReportSharePreference;
import com.xiaomi.fitness.mine.weeklyreport.WeeklyReportAuthActivity;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.rn.export.DeviceShareManager;
import com.xiaomi.fitness.rn.export.DeviceShareManagerExtKt;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.util.MineOneTrack;
import com.xiaomi.fitness.util.MineUtil;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xms.wearable.export.XmsManager;
import com.xms.wearable.export.XmsManagerExtKt;
import defpackage.av6;
import defpackage.f0g;
import defpackage.jrk;
import defpackage.k47;
import defpackage.lri;
import defpackage.m0j;
import defpackage.nli;
import defpackage.pji;
import defpackage.rjh;
import defpackage.rui;
import defpackage.vni;
import defpackage.zr3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 u2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001uB\u0011\b\u0007\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bs\u0010tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020+2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020+2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020)¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0014¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0004H\u0014¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u0006J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010<\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010\u000b\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082D¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020h8\u0002X\u0082D¢\u0006\u0006\n\u0004\bn\u0010jR$\u0010p\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010j¨\u0006v"}, d2 = {"Lcom/xiaomi/fitness/mine/MineFragment;", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "Lcom/xiaomi/fitness/mine/MineViewModel;", "Lf0g;", "", "startObservingPopMedalData", "()V", "initBanner", "addPKEntranceOnClickListener", "", "whetherToShowAidongPaymentEntrance", "()Z", "showOrHideAidongCoursePaymentEntrance", "loadMyHabitList", "setTitleView", "setUserInformation", "setTitleBarColor", "initView", "Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;", "iWebSyncImpl", "showWebSyncDialogIfNeed", "(Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;)Z", "showAidongCompanyUserEntrance", "showPopMedalDialogIfNeed", "handlePopMedalData", "showSyncWebDialog", "(Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;)V", "refreshPadding", "oneTrackRelativeCareEntranceClick", "oneTrackRelativeCareEntranceExpose", "initAidongPaymentEntrance", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lf0g;)V", "", SleepAnalyzerAlpha.NAME_ALPHA, "", "baseColor", "getColorWithAlpha", "(FI)I", "normalColor", "darkRatio", "darkColor", "(IF)I", "initUserInfo", "onVisible", "onInvisible", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "getContentView", "()Landroid/view/View;", "Lcom/xiaomi/fitness/main/export/MainHelper;", "mMainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "mMiAccountManager", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "getMMiAccountManager", "()Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "setMMiAccountManager", "(Lcom/xiaomi/fitness/account/manager/IMiAccountManager;)V", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "mAccoutManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccoutManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccoutManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "appUpgradeHelper", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "getAppUpgradeHelper", "()Lcom/example/appupgrade/export/AppUpgradeHelper;", "setAppUpgradeHelper", "(Lcom/example/appupgrade/export/AppUpgradeHelper;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "xiaomiCoreInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "setXiaomiCoreInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;)V", "habitNum", "I", "getHabitNum", "()I", "setHabitNum", "(I)V", "mStartSportImport", "Z", "getMStartSportImport", "setMStartSportImport", "(Z)V", "", "chinaRegion", "Ljava/lang/String;", "", "mMinePageStartShowTime", "J", "MINE_TAB_PAGE_NAME", "Lkotlin/Function1;", "mSelectModeListener", "Lkotlin/jvm/functions/Function1;", "curtDeviceModelStr", "<init>", "(Lcom/xiaomi/fitness/main/export/MainHelper;)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineFragment.kt\ncom/xiaomi/fitness/mine/MineFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,1106:1\n1#2:1107\n54#3,3:1108\n24#3:1111\n59#3,6:1112\n54#3,3:1118\n24#3:1121\n59#3,6:1122\n54#3,3:1128\n24#3:1131\n59#3,4:1132\n63#3,2:1145\n844#4,9:1136\n*S KotlinDebug\n*F\n+ 1 MineFragment.kt\ncom/xiaomi/fitness/mine/MineFragment\n*L\n240#1:1108,3\n240#1:1111\n240#1:1112,6\n514#1:1118,3\n514#1:1121\n514#1:1122,6\n607#1:1128,3\n607#1:1131\n607#1:1132,4\n607#1:1145,2\n609#1:1136,9\n*E\n"})
public final class MineFragment extends Hilt_MineFragment<MineViewModel, f0g> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_PARAMS_MEDAL_CLASS = "key_params_medal_class";

    @NotNull
    public static final String KEY_PARAMS_MEDAL_ID = "key_params_medal_id";

    @NotNull
    public static final String KEY_PARAMS_MEDAL_TYPE = "key_params_medal_type";

    @NotNull
    public static final String TAG = "MineFragment";

    @NotNull
    private final String MINE_TAB_PAGE_NAME;
    public AppUpgradeHelper appUpgradeHelper;

    @NotNull
    private final String chinaRegion;

    @Nullable
    private String curtDeviceModelStr;
    private int habitNum;
    public AccountManager mAccoutManager;

    @NotNull
    private final MainHelper mMainHelper;
    public IMiAccountManager mMiAccountManager;
    private long mMinePageStartShowTime;

    @Nullable
    private Function1<? super Integer, Unit> mSelectModeListener;
    private boolean mStartSportImport;

    @Nullable
    private AccountCoreInfo xiaomiCoreInfo;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/mine/MineFragment$Companion;", "", "<init>", "()V", "KEY_PARAMS_MEDAL_ID", "", "KEY_PARAMS_MEDAL_TYPE", "KEY_PARAMS_MEDAL_CLASS", "TAG", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineFragment(@NotNull MainHelper mMainHelper) {
        super(rui.j, 0, true);
        Intrinsics.checkNotNullParameter(mMainHelper, "mMainHelper");
        this.mMainHelper = mMainHelper;
        this.chinaRegion = "cn";
        this.MINE_TAB_PAGE_NAME = "profile_tab_page";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ f0g access$getMBinding(MineFragment mineFragment) {
        return (f0g) mineFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addPKEntranceOnClickListener() {
        ViewExtKt.clickWithTrigger$default(((f0g) getMBinding()).B, 0L, new Function1() { // from class: tzf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.addPKEntranceOnClickListener$lambda$7(this.f35215a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addPKEntranceOnClickListener$lambda$7(final MineFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MineOneTrack.INSTANCE.trackCompetition();
        if (this$0.getMAccoutManager().isLogin()) {
            ((MineViewModel) this$0.getMViewModel()).queryProcessPkCountLiveData().observe(this$0.getViewLifecycleOwner(), new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wzf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.addPKEntranceOnClickListener$lambda$7$lambda$6(this.f38509a, (Integer) obj);
                }
            }));
        } else {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addPKEntranceOnClickListener$lambda$7$lambda$6(MineFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num.intValue() <= 0) {
            IPkExport instance = ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            instance.goToSendInvitationActivity(fragmentActivityRequireActivity, null);
        } else {
            IPkExport instance2 = ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
            instance2.goToPkListActivity(fragmentActivityRequireActivity2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$10(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackLittleHabits();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                HabitManagerKt.getHabitManager().gotoHabitPage(mActivity, this$0.habitNum);
                return;
            }
            return;
        }
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handlePopMedalData() {
        boolean comeFromMedalDetailPageFromSP = ((MineViewModel) getMViewModel()).getComeFromMedalDetailPageFromSP();
        Logger.d("MineFragment", "showPopMedalDialogIfNeed removePoppedMedalData=" + comeFromMedalDetailPageFromSP);
        if (((MineViewModel) getMViewModel()).popMedalListFromSpIsEmpty()) {
            return;
        }
        if (comeFromMedalDetailPageFromSP) {
            ((MineViewModel) getMViewModel()).removeMedalAlreadyPoppedFromSp();
        }
        if (((MineViewModel) getMViewModel()).popMedalListFromSpIsEmpty()) {
            ((MineViewModel) getMViewModel()).setShouldPullPopMedalDataFromNetwork();
        } else {
            ((MineViewModel) getMViewModel()).getMedalToPopLiveData().setValue(((MineViewModel) getMViewModel()).getFirstMedalFromPopMedalDataSP());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAidongPaymentEntrance() {
        ((MineViewModel) getMViewModel()).getMiTvAidongVipUserInfoLiveData().observe(getViewLifecycleOwner(), new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uyf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.initAidongPaymentEntrance$lambda$57(this.f36279a, (AidongVipUserInfo) obj);
            }
        }));
        ViewExtKt.clickWithTrigger$default(((f0g) getMBinding()).X, 0L, new Function1() { // from class: vyf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.initAidongPaymentEntrance$lambda$58((RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initAidongPaymentEntrance$lambda$57(MineFragment this$0, AidongVipUserInfo aidongVipUserInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (aidongVipUserInfo == null) {
            ((f0g) this$0.getMBinding()).X.setRemindText((String) null);
            return Unit.INSTANCE;
        }
        ((f0g) this$0.getMBinding()).X.setRemindText(MineUtil.INSTANCE.getAidongMemberPlanStatus(aidongVipUserInfo));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAidongPaymentEntrance$lambda$58(RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MineUtil.INSTANCE.goToAidongMemberPaymentPage();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBanner() {
        ((MineViewModel) getMViewModel()).queryBannerDetailLiveData().observe(getViewLifecycleOwner(), new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: szf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.initBanner$lambda$5(this.f34130a, (BannerItem) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initBanner$lambda$5(MineFragment this$0, final BannerItem bannerItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bannerItem == null) {
            AppCompatImageView ivBanner = ((f0g) this$0.getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(ivBanner, "ivBanner");
            ViewExtKt.setVisible(ivBanner, false);
        } else {
            AppCompatImageView ivBanner2 = ((f0g) this$0.getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(ivBanner2, "ivBanner");
            ViewExtKt.setVisible(ivBanner2, true);
            AppCompatImageView ivBanner3 = ((f0g) this$0.getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(ivBanner3, "ivBanner");
            String iconHead = bannerItem.getIconHead();
            ImageLoader imageLoader = Coil.imageLoader(ivBanner3.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(ivBanner3.getContext()).data(iconHead).target(ivBanner3);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(16)));
            imageLoader.enqueue(builderTarget.build());
            ((f0g) this$0.getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: xyf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MineFragment.initBanner$lambda$5$lambda$4(bannerItem, view);
                }
            });
            BannerExtKt.getINSTANCE(IBanner.INSTANCE).onTrackBannerV1ClickOrExpose(bannerItem, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBanner$lambda$5$lambda$4(BannerItem bannerItem, View view) {
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).onBannerV1Click(bannerItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUserInfo$lambda$12(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsAboutClick();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            AboutManagerExtKt.getInstance(AboutManager.INSTANCE).gotoAboutActivity(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        String str = getString(m0j.E) + " " + getMAccoutManager().getUserId();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ((f0g) getMBinding()).U.setDes(str);
        }
        ((MineViewModel) getMViewModel()).getAccountCoreInfo();
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            ((MineViewModel) getMViewModel()).getXiaomiCoreInfo().observe(mActivity, new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zyf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.initView$lambda$23$lambda$22(this.f41802a, (AccountCoreInfo) obj);
                }
            }));
        }
        ((MineViewModel) getMViewModel()).getMedalEntrance();
        initUserInfo();
        if (!getMAccoutManager().isLogin()) {
            ((f0g) getMBinding()).h0.setText(getString(m0j.Q));
            ((f0g) getMBinding()).g0.setText(getString(m0j.p0));
        }
        ((f0g) getMBinding()).P.setOnClickListener(new View.OnClickListener() { // from class: izf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$24(this.f22254a, view);
            }
        });
        ((f0g) getMBinding()).j0.showMore(false);
        AppUtil appUtil = AppUtil.INSTANCE;
        if (!appUtil.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ((f0g) getMBinding()).j0.setOnClickListener(new View.OnClickListener() { // from class: jzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MineFragment.initView$lambda$25(this.f23263a, view);
                }
            });
        }
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            RightArrowBindingTwoLineTextView relativeCare = ((f0g) getMBinding()).b0;
            Intrinsics.checkNotNullExpressionValue(relativeCare, "relativeCare");
            ViewExtKt.gone(relativeCare);
        } else {
            RightArrowBindingTwoLineTextView relativeCare2 = ((f0g) getMBinding()).b0;
            Intrinsics.checkNotNullExpressionValue(relativeCare2, "relativeCare");
            ViewExtKt.visible(relativeCare2);
            ViewExtKt.clickWithTrigger$default(((f0g) getMBinding()).b0, 0L, new Function1() { // from class: kzf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.initView$lambda$26(this.f24448a, (RightArrowBindingTwoLineTextView) obj);
                }
            }, 1, null);
        }
        showAidongCompanyUserEntrance();
        ViewExtKt.clickWithTrigger$default(((f0g) getMBinding()).a0, 0L, new Function1() { // from class: lzf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.initView$lambda$27(this.f25583a, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        MutableLiveData<MedalEntrance> medalMedalEntrance = ((MineViewModel) getMViewModel()).getMedalMedalEntrance();
        if (medalMedalEntrance != null) {
            medalMedalEntrance.observe(getViewLifecycleOwner(), new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mzf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.initView$lambda$32(this.f27378a, (MedalEntrance) obj);
                }
            }));
        }
        ((f0g) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: nzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$34(this.f28588a, view);
            }
        });
        ((f0g) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: ozf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$37(this.f29842a, view);
            }
        });
        if (appUtil.isPlayChannel()) {
            ((f0g) getMBinding()).I.setVisibility(8);
        } else {
            ((f0g) getMBinding()).I.setVisibility(0);
        }
        ((f0g) getMBinding()).d0.setOnClickListener(new View.OnClickListener() { // from class: qzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$38(this.f32026a, view);
            }
        });
        ((f0g) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: rzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$40(this.f33097a, view);
            }
        });
        ((f0g) getMBinding()).e0.setVisibility(0);
        ((f0g) getMBinding()).e0.setOnClickListener(new View.OnClickListener() { // from class: azf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$42(this.f3606a, view);
            }
        });
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ((f0g) getMBinding()).k0.setVisibility(8);
        } else {
            ((f0g) getMBinding()).k0.setVisibility(0);
            ((f0g) getMBinding()).k0.setOnClickListener(new View.OnClickListener() { // from class: bzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MineFragment.initView$lambda$44(this.f4748a, view);
                }
            });
        }
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            RightArrowBindingTwoLineTextView healthVisitDoctor = ((f0g) getMBinding()).L;
            Intrinsics.checkNotNullExpressionValue(healthVisitDoctor, "healthVisitDoctor");
            ViewExtKt.gone(healthVisitDoctor);
        } else {
            RightArrowBindingTwoLineTextView healthVisitDoctor2 = ((f0g) getMBinding()).L;
            Intrinsics.checkNotNullExpressionValue(healthVisitDoctor2, "healthVisitDoctor");
            ViewExtKt.visible(healthVisitDoctor2);
            ((f0g) getMBinding()).L.setRemindText(getString(m0j.W));
            ViewExtKt.clickWithTrigger$default(((f0g) getMBinding()).L, 0L, new Function1() { // from class: czf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.initView$lambda$45(this.f14888a, (RightArrowBindingTwoLineTextView) obj);
                }
            }, 1, null);
        }
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            RightArrowBindingTwoLineTextView courseMine = ((f0g) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(courseMine, "courseMine");
            ViewExtKt.gone(courseMine);
        } else {
            RightArrowBindingTwoLineTextView courseMine2 = ((f0g) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(courseMine2, "courseMine");
            ViewExtKt.visible(courseMine2);
            ((f0g) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: dzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MineFragment.initView$lambda$46(this.f16091a, view);
                }
            });
        }
        if (appUtil.isPlayChannel()) {
            RightArrowBindingTwoLineTextView myTrack = ((f0g) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(myTrack, "myTrack");
            ViewExtKt.gone(myTrack);
        } else {
            RightArrowBindingTwoLineTextView myTrack2 = ((f0g) getMBinding()).Y;
            Intrinsics.checkNotNullExpressionValue(myTrack2, "myTrack");
            ViewExtKt.visible(myTrack2);
        }
        ((f0g) getMBinding()).Y.setOnClickListener(new View.OnClickListener() { // from class: fzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$47(this.f18393a, view);
            }
        });
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ((f0g) getMBinding()).C.setVisibility(8);
        } else {
            ((f0g) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: gzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MineFragment.initView$lambda$50(this.f19495a, view);
                }
            });
        }
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            return;
        }
        RightArrowBindingTwoLineTextView orderPageList = ((f0g) getMBinding()).Z;
        Intrinsics.checkNotNullExpressionValue(orderPageList, "orderPageList");
        ViewExtKt.visible(orderPageList);
        ((f0g) getMBinding()).Z.setOnClickListener(new View.OnClickListener() { // from class: hzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initView$lambda$51(this.f20622a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$23$lambda$22(MineFragment this$0, AccountCoreInfo accountCoreInfo) {
        String userId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xiaomiCoreInfo = accountCoreInfo;
        if (accountCoreInfo != null) {
            String userName = accountCoreInfo.getUserName();
            if (userName == null || userName.length() == 0) {
                accountCoreInfo.getUserId();
            } else {
                accountCoreInfo.getUserName();
            }
        }
        AccountCoreInfo accountCoreInfo2 = this$0.xiaomiCoreInfo;
        String avatarAddress = accountCoreInfo2 != null ? accountCoreInfo2.getAvatarAddress() : null;
        if (avatarAddress != null && avatarAddress.length() != 0) {
            RoundImageView userPhoto = ((f0g) this$0.getMBinding()).i0;
            Intrinsics.checkNotNullExpressionValue(userPhoto, "userPhoto");
            AccountCoreInfo accountCoreInfo3 = this$0.xiaomiCoreInfo;
            String avatarAddress2 = accountCoreInfo3 != null ? accountCoreInfo3.getAvatarAddress() : null;
            ImageLoader imageLoader = Coil.imageLoader(userPhoto.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(userPhoto.getContext()).data(avatarAddress2).target(userPhoto);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
        }
        if (this$0.xiaomiCoreInfo != null) {
            TextView textView = ((f0g) this$0.getMBinding()).h0;
            AccountCoreInfo accountCoreInfo4 = this$0.xiaomiCoreInfo;
            Intrinsics.checkNotNull(accountCoreInfo4);
            String userName2 = accountCoreInfo4.getUserName();
            if (userName2 == null || userName2.length() == 0) {
                AccountCoreInfo accountCoreInfo5 = this$0.xiaomiCoreInfo;
                Intrinsics.checkNotNull(accountCoreInfo5);
                userId = accountCoreInfo5.getUserId();
            } else {
                AccountCoreInfo accountCoreInfo6 = this$0.xiaomiCoreInfo;
                Intrinsics.checkNotNull(accountCoreInfo6);
                userId = accountCoreInfo6.getUserName();
            }
            textView.setText(userId);
            AccountCoreInfo accountCoreInfo7 = this$0.xiaomiCoreInfo;
            Intrinsics.checkNotNull(accountCoreInfo7);
            Logger.d("xiaomiCoreInfo!!.nickName=  " + accountCoreInfo7.getNickName(), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$24(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackPersonalCenter();
        if (!this$0.getMAccoutManager().isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            return;
        }
        SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        setPageManageExtKt.startUserIndicatorsActivity(mActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$25(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsUpdateClick();
        AppUpgradeHelper appUpgradeHelper = this$0.getAppUpgradeHelper();
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        appUpgradeHelper.doCheckAppUpgradeInMine(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$26(MineFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MineOneTrack.INSTANCE.trackMyFamily();
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
            return Unit.INSTANCE;
        }
        this$0.oneTrackRelativeCareEntranceClick();
        IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        instance.goToRelativeCareHomePage(fragmentActivityRequireActivity2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$27(final MineFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MineOneTrack.INSTANCE.trackSettingsDataManagerClick();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.mine.MineFragment$initView$5$1
                @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                public void onPrivacyAccepted() {
                    final MineFragment mineFragment = this.this$0;
                    mineFragment.showWebSyncDialogIfNeed(new IWebSyncImpl() { // from class: com.xiaomi.fitness.mine.MineFragment$initView$5$1$onPrivacyAccepted$1
                        @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                        public void onWebSyncAccepted() {
                            mineFragment.requireActivity().startActivity(new Intent(mineFragment.requireActivity(), (Class<?>) AuthConfigListActivity.class));
                        }
                    });
                }
            });
            return Unit.INSTANCE;
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity2 = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$32(final MineFragment this$0, MedalEntrance medalEntrance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(medalEntrance);
        if (medalEntrance.getMedal() == null) {
            return Unit.INSTANCE;
        }
        final Medal medal = medalEntrance.getMedal();
        Intrinsics.checkNotNull(medal);
        final int medalClass = medal.getMedalClass();
        ((f0g) this$0.getMBinding()).Q.getLayoutParams().width = (int) (DisplayUtil.dip2px(96.0f) / MineUtil.INSTANCE.getMedalImgRatio(medalClass));
        String icon = medal.getIcon();
        ImageView medalImg = ((f0g) this$0.getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(medalImg, "medalImg");
        ImageLoader imageLoader = Coil.imageLoader(medalImg.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(medalImg.getContext()).data(icon).target(medalImg);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.mine.MineFragment$initView$lambda$32$lambda$31$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
                MineFragment.access$getMBinding(this.this$0).Q.setImageBitmap(bitmap);
                rjh.b bVarB = bitmap != null ? rjh.b(bitmap) : null;
                Intrinsics.checkNotNull(bVarB);
                final Medal medal2 = medal;
                final int i = medalClass;
                final MineFragment mineFragment = this.this$0;
                bVarB.b(new rjh.d() { // from class: com.xiaomi.fitness.mine.MineFragment$initView$6$1$2$1
                    @Override // rjh.d
                    public final void onGenerated(rjh rjhVar) {
                        rjh.e eVarI;
                        long id = medal2.getId();
                        if (rjhVar != null) {
                            eVarI = i == 1 ? rjhVar.i() : rjhVar.f();
                        } else {
                            eVarI = null;
                        }
                        if (eVarI != null) {
                            int iE = eVarI.e();
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            if (id == 470 || id == 471) {
                                gradientDrawable.setColor(mineFragment.getColorWithAlpha(0.13f, iE));
                            } else {
                                gradientDrawable.setColor(mineFragment.getColorWithAlpha(i == 1 ? 0.2f : 0.3f, iE));
                            }
                            gradientDrawable.setCornerRadius(DisplayUtil.dip2px(15.0f));
                            int iDarkColor = mineFragment.darkColor(iE, 0.6f);
                            Context context = mineFragment.getContext();
                            if (context != null && !MineUtil.INSTANCE.isSystemNightMode(context)) {
                                MineFragment.access$getMBinding(mineFragment).O.setBackground(gradientDrawable);
                                MineFragment.access$getMBinding(mineFragment).T.setTextColor(iDarkColor);
                                MineFragment.access$getMBinding(mineFragment).S.setTextColor(iDarkColor);
                                MineFragment.access$getMBinding(mineFragment).R.setBackgroundColor(iDarkColor);
                            }
                            Context context2 = mineFragment.getContext();
                            if (context2 != null && MineUtil.INSTANCE.isSystemNightMode(context2)) {
                                Drawable drawableF = jrk.f(mineFragment.getResources(), vni.B, null);
                                if (drawableF != null) {
                                    drawableF.setBounds(0, 0, ExtUtilsKt.getDp(21), ExtUtilsKt.getDp(21));
                                }
                                MineFragment.access$getMBinding(mineFragment).T.setCompoundDrawables(null, null, drawableF, null);
                                return;
                            }
                            Drawable drawableF2 = jrk.f(mineFragment.getResources(), vni.A, null);
                            if (drawableF2 != null) {
                                Drawable drawableR = k47.r(drawableF2);
                                Intrinsics.checkNotNullExpressionValue(drawableR, "wrap(...)");
                                k47.n(drawableR, iDarkColor);
                                drawableR.setBounds(0, 0, ExtUtilsKt.getDp(21), ExtUtilsKt.getDp(21));
                                MineFragment.access$getMBinding(mineFragment).T.setCompoundDrawables(null, null, drawableR, null);
                            }
                        }
                    }
                });
            }
        });
        imageLoader.enqueue(builderTarget.build());
        ((f0g) this$0.getMBinding()).S.setText(this$0.getString(m0j.D, medal.getName()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$34(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsFeedbackClick();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).gotoFragmentManager(parentFragmentManager);
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$37(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                DeviceShareManager.DefaultImpls.gotoDeviceShareListActivity$default(DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE), mActivity, null, 2, null);
                return;
            }
            return;
        }
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$38(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsAppSetClick();
        AboutManager aboutManagerExtKt = AboutManagerExtKt.getInstance(AboutManager.INSTANCE);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        aboutManagerExtKt.gotoSettingActivity(mActivity, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$40(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsAuthorizationManagementClick();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            XmsManagerExtKt.getInstance(XmsManager.INSTANCE).gotoDeviceAuthorizationPage(this$0.getMActivity());
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$42(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSettingsSystemPermissionsClick();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
            Context contextRequireContext = this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            privacyHelperPointKt.startSystemPermissionPage(contextRequireContext);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$44(final MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackSportsWeekly();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                this$0.showWebSyncDialogIfNeed(new IWebSyncImpl() { // from class: com.xiaomi.fitness.mine.MineFragment$initView$12$1$1
                    @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                    public void onWebSyncAccepted() {
                        if (WeeklyReportSharePreference.INSTANCE.getKEY_WEEKLY_REPORT_AUTH() != 1) {
                            Intent intent = new Intent();
                            Context context = this.this$0.getContext();
                            if (context != null) {
                                intent.setClass(context, WeeklyReportAuthActivity.class);
                            }
                            this.this$0.startActivity(intent);
                            return;
                        }
                        Intent intent2 = new Intent();
                        String weeklyReportHtmlUrl = MineHtmlUrlsKt.getWeeklyReportHtmlUrl();
                        Logger.d("MineFragment", "pushUrl is " + weeklyReportHtmlUrl);
                        Context context2 = this.this$0.getContext();
                        if (context2 != null) {
                            intent2.setClass(context2, HealthWebViewActivity.class);
                        }
                        intent2.putExtra("data4", this.this$0.getString(m0j.A0));
                        intent2.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
                        intent2.putExtra("URL", weeklyReportHtmlUrl);
                        this.this$0.startActivity(intent2);
                    }
                });
            } else {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$45(MineFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MineOneTrack.INSTANCE.trackOnlineConsultation();
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        healthPageExtKt.goToHealthVisitDoctorPage(contextRequireContext, 5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$46(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackMyCourse();
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CourseApi.DefaultImpls.startCourseMe$default(CourseApiKt.getCourseApi(), null, 1, null);
            return;
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$47(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            if (NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
                TrackNetManagerKt.getInstance(TrackNet.INSTANCE).goTrackLibraryPageDefault();
                return;
            } else {
                ToastUtil.INSTANCE.showToast(m0j.P);
                return;
            }
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$50(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackActivities();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity);
                return;
            }
            String activityHtmlUrlStaging = this$0.getMAccoutManager().isStaging() ? MineHtmlUrlsKt.getActivityHtmlUrlStaging() : MineHtmlUrlsKt.getActivityHtmlUrl();
            Logger.d("MineFragment", "pushUrl is " + activityHtmlUrlStaging);
            Intent intent = new Intent();
            Context context = this$0.getContext();
            if (context != null) {
                intent.setClass(context, HealthWebViewActivity.class);
            }
            intent.putExtra("data4", this$0.getString(m0j.d));
            intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
            intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, true);
            intent.putExtra("URL", activityHtmlUrlStaging);
            intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, pji.c);
            this$0.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$51(MineFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackMyOrder();
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PaymentManager.DefaultImpls.gotoOrderPageList$default(payManagerExtKt, fragmentActivityRequireActivity, null, null, 6, null);
    }

    private final void loadMyHabitList() {
        HabitManagerKt.getHabitManager().loadMyHabitList(new Function1() { // from class: d0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.loadMyHabitList$lambda$13(this.f14926a, (ArrayList) obj);
            }
        }, new Function0() { // from class: e0g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMyHabitList$lambda$13(MineFragment this$0, ArrayList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("MineFragment", "loadMyHabitList habit size:" + it.size());
        this$0.habitNum = it.size();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(MineFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTitleView();
        this$0.setTitleBarColor();
        return Unit.INSTANCE;
    }

    private final void oneTrackRelativeCareEntranceClick() {
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "relatives_entry"), TuplesKt.to("device_model", this.curtDeviceModelStr), TuplesKt.to("source", "profile_tab_page"), TuplesKt.to("tip", "56.1.6.1.25014"));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
        Logger.d("MineFragment", "oneTrackRelativeCareEntranceClick oneTrackMap=" + mapMapOf);
    }

    private final void oneTrackRelativeCareEntranceExpose() {
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "relatives_entry"), TuplesKt.to("device_model", this.curtDeviceModelStr), TuplesKt.to("source", "profile_tab_page"), TuplesKt.to("tip", "56.1.6.1.25013"));
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", mapMapOf);
        Logger.d("MineFragment", "oneTrackRelativeCareEntranceExpose oneTrackMap=" + mapMapOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshPadding() {
        int dimen = (int) BaseFragmentExtKt.getDimen(this, nli.c);
        ViewGroup.LayoutParams layoutParams = ((f0g) getMBinding()).N.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
    }

    private final void setTitleBarColor() {
        BaseFragmentExtKt.setStatusBarColor(this, pji.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTitleView() {
        setActionBarDisplayable(false);
        ScrollTitleBar scrollTitleBar = ((f0g) getMBinding()).f0;
        NestedScrollView scrollView = ((f0g) getMBinding()).c0;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        scrollTitleBar.bindScrollView(scrollView);
        ScrollTitleBar scrollTitleBar2 = ((f0g) getMBinding()).f0;
        String string = getString(m0j.h0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        scrollTitleBar2.setTitle(string);
        ((ImageView) ((f0g) getMBinding()).f0.findViewById(lri.e1)).setContentDescription(getString(m0j.f25623b));
        ((f0g) getMBinding()).j0.setSubtitle(AppUtil.getVersionName());
        Context context = getContext();
        if (context == null || !MineUtil.INSTANCE.isSystemNightMode(context)) {
            CheckerUserSettingManager.Companion companion = CheckerUserSettingManager.INSTANCE;
            if (CheckerUserSettingManagerExtKt.getInstance(companion).getSelectMode() == companion.getCONCISE_MODE()) {
                ((f0g) getMBinding()).W.setBackground(BaseFragmentExtKt.getDrawable(this, pji.e));
                ((f0g) getMBinding()).V.setBackground(BaseFragmentExtKt.getDrawable(this, pji.e));
                ((f0g) getMBinding()).f0.setCollapseBackground(pji.e);
            } else {
                ((f0g) getMBinding()).V.setBackground(BaseFragmentExtKt.getDrawable(this, pji.f));
                ((f0g) getMBinding()).f0.setCollapseBackground(pji.f);
                ((f0g) getMBinding()).W.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{BaseFragmentExtKt.getColor(this, pji.g), BaseFragmentExtKt.getColor(this, pji.f), BaseFragmentExtKt.getColor(this, pji.f)}));
            }
        } else {
            ((f0g) getMBinding()).f0.setCollapseBackground(BaseFragmentExtKt.getDrawable(this, pji.h));
            ((f0g) getMBinding()).W.setBackground(BaseFragmentExtKt.getDrawable(this, pji.h));
            ((f0g) getMBinding()).V.setBackground(BaseFragmentExtKt.getDrawable(this, pji.h));
        }
        final Function1 function1 = new Function1() { // from class: ezf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.setTitleView$lambda$17(this.f17221a, (View) obj);
            }
        };
        ((f0g) getMBinding()).U.setMenuClickListener(new View.OnClickListener() { // from class: pzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.setTitleView$lambda$18(function1, view);
            }
        });
        ((f0g) getMBinding()).f0.setOnFuncMoreClickListener(new View.OnClickListener() { // from class: yzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.setTitleView$lambda$19(function1, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTitleView$lambda$17(MineFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.getActivity() != null) {
            BaseMainFragment.showPopupMenu$default(this$0, it, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleView$lambda$18(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleView$lambda$19(Function1 tmp0, View view) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, java.lang.String] */
    public final void setUserInformation() {
        ((MineViewModel) getMViewModel()).updateUserProfile();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        UserProfile profile = ((MineViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile);
        if (StringsKt__StringsJVMKt.equals$default(profile.getSex(), "female", false, 2, null)) {
            objectRef.element = getString(m0j.o0);
        } else {
            UserProfile profile2 = ((MineViewModel) getMViewModel()).getProfile();
            Intrinsics.checkNotNull(profile2);
            if (StringsKt__StringsJVMKt.equals$default(profile2.getSex(), "male", false, 2, null)) {
                objectRef.element = getString(m0j.v0);
            }
        }
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "  ";
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "";
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "";
        UserProfile profile3 = ((MineViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile3);
        if (((int) profile3.getHeight()) != 0) {
            objectRef3.element = getString(m0j.k0);
            UserProfile profile4 = ((MineViewModel) getMViewModel()).getProfile();
            Intrinsics.checkNotNull(profile4);
            objectRef4.element = String.valueOf((int) profile4.getHeight());
        }
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = "";
        UserProfile profile5 = ((MineViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile5);
        String birth = profile5.getBirth();
        if (birth != null && birth.length() != 0 && ((MineViewModel) getMViewModel()).getUserAge() != 0) {
            String strValueOf = String.valueOf(((MineViewModel) getMViewModel()).getUserAge());
            ?? string = getString(m0j.j0, strValueOf);
            objectRef5.element = string;
            Logger.d("MineFragment", "ageString is " + ((Object) string) + " , age is " + strValueOf);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: xzf
                @Override // java.lang.Runnable
                public final void run() {
                    MineFragment.setUserInformation$lambda$20(this.f39616a, objectRef, objectRef2, objectRef4, objectRef3, objectRef5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setUserInformation$lambda$20(MineFragment this$0, Ref.ObjectRef sexUser, Ref.ObjectRef value, Ref.ObjectRef heightTemp, Ref.ObjectRef unitHeight, Ref.ObjectRef ageString) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sexUser, "$sexUser");
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(heightTemp, "$heightTemp");
        Intrinsics.checkNotNullParameter(unitHeight, "$unitHeight");
        Intrinsics.checkNotNullParameter(ageString, "$ageString");
        TextView textView = ((f0g) this$0.getMBinding()).g0;
        Object obj = sexUser.element;
        Object obj2 = value.element;
        Object obj3 = heightTemp.element;
        Object obj4 = unitHeight.element;
        Object obj5 = ageString.element;
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        sb.append(obj4);
        sb.append(obj2);
        sb.append(obj5);
        textView.setText(sb.toString());
        ((f0g) this$0.getMBinding()).h0.setText(((MineViewModel) this$0.getMViewModel()).m494getUserName() != null ? ((MineViewModel) this$0.getMViewModel()).m494getUserName() : this$0.getString(m0j.w0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showAidongCompanyUserEntrance() {
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            return;
        }
        ((MineViewModel) getMViewModel()).getCompanyUserEntranceLiveData().observe(getViewLifecycleOwner(), new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wyf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.showAidongCompanyUserEntrance$lambda$54(this.f38477a, (CompanyUserEntranceResult) obj);
            }
        }));
        ((MineViewModel) getMViewModel()).requestCompanyEntrance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showAidongCompanyUserEntrance$lambda$54(final MineFragment this$0, final CompanyUserEntranceResult companyUserEntranceResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (companyUserEntranceResult == null || !companyUserEntranceResult.getShow()) {
            RightArrowBindingTwoLineTextView companyExclusiveEntrance = ((f0g) this$0.getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(companyExclusiveEntrance, "companyExclusiveEntrance");
            ViewExtKt.gone(companyExclusiveEntrance);
            return Unit.INSTANCE;
        }
        RightArrowBindingTwoLineTextView companyExclusiveEntrance2 = ((f0g) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(companyExclusiveEntrance2, "companyExclusiveEntrance");
        ViewExtKt.visible(companyExclusiveEntrance2);
        ViewExtKt.clickWithTrigger$default(((f0g) this$0.getMBinding()).F, 0L, new Function1() { // from class: a0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.showAidongCompanyUserEntrance$lambda$54$lambda$53(companyUserEntranceResult, this$0, (RightArrowBindingTwoLineTextView) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAidongCompanyUserEntrance$lambda$54$lambda$53(CompanyUserEntranceResult companyUserEntranceResult, final MineFragment this$0, RightArrowBindingTwoLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("MineFragment", "jumpUrl=" + companyUserEntranceResult.getJumpUrl());
        if (!NetworkUtils.isNetworkConnected(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), m0j.common_hint_network_unavailable);
            return Unit.INSTANCE;
        }
        CompanyUserWebViewActivity.Companion companion = CompanyUserWebViewActivity.INSTANCE;
        String jumpUrl = companyUserEntranceResult.getJumpUrl();
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        companion.startAndSetFinishCallback(jumpUrl, (BaseActivity) fragmentActivityRequireActivity, new Function0() { // from class: yyf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragment.showAidongCompanyUserEntrance$lambda$54$lambda$53$lambda$52(this.f40685a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showAidongCompanyUserEntrance$lambda$54$lambda$53$lambda$52(MineFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((MineViewModel) this$0.getMViewModel()).requestCompanyEntrance();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showOrHideAidongCoursePaymentEntrance() {
        if (!whetherToShowAidongPaymentEntrance()) {
            RightArrowBindingTwoLineTextView motionSensingCourseMember = ((f0g) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(motionSensingCourseMember, "motionSensingCourseMember");
            ViewExtKt.gone(motionSensingCourseMember);
        } else {
            RightArrowBindingTwoLineTextView motionSensingCourseMember2 = ((f0g) getMBinding()).X;
            Intrinsics.checkNotNullExpressionValue(motionSensingCourseMember2, "motionSensingCourseMember");
            ViewExtKt.visible(motionSensingCourseMember2);
            MineViewModel.sendGetAidongVipUseInfoRequestOnce$default((MineViewModel) getMViewModel(), null, null, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopMedalDialogIfNeed() {
        Logger.d("MineFragment", "showPopMedalDialogIfNeed shouldPullData = " + ((MineViewModel) getMViewModel()).shouldPullPopMedalDataFromNetwork());
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            if (((MineViewModel) getMViewModel()).shouldPullPopMedalDataFromNetwork()) {
                MedalManagerExtKt.getInstance(MedalManager.INSTANCE).requestAllTypeMedalPopupList(new Function1() { // from class: b0g
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MineFragment.showPopMedalDialogIfNeed$lambda$55(this.f3650a, (List) obj);
                    }
                });
            } else {
                handlePopMedalData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showPopMedalDialogIfNeed$lambda$55(MineFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("MineFragment", "showPopMedalDialogIfNeed popMedalDataList=" + it);
        if (it.isEmpty()) {
            ((MineViewModel) this$0.getMViewModel()).setShouldPullPopMedalDataFromNetwork();
        } else {
            ((MineViewModel) this$0.getMViewModel()).savePopMedalListToSp(it);
            ((MineViewModel) this$0.getMViewModel()).setPopMedalDataAlreadyPulled();
        }
        this$0.handlePopMedalData();
        return Unit.INSTANCE;
    }

    private final void showSyncWebDialog(final IWebSyncImpl iWebSyncImpl) {
        this.mMainHelper.showSyncWebDialog(getMActivity(), new av6() { // from class: com.xiaomi.fitness.mine.MineFragment.showSyncWebDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    dialog.dismiss();
                    RegionPreference regionPreference = RegionPreference.INSTANCE;
                    regionPreference.setSyncWeb(which == -1);
                    regionPreference.setSettingSyncWeb(true);
                    return;
                }
                if (which != -1) {
                    return;
                }
                dialog.dismiss();
                RegionPreference regionPreference2 = RegionPreference.INSTANCE;
                regionPreference2.setSyncWeb(which == -1);
                regionPreference2.setSettingSyncWeb(true);
                MineSettingHelper.INSTANCE.triggerSyncWithServer();
                iWebSyncImpl.onWebSyncAccepted();
            }

            @Override // defpackage.av6
            public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                super.onDialogMultiClick(dialogName, which, isChecked);
            }
        });
        Logger.d("MineFragment", "SYNC WEB showIfNeed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showWebSyncDialogIfNeed(IWebSyncImpl iWebSyncImpl) {
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            iWebSyncImpl.onWebSyncAccepted();
            return false;
        }
        showSyncWebDialog(iWebSyncImpl);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startObservingPopMedalData() {
        ((MineViewModel) getMViewModel()).getMedalToPopLiveData().observe(this, new MineFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragment.startObservingPopMedalData$lambda$1(this.f4791a, (PopMedalData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startObservingPopMedalData$lambda$1(final MineFragment this$0, PopMedalData popMedalData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("MineFragment", "medalToPopLiveData value=" + popMedalData);
        if (popMedalData != null) {
            MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            medalManagerExtKt.showLatestMedalPopDialog(fragmentActivityRequireActivity, popMedalData, new Function0() { // from class: uzf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragment.startObservingPopMedalData$lambda$1$lambda$0(this.f36318a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startObservingPopMedalData$lambda$1$lambda$0(MineFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((MineViewModel) this$0.getMViewModel()).removeMedalAlreadyPoppedFromSp();
        if (((MineViewModel) this$0.getMViewModel()).popMedalListFromSpIsEmpty()) {
            ((MineViewModel) this$0.getMViewModel()).setShouldPullPopMedalDataFromNetwork();
        } else {
            ((MineViewModel) this$0.getMViewModel()).getMedalToPopLiveData().setValue(((MineViewModel) this$0.getMViewModel()).getFirstMedalFromPopMedalDataSP());
        }
        return Unit.INSTANCE;
    }

    private final boolean whetherToShowAidongPaymentEntrance() {
        return !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && IWebSyncKt.getSHOW_AIDONG_PAYMENT_ENTRANCE();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull f0g f0gVar) {
        Intrinsics.checkNotNullParameter(f0gVar, "<this>");
        ((f0g) getMBinding()).K.setVisibility(RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) ? 0 : 8);
        ((f0g) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: zzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.bindView$lambda$10(this.f41828a, view);
            }
        });
    }

    public final int darkColor(int normalColor, float darkRatio) {
        float[] fArr = new float[3];
        Color.colorToHSV(normalColor, fArr);
        fArr[2] = fArr[2] * darkRatio;
        return Color.HSVToColor(fArr);
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

    public final int getColorWithAlpha(float alpha, int baseColor) {
        return (Math.min(255, Math.max(0, (int) (alpha * 255))) << 24) + (baseColor & 16777215);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment
    @Nullable
    public View getContentView() {
        return ((f0g) getMBinding()).N;
    }

    public final int getHabitNum() {
        return this.habitNum;
    }

    @NotNull
    public final AccountManager getMAccoutManager() {
        AccountManager accountManager = this.mAccoutManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccoutManager");
        return null;
    }

    @NotNull
    public final IMiAccountManager getMMiAccountManager() {
        IMiAccountManager iMiAccountManager = this.mMiAccountManager;
        if (iMiAccountManager != null) {
            return iMiAccountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mMiAccountManager");
        return null;
    }

    public final boolean getMStartSportImport() {
        return this.mStartSportImport;
    }

    @Nullable
    public final AccountCoreInfo getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initUserInfo() {
        ((MineViewModel) getMViewModel()).initUserProfile();
        UserProfile profile = ((MineViewModel) getMViewModel()).getProfile();
        Intrinsics.checkNotNull(profile);
        profile.getBirth();
        setUserInformation();
        if (AppUtil.INSTANCE.isPlayChannel() || !this.chinaRegion.equals(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion())) {
            ((f0g) getMBinding()).O.setVisibility(8);
        } else {
            ((f0g) getMBinding()).O.setVisibility(0);
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            new zr3(mActivity, ((f0g) getMBinding()).O) { // from class: com.xiaomi.fitness.mine.MineFragment.initUserInfo.1
                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    MineOneTrack.INSTANCE.trackMedal();
                    if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                        final FragmentActivity mActivity2 = MineFragment.this.getMActivity();
                        if (mActivity2 != null) {
                            MineFragment.this.showWebSyncDialogIfNeed(new IWebSyncImpl() { // from class: com.xiaomi.fitness.mine.MineFragment$initUserInfo$1$onCardZoomTriggered$2$1
                                @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                                public void onWebSyncAccepted() {
                                    Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "medal_into_banner"), TuplesKt.to("source", "profile_tab_page"), TuplesKt.to("tip", "56.16.1.1.22913"));
                                    OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
                                    Logger.d("MineFragment", "MedalEntrance oneTrackMap=" + mapMapOf);
                                    MedalManagerExtKt.getInstance(MedalManager.INSTANCE).goToMedalListActivity(mActivity2, null);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    FragmentActivity mActivity3 = MineFragment.this.getMActivity();
                    if (mActivity3 != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity3);
                    }
                }
            }.setRadius(ExtUtilsKt.getDp(Float.valueOf(15.0f)));
        }
        ((f0g) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: vzf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.initUserInfo$lambda$12(this.f37393a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startObservingPopMedalData();
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.mSelectModeListener != null) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
            Intrinsics.checkNotNull(function1);
            checkerUserSettingManagerExtKt.removeSelectModeListener(function1);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mMinePageStartShowTime) / ((long) 1000);
        MainHelper mainHelper = this.mMainHelper;
        String str = this.MINE_TAB_PAGE_NAME;
        String string = getString(m0j.h0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mainHelper.onetrackRecordTabShowTime(jCurrentTimeMillis, str, string);
        Logger.i("MineFragment", "mine page show durationSec is " + jCurrentTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((MineViewModel) getMViewModel()).getAccountCoreInfo();
        if (this.mStartSportImport) {
            ((MineViewModel) getMViewModel()).getMiSportLastMigrateStatus();
            this.mStartSportImport = false;
        }
        ((MineViewModel) getMViewModel()).getMedalEntrance();
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setTitleView();
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(new OnUserInfoChange() { // from class: com.xiaomi.fitness.mine.MineFragment.onViewCreated.1
            @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
            public void userInfoChange(UserProfile userProfile) {
                Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                if (MineFragment.this.isInvalid()) {
                    return;
                }
                MineFragment.this.setUserInformation();
                if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    AnyExtKt.main$default(null, new MineFragment$onViewCreated$1$userInfoChange$1(MineFragment.this, null), 1, null);
                }
            }
        });
        addPKEntranceOnClickListener();
        initView();
        initBanner();
        if (this.mSelectModeListener == null) {
            this.mSelectModeListener = new Function1() { // from class: tyf
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragment.onViewCreated$lambda$2(this.f35184a, ((Integer) obj).intValue());
                }
            };
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            Function1<? super Integer, Unit> function1 = this.mSelectModeListener;
            Intrinsics.checkNotNull(function1);
            checkerUserSettingManagerExtKt.addSelectModeListener(function1);
        }
        Logger.d("MineFragment", "MineFragment onViewCreated");
        initAidongPaymentEntrance();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        setTitleBarColor();
        loadMyHabitList();
        this.mMinePageStartShowTime = System.currentTimeMillis();
        showPopMedalDialogIfNeed();
        if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            this.curtDeviceModelStr = wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null;
            oneTrackRelativeCareEntranceExpose();
        }
        showOrHideAidongCoursePaymentEntrance();
    }

    public final void setAppUpgradeHelper(@NotNull AppUpgradeHelper appUpgradeHelper) {
        Intrinsics.checkNotNullParameter(appUpgradeHelper, "<set-?>");
        this.appUpgradeHelper = appUpgradeHelper;
    }

    public final void setHabitNum(int i) {
        this.habitNum = i;
    }

    public final void setMAccoutManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccoutManager = accountManager;
    }

    public final void setMMiAccountManager(@NotNull IMiAccountManager iMiAccountManager) {
        Intrinsics.checkNotNullParameter(iMiAccountManager, "<set-?>");
        this.mMiAccountManager = iMiAccountManager;
    }

    public final void setMStartSportImport(boolean z) {
        this.mStartSportImport = z;
    }

    public final void setXiaomiCoreInfo(@Nullable AccountCoreInfo accountCoreInfo) {
        this.xiaomiCoreInfo = accountCoreInfo;
    }
}
