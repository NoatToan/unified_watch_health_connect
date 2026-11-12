package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Member;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Ln23/r1;", "T", "V", "Lk23/n;", "Ln23/h1;", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class r1<T, V> extends h1<V> implements k23.n<T, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f122591q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f122592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f122593p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln23/r1$a;", "T", "V", "Ln23/h1$c;", "Lk23/n$a;", "Ln23/r1;", "property", "<init>", "(Ln23/r1;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T, V> extends h1.c<V> implements k23.n.a<T, V> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final r1<T, V> f122594k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r1<T, ? extends V> r1Var) {
            r1Var.getClass();
            this.f122594k = r1Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122594k;
        }

        @Override // e23.l
        public final V invoke(T t7) {
            return this.f122594k.get(t7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(i3 i3Var, String str, String str2, Object obj) {
        super(i3Var, str, str2, obj);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122592o = o13.m.a(nVar, new p1(this));
        this.f122593p = o13.m.a(nVar, new q1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // n23.h1
    public final h1.c I() {
        return (a) this.f122592o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.n
    public final V get(T t7) {
        return ((a) this.f122592o.getValue()).call(t7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.n
    public final Object getDelegate(T t7) {
        return G((Member) this.f122593p.getValue(), t7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.l.a getGetter() {
        return (a) this.f122592o.getValue();
    }

    @Override // e23.l
    public final V invoke(T t7) {
        return get(t7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.l
    public final k23.n.a getGetter() {
        return (a) this.f122592o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        o13.n nVar = o13.n.PUBLICATION;
        this.f122592o = o13.m.a(nVar, new p1(this));
        this.f122593p = o13.m.a(nVar, new q1(this));
    }
}
