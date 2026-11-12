package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.service.mi.BankCard;
import com.service.mi.wallet.entity.MediaContent;
import com.service.mi.wallet.entity.resp.PreDigitizeResp;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.ui.AddCardNumberFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.f9l;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.sui;
import defpackage.vmg;
import defpackage.vqg;
import defpackage.yhq;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import miuix.androidbasewidget.widget.EditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB\u0007¢\u0006\u0004\b\u001c\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AddCardNumberFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/AddCardNumberViewModel;", "Lvmg;", "Lf9l$f;", "nfcFragmentAddCardNumberBinding", "addCardNumberFragment", "", "master", "(Lvmg;Lcom/xiaomi/fitness/nfc/ui/AddCardNumberFragment;)V", "", "isNeedCardInfo", "()Z", "bindView", "(Lvmg;)V", "onVisible", "()V", "onInvisible", "visible", "onKeyboardVisibilityChanged", "(Z)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddCardNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCardNumberFragment.kt\ncom/xiaomi/fitness/nfc/ui/AddCardNumberFragment\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,296:1\n58#2,23:297\n93#2,3:320\n*S KotlinDebug\n*F\n+ 1 AddCardNumberFragment.kt\ncom/xiaomi/fitness/nfc/ui/AddCardNumberFragment\n*L\n110#1:297,23\n110#1:320,3\n*E\n"})
public final class AddCardNumberFragment extends BaseCardFragment<AddCardNumberViewModel, vmg> implements f9l.f {

    @NotNull
    public static final String sBankCard = "sBankCard";

    @NotNull
    public static final String sProtoUrl = "https://sf.pay.xiaomi.com/views/mipay/privacy.html";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeNext = 10;

