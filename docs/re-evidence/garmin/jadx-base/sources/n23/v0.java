package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln23/v0;", "V", "Ln23/o1;", "Lk23/i;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0<V> extends o1<V> implements k23.i<V> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f122640t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f122641r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/v0$a;", "R", "Ln23/h1$d;", "Lk23/i$a;", "Ln23/v0;", "property", "<init>", "(Ln23/v0;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<R> extends h1.d<R> implements k23.i.a<R> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final v0<R> f122642k;

        public a(v0<R> v0Var) {
            v0Var.getClass();
            this.f122642k = v0Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122642k;
        }

        @Override // e23.l
        public final Unit invoke(Object obj) throws IllegalCallableAccessException {
            this.f122642k.set(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i3 i3Var, String str, String str2, Object obj) {
        super(i3Var, str, str2, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        this.f122641r = o13.m.a(o13.n.PUBLICATION, new u0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.h
    public final k23.h.a getSetter() {
        return (a) this.f122641r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.i
    public final void set(V v14) throws IllegalCallableAccessException {
        ((a) this.f122641r.getValue()).call(v14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.i, k23.h
    public final k23.i.a getSetter() {
        return (a) this.f122641r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        this.f122641r = o13.m.a(o13.n.PUBLICATION, new u0(this));
    }
}
