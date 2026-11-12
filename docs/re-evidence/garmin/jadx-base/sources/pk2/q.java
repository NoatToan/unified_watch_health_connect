package pk2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$queueUploadItems$3$1", f = "AgentQueueHelper.kt", l = {494}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f138467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f138468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lk2.x f138469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ok2.y f138470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList<Exception> f138471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList<wk2.i> f138472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet<lk2.a> f138473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Collection<UUID> f138474i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f0 f0Var, b bVar, lk2.x xVar, ok2.y yVar, ArrayList<Exception> arrayList, ArrayList<wk2.i> arrayList2, LinkedHashSet<lk2.a> linkedHashSet, Collection<UUID> collection, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f138467b = f0Var;
        this.f138468c = bVar;
        this.f138469d = xVar;
        this.f138470e = yVar;
        this.f138471f = arrayList;
        this.f138472g = arrayList2;
        this.f138473h = linkedHashSet;
        this.f138474i = collection;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f138467b, this.f138468c, this.f138469d, this.f138470e, this.f138471f, this.f138472g, this.f138473h, this.f138474i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ok2.y yVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138466a;
        b bVar = this.f138468c;
        f0 f0Var = this.f138467b;
        if (i14 == 0) {
            o13.r.b(obj);
            rs2.c cVar = bVar.f138359b;
            this.f138466a = 1;
            if (f0Var.w(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        lk2.x xVar = this.f138469d;
        Iterator<T> it = xVar.f113309a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            yVar = this.f138470e;
            if (!zHasNext) {
                break;
            }
            lk2.a aVar2 = (lk2.a) it.next();
            wk2.f fVarN = cl2.c.n(aVar2);
            rs2.c cVar2 = bVar.f138359b;
            boolean zM = f0Var.m(cVar2, fVarN);
            LinkedHashSet<lk2.a> linkedHashSet = this.f138473h;
            if (zM) {
                g0 g0VarF = cl2.c.f(f0Var, cVar2, fVarN);
                this.f138472g.add(wk2.i.a.a(wk2.i.f185855a, fVarN, f0Var.b(cVar2, fVarN), b.e(bVar, g0VarF, fVarN, yVar), wk2.m.f185865e, bVar.f138360c.a(), null, g0VarF, null, 352));
                linkedHashSet.remove(aVar2);
            } else if (!p005kotlin.jvm.internal.s.g(fVarN.f185843b, "GDXml")) {
                if (!this.f138474i.contains(fVarN.f185842a)) {
                    linkedHashSet.add(aVar2);
                }
            }
        }
        if (yVar != null && this.f138471f.isEmpty()) {
            bVar.f138363f.put(f0Var.getF159941g(), new Integer(xVar.f113310b));
        }
        return Unit.INSTANCE;
    }
}
