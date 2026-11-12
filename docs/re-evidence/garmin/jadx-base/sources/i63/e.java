package i63;

import ch.qos.logback.core.CoreConstants;
import i3.f2;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import o13.n;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"Li63/e;", "", "T", "Lm63/b;", "Lk23/d;", "baseClass", "<init>", "(Lk23/d;)V", "", "", "classAnnotations", "(Lk23/d;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> extends m63.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<T> f91884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends Annotation> f91885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f91886c;

    public e(k23.d<T> dVar) {
        dVar.getClass();
        this.f91884a = dVar;
        this.f91885b = j0.f134944a;
        this.f91886c = o13.m.a(n.PUBLICATION, new f2(this, 5));
    }

    @Override // m63.b
    public final k23.d<T> c() {
        return this.f91884a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return (k63.e) this.f91886c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f91884a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(k23.d<T> dVar, Annotation[] annotationArr) {
        this(dVar);
        dVar.getClass();
        annotationArr.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f91885b = listAsList;
    }
}
