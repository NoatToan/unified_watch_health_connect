package com.xiaomi.fitness;

import android.annotation.SuppressLint;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0002\u0010\nJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/TLSCompatSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "delegate", "<init>", "(Ljavax/net/ssl/SSLSocketFactory;)V", "protocol", "", "", "[Ljava/lang/String;", "getDefaultCipherSuites", "()[Ljava/lang/String;", "getSupportedCipherSuites", "createSocket", "Ljava/net/Socket;", "s", b.E, b.F, "", "autoClose", "", "localHost", "Ljava/net/InetAddress;", "localPort", Home.JSON_KEY_ADDRESS, "localAddress", "patch", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TLSCompatSocketFactory extends SSLSocketFactory {

    @NotNull
    private final SSLSocketFactory delegate;

    @SuppressLint({"ObsoleteSdkInt"})
    @NotNull
    private final String[] protocol;

    public TLSCompatSocketFactory(@NotNull SSLSocketFactory delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.protocol = new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"};
    }

    private final Socket patch(Socket s) {
        if (s instanceof SSLSocket) {
            ((SSLSocket) s).setEnabledProtocols(this.protocol);
        }
        return s;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public Socket createSocket(@NotNull Socket s, @NotNull String host, int port, boolean autoClose) throws IOException {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(s, host, port, autoClose);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.delegate.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.delegate.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull String host, int port) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(host, port);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull String host, int port, @NotNull InetAddress localHost, int localPort) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(localHost, "localHost");
        Socket socketCreateSocket = this.delegate.createSocket(host, port, localHost, localPort);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull InetAddress host, int port) throws IOException {
        Intrinsics.checkNotNullParameter(host, "host");
        Socket socketCreateSocket = this.delegate.createSocket(host, port);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public Socket createSocket(@NotNull InetAddress address, int port, @NotNull InetAddress localAddress, int localPort) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(localAddress, "localAddress");
        Socket socketCreateSocket = this.delegate.createSocket(address, port, localAddress, localPort);
        Intrinsics.checkNotNullExpressionValue(socketCreateSocket, "createSocket(...)");
        return patch(socketCreateSocket);
    }
}
