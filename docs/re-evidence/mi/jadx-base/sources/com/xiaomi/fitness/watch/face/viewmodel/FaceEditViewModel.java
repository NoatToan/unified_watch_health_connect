package com.xiaomi.fitness.watch.face.viewmodel;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.typography.sfnttly.SfntTool;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.FaceImageForeground;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.edit.entity.DialWatchFace;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialEditDeviceHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.utils.DialXmlParser;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBeanKt;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.fitness.watch.face.model.FaceEditModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a6r;
import defpackage.o5r;
import defpackage.p5r;
import defpackage.q5r;
import defpackage.r5r;
import defpackage.s7r;
import defpackage.v5r;
import defpackage.w5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004jklmB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006J\"\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'J\u0018\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u0006J4\u0010/\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020#0'J^\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010;\u001a\u00020(2\b\b\u0002\u0010<\u001a\u00020(2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0>2\n\b\u0002\u0010@\u001a\u0004\u0018\u0001032\b\b\u0002\u0010A\u001a\u00020(J\u0006\u0010E\u001a\u00020#J\u0016\u0010K\u001a\u00020#2\u0006\u0010@\u001a\u0002032\u0006\u0010L\u001a\u00020\u0015J$\u0010W\u001a\u00020#2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u0015J6\u0010Z\u001a\u00020#2\u0006\u0010[\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010\u00062\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001d0>2\u0006\u0010]\u001a\u00020(H\u0086@¢\u0006\u0002\u0010^JQ\u0010_\u001a\u00020#2\b\u0010`\u001a\u0004\u0018\u00010\u00062\f\u0010X\u001a\b\u0012\u0004\u0012\u00020a0\u001c2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00152\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00150dH\u0002¢\u0006\u0002\u0010eJ\b\u0010f\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R!\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000e\u001a\u0004\b6\u0010\u001aR!\u0010B\u001a\b\u0012\u0004\u0012\u00020(0\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u000e\u001a\u0004\bC\u0010\u001aR\u0014\u0010F\u001a\b\u0018\u00010GR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u000e\u001a\u0004\bI\u0010\u001aR \u0010M\u001a\b\u0018\u00010NR\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR!\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\u000e\u001a\u0004\bU\u0010\u001aR\u0014\u0010g\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/watch/face/model/FaceEditModel;", "<init>", "()V", "unzipPath", "", "nameIdMap", "", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "sfntTool", "Lcom/google/typography/sfnttly/SfntTool;", "getSfntTool", "()Lcom/google/typography/sfnttly/SfntTool;", "sfntTool$delegate", "showProgress", "", "dialWatchFaceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/watch/face/edit/entity/DialWatchFace;", "getDialWatchFaceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "newImageList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "getNewImageList", "()Ljava/util/List;", "setNewImageList", "(Ljava/util/List;)V", "setFaceId", "", "id", "deleteFace", "result", "Lkotlin/Function1;", "", "requestDialWatchFace", "watchFace", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "filePath", "mHandler", "Landroid/os/Handler;", "cropFontFile", "fontName", "cropString", "success", "Ljava/io/File;", "editRet", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$EditResult;", "getEditRet", "editRet$delegate", "requestEdit", "dialWatchFace", Feature.WATCHFACE, "needOrderList", "deleteAllImages", "orderList", "", "imageList", "fontFile", "fontFileChange", "dismissDialogLiveData", "getDismissDialogLiveData", "dismissDialogLiveData$delegate", "dismissDialog", "fontFileDataHandler", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$FontDataHandler;", "fontTransfer", "getFontTransfer", "fontTransfer$delegate", "transferFontFile", "segmentLength", "imgDataHandler", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$ImgDataHandler;", "getImgDataHandler", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$ImgDataHandler;", "setImgDataHandler", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$ImgDataHandler;)V", "bgImgTransfer", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$BgImgTransferProgress;", "getBgImgTransfer", "bgImgTransfer$delegate", "transferImgList", "faceList", FaceInfoBase.FACE_ID, "savePhotosToDB", "photoId", "transferQueue", "photoFace", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendImgToDevice", "did", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "beanList", "transferIndex", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I[Ljava/lang/Integer;)V", "unRegisterPacket", "TAG", "getTAG", "()Ljava/lang/String;", "EditResult", "FontDataHandler", "ImgDataHandler", "BgImgTransferProgress", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n37#2:528\n36#2,3:529\n37#2:536\n36#2,3:537\n37#2:540\n36#2,3:541\n1557#3:532\n1628#3,3:533\n1863#3:544\n1755#3,3:545\n1864#3:548\n*S KotlinDebug\n*F\n+ 1 FaceEditViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel\n*L\n152#1:528\n152#1:529,3\n160#1:536\n160#1:537,3\n169#1:540\n169#1:541,3\n160#1:532\n160#1:533,3\n393#1:544\n394#1:545,3\n393#1:548\n*E\n"})
public final class FaceEditViewModel extends BaseViewModel<FaceEditModel> {

