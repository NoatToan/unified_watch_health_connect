package yn1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;
import v13.i;
import wn1.c0;
import wn1.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyn1/g;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f198186i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.operations.UserAcceptIndexInvitation$getOperationTask$1$executeTask$1", f = "UserAcceptIndexInvitation.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f198187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f198188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f198189c;

        /* JADX INFO: renamed from: yn1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.operations.UserAcceptIndexInvitation$getOperationTask$1$executeTask$1$1", f = "UserAcceptIndexInvitation.kt", l = {42}, m = "invokeSuspend", v = 2)
        public static final class C3712a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f198190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f198191b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f198192c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3712a(h hVar, g gVar, t13.d<? super C3712a> dVar) {
                super(2, dVar);
                this.f198191b = hVar;
                this.f198192c = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3712a(this.f198191b, this.f198192c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3712a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f198190a;
                h hVar = this.f198191b;
                if (i14 == 0) {
                    r.b(obj);
                    t tVar = hVar.f198197p;
                    com.garmin.android.apps.connectmobile.smartscale.model.f fVar = hVar.f198194m;
                    long j8 = hVar.f198193l;
                    this.f198190a = 1;
                    tVar.getClass();
                    obj = f0.J(tVar, new c0(fVar, j8, null), this);
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
                boolean z14 = v2Var instanceof v2.b;
                g gVar = this.f198192c;
                if (z14) {
                    ((Logger) hVar.f198195n.getValue()).debug("userAcceptInvite: Successful task");
                    com.garmin.android.apps.connectmobile.smartscale.model.a aVar2 = (com.garmin.android.apps.connectmobile.smartscale.model.a) ((v2.b) v2Var).f47386a;
                    ((Logger) hVar.f198195n.getValue()).debug("userAcceptInvite: Got coded response with " + aVar2 + " for secondary user registration!");
                    hVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, aVar2);
                    gVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    ((Logger) hVar.f198195n.getValue()).error("userAcceptInvite: Unsuccessful task, code " + ((v2.a) v2Var).f47384b);
                    gVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f198188b = hVar;
            this.f198189c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f198188b, this.f198189c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f198187a;
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                C3712a c3712a = new C3712a(this.f198188b, this.f198189c, null);
                this.f198187a = 1;
                if (ge1.b.e0(t1Var, c3712a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(hVar);
        this.f198186i = hVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        h hVar = this.f198186i;
        ((Logger) hVar.f198195n.getValue()).debug("executeTask for UserAcceptIndexInvitation called!");
        ge1.b.T(hVar, null, null, new a(hVar, this, null), 3);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        ((Logger) this.f198186i.f198195n.getValue()).debug("cancelTask for GetSignedInUserInvitationsOperation, nothing to do... ");
    }
}
