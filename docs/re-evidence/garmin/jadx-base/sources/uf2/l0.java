package uf2;

import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDILiveSessionProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luf2/l0;", "", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f170425c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f170426a = o13.m.b(new p1(27));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f170427b = o13.m.b(new p1(28));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170428a;

        static {
            int[] iArr = new int[GDILiveSessionProto.ActivityStateRequest.State.values().length];
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.WORKOUT_WARMUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.WORKOUT_ACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.WORKOUT_COOLDOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.WORKOUT_REST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.SAVING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.DISCARDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.WORKOUT_ENDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.State.ENDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f170428a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GDILiveSessionProto.ActivityStateRequest activityStateRequest, e2 e2Var, v13.c cVar) {
        m0 m0Var;
        rf2.e eVar;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f170434c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f170434c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object obj = m0Var.f170432a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f170434c;
        if (i15 == 0) {
            o13.r.b(obj);
            GDILiveSessionProto.ActivityStateRequest.State state = activityStateRequest.getState();
            Object mVar = null;
            switch (state == null ? -1 : b.f170428a[state.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    lc.u0.r();
                    return null;
                case 1:
                case 2:
                    mVar = sf2.c.o.f158923a;
                    break;
                case 3:
                case 4:
                    mVar = new sf2.c.m(activityStateRequest.hasFinalDistanceM() ? new Integer(activityStateRequest.getFinalDistanceM()) : null);
                    break;
                case 5:
                    mVar = sf2.c.w.f158937a;
                    break;
                case 6:
                    mVar = sf2.c.q.f158925a;
                    break;
                case 7:
                    mVar = sf2.c.r.f158926a;
                    break;
                case 8:
                    mVar = sf2.c.s.f158927a;
                    break;
                case 9:
                    mVar = sf2.c.n.f158922a;
                    break;
                case 10:
                    mVar = sf2.c.k.f158919a;
                    break;
                case 11:
                    mVar = sf2.c.p.f158924a;
                    break;
                case 12:
                    rf2.e.a aVar = rf2.e.f152468a;
                    GDILiveSessionProto.ActivityStateRequest.EndReason endReason = activityStateRequest.getEndReason();
                    endReason.getClass();
                    aVar.getClass();
                    int i16 = rf2.e.a.C2868a.f152470a[endReason.ordinal()];
                    if (i16 == 1) {
                        eVar = rf2.e.d.f152473b;
                    } else {
                        if (i16 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        eVar = rf2.e.b.f152471b;
                    }
                    mVar = new sf2.c.l(eVar);
                    break;
            }
            if (mVar != null) {
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + mVar);
                m0Var.f170434c = 1;
                if (e2Var.emit(mVar, m0Var) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (r12.emit(r4, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(GDILiveSessionProto.SetConfigurationRequest setConfigurationRequest, e2 e2Var, v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f170442e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f170442e = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objA = n0Var.f170440c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f170442e;
        if (i15 != 0) {
            if (i15 == 1) {
                e2Var = n0Var.f170439b;
                setConfigurationRequest = n0Var.f170438a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objA);
        vf2.q qVar = (vf2.q) this.f170426a.getValue();
        int exerciseCategory = setConfigurationRequest.getExerciseCategory();
        int exerciseSubcategory = setConfigurationRequest.getExerciseSubcategory();
        n0Var.f170438a = setConfigurationRequest;
        n0Var.f170439b = e2Var;
        n0Var.f170442e = 1;
        objA = qVar.a(exerciseCategory, exerciseSubcategory, n0Var);
        if (objA != aVar) {
        }
        return aVar;
        int stepIndex = setConfigurationRequest.getStepIndex();
        int reps = setConfigurationRequest.getReps();
        float weight = setConfigurationRequest.getWeight();
        GDIDataTypes.MeasurementUnit weightUnit = setConfigurationRequest.getWeightUnit();
        weightUnit.getClass();
        sf2.c.e eVar = new sf2.c.e(stepIndex, reps, weight, weightUnit, (vf2.c) objA);
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorDeviceToApp", "Emit " + eVar);
        n0Var.f170438a = null;
        n0Var.f170439b = null;
        n0Var.f170442e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ce -> B:33:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(com.garmin.proto.generated.GDILiveSessionProto.FinalizeSetRequest r18, r53.e2 r19, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uf2.l0.c(com.garmin.proto.generated.GDILiveSessionProto$FinalizeSetRequest, r53.e2, v13.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/l0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
