package com.xiaomi.xms.wearable.ui.debug;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.extensions.DeviceModelExtKt;
import com.xiaomi.xms.wearable.ui.ThirdAppListFragment;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment;
import defpackage.av6;
import defpackage.dih;
import defpackage.eu6;
import defpackage.im9;
import defpackage.lg1;
import defpackage.psi;
import defpackage.wvi;
import defpackage.x1j;
import defpackage.xsr;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u0011*\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J)\u0010+\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00110/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/debug/ThirdAppDebugFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/xms/wearable/ui/debug/ThirdAppDebugViewModel;", "Lxsr;", "", "unInstallApp", "()Z", "", "third_app_file", "Landroid/content/Intent;", "data", "prepareInstall", "(Ljava/lang/String;Landroid/content/Intent;)Z", "Ljava/io/File;", "file", "", "segmentLength", "", "sendThirdAppFile", "(Ljava/io/File;I)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "sendRpkFile", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/io/File;I)V", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "statusInfo", "processStatusListener", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;)V", "removeListener", "()V", "model", "deviceNotConnected", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)Z", "openFile", "isPackageReady", "xmsFragmentThirdAppDebugBinding", "thirdAppDebugFragment", "showPkgNameDialog", "(Lxsr;Lcom/xiaomi/xms/wearable/ui/debug/ThirdAppDebugFragment;)V", "bindView", "(Lxsr;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", Constants.KEY_PACKAGE_NAME, "Ljava/lang/String;", "Lkotlin/Function1;", "mAppStatusListener", "Lkotlin/jvm/functions/Function1;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdAppDebugFragment extends BaseBindingFragment<ThirdAppDebugViewModel, xsr> {

    @NotNull
    private static final String THIRD_APP_FILE = "thirdapp.bin";
    public static final int sRequstCode = 10;

    @NotNull
    private final Function1<AppStatusInfo, Unit> mAppStatusListener = new Function1() { // from class: l9p
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ThirdAppDebugFragment.mAppStatusListener$lambda$5(this.f24809a, (AppStatusInfo) obj);
        }
    };

    @Nullable
    private String pkgName;

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment$sendThirdAppFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment$sendThirdAppFile$1", f = "ThirdAppDebugFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C35101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C35101(Continuation<? super C35101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThirdAppDebugFragment.this.new C35101(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ThirdAppDebugFragment.this.dismissDialogForce();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(ThirdAppDebugFragment this$0, xsr this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.showPkgNameDialog(this_bindView, this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(ThirdAppDebugFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isPackageReady()) {
            this$0.openFile();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(ThirdAppDebugFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isPackageReady()) {
            this$0.unInstallApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(ThirdAppDebugFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            dih.a().e(mActivity, new FragmentParams.b().e(ThirdAppListFragment.class).b());
        }
    }

    private final boolean deviceNotConnected(WearableDeviceModel model) {
        if (model != null && model.getIsDeviceConnected()) {
            return false;
        }
        ToastUtil.showShortToast("device is not connected");
        return true;
    }

    private final boolean isPackageReady() {
        if (!TextUtils.isEmpty(this.pkgName)) {
            return true;
        }
        ToastUtil.showShortToast("please input package name first");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mAppStatusListener$lambda$5(ThirdAppDebugFragment this$0, AppStatusInfo appStatusInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.processStatusListener(appStatusInfo);
        return Unit.INSTANCE;
    }

    private final void openFile() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        startActivityForResult(Intent.createChooser(intent, "选择第三方app"), 10);
    }

    private final boolean prepareInstall(String third_app_file, Intent data) {
        final String strD = im9.D(third_app_file);
        im9.y(strD);
        im9.u(third_app_file, data.getData());
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (deviceNotConnected(wearableDeviceModel)) {
            return true;
        }
        String str = this.pkgName;
        Intrinsics.checkNotNull(str);
        File file = new File(strD);
        PageState.DefaultImpls.showLoading$default(this, "预安装中", 0, false, 2, null);
        getMBinding().E.setText("预安装中");
        lg1.d("request third app success filePath = " + strD + " size = " + file.length());
        if (wearableDeviceModel == null) {
            return false;
        }
        DeviceModelExtKt.prepareInstallApp(wearableDeviceModel, str, 10, (int) file.length(), new eu6<Integer>() { // from class: com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment.prepareInstall.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$prepareInstall$1$onError$1(ThirdAppDebugFragment.this, errorCode, null), 1, null);
                lg1.d("prepareInstallApp onError errorCode = " + errorCode);
            }

            @Override // defpackage.eu6
            public void onResult(Integer result) {
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$prepareInstall$1$onResult$1(result, ThirdAppDebugFragment.this, strD, null), 1, null);
            }
        });
        return false;
    }

    private final void processStatusListener(AppStatusInfo statusInfo) {
        if (statusInfo != null) {
            AnyExtKt.main$default(null, new ThirdAppDebugFragment$processStatusListener$1$1(this, null), 1, null);
            if (statusInfo.getStatus() == 11) {
                ToastUtil.showShortToast(x1j.f38582k);
                removeListener();
            }
        }
    }

    private final void removeListener() {
        AppStatusManager instance = AppStatusManager.INSTANCE.getINSTANCE();
        String str = this.pkgName;
        Intrinsics.checkNotNull(str);
        instance.removeStatusListener(str, this.mAppStatusListener);
    }

    private final void sendRpkFile(WearableDeviceModel deviceModel, File file, final int segmentLength) {
        lg1.d(this.pkgName + " sendRpkFile " + file.getAbsolutePath());
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(deviceModel.getDid(), 4, 0, file.getAbsolutePath(), segmentLength, new SyncStateListener() { // from class: com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment.sendRpkFile.1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did, int code) {
                Intrinsics.checkNotNullParameter(did, "did");
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$sendRpkFile$1$onFinish$1(code, ThirdAppDebugFragment.this, null), 1, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did) {
                Intrinsics.checkNotNullParameter(did, "did");
                lg1.d(ThirdAppDebugFragment.this.pkgName + " sendRpkFile onStart");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did, int progress) {
                Intrinsics.checkNotNullParameter(did, "did");
                lg1.d("sendMassData -- sentCount = " + progress + ", totalCount = " + segmentLength);
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$sendRpkFile$1$onSyncing$1(ThirdAppDebugFragment.this, progress, segmentLength, null), 1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendThirdAppFile(File file, int segmentLength) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            sendRpkFile(wearableDeviceModel, file, segmentLength);
        } else {
            AnyExtKt.main$default(null, new C35101(null), 1, null);
        }
    }

    private final void showPkgNameDialog(final xsr xmsFragmentThirdAppDebugBinding, ThirdAppDebugFragment thirdAppDebugFragment) {
        View viewInflate = getLayoutInflater().inflate(wvi.j, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(psi.x);
        CommonDialog.c cVar = new CommonDialog.c("CardManagerFragment.delete.mi");
        cVar.setDialogTitle(new DialogParams.DialogDescriptionString("input package name"));
        cVar.setCustomView(viewInflate);
        cVar.setPositiveText(x1j.f38581b);
        cVar.setNegativeText(x1j.f38580a);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment.showPkgNameDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    String string = editText.getText().toString();
                    xmsFragmentThirdAppDebugBinding.D.setText(string);
                    this.pkgName = string;
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(thirdAppDebugFragment.getFragmentManager());
    }

    private final boolean unInstallApp() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (deviceNotConnected(wearableDeviceModel)) {
            return true;
        }
        Intrinsics.checkNotNull(wearableDeviceModel);
        final String did = wearableDeviceModel.getDid();
        WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
        String str = this.pkgName;
        Intrinsics.checkNotNull(str);
        WatchAppItemEntity watchApp = companion.getWatchApp(str, did);
        if (watchApp == null) {
            ToastUtil.showShortToast("未找到该应用签名信息， 请检查包名是否正确，以及该应用是否成功安装");
            return true;
        }
        byte[] fingerprint = watchApp.getFingerprint();
        String str2 = this.pkgName;
        Intrinsics.checkNotNull(str2);
        DeviceModelExtKt.uninstallApp(wearableDeviceModel, str2, fingerprint, new eu6<Unit>() { // from class: com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment.unInstallApp.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$unInstallApp$1$onError$1(errorCode, ThirdAppDebugFragment.this, null), 1, null);
            }

            @Override // defpackage.eu6
            public void onResult(Unit result) {
                AnyExtKt.main$default(null, new ThirdAppDebugFragment$unInstallApp$1$onResult$1(ThirdAppDebugFragment.this, did, null), 1, null);
            }
        });
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final xsr xsrVar) {
        Intrinsics.checkNotNullParameter(xsrVar, "<this>");
        setTitle("Third App Support");
        xsrVar.B.setOnClickListener(new View.OnClickListener() { // from class: m9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDebugFragment.bindView$lambda$0(this.f25924a, xsrVar, view);
            }
        });
        xsrVar.C.setOnClickListener(new View.OnClickListener() { // from class: n9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDebugFragment.bindView$lambda$1(this.f27690a, view);
            }
        });
        getMBinding().F.setOnClickListener(new View.OnClickListener() { // from class: o9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDebugFragment.bindView$lambda$2(this.f28904a, view);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: p9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdAppDebugFragment.bindView$lambda$4(this.f30154a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.f38408b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String encodedPath;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1 && data != null) {
            Uri data2 = data.getData();
            String strReplace$default = THIRD_APP_FILE;
            if (data2 != null && (encodedPath = data2.getEncodedPath()) != null && StringsKt__StringsJVMKt.endsWith$default(encodedPath, "rpk", false, 2, null)) {
                strReplace$default = StringsKt__StringsJVMKt.replace$default(THIRD_APP_FILE, TSMAuthContants.PARAM_CARD_BIN, "rpk", false, 4, (Object) null);
            }
            prepareInstall(strReplace$default, data);
        }
    }
}
