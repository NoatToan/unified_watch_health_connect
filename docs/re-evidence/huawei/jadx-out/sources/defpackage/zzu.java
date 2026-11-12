package defpackage;

import java.net.DatagramPacket;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.scandium.DatagramFilter;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.ContentType;

/* JADX INFO: loaded from: classes20.dex */
public class zzu implements DatagramFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54845c;

    public zzu() {
        this.f54845c = 0L;
        this.f54844b = 0;
    }

    public zzu(Configuration configuration) {
        long jLongValue = configuration.e(DtlsConfig.o, TimeUnit.NANOSECONDS).longValue();
        this.f54845c = jLongValue;
        int iIntValue = ((Integer) configuration.c(DtlsConfig.t)).intValue();
        this.f54844b = iIntValue;
        if ((jLongValue == 0) ^ (iIntValue == 0)) {
            throw new IllegalArgumentException("DTLS MAC error filter configuration ambig! Use 0 for both, or larger than 0 for both!");
        }
    }

    @Override // org.eclipse.californium.scandium.DatagramFilter
    public boolean onReceiving(DatagramPacket datagramPacket) {
        if (datagramPacket.getLength() < 13) {
            return false;
        }
        byte[] data = datagramPacket.getData();
        int offset = datagramPacket.getOffset();
        ContentType typeByValue = ContentType.getTypeByValue(data[offset]);
        if (typeByValue == null || data[offset + 3] != 0 || (data[offset + 4] & 255) > 1 || data[offset + 5] != 0) {
            return false;
        }
        if (typeByValue == ContentType.HANDSHAKE || typeByValue == ContentType.ALERT) {
            return true;
        }
        return (data[offset + 1] & 255) == 254 && (data[offset + 2] & 255) == 253;
    }

    @Override // org.eclipse.californium.scandium.DatagramFilter
    public boolean onReceiving(aabr aabrVar, aaag aaagVar) {
        if (this.f54844b > 0) {
            Object objL = aaagVar.l();
            if (objL instanceof e) {
                return !((e) objL).c(this.f54844b, aabrVar.i(), this.f54845c);
            }
        }
        return true;
    }

    @Override // org.eclipse.californium.scandium.DatagramFilter
    public boolean onMacError(aabr aabrVar, aaag aaagVar) {
        if (this.f54844b <= 0) {
            return false;
        }
        Object objL = aaagVar.l();
        if (objL == null) {
            objL = new e(aabrVar.i());
            aaagVar.b(objL);
        }
        if (!(objL instanceof e)) {
            return false;
        }
        ((e) objL).a(aabrVar.i(), this.f54845c);
        return false;
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54846c;
        private long d;

        private e(long j) {
            this.d = 0L;
            this.f54846c = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, long j2) {
            d(j, j2);
            this.d++;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(int i, long j, long j2) {
            d(j, j2);
            return this.d > ((long) i);
        }

        private void d(long j, long j2) {
            if (j - this.f54846c > j2) {
                this.d = 0L;
            }
            this.f54846c = j;
        }
    }
}
