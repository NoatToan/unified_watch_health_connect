package m20;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$updateContactList$3", f = "ContactsRepo.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<l20.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f116052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l20.r f116053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g gVar, l20.r rVar, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f116052b = gVar;
        this.f116053c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f116052b, this.f116053c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.r>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116051a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<l20.r>> i0VarD = this.f116052b.d(this.f116053c);
        this.f116051a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