    @NotNull
    private static final String sCardNumber = "sCardNumber";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AddCardNumberFragment$Companion;", "", "<init>", "()V", "sRequestCodeNext", "", "sCardNumber", "", "getSCardNumber", "()Ljava/lang/String;", AddCardNumberFragment.sBankCard, "sProtoUrl", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSCardNumber() {
            return AddCardNumberFragment.sCardNumber;
        }
    }

    public AddCardNumberFragment() {
        super(sui.p, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vmg access$getMBinding(AddCardNumberFragment addCardNumberFragment) {
        return (vmg) addCardNumberFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AddCardNumberViewModel access$getMViewModel(AddCardNumberFragment addCardNumberFragment) {
        return (AddCardNumberViewModel) addCardNumberFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(vmg this_bindView, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this_bindView.L.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(AddCardNumberFragment this$0, vmg this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.master(this_bindView, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(AddCardNumberFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = o0j.Z0;
        int i2 = o0j.d1;
        int i3 = o0j.common_known;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog$default(i, i2, i3, childFragmentManager, 0, new Function1() { // from class: op0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddCardNumberFragment.bindView$lambda$4$lambda$3((DialogInterface) obj);
            }
        }, (Function1) null, 80, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4$lambda$3(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(AddCardNumberFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CNV2HelpFragment.sIsShowCNV2, false);
        bundle.putBoolean("sIsMaster", true);
        this$0.gotoPage(CNV2HelpFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(AddCardNumberFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CNV2HelpFragment.sIsShowCNV2, true);
        bundle.putBoolean("sIsMaster", true);
        this$0.gotoPage(CNV2HelpFragment.class, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void master(vmg nfcFragmentAddCardNumberBinding, final AddCardNumberFragment addCardNumberFragment) {
        final String strValueOf = String.valueOf(nfcFragmentAddCardNumberBinding.I.getText());
        final String strValueOf2 = String.valueOf(nfcFragmentAddCardNumberBinding.P.getText());
        final String strValueOf3 = String.valueOf(nfcFragmentAddCardNumberBinding.V.getText());
        final String strValueOf4 = String.valueOf(nfcFragmentAddCardNumberBinding.M.getText());
        if (strValueOf.length() == 0) {
            ToastUtil.showShortToast(o0j.n0);
            return;
        }
        if (strValueOf.length() < 15 || strValueOf.length() > 19) {
            ToastUtil.showShortToast(o0j.o0);
            return;
        }
        if (strValueOf2.length() == 0) {
            ToastUtil.showShortToast(o0j.a1);
            return;
        }
        if (strValueOf3.length() == 0) {
            ToastUtil.showShortToast(o0j.u0);
            return;
        }
        if (strValueOf4.length() == 0) {
            ToastUtil.showShortToast(o0j.l0);
        } else if (strValueOf3.length() != 5) {
            ToastUtil.showShortToast(o0j.u0);
        } else {
            ((AddCardNumberViewModel) getMViewModel()).createCard(strValueOf, new Function2() { // from class: np0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddCardNumberFragment.master$lambda$10(this.f28211a, strValueOf3, strValueOf, strValueOf2, strValueOf4, addCardNumberFragment, (BankCard) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit master$lambda$10(final AddCardNumberFragment this$0, String validateDate, final String cardNumber, final String ownerName, final String securityCode, final AddCardNumberFragment addCardNumberFragment, final BankCard bankCard, String str) {
        FragmentActivity mActivity;
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(validateDate, "$validateDate");
        Intrinsics.checkNotNullParameter(cardNumber, "$cardNumber");
        Intrinsics.checkNotNullParameter(ownerName, "$ownerName");
        Intrinsics.checkNotNullParameter(securityCode, "$securityCode");
        Intrinsics.checkNotNullParameter(addCardNumberFragment, "$addCardNumberFragment");
        if (bankCard != null) {
            this$0.showLoading(o0j.z4, false);
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) validateDate, new String[]{"/"}, false, 0, 6, (Object) null);
            final String str3 = (String) listSplit$default.get(0);
            if (bankCard.getCardType() == 2) {
                str2 = UserConfig.KEY_CAMERA_LIST_SORT_ORDER + listSplit$default.get(1);
            } else {
                str2 = (String) listSplit$default.get(1);
            }
            final String str4 = str2;
            ((AddCardNumberViewModel) this$0.getMViewModel()).master(bankCard, cardNumber, ownerName, str4, str3, securityCode, new Function2() { // from class: pp0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddCardNumberFragment.master$lambda$10$lambda$7(this.f30595a, bankCard, ownerName, cardNumber, str4, str3, securityCode, addCardNumberFragment, ((Boolean) obj).booleanValue(), (PreDigitizeResp) obj2);
                }
            }, new Function1() { // from class: qp0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddCardNumberFragment.master$lambda$10$lambda$9(this.f31705a, (String) obj);
                }
            });
        } else if (str != null && str.length() != 0 && (mActivity = this$0.getMActivity()) != null) {
            ToastExtKt.toastShort(mActivity, o0j.B3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit master$lambda$10$lambda$7(AddCardNumberFragment this$0, BankCard bankCard, String ownerName, String cardNumber, String year, String month, String securityCode, AddCardNumberFragment addCardNumberFragment, boolean z, PreDigitizeResp preDigitizeResp) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ownerName, "$ownerName");
        Intrinsics.checkNotNullParameter(cardNumber, "$cardNumber");
        Intrinsics.checkNotNullParameter(year, "$year");
        Intrinsics.checkNotNullParameter(month, "$month");
        Intrinsics.checkNotNullParameter(securityCode, "$securityCode");
        Intrinsics.checkNotNullParameter(addCardNumberFragment, "$addCardNumberFragment");
        Intrinsics.checkNotNullParameter(preDigitizeResp, "preDigitizeResp");
        this$0.dismissDialog();
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(sBankCard, bankCard);
            bundle.putBoolean("sIsMaster", true);
            bundle.putString("account_holder_name", ownerName);
            bundle.putString("account_number", cardNumber);
            bundle.putString("expiry_year", year);
            bundle.putString("expiry_month", month);
            bundle.putString("security_code", securityCode);
            MediaContent termsAndConditionsContent = preDigitizeResp.getTermsAndConditionsContent();
            if (termsAndConditionsContent != null) {
                bundle.putString(Cvn2Fragment.sProcolUrl, termsAndConditionsContent.getUrl());
            }
            Intent intent = new Intent(this$0.getMActivity(), (Class<?>) IssuerActivity.class);
            intent.putExtras(bundle);
            addCardNumberFragment.startActivityForResult(intent, sRequestCodeNext);
        } else {
            ToastUtil.showShortToast(o0j.c1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit master$lambda$10$lambda$9(AddCardNumberFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (str != null && str.length() != 0) {
            int i = o0j.l2;
            FragmentManager childFragmentManager = this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, str, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: wp0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddCardNumberFragment.master$lambda$10$lambda$9$lambda$8((DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit master$lambda$10$lambda$9$lambda$8(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final vmg vmgVar) {
        String string;
        Window window;
        Intrinsics.checkNotNullParameter(vmgVar, "<this>");
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && (window = mActivity.getWindow()) != null) {
            window.addFlags(8192);
        }
        NfcUtils nfcUtils = NfcUtils.INSTANCE;
        setTitle(nfcUtils.payName());
        yhq.c.a();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            Resources resources = getResources();
            int i = o0j.s0;
            String model = DeviceModelExtKt.getModel(wearableDeviceModel);
            String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            String upperCase = RegionUtil.getCurrentLocalCountry().toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            string = resources.getString(i, pf4.d(model, currentLocale$default, upperCase));
        } else {
            string = null;
        }
        vmgVar.S.setText(com.xiaomi.fitness.nfc.hyperlink.a.d(string, new String[]{getString(o0j.t0)}));
        vmgVar.S.setMovementMethod(LinkMovementMethod.getInstance());
        LocaleUtil localeUtil = LocaleUtil.INSTANCE;
        String string2 = getResources().getString(o0j.B4, pf4.e("mipay", LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null)), nfcUtils.payName(), pf4.f("mipay", LocaleUtil.getCurrentLocale$default(localeUtil, false, false, 3, null)), nfcUtils.payName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        vmgVar.Q.setText(com.xiaomi.fitness.nfc.hyperlink.a.d(string2, new String[]{getString(o0j.C4), getString(o0j.D4)}));
        vmgVar.Q.setMovementMethod(LinkMovementMethod.getInstance());
        vmgVar.J.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddCardNumberFragment.bindView$lambda$0(vmgVar, compoundButton, z);
            }
        });
        vmgVar.B.setVisibility(8);
        vmgVar.K.setVisibility(0);
        ((vmg) getMBinding()).V.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.nfc.ui.AddCardNumberFragment.bindView.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String strReplace$default = StringsKt__StringsJVMKt.replace$default(String.valueOf(s), "/", "", false, 4, (Object) null);
                if (strReplace$default.length() > 2) {
                    AddCardNumberFragment.access$getMBinding(AddCardNumberFragment.this).V.removeTextChangedListener(this);
                    String strSubstring = strReplace$default.substring(0, 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = strReplace$default.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    String str = strSubstring + "/" + strSubstring2;
                    AddCardNumberFragment.access$getMBinding(AddCardNumberFragment.this).V.setText(str);
                    AddCardNumberFragment.access$getMBinding(AddCardNumberFragment.this).V.setSelection(str.length());
                    AddCardNumberFragment.access$getMBinding(AddCardNumberFragment.this).V.addTextChangedListener(this);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
        EditText cardNumberView = ((vmg) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(cardNumberView, "cardNumberView");
        cardNumberView.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.nfc.ui.AddCardNumberFragment$bindView$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                String strValueOf = String.valueOf(s);
                if (strValueOf.length() == 16) {
                    AddCardNumberViewModel addCardNumberViewModelAccess$getMViewModel = AddCardNumberFragment.access$getMViewModel(this.this$0);
                    final AddCardNumberFragment addCardNumberFragment = this.this$0;
                    addCardNumberViewModelAccess$getMViewModel.createCard(strValueOf, new Function2<BankCard, String, Unit>() { // from class: com.xiaomi.fitness.nfc.ui.AddCardNumberFragment$bindView$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(BankCard bankCard, String str) {
                            invoke2(bankCard, str);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(BankCard bankCard, String str) {
                            AppCompatImageView addCardVisaMarkIcon = AddCardNumberFragment.access$getMBinding(addCardNumberFragment).A;
                            Intrinsics.checkNotNullExpressionValue(addCardVisaMarkIcon, "addCardVisaMarkIcon");
                            addCardVisaMarkIcon.setVisibility(bankCard != null && bankCard.getCardType() == 2 ? 0 : 8);
                        }
                    });
                } else {
                    AppCompatImageView addCardVisaMarkIcon = AddCardNumberFragment.access$getMBinding(this.this$0).A;
                    Intrinsics.checkNotNullExpressionValue(addCardVisaMarkIcon, "addCardVisaMarkIcon");
                    addCardVisaMarkIcon.setVisibility(8);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        ((vmg) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: sp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCardNumberFragment.bindView$lambda$2(this.f33847a, vmgVar, view);
            }
        });
        vmgVar.O.setOnClickListener(new View.OnClickListener() { // from class: tp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCardNumberFragment.bindView$lambda$4(this.f34902a, view);
            }
        });
        vmgVar.U.setOnClickListener(new View.OnClickListener() { // from class: up0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCardNumberFragment.bindView$lambda$5(this.f35985a, view);
            }
        });
        vmgVar.N.setOnClickListener(new View.OnClickListener() { // from class: vp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddCardNumberFragment.bindView$lambda$6(this.f37096a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeNext && resultCode == -1) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        vqg.b("AddCardNumberFragment onInvisible");
        f9l.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f9l.f
    public void onKeyboardVisibilityChanged(boolean visible) {
        vqg.d("AddCardNumberFragment onKeyboardVisibilityChanged:" + visible);
        int i = visible ? 8 : 0;
        ((vmg) getMBinding()).R.setVisibility(i);
        ((vmg) getMBinding()).L.setVisibility(i);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        vqg.b("AddCardNumberFragment onVisible");
        f9l.s(this);
    }
}
