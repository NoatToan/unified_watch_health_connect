package aj1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o13.r;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getPreferences$1", f = "NotificationsViewModel.kt", l = {76, 77}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.notifications.model.a f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f3457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3460f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lrl0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getPreferences$1$deferredEmailPrefs$1", f = "NotificationsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends rl0.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f3462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f3462b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f3462b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends rl0.a>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3461a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            k12.d dVar = this.f3462b.f3486g;
            this.f3461a = 1;
            dVar.getClass();
            Object objJ = f0.J(dVar, new k12.r(dVar, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/settings/notifications/model/NotificationPreferencesDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$getPreferences$1$deferredNotificationPrefs$1", f = "NotificationsViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends NotificationPreferencesDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f3464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f3464b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f3464b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends NotificationPreferencesDTO>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3463a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            dj1.a aVar2 = this.f3464b.f3484e;
            this.f3463a = 1;
            Object objB = aVar2.b(this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f3460f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f3460f, dVar);
        mVar.f3459e = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar;
        v2 v2Var;
        v2 v2Var2;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar2;
        b0 b0Var = (b0) this.f3459e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3458d;
        p pVar = this.f3460f;
        if (i14 == 0) {
            r.b(obj);
            pVar.f3480a.j(g3.a.c(g3.f35298f));
            com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar4 = new com.garmin.android.apps.connectmobile.settings.notifications.model.a(null, null, null, 7, null);
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new b(pVar, null), 3);
            com.garmin.android.apps.connectmobile.l.g().getClass();
            j0VarJ = gh2.i.f77458c.a().f77477b.c("garmin_email_summary_enabled") ? ge1.b.j(b0Var, null, null, new a(pVar, null), 3) : null;
            this.f3459e = null;
            this.f3455a = aVar4;
            this.f3456b = j0VarJ;
            this.f3458d = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar3) {
                aVar = aVar4;
            }
            return aVar3;
        }
        if (i14 == 1) {
            j0VarJ = this.f3456b;
            aVar = this.f3455a;
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f3457c;
            aVar2 = this.f3455a;
            r.b(obj);
        }
        v2Var2 = (v2) obj;
        aVar = aVar2;
        if (v2Var instanceof v2.a) {
            pVar.f3483d = null;
            v2.a aVar5 = (v2.a) v2Var;
            pVar.f3480a.j(g3.a.a(g3.f35298f, aVar5.f47385c, aVar5.f47383a, null, null, 12));
            return Unit.INSTANCE;
        }
        if (v2Var2 instanceof v2.a) {
            pVar.f3483d = null;
            v2.a aVar6 = (v2.a) v2Var2;
            pVar.f3480a.j(g3.a.a(g3.f35298f, aVar6.f47385c, aVar6.f47383a, null, null, 12));
            return Unit.INSTANCE;
        }
        v2Var.getClass();
        aVar.f43659a = (NotificationPreferencesDTO) ((v2.b) v2Var).f47386a;
        if (v2Var2 != null) {
            List<rl0.a> list = (List) ((v2.b) v2Var2).f47386a;
            list.getClass();
            for (rl0.a aVar7 : list) {
                if (s.g(aVar7.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), "send.email.summary.weekly")) {
                    aVar.f43660b = aVar7;
                }
                if (s.g(aVar7.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), "send.email.summary.monthly")) {
                    aVar.f43661c = aVar7;
                }
            }
        }
        pVar.f3483d = aVar;
        y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var = pVar.f3480a;
        g3.f35298f.getClass();
        y0Var.j(g3.a.d(aVar));
        return Unit.INSTANCE;
        v2 v2Var3 = (v2) obj;
        if (j0VarJ != null) {
            this.f3459e = null;
            this.f3455a = aVar;
            this.f3456b = null;
            this.f3457c = v2Var3;
            this.f3458d = 2;
            Object objAwait = j0VarJ.await(this);
            if (objAwait != aVar3) {
                v2Var = v2Var3;
                obj = objAwait;
                aVar2 = aVar;
                v2Var2 = (v2) obj;
                aVar = aVar2;
            }
            return aVar3;
        }
        v2Var = v2Var3;
        v2Var2 = null;
        if (v2Var instanceof v2.a) {
            pVar.f3483d = null;
            v2.a aVar8 = (v2.a) v2Var;
            pVar.f3480a.j(g3.a.a(g3.f35298f, aVar8.f47385c, aVar8.f47383a, null, null, 12));
            return Unit.INSTANCE;
        }
        if (v2Var2 instanceof v2.a) {
            pVar.f3483d = null;
            v2.a aVar9 = (v2.a) v2Var2;
            pVar.f3480a.j(g3.a.a(g3.f35298f, aVar9.f47385c, aVar9.f47383a, null, null, 12));
            return Unit.INSTANCE;
        }
        v2Var.getClass();
        aVar.f43659a = (NotificationPreferencesDTO) ((v2.b) v2Var).f47386a;
        if (v2Var2 != null) {
            List<rl0.a> list2 = (List) ((v2.b) v2Var2).f47386a;
            list2.getClass();
            while (r14.hasNext()) {
                if (s.g(aVar7.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), "send.email.summary.weekly")) {
                    aVar.f43660b = aVar7;
                }
                if (s.g(aVar7.getCh.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE java.lang.String(), "send.email.summary.monthly")) {
                    aVar.f43661c = aVar7;
                }
            }
        }
        pVar.f3483d = aVar;
        y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var2 = pVar.f3480a;
        g3.f35298f.getClass();
        y0Var2.j(g3.a.d(aVar));
        return Unit.INSTANCE;
    }
}
