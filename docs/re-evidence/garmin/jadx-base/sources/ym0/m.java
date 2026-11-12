package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lda1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$flagImage$2", f = "GroupRepo.kt", l = {370}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<da1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da1.a f197998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, String str, da1.a aVar2, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f197996b = aVar;
        this.f197997c = str;
        this.f197998d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f197996b, this.f197997c, this.f197998d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<da1.b>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197995a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<da1.b>> i0VarA = this.f197996b.f197888b.A(this.f197997c, this.f197998d);
        this.f197995a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
