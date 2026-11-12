package p90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lgj1/a;", "Lq90/f;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.pairing.GetPrimaryWearableAndTrainingInfoUseCase$invoke$2", f = "GetPrimaryWearableAndTrainingInfoUseCase.kt", l = {26, 29}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends gj1.a, ? extends q90.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f136557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f136558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f136559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, long j8, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f136558c = pVar;
        this.f136559d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f136558c, this.f136559d, dVar);
        qVar.f136557b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends gj1.a, ? extends q90.f>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r15 == r1) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ArrayList arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        Object bVar;
        gj1.a aVar;
        Integer weight;
        Integer weight2;
        Long deviceId;
        Object next;
        String displayName;
        Integer weight3;
        Integer weight4;
        List<gj1.b> listB;
        List<gj1.b> listB2;
        b0 b0Var = (b0) this.f136557b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f136556a;
        p pVar = this.f136558c;
        long j8 = this.f136559d;
        if (i14 == 0) {
            r.b(obj);
            y80.n nVar = pVar.f136553a;
            this.f136557b = b0Var;
            this.f136556a = 1;
            if (nVar.a(this) != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            r.b(obj);
            ((o13.q) obj).getClass();
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            objA = ((o13.q) obj).f128597a;
        }
        int i15 = o13.q.f128596b;
        if (objA instanceof o13.q.b) {
            objA = null;
        }
        gj1.f fVar = (gj1.f) objA;
        if (fVar == null) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GetPrimaryWearableAndTrainingInfo", "Failed to fetch primary device info");
            return new o13.p(null, q90.f.a.f143522a);
        }
        a2 a2Var2 = a2.DEVICE_SETUP;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "GetPrimaryWearableAndTrainingInfo", "Successfully fetched primary device info");
        pVar.f136554b.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null) {
            arrayList = new ArrayList(y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList);
            }
        } else {
            arrayList = null;
        }
        List<gj1.a> listF = fVar.f();
        if (listF != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : listF) {
                gj1.a aVar3 = (gj1.a) obj2;
                if (arrayList != null && h0.R(arrayList, aVar3.getDeviceId())) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = j0.f134944a;
        }
        gj1.i wearableDevices = fVar.getWearableDevices();
        if (wearableDevices == null || (listB2 = wearableDevices.b()) == null) {
            arrayList3 = j0.f134944a;
        } else {
            arrayList3 = new ArrayList();
            for (Object obj3 : listB2) {
                gj1.b bVar2 = (gj1.b) obj3;
                if (arrayList != null && h0.R(arrayList, bVar2.getDeviceId())) {
                    arrayList3.add(obj3);
                }
            }
        }
        gj1.i wearableDevices2 = fVar.getWearableDevices();
        if (wearableDevices2 == null || (listB = wearableDevices2.b()) == null) {
            arrayList4 = j0.f134944a;
        } else {
            arrayList4 = new ArrayList();
            for (Object obj4 : listB) {
                gj1.b bVar3 = (gj1.b) obj4;
                if (arrayList != null && h0.R(arrayList, bVar3.getDeviceId())) {
                    arrayList4.add(obj4);
                }
            }
        }
        gj1.a aVarT = gl.b.t(new Long(j8), arrayList2);
        Boolean boolValueOf = aVarT != null ? Boolean.valueOf(gl.b.G(aVarT)) : null;
        Boolean boolValueOf2 = aVarT != null ? Boolean.valueOf(s.g(aVarT.getPrimaryTrainingCapable(), Boolean.TRUE)) : null;
        Boolean bool = Boolean.TRUE;
        String str = "";
        int iIntValue = 0;
        if (s.g(boolValueOf, bool)) {
            a2 a2Var3 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device is primary wearable capable. Evaluating primary wearable settings.");
            if (arrayList3.size() != 1) {
                gj1.a aVarS = gl.b.s(arrayList2);
                gj1.b bVarE = gl.b.E(fVar, aVarS != null ? aVarS.getDeviceId() : null);
                int iIntValue2 = (bVarE == null || (weight4 = bVarE.getWeight()) == null) ? 0 : weight4.intValue();
                gj1.b bVarE2 = gl.b.E(fVar, new Long(j8));
                if (bVarE2 != null && (weight3 = bVarE2.getWeight()) != null) {
                    iIntValue = weight3.intValue();
                }
                if (iIntValue > iIntValue2) {
                    if (s.g(boolValueOf2, bool)) {
                        i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is greater than current primary wearable weight. Setting as primary wearable and training without prompt.");
                        bVar = new q90.f.C2707f(j8);
                    } else {
                        i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is greater than current primary wearable weight. Setting as primary wearable without prompt.");
                        bVar = new q90.f.e(j8);
                    }
                } else if (iIntValue == iIntValue2) {
                    i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is equal to current primary wearable weight. Prompting user to select primary wearable.");
                    if (aVarS != null && (displayName = aVarS.getDisplayName()) != null) {
                        str = displayName;
                    }
                    bVar = new q90.f.c(str, s.g(boolValueOf2, bool));
                } else {
                    i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is less than current primary wearable weight. No changes will be made to primary wearable or training.");
                    bVar = q90.f.a.f143522a;
                }
            } else if (s.g(boolValueOf2, bool)) {
                i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device is the only wearable paired. Setting it as primary wearable and training device without prompt.");
                bVar = new q90.f.C2707f(j8);
            } else {
                i2.a.b(a2Var3, "GetPrimaryWearableAndTrainingInfo", "Paired device is the only wearable paired. Setting it as primary wearable without prompt.");
                bVar = new q90.f.e(j8);
            }
        } else if (s.g(boolValueOf2, bool)) {
            a2 a2Var4 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "GetPrimaryWearableAndTrainingInfo", "Paired device is primary training only capable. Evaluating primary training settings.");
            if (arrayList4.size() == 1) {
                i2.a.b(a2Var4, "GetPrimaryWearableAndTrainingInfo", "Paired device is the only primary training capable device paired. Setting it as primary training device without prompt.");
                bVar = new q90.f.d(j8);
            } else {
                gj1.d primaryTrainingDeviceDTO = fVar.getPrimaryTrainingDeviceDTO();
                if (primaryTrainingDeviceDTO == null || (deviceId = primaryTrainingDeviceDTO.getDeviceId()) == null) {
                    aVar = null;
                } else {
                    long jLongValue = deviceId.longValue();
                    Iterator it3 = ((Iterable) arrayList2).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        Long deviceId2 = ((gj1.a) next).getDeviceId();
                        if (deviceId2 != null && deviceId2.longValue() == jLongValue) {
                            break;
                        }
                    }
                    aVar = (gj1.a) next;
                }
                gj1.b bVarD = gl.b.D(fVar, aVar != null ? aVar.getDeviceId() : null);
                int iIntValue3 = (bVarD == null || (weight2 = bVarD.getWeight()) == null) ? 0 : weight2.intValue();
                gj1.b bVarD2 = gl.b.D(fVar, new Long(j8));
                if (bVarD2 != null && (weight = bVarD2.getWeight()) != null) {
                    iIntValue = weight.intValue();
                }
                if (aVar == null || gl.b.G(aVar)) {
                    a2 a2Var5 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var5, "GetPrimaryWearableAndTrainingInfo", "Current primary training device is a wearable. No changes will be made to primary training device.");
                    bVar = q90.f.a.f143522a;
                } else {
                    a2 a2Var6 = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var6, "GetPrimaryWearableAndTrainingInfo", "Current primary training device is a non-wearable. Evaluating weight to determine if primary training device should be updated.");
                    if (iIntValue > iIntValue3) {
                        i2.a.b(a2Var6, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is greater than current primary training weight. Setting as primary training device without prompt.");
                        bVar = new q90.f.d(j8);
                    } else if (iIntValue == iIntValue3) {
                        i2.a.b(a2Var6, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is equal to current primary training weight. Prompting user to select primary training device.");
                        String displayName2 = aVar.getDisplayName();
                        bVar = new q90.f.b(displayName2 != null ? displayName2 : "");
                    } else {
                        i2.a.b(a2Var6, "GetPrimaryWearableAndTrainingInfo", "Paired device weight is less than current primary training weight. No changes will be made to primary training device.");
                        bVar = q90.f.a.f143522a;
                    }
                }
            }
        } else {
            bVar = q90.f.a.f143522a;
        }
        return new o13.p(aVarT, bVar);
        a2 a2Var7 = a2.DEVICE_SETUP;
        String strE = org.apache.commons.lang3.e.e(j8, "Fetching primary device info for deviceUnitId: ");
        i2.f36769a.getClass();
        i2.a.b(a2Var7, "GetPrimaryWearableAndTrainingInfo", strE);
        y80.n nVar2 = pVar.f136553a;
        this.f136557b = b0Var;
        this.f136556a = 2;
        objA = nVar2.a(this);
    }
}
