package q43;

import java.util.Set;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f142817a;

    public w(Set set) {
        this.f142817a = set;
    }

    @Override // e23.a
    public final Object invoke() {
        x xVar = x.f142818a;
        return "This collections cannot be empty! input types: ".concat(h0.k0(this.f142817a, null, null, null, null, 63));
    }
}
