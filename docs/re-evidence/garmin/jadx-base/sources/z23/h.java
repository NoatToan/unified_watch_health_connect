package z23;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements o33.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f202048b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.f f202049a;

    private h(x33.f fVar) {
        this.f202049a = fVar;
    }

    @Override // o33.b
    public final x33.f getName() {
        return this.f202049a;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a(x33.f fVar, Object obj) {
            Class<?> cls = obj.getClass();
            List<k23.d<? extends Object>> list = f.f202041a;
            if (Enum.class.isAssignableFrom(cls)) {
                return new y(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new i(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new j(fVar, (Object[]) obj);
            }
            return obj instanceof Class ? new u(fVar, (Class) obj) : new a0(fVar, obj);
        }

        private a() {
        }
    }

    public /* synthetic */ h(x33.f fVar, p005kotlin.jvm.internal.j jVar) {
        this(fVar);
    }
}
