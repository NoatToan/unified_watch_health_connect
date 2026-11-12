package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.CardPrepareFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.o0j;
import defpackage.pli;
import defpackage.png;
import defpackage.rji;
import defpackage.s3q;
import defpackage.sui;
import defpackage.vqg;
import defpackage.wni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002=>B\u0007¢\u0006\u0004\b<\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010$\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010 J\u0019\u0010'\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0007J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R$\u00101\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010/\u001a\u0004\b7\u00108\"\u0004\b9\u0010 R\u0016\u0010:\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardPrepareFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardPrepareViewModel;", "Lpng;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "", "loadDeviceList", "()V", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "", "isNeedCardInfo", "()Z", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "updateUi", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "deviceConnection", "Lcom/xiaomi/fitness/nfc/ui/CardPrepareFragment$OnPrepareListener;", "onPrepareListener", "setOnPrepareListener", "(Lcom/xiaomi/fitness/nfc/ui/CardPrepareFragment$OnPrepareListener;)V", "", "did", "onConnectStart", "(Ljava/lang/String;)V", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/nfc/ui/CardPrepareFragment$OnPrepareListener;", "alias", "Ljava/lang/String;", "protoType", "targetDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getTargetDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setTargetDeviceModel", "carShareUrl", "getCarShareUrl", "()Ljava/lang/String;", "setCarShareUrl", "selectDeviceIndex", "I", "<init>", "Companion", "OnPrepareListener", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardPrepareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardPrepareFragment.kt\ncom/xiaomi/fitness/nfc/ui/CardPrepareFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1872#2,3:274\n*S KotlinDebug\n*F\n+ 1 CardPrepareFragment.kt\ncom/xiaomi/fitness/nfc/ui/CardPrepareFragment\n*L\n121#1:274,3\n*E\n"})
public final class CardPrepareFragment extends BaseCardFragment<CardPrepareViewModel, png> implements OnDeviceStatusListener {
    public static final float HUAMI_PROGRESS_SCALE = 0.5f;

    @Nullable
    private String alias;

    @Nullable
    private String carShareUrl;

    @Nullable
    private String did;

    @Nullable
    private OnPrepareListener onPrepareListener;

    @Nullable
    private String protoType;
    private int selectDeviceIndex;

