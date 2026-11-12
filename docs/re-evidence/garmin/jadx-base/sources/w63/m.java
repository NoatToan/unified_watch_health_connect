package w63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw63/m;", "Lw63/l;", "delegate", "<init>", "(Lw63/l;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f183389c;

    public m(l lVar) {
        lVar.getClass();
        this.f183389c = lVar;
    }

    @Override // w63.l
    public final f0 a(y yVar) {
        yVar.getClass();
        return this.f183389c.a(yVar);
    }

    @Override // w63.l
    public final void c(y yVar, y yVar2) {
        yVar.getClass();
        yVar2.getClass();
        this.f183389c.c(yVar, yVar2);
    }

    @Override // w63.l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f183389c.close();
    }

    @Override // w63.l
    public final void e(y yVar) {
        yVar.getClass();
        this.f183389c.e(yVar);
    }

    @Override // w63.l
    public final void f(y yVar) {
        yVar.getClass();
        this.f183389c.f(yVar);
    }

    @Override // w63.l
    public final List<y> l(y yVar) {
        yVar.getClass();
        List<y> listL = this.f183389c.l(yVar);
        ArrayList arrayList = new ArrayList();
        for (y yVar2 : listL) {
            yVar2.getClass();
            arrayList.add(yVar2);
        }
        p13.c0.t(arrayList);
        return arrayList;
    }

    @Override // w63.l
    public final k p(y yVar) {
        yVar.getClass();
        k kVarP = this.f183389c.p(yVar);
        if (kVarP == null) {
            return null;
        }
        y yVar2 = kVarP.f183381c;
        if (yVar2 == null) {
            return kVarP;
        }
        boolean z14 = kVarP.f183379a;
        boolean z15 = kVarP.f183380b;
        Long l14 = kVarP.f183382d;
        Long l15 = kVarP.f183383e;
        Long l16 = kVarP.f183384f;
        Long l17 = kVarP.f183385g;
        Map<k23.d<?>, Object> map = kVarP.f183386h;
        map.getClass();
        return new k(z14, z15, yVar2, l14, l15, l16, l17, map);
    }

    @Override // w63.l
    public final j s(y yVar) {
        yVar.getClass();
        return this.f183389c.s(yVar);
    }

    public final String toString() {
        return s0.f105811a.b(getClass()).D() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f183389c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.l
    public f0 v(y yVar, boolean z14) {
        yVar.getClass();
        return this.f183389c.v(yVar, z14);
    }

    @Override // w63.l
    public final g0 w(y yVar) {
        yVar.getClass();
        return this.f183389c.w(yVar);
    }
}
