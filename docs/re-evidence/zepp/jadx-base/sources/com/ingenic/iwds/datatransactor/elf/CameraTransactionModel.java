package com.ingenic.iwds.datatransactor.elf;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.utils.IwdsAssert;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class CameraTransactionModel implements DataTransactor.DataTransactorCallback {
    private CameraTransactionModelCallback m_callback;
    private DataTransactor m_transactor;

    public interface CameraTransactionModelCallback {
        void onChannelAvailable(boolean z);

        void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z);

        void onObjectArrived(CameraFrameInfo cameraFrameInfo);

        void onRequestStartPreview(CameraPreviewSizeInfo cameraPreviewSizeInfo);

        void onRequestStartPreviewFailed();

        void onRequestStopPreview();

        void onRequestStopPreviewFailed();

        void onRequestTakePicture();

        void onRequestTakePictureFailed();

        void onSendResult(DataTransactor.DataTransactResult dataTransactResult);

        void onTakePictureDone(CameraFrameInfo cameraFrameInfo);
    }

    public static class RequestStartPreview implements Serializable {
        private static final long serialVersionUID = -5609409498789811806L;
        public CameraPreviewSizeInfo sizeInfo;

        public RequestStartPreview(CameraPreviewSizeInfo cameraPreviewSizeInfo) {
            this.sizeInfo = cameraPreviewSizeInfo;
        }
    }

    public static class RequestStartPreviewFailed implements Serializable {
        private static final long serialVersionUID = 8110140648716686091L;
    }

    public static class RequestStopPreview implements Serializable {
        private static final long serialVersionUID = 2465019248251532073L;
    }

    public static class RequestStopPreviewFailed implements Serializable {
        private static final long serialVersionUID = -4042505134553328080L;
    }

    public static class RequestTakePicture implements Serializable {
        private static final long serialVersionUID = 4843107640702082657L;
    }

    public static class RequestTakePictureFailed implements Serializable {
        private static final long serialVersionUID = -1074205716986715196L;
    }

    public static class TakePictureDone implements Parcelable {
        public static final Parcelable.Creator<TakePictureDone> CREATOR = new Parcelable.Creator<TakePictureDone>() { // from class: com.ingenic.iwds.datatransactor.elf.CameraTransactionModel.TakePictureDone.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TakePictureDone createFromParcel(Parcel parcel) {
                TakePictureDone takePictureDone = new TakePictureDone();
                takePictureDone.frame = CameraFrameInfo.CREATOR.createFromParcel(parcel);
                return takePictureDone;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TakePictureDone[] newArray(int i) {
                return new TakePictureDone[i];
            }
        };
        public CameraFrameInfo frame;

        public TakePictureDone() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.frame.writeToParcel(parcel, i);
        }

        public TakePictureDone(CameraFrameInfo cameraFrameInfo) {
            this.frame = cameraFrameInfo;
        }
    }

    public CameraTransactionModel(Context context, CameraTransactionModelCallback cameraTransactionModelCallback, String str) {
        IwdsAssert.dieIf(this, cameraTransactionModelCallback == null, "Callback is null.");
        this.m_callback = cameraTransactionModelCallback;
        this.m_transactor = new DataTransactor(context, this, str);
    }

    public boolean isStarted() {
        return this.m_transactor.isStarted();
    }

    public void notifyRequestStartPreviewFailed() {
        this.m_transactor.send(new RequestStartPreviewFailed());
    }

    public void notifyRequestStopPreviewFailed() {
        this.m_transactor.send(new RequestStopPreviewFailed());
    }

    public void notifyRequestTakePictureFailed() {
        this.m_transactor.send(new RequestTakePictureFailed());
    }

    public void notifyTakePictureDone(CameraFrameInfo cameraFrameInfo) {
        this.m_transactor.send(new TakePictureDone(cameraFrameInfo));
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        this.m_callback.onChannelAvailable(z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        if (obj instanceof RequestStartPreview) {
            this.m_callback.onRequestStartPreview(((RequestStartPreview) obj).sizeInfo);
            return;
        }
        if (obj instanceof RequestStopPreview) {
            this.m_callback.onRequestStopPreview();
            return;
        }
        if (obj instanceof RequestTakePicture) {
            this.m_callback.onRequestTakePicture();
            return;
        }
        if (obj instanceof RequestTakePictureFailed) {
            this.m_callback.onRequestTakePictureFailed();
            return;
        }
        if (obj instanceof RequestStartPreviewFailed) {
            this.m_callback.onRequestStartPreviewFailed();
            return;
        }
        if (obj instanceof RequestStopPreviewFailed) {
            this.m_callback.onRequestStopPreviewFailed();
        } else if (obj instanceof TakePictureDone) {
            this.m_callback.onTakePictureDone(((TakePictureDone) obj).frame);
        } else {
            this.m_callback.onObjectArrived((CameraFrameInfo) obj);
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
        this.m_callback.onLinkConnected(deviceDescriptor, z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onRecvFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendFileProgress(int i) {
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
        this.m_callback.onSendResult(dataTransactResult);
    }

    public void requestStartPreview(CameraPreviewSizeInfo cameraPreviewSizeInfo) {
        IwdsAssert.dieIf(this, cameraPreviewSizeInfo == null, "Size info is null.");
        this.m_transactor.send(new RequestStartPreview(cameraPreviewSizeInfo));
    }

    public void requestStopPreview() {
        this.m_transactor.send(new RequestStopPreview());
    }

    public void requestTakePicture() {
        this.m_transactor.send(new RequestTakePicture());
    }

    public void send(CameraFrameInfo cameraFrameInfo) {
        this.m_transactor.send(cameraFrameInfo);
    }

    public void start() {
        this.m_transactor.start();
    }

    public void stop() {
        this.m_transactor.stop();
    }
}
