package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import j20.x;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleSSLSocketServer extends SimpleSocketServer {
    private final ServerSocketFactory socketFactory;

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i14, SSLContext sSLContext) {
        super(loggerContext, i14);
        if (sSLContext == null) {
            x.l("SSL context required");
            throw null;
        }
        SSLParametersConfiguration sSLParametersConfiguration = new SSLParametersConfiguration();
        sSLParametersConfiguration.setContext(loggerContext);
        this.socketFactory = new ConfigurableSSLServerSocketFactory(sSLParametersConfiguration, sSLContext.getServerSocketFactory());
    }

    public static void main(String[] strArr) throws Throwable {
        SimpleSocketServer.doMain(SimpleSSLSocketServer.class, strArr);
    }

    @Override // ch.qos.logback.classic.net.SimpleSocketServer
    public ServerSocketFactory getServerSocketFactory() {
        return this.socketFactory;
    }

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i14) {
        this(loggerContext, i14, SSLContext.getDefault());
    }
}
