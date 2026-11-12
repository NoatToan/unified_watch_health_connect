package nc;

import java.util.Iterator;
import java.util.List;
import lc.m0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.o0;
import p3.c2;
import p3.x3;
import s1.t1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1<lc.v> f125348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f125349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.v f125350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0<String> f125351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<List<lc.v>> f125352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f125353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(t1<lc.v> t1Var, m0 m0Var, lc.v vVar, o0<String> o0Var, x3<? extends List<lc.v>> x3Var, e eVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f125348a = t1Var;
        this.f125349b = m0Var;
        this.f125350c = vVar;
        this.f125351d = o0Var;
        this.f125352e = x3Var;
        this.f125353f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f125348a, this.f125349b, this.f125350c, this.f125351d, this.f125352e, this.f125353f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[LOOP:1: B:15:0x005c->B:27:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[EDGE_INSN: B:32:0x00aa->B:28:0x00aa BREAK  A[LOOP:1: B:15:0x005c->B:27:0x00a7], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        t1<lc.v> t1Var = this.f125348a;
        lc.v vVarA = t1Var.f155744a.a();
        c2 c2Var = t1Var.f155747d;
        if (p005kotlin.jvm.internal.s.g(vVarA, c2Var.getF182175a()) && (this.f125349b.f111904b.i() == null || p005kotlin.jvm.internal.s.g(c2Var.getF182175a(), this.f125350c))) {
            Iterator<T> it = this.f125352e.getF182175a().iterator();
            while (it.hasNext()) {
                this.f125353f.b().b((lc.v) it.next());
            }
            o0<String> o0Var = this.f125351d;
            long[] jArr = o0Var.f134862a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj2 = o0Var.f134863b[i17];
                                float f14 = o0Var.f134864c[i17];
                                if (!p005kotlin.jvm.internal.s.g((String) obj2, ((lc.v) c2Var.getF182175a()).f111886f)) {
                                    o0Var.e(i17);
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
