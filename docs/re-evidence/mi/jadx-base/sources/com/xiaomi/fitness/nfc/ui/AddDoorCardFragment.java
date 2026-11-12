package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.pay.WebActivity;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.AddDoorCardFragment;
import com.xiaomi.fitness.nfc.ui.issued.CardRenameFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.av6;
import defpackage.ipq;
import defpackage.m4i;
import defpackage.mri;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.rji;
import defpackage.sui;
import defpackage.vqg;
import defpackage.wni;
import defpackage.xmg;
import defpackage.zl3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u001b\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AddDoorCardFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/AddDoorViewModel;", "Lxmg;", "", "showCopyDialog", "()V", "selectReadCardInfoWay", "", "isNeedCardInfo", "()Z", "onBackPressed", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadCloudList", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "list", "addCloudCardList", "(Ljava/util/List;)V", "setListener", "hasMilock", "addMilockCard", "(Z)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddDoorCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDoorCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/AddDoorCardFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,372:1\n1863#2:373\n1864#2:384\n54#3,3:374\n24#3:377\n59#3,6:378\n*S KotlinDebug\n*F\n+ 1 AddDoorCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/AddDoorCardFragment\n*L\n114#1:373\n114#1:384\n119#1:374,3\n119#1:377\n119#1:378,6\n*E\n"})
public final class AddDoorCardFragment extends BaseCardFragment<AddDoorViewModel, xmg> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCodeIssueBlank = 10;
    private static final int sRequestCodeCopyByDevice = 20;
    private static final int sRequestCodeCopyByPhone = 30;
    private static final int sRequestCodeCopyByMilock = 40;
    private static final int sRequestCodeCloudDoor = 50;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AddDoorCardFragment$Companion;", "", "<init>", "()V", "sRequestCodeIssueBlank", "", "getSRequestCodeIssueBlank", "()I", "sRequestCodeCopyByDevice", "getSRequestCodeCopyByDevice", "sRequestCodeCopyByPhone", "getSRequestCodeCopyByPhone", "sRequestCodeCopyByMilock", "getSRequestCodeCopyByMilock", "sRequestCodeCloudDoor", "getSRequestCodeCloudDoor", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCodeCloudDoor() {
            return AddDoorCardFragment.sRequestCodeCloudDoor;
        }

        public final int getSRequestCodeCopyByDevice() {
            return AddDoorCardFragment.sRequestCodeCopyByDevice;
        }

        public final int getSRequestCodeCopyByMilock() {
            return AddDoorCardFragment.sRequestCodeCopyByMilock;
        }

        public final int getSRequestCodeCopyByPhone() {
            return AddDoorCardFragment.sRequestCodeCopyByPhone;
        }

        public final int getSRequestCodeIssueBlank() {
            return AddDoorCardFragment.sRequestCodeIssueBlank;
        }
    }

    public AddDoorCardFragment() {
        super(sui.q, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCloudCardList$lambda$7$lambda$6(CardWrapper cardWrapper, AddDoorCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(cardWrapper);
        this$0.gotoPageForResult(CloudDoorFragment.class, null, sRequestCodeCloudDoor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addMilockCard$lambda$23(AddDoorCardFragment this$0, boolean z, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        zl3.g().l(cardWrapper);
        Intent intent = new Intent(this$0.getMActivity(), (Class<?>) IssuerActivity.class);
        intent.putExtra(CardRenameFragment.INSTANCE.getSHasMiLockDevice(), z);
        this$0.startActivityForResult(intent, sRequestCodeCopyByMilock);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addMilockCard$lambda$24(AddDoorCardFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadCloudList$lambda$3(AddDoorCardFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        this$0.dismissDialogForce();
        ((xmg) this$0.getMBinding()).G.removeAllViews();
        if (list.isEmpty()) {
            ((xmg) this$0.getMBinding()).M.setVisibility(8);
            ((xmg) this$0.getMBinding()).F.setVisibility(8);
        } else {
            ((xmg) this$0.getMBinding()).F.setVisibility(0);
            ((xmg) this$0.getMBinding()).M.setVisibility(0);
            this$0.addCloudCardList(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCloudList$lambda$4(AddDoorCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.widget.PopupWindow] */
    public static final void onViewCreated$lambda$2(final AddDoorCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            View viewInflate = View.inflate(mActivity, sui.E0, null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new PopupWindow(viewInflate, -2, -2, true);
            viewInflate.findViewById(mri.Q2).setVisibility(8);
            viewInflate.findViewById(mri.B1).setOnClickListener(new View.OnClickListener() { // from class: uq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AddDoorCardFragment.onViewCreated$lambda$2$lambda$1$lambda$0(this.f36015a, objectRef, view2);
                }
            });
            ((PopupWindow) objectRef.element).setBackgroundDrawable(new ColorDrawable(0));
            m4i.c((PopupWindow) objectRef.element, view, 0, 0, 80);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$2$lambda$1$lambda$0(AddDoorCardFragment this$0, Ref.ObjectRef popupWindow, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) WebActivity.class);
        intent.putExtra(pf4.f30343b, pf4.a());
        intent.putExtra(pf4.c, this$0.getString(o0j.X0));
        this$0.startActivity(intent);
        ((PopupWindow) popupWindow.element).dismiss();
    }

    private final void selectReadCardInfoWay() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String string = (wearableDeviceModel == null || !DeviceModelExtKt.isBandType(wearableDeviceModel)) ? getString(o0j.K5) : getString(o0j.J5);
        Intrinsics.checkNotNull(string);
        final Ref.IntRef intRef = new Ref.IntRef();
        CommonDialog commonDialogCreate = new CommonDialog.c("AddDoorCardFragment.copycard.selectWay").setPositiveText(o0j.e).setNegativeText(o0j.d).setDialogTitle(o0j.q6).setItems(new String[]{string, getString(o0j.E4)}).setItemsCheckedIndex(intRef.element).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.AddDoorCardFragment.selectReadCardInfoWay.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        intRef.element = which;
                        return;
                    }
                    if (intRef.element == 0) {
                        this.gotoPageForResult(CopyCardByDeviceFragment.class, null, AddDoorCardFragment.INSTANCE.getSRequestCodeCopyByDevice());
                    } else {
                        this.gotoPageForResult(CopyCardByPhoneFragment.class, null, AddDoorCardFragment.INSTANCE.getSRequestCodeCopyByDevice());
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$10(final AddDoorCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 1, null);
        ((AddDoorViewModel) this$0.getMViewModel()).findSeCardByProductId("00000-00001", new Function1() { // from class: hr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$10$lambda$8(this.f20360a, (CardWrapper) obj);
            }
        }, new Function1() { // from class: ir0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$10$lambda$9(this.f22008a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10$lambda$8(AddDoorCardFragment this$0, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (cardWrapper == null) {
            ToastUtil.showShortToast(o0j.t5);
            return Unit.INSTANCE;
        }
        zl3.g().l(cardWrapper);
        this$0.startActivityForResult(new Intent(this$0.getMActivity(), (Class<?>) IssuerActivity.class), sRequestCodeIssueBlank);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$10$lambda$9(AddDoorCardFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$15(final AddDoorCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NfcPreference nfcPreference = NfcPreference.INSTANCE;
        if (nfcPreference.isShowedOpenDoorBackUp()) {
            this$0.showCopyDialog();
            return;
        }
        nfcPreference.setShowedOpenDoorBackUp(true);
        int i = o0j.g0;
        int i2 = o0j.d0;
        int i3 = o0j.g5;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, parentFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: kr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$15$lambda$13(this.f24203a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: lr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$15$lambda$14(this.f25363a, (DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$15$lambda$13(final AddDoorCardFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.showLoading();
        ((AddDoorViewModel) this$0.getMViewModel()).setCloudDoorStatus(true, new Function1() { // from class: nr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$15$lambda$13$lambda$11(this.f28275a, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: tq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddDoorCardFragment.setListener$lambda$15$lambda$13$lambda$12(this.f34923a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$13$lambda$11(AddDoorCardFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        this$0.showCopyDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$13$lambda$12(AddDoorCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        this$0.showCopyDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$15$lambda$14(AddDoorCardFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showCopyDialog();
        this$0.dismissDialogForce();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$21(final AddDoorCardFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        vqg.d("miLockView click");
        this$0.showLoading();
        ((AddDoorViewModel) this$0.getMViewModel()).getUserAllMiLock(new Function1() { // from class: ar0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$21$lambda$19(this.f3371a, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: br0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$21$lambda$20(this.f4503a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$21$lambda$19(final AddDoorCardFragment this$0, final boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AddDoorViewModel) this$0.getMViewModel()).loadAllDoorLock(new Function1() { // from class: dr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$21$lambda$19$lambda$17(this.f15828a, z, (String) obj);
            }
        }, new Function1() { // from class: gr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$21$lambda$19$lambda$18(this.f19255a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$21$lambda$19$lambda$17(final AddDoorCardFragment this$0, final boolean z, final String str) {
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (str == null) {
            str2 = "\n" + this$0.getString(o0j.j1) + "\n";
        } else {
            str2 = str;
        }
        int i = str == null ? o0j.j2 : o0j.k1;
        int i2 = str == null ? -1 : o0j.j2;
        String string = this$0.getString(o0j.l1);
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : string, str2, i, childFragmentManager, (80 & 16) != 0 ? -1 : i2, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: jr0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.setListener$lambda$21$lambda$19$lambda$17$lambda$16(str, this$0, z, (DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$21$lambda$19$lambda$17$lambda$16(String str, AddDoorCardFragment this$0, boolean z, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            if (ViewUtil.INSTANCE.isFastClick()) {
                return Unit.INSTANCE;
            }
            vqg.d("go to addMilockCard");
            this$0.addMilockCard(z);
        } else if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$21$lambda$19$lambda$18(AddDoorCardFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$21$lambda$20(AddDoorCardFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    private final void showCopyDialog() {
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        boolean zHasSystemFeature = mActivity.getPackageManager().hasSystemFeature("android.hardware.nfc");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            vqg.d("isPhoneSupportNfc: " + zHasSystemFeature);
            if (zHasSystemFeature) {
                selectReadCardInfoWay();
                return;
            } else {
                gotoPageForResult(CopyCardByDeviceFragment.class, null, sRequestCodeCopyByDevice);
                return;
            }
        }
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
        boolean z = false;
        if (!TextUtils.isEmpty(firmwareVersion)) {
            if (Integer.valueOf(ipq.a(firmwareVersion)).intValue() >= Integer.valueOf(ipq.a("PXD7.200206.001.XM060")).intValue()) {
                z = true;
            }
        }
        if (zHasSystemFeature && z) {
            selectReadCardInfoWay();
            return;
        }
        if (zHasSystemFeature || z) {
            gotoPageForResult(CopyCardByDeviceFragment.class, null, sRequestCodeCopyByDevice);
            return;
        }
        int i = o0j.p2;
        int i2 = o0j.G4;
        int i3 = o0j.u2;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        UtilsKt.showMsgDialog$default(i, i2, i3, childFragmentManager, 0, new Function1() { // from class: xq0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.showCopyDialog$lambda$22((DialogInterface) obj);
            }
        }, (Function1) null, 80, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCopyDialog$lambda$22(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addCloudCardList(@NotNull List<? extends CardWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        for (final CardWrapper cardWrapper : list) {
            View viewInflate = LayoutInflater.from(getMActivity()).inflate(sui.h, (ViewGroup) null);
            ImageView imageView = (ImageView) viewInflate.findViewById(mri.T1);
            TextView textView = (TextView) viewInflate.findViewById(mri.S2);
            TextView textView2 = (TextView) viewInflate.findViewById(mri.f1);
            Intrinsics.checkNotNull(imageView);
            String cardFace = cardWrapper.getCardFace();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(cardFace).target(imageView);
            builderTarget.placeholder(wni.j);
            builderTarget.error(wni.j);
            imageLoader.enqueue(builderTarget.build());
            textView.setText(cardWrapper.mCardName);
            if (cardWrapper.isDownloadable) {
                textView2.setTextColor(BaseFragmentExtKt.getColor(this, rji.g));
                textView2.setText(o0j.f0);
            } else {
                textView2.setTextColor(BaseFragmentExtKt.getColor(this, rji.common_text_color_gray));
                textView2.setText(o0j.e0);
            }
            ((xmg) getMBinding()).G.addView(viewInflate);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: sq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddDoorCardFragment.addCloudCardList$lambda$7$lambda$6(cardWrapper, this, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addMilockCard(final boolean hasMilock) {
        showLoading();
        ((AddDoorViewModel) getMViewModel()).findSeCardByProductId("66666-00211", new Function1() { // from class: yq0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.addMilockCard$lambda$23(this.f40415a, hasMilock, (CardWrapper) obj);
            }
        }, new Function1() { // from class: zq0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.addMilockCard$lambda$24(this.f41558a, (String) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadCloudList() {
        showLoading();
        ((AddDoorViewModel) getMViewModel()).getCloudList(new Function1() { // from class: vq0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddDoorCardFragment.loadCloudList$lambda$3(this.f37121a, (List) obj);
            }
        }, new Function0() { // from class: wq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddDoorCardFragment.loadCloudList$lambda$4(this.f38241a);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeCopyByPhone || requestCode == sRequestCodeCopyByDevice || requestCode == sRequestCodeIssueBlank || requestCode == sRequestCodeCopyByMilock) {
            if (resultCode == -1) {
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(-1);
                }
                finish();
                return;
            }
            return;
        }
        if (requestCode == sRequestCodeCloudDoor) {
            if (resultCode != -1) {
                if (resultCode != 1) {
                    return;
                }
                finish();
            } else {
                loadCloudList();
                FragmentActivity mActivity2 = getMActivity();
                if (mActivity2 != null) {
                    mActivity2.setResult(-1);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.d3);
        IActionBar.DefaultImpls.setEndView$default(this, 0, wni.e, null, new View.OnClickListener() { // from class: mr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddDoorCardFragment.onViewCreated$lambda$2(this.f27115a, view2);
            }
        }, 5, null);
        vqg.d("add door fragment sgiw");
        loadCloudList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((xmg) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: cr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDoorCardFragment.setListener$lambda$10(this.f14632a, view);
            }
        });
        ((xmg) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: er0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDoorCardFragment.setListener$lambda$15(this.f16980a, view);
            }
        });
        ((xmg) getMBinding()).N.setOnClickListener(new View.OnClickListener() { // from class: fr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDoorCardFragment.setListener$lambda$21(this.f18114a, view);
            }
        });
    }
}
