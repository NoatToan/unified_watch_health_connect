package defpackage;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class cc4 extends hc4 implements Serializable {
    private static final long serialVersionUID = 2;
    public final int c;

    public cc4(jc4 jc4Var, int i, String str) {
        super(jc4Var, str);
        this.c = i;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.hc4, defpackage.h00
    public String c0() {
        String strC0 = super.c0();
        return strC0 == null ? Integer.toString(this.c) : strC0;
    }

    @Override // defpackage.hc4
    public double g0() {
        return this.c;
    }

    @Override // defpackage.hc4
    public long j0() {
        return this.c;
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public cc4 T(jc4 jc4Var) {
        return new cc4(jc4Var, this.c, this.f19926b);
    }

    @Override // defpackage.hc4, defpackage.rc4
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Integer x() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
