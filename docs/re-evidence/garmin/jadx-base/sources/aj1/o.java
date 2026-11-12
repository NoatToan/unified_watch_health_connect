package aj1;

import androidx.lifecycle.t0;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import k12.e0;
import o13.r;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$saveNotificationPreferences$1", f = "NotificationsViewModel.kt", l = {111, 116, 117, 122, 127, 133}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<t0<Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f3468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f3469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.model.a f3472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3473f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lrl0/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$saveNotificationPreferences$1$emailPrefsResult$1", f = "NotificationsViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends rl0.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f3475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.model.a f3476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f3475b = pVar;
            this.f3476c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f3475b, this.f3476c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends rl0.a>>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3474a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            k12.d dVar = this.f3475b.f3486g;
            com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar2 = this.f3476c;
            aVar2.getClass();
            ArrayList arrayList = new ArrayList();
            rl0.a aVar3 = aVar2.f43660b;
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
            rl0.a aVar4 = aVar2.f43661c;
            if (aVar4 != null) {
                arrayList.add(aVar4);
            }
            this.f3474a = 1;
            dVar.getClass();
            Object objJ = f0.J(dVar, new e0(dVar, arrayList, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel$saveNotificationPreferences$1$notificationPrefsResult$1", f = "NotificationsViewModel.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f3478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NotificationPreferencesDTO f3479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, NotificationPreferencesDTO notificationPreferencesDTO, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f3478b = pVar;
            this.f3479c = notificationPreferencesDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f3478b, this.f3479c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f3477a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            dj1.a aVar2 = this.f3478b.f3484e;
            this.f3477a = 1;
            Object objA = aVar2.a(this.f3479c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar, p pVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f3472e = aVar;
        this.f3473f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f3472e, this.f3473f, dVar);
        oVar.f3471d = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Boolean> t0Var, t13.d<? super Unit> dVar) {
        return ((o) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L33;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        v2 v2Var;
        Object objAwait;
        v2 v2Var2;
        v2 v2Var3;
        t0 t0Var = (t0) this.f3471d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f3470c;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar2 = this.f3472e;
        p pVar = this.f3473f;
        switch (i14) {
            case 0:
                r.b(obj);
                NotificationPreferencesDTO notificationPreferencesDTO = aVar2.f43659a;
                if (notificationPreferencesDTO == null) {
                    Boolean bool = Boolean.FALSE;
                    this.f3471d = null;
                    this.f3470c = 1;
                    break;
                } else {
                    j0 j0VarJ2 = ge1.b.j(v1.a(pVar), null, null, new b(pVar, notificationPreferencesDTO, null), 3);
                    j0VarJ = ge1.b.j(v1.a(pVar), null, null, new a(pVar, aVar2, null), 3);
                    this.f3471d = t0Var;
                    this.f3468a = j0VarJ;
                    this.f3470c = 2;
                    obj = j0VarJ2.C(this);
                    if (obj != aVar) {
                        v2Var = (v2) obj;
                        this.f3471d = t0Var;
                        this.f3468a = null;
                        this.f3469b = v2Var;
                        this.f3470c = 3;
                        objAwait = j0VarJ.await(this);
                        if (objAwait != aVar) {
                            v2Var2 = v2Var;
                            obj = objAwait;
                            v2Var3 = (v2) obj;
                            if (v2Var2 instanceof v2.a) {
                                v2.a aVar3 = (v2.a) v2Var2;
                                pVar.f3480a.j(g3.a.a(g3.f35298f, aVar3.f47385c, aVar3.f47383a, null, null, 12));
                                Boolean bool2 = Boolean.FALSE;
                                this.f3471d = null;
                                this.f3468a = null;
                                this.f3469b = null;
                                this.f3470c = 4;
                            } else if (!(v2Var3 instanceof v2.a)) {
                                y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var = pVar.f3480a;
                                g3.f35298f.getClass();
                                y0Var.j(g3.a.d(aVar2));
                                pVar.f3483d = aVar2;
                                Boolean bool3 = Boolean.TRUE;
                                this.f3471d = null;
                                this.f3468a = null;
                                this.f3469b = null;
                                this.f3470c = 6;
                            } else {
                                v2.a aVar4 = (v2.a) v2Var3;
                                pVar.f3480a.j(g3.a.a(g3.f35298f, aVar4.f47385c, aVar4.f47383a, null, null, 12));
                                Boolean bool4 = Boolean.FALSE;
                                this.f3471d = null;
                                this.f3468a = null;
                                this.f3469b = null;
                                this.f3470c = 5;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
            case 4:
            case 5:
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            case 2:
                j0VarJ = this.f3468a;
                r.b(obj);
                v2Var = (v2) obj;
                this.f3471d = t0Var;
                this.f3468a = null;
                this.f3469b = v2Var;
                this.f3470c = 3;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar) {
                    v2Var2 = v2Var;
                    obj = objAwait;
                    v2Var3 = (v2) obj;
                    if (v2Var2 instanceof v2.a) {
                        v2.a aVar5 = (v2.a) v2Var2;
                        pVar.f3480a.j(g3.a.a(g3.f35298f, aVar5.f47385c, aVar5.f47383a, null, null, 12));
                        Boolean bool5 = Boolean.FALSE;
                        this.f3471d = null;
                        this.f3468a = null;
                        this.f3469b = null;
                        this.f3470c = 4;
                    } else if (!(v2Var3 instanceof v2.a)) {
                        y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var2 = pVar.f3480a;
                        g3.f35298f.getClass();
                        y0Var2.j(g3.a.d(aVar2));
                        pVar.f3483d = aVar2;
                        Boolean bool6 = Boolean.TRUE;
                        this.f3471d = null;
                        this.f3468a = null;
                        this.f3469b = null;
                        this.f3470c = 6;
                    } else {
                        v2.a aVar6 = (v2.a) v2Var3;
                        pVar.f3480a.j(g3.a.a(g3.f35298f, aVar6.f47385c, aVar6.f47383a, null, null, 12));
                        Boolean bool7 = Boolean.FALSE;
                        this.f3471d = null;
                        this.f3468a = null;
                        this.f3469b = null;
                        this.f3470c = 5;
                    }
                    break;
                }
                return aVar;
            case 3:
                v2Var2 = this.f3469b;
                r.b(obj);
                v2Var3 = (v2) obj;
                if (v2Var2 instanceof v2.a) {
                    v2.a aVar7 = (v2.a) v2Var2;
                    pVar.f3480a.j(g3.a.a(g3.f35298f, aVar7.f47385c, aVar7.f47383a, null, null, 12));
                    Boolean bool8 = Boolean.FALSE;
                    this.f3471d = null;
                    this.f3468a = null;
                    this.f3469b = null;
                    this.f3470c = 4;
                } else if (!(v2Var3 instanceof v2.a)) {
                    y0<g3<com.garmin.android.apps.connectmobile.settings.notifications.model.a>> y0Var3 = pVar.f3480a;
                    g3.f35298f.getClass();
                    y0Var3.j(g3.a.d(aVar2));
                    pVar.f3483d = aVar2;
                    Boolean bool9 = Boolean.TRUE;
                    this.f3471d = null;
                    this.f3468a = null;
                    this.f3469b = null;
                    this.f3470c = 6;
                } else {
                    v2.a aVar8 = (v2.a) v2Var3;
                    pVar.f3480a.j(g3.a.a(g3.f35298f, aVar8.f47385c, aVar8.f47383a, null, null, 12));
                    Boolean bool10 = Boolean.FALSE;
                    this.f3471d = null;
                    this.f3468a = null;
                    this.f3469b = null;
                    this.f3470c = 5;
                }
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
