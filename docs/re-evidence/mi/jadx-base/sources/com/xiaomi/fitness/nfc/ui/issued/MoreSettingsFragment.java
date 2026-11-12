package com.xiaomi.fitness.nfc.ui.issued;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel;
import com.xiaomi.fitness.nfc.ui.issued.MoreSettingsFragment;
import com.xiaomi.fitness.nfc.widget.TSMSetRightArrowView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.dpg;
import defpackage.gzp;
import defpackage.jtk;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.pli;
import defpackage.sui;
import defpackage.vqg;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MoreSettingsFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel;", "Ldpg;", "Landroid/os/Bundle;", "args", "", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "isNeedMessageEvent", "()Z", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "deaultAid", "Ljava/lang/String;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MoreSettingsFragment extends BaseCardFragment<CardOrderDetailViewModel, dpg> {

    @Nullable
    private String deaultAid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sDefault = "sDefault";

    @NotNull
    private static final String sLntPhone = "400-844-0001";

    @NotNull
    private static final String sLNTAppName = "com.lingnanpass";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MoreSettingsFragment$Companion;", "", "<init>", "()V", "sDefault", "", "getSDefault$annotations", "getSDefault", "()Ljava/lang/String;", "sLntPhone", "getSLntPhone", "sLNTAppName", "getSLNTAppName", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getSDefault$annotations() {
        }

        @NotNull
        public final String getSDefault() {
            return MoreSettingsFragment.sDefault;
        }

        @NotNull
        public final String getSLNTAppName() {
            return MoreSettingsFragment.sLNTAppName;
        }

        @NotNull
        public final String getSLntPhone() {
            return MoreSettingsFragment.sLntPhone;
        }
    }

    public MoreSettingsFragment() {
        super(sui.T, 0, true);
    }

    @NotNull
    public static final String getSDefault() {
        return INSTANCE.getSDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        Object systemService = mActivity.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        CardWrapper cardWrapper = this$0.getCardWrapper();
        clipboardManager.setPrimaryClip(ClipData.newPlainText(null, cardWrapper != null ? cardWrapper.mCardNo : null));
        ToastUtil.showLongToast(o0j.T4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$2(final MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(this$0.getCardWrapper());
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        CardOrderDetailViewModel cardOrderDetailViewModel = (CardOrderDetailViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cardOrderDetailViewModel.checkUncompletedTypeCanReturn(cardWrapper, new Function1() { // from class: l8g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MoreSettingsFragment.setListener$lambda$2$lambda$1(this.f24779a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2$lambda$1(MoreSettingsFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (str == null) {
            BaseCardFragment.gotoPage$default(this$0, CardReturnNoticeFragment.class, null, 2, null);
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastLong(mActivity, str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseCardFragment.gotoPage$default(this$0, TradeRecordFragment.class, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseCardFragment.gotoPage$default(this$0, SZTReturnCardManagerFragment.class, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + StringsKt__StringsJVMKt.replace$default(sLntPhone, "-", "", false, 4, (Object) null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(MoreSettingsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strC = pf4.c(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null));
        Intrinsics.checkNotNull(strC);
        WebViewUtilKt.startWebView$default(strC, this$0.getString(o0j.U4), true, false, null, false, null, false, 248, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(MoreSettingsFragment this$0, View view) {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity == null || (packageManager = mActivity.getPackageManager()) == null) {
            return;
        }
        String str = sLNTAppName;
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                mActivity2.startActivity(launchIntentForPackage);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        intent.addFlags(268435456);
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((dpg) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof jtk) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.v2);
        String str2 = this.deaultAid;
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        if (TextUtils.equals(str2, cardWrapper.mAid)) {
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            str = cardWrapper2.mCardName + " | " + getString(o0j.T0);
        } else {
            CardWrapper cardWrapper3 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper3);
            str = cardWrapper3.mCardName;
        }
        ((dpg) getMBinding()).A.setTitle(str);
        TSMSetRightArrowView tSMSetRightArrowView = ((dpg) getMBinding()).A;
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        tSMSetRightArrowView.setDes(cardWrapper4.mCardNo);
        ((dpg) getMBinding()).A.setRightValue(getString(o0j.S4));
        TSMSetRightArrowView tSMSetRightArrowView2 = ((dpg) getMBinding()).A;
        CardWrapper cardWrapper5 = getCardWrapper();
        tSMSetRightArrowView2.setRightValueEnabled(!TextUtils.isEmpty(cardWrapper5 != null ? cardWrapper5.mCardNo : null));
        ((dpg) getMBinding()).F.setVisibility(0);
        CardWrapper cardWrapper6 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper6);
        boolean zIsSupportReturnCard = cardWrapper6.mSeCard.isSupportReturnCard();
        vqg.d("MoreSettingsFragment isSupportReturnCard:" + zIsSupportReturnCard);
        if (zIsSupportReturnCard) {
            CardWrapper cardWrapper7 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper7);
            boolean zIsSupportServiceFeeRefund = cardWrapper7.isSupportServiceFeeRefund();
            vqg.d("MoreSettingsFragment isSupportServiceFeeRefund:" + zIsSupportServiceFeeRefund);
            if (zIsSupportServiceFeeRefund) {
                ((dpg) getMBinding()).H.setVisibility(0);
                ((dpg) getMBinding()).H.setTitle(getString(o0j.k6));
                ((dpg) getMBinding()).G.setVisibility(8);
            } else {
                ((dpg) getMBinding()).G.setVisibility(0);
                ((dpg) getMBinding()).G.setTitle(getString(o0j.c6));
                ((dpg) getMBinding()).H.setVisibility(8);
            }
        }
        ((dpg) getMBinding()).F.setTitle(getString(o0j.Y0));
        if (!gzp.d(getCardWrapper())) {
            ((dpg) getMBinding()).D.setVisibility(8);
            ((dpg) getMBinding()).C.setVisibility(8);
            return;
        }
        ((dpg) getMBinding()).D.setTitle(getString(o0j.i2));
        ((dpg) getMBinding()).D.setRightValue(sLntPhone);
        ((dpg) getMBinding()).D.a(false);
        ((dpg) getMBinding()).C.setTitle(getString(o0j.X0));
        ((dpg) getMBinding()).D.setVisibility(0);
        ((dpg) getMBinding()).C.setVisibility(0);
        ((dpg) getMBinding()).E.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.deaultAid = args != null ? args.getString(sDefault) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((dpg) getMBinding()).A.setOnRightValueClickListener(new View.OnClickListener() { // from class: e8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$0(this.f16382a, view);
            }
        });
        ((dpg) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: f8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$2(this.f17527a, view);
            }
        });
        ((dpg) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: g8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$3(this.f18723a, view);
            }
        });
        ((dpg) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: h8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$4(this.f19802a, view);
            }
        });
        ((dpg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: i8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$5(this.f20883a, view);
            }
        });
        ((dpg) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: j8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$6(this.f22525a, view);
            }
        });
        ((dpg) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: k8g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSettingsFragment.setListener$lambda$8(this.f23587a, view);
            }
        });
    }
}
