package c83;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes11.dex */
public class u extends v<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f25835a;

    public u(v vVar) {
        this.f25835a = vVar;
    }

    @Override // c83.v
    public final void a(y yVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i14 = 0; i14 < length; i14++) {
            this.f25835a.a(yVar, Array.get(obj, i14));
        }
    }
}
