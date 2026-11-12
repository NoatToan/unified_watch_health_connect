package m20;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$inviteToMessenger$2", f = "ContactsRepo.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<l20.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f116014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f116015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f116016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, String str, long j8, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f116014b = zVar;
        this.f116015c = str;
        this.f116016d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f116014b, this.f116015c, this.f116016d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.c>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116013a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<l20.c>> i0VarM = this.f116014b.f116055a.m(this.f116015c, this.f116016d);
        this.f116013a = 1;
        Object objAwait = i0VarM.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
