package wn1;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$inviteAction$1$inviteFriends$1", f = "InviteFriendsViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f186307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.b f186308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li0.d0 f186309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n.c f186310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f186311f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.smartscale.InviteFriendsViewModel$inviteAction$1$inviteFriends$1$1", f = "InviteFriendsViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f186313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.b f186314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ li0.d0 f186315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n.c f186316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f186317f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar, li0.d0 d0Var, n.c cVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f186313b = nVar;
            this.f186314c = bVar;
            this.f186315d = d0Var;
            this.f186316e = cVar;
            this.f186317f = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f186313b, this.f186314c, this.f186315d, this.f186316e, this.f186317f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186312a;
            if (i14 == 0) {
                o13.r.b(obj);
                t tVar = this.f186313b.f186265b;
                this.f186312a = 1;
                tVar.getClass();
                obj = com.garmin.android.apps.connectmobile.f0.J(tVar, new a0(this.f186314c, null), this);
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
                li0.d0 d0Var = this.f186315d;
                li0.d0 d0VarB = d0Var != null ? li0.d0.b(d0Var, null, li0.b0.REQUEST_SENT, null, null, null, null, d0Var.f112656i, 253) : null;
                this.f186316e.n(d0Var != null ? d0Var.f112650c : null, d0VarB != null ? li0.e0.e(d0VarB) : null);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Context context = this.f186317f;
                Toast.makeText(context, context.getString(R.string.txt_error_occurred), 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, com.garmin.android.apps.connectmobile.smartscale.model.b bVar, li0.d0 d0Var, n.c cVar, Context context, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f186307b = nVar;
        this.f186308c = bVar;
        this.f186309d = d0Var;
        this.f186310e = cVar;
        this.f186311f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f186307b, this.f186308c, this.f186309d, this.f186310e, this.f186311f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186306a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f186307b, this.f186308c, this.f186309d, this.f186310e, this.f186311f, null);
            this.f186306a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
