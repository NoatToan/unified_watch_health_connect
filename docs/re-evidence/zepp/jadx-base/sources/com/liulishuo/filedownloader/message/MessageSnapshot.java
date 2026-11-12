package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.liulishuo.filedownloader.util.FileDownloadUtils;

/* JADX INFO: loaded from: classes18.dex */
public abstract class MessageSnapshot implements com.liulishuo.filedownloader.message.a, Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new a();
    private final int a;
    public boolean isLargeFile;

    public interface IWarnMessageSnapshot {
        MessageSnapshot turnToPending();
    }

    public static class NoFieldException extends IllegalStateException {
        public NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(FileDownloadUtils.formatString("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.getStatus()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        public StartedMessageSnapshot(int i) {
            super(i);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, com.liulishuo.filedownloader.message.a
        public byte getStatus() {
            return (byte) 6;
        }

        public StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    public static class a implements Parcelable.Creator<MessageSnapshot> {
        /* JADX WARN: Code duplicated, block: B:46:0x0094  */
        /* JADX WARN: Code duplicated, block: B:48:0x0097  */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x0097, please report this as an issue */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot createFromParcel(Parcel parcel) {
            MessageSnapshot warnMessageSnapshot;
            MessageSnapshot messageSnapshot;
            boolean z = parcel.readByte() == 1;
            byte b = parcel.readByte();
            if (b == -4) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.WarnMessageSnapshot(parcel) : new SmallMessageSnapshot.WarnMessageSnapshot(parcel);
            } else if (b == -3) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.CompletedSnapshot(parcel) : new SmallMessageSnapshot.CompletedSnapshot(parcel);
            } else if (b == -1) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.ErrorMessageSnapshot(parcel) : new SmallMessageSnapshot.ErrorMessageSnapshot(parcel);
            } else if (b == 1) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.PendingMessageSnapshot(parcel) : new SmallMessageSnapshot.PendingMessageSnapshot(parcel);
            } else if (b == 2) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.ConnectedMessageSnapshot(parcel) : new SmallMessageSnapshot.ConnectedMessageSnapshot(parcel);
            } else if (b == 3) {
                warnMessageSnapshot = z ? new LargeMessageSnapshot.ProgressMessageSnapshot(parcel) : new SmallMessageSnapshot.ProgressMessageSnapshot(parcel);
            } else {
                if (b != 5) {
                    if (b != 6) {
                        messageSnapshot = null;
                    } else {
                        warnMessageSnapshot = new StartedMessageSnapshot(parcel);
                    }
                    if (messageSnapshot != null) {
                        messageSnapshot.isLargeFile = z;
                        return messageSnapshot;
                    }
                    throw new IllegalStateException("Can't restore the snapshot because unknown status: " + ((int) b));
                }
                warnMessageSnapshot = z ? new LargeMessageSnapshot.RetryMessageSnapshot(parcel) : new SmallMessageSnapshot.RetryMessageSnapshot(parcel);
            }
            messageSnapshot = warnMessageSnapshot;
            if (messageSnapshot != null) {
                messageSnapshot.isLargeFile = z;
                return messageSnapshot;
            }
            throw new IllegalStateException("Can't restore the snapshot because unknown status: " + ((int) b));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot[] newArray(int i) {
            return new MessageSnapshot[i];
        }
    }

    public MessageSnapshot(int i) {
        this.a = i;
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.liulishuo.filedownloader.message.a
    public String getEtag() {
        throw new NoFieldException("getEtag", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public String getFileName() {
        throw new NoFieldException("getFileName", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public int getId() {
        return this.a;
    }

    @Override // com.liulishuo.filedownloader.message.a
    public long getLargeSofarBytes() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public long getLargeTotalBytes() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public int getRetryingTimes() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public int getSmallSofarBytes() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public int getSmallTotalBytes() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public abstract /* synthetic */ byte getStatus();

    @Override // com.liulishuo.filedownloader.message.a
    public Throwable getThrowable() {
        throw new NoFieldException("getThrowable", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public boolean isLargeFile() {
        return this.isLargeFile;
    }

    @Override // com.liulishuo.filedownloader.message.a
    public boolean isResuming() {
        throw new NoFieldException("isResuming", this);
    }

    @Override // com.liulishuo.filedownloader.message.a
    public boolean isReusedDownloadedFile() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isLargeFile ? (byte) 1 : (byte) 0);
        parcel.writeByte(getStatus());
        parcel.writeInt(this.a);
    }

    public MessageSnapshot(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
