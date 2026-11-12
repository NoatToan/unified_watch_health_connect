package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Ln23/z0;", "D", "E", "V", "Ln23/u1;", "", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "Lt23/r0;", "descriptor", "<init>", "(Ln23/i3;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Ln23/i3;Ljava/lang/String;Ljava/lang/String;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0<D, E, V> extends u1<D, E, V> implements k23.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f122668t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f122669r;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln23/z0$a;", "D", "E", "V", "Ln23/h1$d;", "", "Ln23/z0;", "property", "<init>", "(Ln23/z0;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<D, E, V> extends h1.d<V> implements e23.q {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final z0<D, E, V> f122670k;

        public a(z0<D, E, V> z0Var) {
            z0Var.getClass();
            this.f122670k = z0Var;
        }

        @Override // n23.h1.a
        public final h1 F() {
            return this.f122670k;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
        @Override // e23.q
        public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            ((a) this.f122670k.f122669r.getValue()).call(obj, obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i3 i3Var, String str, String str2) {
        super(i3Var, str, str2);
        i3Var.getClass();
        str.getClass();
        str2.getClass();
        this.f122669r = o13.m.a(o13.n.PUBLICATION, new y0(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k23.h
    public final k23.h.a getSetter() {
        return (a) this.f122669r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i3 i3Var, t23.r0 r0Var) {
        super(i3Var, r0Var);
        i3Var.getClass();
        r0Var.getClass();
        this.f122669r = o13.m.a(o13.n.PUBLICATION, new y0(this));
    }
}
