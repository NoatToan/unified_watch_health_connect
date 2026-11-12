package com.garmin.android.apps.connectmobile.pacepro.data.dto;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002bcBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0013B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0014Bm\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0011\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b1\u00100J\u008c\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b7\u0010\u001bJ\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010D\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bB\u0010CR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010E\u0012\u0004\bG\u0010H\u001a\u0004\bF\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010E\u0012\u0004\bJ\u0010H\u001a\u0004\bI\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010K\u0012\u0004\bM\u0010H\u001a\u0004\bL\u0010&R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bO\u0010H\u001a\u0004\bN\u0010&R \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bQ\u0010H\u001a\u0004\bP\u0010&R \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010K\u0012\u0004\bS\u0010H\u001a\u0004\bR\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010T\u0012\u0004\bV\u0010H\u001a\u0004\bU\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010W\u0012\u0004\bY\u0010H\u001a\u0004\bX\u0010-R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010W\u0012\u0004\b[\u0010H\u001a\u0004\bZ\u0010-R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\\\u0012\u0004\b^\u0010H\u001a\u0004\b]\u00100R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\\\u0012\u0004\b`\u0010H\u001a\u0004\b_\u00100¨\u0006d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "Landroid/os/Parcelable;", "", "paceBandSplitPk", "paceBandPk", "", "cumulativeDistanceFromStart", "cumulativeTimeFromStart", "splitDistance", "splitAvgSpeed", "bearing", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;", "startPoint", "endPoint", "", "splitTime", "elevationChange", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;DDDDLjava/lang/Double;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Ljava/lang/Float;Ljava/lang/Float;)V", "(DF)V", "(DFF)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;DDDDLjava/lang/Double;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Lm63/u1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "()Ljava/lang/Double;", "component8", "()Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;", "component9", "component10", "()Ljava/lang/Float;", "component11", "copy", "(Ljava/lang/Long;Ljava/lang/Long;DDDDLjava/lang/Double;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;Ljava/lang/Float;Ljava/lang/Float;)Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "write$Self$gcm_domain_training_vanillaRelease", "(Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;Ll63/d;Lk63/e;)V", "write$Self", "Ljava/lang/Long;", "getPaceBandSplitPk", "getPaceBandSplitPk$annotations", "()V", "getPaceBandPk", "getPaceBandPk$annotations", "D", "getCumulativeDistanceFromStart", "getCumulativeDistanceFromStart$annotations", "getCumulativeTimeFromStart", "getCumulativeTimeFromStart$annotations", "getSplitDistance", "getSplitDistance$annotations", "getSplitAvgSpeed", "getSplitAvgSpeed$annotations", "Ljava/lang/Double;", "getBearing", "getBearing$annotations", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/c;", "getStartPoint", "getStartPoint$annotations", "getEndPoint", "getEndPoint$annotations", "Ljava/lang/Float;", "getSplitTime", "getSplitTime$annotations", "getElevationChange", "getElevationChange$annotations", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class PaceBandSplitDTO implements Parcelable {
    private final Double bearing;
    private final double cumulativeDistanceFromStart;
    private final double cumulativeTimeFromStart;
    private final Float elevationChange;
    private final com.garmin.android.apps.connectmobile.pacepro.data.dto.c endPoint;
    private final Long paceBandPk;
    private final Long paceBandSplitPk;
    private final double splitAvgSpeed;
    private final double splitDistance;
    private final Float splitTime;
    private final com.garmin.android.apps.connectmobile.pacepro.data.dto.c startPoint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaceBandSplitDTO> CREATOR = new c();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class a implements e0<PaceBandSplitDTO> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39757a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f39757a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO", aVar, 9);
            m1Var.j("paceBandSplitPk", false);
            m1Var.j("paceBandPk", false);
            m1Var.j("cumulativeDistanceFromStart", false);
            m1Var.j("cumulativeTimeFromStart", false);
            m1Var.j("splitDistance", false);
            m1Var.j("splitAvgSpeed", false);
            m1Var.j("bearing", false);
            m1Var.j("startPoint", false);
            m1Var.j("endPoint", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(v0Var);
            x xVar = x.f117036a;
            i63.c<?> cVarD3 = j63.a.d(xVar);
            com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a aVar = com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a.f39786a;
            return new i63.c[]{cVarD, cVarD2, xVar, xVar, xVar, xVar, cVarD3, j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            double dT = 0.0d;
            double dT2 = 0.0d;
            double dT3 = 0.0d;
            double dT4 = 0.0d;
            Long l14 = null;
            boolean z14 = true;
            Double d14 = null;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar = null;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2 = null;
            int i15 = 0;
            Long l15 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l15 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l15);
                        i15 |= 1;
                        break;
                    case 1:
                        l14 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l14);
                        i15 |= 2;
                        break;
                    case 2:
                        dT = cVarC.t(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        dT2 = cVarC.t(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        dT3 = cVarC.t(eVar2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        dT4 = cVarC.t(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        d14 = (Double) cVarC.v(eVar2, 6, x.f117036a, d14);
                        i15 |= 64;
                        break;
                    case 7:
                        cVar = (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) cVarC.v(eVar2, 7, com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a.f39786a, cVar);
                        i15 |= 128;
                        break;
                    case 8:
                        cVar2 = (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) cVarC.v(eVar2, 8, com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a.f39786a, cVar2);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new PaceBandSplitDTO(i15, l15, l14, dT, dT2, dT3, dT4, d14, cVar, cVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) obj;
            paceBandSplitDTO.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            PaceBandSplitDTO.write$Self$gcm_domain_training_vanillaRelease(paceBandSplitDTO, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PaceBandSplitDTO> {
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00a1: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // android.os.Parcelable.Creator
        public final com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO createFromParcel(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
              (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00a1: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            */

        @Override // android.os.Parcelable.Creator
        public final PaceBandSplitDTO[] newArray(int i14) {
            return new PaceBandSplitDTO[i14];
        }
    }

    public /* synthetic */ PaceBandSplitDTO(int i14, Long l14, Long l15, double d14, double d15, double d16, double d17, Double d18, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2, u1 u1Var) {
        if (511 != (i14 & 511)) {
            k1.h(i14, 511, a.f39757a.getF94809a());
            throw null;
        }
        this.paceBandSplitPk = l14;
        this.paceBandPk = l15;
        this.cumulativeDistanceFromStart = d14;
        this.cumulativeTimeFromStart = d15;
        this.splitDistance = d16;
        this.splitAvgSpeed = d17;
        this.bearing = d18;
        this.startPoint = cVar;
        this.endPoint = cVar2;
        this.splitTime = null;
        this.elevationChange = null;
    }

    public static /* synthetic */ void getBearing$annotations() {
    }

    public static /* synthetic */ void getCumulativeDistanceFromStart$annotations() {
    }

    public static /* synthetic */ void getCumulativeTimeFromStart$annotations() {
    }

    public static /* synthetic */ void getElevationChange$annotations() {
    }

    public static /* synthetic */ void getEndPoint$annotations() {
    }

    public static /* synthetic */ void getPaceBandPk$annotations() {
    }

    public static /* synthetic */ void getPaceBandSplitPk$annotations() {
    }

    public static /* synthetic */ void getSplitAvgSpeed$annotations() {
    }

    public static /* synthetic */ void getSplitDistance$annotations() {
    }

    public static /* synthetic */ void getSplitTime$annotations() {
    }

    public static /* synthetic */ void getStartPoint$annotations() {
    }

    public static final /* synthetic */ void write$Self$gcm_domain_training_vanillaRelease(PaceBandSplitDTO self, d output, k63.e serialDesc) {
        v0 v0Var = v0.f117027a;
        output.d(serialDesc, 0, v0Var, self.paceBandSplitPk);
        output.d(serialDesc, 1, v0Var, self.paceBandPk);
        output.B(serialDesc, 2, self.cumulativeDistanceFromStart);
        output.B(serialDesc, 3, self.cumulativeTimeFromStart);
        output.B(serialDesc, 4, self.splitDistance);
        output.B(serialDesc, 5, self.splitAvgSpeed);
        output.d(serialDesc, 6, x.f117036a, self.bearing);
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a aVar = com.garmin.android.apps.connectmobile.pacepro.data.dto.c.a.f39786a;
        output.d(serialDesc, 7, aVar, self.startPoint);
        output.d(serialDesc, 8, aVar, self.endPoint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getPaceBandSplitPk() {
        return this.paceBandSplitPk;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Float getSplitTime() {
        return this.splitTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Float getElevationChange() {
        return this.elevationChange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPaceBandPk() {
        return this.paceBandPk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getCumulativeDistanceFromStart() {
        return this.cumulativeDistanceFromStart;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getCumulativeTimeFromStart() {
        return this.cumulativeTimeFromStart;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getSplitDistance() {
        return this.splitDistance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getSplitAvgSpeed() {
        return this.splitAvgSpeed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getBearing() {
        return this.bearing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.c getStartPoint() {
        return this.startPoint;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.c getEndPoint() {
        return this.endPoint;
    }

    public final PaceBandSplitDTO copy(Long paceBandSplitPk, Long paceBandPk, double cumulativeDistanceFromStart, double cumulativeTimeFromStart, double splitDistance, double splitAvgSpeed, Double bearing, com.garmin.android.apps.connectmobile.pacepro.data.dto.c startPoint, com.garmin.android.apps.connectmobile.pacepro.data.dto.c endPoint, Float splitTime, Float elevationChange) {
        return new PaceBandSplitDTO(paceBandSplitPk, paceBandPk, cumulativeDistanceFromStart, cumulativeTimeFromStart, splitDistance, splitAvgSpeed, bearing, startPoint, endPoint, splitTime, elevationChange);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceBandSplitDTO)) {
            return false;
        }
        PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) other;
        return s.g(this.paceBandSplitPk, paceBandSplitDTO.paceBandSplitPk) && s.g(this.paceBandPk, paceBandSplitDTO.paceBandPk) && Double.compare(this.cumulativeDistanceFromStart, paceBandSplitDTO.cumulativeDistanceFromStart) == 0 && Double.compare(this.cumulativeTimeFromStart, paceBandSplitDTO.cumulativeTimeFromStart) == 0 && Double.compare(this.splitDistance, paceBandSplitDTO.splitDistance) == 0 && Double.compare(this.splitAvgSpeed, paceBandSplitDTO.splitAvgSpeed) == 0 && s.g(this.bearing, paceBandSplitDTO.bearing) && s.g(this.startPoint, paceBandSplitDTO.startPoint) && s.g(this.endPoint, paceBandSplitDTO.endPoint) && s.g(this.splitTime, paceBandSplitDTO.splitTime) && s.g(this.elevationChange, paceBandSplitDTO.elevationChange);
    }

    public final Double getBearing() {
        return this.bearing;
    }

    public final double getCumulativeDistanceFromStart() {
        return this.cumulativeDistanceFromStart;
    }

    public final double getCumulativeTimeFromStart() {
        return this.cumulativeTimeFromStart;
    }

    public final Float getElevationChange() {
        return this.elevationChange;
    }

    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.c getEndPoint() {
        return this.endPoint;
    }

    public final Long getPaceBandPk() {
        return this.paceBandPk;
    }

    public final Long getPaceBandSplitPk() {
        return this.paceBandSplitPk;
    }

    public final double getSplitAvgSpeed() {
        return this.splitAvgSpeed;
    }

    public final double getSplitDistance() {
        return this.splitDistance;
    }

    public final Float getSplitTime() {
        return this.splitTime;
    }

    public final com.garmin.android.apps.connectmobile.pacepro.data.dto.c getStartPoint() {
        return this.startPoint;
    }

    public int hashCode() {
        Long l14 = this.paceBandSplitPk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.paceBandPk;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.cumulativeDistanceFromStart), 31, this.cumulativeTimeFromStart), 31, this.splitDistance), 31, this.splitAvgSpeed);
        Double d14 = this.bearing;
        int iHashCode2 = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar = this.startPoint;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2 = this.endPoint;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        Float f14 = this.splitTime;
        int iHashCode5 = (iHashCode4 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.elevationChange;
        return iHashCode5 + (f15 != null ? f15.hashCode() : 0);
    }

    public String toString() {
        Long l14 = this.paceBandSplitPk;
        Long l15 = this.paceBandPk;
        double d14 = this.cumulativeDistanceFromStart;
        double d15 = this.cumulativeTimeFromStart;
        double d16 = this.splitDistance;
        double d17 = this.splitAvgSpeed;
        Double d18 = this.bearing;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar = this.startPoint;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2 = this.endPoint;
        Float f14 = this.splitTime;
        Float f15 = this.elevationChange;
        StringBuilder sbJ = f3.j(l14, l15, "PaceBandSplitDTO(paceBandSplitPk=", ", paceBandPk=", ", cumulativeDistanceFromStart=");
        sbJ.append(d14);
        j.x(sbJ, ", cumulativeTimeFromStart=", d15, ", splitDistance=");
        sbJ.append(d16);
        j.x(sbJ, ", splitAvgSpeed=", d17, ", bearing=");
        sbJ.append(d18);
        sbJ.append(", startPoint=");
        sbJ.append(cVar);
        sbJ.append(", endPoint=");
        sbJ.append(cVar2);
        sbJ.append(", splitTime=");
        sbJ.append(f14);
        sbJ.append(", elevationChange=");
        sbJ.append(f15);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        Long l14 = this.paceBandSplitPk;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            sn.a.n(dest, 1, l14);
        }
        Long l15 = this.paceBandPk;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            sn.a.n(dest, 1, l15);
        }
        dest.writeDouble(this.cumulativeDistanceFromStart);
        dest.writeDouble(this.cumulativeTimeFromStart);
        dest.writeDouble(this.splitDistance);
        dest.writeDouble(this.splitAvgSpeed);
        Double d14 = this.bearing;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            sn.a.m(dest, 1, d14);
        }
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar = this.startPoint;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cVar.writeToParcel(dest, flags);
        }
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2 = this.endPoint;
        if (cVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cVar2.writeToParcel(dest, flags);
        }
        Float f14 = this.splitTime;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
        Float f15 = this.elevationChange;
        if (f15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f15.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<PaceBandSplitDTO> serializer() {
            return a.f39757a;
        }

        private Companion() {
        }
    }

    public PaceBandSplitDTO(Long l14, Long l15, double d14, double d15, double d16, double d17, Double d18, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2, Float f14, Float f15) {
        this.paceBandSplitPk = l14;
        this.paceBandPk = l15;
        this.cumulativeDistanceFromStart = d14;
        this.cumulativeTimeFromStart = d15;
        this.splitDistance = d16;
        this.splitAvgSpeed = d17;
        this.bearing = d18;
        this.startPoint = cVar;
        this.endPoint = cVar2;
        this.splitTime = f14;
        this.elevationChange = f15;
    }

    public /* synthetic */ PaceBandSplitDTO(Long l14, Long l15, double d14, double d15, double d16, double d17, Double d18, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2, Float f14, Float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(l14, l15, d14, d15, d16, d17, d18, cVar, cVar2, (i14 & 512) != 0 ? null : f14, (i14 & 1024) != 0 ? null : f15);
    }

    public PaceBandSplitDTO(double d14, float f14) {
        this((Long) null, (Long) null, 0.0d, 0.0d, d14, 0.0d, (Double) null, (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) null, (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) null, Float.valueOf(oe2.f.V(f14)), (Float) null);
    }

    public PaceBandSplitDTO(double d14, float f14, float f15) {
        this((Long) null, (Long) null, 0.0d, 0.0d, d14, 0.0d, (Double) null, (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) null, (com.garmin.android.apps.connectmobile.pacepro.data.dto.c) null, Float.valueOf(oe2.f.V(f14)), Float.valueOf(f15));
    }
}
