package defpackage;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class rb4 extends g00 implements taq, dlk {
    public final List<h00> c;

    public class a extends gqk {
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        @Override // defpackage.gqk
        public h00 a(eqk eqkVar) throws h00.c {
            return qb4.h0(eqkVar, rb4.this.c, this.c);
        }
    }

    public rb4(jc4 jc4Var, List<h00> list) {
        super(jc4Var);
        this.c = list;
        if (list.isEmpty()) {
            throw new ConfigException.BugOrBroken("creating empty delayed merge object");
        }
        if (!(list.get(0) instanceof g00)) {
            throw new ConfigException.BugOrBroken("created a delayed merge object not guaranteed to be an object");
        }
        for (h00 h00Var : list) {
            if ((h00Var instanceof qb4) || (h00Var instanceof rb4)) {
                throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
            }
        }
    }

    public static ConfigException F0() {
        return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final rb4 F(h00 h00Var) {
        Y();
        return (rb4) G(this.c, h00Var);
    }

    @Override // defpackage.h00
    public boolean C() {
        return qb4.o0(this.c);
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final rb4 H(g00 g00Var) {
        return F(g00Var);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final rb4 L(taq taqVar) {
        Y();
        return (rb4) P(this.c, taqVar);
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public rb4 n0(iqk iqkVar, jc4 jc4Var) {
        if (iqkVar == Z()) {
            return new rb4(jc4Var, this.c);
        }
        throw new ConfigException.BugOrBroken("attempt to create resolved ConfigDelayedMergeObject");
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public rb4 V(qlh qlhVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<h00> it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().V(qlhVar));
        }
        return new rb4(g(), arrayList);
    }

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> x() {
        throw F0();
    }

    @Override // defpackage.g00
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public rb4 d0(fc4 fc4Var) {
        return (rb4) super.d0(fc4Var);
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        X(sb, i, z, null, oc4Var);
    }

    @Override // defpackage.h00
    public void X(StringBuilder sb, int i, boolean z, String str, oc4 oc4Var) {
        qb4.m0(this.c, sb, i, z, str, oc4Var);
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.UNRESOLVED;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        throw F0();
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        throw F0();
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, rc4>> entrySet() {
        throw F0();
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof rb4) && z(obj) && this.c.equals(((rb4) obj).c);
    }

    @Override // defpackage.g00
    public h00 g0(String str) {
        for (h00 h00Var : this.c) {
            if (!(h00Var instanceof g00)) {
                if (!(h00Var instanceof taq)) {
                    if (h00Var.Z() != iqk.UNRESOLVED) {
                        if (h00Var.C()) {
                            return null;
                        }
                        throw new ConfigException.BugOrBroken("resolved non-object should ignore fallbacks");
                    }
                    if (h00Var instanceof dc4) {
                        return null;
                    }
                    throw new ConfigException.BugOrBroken("Expecting a list here, not " + h00Var);
                }
                throw new ConfigException.NotResolved("Key '" + str + "' is not available at '" + g().a() + "' because value at '" + h00Var.g().a() + "' has not been resolved and may turn out to contain or hide '" + str + "'. Be sure to Config#resolve() before using a config object.");
            }
            h00 h00VarG0 = ((g00) h00Var).g0(str);
            if (h00VarG0 != null) {
                if (h00VarG0.C()) {
                    return h00VarG0;
                }
            } else if (h00Var instanceof taq) {
                throw new ConfigException.BugOrBroken("should not be reached: unmergeable object returned null value");
            }
        }
        throw new ConfigException.BugOrBroken("Delayed merge stack does not contain any unmergeable values");
    }

    @Override // defpackage.h00
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.g00, java.util.Map
    /* JADX INFO: renamed from: i0 */
    public h00 get(Object obj) {
        throw F0();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        throw F0();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        throw F0();
    }

    @Override // defpackage.taq
    public Collection<h00> o() {
        return this.c;
    }

    @Override // defpackage.dlk
    public gqk q(int i) {
        return new a(i);
    }

    @Override // java.util.Map
    public int size() {
        throw F0();
    }

    @Override // defpackage.g00, defpackage.h00
    /* JADX INFO: renamed from: v0 */
    public g00 a0(eqk eqkVar) throws h00.c {
        h00 h00VarN0 = qb4.n0(this, this.c, eqkVar);
        if (h00VarN0 instanceof g00) {
            return (g00) h00VarN0;
        }
        throw new ConfigException.BugOrBroken("somehow brokenly merged an object and didn't get an object, got " + h00VarN0);
    }

    @Override // java.util.Map
    public Collection<rc4> values() {
        throw F0();
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof rb4;
    }
}
