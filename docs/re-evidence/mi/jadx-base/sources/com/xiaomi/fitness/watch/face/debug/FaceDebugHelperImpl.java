package com.xiaomi.fitness.watch.face.debug;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.debug.FaceDebugHelperImpl;
import com.xiaomi.fitness.watch.face.export.FaceDebugHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.tgc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J4\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0\u0013H\u0096@¢\u0006\u0002\u0010\u0015J4\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/FaceDebugHelperImpl;", "Lcom/xiaomi/fitness/watch/face/export/FaceDebugHelper;", "<init>", "()V", "faceApiRequestV2", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequestV2", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequestV2", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "gotoFaceFragment", "", "resizeFace", "resize", "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", "requestDownloadUrl", "id", "", "result", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doDownloadFace", "url", "filePath", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceDebugHelperImpl implements FaceDebugHelper {
    public FaceApiRequestV2 faceApiRequestV2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownloadUrl$lambda$0(Function2 result, FaceDownloadResultV2 it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        result.invoke(it, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownloadUrl$lambda$1(Function2 result, ApiException it) {
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        result.invoke(null, it.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceDebugHelper
    public void doDownloadFace(@NotNull String url, @NotNull String filePath, @NotNull final Function2<? super Integer, ? super String, Unit> progress) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(progress, "progress");
        FaceDownloadHelper.INSTANCE.downloadFile(url, filePath, new tgc() { // from class: com.xiaomi.fitness.watch.face.debug.FaceDebugHelperImpl.doDownloadFace.1
            @Override // defpackage.tgc
            public void onComplete() {
                progress.invoke(100, null);
            }

            @Override // defpackage.tgc
            public void onError(String errorMsg) {
                progress.invoke(0, errorMsg);
            }

            @Override // defpackage.tgc
            public void onProgress(int progress2) {
                progress.invoke(Integer.valueOf(progress2), null);
            }
        });
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequestV2() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequestV2;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequestV2");
        return null;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceDebugHelper
    public void gotoFaceFragment() {
        FaceHelper.DefaultImpls.gotoFacePage$default(FaceHelperExtKt.getInstance(FaceHelper.INSTANCE), ApplicationExtKt.getApplication(), null, 2, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceDebugHelper
    @Nullable
    public Object requestDownloadUrl(@NotNull String str, @NotNull final Function2<? super FaceDownloadResultV2, ? super String, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objRequestDownload;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return (wearableDeviceModel != null && (objRequestDownload = getFaceApiRequestV2().requestDownload(wearableDeviceModel.getDid(), DeviceModelExtKt.getModel(wearableDeviceModel), str, (24 & 8) != 0 ? false : false, (24 & 16) != 0 ? null : null, new Function1() { // from class: oo8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FaceDebugHelperImpl.requestDownloadUrl$lambda$0(function2, (FaceDownloadResultV2) obj);
            }
        }, new Function1() { // from class: po8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FaceDebugHelperImpl.requestDownloadUrl$lambda$1(function2, (ApiException) obj);
            }
        }, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objRequestDownload : Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.watch.face.export.FaceDebugHelper
    public void resizeFace(@Nullable Product.Size resize) {
        FaceIcon.setProperty(resize);
    }

    public final void setFaceApiRequestV2(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequestV2 = faceApiRequestV2;
    }
}
