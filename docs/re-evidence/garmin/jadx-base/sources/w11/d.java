package w11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.n0;
import b21.o4;
import b82.g1;
import c.w;
import c2.x2;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import f5.i2;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.fe;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l72.c1;
import lc.u0;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import p40.q0;
import sk0.k1;
import vv0.u;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.screen.ImageRecognitionAndBarcodeScannerScreenKt$CameraPermissionHandler$1$1", f = "ImageRecognitionAndBarcodeScannerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f181202a = p1Var;
            this.f181203b = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f181202a, this.f181203b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f181202a.getF182175a().booleanValue()) {
                this.f181203b.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.screen.ImageRecognitionAndBarcodeScannerScreenKt$CameraPermissionHandler$2$1", f = "ImageRecognitionAndBarcodeScannerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PermissionState f181204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f181205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f181209f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(PermissionState permissionState, e23.l<? super Boolean, Unit> lVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, p1<Boolean> p1Var4, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f181204a = permissionState;
            this.f181205b = lVar;
            this.f181206c = p1Var;
            this.f181207d = p1Var2;
            this.f181208e = p1Var3;
            this.f181209f = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f181204a, this.f181205b, this.f181206c, this.f181207d, this.f181208e, this.f181209f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            PermissionState permissionState = this.f181204a;
            PermissionStatus status = permissionState.getStatus();
            boolean z14 = status instanceof PermissionStatus.Granted;
            e23.l<Boolean, Unit> lVar = this.f181205b;
            p1<Boolean> p1Var = this.f181207d;
            p1<Boolean> p1Var2 = this.f181206c;
            if (z14) {
                lVar.invoke(Boolean.TRUE);
                d.c(p1Var2, false);
                d.d(p1Var, false);
            } else {
                if (!(status instanceof PermissionStatus.Denied)) {
                    u0.r();
                    return null;
                }
                lVar.invoke(Boolean.FALSE);
                if (!this.f181208e.getF182175a().booleanValue()) {
                    permissionState.launchPermissionRequest();
                    this.f181209f.setValue(Boolean.TRUE);
                } else if (((PermissionStatus.Denied) status).getShouldShowRationale()) {
                    d.d(p1Var, true);
                    d.c(p1Var2, false);
                } else {
                    d.c(p1Var2, true);
                    d.d(p1Var, false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f181211b;

        static {
            int[] iArr = new int[x11.a.values().length];
            try {
                iArr[x11.a.FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x11.a.BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181210a = iArr;
            int[] iArr2 = new int[o4.values().length];
            try {
                iArr2[o4.LOG_FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[o4.CREATE_MEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o4.CREATE_RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f181211b = iArr2;
        }
    }

    public static final void a(o4 o4Var, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-256091638);
        int i15 = i14 | (o0VarE.k(o4Var.ordinal()) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = c.f181211b[o4Var.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-1363790619);
                c1.f110940a.b(false, g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found)), y.Q(o0VarE, R.string.msg_no_scan_barcode_detected), y.Q(o0VarE, R.string.lbl_quick_add), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), false, aVar, aVar3, aVar2, aVar2, o0VarE, 6, (i15 & 112) | ((i15 >> 3) & 896) | ((i15 << 3) & 7168) | ((i15 << 6) & 57344), 1816);
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(-1363071233);
                c1.f110940a.b(false, g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found)), y.Q(o0VarE, R.string.msg_no_scan_barcode_detected_custom_meal), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), null, false, aVar3, aVar2, null, aVar2, o0VarE, 6, ((i15 >> 6) & 112) | (i15 & 896) | ((i15 << 6) & 57344), 10136);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -1290920147, false);
                }
                o0VarE.C(-1362467260);
                c1 c1Var = c1.f110940a;
                String strB = g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found));
                x0.f23314a.getClass();
                c1Var.b(false, strB, gl1.d.W(x0.Df), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), null, false, aVar3, aVar2, null, aVar2, o0VarE, 6, ((i15 >> 6) & 112) | (i15 & 896) | ((i15 << 6) & 57344), 10136);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w11.c(o4Var, aVar, aVar2, aVar3, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        Object bVar;
        p1 p1Var;
        p3.m.a.C2565a c2565a;
        o0 o0VarE = mVar.E(923580308);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(lVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new u(27);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = new u(28);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = new u(29);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = new w11.b(0);
                o0VarE.K(objQ4);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            int i17 = i16 & 14;
            boolean zB = o0VarE.B(p1Var5) | (i17 == 4);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a2) {
                objQ5 = new oy0.c(lVar, p1Var5, 9);
                o0VarE.K(objQ5);
            }
            PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.CAMERA", (e23.l) objQ5, o0VarE, 6, 0);
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(context) | (i17 == 4) | o0VarE.B(p1Var2) | o0VarE.B(p1Var3);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a2) {
                objQ6 = new t42.l(context, lVar, p1Var2, p1Var3);
                o0VarE.K(objQ6);
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ6, o0VarE, 0);
            PermissionStatus status = permissionStateRememberPermissionState.getStatus();
            boolean zB2 = o0VarE.B(p1Var4) | o0VarE.B(p1Var5);
            Object objQ7 = o0VarE.q();
            if (zB2 || objQ7 == c2565a2) {
                objQ7 = new a(p1Var4, p1Var5, null);
                o0VarE.K(objQ7);
            }
            l0.e((e23.p) objQ7, status, o0VarE);
            PermissionStatus status2 = permissionStateRememberPermissionState.getStatus();
            Boolean bool = (Boolean) p1Var5.getF182175a();
            bool.getClass();
            boolean zB3 = o0VarE.B(permissionStateRememberPermissionState) | (i17 == 4) | o0VarE.B(p1Var2) | o0VarE.B(p1Var3) | o0VarE.B(p1Var5) | o0VarE.B(p1Var4);
            Object objQ8 = o0VarE.q();
            if (zB3 || objQ8 == c2565a2) {
                p1Var = p1Var4;
                c2565a = c2565a2;
                bVar = new b(permissionStateRememberPermissionState, lVar, p1Var2, p1Var3, p1Var5, p1Var, null);
                o0VarE.K(bVar);
            } else {
                p1Var = p1Var4;
                bVar = objQ8;
                c2565a = c2565a2;
            }
            l0.f(status2, bool, (e23.p) bVar, o0VarE);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(823427626);
                boolean zB4 = o0VarE.B(p1Var3) | o0VarE.B(permissionStateRememberPermissionState) | o0VarE.B(p1Var);
                Object objQ9 = o0VarE.q();
                if (zB4 || objQ9 == c2565a) {
                    objQ9 = new ug2.b0(permissionStateRememberPermissionState, 12, p1Var3, p1Var);
                    o0VarE.K(objQ9);
                }
                e23.a aVar2 = (e23.a) objQ9;
                boolean zB5 = o0VarE.B(p1Var3) | o0VarE.B(p1Var2);
                Object objQ10 = o0VarE.q();
                if (zB5 || objQ10 == c2565a) {
                    objQ10 = new q0(p1Var3, p1Var2, 13);
                    o0VarE.K(objQ10);
                }
                e23.a aVar3 = (e23.a) objQ10;
                boolean zB6 = o0VarE.B(p1Var3) | ((i16 & 112) == 32);
                Object objQ11 = o0VarE.q();
                if (zB6 || objQ11 == c2565a) {
                    objQ11 = new j0(aVar, p1Var3, 25);
                    o0VarE.K(objQ11);
                }
                u11.c.a(aVar2, aVar3, (e23.a) objQ11, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(823954254);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(824014735);
                boolean zB7 = o0VarE.B(p1Var2) | o0VarE.r(r18) | o0VarE.r(qVarC);
                Object objQ12 = o0VarE.q();
                if (zB7 || objQ12 == c2565a) {
                    objQ12 = new c42.f(qVarC, p1Var2, context, 2);
                    o0VarE.K(objQ12);
                }
                e23.a aVar4 = (e23.a) objQ12;
                int i18 = i16 & 112;
                boolean zB8 = o0VarE.B(p1Var2) | (i18 == 32);
                Object objQ13 = o0VarE.q();
                if (zB8 || objQ13 == c2565a) {
                    objQ13 = new j0(aVar, p1Var2, 23);
                    o0VarE.K(objQ13);
                }
                e23.a aVar5 = (e23.a) objQ13;
                boolean zB9 = o0VarE.B(p1Var2) | (i18 == 32);
                Object objQ14 = o0VarE.q();
                if (zB9 || objQ14 == c2565a) {
                    objQ14 = new j0(aVar, p1Var2, 24);
                    o0VarE.K(objQ14);
                }
                u11.c.b(aVar4, aVar5, (e23.a) objQ14, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(824690318);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ma0.f(lVar, aVar, i14, 2);
        }
    }

    public static final void c(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final void d(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final void e(h4.r rVar, z3.e eVar, z3.e eVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1955950308);
        if (o0VarE.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new vq0.a(15, eVar, eVar2);
                o0VarE.K(objQ);
            }
            i2.b(rVar, (e23.p) objQ, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(rVar, eVar, eVar2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x0308  */
    /* JADX WARN: Code duplicated, block: B:114:0x031a  */
    /* JADX WARN: Code duplicated, block: B:116:0x031d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0334  */
    /* JADX WARN: Code duplicated, block: B:124:0x0392  */
    /* JADX WARN: Code duplicated, block: B:126:0x0395  */
    /* JADX WARN: Code duplicated, block: B:127:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:159:0x032b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(boolean z14, x11.a aVar, e23.l lVar, e23.a aVar2, e23.a aVar3, e23.l lVar2, e23.l lVar3, h4.r rVar, p3.m mVar, int i14) {
        e23.l lVar4;
        h4.r rVar2;
        j1.d dVar;
        Context context;
        p3.m.a.C2565a c2565a;
        boolean zR;
        Object objQ;
        j1.d dVar2;
        ArrayList arrayList;
        p13.c.b bVar;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objQ2;
        int i16;
        boolean z19;
        int i17;
        int i18;
        o0 o0VarE = mVar.E(1366045564);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(aVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (o0VarE.n(i19 & 1, (i19 & 4793491) != 4793490)) {
            h4.r.a aVar4 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            n0 n0Var = (n0) o0VarE.A(s9.j.f158018a);
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = new j1.d(context2);
                o0VarE.K(objQ5);
            }
            j1.d dVar3 = (j1.d) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = Executors.newSingleThreadExecutor();
                o0VarE.K(objQ6);
            }
            ExecutorService executorService = (ExecutorService) objQ6;
            dVar3.getClass();
            j0.u.a();
            j1.c<Integer> cVar2 = dVar3.f96225x;
            cVar2.getClass();
            p1 p1VarG = f0.G(cVar2, o0VarE);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                BarcodeScannerOptions barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(512, 1024, 32, 64).build();
                barcodeScannerOptionsBuild.getClass();
                objQ7 = BarcodeScanning.getClient(barcodeScannerOptionsBuild);
                o0VarE.K(objQ7);
            }
            BarcodeScanner barcodeScanner = (BarcodeScanner) objQ7;
            barcodeScanner.getClass();
            p1 p1VarQ = p0.q(aVar, o0VarE);
            x11.a aVar5 = (x11.a) p1VarQ.getF182175a();
            boolean zB = o0VarE.B(p1VarQ) | o0VarE.r(dVar3) | o0VarE.r(executorService) | o0VarE.r(barcodeScanner) | o0VarE.r(context2) | ((i19 & 3670016) == 1048576);
            Object objQ8 = o0VarE.q();
            if (zB || objQ8 == c2565a2) {
                objQ8 = new e(dVar3, p1VarQ, p1Var2, executorService, barcodeScanner, context2, p1Var, lVar3, null);
                dVar = dVar3;
                context = context2;
                o0VarE.K(objQ8);
            } else {
                context = context2;
                dVar = dVar3;
            }
            l0.e((e23.p) objQ8, aVar5, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(z14);
            Integer num = (Integer) p1VarG.getF182175a();
            boolean zB2 = ((i19 & 14) == 4) | o0VarE.B(p1VarG) | o0VarE.r(dVar);
            Object objQ9 = o0VarE.q();
            if (zB2 || objQ9 == c2565a2) {
                objQ9 = new f(z14, dVar, p1VarG, null);
                o0VarE.K(objQ9);
            }
            l0.f(boolValueOf, num, (e23.p) objQ9, o0VarE);
            boolean zR2 = o0VarE.r(dVar) | o0VarE.r(n0Var);
            Object objQ10 = o0VarE.q();
            if (zR2 || objQ10 == c2565a2) {
                objQ10 = new g(dVar, n0Var, null);
                o0VarE.K(objQ10);
            }
            l0.e((e23.p) objQ10, n0Var, o0VarE);
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarA = c2.b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarD2 = x2.d(aVar4, 1.0f);
            boolean zR3 = o0VarE.r(dVar);
            Object objQ11 = o0VarE.q();
            if (zR3) {
                c2565a = c2565a2;
            } else {
                c2565a = c2565a2;
                if (objQ11 == c2565a) {
                }
                e23.l lVar5 = (e23.l) objQ11;
                zR = o0VarE.r(dVar) | o0VarE.r(executorService);
                objQ = o0VarE.q();
                if (zR || objQ == c2565a) {
                    objQ = new w02.b(5, dVar, executorService);
                    o0VarE.K(objQ);
                }
                dVar2 = dVar;
                p002j6.c.a(lVar5, rVarD2, null, (e23.l) objQ, null, o0VarE, 48, 20);
                o0VarE.C(-1741108536);
                w13.c cVar3 = x11.a.f188380d;
                arrayList = new ArrayList(p13.y.r(cVar3, 10));
                bVar = new p13.c.b();
                while (bVar.hasNext()) {
                    i16 = c.f181210a[((x11.a) bVar.next()).ordinal()];
                    if (i16 != 1) {
                        z19 = false;
                        i17 = 146927110;
                        i18 = R.string.common_food_lbl;
                    } else {
                        if (i16 == 2) {
                            throw kg.f.h(o0VarE, 146925845, false);
                        }
                        i17 = 146929698;
                        i18 = R.string.lbl_barcode;
                        z19 = false;
                    }
                    arrayList.add(new g1(com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, z19), null, null, null, 14, null));
                }
                o0VarE.g0(false);
                lVar4 = lVar;
                e(x2.d(h4.r.S, 1.0f), z3.f.c(-24032127, new vx1.b(i53.a.e(arrayList), 6, lVar4, p1VarQ), o0VarE), z3.f.c(-143756708, new cb0.a(p1VarQ, p1Var, 4), o0VarE), o0VarE, 438);
                o0VarE.g0(true);
                i15 = c.f181210a[((x11.a) p1VarQ.getF182175a()).ordinal()];
                if (i15 != 1) {
                    o0VarE.C(899352835);
                    boolean zR4 = o0VarE.r(dVar2) | o0VarE.r(context);
                    if ((i19 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z24 = zR4 | z15;
                    if ((i19 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z25 = z24 | z16;
                    if ((i19 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z25 | z17;
                    objQ2 = o0VarE.q();
                    if (z18 || objQ2 == p3.m.a.f135155b) {
                        p50.d dVar4 = new p50.d(dVar2, context, lVar2, aVar3, aVar2, 16);
                        o0VarE.K(dVar4);
                        objQ2 = dVar4;
                    }
                    u11.d.a(0, r14, (e23.a) objQ2, o0VarE, 0);
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i15 == 2) {
                        throw kg.f.h(o0VarE, 899351659, false);
                    }
                    o0VarE.C(899368079);
                    u11.a.a(0, null, null, o0VarE);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                    aVar4 = aVar4;
                }
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
                rVar2 = aVar4;
            }
            objQ11 = new vu1.b(dVar, 6);
            o0VarE.K(objQ11);
            e23.l lVar6 = (e23.l) objQ11;
            zR = o0VarE.r(dVar) | o0VarE.r(executorService);
            objQ = o0VarE.q();
            if (zR) {
                objQ = new w02.b(5, dVar, executorService);
                o0VarE.K(objQ);
            } else {
                objQ = new w02.b(5, dVar, executorService);
                o0VarE.K(objQ);
            }
            dVar2 = dVar;
            p002j6.c.a(lVar6, rVarD2, null, (e23.l) objQ, null, o0VarE, 48, 20);
            o0VarE.C(-1741108536);
            w13.c cVar4 = x11.a.f188380d;
            arrayList = new ArrayList(p13.y.r(cVar4, 10));
            bVar = new p13.c.b();
            while (bVar.hasNext()) {
                i16 = c.f181210a[((x11.a) bVar.next()).ordinal()];
                if (i16 != 1) {
                    z19 = false;
                    i17 = 146927110;
                    i18 = R.string.common_food_lbl;
                } else {
                    if (i16 == 2) {
                        throw kg.f.h(o0VarE, 146925845, false);
                    }
                    i17 = 146929698;
                    i18 = R.string.lbl_barcode;
                    z19 = false;
                }
                arrayList.add(new g1(com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, z19), null, null, null, 14, null));
            }
            o0VarE.g0(false);
            lVar4 = lVar;
            e(x2.d(h4.r.S, 1.0f), z3.f.c(-24032127, new vx1.b(i53.a.e(arrayList), 6, lVar4, p1VarQ), o0VarE), z3.f.c(-143756708, new cb0.a(p1VarQ, p1Var, 4), o0VarE), o0VarE, 438);
            o0VarE.g0(true);
            i15 = c.f181210a[((x11.a) p1VarQ.getF182175a()).ordinal()];
            if (i15 != 1) {
                o0VarE.C(899352835);
                boolean zR5 = o0VarE.r(dVar2) | o0VarE.r(context);
                if ((i19 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z26 = zR5 | z15;
                if ((i19 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z27 = z26 | z16;
                if ((i19 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z27 | z17;
                objQ2 = o0VarE.q();
                if (z18) {
                    p50.d dVar5 = new p50.d(dVar2, context, lVar2, aVar3, aVar2, 16);
                    o0VarE.K(dVar5);
                    objQ2 = dVar5;
                } else {
                    p50.d dVar6 = new p50.d(dVar2, context, lVar2, aVar3, aVar2, 16);
                    o0VarE.K(dVar6);
                    objQ2 = dVar6;
                }
                u11.d.a(0, r14, (e23.a) objQ2, o0VarE, 0);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
            } else {
                if (i15 == 2) {
                    throw kg.f.h(o0VarE, 899351659, false);
                }
                o0VarE.C(899368079);
                u11.a.a(0, null, null, o0VarE);
                o0VarE.g0(false);
                Unit unit4 = Unit.INSTANCE;
                aVar4 = aVar4;
            }
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
            rVar2 = aVar4;
        } else {
            lVar4 = lVar;
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(z14, aVar, lVar4, aVar2, aVar3, lVar2, lVar3, rVar2, i14);
        }
    }

    public static final void g(fe feVar, x11.b bVar, e23.a aVar, e23.l lVar, e23.a aVar2, e23.a aVar3, e23.l lVar2, e23.l lVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, e23.a aVar7, p3.m mVar, int i14) {
        int i15;
        e23.l lVar4;
        e23.a aVar8;
        e23.a aVar9;
        e23.l lVar5;
        e23.l lVar6;
        o0 o0Var;
        feVar.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(-1643861689);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(feVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar4 = lVar;
            i15 |= o0VarE.r(lVar4) ? 2048 : 1024;
        } else {
            lVar4 = lVar;
        }
        if ((i14 & 24576) == 0) {
            aVar8 = aVar2;
            i15 |= o0VarE.r(aVar8) ? 16384 : 8192;
        } else {
            aVar8 = aVar2;
        }
        if ((196608 & i14) == 0) {
            aVar9 = aVar3;
            i15 |= o0VarE.r(aVar9) ? 131072 : 65536;
        } else {
            aVar9 = aVar3;
        }
        if ((1572864 & i14) == 0) {
            lVar5 = lVar2;
            i15 |= o0VarE.r(lVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            lVar5 = lVar2;
        }
        if ((12582912 & i14) == 0) {
            lVar6 = lVar3;
            i15 |= o0VarE.r(lVar6) ? 8388608 : 4194304;
        } else {
            lVar6 = lVar3;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(aVar4) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(aVar5) ? 536870912 : 268435456;
        }
        int i16 = (o0VarE.r(aVar6) ? 4 : 2) | (o0VarE.r(aVar7) ? 32 : 16);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new u(26);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            boolean zB = o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new vd0.d(p1Var, 15);
                o0VarE.K(objQ2);
            }
            b(aVar6, (e23.l) objQ2, o0VarE, (i16 << 3) & 112);
            boolean z14 = bVar.f188383c;
            z3.e eVarC = z3.f.c(-1136462196, new k1((Object) aVar6, (Object) bVar, (Object) aVar, p1Var, 29), o0VarE);
            z3.e eVarC2 = z3.f.c(445889869, new p21.b(feVar, 23), o0VarE);
            z3.e eVarC3 = z3.f.c(897978768, new a42.e0(bVar, aVar8, aVar6, aVar7, aVar9, lVar4, aVar4, aVar5, lVar6, lVar5, p1Var), o0VarE);
            o0Var = o0VarE;
            z02.d.a(z14, eVarC, eVarC2, null, null, eVarC3, o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll.a(feVar, bVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, aVar4, aVar5, aVar6, aVar7, i14);
        }
    }

    public static final void h(o4 o4Var, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(699672881);
        int i15 = i14 | (o0VarE.k(o4Var.ordinal()) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = c.f181211b[o4Var.ordinal()];
            if (i16 == 1) {
                o0VarE.C(478788269);
                c1.f110940a.b(false, g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found)), y.Q(o0VarE, R.string.msg_no_food_found), y.Q(o0VarE, R.string.create_meal), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), false, aVar, aVar3, aVar2, aVar2, o0VarE, 6, (i15 & 112) | ((i15 >> 3) & 896) | ((i15 << 3) & 7168) | ((i15 << 6) & 57344), 1816);
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(479492899);
                c1.f110940a.b(false, g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found)), y.Q(o0VarE, R.string.msg_no_food_found_custom_meal), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), null, false, aVar3, aVar2, null, aVar2, o0VarE, 6, ((i15 >> 6) & 112) | (i15 & 896) | ((i15 << 6) & 57344), 10136);
                o0VarE.g0(false);
            } else {
                if (i16 != 3) {
                    throw kg.f.h(o0VarE, -1924218801, false);
                }
                o0VarE.C(480085960);
                c1 c1Var = c1.f110940a;
                String strB = g22.n.b(y.Q(o0VarE, R.string.lbl_no_results_found));
                x0.f23314a.getClass();
                c1Var.b(false, strB, gl1.d.W(x0.Cf), y.Q(o0VarE, R.string.lbl_try_again), y.Q(o0VarE, R.string.lbl_cancel), null, false, aVar3, aVar2, null, aVar2, o0VarE, 6, ((i15 >> 6) & 112) | (i15 & 896) | ((i15 << 6) & 57344), 10136);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w11.c(o4Var, aVar, aVar2, aVar3, i14, 1);
        }
    }
}
