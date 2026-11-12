package com.xiaomi.fitness.watch.face.viewmodel;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import com.xiaomi.fitness.watch.face.request.FaceApiRequest;
import com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.ISkinStorageStatusCallback;
import com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.p1j;
import defpackage.tgc;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\t*\u0001Z\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003_`aB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010#\u001a\u00020\u0006J\u0016\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'J\u0006\u0010*\u001a\u00020\u0014J(\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00062\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060.2\b\u0010/\u001a\u0004\u0018\u00010\u0006J\u000e\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0006J\u001e\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006J\u0010\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020=H\u0002J\u0006\u0010A\u001a\u00020\nJ\u000e\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020)J\u001e\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020)2\u0006\u0010C\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0014J\u000e\u0010O\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0006J\u000e\u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u00020)J\u0006\u0010R\u001a\u00020\u0014J\u0006\u0010S\u001a\u00020\u0014J\u000e\u0010X\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0006J\b\u0010^\u001a\u00020\nH\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010(\u001a\u00020)X\u0082D¢\u0006\u0002\n\u0000R!\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b4\u0010\u001eR\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\b?\u0010\u001eR!\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u0012\u001a\u0004\bI\u0010\u001eR\u001b\u0010K\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\u0012\u001a\u0004\bL\u0010MR)\u0010T\u001a\u0010\u0012\f\u0012\n U*\u0004\u0018\u00010\u00140\u00140\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\u0012\u001a\u0004\bV\u0010\u001eR\u001b\u0010Y\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\u0012\u001a\u0004\b[\u0010\\¨\u0006b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel;", "Lcom/xiaomi/fitness/watch/face/viewmodel/StateViewModel;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device$delegate", "Lkotlin/Lazy;", "supportMultiPhoto", "", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequest;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequest;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequest;)V", "bgImg", "Landroidx/lifecycle/MutableLiveData;", "getBgImg", "()Landroidx/lifecycle/MutableLiveData;", "bgImg$delegate", "loadLocalImg", FaceInfoBase.FACE_ID, Constants.KEY_REQUEST_DATA, "bgImgMd5", "onStorageCheck", "path", "callback", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$Callback;", "BATTERY_LEVEL_LOW", "", "isBatteryLow", "reqEdit", "skinPath", "bgPathList", "", "spiritColor", "setFaceId", "id", "download", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$DownloadRet;", "getDownload", "download$delegate", "downloadFace", "url", "filePath", "zipImgRatio", "", "initZipImgRatio", "zipSize", "", "dismissDialogLiveData", "getDismissDialogLiveData", "dismissDialogLiveData$delegate", "dismissProgress", "getDownloadProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "getPushProgress", "usedProgress", "hasImg", PluginPackageConstant.RN_INSTALL_DIR_KEY, "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$InstallRet;", "getInstall", "install$delegate", "installRet", "getInstallRet", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$InstallRet;", "installRet$delegate", "installFace", "getErrorDesc", "code", "isSupportDialFontCustomColor", "isSupportMultiPhoto", "deleteLiveData", "kotlin.jvm.PlatformType", "getDeleteLiveData", "deleteLiveData$delegate", "delete", "handler", "com/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$handler$2$1", "getHandler", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$handler$2$1;", "handler$delegate", "onCleared", "Callback", "DownloadRet", "InstallRet", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceHMInfoViewModel extends StateViewModel<FaceData> {
    private boolean supportMultiPhoto;
    private float zipImgRatio;

    /* JADX INFO: renamed from: device$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy device = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wx8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.device_delegate$lambda$0();
        }
    });

    @NotNull
    private FaceApiRequest faceApiRequest = new FaceApiRequest();

    /* JADX INFO: renamed from: bgImg$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bgImg = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xx8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.bgImg_delegate$lambda$1();
        }
    });
    private final int BATTERY_LEVEL_LOW = 10;

    /* JADX INFO: renamed from: download$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy download = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yx8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.download_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: dismissDialogLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dismissDialogLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zx8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.dismissDialogLiveData_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: install$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy install = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ay8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.install_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: installRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy installRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: by8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.installRet_delegate$lambda$5();
        }
    });

    /* JADX INFO: renamed from: deleteLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cy8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.deleteLiveData_delegate$lambda$6();
        }
    });

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dy8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceHMInfoViewModel.handler_delegate$lambda$7(this.f16054a);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$Callback;", "", "onSuccess", "", "onError", "code", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {
        void onError(int code);

        void onSuccess();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$DownloadRet;", "", "percent", "", "msg", "", "<init>", "(ILjava/lang/String;)V", "getPercent", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$InstallRet;", "", "result", "", "codeOrProgress", "", "type", "<init>", "(ZII)V", "getResult", "()Z", "setResult", "(Z)V", "getCodeOrProgress", "()I", "setCodeOrProgress", "(I)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstallRet {
        private int codeOrProgress;
        private boolean result;
        private int type;

        public InstallRet(boolean z, int i, int i2) {
            this.result = z;
            this.codeOrProgress = i;
            this.type = i2;
        }

        public static /* synthetic */ InstallRet copy$default(InstallRet installRet, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = installRet.result;
            }
            if ((i3 & 2) != 0) {
                i = installRet.codeOrProgress;
            }
            if ((i3 & 4) != 0) {
                i2 = installRet.type;
            }
            return installRet.copy(z, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCodeOrProgress() {
            return this.codeOrProgress;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        public final InstallRet copy(boolean result, int codeOrProgress, int type) {
            return new InstallRet(result, codeOrProgress, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstallRet)) {
                return false;
            }
            InstallRet installRet = (InstallRet) other;
            return this.result == installRet.result && this.codeOrProgress == installRet.codeOrProgress && this.type == installRet.type;
        }

        public final int getCodeOrProgress() {
            return this.codeOrProgress;
        }

        public final boolean getResult() {
            return this.result;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.result) * 31) + Integer.hashCode(this.codeOrProgress)) * 31) + Integer.hashCode(this.type);
        }

        public final void setCodeOrProgress(int i) {
            this.codeOrProgress = i;
        }

        public final void setResult(boolean z) {
            this.result = z;
        }

        public final void setType(int i) {
            this.type = i;
        }

        @NotNull
        public String toString() {
            return "InstallRet(result=" + this.result + ", codeOrProgress=" + this.codeOrProgress + ", type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$delete$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$delete$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceHMInfoViewModel.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WearableDeviceInfo deviceInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                WearableDeviceModel device = FaceHMInfoViewModel.this.getDevice();
                String did = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getDid();
                Intrinsics.checkNotNull(did);
                String str = did + this.$id;
                this.label = 1;
                if (watchFaceDao.deleteWatchFace(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FaceHMInfoViewModel.this.getDeleteLiveData().postValue(Boxing.boxBoolean(true));
            FaceManager.INSTANCE.delete(this.$id);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$downloadFace$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$downloadFace$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filePath;
        final /* synthetic */ String $id;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ FaceHMInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34211(String str, String str2, FaceHMInfoViewModel faceHMInfoViewModel, String str3, Continuation<? super C34211> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$filePath = str2;
            this.this$0 = faceHMInfoViewModel;
            this.$id = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34211(this.$url, this.$filePath, this.this$0, this.$id, continuation);
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
            String str2 = this.$filePath;
            final FaceHMInfoViewModel faceHMInfoViewModel = this.this$0;
            final String str3 = this.$id;
            faceDownloadHelper.downloadFile(str, str2, new tgc() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.downloadFace.1.1
                @Override // defpackage.tgc
                public void onComplete() {
                    String model;
                    Logger.d(faceHMInfoViewModel.getTAG(), "doDownload onComplete: ");
                    faceHMInfoViewModel.getDownload().setValue(new DownloadRet(100, null));
                    if (RegionUtil.INSTANCE.isMedalSupport()) {
                        MedalManager medalManagerExtKt = MedalManagerExtKt.getInstance(MedalManager.INSTANCE);
                        String str4 = str3;
                        WearableDeviceModel device = faceHMInfoViewModel.getDevice();
                        if (device == null || (model = DeviceModelExtKt.getModel(device)) == null) {
                            model = "";
                        }
                        medalManagerExtKt.doMedalAssistFaceDownload(str4, model);
                    }
                }

                @Override // defpackage.tgc
                public void onError(String errorMsg) {
                    faceHMInfoViewModel.getDownload().setValue(new DownloadRet(-1, errorMsg));
                    Logger.i(faceHMInfoViewModel.getTAG(), "doDownload onError: " + errorMsg);
                }

                @Override // defpackage.tgc
                public void onProgress(int progress) {
                    faceHMInfoViewModel.getDownload().setValue(new DownloadRet(progress, null));
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$loadLocalImg$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$loadLocalImg$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$loadLocalImg$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$loadLocalImg$1$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $faceId;
            int label;
            final /* synthetic */ FaceHMInfoViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08211(FaceHMInfoViewModel faceHMInfoViewModel, String str, Continuation<? super C08211> continuation) {
                super(2, continuation);
                this.this$0 = faceHMInfoViewModel;
                this.$faceId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08211(this.this$0, this.$faceId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                WearableDeviceInfo deviceInfo;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                String path = null;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    WearableDeviceModel device = this.this$0.getDevice();
                    String did = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getDid();
                    Intrinsics.checkNotNull(did);
                    String str = did + this.$faceId;
                    this.label = 1;
                    obj = watchFaceDao.getWatchFace(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                FaceCommonEntity faceCommonEntity = (FaceCommonEntity) obj;
                if (this.this$0.supportMultiPhoto) {
                    List<FaceBleMultiPhoto> multiPhotoDataList = faceCommonEntity != null ? faceCommonEntity.getMultiPhotoDataList() : null;
                    MutableLiveData<String> bgImg = this.this$0.getBgImg();
                    List<FaceBleMultiPhoto> list = multiPhotoDataList;
                    if (list != null && !list.isEmpty() && multiPhotoDataList.get(0).getMultiPath().length() > 0 && new File(multiPhotoDataList.get(0).getMultiPath()).exists()) {
                        path = multiPhotoDataList.get(0).getMultiPath();
                    }
                    bgImg.postValue(path);
                } else {
                    MutableLiveData<String> bgImg2 = this.this$0.getBgImg();
                    if ((faceCommonEntity != null ? faceCommonEntity.getPath() : null) != null) {
                        String path2 = faceCommonEntity.getPath();
                        Intrinsics.checkNotNull(path2);
                        if (new File(path2).exists()) {
                            path = faceCommonEntity.getPath();
                        }
                    }
                    bgImg2.postValue(path);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34231(String str, Continuation<? super C34231> continuation) {
            super(2, continuation);
            this.$faceId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceHMInfoViewModel.this.new C34231(this.$faceId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C08211 c08211 = new C08211(FaceHMInfoViewModel.this, this.$faceId, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c08211, this) == coroutine_suspended) {
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
            return ((C34231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$onStorageCheck$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$onStorageCheck$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34241(HuamiApiCaller huamiApiCaller, Callback callback, String str, Continuation<? super C34241> continuation) {
            super(2, continuation);
            this.$huamiApiCaller = huamiApiCaller;
            this.$callback = callback;
            this.$path = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Callback callback, FaceHMInfoViewModel faceHMInfoViewModel, boolean z) {
            if (z) {
                callback.onSuccess();
            } else {
                WearableDeviceModel device = faceHMInfoViewModel.getDevice();
                callback.onError((device == null || !DeviceModelExtKt.isL66(device)) ? 101 : 102);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceHMInfoViewModel.this.new C34241(this.$huamiApiCaller, this.$callback, this.$path, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel device = FaceHMInfoViewModel.this.getDevice();
            if (device != null && DeviceModelExtKt.isL66(device)) {
                HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
                int[] watchFacesAllSync = huamiApiCaller != null ? huamiApiCaller.getWatchFacesAllSync() : null;
                Logger.i(FaceHMInfoViewModel.this.getTAG(), "L66 onStorageCheck, already install " + (watchFacesAllSync != null ? Boxing.boxInt(watchFacesAllSync.length) : null));
                if (watchFacesAllSync == null) {
                    this.$callback.onError(102);
                    return Unit.INSTANCE;
                }
                if (watchFacesAllSync.length >= 10) {
                    this.$callback.onError(102);
                    return Unit.INSTANCE;
                }
            }
            HuamiApiCaller huamiApiCaller2 = this.$huamiApiCaller;
            if (huamiApiCaller2 != null) {
                String str = this.$path;
                final Callback callback = this.$callback;
                final FaceHMInfoViewModel faceHMInfoViewModel = FaceHMInfoViewModel.this;
                huamiApiCaller2.storageStatus(str, new ISkinStorageStatusCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.e
                    @Override // com.xiaomi.hm.health.bt.sdk.ISkinStorageStatusCallback
                    public final void onMemory(boolean z) {
                        FaceHMInfoViewModel.C34241.invokeSuspend$lambda$0(callback, faceHMInfoViewModel, z);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$reqEdit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$reqEdit$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $bgPathList;
        final /* synthetic */ HuamiApiCaller $huamiApiCaller;
        final /* synthetic */ String $skinPath;
        final /* synthetic */ String $spiritColor;
        int label;
        final /* synthetic */ FaceHMInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34251(List<String> list, FaceHMInfoViewModel faceHMInfoViewModel, String str, HuamiApiCaller huamiApiCaller, String str2, Continuation<? super C34251> continuation) {
            super(2, continuation);
            this.$bgPathList = list;
            this.this$0 = faceHMInfoViewModel;
            this.$spiritColor = str;
            this.$huamiApiCaller = huamiApiCaller;
            this.$skinPath = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34251(this.$bgPathList, this.this$0, this.$spiritColor, this.$huamiApiCaller, this.$skinPath, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getHandler().setMaxProgress(this.$bgPathList.isEmpty() ? 1 : 2);
                this.this$0.getHandler().sendEmptyMessage(0);
                this.this$0.getInstallRet().setResult(true);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                FaceHMInfoViewModel$reqEdit$1$binPath$1 faceHMInfoViewModel$reqEdit$1$binPath$1 = new FaceHMInfoViewModel$reqEdit$1$binPath$1(this.$spiritColor, this.$bgPathList, this.$huamiApiCaller, this.$skinPath, this.this$0, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, faceHMInfoViewModel$reqEdit$1$binPath$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            Logger.d(this.this$0.getTAG(), "reqEdit: binPath = " + str);
            if (str == null || str.length() == 0) {
                this.this$0.getInstallRet().setResult(false);
                this.this$0.getInstall().setValue(this.this$0.getInstallRet());
            } else {
                this.this$0.getHandler().removeCallbacksAndMessages(null);
                this.this$0.installFace(str);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$requestData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$requestData$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $faceId;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$requestData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$requestData$1$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $faceId;
            int label;
            final /* synthetic */ FaceHMInfoViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08221(FaceHMInfoViewModel faceHMInfoViewModel, String str, Continuation<? super C08221> continuation) {
                super(2, continuation);
                this.this$0 = faceHMInfoViewModel;
                this.$faceId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08221(this.this$0, this.$faceId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String firmwareVersion;
                WearableDeviceInfo deviceInfo;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FaceApiRequest faceApiRequest = this.this$0.getFaceApiRequest();
                WearableDeviceModel device = this.this$0.getDevice();
                String model = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getModel();
                Intrinsics.checkNotNull(model);
                String str = this.$faceId;
                WearableDeviceModel device2 = this.this$0.getDevice();
                if (device2 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(device2)) == null) {
                    firmwareVersion = "";
                }
                String str2 = firmwareVersion;
                final FaceHMInfoViewModel faceHMInfoViewModel = this.this$0;
                Function1<FaceData, Unit> function1 = new Function1<FaceData, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.requestData.1.1.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(FaceData faceData) {
                        invoke2(faceData);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(FaceData t) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        faceHMInfoViewModel.setSuccess(t);
                    }
                };
                final FaceHMInfoViewModel faceHMInfoViewModel2 = this.this$0;
                FaceApiRequest.getFaceDetail$default(faceApiRequest, model, str, str2, null, function1, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.requestData.1.1.2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(ApiException p1) {
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        faceHMInfoViewModel2.setError(p1.getErrorCode());
                    }
                }, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34261(String str, Continuation<? super C34261> continuation) {
            super(2, continuation);
            this.$faceId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceHMInfoViewModel.this.new C34261(this.$faceId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C08221 c08221 = new C08221(FaceHMInfoViewModel.this, this.$faceId, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c08221, this) == coroutine_suspended) {
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
            return ((C34261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData bgImg_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData deleteLiveData_delegate$lambda$6() {
        return new MutableLiveData(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel device_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData dismissDialogLiveData_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData download_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) this.device.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FaceHMInfoViewModel$handler$2$1 getHandler() {
        return (FaceHMInfoViewModel$handler$2$1) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallRet getInstallRet() {
        return (InstallRet) this.installRet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceHMInfoViewModel$handler$2$1 handler_delegate$lambda$7(FaceHMInfoViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new FaceHMInfoViewModel$handler$2$1(new Ref.IntRef(), new Ref.IntRef(), this$0, Looper.getMainLooper());
    }

    private final void initZipImgRatio(long zipSize) {
        if (this.zipImgRatio == 0.0f) {
            float f = zipSize;
            this.zipImgRatio = f / (((FaceIcon.ORI_HEIGHT * FaceIcon.ORI_WIDTH) * 2) + f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallRet installRet_delegate$lambda$5() {
        return new InstallRet(true, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData install_delegate$lambda$4() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel, com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        this.supportMultiPhoto = FaceManager.INSTANCE.getSupportHuamiMultiPhoto();
    }

    public final void delete(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AnyExtKt.io$default(null, new AnonymousClass1(id, null), 1, null);
    }

    public final void dismissProgress() {
        getDismissDialogLiveData().postValue(Boolean.TRUE);
    }

    public final void downloadFace(@NotNull String url, @NotNull String filePath, @NotNull String id) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C34211(url, filePath, this, id, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getBgImg() {
        return (MutableLiveData) this.bgImg.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteLiveData() {
        return (MutableLiveData) this.deleteLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDismissDialogLiveData() {
        return (MutableLiveData) this.dismissDialogLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<DownloadRet> getDownload() {
        return (MutableLiveData) this.download.getValue();
    }

    public final int getDownloadProgress(int progress) {
        return Math.min(1, Math.max((int) ((progress / 100.0f) * 1), 0));
    }

    public final int getErrorDesc(int code) {
        if (code != 2) {
            return code != 3 ? p1j.common_set_error : p1j.d0;
        }
        return p1j.common_hint_device_busy;
    }

    @NotNull
    public final FaceApiRequest getFaceApiRequest() {
        return this.faceApiRequest;
    }

    @NotNull
    public final MutableLiveData<InstallRet> getInstall() {
        return (MutableLiveData) this.install.getValue();
    }

    public final int getPushProgress(int usedProgress, int progress, boolean hasImg) {
        int i = 100 - usedProgress;
        if (hasImg) {
            i = (int) (this.zipImgRatio * i);
        }
        return (int) (((progress / 100.0f) * i) + usedProgress);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceHMInfoViewModel";
    }

    public final void installFace(@NotNull String filePath) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Logger.d(getTAG(), "installFace: path = " + filePath);
        initZipImgRatio(new File(filePath).length());
        getInstallRet().setResult(true);
        getInstallRet().setType(3);
        WearableDeviceModel device = getDevice();
        String mac = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(mac);
        if (huaMiApiCaller != null) {
            huaMiApiCaller.syncSkin(filePath, new ISyncSkinCallback() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.installFace.1
                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onProgress(Progress p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    MutableLiveData<InstallRet> install = FaceHMInfoViewModel.this.getInstall();
                    InstallRet installRet = FaceHMInfoViewModel.this.getInstallRet();
                    installRet.setCodeOrProgress((int) Math.min((p0.progress * 100.0f) / p0.total, 99.0f));
                    install.postValue(installRet);
                }

                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onStart() {
                }

                @Override // com.xiaomi.hm.health.bt.sdk.ISyncSkinCallback
                public void onStop(int p0) {
                    Logger.i(FaceHMInfoViewModel.this.getTAG(), "installFace onStop: " + p0);
                    MutableLiveData<InstallRet> install = FaceHMInfoViewModel.this.getInstall();
                    InstallRet installRet = FaceHMInfoViewModel.this.getInstallRet();
                    if (p0 != 0) {
                        installRet.setResult(false);
                        installRet.setCodeOrProgress(p0);
                    } else {
                        installRet.setCodeOrProgress(100);
                    }
                    install.postValue(installRet);
                }
            });
        }
    }

    public final boolean isBatteryLow() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel device = getDevice();
        String mac = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getMac();
        Intrinsics.checkNotNull(mac);
        HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
        DeviceBatteryInfo batteryLevel = huaMiApiCaller != null ? huaMiApiCaller.getBatteryLevel() : null;
        return batteryLevel != null && batteryLevel.getLevel() <= this.BATTERY_LEVEL_LOW;
    }

    public final boolean isSupportDialFontCustomColor() {
        WearableDeviceModel device = getDevice();
        if (device == null) {
            return false;
        }
        if (DeviceModelExtKt.isL66(device)) {
            return this.supportMultiPhoto;
        }
        return true;
    }

    /* JADX INFO: renamed from: isSupportMultiPhoto, reason: from getter */
    public final boolean getSupportMultiPhoto() {
        return this.supportMultiPhoto;
    }

    public final void loadLocalImg(@Nullable String faceId) {
        if (FaceManager.INSTANCE.isInstalled(faceId)) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new C34231(faceId, null), 3, null);
        }
    }

    @Override // com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getHandler().removeCallbacksAndMessages(null);
    }

    public final void onStorageCheck(@NotNull String path, @NotNull Callback callback) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel device = getDevice();
        String mac = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getMac();
        if (mac == null || mac.length() == 0) {
            callback.onError(101);
            return;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(mac);
        AnyExtKt.io$default(null, new C34241(deviceManagerExtKt.getHuaMiApiCaller(mac), callback, path, null), 1, null);
    }

    public final void reqEdit(@NotNull String skinPath, @NotNull List<String> bgPathList, @Nullable String spiritColor) {
        WearableDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(skinPath, "skinPath");
        Intrinsics.checkNotNullParameter(bgPathList, "bgPathList");
        Logger.i(getTAG(), "reqEdit  param: skinPath = " + skinPath + "; bgPath = " + bgPathList + "; spiritColor = " + spiritColor);
        WearableDeviceModel device = getDevice();
        String mac = (device == null || (deviceInfo = device.getDeviceInfo()) == null) ? null : deviceInfo.getMac();
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        Intrinsics.checkNotNull(mac);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new C34251(bgPathList, this, spiritColor, deviceManagerExtKt.getHuaMiApiCaller(mac), skinPath, null), 3, null);
    }

    public final void requestData(@Nullable String faceId, @NotNull String bgImgMd5) {
        Intrinsics.checkNotNullParameter(bgImgMd5, "bgImgMd5");
        if (faceId == null) {
            setError();
        } else if (!NetworkExtKt.isNetworkAvailable()) {
            setError(22223);
        } else {
            setLoading();
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new C34261(faceId, null), 3, null);
        }
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequest faceApiRequest) {
        Intrinsics.checkNotNullParameter(faceApiRequest, "<set-?>");
        this.faceApiRequest = faceApiRequest;
    }

    public final void setFaceId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Logger.i(getTAG(), "setFaceId: " + id);
    }
}
