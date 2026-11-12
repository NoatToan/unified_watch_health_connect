package qj2;

import com.garmin.device.ble.BleCommunicationException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import pj2.k;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f145053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f145054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f145055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UUID f145056d;

    public b(k kVar, UUID uuid, UUID uuid2) {
        if (kVar == null) {
            h.s("gatt is null");
            throw null;
        }
        if (uuid == null) {
            h.s("service is null");
            throw null;
        }
        if (uuid2 == null) {
            h.s("characteristic is null");
            throw null;
        }
        this.f145054b = kVar;
        this.f145055c = uuid;
        this.f145056d = uuid2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws BleCommunicationException {
        byte[] bArrCopyOfRange;
        int i16 = 0;
        while (i16 < i15) {
            k kVar = this.f145054b;
            int iL = kVar.l();
            int iMin = Math.min(kVar.l(), i15 - i16);
            byte[] bArr2 = this.f145053a;
            if (bArr2 == null || bArr2.length < iL) {
                this.f145053a = new byte[iL];
            }
            if (iMin == iL) {
                bArrCopyOfRange = this.f145053a;
                System.arraycopy(bArr, i16, bArrCopyOfRange, 0, iMin);
            } else {
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i16, i16 + iMin);
            }
            try {
                kVar.j(this.f145055c, this.f145056d, bArrCopyOfRange).get();
                i16 += iMin;
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new BleCommunicationException("Write failed: thread interrupted", e4);
            } catch (ExecutionException e14) {
                Throwable cause = e14.getCause();
                if (!(cause instanceof BleCommunicationException)) {
                    throw new BleCommunicationException("Write failed", cause);
                }
                throw ((BleCommunicationException) cause);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i14) throws BleCommunicationException {
        write(new byte[]{(byte) i14}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws BleCommunicationException {
        write(bArr, 0, bArr.length);
    }
}
