package u9;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import e23.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import k23.d;
import p005kotlin.Metadata;
import w9.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu9/b;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f169508a = new LinkedHashMap();

    public final <T extends u1> void a(d<T> dVar, l<? super CreationExtras, ? extends T> lVar) {
        dVar.getClass();
        lVar.getClass();
        LinkedHashMap linkedHashMap = this.f169508a;
        if (linkedHashMap.containsKey(dVar)) {
            o2.c.h(46, "A `initializer` with the same `clazz` has already been added: ", dVar.getF16141b());
        } else {
            linkedHashMap.put(dVar, new c(dVar, lVar));
        }
    }

    public final a b() {
        g gVar = g.f183576a;
        Collection collectionValues = this.f169508a.values();
        gVar.getClass();
        collectionValues.getClass();
        c[] cVarArr = (c[]) collectionValues.toArray(new c[0]);
        return new a((c[]) Arrays.copyOf(cVarArr, cVarArr.length));
    }
}
