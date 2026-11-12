package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$acceptGroupInvitation$2", f = "GroupRepo.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super c83.a0<Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm0.a f197905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, wm0.a aVar2, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f197903b = aVar;
        this.f197904c = str;
        this.f197905d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f197903b, this.f197904c, this.f197905d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Boolean>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197902a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Boolean>> i0VarN = this.f197903b.f197888b.n(this.f197904c, this.f197905d);
        this.f197902a = 1;
        Object objAwait = i0VarN.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
