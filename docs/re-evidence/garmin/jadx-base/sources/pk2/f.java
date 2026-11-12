package pk2;

import java.util.ArrayList;
import java.util.Comparator;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$createDownloadItems$2", f = "AgentQueueHelper.kt", l = {585}, m = "invokeSuspend")
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ok2.y f138393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f138394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f138395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList<wk2.i> f138396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f138397f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f138398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f138399b;

        public a(c0 c0Var, b bVar) {
            this.f138398a = c0Var;
            this.f138399b = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            wk2.f fVar = (wk2.f) ((o13.p) t14).f128594a;
            b bVar = this.f138399b;
            rs2.c cVar = bVar.f138359b;
            c0 c0Var = this.f138398a;
            return r13.a.b(Integer.valueOf(-cl2.c.f(c0Var, cVar, fVar).ordinal()), Integer.valueOf(-cl2.c.f(c0Var, bVar.f138359b, (wk2.f) ((o13.p) t7).f128594a).ordinal()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ok2.y yVar, c0 c0Var, b bVar, ArrayList<wk2.i> arrayList, p0 p0Var, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f138393b = yVar;
        this.f138394c = c0Var;
        this.f138395d = bVar;
        this.f138396e = arrayList;
        this.f138397f = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f138393b, this.f138394c, this.f138395d, this.f138396e, this.f138397f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objO;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138392a;
        ok2.y yVar = this.f138393b;
        b bVar = this.f138395d;
        c0 c0Var = this.f138394c;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z14 = yVar.f132813g == ok2.y.b.DOWNLOAD_CACHE_PREFERRED;
            rs2.c cVar = bVar.f138359b;
            this.f138392a = 1;
            objO = c0Var.o(cVar, z14, this);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objO = obj;
        }
        for (o13.p pVar : h0.N0((Iterable) objO, new a(c0Var, bVar))) {
            wk2.f fVar = (wk2.f) pVar.f128594a;
            wk2.e eVar = (wk2.e) pVar.f128595b;
            g0 g0VarF = cl2.c.f(c0Var, bVar.f138359b, fVar);
            this.f138396e.add(wk2.i.a.b(wk2.i.f185855a, fVar, eVar, b.e(bVar, g0VarF, fVar, yVar), wk2.m.f185864d, bVar.f138360c.a(), null, g0VarF, 96));
            if (eVar instanceof wk2.o) {
                p0 p0Var = this.f138397f;
                if (p0Var.f105807a < 3 && ((wk2.o) eVar).j()) {
                    p0Var.f105807a++;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
