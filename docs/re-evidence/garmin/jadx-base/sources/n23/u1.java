package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln23/u1;", "D", "E", "V", "Lk23/o;", "Ln23/h1;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class u1<D, E, V> extends h1<V> implements k23.o<D, E, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f122633q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f122634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f122635p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln23/u1$a;", "D", "E", "V", "Ln23/h1$c;", "Lk23/o$a;", "Ln23/u1;", "property", "<init>", "(Ln23/u1;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<D, E, V> extends h1.c<V> implements k23.o.a<D, E, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final u1<D, E, V> f122636k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u1<D, E, ? extends V> u1Var) {
            u1Var.getClass();
            this.f122636k = u1Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122636k;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
        @Override // e23.p
        public final V invoke(D d14, E e4) {
            return ((a) this.f122636k.f122634o.getValue()).call(d14, e4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(i3 i3Var, String str, String str2) {
        super(i3Var, str, str2, p005kotlin.jvm.internal.e.NO_RECEIVER);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122634o = o13.m.a(nVar, new s1(this));
        this.f122635p = o13.m.a(nVar, new t1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.h1
    public final h1.c I() {
        return (a) this.f122634o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.l.a getGetter() {
        return (a) this.f122634o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final V invoke(D d14, E e4) {
        return ((a) this.f122634o.getValue()).call(d14, e4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.o.a getGetter() {
        return (a) this.f122634o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122634o = o13.m.a(nVar, new s1(this));
        this.f122635p = o13.m.a(nVar, new t1(this));
    }
}
