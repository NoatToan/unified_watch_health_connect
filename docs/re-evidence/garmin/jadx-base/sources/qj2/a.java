package qj2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pj2.k;
import pj2.l;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class a extends FilterInputStream implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f145047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f145048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PipedOutputStream f145049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f145050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f145051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f145052f;

    public a(k kVar, UUID uuid, UUID uuid2) {
        super(new PipedInputStream());
        this.f145051e = false;
        this.f145052f = 0;
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
        this.f145047a = LoggerFactory.getLogger(pj2.a.a("BleCharacteristicInputStream", kVar.getMacAddress(), this));
        this.f145050d = kVar;
        this.f145048b = uuid2;
        this.f145049c = new PipedOutputStream((PipedInputStream) ((FilterInputStream) this).in);
        kVar.a(this, uuid, uuid2);
    }

    @Override // pj2.l
    public final void a(k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
        PipedOutputStream pipedOutputStream = this.f145049c;
        if (this.f145048b.equals(uuid2)) {
            try {
                pipedOutputStream.write(bArr);
                pipedOutputStream.flush();
                if (this.f145051e) {
                    this.f145052f = Math.max(this.f145052f, bArr.length);
                }
            } catch (IOException e4) {
                this.f145047a.error("Failed to write characteristic change", (Throwable) e4);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f145050d.w(this);
        try {
            this.f145049c.close();
        } finally {
            super.close();
        }
    }
}
