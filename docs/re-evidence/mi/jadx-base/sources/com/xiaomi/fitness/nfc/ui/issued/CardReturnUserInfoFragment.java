package com.xiaomi.fitness.nfc.ui.issued;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment;
import defpackage.av6;
import defpackage.dog;
import defpackage.ld8;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.yl3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0006*\u0003$'*\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeViewModel;", "Ldog;", "", "showConfirmDialog", "()V", "", "isSuccess", "", "msg", "goToResultPage", "(ZLjava/lang/String;)V", "updateBtnState", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "mName", "Ljava/lang/String;", "mAlipayAccount", "mPhoneNum", "com/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$nameTxtWatcher$1", "nameTxtWatcher", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$nameTxtWatcher$1;", "com/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$alipayTxtWatcher$1", "alipayTxtWatcher", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$alipayTxtWatcher$1;", "com/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$phoneTxtWatcher$1", "phoneTxtWatcher", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$phoneTxtWatcher$1;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardReturnUserInfoFragment extends BaseCardFragment<CardReturnNoticeViewModel, dog> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeResult = 10;

    @NotNull
    private CardReturnUserInfoFragment$alipayTxtWatcher$1 alipayTxtWatcher;

    @Nullable
    private String mAlipayAccount;

    @Nullable
    private String mName;

    @Nullable
    private String mPhoneNum;

    @NotNull
    private CardReturnUserInfoFragment$nameTxtWatcher$1 nameTxtWatcher;

    @NotNull
    private CardReturnUserInfoFragment$phoneTxtWatcher$1 phoneTxtWatcher;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$Companion;", "", "<init>", "()V", "sRequestCodeResult", "", "getSRequestCodeResult", "()I", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeResult() {
            return CardReturnUserInfoFragment.sRequestCodeResult;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$showConfirmDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/nfc/ui/issued/CardReturnUserInfoFragment$showConfirmDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C26951 extends av6 {
        public C26951() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(CardReturnUserInfoFragment this$0, String msg) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this$0.hideLoading();
            ld8.c().l(new yl3(this$0.getCardWrapper(), false));
            this$0.goToResultPage(true, msg);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$1(CardReturnUserInfoFragment this$0, String msg) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(msg, "msg");
            this$0.hideLoading();
            this$0.goToResultPage(false, msg);
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            }
            if (which != -1) {
                return;
            }
            if (dialog != null) {
                dialog.dismiss();
            }
            CardReturnUserInfoFragment.this.showLoading(o0j.h6, false);
            CardReturnNoticeViewModel cardReturnNoticeViewModelAccess$getMViewModel = CardReturnUserInfoFragment.access$getMViewModel(CardReturnUserInfoFragment.this);
            CardWrapper cardWrapper = CardReturnUserInfoFragment.this.getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            String str = CardReturnUserInfoFragment.this.mName;
            Intrinsics.checkNotNull(str);
            String str2 = CardReturnUserInfoFragment.this.mAlipayAccount;
            Intrinsics.checkNotNull(str2);
            String str3 = CardReturnUserInfoFragment.this.mPhoneNum;
            Intrinsics.checkNotNull(str3);
            final CardReturnUserInfoFragment cardReturnUserInfoFragment = CardReturnUserInfoFragment.this;
            Function1<? super String, Unit> function1 = new Function1() { // from class: pr3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardReturnUserInfoFragment.C26951.onDialogClick$lambda$0(cardReturnUserInfoFragment, (String) obj);
                }
            };
            final CardReturnUserInfoFragment cardReturnUserInfoFragment2 = CardReturnUserInfoFragment.this;
            cardReturnNoticeViewModelAccess$getMViewModel.returnCard(cardWrapper, str, str2, str3, function1, new Function1() { // from class: qr3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardReturnUserInfoFragment.C26951.onDialogClick$lambda$1(cardReturnUserInfoFragment2, (String) obj);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$nameTxtWatcher$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$alipayTxtWatcher$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$phoneTxtWatcher$1] */
    public CardReturnUserInfoFragment() {
        super(sui.G, 0, true);
        this.nameTxtWatcher = new TextWatcher() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$nameTxtWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                this.this$0.mName = s.toString();
                this.this$0.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        this.alipayTxtWatcher = new TextWatcher() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$alipayTxtWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                this.this$0.mAlipayAccount = s.toString();
                this.this$0.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
        this.phoneTxtWatcher = new TextWatcher() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment$phoneTxtWatcher$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                CardReturnUserInfoFragment cardReturnUserInfoFragment = this.this$0;
                cardReturnUserInfoFragment.mPhoneNum = CardReturnUserInfoFragment.access$getMBinding(cardReturnUserInfoFragment).E.getInputInfo();
                this.this$0.updateBtnState();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ dog access$getMBinding(CardReturnUserInfoFragment cardReturnUserInfoFragment) {
        return (dog) cardReturnUserInfoFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CardReturnNoticeViewModel access$getMViewModel(CardReturnUserInfoFragment cardReturnUserInfoFragment) {
        return (CardReturnNoticeViewModel) cardReturnUserInfoFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToResultPage(boolean isSuccess, String msg) {
        Bundle bundle = new Bundle();
        CardReturnResultFragment.Companion companion = CardReturnResultFragment.INSTANCE;
        bundle.putBoolean(companion.getKEY_IS_SUCCESS(), isSuccess);
        bundle.putString(companion.getKEY_HINT_MSG(), msg);
        gotoPageForResult(CardReturnResultFragment.class, bundle, sRequestCodeResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(CardReturnUserInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showConfirmDialog();
    }

    private final void showConfirmDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("returnCardUserInfo").setDialogTitle(o0j.o6).setNegativeText(o0j.j2).setPositiveText(o0j.l2).setDialogDescription(o0j.n6).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new C26951());
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateBtnState() {
        boolean z;
        if (TextUtils.isEmpty(this.mName) || TextUtils.isEmpty(this.mAlipayAccount) || TextUtils.isEmpty(this.mPhoneNum) || !TextUtils.isDigitsOnly(this.mPhoneNum)) {
            z = false;
        } else {
            String str = this.mPhoneNum;
            Intrinsics.checkNotNull(str);
            if (str.length() == 11) {
                z = true;
            } else {
                z = false;
            }
        }
        ((dog) getMBinding()).B.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeResult) {
            if (resultCode == 1) {
                showConfirmDialog();
                return;
            }
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((dog) getMBinding()).C.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            ViewGroup.LayoutParams layoutParams = ((dog) getMBinding()).B.getLayoutParams();
            layoutParams.width = -1;
            ((dog) getMBinding()).B.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((dog) getMBinding()).B.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.common_btn_single_line_width);
            layoutParams3.gravity = 1;
            ((dog) getMBinding()).B.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.p6);
        ((dog) getMBinding()).B.setEnabled(false);
        ((dog) getMBinding()).B.setText(o0j.m6);
        ((dog) getMBinding()).D.a(this.nameTxtWatcher);
        ((dog) getMBinding()).A.a(this.alipayTxtWatcher);
        ((dog) getMBinding()).A.f12638b.setFilters(new InputFilter[]{new InputFilter() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment.onViewCreated.1
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                if (source == null || source.length() == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(dest.subSequence(0, dstart));
                sb.append(source);
                sb.append(dest.subSequence(dend, dest.length()));
                Matcher matcher = Pattern.compile("[a-zA-Z0-9.@_]+").matcher(sb);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                if (matcher.matches()) {
                    return source;
                }
                FragmentActivity mActivity = CardReturnUserInfoFragment.this.getMActivity();
                if (mActivity != null) {
                    ToastExtKt.toastShort(mActivity, o0j.N);
                }
                return "";
            }
        }});
        ((dog) getMBinding()).E.f12638b.setFilters(new InputFilter[]{new InputFilter() { // from class: com.xiaomi.fitness.nfc.ui.issued.CardReturnUserInfoFragment.onViewCreated.2
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                if (source == null || source.length() == 0) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(dest.subSequence(0, dstart));
                sb.append(source);
                sb.append(dest.subSequence(dend, dest.length()));
                if (sb.length() > 0) {
                    if (!Intrinsics.areEqual(String.valueOf(sb.charAt(0)), "1")) {
                        FragmentActivity mActivity = CardReturnUserInfoFragment.this.getMActivity();
                        if (mActivity != null) {
                            ToastExtKt.toastShort(mActivity, o0j.P);
                        }
                        return "";
                    }
                    if (sb.length() > 1 && (Intrinsics.areEqual(String.valueOf(sb.charAt(1)), "0") || Intrinsics.areEqual(String.valueOf(sb.charAt(1)), "1") || Intrinsics.areEqual(String.valueOf(sb.charAt(1)), "2"))) {
                        FragmentActivity mActivity2 = CardReturnUserInfoFragment.this.getMActivity();
                        if (mActivity2 != null) {
                            ToastExtKt.toastShort(mActivity2, o0j.P);
                        }
                        return "";
                    }
                    if (sb.length() > 11) {
                        FragmentActivity mActivity3 = CardReturnUserInfoFragment.this.getMActivity();
                        if (mActivity3 != null) {
                            ToastExtKt.toastShort(mActivity3, o0j.P);
                        }
                        return "";
                    }
                }
                return source;
            }
        }});
        ((dog) getMBinding()).E.a(this.phoneTxtWatcher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((dog) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: or3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardReturnUserInfoFragment.setListener$lambda$0(this.f29409a, view);
            }
        });
    }
}