    @Nullable
    private WearableDeviceModel targetDeviceModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardPrepareFragment$OnPrepareListener;", "", "onReady", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPrepareListener {
        void onReady();
    }

    public CardPrepareFragment() {
        super(sui.z, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadDeviceList() {
        showLoading();
        ((CardPrepareViewModel) getMViewModel()).findDevices(this.alias, this.did, this.protoType, new Function1() { // from class: tp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardPrepareFragment.loadDeviceList$lambda$5(this.f34904a, (List) obj);
            }
        }, new Function0() { // from class: up3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardPrepareFragment.loadDeviceList$lambda$6(this.f35987a);
            }
        }, new Function0() { // from class: vp3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardPrepareFragment.loadDeviceList$lambda$7(this.f37098a);
            }
        }, new Function0() { // from class: wp3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardPrepareFragment.loadDeviceList$lambda$8(this.f38201a);
            }
        }, this.carShareUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$5(final CardPrepareFragment this$0, final List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        this$0.dismissDialogForce();
        if (list.size() == 1) {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) CollectionsKt___CollectionsKt.first(list);
            this$0.targetDeviceModel = wearableDeviceModel;
            this$0.updateUi(wearableDeviceModel);
            this$0.deviceConnection(wearableDeviceModel);
        } else {
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = "";
            }
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                strArr[i2] = DeviceModelExtKt.getName((WearableDeviceModel) obj);
                i2 = i3;
            }
            CommonDialog commonDialogCreate = (this$0.carShareUrl != null ? new CommonDialog.c("CardPrepareFragment.selectDevice").setCustomTitleId(sui.g) : new CommonDialog.c("CardPrepareFragment.selectDevice").setDialogTitle(o0j.p1)).setPositiveText(o0j.e).setNegativeText(o0j.j2).setCancelable(false).setItems(strArr).setItemsCheckedIndex(this$0.selectDeviceIndex).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CardPrepareFragment$loadDeviceList$1$2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        this.this$0.finish();
                    } else {
                        if (which != -1) {
                            this.this$0.selectDeviceIndex = which;
                            return;
                        }
                        WearableDeviceModel wearableDeviceModel2 = list.get(this.this$0.selectDeviceIndex);
                        this.this$0.setTargetDeviceModel(wearableDeviceModel2);
                        this.this$0.updateUi(wearableDeviceModel2);
                        this.this$0.deviceConnection(wearableDeviceModel2);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$6(CardPrepareFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        if (this$0.carShareUrl != null) {
            ToastUtil.showShortToast(o0j.q1);
        }
        FragmentActivity mActivity = this$0.getMActivity();
        IssuerActivity issuerActivity = mActivity instanceof IssuerActivity ? (IssuerActivity) mActivity : null;
        if (issuerActivity != null) {
            issuerActivity.setResult(2, this$0.getString(o0j.q1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$7(CardPrepareFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        if (this$0.carShareUrl != null) {
            ToastUtil.showShortToast(o0j.o1);
        }
        FragmentActivity mActivity = this$0.getMActivity();
        IssuerActivity issuerActivity = mActivity instanceof IssuerActivity ? (IssuerActivity) mActivity : null;
        if (issuerActivity != null) {
            issuerActivity.setResult(2, this$0.getString(o0j.o1));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDeviceList$lambda$8(CardPrepareFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.o4);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(CardPrepareFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(CardPrepareFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        NfcPreference.INSTANCE.setCarCardProtocol(true);
        this$0.loadDeviceList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CardPrepareFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void deviceConnection(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (deviceModel.getIsDeviceConnected()) {
            vqg.b("deviceConnection deviceModel.isDeviceConnected");
            ((png) getMBinding()).H.setText(o0j.b3);
            if (NfcUtils.isSupportNfc(deviceModel)) {
                s3q.f0().t0(deviceModel);
            }
            OnPrepareListener onPrepareListener = this.onPrepareListener;
            if (onPrepareListener != null) {
                onPrepareListener.onReady();
                return;
            }
            return;
        }
        if (deviceModel.getIsCurrent()) {
            vqg.b("deviceConnection deviceModel.isCurrent");
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            DeviceManagerExtKt.getInstance(companion).addDeviceStatusListener(this);
            DeviceManager.DefaultImpls.connectDevice$default(DeviceManagerExtKt.getInstance(companion), null, 1, null);
            return;
        }
        vqg.b("deviceConnection deviceModel.isCurrent else");
        WearableDeviceManager.Companion companion2 = WearableDeviceManager.INSTANCE;
        DeviceManagerExtKt.getInstance(companion2).addDeviceStatusListener(this);
        DeviceManagerExtKt.getInstance(companion2).switchDevice(deviceModel);
    }

    @Nullable
    public final String getCarShareUrl() {
        return this.carShareUrl;
    }

    @Nullable
    public final WearableDeviceModel getTargetDeviceModel() {
        return this.targetDeviceModel;
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
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((png) getMBinding()).F.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        WearableDeviceModel wearableDeviceModel = this.targetDeviceModel;
        vqg.d("CardPrepareFragment   onConnectFailure " + Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null));
        WearableDeviceModel wearableDeviceModel2 = this.targetDeviceModel;
        if (Intrinsics.areEqual(did, wearableDeviceModel2 != null ? wearableDeviceModel2.getDid() : null)) {
            dismissDialogForce();
            DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
            ToastUtil.showShortToast(o0j.h1);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
        vqg.d("CardPrepareFragment   onConnectStart");
        if (!isLoadingShowing()) {
            String string = AppUtil.getApp().getString(o0j.h);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            PageState.DefaultImpls.showLoading$default(this, string, 0, false, 6, null);
        }
        ((png) getMBinding()).E.setVisibility(0);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        vqg.d("CardPrepareFragment   onConnectSuccess");
        s3q s3qVarF0 = s3q.f0();
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        s3qVarF0.t0((WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        DeviceManagerExtKt.getInstance(companion).removeDeviceStatusListener(this);
        dismissDialogForce();
        if (isInvalid()) {
            return;
        }
        vqg.d("CardPrepareFragment  onPrepareListener.onReady");
        OnPrepareListener onPrepareListener = this.onPrepareListener;
        if (onPrepareListener != null) {
            onPrepareListener.onReady();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        vqg.b("CardPrepareFragment onDestroy");
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        vqg.b("CardPrepareFragment   onDisconnect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, wni.f38161a, null, new View.OnClickListener() { // from class: pp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CardPrepareFragment.onViewCreated$lambda$0(this.f30601a, view2);
            }
        }, 5, null);
        String string = getString(o0j.g3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = string + string;
        ((png) getMBinding()).E.setText(string);
        CardPrepareViewModel cardPrepareViewModel = (CardPrepareViewModel) getMViewModel();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        TextView dotView = ((png) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(dotView, "dotView");
        cardPrepareViewModel.issuerLoading(fragmentActivityRequireActivity, string, str, string + str, dotView);
        ViewGroup.LayoutParams layoutParams = ((png) getMBinding()).B.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.d);
        }
        if (this.carShareUrl == null || NfcPreference.INSTANCE.getCarCardProtocol()) {
            loadDeviceList();
            return;
        }
        Spannable spannableA = LinkSpanHelper.a(ApplicationExtKt.getApplication(), getString(o0j.G0), Integer.valueOf(rji.f32614b), new LinkSpanHelper.a() { // from class: qp3
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view2, String str2) {
                CardPrepareFragment.onViewCreated$lambda$1(view2, str2);
            }
        });
        String string2 = getString(o0j.e3);
        Intrinsics.checkNotNull(spannableA);
        int i = o0j.f28615a;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog(string2, spannableA, i, parentFragmentManager, o0j.d, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: rp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardPrepareFragment.onViewCreated$lambda$2(this.f32764a, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: sp3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardPrepareFragment.onViewCreated$lambda$3(this.f33849a, (DialogInterface) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        this.alias = args != null ? args.getString("model", "") : null;
        this.did = args != null ? args.getString("did", "") : null;
        this.protoType = args != null ? args.getString(IssuerActivity.KEY_PROTO_TYPE, "") : null;
    }

    public final void setCarShareUrl(@Nullable String str) {
        this.carShareUrl = str;
    }

    public final void setOnPrepareListener(@NotNull OnPrepareListener onPrepareListener) {
        Intrinsics.checkNotNullParameter(onPrepareListener, "onPrepareListener");
        this.onPrepareListener = onPrepareListener;
    }

    public final void setTargetDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.targetDeviceModel = wearableDeviceModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateUi(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        ((png) getMBinding()).I.setVisibility(0);
        ((png) getMBinding()).D.setVisibility(0);
        ((png) getMBinding()).D.show(deviceModel);
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            ((png) getMBinding()).G.setScaleX(0.5f);
            ((png) getMBinding()).G.setScaleY(0.5f);
        } else {
            ((png) getMBinding()).G.setScaleX(1.0f);
            ((png) getMBinding()).G.setScaleY(1.0f);
        }
    }
}
