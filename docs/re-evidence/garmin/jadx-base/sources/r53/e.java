package r53;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, d2 = {"Lr53/e;", "T", "Ls53/f;", "Lq53/v;", "channel", "", "consume", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Lq53/v;ZLt13/g;ILq53/a;)V", "Lh53/a;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<T> extends s53.f<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f150563f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q53.v<T> f150564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f150565e;

    public /* synthetic */ e(q53.v vVar, boolean z14, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(vVar, z14, (i15 & 4) != 0 ? t13.h.f161748a : gVar, (i15 & 8) != 0 ? -3 : i14, (i15 & 16) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f, r53.i
    public final Object collect(j<? super T> jVar, t13.d<? super Unit> dVar) {
        if (this.f157482b != -3) {
            Object objCollect = super.collect(jVar, dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
        boolean z14 = this.f150565e;
        if (z14 && f150563f.getAndSet(this, 1) == 1) {
            vb.h.z("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objA = n.a(jVar, this.f150564d, z14, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // s53.f
    public final String g() {
        return "channel=" + this.f150564d;
    }

    @Override // s53.f
    public final Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        Object objA = n.a(new s53.z(tVar), this.f150564d, this.f150565e, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // s53.f
    public final s53.f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new e(this.f150564d, this.f150565e, gVar, i14, aVar);
    }

    @Override // s53.f
    public final i<T> j() {
        return new e(this.f150564d, this.f150565e, null, 0, null, 28, null);
    }

    @Override // s53.f
    public final q53.v<T> k(o53.b0 b0Var) {
        if (!this.f150565e || f150563f.getAndSet(this, 1) != 1) {
            return this.f157482b == -3 ? this.f150564d : super.k(b0Var);
        }
        vb.h.z("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(q53.v<? extends T> vVar, boolean z14, t13.g gVar, int i14, q53.a aVar) {
        super(gVar, i14, aVar);
        this.f150564d = vVar;
        this.f150565e = z14;
    }
}
