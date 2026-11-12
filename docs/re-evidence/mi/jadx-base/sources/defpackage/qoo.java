package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public class qoo implements stc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMap<String, poo> f31700a = new ConcurrentHashMap();

    @Override // defpackage.stc
    public qpe a(String str) {
        poo pooVar = this.f31700a.get(str);
        if (pooVar != null) {
            return pooVar;
        }
        poo pooVar2 = new poo(str);
        poo pooVarPutIfAbsent = this.f31700a.putIfAbsent(str, pooVar2);
        return pooVarPutIfAbsent != null ? pooVarPutIfAbsent : pooVar2;
    }

    public void b() {
        this.f31700a.clear();
    }

    public List<poo> c() {
        return new ArrayList(this.f31700a.values());
    }
}
