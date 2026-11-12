package jw;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw/p;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Lorg/joda/time/DateTime;", "date", "Lg60/c;", "criticalSwimSpeedRepo", "Ljw/o;", "getLatestCriticalSwimSpeedFromGCCallback", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Lorg/joda/time/DateTime;Lg60/c;Ljw/o;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f101292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g60.c f101293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f101294l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.GetLatestCriticalSwimSpeedTask", f = "GetLatestCriticalSwimSpeedTask.kt", l = {20}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101295a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101297c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101295a = obj;
            this.f101297c |= Integer.MIN_VALUE;
            return p.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, DateTime dateTime, g60.c cVar, o oVar) {
        super(bVar);
        bVar.getClass();
        dateTime.getClass();
        cVar.getClass();
        oVar.getClass();
        this.f101292j = dateTime;
        this.f101293k = cVar;
        this.f101294l = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101297c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101297c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f101295a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101297c;
        if (i15 == 0) {
            o13.r.b(objB);
            aVar.f101297c = 1;
            objB = this.f101293k.b(this.f101292j, aVar);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        g60.b bVar = (g60.b) ((v2.b) v2Var).f47386a;
        gw.k kVar = (gw.k) ((gw.j) this.f101294l).f79512b;
        if (bVar.b() != null) {
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) kVar.f50097g.get(eVar);
            userSettingsDTO.f43530h = bVar.b().doubleValue();
            kVar.i(eVar, userSettingsDTO);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, DateTime dateTime, o oVar) {
        this(bVar, dateTime, null, oVar, 4, null);
        bVar.getClass();
        dateTime.getClass();
        oVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(com.garmin.android.library.backgroundtaskmanagement.b bVar, DateTime dateTime, g60.c cVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            g60.c.R.getClass();
            cVar = g60.c.a.a();
        }
        this(bVar, dateTime, cVar, oVar);
    }
}
