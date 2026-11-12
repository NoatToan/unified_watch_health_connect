package iw2;

import android.content.Context;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIRealtimeSettingsExtension;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liw2/i1;", "Ldt2/a;", "Ldt2/h;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 implements dt2.a, dt2.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cx2.h f95448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f95449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.y0<Unit> f95450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p0 f95451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dt2.g f95452g;

    public i1(Context context) {
        context.getClass();
        this.f95447b = context;
        this.f95448c = new cx2.h("RealTimeSettingsGfdiDataHandler", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(int i14, int i15, boolean z14, v13.c cVar) {
        e1 e1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i16 = e1Var.f95408d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                e1Var.f95408d = i16 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, cVar);
            }
        } else {
            e1Var = new e1(this, cVar);
        }
        Object objY = e1Var.f95406b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = e1Var.f95408d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setSwitchSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        e1Var.f95405a = bVar;
                        e1Var.f95408d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.ToggleChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.ToggleChange.newBuilder();
                        builderNewBuilder.setNewToggleValue(z14);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setToggleChange(builderNewBuilder);
                        objY = ge1.b.Y(new m0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), e1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setSwitchSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = e1Var.f95405a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setSwitchSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(int i14, int i15, int i16, v13.c cVar) {
        f1 f1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i17 = f1Var.f95418d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                f1Var.f95418d = i17 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(this, cVar);
            }
        } else {
            f1Var = new f1(this, cVar);
        }
        Object objY = f1Var.f95416b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = f1Var.f95418d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setTODPickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        f1Var.f95415a = bVar;
                        f1Var.f95418d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.TODPickerChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.TODPickerChange.newBuilder();
                        builderNewBuilder.setNewSeconds(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setTodPickerChange(builderNewBuilder);
                        objY = ge1.b.Y(new n0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), f1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setTODPickerSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = f1Var.f95415a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setTODPickerSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(int i14, int i15, int i16, v13.c cVar) {
        g1 g1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i17 = g1Var.f95429d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                g1Var.f95429d = i17 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        Object objY = g1Var.f95427b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = g1Var.f95429d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setTimePickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        g1Var.f95426a = bVar;
                        g1Var.f95429d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.TimePickerChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.TimePickerChange.newBuilder();
                        builderNewBuilder.setNewSeconds(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setTimePickerChange(builderNewBuilder);
                        objY = ge1.b.Y(new o0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), g1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setTimePickerSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = g1Var.f95426a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setTimePickerSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(int i14, int i15, int i16, v13.c cVar) {
        h1 h1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i17 = h1Var.f95439d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                h1Var.f95439d = i17 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objY = h1Var.f95437b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = h1Var.f95439d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setWatchFaceGridSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        h1Var.f95436a = bVar;
                        h1Var.f95439d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder.setCompositionId(i14);
                        builderNewBuilder.setRowId(i15);
                        builderNewBuilder.getWatchFaceGridValueChangeBuilder().setIndex(i16);
                        objY = ge1.b.Y(new a0(p0Var, bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder), null), h1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setWatchFaceGridSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = h1Var.f95436a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setWatchFaceGridSettingsDataValue: " + str);
        return str;
    }

    public final void E(kw2.d dVar) {
        rs2.c cVar = this.f95449d;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        this.f95448c.b("unregisterNotifications: for device " + cVar.getF92746j());
        com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
        rs2.c cVar2 = this.f95449d;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b = cVar2.getF92746j();
        bVar.getClass();
        if (com.garmin.realtimesettings.app.initialization.b.b(this.f95447b, f172494b).equals("NOTIFICATION")) {
            l73.c.b().k(dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(int i14, int i15, v13.c cVar) {
        q0 q0Var;
        mw2.c cVar2;
        boolean zBooleanValue;
        mw2.c cVar3;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i16 = q0Var.f95507d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                q0Var.f95507d = i16 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objY = q0Var.f95505b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = q0Var.f95507d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("fetchDeviceCompositions:");
            dt2.g gVar = this.f95452g;
            if (gVar != null) {
                rs2.c cVar4 = this.f95449d;
                if (cVar4 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar4.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar5 = this.f95449d;
                    if (cVar5 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    cVar2 = new mw2.c(context, cVar5.getF92746j(), gVar);
                    m(cVar2);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        q0Var.f95504a = cVar2;
                        q0Var.f95507d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.CompositionRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.CompositionRequest.newBuilder();
                        builderNewBuilder.setDepth(i15);
                        builderNewBuilder.setCompositionId(i14);
                        builderNewBuilder.setAppLocale(hb2.h.d(hb2.h.a(context)));
                        objY = ge1.b.Y(new x(p0Var, i14, cVar2, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setCompositionRequest(builderNewBuilder), null), q0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        cVar3 = cVar2;
                    } else {
                        zBooleanValue = false;
                    }
                    E(cVar2);
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    hVar.b("fetchDeviceCompositions: " + zBooleanValue);
                    return boolValueOf;
                }
            }
            return Boolean.FALSE;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar3 = q0Var.f95504a;
        o13.r.b(objY);
        zBooleanValue = ((Boolean) objY).booleanValue();
        cVar2 = cVar3;
        E(cVar2);
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
        hVar.b("fetchDeviceCompositions: " + zBooleanValue);
        return boolValueOf2;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(int i14, v13.c cVar) {
        r0 r0Var;
        String str;
        nw2.c cVar2;
        nw2.c cVar3;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i15 = r0Var.f95514d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                r0Var.f95514d = i15 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object objY = r0Var.f95512b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = r0Var.f95514d;
        cx2.h hVar = this.f95448c;
        if (i16 == 0) {
            o13.r.b(objY);
            hVar.b("getSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar4 = this.f95449d;
                if (cVar4 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar4.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar5 = this.f95449d;
                    if (cVar5 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    cVar2 = new nw2.c(context, cVar5.getF92746j(), gVar);
                    m(cVar2);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        r0Var.f95511a = cVar2;
                        r0Var.f95514d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.SettingsRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.SettingsRequest.newBuilder();
                        builderNewBuilder.setCompositionId(i14);
                        objY = ge1.b.Y(new y(cVar2, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsRequest(builderNewBuilder), i14, p0Var, null), r0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        cVar3 = cVar2;
                    }
                    E(cVar2);
                    hVar.b("getSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar3 = r0Var.f95511a;
        o13.r.b(objY);
        str = (String) objY;
        cVar2 = cVar3;
        E(cVar2);
        hVar.b("getSettingsDataValue: " + str);
        return str;
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return p13.a1.b(92);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, v13.c cVar) {
        s0 s0Var;
        jw2.e eVar;
        String strD;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i14 = s0Var.f95519c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s0Var.f95519c = i14 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        Object objY = s0Var.f95517a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s0Var.f95519c;
        cx2.h hVar = this.f95448c;
        if (i15 == 0) {
            o13.r.b(objY);
            hVar.b("getStartUpData:");
            dt2.g gVar = this.f95452g;
            eVar = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                long f172494b = cVar2.getF92746j();
                Context context = this.f95447b;
                qw2.b bVar = new qw2.b(context, f172494b, gVar);
                rs2.c cVar3 = this.f95449d;
                if (cVar3 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                if (cx2.g.d(context, cVar3.getF92741e())) {
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        s0Var.f95519c = 1;
                        GDIRealtimeSettingsProto.StartUpDataRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.StartUpDataRequest.newBuilder();
                        Locale localeA = hb2.h.a(context);
                        localeA.getClass();
                        String language = localeA.getLanguage();
                        language.getClass();
                        String lowerCase = language.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("in")) {
                            String languageTag = new Locale.Builder().setLanguage(TtmlNode.ATTR_ID).setRegion(localeA.getCountry()).build().toLanguageTag();
                            languageTag.getClass();
                            strD = d53.u.v(languageTag, "-", "_", false);
                        } else {
                            strD = hb2.h.d(localeA);
                        }
                        builderNewBuilder.setAppLocale(strD);
                        builderNewBuilder.setAppConsentCountry(str);
                        cx2.h hVar2 = p0Var.f95499a;
                        builderNewBuilder.getAppLocale();
                        builderNewBuilder.getAppConsentCountry();
                        hVar2.getClass();
                        objY = ge1.b.Y(new z(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setStartUpDataRequest(builderNewBuilder), p0Var, null), s0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                    }
                    hVar.b("getStartUpData: " + eVar);
                    return eVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objY);
        eVar = (jw2.e) objY;
        hVar.b("getStartUpData: " + eVar);
        return eVar;
    }

    public final void m(kw2.d dVar) {
        rs2.c cVar = this.f95449d;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        this.f95448c.b("registerNotifications: for device " + cVar.getF92746j());
        com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
        rs2.c cVar2 = this.f95449d;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("deviceInfo");
            throw null;
        }
        long f172494b = cVar2.getF92746j();
        bVar.getClass();
        if (com.garmin.realtimesettings.app.initialization.b.b(this.f95447b, f172494b).equals("NOTIFICATION")) {
            l73.c.b().i(dVar);
        }
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        this.f95448c.b("RTS onProtobufRequest:");
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIRealtimeSettingsProto.RealtimeSettingsService> generatedExtension = GDIRealtimeSettingsExtension.realtimeSettingsService;
        GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDIRealtimeSettingsProto.RealtimeSettingsService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (realtimeSettingsService == null) {
            return false;
        }
        if (realtimeSettingsService.hasSettingsChangeResponse()) {
            l73.c.b().e(new lw2.a(realtimeSettingsService));
            return true;
        }
        if (realtimeSettingsService.hasCompositionResponse()) {
            l73.c.b().e(new mw2.a(realtimeSettingsService));
            return true;
        }
        if (realtimeSettingsService.hasSettingsResponse()) {
            l73.c.b().e(new nw2.a(realtimeSettingsService));
            return true;
        }
        if (realtimeSettingsService.hasMenuChangeResponse()) {
            l73.c.b().e(new ow2.a(realtimeSettingsService));
            return true;
        }
        if (realtimeSettingsService.hasSettingsStateResponse()) {
            l73.c.b().e(new pw2.a(realtimeSettingsService));
            return true;
        }
        if (!realtimeSettingsService.hasSettingsUpdatedNotification()) {
            return false;
        }
        androidx.lifecycle.y0<Unit> y0Var = this.f95450e;
        if (y0Var != null) {
            y0Var.j(Unit.INSTANCE);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(int i14, int i15, fv2.b bVar, v13.c cVar) {
        t0 t0Var;
        String str;
        lw2.b bVar2;
        lw2.b bVar3;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i16 = t0Var.f95525d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                t0Var.f95525d = i16 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, cVar);
            }
        } else {
            t0Var = new t0(this, cVar);
        }
        Object objY = t0Var.f95523b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = t0Var.f95525d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setDatePickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar2 = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar2);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        t0Var.f95522a = bVar2;
                        t0Var.f95525d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.DatePickerChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.DatePickerChange.newBuilder();
                        builderNewBuilder.getNewDateBuilder().setDay(bVar.f73740b);
                        builderNewBuilder.getNewDateBuilder().setMonth(bVar.f73739a);
                        builderNewBuilder.getNewDateBuilder().setYear(bVar.f73741c);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setDatePickerChange(builderNewBuilder);
                        objY = ge1.b.Y(new b0(bVar2, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), t0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar3 = bVar2;
                    }
                    E(bVar2);
                    hVar.b("setDatePickerSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar3 = t0Var.f95522a;
        o13.r.b(objY);
        str = (String) objY;
        bVar2 = bVar3;
        E(bVar2);
        hVar.b("setDatePickerSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(int i14, int i15, String str, v13.c cVar) {
        u0 u0Var;
        String str2;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i16 = u0Var.f95532d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                u0Var.f95532d = i16 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar);
            }
        } else {
            u0Var = new u0(this, cVar);
        }
        Object objY = u0Var.f95530b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = u0Var.f95532d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setEditTextSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str2 = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        u0Var.f95529a = bVar;
                        u0Var.f95532d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.EditTextValueChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.EditTextValueChange.newBuilder();
                        builderNewBuilder.setNewEditTextValue(str);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setEditTextValueChange(builderNewBuilder);
                        objY = ge1.b.Y(new c0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), u0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setEditTextSettingsDataValue: " + str2);
                    return str2;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = u0Var.f95529a;
        o13.r.b(objY);
        str2 = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setEditTextSettingsDataValue: " + str2);
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(int i14, int i15, float f14, v13.c cVar) {
        v0 v0Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i16 = v0Var.f95546d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                v0Var.f95546d = i16 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object objY = v0Var.f95544b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = v0Var.f95546d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setFloatPickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        v0Var.f95543a = bVar;
                        v0Var.f95546d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.FloatPickerChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.FloatPickerChange.newBuilder();
                        builderNewBuilder.setNewFloatValue(f14);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setFloatPickerChange(builderNewBuilder);
                        objY = ge1.b.Y(new d0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), v0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setFloatPickerSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = v0Var.f95543a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setFloatPickerSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(int i14, int i15, int i16, String str, v13.c cVar) {
        w0 w0Var;
        String str2;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i17 = w0Var.f95552d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                w0Var.f95552d = i17 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objY = w0Var.f95550b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = w0Var.f95552d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setHeightPickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str2 = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        w0Var.f95549a = bVar;
                        w0Var.f95552d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.HeightPickerValueChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.HeightPickerValueChange.newBuilder();
                        builderNewBuilder.setHeightValue(i16);
                        if (p005kotlin.jvm.internal.s.g(str, "METRIC")) {
                            builderNewBuilder.setMeasurementUnit(GDIDataTypes.MeasurementUnit.METRIC);
                        } else if (p005kotlin.jvm.internal.s.g(str, "STATUTE")) {
                            builderNewBuilder.setMeasurementUnit(GDIDataTypes.MeasurementUnit.STATUTE);
                        }
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setHeightPickerValueChange(builderNewBuilder);
                        objY = ge1.b.Y(new e0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), w0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setHeightPickerSettingsDataValue: " + str2);
                    return str2;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = w0Var.f95549a;
        o13.r.b(objY);
        str2 = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setHeightPickerSettingsDataValue: " + str2);
        return str2;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f95448c.getClass();
        this.f95449d = cVar;
        ((dt2.d) gVar).f61154i.add(this);
        this.f95452g = gVar;
        this.f95451f = new p0();
        GDIRealtimeSettingsExtension.registerAllExtensions(extensionRegistryLite);
        GDIRealtimeSettingsProto.registerAllExtensions(extensionRegistryLite);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(int i14, int i15, int i16, v13.c cVar) {
        x0 x0Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i17 = x0Var.f95561d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                x0Var.f95561d = i17 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objY = x0Var.f95559b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = x0Var.f95561d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setIntegerInputSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        x0Var.f95558a = bVar;
                        x0Var.f95561d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.IntegerInputChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.IntegerInputChange.newBuilder();
                        builderNewBuilder.setNewIntegerInputValue(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setIntegerInputChange(builderNewBuilder);
                        objY = ge1.b.Y(new f0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), x0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setIntegerInputSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = x0Var.f95558a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setIntegerInputSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(int i14, int i15, int i16, v13.c cVar) {
        y0 y0Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i17 = y0Var.f95570d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                y0Var.f95570d = i17 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object objY = y0Var.f95568b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = y0Var.f95570d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setIntegerPickerSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        y0Var.f95567a = bVar;
                        y0Var.f95570d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.IntegerPickerChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.IntegerPickerChange.newBuilder();
                        builderNewBuilder.setNewIntegerValue(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setIntegerPickerChange(builderNewBuilder);
                        objY = ge1.b.Y(new g0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), y0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setIntegerPickerSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = y0Var.f95567a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setIntegerPickerSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(int i14, int i15, v13.c cVar) {
        z0 z0Var;
        String str;
        ow2.c cVar2;
        ow2.c cVar3;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i16 = z0Var.f95578d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                z0Var.f95578d = i16 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object objY = z0Var.f95576b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = z0Var.f95578d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setMenuItemChange:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar4 = this.f95449d;
                if (cVar4 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar4.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar5 = this.f95449d;
                    if (cVar5 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    cVar2 = new ow2.c(context, cVar5.getF92746j(), gVar);
                    m(cVar2);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        z0Var.f95575a = cVar2;
                        z0Var.f95578d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.MenuChangeRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.MenuChangeRequest.newBuilder();
                        builderNewBuilder.setCompositionId(i14);
                        builderNewBuilder.setMenuId(i15);
                        objY = ge1.b.Y(new h0(cVar2, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setMenuChangeRequest(builderNewBuilder), p0Var, null), z0Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        cVar3 = cVar2;
                    }
                    E(cVar2);
                    hVar.b("setMenuItemChange: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar3 = z0Var.f95575a;
        o13.r.b(objY);
        str = (String) objY;
        cVar2 = cVar3;
        E(cVar2);
        hVar.b("setMenuItemChange: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(int i14, int i15, int i16, v13.c cVar) {
        a1 a1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i17 = a1Var.f95358d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                a1Var.f95358d = i17 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objY = a1Var.f95356b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = a1Var.f95358d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setMultiSelectionSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        a1Var.f95355a = bVar;
                        a1Var.f95358d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.MultiSelectionChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.MultiSelectionChange.newBuilder();
                        builderNewBuilder.setIndex(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setMultiSelectionChange(builderNewBuilder);
                        objY = ge1.b.Y(new i0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), a1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setMultiSelectionSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = a1Var.f95355a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setMultiSelectionSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(int i14, int i15, v13.c cVar) {
        b1 b1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i16 = b1Var.f95374d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                b1Var.f95374d = i16 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        Object objY = b1Var.f95372b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = b1Var.f95374d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setOnActionClickListener:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        b1Var.f95371a = bVar;
                        b1Var.f95374d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder.setCompositionId(i14);
                        builderNewBuilder.setRowId(i15);
                        objY = ge1.b.Y(new j0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder), p0Var, null), b1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setOnActionClickListener: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = b1Var.f95371a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setOnActionClickListener: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(int i14, int i15, xv2.c cVar, v13.c cVar2) {
        c1 c1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar2 instanceof c1) {
            c1Var = (c1) cVar2;
            int i16 = c1Var.f95386d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c1Var.f95386d = i16 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(this, cVar2);
            }
        } else {
            c1Var = new c1(this, cVar2);
        }
        Object objY = c1Var.f95384b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = c1Var.f95386d;
        cx2.h hVar = this.f95448c;
        if (i17 == 0) {
            o13.r.b(objY);
            hVar.b("setReorderableItemSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar3 = this.f95449d;
                if (cVar3 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar3.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar4 = this.f95449d;
                    if (cVar4 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar4.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        c1Var.f95383a = bVar;
                        c1Var.f95386d = 1;
                        cx2.h hVar2 = p0Var.f95499a;
                        Objects.toString(cVar);
                        hVar2.getClass();
                        GDIRealtimeSettingsProto.ReorderableItemChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.ReorderableItemChange.newBuilder();
                        Integer num = cVar.f192279b;
                        if (num != null) {
                            builderNewBuilder.setNewListPosition(num.intValue());
                        }
                        Boolean bool = cVar.f192280c;
                        if (bool != null) {
                            builderNewBuilder.setIsDelete(bool.booleanValue());
                        }
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setReorderableItemChange(builderNewBuilder);
                        objY = ge1.b.Y(new k0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), c1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setReorderableItemSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i17 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = c1Var.f95383a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setReorderableItemSettingsDataValue: " + str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(int i14, int i15, int i16, v13.c cVar) {
        d1 d1Var;
        String str;
        lw2.b bVar;
        lw2.b bVar2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i17 = d1Var.f95397d;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                d1Var.f95397d = i17 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, cVar);
            }
        } else {
            d1Var = new d1(this, cVar);
        }
        Object objY = d1Var.f95395b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = d1Var.f95397d;
        cx2.h hVar = this.f95448c;
        if (i18 == 0) {
            o13.r.b(objY);
            hVar.b("setSelectionSettingsDataValue:");
            dt2.g gVar = this.f95452g;
            str = null;
            if (gVar != null) {
                rs2.c cVar2 = this.f95449d;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                String f172493a = cVar2.getF92741e();
                Context context = this.f95447b;
                if (cx2.g.d(context, f172493a)) {
                    rs2.c cVar3 = this.f95449d;
                    if (cVar3 == null) {
                        p005kotlin.jvm.internal.s.m("deviceInfo");
                        throw null;
                    }
                    bVar = new lw2.b(context, cVar3.getF92746j(), gVar);
                    m(bVar);
                    p0 p0Var = this.f95451f;
                    if (p0Var != null) {
                        d1Var.f95394a = bVar;
                        d1Var.f95397d = 1;
                        p0Var.f95499a.getClass();
                        GDIRealtimeSettingsProto.SelectionChange.Builder builderNewBuilder = GDIRealtimeSettingsProto.SelectionChange.newBuilder();
                        builderNewBuilder.setNewSelectedIndex(i16);
                        GDIRealtimeSettingsProto.SettingsChangeRequest.Builder builderNewBuilder2 = GDIRealtimeSettingsProto.SettingsChangeRequest.newBuilder();
                        builderNewBuilder2.setCompositionId(i14);
                        builderNewBuilder2.setRowId(i15);
                        builderNewBuilder2.setSelectionChange(builderNewBuilder);
                        objY = ge1.b.Y(new l0(bVar, GDIRealtimeSettingsProto.RealtimeSettingsService.newBuilder().setSettingsChangeRequest(builderNewBuilder2), p0Var, null), d1Var);
                        if (objY == aVar) {
                            return aVar;
                        }
                        bVar2 = bVar;
                    }
                    E(bVar);
                    hVar.b("setSelectionSettingsDataValue: " + str);
                    return str;
                }
            }
            return null;
        }
        if (i18 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar2 = d1Var.f95394a;
        o13.r.b(objY);
        str = (String) objY;
        bVar = bVar2;
        E(bVar);
        hVar.b("setSelectionSettingsDataValue: " + str);
        return str;
    }
}
