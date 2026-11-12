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
import com.mi.fitness.checkupdate.eco.EcoUpdateHelper;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.utils.Constants;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingItemAdapter;
import com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.mcn;
import defpackage.two;
import defpackage.xx7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001JB\u0007¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J)\u00103\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H\u0014¢\u0006\u0004\b5\u0010\u0006J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalRopeSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalRopeSettingViewModel;", "Lxx7;", "", "loadBundle", "()V", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "settingItem", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", "itemHolder", "onSettingItemClicked", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;)V", "showRevokeDialog", "doRevoke", "goHrRemindSetting", "checkForUpdate", "", "position", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "btn", "onSettingItemSwitchChanged", "(ILcom/xiaomi/fitness/widget/button/ISwitchButton;Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "Landroid/content/Intent;", "data", "onMaxHertRateFragmentResult", "(Landroid/content/Intent;)V", "title", "value", "", "list", "", "str", "Lkotlin/Function1;", "confirm", "showDialog", "(IILjava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", CardInfo.KEY_OWNER, "Lkotlin/reflect/KClass;", "vm", "initViewModel", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;)Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalRopeSettingViewModel;", "setListener", "", "onBackPressed", "()Z", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter;", "mAdapter", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter;", "Lmcn;", "sportDB", "Lmcn;", "Landroidx/activity/result/ActivityResultLauncher;", "maxHertRateLuncher", "Landroidx/activity/result/ActivityResultLauncher;", "localSportType", "Ljava/lang/String;", "isSporting", "Z", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalRopeSettingFragment extends Hilt_LocalRopeSettingFragment<LocalRopeSettingViewModel, xx7> {

    @NotNull
    public static final String IS_SPORTING = "IS_SPORTING";

    @NotNull
    public static final String TAG = "LocalRopeSettingFragment";
    private boolean isSporting;

    @NotNull
    private String localSportType;

    @NotNull
    private final LocalSportSettingItemAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ActivityResultLauncher<Intent> maxHertRateLuncher;

    @NotNull
    private mcn sportDB;

    public LocalRopeSettingFragment() {
        super(fvi.w);
        this.mAdapter = new LocalSportSettingItemAdapter();
        this.sportDB = LocalSportSettingHelper.INSTANCE.getSportModelFromDB();
        this.localSportType = "yunmai.jmprope.sr803";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkForUpdate() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastUtil.showShortToast(e1j.common_hint_network_unavailable);
            return;
        }
        two mDeviceInfo = ((LocalRopeSettingViewModel) getMViewModel()).getMDeviceInfo();
        if (mDeviceInfo != null) {
            EcoUpdateHelper.INSTANCE.doCheckRopeUpdate(((LocalRopeSettingViewModel) getMViewModel()).getCurDevice(), mDeviceInfo, this.localSportType, new Function1() { // from class: pke
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalRopeSettingFragment.checkForUpdate$lambda$16$lambda$14(this.f30497a, (Serializable) obj);
                }
            }, new Function1() { // from class: qke
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalRopeSettingFragment.checkForUpdate$lambda$16$lambda$15(this.f31601a, (ApiException) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForUpdate$lambda$16$lambda$14(final LocalRopeSettingFragment this$0, final Serializable result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof LatestVersion) {
            if (((LatestVersion) result).getIsNeedUpdate()) {
                GymDeviceModel.INSTANCE.getBattery(this$0.localSportType, new Function1() { // from class: mke
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LocalRopeSettingFragment.checkForUpdate$lambda$16$lambda$14$lambda$13(this.f26956a, result, ((Integer) obj).intValue());
                    }
                });
            } else {
                EcoUpdateHelper.INSTANCE.showToast(this$0.getContext(), e1j.v);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForUpdate$lambda$16$lambda$14$lambda$13(LocalRopeSettingFragment this$0, Serializable result, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        if (i <= 2) {
            EcoUpdateHelper.INSTANCE.showToast(this$0.getContext(), e1j.F3);
        } else {
            EcoUpdateHelper.INSTANCE.goRopeUpgradeFragment(this$0.getContext(), result, this$0.localSportType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForUpdate$lambda$16$lambda$15(LocalRopeSettingFragment this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoUpdateHelper.INSTANCE.showToast(this$0.getContext(), e1j.u);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRevoke() {
        String did;
        FitnessLogUtils.i(TAG, "click , doRevoke");
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(this.localSportType);
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        EcoDeviceManagerExtKt.getInstance(companion).deauthorize(did, new Function0() { // from class: eke
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalRopeSettingFragment.doRevoke$lambda$11(this.f16736a);
            }
        }, new Function1() { // from class: fke
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LocalRopeSettingFragment.doRevoke$lambda$12(((Integer) obj).intValue());
            }
        });
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.startPassportWebActivity(fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRevoke$lambda$11(LocalRopeSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "doRevoke onSuccess");
        AnyExtKt.main$default(null, new LocalRopeSettingFragment$doRevoke$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doRevoke$lambda$12(int i) {
        Logger.i(TAG, "doRevoke onFail " + i);
        return Unit.INSTANCE;
    }

    private final void goHrRemindSetting() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRemindHr", this.sportDB.c);
        bundle.putInt("heartRate", this.sportDB.d);
        bundle.putString("heartRateRange", this.sportDB.l);
        bundle.putBoolean("heartRateRangeSwitch", this.sportDB.n);
        FragmentParams fragmentParamsB = new FragmentParams.b().e(MaxHertRateFragment.class).c(bundle).a(true).b();
        Intent intent = new Intent(requireContext(), (Class<?>) CommonBaseActivity.class);
        Intrinsics.checkNotNull(fragmentParamsB, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
        ActivityResultLauncher<Intent> activityResultLauncher = this.maxHertRateLuncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maxHertRateLuncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    private final void loadBundle() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(SportConstants.KEY_GYM_MODE_TYPE)) == null) {
            string = "yunmai.jmprope.sr803";
        }
        this.localSportType = string;
        Bundle arguments2 = getArguments();
        this.isSporting = arguments2 != null ? arguments2.getBoolean(IS_SPORTING) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$0(LocalRopeSettingFragment this$0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMaxHertRateFragmentResult(activityResult.a());
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
        Logger.d(TAG, "onSettingItemClicked item:" + settingItem);
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        if (settingItem instanceof MetronomeSettingItem) {
            int i = e1j.u3;
            int metronomeValue = ((LocalRopeSettingViewModel) getMViewModel()).getMetronomeValue();
            List<Integer> metronomeFrequencyHopping = ((LocalRopeSettingViewModel) getMViewModel()).getMetronomeFrequencyHopping();
            String string = getString(e1j.C0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showDialog(i, metronomeValue, metronomeFrequencyHopping, string, new Function1() { // from class: dke
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalRopeSettingFragment.onSettingItemClicked$lambda$5(this.f15616a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (settingItem instanceof CountingIntervalSettingItem) {
            int i2 = e1j.h3;
            int countingIntervalValue = ((LocalRopeSettingViewModel) getMViewModel()).getCountingIntervalValue();
            ArrayList<Integer> countingInterval = ((LocalRopeSettingViewModel) getMViewModel()).getCountingInterval();
            String string2 = getString(e1j.C0);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            showDialog(i2, countingIntervalValue, countingInterval, string2, new Function1() { // from class: ike
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalRopeSettingFragment.onSettingItemClicked$lambda$7(this.f21252a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (settingItem instanceof ReportingIntervalSettingItem) {
            int i3 = e1j.J3;
            int reportingIntervalValue = ((LocalRopeSettingViewModel) getMViewModel()).getReportingIntervalValue();
            ArrayList<Integer> reportingInterval = ((LocalRopeSettingViewModel) getMViewModel()).getReportingInterval();
            String string3 = getString(e1j.C0);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            showDialog(i3, reportingIntervalValue, reportingInterval, string3, new Function1() { // from class: jke
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LocalRopeSettingFragment.onSettingItemClicked$lambda$9(this.f22892a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        if (settingItem instanceof HrRemindSettingItem) {
            goHrRemindSetting();
            return;
        }
        if (settingItem instanceof SportsDataToBeClaimedSettingItem) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                GymDeviceModel.checkEcoJumpOfflineReport$default(GymDeviceModel.INSTANCE, this.localSportType, activity, false, null, 8, null);
                return;
            }
            return;
        }
        if (settingItem instanceof UpgradeSettingItem) {
            checkForUpdate();
            return;
        }
        if (settingItem instanceof AboutSettingItem) {
            BaseFragmentExKt.gotoPage(this, LocalDeviceInfoFragment.class, null);
            return;
        }
        if (settingItem instanceof UserAgreementSettingItem) {
            Constants constants = Constants.INSTANCE;
            WebViewUtilKt.startWebView$default(constants.getEcoUserAgreementByType(constants.getEcoUserAgreementType(), ((LocalRopeSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.S3), false, false, null, false, null, false, 252, null);
            return;
        }
        if (settingItem instanceof DevicePrivacyPolicySettingItem) {
            Constants constants2 = Constants.INSTANCE;
            WebViewUtilKt.startWebView$default(constants2.getEcoPrivacyPolicyUrlByType(constants2.getEcoPrivacyPolicyType(), ((LocalRopeSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.G2), false, false, null, false, null, false, 252, null);
        } else {
            if (settingItem instanceof PrivacyPolicyWithdrawalOfConsentSettingItem) {
                showRevokeDialog();
                return;
            }
            if (settingItem instanceof HelpSettingItem) {
                WebViewUtilKt.startWebView$default(Constants.INSTANCE.getECoUserGuideUrl(LocaleUtil.getCurrentLocale(), ((LocalRopeSettingViewModel) getMViewModel()).getCurModel()), getString(e1j.m3), false, false, null, false, null, false, 252, null);
                return;
            }
            Logger.e(TAG, "onSettingItemClicked unExcepted item:" + settingItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onSettingItemClicked$lambda$5(LocalRopeSettingFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((LocalRopeSettingViewModel) this$0.getMViewModel()).setMetronomeValue(i);
        Pair pairFindItem = this$0.mAdapter.findItem(MetronomeSettingItem.class);
        MetronomeSettingItem metronomeSettingItem = (MetronomeSettingItem) pairFindItem.getFirst();
        if (metronomeSettingItem != null) {
            if (i == 0) {
                mcn mcnVar = this$0.sportDB;
                if (mcnVar != null) {
                    mcnVar.i = false;
                }
                metronomeSettingItem.setRightValue(this$0.getString(e1j.C0));
            } else {
                mcn mcnVar2 = this$0.sportDB;
                if (mcnVar2 != null) {
                    mcnVar2.j = i;
                }
                if (mcnVar2 != null) {
                    mcnVar2.i = true;
                }
                metronomeSettingItem.setRightValue(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), ayi.l, i, Integer.valueOf(i)));
            }
            this$0.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onSettingItemClicked$lambda$7(LocalRopeSettingFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((LocalRopeSettingViewModel) this$0.getMViewModel()).setCountingIntervalValue(i);
        Pair pairFindItem = this$0.mAdapter.findItem(VoiceAnnouncementsSettingItem.class);
        if (((VoiceAnnouncementsSettingItem) pairFindItem.getFirst()) != null) {
            mcn mcnVar = this$0.sportDB;
            if (mcnVar != null) {
                mcnVar.q = i;
            }
            this$0.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onSettingItemClicked$lambda$9(LocalRopeSettingFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((LocalRopeSettingViewModel) this$0.getMViewModel()).setReportingIntervalValue(i);
        Pair pairFindItem = this$0.mAdapter.findItem(VoiceAnnouncementsSettingItem.class);
        if (((VoiceAnnouncementsSettingItem) pairFindItem.getFirst()) != null) {
            mcn mcnVar = this$0.sportDB;
            if (mcnVar != null) {
                mcnVar.f26021r = i;
            }
            this$0.mAdapter.notifyItemChanged(((Number) pairFindItem.getSecond()).intValue());
        }
        return Unit.INSTANCE;
    }

    private final void onSettingItemSwitchChanged(int position, final ISwitchButton btn, LocalSportSettingItemAdapter.SettingItem settingItem) {
        boolean zIsChecked = btn.isChecked();
        if (!(settingItem instanceof LocalSportSettingItemAdapter.SwitchSettingItem)) {
            Logger.e(TAG, "onSettingItemSwitchChanged unExcepted item:" + settingItem);
            return;
        }
        LocalSportSettingItemAdapter.SwitchSettingItem switchSettingItem = (LocalSportSettingItemAdapter.SwitchSettingItem) settingItem;
        if (switchSettingItem instanceof VoiceAnnouncementsSettingItem) {
            if (zIsChecked) {
                SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).checkAndDownloadAudioFeedbackResourcesIfNeed(true, "local_rope", new Function0() { // from class: nke
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalRopeSettingFragment.onSettingItemSwitchChanged$lambda$17(this.f28011a, btn);
                    }
                }, new Function0() { // from class: oke
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalRopeSettingFragment.onSettingItemSwitchChanged$lambda$18(this.f29247a, btn);
                    }
                });
                return;
            } else {
                this.sportDB.m = false;
                return;
            }
        }
        if (switchSettingItem instanceof ScreenOnSettingItem) {
            this.sportDB.f26019b = zIsChecked;
            return;
        }
        Logger.e(TAG, "onSettingItemSwitchChanged unExcepted item:" + settingItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingItemSwitchChanged$lambda$17(LocalRopeSettingFragment this$0, ISwitchButton btn) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "$btn");
        this$0.sportDB.m = true;
        btn.setChecked(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingItemSwitchChanged$lambda$18(LocalRopeSettingFragment this$0, ISwitchButton btn) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "$btn");
        this$0.sportDB.m = false;
        btn.setChecked(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(boolean z, two twoVar) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(LocalRopeSettingFragment this$0, LocalSportSettingItemAdapter.SettingItem item, LocalSportSettingItemAdapter.IItemHolder itemHolder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
        this$0.onSettingItemClicked(item, itemHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3(LocalRopeSettingFragment this$0, int i, ISwitchButton btn, LocalSportSettingItemAdapter.SettingItem settingItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(btn, "btn");
        Intrinsics.checkNotNullParameter(settingItem, "settingItem");
        this$0.onSettingItemSwitchChanged(i, btn, settingItem);
        return Unit.INSTANCE;
    }

    private final void showDialog(int title, int value, final List<Integer> list, final String str, final Function1<? super Integer, Unit> confirm) {
        final CustomPickerDialog customPickerDialogCreate = new CustomPickerDialog.Builder("").setDialogTitle(title).setCanceledOnTouchOutside(true).setPositiveText(e1j.S).setNegativeText(e1j.Q).create();
        customPickerDialogCreate.setValue(value);
        customPickerDialogCreate.setCustomAdapter(new CustomPickerDialog.CustomAdapter() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment.showDialog.1
            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getCount() {
                return list.size();
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter
            public String getDisplayValue(int index) {
                int value2 = getValue(index);
                return value2 == 0 ? str : String.valueOf(value2);
            }

            @Override // com.xiaomi.fitness.sport_eco.view.widget.CustomPickerDialog.CustomAdapter, com.xiaomi.fitness.baseui.dialog.PickerDialog.a
            public int getValue(int index) {
                return list.get(index).intValue();
            }
        });
        customPickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment.showDialog.2
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    confirm.invoke2(Integer.valueOf(customPickerDialogCreate.getValue()));
                }
            }
        });
        customPickerDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showRevokeDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("revoke").setDialogTitle(e1j.U2).setDialogDescription(e1j.T2).setPositiveText(e1j.V2).setNegativeText(e1j.H2).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingFragment.showRevokeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    LocalRopeSettingFragment.this.doRevoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    public /* bridge */ /* synthetic */ AbsViewModel initViewModel(ViewModelStoreOwner viewModelStoreOwner, KClass kClass) {
        return initViewModel(viewModelStoreOwner, (KClass<LocalRopeSettingViewModel>) kClass);
    }

    @Override // com.xiaomi.fitness.sport_eco.view.launch.gym.setting.Hilt_LocalRopeSettingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        loadBundle();
        this.maxHertRateLuncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: hke
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                LocalRopeSettingFragment.onAttach$lambda$0(this.f20164a, (ActivityResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        mcn mcnVar = this.sportDB;
        mcnVar.f26018a = 14;
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
        this.mAdapter.setDataList(((LocalRopeSettingViewModel) getMViewModel()).buildSettingItems(this.isSporting), this.sportDB);
        ((LocalRopeSettingViewModel) getMViewModel()).getRopeInfo(new Function2() { // from class: gke
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalRopeSettingFragment.onViewCreated$lambda$1(((Boolean) obj).booleanValue(), (two) obj2);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        this.mAdapter.setOnItemClickListener(new Function2() { // from class: kke
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalRopeSettingFragment.setListener$lambda$2(this.f23948a, (LocalSportSettingItemAdapter.SettingItem) obj, (LocalSportSettingItemAdapter.IItemHolder) obj2);
            }
        });
        this.mAdapter.setOnItemSwitchChangedListener(new Function3() { // from class: lke
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LocalRopeSettingFragment.setListener$lambda$3(this.f25170a, ((Integer) obj).intValue(), (ISwitchButton) obj2, (LocalSportSettingItemAdapter.SettingItem) obj3);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public LocalRopeSettingViewModel initViewModel(@Nullable ViewModelStoreOwner owner, @Nullable KClass<LocalRopeSettingViewModel> vm) {
        return (LocalRopeSettingViewModel) new ViewModelProvider(this, new LocalRopeSettingViewModel.ViewModelFactory(this.localSportType, this.sportDB)).get(LocalRopeSettingViewModel.class);
    }
}
