package uf2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDILiveSessionExtension;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luf2/u;", "", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f170505d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f170506a = o13.m.b(new p1(25));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f170507b = o53.c0.a(o53.s0.f129406a.plus(g8.i.c()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f170508c = o13.m.b(new p1(26));

    static {
        new a(null);
    }

    public static /* synthetic */ Object b(u uVar, GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command, Integer num, Integer num2, zf2.i iVar, Integer num3, dt2.g gVar, v13.c cVar, int i14) {
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            num2 = null;
        }
        if ((i14 & 8) != 0) {
            iVar = null;
        }
        if ((i14 & 16) != 0) {
            num3 = null;
        }
        return uVar.a(command, num, num2, iVar, num3, gVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command, Integer num, Integer num2, zf2.i iVar, Integer num3, dt2.g gVar, v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f170526c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f170526c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objC = wVar.f170524a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f170526c;
        if (i15 == 0) {
            o13.r.b(objC);
            if (gVar == null) {
                zg2.c.f204692a.getClass();
                zg2.c.b("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " error: messenger is null");
                int i16 = o13.q.f128596b;
                return new o13.q.b(new IllegalStateException("Messenger is null"));
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "sendAppInitiatedCommand - command: " + command + " messenger: " + gVar);
            GDILiveSessionProto.AppInitiatedActivityCommandRequest.Builder builderNewBuilder = GDILiveSessionProto.AppInitiatedActivityCommandRequest.newBuilder();
            if (num != null && num2 != null) {
                GDILiveSessionProto.SportProfile.Builder builderNewBuilder2 = GDILiveSessionProto.SportProfile.newBuilder();
                builderNewBuilder2.setSportFitType(num.intValue());
                builderNewBuilder2.setSportFitSubType(num2.intValue());
                builderNewBuilder.setSportProfile(builderNewBuilder2.build());
            }
            if (iVar != null) {
                if (iVar instanceof zf2.i.c) {
                    builderNewBuilder.setWorkoutId(((zf2.i.c) iVar).f204654a);
                } else if (iVar instanceof zf2.i.b) {
                    builderNewBuilder.setWorkoutRecIdx(((zf2.i.b) iVar).f204653a);
                } else {
                    if (!(iVar instanceof zf2.i.a)) {
                        lc.u0.r();
                        return null;
                    }
                    zf2.i.a aVar2 = (zf2.i.a) iVar;
                    builderNewBuilder.setAdcLocalTimestamp(aVar2.f204651a);
                    builderNewBuilder.setAdcWorkoutIdx(aVar2.f204652b);
                }
            }
            if (num3 != null) {
                builderNewBuilder.setFinalDistanceM(num3.intValue());
            }
            o53.j0 j0VarJ = ge1.b.j(this.f170507b, null, null, new x(command, GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, GDILiveSessionProto.LiveSessionService.newBuilder().setAppInitiatedActivityCommandRequest(builderNewBuilder.setCommand(command)).build()).build(), gVar, null), 3);
            wVar.f170526c = 1;
            objC = j0VarJ.C(wVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return ((o13.q) objC).f128597a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(dt2.g gVar, boolean z14, v13.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f170546c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f170546c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objC = zVar.f170544a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f170546c;
        if (i15 == 0) {
            o13.r.b(objC);
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "sendCompleteSkippedWorkoutStepsResponse - completeSkippedSteps:" + z14 + " messenger:" + gVar);
            if (gVar == null) {
                zg2.c.b("LiveActivityInteractorAppToDevice", "sendCompleteSkippedWorkoutStepsResponse - error: messenger is null");
                int i16 = o13.q.f128596b;
                return new o13.q.b(new IllegalStateException("Messenger is null"));
            }
            GDILiveSessionProto.PromptSkippedClustersResponse.Builder builderNewBuilder = GDILiveSessionProto.PromptSkippedClustersResponse.newBuilder();
            builderNewBuilder.setCompleteSkippedClusters(z14);
            o53.j0 j0VarJ = ge1.b.j(this.f170507b, null, null, new a0(GDISmartProto.Smart.newBuilder().setExtension(GDILiveSessionExtension.liveSessionService, GDILiveSessionProto.LiveSessionService.newBuilder().setPromptSkippedClustersResponse(builderNewBuilder).build()).build(), gVar, null), 3);
            zVar.f170546c = 1;
            objC = j0VarJ.C(zVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return ((o13.q) objC).f128597a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(dt2.g gVar, v13.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f170312c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f170312c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        c0 c0Var2 = c0Var;
        Object obj = c0Var2.f170310a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var2.f170312c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.DISCARD;
        c0Var2.f170312c = 1;
        Object objB = b(this, command, null, null, null, null, gVar, c0Var2, 30);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(dt2.g gVar, v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f170358c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f170358c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        f0 f0Var2 = f0Var;
        Object obj = f0Var2.f170356a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var2.f170358c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.PAUSE;
        f0Var2.f170358c = 1;
        Object objB = b(this, command, null, null, null, null, gVar, f0Var2, 30);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(dt2.g gVar, v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f170372c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f170372c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        g0 g0Var2 = g0Var;
        Object obj = g0Var2.f170370a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var2.f170372c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.RESUME;
        g0Var2.f170372c = 1;
        Object objB = b(this, command, null, null, null, null, gVar, g0Var2, 30);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(dt2.g gVar, Integer num, v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f170391c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f170391c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        h0 h0Var2 = h0Var;
        Object obj = h0Var2.f170389a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var2.f170391c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.SAVE;
        h0Var2.f170391c = 1;
        Object objB = b(this, command, null, null, null, num, gVar, h0Var2, 14);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(Integer num, Integer num2, zf2.i iVar, dt2.g gVar, v13.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f170409c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f170409c = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        i0 i0Var2 = i0Var;
        Object obj = i0Var2.f170407a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var2.f170409c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command command = GDILiveSessionProto.AppInitiatedActivityCommandRequest.Command.INITIAL_START;
        i0Var2.f170409c = 1;
        Object objB = b(this, command, num, num2, iVar, null, gVar, i0Var2, 16);
        return objB == aVar ? aVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(dt2.g gVar, List list, v13.c cVar) {
        j0 j0Var;
        GDISmartProto.Smart smartBuild;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f170416e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f170416e = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objB = j0Var.f170414c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f170416e;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                if (gVar != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((rf2.a) it.next()).f152454a));
                    }
                    GDILiveSessionProto.MetricConfigurationRequest.Builder builderNewBuilder = GDILiveSessionProto.MetricConfigurationRequest.newBuilder();
                    builderNewBuilder.addAllRequestedTypes(arrayList);
                    GDILiveSessionProto.LiveSessionService.Builder builderNewBuilder2 = GDILiveSessionProto.LiveSessionService.newBuilder();
                    builderNewBuilder2.setMetricConfigurationRequest(builderNewBuilder.build());
                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder3.setExtension(GDILiveSessionExtension.liveSessionService, builderNewBuilder2.build());
                    smartBuild = builderNewBuilder3.build();
                    zg2.c.f204692a.getClass();
                    zg2.c.a("LiveActivityInteractorAppToDevice", "initMetricRequest smart " + smartBuild);
                    smartBuild.getClass();
                    j0Var.f170412a = gVar;
                    j0Var.f170413b = smartBuild;
                    j0Var.f170416e = 1;
                    objB = gVar.b(smartBuild, j0Var);
                    if (objB == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            GDISmartProto.Smart smart = j0Var.f170413b;
            dt2.g gVar2 = j0Var.f170412a;
            o13.r.b(objB);
            smartBuild = smart;
            gVar = gVar2;
            y0 y0Var = (y0) this.f170508c.getValue();
            smartBuild.getClass();
            y0Var.getClass();
            gVar.getClass();
            y0Var.f170541b = gVar;
            y0Var.f170540a = smartBuild;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityInteractorAppToDevice", "initMetricRequest response " + ((GDISmartProto.Smart) objB));
        } catch (ProtobufException e4) {
            zg2.c.f204692a.getClass();
            zg2.c.b("LiveActivityInteractorAppToDevice", "initMetricRequest error - " + e4);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luf2/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
