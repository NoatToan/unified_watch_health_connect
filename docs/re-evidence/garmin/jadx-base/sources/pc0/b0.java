package pc0;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/devices/model/u;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/devices/model/u;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getHomeDevicesInfo$2", f = "DevicesRepo.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.devices.model.u>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f137185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f137186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f137188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f137189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j jVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f137189e = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f137189e, dVar);
        b0Var.f137188d = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.devices.model.u> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r14.a(r1, r13) == r0) goto L51;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        sd2.f fVarA;
        sd2.f fVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137187c;
        j jVar = this.f137189e;
        Object obj2 = null;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return new com.garmin.android.apps.connectmobile.devices.model.u(null, 0, 0);
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = this.f137186b;
            arrayList = this.f137185a;
            o13.r.b(obj);
            f12.l lVar = jVar.f137226c;
            for (Object obj3 : arrayList) {
                fVar = (sd2.f) obj3;
                if (((u0) u0.f203782n6.get(fVar.getProductNumber())) != u0.T1 && lVar.s4() == fVar.getUnitID()) {
                    obj2 = obj3;
                    break;
                }
            }
            lVar.l2(((sd2.f) obj2) != null);
            if (arrayList2.isEmpty()) {
                fVarA = j.a(jVar, arrayList);
            } else {
                fVarA = j.a(jVar, arrayList2);
            }
            return new com.garmin.android.apps.connectmobile.devices.model.u(fVarA, arrayList.size(), arrayList2.size());
        }
        o13.r.b(obj);
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        if (arrayListD != null) {
            arrayList = new ArrayList();
            for (Object obj4 : arrayListD) {
                if (((sd2.f) obj4).isPaired()) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (jVar.f137230g.a(((sd2.f) obj5).getUnitID())) {
                    arrayList3.add(obj5);
                }
            }
            l80.a aVar2 = jVar.f137229f;
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList4);
            }
            Set setG1 = p13.h0.g1(arrayList4);
            this.f137188d = null;
            this.f137185a = arrayList;
            this.f137186b = arrayList3;
            this.f137187c = 1;
            if (aVar2.a(setG1, this) != aVar) {
                arrayList2 = arrayList3;
                f12.l lVar2 = jVar.f137226c;
                while (r2.hasNext()) {
                    fVar = (sd2.f) obj3;
                    if (((u0) u0.f203782n6.get(fVar.getProductNumber())) != u0.T1) {
                    }
                }
                lVar2.l2(((sd2.f) obj2) != null);
                if (arrayList2.isEmpty()) {
                    fVarA = j.a(jVar, arrayList2);
                } else {
                    fVarA = j.a(jVar, arrayList);
                }
                return new com.garmin.android.apps.connectmobile.devices.model.u(fVarA, arrayList.size(), arrayList2.size());
            }
        } else {
            a2 a2Var = a2.DASHBOARD;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DevicesRepo", "getHomeDevicesInfo -> NO DEVICES");
            l80.a aVar3 = jVar.f137229f;
            p13.l0 l0Var = p13.l0.f134950a;
            this.f137188d = null;
            this.f137187c = 2;
        }
        return aVar;
    }
}
