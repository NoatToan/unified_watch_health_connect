package mr;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.a1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmr/j0;", "Lmr/d;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120277a;

        static {
            int[] iArr = new int[jr.v.values().length];
            try {
                iArr[jr.v.OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jr.v.STATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jr.v.LAPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[jr.v.CHARTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[jr.v.GEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f120277a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005f  */
    @Override // mr.d
    public final List<nr.k> a(r0 r0Var) {
        List<jr.u> listA;
        ArrayList arrayList = null;
        jr.d dVar = r0Var != null ? r0Var.f120291a : null;
        ps.r rVar = r0Var != null ? r0Var.f120292b : null;
        boolean z14 = r0Var != null ? r0Var.f120294d : false;
        ps.p pVar = r0Var != null ? r0Var.f120297g : null;
        a1 metadataDTO = rVar != null ? rVar.getMetadataDTO() : null;
        if (dVar != null && (listA = dVar.a()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listA) {
                jr.v vVarD = ((jr.u) obj).d();
                int i14 = vVarD == null ? -1 : a.f120277a[vVarD.ordinal()];
                boolean zG = true;
                if (i14 != 1 && i14 != 2) {
                    if (i14 == 3) {
                        if ((metadataDTO != null ? p005kotlin.jvm.internal.s.g(metadataDTO.getIsManualActivity(), Boolean.TRUE) : false) || pVar == null) {
                            zG = false;
                        } else {
                            ps.s0 s0Var = r0Var.f120293c;
                            List<ps.r0> listD = s0Var != null ? s0Var.d() : null;
                            if (!(listD == null || listD.isEmpty())) {
                                zG = false;
                            }
                        }
                    } else if (i14 != 4) {
                        if (i14 != 5 || (!oe2.f.J(rVar) && !z14)) {
                            zG = false;
                        }
                    } else if (metadataDTO != null) {
                        zG = p005kotlin.jvm.internal.s.g(metadataDTO.getHasChartData(), Boolean.TRUE);
                    } else {
                        zG = false;
                    }
                }
                if (zG) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayListB0 = g8.i.b0(arrayList);
        return arrayListB0 == null ? p13.j0.f134944a : arrayListB0;
    }
}
