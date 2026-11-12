package com.xiaomi.fitness.watch.face.debug.designer;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceDesignerLicenseResult;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleImpl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV1Impl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV2Impl;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.s5r;
import defpackage.s7r;
import defpackage.uw8;
import defpackage.v5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\b\f*\u0001B\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u0017J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017J\u001e\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0017J&\u0010,\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0017JH\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00172\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u00172 \u00105\u001a\u001c\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u000108\u0012\u0004\u0012\u00020%06J\u0016\u0010?\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010@\u001a\u000208J\u0010\u0010D\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0017H\u0002J\b\u0010E\u001a\u00020%H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001c\u0010\u0019R!\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b*\u0010\u0019R!\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b:\u0010\u0019R!\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0010\u001a\u0004\b=\u0010\u0019R\u0010\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0004\n\u0002\u0010CR\u0014\u0010F\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerModel;", "<init>", "()V", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "faceInstallController", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBleImpl;", "mHandler", "Landroid/os/Handler;", "deviceFaceCapability", "Landroidx/lifecycle/MutableLiveData;", "", "getDeviceFaceCapability", "()Landroidx/lifecycle/MutableLiveData;", "deviceFaceCapability$delegate", "errorLog", "getErrorLog", "errorLog$delegate", "getNextFaceId", "getSplitUnzipPath", "did", FaceInfoBase.FACE_ID, "getUnzipPath", "hash", "requestFaceCapability", "", "model", "firmwareVersion", "faceLicense", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel$DesignerLicenseData;", "getFaceLicense", "faceLicense$delegate", "requestLicense", "file", "Ljava/io/File;", "id", "prepareInstall", MediaStoreUtil.MediaInfo.SIZE, "", "license", "sign", "callback", "Lkotlin/Function3;", "", "", "installProgress", "getInstallProgress", "installProgress$delegate", "installResult", "getInstallResult", "installResult$delegate", "sendWatchFace", "segmentLength", "installDataHandler", "com/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel$installDataHandler$1", "Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel$installDataHandler$1;", "setFace", "unregister", "supportZip", "getSupportZip", "()Z", "TAG", "getTAG", "()Ljava/lang/String;", "DesignerLicenseData", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceDesignerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDesignerViewModel.kt\ncom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1557#2:243\n1628#2,3:244\n774#2:247\n865#2,2:248\n1863#2,2:250\n*S KotlinDebug\n*F\n+ 1 FaceDesignerViewModel.kt\ncom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel\n*L\n54#1:243\n54#1:244,3\n54#1:247\n54#1:248,2\n57#1:250,2\n*E\n"})
public final class FaceDesignerViewModel extends BaseViewModel<FaceDesignerModel> {

