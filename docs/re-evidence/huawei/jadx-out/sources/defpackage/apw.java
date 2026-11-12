package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.reflect.ElementTypesAreNonnullByDefault;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apw implements AnnotatedElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Invokable<?, ?> f673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeToken<?> f674c;
    private final Object d;
    private final ImmutableList<Annotation> e;

    public apw(Invokable<?, ?> invokable, int i, TypeToken<?> typeToken, Annotation[] annotationArr, Object obj) {
        this.f673b = invokable;
        this.f672a = i;
        this.f674c = typeToken;
        this.e = ImmutableList.copyOf(annotationArr);
        this.d = obj;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        Preconditions.checkNotNull(cls);
        UnmodifiableIterator<Annotation> it = this.e.iterator();
        while (it.hasNext()) {
            Annotation next = it.next();
            if (cls.isInstance(next)) {
                return cls.cast(next);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.e.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @CheckForNull
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        Preconditions.checkNotNull(cls);
        return (A) FluentIterable.from(this.e).filter(cls).first().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) FluentIterable.from(this.e).filter(cls).toArray(cls));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof apw)) {
            return false;
        }
        apw apwVar = (apw) obj;
        return this.f672a == apwVar.f672a && this.f673b.equals(apwVar.f673b);
    }

    public int hashCode() {
        return this.f672a;
    }

    public String toString() {
        return this.f674c + " arg" + this.f672a;
    }
}
