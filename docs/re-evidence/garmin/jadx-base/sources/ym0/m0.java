package ym0;

import am.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmo1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$likeConversationByResourceType$2", f = "GroupRepo.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.l<t13.d<? super c83.a0<mo1.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f198002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f198003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(a aVar, String str, c2 c2Var, String str2, t13.d<? super m0> dVar) {
        super(1, dVar);
        this.f198000b = aVar;
        this.f198001c = str;
        this.f198002d = c2Var;
        this.f198003e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m0(this.f198000b, this.f198001c, this.f198002d, this.f198003e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<mo1.f>> dVar) {
        return ((m0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197999a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<mo1.f>> i0VarC = this.f198000b.f197887a.C(this.f198001c, this.f198002d.name(), this.f198003e);
        this.f197999a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
