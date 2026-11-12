package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<cpf, h00> f18091a = new HashMap();

    public h00 a(cpf cpfVar) {
        return this.f18091a.get(cpfVar);
    }

    public void b(cpf cpfVar, h00 h00Var) {
        this.f18091a.put(cpfVar, h00Var);
    }
}
