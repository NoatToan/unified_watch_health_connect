package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln70/b7;", "", "Ltz0/b;", "notificationPreferences", "<init>", "(Ltz0/b;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tz0.b f124054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f124055b;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "shouldCheck", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.IsInboxUnreadBubbleRequiredUseCase$1", f = "IsInboxUnreadBubbleRequiredUseCase.kt", l = {28}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f124056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f124057b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = b7.this.new a(dVar);
            aVar.f124057b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14 = this.f124057b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f124056a;
            b7 b7Var = b7.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!z14) {
                    return Unit.INSTANCE;
                }
                this.f124057b = z14;
                this.f124056a = 1;
                obj = b7.a(b7Var, this);
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
            b7Var.f124054a.b(((Boolean) obj).booleanValue());
            b7Var.f124054a.d(false);
            return Unit.INSTANCE;
        }
    }

    public b7(tz0.b bVar) {
        bVar.getClass();
        this.f124054a = bVar;
        o53.m1 m1VarC = g8.i.c();
        x53.c cVar = o53.s0.f129406a;
        u53.d dVarA = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        this.f124055b = dVarA;
        r53.s.C(new r53.m1(androidx.lifecycle.v.a(bVar.c()), new a(null)), dVarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(b7 b7Var, v13.c cVar) {
        c7 c7Var;
        b7Var.getClass();
        if (cVar instanceof c7) {
            c7Var = (c7) cVar;
            int i14 = c7Var.f124117c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c7Var.f124117c = i14 - Integer.MIN_VALUE;
            } else {
                c7Var = new c7(b7Var, cVar);
            }
        } else {
            c7Var = new c7(b7Var, cVar);
        }
        Object objJ = c7Var.f124115a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c7Var.f124117c;
        if (i15 == 0) {
            o13.r.b(objJ);
            sz0.a0.f161325d.getClass();
            sz0.a0 a0VarA = sz0.a0.a.a();
            c7Var.f124117c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(a0VarA, new sz0.f0(a0VarA, null), c7Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        return Boolean.valueOf(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b ? p005kotlin.jvm.internal.s.g(((uz0.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a).getUnreadBubble(), Boolean.TRUE) : false);
    }
}
