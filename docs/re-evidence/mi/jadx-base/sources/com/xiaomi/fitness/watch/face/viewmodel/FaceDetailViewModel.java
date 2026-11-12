package com.xiaomi.fitness.watch.face.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceDownloadResultV2;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import com.xiaomi.fitness.watch.face.install.FaceInstallBaseImpl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV1Impl;
import com.xiaomi.fitness.watch.face.install.FaceInstallBleV2Impl;
import com.xiaomi.fitness.watch.face.install.FaceInstallHuamiImpl;
import com.xiaomi.fitness.watch.face.install.FaceInstallPushCallback;
import com.xiaomi.fitness.watch.face.model.FaceDetailModel;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FaceDetailResultV2;
import com.xiaomi.fitness.watch.face.request.FaceUserAction;
import com.xiaomi.fitness.watch.face.request.FaceUserActionResult;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.s7r;
import defpackage.tgc;
import defpackage.v5r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003defB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0006JB\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010)\u001a\u00020\u00162\u0014\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020$0+H\u0086@¢\u0006\u0002\u0010-J\u0018\u00104\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u00020\u0016J2\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020>2\u0006\u0010(\u001a\u00020\u00062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020$0+J\u0016\u0010@\u001a\u00020>2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006J$\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010D\u001a\u0004\u0018\u00010\u0006J6\u0010E\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u00062\u001c\u0010*\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020$0FJu\u0010G\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010\u00062\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00162\b\u0010M\u001a\u0004\u0018\u00010\u00062\b\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010O\u001a\u0004\u0018\u00010/2 \u0010P\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u00020$0Q¢\u0006\u0002\u0010RJ;\u0010V\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\u00062\b\u0010W\u001a\u0004\u0018\u00010/2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020$0+¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0006J\"\u0010^\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020$0+J\"\u0010_\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020$0+J\u0006\u0010c\u001a\u00020$R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010!R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R3\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020302\u0012\u0004\u0012\u00020\u0016010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u000e\u001a\u0004\b4\u0010!R!\u00107\u001a\b\u0012\u0004\u0012\u0002080\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u000e\u001a\u0004\b9\u0010!R!\u0010S\u001a\b\u0012\u0004\u0012\u00020/0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u000e\u001a\u0004\bT\u0010!R!\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\u000e\u001a\u0004\b\\\u0010!R!\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bb\u0010\u000e\u001a\u0004\ba\u0010!¨\u0006g"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/watch/face/model/FaceDetailModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "supportZip", "", "getSupportZip", "()Z", "supportTrial", "getSupportTrial", "faceInstallController", "Lcom/xiaomi/fitness/watch/face/install/FaceInstallBaseImpl;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$FaceDetailLiveData;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "liveData$delegate", Constants.KEY_REQUEST_DATA, "", FaceInfoBase.FACE_ID, "requestDownload", "realFaceId", "id", "isTrial", "result", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceDownloadResultV2;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userActionPage", "", "userActionList", "Lkotlin/Pair;", "", "Lcom/xiaomi/fitness/watch/face/request/FaceUserAction;", "getUserActionList", "userActionList$delegate", "fromStart", "download", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$DownloadRet;", "getDownload", "download$delegate", "downloadFace", "url", "file", "Ljava/io/File;", "callback", "getInstallFilePath", "fileHash", "validFile", "did", "fileMd5", "findFile", "Lkotlin/Function2;", "installBleFace", "path", "version", "", MediaStoreUtil.MediaInfo.SIZE, "needCheckStorage", "license", "sign", "trialDuration", "action", "Lkotlin/Function3;", "(Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)V", "installFaceProgress", "getInstallFaceProgress", "installFaceProgress$delegate", "doInstallFace", "segmentLength", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$FaceInstallRet;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "deleteBinFile", "setFaceResult", "getSetFaceResult", "setFaceResult$delegate", "setFaceId", "deleteFace", "dismissDialogLiveData", "getDismissDialogLiveData", "dismissDialogLiveData$delegate", "dismissProgress", "FaceDetailLiveData", "DownloadRet", "FaceInstallRet", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDetailViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,307:1\n1557#2:308\n1628#2,3:309\n*S KotlinDebug\n*F\n+ 1 FaceDetailViewModel.kt\ncom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel\n*L\n85#1:308\n85#1:309,3\n*E\n"})
public final class FaceDetailViewModel extends BaseViewModel<FaceDetailModel> {

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cr8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceDetailViewModel.deviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: dismissDialogLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dismissDialogLiveData;

