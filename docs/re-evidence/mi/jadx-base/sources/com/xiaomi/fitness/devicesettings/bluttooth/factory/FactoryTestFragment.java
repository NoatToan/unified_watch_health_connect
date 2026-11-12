package com.xiaomi.fitness.devicesettings.bluttooth.factory;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import defpackage.av6;
import defpackage.eui;
import defpackage.im9;
import defpackage.s7r;
import defpackage.wzi;
import defpackage.x69;
import defpackage.ye6;
import defpackage.zqi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.EditText;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/factory/FactoryTestFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/factory/FactoryTestViewModel;", "Lye6;", "", "setBrightness", "()V", "openConfigFile", "", "factoryMode", "doFactoryMode", "(I)V", "dumpMediaLog", "dumpDeviceLog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FactoryTestFragment extends BaseBindingFragment<FactoryTestViewModel, ye6> {

    @NotNull
    private static final String TAG = "FactoryTestFragment";
    public static final int sRequestNFCConfig = 100;

    private final void doFactoryMode(int factoryMode) {
        PageState.DefaultImpls.showLoading$default(this, wzi.rf, false, 2, null);
        s7r s7rVar = new s7r();
        s7rVar.e = 13;
        s7rVar.f = 0;
        x69 x69Var = new x69();
        x69Var.s(factoryMode);
        s7rVar.R(x69Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment.doFactoryMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                AnyExtKt.main$default(null, new FactoryTestFragment$doFactoryMode$1$onError$1(FactoryTestFragment.this, did, code, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                AnyExtKt.main$default(null, new FactoryTestFragment$doFactoryMode$1$onSuccess$1(FactoryTestFragment.this, null), 1, null);
            }
        }, 0, 8, null);
    }

    private final void dumpDeviceLog() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showToast("请连接设备");
            return;
        }
        ToastUtil.showToast("开始拉取dump日志,请保持连接状态");
        s7r s7rVar = new s7r();
        s7rVar.e = 13;
        s7rVar.f = 2;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment.dumpDeviceLog.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ToastUtil.showToast("onError type=" + type + "**code=" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("dumpDeviceLog request send success", new Object[0]);
            }
        }, 0, 8, null);
    }

    private final void dumpMediaLog() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showToast("请连接设备");
            return;
        }
        ToastUtil.showToast("开始拉取Media日志,请保持连接状态");
        s7r s7rVar = new s7r();
        s7rVar.e = 13;
        s7rVar.f = 4;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment.dumpMediaLog.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ToastUtil.showToast("dumpMediaLog onError type=" + type + "**code=" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("dumpMediaLog request send success", new Object[0]);
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$10(FactoryTestFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.INSTANCE.showToast(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doFactoryMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doFactoryMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doFactoryMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doFactoryMode(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dumpDeviceLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dumpMediaLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            NfcManagerExtKt.getInstance(NfcManager.INSTANCE).openSXMCardReader(mActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openConfigFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(FactoryTestFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setBrightness();
    }

    private final void openConfigFile() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(Intent.createChooser(intent, "选择文件上传"), 100);
    }

    private final void setBrightness() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(eui.h3, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        final EditText editText = (EditText) viewInflate.findViewById(zqi.H2);
        new CommonDialog.c("").setDialogTitle(new DialogParams.DialogDescriptionString("SET BRIGHTNESS")).setCustomView(viewInflate).setPositiveText(wzi.g).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment.setBrightness.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    String strValueOf = String.valueOf(editText.getText());
                    Logger.i(FactoryTestFragment.TAG, "edit brightness: " + strValueOf);
                    if (strValueOf.length() == 0) {
                        return;
                    }
                    s7r s7rVar = new s7r();
                    s7rVar.e = 13;
                    s7rVar.f = 5;
                    x69 x69Var = new x69();
                    x69Var.r(Integer.parseInt(strValueOf));
                    s7rVar.R(x69Var);
                    DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                    final FactoryTestFragment factoryTestFragment = this;
                    DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.factory.FactoryTestFragment$setBrightness$1$onDialogClick$1
                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onError(String did, int type, int code) {
                            Logger.i("FactoryTestFragment", "set brightness fail: " + code);
                            Context context = factoryTestFragment.getContext();
                            if (context != null) {
                                ToastExtKt.toastShort(context, code == 1 ? wzi.Ra : wzi.common_set_error);
                            }
                        }

                        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                        public void onSuccess(String did, int type, SyncResult result) {
                            Logger.i("FactoryTestFragment", "set brightness success");
                            Context context = factoryTestFragment.getContext();
                            if (context != null) {
                                ToastExtKt.toastShort(context, wzi.common_set_success);
                            }
                        }
                    }, 0, 8, null);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == -1) {
            String strD = im9.D("nfc-config.json");
            Intrinsics.checkNotNullExpressionValue(strD, "getExternalFilesFile(...)");
            im9.y(strD);
            Intrinsics.checkNotNull(data);
            im9.u("nfc-config.json", data.getData());
            showLoading();
            ((FactoryTestViewModel) getMViewModel()).nfcConfig(strD, new Function1() { // from class: o79
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FactoryTestFragment.onActivityResult$lambda$10(this.f28813a, ((Integer) obj).intValue());
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMBinding().D.setOnClickListener(new View.OnClickListener() { // from class: p79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$0(this.f30081a, view2);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: q79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$1(this.f31194a, view2);
            }
        });
        getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: r79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$2(this.f32284a, view2);
            }
        });
        getMBinding().E.setOnClickListener(new View.OnClickListener() { // from class: s79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$3(this.f33368a, view2);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: t79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$4(this.f34406a, view2);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: u79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$5(this.f35489a, view2);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: v79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$7(this.f36584a, view2);
            }
        });
        getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: w79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$8(this.f37682a, view2);
            }
        });
        getMBinding().I.setOnClickListener(new View.OnClickListener() { // from class: x79
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FactoryTestFragment.onViewCreated$lambda$9(this.f38782a, view2);
            }
        });
    }
}
