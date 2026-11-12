package com.ingenic.iwds.common.exception;

import android.os.RemoteException;
import com.ingenic.iwds.datatransactor.FileTransferErrorCode;
import com.ingenic.iwds.uniconnect.UniconnectErrorCode;
import com.ingenic.iwds.utils.IwdsAssert;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsException extends RuntimeException {
    public IwdsException() {
    }

    public static void throwFileTransferException(int i) throws FileTransferException {
        FileTransferException fileTransferException = new FileTransferException("Failed on code: " + i + "(" + FileTransferErrorCode.errorString(i) + ")");
        if (i == 1) {
            fileTransferException.initCause(new FileStatusException());
            throw fileTransferException;
        }
        if (i == 2) {
            fileTransferException.initCause(new SDCardNotMountedException());
            throw fileTransferException;
        }
        if (i != 3) {
            IwdsAssert.dieIf("IwdsException.throwFileTransferException", true, "Implement me.");
            throw fileTransferException;
        }
        fileTransferException.initCause(new SDCardFullException());
        throw fileTransferException;
    }

    public static void throwUniconnectIOException(int i) throws IOException {
        IOException iOException = new IOException("Failed on code: " + i + "(" + UniconnectErrorCode.errorString(i) + ")");
        switch (i) {
            case -6:
                iOException.initCause(new PortDisconnectedException());
                throw iOException;
            case -5:
                iOException.initCause(new PortClosedException());
                throw iOException;
            case -4:
                iOException.initCause(new RemoteException());
                throw iOException;
            case -3:
                iOException.initCause(new PortBusyException());
                throw iOException;
            case -2:
                iOException.initCause(new LinkDisconnectedException());
                throw iOException;
            case -1:
                iOException.initCause(new LinkUnbondedException());
                throw iOException;
            default:
                IwdsAssert.dieIf("IwdsException.throwIOException", true, "Implement me.");
                throw iOException;
        }
    }

    public IwdsException(String str) {
        super(str);
    }

    public IwdsException(Throwable th) {
        super(th);
    }

    public IwdsException(String str, Throwable th) {
        super(str, th);
    }
}
