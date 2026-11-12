package defpackage;

import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public class zzt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f54841c = TimeUnit.SECONDS.toNanos(60);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SecretKey f54843b;
    private SecretKey e;
    private final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    private final SecureRandom h = new SecureRandom();
    private final byte[] g = new byte[32];

    private SecretKey b() {
        this.d.readLock().lock();
        long jC = ClockUtil.c();
        try {
            SecretKey secretKey = this.e;
            if (secretKey != null && jC - this.f54842a < 0) {
                this.d.readLock().unlock();
                return secretKey;
            }
            this.d.readLock().unlock();
            this.d.writeLock().lock();
            try {
                SecretKey secretKey2 = this.e;
                if (secretKey2 != null && jC - this.f54842a < 0) {
                    return secretKey2;
                }
                this.h.nextBytes(this.g);
                this.f54842a = jC + f54841c;
                this.f54843b = this.e;
                SecretKey secretKeyE = aadd.e(this.g, "MAC");
                this.e = secretKeyE;
                return secretKeyE;
            } finally {
                this.d.writeLock().unlock();
            }
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    private SecretKey a() {
        this.d.readLock().lock();
        try {
            return this.f54843b;
        } finally {
            this.d.readLock().unlock();
        }
    }

    private byte[] a(InetSocketAddress inetSocketAddress, aaai aaaiVar, SecretKey secretKey) throws GeneralSecurityException {
        Mac threadLocalMac = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256.getThreadLocalMac();
        threadLocalMac.init(secretKey);
        threadLocalMac.update(inetSocketAddress.getAddress().getAddress());
        int port = inetSocketAddress.getPort();
        threadLocalMac.update((byte) (port >>> 8));
        threadLocalMac.update((byte) port);
        aaaiVar.a(threadLocalMac);
        return threadLocalMac.doFinal();
    }

    public byte[] a(InetSocketAddress inetSocketAddress, aaai aaaiVar) throws GeneralSecurityException {
        return a(inetSocketAddress, aaaiVar, b());
    }

    public byte[] b(InetSocketAddress inetSocketAddress, aaai aaaiVar) throws GeneralSecurityException {
        SecretKey secretKeyA = a();
        if (secretKeyA != null) {
            return a(inetSocketAddress, aaaiVar, secretKeyA);
        }
        return null;
    }
}
