package defpackage;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g00 extends h00 implements ic4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lcm f18409b;

    public g00(jc4 jc4Var) {
        super(jc4Var);
        this.f18409b = new lcm(this);
    }

    public static jc4 j0(Collection<? extends h00> collection) {
        if (collection.isEmpty()) {
            throw new ConfigException.BugOrBroken("can't merge origins on empty list");
        }
        ArrayList arrayList = new ArrayList();
        ocm ocmVarG = null;
        int i = 0;
        for (rc4 rc4Var : collection) {
            if (ocmVarG == null) {
                ocmVarG = rc4Var.g();
            }
            if (!(rc4Var instanceof g00) || ((g00) rc4Var).Z() != iqk.RESOLVED || !((ic4) rc4Var).isEmpty()) {
                arrayList.add(rc4Var.g());
                i++;
            }
        }
        if (i == 0) {
            arrayList.add(ocmVarG);
        }
        return ocm.k(arrayList);
    }

    public static jc4 k0(g00... g00VarArr) {
        return j0(Arrays.asList(g00VarArr));
    }

    public static h00 p0(g00 g00Var, qlh qlhVar, eqk eqkVar) throws h00.c {
        try {
            if (eqkVar == null) {
                qlh qlhVarJ = qlhVar.j();
                h00 h00VarG0 = g00Var.g0(qlhVar.b());
                if (qlhVarJ == null) {
                    return h00VarG0;
                }
                if (h00VarG0 instanceof g00) {
                    return p0((g00) h00VarG0, qlhVarJ, null);
                }
                return null;
            }
            h00 h00VarC = eqkVar.e(qlhVar).c(g00Var);
            if (h00VarC instanceof g00) {
                return p0((g00) h00VarC, qlhVar, null);
            }
            throw new ConfigException.BugOrBroken("resolved object to non-object " + g00Var + " to " + h00VarC);
        } catch (ConfigException.NotResolved e) {
            throw vb4.k(qlhVar, e);
        }
    }

    private static UnsupportedOperationException y0(String str) {
        return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map." + str);
    }

    @Override // java.util.Map
    public void clear() {
        throw y0(CervicalMucusRecord.Appearance.CLEAR);
    }

    public abstract h00 g0(String str);

    @Override // defpackage.h00
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public g00 A(jc4 jc4Var, List<h00> list) {
        return new rb4(jc4Var, list);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public abstract h00 get(Object obj);

    @Override // defpackage.h00
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public abstract g00 H(g00 g00Var);

    @Override // defpackage.h00
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public g00 T(jc4 jc4Var) {
        return n0(Z(), jc4Var);
    }

    public abstract g00 n0(iqk iqkVar, jc4 jc4Var);

    public final h00 o0(String str, qlh qlhVar) {
        try {
            return g0(str);
        } catch (ConfigException.NotResolved e) {
            throw vb4.k(qlhVar, e);
        }
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends rc4> map) {
        throw y0("putAll");
    }

    public h00 q0(qlh qlhVar) {
        try {
            return p0(this, qlhVar, null);
        } catch (h00.c unused) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve happened though we had no ResolveContext in peekPath");
        }
    }

    public h00 r0(qlh qlhVar, eqk eqkVar) throws h00.c {
        return p0(this, qlhVar, eqkVar);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public rc4 put(String str, rc4 rc4Var) {
        throw y0(LifecycleConstantKt.ACTION_PUT);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public abstract g00 V(qlh qlhVar);

    @Override // java.util.Map
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public rc4 remove(Object obj) {
        throw y0("remove");
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public abstract g00 a0(eqk eqkVar) throws h00.c;

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.OBJECT;
    }

    @Override // defpackage.ic4
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public lcm r() {
        return this.f18409b;
    }

    @Override // defpackage.h00, defpackage.tqf
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public g00 t() {
        return this;
    }

    @Override // defpackage.ic4
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g00 d0(fc4 fc4Var) {
        return (g00) super.e(fc4Var);
    }
}
