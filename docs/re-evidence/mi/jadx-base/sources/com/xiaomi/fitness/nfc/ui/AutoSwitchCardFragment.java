package com.xiaomi.fitness.nfc.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.AutoSwitchCardBean;
import com.xiaomi.fitness.nfc.ui.AutoSwitchCardFragment;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.nfc.widget.AutoSwitchCardListView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.vqg;
import defpackage.zmg;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B\u0007¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/AutoSwitchCardFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/AutoSwitchCardViewModel;", "Lzmg;", "Lcom/xiaomi/fitness/nfc/widget/AutoSwitchCardListView$CardListViewListener;", "", "initData", "()V", "", "isSwitchOn", "switchEnable", "(Z)V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "isNeedCardInfo", "()Z", "bindView", "(Lzmg;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;", "cardInfo", "onCardClicked", "(Lcom/xiaomi/fitness/nfc/bean/AutoSwitchCardBean;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allCardList", "Ljava/util/ArrayList;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAutoSwitchCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSwitchCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,135:1\n1863#2,2:136\n774#2:140\n865#2,2:141\n1557#2:143\n1628#2,3:144\n1863#2,2:147\n1317#3,2:138\n*S KotlinDebug\n*F\n+ 1 AutoSwitchCardFragment.kt\ncom/xiaomi/fitness/nfc/ui/AutoSwitchCardFragment\n*L\n100#1:136,2\n107#1:140\n107#1:141,2\n107#1:143\n107#1:144,3\n68#1:147,2\n101#1:138,2\n*E\n"})
public final class AutoSwitchCardFragment extends BaseCardFragment<AutoSwitchCardViewModel, zmg> implements AutoSwitchCardListView.CardListViewListener {

    @NotNull
    public static final String sCardList = "sCardList";

    @Nullable
    private ArrayList<AutoSwitchCardBean> allCardList;

    public AutoSwitchCardFragment() {
        super(sui.f34002r, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((zmg) getMBinding()).A.removeAllViews();
        showLoading();
        AutoSwitchCardViewModel autoSwitchCardViewModel = (AutoSwitchCardViewModel) getMViewModel();
        ArrayList<AutoSwitchCardBean> arrayList = this.allCardList;
        Intrinsics.checkNotNull(arrayList);
        autoSwitchCardViewModel.takeApartList(arrayList, new Function2() { // from class: is1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutoSwitchCardFragment.initData$lambda$3(this.f22033a, ((Boolean) obj).booleanValue(), (ArrayList) obj2);
            }
        }, new Function0() { // from class: js1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoSwitchCardFragment.initData$lambda$4(this.f23079a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$3(final AutoSwitchCardFragment this$0, boolean z, ArrayList list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        ((zmg) this$0.getMBinding()).D.setSwitch(z);
        ((zmg) this$0.getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ls1
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z2, ISwitchButton iSwitchButton) {
                AutoSwitchCardFragment.initData$lambda$3$lambda$1(this.f25388a, z2, iSwitchButton);
            }
        });
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (!arrayList.isEmpty()) {
                Context contextRequireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                AutoSwitchCardListView autoSwitchCardListView = new AutoSwitchCardListView(contextRequireContext, null, 0, 6, null);
                autoSwitchCardListView.setListener(this$0);
                autoSwitchCardListView.setCardList(arrayList);
                ((zmg) this$0.getMBinding()).A.addView(autoSwitchCardListView, new LinearLayout.LayoutParams(-1, -2));
            }
        }
        if (z) {
            ((zmg) this$0.getMBinding()).A.setVisibility(0);
        } else {
            ((zmg) this$0.getMBinding()).A.setVisibility(8);
        }
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$3$lambda$1(final AutoSwitchCardFragment this$0, final boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (!z) {
            this$0.switchEnable(z);
            return;
        }
        int i = o0j.T;
        int i2 = o0j.S;
        int i3 = o0j.g5;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog$default(i, i2, i3, parentFragmentManager, o0j.common_cancel, new Function1() { // from class: ks1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AutoSwitchCardFragment.initData$lambda$3$lambda$1$lambda$0(this.f24246a, z, (DialogInterface) obj);
            }
        }, (Function1) null, 64, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$3$lambda$1$lambda$0(AutoSwitchCardFragment this$0, boolean z, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.switchEnable(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$4(AutoSwitchCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(o0j.common_load_fail);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void switchEnable(final boolean isSwitchOn) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(o0j.f);
            return;
        }
        if (!isSwitchOn) {
            ArrayList<AutoSwitchCardBean> arrayList = this.allCardList;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AutoSwitchCardBean) it.next()).setSelected(false);
                }
            }
            LinearLayout cardListContainnerView = ((zmg) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(cardListContainnerView, "cardListContainnerView");
            for (View view : ViewGroupKt.getChildren(cardListContainnerView)) {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.nfc.widget.AutoSwitchCardListView");
                ((AutoSwitchCardListView) view).setItemSelected(false);
            }
        }
        ArrayList<AutoSwitchCardBean> arrayList2 = this.allCardList;
        Intrinsics.checkNotNull(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((AutoSwitchCardBean) obj).getIsSelected()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((AutoSwitchCardBean) it2.next()).getAid());
        }
        showLoading();
        ((AutoSwitchCardViewModel) getMViewModel()).setAidList(isSwitchOn, arrayList4, new Function1() { // from class: gs1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return AutoSwitchCardFragment.switchEnable$lambda$9(isSwitchOn, this, ((Boolean) obj2).booleanValue());
            }
        }, new Function0() { // from class: hs1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutoSwitchCardFragment.switchEnable$lambda$10(this.f20391a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchEnable$lambda$10(AutoSwitchCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(o0j.common_set_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit switchEnable$lambda$9(boolean z, AutoSwitchCardFragment this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ((zmg) this$0.getMBinding()).A.setVisibility(0);
        } else {
            ((zmg) this$0.getMBinding()).A.setVisibility(8);
        }
        ((zmg) this$0.getMBinding()).D.setSwitch(z);
        ToastUtil.showShortToast(o0j.common_set_success);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull zmg zmgVar) {
        Intrinsics.checkNotNullParameter(zmgVar, "<this>");
        setTitle(o0j.R);
        initData();
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.nfc.widget.AutoSwitchCardListView.CardListViewListener
    public void onCardClicked(@NotNull AutoSwitchCardBean cardInfo) {
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        switchEnable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((zmg) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        ArrayList<AutoSwitchCardBean> parcelableArrayList = args != null ? args.getParcelableArrayList(sCardList) : null;
        this.allCardList = parcelableArrayList;
        vqg.d("AutoSwitchCardFragment " + (parcelableArrayList != null ? Integer.valueOf(parcelableArrayList.size()) : null));
        ArrayList<AutoSwitchCardBean> arrayList = this.allCardList;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.allCardList = arrayList;
    }
}
