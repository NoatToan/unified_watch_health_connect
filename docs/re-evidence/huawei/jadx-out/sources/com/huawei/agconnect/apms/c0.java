package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 extends ForwardingSource {
    public long abc;
    public boolean bcd;
    public boolean cde;
    public final /* synthetic */ e0 def;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.def = e0Var;
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
        bVar2.uvw = c.abc(bVar2);
        bVar2.abc(c.abc(bVar2));
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

    /* JADX WARN: Code duplicated, block: B:20:0x005f A[Catch: IOException -> 0x006d, TryCatch #1 {IOException -> 0x006d, blocks: (B:16:0x0047, B:18:0x0053, B:20:0x005f, B:22:0x0067), top: B:32:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: IOException -> 0x006d, TRY_LEAVE, TryCatch #1 {IOException -> 0x006d, blocks: (B:16:0x0047, B:18:0x0053, B:20:0x005f, B:22:0x0067), top: B:32:0x0047 }] */
    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        if (!this.cde) {
            this.def.abc.jkl(c.abc(this.def.abc));
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
                    if (this.abc == this.def.contentLength() || ((BufferedSource) delegate()).exhausted()) {
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
