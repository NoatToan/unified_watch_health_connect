package com.ingenic.iwds.utils.serializable;

import android.os.FileObserver;
import android.os.Parcelable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ingenic.iwds.common.exception.FileTransferException;
import com.ingenic.iwds.common.exception.IwdsException;
import com.ingenic.iwds.os.SafeParcelable;
import com.ingenic.iwds.uniconnect.Connection;
import com.ingenic.iwds.utils.IwdsAssert;
import com.ingenic.iwds.utils.IwdsLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes18.dex */
public final class TransferAdapter {

    public interface TransferAdapterCallback {
        void onFileTransferError(FileTransferException fileTransferException);

        void onRecvFileInterrupted(int i);

        void onRecvFileProgress(long j, long j2);

        void onSendFileInterrupted(int i);

        void onSendFileProgress(long j, long j2);
    }

    public static class a extends FileObserver {
        private TransferAdapterCallback a;

        public a(String str, TransferAdapterCallback transferAdapterCallback) {
            super(str);
            this.a = transferAdapterCallback;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 512 && i != 1024 && i != 2048) {
                        return;
                    }
                } else if (new File(str).canRead()) {
                    return;
                }
            }
            try {
                IwdsException.throwFileTransferException(1);
            } catch (FileTransferException e) {
                this.a.onFileTransferError(e);
                stopWatching();
            }
        }

        @Override // android.os.FileObserver
        public void startWatching() {
            super.startWatching();
            IwdsLog.v("TransferAdapter", "FileObserver: startWatching");
        }

        @Override // android.os.FileObserver
        public void stopWatching() {
            super.stopWatching();
            IwdsLog.v("TransferAdapter", "FileObserver: stopWatching");
        }
    }

    private static void a(RandomAccessFile randomAccessFile, a aVar) throws FileTransferException {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
        if (aVar != null) {
            aVar.stopWatching();
        }
        IwdsException.throwFileTransferException(1);
    }

    public static <T1 extends Parcelable, T2 extends SafeParcelable> Object recv(Connection connection, Parcelable.Creator<T1> creator, SafeParcelable.Creator<T2> creator2, TransferAdapterCallback transferAdapterCallback) throws FileTransferException, IOException {
        IwdsAssert.dieIf("TransferAdapter", connection == null, "connection == null");
        IwdsAssert.dieIf("TransferAdapter", transferAdapterCallback == null, "callback == null");
        return ByteArrayUtils.decode(connection, creator, creator2, transferAdapterCallback);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0214, please report this as an issue */
    public static void send(Connection connection, File file, int i, TransferAdapterCallback transferAdapterCallback) throws FileTransferException, IOException {
        RandomAccessFile randomAccessFile;
        long j;
        long j2;
        int i2;
        int i3 = i;
        IwdsAssert.dieIf("TransferAdapter", connection == null, "connection == null");
        IwdsAssert.dieIf("TransferAdapter", transferAdapterCallback == null, "callback == null");
        if (file == null) {
            IwdsLog.e("TransferAdapter", "Unable to send file: file == null");
            a(null, null);
        }
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            IwdsLog.e("TransferAdapter", "Unable to send file: file not exist or is dir or empty!");
            a(null, null);
        }
        if (!file.canRead()) {
            IwdsLog.e("TransferAdapter", "Unable to send file: file can not be read!");
            a(null, null);
        }
        a aVar = new a(file.getAbsolutePath(), transferAdapterCallback);
        aVar.startWatching();
        long length = file.length();
        long j3 = 65536;
        int i4 = (int) (length % j3 == 0 ? length / j3 : (length / j3) + 1);
        if (i3 > i4 || i3 < 0) {
            IwdsLog.e("TransferAdapter", "Unable to send file: invalid index!");
            a(null, aVar);
        }
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(new byte[]{30});
        byte[] bytes = file.getName().getBytes(Charset.forName("UTF-8"));
        int length2 = bytes.length;
        outputStream.write(new byte[]{(byte) ((length2 & (-16777216)) >> 24), (byte) ((length2 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16), (byte) ((length2 & 65280) >> 8), (byte) ((length2 & 255) >> 0)});
        outputStream.write(bytes);
        outputStream.write(new byte[]{(byte) (((-72057594037927936L) & length) >> 56), (byte) ((71776119061217280L & length) >> 48), (byte) ((280375465082880L & length) >> 40), (byte) ((1095216660480L & length) >> 32), (byte) ((4278190080L & length) >> 24), (byte) ((length & 16711680) >> 16), (byte) ((length & 65280) >> 8), (byte) ((length & 255) >> 0)});
        outputStream.write(new byte[]{(byte) ((i3 & (-16777216)) >> 24), (byte) ((16711680 & i3) >> 16), (byte) ((65280 & i3) >> 8), (byte) ((i3 & 255) >> 0)});
        long j4 = i3 * 65536;
        long j5 = length - j4;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException unused) {
            IwdsLog.e("TransferAdapter", "Unable to send file: file not exist, the file may be moved or deleted!");
            a(null, aVar);
            randomAccessFile = null;
        }
        try {
            int iSkipBytes = randomAccessFile.skipBytes((int) j4);
            j = j5;
            if (iSkipBytes != j4) {
                try {
                    IwdsLog.e("TransferAdapter", "Unable to send file: skip error: writeSofar=" + j4 + ", skiped=" + iSkipBytes + ", the file contents may be modified!");
                    a(randomAccessFile, aVar);
                } catch (IOException unused2) {
                    IwdsLog.e("TransferAdapter", "Unable to send file: file skip io exception, the file may be moved or deleted!");
                    a(randomAccessFile, aVar);
                }
            }
        } catch (IOException unused3) {
            j = j5;
        }
        byte[] bArr = new byte[65536];
        long j6 = j;
        long j7 = 0;
        while (j6 > j7) {
            long j8 = j4;
            int iMin = (int) Math.min(j3, j6);
            int i5 = iMin;
            int i6 = 0;
            while (i5 > 0) {
                try {
                    int i7 = randomAccessFile.read(bArr, i6, i5);
                    j2 = j3;
                    if (i7 < 0) {
                        try {
                            IwdsLog.e("TransferAdapter", "Unable to send file: file read error, readBytes = " + i7 + ", the file contents may be modified!s");
                            a(randomAccessFile, aVar);
                        } catch (IOException unused4) {
                            IwdsLog.e("TransferAdapter", "Unable to send file: file read io exception, the file may be moved or deleted!");
                            a(randomAccessFile, aVar);
                            outputStream.write(bArr, 0, iMin);
                            i2 = i3 + 1;
                            if (i3 > i4) {
                                IwdsLog.e("TransferAdapter", "Unable to send file: index out of bound:, current=" + i2 + ", total=" + i4 + ", the file contents may be modified!s");
                                a(randomAccessFile, aVar);
                            }
                            long j9 = iMin;
                            long j10 = j8 + j9;
                            j6 -= j9;
                            transferAdapterCallback.onSendFileProgress(j10, length);
                            i3 = i2;
                            j3 = j2;
                            j7 = 0;
                            j4 = j10;
                        }
                    }
                    i5 -= i7;
                    i6 += i7;
                    j3 = j2;
                } catch (IOException unused5) {
                    j2 = j3;
                }
            }
            j2 = j3;
            try {
                outputStream.write(bArr, 0, iMin);
                i2 = i3 + 1;
                if (i3 > i4) {
                    IwdsLog.e("TransferAdapter", "Unable to send file: index out of bound:, current=" + i2 + ", total=" + i4 + ", the file contents may be modified!s");
                    a(randomAccessFile, aVar);
                }
                long j11 = iMin;
                long j12 = j8 + j11;
                j6 -= j11;
                transferAdapterCallback.onSendFileProgress(j12, length);
                i3 = i2;
                j3 = j2;
                j7 = 0;
                j4 = j12;
            } catch (IOException e) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused6) {
                }
                IwdsLog.e("TransferAdapter", "Unable to send file: connection io exception");
                transferAdapterCallback.onSendFileInterrupted(i3);
                throw e;
            }
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
        aVar.stopWatching();
    }

    public static <T1 extends Parcelable, T2 extends SafeParcelable> void send(Connection connection, Object obj, Parcelable.Creator<T1> creator, SafeParcelable.Creator<T2> creator2) throws IOException {
        IwdsAssert.dieIf("TransferAdapter", connection == null, "connection == null");
        IwdsAssert.dieIf("TransferAdapter", obj == null, "object == null");
        connection.getOutputStream().write(ByteArrayUtils.encode(obj, creator, creator2));
    }
}
