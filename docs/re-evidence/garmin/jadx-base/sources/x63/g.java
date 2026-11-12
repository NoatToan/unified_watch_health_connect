package x63;

import d53.w;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx63/g;", "Lw63/c;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends w63.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f189328a;

    public g(Socket socket) {
        socket.getClass();
        this.f189328a = socket;
    }

    @Override // w63.c
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // w63.c
    public final void timedOut() {
        Socket socket = this.f189328a;
        try {
            socket.close();
        } catch (AssertionError e4) {
            Logger logger = l.f189351a;
            boolean z14 = false;
            if (e4.getCause() != null) {
                String message = e4.getMessage();
                if (message != null ? w.z(message, "getsockname failed", false) : false) {
                    z14 = true;
                }
            }
            if (!z14) {
                throw e4;
            }
            l.f189351a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e14) {
            l.f189351a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e14);
        }
    }
}
