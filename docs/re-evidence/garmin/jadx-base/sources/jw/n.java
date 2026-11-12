package jw;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw/n;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "deviceId", "Lk12/a;", "usersRepo", "Ljw/m;", "getDeviceRegistrationDetailsFromGCCallback", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljava/lang/String;Lk12/a;Ljw/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f101286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k12.a f101287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f101288l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.GetDeviceRegistrationDetailsTask", f = "GetDeviceRegistrationDetailsTask.kt", l = {23}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101289a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101291c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101289a = obj;
            this.f101291c |= Integer.MIN_VALUE;
            return n.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, String str, k12.a aVar, m mVar) {
        super(bVar);
        bVar.getClass();
        str.getClass();
        aVar.getClass();
        mVar.getClass();
        this.f101286j = str;
        this.f101287k = aVar;
        this.f101288l = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101291c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101291c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objC = aVar.f101289a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101291c;
        if (i15 == 0) {
            o13.r.b(objC);
            aVar.f101291c = 1;
            objC = this.f101287k.c(this.f101286j, aVar);
            if (objC == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                Integer num = ((v2.a) v2Var).f47384b;
                return (num == null || num.intValue() != 204) ? com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE : com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
            }
            u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.devices.model.m mVar = (com.garmin.android.apps.connectmobile.devices.model.m) ((v2.b) v2Var).f47386a;
        com.google.android.exoplayer2.analytics.q qVar = (com.google.android.exoplayer2.analytics.q) this.f101288l;
        gw.k kVar = (gw.k) qVar.f52943b;
        gw.j jVar = (gw.j) qVar.f52944c;
        Boolean criticalSwimSpeedCapable = mVar.getCriticalSwimSpeedCapable();
        if (criticalSwimSpeedCapable != null) {
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) kVar.f50097g.get(eVar);
            userSettingsDTO.f43529g = criticalSwimSpeedCapable.booleanValue();
            kVar.i(eVar, userSettingsDTO);
            if (criticalSwimSpeedCapable.booleanValue()) {
                kVar.b(new p(kVar, DateTime.now(), jVar));
            }
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, String str, m mVar) {
        this(bVar, str, null, mVar, 4, null);
        bVar.getClass();
        str.getClass();
        mVar.getClass();
    }

    public /* synthetic */ n(com.garmin.android.library.backgroundtaskmanagement.b bVar, String str, k12.a aVar, m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, str, (i14 & 4) != 0 ? k12.d.a.a(k12.d.f102315g) : aVar, mVar);
    }
}
