package ci;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/k;", "", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fi.d f27615a;

    public abstract j a();

    public final j b() {
        fi.d dVar = this.f27615a;
        if (dVar == null) {
            return a();
        }
        j jVarA = a();
        j jVarB = dVar.b();
        jVarB.getClass();
        j jVar = jVarA;
        while (true) {
            j jVar2 = jVar.f27614a;
            if (jVar2 == null) {
                jVar.f27614a = jVarB;
                return jVarA;
            }
            jVar = jVar2;
        }
    }
}
