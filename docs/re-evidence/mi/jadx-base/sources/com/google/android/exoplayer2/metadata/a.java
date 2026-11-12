package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.e;
import defpackage.a1a;
import defpackage.itf;
import defpackage.jtf;
import defpackage.mtf;
import defpackage.rk1;
import defpackage.rkk;
import defpackage.stf;
import defpackage.wlq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e implements Handler.Callback {
    public final jtf m;
    public final stf n;
    public final Handler o;
    public final mtf p;
    public itf q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7986r;
    public boolean s;
    public long t;
    public long u;
    public Metadata v;

    public a(stf stfVar, Looper looper, jtf jtfVar) {
        super(5);
        this.n = (stf) rk1.e(stfVar);
        this.o = looper == null ? null : wlq.w(looper, this);
        this.m = (jtf) rk1.e(jtfVar);
        this.p = new mtf();
        this.u = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.e
    public void F() {
        this.v = null;
        this.u = -9223372036854775807L;
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.e
    public void H(long j, boolean z) {
        this.v = null;
        this.u = -9223372036854775807L;
        this.f7986r = false;
        this.s = false;
    }

    @Override // com.google.android.exoplayer2.e
    public void L(Format[] formatArr, long j, long j2) {
        this.q = this.m.b(formatArr[0]);
    }

    public final void O(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.e(); i++) {
            Format formatU = metadata.d(i).U();
            if (formatU == null || !this.m.a(formatU)) {
                list.add(metadata.d(i));
            } else {
                itf itfVarB = this.m.b(formatU);
                byte[] bArr = (byte[]) rk1.e(metadata.d(i).N());
                this.p.h();
                this.p.s(bArr.length);
                ((ByteBuffer) wlq.j(this.p.c)).put(bArr);
                this.p.u();
                Metadata metadataA = itfVarB.a(this.p);
                if (metadataA != null) {
                    O(metadataA, list);
                }
            }
        }
    }

    public final void P(Metadata metadata) {
        Handler handler = this.o;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            Q(metadata);
        }
    }

    public final void Q(Metadata metadata) {
        this.n.onMetadata(metadata);
    }

    public final boolean R(long j) {
        boolean z;
        Metadata metadata = this.v;
        if (metadata == null || this.u > j) {
            z = false;
        } else {
            P(metadata);
            this.v = null;
            this.u = -9223372036854775807L;
            z = true;
        }
        if (this.f7986r && this.v == null) {
            this.s = true;
        }
        return z;
    }

    public final void S() {
        if (this.f7986r || this.v != null) {
            return;
        }
        this.p.h();
        a1a a1aVarB = B();
        int iM = M(a1aVarB, this.p, 0);
        if (iM != -4) {
            if (iM == -5) {
                this.t = ((Format) rk1.e(a1aVarB.f517b)).p;
                return;
            }
            return;
        }
        if (this.p.n()) {
            this.f7986r = true;
            return;
        }
        mtf mtfVar = this.p;
        mtfVar.i = this.t;
        mtfVar.u();
        Metadata metadataA = ((itf) wlq.j(this.q)).a(this.p);
        if (metadataA != null) {
            ArrayList arrayList = new ArrayList(metadataA.e());
            O(metadataA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.v = new Metadata(arrayList);
            this.u = this.p.e;
        }
    }

    @Override // defpackage.rkk
    public int a(Format format) {
        if (this.m.a(format)) {
            return rkk.t(format.E == null ? 4 : 2);
        }
        return rkk.t(0);
    }

    @Override // com.google.android.exoplayer2.s
    public boolean b() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Q((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.s
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.s
    public void l(long j, long j2) {
        boolean zR = true;
        while (zR) {
            S();
            zR = R(j);
        }
    }

    public a(stf stfVar, Looper looper) {
        this(stfVar, looper, jtf.f23121a);
    }
}