    /* JADX INFO: renamed from: deviceFaceCapability$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFaceCapability;

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gp8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceDesignerViewModel.deviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: errorLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorLog;
    public FaceApiRequestV2 faceApiRequest;

    @NotNull
    private final FaceInstallBleImpl faceInstallController;

    /* JADX INFO: renamed from: faceLicense$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceLicense;

    @NotNull
    private final FaceDesignerViewModel$installDataHandler$1 installDataHandler;

    /* JADX INFO: renamed from: installProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installProgress;

    /* JADX INFO: renamed from: installResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installResult;

    @NotNull
    private final Handler mHandler;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel$DesignerLicenseData;", "", "id", "", "file", "Ljava/io/File;", "result", "Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "<init>", "(Ljava/lang/String;Ljava/io/File;Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;)V", "getId", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "getResult", "()Lcom/xiaomi/fitness/watch/face/data/FaceDesignerLicenseResult;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignerLicenseData {

        @NotNull
        private final File file;

        @NotNull
        private final String id;

        @Nullable
        private final FaceDesignerLicenseResult result;

        public DesignerLicenseData(@NotNull String id, @NotNull File file, @Nullable FaceDesignerLicenseResult faceDesignerLicenseResult) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file, "file");
            this.id = id;
            this.file = file;
            this.result = faceDesignerLicenseResult;
        }

        public static /* synthetic */ DesignerLicenseData copy$default(DesignerLicenseData designerLicenseData, String str, File file, FaceDesignerLicenseResult faceDesignerLicenseResult, int i, Object obj) {
            if ((i & 1) != 0) {
                str = designerLicenseData.id;
            }
            if ((i & 2) != 0) {
                file = designerLicenseData.file;
            }
            if ((i & 4) != 0) {
                faceDesignerLicenseResult = designerLicenseData.result;
            }
            return designerLicenseData.copy(str, file, faceDesignerLicenseResult);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final FaceDesignerLicenseResult getResult() {
            return this.result;
        }

        @NotNull
        public final DesignerLicenseData copy(@NotNull String id, @NotNull File file, @Nullable FaceDesignerLicenseResult result) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file, "file");
            return new DesignerLicenseData(id, file, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignerLicenseData)) {
                return false;
            }
            DesignerLicenseData designerLicenseData = (DesignerLicenseData) other;
            return Intrinsics.areEqual(this.id, designerLicenseData.id) && Intrinsics.areEqual(this.file, designerLicenseData.file) && Intrinsics.areEqual(this.result, designerLicenseData.result);
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final FaceDesignerLicenseResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.file.hashCode()) * 31;
            FaceDesignerLicenseResult faceDesignerLicenseResult = this.result;
            return iHashCode + (faceDesignerLicenseResult == null ? 0 : faceDesignerLicenseResult.hashCode());
        }

        @NotNull
        public String toString() {
            return "DesignerLicenseData(id=" + this.id + ", file=" + this.file + ", result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$requestFaceCapability$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$requestFaceCapability$1", f = "FaceDesignerViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ String $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$firmwareVersion = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceDesignerViewModel faceDesignerViewModel, String str) {
            faceDesignerViewModel.getDeviceFaceCapability().postValue(str);
            Logger.i(faceDesignerViewModel.getTAG(), "request device face capability success: " + str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceDesignerViewModel faceDesignerViewModel, ApiException apiException) {
            faceDesignerViewModel.getDeviceFaceCapability().postValue(null);
            Logger.i(faceDesignerViewModel.getTAG(), "request device face capability fail: " + apiException);
            faceDesignerViewModel.getErrorLog().postValue("请求设备能力集失败，错误原因： " + apiException.getErrorCode() + " " + apiException.getMessage());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDesignerViewModel.this.new AnonymousClass1(this.$model, this.$firmwareVersion, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequest = FaceDesignerViewModel.this.getFaceApiRequest();
                String str = this.$model;
                String str2 = this.$firmwareVersion;
                final FaceDesignerViewModel faceDesignerViewModel = FaceDesignerViewModel.this;
                Function1<? super String, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.debug.designer.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceDesignerViewModel.AnonymousClass1.invokeSuspend$lambda$0(faceDesignerViewModel, (String) obj2);
                    }
                };
                final FaceDesignerViewModel faceDesignerViewModel2 = FaceDesignerViewModel.this;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.debug.designer.c
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceDesignerViewModel.AnonymousClass1.invokeSuspend$lambda$1(faceDesignerViewModel2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (faceApiRequest.requestFaceCapability(str, str2, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$requestLicense$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$requestLicense$1", f = "FaceDesignerViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        final /* synthetic */ File $file;
        final /* synthetic */ String $hash;
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33651(String str, String str2, String str3, File file, Continuation<? super C33651> continuation) {
            super(2, continuation);
            this.$hash = str;
            this.$id = str2;
            this.$faceId = str3;
            this.$file = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceDesignerViewModel faceDesignerViewModel, String str, File file, FaceDesignerLicenseResult faceDesignerLicenseResult) {
            faceDesignerViewModel.getFaceLicense().postValue(new DesignerLicenseData(str, file, faceDesignerLicenseResult));
            Logger.i(faceDesignerViewModel.getTAG(), "request license success: " + faceDesignerLicenseResult);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceDesignerViewModel faceDesignerViewModel, String str, File file, ApiException apiException) {
            faceDesignerViewModel.getFaceLicense().postValue(new DesignerLicenseData(str, file, null));
            Logger.i(faceDesignerViewModel.getTAG(), "request license fail: " + apiException);
            faceDesignerViewModel.getErrorLog().postValue("请求签名失败，错误原因： " + apiException.getErrorCode() + " " + apiException.getMessage());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDesignerViewModel.this.new C33651(this.$hash, this.$id, this.$faceId, this.$file, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequest = FaceDesignerViewModel.this.getFaceApiRequest();
                String str = this.$hash;
                String str2 = this.$id;
                final FaceDesignerViewModel faceDesignerViewModel = FaceDesignerViewModel.this;
                final String str3 = this.$faceId;
                final File file = this.$file;
                Function1<? super FaceDesignerLicenseResult, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.debug.designer.d
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceDesignerViewModel.C33651.invokeSuspend$lambda$0(faceDesignerViewModel, str3, file, (FaceDesignerLicenseResult) obj2);
                    }
                };
                final FaceDesignerViewModel faceDesignerViewModel2 = FaceDesignerViewModel.this;
                final String str4 = this.$faceId;
                final File file2 = this.$file;
                Function1<? super ApiException, Unit> function2 = new Function1() { // from class: com.xiaomi.fitness.watch.face.debug.designer.e
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return FaceDesignerViewModel.C33651.invokeSuspend$lambda$1(faceDesignerViewModel2, str4, file2, (ApiException) obj2);
                    }
                };
                this.label = 1;
                if (faceApiRequest.requestLicense(str, str2, function1, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$sendWatchFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/debug/designer/FaceDesignerViewModel$sendWatchFace$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C33661 implements SyncStateListener {
        public C33661() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceDesignerViewModel this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.unregister();
            Logger.i(this$0.getTAG(), "sendWatchFace -- onFinish, receivePacket installDataHandler: time out");
            this$0.getErrorLog().postValue("安装失败，设备未回复安装结果");
            this$0.getInstallResult().postValue(255);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceDesignerViewModel.this.getTAG(), "sendWatchFace -- onFinish: " + code);
            FaceDesignerViewModel.this.unregister();
            if (code == 0) {
                Handler handler = FaceDesignerViewModel.this.mHandler;
                final FaceDesignerViewModel faceDesignerViewModel = FaceDesignerViewModel.this;
                handler.postDelayed(new Runnable() { // from class: mp8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FaceDesignerViewModel.C33661.onFinish$lambda$0(faceDesignerViewModel);
                    }
                }, 12000L);
                DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(4, FaceDesignerViewModel.this.installDataHandler);
                return;
            }
            FaceDesignerViewModel.this.getErrorLog().postValue("推送中断，错误码: " + code);
            FaceDesignerViewModel.this.getInstallResult().postValue(255);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceDesignerViewModel.this.getTAG(), "sendWatchFace -- progress: " + progress);
            FaceDesignerViewModel.this.getInstallProgress().postValue(Integer.valueOf(progress));
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$installDataHandler$1] */
    public FaceDesignerViewModel() {
        this.faceInstallController = getSupportZip() ? new FaceInstallBleV2Impl(getDeviceModel()) : new FaceInstallBleV1Impl(getDeviceModel());
        this.mHandler = new Handler(Looper.getMainLooper());
        this.deviceFaceCapability = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerViewModel.deviceFaceCapability_delegate$lambda$1();
            }
        });
        this.errorLog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ip8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerViewModel.errorLog_delegate$lambda$2();
            }
        });
        this.faceLicense = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerViewModel.faceLicense_delegate$lambda$6();
            }
        });
        this.installProgress = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerViewModel.installProgress_delegate$lambda$7();
            }
        });
        this.installResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lp8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDesignerViewModel.installResult_delegate$lambda$8();
            }
        });
        this.installDataHandler = new DataHandlerWrapper() { // from class: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel$installDataHandler$1
            @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
            public boolean handlePacket(String did, int type, s7r packet) {
                Intrinsics.checkNotNullParameter(did, "did");
                if (type != 4 || packet == null || packet.f != 5 || packet.G() == null || packet.G().s() == null) {
                    return false;
                }
                s5r s5rVarS = packet.G().s();
                Logger.i(this.this$0.getTAG(), "InstallDataHandler receivePacket receiver id = " + s5rVarS.c + "; code = " + s5rVarS.d);
                int i = s5rVarS.d;
                boolean z = i == 3 || i == 2;
                this.this$0.unregister();
                if (z) {
                    FaceDesignerViewModel faceDesignerViewModel = this.this$0;
                    String id = s5rVarS.c;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    faceDesignerViewModel.setFace(id);
                }
                this.this$0.getInstallResult().postValue(Integer.valueOf(i));
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deviceFaceCapability_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData errorLog_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData faceLicense_delegate$lambda$6() {
        return new MutableLiveData();
    }

    private final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    private final boolean getSupportZip() {
        String did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        return (deviceManagerExtKt.getDeviceCapability(did) & 4194304) == 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData installProgress_delegate$lambda$7() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData installResult_delegate$lambda$8() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFace(String id) {
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 1;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel.setFace.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FaceDesignerViewModel.this.getTAG(), "setFaceId error: code: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result != null) {
                    Logger.i(FaceDesignerViewModel.this.getTAG(), "setFaceId success");
                }
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregister() {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(4, this.installDataHandler);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @NotNull
    public final MutableLiveData<String> getDeviceFaceCapability() {
        return (MutableLiveData) this.deviceFaceCapability.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getErrorLog() {
        return (MutableLiveData) this.errorLog.getValue();
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequest() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequest;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<DesignerLicenseData> getFaceLicense() {
        return (MutableLiveData) this.faceLicense.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getInstallProgress() {
        return (MutableLiveData) this.installProgress.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getInstallResult() {
        return (MutableLiveData) this.installResult.getValue();
    }

    @NotNull
    public final String getNextFaceId() {
        int i;
        List<WatchFace> localFace = FaceManager.INSTANCE.getLocalFace();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localFace, 10));
        Iterator<T> it = localFace.iterator();
        while (it.hasNext()) {
            arrayList.add(((WatchFace) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (StringsKt__StringsJVMKt.startsWith$default((String) next, "L", false, 2, null)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = 1;
        try {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.removeRange((CharSequence) it3.next(), 0, 1).toString())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (i2 < 999999999 && arrayList3.contains(Integer.valueOf(i2))) {
            i2++;
        }
        String str = "";
        for (i = 0; i < 11 - String.valueOf(i2).length(); i++) {
            str = str + "0";
        }
        String str2 = "L" + (str + i2);
        Logger.i(getTAG(), "get next face id: " + str2);
        return str2;
    }

    @NotNull
    public final String getSplitUnzipPath(@NotNull String did, @NotNull String faceId) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        String strC = uw8.c();
        String str = File.separator;
        return strC + str + did + str + faceId + str;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceDesignerViewModel";
    }

    @NotNull
    public final String getUnzipPath(@NotNull String did, @NotNull String faceId, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return getSplitUnzipPath(did, faceId) + hash;
    }

    public final void prepareInstall(@NotNull String id, long size, @NotNull String license, @NotNull String sign, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(license, "license");
        Intrinsics.checkNotNullParameter(sign, "sign");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.faceInstallController.preInstall(id, null, 0L, size, true, license, sign, null, callback);
    }

    public final void requestFaceCapability(@NotNull String model, @Nullable String firmwareVersion) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(model, firmwareVersion, null), 3, null);
    }

    public final void requestLicense(@NotNull String faceId, @NotNull File file, @NotNull String hash, @NotNull String id) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33651(hash, id, faceId, file, null), 3, null);
    }

    public final void sendWatchFace(@NotNull File file, int segmentLength) {
        Intrinsics.checkNotNullParameter(file, "file");
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        deviceSyncExtKt.sendFile(deviceModel != null ? deviceModel.getDid() : null, 1, 0, file.getAbsolutePath(), segmentLength, new C33661());
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }
}
