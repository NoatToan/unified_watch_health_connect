package hd0;

import c22.k;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.WifiSetup;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.j;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$storeNetworks$2", f = "WifiNetworksViewModel.kt", l = {229, 235}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f83343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<WifiSetup.StoredAccessPoint> f83344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, List<WifiSetup.StoredAccessPoint> list, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f83343c = bVar;
        this.f83344d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f83343c, this.f83344d, dVar);
        fVar.f83342b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r0.r(r14, r8, r13) == r2) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f83342b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83341a;
        boolean z14 = true;
        b bVar = this.f83343c;
        try {
            if (i14 == 0) {
                r.b(obj);
                boolean zC = ((k) KoinJavaComponent.get$default(k.class, null, null, 6, null)).c("gcm_oauth2_enabled");
                List<WifiSetup.StoredAccessPoint> list = this.f83344d;
                if (zC) {
                    gn2.c cVar = (gn2.c) zb0.k.b(gn2.c.class, bVar.f83308a);
                    if (cVar != null) {
                        this.f83342b = b0Var;
                        this.f83341a = 1;
                        if (cVar.s(list, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    j jVar = rd2.f.a().f152045a;
                    long j8 = bVar.f83308a;
                    long j14 = bVar.f83308a;
                    jVar.getClass();
                    sd2.f fVarI = j.i(j8, null);
                    if (fVarI == null || (r14 = fVarI.getApplicationKey()) == null) {
                        throw new Exception("Cannot find device in local DB unitId[" + j14 + "]");
                    }
                    gn2.c cVar2 = (gn2.c) zb0.k.b(gn2.c.class, j14);
                    if (cVar2 != null) {
                        this.f83342b = b0Var;
                        this.f83341a = 2;
                    }
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICES;
            String strN = wr.g.n("storeNetworks FAILED deviceId[", bVar.f83308a, "] ", e4);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WifiNetworksViewModel", strN);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
