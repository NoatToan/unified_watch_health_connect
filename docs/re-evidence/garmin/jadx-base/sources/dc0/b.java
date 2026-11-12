package dc0;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d81.t;
import e23.l;
import lc.u0;
import o13.r;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pc0.j;
import pc0.j0;
import t13.d;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldc0/b;", "Lew/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "deviceId", "", "jsonDelta", "Lkotlin/Function1;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "onSuccess", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;JLjava/lang/String;Le23/l;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ew.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f59108n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f59109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f59110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l<DeviceSettingsDTO, Unit> f59111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f59112m;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.devices.biz.tasks.SaveDeviceSettingsTask", f = "SaveDeviceSettingsTask.kt", l = {21}, m = "executeBackgroundWork", v = 2)
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f59113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59115c;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f59113a = obj;
            this.f59115c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    static {
        j.a aVar = j.f137223i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, String str, l<? super DeviceSettingsDTO, Unit> lVar) {
        super(bVar);
        bVar.getClass();
        str.getClass();
        lVar.getClass();
        this.f59109j = j8;
        this.f59110k = str;
        this.f59111l = lVar;
        this.f59112m = j.a.a(j.f137223i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ew.a
    public final Object d(d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f59115c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f59115c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objJ = aVar.f59113a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f59115c;
        if (i15 == 0) {
            r.b(objJ);
            aVar.f59115c = 1;
            j jVar = this.f59112m;
            jVar.getClass();
            objJ = f0.J(jVar, new j0(jVar, this.f59109j, this.f59110k, null), aVar);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f59111l.invoke(new DeviceSettingsDTO(new JSONObject((String) ((v2.b) v2Var).f47386a)));
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (v2Var instanceof v2.a) {
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        u0.r();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, String str) {
        this(bVar, j8, str, null, 8, null);
        bVar.getClass();
        str.getClass();
    }

    public /* synthetic */ b(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8, String str, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, j8, str, (i14 & 8) != 0 ? new t(6) : lVar);
    }
}
