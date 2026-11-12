package s53;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import o53.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls53/l;", "T", "Ls53/f;", "", "Lr53/i;", "flows", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l<T> extends f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable<r53.i<T>> f157522d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r53.i<T> f157524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z<T> f157525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r53.i<? extends T> iVar, z<T> zVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157524b = iVar;
            this.f157525c = zVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157524b, this.f157525c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157523a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f157523a = 1;
                if (this.f157524b.collect(this.f157525c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Iterable iterable, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(iterable, (i15 & 2) != 0 ? t13.h.f161748a : gVar, (i15 & 4) != 0 ? -2 : i14, (i15 & 8) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f
    public final Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        z zVar = new z(tVar);
        Iterator<r53.i<T>> it = this.f157522d.iterator();
        while (it.hasNext()) {
            ge1.b.T(tVar, null, null, new a(it.next(), zVar, null), 3);
        }
        return Unit.INSTANCE;
    }

    @Override // s53.f
    public final f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new l(this.f157522d, gVar, i14, aVar);
    }

    @Override // s53.f
    public final q53.v<T> k(o53.b0 b0Var) {
        e23.p eVar = new e(this, null);
        q53.a aVar = q53.a.SUSPEND;
        d0 d0Var = d0.DEFAULT;
        q53.s sVar = new q53.s(o53.y.b(b0Var, this.f157481a), q53.l.a(this.f157482b, 4, aVar));
        sVar.v0(d0Var, sVar, eVar);
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Iterable<? extends r53.i<? extends T>> iterable, t13.g gVar, int i14, q53.a aVar) {
        super(gVar, i14, aVar);
        this.f157522d = iterable;
    }
}
