package defpackage;

import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zsd extends bud.a implements b, Iterable<zsd> {
    public boolean A(String str) {
        zsd zsdVarW = w(str);
        return (zsdVarW == null || zsdVarW.F()) ? false : true;
    }

    public int B() {
        return 0;
    }

    public boolean C() {
        return false;
    }

    public final boolean E() {
        return x() == JsonNodeType.BINARY;
    }

    public final boolean F() {
        return x() == JsonNodeType.NULL;
    }

    public final boolean G() {
        return x() == JsonNodeType.NUMBER;
    }

    public boolean H() {
        return false;
    }

    public final boolean I() {
        return x() == JsonNodeType.POJO;
    }

    public final boolean L() {
        return x() == JsonNodeType.STRING;
    }

    public long P() {
        return 0L;
    }

    public Number R() {
        return null;
    }

    public abstract zsd T(String str);

    public String U() {
        return null;
    }

    public int h() {
        return i(0);
    }

    public int i(int i) {
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator<zsd> iterator() {
        return u();
    }

    public long j() {
        return k(0L);
    }

    public long k(long j) {
        return j;
    }

    public abstract String l();

    public BigInteger m() {
        return BigInteger.ZERO;
    }

    public byte[] o() throws IOException {
        return null;
    }

    public BigDecimal q() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends zsd> T r();

    public int size() {
        return 0;
    }

    public double t() {
        return 0.0d;
    }

    public abstract String toString();

    public Iterator<zsd> u() {
        return h04.m();
    }

    public Iterator<Map.Entry<String, zsd>> v() {
        return h04.m();
    }

    public zsd w(String str) {
        return null;
    }

    public abstract JsonNodeType x();

    public boolean z(String str) {
        return w(str) != null;
    }
}
