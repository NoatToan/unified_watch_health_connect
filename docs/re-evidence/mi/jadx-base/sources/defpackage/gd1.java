package defpackage;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gd1 implements Iterable<AnnotatedMethod> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<ynf, AnnotatedMethod> f18845a;

    public gd1() {
    }

    public gd1(Map<ynf, AnnotatedMethod> map) {
        this.f18845a = map;
    }

    public AnnotatedMethod e(String str, Class<?>[] clsArr) {
        Map<ynf, AnnotatedMethod> map = this.f18845a;
        if (map == null) {
            return null;
        }
        return map.get(new ynf(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotatedMethod> iterator() {
        Map<ynf, AnnotatedMethod> map = this.f18845a;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }
}
