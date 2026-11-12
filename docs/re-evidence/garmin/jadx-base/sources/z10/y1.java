package z10;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.DataConsentViewModel$getDeviceCapable$1", f = "DataConsentViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.a f201321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1 f201322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(hl.a aVar, z1 z1Var, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f201321d = aVar;
        this.f201322e = z1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f201321d, this.f201322e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        int i15;
        boolean z14;
        boolean zQ0;
        ?? r14;
        ?? r15;
        r53.p2 p2Var;
        Object value;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f201320c;
        z1 z1Var = this.f201322e;
        if (i16 == 0) {
            o13.r.b(obj);
            hl.a.c cVar = hl.a.c.f84256b;
            hl.a aVar2 = this.f201321d;
            if (p005kotlin.jvm.internal.s.g(aVar2, cVar)) {
                z1Var.getClass();
                int iOrdinal = SupportedCapability.LIVETRACK.ordinal();
                ImmutableList<String> immutableList = zb0.n0.f203578b;
                z14 = km2.a.g(iOrdinal, immutableList) || km2.a.g(SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal(), immutableList);
                com.garmin.android.apps.connectmobile.k1 k1Var = com.garmin.android.apps.connectmobile.k1.f37122a;
                boolean zT = k1Var.T();
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zS = k1Var.S();
                zQ0 = k1Var.Q0();
                r15 = zT;
                r14 = zS;
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    lc.u0.r();
                    return null;
                }
                re0.o oVar = z1Var.f201344e;
                long j8 = ((hl.a.b) aVar2).f84252b;
                this.f201318a = 1;
                this.f201319b = 1;
                this.f201320c = 1;
                obj = oVar.m(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
                i14 = 1;
                i15 = 1;
            }
            p2Var = z1Var.f201345f;
            do {
                value = p2Var.getValue();
                if (r15 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (r14 != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } while (!p2Var.b(value, new a2(z14, z15, z16, zQ0)));
            return Unit.INSTANCE;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = this.f201319b;
        int i17 = this.f201318a;
        o13.r.b(obj);
        i15 = i17;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            Iterable iterable = (Iterable) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            boolean z19 = iterable instanceof Collection;
            if (z19 && ((Collection) iterable).isEmpty()) {
                z17 = false;
            } else {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ue0.h hVar = (ue0.h) it.next();
                        Boolean liveTrackCapable = hVar.getLiveTrackCapable();
                        Boolean bool = Boolean.TRUE;
                        if (p005kotlin.jvm.internal.s.g(liveTrackCapable, bool) || p005kotlin.jvm.internal.s.g(hVar.getIncidentDetectionCapable(), bool)) {
                            z17 = true;
                        }
                    } else {
                        z17 = false;
                    }
                }
            }
            if (!z19 || !((Collection) iterable).isEmpty()) {
                Iterator it3 = iterable.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z18 = false;
                        break;
                    }
                    if (p005kotlin.jvm.internal.s.g(((ue0.h) it3.next()).getPendingActivityCapable(), Boolean.TRUE)) {
                        z18 = true;
                        break;
                    }
                }
            } else {
                z18 = false;
                break;
            }
            r14 = i14;
            zQ0 = z18;
            z14 = z17;
            r15 = i15;
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            r14 = i14;
            z14 = false;
            zQ0 = false;
            r15 = i15;
        }
        p2Var = z1Var.f201345f;
        do {
            value = p2Var.getValue();
            if (r15 != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (r14 != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
        } while (!p2Var.b(value, new a2(z14, z15, z16, zQ0)));
        return Unit.INSTANCE;
    }
}