    /* JADX INFO: renamed from: download$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy download;
    public FaceApiRequestV2 faceApiRequest;

    @NotNull
    private final FaceInstallBaseImpl faceInstallController;

    /* JADX INFO: renamed from: installFaceProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installFaceProgress;

    /* JADX INFO: renamed from: liveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy liveData;

    /* JADX INFO: renamed from: setFaceResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setFaceResult;

    /* JADX INFO: renamed from: userActionList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userActionList;
    private int userActionPage;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$DownloadRet;", "", "percent", "", "msg", "", "<init>", "(ILjava/lang/String;)V", "getPercent", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadRet {

        @Nullable
        private final String msg;
        private final int percent;

        public DownloadRet(int i, @Nullable String str) {
            this.percent = i;
            this.msg = str;
        }

        public static /* synthetic */ DownloadRet copy$default(DownloadRet downloadRet, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = downloadRet.percent;
            }
            if ((i2 & 2) != 0) {
                str = downloadRet.msg;
            }
            return downloadRet.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMsg() {
            return this.msg;
        }

        @NotNull
        public final DownloadRet copy(int percent, @Nullable String msg) {
            return new DownloadRet(percent, msg);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadRet)) {
                return false;
            }
            DownloadRet downloadRet = (DownloadRet) other;
            return this.percent == downloadRet.percent && Intrinsics.areEqual(this.msg, downloadRet.msg);
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.percent) * 31;
            String str = this.msg;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "DownloadRet(percent=" + this.percent + ", msg=" + this.msg + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$FaceDetailLiveData;", "", "code", "", "data", "Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "<init>", "(ILcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;)V", "getCode", "()I", "getData", "()Lcom/xiaomi/fitness/watch/face/request/FaceDetailResultV2;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FaceDetailLiveData {
        private final int code;

        @Nullable
        private final FaceDetailResultV2 data;

        public FaceDetailLiveData(int i, @Nullable FaceDetailResultV2 faceDetailResultV2) {
            this.code = i;
            this.data = faceDetailResultV2;
        }

        public static /* synthetic */ FaceDetailLiveData copy$default(FaceDetailLiveData faceDetailLiveData, int i, FaceDetailResultV2 faceDetailResultV2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = faceDetailLiveData.code;
            }
            if ((i2 & 2) != 0) {
                faceDetailResultV2 = faceDetailLiveData.data;
            }
            return faceDetailLiveData.copy(i, faceDetailResultV2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final FaceDetailResultV2 getData() {
            return this.data;
        }

        @NotNull
        public final FaceDetailLiveData copy(int code, @Nullable FaceDetailResultV2 data) {
            return new FaceDetailLiveData(code, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceDetailLiveData)) {
                return false;
            }
            FaceDetailLiveData faceDetailLiveData = (FaceDetailLiveData) other;
            return this.code == faceDetailLiveData.code && Intrinsics.areEqual(this.data, faceDetailLiveData.data);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final FaceDetailResultV2 getData() {
            return this.data;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            FaceDetailResultV2 faceDetailResultV2 = this.data;
            return iHashCode + (faceDetailResultV2 == null ? 0 : faceDetailResultV2.hashCode());
        }

        @NotNull
        public String toString() {
            return "FaceDetailLiveData(code=" + this.code + ", data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceDetailViewModel$FaceInstallRet;", "", "success", "", "code", "", "<init>", "(ZI)V", "getSuccess", "()Z", "getCode", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FaceInstallRet {
        private final int code;
        private final boolean success;

        public FaceInstallRet(boolean z, int i) {
            this.success = z;
            this.code = i;
        }

        public static /* synthetic */ FaceInstallRet copy$default(FaceInstallRet faceInstallRet, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = faceInstallRet.success;
            }
            if ((i2 & 2) != 0) {
                i = faceInstallRet.code;
            }
            return faceInstallRet.copy(z, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final FaceInstallRet copy(boolean success, int code) {
            return new FaceInstallRet(success, code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FaceInstallRet)) {
                return false;
            }
            FaceInstallRet faceInstallRet = (FaceInstallRet) other;
            return this.success == faceInstallRet.success && this.code == faceInstallRet.code;
        }

        public final int getCode() {
            return this.code;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return "FaceInstallRet(success=" + this.success + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$deleteBinFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$deleteBinFile$1", f = "FaceDetailViewModel.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        final /* synthetic */ String $fileHash;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$faceId = str;
            this.$fileHash = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailViewModel.this.new AnonymousClass1(this.$faceId, this.$fileHash, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceInstallBaseImpl faceInstallBaseImpl = FaceDetailViewModel.this.faceInstallController;
                String str = this.$faceId;
                String str2 = this.$fileHash;
                this.label = 1;
                if (faceInstallBaseImpl.deleteBinFile(str, str2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$downloadFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$downloadFace$1", f = "FaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<DownloadRet, Unit> $callback;
        final /* synthetic */ File $file;
        final /* synthetic */ String $id;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ FaceDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C34131(String str, File file, Function1<? super DownloadRet, Unit> function1, FaceDetailViewModel faceDetailViewModel, String str2, Continuation<? super C34131> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$file = file;
            this.$callback = function1;
            this.this$0 = faceDetailViewModel;
            this.$id = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34131(this.$url, this.$file, this.$callback, this.this$0, this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceDownloadHelper faceDownloadHelper = FaceDownloadHelper.INSTANCE;
            String str = this.$url;
            String absolutePath = this.$file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            final Function1<DownloadRet, Unit> function1 = this.$callback;
            final FaceDetailViewModel faceDetailViewModel = this.this$0;
            final String str2 = this.$id;
            faceDownloadHelper.downloadFile(str, absolutePath, new tgc() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.downloadFace.1.1
                @Override // defpackage.tgc
                public void onComplete() {
                    String model;
                    Logger.i(faceDetailViewModel.getTAG(), "doDownload onComplete");
                    function1.invoke2(new DownloadRet(100, null));
                    if (RegionUtil.INSTANCE.isMedalSupport()) {
                        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
                        String str3 = str2;
                        WearableDeviceModel deviceModel = faceDetailViewModel.getDeviceModel();
                        if (deviceModel == null || (model = DeviceModelExtKt.getModel(deviceModel)) == null) {
                            model = "";
                        }
                        medalManagerExtKt.doMedalAssistFaceDownload(str3, model);
                    }
                }

                @Override // defpackage.tgc
                public void onError(String errorMsg) {
                    function1.invoke2(new DownloadRet(-1, errorMsg));
                }

                @Override // defpackage.tgc
                public void onProgress(int progress) {
                    function1.invoke2(new DownloadRet(progress, null));
                    Logger.i(faceDetailViewModel.getTAG(), "doDownload progress " + progress);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$getUserActionList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel$getUserActionList$1", f = "FaceDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34141(String str, Continuation<? super C34141> continuation) {
            super(2, continuation);
            this.$faceId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceDetailViewModel faceDetailViewModel, FaceUserActionResult faceUserActionResult) {
            String tag = faceDetailViewModel.getTAG();
            int i = faceDetailViewModel.userActionPage;
            List<FaceUserAction> actionList = faceUserActionResult.getActionList();
            Logger.i(tag, "getUserActionList page " + i + " size: " + (actionList != null ? Integer.valueOf(actionList.size()) : null));
            MutableLiveData<Pair<List<FaceUserAction>, Boolean>> userActionList = faceDetailViewModel.getUserActionList();
            List<FaceUserAction> actionList2 = faceUserActionResult.getActionList();
            if (actionList2 == null) {
                actionList2 = new ArrayList<>();
            }
            userActionList.postValue(new Pair<>(actionList2, Boolean.valueOf(faceUserActionResult.getHasMore())));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(FaceDetailViewModel faceDetailViewModel, ApiException apiException) {
            Logger.i(faceDetailViewModel.getTAG(), "getUserActionList fail: " + apiException);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceDetailViewModel.this.new C34141(this.$faceId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String model;
            String firmwareVersion;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceApiRequestV2 faceApiRequest = FaceDetailViewModel.this.getFaceApiRequest();
            String str = this.$faceId;
            WearableDeviceModel deviceModel = FaceDetailViewModel.this.getDeviceModel();
            if (deviceModel == null || (model = DeviceModelExtKt.getModel(deviceModel)) == null) {
                model = "";
            }
            WearableDeviceModel deviceModel2 = FaceDetailViewModel.this.getDeviceModel();
            if (deviceModel2 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel2)) == null) {
                firmwareVersion = "";
            }
            int i = FaceDetailViewModel.this.userActionPage;
            final FaceDetailViewModel faceDetailViewModel = FaceDetailViewModel.this;
            Function1<? super FaceUserActionResult, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FaceDetailViewModel.C34141.invokeSuspend$lambda$0(faceDetailViewModel, (FaceUserActionResult) obj2);
                }
            };
            final FaceDetailViewModel faceDetailViewModel2 = FaceDetailViewModel.this;
            faceApiRequest.getUserActionList(str, model, firmwareVersion, i, function1, new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.d
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FaceDetailViewModel.C34141.invokeSuspend$lambda$1(faceDetailViewModel2, (ApiException) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceDetailViewModel() {
        WearableDeviceModel deviceModel = getDeviceModel();
        this.faceInstallController = (deviceModel == null || !DeviceModelExtKt.isHuaMi(deviceModel)) ? getSupportZip() ? new FaceInstallBleV2Impl(getDeviceModel()) : new FaceInstallBleV1Impl(getDeviceModel()) : new FaceInstallHuamiImpl(getDeviceModel());
        this.liveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dr8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.liveData_delegate$lambda$1();
            }
        });
        this.userActionPage = 1;
        this.userActionList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: er8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.userActionList_delegate$lambda$5();
            }
        });
        this.download = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fr8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.download_delegate$lambda$6();
            }
        });
        this.installFaceProgress = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gr8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.installFaceProgress_delegate$lambda$7();
            }
        });
        this.setFaceResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hr8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.setFaceResult_delegate$lambda$8();
            }
        });
        this.dismissDialogLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ir8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceDetailViewModel.dismissDialogLiveData_delegate$lambda$9();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData dismissDialogLiveData_delegate$lambda$9() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData download_delegate$lambda$6() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    public static /* synthetic */ void getUserActionList$default(FaceDetailViewModel faceDetailViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        faceDetailViewModel.getUserActionList(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData installFaceProgress_delegate$lambda$7() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData liveData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    public static /* synthetic */ Object requestDownload$default(FaceDetailViewModel faceDetailViewModel, String str, String str2, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        return faceDetailViewModel.requestDownload(str, str3, z, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownload$lambda$3(FaceDetailViewModel this$0, Function1 result, FaceDownloadResultV2 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "requestDownload success: " + it.getLicense());
        result.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDownload$lambda$4(FaceDetailViewModel this$0, Function1 result, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "$result");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.getTAG(), "requestDownload fail: " + it);
        result.invoke2(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setFaceResult_delegate$lambda$8() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData userActionList_delegate$lambda$5() {
        return new MutableLiveData();
    }

    public final void deleteBinFile(@NotNull String faceId, @Nullable String fileHash) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(faceId, fileHash, null), 3, null);
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
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.deleteFace.1
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

    public final void dismissProgress() {
        getDismissDialogLiveData().postValue(Boolean.TRUE);
    }

    public final void doInstallFace(@Nullable String path, @NotNull String id, @Nullable Integer segmentLength, @NotNull final Function1<? super FaceInstallRet, Unit> callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.faceInstallController.doInstall(path, id, segmentLength, new FaceInstallPushCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.doInstallFace.1
            @Override // com.xiaomi.fitness.watch.face.install.FaceInstallPushCallback
            public void onFinish(boolean success, int code) {
                if (!success) {
                    callback.invoke2(new FaceInstallRet(false, 255));
                } else {
                    FaceDetailViewModel.this.getInstallFaceProgress().postValue(100);
                    callback.invoke2(new FaceInstallRet(true, code));
                }
            }

            @Override // com.xiaomi.fitness.watch.face.install.FaceInstallPushCallback
            public void onProgress(int progress) {
                Logger.i(FaceDetailViewModel.this.getTAG(), "doInstallFace onSend: " + progress);
                FaceDetailViewModel.this.getInstallFaceProgress().postValue(Integer.valueOf(Math.min(99, progress)));
            }

            @Override // com.xiaomi.fitness.watch.face.install.FaceInstallPushCallback
            public void onStart() {
                Logger.i(FaceDetailViewModel.this.getTAG(), "doInstallFace start");
            }
        });
    }

    public final void downloadFace(@NotNull String url, @NotNull File file, @NotNull String id, @NotNull Function1<? super DownloadRet, Unit> callback) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C34131(url, file, callback, this, id, null), 2, null);
    }

    public final void findFile(@NotNull String faceId, @Nullable String fileHash, @NotNull Function2<? super File, ? super File, Unit> result) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.faceInstallController.findFile(faceId, fileHash, result);
    }

    @NotNull
    public final MutableLiveData<Boolean> getDismissDialogLiveData() {
        return (MutableLiveData) this.dismissDialogLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<DownloadRet> getDownload() {
        return (MutableLiveData) this.download.getValue();
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
    public final MutableLiveData<Integer> getInstallFaceProgress() {
        return (MutableLiveData) this.installFaceProgress.getValue();
    }

    @NotNull
    public final File getInstallFilePath(@NotNull String faceId, @NotNull String fileHash) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        return this.faceInstallController.getFilePath(faceId, fileHash);
    }

    @NotNull
    public final MutableLiveData<FaceDetailLiveData> getLiveData() {
        return (MutableLiveData) this.liveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetFaceResult() {
        return (MutableLiveData) this.setFaceResult.getValue();
    }

    public final boolean getSupportTrial() {
        String did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        return (deviceManagerExtKt.getDeviceCapability(did) & 536870912) == 536870912;
    }

    public final boolean getSupportZip() {
        String did;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel deviceModel = getDeviceModel();
        if (deviceModel == null || (did = deviceModel.getDid()) == null) {
            did = "";
        }
        return (deviceManagerExtKt.getDeviceCapability(did) & 4194304) == 4194304;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceDetailViewModel";
    }

    @NotNull
    public final MutableLiveData<Pair<List<FaceUserAction>, Boolean>> getUserActionList() {
        return (MutableLiveData) this.userActionList.getValue();
    }

    public final void installBleFace(@NotNull String id, @Nullable String path, long version, long size, boolean needCheckStorage, @Nullable String license, @Nullable String sign, @Nullable Integer trialDuration, @NotNull Function3<? super Boolean, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        Logger.i(getTAG(), "installBleFace: file = " + path + "; version = " + version + "; size = " + size);
        this.faceInstallController.preInstall(id, path, version, size, needCheckStorage, license, sign, trialDuration, action);
    }

    public final void requestData(@Nullable String faceId) {
        String firmwareVersion;
        if (getDeviceModel() == null || faceId == null || faceId.length() == 0) {
            getLiveData().postValue(new FaceDetailLiveData(-1, null));
            return;
        }
        if (!NetworkExtKt.isNetworkAvailable()) {
            getLiveData().postValue(new FaceDetailLiveData(22223, null));
            return;
        }
        FaceApiRequestV2 faceApiRequest = getFaceApiRequest();
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        String model = DeviceModelExtKt.getModel(deviceModel);
        WearableDeviceModel deviceModel2 = getDeviceModel();
        if (deviceModel2 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel2)) == null) {
            firmwareVersion = "";
        }
        String str = firmwareVersion;
        List<WatchFace> localFace = FaceManager.INSTANCE.getLocalFace();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localFace, 10));
        Iterator<T> it = localFace.iterator();
        while (it.hasNext()) {
            arrayList.add(((WatchFace) it.next()).getId());
        }
        faceApiRequest.getFaceDetail(model, faceId, str, arrayList, new Function1<FaceDetailResultV2, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.requestData.2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(FaceDetailResultV2 faceDetailResultV2) {
                invoke2(faceDetailResultV2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(FaceDetailResultV2 p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                FaceDetailViewModel.this.getLiveData().postValue(new FaceDetailLiveData(0, p1));
            }
        }, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.requestData.3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                invoke2(apiException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(ApiException p1) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                FaceDetailViewModel.this.getLiveData().postValue(new FaceDetailLiveData(p1.getErrorCode(), null));
            }
        });
    }

    @Nullable
    public final Object requestDownload(@NotNull String str, @Nullable String str2, boolean z, @NotNull final Function1<? super FaceDownloadResultV2, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        String model;
        String did;
        Logger.i(getTAG(), "requestDownload isTrial: " + z);
        FaceApiRequestV2 faceApiRequest = getFaceApiRequest();
        WearableDeviceModel deviceModel = getDeviceModel();
        String str3 = (deviceModel == null || (did = deviceModel.getDid()) == null) ? "" : did;
        WearableDeviceModel deviceModel2 = getDeviceModel();
        Object objRequestDownload = faceApiRequest.requestDownload(str3, (deviceModel2 == null || (model = DeviceModelExtKt.getModel(deviceModel2)) == null) ? "" : model, str, z, str2, new Function1() { // from class: jr8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailViewModel.requestDownload$lambda$3(this.f23054a, function1, (FaceDownloadResultV2) obj);
            }
        }, new Function1() { // from class: kr8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceDetailViewModel.requestDownload$lambda$4(this.f24210a, function1, (ApiException) obj);
            }
        }, continuation);
        return objRequestDownload == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRequestDownload : Unit.INSTANCE;
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }

    public final void setFaceId(@NotNull String id, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i(getTAG(), "setFaceId: " + id);
        s7r s7rVar = new s7r();
        s7rVar.e = 4;
        s7rVar.f = 1;
        v5r v5rVar = new v5r();
        v5rVar.C(id);
        s7rVar.e0(v5rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel.setFaceId.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(this.getTAG(), "setFaceId error: code: " + code);
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                v5r v5rVarG;
                if (result == null) {
                    callback.invoke2(Boolean.FALSE);
                    return;
                }
                Function1<Boolean, Unit> function1 = callback;
                s7r packet = result.getPacket();
                boolean z = false;
                if (packet != null && (v5rVarG = packet.G()) != null && v5rVarG.v()) {
                    z = true;
                }
                function1.invoke2(Boolean.valueOf(z));
            }
        }, 0, 8, null);
    }

    public final boolean validFile(@Nullable String did, @Nullable String faceId, @Nullable String fileMd5) {
        return this.faceInstallController.validFile(did, faceId, fileMd5);
    }

    public final void getUserActionList(@NotNull String faceId, boolean fromStart) {
        Intrinsics.checkNotNullParameter(faceId, "faceId");
        if (fromStart) {
            this.userActionPage = 1;
        } else {
            this.userActionPage++;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34141(faceId, null), 3, null);
    }
}
