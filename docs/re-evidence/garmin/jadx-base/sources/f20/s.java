package f20;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$deleteContact$1", f = "ContactViewModel.kt", l = {314}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l20.a f68429c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$deleteContact$1$result$1", f = "ContactViewModel.kt", l = {316, 317}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l20.a f68432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.contacts.d dVar, l20.a aVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f68431b = dVar;
            this.f68432c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68431b, this.f68432c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r8 == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r8 == r0) goto L30;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68430a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return (v2) obj;
                }
                if (i14 == 2) {
                    o13.r.b(obj);
                    return (v2) obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.contacts.d dVar = this.f68431b;
            hl.a aVar2 = dVar.f32388c;
            boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
            l20.a aVar3 = this.f68432c;
            if (zG) {
                m20.z zVar = dVar.f32386a;
                String contactId = aVar3.getContactId();
                str = contactId != null ? contactId : "";
                this.f68430a = 1;
                zVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(zVar, new m20.m(zVar, str, null), this);
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                re0.o oVar = dVar.f32387b;
                long j8 = ((hl.a.b) dVar.f32388c).f84252b;
                String contactId2 = aVar3.getContactId();
                str = contactId2 != null ? contactId2 : "";
                this.f68430a = 2;
                obj = oVar.r(j8, str, this);
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.garmin.android.apps.connectmobile.contacts.d dVar, l20.a aVar, t13.d<? super s> dVar2) {
        super(2, dVar2);
        this.f68428b = dVar;
        this.f68429c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f68428b, this.f68429c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68427a;
        l20.a aVar2 = this.f68429c;
        com.garmin.android.apps.connectmobile.contacts.d dVar = this.f68428b;
        if (i14 == 0) {
            o13.r.b(obj);
            dVar.f32399n.j(g3.a.c(g3.f35298f));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(dVar, aVar2, null);
            this.f68427a = 1;
            obj = ge1.b.e0(bVar, aVar3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if ((v2Var instanceof v2.b) && ((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
            dVar.f32396k = true;
            if (ge1.b.Q(aVar2)) {
                f12.l.f68084a.getClass();
                f12.l.a.a().Z3();
                ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).a();
                ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).b();
            }
            if (p005kotlin.jvm.internal.s.g(aVar2.getIsLiveTrackDefault(), Boolean.TRUE)) {
                f12.l.f68084a.getClass();
                f12.l.a.a().q1();
            }
            dVar.x4();
        } else if (v2Var instanceof v2.a) {
            v2.a aVar4 = (v2.a) v2Var;
            dVar.f32399n.j(g3.a.a(g3.f35298f, aVar4.f47385c, null, null, aVar4.f47384b, 6));
        } else {
            dVar.f32399n.j(g3.a.a(g3.f35298f, v2Var.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
