package com.xiaomi.fitness.mine.v4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.about.utils.MineHtmlUrlsKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.extensions.OnUserInfoChange;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
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
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import com.xiaomi.fitness.medal.export.IPopMedalListRepo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.PopMedalExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.mine.company.CompanyUserEntranceResult;
import com.xiaomi.fitness.mine.company.CompanyUserWebViewActivity;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity;
import com.xiaomi.fitness.mine.v4.MineFragmentV4;
import com.xiaomi.fitness.mine.v4.MineItemListModel;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.vip.MineVipView;
import com.xiaomi.fitness.mine.widget.MedalEntranceView;
import com.xiaomi.fitness.mine.widget.MineActivePKPlayChannelView;
import com.xiaomi.fitness.mine.widget.MineActivePKView;
import com.xiaomi.fitness.mine.widget.MineAssetsView;
import com.xiaomi.fitness.mine.widget.MineHabitView;
import com.xiaomi.fitness.mine.widget.MineWeekReportView;
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
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import com.xiaomi.fitness.util.MineOneTrack;
import com.xiaomi.fitness.util.MineUtil;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import com.xms.wearable.export.XmsManager;
import com.xms.wearable.export.XmsManagerExtKt;
import defpackage.d1g;
import defpackage.m0j;
import defpackage.nli;
import defpackage.pji;
import defpackage.rui;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001-\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b3\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/mine/v4/MineFragmentV4;", "Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel;", "Ld1g;", "Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;", "mineItem", "", "onBasicItemClick", "(Lcom/xiaomi/fitness/mine/v4/MineItemListModel$MineItem;)V", "onRelativeFunctionClick", "()V", "onOrderListFunctionClick", "onCourseFunctionClick", "onActiveFunctionClick", "updateMedalViewV4", "observeDataChange", "onUserInfoChange", "updateHabitWeeklyReportActivePkGroup", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Ld1g;)V", LifecycleConstantKt.ON_RESUME, "onVisible", "onInvisible", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "oneTrackStartTime", "J", "Lcom/xiaomi/fitness/mine/v4/MineItemListAdapter;", "mMineItemListAdapter$delegate", "Lkotlin/Lazy;", "getMMineItemListAdapter", "()Lcom/xiaomi/fitness/mine/v4/MineItemListAdapter;", "mMineItemListAdapter", "com/xiaomi/fitness/mine/v4/MineFragmentV4$mUserInfoChangeListener$1", "mUserInfoChangeListener", "Lcom/xiaomi/fitness/mine/v4/MineFragmentV4$mUserInfoChangeListener$1;", "", "MINE_TAB_PAGE_NAME", "Ljava/lang/String;", "<init>", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineFragmentV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineFragmentV4.kt\ncom/xiaomi/fitness/mine/v4/MineFragmentV4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,562:1\n1#2:563\n*E\n"})
public final class MineFragmentV4 extends Hilt_MineFragmentV4<MineV4ViewModel, d1g> {

    @NotNull
    public static final String TAG = "MineFragmentV4";

    @NotNull
    private final String MINE_TAB_PAGE_NAME;

