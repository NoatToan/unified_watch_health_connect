package gl2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import pk2.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent$uploadFile$4$1", f = "ConnectUploadAgent.kt", l = {570}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f77966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<x> f77968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f77969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs2.c f77970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hy2.c f77971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f77972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wk2.n f77973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r0<x> r0Var, a aVar, rs2.c cVar, hy2.c cVar2, String str, wk2.n nVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f77968c = r0Var;
        this.f77969d = aVar;
        this.f77970e = cVar;
        this.f77971f = cVar2;
        this.f77972g = str;
        this.f77973h = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f77968c, this.f77969d, this.f77970e, this.f77971f, this.f77972g, this.f77973h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r0<x> r0Var;
        T t7;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77967b;
        if (i14 == 0) {
            r.b(obj);
            wk2.f f205152b = this.f77973h.getF205152b();
            r0<x> r0Var2 = this.f77968c;
            this.f77966a = r0Var2;
            this.f77967b = 1;
            a.b bVar = a.f77873r;
            Object objY = this.f77969d.y(this.f77970e, this.f77971f, this.f77972g, f205152b, this);
            if (objY == aVar) {
                return aVar;
            }
            r0Var = r0Var2;
            t7 = objY;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var = this.f77966a;
            r.b(obj);
            t7 = obj;
        }
        r0Var.f105810a = t7;
        return Unit.INSTANCE;
    }
}
