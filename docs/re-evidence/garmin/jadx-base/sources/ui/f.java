package ui;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class f<T> implements l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection<? extends l<T>> f171167b;

    @SafeVarargs
    public f(l<T>... lVarArr) {
        if (lVarArr.length != 0) {
            this.f171167b = Arrays.asList(lVarArr);
        } else {
            vb.h.s("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // ui.l
    public final u<T> a(Context context, u<T> uVar, int i14, int i15) {
        Iterator<? extends l<T>> it = this.f171167b.iterator();
        u<T> uVar2 = uVar;
        while (it.hasNext()) {
            u<T> uVarA = it.next().a(context, uVar2, i14, i15);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(uVarA)) {
                uVar2.b();
            }
            uVar2 = uVarA;
        }
        return uVar2;
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        Iterator<? extends l<T>> it = this.f171167b.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f171167b.equals(((f) obj).f171167b);
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f171167b.hashCode();
    }

    public f(Collection<? extends l<T>> collection) {
        if (!collection.isEmpty()) {
            this.f171167b = collection;
        } else {
            vb.h.s("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }
}
