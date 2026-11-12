package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class nc4 extends h00 implements taq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final roo f27769b;
    public final int c;

    public nc4(jc4 jc4Var, roo rooVar) {
        this(jc4Var, rooVar, 0);
    }

    private ConfigException.NotResolved h0() {
        return new ConfigException.NotResolved("need to Config#resolve(), see the API docs for Config#resolve(); substitution not resolved: " + this);
    }

    @Override // defpackage.h00
    public boolean C() {
        return false;
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        sb.append(this.f27769b.toString());
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.UNRESOLVED;
    }

    @Override // defpackage.h00
    public h00 a0(eqk eqkVar) {
        h00 h00VarB;
        eqkVar.g().c(this, gqk.f19241b);
        try {
            try {
                h00VarB = eqkVar.g().b(eqkVar, this.f27769b, this.c);
            } catch (h00.c e) {
                if (!this.f27769b.b()) {
                    throw new ConfigException.UnresolvedSubstitution(g(), this.f27769b + " was part of a cycle of substitutions involving " + e.a(), e);
                }
                h00VarB = null;
            }
            if (h00VarB != null || this.f27769b.b()) {
                eqkVar.g().f(this);
                return h00VarB;
            }
            if (!eqkVar.b().b()) {
                throw new ConfigException.UnresolvedSubstitution(g(), this.f27769b.toString());
            }
            eqkVar.g().f(this);
            return this;
        } catch (Throwable th) {
            eqkVar.g().f(this);
            throw th;
        }
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof nc4) && z(obj) && this.f27769b.equals(((nc4) obj).f27769b);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public nc4 T(jc4 jc4Var) {
        return new nc4(jc4Var, this.f27769b, this.c);
    }

    @Override // defpackage.h00
    public int hashCode() {
        return this.f27769b.hashCode();
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public nc4 V(qlh qlhVar) {
        roo rooVar = this.f27769b;
        return new nc4(g(), rooVar.a(rooVar.c().i(qlhVar)), this.c + qlhVar.e());
    }

    @Override // defpackage.taq
    public Collection<nc4> o() {
        return Collections.singleton(this);
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        throw h0();
    }

    @Override // defpackage.rc4
    public Object x() {
        throw h0();
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof nc4;
    }

    public nc4(jc4 jc4Var, roo rooVar, int i) {
        super(jc4Var);
        this.f27769b = rooVar;
        this.c = i;
    }
}
