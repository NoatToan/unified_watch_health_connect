package defpackage;

import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class qc4 extends h00 implements Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31355b;

    public qc4(jc4 jc4Var, String str) {
        super(jc4Var);
        this.f31355b = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        sb.append(oc4Var.d() ? wb4.e(this.f31355b) : wb4.f(this.f31355b));
    }

    @Override // defpackage.h00
    public String c0() {
        return this.f31355b;
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public qc4 T(jc4 jc4Var) {
        return new qc4(jc4Var, this.f31355b);
    }

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public String x() {
        return this.f31355b;
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.STRING;
    }
}
