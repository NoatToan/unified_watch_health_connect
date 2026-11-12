package ss2;

import java.util.Set;
import o53.a0;
import o53.c0;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lss2/v;", "Lrs2/h;", "Lrs2/w;", "Lss2/b;", "authDelegate", "<init>", "(Lss2/b;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements rs2.h, rs2.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f160834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u53.d f160835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f160836d;

    public v(b bVar) {
        bVar.getClass();
        this.f160834b = bVar;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f160835c;
        if (dVar != null) {
            c0.d(dVar, "OutOfBandPasskeyHandler closed");
        } else {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) {
        bArr.getClass();
        if (bArr.length < 16) {
            u53.d dVar = this.f160835c;
            if (dVar != null) {
                ft2.d.a(xVar, dVar, rs2.y.LENGTH_ERROR, new byte[0]);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("coroutineScope");
                throw null;
            }
        }
        rs2.c cVar = this.f160836d;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        boolean f92743g = cVar.getF92743g();
        u53.d dVar2 = this.f160835c;
        if (!f92743g) {
            if (dVar2 != null) {
                ft2.d.a(xVar, dVar2, rs2.y.ACK, new byte[]{1});
                return;
            } else {
                p005kotlin.jvm.internal.s.m("coroutineScope");
                throw null;
            }
        }
        if (dVar2 == null) {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
        ft2.d.a(xVar, dVar2, rs2.y.ACK, new byte[]{0});
        rs2.c cVar2 = this.f160836d;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f92737a = cVar2.getF92737a();
        rs2.c cVar3 = this.f160836d;
        if (cVar3 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        String f92739c = cVar3.getF92739c();
        rs2.c cVar4 = this.f160836d;
        if (cVar4 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        if (!p005kotlin.jvm.internal.s.g(cVar4.getF92741e(), f92739c)) {
            f92737a = f92739c;
        }
        if (f92737a != null) {
            this.f160834b.saveOutOfBandPasskey(f92737a, p13.s.k(0, 16, bArr));
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, rs2.v vVar) {
        cVar.getClass();
        vVar.getClass();
        this.f160835c = c0.a(new a0("OutOfBandPasskeyHandler"));
        this.f160836d = cVar;
        ((us2.b) vVar).d(5112, this);
    }
}
