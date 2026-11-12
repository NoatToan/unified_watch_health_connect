package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljo1/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupNewsPostItem$2", f = "GroupRepo.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.l<t13.d<? super c83.a0<jo1.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f197953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a aVar, String str, String str2, String str3, t13.d<? super f0> dVar) {
        super(1, dVar);
        this.f197950b = aVar;
        this.f197951c = str;
        this.f197952d = str2;
        this.f197953e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f0(this.f197950b, this.f197951c, this.f197952d, this.f197953e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jo1.e>> dVar) {
        return ((f0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197949a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<jo1.e>> i0VarX = this.f197950b.f197887a.x(this.f197951c, this.f197952d, this.f197953e);
        this.f197949a = 1;
        Object objAwait = i0VarX.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
