package com.xiaomi.fitness.sport.view.launch.gym.setting;

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
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.sport.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.sport.utils.Constants;
import com.xiaomi.fitness.sport.utils.MijiaHelper;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter;
import com.xiaomi.fitness.sport.view.widget.CustomPickerDialog;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.gs9;
import defpackage.lcn;
import defpackage.omn;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001HB\u0007¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u0019\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\u0006J)\u00107\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u0001032\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0014¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0010R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020$0D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingViewModel;", "Lomn;", "", "updateSettingData", "()V", "setSettingConfig", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "settingItem", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", "itemHolder", "onSettingItemClicked", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;)V", "", "isEcoDevice", "()Z", "showRevokeDialog", "doRevoke", "", "position", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "btn", "onSettingItemSwitchChanged", "(ILcom/xiaomi/fitness/widget/button/ISwitchButton;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "onBgPermissionSettingItemClicked", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;)V", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/ChildProtectModeSettingItem;", "setChildProtectMode", "(Lcom/xiaomi/fitness/widget/button/ISwitchButton;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/ChildProtectModeSettingItem;)V", "speed", "setMaxSpeedLimit", "(I)V", "checkForUpdate", "showCannotUpdateDialog", "showChooseSpeedDialog", "Landroid/content/Intent;", "data", "onMaxHertRateFragmentResult", "(Landroid/content/Intent;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Landroidx/lifecycle/ViewModelStoreOwner;", CardInfo.KEY_OWNER, "Lkotlin/reflect/KClass;", "vm", "initViewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingViewModel;", "setListener", "onBackPressed", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter;", "Llcn;", "sportDB", "Llcn;", "Landroidx/activity/result/ActivityResultLauncher;", "maxHertRateLuncher", "Landroidx/activity/result/ActivityResultLauncher;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLocalSportSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportSettingFragment.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,521:1\n1872#2,3:522\n*S KotlinDebug\n*F\n+ 1 LocalSportSettingFragment.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingFragment\n*L\n407#1:522,3\n*E\n"})
public final class LocalSportSettingFragment extends Hilt_LocalSportSettingFragment<LocalSportSettingViewModel, omn> {

    @NotNull
    public static final String TAG = "LocalSportSettingFragment";

    @NotNull
    private final LocalSportSettingItemAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ActivityResultLauncher<Intent> maxHertRateLuncher;

    @NotNull
    private lcn sportDB;

    public LocalSportSettingFragment() {
        super(dvi.l0);
        this.mAdapter = new LocalSportSettingItemAdapter();
        this.sportDB = LocalSportSettingHelper.INSTANCE.getSportModelFromDB();
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
            ToastUtil.showShortToast(c1j.common_hint_network_unavailable);
        } else {
            PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
            ((LocalSportSettingViewModel) getMViewModel()).checkForUpdate(new Function3() { // from class: ble
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LocalSportSettingFragment.checkForUpdate$lambda$16(this.f4337a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj3);
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
            ToastUtil.INSTANCE.showToast(c1j.C0);
        } else if (checkUpgradeRequest == null || !z) {
            ToastUtil.INSTANCE.showToast(c1j.y1);
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
        FitnessLogUtils.i("LocalSportSettingFragment", "click , doRevoke");
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (did = wearableDeviceModelCurGymDeviceModel.getDid()) == null) {
            did = "";
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).deauthorize(did, new Function0() { // from class: xke
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalSportSettingFragment.doRevoke$lambda$9();
            }
        }, new Function1() { // from class: zke
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

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEcoDevice() {
        return Intrinsics.areEqual(((LocalSportSettingViewModel) getMViewModel()).getCurModel(), "ksmb.treadmill.m2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$0(LocalSportSettingFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMaxHertRateFragmentResult(activityResult.a());
    }

    private final void onBgPermissionSettingItemClicked(LocalSportSettingItemAdapter.IItemHolder itemHolder) {
        String model;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModelCurGymDeviceModel)) == null) {
            model = "";
        }
        WebViewUtilKt.startWebView$default(Constants.INSTANCE.getKeepAliveHelpUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model), getString(c1j.l5), false, false, null, false, null, false, 252, null);
        LocalSportSettingHelper.INSTANCE.setShowSportBgPermission(false);
        itemHolder.setRedPointShow(false);
    }

