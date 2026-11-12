package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.StickerWatchFaceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.StickerEventDTO;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import defpackage.coq;
import defpackage.mgg;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes38.dex */
public class StickerConfigTask {
    private static final int STICKER_SET_RESULT_SUCCESS = 0;
    private static final String TAG = "StickerConfigTask";
    private static final String TAG_RELEASE = "DEVMGR_StickerConfigTask";
    private static final int TRANSFER_FILE_DISCONNECT_FAIL = 1990141001;
    private static final int TRANSFER_FILE_SUCCESS = 207;
    private ResultCallback<TransferProgressResp> mH5Callback;
    private volatile boolean mIsStop;
    private final String mStickerBinFilePath;
    private List<StickerEventDTO.FileInfo> mStickerTransferList = new ArrayList();
    private final ResultCallback<List<StickerEventDTO.FileInfo>> mDeviceFileRequestCallback = new ResultCallback<List<StickerEventDTO.FileInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerConfigTask.1
        @Override // com.huawei.networkclient.ResultCallback
        public void onSuccess(List<StickerEventDTO.FileInfo> list) {
            if (StickerConfigTask.this.mIsStop) {
                return;
            }
            StickerConfigTask.this.mStickerTransferList = list;
            if (coq.d(list)) {
                LogUtil.a(StickerConfigTask.TAG, "buildNeedTransferFileListener file is empty");
            } else {
                ReleaseLogUtil.d(StickerConfigTask.TAG_RELEASE, "need transfer size:", Integer.valueOf(list.size()));
                StickerConfigTask.this.transferFileListToDevice(0);
            }
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            LogUtil.j(StickerConfigTask.TAG, "buildNeedTransferFileListener error:", ExceptionUtils.c(th));
        }
    };
    private final ResultCallback<StickerEventDTO> mSetStickerResultCallback = new ResultCallback<StickerEventDTO>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerConfigTask.2
        @Override // com.huawei.networkclient.ResultCallback
        public void onSuccess(StickerEventDTO stickerEventDTO) {
            if (StickerConfigTask.this.mIsStop) {
                return;
            }
            StickerWatchFaceService.getInstance().unregisterNeedTransferFileListener();
            if (Objects.equals(0, stickerEventDTO.getResult())) {
                LogUtil.a(StickerConfigTask.TAG, "setStickerWatchFaceInfo success");
                TransferProgressResp transferProgressResp = new TransferProgressResp();
                transferProgressResp.setResultCode(0);
                StickerConfigTask.this.mH5Callback.onSuccess(transferProgressResp);
            } else {
                ReleaseLogUtil.e(StickerConfigTask.TAG_RELEASE, "setStickerWatchFaceInfo device report error");
                StickerConfigTask.this.mH5Callback.onFailure(new DiyThrowable(-1, "setStickerWatchFaceInfo fail"));
            }
            StickerConfigTask.this.stop();
        }

        @Override // com.huawei.networkclient.ResultCallback
        public void onFailure(Throwable th) {
            if (StickerConfigTask.this.mIsStop) {
                return;
            }
            StickerWatchFaceService.getInstance().unregisterNeedTransferFileListener();
            ReleaseLogUtil.e(StickerConfigTask.TAG_RELEASE, "setStickerWatchFaceInfo error:", ExceptionUtils.c(th));
            StickerConfigTask.this.stop();
        }
    };

    public StickerConfigTask(String str) {
        this.mStickerBinFilePath = str;
    }

    public void start(DeviceInfo deviceInfo, String str, ResultCallback<TransferProgressResp> resultCallback) {
        this.mH5Callback = resultCallback;
        StickerWatchFaceService.getInstance().registerNeedTransferFileListener(this.mDeviceFileRequestCallback);
        StickerWatchFaceService.getInstance().setStickerWatchFaceInfo(deviceInfo, str, this.mSetStickerResultCallback);
    }

    public void stop() {
        LogUtil.a(TAG, "stop enter");
        this.mIsStop = true;
        if (!coq.d(this.mStickerTransferList)) {
            this.mStickerTransferList.clear();
        }
        StickerWatchFaceService.getInstance().unregisterNeedTransferFileListener();
    }

    public boolean isStop() {
        return this.mIsStop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transferFileListToDevice(final int i) {
        if (this.mIsStop) {
            return;
        }
        List<StickerEventDTO.FileInfo> list = this.mStickerTransferList;
        if (list == null || i >= list.size()) {
            LogUtil.a(TAG, "transferFileListToDevice all file transfer success");
            return;
        }
        final int size = list.size();
        final String fileName = list.get(i).getFileName();
        final String str = this.mStickerBinFilePath + fileName;
        LogUtil.a(TAG, "transferFileListToDevice start transfer file:", fileName, " index:", Integer.valueOf(i));
        DeviceInfo deviceInfoD = mgg.d(TAG);
        if (deviceInfoD == null || deviceInfoD.getDeviceConnectState() != 2) {
            ReleaseLogUtil.d(TAG_RELEASE, "transferFileListToDevice device not connected");
            this.mH5Callback.onFailure(new DiyThrowable(10001, "device disconnect"));
            stop();
            return;
        }
        StickerHiWearEngineManager.getInstance().sendStickerImageToDevice(str, new SendCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.StickerConfigTask.3
            private long lastProgress = 0;

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i2) {
                StickerConfigTask.this.onSendResult(i2, i, str);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                if (j == this.lastProgress) {
                    return;
                }
                this.lastProgress = j;
                if (j % 5 == 0) {
                    LogUtil.a(StickerConfigTask.TAG, "transferFileListToDevice onFileTransferState, progress: ", Long.valueOf(j), " fileName: ", fileName);
                }
                StickerConfigTask.this.onSendProgress(size, i, (int) j);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str2) {
                LogUtil.a(StickerConfigTask.TAG, "transferFileListToDevice response file transferWay: ", str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSendProgress(int i, int i2, int i3) {
        if (this.mIsStop) {
            return;
        }
        TransferProgressResp transferProgressResp = new TransferProgressResp();
        transferProgressResp.setResultCode(2);
        transferProgressResp.setTotalNum(i);
        transferProgressResp.setCurrentNum(i2 + 1);
        transferProgressResp.setCurrentProgress(StickerWatchFaceManager.getInstance().calculateProgress(i, i2, i3));
        this.mH5Callback.onSuccess(transferProgressResp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSendResult(int i, int i2, String str) {
        ReleaseLogUtil.d(TAG_RELEASE, "send sticker errorCode: ", Integer.valueOf(i));
        if (this.mIsStop) {
            return;
        }
        deleteTempFile(str);
        if (i == TRANSFER_FILE_DISCONNECT_FAIL) {
            LogUtil.j(TAG, "transferFileListToDevice disconnect");
            stop();
        } else if (i != 207) {
            LogUtil.j(TAG, "transferFileListToDevice error at: ", Integer.valueOf(i2));
            this.mH5Callback.onFailure(new DiyThrowable(-1, "file transfer error"));
            stop();
        } else {
            LogUtil.a(TAG, "transferFileListToDevice at: ", Integer.valueOf(i2));
            transferFileListToDevice(i2 + 1);
        }
    }

    private void deleteTempFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (!file.delete()) {
                LogUtil.j(TAG, "Failed to delete sticker file: ", file.getName());
            } else {
                LogUtil.a(TAG, "Successfully delete sticker file: ", file.getName());
            }
        }
    }
}
