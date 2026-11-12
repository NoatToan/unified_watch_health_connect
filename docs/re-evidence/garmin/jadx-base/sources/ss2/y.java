package ss2;

import com.garmin.gfdi.GfdiException;
import com.garmin.gfdi.auth.GarminAuthNotAllowedException;
import java.util.Set;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lss2/y;", "Lss2/q;", "Lrs2/w;", "Lrs2/v;", "messenger", "<init>", "(Lrs2/v;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y implements q, rs2.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f160840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.s f160841c;

    public y(rs2.v vVar) {
        vVar.getClass();
        vVar.d(5101, this);
        this.f160840b = l0.f134950a;
        this.f160841c = gl.b.b();
    }

    @Override // ss2.q
    /* JADX INFO: renamed from: c, reason: from getter */
    public final o53.s getF160841c() {
        return this.f160841c;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        this.f160841c.O(new GfdiException("StubAuthHandler closed", null, 2, null));
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return this.f160840b;
    }

    @Override // ss2.q
    public final void l() {
        this.f160841c.g0(new x(null, null, null));
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) {
        bArr.getClass();
        this.f160841c.O(new GarminAuthNotAllowedException());
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, rs2.v vVar) {
        cVar.getClass();
        vVar.getClass();
    }
}
