package defpackage;

import com.typesafe.config.ConfigException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hc4 extends h00 implements Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19926b;

    public hc4(jc4 jc4Var, String str) {
        super(jc4Var);
        this.f19926b = str;
    }

    public static hc4 k0(jc4 jc4Var, double d, String str) {
        long j = (long) d;
        return ((double) j) == d ? l0(jc4Var, j, str) : new sb4(jc4Var, d, str);
    }

    public static hc4 l0(jc4 jc4Var, long j, String str) {
        return (j > 2147483647L || j < -2147483648L) ? new ec4(jc4Var, j, str) : new cc4(jc4Var, (int) j, str);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public String c0() {
        return this.f19926b;
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        if (!(obj instanceof hc4) || !z(obj)) {
            return false;
        }
        hc4 hc4Var = (hc4) obj;
        if (i0()) {
            return hc4Var.i0() && j0() == hc4Var.j0();
        }
        return !hc4Var.i0() && g0() == hc4Var.g0();
    }

    public abstract double g0();

    public int h0(String str) {
        long jJ0 = j0();
        if (jJ0 >= -2147483648L && jJ0 <= 2147483647L) {
            return (int) jJ0;
        }
        throw new ConfigException.WrongType(g(), str, "32-bit integer", "out-of-range value " + jJ0);
    }

    @Override // defpackage.h00
    public int hashCode() {
        long jJ0 = i0() ? j0() : Double.doubleToLongBits(g0());
        return (int) (jJ0 ^ (jJ0 >>> 32));
    }

    public final boolean i0() {
        return ((double) j0()) == g0();
    }

    public abstract long j0();

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: m0 */
    public abstract Number x();

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof hc4;
    }
}
