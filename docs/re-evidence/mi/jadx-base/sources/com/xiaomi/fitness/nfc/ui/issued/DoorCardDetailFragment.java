package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.miui.tsmclient.util.NetworkUtil;
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
import com.xiaomi.fitness.nfc.ui.CardManagerActivity;
import com.xiaomi.fitness.nfc.ui.VerifySuperCardActivity;
import com.xiaomi.fitness.nfc.ui.issued.DoorCardDetailFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.NfcTimePickerDialog;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.av6;
import defpackage.emg;
import defpackage.ltg;
import defpackage.lxf;
import defpackage.o0j;
import defpackage.o63;
import defpackage.pli;
import defpackage.rog;
import defpackage.sui;
import defpackage.vqg;
import defpackage.yl3;
import defpackage.zl3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B\u0007¢\u0006\u0004\b0\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J)\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/DoorCardDetailFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/DoorCardViewModel;", "Lrog;", "", "updateCard", "()V", "", "it", "showSelectSwitchTimeDialog", "(I)V", "time", "code", "handleAddSwitcher", "(II)V", "deleteSuccess", "loadDefailtAid", "", "isDefaultCard", "refreshDefaultView", "(Z)V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "()Z", "isToDelete", "Z", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "mCardSwitcher", "Lcom/xiaomi/fitness/nfc/bean/CardSwitcherBean;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DoorCardDetailFragment extends BaseCardFragment<DoorCardViewModel, rog> {
    public static final int CARD_SWITCHER_MAX_COUNT = 5;

    @NotNull
    public static final String KEY_DELETE = "KEY_DELETE";

    @NotNull
    private static final String URL_USER_TIPS = "views/doorCard/commonQuestion/index.html";
    public static final int sRequestCodeRename = 10;
    private boolean isToDelete;

    @NotNull
    private CardSwitcherBean mCardSwitcher;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.issued.DoorCardDetailFragment$showSelectSwitchTimeDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/nfc/ui/issued/DoorCardDetailFragment$showSelectSwitchTimeDialog$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class C26961 extends av6 {
        final /* synthetic */ NfcTimePickerDialog $nfcTimePickerDialog;
        final /* synthetic */ DoorCardDetailFragment this$0;

        public C26961(NfcTimePickerDialog nfcTimePickerDialog, DoorCardDetailFragment doorCardDetailFragment) {
            this.$nfcTimePickerDialog = nfcTimePickerDialog;
            this.this$0 = doorCardDetailFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(DoorCardDetailFragment this$0, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!this$0.isInvalid() && i3 != -1) {
                AnyExtKt.main$default(null, new DoorCardDetailFragment$showSelectSwitchTimeDialog$1$onDialogClick$1$1(i, i2, this$0, i3, null), 1, null);
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
                CardSwitcherView cardSwitcherView = DoorCardDetailFragment.access$getMBinding(this.this$0).A;
                String aid = this.this$0.mCardSwitcher.getAid();
                Intrinsics.checkNotNull(aid);
                int cardType = this.this$0.mCardSwitcher.getCardType();
                final DoorCardDetailFragment doorCardDetailFragment = this.this$0;
                cardSwitcherView.addCardSwitcher(aid, cardType, currentHour, currentMinute, new Function1() { // from class: n27
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DoorCardDetailFragment.C26961.onDialogClick$lambda$0(doorCardDetailFragment, currentHour, currentMinute, ((Integer) obj).intValue());
                    }
                });
            }
        }
    }

    public DoorCardDetailFragment() {
        super(sui.N, 0, true);
        CardWrapper cardWrapper = getCardWrapper();
        this.mCardSwitcher = new CardSwitcherBean(cardWrapper != null ? cardWrapper.getAid() : null, 0, new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ rog access$getMBinding(DoorCardDetailFragment doorCardDetailFragment) {
        return (rog) doorCardDetailFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DoorCardViewModel access$getMViewModel(DoorCardDetailFragment doorCardDetailFragment) {
        return (DoorCardViewModel) doorCardDetailFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteSuccess() {
        FragmentActivity mActivity;
        ToastUtil.showShortToast(o0j.i3);
        Intent intent = new Intent();
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.mHasIssue = false;
        }
        zl3.g().f.remove(getCardWrapper());
        zl3.g().l(getCardWrapper());
        zl3.g().p();
        ltg.c().r(getCardWrapper());
        o63.b(new yl3(getCardWrapper(), false));
        if (this.isToDelete && (mActivity = getMActivity()) != null) {
            startActivity(new Intent(mActivity, (Class<?>) CardManagerActivity.class));
        }
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        mActivity2.setResult(-1, intent);
        FragmentActivity mActivity3 = getMActivity();
        Intrinsics.checkNotNull(mActivity3);
        mActivity3.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleAddSwitcher(int time, int code) {
        vqg.d("handleAddSwitcher: " + code);
        if (code == 0) {
            ((rog) getMBinding()).A.updateSwitchTimeViewAdd(time);
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, o0j.common_set_success);
                return;
            }
            return;
        }
        if (code == 2) {
            CommonDialog commonDialogCreate = new CommonDialog.c("add switcher dupilicate").setDialogTitle(o0j.o).setDialogDescription(o0j.n).setNegativeText(o0j.common_known).create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.DoorCardDetailFragment.handleAddSwitcher.1
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadDefailtAid() {
        ((DoorCardViewModel) getMViewModel()).getDefaultAid(new Function1() { // from class: w17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.loadDefailtAid$lambda$30(this.f37436a, (String) obj);
            }
        }, new Function1() { // from class: x17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.loadDefailtAid$lambda$31(this.f38571a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDefailtAid$lambda$30(DoorCardDetailFragment this$0, String aid) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(aid, "aid");
        AnyExtKt.main$default(null, new DoorCardDetailFragment$loadDefailtAid$1$1(aid, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDefailtAid$lambda$31(DoorCardDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new DoorCardDetailFragment$loadDefailtAid$2$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(DoorCardDetailFragment this$0, CardSwitcherBean cardSwitcherBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mCardSwitcher = cardSwitcherBean;
        ((rog) this$0.getMBinding()).A.setCardSwitcher(this$0.mCardSwitcher);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2$lambda$1(DoorCardDetailFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((rog) this$0.getMBinding()).A.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$4(DoorCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((rog) this$0.getMBinding()).M.performClick();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshDefaultView(boolean isDefaultCard) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Intrinsics.checkNotNull(wearableDeviceModel);
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((rog) getMBinding()).C.setText(isDefaultCard ? o0j.s6 : o0j.r6);
        } else {
            ((rog) getMBinding()).C.setText(isDefaultCard ? o0j.t6 : o0j.u6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$17(final DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading();
        DoorCardViewModel doorCardViewModel = (DoorCardViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        doorCardViewModel.setDefailtCard(cardWrapper, new Function0() { // from class: b27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DoorCardDetailFragment.setListener$lambda$17$lambda$15(this.f3707a);
            }
        }, new Function1() { // from class: c27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$17$lambda$16(this.f4854a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$17$lambda$15(DoorCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        ((rog) this$0.getMBinding()).C.setEnabled(false);
        this$0.refreshDefaultView(true);
        zl3.g().l(this$0.getCardWrapper());
        ToastUtil.showLongToast(o0j.V2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$17$lambda$16(DoorCardDetailFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.dismissDialog();
        ToastUtil.showLongToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$18(DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(this$0.getCardWrapper());
        Bundle bundle = new Bundle();
        bundle.putBoolean(CardRenameFragment.INSTANCE.getSIsFromDoorDetail(), true);
        this$0.gotoPageForResult(CardRenameFragment.class, bundle, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$19(DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(o0j.j3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        WebViewUtilKt.startWebView$default(string, NetworkUtil.getHtml(URL_USER_TIPS), false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$20(DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("CardRenameFragment.delete").setDialogTitle(o0j.p2).setDialogDescription(o0j.W2).setNegativeText(o0j.j2).setPositiveText(o0j.l2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new DoorCardDetailFragment$setListener$4$1(this$0));
        commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$25(final DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = o0j.p2;
        int i2 = o0j.a0;
        int i3 = o0j.e;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, parentFragmentManager, o0j.d, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: q17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$25$lambda$23(this.f30979a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: r17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$25$lambda$24((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$25$lambda$23(final DoorCardDetailFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(o0j.Z2, false);
        DoorCardViewModel doorCardViewModel = (DoorCardViewModel) this$0.getMViewModel();
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        doorCardViewModel.removeBackupCloudCard(cardWrapper, new Function0() { // from class: m17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DoorCardDetailFragment.setListener$lambda$25$lambda$23$lambda$21(this.f25642a);
            }
        }, new Function1() { // from class: n17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$25$lambda$23$lambda$22(this.f27433a, (String) obj);
            }
        });
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$25$lambda$23$lambda$21(DoorCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.i3);
        this$0.hideLoading();
        ((rog) this$0.getMBinding()).L.setVisibility(8);
        this$0.updateCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$25$lambda$23$lambda$22(DoorCardDetailFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showLongToast(str);
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$25$lambda$24(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$27(final DoorCardDetailFragment this$0, final int i) {
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
                UtilsKt.showMsgDialog$default(i2, i3, i4, parentFragmentManager, o0j.common_cancel, new Function1() { // from class: y17
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return DoorCardDetailFragment.setListener$lambda$27$lambda$26(this.f39678a, i, (DialogInterface) obj);
                    }
                }, (Function1) null, 64, (Object) null);
                return Unit.INSTANCE;
            }
        }
        this$0.showSelectSwitchTimeDialog(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$27$lambda$26(DoorCardDetailFragment this$0, int i, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectSwitchTimeDialog(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$28(DoorCardDetailFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((rog) this$0.getMBinding()).A.removeCardSwitcherTime(i);
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
        nfcTimePickerDialog.addDialogCallback(new C26961(nfcTimePickerDialog, this));
        nfcTimePickerDialog.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateCard() {
        showLoading();
        DoorCardViewModel doorCardViewModel = (DoorCardViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        doorCardViewModel.updateCard(cardWrapper, new Function1() { // from class: i27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.updateCard$lambda$13(this.f20691a, (CardWrapper) obj);
            }
        }, new Function1() { // from class: j27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.updateCard$lambda$14(this.f22348a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateCard$lambda$13(final DoorCardDetailFragment this$0, final CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        vqg.d("DoorCardDetailFragment updateCard isMiLock:" + lxf.e(cardWrapper) + " cardWrapper?.cardStatus:" + cardWrapper.getCardStatus());
        if (lxf.e(cardWrapper)) {
            ((rog) this$0.getMBinding()).H.setVisibility(cardWrapper.getCardStatus() == SeCardStatus.WAIT_TO_ACTIVE ? 0 : 8);
            ((rog) this$0.getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: k27
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DoorCardDetailFragment.updateCard$lambda$13$lambda$5(view);
                }
            });
        } else if (cardWrapper.isSuperCardOk()) {
            ((rog) this$0.getMBinding()).I.setText(o0j.d5);
            ((rog) this$0.getMBinding()).J.setText(o0j.e5);
            ((rog) this$0.getMBinding()).O.setVisibility(0);
            ((rog) this$0.getMBinding()).E.setVisibility(0);
            ((rog) this$0.getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: k17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DoorCardDetailFragment.updateCard$lambda$13$lambda$8(this.f23322a, view);
                }
            });
            if (cardWrapper.isBackUp) {
                ((rog) this$0.getMBinding()).L.setVisibility(0);
            } else {
                ((rog) this$0.getMBinding()).L.setVisibility(8);
            }
        } else if (cardWrapper.isSuperCardNotOk()) {
            ((rog) this$0.getMBinding()).I.setText(o0j.Z4);
            ((rog) this$0.getMBinding()).J.setText(o0j.b5);
            ((rog) this$0.getMBinding()).E.setVisibility(0);
        } else if (!cardWrapper.isSupportBackup || cardWrapper.isBackUp) {
            if (cardWrapper.isBackUp) {
                ((rog) this$0.getMBinding()).L.setVisibility(0);
            } else {
                ((rog) this$0.getMBinding()).L.setVisibility(8);
            }
            ((rog) this$0.getMBinding()).E.setVisibility(8);
        } else {
            ((rog) this$0.getMBinding()).I.setText(o0j.Z);
            ((rog) this$0.getMBinding()).J.setText(o0j.Y);
            ((rog) this$0.getMBinding()).O.setText(o0j.X);
            ((rog) this$0.getMBinding()).O.setVisibility(0);
            ((rog) this$0.getMBinding()).E.setVisibility(0);
            ((rog) this$0.getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: l17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DoorCardDetailFragment.updateCard$lambda$13$lambda$12(this.f24502a, cardWrapper, view);
                }
            });
        }
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void updateCard$lambda$13$lambda$12(final DoorCardDetailFragment this$0, CardWrapper cardWrapper, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        PageState.DefaultImpls.showLoading$default(this$0, o0j.W, false, 2, null);
        ((DoorCardViewModel) this$0.getMViewModel()).backup2cloud(cardWrapper, new Function0() { // from class: z17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DoorCardDetailFragment.updateCard$lambda$13$lambda$12$lambda$9(this.f40773a);
            }
        }, new Function1() { // from class: a27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.updateCard$lambda$13$lambda$12$lambda$11(this.f545a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$13$lambda$12$lambda$11(DoorCardDetailFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        String string = this$0.getString(o0j.h0);
        if (str == null) {
            str = "";
        }
        int i = o0j.common_known;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, str, i, parentFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: p17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.updateCard$lambda$13$lambda$12$lambda$11$lambda$10((DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$13$lambda$12$lambda$11$lambda$10(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateCard$lambda$13$lambda$12$lambda$9(DoorCardDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(o0j.i0);
        ((rog) this$0.getMBinding()).E.setVisibility(8);
        ((rog) this$0.getMBinding()).L.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$13$lambda$5(View view) {
        String MI_LOCK_CARD_HELP_URL = emg.f16810a;
        Intrinsics.checkNotNullExpressionValue(MI_LOCK_CARD_HELP_URL, "MI_LOCK_CARD_HELP_URL");
        WebViewUtilKt.startWebView$default(MI_LOCK_CARD_HELP_URL, "", false, false, null, false, null, false, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$13$lambda$8(final DoorCardDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            this$0.startForActivityResult(new Intent(mActivity, (Class<?>) VerifySuperCardActivity.class), new Function2() { // from class: o17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DoorCardDetailFragment.updateCard$lambda$13$lambda$8$lambda$7$lambda$6(this.f28637a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$13$lambda$8$lambda$7$lambda$6(DoorCardDetailFragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -1) {
            this$0.updateCard();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$14(DoorCardDetailFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            CardWrapper cardWrapper = getCardWrapper();
            setTitle(cardWrapper != null ? cardWrapper.mCardName : null);
            RightArrowSingleLineTextView rightArrowSingleLineTextView = ((rog) getMBinding()).N;
            CardWrapper cardWrapper2 = getCardWrapper();
            rightArrowSingleLineTextView.setRemindText(cardWrapper2 != null ? cardWrapper2.mCardName : null);
            ((rog) getMBinding()).B.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel(), getCardWrapper());
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
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((rog) getMBinding()).F.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        CardWrapper cardWrapper = getCardWrapper();
        if (TextUtils.isEmpty(cardWrapper != null ? cardWrapper.mCardName : null)) {
            string = getString(o0j.d3);
        } else {
            CardWrapper cardWrapper2 = getCardWrapper();
            string = cardWrapper2 != null ? cardWrapper2.mCardName : null;
        }
        setTitle(string);
        RightArrowSingleLineTextView rightArrowSingleLineTextView = ((rog) getMBinding()).N;
        CardWrapper cardWrapper3 = getCardWrapper();
        rightArrowSingleLineTextView.setRemindText(cardWrapper3 != null ? cardWrapper3.mCardName : null);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        ((rog) getMBinding()).D.show(wearableDeviceModel);
        CardSwitcherBean cardSwitcherBean = this.mCardSwitcher;
        CardWrapper cardWrapper4 = getCardWrapper();
        cardSwitcherBean.setAid(cardWrapper4 != null ? cardWrapper4.getAid() : null);
        ((rog) getMBinding()).A.setCardSwitcher(this.mCardSwitcher);
        ((DoorCardViewModel) getMViewModel()).getCardSwitchRet().observe(getViewLifecycleOwner(), new DoorCardDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s17
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.onViewCreated$lambda$0(this.f33161a, (CardSwitcherBean) obj);
            }
        }));
        CardWrapper cardWrapper5 = getCardWrapper();
        if (cardWrapper5 != null) {
            ((DoorCardViewModel) getMViewModel()).loadCardSwitchList(cardWrapper5, new Function1() { // from class: t17
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DoorCardDetailFragment.onViewCreated$lambda$2$lambda$1(this.f34197a, ((Boolean) obj).booleanValue());
                }
            });
        }
        if (wearableDeviceModel == null || !(DeviceModelExtKt.isWearOS(wearableDeviceModel) || DeviceModelExtKt.isHuaMi(wearableDeviceModel))) {
            ((rog) getMBinding()).C.setVisibility(8);
        } else {
            loadDefailtAid();
        }
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            ((rog) getMBinding()).C.setText(o0j.r6);
        }
        ((rog) getMBinding()).B.show((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel(), getCardWrapper());
        updateCard();
        if (this.isToDelete) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: v17
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return DoorCardDetailFragment.onViewCreated$lambda$4(this.f36371a);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.isToDelete = args.getBoolean("KEY_DELETE");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((rog) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: j17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoorCardDetailFragment.setListener$lambda$17(this.f22323a, view);
            }
        });
        ((rog) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: u17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoorCardDetailFragment.setListener$lambda$18(this.f35268a, view);
            }
        });
        ((rog) getMBinding()).K.setOnClickListener(new View.OnClickListener() { // from class: d27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoorCardDetailFragment.setListener$lambda$19(this.f14987a, view);
            }
        });
        ((rog) getMBinding()).M.setOnClickListener(new View.OnClickListener() { // from class: e27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoorCardDetailFragment.setListener$lambda$20(this.f16189a, view);
            }
        });
        ((rog) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: f27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DoorCardDetailFragment.setListener$lambda$25(this.f17326a, view);
            }
        });
        ((rog) getMBinding()).A.setOnCheckCountClickListener(new Function1() { // from class: g27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$27(this.f18498a, ((Integer) obj).intValue());
            }
        });
        ((rog) getMBinding()).A.setOnDeleteListener(new Function1() { // from class: h27
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DoorCardDetailFragment.setListener$lambda$28(this.f19601a, ((Integer) obj).intValue());
            }
        });
    }
}
