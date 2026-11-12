package vo1;

import am.b2;
import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getActivityChartDetails$2", f = "SocialGroupRideRepo.kt", l = {SyslogConstants.LOG_LOCAL7, 186}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<ActivityDetailChartDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f179037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f179038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f179039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z14, c cVar, long j8, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f179037b = z14;
        this.f179038c = cVar;
        this.f179039d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f179037b, this.f179038c, this.f179039d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ActivityDetailChartDTO>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r11 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179036a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return (a0) obj;
            }
            if (i14 == 2) {
                r.b(obj);
                return (a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        boolean z14 = this.f179037b;
        c cVar = this.f179038c;
        if (z14) {
            i0<a0<ActivityDetailChartDTO>> i0VarT = cVar.f179030b.t(this.f179039d);
            this.f179036a = 1;
            obj = i0VarT.await(this);
        } else {
            i0 i0VarF = b2.f(cVar.f179030b, this.f179039d, new Integer(1400), null, null, 8);
            this.f179036a = 2;
            obj = i0VarF.await(this);
        }
        return aVar;
    }
}
