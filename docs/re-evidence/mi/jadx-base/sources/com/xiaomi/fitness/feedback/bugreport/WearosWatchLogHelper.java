package com.xiaomi.fitness.feedback.bugreport;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.feedback.bugreport.WearosWatchLogHelper;
import com.xiaomi.fitness.feedback.data.DownloadFileModel;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.feedback.request.BaseFeedbackRequest;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.util.FeedbackFileUtils;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/WearosWatchLogHelper;", "", "<init>", "()V", "PREFIX", "", "SUFFIX", "TAG", "LOG_DIR", "getLOG_DIR", "()Ljava/lang/String;", "startUploadFirmwareLog", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "startLoadUploadUrl", "startLoadDownLoadUrl", "uploadUrl", "objName", "writeDownLoadUrlToFile", "", "downloadUrl", "sendUploadUrlToWatch", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WearosWatchLogHelper {

    @NotNull
    private final String PREFIX = "libai";

    @NotNull
    private final String SUFFIX = "zip";

    @NotNull
    private final String TAG = "[FeedBack]";

    @NotNull
    private final String LOG_DIR = "log";

    private final void sendUploadUrlToWatch(String uploadUrl) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        GetDeviceLog.INSTANCE.sendUploadUrlToWatch(wearableDeviceModel, uploadUrl);
    }

    private final void startLoadDownLoadUrl(final String uploadUrl, String objName) {
        BaseFeedbackRequest.getDownloadFileInfo$default(new FeedbackRequest(), objName, new Function1() { // from class: q8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearosWatchLogHelper.startLoadDownLoadUrl$lambda$4(this.f31237a, uploadUrl, (DownloadFileModel.DownloadFileResult) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLoadDownLoadUrl$lambda$4(WearosWatchLogHelper this$0, String uploadUrl, DownloadFileModel.DownloadFileResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uploadUrl, "$uploadUrl");
        Intrinsics.checkNotNullParameter(it, "it");
        String url = it.getUrl();
        if (url != null) {
            Logger.i(this$0.TAG, "FeedbackRequest getDownloadFileInfo success " + it.getUrl());
            if (this$0.writeDownLoadUrlToFile(url)) {
                this$0.sendUploadUrlToWatch(uploadUrl);
            } else {
                Logger.i(this$0.TAG, "writeDownLoadUrlToFile:failure");
            }
        }
        return Unit.INSTANCE;
    }

    private final void startLoadUploadUrl(CoroutineScope scope) {
        BaseFeedbackRequest.getUploadFileInfo$default(new FeedbackRequest(), scope, this.PREFIX, this.SUFFIX, new Function1() { // from class: p8r
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WearosWatchLogHelper.startLoadUploadUrl$lambda$2(this.f30129a, (UploadFileModel.UploadFileResult) obj);
            }
        }, null, 16, null);
    }

    public static /* synthetic */ void startLoadUploadUrl$default(WearosWatchLogHelper wearosWatchLogHelper, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        wearosWatchLogHelper.startLoadUploadUrl(coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startLoadUploadUrl$lambda$2(WearosWatchLogHelper this$0, UploadFileModel.UploadFileResult fileModle) {
        String obj_name;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileModle, "fileModle");
        String url = fileModle.getUrl();
        if (url != null && (obj_name = fileModle.getObj_name()) != null) {
            this$0.startLoadDownLoadUrl(url, obj_name);
        }
        return Unit.INSTANCE;
    }

    private final boolean writeDownLoadUrlToFile(String downloadUrl) {
        File file = new File(FeedbackFileUtils.INSTANCE.getExternalFilesDirPath(ApplicationExtKt.getApplication(), this.LOG_DIR), "miwear.log");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            byte[] bytes = downloadUrl.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    @NotNull
    public final String getLOG_DIR() {
        return this.LOG_DIR;
    }

    public final void startUploadFirmwareLog(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        startLoadUploadUrl(scope);
    }
}
