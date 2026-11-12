package defpackage;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class ec4 extends hc4 implements Serializable {
    private static final long serialVersionUID = 2;
    public final long c;

    public ec4(jc4 jc4Var, long j, String str) {
        super(jc4Var, str);
        this.c = j;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.hc4, defpackage.h00
    public String c0() {
        String strC0 = super.c0();
        return strC0 == null ? Long.toString(this.c) : strC0;
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
    public ec4 T(jc4 jc4Var) {
        return new ec4(jc4Var, this.c, this.f19926b);
    }

    @Override // defpackage.hc4, defpackage.rc4
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public Long x() {
        return Long.valueOf(this.c);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