    private final void onMaxHertRateFragmentResult(Intent data) {
        if (data != null) {
            lcn lcnVar = this.sportDB;
            if (lcnVar != null) {
                lcnVar.c = data.getBooleanExtra("remindHr", false);
            }
            lcn lcnVar2 = this.sportDB;
            if (lcnVar2 != null) {
                lcnVar2.d = data.getIntExtra("heartRate", 0);
            }
            String stringExtra = data.getStringExtra("heartRateRange");
            lcn lcnVar3 = this.sportDB;
            if (lcnVar3 != null) {
                lcnVar3.l = stringExtra;
            }
            boolean booleanExtra = data.getBooleanExtra("heartRateSwitch", false);
            lcn lcnVar4 = this.sportDB;
            if (lcnVar4 != null) {
                lcnVar4.n = booleanExtra;
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
            gymDeviceModel.checkGymOfflineReport(fragmentActivityRequireActivity, false, new Function1() { // from class: jle
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalSportSettingFragment.onSettingItemClicked$lambda$8(this.f22907a, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (settingItem instanceof BeltAdjustmentSettingItem) {
            BeltAdjustWebViewActivity.Companion.start$default(BeltAdjustWebViewActivity.INSTANCE, null, false, ((LocalSportSettingViewModel) getMViewModel()).getCurModel(), 3, null);
            return;
        }
        if (settingItem instanceof UserGuideSettingItem) {
            WebViewUtilKt.startWebView$default(Constants.INSTANCE.getUserGuide2Url(LocaleUtil.getCurrentLocale(), "ksmb.treadmill.m1v1"), getString(c1j.t5), false, false, null, false, null, false, 252, null);
            return;
        }
        if (settingItem instanceof LinkageSettingItem) {
            SmartSceneWebViewActivity.Companion.start$default(SmartSceneWebViewActivity.INSTANCE, null, false, 3, null);
            return;
        }
        if (settingItem instanceof InsuranceSettingItem) {
            String str = Intrinsics.areEqual(((LocalSportSettingViewModel) getMViewModel()).getCurModel(), "ksmb.treadmill.m2") ? "Treadmill2" : AIApiConstants.Treadmill.NAME;
            Intent intent2 = new Intent();
            String insuranceUrl = Constants.INSTANCE.getInsuranceUrl(((LocalSportSettingViewModel) getMViewModel()).getCurDid(), str);
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
            if (isEcoDevice()) {
                WebViewUtilKt.startWebView$default(Constants.INSTANCE.getEcoPrivacyPolicyUrlByType("sport_healthy_privacy_policy", ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(c1j.k3), false, false, null, false, null, false, 252, null);
                return;
            } else {
                WebViewUtilKt.startWebView$default(Constants.INSTANCE.getWatchAgreementUrl(LocaleUtil.getCurrentLocale(), ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(c1j.k3), false, false, null, false, null, false, 252, null);
                return;
            }
        }
        if (settingItem instanceof AgreementDetailSettingItem) {
            WebViewUtilKt.startWebView$default(Constants.INSTANCE.getEcoUserAgreementByType("sport_healthy_user_agreement", ((LocalSportSettingViewModel) getMViewModel()).getCurModel()), getString(c1j.k3), false, false, null, false, null, false, 252, null);
            return;
        }
        if (settingItem instanceof PrivacyRevokeSettingItem) {
            showRevokeDialog();
            return;
        }
        Logger.e("LocalSportSettingFragment", "onSettingItemClicked unExcepted item:" + settingItem);
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
                ISportAccessApi.DefaultImpls.checkAndDownloadAudioFeedbackResourcesIfNeed$default(SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE), false, "跑步机设置页面", new Function0() { // from class: lle
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalSportSettingFragment.onSettingItemSwitchChanged$lambda$11(settingItem, this);
                    }
                }, new Function0() { // from class: nle
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalSportSettingFragment.onSettingItemSwitchChanged$lambda$12(settingItem, this);
                    }
                }, 1, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void setChildProtectMode(final ISwitchButton btn, final ChildProtectModeSettingItem settingItem) {
        boolean zIsChecked = btn.isChecked();
        btn.setChecked(!zIsChecked);
        showLoading();
        ((LocalSportSettingViewModel) getMViewModel()).setChildProtectSwitch(zIsChecked, new Function1() { // from class: hle
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingFragment.setChildProtectMode$lambda$13(this.f20212a, btn, settingItem, ((Boolean) obj).booleanValue());
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
        ((LocalSportSettingViewModel) getMViewModel()).setMaxSpeedLimit(speed, new Function1() { // from class: fle
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalSportSettingFragment.setMaxSpeedLimit$lambda$15(this.f17896a, (String) obj);
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
        CommonDialog commonDialogCreate = new CommonDialog.c("cannot").setDialogTitle(c1j.r2).setDialogDescription(c1j.q2).setPositiveText(c1j.h).setNegativeText(c1j.f).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment.showCannotUpdateDialog.1
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
        CustomPickerDialog customPickerDialogCreate = new CustomPickerDialog.Builder("max_speed").setCanceledOnTouchOutside(true).setDialogTitle(c1j.y2).setPositiveText(c1j.h).setNegativeText(c1j.f).create();
        Intrinsics.checkNotNullExpressionValue(customPickerDialogCreate, "create(...)");
        final CustomPickerDialog customPickerDialog = customPickerDialogCreate;
        customPickerDialog.setValue(((LocalSportSettingViewModel) getMViewModel()).getCurSpeedLimit());
        customPickerDialog.setCustomAdapter(new CustomPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment.showChooseSpeedDialog.1
            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getMaxSpeedRange().size();
            }

            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getSpeedStr(getValue(index));
            }

            @Override // com.xiaomi.fitness.sport.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return LocalSportSettingFragment.access$getMViewModel(LocalSportSettingFragment.this).getMaxSpeedRange().get(index).intValue();
            }
        });
        customPickerDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment.showChooseSpeedDialog.2
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
        CommonDialog commonDialogCreate = new CommonDialog.c("revoke").setDialogTitle(c1j.z3).setDialogDescription(c1j.y3).setPositiveText(c1j.A3).setNegativeText(c1j.l3).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingFragment.showRevokeDialog.1
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSettingData() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((LocalSportSettingViewModel) getMViewModel()).readSettingConfig(new Function2() { // from class: vke
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalSportSettingFragment.updateSettingData$lambda$1(this.f36980a, ((Boolean) obj).booleanValue(), (gs9[]) obj2);
            }
        });
        ((LocalSportSettingViewModel) getMViewModel()).checkForUpdate(new Function3() { // from class: dle
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalSportSettingFragment.updateSettingData$lambda$3(this.f15658a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (LocalDeviceUpgradeModel.CheckUpgradeRequest) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSettingData$lambda$1(LocalSportSettingFragment this$0, boolean z, gs9[] gs9VarArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.d("LocalSportSettingFragment", " readSettingConfig " + z);
        if (z) {
            this$0.setSettingConfig();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateSettingData$lambda$3(LocalSportSettingFragment this$0, int i, boolean z, LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (i != 0) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, c1j.L);
            }
        } else if (checkUpgradeRequest != null) {
            String deviceUpgradeRedPoint = SportPreference.INSTANCE.getDeviceUpgradeRedPoint(((LocalSportSettingViewModel) this$0.getMViewModel()).getDeviceMac());
            boolean z2 = !Intrinsics.areEqual(deviceUpgradeRedPoint, checkUpgradeRequest.latestVersion);
            Logger.i("LocalSportSettingFragment", "show update red point " + deviceUpgradeRedPoint + " " + z2);
            Pair pairFindItem = this$0.mAdapter.findItem(UpgradeSettingItem.class);
            UpgradeSettingItem upgradeSettingItem = (UpgradeSettingItem) pairFindItem.getFirst();
            if (upgradeSettingItem != null) {
                upgradeSettingItem.setRedPointShow(z && z2);
            }
            this$0.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    public /* bridge */ /* synthetic */ AbsViewModel initViewModel(ViewModelStoreOwner viewModelStoreOwner, KClass kClass) {
        return initViewModel(viewModelStoreOwner, (KClass<LocalSportSettingViewModel>) kClass);
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.Hilt_LocalSportSettingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (GymDeviceModel.INSTANCE.curGymDeviceModel() == null) {
            ToastExtKt.toastShort(context, c1j.j);
            finish();
        }
        this.maxHertRateLuncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: ple
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                LocalSportSettingFragment.onAttach$lambda$0(this.f30520a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        lcn lcnVar = this.sportDB;
        lcnVar.f24908a = 3;
        LocalSportSettingHelper.INSTANCE.saveSportModelFromDB(lcnVar);
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateSettingData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c1j.I0);
        RecyclerView recyclerView = ((omn) getMBinding()).A;
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
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        this.mAdapter.setOnItemClickListener(new Function2() { // from class: rle
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalSportSettingFragment.setListener$lambda$6(this.f32675a, (LocalSportSettingItemAdapter.SettingItem) obj, (LocalSportSettingItemAdapter.IItemHolder) obj2);
            }
        });
        this.mAdapter.setOnItemSwitchChangedListener(new Function3() { // from class: tle
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalSportSettingFragment.setListener$lambda$7(this.f34829a, ((Integer) obj).intValue(), (ISwitchButton) obj2, (LocalSportSettingItemAdapter.SettingItem) obj3);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public LocalSportSettingViewModel initViewModel(@Nullable ViewModelStoreOwner owner, @Nullable KClass<LocalSportSettingViewModel> vm) {
        return (LocalSportSettingViewModel) new ViewModelProvider(this, new LocalSportSettingViewModel.ViewModelFactory(this.sportDB)).get(LocalSportSettingViewModel.class);
    }
}
