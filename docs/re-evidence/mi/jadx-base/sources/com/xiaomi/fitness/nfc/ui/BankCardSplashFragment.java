package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtil;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.BankCardSplashFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.ltg;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.ssg;
import defpackage.sui;
import defpackage.tpg;
import defpackage.vqg;
import defpackage.wni;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/BankCardSplashFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/BanCardSplashViewModel;", "Ltpg;", "", "onHuamiNextPage", "()V", "handleHuamiPinStatus", "checkPinOnce", "checkPinTwice", "handleBLEPinStatus", "onBLENextPage", "gotoAddCard", "updatePwd", "setUnWearPwd", "checkCRSStatus", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Ltpg;)V", "", "mPinStatus", "I", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BankCardSplashFragment extends BaseCardFragment<BanCardSplashViewModel, tpg> {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel;
    private int mPinStatus;

    public BankCardSplashFragment() {
        super(sui.c0, 0, true);
        this.mPinStatus = -1;
        this.mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uz1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BankCardSplashFragment.mDeviceModel_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BanCardSplashViewModel access$getMViewModel(BankCardSplashFragment bankCardSplashFragment) {
        return (BanCardSplashViewModel) bankCardSplashFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(BankCardSplashFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoPage(SyncEseFragment.class, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(BankCardSplashFragment this$0, View view) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getMDeviceModel() != null) {
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            if (DeviceModelExtKt.isHuaMi(mDeviceModel)) {
                this$0.onHuamiNextPage();
            } else {
                this$0.onBLENextPage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkCRSStatus() {
        ((BanCardSplashViewModel) getMViewModel()).checkCRSCode(new Function1() { // from class: sz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardSplashFragment.checkCRSStatus$lambda$11(this.f34114a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkCRSStatus$lambda$11(final BankCardSplashFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.hideLoading();
            this$0.updatePwd();
            this$0.finish();
        } else {
            ((BanCardSplashViewModel) this$0.getMViewModel()).checkCRSStatus(new Function1() { // from class: wz1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BankCardSplashFragment.checkCRSStatus$lambda$11$lambda$10(this.f38490a, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCRSStatus$lambda$11$lambda$10(BankCardSplashFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new BankCardSplashFragment$checkCRSStatus$1$1$1(this$0, z, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void checkPinOnce() throws Exception {
        ltg.c().pinStatus(new ssg.b() { // from class: qz1
            @Override // ssg.b
            public final void onResult(Object obj) {
                BankCardSplashFragment.checkPinOnce$lambda$5(this.f32004a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPinOnce$lambda$5(BankCardSplashFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        this$0.mPinStatus = iIntValue;
        vqg.d("checkPinOnce pinStatus : " + iIntValue);
        AnyExtKt.main$default(null, new BankCardSplashFragment$checkPinOnce$1$1(this$0, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPinTwice() throws Exception {
        ltg.c().pinStatus(new ssg.b() { // from class: vz1
            @Override // ssg.b
            public final void onResult(Object obj) {
                BankCardSplashFragment.checkPinTwice$lambda$6(this.f37380a, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkPinTwice$lambda$6(BankCardSplashFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        this$0.mPinStatus = iIntValue;
        vqg.d("checkPinTwice pinStatus : " + iIntValue);
        AnyExtKt.main$default(null, new BankCardSplashFragment$checkPinTwice$1$1(this$0, null), 1, null);
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    private final void gotoAddCard() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("sIsMaster", true);
        gotoPage(AddCardNumberFragment.class, bundle);
        finish();
    }

    private final void handleBLEPinStatus() {
        if (this.mPinStatus == 3) {
            updatePwd();
        } else {
            setUnWearPwd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleHuamiPinStatus() throws Exception {
        vqg.d("handleHuamiPinStatus pinStatus : " + this.mPinStatus);
        int i = this.mPinStatus;
        if (i == 2) {
            setUnWearPwd();
            return;
        }
        if (i == 3) {
            checkCRSStatus();
            return;
        }
        if (i == 6) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
            ((BanCardSplashViewModel) getMViewModel()).clearSE(new Function2() { // from class: pz1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BankCardSplashFragment.handleHuamiPinStatus$lambda$4(this.f30922a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        } else if (i != 7) {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
            checkPinOnce();
        } else {
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
            ((BanCardSplashViewModel) getMViewModel()).clearSE(new Function2() { // from class: zz1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BankCardSplashFragment.handleHuamiPinStatus$lambda$3(this.f41816a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleHuamiPinStatus$lambda$3(BankCardSplashFragment this$0, boolean z, String str) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPinOnce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleHuamiPinStatus$lambda$4(BankCardSplashFragment this$0, boolean z, String str) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPinOnce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onBLENextPage() {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        boolean z = NfcPreference.getBoolean("key_is_nfc_mastercard_check_pre_account_data_" + mDeviceModel.getDid(), false);
        vqg.d("checkPreAccountData isCheck:" + z);
        if (z) {
            handleBLEPinStatus();
        } else {
            PageState.DefaultImpls.showLoading$default(this, o0j.g2, false, 2, null);
            ((BanCardSplashViewModel) getMViewModel()).checkPreAccountData(new Function2() { // from class: tz1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BankCardSplashFragment.onBLENextPage$lambda$7(this.f35198a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBLENextPage$lambda$7(BankCardSplashFragment this$0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (z) {
            WearableDeviceModel mDeviceModel = this$0.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            NfcPreference.getBoolean("key_is_nfc_mastercard_check_pre_account_data_" + mDeviceModel.getDid(), true);
            this$0.handleBLEPinStatus();
        } else {
            ToastUtil.showShortToast(str);
        }
        return Unit.INSTANCE;
    }

    private final void onHuamiNextPage() throws Exception {
        handleHuamiPinStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUnWearPwd() {
        String string = getString(o0j.y7);
        String string2 = getString(o0j.G6);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i = o0j.S3;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(string, string2, i, parentFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: oz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardSplashFragment.setUnWearPwd$lambda$8(this.f29833a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: rz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BankCardSplashFragment.setUnWearPwd$lambda$9((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUnWearPwd$lambda$8(BankCardSplashFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        SettingsPageUtil settingsPageUtil = SettingsPageUtilExtKt.getSettingsPageUtil();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        settingsPageUtil.gotoUnWearSettingFragment(mActivity, true);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUnWearPwd$lambda$9(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    private final void updatePwd() {
        BaseCardFragment.gotoPage$default(this, UpgradePwdSecurityLevelFragment.class, null, 2, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull tpg tpgVar) {
        Intrinsics.checkNotNullParameter(tpgVar, "<this>");
        setTitle(NfcUtils.INSTANCE.payName());
        String string = null;
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(sui.P0, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        imageView.setImageResource(wni.u);
        imageView.setContentDescription(getString(o0j.L6));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: xz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BankCardSplashFragment.bindView$lambda$1(this.f39604a, view);
            }
        });
        setEndView(imageView);
        ((tpg) getMBinding()).H.setVisibility(8);
        ((tpg) getMBinding()).E.setVisibility(0);
        ((tpg) getMBinding()).D.show(getMDeviceModel());
        ((tpg) getMBinding()).A.setBankCardTextView(true);
        ((tpg) getMBinding()).G.setVisibility(0);
        View viewFindViewById = ((tpg) getMBinding()).B.findViewById(mri.E4);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = tpgVar.B.findViewById(mri.i);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        if (getMDeviceModel() != null) {
            Resources resources = getResources();
            int i = o0j.s0;
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            String model = DeviceModelExtKt.getModel(mDeviceModel);
            String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            String upperCase = RegionUtil.getCurrentLocalCountry().toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            string = resources.getString(i, pf4.d(model, currentLocale$default, upperCase));
        }
        textView.setText(com.xiaomi.fitness.nfc.hyperlink.a.d(string, new String[]{getString(o0j.t0)}));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        View viewFindViewById3 = ((tpg) getMBinding()).B.findViewById(mri.c);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: yz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                BankCardSplashFragment.bindView$lambda$2(this.f40704a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.mPinStatus = args.getInt("PIN_STATUS");
        }
    }
}
