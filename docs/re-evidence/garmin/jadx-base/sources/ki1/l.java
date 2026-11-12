package ki1;

import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;
import r53.b2;
import r53.k2;
import r53.m1;
import r53.m2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lki1/l;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lii1/c;", "getDeviceInfo", "Lii1/e;", "isDeviceConnected", "Lhi1/e;", "updateFindMyDeviceLocation", "Lii1/f;", "observeSavedDeviceLocation", "Lji1/b;", "getPhoneLocation", "Lii1/m;", "sendFindMyBandUseCase", "Lii1/k;", "sendCancelFindMyDeviceUseCase", "Lhi1/a;", "isFindMyBandSupportedUseCase", "<init>", "(JLii1/c;Lii1/e;Lhi1/e;Lii1/f;Lji1/b;Lii1/m;Lii1/k;Lhi1/a;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f104851r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii1.c f104853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi1.e f104854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ji1.b f104855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ii1.m f104856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii1.k f104857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hi1.a f104858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f104859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f104860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f104861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f104862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f104863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f104864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b2 f104865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f104866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f104867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f104868q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceConnectedState$1", f = "FindMyDeviceViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<q53.t<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f104870b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ki1/l$b$a", "Lxf0/b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends xf0.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f104872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<Boolean> f104873b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(l lVar, q53.t<? super Boolean> tVar) {
                this.f104872a = lVar;
                this.f104873b = tVar;
            }

            @Override // xf0.b
            public final void deviceConnected(pi2.g gVar) {
                gVar.getClass();
                Bundle eventData = gVar.getEventData();
                if (eventData != null) {
                    long j8 = eventData.getLong("GCM_extra_device_connected_unit_id");
                    long j14 = this.f104872a.f104852a;
                    if (j8 == j14) {
                        String strF = a0.f(j14, "[DeviceConnectionEventListener] device connected [deviceId=", "]");
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
                        this.f104873b.i(Boolean.TRUE);
                    }
                }
            }

            @Override // xf0.b
            public final void deviceDisconnected(pi2.h hVar) {
                hVar.getClass();
                Bundle eventData = hVar.getEventData();
                if (eventData != null) {
                    long j8 = eventData.getLong("GCM_extra_device_connected_unit_id");
                    long j14 = this.f104872a.f104852a;
                    if (j8 == j14) {
                        String strF = a0.f(j14, "[DeviceConnectionEventListener] device disconnected [deviceId=", "]");
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
                        this.f104873b.i(Boolean.FALSE);
                    }
                }
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = l.this.new b(dVar);
            bVar.f104870b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super Boolean> tVar, t13.d<? super Unit> dVar) {
            return ((b) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            q53.t tVar = (q53.t) this.f104870b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104869a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(l.this, tVar);
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.b(aVar2);
                jx0.e eVar = new jx0.e(aVar2, 17);
                this.f104870b = null;
                this.f104869a = 1;
                if (q53.r.a(tVar, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo13/q;", "Lfi1/b;", "savedDeviceLocationResult", "Lki1/a;", "currentLocation", "Lfi1/c;", "<anonymous>", "(Lo13/q;Lki1/a;)Lfi1/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceNavigationDirections$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<o13.q<? extends fi1.b>, ki1.a, t13.d<? super fi1.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f104874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ki1.a f104875b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(o13.q<? extends fi1.b> qVar, ki1.a aVar, t13.d<? super fi1.c> dVar) {
            Object obj = qVar.f128597a;
            c cVar = new c(dVar);
            cVar.f104874a = obj;
            cVar.f104875b = aVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.f104874a;
            ki1.a aVar = this.f104875b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = o13.q.f128596b;
            fi1.b bVar = null;
            if (obj2 instanceof o13.q.b) {
                obj2 = null;
            }
            fi1.b bVar2 = (fi1.b) obj2;
            if (aVar instanceof ki1.a.C2008a) {
                bVar = ((ki1.a.C2008a) aVar).f104817a;
            } else if (p005kotlin.jvm.internal.s.g(aVar, ki1.a.b.f104818a)) {
                bVar = bVar2;
            } else if (!p005kotlin.jvm.internal.s.g(aVar, ki1.a.c.f104819a)) {
                u0.r();
                return null;
            }
            return new fi1.c(bVar2, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lfi1/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceNavigationDirections$2", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super fi1.c>, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super fi1.c> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = l.f104851r;
            l.this.y4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lfi1/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceState$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<r53.j<? super fi1.a>, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super fi1.a> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = l.f104851r;
            l lVar = l.this;
            lVar.getClass();
            ge1.b.T(v1.a(lVar), null, null, new n(lVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceState$2", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<Boolean, t13.d<? super Unit>, Object> {
        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((f) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = l.f104851r;
            l.this.y4();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfi1/a;", "info", "", "connected", "Lfi1/d;", "<anonymous>", "(Lfi1/a;Z)Lfi1/d;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$deviceState$3", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.q<fi1.a, Boolean, t13.d<? super fi1.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ fi1.a f104879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f104880b;

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(fi1.a aVar, Boolean bool, t13.d<? super fi1.d> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = new g(dVar);
            gVar.f104879a = aVar;
            gVar.f104880b = zBooleanValue;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fi1.a aVar = this.f104879a;
            boolean z14 = this.f104880b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new fi1.d(aVar, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lfi1/d;", "deviceState", "Lki1/u;", "infoUiState", "navigationDirectionsUiState", "Lki1/v;", "requestLocationState", "Lki1/w;", "<anonymous>", "(Lfi1/d;Lki1/u;Lki1/u;Lki1/v;)Lki1/w;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$uiState$1", f = "FindMyDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.s<fi1.d, u, u, v, t13.d<? super w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ fi1.d f104881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ u f104882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ u f104883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ v f104884d;

        public h(t13.d<? super h> dVar) {
            super(5, dVar);
        }

        @Override // e23.s
        public final Object invoke(fi1.d dVar, u uVar, u uVar2, v vVar, t13.d<? super w> dVar2) {
            h hVar = l.this.new h(dVar2);
            hVar.f104881a = dVar;
            hVar.f104882b = uVar;
            hVar.f104883c = uVar2;
            hVar.f104884d = vVar;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:28:0x006b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0084  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[LOOP:3: B:37:0x009f->B:39:0x00a5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d2 A[EDGE_INSN: B:49:0x00d2->B:52:0x00da BREAK  A[LOOP:0: B:18:0x0049->B:64:?]] */
        /* JADX WARN: Code duplicated, block: B:50:0x00d5 A[EDGE_INSN: B:50:0x00d5->B:52:0x00da BREAK  A[LOOP:0: B:18:0x0049->B:64:?]] */
        /* JADX WARN: Code duplicated, block: B:62:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x0059 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:0: B:18:0x0049->B:64:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0075 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:1: B:26:0x0065->B:67:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x008c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x007e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x00d2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:4: B:44:0x00bc->B:76:?, LOOP_END, SYNTHETIC] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            w.a cVar;
            Iterator it;
            Iterator it3;
            ArrayList arrayList;
            ArrayList arrayList2;
            Iterator it4;
            Iterator it5;
            fi1.d dVar = this.f104881a;
            u uVar = this.f104882b;
            u uVar2 = this.f104883c;
            v vVar = this.f104884d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            List listK = x.k(uVar, uVar2);
            if (listK == null || !listK.isEmpty()) {
                Iterator it6 = listK.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        if (listK != null && listK.isEmpty()) {
                            cVar = w.a.d.f104918a;
                            break;
                        }
                        it = listK.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                cVar = w.a.d.f104918a;
                                break;
                            }
                            if (!(((u) it.next()) instanceof u.c)) {
                                if (listK.isEmpty()) {
                                    cVar = w.a.C2010a.f104915a;
                                    break;
                                }
                                it3 = listK.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        cVar = w.a.C2010a.f104915a;
                                        break;
                                    }
                                    if (((u) it3.next()) instanceof u.a) {
                                        arrayList = new ArrayList();
                                        while (r7.hasNext()) {
                                            if (obj instanceof u.a) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        arrayList2 = new ArrayList(y.r(arrayList, 10));
                                        it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            arrayList2.add(((u.a) it4.next()).f104907a);
                                        }
                                        if (arrayList2.isEmpty()) {
                                            cVar = w.a.C2010a.f104915a;
                                            break;
                                        }
                                        it5 = arrayList2.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                cVar = w.a.C2010a.f104915a;
                                                break;
                                            }
                                            if (((Throwable) it5.next()) instanceof s) {
                                                cVar = new w.a.c(vVar);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (((u) it6.next()) instanceof u.b) {
                        cVar = w.a.b.f104916a;
                    }
                }
            } else if (listK != null) {
                it = listK.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = w.a.d.f104918a;
                        break;
                    }
                    if (!(((u) it.next()) instanceof u.c)) {
                        if (listK.isEmpty()) {
                            cVar = w.a.C2010a.f104915a;
                            break;
                        }
                        it3 = listK.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                cVar = w.a.C2010a.f104915a;
                                break;
                            }
                            if (((u) it3.next()) instanceof u.a) {
                                arrayList = new ArrayList();
                                for (Object obj2 : listK) {
                                    if (obj2 instanceof u.a) {
                                        arrayList.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(y.r(arrayList, 10));
                                it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(((u.a) it4.next()).f104907a);
                                }
                                if (arrayList2.isEmpty()) {
                                    cVar = w.a.C2010a.f104915a;
                                    break;
                                }
                                it5 = arrayList2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        cVar = w.a.C2010a.f104915a;
                                        break;
                                    }
                                    if (((Throwable) it5.next()) instanceof s) {
                                        cVar = new w.a.c(vVar);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                it = listK.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = w.a.d.f104918a;
                        break;
                    }
                    if (!(((u) it.next()) instanceof u.c)) {
                        if (listK.isEmpty()) {
                            cVar = w.a.C2010a.f104915a;
                            break;
                        }
                        it3 = listK.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                cVar = w.a.C2010a.f104915a;
                                break;
                            }
                            if (((u) it3.next()) instanceof u.a) {
                                arrayList = new ArrayList();
                                while (r7.hasNext()) {
                                    if (obj2 instanceof u.a) {
                                        arrayList.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(y.r(arrayList, 10));
                                it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(((u.a) it4.next()).f104907a);
                                }
                                if (arrayList2.isEmpty()) {
                                    cVar = w.a.C2010a.f104915a;
                                    break;
                                }
                                it5 = arrayList2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        cVar = w.a.C2010a.f104915a;
                                        break;
                                    }
                                    if (((Throwable) it5.next()) instanceof s) {
                                        cVar = new w.a.c(vVar);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            hi1.a aVar2 = l.this.f104858g;
            String str = dVar.f71773a.f71764d;
            aVar2.getClass();
            str.getClass();
            zb0.u0 u0Var = (zb0.u0) zb0.u0.f203782n6.get(str);
            return new w(cVar, ((u0Var != null ? aVar2.f83862a.contains(u0Var) : false) && dVar.f71774b) ? mi1.a.C2266a.f118986a : mi1.a.b.f118987a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceViewModel$updateNavigationDirections$1", f = "FindMyDeviceViewModel.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f104887b;

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            i iVar = l.this.new i(dVar);
            iVar.f104887b = obj;
            return iVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objA;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            Object value8;
            Object value9;
            b0 b0Var = (b0) this.f104887b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104886a;
            l lVar = l.this;
            if (i14 == 0) {
                o13.r.b(obj);
                p2 p2Var = lVar.f104863l;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, u.b.f104908a));
                hi1.e eVar = lVar.f104854c;
                long j8 = lVar.f104852a;
                this.f104887b = b0Var;
                this.f104886a = 1;
                objA = eVar.a(j8, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = ((o13.q) obj).f128597a;
            }
            int i15 = o13.q.f128596b;
            if (!(objA instanceof o13.q.b)) {
                hi1.d dVar = (hi1.d) objA;
                if (dVar instanceof hi1.d.C1657d) {
                    String strF = a0.f(lVar.f104852a, "[updateNavigationDirections] update location successful [deviceId=", "]");
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
                    p2 p2Var2 = lVar.f104864m;
                    do {
                        value8 = p2Var2.getValue();
                    } while (!p2Var2.b(value8, ki1.a.b.f104818a));
                    p2 p2Var3 = lVar.f104863l;
                    do {
                        value9 = p2Var3.getValue();
                    } while (!p2Var3.b(value9, u.c.f104909a));
                } else if (p005kotlin.jvm.internal.s.g(dVar, hi1.d.c.f83871a)) {
                    String strF2 = a0.f(lVar.f104852a, "[updateNavigationDirections] update location unavailable [deviceId=", "]");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "FindMyDeviceViewModel", strF2);
                    p2 p2Var4 = lVar.f104863l;
                    do {
                        value7 = p2Var4.getValue();
                    } while (!p2Var4.b(value7, u.c.f104909a));
                } else if (dVar instanceof hi1.d.a) {
                    String strF3 = a0.f(lVar.f104852a, "[updateNavigationDirections] update location permissions denied [deviceId=", "]");
                    p92.y.f136664a.getClass();
                    p92.y.a.c("FindMyDeviceViewModel", strF3);
                    p2 p2Var5 = lVar.f104863l;
                    do {
                        value5 = p2Var5.getValue();
                    } while (!p2Var5.b(value5, new u.a(new s())));
                    p2 p2Var6 = lVar.f104862k;
                    do {
                        value6 = p2Var6.getValue();
                    } while (!p2Var6.b(value6, v.a.f104910a));
                } else {
                    if (!p005kotlin.jvm.internal.s.g(dVar, hi1.d.b.f83870a)) {
                        u0.r();
                        return null;
                    }
                    String strF4 = a0.f(lVar.f104852a, "[updateNavigationDirections] update location service disabled [deviceId=", "]");
                    p92.y.f136664a.getClass();
                    p92.y.a.c("FindMyDeviceViewModel", strF4);
                    p2 p2Var7 = lVar.f104863l;
                    do {
                        value3 = p2Var7.getValue();
                    } while (!p2Var7.b(value3, new u.a(new s())));
                    p2 p2Var8 = lVar.f104862k;
                    do {
                        value4 = p2Var8.getValue();
                    } while (!p2Var8.b(value4, v.b.f104911a));
                }
            }
            Throwable thB = o13.q.b(objA);
            if (thB != null) {
                String strF5 = a0.f(lVar.f104852a, "[updateNavigationDirections] update location failed [deviceId=", "]");
                p92.y.f136664a.getClass();
                p92.y.a.c("FindMyDeviceViewModel", strF5);
                p92.y.a.d("FindMyDeviceViewModel", thB);
                p2 p2Var9 = lVar.f104863l;
                do {
                    value2 = p2Var9.getValue();
                } while (!p2Var9.b(value2, new u.a(thB)));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public l(long j8, ii1.c cVar, ii1.e eVar, hi1.e eVar2, ii1.f fVar, ji1.b bVar, ii1.m mVar, ii1.k kVar, hi1.a aVar) {
        cVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        fVar.getClass();
        bVar.getClass();
        mVar.getClass();
        kVar.getClass();
        aVar.getClass();
        this.f104852a = j8;
        this.f104853b = cVar;
        this.f104854c = eVar2;
        this.f104855d = bVar;
        this.f104856e = mVar;
        this.f104857f = kVar;
        this.f104858g = aVar;
        u.b bVar2 = u.b.f104908a;
        p2 p2VarA = q2.a(bVar2);
        this.f104859h = p2VarA;
        p2 p2VarA2 = q2.a(new fi1.a(j8, null, null, null, null, 30, null));
        this.f104860i = p2VarA2;
        r53.b bVarF = r53.s.f(new b(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        m2 m2Var = k2.a.f150706c;
        b2 b2VarK = r53.s.K(bVarF, aVarA, m2Var, Boolean.valueOf(eVar.f93772a.a(j8)));
        this.f104861j = b2VarK;
        p2 p2VarA3 = q2.a(null);
        this.f104862k = p2VarA3;
        p2 p2VarA4 = q2.a(bVar2);
        this.f104863l = p2VarA4;
        p2 p2VarA5 = q2.a(ki1.a.c.f104819a);
        this.f104864m = p2VarA5;
        this.f104865n = r53.s.K(new r53.v(new d(null), new r53.u1(r53.s.A(fVar.f93773a.a(j8), fVar.f93774b), p2VarA5, new c(null))), v1.a(this), m2Var, new fi1.c(null, null, 3, null));
        b2 b2VarK2 = r53.s.K(new r53.u1(new r53.v(new e(null), p2VarA2), new m1(b2VarK, new f(null)), new g(null)), v1.a(this), m2Var, new fi1.d((fi1.a) p2VarA2.getValue(), ((Boolean) b2VarK.f150540a.getValue()).booleanValue()));
        this.f104866o = b2VarK2;
        this.f104867p = r53.s.K(r53.s.m(b2VarK2, p2VarA, p2VarA4, p2VarA3, new h(null)), v1.a(this), m2Var, new w(w.a.b.f104916a, mi1.a.b.f118987a));
        this.f104868q = q2.a(ki1.b.C2009b.f104821a);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f104862k;
            value = p2Var.getValue();
        } while (!p2Var.b(value, null));
    }

    public final void y4() {
        boolean zBooleanValue = ((Boolean) this.f104861j.f150540a.getValue()).booleanValue();
        long j8 = this.f104852a;
        if (zBooleanValue) {
            String strF = a0.f(j8, "[updateNavigationDirections] device connected -> updating location [deviceId=", "]");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "FindMyDeviceViewModel", strF);
            ge1.b.T(v1.a(this), null, null, new i(null), 3);
            return;
        }
        String strF2 = a0.f(j8, "[updateNavigationDirections] device not connected -> not updating location [deviceId=", "]");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "FindMyDeviceViewModel", strF2);
        ge1.b.T(v1.a(this), null, null, new m(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lki1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
