package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o1a implements y4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<y4d> f28639a;

    public o1a(y4d... y4dVarArr) {
        ArrayList arrayList = new ArrayList(y4dVarArr.length);
        this.f28639a = arrayList;
        Collections.addAll(arrayList, y4dVarArr);
    }

    @Override // defpackage.y4d
    public synchronized void a(String str, int i, boolean z) {
        int size = this.f28639a.size();
        for (int i2 = 0; i2 < size; i2++) {
            y4d y4dVar = this.f28639a.get(i2);
            if (y4dVar != null) {
                try {
                    y4dVar.a(str, i, z);
                } catch (Exception e) {
                    cm8.j("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e);
                }
            }
        }
    }

    public synchronized void b(y4d y4dVar) {
        this.f28639a.add(y4dVar);
    }

    public synchronized void c(y4d y4dVar) {
        this.f28639a.remove(y4dVar);
    }
}
