package ch.qos.logback.core.net.ssl;

/* JADX INFO: loaded from: classes7.dex */
public interface SSLConfigurable {
    String[] getDefaultCipherSuites();

    String[] getDefaultProtocols();

    String[] getSupportedCipherSuites();

    String[] getSupportedProtocols();

    void setEnabledCipherSuites(String[] strArr);

    void setEnabledProtocols(String[] strArr);

    void setNeedClientAuth(boolean z14);

    void setWantClientAuth(boolean z14);
}
