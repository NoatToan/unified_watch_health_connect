package ro1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.a1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lr80/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.share.PhotoEditViewModel$fetchActivityStickers$1", f = "PhotoEditViewModel.kt", l = {199, 212}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super v2<? extends r80.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f154037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f154038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j8, u uVar, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f154037b = j8;
        this.f154038c = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f154037b, this.f154038c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends r80.b>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r14 == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer deviceApplicationInstallationId;
        Integer agentApplicationInstallationId;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154036a;
        u uVar = this.f154038c;
        if (i14 == 0) {
            o13.r.b(obj);
            i2.a aVar2 = i2.f36769a;
            long j8 = this.f154037b;
            String strE = org.apache.commons.lang3.e.e(j8, "Fetch activity summary with activity id: ");
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.a(a2Var, strE);
            am.m mVar = uVar.f154014c;
            this.f154036a = 1;
            mVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(mVar, new am.a0(mVar, j8, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            return new v2.a(new Exception(com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to fetch app info, exception: ")), null, null, 6, null);
        }
        if (v2Var instanceof v2.b) {
            r80.b bVarB = new nr.v((List) ((v2.b) v2Var).f47386a, null, null, null, 14, null).b();
            return bVarB == null ? new v2.a(new Exception("Returned device info is null"), null, null, 6, null) : new v2.b(bVarB, 200, null, null, 12, null);
        }
        lc.u0.r();
        return null;
        v2 v2Var2 = (v2) obj;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(new Exception(com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Failed to fetch activity data, exception: ")), null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        ps.r rVar = (ps.r) ((v2.b) v2Var2).f47386a;
        a1 metadataDTO = rVar.getMetadataDTO();
        int iIntValue = 0;
        String strValueOf = String.valueOf((metadataDTO == null || (agentApplicationInstallationId = metadataDTO.getAgentApplicationInstallationId()) == null) ? 0 : agentApplicationInstallationId.intValue());
        if (metadataDTO != null && (deviceApplicationInstallationId = metadataDTO.getDeviceApplicationInstallationId()) != null) {
            iIntValue = deviceApplicationInstallationId.intValue();
        }
        String strValueOf2 = String.valueOf(iIntValue);
        if (!oe2.f.A(rVar)) {
            return new v2.a(new Exception("Activity did not has device info"), null, null, 6, null);
        }
        pc0.j jVar = uVar.f154015d;
        this.f154036a = 2;
        jVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(jVar, new pc0.p(jVar, strValueOf, strValueOf2, null), this);
    }
}