    @Nullable
    private FontDataHandler fontFileDataHandler;

    @Nullable
    private ImgDataHandler imgDataHandler;
    private int showProgress;

    @NotNull
    private String unzipPath = "";

    @NotNull
    private Map<String, String> nameIdMap = MapsKt__MapsKt.emptyMap();

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ew8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: sfntTool$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sfntTool = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fw8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.sfntTool_delegate$lambda$1();
        }
    });

    @NotNull
    private final MutableLiveData<DialWatchFace> dialWatchFaceLiveData = new MutableLiveData<>();

    @NotNull
    private List<FaceEditPhotoBean> newImageList = new ArrayList();

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: editRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy editRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gw8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.editRet_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: dismissDialogLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dismissDialogLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hw8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.dismissDialogLiveData_delegate$lambda$9();
        }
    });

    /* JADX INFO: renamed from: fontTransfer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fontTransfer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iw8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.fontTransfer_delegate$lambda$10();
        }
    });

    /* JADX INFO: renamed from: bgImgTransfer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bgImgTransfer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jw8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceEditViewModel.bgImgTransfer_delegate$lambda$11();
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$BgImgTransferProgress;", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "transferQueue", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "pushing", "", "<init>", "(ILjava/util/List;Z)V", "getProgress", "()I", "getTransferQueue", "()Ljava/util/List;", "getPushing", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BgImgTransferProgress {
        private final int progress;
        private final boolean pushing;

        @NotNull
        private final List<FaceEditPhotoBean> transferQueue;

        public BgImgTransferProgress(int i, @NotNull List<FaceEditPhotoBean> transferQueue, boolean z) {
            Intrinsics.checkNotNullParameter(transferQueue, "transferQueue");
            this.progress = i;
            this.transferQueue = transferQueue;
            this.pushing = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BgImgTransferProgress copy$default(BgImgTransferProgress bgImgTransferProgress, int i, List list, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bgImgTransferProgress.progress;
            }
            if ((i2 & 2) != 0) {
                list = bgImgTransferProgress.transferQueue;
            }
            if ((i2 & 4) != 0) {
                z = bgImgTransferProgress.pushing;
            }
            return bgImgTransferProgress.copy(i, list, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        @NotNull
        public final List<FaceEditPhotoBean> component2() {
            return this.transferQueue;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getPushing() {
            return this.pushing;
        }

        @NotNull
        public final BgImgTransferProgress copy(int progress, @NotNull List<FaceEditPhotoBean> transferQueue, boolean pushing) {
            Intrinsics.checkNotNullParameter(transferQueue, "transferQueue");
            return new BgImgTransferProgress(progress, transferQueue, pushing);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BgImgTransferProgress)) {
                return false;
            }
            BgImgTransferProgress bgImgTransferProgress = (BgImgTransferProgress) other;
            return this.progress == bgImgTransferProgress.progress && Intrinsics.areEqual(this.transferQueue, bgImgTransferProgress.transferQueue) && this.pushing == bgImgTransferProgress.pushing;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final boolean getPushing() {
            return this.pushing;
        }

        @NotNull
        public final List<FaceEditPhotoBean> getTransferQueue() {
            return this.transferQueue;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.progress) * 31) + this.transferQueue.hashCode()) * 31) + Boolean.hashCode(this.pushing);
        }

        @NotNull
        public String toString() {
            return "BgImgTransferProgress(progress=" + this.progress + ", transferQueue=" + this.transferQueue + ", pushing=" + this.pushing + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$EditResult;", "", "", "component1", "()I", "Lq5r;", "component2", "()Lq5r;", "code", "editResponse", "copy", "(ILq5r;)Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$EditResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Lq5r;", "getEditResponse", "<init>", "(ILq5r;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class EditResult {
        private final int code;

        @Nullable
        private final q5r editResponse;

        public EditResult(int i, @Nullable q5r q5rVar) {
            this.code = i;
            this.editResponse = q5rVar;
        }

        public static /* synthetic */ EditResult copy$default(EditResult editResult, int i, q5r q5rVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = editResult.code;
            }
            if ((i2 & 2) != 0) {
                q5rVar = editResult.editResponse;
            }
            return editResult.copy(i, q5rVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final q5r getEditResponse() {
            return this.editResponse;
        }

        @NotNull
        public final EditResult copy(int code, @Nullable q5r editResponse) {
            return new EditResult(code, editResponse);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditResult)) {
                return false;
            }
            EditResult editResult = (EditResult) other;
            return this.code == editResult.code && Intrinsics.areEqual(this.editResponse, editResult.editResponse);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final q5r getEditResponse() {
            return this.editResponse;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            q5r q5rVar = this.editResponse;
            return iHashCode + (q5rVar == null ? 0 : q5rVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "EditResult(code=" + this.code + ", editResponse=" + this.editResponse + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$FontDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "Ljava/io/File;", "file", "Ljava/io/File;", "<init>", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel;Ljava/io/File;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FontDataHandler extends DataHandlerWrapper {

        @NotNull
        private final File file;
        final /* synthetic */ FaceEditViewModel this$0;

        public FontDataHandler(@NotNull FaceEditViewModel faceEditViewModel, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.this$0 = faceEditViewModel;
            this.file = file;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (packet != null && type == 4 && packet.f == 13) {
                Logger.i(this.this$0.getTAG(), "receivePacket FontDataHandler");
                if (packet.G() != null && packet.G().r() != null) {
                    r5r r5rVarR = packet.G().r();
                    Logger.i(this.this$0.getTAG(), "FontDataHandler receivePacket receiver id = " + r5rVarR.d + "; code = " + r5rVarR.c);
                    if (!Intrinsics.areEqual(MD5Util.getFileMD5(this.file), r5rVarR.d)) {
                        this.this$0.unRegisterPacket();
                        this.this$0.getFontTransfer().postValue(255);
                        return true;
                    }
                    this.this$0.getFontTransfer().postValue(Integer.valueOf(r5rVarR.c == 0 ? 100 : 255));
                    this.this$0.unRegisterPacket();
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$ImgDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "photoId", "Ljava/lang/String;", "", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "faceList", "Ljava/util/List;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "beanList", "", "transferIndex", "[Ljava/lang/Integer;", "successCount", "I", "segmentLength", "<init>", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel;Ljava/lang/String;Ljava/util/List;Ljava/util/List;[Ljava/lang/Integer;II)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ImgDataHandler extends DataHandlerWrapper {

        @NotNull
        private final List<FaceEditPhotoBean> beanList;

        @NotNull
        private final List<WatchFaceImage> faceList;

        @NotNull
        private final String photoId;
        private final int segmentLength;
        private final int successCount;
        final /* synthetic */ FaceEditViewModel this$0;

        @NotNull
        private final Integer[] transferIndex;

        public ImgDataHandler(@NotNull FaceEditViewModel faceEditViewModel, @NotNull String photoId, @NotNull List<WatchFaceImage> faceList, @NotNull List<FaceEditPhotoBean> beanList, Integer[] transferIndex, int i, int i2) {
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            Intrinsics.checkNotNullParameter(faceList, "faceList");
            Intrinsics.checkNotNullParameter(beanList, "beanList");
            Intrinsics.checkNotNullParameter(transferIndex, "transferIndex");
            this.this$0 = faceEditViewModel;
            this.photoId = photoId;
            this.faceList = faceList;
            this.beanList = beanList;
            this.transferIndex = transferIndex;
            this.successCount = i;
            this.segmentLength = i2;
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
            Intrinsics.checkNotNullParameter(did, "did");
            if (type != 4 || packet == null || packet.f != 12) {
                return false;
            }
            Logger.i(this.this$0.getTAG(), "receivePacket ImgDataHandler");
            v5r v5rVarG = packet.G();
            if ((v5rVarG != null ? v5rVarG.o() : null) == null) {
                Logger.i(this.this$0.getTAG(), "bgImageResult == null");
                List<FaceEditPhotoBean> list = this.beanList;
                this.this$0.getBgImgTransfer().postValue(new BgImgTransferProgress(255, list.subList(this.successCount, list.size()), false));
                return false;
            }
            o5r o5rVarO = packet.G().o();
            Logger.i(this.this$0.getTAG(), "ImgDataHandler code: " + o5rVarO.c + " index: " + this.transferIndex[0]);
            if (Intrinsics.areEqual(this.photoId, o5rVarO.d)) {
                if (this.transferIndex[0].intValue() + 1 == this.faceList.size()) {
                    int i = o5rVarO.c;
                    this.this$0.getBgImgTransfer().postValue(new BgImgTransferProgress(i != 0 ? i : 100, new ArrayList(), false));
                } else if (o5rVarO.c != 0) {
                    List<FaceEditPhotoBean> list2 = this.beanList;
                    this.this$0.getBgImgTransfer().postValue(new BgImgTransferProgress(255, list2.subList(this.successCount, list2.size()), false));
                } else {
                    Integer[] numArr = this.transferIndex;
                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                    this.this$0.sendImgToDevice(did, this.faceList, this.beanList, this.photoId, this.segmentLength, this.transferIndex);
                    this.this$0.getBgImgTransfer().postValue(new BgImgTransferProgress((this.transferIndex[0].intValue() * 100) / this.faceList.size(), this.beanList.subList(this.transferIndex[0].intValue(), this.beanList.size()), false));
                }
                this.this$0.unRegisterPacket();
                return true;
            }
            Logger.i(this.this$0.getTAG(), "ImgDataHandler receiver id: " + o5rVarO.d + " reqId: " + this.photoId);
            this.this$0.unRegisterPacket();
            List<FaceEditPhotoBean> list3 = this.beanList;
            this.this$0.getBgImgTransfer().postValue(new BgImgTransferProgress(255, list3.subList(this.successCount, list3.size()), false));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$cropFontFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$cropFontFile$1", f = "FaceEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cropString;
        final /* synthetic */ String $fontName;
        final /* synthetic */ Function1<File, Unit> $success;
        final /* synthetic */ String $unzipPath;
        int label;
        final /* synthetic */ FaceEditViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$cropFontFile$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$cropFontFile$1$1", f = "FaceEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $cropPath;
            final /* synthetic */ boolean $result;
            final /* synthetic */ Function1<File, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C08191(Function1<? super File, Unit> function1, boolean z, String str, Continuation<? super C08191> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$result = z;
                this.$cropPath = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08191(this.$success, this.$result, this.$cropPath, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$success.invoke2(this.$result ? new File(this.$cropPath) : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, String str3, FaceEditViewModel faceEditViewModel, Function1<? super File, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$unzipPath = str;
            this.$fontName = str2;
            this.$cropString = str3;
            this.this$0 = faceEditViewModel;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$unzipPath, this.$fontName, this.$cropString, this.this$0, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            String dialResourceFilePath = dialFileUtils.getDialResourceFilePath(this.$unzipPath);
            String str = File.separator;
            String str2 = dialResourceFilePath + str + this.$fontName;
            String str3 = dialFileUtils.getDialResourceFilePath(this.$unzipPath) + str + this.$cropString + ".ttf";
            Logger.i(this.this$0.getTAG(), "cropFontFile name: " + str2 + " cropPath: " + str3);
            boolean zSubsetFontFile$default = SfntTool.subsetFontFile$default(this.this$0.getSfntTool(), new File(str2), this.$cropString, new File(str3), 0, 8, null);
            Logger.i(this.this$0.getTAG(), "cropFontFile name: " + str2 + " result: " + zSubsetFontFile$default);
            AnyExtKt.main$default(null, new C08191(this.$success, zSubsetFontFile$default, str3, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$requestDialWatchFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$requestDialWatchFace$1", f = "FaceEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filePath;
        final /* synthetic */ WatchFace $watchFace;
        int label;
        final /* synthetic */ FaceEditViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34171(String str, FaceEditViewModel faceEditViewModel, WatchFace watchFace, Continuation<? super C34171> continuation) {
            super(2, continuation);
            this.$filePath = str;
            this.this$0 = faceEditViewModel;
            this.$watchFace = watchFace;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34171(this.$filePath, this.this$0, this.$watchFace, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DialWatchFace dialXml = DialXmlParser.INSTANCE.parseDialXml(this.$filePath);
            this.this$0.unzipPath = this.$filePath;
            this.this$0.nameIdMap = DialFileUtils.INSTANCE.getNameToIdMap(this.$filePath);
            if (dialXml != null && this.$watchFace != null) {
                DialEditDeviceHelper.INSTANCE.updateEditEntityWithDeviceConfig(dialXml, this.this$0.nameIdMap, this.$watchFace);
                this.this$0.getDialWatchFaceLiveData().postValue(dialXml);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$sendImgToDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$sendImgToDevice$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFaceEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$sendImgToDevice$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,527:1\n1872#2,3:528\n*S KotlinDebug\n*F\n+ 1 FaceEditViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$sendImgToDevice$1\n*L\n464#1:528,3\n*E\n"})
    public static final class C34191 implements SyncStateListener {
        final /* synthetic */ List<FaceEditPhotoBean> $beanList;
        final /* synthetic */ String $faceId;
        final /* synthetic */ List<WatchFaceImage> $faceList;
        final /* synthetic */ int $segmentLength;
        final /* synthetic */ Integer[] $transferIndex;

        public C34191(List<WatchFaceImage> list, Integer[] numArr, List<FaceEditPhotoBean> list2, String str, int i) {
            this.$faceList = list;
            this.$transferIndex = numArr;
            this.$beanList = list2;
            this.$faceId = str;
            this.$segmentLength = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$1(FaceEditViewModel this$0, List enqueue, String faceId) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(enqueue, "$enqueue");
            Intrinsics.checkNotNullParameter(faceId, "$faceId");
            this$0.unRegisterPacket();
            this$0.getBgImgTransfer().postValue(new BgImgTransferProgress(-1, enqueue, false));
            Logger.i(this$0.getTAG(), "receivePacket ImgDataHandler: time out id = " + faceId);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0075  */
        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "sendWatchFaceBgImage onFinish: code = " + code);
            FaceEditViewModel.this.unRegisterPacket();
            String md5 = this.$faceList.get(this.$transferIndex[0].intValue()).getMd5();
            int i = 0;
            int i2 = 0;
            for (Object obj : this.$beanList) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                w5r.a watchFaceGroup = FaceEditPhotoBeanKt.toWatchFaceGroup((FaceEditPhotoBean) obj);
                w5r w5rVar = watchFaceGroup.e;
                if (Intrinsics.areEqual(w5rVar != null ? w5rVar.c : null, md5)) {
                    i2 = i;
                } else {
                    w5r w5rVar2 = watchFaceGroup.f;
                    if (Intrinsics.areEqual(w5rVar2 != null ? w5rVar2.c : null, md5)) {
                        i2 = i;
                    }
                }
                i = i3;
            }
            List<FaceEditPhotoBean> list = this.$beanList;
            final List<FaceEditPhotoBean> listSubList = list.subList(i2, list.size());
            if (code != 0) {
                FaceEditViewModel.this.getBgImgTransfer().postValue(new BgImgTransferProgress(255, listSubList, false));
            }
            Handler handler = FaceEditViewModel.this.mHandler;
            final FaceEditViewModel faceEditViewModel = FaceEditViewModel.this;
            final String str = this.$faceId;
            handler.postDelayed(new Runnable() { // from class: kw8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceEditViewModel.C34191.onFinish$lambda$1(faceEditViewModel, listSubList, str);
                }
            }, 15000L);
            FaceEditViewModel faceEditViewModel2 = FaceEditViewModel.this;
            faceEditViewModel2.setImgDataHandler(new ImgDataHandler(faceEditViewModel2, this.$faceId, this.$faceList, this.$beanList, this.$transferIndex, i2, this.$segmentLength));
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            ImgDataHandler imgDataHandler = FaceEditViewModel.this.getImgDataHandler();
            Intrinsics.checkNotNull(imgDataHandler);
            deviceSyncExtKt.addDataHandler(4, imgDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "transferToDevice start");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "do transferImgToDevice onSend: " + progress);
            int iMin = (int) Math.min(99.0f, ((float) (progress / this.$faceList.size())) + ((((float) this.$transferIndex[0].intValue()) * 100.0f) / ((float) this.$faceList.size())));
            if (iMin != FaceEditViewModel.this.showProgress) {
                FaceEditViewModel.this.showProgress = iMin;
                FaceEditViewModel.this.getBgImgTransfer().postValue(new BgImgTransferProgress(iMin, new ArrayList(), true));
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel$transferFontFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/watch/face/viewmodel/FaceEditViewModel$transferFontFile$1", "Lcom/xiaomi/fitness/device/contact/export/SyncStateListener;", LifecycleConstantKt.ON_START, "", "did", "", "onSyncing", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "onFinish", "code", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C34201 implements SyncStateListener {
        final /* synthetic */ File $fontFile;

        public C34201(File file) {
            this.$fontFile = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFinish$lambda$0(FaceEditViewModel this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.unRegisterPacket();
            this$0.getFontTransfer().postValue(-1);
            Logger.i(this$0.getTAG(), "receivePacket FontDataHandler: time out");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onFinish(String did, int code) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "transferFontFile onFinish code: " + code);
            FaceEditViewModel.this.unRegisterPacket();
            if (code != 0) {
                FaceEditViewModel.this.getFontTransfer().postValue(255);
            }
            Handler handler = FaceEditViewModel.this.mHandler;
            final FaceEditViewModel faceEditViewModel = FaceEditViewModel.this;
            handler.postDelayed(new Runnable() { // from class: lw8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceEditViewModel.C34201.onFinish$lambda$0(faceEditViewModel);
                }
            }, 15000L);
            FaceEditViewModel faceEditViewModel2 = FaceEditViewModel.this;
            faceEditViewModel2.fontFileDataHandler = new FontDataHandler(faceEditViewModel2, this.$fontFile);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            FontDataHandler fontDataHandler = FaceEditViewModel.this.fontFileDataHandler;
            Intrinsics.checkNotNull(fontDataHandler);
            deviceSyncExtKt.addDataHandler(4, fontDataHandler);
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onStart(String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "transferFontFile onStart");
        }

        @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
        public void onSyncing(String did, int progress) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(FaceEditViewModel.this.getTAG(), "transferFontFile onSend: " + progress);
            FaceEditViewModel.this.getFontTransfer().postValue(Integer.valueOf(Math.min(99, progress)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData bgImgTransfer_delegate$lambda$11() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData dismissDialogLiveData_delegate$lambda$9() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData editRet_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData fontTransfer_delegate$lambda$10() {
        return new MutableLiveData();
    }

    private final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SfntTool getSfntTool() {
        return (SfntTool) this.sfntTool.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendImgToDevice(String did, List<WatchFaceImage> faceList, List<FaceEditPhotoBean> beanList, String faceId, int segmentLength, Integer[] transferIndex) {
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, 3, 0, faceList.get(transferIndex[0].intValue()).getCropBinPath(), segmentLength, new C34191(faceList, transferIndex, beanList, faceId, segmentLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SfntTool sfntTool_delegate$lambda$1() {
        return new SfntTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unRegisterPacket() {
        this.mHandler.removeCallbacksAndMessages(null);
        if (this.imgDataHandler != null) {
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            ImgDataHandler imgDataHandler = this.imgDataHandler;
            Intrinsics.checkNotNull(imgDataHandler);
            deviceSyncExtKt.removeDataHandler(4, imgDataHandler);
        }
        if (this.fontFileDataHandler != null) {
            DeviceContact deviceSyncExtKt2 = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            FontDataHandler fontDataHandler = this.fontFileDataHandler;
            Intrinsics.checkNotNull(fontDataHandler);
            deviceSyncExtKt2.removeDataHandler(4, fontDataHandler);
        }
    }

    public final void cropFontFile(@NotNull String unzipPath, @NotNull String fontName, @NotNull String cropString, @NotNull Function1<? super File, Unit> success) {
        Intrinsics.checkNotNullParameter(unzipPath, "unzipPath");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        Intrinsics.checkNotNullParameter(cropString, "cropString");
        Intrinsics.checkNotNullParameter(success, "success");
        AnyExtKt.io$default(null, new AnonymousClass1(unzipPath, fontName, cropString, this, success, null), 1, null);
    }

    public final void deleteFace(@NotNull String id, @NotNull final Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i(getTAG(), "deleteFace: " + id);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 2;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel.deleteFace.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(this.getTAG(), "deleteFace fail: " + code);
                result.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result2) {
                s7r packet;
                v5r v5rVarG;
                result.invoke2(Boolean.valueOf((result2 == null || (packet = result2.getPacket()) == null || (v5rVarG = packet.G()) == null) ? false : v5rVarG.v()));
            }
        }, 0, 8, null);
    }

    public final void dismissDialog() {
        getDismissDialogLiveData().postValue(Boolean.TRUE);
    }

    @NotNull
    public final MutableLiveData<BgImgTransferProgress> getBgImgTransfer() {
        return (MutableLiveData) this.bgImgTransfer.getValue();
    }

    @NotNull
    public final MutableLiveData<DialWatchFace> getDialWatchFaceLiveData() {
        return this.dialWatchFaceLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDismissDialogLiveData() {
        return (MutableLiveData) this.dismissDialogLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<EditResult> getEditRet() {
        return (MutableLiveData) this.editRet.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getFontTransfer() {
        return (MutableLiveData) this.fontTransfer.getValue();
    }

    @Nullable
    public final ImgDataHandler getImgDataHandler() {
        return this.imgDataHandler;
    }

    @NotNull
    public final List<FaceEditPhotoBean> getNewImageList() {
        return this.newImageList;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceEditViewModel";
    }

    public final void requestDialWatchFace(@Nullable WatchFace watchFace, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Logger.i(getTAG(), "requestDialWatchFace: " + filePath);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C34171(filePath, this, watchFace, null), 2, null);
    }

    public final void requestEdit(@NotNull DialWatchFace dialWatchFace, @Nullable WatchFace watchface, boolean needOrderList, boolean deleteAllImages, @NotNull List<FaceEditPhotoBean> orderList, @NotNull List<FaceEditPhotoBean> imageList, @Nullable File fontFile, boolean fontFileChange) {
        Intrinsics.checkNotNullParameter(dialWatchFace, "dialWatchFace");
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        Intrinsics.checkNotNullParameter(imageList, "imageList");
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 11;
        v5r v5rVar = new v5r();
        p5r p5rVar = new p5r();
        p5rVar.c = watchface != null ? watchface.getId() : null;
        DialEditDeviceHelper dialEditDeviceHelper = DialEditDeviceHelper.INSTANCE;
        p5rVar.p = dialEditDeviceHelper.getDeviceStyleStr(dialWatchFace);
        p5rVar.d = true;
        List<a6r> listBuildDeviceWatchFaceSlotList = dialEditDeviceHelper.buildDeviceWatchFaceSlotList(this.nameIdMap, dialWatchFace);
        p5rVar.o = listBuildDeviceWatchFaceSlotList != null ? (a6r[]) listBuildDeviceWatchFaceSlotList.toArray(new a6r[0]) : null;
        Integer deviceStyleColorIndex = dialEditDeviceHelper.getDeviceStyleColorIndex(dialWatchFace);
        if (deviceStyleColorIndex != null) {
            p5rVar.q = deviceStyleColorIndex.intValue();
        }
        if (needOrderList) {
            List<FaceEditPhotoBean> list = orderList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(FaceEditPhotoBeanKt.toWatchFaceGroup((FaceEditPhotoBean) it.next()).c);
            }
            p5rVar.f30040k = (String[]) arrayList.toArray(new String[0]);
        }
        p5rVar.l = deleteAllImages;
        if (!imageList.isEmpty()) {
            w5r.b bVar = new w5r.b();
            ArrayList arrayList2 = new ArrayList();
            Iterator<FaceEditPhotoBean> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FaceEditPhotoBeanKt.toWatchFaceGroup(it2.next()));
            }
            bVar.c = (w5r.a[]) arrayList2.toArray(new w5r.a[0]);
            p5rVar.m = bVar;
        }
        if (dialWatchFace.getSupportLiteral()) {
            p5rVar.f30041r = DialEditDeviceHelper.INSTANCE.buildWatchFaceLiteral(fontFile, dialWatchFace, this.nameIdMap, fontFileChange);
        }
        v5rVar.B(p5rVar);
        Logger.i(getTAG(), "requestEdit: " + v5rVar.p());
        s7rVar.e0(v5rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel.requestEdit.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FaceEditViewModel.this.getEditRet().postValue(new EditResult(code, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                v5r v5rVarG;
                q5r q5rVarQ = (result == null || (packet = result.getPacket()) == null || (v5rVarG = packet.G()) == null) ? null : v5rVarG.q();
                FaceEditViewModel.this.getEditRet().postValue(new EditResult(q5rVarQ != null ? q5rVarQ.d : 4, q5rVarQ));
            }
        }, 0, 8, null);
    }

    @Nullable
    public final Object savePhotosToDB(@NotNull String str, @Nullable String str2, @NotNull List<FaceEditPhotoBean> list, boolean z, @NotNull Continuation<? super Unit> continuation) {
        FaceBleMultiPhoto faceBleMultiPhoto;
        String md5;
        FaceImageForeground faceImageForeground;
        String cropPath;
        Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
        ArrayList arrayList = new ArrayList();
        for (FaceEditPhotoBean faceEditPhotoBean : FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(str)) {
            List<FaceEditPhotoBean> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual(FaceEditPhotoBeanKt.toWatchFaceGroup((FaceEditPhotoBean) it.next()).c, FaceEditPhotoBeanKt.toWatchFaceGroup(faceEditPhotoBean).c)) {
                        }
                    }
                }
            }
            String str3 = "";
            if (z) {
                String cropPath2 = faceEditPhotoBean.getBackgroundImage().getCropPath();
                String str4 = cropPath2 == null ? "" : cropPath2;
                String md6 = faceEditPhotoBean.getBackgroundImage().getMd5();
                String originImagePath = faceEditPhotoBean.getBackgroundImage().getOriginImagePath();
                String originImageMd5 = faceEditPhotoBean.getBackgroundImage().getOriginImageMd5();
                if (faceEditPhotoBean.getForegroundImage() == null) {
                    faceImageForeground = null;
                } else {
                    WatchFaceImage foregroundImage = faceEditPhotoBean.getForegroundImage();
                    if (foregroundImage == null || (md5 = foregroundImage.getMd5()) == null) {
                        md5 = "";
                    }
                    WatchFaceImage foregroundImage2 = faceEditPhotoBean.getForegroundImage();
                    if (foregroundImage2 != null && (cropPath = foregroundImage2.getCropPath()) != null) {
                        str3 = cropPath;
                    }
                    faceImageForeground = new FaceImageForeground(md5, str3);
                }
                faceBleMultiPhoto = new FaceBleMultiPhoto(str4, md6, originImagePath, originImageMd5, faceImageForeground, null, null, 96, null);
            } else {
                String cropPath3 = faceEditPhotoBean.getBackgroundImage().getCropPath();
                faceBleMultiPhoto = new FaceBleMultiPhoto(cropPath3 == null ? "" : cropPath3, faceEditPhotoBean.getBackgroundImage().getMd5(), faceEditPhotoBean.getBackgroundImage().getCropPath(), faceEditPhotoBean.getBackgroundImage().getMd5(), null, faceEditPhotoBean.getBackgroundImage().getDuration(), faceEditPhotoBean.getBackgroundImage().getThumbnailCropPath(), 16, null);
            }
            arrayList.add(faceBleMultiPhoto);
        }
        Unit unit = Unit.INSTANCE;
        FaceCommonEntity faceCommonEntity = new FaceCommonEntity(str, lBoxLong, did, str2, null, null, null, null, null, arrayList, 496, null);
        Logger.i(getTAG(), "savePhotosToDB: " + faceCommonEntity);
        Object objSaveWatchFace = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao().saveWatchFace(faceCommonEntity, continuation);
        return objSaveWatchFace == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveWatchFace : Unit.INSTANCE;
    }

    public final void setFaceId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Logger.i(getTAG(), "setFaceId: " + id);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 1;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
    }

    public final void setImgDataHandler(@Nullable ImgDataHandler imgDataHandler) {
        this.imgDataHandler = imgDataHandler;
    }

    public final void setNewImageList(@NotNull List<FaceEditPhotoBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.newImageList = list;
    }

    public final void transferFontFile(@NotNull File fontFile, int segmentLength) {
        String did;
        Intrinsics.checkNotNullParameter(fontFile, "fontFile");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, 3, 5, fontFile.getPath(), segmentLength, new C34201(fontFile));
    }

    public final void transferImgList(@NotNull List<FaceEditPhotoBean> faceList, @NotNull String faceId, int segmentLength) {
        String did;
        Intrinsics.checkNotNullParameter(faceList, "faceList");
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        String str = did;
        ArrayList arrayList = new ArrayList();
        for (FaceEditPhotoBean faceEditPhotoBean : faceList) {
            arrayList.add(faceEditPhotoBean.getBackgroundImage());
            WatchFaceImage foregroundImage = faceEditPhotoBean.getForegroundImage();
            if (foregroundImage != null) {
                arrayList.add(foregroundImage);
            }
        }
        sendImgToDevice(str, arrayList, faceList, faceId, segmentLength, new Integer[]{0});
    }
}
