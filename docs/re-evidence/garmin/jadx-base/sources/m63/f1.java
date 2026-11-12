package m63;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lm63/f1;", "", "T", "Li63/c;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1<T> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f116943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends Annotation> f116944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f116945c;

    public f1(String str, T t7) {
        str.getClass();
        t7.getClass();
        this.f116943a = t7;
        this.f116944b = p13.j0.f134944a;
        this.f116945c = o13.m.a(o13.n.PUBLICATION, new l30.i0(21, str, this));
    }

    @Override // i63.b
    public final T deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e f116202c = getF116202c();
        l63.c cVarC = eVar.c(f116202c);
        int i14 = l63.c.f110557a;
        int iE = cVarC.e(getF116202c());
        if (iE != -1) {
            throw new SerializationException(am.j.h(iE, "Unexpected index "));
        }
        Unit unit = Unit.INSTANCE;
        cVarC.b(f116202c);
        return this.f116943a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return (k63.e) this.f116945c.getValue();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, T t7) {
        t7.getClass();
        fVar.c(getF116202c()).b(getF116202c());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(String str, T t7, Annotation[] annotationArr) {
        this(str, t7);
        str.getClass();
        t7.getClass();
        annotationArr.getClass();
        List<? extends Annotation> listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f116944b = listAsList;
    }
}
