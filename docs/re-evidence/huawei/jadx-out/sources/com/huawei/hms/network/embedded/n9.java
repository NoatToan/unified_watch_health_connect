package com.huawei.hms.network.embedded;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes34.dex */
public final class n9 implements n7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15132b = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f15133a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        t7 t7VarRequest = aVar.request();
        k9 k9Var = (k9) aVar;
        d9 d9VarF = k9Var.f();
        StringBuffer stringBuffer = new StringBuffer("{");
        int i = 0;
        v7 v7Var = null;
        while (true) {
            d9VarF.prepareToConnect(t7VarRequest);
            if (d9VarF.isCanceled()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    v7 v7VarA = k9Var.a(t7VarRequest, d9VarF, null);
                    if (v7Var != null) {
                        v7VarA = v7VarA.D().c(v7Var.D().a((w7) null).a()).a();
                    }
                    v7Var = v7VarA;
                    v8 v8VarA = c8.f14676a.a(v7Var);
                    t7 t7VarA = a(v7Var, v8VarA != null ? v8VarA.b().b() : null);
                    if (t7VarA == null) {
                        if (v8VarA != null && v8VarA.f()) {
                            d9VarF.timeoutEarlyExit();
                        }
                        if (stringBuffer.length() > 1) {
                            return v7Var.D().a(t2.c0, stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length()).append("}").toString()).a();
                        }
                        return v7Var;
                    }
                    u7 u7VarB = t7VarA.b();
                    if (u7VarB != null && u7VarB.isOneShot()) {
                        return v7Var;
                    }
                    f8.a(v7Var.s());
                    if (d9VarF.hasExchange()) {
                        v8VarA.c();
                    }
                    i++;
                    if (i > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    if (v7Var.w() >= 300 && v7Var.w() < 400) {
                        stringBuffer.append(t7VarA.k().h()).append("=").append(v7Var.w()).append(", ");
                    }
                    t7VarRequest = t7VarA;
                } catch (b9 e) {
                    if (!a(e.b(), d9VarF, false, t7VarRequest)) {
                        throw e.a();
                    }
                    d9VarF.exchangeDoneDueToException();
                } catch (IOException e2) {
                    if (!a(e2, d9VarF, true ^ (e2 instanceof q9), t7VarRequest)) {
                        throw e2;
                    }
                    d9VarF.exchangeDoneDueToException();
                }
            } catch (Throwable th) {
                d9VarF.exchangeDoneDueToException();
                throw th;
            }
        }
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean a(IOException iOException, t7 t7Var) {
        u7 u7VarB = t7Var.b();
        return (u7VarB != null && u7VarB.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private boolean a(IOException iOException, d9 d9Var, boolean z, t7 t7Var) {
        if (d9Var.getExchangeFinder() != null && d9Var.getSelection() != null) {
            d9Var.getSelection().h();
        }
        if (this.f15133a.B()) {
            return !(z && a(iOException, t7Var)) && a(iOException, z) && d9Var.canRetry();
        }
        return false;
    }

    private t7 a(v7 v7Var, @Nullable x7 x7Var) throws IOException {
        String strB;
        m7 m7VarD;
        if (v7Var == null) {
            throw new IllegalStateException();
        }
        int iW = v7Var.w();
        String strH = v7Var.H().h();
        if (iW == 307 || iW == 308) {
            if (!strH.equals("GET") && !strH.equals("HEAD")) {
                return null;
            }
        } else {
            if (iW == 401) {
                return this.f15133a.a().b(x7Var, v7Var);
            }
            if (iW == 503) {
                if ((v7Var.E() == null || v7Var.E().w() != 503) && a(v7Var, Integer.MAX_VALUE) == 0) {
                    return v7Var.H();
                }
                return null;
            }
            if (iW == 407) {
                if ((x7Var != null ? x7Var.b() : this.f15133a.x()).type() == Proxy.Type.HTTP) {
                    return this.f15133a.y().b(x7Var, v7Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iW == 408) {
                if (!this.f15133a.B()) {
                    return null;
                }
                u7 u7VarB = v7Var.H().b();
                if (u7VarB != null && u7VarB.isOneShot()) {
                    return null;
                }
                if ((v7Var.E() == null || v7Var.E().w() != 408) && a(v7Var, 0) <= 0) {
                    return v7Var.H();
                }
                return null;
            }
            switch (iW) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f15133a.n() || (strB = v7Var.b("Location")) == null || (m7VarD = v7Var.H().k().d(strB)) == null) {
            return null;
        }
        if (!m7VarD.s().equals(v7Var.H().k().s()) && !this.f15133a.o()) {
            return null;
        }
        t7.a aVarI = v7Var.H().i();
        if (j9.b(strH)) {
            boolean zD = j9.d(strH);
            if (j9.c(strH)) {
                aVarI.a("GET", (u7) null);
            } else {
                aVarI.a(strH, zD ? v7Var.H().b() : null);
            }
            if (!zD) {
                aVarI.b("Transfer-Encoding");
                aVarI.b("Content-Length");
                aVarI.b("Content-Type");
            }
        }
        if (!f8.a(v7Var.H().k(), m7VarD)) {
            aVarI.b("Authorization");
        }
        return aVarI.a(m7VarD).a();
    }

    private int a(v7 v7Var, int i) {
        String strB = v7Var.b(q0.f);
        if (strB == null) {
            return i;
        }
        if (strB.matches("\\d+")) {
            return Integer.valueOf(strB).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public n9(q7 q7Var) {
        this.f15133a = q7Var;
    }
}
