package ta0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b0<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f163237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f163238b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163239a;

        static {
            int[] iArr = new int[l90.c.values().length];
            try {
                iArr[l90.c.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l90.c.REJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l90.c.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163239a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceDiscoveryViewModel$startDeviceDiscovery$1$2$1", f = "DeviceDiscoveryViewModel.kt", l = {166, 169, 190, 195}, m = "emit", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l90.a.C2132a f163240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f163241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0<T> f163242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f163243d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(b0<? super T> b0Var, t13.d<? super b> dVar) {
            super(dVar);
            this.f163242c = b0Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f163241b = obj;
            this.f163243d |= Integer.MIN_VALUE;
            return this.f163242c.emit(null, this);
        }
    }

    public b0(o53.b0 b0Var, x xVar) {
        this.f163237a = b0Var;
        this.f163238b = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r14 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
    
        if (r13.emit(r14, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
    
        if (r13.emit(r14, r0) == r1) goto L48;
     */
    @Override // r53.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(l90.a aVar, t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f163243d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f163243d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object objAwait = bVar.f163241b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f163243d;
        x xVar = this.f163238b;
        if (i15 == 0) {
            o13.r.b(objAwait);
            if (aVar instanceof l90.a.C2132a) {
                a2 a2Var = a2.DEVICE_SETUP;
                l90.a.C2132a c2132a = (l90.a.C2132a) aVar;
                l90.b bVar2 = c2132a.f111510a;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryViewModel", "Device found, navigating to device confirm screen: " + bVar2);
                e2 e2Var = xVar.f163466j;
                l90.k kVarZ4 = xVar.z4(bVar2, c2132a.f111511b);
                bVar.f163240a = c2132a;
                bVar.f163243d = 1;
                if (e2Var.emit(kVarZ4, bVar) != aVar2) {
                    o53.r<l90.c> rVar = ((l90.a.C2132a) aVar).f111512c;
                    xVar.f163480z = rVar;
                    bVar.f163240a = null;
                    bVar.f163243d = 2;
                    objAwait = rVar.await(bVar);
                }
            } else if (p005kotlin.jvm.internal.s.g(aVar, l90.a.c.f111514a)) {
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "DeviceDiscoveryViewModel", "Visible device discovery timeout reached, navigating to DeviceList");
                e2 e2Var2 = xVar.f163462f;
                Unit unit = Unit.INSTANCE;
                bVar.f163240a = null;
                bVar.f163243d = 3;
            } else {
                if (!p005kotlin.jvm.internal.s.g(aVar, l90.a.b.f111513a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var3 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "DeviceDiscoveryViewModel", "Device discovery failed or timed out, canceling discovery job");
                e2 e2Var3 = xVar.f163462f;
                Unit unit2 = Unit.INSTANCE;
                bVar.f163240a = null;
                bVar.f163243d = 4;
            }
            return aVar2;
        }
        if (i15 == 1) {
            aVar = bVar.f163240a;
            o13.r.b(objAwait);
            o53.r<l90.c> rVar2 = ((l90.a.C2132a) aVar).f111512c;
            xVar.f163480z = rVar2;
            bVar.f163240a = null;
            bVar.f163243d = 2;
            objAwait = rVar2.await(bVar);
        } else if (i15 == 2) {
            o13.r.b(objAwait);
        } else {
            if (i15 == 3) {
                o13.r.b(objAwait);
                return Unit.INSTANCE;
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objAwait);
            xVar.x4();
        }
        xVar.x4();
        int i16 = a.f163239a[((l90.c) objAwait).ordinal()];
        if (i16 == 1) {
            a2 a2Var4 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "DeviceDiscoveryViewModel", "User confirmed device");
        } else if (i16 == 2) {
            a2 a2Var5 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "DeviceDiscoveryViewModel", "User rejected device");
        } else {
            if (i16 != 3) {
                lc.u0.r();
                return null;
            }
            a2 a2Var6 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "DeviceDiscoveryViewModel", "User skipped device confirmation, ending device setup flow");
        }
        return Unit.INSTANCE;
    }
}
