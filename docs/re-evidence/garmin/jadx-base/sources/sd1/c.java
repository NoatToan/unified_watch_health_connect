package sd1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import java.util.List;
import lc.u0;
import n23.j;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsd1/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f158620i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.reminders.network.FetchRemindersOperation$fetchReminders$1$executeTask$1", f = "FetchRemindersOperation.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f158621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f158622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f158623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158622b = bVar;
            this.f158623c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f158622b, this.f158623c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<pd1.b> listF;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158621a;
            b bVar = this.f158622b;
            if (i14 == 0) {
                r.b(obj);
                e eVarB = e.a.b(e.f158625a);
                pd1.a aVar2 = bVar.f158618m;
                this.f158621a = 1;
                obj = f0.J(eVarB, new g(aVar2, null), this);
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
            c cVar = this.f158623c;
            if (z14) {
                Logger logger = b.f158617o;
                logger.debug("executeTask: Successful task");
                pd1.c cVar2 = (pd1.c) ((v2.b) v2Var).f47386a;
                if (cVar2 != null) {
                    List<pd1.b> listF2 = cVar2.f();
                    logger.debug(j.f("executeTask: Got DTO with ", listF2 != null ? new Integer(listF2.size()) : null, StringUtils.SPACE, bVar.f158618m.name(), " reminders"));
                    if (bVar.f158618m == pd1.a.PREGNANCY && s.g(cVar2.getDisplayDefaultPregnancyReminders(), Boolean.TRUE) && ((listF = cVar2.f()) == null || listF.isEmpty())) {
                        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).F4(ww0.a.INACTIVE);
                        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).H0(true);
                    }
                    List<pd1.b> listF3 = cVar2.f();
                    if (listF3 != null && (!listF3.isEmpty())) {
                        ((a31.e) KoinJavaComponent.get$default(a31.e.class, null, null, 6, null)).b(e31.a.ENTERED_BPM_REMINDERS);
                    }
                    bVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, cVar2);
                    cVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
                } else {
                    cVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                b.f158617o.error("executeTask: Unsuccessful task, code " + ((v2.a) v2Var).f47384b);
                cVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar);
        this.f158620i = bVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        b.f158617o.debug("executeTask: ");
        b bVar = this.f158620i;
        ge1.b.T(bVar, null, null, new a(bVar, this, null), 3);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        b.f158617o.debug("cancelTask: ");
    }
}