    /* JADX INFO: renamed from: mMineItemListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMineItemListAdapter;

    @NotNull
    private final MineFragmentV4$mUserInfoChangeListener$1 mUserInfoChangeListener;
    private long oneTrackStartTime;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.mine.v4.MineFragmentV4$mUserInfoChangeListener$1] */
    public MineFragmentV4() {
        super(rui.f32916k, 0, true);
        this.mMineItemListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q0g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineFragmentV4.mMineItemListAdapter_delegate$lambda$1(this.f30955a);
            }
        });
        this.mUserInfoChangeListener = new OnUserInfoChange() { // from class: com.xiaomi.fitness.mine.v4.MineFragmentV4$mUserInfoChangeListener$1
            @Override // com.xiaomi.fitness.account.extensions.OnUserInfoChange
            public void userInfoChange(UserProfile userProfile) {
                Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                if (this.this$0.isInvalid()) {
                    return;
                }
                Logger.d("MineFragment", "addUserInfoChangeListener");
                MineFragmentV4.access$getMViewModel(this.this$0).onAccountCoreInfoChange();
                MineFragmentV4.access$getMViewModel(this.this$0).onUserProfileChange();
            }
        };
        this.MINE_TAB_PAGE_NAME = "profile_tab_page";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MineV4ViewModel access$getMViewModel(MineFragmentV4 mineFragmentV4) {
        return (MineV4ViewModel) mineFragmentV4.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$11(MineFragmentV4 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        BaseMainFragment.showPopupMenu$default(this$0, view, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$12(MineFragmentV4 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            MineOneTrack.INSTANCE.trackActivities();
            this$0.onActiveFunctionClick();
        } else if (i == 1) {
            MineOneTrack.INSTANCE.trackMyCourse();
            this$0.onCourseFunctionClick();
        } else if (i == 2) {
            MineOneTrack.INSTANCE.trackMyOrder();
            this$0.onOrderListFunctionClick();
        } else if (i == 3) {
            MineOneTrack.INSTANCE.trackMyFamily();
            this$0.onRelativeFunctionClick();
        }
        return Unit.INSTANCE;
    }

    private final MineItemListAdapter getMMineItemListAdapter() {
        return (MineItemListAdapter) this.mMineItemListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MineItemListAdapter mMineItemListAdapter_delegate$lambda$1(final MineFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new MineItemListAdapter(new Function1() { // from class: w0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.mMineItemListAdapter_delegate$lambda$1$lambda$0(this.f37414a, (MineItemListModel.MineItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mMineItemListAdapter_delegate$lambda$1$lambda$0(MineFragmentV4 this$0, MineItemListModel.MineItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBasicItemClick(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void observeDataChange() {
        ((MineV4ViewModel) getMViewModel()).getAccountCoreInfo().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$14(this.f39649a, (AccountCoreInfo) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getUserProfile().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$15(this.f40751a, (UserProfile) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getUserWearMedalIcon().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a1g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$16(this.f523a, (String) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getUpdateHabit().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b1g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$17(this.f3681a, (MineV4ViewModel.UpdateHabit) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).queryProcessPkCountLiveData().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c1g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$19(this.f4824a, (Integer) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getRemoteItemList().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$21(this.f20650a, (List) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getCompanyUserEntranceResult().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$24(this.f22294a, (CompanyUserEntranceResult) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getBannerItem().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$25(this.f23294a, (BannerItemV2) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).queryBannerListV2LiveData();
        ((MineV4ViewModel) getMViewModel()).getVipInfo().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$26(this.f24482a, (VipInfo) obj);
            }
        }));
        ((MineV4ViewModel) getMViewModel()).getVipConfig().observe(getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$27(this.f25616a, (VipConfigInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$14(MineFragmentV4 this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).I.updateUserPhoto(accountCoreInfo);
        ((d1g) this$0.getMBinding()).I.updateUserName(accountCoreInfo);
        this$0.updateMedalViewV4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$15(MineFragmentV4 this$0, UserProfile userProfile) throws ParseException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).I.updateUserMoreInfo(userProfile);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$16(MineFragmentV4 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).I.updateUserWearMedal(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$17(MineFragmentV4 this$0, MineV4ViewModel.UpdateHabit updateHabit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).H.updateHabit(updateHabit);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$19(final MineFragmentV4 this$0, final Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((MineV4ViewModel) this$0.getMViewModel()).queryPkEntranceModel().observe(this$0.getViewLifecycleOwner(), new MineFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.observeDataChange$lambda$19$lambda$18(this.f35242a, num, (Integer) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$19$lambda$18(MineFragmentV4 this$0, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineActivePKView mineActivePKView = ((d1g) this$0.getMBinding()).A;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        mineActivePKView.queryProcessPkCountLiveData(iIntValue, iIntValue2, mActivity);
        MineActivePKPlayChannelView mineActivePKPlayChannelView = ((d1g) this$0.getMBinding()).P;
        int iIntValue3 = num.intValue();
        int iIntValue4 = num2.intValue();
        FragmentActivity mActivity2 = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        mineActivePKPlayChannelView.queryProcessPkCountLiveData(iIntValue3, iIntValue4, mActivity2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$21(final MineFragmentV4 this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ConstraintLayout healthVisitDoctor = ((d1g) this$0.getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(healthVisitDoctor, "healthVisitDoctor");
            ViewExtKt.gone(healthVisitDoctor);
        } else {
            ConstraintLayout healthVisitDoctor2 = ((d1g) this$0.getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(healthVisitDoctor2, "healthVisitDoctor");
            ViewExtKt.visible(healthVisitDoctor2);
            ViewExtKt.clickWithTrigger$default(((d1g) this$0.getMBinding()).E, 0L, new Function1() { // from class: x0g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragmentV4.observeDataChange$lambda$21$lambda$20(this.f38543a, (ConstraintLayout) obj);
                }
            }, 1, null);
        }
        this$0.getMMineItemListAdapter().submitList(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeDataChange$lambda$21$lambda$20(MineFragmentV4 this$0, ConstraintLayout it) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$24(final MineFragmentV4 this$0, final CompanyUserEntranceResult companyUserEntranceResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (companyUserEntranceResult == null || !companyUserEntranceResult.getShow()) {
            RightArrowBindingSingleLineTextView companyExclusiveEntrance = ((d1g) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(companyExclusiveEntrance, "companyExclusiveEntrance");
            ViewExtKt.gone(companyExclusiveEntrance);
        } else {
            RightArrowBindingSingleLineTextView companyExclusiveEntrance2 = ((d1g) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(companyExclusiveEntrance2, "companyExclusiveEntrance");
            ViewExtKt.visible(companyExclusiveEntrance2);
            ViewExtKt.clickWithTrigger$default(((d1g) this$0.getMBinding()).C, 0L, new Function1() { // from class: t0g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineFragmentV4.observeDataChange$lambda$24$lambda$23(companyUserEntranceResult, this$0, (RightArrowBindingSingleLineTextView) obj);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeDataChange$lambda$24$lambda$23(CompanyUserEntranceResult companyUserEntranceResult, final MineFragmentV4 this$0, RightArrowBindingSingleLineTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (NetworkUtils.isNetworkConnected(ApplicationExtKt.getApplication())) {
            CompanyUserWebViewActivity.Companion companion = CompanyUserWebViewActivity.INSTANCE;
            String jumpUrl = companyUserEntranceResult.getJumpUrl();
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            companion.startAndSetFinishCallback(jumpUrl, (BaseActivity) mActivity, new Function0() { // from class: h0g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MineFragmentV4.observeDataChange$lambda$24$lambda$23$lambda$22(this.f19539a);
                }
            });
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), m0j.common_hint_network_unavailable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$24$lambda$23$lambda$22(MineFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((MineV4ViewModel) this$0.getMViewModel()).updateCompanyUserEntranceResult();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$25(MineFragmentV4 this$0, BannerItemV2 bannerItemV2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bannerItemV2 == null) {
            MultipleStyleBannerView ivBanner = ((d1g) this$0.getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(ivBanner, "ivBanner");
            ViewExtKt.setVisible(ivBanner, false);
        } else {
            MultipleStyleBannerView ivBanner2 = ((d1g) this$0.getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(ivBanner2, "ivBanner");
            ViewExtKt.setVisible(ivBanner2, true);
            ((d1g) this$0.getMBinding()).F.updateBanner(bannerItemV2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$26(MineFragmentV4 this$0, VipInfo vipInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).T.setVipInfo(vipInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeDataChange$lambda$27(MineFragmentV4 this$0, VipConfigInfo vipConfigInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).T.setVipConfig(vipConfigInfo);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onActiveFunctionClick() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            checkerUserSettingManagerExtKt.showLoginDialog(mActivity);
            return;
        }
        String activityHtmlUrlStaging = ((MineV4ViewModel) getMViewModel()).getMAccountManager().isStaging() ? MineHtmlUrlsKt.getActivityHtmlUrlStaging() : MineHtmlUrlsKt.getActivityHtmlUrl();
        Intent intent = new Intent();
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        intent.setClass(mActivity2, HealthWebViewActivity.class);
        intent.putExtra("data4", getString(m0j.d));
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, true);
        intent.putExtra("URL", activityHtmlUrlStaging);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, pji.c);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onBasicItemClick(MineItemListModel.MineItem mineItem) {
        switch (mineItem.getType()) {
            case 1:
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
                } else if (!NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
                    ToastUtil.INSTANCE.showToast(m0j.P);
                } else {
                    TrackNetManagerKt.getInstance(TrackNet.INSTANCE).goTrackLibraryPageDefault();
                }
                break;
            case 3:
                MineOneTrack.INSTANCE.trackSettingsAppSetClick();
                AboutManager aboutManagerExtKt = AboutManagerExtKt.getInstance(AboutManager.INSTANCE);
                FragmentActivity mActivity = getMActivity();
                Intrinsics.checkNotNull(mActivity);
                aboutManagerExtKt.gotoSettingActivity(mActivity, true);
                break;
            case 4:
                MineOneTrack.INSTANCE.trackSettingsDataManagerClick();
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    CheckerUserSettingManager checkerUserSettingManagerExtKt2 = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
                    FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    checkerUserSettingManagerExtKt2.showLoginDialog(fragmentActivityRequireActivity2);
                } else {
                    PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
                    FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
                    privacyHelperPointKt.showPrivacySensitiveDialogIfNeed(fragmentActivityRequireActivity3, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.mine.v4.MineFragmentV4.onBasicItemClick.1
                        @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                        public void onPrivacyAccepted() {
                            MainHelper mainExtKt = MainExtKt.getInstance(MainHelper.INSTANCE);
                            FragmentActivity fragmentActivityRequireActivity4 = MineFragmentV4.this.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "requireActivity(...)");
                            final MineFragmentV4 mineFragmentV4 = MineFragmentV4.this;
                            mainExtKt.showSportHealthCloudSynDialogIfNeed(fragmentActivityRequireActivity4, new IWebSyncImpl() { // from class: com.xiaomi.fitness.mine.v4.MineFragmentV4$onBasicItemClick$1$onPrivacyAccepted$1
                                @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                                public void onWebSyncAccepted() {
                                    super.onWebSyncAccepted();
                                    mineFragmentV4.requireActivity().startActivity(new Intent(mineFragmentV4.requireActivity(), (Class<?>) AuthConfigListActivity.class));
                                }
                            });
                        }
                    });
                }
                break;
            case 5:
                MineUtil.INSTANCE.goToAidongMemberPaymentPage();
                break;
            case 6:
                MineOneTrack.INSTANCE.trackSettingsAuthorizationManagementClick();
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    FragmentActivity mActivity2 = getMActivity();
                    if (mActivity2 != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity2);
                    }
                } else {
                    XmsManagerExtKt.getInstance(XmsManager.INSTANCE).gotoDeviceAuthorizationPage(getMActivity());
                }
                break;
            case 7:
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    FragmentActivity mActivity3 = getMActivity();
                    if (mActivity3 != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity3);
                    }
                } else {
                    FragmentActivity mActivity4 = getMActivity();
                    if (mActivity4 != null) {
                        DeviceShareManager.DefaultImpls.gotoDeviceShareListActivity$default(DeviceShareManagerExtKt.getInstance(DeviceShareManager.INSTANCE), mActivity4, null, 2, null);
                    }
                }
                break;
            case 8:
                MineOneTrack.INSTANCE.trackSettingsSystemPermissionsClick();
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    FragmentActivity mActivity5 = getMActivity();
                    if (mActivity5 != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity5);
                    }
                } else {
                    PrivacyHelper privacyHelperPointKt2 = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    privacyHelperPointKt2.startSystemPermissionPage(contextRequireContext);
                }
                break;
            case 9:
                MineOneTrack.INSTANCE.trackSettingsFeedbackClick();
                if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    FragmentActivity mActivity6 = getMActivity();
                    if (mActivity6 != null) {
                        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(mActivity6);
                    }
                } else {
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                    UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE).gotoFragmentManager(parentFragmentManager);
                }
                break;
            case 10:
                MineOneTrack.INSTANCE.trackSettingsUpdateClick();
                if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
                    AppUpgradeHelper appUpgradeHelper = ((MineV4ViewModel) getMViewModel()).getAppUpgradeHelper();
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    appUpgradeHelper.doCheckAppUpgradeInMine(childFragmentManager);
                    break;
                }
                break;
            case 11:
                MineOneTrack.INSTANCE.trackSettingsAboutClick();
                AboutManager aboutManagerExtKt2 = AboutManagerExtKt.getInstance(AboutManager.INSTANCE);
                FragmentActivity mActivity7 = getMActivity();
                Intrinsics.checkNotNull(mActivity7);
                aboutManagerExtKt2.gotoAboutActivity(mActivity7);
                break;
        }
    }

    private final void onCourseFunctionClick() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CourseApi.DefaultImpls.startCourseMe$default(CourseApiKt.getCourseApi(), null, 1, null);
            return;
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        checkerUserSettingManagerExtKt.showLoginDialog(mActivity);
    }

    private final void onOrderListFunctionClick() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
            FragmentActivity mActivity = getMActivity();
            Intrinsics.checkNotNull(mActivity);
            PaymentManager.DefaultImpls.gotoOrderPageList$default(payManagerExtKt, mActivity, null, null, 6, null);
            return;
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        checkerUserSettingManagerExtKt.showLoginDialog(mActivity2);
    }

    private final void onRelativeFunctionClick() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
            return;
        }
        MineTabOnTrack.INSTANCE.oneTrackRelativeCareEntranceClick();
        IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        instance.goToRelativeCareHomePage(fragmentActivityRequireActivity2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onResume$lambda$13(MineFragmentV4 this$0, boolean z, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((d1g) this$0.getMBinding()).U.needShowWeekReport(z, l);
        return Unit.INSTANCE;
    }

    private final void onUserInfoChange() {
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).addUserInfoChangeListener(this.mUserInfoChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$10(final MineFragmentV4 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackPersonalMedal();
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            FragmentActivity mActivity = this$0.getMActivity();
            Intrinsics.checkNotNull(mActivity);
            String string = this$0.getString(m0j.common_hint_network_unavailable);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(mActivity, string);
            return;
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            ((MineV4ViewModel) this$0.getMViewModel()).getWearMedalDetail(new Function3() { // from class: n0g
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MineFragmentV4.onViewCreated$lambda$10$lambda$9(this.f27403a, ((Long) obj).longValue(), (String) obj2, ((Integer) obj3).intValue());
                }
            });
            return;
        }
        CheckerUserSettingManager checkerUserSettingManagerExtKt = CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        checkerUserSettingManagerExtKt.showLoginDialog(fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10$lambda$9(MineFragmentV4 this$0, long j, String medalType, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        Bundle bundle = new Bundle();
        bundle.putLong("key_params_medal_id", j);
        bundle.putString("key_params_medal_type", medalType);
        bundle.putInt("key_params_medal_class", i);
        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        medalManagerExtKt.goToMedalDetailActivity(mActivity, bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$7(MineFragmentV4 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackPersonalCenter();
        if (!((MineV4ViewModel) this$0.getMViewModel()).getMAccountManager().isLogin()) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            return;
        }
        SetPageManager setPageManageExtKt = SetPageManageExtKt.getInstance(SetPageManager.INSTANCE);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        setPageManageExtKt.startUserIndicatorsActivity(mActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateHabitWeeklyReportActivePkGroup() {
        if (UIUtils.INSTANCE.getScreenState() == 0) {
            MineHabitView layoutUserHabit = ((d1g) getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(layoutUserHabit, "layoutUserHabit");
            ViewExtKt.setHeight(layoutUserHabit, ExtUtilsKt.getDp(210));
            MineWeekReportView weeklyReportView = ((d1g) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(weeklyReportView, "weeklyReportView");
            ViewExtKt.setHeight(weeklyReportView, ExtUtilsKt.getDp(99));
            MineActivePKView activePkView = ((d1g) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(activePkView, "activePkView");
            ViewExtKt.setHeight(activePkView, ExtUtilsKt.getDp(99));
            return;
        }
        MineHabitView layoutUserHabit2 = ((d1g) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(layoutUserHabit2, "layoutUserHabit");
        ViewExtKt.setHeight(layoutUserHabit2, ExtUtilsKt.getDp(164));
        MineWeekReportView weeklyReportView2 = ((d1g) getMBinding()).U;
        Intrinsics.checkNotNullExpressionValue(weeklyReportView2, "weeklyReportView");
        ViewExtKt.setHeight(weeklyReportView2, ExtUtilsKt.getDp(76));
        MineActivePKView activePkView2 = ((d1g) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(activePkView2, "activePkView");
        ViewExtKt.setHeight(activePkView2, ExtUtilsKt.getDp(76));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateMedalViewV4() {
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            MedalEntranceView medalView = ((d1g) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(medalView, "medalView");
            ViewExtKt.gone(medalView);
        } else {
            MedalEntranceView medalView2 = ((d1g) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(medalView2, "medalView");
            ViewExtKt.visible(medalView2);
            ((d1g) getMBinding()).J.bindData();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull d1g d1gVar) {
        Intrinsics.checkNotNullParameter(d1gVar, "<this>");
        HomeHeaderTabTitleView homeHeaderTabTitleView = d1gVar.N;
        String string = getString(m0j.h0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        HomeHeaderTabTitleView.setTitle$default(homeHeaderTabTitleView, string, 0, 2, (Object) null);
        d1gVar.N.setMenuClickListener(new View.OnClickListener() { // from class: s0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragmentV4.bindView$lambda$11(this.f33131a, view);
            }
        });
        d1gVar.G.addOnItemClickListen(new Function1() { // from class: v0g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineFragmentV4.bindView$lambda$12(this.f36348a, ((Integer) obj).intValue());
            }
        });
        d1gVar.U.updateWeekReportInfo();
        d1gVar.D.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        d1gVar.D.setAdapter(getMMineItemListAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment
    @NotNull
    public View getContentView() {
        LinearLayoutCompat rootView = ((d1g) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        return rootView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((MineV4ViewModel) getMViewModel()).queryBannerListV2LiveData();
        updateHabitWeeklyReportActivePkGroup();
    }

    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).removeUserInfoChangeListener(this.mUserInfoChangeListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.oneTrackStartTime) / ((long) 1000);
        MainHelper mainExtKt = MainExtKt.getInstance(MainHelper.INSTANCE);
        String str = this.MINE_TAB_PAGE_NAME;
        String string = getString(m0j.h0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mainExtKt.onetrackRecordTabShowTime(jCurrentTimeMillis, str, string);
        Logger.i(TAG, "mine page show durationSec is " + jCurrentTimeMillis);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((MineV4ViewModel) getMViewModel()).onAccountCoreInfoChange();
        ((MineV4ViewModel) getMViewModel()).onUserProfileChange();
        ((MineV4ViewModel) getMViewModel()).needShowWeekReport(new WeakReference<>(new Function2() { // from class: r0g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MineFragmentV4.onResume$lambda$13(this.f32049a, ((Boolean) obj).booleanValue(), (Long) obj2);
            }
        }));
        updateMedalViewV4();
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            MineAssetsView layoutUserAssets = ((d1g) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(layoutUserAssets, "layoutUserAssets");
            ViewExtKt.gone(layoutUserAssets);
        } else {
            MineAssetsView layoutUserAssets2 = ((d1g) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(layoutUserAssets2, "layoutUserAssets");
            ViewExtKt.visible(layoutUserAssets2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.main.export.BaseMainFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        observeDataChange();
        onUserInfoChange();
        ((MineV4ViewModel) getMViewModel()).freshItemList();
        ((d1g) getMBinding()).I.setUserInfoOnClickListener(new View.OnClickListener() { // from class: o0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MineFragmentV4.onViewCreated$lambda$7(this.f28613a, view2);
            }
        });
        ((d1g) getMBinding()).I.setMedalOnClickListener(new View.OnClickListener() { // from class: p0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MineFragmentV4.onViewCreated$lambda$10(this.f29871a, view2);
            }
        });
        IPopMedalListRepo popMedalExtKt = PopMedalExtKt.getInstance(IPopMedalListRepo.INSTANCE);
        MutableLiveData<PopMedalData> medalToPopLiveData = ((MineV4ViewModel) getMViewModel()).getMedalToPopLiveData();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        popMedalExtKt.startObservingPopupMedalData(medalToPopLiveData, fragmentActivityRequireActivity);
        ScrollViewEffectiveExposeBiz scrollViewEffectiveExposeBiz = new ScrollViewEffectiveExposeBiz();
        NestedScrollView scrollView = ((d1g) getMBinding()).R;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        scrollViewEffectiveExposeBiz.startTrackItemExpose(scrollView, new LinkedHashSet(), ExtUtilsKt.getDimension(nli.f28046b));
        updateHabitWeeklyReportActivePkGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.oneTrackStartTime = System.currentTimeMillis();
        ((MineV4ViewModel) getMViewModel()).showOrHideAidongCoursePaymentEntrance();
        updateMedalViewV4();
        AppUtil appUtil = AppUtil.INSTANCE;
        if (appUtil.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            ConstraintLayout mineFunctionCnView = ((d1g) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(mineFunctionCnView, "mineFunctionCnView");
            ViewExtKt.gone(mineFunctionCnView);
            ConstraintLayout mineFunctionPlayView = ((d1g) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(mineFunctionPlayView, "mineFunctionPlayView");
            ViewExtKt.visible(mineFunctionPlayView);
        } else {
            ((MineV4ViewModel) getMViewModel()).onHabitRefresh();
            ConstraintLayout mineFunctionCnView2 = ((d1g) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(mineFunctionCnView2, "mineFunctionCnView");
            ViewExtKt.visible(mineFunctionCnView2);
            ConstraintLayout mineFunctionPlayView2 = ((d1g) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(mineFunctionPlayView2, "mineFunctionPlayView");
            ViewExtKt.gone(mineFunctionPlayView2);
        }
        PopMedalExtKt.getInstance(IPopMedalListRepo.INSTANCE).showPopupDialogIfNeed(((MineV4ViewModel) getMViewModel()).getMedalToPopLiveData());
        if (ConfigPreference.INSTANCE.getSHOW_VIP_BANNER() && !appUtil.isPlayChannel()) {
            String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Intrinsics.areEqual(lowerCase, "cn");
        }
        if (appUtil.isPlayChannel()) {
            return;
        }
        String lowerCase2 = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase2, "cn")) {
            MineVipView vipEntrance = ((d1g) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(vipEntrance, "vipEntrance");
            ViewExtKt.visible(vipEntrance);
            ((MineV4ViewModel) getMViewModel()).m501getVipInfo();
            ((MineV4ViewModel) getMViewModel()).m500getVipConfig();
        }
    }
}
