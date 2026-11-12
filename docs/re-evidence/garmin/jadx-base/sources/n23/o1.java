package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln23/o1;", "V", "Lk23/m;", "Ln23/h1;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class o1<V> extends h1<V> implements k23.m<V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f122546q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f122547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f122548p;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/o1$a;", "R", "Ln23/h1$c;", "Lk23/m$a;", "Ln23/o1;", "property", "<init>", "(Ln23/o1;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<R> extends h1.c<R> implements k23.m.a<R> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final o1<R> f122549k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(o1<? extends R> o1Var) {
            o1Var.getClass();
            this.f122549k = o1Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122549k;
        }

        @Override // e23.a
        public final R invoke() {
            return this.f122549k.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i3 i3Var, String str, String str2, Object obj) {
        super(i3Var, str, str2, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122547o = o13.m.a(nVar, new m1(this));
        this.f122548p = o13.m.a(nVar, new n1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.h1
    public final h1.c I() {
        return (a) this.f122547o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.m
    public final V get() {
        return (V) ((a) this.f122547o.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.m
    public final Object getDelegate() {
        return this.f122548p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.l.a getGetter() {
        return (a) this.f122547o.getValue();
    }

    @Override // e23.a
    public final V invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.m.a getGetter() {
        return (a) this.f122547o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122547o = o13.m.a(nVar, new m1(this));
        this.f122548p = o13.m.a(nVar, new n1(this));
    }
}
