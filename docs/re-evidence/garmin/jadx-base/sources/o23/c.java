package o23;

import java.io.IOException;
import java.util.Map;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f128700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f128701b;

    public c(Class cls, Map map) {
        this.f128700a = cls;
        this.f128701b = map;
    }

    @Override // e23.a
    public final Object invoke() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('@');
        sb3.append(this.f128700a.getCanonicalName());
        h0.j0(this.f128701b.entrySet(), sb3, ", ", "(", ")", e.f128707a, 48);
        return sb3.toString();
    }
}
