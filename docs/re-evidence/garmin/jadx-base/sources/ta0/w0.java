package ta0;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceScanningScreenKt$DeviceScanningRoute$1$1", f = "DeviceScanningScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<l90.k> f163452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<l90.k, Unit> f163453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x3<l90.k> x3Var, e23.l<? super l90.k, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f163452a = x3Var;
            this.f163453b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f163452a, this.f163453b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            l90.k f182175a = this.f163452a.getF182175a();
            if (f182175a != null) {
                this.f163453b.invoke(f182175a);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.discovery.DeviceScanningScreenKt$DeviceScanningRoute$2$1", f = "DeviceScanningScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f163454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l90.b f163455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f163456c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, l90.b bVar, Long l14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f163454a = xVar;
            this.f163455b = bVar;
            this.f163456c = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f163454a, this.f163455b, this.f163456c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x xVar = this.f163454a;
            xVar.getClass();
            l90.b bVar = this.f163455b;
            bVar.getClass();
            c2 c2Var = xVar.f163479y;
            if (c2Var == null || !c2Var.isActive()) {
                a2 a2Var = a2.DEVICE_SETUP;
                String str = bVar.f111521f;
                StringBuilder sb3 = new StringBuilder("Starting device discovery for ");
                sb3.append(str);
                sb3.append(" antId: ");
                Long l14 = this.f163456c;
                sb3.append(l14);
                String string = sb3.toString();
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceDiscoveryViewModel", string);
                xVar.f163480z = null;
                xVar.A.clear();
                p2 p2Var = xVar.f163472p;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                xVar.f163479y = ge1.b.T(v1.a(xVar), null, null, new e0(xVar, bVar, l14, null), 3);
            } else {
                a2 a2Var2 = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "DeviceDiscoveryViewModel", "Device discovery job is already active, not starting a new one");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(x xVar, l90.b bVar, Long l14, e23.l<? super l90.k, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        xVar.getClass();
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-862172838);
        int i15 = i14 | (o0VarE.r(xVar) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.B(l14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(xVar.f163465i, o0VarE);
            l90.k kVar = (l90.k) p1VarC.getF182175a();
            boolean zB = ((i15 & 7168) == 2048) | o0VarE.B(p1VarC);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new a(p1VarC, lVar, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(p1VarC, lVar, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, kVar, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(xVar) | o0VarE.r(bVar) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new b(xVar, bVar, l14, null);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(xVar, bVar, l14, null);
                    o0VarE.K(objQ2);
                }
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            p1 p1VarC2 = s9.c.c(xVar.f163473q, o0VarE);
            String str = bVar.f111521f;
            o90.a aVar4 = bVar.f111526k;
            d90.e eVar = bVar.f111531p.f58437c.f58418g;
            b(str, aVar4, eVar.f58449a, eVar.f58450b, eVar.f58451c, ((Boolean) p1VarC2.getF182175a()).booleanValue(), aVar, aVar2, lVar2, o0VarE, 267911168 & (i15 << 6));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(xVar, bVar, l14, lVar, aVar, aVar2, lVar2, i14, 12);
        }
    }

    public static final void b(String str, o90.a aVar, String str2, String str3, String str4, boolean z14, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        String str5;
        p3.o0 o0Var;
        String strJ;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1871459301);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str5 = str4;
            i15 |= o0VarE.B(str5) ? 16384 : 8192;
        } else {
            str5 = str4;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_pairing_your_device);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1118931358, R.string.smart_troubleshooting_open_troubleshooting, o0VarE, false);
            } else {
                o0VarE.C(327204194);
                o0VarE.g0(false);
                strJ = null;
            }
            int i17 = i16 << 3;
            o0Var = o0VarE;
            da0.p.c("device_discovery_device_scanning_screen", str, aVar, strQ, true, null, null, null, strJ, z14 ? aVar2 : null, false, null, null, false, null, null, false, false, aVar3, lVar, null, null, z3.f.c(1325976796, new kh0.p(1, str5, str2, str3, z14), o0VarE), o0Var, (i17 & 112) | 24582 | (i17 & 896), i17 & 2113929216, 3072, 7601376);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(str, aVar, str2, str3, str4, z14, aVar2, aVar3, lVar, i14);
        }
    }
}
