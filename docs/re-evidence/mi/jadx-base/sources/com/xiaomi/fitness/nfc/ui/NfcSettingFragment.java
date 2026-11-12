package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean;
import com.xiaomi.fitness.nfc.pay.WebActivity;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.NfcSettingFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.pli;
import defpackage.rpg;
import defpackage.sui;
import defpackage.vqg;
import defpackage.yhq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/NfcSettingFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/NfcSettingViewModel;", "Lrpg;", "", "setBackUpDoorListener", "(Lrpg;)V", "", "isChecked", "setDoorBackStatus", "(Z)V", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "bindView", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "Lkotlin/collections/ArrayList;", "allCardList", "Ljava/util/ArrayList;", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NfcSettingFragment extends BaseCardFragment<NfcSettingViewModel, rpg> {

    @Nullable
    private ArrayList<AutoSwitchCardBean> allCardList;

    public NfcSettingFragment() {
        super(sui.a0, 0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(NfcSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoPage(SyncEseFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(NfcSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) WebActivity.class);
        if (yhq.c.b()) {
            intent.putExtra(pf4.f30343b, "https://staging2.sf.pay.xiaomi.com/views/refundCard/index.html");
            intent.putExtra(pf4.c, this$0.getString(o0j.i6));
        } else {
            intent.putExtra(pf4.f30343b, "https://sf.pay.xiaomi.com/views/refundCard/index.html");
            intent.putExtra(pf4.c, this$0.getString(o0j.i6));
        }
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(NfcSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) WebActivity.class);
        intent.putExtra(pf4.f30343b, pf4.b());
        intent.putExtra(pf4.c, this$0.getString(o0j.X0));
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(NfcSettingFragment this$0, rpg this_bindView, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.dismissDialogForce();
        this_bindView.B.setSwitch(z);
        this$0.setBackUpDoorListener(this_bindView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(NfcSettingFragment this$0, rpg this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.setBackUpDoorListener(this_bindView);
        this$0.dismissDialogForce();
        ToastUtil.INSTANCE.showToast(o0j.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(NfcSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(AutoSwitchCardFragment.sCardList, this$0.allCardList);
        this$0.gotoPage(AutoSwitchCardFragment.class, bundle);
    }

    private final void setBackUpDoorListener(rpg rpgVar) {
        rpgVar.B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: etg
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                NfcSettingFragment.setBackUpDoorListener$lambda$9(this.f17047a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBackUpDoorListener$lambda$9(final NfcSettingFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (z) {
            this$0.setDoorBackStatus(z);
            return;
        }
        int i = o0j.c0;
        int i2 = o0j.b0;
        int i3 = o0j.e;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(i, i2, i3, parentFragmentManager, o0j.common_cancel, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: ftg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcSettingFragment.setBackUpDoorListener$lambda$9$lambda$7(this.f18225a, z, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: wsg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcSettingFragment.setBackUpDoorListener$lambda$9$lambda$8((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBackUpDoorListener$lambda$9$lambda$7(NfcSettingFragment this$0, boolean z, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.setDoorBackStatus(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBackUpDoorListener$lambda$9$lambda$8(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setDoorBackStatus(final boolean isChecked) {
        showLoading();
        ((NfcSettingViewModel) getMViewModel()).setCloudDoorStatus(isChecked, new Function1() { // from class: ctg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcSettingFragment.setDoorBackStatus$lambda$10(isChecked, this, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: dtg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NfcSettingFragment.setDoorBackStatus$lambda$11(this.f15915a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setDoorBackStatus$lambda$10(boolean z, NfcSettingFragment this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NfcPreference.INSTANCE.setShowedOpenDoorBackUp(z);
        this$0.dismissDialogForce();
        ((rpg) this$0.getMBinding()).B.setSwitch(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDoorBackStatus$lambda$11(NfcSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final rpg rpgVar) {
        Intrinsics.checkNotNullParameter(rpgVar, "<this>");
        setTitle(o0j.v6);
        rpgVar.F.setOnClickListener(new View.OnClickListener() { // from class: vsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NfcSettingFragment.bindView$lambda$0(this.f37186a, view);
            }
        });
        rpgVar.E.setOnClickListener(new View.OnClickListener() { // from class: xsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NfcSettingFragment.bindView$lambda$1(this.f39418a, view);
            }
        });
        rpgVar.C.setOnClickListener(new View.OnClickListener() { // from class: ysg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NfcSettingFragment.bindView$lambda$2(this.f40491a, view);
            }
        });
        showLoading();
        ((NfcSettingViewModel) getMViewModel()).loadCloudDoorStatus(new Function1() { // from class: zsg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcSettingFragment.bindView$lambda$3(this.f41627a, rpgVar, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: atg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NfcSettingFragment.bindView$lambda$4(this.f3432a, rpgVar);
            }
        });
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            if ((DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 1073741824) != 0) {
                rpgVar.A.setVisibility(0);
            } else {
                rpgVar.A.setVisibility(8);
            }
        }
        rpgVar.A.setOnClickListener(new View.OnClickListener() { // from class: btg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NfcSettingFragment.bindView$lambda$6(this.f4591a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((rpg) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        ArrayList<AutoSwitchCardBean> parcelableArrayList = args != null ? args.getParcelableArrayList(AutoSwitchCardFragment.sCardList) : null;
        this.allCardList = parcelableArrayList;
        vqg.d("NfcSettingFragment " + (parcelableArrayList != null ? Integer.valueOf(parcelableArrayList.size()) : null));
    }
}
