package sk;

import com.dsi.ant.channel.AntCommandFailedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class a implements nk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f159482f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f159483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ok.b f159484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f159486d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f159487e = false;

    /* JADX INFO: renamed from: sk.a$a, reason: collision with other inner class name */
    public class C3022a {
        public C3022a() {
        }

        public final void a(bk.l lVar, dk.a aVar) {
            synchronized (a.this.f159486d) {
                try {
                    Objects.toString(lVar);
                    ak.k.b(aVar.b());
                    ok.b bVar = a.this.f159484b;
                    if (bVar != null) {
                        bVar.a(lVar, aVar);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public a(d dVar, String str) {
        C3022a c3022a = new C3022a();
        this.f159483a = dVar;
        this.f159485c = str;
        dVar.f159509c = c3022a;
    }

    @Override // nk.b
    public final void a(ok.b bVar) {
        synchronized (this.f159486d) {
            this.f159484b = bVar;
        }
    }

    @Override // nk.b
    public final void b(byte[] bArr) throws AntCommandFailedException {
        ak.k.b(bArr);
        d dVar = this.f159483a;
        d.c cVar = dVar.f159515i;
        d.c cVar2 = d.c.ACTIVE;
        if (cVar == cVar2 || dVar.f159510d == cVar2 || dVar.f159521o) {
            throw new AntCommandFailedException(ck.k.ACKNOWLEDGED_DATA, new xj.b(wj.c.TRANSFER_IN_PROGRESS));
        }
        dVar.f159521o = true;
        dVar.f159507a.c(b.f159489a, b.f159495g, bArr);
    }

    @Override // nk.b
    public final void c() {
        synchronized (this.f159486d) {
            this.f159484b = null;
        }
    }

    @Override // nk.b
    public final ak.c d() {
        return ak.c.TRACKING;
    }

    @Override // nk.b
    public final void e(byte[] bArr) throws AntCommandFailedException {
        this.f159484b.a(bk.l.CHANNEL_EVENT, e.a(ak.e.TRANSFER_TX_START));
        ak.k.b(bArr);
        d dVar = this.f159483a;
        d.c cVar = dVar.f159515i;
        d.c cVar2 = d.c.IDLE;
        if (cVar != cVar2 || dVar.f159510d != cVar2) {
            throw new AntCommandFailedException(ck.k.BURST_TRANSFER_DATA, new xj.b(wj.c.TRANSFER_IN_PROGRESS));
        }
        dVar.e();
        int length = bArr.length % 8;
        if (length > 0) {
            bArr = Arrays.copyOf(bArr, (8 - length) + bArr.length);
        }
        while (true) {
            int length2 = bArr.length;
            ArrayList<byte[]> arrayList = dVar.f159520n;
            if (length2 <= 18) {
                arrayList.add(bArr);
                dVar.d();
                return;
            } else {
                arrayList.add(Arrays.copyOfRange(bArr, 0, 18));
                bArr = Arrays.copyOfRange(bArr, 18, bArr.length);
            }
        }
    }

    public final void f(byte[] bArr) {
        ak.k.b(bArr);
        this.f159483a.f159507a.c(b.f159489a, b.f159493e, bArr);
        this.f159484b.a(bk.l.CHANNEL_EVENT, e.a(ak.e.TX));
    }

    @Override // nk.b
    public final void release() {
        if (this.f159487e) {
            return;
        }
        this.f159487e = true;
        this.f159483a.getClass();
    }
}
