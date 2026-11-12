package m20;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll20/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo$updateContact$updateResult$1", f = "ContactsRepo.kt", l = {147, 150}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<l20.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l20.a f116047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(l20.a aVar, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f116047b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f116047b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<l20.a>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r14 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r14 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116046a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        boolean zE = com.garmin.android.apps.connectmobile.contacts.b.e();
        l20.a aVar2 = this.f116047b;
        if (zE) {
            o53.i0<c83.a0<l20.a>> i0VarB = ((a0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a0.class, new c83.h.a[0], null, null, null, 120)).b(String.valueOf(aVar2.getContactId()), aVar2);
            this.f116046a = 1;
            obj = i0VarB.await(this);
        } else {
            o53.i0<c83.a0<l20.a>> i0VarB2 = ((g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, g.class, new c83.h.a[0], null, null, null, 120)).b(String.valueOf(aVar2.getContactId()), aVar2);
            this.f116046a = 2;
            obj = i0VarB2.await(this);
        }
        return aVar;
    }
}
