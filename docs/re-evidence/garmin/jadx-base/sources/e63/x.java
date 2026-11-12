package e63;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le63/x;", "Target", "Le63/l;", "Le63/n;", "", "field", "digits", TtmlNode.RUBY_BASE, "<init>", "(Le63/n;II)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class x<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Target, Integer> f63276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63278c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Target, Integer> {
        public a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // e23.l
        public final Integer invoke(Object obj) {
            return (Integer) ((b) this.receiver).b(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(n<? super Target, Integer> nVar, int i14, int i15) {
        nVar.getClass();
        this.f63276a = nVar;
        this.f63277b = i14;
        this.f63278c = i15;
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        return new f63.f(new a(this.f63276a.a()), this.f63277b, this.f63278c);
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        n<Target, Integer> nVar = this.f63276a;
        b<Target, Integer> bVarA = nVar.a();
        String f63256b = nVar.getF63256b();
        bVarA.getClass();
        f63256b.getClass();
        j0 j0Var = j0.f134944a;
        return new g63.o<>(j0Var, p13.x.k(new g63.o(p13.w.c(new g63.g(p13.w.c(new g63.r(this.f63277b, bVarA, f63256b, this.f63278c)))), j0Var), new g63.o(p13.x.k(new g63.q(Marker.ANY_NON_NULL_MARKER), new g63.g(p13.w.c(new g63.x(null, null, bVarA, f63256b, false)))), j0Var), new g63.o(p13.x.k(new g63.q("-"), new g63.g(p13.w.c(new g63.x(null, null, bVarA, f63256b, true)))), j0Var)));
    }

    @Override // e63.l
    public final n<Target, Integer> c() {
        return this.f63276a;
    }
}
