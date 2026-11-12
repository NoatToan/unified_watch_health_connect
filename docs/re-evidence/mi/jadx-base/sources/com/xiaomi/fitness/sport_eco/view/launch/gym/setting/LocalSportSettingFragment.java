package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.sport_eco.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport_eco.utils.Constants;
import com.xiaomi.fitness.sport_eco.utils.MijiaHelper;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingItemAdapter;
import com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fs9;
import defpackage.fvi;
import defpackage.mcn;
import defpackage.xx7;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001HB\u0007¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u0019\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0014¢\u0006\u0004\b4\u0010\u0006J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020 0A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel;", "Lxx7;", "", "setSettingConfig", "()V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "settingItem", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", "itemHolder", "onSettingItemClicked", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;)V", "showRevokeDialog", "doRevoke", "", "position", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "btn", "onSettingItemSwitchChanged", "(ILcom/xiaomi/fitness/widget/button/ISwitchButton;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "onBgPermissionSettingItemClicked", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;)V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/ChildProtectModeSettingItem;", "setChildProtectMode", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/ChildProtectModeSettingItem;)V", "speed", "setMaxSpeedLimit", "(I)V", "checkForUpdate", "showCannotUpdateDialog", "showChooseSpeedDialog", "Landroid/content/Intent;", "data", "onMaxHertRateFragmentResult", "(Landroid/content/Intent;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", CardInfo.KEY_OWNER, "Lkotlin/reflect/KClass;", "vm", "initViewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;)Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingViewModel;", "setListener", "", "onBackPressed", "()Z", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter;", "Lmcn;", "sportDB", "Lmcn;", "Landroidx/activity/result/ActivityResultLauncher;", "maxHertRateLuncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "localSportType", "Ljava/lang/String;", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLocalSportSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportSettingFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n1872#2,3:513\n*S KotlinDebug\n*F\n+ 1 LocalSportSettingFragment.kt\ncom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingFragment\n*L\n398#1:513,3\n*E\n"})
public final class LocalSportSettingFragment extends Hilt_LocalSportSettingFragment<LocalSportSettingViewModel, xx7> {

    @NotNull
    public static final String TAG = "LocalSportSettingFragment";

    @NotNull
    private String localSportType;

    @NotNull
    private final LocalSportSettingItemAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ActivityResultLauncher<Intent> maxHertRateLuncher;

    @NotNull
    private mcn sportDB;

