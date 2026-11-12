package xs;

import c22.o;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.apache.commons.text.StringSubstitutor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxs/a;", "", "", "deviceUnitId", "Lus/a;", "protobufDataHandler", "<init>", "(JLus/a;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f192033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public us.a f192034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f192035c = q2.a(new vs.a(null, null, null, 7, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f192036d = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f192038b;

        static {
            int[] iArr = new int[GDILiveSessionProto.ActivityStateRequest.EndReason.values().length];
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.EndReason.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDILiveSessionProto.ActivityStateRequest.EndReason.DISCARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f192037a = iArr;
            int[] iArr2 = new int[GDILiveSessionProto.ActivityStateRequest.State.values().length];
            try {
                iArr2[GDILiveSessionProto.ActivityStateRequest.State.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GDILiveSessionProto.ActivityStateRequest.State.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GDILiveSessionProto.ActivityStateRequest.State.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f192038b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xs/a$c", "Lus/a$a;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements us.a.InterfaceC3220a {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:78:0x0151  */
        @Override // us.a.InterfaceC3220a
        public final void a(GDILiveSessionProto.SportProfile sportProfile, GDILiveSessionProto.ActivityStateRequest activityStateRequest, GDILiveSessionProto.ActivityStateRequest.EndReason endReason, List<GDILiveSessionProto.Metric> list) {
            us.a aVar;
            vs.f fVar;
            Object next;
            Object next2;
            ys.a aVar2;
            GDILiveSessionProto.ActivityStateRequest.State state;
            a2 a2Var = a2.ACTIVITY_RECORDING;
            String strO = am.j.o(endReason != null ? endReason.name() : null, " }", p6.b.i("onReceive: sport: ", sportProfile != null ? sportProfile.getName() : null, ", state: ", (activityStateRequest == null || (state = activityStateRequest.getState()) == null) ? null : state.name(), ", end reason: "));
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivityRecordingStateHandler", strO);
            if (list != null && !list.isEmpty()) {
                for (GDILiveSessionProto.Metric metric : list) {
                    a2 a2Var2 = a2.ACTIVITY_RECORDING;
                    String strQ = am.j.q(e5.j(metric.getType(), metric.getIntVal(), "onReceive: { metric type: ", ", metric value ", ", metric timestamp: "), metric.getTimestamp(), StringSubstitutor.DEFAULT_VAR_END);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "ActivityRecordingStateHandler", strQ);
                }
            }
            a aVar3 = a.this;
            p2 p2Var = aVar3.f192035c;
            p2 p2Var2 = aVar3.f192035c;
            ys.a aVar4 = ((vs.a) p2Var.getValue()).f179693b;
            a2 a2Var3 = a2.ACTIVITY_RECORDING;
            String str = "onReceive: current status: " + aVar4 + StringSubstitutor.DEFAULT_VAR_END;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "ActivityRecordingStateHandler", str);
            boolean z14 = true;
            if ((activityStateRequest != null ? activityStateRequest.getState() : null) != null) {
                GDILiveSessionProto.ActivityStateRequest.State state2 = activityStateRequest.getState();
                if (endReason == null && aVar4 != null && !(aVar4 instanceof ys.a.C3724a)) {
                    endReason = GDILiveSessionProto.ActivityStateRequest.EndReason.SAVED;
                }
                int i14 = state2 == null ? -1 : b.f192038b[state2.ordinal()];
                if (i14 == 1) {
                    aVar2 = ys.a.c.f199154a;
                } else if (i14 == 2) {
                    aVar2 = ys.a.g.f199158a;
                } else if (i14 != 3) {
                    aVar2 = ys.a.C3724a.f199152a;
                } else {
                    int i15 = endReason != null ? b.f192037a[endReason.ordinal()] : -1;
                    aVar2 = i15 != 1 ? i15 != 2 ? ys.a.C3724a.f199152a : ys.a.b.f199153a : ys.a.f.f199157a;
                }
                aVar4 = aVar2;
            }
            i2.a.b(a2Var3, "ActivityRecordingStateHandler", "onReceive: status: " + aVar4 + StringSubstitutor.DEFAULT_VAR_END);
            if (((aVar4 instanceof ys.a.d) || (aVar4 instanceof ys.a.b)) && (aVar = aVar3.f192034b) != null) {
                aVar.f172338f = null;
            }
            vs.a aVar5 = (vs.a) p2Var2.getValue();
            if (sportProfile != null) {
                Iterator<T> it = vs.f.f179710h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    vs.f fVar2 = (vs.f) next2;
                    if (fVar2.f179714d.f20362a == sportProfile.getSportFitType() && fVar2.f179715e.f20563a == sportProfile.getSportFitSubType()) {
                        break;
                    }
                }
                fVar = (vs.f) next2;
                if (fVar == null) {
                    fVar = vs.f.f179708f;
                }
                if (fVar == null) {
                    fVar = ((vs.a) p2Var2.getValue()).f179692a;
                }
            } else {
                fVar = ((vs.a) p2Var2.getValue()).f179692a;
            }
            p2Var2.k(null, vs.a.b(aVar5, fVar, aVar4, null, 4));
            if (list != null && !list.isEmpty()) {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z14 = false;
                        break;
                    }
                    GDILiveSessionProto.Metric metric2 = (GDILiveSessionProto.Metric) it3.next();
                    if (metric2.getType() == vs.b.TIMESTAMP.f179699a && metric2.getTimestamp() > 0) {
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            if ((aVar4 instanceof ys.a.g) || list == null || !z14) {
                return;
            }
            vs.a aVar6 = (vs.a) p2Var2.getValue();
            ArrayList arrayList = new ArrayList();
            for (GDILiveSessionProto.Metric metric3 : list) {
                w13.c cVar = vs.b.f179698e;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarN.next();
                } while (((vs.b) next).f179699a != metric3.getType());
                vs.b bVar = (vs.b) next;
                vs.c cVar2 = bVar == null ? null : new vs.c(bVar, Integer.valueOf(metric3.getIntVal()), Integer.valueOf(metric3.getTimestamp()));
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                }
            }
            p2Var2.k(null, vs.a.b(aVar6, null, null, arrayList, 3));
        }
    }

    static {
        new C3577a(null);
    }

    public a(long j8, us.a aVar) {
        this.f192033a = j8;
        this.f192034b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        xs.b bVar;
        us.a aVar;
        if (cVar instanceof xs.b) {
            bVar = (xs.b) cVar;
            int i14 = bVar.f192042c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f192042c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new xs.b(this, cVar);
            }
        } else {
            bVar = new xs.b(this, cVar);
        }
        Object obj = bVar.f192040a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f192042c;
        if (i15 == 0) {
            r.b(obj);
            us.a aVar3 = (us.a) zb0.k.b(us.a.class, this.f192033a);
            this.f192034b = aVar3;
            if (aVar3 != null) {
                aVar3.f172338f = this.f192036d;
            }
            if (!((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).i() && (aVar = this.f192034b) != null) {
                bVar.f192042c = 1;
                if (aVar.l(bVar) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        us.a aVar4 = this.f192034b;
        if (aVar4 != null) {
            a2 a2Var = a2.ACTIVITY_RECORDING;
            rs2.c cVar2 = aVar4.f172337e;
            if (cVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            String strE = org.apache.commons.lang3.e.e(cVar2.getF172494b(), "getActivityStatus device unit id ");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", strE);
            GDISmartProto.Smart smartC = us.a.c(aVar4, null, null, 3);
            if (smartC != null) {
                aVar4.d(smartC);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: xs.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxs/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3577a {
        public /* synthetic */ C3577a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3577a() {
        }
    }
}
