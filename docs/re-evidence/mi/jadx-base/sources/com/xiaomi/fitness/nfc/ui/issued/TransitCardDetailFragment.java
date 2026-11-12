package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardSwitcherBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.TransitViewModel;
import com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import com.xiaomi.fitness.nfc.widget.NfcTimePickerDialog;
import defpackage.av6;
import defpackage.fqg;
import defpackage.jtk;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vqg;
import defpackage.yhj;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b*\u0010\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u000fR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TransitCardDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/TransitViewModel;", "Lfqg;", "", "it", "", "showSelectSwitchTimeDialog", "(I)V", "time", "code", "handleAddSwitcher", "(II)V", "", "isNeedMessageEvent", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "mCardSwitcher", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransitCardDetailFragment extends BaseCardFragment<TransitViewModel, fqg> {

    @NotNull
    private CardSwitcherBean mCardSwitcher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestTansferOut = 10;
    private static final int sRequestRecharge = 20;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TransitCardDetailFragment$Companion;", "", "<init>", "()V", "sRequestTansferOut", "", "getSRequestTansferOut$annotations", "getSRequestTansferOut", "()I", "sRequestRecharge", "getSRequestRecharge$annotations", "getSRequestRecharge", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getSRequestRecharge$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSRequestTansferOut$annotations() {
        }

        public final int getSRequestRecharge() {
            return TransitCardDetailFragment.sRequestRecharge;
        }

        public final int getSRequestTansferOut() {
            return TransitCardDetailFragment.sRequestTansferOut;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment$showSelectSwitchTimeDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/nfc/ui/issued/TransitCardDetailFragment$showSelectSwitchTimeDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C27051 extends av6 {
        final /* synthetic */ NfcTimePickerDialog $nfcTimePickerDialog;
        final /* synthetic */ TransitCardDetailFragment this$0;

        public C27051(NfcTimePickerDialog nfcTimePickerDialog, TransitCardDetailFragment transitCardDetailFragment) {
            this.$nfcTimePickerDialog = nfcTimePickerDialog;
            this.this$0 = transitCardDetailFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(int i, int i2, TransitCardDetailFragment this$0, int i3) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i4 = (i * 60) + i2;
            if (i3 != -1) {
                AnyExtKt.main$default(null, new TransitCardDetailFragment$showSelectSwitchTimeDialog$1$onDialogClick$1$1(this$0, i4, i3, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -2) {
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else {
                if (which != -1) {
                    return;
                }
                final int currentHour = this.$nfcTimePickerDialog.getCurrentHour();
                final int currentMinute = this.$nfcTimePickerDialog.getCurrentMinute();
                CardSwitcherView cardSwitcherView = TransitCardDetailFragment.access$getMBinding(this.this$0).B;
                String aid = this.this$0.mCardSwitcher.getAid();
                Intrinsics.checkNotNull(aid);
                int cardType = this.this$0.mCardSwitcher.getCardType();
                final TransitCardDetailFragment transitCardDetailFragment = this.this$0;
                cardSwitcherView.addCardSwitcher(aid, cardType, currentHour, currentMinute, new Function1() { // from class: fzp
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return TransitCardDetailFragment.C27051.onDialogClick$lambda$0(currentHour, currentMinute, transitCardDetailFragment, ((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    public TransitCardDetailFragment() {
        super(sui.i0, 0, true);
        CardWrapper cardWrapper = getCardWrapper();
        this.mCardSwitcher = new CardSwitcherBean(cardWrapper != null ? cardWrapper.getAid() : null, 1, new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ fqg access$getMBinding(TransitCardDetailFragment transitCardDetailFragment) {
        return (fqg) transitCardDetailFragment.getMBinding();
    }

    public static final int getSRequestRecharge() {
        return INSTANCE.getSRequestRecharge();
    }

    public static final int getSRequestTansferOut() {
        return INSTANCE.getSRequestTansferOut();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleAddSwitcher(int time, int code) {
        vqg.d("handleAddSwitcher: " + code);
        if (code == 0) {
            ((fqg) getMBinding()).B.updateSwitchTimeViewAdd(time);
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, o0j.common_set_success);
                return;
            }
            return;
        }
        if (code == 2) {
            CommonDialog commonDialogCreate = new CommonDialog.c("add switcher dupilicate").setDialogTitle(o0j.o).setDialogDescription(o0j.n).setNegativeText(o0j.common_known).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment.handleAddSwitcher.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which != -2 || dialog == null) {
                        return;
                    }
                    dialog.dismiss();
                }
            });
            commonDialogCreate.showIfNeed(getParentFragmentManager());
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, o0j.common_set_error);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(TransitCardDetailFragment this$0, String tips) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tips, "tips");
        if (!TextUtils.isEmpty(tips)) {
            ((fqg) this$0.getMBinding()).I.setVisibility(0);
            ((fqg) this$0.getMBinding()).I.setMarqueeText(Html.fromHtml(tips).toString());
            ((fqg) this$0.getMBinding()).I.h();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TransitCardDetailFragment this$0, List bullterList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bullterList, "bullterList");
        this$0.setBullterList(bullterList);
        this$0.showBulletDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(TransitCardDetailFragment this$0, CardSwitcherBean cardSwitcherBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mCardSwitcher = cardSwitcherBean;
        ((fqg) this$0.getMBinding()).B.setCardSwitcher(this$0.mCardSwitcher);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$4$lambda$3(TransitCardDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((fqg) this$0.getMBinding()).B.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$11(final TransitCardDetailFragment this$0, final int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel != null && (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 1073741824) != 0) {
                int i2 = o0j.V;
                int i3 = o0j.U;
                int i4 = o0j.J2;
                FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                UtilsKt.showMsgDialog$default(i2, i3, i4, parentFragmentManager, o0j.common_cancel, new Function1() { // from class: uyp
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return TransitCardDetailFragment.setListener$lambda$11$lambda$10(this.f36289a, i, (DialogInterface) obj);
                    }
                }, (Function1) null, 64, (Object) null);
                return Unit.INSTANCE;
            }
        }
        this$0.showSelectSwitchTimeDialog(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$11$lambda$10(TransitCardDetailFragment this$0, int i, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectSwitchTimeDialog(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$12(TransitCardDetailFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((fqg) this$0.getMBinding()).B.removeCardSwitcherTime(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(final TransitCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(this$0.getCardWrapper());
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        TransitViewModel transitViewModel = (TransitViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        transitViewModel.checkUncompletedTypeCanRemove(cardWrapper, new Function1() { // from class: vyp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.setListener$lambda$6$lambda$5(this.f37371a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$6$lambda$5(TransitCardDetailFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new TransitCardDetailFragment$setListener$1$1$1(this$0, str, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$9(final TransitCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, o0j.U2, false, 2, null);
        TransitViewModel transitViewModel = (TransitViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        transitViewModel.setDefailtCard(cardWrapper, new Function0() { // from class: dzp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitCardDetailFragment.setListener$lambda$9$lambda$7(this.f16096a);
            }
        }, new Function1() { // from class: ezp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.setListener$lambda$9$lambda$8(this.f17234a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$9$lambda$7(TransitCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        ((fqg) this$0.getMBinding()).D.setEnabled(false);
        ToastUtil.showLongToast(o0j.V2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$9$lambda$8(TransitCardDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showLongToast(msg);
        return Unit.INSTANCE;
    }

    private final void showSelectSwitchTimeDialog(int it) {
        if (it >= 5) {
            vqg.d("mCardSwitcher.time size has reach max");
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, o0j.p);
                return;
            }
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String string = (wearableDeviceModel == null || !DeviceModelExtKt.isBandType(wearableDeviceModel)) ? getString(o0j.f28618r) : getString(o0j.q);
        Intrinsics.checkNotNull(string);
        NfcTimePickerDialog nfcTimePickerDialogCreate = NfcTimePickerDialog.INSTANCE.defaultBuilder("add time switcher").setDialogTitle(o0j.s).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setNegativeText(o0j.d).setPositiveText(o0j.e).create();
        Intrinsics.checkNotNullExpressionValue(nfcTimePickerDialogCreate, "create(...)");
        NfcTimePickerDialog nfcTimePickerDialog = nfcTimePickerDialogCreate;
        nfcTimePickerDialog.addDialogCallback(new C27051(nfcTimePickerDialog, this));
        nfcTimePickerDialog.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestTansferOut && resultCode == -1) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1);
            }
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        finish();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((fqg) getMBinding()).E.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (!(event instanceof yhj)) {
            if (event instanceof jtk) {
                finish();
            }
        } else {
            setCardWrapper(zl3.g().i());
            IssuedTransCardDetailOptionView issuedTransCardDetailOptionView = ((fqg) getMBinding()).E;
            CardWrapper cardWrapper = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper);
            issuedTransCardDetailOptionView.r(cardWrapper, this, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper == null || (string = cardWrapper.mCardName) == null) {
            string = getString(o0j.Y6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        setTitle(string);
        IssuedTransCardDetailOptionView issuedTransCardDetailOptionView = ((fqg) getMBinding()).E;
        CardWrapper cardWrapper2 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper2);
        issuedTransCardDetailOptionView.r(cardWrapper2, this, null, null);
        TransitViewModel transitViewModel = (TransitViewModel) getMViewModel();
        CardWrapper cardWrapper3 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper3);
        transitViewModel.loadBullet(cardWrapper3, "issuedTrafficCardBulletin", new Function1() { // from class: typ
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.onViewCreated$lambda$0(this.f35191a, (String) obj);
            }
        });
        setBulltetTag("cardDetail");
        TransitViewModel transitViewModel2 = (TransitViewModel) getMViewModel();
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        transitViewModel2.loadBulletDialog(cardWrapper4, getBulltetTag(), new Function1() { // from class: wyp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.onViewCreated$lambda$1(this.f38482a, (List) obj);
            }
        });
        CardSwitcherBean cardSwitcherBean = this.mCardSwitcher;
        CardWrapper cardWrapper5 = getCardWrapper();
        cardSwitcherBean.setAid(cardWrapper5 != null ? cardWrapper5.getAid() : null);
        ((fqg) getMBinding()).B.setCardSwitcher(this.mCardSwitcher);
        ((TransitViewModel) getMViewModel()).getCardSwitchRet().observe(getViewLifecycleOwner(), new TransitCardDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xyp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.onViewCreated$lambda$2(this.f39593a, (CardSwitcherBean) obj);
            }
        }));
        CardWrapper cardWrapper6 = getCardWrapper();
        if (cardWrapper6 != null) {
            ((TransitViewModel) getMViewModel()).loadCardSwitchList(cardWrapper6, new Function1() { // from class: yyp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TransitCardDetailFragment.onViewCreated$lambda$4$lambda$3(this.f40698a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((fqg) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: zyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransitCardDetailFragment.setListener$lambda$6(this.f41806a, view);
            }
        });
        ((fqg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: azp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransitCardDetailFragment.setListener$lambda$9(this.f3619a, view);
            }
        });
        ((fqg) getMBinding()).B.setOnCheckCountClickListener(new Function1() { // from class: bzp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.setListener$lambda$11(this.f4757a, ((Integer) obj).intValue());
            }
        });
        ((fqg) getMBinding()).B.setOnDeleteListener(new Function1() { // from class: czp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransitCardDetailFragment.setListener$lambda$12(this.f14895a, ((Integer) obj).intValue());
            }
        });
    }
}
