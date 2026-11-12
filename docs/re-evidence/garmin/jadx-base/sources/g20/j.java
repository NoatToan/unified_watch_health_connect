package g20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import m20.z;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsViewModel$deleteContact$1", f = "ContactDetailsViewModel.kt", l = {630}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f75354b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsViewModel$deleteContact$1$result$1", f = "ContactDetailsViewModel.kt", l = {631}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f75356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f75356b = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f75356b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75355a;
            if (i14 == 0) {
                r.b(obj);
                i iVar = this.f75356b;
                l20.a aVar2 = iVar.f75341e;
                if (aVar2 == null) {
                    s.m("contactDTO");
                    throw null;
                }
                String contactId = aVar2.getContactId();
                if (contactId == null) {
                    return null;
                }
                z zVar = iVar.f75337a;
                this.f75355a = 1;
                zVar.getClass();
                obj = f0.J(zVar, new m20.m(zVar, contactId, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return (v2) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f75354b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f75354b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75353a;
        i iVar = this.f75354b;
        if (i14 == 0) {
            r.b(obj);
            iVar.f75348l.j(g3.a.c(g3.f35298f));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(iVar, null);
            this.f75353a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if ((v2Var instanceof v2.b) && ((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
            int i15 = i.f75336p;
            iVar.getClass();
            f20.z zVar = (f20.z) KoinJavaComponent.get$default(f20.z.class, null, null, 6, null);
            l20.a aVar3 = iVar.f75341e;
            if (aVar3 == null) {
                s.m("contactDTO");
                throw null;
            }
            if (ge1.b.Q(aVar3)) {
                zVar.a();
            } else {
                l20.a aVar4 = iVar.f75341e;
                if (aVar4 == null) {
                    s.m("contactDTO");
                    throw null;
                }
                if (ge1.b.Q(aVar4)) {
                    zVar.a();
                }
            }
            zVar.b();
            u62.z.h(g3.f35298f, null, iVar.f75348l);
        } else if (v2Var instanceof v2.a) {
            v2.a aVar5 = (v2.a) v2Var;
            iVar.f75348l.j(g3.a.a(g3.f35298f, aVar5.f47385c, null, null, aVar5.f47384b, 6));
        } else {
            iVar.f75348l.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
