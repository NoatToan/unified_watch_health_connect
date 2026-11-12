package defpackage;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ada implements ClassIntrospector.MixInResolver, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ClassIntrospector.MixInResolver f285a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Map<ahd, Class<?>> f286c;

    public ada(ClassIntrospector.MixInResolver mixInResolver) {
        this.f285a = mixInResolver;
    }

    protected ada(ClassIntrospector.MixInResolver mixInResolver, Map<ahd, Class<?>> map) {
        this.f285a = mixInResolver;
        this.f286c = map;
    }

    public void b(Class<?> cls, Class<?> cls2) {
        if (this.f286c == null) {
            this.f286c = new HashMap();
        }
        this.f286c.put(new ahd(cls), cls2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ada copy() {
        ClassIntrospector.MixInResolver mixInResolver = this.f285a;
        return new ada(mixInResolver == null ? null : mixInResolver.copy(), this.f286c != null ? new HashMap(this.f286c) : null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map<ahd, Class<?>> map;
        ClassIntrospector.MixInResolver mixInResolver = this.f285a;
        Class<?> clsFindMixInClassFor = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        return (clsFindMixInClassFor != null || (map = this.f286c) == null) ? clsFindMixInClassFor : map.get(new ahd(cls));
    }

    public int c() {
        Map<ahd, Class<?>> map = this.f286c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public boolean e() {
        if (this.f286c != null) {
            return true;
        }
        ClassIntrospector.MixInResolver mixInResolver = this.f285a;
        if (mixInResolver == null) {
            return false;
        }
        if (mixInResolver instanceof ada) {
            return ((ada) mixInResolver).e();
        }
        return true;
    }
}
