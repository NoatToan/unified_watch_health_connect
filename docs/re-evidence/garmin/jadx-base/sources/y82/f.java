package y82;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly82/f;", "KeyType", "ValueType", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f<KeyType, ValueType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f195241a = new LinkedHashMap();

    public final void a(Object obj, u82.f fVar) {
        LinkedHashMap linkedHashMap = this.f195241a;
        z1 z1Var = (z1) linkedHashMap.get(obj);
        if (z1Var != null) {
            while (!z1Var.b(z1Var.getValue(), fVar)) {
            }
        } else {
            linkedHashMap.put(obj, q2.a(fVar));
        }
    }
}
