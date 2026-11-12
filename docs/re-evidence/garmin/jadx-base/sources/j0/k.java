package j0;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k implements Enumeration<Map<String, i>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration<Map<String, i>> f95944a;

    public k(j.b bVar) {
        this.f95944a = Collections.enumeration(bVar.f95937a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f95944a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, i> nextElement() {
        return new HashMap(this.f95944a.nextElement());
    }
}
