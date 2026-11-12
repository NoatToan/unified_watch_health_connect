package k12;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lda1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo$flagProfileImage$2", f = "UsersRepo.kt", l = {128}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<da1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da1.a f102359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d dVar, String str, da1.a aVar, t13.d<? super n> dVar2) {
        super(1, dVar2);
        this.f102357b = dVar;
        this.f102358c = str;
        this.f102359d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f102357b, this.f102358c, this.f102359d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<da1.b>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102356a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<da1.b>> i0VarN = this.f102357b.f102316a.n(this.f102358c, this.f102359d);
        this.f102356a = 1;
        Object objAwait = i0VarN.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
