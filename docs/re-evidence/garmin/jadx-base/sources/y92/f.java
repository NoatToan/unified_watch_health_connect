package y92;

import aa2.x;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import o53.c0;
import o53.m0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ly92/f;", "Ly92/d;", "Lo53/b0;", "", "deviceUnitId", "Ly92/a;", "devicePasscodeCallback", "Lda2/d;", "gdi", "Lo53/z;", "ioDispatcher", "<init>", "(JLy92/a;Lda2/d;Lo53/z;)V", "c", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class f implements y92.d, b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f195305g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f195306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y92.a f195307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da2.d f195308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f195309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<rl2.c> f195310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t13.g f195311f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$1", f = "NfcDevicePasscodeRepository.kt", l = {87}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<q53.t<? super Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f195313b;

        /* JADX INFO: renamed from: y92.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y92/f$a$a", "Lla2/a;", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3636a implements la2.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f195315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q53.t<Object> f195316b;

            public C3636a(f fVar, q53.t<Object> tVar) {
                this.f195315a = fVar;
                this.f195316b = tVar;
            }

            @Override // la2.a
            public final void onDeviceConnected(la2.b bVar) {
                if ((bVar.f111632a.getF92746j() == this.f195315a.f195306a ? bVar : null) != null) {
                    x92.a.f189663a.getClass();
                    x92.a.a("DevicePasscodeRepository", "Device Connected " + bVar);
                    q53.m.a(this.f195316b.i(bVar));
                }
            }

            @Override // la2.a
            public final void onDeviceConnectingFailure(la2.c cVar) {
            }

            @Override // la2.a
            public final void onDeviceDisconnected(la2.h hVar) {
                if ((hVar.f111673a.getF92746j() == this.f195315a.f195306a ? hVar : null) != null) {
                    x92.a.f189663a.getClass();
                    x92.a.a("DevicePasscodeRepository", "Device Disconnected " + hVar);
                    q53.m.a(this.f195316b.i(hVar));
                }
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = f.this.new a(dVar);
            aVar.f195313b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(q53.t<? super Object> tVar, t13.d<? super Unit> dVar) {
            return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195312a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.t tVar = (q53.t) this.f195313b;
                f fVar = f.this;
                C3636a c3636a = new C3636a(fVar, tVar);
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Registering device connection callback");
                fVar.f195308c.f58886a.b(c3636a);
                xr.a aVar2 = new xr.a(12, fVar, c3636a);
                this.f195312a = 1;
                if (q53.r.a(tVar, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$2", f = "NfcDevicePasscodeRepository.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<Object, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f195317a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$2$1", f = "NfcDevicePasscodeRepository.kt", l = {95}, m = "invokeSuspend", v = 1)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f195319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f195320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f195321c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Object f195322d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Object obj, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f195321c = fVar;
                this.f195322d = obj;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f195321c, this.f195322d, dVar);
                aVar.f195320b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b0 b0Var;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f195319a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    b0 b0Var2 = (b0) this.f195320b;
                    this.f195320b = b0Var2;
                    this.f195319a = 1;
                    if (m0.b(3000L, this) == aVar) {
                        return aVar;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) this.f195320b;
                    o13.r.b(obj);
                }
                if (c0.g(b0Var)) {
                    f.n(this.f195321c, ((la2.b) this.f195322d).f111632a.getMacAddress(), 2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = f.this.new b(dVar);
            bVar.f195317a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((b) create(obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            Object obj2 = this.f195317a;
            boolean z14 = obj2 instanceof la2.b;
            f fVar = f.this;
            if (z14) {
                ge1.b.T(fVar, null, null, new a(fVar, obj2, null), 3);
            } else if (obj2 instanceof la2.h) {
                fVar.f195310e.set(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$setNfcService$1$2$1", f = "NfcDevicePasscodeRepository.kt", l = {381}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f195324b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f195326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f195327e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i14, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f195326d = str;
            this.f195327e = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = f.this.new d(this.f195326d, this.f195327e, dVar);
            dVar2.f195324b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195323a;
            if (i14 == 0) {
                o13.r.b(obj);
                b0 b0Var2 = (b0) this.f195324b;
                this.f195324b = b0Var2;
                this.f195323a = 1;
                if (m0.b(3000L, this) == aVar) {
                    return aVar;
                }
                b0Var = b0Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.f195324b;
                o13.r.b(obj);
            }
            if (c0.g(b0Var)) {
                int i15 = this.f195327e - 1;
                int i16 = f.f195305g;
                f.this.m(i15, this.f195326d);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new c(null);
    }

    public f(long j8, y92.a aVar, da2.d dVar, z zVar) {
        dVar.getClass();
        zVar.getClass();
        this.f195306a = j8;
        this.f195307b = aVar;
        this.f195308c = dVar;
        this.f195309d = zVar;
        this.f195310e = new AtomicReference<>(null);
        this.f195311f = t13.g.a.C3052a.d(zVar, g8.i.c());
        n(this, null, 3);
        r53.s.C(new m1(r53.s.f(new a(null)), new b(null)), this);
    }

    public static final sl2.f g(f fVar, pl2.f fVar2) {
        fVar.getClass();
        if (fVar2 == null) {
            return sl2.f.f160022b;
        }
        int i14 = fVar2.f138578b & UnsignedBytes.MAX_VALUE;
        sl2.f[] fVarArr = (sl2.f[]) sl2.f.f160036p.toArray(new sl2.f[0]);
        return i14 < fVarArr.length ? fVarArr[i14] : sl2.f.f160022b;
    }

    public static final z92.b h(f fVar, pl2.l lVar) {
        Object next;
        fVar.getClass();
        boolean z14 = lVar.f138589b;
        z92.b.a.C3790a c3790a = z92.b.a.f203144b;
        int i14 = lVar.f138588a;
        c3790a.getClass();
        Iterator<T> it = z92.b.a.f203152j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z92.b.a) next).f203153a != i14);
        z92.b.a aVar = (z92.b.a) next;
        if (aVar == null) {
            aVar = z92.b.a.NOT_RECOGNIZED;
        }
        return new z92.b(z14, aVar, lVar.f138591d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(f fVar, String str, String str2, v13.c cVar) {
        i iVar;
        o53.s sVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f195334d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f195334d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(fVar, cVar);
            }
        } else {
            iVar = new i(fVar, cVar);
        }
        Object obj = iVar.f195332b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f195334d;
        if (i15 == 0) {
            o13.r.b(obj);
            x92.a aVar2 = x92.a.f189663a;
            String str3 = "Changing passcode for device unit id: " + fVar.f195306a;
            aVar2.getClass();
            x92.a.a("DevicePasscodeRepository", str3);
            o53.s sVarB = gl.b.b();
            z zVar = fVar.f195309d;
            k kVar = new k(fVar, str, str2, sVarB, null);
            iVar.f195331a = sVarB;
            iVar.f195334d = 1;
            if (ge1.b.e0(zVar, kVar, iVar) != aVar) {
                sVar = sVarB;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVar = iVar.f195331a;
        o13.r.b(obj);
        iVar.f195331a = null;
        iVar.f195334d = 2;
        Object objAwait = sVar.await(iVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object j(f fVar, v13.c cVar) {
        l lVar;
        o53.s sVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f195346d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f195346d = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(fVar, cVar);
            }
        } else {
            lVar = new l(fVar, cVar);
        }
        Object obj = lVar.f195344b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f195346d;
        if (i15 == 0) {
            o13.r.b(obj);
            x92.a aVar2 = x92.a.f189663a;
            String str = "Checking passcode state for device unit id: " + fVar.f195306a;
            aVar2.getClass();
            x92.a.a("DevicePasscodeRepository", str);
            o53.s sVarB = gl.b.b();
            z zVar = fVar.f195309d;
            m mVar = new m(fVar, sVarB, null);
            lVar.f195343a = sVarB;
            lVar.f195346d = 1;
            if (ge1.b.e0(zVar, mVar, lVar) != aVar) {
                sVar = sVarB;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVar = lVar.f195343a;
        o13.r.b(obj);
        lVar.f195343a = null;
        lVar.f195346d = 2;
        Object objAwait = sVar.await(lVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object l(f fVar, v13.c cVar) {
        o oVar;
        o53.s sVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f195356d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f195356d = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(fVar, cVar);
            }
        } else {
            oVar = new o(fVar, cVar);
        }
        Object obj = oVar.f195354b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f195356d;
        if (i15 == 0) {
            o13.r.b(obj);
            x92.a aVar2 = x92.a.f189663a;
            String str = "Resetting passcode for device unit id: " + fVar.f195306a;
            aVar2.getClass();
            x92.a.a("DevicePasscodeRepository", str);
            o53.s sVarB = gl.b.b();
            z zVar = fVar.f195309d;
            p pVar = new p(fVar, sVarB, null);
            oVar.f195353a = sVarB;
            oVar.f195356d = 1;
            if (ge1.b.e0(zVar, pVar, oVar) != aVar) {
                sVar = sVarB;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVar = oVar.f195353a;
        o13.r.b(obj);
        oVar.f195353a = null;
        oVar.f195356d = 2;
        Object objAwait = sVar.await(oVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    public static /* synthetic */ void n(f fVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            str = null;
        }
        fVar.m(3, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static Object o(f fVar, String str, z92.a aVar, e eVar, v13.c cVar) {
        r rVar;
        o53.s sVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f195367d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f195367d = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(fVar, cVar);
            }
        } else {
            rVar = new r(fVar, cVar);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f195365b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f195367d;
        if (i15 == 0) {
            o13.r.b(obj);
            x92.a aVar3 = x92.a.f189663a;
            String str2 = "Setting passcode for device unit id: " + fVar.f195306a;
            aVar3.getClass();
            x92.a.a("DevicePasscodeRepository", str2);
            o53.s sVarB = gl.b.b();
            z zVar = fVar.f195309d;
            t tVar = new t(fVar, aVar, str, sVarB, eVar, null);
            rVar2.f195364a = sVarB;
            rVar2.f195367d = 1;
            if (ge1.b.e0(zVar, tVar, rVar2) != aVar2) {
                sVar = sVarB;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVar = rVar2.f195364a;
        o13.r.b(obj);
        rVar2.f195364a = null;
        rVar2.f195367d = 2;
        Object objAwait = sVar.await(rVar2);
        return objAwait == aVar2 ? aVar2 : objAwait;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object p(f fVar, String str, v13.c cVar) {
        u uVar;
        o53.s sVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f195382d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f195382d = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(fVar, cVar);
            }
        } else {
            uVar = new u(fVar, cVar);
        }
        Object obj = uVar.f195380b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f195382d;
        if (i15 == 0) {
            o13.r.b(obj);
            x92.a aVar2 = x92.a.f189663a;
            String str2 = "Verifying passcode for device unit id: " + fVar.f195306a;
            aVar2.getClass();
            x92.a.a("DevicePasscodeRepository", str2);
            o53.s sVarB = gl.b.b();
            z zVar = fVar.f195309d;
            v vVar = new v(fVar, str, sVarB, null);
            uVar.f195379a = sVarB;
            uVar.f195382d = 1;
            if (ge1.b.e0(zVar, vVar, uVar) != aVar) {
                sVar = sVarB;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sVar = uVar.f195379a;
        o13.r.b(obj);
        uVar.f195379a = null;
        uVar.f195382d = 2;
        Object objAwait = sVar.await(uVar);
        return objAwait == aVar ? aVar : objAwait;
    }

    @Override // y92.d
    public final Object a(String str, String str2, aa2.v vVar) {
        return i(this, str, str2, vVar);
    }

    @Override // y92.d
    public final Object b(String str, z92.a aVar, e eVar, x xVar) {
        return o(this, str, aVar, eVar, xVar);
    }

    @Override // y92.d
    public final Object c(v13.c cVar) {
        return j(this, cVar);
    }

    @Override // y92.d
    public Object d(t13.d<? super Boolean> dVar) {
        return l(this, (v13.c) dVar);
    }

    @Override // y92.d
    public final Object e(aa2.w wVar) {
        x92.a aVar = x92.a.f189663a;
        String str = "Checking if wallet is set up for device unit id: " + this.f195306a;
        aVar.getClass();
        x92.a.a("DevicePasscodeRepository", str);
        return ge1.b.e0(this.f195309d, new n(this, null), wVar);
    }

    @Override // y92.d
    public final Object f(String str, aa2.u.f fVar) {
        return p(this, str, fVar);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF195311f() {
        return this.f195311f;
    }

    public final String k() {
        DeviceProfile deviceProfile;
        DeviceProfile[] deviceProfileArrA = this.f195308c.f58886a.f111646e.a(this.f195306a);
        int length = deviceProfileArrA.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                deviceProfile = null;
                break;
            }
            deviceProfile = deviceProfileArrA[i14];
            if (deviceProfile.getConnectionType() == 1) {
                break;
            }
            i14++;
        }
        if (deviceProfile == null) {
            deviceProfile = (DeviceProfile) p13.u.H(deviceProfileArrA);
        }
        if (deviceProfile != null) {
            return deviceProfile.getF92741e();
        }
        return null;
    }

    public final void m(int i14, String str) {
        x92.a aVar = x92.a.f189663a;
        StringBuilder sb3 = new StringBuilder("Setting NFC service for device unit id ");
        long j8 = this.f195306a;
        sb3.append(j8);
        String string = sb3.toString();
        aVar.getClass();
        x92.a.a("DevicePasscodeRepository", string);
        if (str == null) {
            str = k();
        }
        if (str == null) {
            x92.a.b("DevicePasscodeRepository", "NFC service not found device unit id " + j8 + " not connected");
            return;
        }
        rl2.c cVar = (rl2.c) this.f195308c.f58886a.f111646e.getCapability(str, rl2.c.class);
        if (cVar != null) {
            this.f195310e.set(cVar);
            x92.a.a("DevicePasscodeRepository", "NFC service set for device unit id " + j8);
            return;
        }
        x92.a.b("DevicePasscodeRepository", "NFC service not found for device unit id " + j8);
        if (i14 > 0) {
            ge1.b.T(this, null, null, new d(str, i14, null), 3);
        }
    }

    @Override // y92.d
    public final void onCleared() {
        c0.c(this, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly92/f$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEVICE_CONNECTION_DELAY", "J", "device-passcode_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(long j8, y92.a aVar, da2.d dVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        y92.a aVar2 = (i14 & 2) != 0 ? null : aVar;
        if ((i14 & 4) != 0) {
            dVar = da2.d.b();
            dVar.getClass();
        }
        da2.d dVar2 = dVar;
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(j8, aVar2, dVar2, zVar);
    }
}