    public LocalSportSettingFragment() {
        super(fvi.w);
        this.mAdapter = new LocalSportSettingItemAdapter();
        this.sportDB = LocalSportSettingHelper.INSTANCE.getSportModelFromDB();
        this.localSportType = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ LocalSportSettingViewModel access$getMViewModel(LocalSportSettingFragment localSportSettingFragment) {
        return (LocalSportSettingViewModel) localSportSettingFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkForUpdate() {
        NetUtil netUtil = NetUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (!netUtil.getNetWorkAvailable(contextRequireContext)) {
            ToastUtil.showShortToast(e1j.common_hint_network_unavailable);
        } else {
            PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
            ((LocalSportSettingViewModel) getMViewModel()).checkForUpdate(new Function3() { // from class: sle
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LocalSportSettingFragment.checkForUpdate$lambda$16(this.f33761a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkForUpdate$lambda$16(LocalSportSettingFragment this$0, int i, boolean z, LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i("LocalSportSettingFragment", "checkForUpdate " + i + " " + z + " " + checkUpgradeRequest);
        this$0.hideLoading();
        if (i != 0) {
            ToastUtil.INSTANCE.showToast(e1j.T);
        } else if (checkUpgradeRequest == null || !z) {
            ToastUtil.INSTANCE.showToast(e1j.F1);
        } else if (checkUpgradeRequest.isOwner) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_param1", checkUpgradeRequest);
            bundle.putString("key_param2", ((LocalSportSettingViewModel) this$0.getMViewModel()).getCurDid());
            bundle.putString("mac", ((LocalSportSettingViewModel) this$0.getMViewModel()).getDeviceMac());
            SportPreference sportPreference = SportPreference.INSTANCE;
            String latestVersion = checkUpgradeRequest.latestVersion;
            Intrinsics.checkNotNullExpressionValue(latestVersion, "latestVersion");
            sportPreference.setDeviceUpgradeRedPoint(latestVersion);
            BaseFragmentExKt.gotoPage(this$0, LocalDeviceUpdateFragment.class, bundle, false);
        } else {
            this$0.showCannotUpdateDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRevoke() {
        String did;
        Logger.i("LocalSportSettingFragment", "click , doRevoke");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        EcoDeviceManagerExtKt.getInstance(companion).deauthorize(did, new Function0() { // from class: wke
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalSportSettingFragment.doRevoke$lambda$9();
            }
        }, new Function1() { // from class: yke
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingFragment.doRevoke$lambda$10(((Integer) obj).intValue());
            }
        });
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.startPassportWebActivity(fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRevoke$lambda$10(int i) {
        Logger.i("LocalSportSettingFragment", "doRevoke onFail " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRevoke$lambda$9() {
        Logger.i("LocalSportSettingFragment", "doRevoke onSuccess");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$0(LocalSportSettingFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMaxHertRateFragmentResult(activityResult.a());
    }

    private final void onBgPermissionSettingItemClicked(LocalSportSettingItemAdapter.IItemHolder itemHolder) {
        String model;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(localDeviceModel)) == null) {
            model = "";
        }
        WebViewUtilKt.startWebView$default(Constants.INSTANCE.getKeepAliveHelpUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model), getString(e1j.e), false, false, null, false, null, false, 252, null);
        LocalSportSettingHelper.INSTANCE.setShowSportBgPermission(false);
        itemHolder.setRedPointShow(false);
    }

    private final void onMaxHertRateFragmentResult(Intent data) {
        if (data != null) {
            mcn mcnVar = this.sportDB;
            if (mcnVar != null) {
                mcnVar.c = data.getBooleanExtra("remindHr", false);
            }
            mcn mcnVar2 = this.sportDB;
            if (mcnVar2 != null) {
                mcnVar2.d = data.getIntExtra("heartRate", 0);
            }
            String stringExtra = data.getStringExtra("heartRateRange");
            mcn mcnVar3 = this.sportDB;
            if (mcnVar3 != null) {
                mcnVar3.l = stringExtra;
            }
            boolean booleanExtra = data.getBooleanExtra("heartRateSwitch", false);
            mcn mcnVar4 = this.sportDB;
            if (mcnVar4 != null) {
                mcnVar4.n = booleanExtra;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSettingItemClicked(LocalSportSettingItemAdapter.SettingItem settingItem, LocalSportSettingItemAdapter.IItemHolder itemHolder) {
        if (settingItem instanceof BgPermissionSettingItem) {
            onBgPermissionSettingItemClicked(itemHolder);
            return;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = null;
        if (settingItem instanceof HrRemindSettingItem) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isRemindHr", this.sportDB.c);
            bundle.putInt("heartRate", this.sportDB.d);
            bundle.putString("heartRateRange", this.sportDB.l);
            bundle.putBoolean("heartRateRangeSwitch", this.sportDB.n);
            FragmentParams fragmentParamsB = new FragmentParams.b().e(MaxHertRateFragment.class).c(bundle).a(true).b();
            Intent intent = new Intent(requireContext(), (Class<?>) CommonBaseActivity.class);
            Intrinsics.checkNotNull(fragmentParamsB, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
            ActivityResultLauncher<Intent> activityResultLauncher2 = this.maxHertRateLuncher;
            if (activityResultLauncher2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("maxHertRateLuncher");
            } else {
                activityResultLauncher = activityResultLauncher2;
            }
            activityResultLauncher.launch(intent);
            return;
        }
        if (settingItem instanceof MaxSpeedModeSettingItem) {
            showChooseSpeedDialog();
            return;
        }
        if (settingItem instanceof OwnerlessRecordSettingItem) {
            showLoading();
            GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            gymDeviceModel.checkGymOfflineReport(fragmentActivityRequireActivity, false, new Function1() { // from class: mle
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalSportSettingFragment.onSettingItemClicked$lambda$8(this.f26979a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (settingItem instanceof BeltAdjustmentSettingItem) {
            BeltAdjustWebViewActivity.Companion.start$default(BeltAdjustWebViewActivity.INSTANCE, null, false, ((LocalSportSettingViewModel) getMViewModel()).getCurModel(), 3, null);
            return;
        }
        if (settingItem instanceof UserGuideSettingItem) {
            WebViewUtilKt.startWebView$default(Constants.INSTANCE.getUserGuide2Url(LocaleUtil.getCurrentLocale(), ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.O4), false, false, null, false, null, false, 252, null);
            return;
        }
        if (settingItem instanceof LinkageSettingItem) {
            SmartSceneWebViewActivity.Companion.start$default(SmartSceneWebViewActivity.INSTANCE, null, false, 3, null);
            return;
        }
        if (settingItem instanceof InsuranceSettingItem) {
            Intent intent2 = new Intent();
            String insuranceUrl = Constants.INSTANCE.getInsuranceUrl(((LocalSportSettingViewModel) getMViewModel()).getCurDid(), AIApiConstants.Treadmill.NAME);
            intent2.setClass(requireActivity(), HealthWebViewActivity.class);
            intent2.putExtra("data4", "");
            intent2.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
            intent2.putExtra("URL", insuranceUrl);
            startActivity(intent2);
            return;
        }
        if (settingItem instanceof UpgradeSettingItem) {
            checkForUpdate();
            return;
        }
        if (settingItem instanceof PrivacyDetailSettingItem) {
            Constants constants = Constants.INSTANCE;
            WebViewUtilKt.startWebView$default(constants.getEcoPrivacyPolicyUrlByType(constants.getEcoPrivacyPolicyType(), ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.G2), false, false, null, false, null, false, 252, null);
            return;
        }
        if (settingItem instanceof UserAgreementSettingItem) {
            Constants constants2 = Constants.INSTANCE;
            WebViewUtilKt.startWebView$default(constants2.getEcoUserAgreementByType(constants2.getEcoUserAgreementType(), ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.N4), false, false, null, false, null, false, 252, null);
        } else {
            if (settingItem instanceof PrivacyRevokeSettingItem) {
                showRevokeDialog();
                return;
            }
            Logger.e("LocalSportSettingFragment", "onSettingItemClicked unExcepted item:" + settingItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingItemClicked$lambda$8(LocalSportSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    private final void onSettingItemSwitchChanged(int position, ISwitchButton btn, final LocalSportSettingItemAdapter.SettingItem settingItem) {
        boolean zIsChecked = btn.isChecked();
        if (!(settingItem instanceof LocalSportSettingItemAdapter.SwitchSettingItem)) {
            Logger.e("LocalSportSettingFragment", "onSettingItemSwitchChanged unExcepted item:" + settingItem);
            return;
        }
        LocalSportSettingItemAdapter.SwitchSettingItem switchSettingItem = (LocalSportSettingItemAdapter.SwitchSettingItem) settingItem;
        switchSettingItem.setChecked(zIsChecked);
        if (switchSettingItem instanceof VoiceSpeechSettingItem) {
            if (zIsChecked) {
                SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).checkAndDownloadAudioFeedbackResourcesIfNeed(true, "跑步机设置页面语音提示", new Function0() { // from class: ole
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalSportSettingFragment.onSettingItemSwitchChanged$lambda$11(settingItem, this);
                    }
                }, new Function0() { // from class: qle
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalSportSettingFragment.onSettingItemSwitchChanged$lambda$12(settingItem, this);
                    }
                });
            } else {
                LocalSportSettingHelper.INSTANCE.setVoiceSpeechSwitch(false, this.sportDB);
            }
            this.mAdapter.notifyItemChanged(position);
            return;
        }
        if (switchSettingItem instanceof WholeKMReminderSettingItem) {
            LocalSportSettingHelper.INSTANCE.setDistanceVoiceSpeechSwitch(zIsChecked, this.sportDB);
            return;
        }
        if (switchSettingItem instanceof ScreenOnSettingItem) {
            LocalSportSettingHelper.INSTANCE.setScreenOnSwitch(zIsChecked, this.sportDB);
            return;
        }
        if (switchSettingItem instanceof LockDisplayDataSettingItem) {
            LocalSportSettingHelper.INSTANCE.setLockWithDataSwitch(zIsChecked, this.sportDB);
            return;
        }
        if (switchSettingItem instanceof ChildProtectModeSettingItem) {
            setChildProtectMode(btn, (ChildProtectModeSettingItem) settingItem);
            return;
        }
        Logger.e("LocalSportSettingFragment", "onSettingItemSwitchChanged unExcepted item:" + settingItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingItemSwitchChanged$lambda$11(LocalSportSettingItemAdapter.SettingItem settingItem, LocalSportSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(settingItem, "$settingItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((VoiceSpeechSettingItem) settingItem).setChecked(true);
        LocalSportSettingHelper.INSTANCE.setVoiceSpeechSwitch(true, this$0.sportDB);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingItemSwitchChanged$lambda$12(LocalSportSettingItemAdapter.SettingItem settingItem, LocalSportSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(settingItem, "$settingItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((VoiceSpeechSettingItem) settingItem).setChecked(false);
        LocalSportSettingHelper.INSTANCE.setVoiceSpeechSwitch(false, this$0.sportDB);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(LocalSportSettingFragment this$0, boolean z, fs9[] fs9VarArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.i("LocalSportSettingFragment", " readSettingConfig " + z);
        if (z) {
            this$0.setSettingConfig();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(LocalSportSettingFragment this$0, int i, boolean z, LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (i != 0) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, e1j.z);
            }
        } else if (checkUpgradeRequest != null) {
            String deviceUpgradeRedPoint = SportPreference.INSTANCE.getDeviceUpgradeRedPoint(((LocalSportSettingViewModel) this$0.getMViewModel()).getDeviceMac());
            boolean z2 = !Intrinsics.areEqual(deviceUpgradeRedPoint, checkUpgradeRequest.latestVersion);
            Logger.i("LocalSportSettingFragment", "show update red point " + deviceUpgradeRedPoint + " " + z2);
            if (z && z2) {
                Pair pairFindItem = this$0.mAdapter.findItem(UpgradeSettingItem.class);
                UpgradeSettingItem upgradeSettingItem = (UpgradeSettingItem) pairFindItem.getFirst();
                if (upgradeSettingItem != null) {
                    upgradeSettingItem.setRedPointShow(true);
                    this$0.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setChildProtectMode(final ISwitchButton btn, final ChildProtectModeSettingItem settingItem) {
        boolean zIsChecked = btn.isChecked();
        btn.setChecked(!zIsChecked);
        showLoading();
        ((LocalSportSettingViewModel) getMViewModel()).setChildProtectSwitch(zIsChecked, new Function1() { // from class: ale
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingFragment.setChildProtectMode$lambda$13(this.f1172a, btn, settingItem, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setChildProtectMode$lambda$13(LocalSportSettingFragment this$0, ISwitchButton btn, ChildProtectModeSettingItem settingItem, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "$btn");
        Intrinsics.checkNotNullParameter(settingItem, "$settingItem");
        this$0.hideLoading();
        btn.setChecked(z);
        settingItem.setChecked(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$6(LocalSportSettingFragment this$0, LocalSportSettingItemAdapter.SettingItem item, LocalSportSettingItemAdapter.IItemHolder itemHolder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
        this$0.onSettingItemClicked(item, itemHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7(LocalSportSettingFragment this$0, int i, ISwitchButton btn, LocalSportSettingItemAdapter.SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "btn");
        Intrinsics.checkNotNullParameter(settingItem, "settingItem");
        this$0.onSettingItemSwitchChanged(i, btn, settingItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setMaxSpeedLimit(int speed) {
        showLoading();
        ((LocalSportSettingViewModel) getMViewModel()).setMaxSpeedLimit(speed, new Function1() { // from class: kle
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingFragment.setMaxSpeedLimit$lambda$15(this.f23960a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMaxSpeedLimit$lambda$15(LocalSportSettingFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int i = 0;
        for (Object obj : this$0.mAdapter.getDataList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            LocalSportSettingItemAdapter.SettingItem settingItem = (LocalSportSettingItemAdapter.SettingItem) obj;
            if (settingItem instanceof MaxSpeedModeSettingItem) {
                ((MaxSpeedModeSettingItem) settingItem).setRightValue(it);
                this$0.mAdapter.notifyItemChanged(i);
            }
            i = i2;
        }
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSettingConfig() {
        boolean z = ((LocalSportSettingViewModel) getMViewModel()).getConfigValue(0) == 1;
        Pair pairFindItem = this.mAdapter.findItem(ChildProtectModeSettingItem.class);
        ChildProtectModeSettingItem childProtectModeSettingItem = (ChildProtectModeSettingItem) pairFindItem.getFirst();
        if (childProtectModeSettingItem != null) {
            childProtectModeSettingItem.setChecked(z);
            this.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
        }
        int configValue = ((LocalSportSettingViewModel) getMViewModel()).getConfigValue(4);
        Pair pairFindItem2 = this.mAdapter.findItem(MaxSpeedModeSettingItem.class);
        MaxSpeedModeSettingItem maxSpeedModeSettingItem = (MaxSpeedModeSettingItem) pairFindItem2.getFirst();
        if (maxSpeedModeSettingItem != null) {
            maxSpeedModeSettingItem.setRightValue(((LocalSportSettingViewModel) getMViewModel()).getSpeedStr(configValue));
            this.mAdapter.notifyItemChanged(((Number) pairFindItem2.getSecond()).intValue());
        }
    }

    private final void showCannotUpdateDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("cannot").setDialogTitle(e1j.c2).setDialogDescription(e1j.b2).setPositiveText(e1j.d).setNegativeText(e1j.c).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment.showCannotUpdateDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    MijiaHelper.INSTANCE.goMijia(LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getCurDevice());
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showChooseSpeedDialog() {
        CustomPickerDialog customPickerDialogCreate = new CustomPickerDialog.Builder("max_speed").setCanceledOnTouchOutside(true).setDialogTitle(e1j.j2).setPositiveText(e1j.d).setNegativeText(e1j.c).create();
        Intrinsics.checkNotNullExpressionValue(customPickerDialogCreate, "create(...)");
        final CustomPickerDialog customPickerDialog = customPickerDialogCreate;
        customPickerDialog.setValue(((LocalSportSettingViewModel) getMViewModel()).getCurSpeedLimit());
        customPickerDialog.setCustomAdapter(new CustomPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment.showChooseSpeedDialog.1
            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getMaxSpeedRange().size();
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getSpeedStr(getValue(index));
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getMaxSpeedRange().get(index).intValue();
            }
        });
        customPickerDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment.showChooseSpeedDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    LocalSportSettingFragment.this.setMaxSpeedLimit(customPickerDialog.getValue());
                }
            }
        });
        customPickerDialog.showIfNeed(getParentFragmentManager());
    }

    private final void showRevokeDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("revoke").setDialogTitle(e1j.U2).setDialogDescription(e1j.T2).setPositiveText(e1j.V2).setNegativeText(e1j.H2).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingFragment.showRevokeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    LocalSportSettingFragment.this.doRevoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    public /* bridge */ /* synthetic */ AbsViewModel initViewModel(ViewModelStoreOwner viewModelStoreOwner, KClass kClass) {
        return initViewModel(viewModelStoreOwner, (KClass<LocalSportSettingViewModel>) kClass);
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.setting.Hilt_LocalSportSettingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(this.localSportType) == null) {
            ToastExtKt.toastShort(context, e1j.f);
            finish();
        }
        this.maxHertRateLuncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ele
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                LocalSportSettingFragment.onAttach$lambda$0(this.f16772a, (ActivityResult) obj);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        int i;
        switch (SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE()) {
            case "yesoul.exbike.jsc01y":
            case "runmi.exbike.jscrm1":
                i = 7;
                break;
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr805":
                i = 14;
                break;
            default:
                i = 3;
                break;
        }
        mcn mcnVar = this.sportDB;
        mcnVar.f26018a = i;
        LocalSportSettingHelper.INSTANCE.saveSportModelFromDB(mcnVar);
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(e1j.Z);
        RecyclerView recyclerView = ((xx7) getMBinding()).A;
        this.mRecyclerView = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(this.mAdapter);
        this.mAdapter.setDataList(((LocalSportSettingViewModel) getMViewModel()).buildSettingItems(), this.sportDB);
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((LocalSportSettingViewModel) getMViewModel()).readSettingConfig(new Function2() { // from class: gle
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalSportSettingFragment.onViewCreated$lambda$1(this.f19104a, ((Boolean) obj).booleanValue(), (fs9[]) obj2);
            }
        });
        ((LocalSportSettingViewModel) getMViewModel()).checkForUpdate(new Function3() { // from class: ile
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalSportSettingFragment.onViewCreated$lambda$3(this.f21270a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj3);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        this.mAdapter.setOnItemClickListener(new Function2() { // from class: uke
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalSportSettingFragment.setListener$lambda$6(this.f35871a, (LocalSportSettingItemAdapter.SettingItem) obj, (LocalSportSettingItemAdapter.IItemHolder) obj2);
            }
        });
        this.mAdapter.setOnItemSwitchChangedListener(new Function3() { // from class: cle
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalSportSettingFragment.setListener$lambda$7(this.f5453a, ((Integer) obj).intValue(), (ISwitchButton) obj2, (LocalSportSettingItemAdapter.SettingItem) obj3);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public LocalSportSettingViewModel initViewModel(@Nullable ViewModelStoreOwner owner, @Nullable KClass<LocalSportSettingViewModel> vm) {
        return (LocalSportSettingViewModel) new ViewModelProvider(this, new LocalSportSettingViewModel.ViewModelFactory(this.sportDB)).get(LocalSportSettingViewModel.class);
    }
}
