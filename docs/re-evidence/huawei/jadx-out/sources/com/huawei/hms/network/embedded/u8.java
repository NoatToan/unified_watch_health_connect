package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes34.dex */
public final class u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a7> f15450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15451b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15452c;
    public boolean d;

    public boolean a(IOException iOException) {
        this.d = true;
        if (!this.f15452c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }

    public a7 a(SSLSocket sSLSocket) throws IOException {
        a7 a7Var;
        int i = this.f15451b;
        int size = this.f15450a.size();
        while (true) {
            if (i >= size) {
                a7Var = null;
                break;
            }
            a7Var = this.f15450a.get(i);
            i++;
            if (a7Var.a(sSLSocket)) {
                this.f15451b = i;
                break;
            }
        }
        if (a7Var != null) {
            this.f15452c = b(sSLSocket);
            c8.f14676a.a(a7Var, sSLSocket, this.d);
            return a7Var;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.d + ", modes=" + this.f15450a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f15451b; i < this.f15450a.size(); i++) {
            if (this.f15450a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public u8(List<a7> list) {
        this.f15450a = list;
    }
}
