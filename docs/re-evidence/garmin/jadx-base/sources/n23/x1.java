package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln23/x1;", "V", "Ln23/h1;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class x1<V> extends h1<V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f122656p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f122657o;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln23/x1$a;", "V", "Ln23/h1$c;", "Ln23/x1;", "property", "<init>", "(Ln23/x1;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<V> extends h1.c<V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final x1<V> f122658k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x1<? extends V> x1Var) {
            x1Var.getClass();
            this.f122658k = x1Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122658k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        this.f122657o = o13.m.a(o13.n.PUBLICATION, new w1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.h1
    public final h1.c I() {
        return (a) this.f122657o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.l.a getGetter() {
        return (a) this.f122657o.getValue();
    }
}
