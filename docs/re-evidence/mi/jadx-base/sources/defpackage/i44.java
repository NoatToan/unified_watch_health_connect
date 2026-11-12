package defpackage;

import cn.hutool.core.collection.CollUtil;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class i44 implements ek4<Collection<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f20759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f20760b;

    public i44(Type type) {
        this(type, i5q.n(type));
    }

    @Override // defpackage.ek4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Collection<?> convert(Object obj, Collection<?> collection) throws IllegalArgumentException {
        return (Collection) g4h.e(b(obj), collection);
    }

    public Collection<?> b(Object obj) {
        return CollUtil.b(CollUtil.d(i5q.e(this.f20759a)), obj, this.f20760b);
    }

    public i44(Type type, Type type2) {
        this.f20759a = type;
        this.f20760b = type2;
    }
}
