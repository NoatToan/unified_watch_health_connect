package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Ln23/x0;", "T", "V", "Ln23/r1;", "Lk23/j;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0<T, V> extends r1<T, V> implements k23.j<T, V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f122653t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f122654r;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln23/x0$a;", "T", "V", "Ln23/h1$d;", "Lk23/j$a;", "Ln23/x0;", "property", "<init>", "(Ln23/x0;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T, V> extends h1.d<V> implements k23.j.a<T, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final x0<T, V> f122655k;

        public a(x0<T, V> x0Var) {
            x0Var.getClass();
            this.f122655k = x0Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122655k;
        }

        @Override // e23.p
        public final Unit invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            this.f122655k.p(obj, obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i3 i3Var, String str, String str2, Object obj) {
        super(i3Var, str, str2, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        this.f122654r = o13.m.a(o13.n.PUBLICATION, new w0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.h
    public final k23.h.a getSetter() {
        return (a) this.f122654r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.j
    public final void p(T t7, V v14) throws IllegalCallableAccessException {
        ((a) this.f122654r.getValue()).call(t7, v14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.j, k23.h
    public final k23.j.a getSetter() {
        return (a) this.f122654r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        this.f122654r = o13.m.a(o13.n.PUBLICATION, new w0(this));
    }
}
