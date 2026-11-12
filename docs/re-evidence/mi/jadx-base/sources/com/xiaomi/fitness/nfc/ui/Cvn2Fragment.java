package com.xiaomi.fitness.nfc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.service.mi.BankCard;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.ui.Cvn2Fragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.f9l;
import defpackage.jqg;
import defpackage.o0j;
import defpackage.sui;
import defpackage.vqg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/Cvn2Fragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/Cvn2ViewModel;", "Ljqg;", "Landroid/text/TextWatcher;", "Lf9l$f;", "", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "(Ljqg;)V", "", "s", "", StatConstants.PARAM_START, "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "str", "afterTextChanged", "(Landroid/text/Editable;)V", "onVisible", "()V", "onInvisible", "visible", "onKeyboardVisibilityChanged", "(Z)V", "", "cardNumber", "Ljava/lang/String;", "ownerName", "year", "month", "Lcom/service/mi/BankCard;", "bankCard", "Lcom/service/mi/BankCard;", "procolUrl", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Cvn2Fragment extends BaseCardFragment<Cvn2ViewModel, jqg> implements TextWatcher, f9l.f {

    @NotNull
    public static final String sCNV2 = "sCNV2";

    @NotNull
    public static final String sProcolUrl = "sProcolUrl";
    private static final int sRequestCodeNext = 10;

    @NotNull
    public static final String sValidDate = "sValidDate";

    @Nullable
    private BankCard bankCard;

    @Nullable
    private String cardNumber;

    @Nullable
    private String month;

    @Nullable
    private String ownerName;

    @Nullable
    private String procolUrl;

    @Nullable
    private String year;

    public Cvn2Fragment() {
        super(sui.k0, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$2(jqg this_bindView, final Cvn2Fragment this$0, View view) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final String strValueOf = String.valueOf(this_bindView.F.getText());
        if (strValueOf.length() == 0) {
            ToastUtil.showShortToast(o0j.l0);
            return;
        }
        if (strValueOf.length() != 3) {
            ToastUtil.showShortToast(o0j.k0);
            return;
        }
        String str4 = this$0.cardNumber;
        if (str4 != null && str4.length() != 0 && (str = this$0.ownerName) != null && str.length() != 0 && (str2 = this$0.year) != null && str2.length() != 0 && (str3 = this$0.month) != null && str3.length() != 0) {
            PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
            Cvn2ViewModel cvn2ViewModel = (Cvn2ViewModel) this$0.getMViewModel();
            String str5 = this$0.cardNumber;
            Intrinsics.checkNotNull(str5);
            String str6 = this$0.ownerName;
            Intrinsics.checkNotNull(str6);
            String str7 = this$0.year;
            Intrinsics.checkNotNull(str7);
            String str8 = this$0.month;
            Intrinsics.checkNotNull(str8);
            cvn2ViewModel.checkCvv2(str5, str6, str7, str8, strValueOf, new Function2() { // from class: lf5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Cvn2Fragment.bindView$lambda$2$lambda$1(this.f25000a, strValueOf, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
            return;
        }
        vqg.b("checkCvv2 cardNumber = " + this$0.cardNumber + " ownerName = " + this$0.ownerName + " year = " + this$0.year + " month = " + this$0.month);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2$lambda$1(final Cvn2Fragment this$0, String cvc2, boolean z, String message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cvc2, "$cvc2");
        Intrinsics.checkNotNullParameter(message, "message");
        this$0.hideLoading();
        if (z) {
            Intent intent = new Intent(this$0.getMActivity(), (Class<?>) IssuerActivity.class);
            Bundle arguments = this$0.getArguments();
            Object objClone = arguments != null ? arguments.clone() : null;
            Bundle bundle = objClone instanceof Bundle ? (Bundle) objClone : null;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("sIsMaster", true);
            bundle.putString("security_code", cvc2);
            bundle.putBoolean("sIsMaster", true);
            intent.putExtras(bundle);
            this$0.startForActivityResult(intent, new Function2() { // from class: kf5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Cvn2Fragment.bindView$lambda$2$lambda$1$lambda$0(this.f23799a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } else {
            ToastUtil.showShortToast(message);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2$lambda$1$lambda$0(Cvn2Fragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -1) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(Cvn2Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CNV2HelpFragment.sIsShowCNV2, true);
        bundle.putBoolean("sIsMaster", true);
        this$0.gotoPage(CNV2HelpFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(Cvn2Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CNV2HelpFragment.sIsShowCNV2, false);
        this$0.gotoPage(CNV2HelpFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(Cvn2Fragment this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((jqg) this$0.getMBinding()).G.setEnabled(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable str) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(String.valueOf(str), "/", "", false, 4, (Object) null);
        if (strReplace$default.length() > 2) {
            ((jqg) getMBinding()).N.removeTextChangedListener(this);
            String strSubstring = strReplace$default.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = strReplace$default.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str2 = strSubstring + "/" + strSubstring2;
            ((jqg) getMBinding()).N.setText(str2);
            ((jqg) getMBinding()).N.setSelection(str2.length());
            ((jqg) getMBinding()).N.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s, int start, int count, int after) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final jqg jqgVar) {
        Window window;
        Intrinsics.checkNotNullParameter(jqgVar, "<this>");
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null && (window = mActivity.getWindow()) != null) {
            window.addFlags(8192);
        }
        setTitle(NfcUtils.INSTANCE.payName());
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        if (TextUtils.isEmpty(userId)) {
            jqgVar.O.setText(getString(o0j.y0));
        } else {
            jqgVar.O.setText(getString(o0j.z0, userId));
        }
        if (!TextUtils.isEmpty(this.procolUrl)) {
            String string = getResources().getString(o0j.R2, this.procolUrl);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            jqgVar.H.setText(com.xiaomi.fitness.nfc.hyperlink.a.b(string));
            jqgVar.H.setMovementMethod(LinkMovementMethod.getInstance());
            jqgVar.I.setVisibility(0);
        }
        jqgVar.M.setVisibility(8);
        jqgVar.K.setVisibility(8);
        jqgVar.E.setText(o0j.Q2);
        ((jqg) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: gf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Cvn2Fragment.bindView$lambda$2(jqgVar, this, view);
            }
        });
        ((jqg) getMBinding()).N.addTextChangedListener(this);
        ((jqg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: hf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Cvn2Fragment.bindView$lambda$3(this.f20006a, view);
            }
        });
        ((jqg) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: if5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Cvn2Fragment.bindView$lambda$4(this.f21079a, view);
            }
        });
        ((jqg) getMBinding()).B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jf5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Cvn2Fragment.bindView$lambda$5(this.f22729a, compoundButton, z);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        vqg.b("Cvn2Fragment onVisible");
        f9l.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f9l.f
    public void onKeyboardVisibilityChanged(boolean visible) {
        vqg.b("Cvn2Fragment onKeyboardVisibilityChanged:" + visible);
        int i = visible ? 8 : 0;
        ((jqg) getMBinding()).I.setVisibility(i);
        ((jqg) getMBinding()).G.setVisibility(i);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s, int start, int before, int count) {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        vqg.b("Cvn2Fragment onVisible");
        f9l.s(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.cardNumber = args.getString("account_number");
            this.cardNumber = args.getString(AddCardNumberFragment.INSTANCE.getSCardNumber());
            this.bankCard = (BankCard) args.getParcelable(AddCardNumberFragment.sBankCard);
            this.procolUrl = args.getString(sProcolUrl);
            this.ownerName = args.getString("account_holder_name");
            this.year = args.getString("expiry_year");
            this.month = args.getString("expiry_month");
        }
    }
}
