package f20;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$removeContactFromEmergencyContact$1", f = "ContactViewModel.kt", l = {347}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l20.a f68439c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll20/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$removeContactFromEmergencyContact$1$result$1", f = "ContactViewModel.kt", l = {348}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l20.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.d f68441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l20.a f68442c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.contacts.d dVar, l20.a aVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f68441b = dVar;
            this.f68442c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68441b, this.f68442c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l20.a>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68440a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            m20.z zVar = this.f68441b.f32386a;
            l20.a aVarJ = com.garmin.android.apps.connectmobile.contacts.b.j(this.f68442c);
            this.f68440a = 1;
            Object objH = zVar.h(aVarJ, this);
            return objH == aVar ? aVar : objH;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.garmin.android.apps.connectmobile.contacts.d dVar, l20.a aVar, t13.d<? super u> dVar2) {
        super(2, dVar2);
        this.f68438b = dVar;
        this.f68439c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f68438b, this.f68439c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68437a;
        com.garmin.android.apps.connectmobile.contacts.d dVar = this.f68438b;
        if (i14 == 0) {
            o13.r.b(obj);
            dVar.f32399n.j(g3.a.c(g3.f35298f));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(dVar, this.f68439c, null);
            this.f68437a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
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
        if (v2Var instanceof v2.b) {
            dVar.f32396k = true;
            f12.l.f68084a.getClass();
            f12.l.a.a().Z3();
            ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).a();
            ((v) KoinJavaComponent.get$default(v.class, null, null, 6, null)).b();
            dVar.x4();
        } else {
            dVar.f32399n.j(g3.a.a(g3.f35298f, v2Var.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
