package ys2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.write.CompressedFileSender$sendFileChunk$2$1$1", f = "CompressedFileSender.kt", l = {}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f199216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f199217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f199218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f199219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<Integer, Integer, Unit> f199220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p0 p0Var, p0 p0Var2, int i14, a aVar, e23.p<? super Integer, ? super Integer, Unit> pVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f199216a = p0Var;
        this.f199217b = p0Var2;
        this.f199218c = i14;
        this.f199219d = aVar;
        this.f199220e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f199216a, this.f199217b, this.f199218c, this.f199219d, this.f199220e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = this.f199219d;
        p0 p0Var = this.f199216a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            p0Var.f105807a += Math.min(this.f199217b.f105807a, this.f199218c);
            p0Var.f105807a = Math.min(p0Var.f105807a, aVar.f199182b.getSize());
            e23.p<Integer, Integer, Unit> pVar = this.f199220e;
            if (pVar != null) {
                pVar.invoke(new Integer(p0Var.f105807a), new Integer(aVar.f199182b.getSize()));
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
