package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends ForwardingSource {
    public long abc;
    public boolean bcd;
    public boolean cde;
    public final /* synthetic */ d0 def;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.def = d0Var;
        this.bcd = false;
        this.cde = false;
    }

    public final void abc(String str) {
        b bVar = this.def.abc;
        if (bVar == null || bVar.fed()) {
            return;
        }
        b bVar2 = this.def.abc;
        bVar2.abc(this.abc);
        long jCurrentTimeMillis = System.currentTimeMillis() - bVar2.xyz;
        int i = -1;
        bVar2.uvw = (jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 2147483647L) ? -1 : (int) jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - bVar2.xyz;
        if (jCurrentTimeMillis2 > 0 && jCurrentTimeMillis2 < 2147483647L) {
            i = (int) jCurrentTimeMillis2;
        }
        bVar2.abc(i);
        bVar2.k();
        a aVarN = bVar2.n();
        if (aVarN != null) {
            this.def.abc.l();
            pon.cde.add(new HttpEvent(aVarN, str));
        }
    }

    @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        abc("");
        super.close();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: IOException -> 0x007d, TryCatch #1 {IOException -> 0x007d, blocks: (B:21:0x0057, B:23:0x0063, B:25:0x006f, B:27:0x0077), top: B:37:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #1 {IOException -> 0x007d, blocks: (B:21:0x0057, B:23:0x0063, B:25:0x006f, B:27:0x0077), top: B:37:0x0057 }] */
    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        if (!this.cde) {
            b bVar = this.def.abc;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.def.abc.xyz;
            bVar.jkl((jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 2147483647L) ? -1 : (int) jCurrentTimeMillis);
            this.cde = true;
        }
        try {
            long j2 = super.read(buffer, j);
            this.abc += j2 != -1 ? j2 : 0L;
            if (!this.bcd && this.def.abc != null) {
                d.abc(this.def.abc);
                this.bcd = true;
            }
            if (j2 != -1) {
                try {
                    if (this.abc == this.def.getContentLength() || ((BufferedSource) delegate()).exhausted()) {
                        if (this.def.abc != null) {
                            abc("");
                        }
                    }
                } catch (IOException e) {
                    this.def.abc.def(e.getMessage());
                    abc(v0.abc());
                    throw e;
                }
            } else if (this.def.abc != null) {
                abc("");
            }
            return j2;
        } catch (IOException e2) {
            this.def.abc.abc(this.abc);
            this.def.abc.def(e2.getMessage());
            abc(v0.abc());
            throw e2;
        }
    }
}
