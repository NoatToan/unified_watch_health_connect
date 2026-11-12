package com.mi.fitness.checkupdate.ota;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.checkupdate.ota.HyOtaExecutor;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.qch;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 G2\u00020\u0001:\u0004HIGJB\u001f\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\fJ%\u0010\u0014\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010&R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006K"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor;", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "", "code", "", "error", "(I)V", "", "desc", "(ILjava/lang/String;)V", BroadcastsKt.SILENT_PUSHING_PROGRESS, "complete", "()V", "requestDeviceRequire", "requestStart", "requestReset", "", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DataRequest;", "dataRequestList", "index", "sendData", "(Ljava/util/List;I)V", "type", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$Segment;", "segmentList", "segmentIndex", "Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor$ResultCallback;", "successCallback", "request", "(ILjava/util/List;ILcom/mi/fitness/checkupdate/ota/HyOtaExecutor$ResultCallback;)V", "", "data", "dispatchResponse", "([B)V", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "reset", "otaType", "I", "getOtaType", "()I", "", "mTimeout", "J", "Ljava/io/RandomAccessFile;", "mRandomAccessFile", "Ljava/io/RandomAccessFile;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse;", "mDeviceRequireResponse", "Lcom/mi/fitness/checkupdate/ota/HyOtaModel$DeviceRequireResponse;", "Landroid/util/SparseArray;", "mSegmentMap", "Landroid/util/SparseArray;", "mTotalSegmentSize", "", "mAbort", "Z", "mNeedTimeoutRetry", "mState", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "mDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "Ljava/io/File;", "file", "Lqch;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/io/File;Lqch;)V", "Companion", "ResultCallback", "MyHandler", "OtaDataHandler", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HyOtaExecutor extends OtaExecutor {
    private static final int STATE_IDLE = 0;
    private static final int STATE_PREPARING = 1;
    private static final int STATE_PROGRESSING = 3;
    private static final int STATE_STARTING = 2;
    private static final int TIMEOUT = 1;
    private boolean mAbort;

    @Nullable
    private DataHandlerWrapper mDataHandler;

    @Nullable
    private HyOtaModel.DeviceRequireResponse mDeviceRequireResponse;

    @NotNull
    private final Handler mHandler;
    private boolean mNeedTimeoutRetry;

    @Nullable
    private RandomAccessFile mRandomAccessFile;

    @NotNull
    private final SparseArray<HyOtaModel.Segment> mSegmentMap;
    private int mState;
    private long mTimeout;
    private int mTotalSegmentSize;
    private final int otaType;
    private static final String TAG = HyOtaExecutor.class.getSimpleName();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor$MyHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyHandler extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNull(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleMessage$lambda$0(HyOtaExecutor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mNeedTimeoutRetry = false;
            this$0.requestDeviceRequire();
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            if (msg.what == 1) {
                if (HyOtaExecutor.this.mAbort || !HyOtaExecutor.this.mNeedTimeoutRetry) {
                    HyOtaExecutor.this.error(-3);
                    return;
                }
                Handler handler = HyOtaExecutor.this.mHandler;
                final HyOtaExecutor hyOtaExecutor = HyOtaExecutor.this;
                handler.post(new Runnable() { // from class: wnc
                    @Override // java.lang.Runnable
                    public final void run() {
                        HyOtaExecutor.MyHandler.handleMessage$lambda$0(hyOtaExecutor);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor$OtaDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "<init>", "(Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor;)V", "handleData", "", "did", "", "type", "", "data", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class OtaDataHandler extends DataHandlerWrapper {
        public OtaDataHandler() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
            HyOtaModel.Segment segmentParseSegment;
            byte[] data2;
            byte[] data3;
            Intrinsics.checkNotNullParameter(did, "did");
            if (HyOtaExecutor.this.mAbort || (segmentParseSegment = HyOtaModel.INSTANCE.ParseSegment(data)) == null || (data2 = segmentParseSegment.getData()) == null) {
                return false;
            }
            if (segmentParseSegment.getSegmentFlag() == 0) {
                HyOtaExecutor.this.dispatchResponse(data2);
                HyOtaExecutor.this.mSegmentMap.clear();
                HyOtaExecutor.this.mTotalSegmentSize = 0;
            } else if (segmentParseSegment.getSegmentFlag() == 1) {
                HyOtaExecutor.this.mSegmentMap.clear();
                HyOtaExecutor.this.mTotalSegmentSize = data2.length;
                HyOtaExecutor.this.mSegmentMap.put(segmentParseSegment.getFrameNumber(), segmentParseSegment);
            } else if (segmentParseSegment.getSegmentFlag() == 2) {
                HyOtaExecutor.this.mSegmentMap.put(segmentParseSegment.getFrameNumber(), segmentParseSegment);
                HyOtaExecutor.this.mTotalSegmentSize += data2.length;
            } else {
                if (segmentParseSegment.getSegmentFlag() != 3) {
                    return false;
                }
                HyOtaExecutor.this.mSegmentMap.put(segmentParseSegment.getFrameNumber(), segmentParseSegment);
                HyOtaExecutor.this.mTotalSegmentSize += data2.length;
                byte[] bArr = new byte[HyOtaExecutor.this.mTotalSegmentSize];
                int size = HyOtaExecutor.this.mSegmentMap.size();
                int length = 0;
                for (int i = 0; i < size; i++) {
                    HyOtaModel.Segment segment = (HyOtaModel.Segment) HyOtaExecutor.this.mSegmentMap.valueAt(i);
                    if (segment != null && (data3 = segment.getData()) != null) {
                        System.arraycopy(data3, 0, bArr, length, data3.length);
                        length += data3.length;
                    }
                }
                HyOtaExecutor.this.dispatchResponse(bArr);
                HyOtaExecutor.this.mSegmentMap.clear();
                HyOtaExecutor.this.mTotalSegmentSize = 0;
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor$ResultCallback;", "", "call", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ResultCallback {
        void call();
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ota.HyOtaExecutor$sendData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/mi/fitness/checkupdate/ota/HyOtaExecutor$sendData$1", "Lcom/mi/fitness/checkupdate/ota/HyOtaExecutor$ResultCallback;", "call", "", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C13721 implements ResultCallback {
        final /* synthetic */ List<HyOtaModel.DataRequest> $dataRequestList;
        final /* synthetic */ int $index;

        public C13721(List<HyOtaModel.DataRequest> list, int i) {
            this.$dataRequestList = list;
            this.$index = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void call$lambda$0(HyOtaExecutor this$0, List dataRequestList, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dataRequestList, "$dataRequestList");
            this$0.sendData(dataRequestList, i + 1);
        }

        @Override // com.mi.fitness.checkupdate.ota.HyOtaExecutor.ResultCallback
        public void call() {
            if (HyOtaExecutor.this.mAbort) {
                return;
            }
            Handler handler = HyOtaExecutor.this.mHandler;
            final HyOtaExecutor hyOtaExecutor = HyOtaExecutor.this;
            final List<HyOtaModel.DataRequest> list = this.$dataRequestList;
            final int i = this.$index;
            Runnable runnable = new Runnable() { // from class: xnc
                @Override // java.lang.Runnable
                public final void run() {
                    HyOtaExecutor.C13721.call$lambda$0(hyOtaExecutor, list, i);
                }
            };
            HyOtaModel.DeviceRequireResponse deviceRequireResponse = HyOtaExecutor.this.mDeviceRequireResponse;
            Intrinsics.checkNotNull(deviceRequireResponse);
            handler.postDelayed(runnable, deviceRequireResponse.getPackageInterval());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyOtaExecutor(int i, @NotNull File file, @NotNull qch listener) {
        super(file, listener);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.otaType = i;
        this.mTimeout = 5000L;
        this.mSegmentMap = new SparseArray<>();
        this.mNeedTimeoutRetry = true;
        this.mHandler = new MyHandler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void complete() {
        if (this.mAbort) {
            return;
        }
        getMOtaListener().onComplete();
        reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchResponse(byte[] data) {
        HyOtaModel hyOtaModel;
        Object objParseResponse;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.d(TAG2, "dispatchResponse:" + ByteUtil.byteToString(data));
        if (this.mAbort || (objParseResponse = (hyOtaModel = HyOtaModel.INSTANCE).ParseResponse(data)) == null) {
            return;
        }
        this.mHandler.removeMessages(1);
        if (objParseResponse instanceof HyOtaModel.DeviceRequireResponse) {
            HyOtaModel.DeviceRequireResponse deviceRequireResponse = (HyOtaModel.DeviceRequireResponse) objParseResponse;
            this.mDeviceRequireResponse = deviceRequireResponse;
            Intrinsics.checkNotNull(deviceRequireResponse);
            this.mTimeout = deviceRequireResponse.getTimeout();
            if (this.mState == 1) {
                requestStart();
                return;
            }
            return;
        }
        if (!(objParseResponse instanceof HyOtaModel.DataResponse)) {
            if (objParseResponse instanceof HyOtaModel.ErrorResponse) {
                if (this.mState != 0) {
                    HyOtaModel.ErrorResponse errorResponse = (HyOtaModel.ErrorResponse) objParseResponse;
                    int code = errorResponse.getCode();
                    String desc = errorResponse.getDesc();
                    if (desc == null) {
                        desc = "";
                    }
                    error(code, desc);
                    return;
                }
                return;
            }
            if (objParseResponse instanceof HyOtaModel.ProgressReponse) {
                int i = this.mState;
                if (i == 2 || i == 3) {
                    this.mNeedTimeoutRetry = true;
                    int progress = ((HyOtaModel.ProgressReponse) objParseResponse).getProgress();
                    if (progress >= 100) {
                        requestReset();
                        return;
                    } else {
                        progress(progress);
                        this.mHandler.sendEmptyMessageDelayed(1, this.mTimeout);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i2 = this.mState;
        if (i2 == 2 || i2 == 3) {
            if (this.mRandomAccessFile == null) {
                try {
                    this.mRandomAccessFile = new RandomAccessFile(getMFile(), "rw");
                } catch (Exception e) {
                    e.printStackTrace();
                    error(-1);
                    return;
                }
            }
            try {
                RandomAccessFile randomAccessFile = this.mRandomAccessFile;
                if (randomAccessFile != null && this.mDeviceRequireResponse != null) {
                    Intrinsics.checkNotNull(randomAccessFile);
                    HyOtaModel.DeviceRequireResponse deviceRequireResponse2 = this.mDeviceRequireResponse;
                    Intrinsics.checkNotNull(deviceRequireResponse2);
                    List<HyOtaModel.DataRequest> listBuildDataRequest = hyOtaModel.BuildDataRequest(randomAccessFile, deviceRequireResponse2, (HyOtaModel.DataResponse) objParseResponse);
                    if (!listBuildDataRequest.isEmpty()) {
                        sendData(listBuildDataRequest, 0);
                    } else {
                        error(-1);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                error(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(int code) {
        if (this.mAbort) {
            return;
        }
        getMOtaListener().onError(code, "");
        reset();
    }

    private final void progress(int progress) {
        if (this.mAbort) {
            return;
        }
        this.mState = 3;
        getMOtaListener().onProgress(progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void request(int type, final List<HyOtaModel.Segment> segmentList, final int segmentIndex, final ResultCallback successCallback) {
        if (this.mAbort) {
            return;
        }
        if (segmentIndex >= segmentList.size()) {
            this.mHandler.removeMessages(1);
            this.mHandler.sendEmptyMessageDelayed(1, this.mTimeout);
            if (successCallback != null) {
                successCallback.call();
                return;
            }
            return;
        }
        try {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), type, segmentList.get(segmentIndex).build(), false, new OnSyncCallback() { // from class: com.mi.fitness.checkupdate.ota.HyOtaExecutor.request.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type2, int code) {
                    if (HyOtaExecutor.this.mAbort) {
                        return;
                    }
                    HyOtaExecutor.this.error(code);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type2, SyncResult result) {
                    if (HyOtaExecutor.this.mAbort) {
                        return;
                    }
                    HyOtaExecutor.this.request(type2, segmentList, segmentIndex + 1, successCallback);
                }
            }, 0, 16, (Object) null);
        } catch (Exception e) {
            e.printStackTrace();
            error(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestDeviceRequire() {
        if (this.mAbort) {
            return;
        }
        this.mState = 1;
        request(105, HyOtaModel.INSTANCE.BuildRequest(HyOtaModel.DeviceRequireRequest.INSTANCE.getBody()), 0, null);
    }

    private final void requestReset() {
        if (this.mAbort) {
            return;
        }
        request(105, HyOtaModel.INSTANCE.BuildRequest(HyOtaModel.ResetRequest.INSTANCE.getBody()), 0, new ResultCallback() { // from class: com.mi.fitness.checkupdate.ota.HyOtaExecutor.requestReset.1
            @Override // com.mi.fitness.checkupdate.ota.HyOtaExecutor.ResultCallback
            public void call() {
                HyOtaExecutor.this.complete();
            }
        });
    }

    private final void requestStart() {
        if (this.mAbort) {
            return;
        }
        this.mState = 2;
        request(105, HyOtaModel.INSTANCE.BuildRequest(HyOtaModel.StartRequest.INSTANCE.getBody(this.otaType == 1, getMFile().length())), 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendData(List<HyOtaModel.DataRequest> dataRequestList, int index) {
        if (!this.mAbort && index < dataRequestList.size()) {
            this.mState = 3;
            try {
                request(105, HyOtaModel.INSTANCE.BuildRequest(dataRequestList.get(index).getData()), 0, new C13721(dataRequestList, index));
            } catch (IOException e) {
                e.printStackTrace();
                error(-1);
            }
        }
    }

    public final int getOtaType() {
        return this.otaType;
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void reset() {
        this.mState = 0;
        this.mAbort = true;
        this.mTotalSegmentSize = 0;
        this.mSegmentMap.clear();
        if (this.mDataHandler != null) {
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            DataHandlerWrapper dataHandlerWrapper = this.mDataHandler;
            Intrinsics.checkNotNull(dataHandlerWrapper);
            deviceSyncExtKt.removeDataHandler(105, dataHandlerWrapper);
        }
        this.mHandler.removeMessages(1);
        RandomAccessFile randomAccessFile = this.mRandomAccessFile;
        if (randomAccessFile != null) {
            try {
                Intrinsics.checkNotNull(randomAccessFile);
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mRandomAccessFile = null;
        }
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void start() {
        this.mAbort = false;
        this.mState = 0;
        this.mNeedTimeoutRetry = true;
        this.mDataHandler = new OtaDataHandler();
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        DataHandlerWrapper dataHandlerWrapper = this.mDataHandler;
        Intrinsics.checkNotNull(dataHandlerWrapper);
        deviceSyncExtKt.addDataHandler(105, dataHandlerWrapper);
        requestDeviceRequire();
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void stop() {
        if (this.mAbort) {
            return;
        }
        request(105, HyOtaModel.INSTANCE.BuildRequest(HyOtaModel.PauseRequest.INSTANCE.getBody()), 0, new ResultCallback() { // from class: com.mi.fitness.checkupdate.ota.HyOtaExecutor.stop.1
            @Override // com.mi.fitness.checkupdate.ota.HyOtaExecutor.ResultCallback
            public void call() {
                HyOtaExecutor.this.error(-4);
            }
        });
    }

    private final void error(int code, String desc) {
        if (this.mAbort) {
            return;
        }
        getMOtaListener().onError(code, desc);
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.e(TAG2, "Ota error:" + code + ":" + desc);
        reset();
    }
}
