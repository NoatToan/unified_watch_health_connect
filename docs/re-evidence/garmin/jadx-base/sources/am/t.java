package am;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lps/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityImages$2", f = "ActivityRepo.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ps.j>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, long j8, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f4194b = mVar;
        this.f4195c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f4194b, this.f4195c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ps.j>>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4193a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<ps.j>>> i0VarK = this.f4194b.f4069a.k(this.f4195c);
        this.f4193a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
