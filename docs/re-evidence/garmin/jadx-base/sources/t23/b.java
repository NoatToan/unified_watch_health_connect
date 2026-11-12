package t23;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends t23.a, z {

    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED
    }

    @Override // t23.a, t23.l
    b a();

    b f0(e eVar, a0 a0Var, p pVar, a aVar);

    a getKind();

    void i0(Collection<? extends b> collection);

    @Override // t23.a
    Collection<? extends b> o();
}
