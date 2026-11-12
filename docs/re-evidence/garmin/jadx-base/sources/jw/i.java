package jw;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljw/i;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "unitId", "Ljw/h;", "deviceSettingsCallback", "Liw/a;", "deviceSettingsRepo", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;JLjw/h;Liw/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends ew.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f101259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f101260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iw.a f101261l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.biz.tasks.DeviceSettingsTask", f = "DeviceSettingsTask.kt", l = {19}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f101262a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101264c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f101262a = obj;
            this.f101264c |= Integer.MIN_VALUE;
            return i.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, h hVar, iw.a aVar) {
        super(bVar);
        bVar.getClass();
        hVar.getClass();
        aVar.getClass();
        this.f101259j = j8;
        this.f101260k = hVar;
        this.f101261l = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f101264c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f101264c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f101262a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f101264c;
        if (i15 == 0) {
            o13.r.b(objJ);
            aVar.f101264c = 1;
            iw.a aVar3 = this.f101261l;
            aVar3.getClass();
            objJ = f0.J(aVar3, new iw.b(aVar3, this.f101259j, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
            }
            u0.r();
            return null;
        }
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) ((v2.b) v2Var).f47386a;
        a73.b bVar = (a73.b) this.f101260k;
        cc0.a aVar4 = (cc0.a) bVar.f1819c;
        GCMSettingManager.V(bVar.f1818b, deviceSettingsDTO);
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        dc0.a aVar5 = (dc0.a) aVar4.f50097g.get(eVar);
        aVar5.f59106a = deviceSettingsDTO;
        aVar4.i(eVar, aVar5);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, h hVar) {
        this(bVar, j8, hVar, null, 8, null);
        bVar.getClass();
        hVar.getClass();
    }

    public /* synthetic */ i(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8, h hVar, iw.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, j8, hVar, (i14 & 8) != 0 ? iw.a.C1823a.a(iw.a.f95249b) : aVar);
    }
}
