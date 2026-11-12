package com.xiaomi.fitness.watch.face.debug.designer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDialog;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.im9;
import defpackage.ovi;
import defpackage.tv1;
import defpackage.zw8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001>B\u0007¢\u0006\u0004\b=\u0010*J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010%\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#H\u0002¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R#\u0010<\u001a\n 7*\u0004\u0018\u000106068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel;", "Lzw8;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "", "requestDeviceFaceCapability", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "", "Ljava/io/File;", "files", "", "readCapabilityJson", "([Ljava/io/File;)Ljava/lang/String;", "file", "", "parseHash", "(Ljava/io/File;)[B", "id", "license", "sign", "signLicense", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", FaceInfoBase.FACE_ID, "installBleFace", "", "code", "getPushErrorMsg", "(I)Ljava/lang/String;", "Lkotlin/Function2;", "openFile", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lkotlin/jvm/functions/Function2;)V", "zipPath", "did", "Lkotlin/Function1;", "basePath", "unzipFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "refactorFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "dismissProgressIfRebuild", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "deviceFaceCapability", "Ljava/lang/String;", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter;", "adapter", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerLogAdapter;", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "kotlin.jvm.PlatformType", "progressDialog$delegate", "Lkotlin/Lazy;", "getProgressDialog", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceDesignerFragment extends Hilt_FaceDesignerFragment<FaceDesignerViewModel, zw8> {
    private static final int BIN_ENCODE_SEGMENT_LENGTH = 131072;
    private static final int BIN_ID_OFFSET = 40;

    @NotNull
    private static final String DEVICE_TEST_CAPABILITY = "[\n    {\n        \"name\": \"protocol\",\n        \"type\": 1,\n        \"value\": [\n            \"1.8.16\"\n        ]\n    },\n    {\n        \"name\": \"resolution\",\n        \"type\": 1,\n        \"value\": [\n            \"XM01\"\n        ]\n    },\n    {\n        \"name\": \"region\",\n        \"type\": 1,\n        \"value\": [\n            \"CN\"\n        ]\n    },\n    {\n        \"name\": \"packet\",\n        \"type\": 1,\n        \"value\": [\n            \"BIN\"\n        ]\n    },\n    {\n        \"name\": \"image_compress\",\n        \"type\": 2,\n        \"value\": [\n            \"11000000000000000000000000000000\"\n        ]\n    },\n    {\n        \"name\": \"image_fmt\",\n        \"type\": 2,\n        \"value\": [\n            \"11000000011111111000000000000000,000000000000\"\n        ]\n    },\n    {\n        \"name\": \"data_source\",\n        \"type\": 2,\n        \"value\": [\n            \"11111111111111011111111111111100,00000000000000000011111000011111,11111110111111111111111111111100,00011000000000000011111111111111,10000011110000011110000001100000,000000000111000000000000000\"\n        ]\n    }\n]";

    @NotNull
    private static final String FACE_PROGRESS_DIALOG_TAG = "face_debug_dialog_tag";

    @NotNull
    private static final String FACE_TEST_CAPABILITY = "[\n    {\n        \"name\": \"protocol\",\n        \"type\": 1,\n        \"value\": [\n            \"1.8.16\"\n        ]\n    },\n    {\n        \"name\": \"resolution\",\n        \"type\": 1,\n        \"value\": [\n            \"XM01\"\n        ]\n    },\n    {\n        \"name\": \"region\",\n        \"type\": 1,\n        \"value\": [\n            \"CN\"\n        ]\n    },\n    {\n        \"name\": \"packet\",\n        \"type\": 1,\n        \"value\": [\n            \"BIN\"\n        ]\n    },\n    {\n        \"name\": \"image_compress\",\n        \"type\": 2,\n        \"value\": [\n            \"10000000000000000000000000000000\"\n        ]\n    },\n    {\n        \"name\": \"image_fmt\",\n        \"type\": 2,\n        \"value\": [\n            \"00000000000000001000000000000000,000000000000\"\n        ]\n    },\n    {\n        \"name\": \"data_source\",\n        \"type\": 2,\n        \"value\": [\n            \"01101101100000010000100100111100,00000000000000000010000000000000,00000000010000000010001000000000,00000000000000000000000000000000,00000011110000000000000000000000,000000000111000000000000000\"\n        ]\n    }\n]";

    @NotNull
    private static final String TAG = "FaceDesignerFragment";

    @NotNull
    private final FaceDesignerLogAdapter adapter;

    @NotNull
    private String deviceFaceCapability;

    /* JADX INFO: renamed from: progressDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDialog;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment$unzipFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment$unzipFile$1", f = "FaceDesignerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $basePath;
        final /* synthetic */ String $unzipPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super String, Unit> function1, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$basePath = function1;
            this.$unzipPath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDesignerFragment.this.new AnonymousClass1(this.$basePath, this.$unzipPath, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceDesignerFragment.this.hideLoading();
            this.$basePath.invoke2(this.$unzipPath);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceDesignerFragment() {
        super(ovi.c, tv1.d);
        this.deviceFaceCapability = "";
        this.adapter = new FaceDesignerLogAdapter();
        this.progressDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: to8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerFragment.progressDialog_delegate$lambda$0();
            }
        });
    }

    private final void dismissProgressIfRebuild() {
        Fragment fragmentL0 = getParentFragmentManager().l0(FACE_PROGRESS_DIALOG_TAG);
        FaceDialog faceDialog = fragmentL0 instanceof FaceDialog ? (FaceDialog) fragmentL0 : null;
        Logger.d(TAG, "cache: " + faceDialog);
        if (faceDialog != null) {
            faceDialog.setProgress(0);
            faceDialog.dismissAllowingStateLoss();
        }
    }

    private final FaceDialog getProgressDialog() {
        return (FaceDialog) this.progressDialog.getValue();
    }

    private final String getPushErrorMsg(int code) {
        if (code != 0) {
            return code != 1 ? "UNKNOWN_ERROR" : "INSTALL_FAILED";
        }
        return "VERIFY_FAILED";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void installBleFace(String faceId, final File file, String license, String sign) {
        ((FaceDesignerViewModel) getMViewModel()).prepareInstall(faceId, file.length(), license, sign, new Function3() { // from class: dp8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FaceDesignerFragment.installBleFace$lambda$10(this.f15782a, file, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (Integer) obj3);
            }
        });
    }

    public static /* synthetic */ void installBleFace$default(FaceDesignerFragment faceDesignerFragment, String str, File file, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        faceDesignerFragment.installBleFace(str, file, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit installBleFace$lambda$10(FaceDesignerFragment this$0, File file, boolean z, int i, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        Logger.i(TAG, "installBleFace: " + z + " " + i + " " + num);
        if (z) {
            ((FaceDesignerViewModel) this$0.getMViewModel()).sendWatchFace(file, num != null ? num.intValue() : 0);
            return Unit.INSTANCE;
        }
        this$0.adapter.append("授权失败，错误码: " + i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(FaceDesignerFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null || str.length() == 0) {
            this$0.adapter.append("设备能力集获取失败");
        } else {
            this$0.deviceFaceCapability = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(FaceDesignerFragment this$0, FaceDesignerViewModel.DesignerLicenseData designerLicenseData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (designerLicenseData.getResult() == null) {
            this$0.adapter.append("授权文件生成失败，请重试");
        } else {
            this$0.signLicense(designerLicenseData.getId(), designerLicenseData.getFile(), designerLicenseData.getResult().getLicense(), designerLicenseData.getResult().getSign());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(FaceDesignerFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.getProgressDialog().isShowing()) {
            this$0.getProgressDialog().showIfNeed(this$0.getParentFragmentManager());
        }
        FaceDialog progressDialog = this$0.getProgressDialog();
        Intrinsics.checkNotNull(num);
        progressDialog.setProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FaceDesignerFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 2)) {
            this$0.getProgressDialog().dismissAllowingStateLoss();
            this$0.adapter.success("推送成功");
        } else {
            this$0.getProgressDialog().dismissAllowingStateLoss();
            FaceDesignerLogAdapter faceDesignerLogAdapter = this$0.adapter;
            Intrinsics.checkNotNull(num);
            faceDesignerLogAdapter.append("推送失败，" + this$0.getPushErrorMsg(num.intValue()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(final FaceDesignerFragment this$0, WearableDeviceModel device, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        this$0.openFile(device, new Function2() { // from class: cp8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceDesignerFragment.onViewCreated$lambda$6$lambda$5(this.f14583a, (String) obj, (File) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$6$lambda$5(FaceDesignerFragment this$0, String faceId, File file) {
        File file2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        if (file == null) {
            this$0.adapter.append("解压文件失败，请直接使用编辑器导出的文件");
            return Unit.INSTANCE;
        }
        Logger.i(TAG, "unzip file: " + file.getAbsolutePath());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return Unit.INSTANCE;
        }
        if (((FaceDesignerViewModel) this$0.getMViewModel()).getMModel().getVerifyCapability().get()) {
            String capabilityJson = this$0.readCapabilityJson(fileArrListFiles);
            if (capabilityJson.length() == 0) {
                return Unit.INSTANCE;
            }
            if (!FaceCapabilityMatcher.INSTANCE.matchCapability(capabilityJson, this$0.deviceFaceCapability, this$0.adapter)) {
                this$0.adapter.append("能力集不匹配！！");
                return Unit.INSTANCE;
            }
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            file2 = null;
            if (i >= length) {
                break;
            }
            File file3 = fileArrListFiles[i];
            String name = file3.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt__StringsJVMKt.endsWith$default(name, ".bin", false, 2, null)) {
                file2 = file3;
                break;
            }
            i++;
        }
        if (file2 == null) {
            this$0.adapter.append("找不到bin文件！！");
            return Unit.INSTANCE;
        }
        File fileRefactorFile = this$0.refactorFile(file2, faceId);
        if (fileRefactorFile == null) {
            this$0.adapter.append("修改id失败！！");
            return Unit.INSTANCE;
        }
        if (((FaceDesignerViewModel) this$0.getMViewModel()).getMModel().getVerifySign().get()) {
            String strEncodeToString = Base64.encodeToString(this$0.parseHash(fileRefactorFile), 2);
            Logger.d(TAG, "parse base64: " + strEncodeToString);
            FaceDesignerViewModel faceDesignerViewModel = (FaceDesignerViewModel) this$0.getMViewModel();
            Intrinsics.checkNotNull(strEncodeToString);
            faceDesignerViewModel.requestLicense(faceId, fileRefactorFile, strEncodeToString, faceId);
        } else {
            installBleFace$default(this$0, faceId, fileRefactorFile, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$7(FaceDesignerFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FaceDesignerViewModel) this$0.getMViewModel()).getMModel().getVerifySign().set(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$8(FaceDesignerFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FaceDesignerViewModel) this$0.getMViewModel()).getMModel().getVerifyCapability().set(z);
    }

    private final void openFile(final WearableDeviceModel device, final Function2<? super String, ? super File, Unit> file) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        Intent intentCreateChooser = Intent.createChooser(intent, "选择zip文件");
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        startForActivityResult(intentCreateChooser, new Function2() { // from class: uo8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceDesignerFragment.openFile$lambda$11(this.f35964a, device, file, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit openFile$lambda$11(FaceDesignerFragment this$0, WearableDeviceModel device, Function2 file, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(device, "$device");
        Intrinsics.checkNotNullParameter(file, "$file");
        if (intent == null) {
            return Unit.INSTANCE;
        }
        String nextFaceId = ((FaceDesignerViewModel) this$0.getMViewModel()).getNextFaceId();
        String watchFaceZipPath = FaceManager.INSTANCE.getWatchFaceZipPath(device.getDid(), nextFaceId, "designer");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
        AnyExtKt.io$default(null, new FaceDesignerFragment$openFile$1$1(watchFaceZipPath, intent, this$0, device, nextFaceId, file, null), 1, null);
        return Unit.INSTANCE;
    }

    private final byte[] parseHash(File file) {
        byte[] bArr = new byte[32];
        ArrayList arrayList = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int length = (int) file.length();
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            int i = 0;
            if (length > 131072) {
                while (i < 131072) {
                    arrayList.add(Byte.valueOf(bArr2[i]));
                    i++;
                }
                for (int i2 = length - 131072; i2 < length; i2++) {
                    arrayList.add(Byte.valueOf(bArr2[i2]));
                }
            } else {
                while (i < length) {
                    byte b2 = bArr2[i];
                    arrayList.add(Byte.valueOf(b2));
                    arrayList.add(Byte.valueOf(b2));
                    i++;
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(CollectionsKt___CollectionsKt.toByteArray(arrayList));
            return messageDigest.digest();
        } catch (Exception e) {
            e.printStackTrace();
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDialog progressDialog_delegate$lambda$0() {
        return new FaceDialog.Builder(FACE_PROGRESS_DIALOG_TAG).create();
    }

    private final String readCapabilityJson(File[] files) {
        File file = null;
        for (File file2 : files) {
            if (Intrinsics.areEqual(file2.getName(), "capability.json")) {
                file = file2;
            }
        }
        String str = "";
        if (file == null || !file.exists()) {
            this.adapter.append("找不到能力集文件！！");
            return "";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    str = ((Object) str) + line;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "read capability fail: " + e);
            this.adapter.append("能力集文件读取失败！！");
        }
        return str;
    }

    private final File refactorFile(File file, String faceId) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            for (int i = 40; i < 52; i++) {
                bArr[i] = (byte) faceId.charAt(i - 40);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDeviceFaceCapability(WearableDeviceModel device) {
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(device);
        if (firmwareVersion != null && firmwareVersion.length() != 0) {
            ((FaceDesignerViewModel) getMViewModel()).requestFaceCapability(DeviceModelExtKt.getModel(device), DeviceModelExtKt.getFirmwareVersion(device));
        } else {
            this.adapter.append("固件版本获取失败，无法获取表盘能力集");
            finish();
        }
    }

    private final void signLicense(String id, File file, String license, String sign) {
        installBleFace(id, file, license, sign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void unzipFile(String zipPath, String did, String faceId, Function1<? super String, Unit> basePath) {
        String unzipPath = ((FaceDesignerViewModel) getMViewModel()).getUnzipPath(did, faceId, "designer");
        im9.T(zipPath, unzipPath);
        AnyExtKt.main$default(null, new AnonymousClass1(basePath, unzipPath, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle("表盘本地推送工具");
        setActionBarNormalTitleMode();
        dismissProgressIfRebuild();
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        ((zw8) getMBinding()).A.setAdapter(this.adapter);
        ((FaceDesignerViewModel) getMViewModel()).getDeviceFaceCapability().observe(getViewLifecycleOwner(), new FaceDesignerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vo8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDesignerFragment.onViewCreated$lambda$1(this.f37082a, (String) obj);
            }
        }));
        ((FaceDesignerViewModel) getMViewModel()).getFaceLicense().observe(getViewLifecycleOwner(), new FaceDesignerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wo8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDesignerFragment.onViewCreated$lambda$2(this.f38191a, (FaceDesignerViewModel.DesignerLicenseData) obj);
            }
        }));
        ((FaceDesignerViewModel) getMViewModel()).getInstallProgress().observe(getViewLifecycleOwner(), new FaceDesignerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xo8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDesignerFragment.onViewCreated$lambda$3(this.f39309a, (Integer) obj);
            }
        }));
        ((FaceDesignerViewModel) getMViewModel()).getInstallResult().observe(getViewLifecycleOwner(), new FaceDesignerFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yo8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDesignerFragment.onViewCreated$lambda$4(this.f40367a, (Integer) obj);
            }
        }));
        requestDeviceFaceCapability(wearableDeviceModel);
        ((zw8) getMBinding()).D.setEnable(AppUtil.INSTANCE.isDevChannel());
        ((zw8) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: zo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceDesignerFragment.onViewCreated$lambda$6(this.f41515a, wearableDeviceModel, view2);
            }
        });
        ((zw8) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: ap8
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FaceDesignerFragment.onViewCreated$lambda$7(this.f3320a, z, iSwitchButton);
            }
        });
        ((zw8) getMBinding()).C.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: bp8
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                FaceDesignerFragment.onViewCreated$lambda$8(this.f4445a, z, iSwitchButton);
            }
        });
    }
}
