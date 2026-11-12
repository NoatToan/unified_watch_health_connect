package gg2;

import android.app.Notification;
import android.app.NotificationManager;
import com.garmin.android.livesessionview.service.LiveActivitySessionService;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.service.LiveActivitySessionService$listenForSessionEvents$1", f = "LiveActivitySessionService.kt", l = {146}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveActivitySessionService f77383b;

    /* JADX INFO: renamed from: gg2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1560a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LiveActivitySessionService f77384a;

        /* JADX INFO: renamed from: gg2.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1561a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77385a;

            static {
                int[] iArr = new int[eg2.c.values().length];
                try {
                    iArr[eg2.c.ACTIVITY_STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eg2.c.ACTIVITY_RESUMED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[eg2.c.ACTIVITY_UPDATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[eg2.c.ACTIVITY_PAUSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[eg2.c.ACTIVITY_ENDED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[eg2.c.ACTIVITY_DISCONNECTED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f77385a = iArr;
            }
        }

        public C1560a(LiveActivitySessionService liveActivitySessionService) {
            this.f77384a = liveActivitySessionService;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            NotificationManager notificationManager;
            eg2.b bVar = (eg2.b) obj;
            Notification notificationA = null;
            eg2.c cVar = bVar != null ? bVar.f64007a : null;
            int i14 = cVar == null ? -1 : C1561a.f77385a[cVar.ordinal()];
            LiveActivitySessionService liveActivitySessionService = this.f77384a;
            switch (i14) {
                case 1:
                    notificationA = liveActivitySessionService.f50579b.a(liveActivitySessionService, bVar);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    notificationA = liveActivitySessionService.f50579b.b(liveActivitySessionService, bVar);
                    break;
            }
            if (notificationA != null && (notificationManager = (NotificationManager) liveActivitySessionService.getSystemService(NotificationManager.class)) != null) {
                notificationManager.notify(19871, notificationA);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LiveActivitySessionService liveActivitySessionService, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f77383b = liveActivitySessionService;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f77383b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f77382a;
        if (i14 == 0) {
            r.b(obj);
            LiveActivitySessionService liveActivitySessionService = this.f77383b;
            p2 p2Var = liveActivitySessionService.f50581d;
            C1560a c1560a = new C1560a(liveActivitySessionService);
            this.f77382a = 1;
            if (p2Var.collect(c1560a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
