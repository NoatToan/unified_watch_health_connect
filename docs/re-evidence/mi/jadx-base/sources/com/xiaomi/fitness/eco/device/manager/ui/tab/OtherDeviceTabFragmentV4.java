package com.xiaomi.fitness.eco.device.manager.ui.tab;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.common.utils.SystemSetting;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.device.manager.export.BluetoothPermissionTool;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.l;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.EcoDevicePreference;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper;
import com.xiaomi.fitness.eco.device.manager.ui.tab.ConnectStatus;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4;
import com.xiaomi.fitness.eco.device.manager.utils.BluetoothPermissionUtil;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.DelShareResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.export.extensions.RnSettingsExportApiExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.onetrack.api.b;
import defpackage.ari;
import defpackage.av6;
import defpackage.dw1;
import defpackage.fui;
import defpackage.tt7;
import defpackage.yzi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001G\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001LB\u0011\b\u0007\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010\u0007J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0007J\u0017\u00104\u001a\u00020\u001b2\u0006\u00103\u001a\u00020(H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020(H\u0016¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020(H\u0016¢\u0006\u0004\b7\u0010*R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010?\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R5\u0010E\u001a#\u0012\u0019\u0012\u0017\u0012\u0002\b\u0003\u0018\u00010B¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabFragmentV4;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabV4ViewModel;", "Ltt7;", "Lcom/xiaomi/fitness/device/manager/export/DeviceTabInfoProvider;", "", "clearLiveData", "()V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "lostDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "rebindDevice", "", b.M, "showRebindFail", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Z)V", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "it", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "deviceDetail", "doUnbind", "(Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;)V", "delShare", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;)V", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "did", "unbindMember", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;)V", "unbind", "(Ljava/lang/String;)V", "unbindEarPhone", "requestPermissionForConnect", "requestPermissionAgain", "bluetoothPermissionDialog", "(Z)V", "showPairGuideConfirmDialog", "(Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;)V", "", "getBloodSugar", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_RESUME, "type", "tabName", "(I)Ljava/lang/String;", "deviceCount", "index", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "mEcoDeviceManager", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mLostDeviceDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mRebindDialog", "mRebindRetryCount", "I", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lkotlin/ParameterName;", "name", "rnDeviceChangeListener", "Lkotlin/jvm/functions/Function1;", "com/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1", "onEcoDeviceStatusListener", "Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;)V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOtherDeviceTabFragmentV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherDeviceTabFragmentV4.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabFragmentV4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,676:1\n774#2:677\n865#2,2:678\n774#2:680\n865#2,2:681\n29#3:683\n*S KotlinDebug\n*F\n+ 1 OtherDeviceTabFragmentV4.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceTabFragmentV4\n*L\n650#1:677\n650#1:678,2\n657#1:680\n657#1:681,2\n415#1:683\n*E\n"})
public final class OtherDeviceTabFragmentV4 extends Hilt_OtherDeviceTabFragmentV4<OtherDeviceTabV4ViewModel, tt7> implements DeviceTabInfoProvider {

    @NotNull
    public static final String TAG = "OtherDeviceTabFragmentV4";

    @NotNull
    private final EcoDeviceManager mEcoDeviceManager;

    @Nullable
    private CommonDialog<?> mLostDeviceDialog;

    @Nullable
    private CommonDialog<?> mRebindDialog;
    private int mRebindRetryCount;

    @NotNull
    private final OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1 onEcoDeviceStatusListener;

    @NotNull
    private final Function1<DeviceModel<?>, Unit> rnDeviceChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1] */
    public OtherDeviceTabFragmentV4(@NotNull EcoDeviceManager mEcoDeviceManager) {
        super(fui.l, dw1.d);
        Intrinsics.checkNotNullParameter(mEcoDeviceManager, "mEcoDeviceManager");
        this.mEcoDeviceManager = mEcoDeviceManager;
        this.rnDeviceChangeListener = new Function1() { // from class: idh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.rnDeviceChangeListener$lambda$13(this.f21026a, (DeviceModel) obj);
            }
        };
        this.onEcoDeviceStatusListener = new OnEcoDeviceFullStatusListener() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1
            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener
            public void onBind(String did, boolean isRebind) {
                super.onBind(did, isRebind);
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onBind: " + did + " isRebind: " + isRebind);
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1$onBind$1(this.this$0, null), 1, null);
            }

            @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceFullStatusListener
            public void onDestroy(String did, boolean isRemoved) {
                super.onDestroy(did, isRemoved);
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onDestroy: " + did + " isRemoved: " + isRemoved);
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$onEcoDeviceStatusListener$1$onDestroy$1(this.this$0, null), 1, null);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ OtherDeviceTabV4ViewModel access$getMViewModel(OtherDeviceTabFragmentV4 otherDeviceTabFragmentV4) {
        return (OtherDeviceTabV4ViewModel) otherDeviceTabFragmentV4.getMViewModel();
    }

    private final void bluetoothPermissionDialog(final boolean requestPermissionAgain) {
        CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(yzi.R).setDialogDescription(Build.VERSION.SDK_INT >= 31 ? yzi.U : yzi.V).setPositiveText(yzi.f40721b).setNegativeText(yzi.L0).create();
        commonDialogCreate.setCancelable(false);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.bluetoothPermissionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    if (requestPermissionAgain) {
                        this.requestPermissionForConnect();
                    } else {
                        FragmentActivity activity = this.getActivity();
                        if (activity != null) {
                            SystemSetting.INSTANCE.goToSetting(activity);
                        }
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        FragmentActivity activity = getActivity();
        commonDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void clearLiveData() {
        ((OtherDeviceTabV4ViewModel) getMViewModel()).setBleReconnect(new MutableLiveData<>());
    }

    private final void delShare(final FragmentActivity activity, final EcoDeviceDetail deviceDetail) {
        PageState.DefaultImpls.showLoading$default(this, yzi.D0, false, 2, null);
        ElectronicScaleRequest electronicScaleRequestExtKt = ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE);
        String userId = deviceDetail.getUserId();
        Intrinsics.checkNotNull(userId);
        String shareUserId = deviceDetail.getShareUserId();
        Intrinsics.checkNotNull(shareUserId);
        String shareId = deviceDetail.getShareId();
        Intrinsics.checkNotNull(shareId);
        ElectronicScaleRequest.DefaultImpls.delShare$default(electronicScaleRequestExtKt, userId, shareUserId, shareId, null, new Function1() { // from class: cdh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.delShare$lambda$11(this.f5213a, deviceDetail, activity, (ScaleData) obj);
            }
        }, new Function1() { // from class: ddh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.delShare$lambda$12(this.f15400a, activity, (ApiException) obj);
            }
        }, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit delShare$lambda$11(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail deviceDetail, FragmentActivity activity, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        if (((DelShareResponse) new Gson().fromJson(it.getResp(), new TypeToken<DelShareResponse>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4$delShare$lambda$11$$inlined$fromJson$1
        }.getType())).getCode() == 200) {
            ((OtherDeviceTabV4ViewModel) this$0.getMViewModel()).removeItem(deviceDetail.getDid());
        } else {
            this$0.dismissDialog();
            String string = activity.getString(yzi.F0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(activity, string);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delShare$lambda$12(OtherDeviceTabFragmentV4 this$0, FragmentActivity activity, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        String string = activity.getString(yzi.F0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ToastExtKt.toastShort(activity, string);
        return Unit.INSTANCE;
    }

    private final void doUnbind(EcoDeviceDetail it, final FragmentActivity activity, EcoDeviceDetail deviceDetail) {
        EcoDeviceInfo deviceInfo;
        if (deviceDetail.getDeviceType() == 4) {
            Logger.i(TAG, "doUnbind deviceType == 4");
            unbindEarPhone(deviceDetail.getDid());
            return;
        }
        if (!NetworkExtKt.isNetworkAvailable()) {
            if (activity != null) {
                String string = getResources().getString(yzi.common_hint_network_unavailable);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ToastExtKt.toastShort(activity, string);
                return;
            }
            return;
        }
        final String did = it.getDid();
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (deviceDetail.getIsPendingPairing()) {
            delShare(activity, deviceDetail);
            return;
        }
        if (ecoDeviceModel != null && (deviceInfo = ecoDeviceModel.getDeviceInfo()) != null && !deviceInfo.isOwner()) {
            unbindMember(ecoDeviceModel, activity, did);
        } else if (ecoDeviceModel == null || !ecoDeviceModel.getIsDeviceConnected()) {
            unbind(did);
        } else {
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).restoreFactory(did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.doUnbind.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did2, int type, int code) {
                    Logger.i(OtherDeviceTabFragmentV4.TAG, "unbind error type:" + type + ",code" + code);
                    this.dismissDialog();
                    FragmentActivity fragmentActivity = activity;
                    if (fragmentActivity != null) {
                        String string2 = this.getString(yzi.F0);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        ToastExtKt.toastShort(fragmentActivity, string2);
                    }
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did2, int type, EcoSyncResult result) {
                    Logger.i(OtherDeviceTabFragmentV4.TAG, "unbind success" + (result != null ? result.getPacket() : null));
                    EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).disconnectDevice(did);
                    this.unbind(did);
                }
            });
        }
    }

    private final int getBloodSugar() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: jdh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(OtherDeviceTabFragmentV4.getBloodSugar$lambda$21((WearableDeviceModel) obj));
            }
        });
        return (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBloodSugar$lambda$21(WearableDeviceModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BloodSugarExtKt.isBloodSugar(it);
    }

    private final void lostDevice(final WearableDeviceModel deviceModel) {
        CommonDialog<?> commonDialog = this.mLostDeviceDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("lostEarPhone").setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.m, DeviceModelExtKt.getName(deviceModel))).setNegativeText(yzi.d0).setPositiveText(yzi.l).setCancelable(false).setCanceledOnBackPressed(false).create();
            this.mLostDeviceDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.lostDevice.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    OtherDeviceTabFragmentV4.this.mLostDeviceDialog = null;
                    if (which == -2) {
                        OtherDeviceTabFragmentV4.this.unbindEarPhone(deviceModel.getDid());
                    } else {
                        if (which != -1) {
                            return;
                        }
                        OtherDeviceTabFragmentV4.this.mRebindRetryCount = 0;
                        OtherDeviceTabFragmentV4.this.rebindDevice(deviceModel);
                    }
                }
            }).showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail deviceDetail, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (deviceDetail.getIsEco()) {
            if (deviceDetail.getIsPendingPairing()) {
                this$0.showPairGuideConfirmDialog(deviceDetail);
                return Unit.INSTANCE;
            }
            Application applicationContext = XMPassportSettings.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity$default(applicationContext, deviceDetail.getDid(), deviceDetail.getMac(), false, 4, null);
        } else if (deviceDetail.getDeviceType() == 2) {
            BloodSugarManager bloodSugarExtKt = BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE);
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            bloodSugarExtKt.goBloodSugarDevice(fragmentActivityRequireActivity);
        } else if (deviceDetail.getDeviceType() == 3) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(deviceDetail.getDid());
        } else if (deviceDetail.getDeviceType() == 4) {
            Logger.i(TAG, "connectStatus == " + deviceDetail.getConnectStatus());
            if (deviceDetail.getConnectStatus() == 3 || deviceDetail.getConnectStatus() == 7 || deviceDetail.getConnectStatus() == 6) {
                Application application = ApplicationExtKt.getApplication();
                EcoViewHelper ecoViewHelper = EcoViewHelper.INSTANCE;
                if (MarketUtil.checkAppInstalled(application, ecoViewHelper.getEarPhoneAppPackage())) {
                    FragmentManager childFragmentManager = this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    ecoViewHelper.openEarPhone(childFragmentManager, deviceDetail);
                } else {
                    FragmentManager childFragmentManager2 = this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                    ecoViewHelper.openEarPhoneOnMarket(childFragmentManager2);
                }
            } else {
                ToastUtil.INSTANCE.showToast(yzi.s0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(OtherDeviceTabFragmentV4 this$0, ConnectStatus connectStatus) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInvalid()) {
            return Unit.INSTANCE;
        }
        if (connectStatus.getCode() == 2005) {
            this$0.lostDevice(connectStatus.getDeviceModel());
        } else {
            Logger.i(TAG, "connectDevice bleReconnect code:" + connectStatus.getCode());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$7(final OtherDeviceTabFragmentV4 this$0, final EcoDeviceDetail deviceDetail, int i, View itemView) {
        final FragmentActivity activity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (Intrinsics.areEqual(deviceDetail.getDid(), OtherDeviceTabV4ViewModel.EMPTY_DID) || Intrinsics.areEqual(deviceDetail.getDid(), OtherDeviceTabV4ViewModel.ADD_NEW_DID) || (activity = this$0.getActivity()) == null) {
            return true;
        }
        if (deviceDetail.getIsEco()) {
            EcoViewHelper.INSTANCE.showUnbindWindow(activity, itemView, deviceDetail, new Function0() { // from class: zch
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtherDeviceTabFragmentV4.onViewCreated$lambda$7$lambda$6$lambda$3(deviceDetail, this$0, activity);
                }
            });
            return true;
        }
        if (deviceDetail.getDeviceType() == 3) {
            RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE).showDeleteDeviceDialog(new WeakReference<>(activity), null, deviceDetail.getDid(), deviceDetail.getProductId(), new Function1() { // from class: adh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OtherDeviceTabFragmentV4.onViewCreated$lambda$7$lambda$6$lambda$4(this.f901a, ((Boolean) obj).booleanValue());
                }
            });
            return true;
        }
        if (deviceDetail.getDeviceType() != 4) {
            return true;
        }
        Logger.i(TAG, "setOnItemLongClickListener deviceType == 4");
        EcoViewHelper ecoViewHelper = EcoViewHelper.INSTANCE;
        FragmentManager childFragmentManager = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ecoViewHelper.confirmUnboundEarPhone(childFragmentManager, deviceDetail, new Function0() { // from class: bdh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$7$lambda$6$lambda$5(this.f4087a, deviceDetail, activity);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$3(final EcoDeviceDetail deviceDetail, final OtherDeviceTabFragmentV4 this$0, final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (deviceDetail.getIsPendingPairing()) {
            EcoViewHelper ecoViewHelper = EcoViewHelper.INSTANCE;
            FragmentManager childFragmentManager = this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ecoViewHelper.showDelDeviceSharedDialog(childFragmentManager, new Function0() { // from class: xch
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtherDeviceTabFragmentV4.onViewCreated$lambda$7$lambda$6$lambda$3$lambda$1(this.f38970a, deviceDetail, activity);
                }
            });
            return Unit.INSTANCE;
        }
        EcoViewHelper ecoViewHelper2 = EcoViewHelper.INSTANCE;
        FragmentManager childFragmentManager2 = this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        ecoViewHelper2.confirmUnbound(childFragmentManager2, deviceDetail, new Function0() { // from class: ych
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$7$lambda$6$lambda$3$lambda$2(this.f40039a, deviceDetail, activity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$3$lambda$1(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail deviceDetail, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.doUnbind(deviceDetail, activity, deviceDetail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$3$lambda$2(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail deviceDetail, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.doUnbind(deviceDetail, activity, deviceDetail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$4(OtherDeviceTabFragmentV4 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ((OtherDeviceTabV4ViewModel) this$0.getMViewModel()).updateDeviceItems();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail deviceDetail, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceDetail, "$deviceDetail");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.doUnbind(deviceDetail, activity, deviceDetail);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$8(OtherDeviceTabFragmentV4 this$0, EcoDeviceDetail tabContentItem, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tabContentItem, "tabContentItem");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Logger.i(TAG, "setOnChildClickListener, tabContentItem:" + tabContentItem + ", position:" + i + ", itemView:" + itemView);
        if (itemView.getId() == ari.u) {
            Logger.i(TAG, "click device,did is " + tabContentItem.getDid() + ",status is " + tabContentItem.getConnectStatus());
            int connectStatus = tabContentItem.getConnectStatus();
            if (connectStatus == 1) {
                ((OtherDeviceTabV4ViewModel) this$0.getMViewModel()).preConnectThirdPartyDeviceByDid(tabContentItem.getDid());
            } else if (connectStatus == 7 || connectStatus == 3) {
                OtherDeviceTabV4ViewModel.syncWearDevice$default((OtherDeviceTabV4ViewModel) this$0.getMViewModel(), tabContentItem.getDid(), false, 2, null);
            } else if (connectStatus == 4) {
                ((OtherDeviceTabV4ViewModel) this$0.getMViewModel()).preConnectThirdPartyDeviceByDid(tabContentItem.getDid());
            } else if (connectStatus == 5) {
                OtherDeviceTabV4ViewModel.syncWearDevice$default((OtherDeviceTabV4ViewModel) this$0.getMViewModel(), tabContentItem.getDid(), false, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(OtherDeviceTabFragmentV4 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.requestPermissionForConnect();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void rebindDevice(final WearableDeviceModel deviceModel) {
        Logger.i(TAG, "rebindDevice");
        ((OtherDeviceTabV4ViewModel) getMViewModel()).bindDevice(deviceModel.getDeviceInfo(), new a.AbstractBinderC0419a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.rebindDevice.1
            @Override // com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "dismissPairingCode");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int status) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onBindFailure");
                OtherDeviceTabFragmentV4 otherDeviceTabFragmentV4 = OtherDeviceTabFragmentV4.this;
                otherDeviceTabFragmentV4.showRebindFail(deviceModel, otherDeviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String did) {
                Context context = OtherDeviceTabFragmentV4.this.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, yzi.o);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int status) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onConnectFailure");
                OtherDeviceTabFragmentV4 otherDeviceTabFragmentV4 = OtherDeviceTabFragmentV4.this;
                otherDeviceTabFragmentV4.showRebindFail(deviceModel, otherDeviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectSuccess() {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onConnectSuccess");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int status) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onPairingFailure");
                OtherDeviceTabFragmentV4 otherDeviceTabFragmentV4 = OtherDeviceTabFragmentV4.this;
                otherDeviceTabFragmentV4.showRebindFail(deviceModel, otherDeviceTabFragmentV4.mRebindRetryCount < 5);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingSuccess(byte[] key) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onPairingSuccess");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceSuccess() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String code, e callback) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "showPairingCode code:" + code);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissionForConnect() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            BluetoothPermissionUtil.INSTANCE.showBluetoothSyncDataDialogIfNeed(activity, new Function1() { // from class: sch
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OtherDeviceTabFragmentV4.requestPermissionForConnect$lambda$20$lambda$19(activity, this, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$20$lambda$19(FragmentActivity it, final OtherDeviceTabFragmentV4 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            DeviceManagerExtKt.getInstance(BluetoothPermissionTool.INSTANCE).requestBluetoothIfNeed(it, false, new Function1() { // from class: fdh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return OtherDeviceTabFragmentV4.requestPermissionForConnect$lambda$20$lambda$19$lambda$18(this.f17678a, (MultiplePermissionsBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$20$lambda$19$lambda$18(final OtherDeviceTabFragmentV4 this$0, MultiplePermissionsBuilder requestBluetoothIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestBluetoothIfNeed, "$this$requestBluetoothIfNeed");
        requestBluetoothIfNeed.allGranted(new Function0() { // from class: gdh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtherDeviceTabFragmentV4.requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$14(this.f18857a);
            }
        });
        requestBluetoothIfNeed.denied(new Function1() { // from class: hdh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$17(this.f19953a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$14(OtherDeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((OtherDeviceTabV4ViewModel) this$0.getMViewModel()).updateDeviceItems();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$17(final OtherDeviceTabFragmentV4 this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        EcoDevicePreference.INSTANCE.setLAST_REQUEST_PERMISSION_TIME(System.currentTimeMillis());
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), (String) it.get(0), activity, it, null, null, new Function0() { // from class: edh
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtherDeviceTabFragmentV4.requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(this.f16526a);
                }
            }, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermissionForConnect$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(OtherDeviceTabFragmentV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bluetoothPermissionDialog(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rnDeviceChangeListener$lambda$13(OtherDeviceTabFragmentV4 this$0, DeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onRNDeviceChange " + deviceModel);
        AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$rnDeviceChangeListener$1$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void showPairGuideConfirmDialog(final EcoDeviceDetail deviceDetail) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(fui.f18254k, (ViewGroup) null);
        ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
        View viewFindViewById = viewInflate.findViewById(ari.m);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        electronicScaleManagerExtKt.loadImageFromNet((ImageView) viewFindViewById, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1, ElectronicScaleManagerExtKt.IMAGE_ELECTRONIC_SCALE_PAIR_GUIDE_1_NIGHT);
        CommonDialog commonDialogCreate = new CommonDialog.c("pair_guide_dialog").setDialogDescription(yzi.G0).setPositiveText(yzi.z).setDialogTitle(yzi.A0).setNegativeText(yzi.i).setCustomView(viewInflate).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.showPairGuideConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Context context;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1 && (context = OtherDeviceTabFragmentV4.this.getContext()) != null) {
                    String mac = deviceDetail.getMac();
                    String name = deviceDetail.getName();
                    String shareId = deviceDetail.getShareId();
                    Intrinsics.checkNotNull(shareId);
                    String userId = deviceDetail.getUserId();
                    Intrinsics.checkNotNull(userId);
                    ElectronicScaleManagerExtKt.launchToElectronicPairGuideActivity(context, mac, name, shareId, userId, deviceDetail.getDid(), deviceDetail.getModel());
                }
            }
        });
        FragmentActivity activity = getActivity();
        commonDialogCreate.showIfNeed(activity != null ? activity.getSupportFragmentManager() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRebindFail(final WearableDeviceModel deviceModel, boolean retry) {
        if (isInvalid()) {
            return;
        }
        CommonDialog<?> commonDialog = this.mRebindDialog;
        if (commonDialog != null && commonDialog.isShowing()) {
            CommonDialog<?> commonDialog2 = this.mRebindDialog;
            Intrinsics.checkNotNull(commonDialog2);
            commonDialog2.dismiss();
        }
        CommonDialog.c cVar = new CommonDialog.c("RebindEarPhoneFail");
        if (retry) {
            cVar.setDialogTitle(yzi.c0).setDialogDescription(yzi.b0).setNegativeText(yzi.i).setPositiveText(yzi.e0);
        } else {
            cVar.setDialogDescription(yzi.a0).setNeutralText(yzi.common_known);
        }
        CommonDialog<?> commonDialogCreate = cVar.create();
        this.mRebindDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.showRebindFail.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).disconnectDevice(deviceModel.getDid());
                    return;
                }
                OtherDeviceTabFragmentV4.this.mRebindRetryCount++;
                OtherDeviceTabFragmentV4.this.rebindDevice(deviceModel);
            }
        }).showIfNeed(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void unbind(String did) {
        ((OtherDeviceTabV4ViewModel) getMViewModel()).unbindDevice(did, new l.a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.unbind.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onFail()");
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$unbind$1$onFail$1(OtherDeviceTabFragmentV4.this, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "onSuccess()");
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$unbind$1$onSuccess$1(OtherDeviceTabFragmentV4.this, null), 1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void unbindEarPhone(String did) {
        Logger.i(TAG, "unbindEarPhone");
        ((OtherDeviceTabV4ViewModel) getMViewModel()).unbindEarPhoneDevice(did, new l.a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.unbindEarPhone.1
            @Override // com.xiaomi.fitness.device.manager.l
            public void onFail(int code) {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "unbindEarPhone onFail");
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$unbindEarPhone$1$onFail$1(OtherDeviceTabFragmentV4.this, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.manager.l
            public void onSuccess() {
                Logger.i(OtherDeviceTabFragmentV4.TAG, "unbindEarPhone onSuccess");
                AnyExtKt.main$default(null, new OtherDeviceTabFragmentV4$unbindEarPhone$1$onSuccess$1(OtherDeviceTabFragmentV4.this, null), 1, null);
            }
        });
    }

    private final void unbindMember(EcoDeviceModel deviceModel, final FragmentActivity activity, String did) {
        if (deviceModel == null || deviceModel.getIsDeviceConnected()) {
            PageState.DefaultImpls.showLoading$default(this, yzi.D0, false, 2, null);
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).delSharedMember(Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabFragmentV4.unbindMember.1
                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onError(String did2, int type, int code) {
                    Logger.i(OtherDeviceTabFragmentV4.TAG, "ScaleCmdHelper.delSharedMember error type:" + type + ",code" + code);
                    OtherDeviceTabFragmentV4.this.dismissDialog();
                    FragmentActivity fragmentActivity = activity;
                    String string = fragmentActivity.getString(yzi.F0);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    ToastExtKt.toastShort(fragmentActivity, string);
                }

                @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
                public void onSuccess(String did2, int type, EcoSyncResult result) {
                    Logger.i(OtherDeviceTabFragmentV4.TAG, "ScaleCmdHelper.delSharedMember success" + (result != null ? result.getPacket() : null));
                    EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
                    Intrinsics.checkNotNull(did2);
                    ecoDeviceManagerExtKt.disconnectDevice(did2);
                    OtherDeviceTabFragmentV4.this.unbind(did2);
                }
            });
        } else {
            EcoDialogHelper ecoShareDialogExtKt = EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE);
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
            ecoShareDialogExtKt.showConnectDialogForUnbindMember((BaseActivity) activity);
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    public int deviceCount() {
        int size;
        int size2 = 0;
        try {
            Iterable deviceModels = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModels();
            ArrayList arrayList = new ArrayList();
            for (Object obj : deviceModels) {
                if (ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(DeviceModelExtKt.getModel((RNDeviceModel) obj)) != null) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        } catch (Exception e) {
            Logger.e(TAG, "deviceCount error", e);
            size = 0;
        }
        try {
            Iterable localDeviceModels = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalDeviceModels();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : localDeviceModels) {
                if (com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isEarPhone((WearableDeviceModel) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            size2 = arrayList2.size();
        } catch (Exception e2) {
            Logger.e(TAG, "localDeviceCount error", e2);
        }
        Logger.i(TAG, "miJiaDeviceSize:" + size + ",shouldShowLocalDeviceSize:" + size2);
        return this.mEcoDeviceManager.getEcoDeviceSize() + size + size2 + getBloodSugar();
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    public int index() {
        return 4;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).removeDeviceChangeListener(this.rnDeviceChangeListener);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).removeDeviceStatusListener(this.onEcoDeviceStatusListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OtherDeviceTabV4ViewModel.updateDeviceList$default((OtherDeviceTabV4ViewModel) getMViewModel(), false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).addDeviceChangeListener(this.rnDeviceChangeListener);
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).addDeviceStatusListener(this.onEcoDeviceStatusListener);
        ((OtherDeviceTabV4ViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: kdh
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$0(this.f23754a, (EcoDeviceDetail) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        ((OtherDeviceTabV4ViewModel) getMViewModel()).getAdapter().setOnItemLongClickListener(new Function3() { // from class: tch
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(OtherDeviceTabFragmentV4.onViewCreated$lambda$7(this.f34567a, (EcoDeviceDetail) obj, ((Integer) obj2).intValue(), (View) obj3));
            }
        });
        ((OtherDeviceTabV4ViewModel) getMViewModel()).getAdapter().setOnChildClickListener(new Function3() { // from class: uch
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$8(this.f35621a, (EcoDeviceDetail) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        clearLiveData();
        ((OtherDeviceTabV4ViewModel) getMViewModel()).getShowConnectPermission().observe(getViewLifecycleOwner(), new OtherDeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vch
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$9(this.f36744a, (Boolean) obj);
            }
        }));
        ((OtherDeviceTabV4ViewModel) getMViewModel()).getBleReconnect().observe(getViewLifecycleOwner(), new OtherDeviceTabFragmentV4$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wch
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OtherDeviceTabFragmentV4.onViewCreated$lambda$10(this.f37842a, (ConnectStatus) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.device.manager.export.DeviceTabInfoProvider
    @NotNull
    public String tabName(int type) {
        String string = ApplicationExtKt.getApplication().getString(yzi.S);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
