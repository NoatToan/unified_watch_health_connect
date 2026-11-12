package gv0;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.mlkit.common.MlKitException;
import i3.e5;
import i3.ff;
import i3.hf;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l72.c1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r53.b2;
import s5.x0;
import u1.a2;
import wd2.g2;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SharingOptionsScreenKt$SharingOptionsScreenContent$1$1", f = "SharingOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f79413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f79414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gv0.d dVar, n1 n1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f79413a = dVar;
            this.f79414b = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f79413a, this.f79414b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f79414b.t(this.f79413a.D4());
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SharingOptionsScreenKt$SharingOptionsScreenContent$2$1", f = "SharingOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f79415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f79416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f79417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f79418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f79419e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, e23.a<Unit> aVar, boolean z15, e23.a<Unit> aVar2, Context context, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f79415a = z14;
            this.f79416b = aVar;
            this.f79417c = z15;
            this.f79418d = aVar2;
            this.f79419e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f79415a, this.f79416b, this.f79417c, this.f79418d, this.f79419e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f79415a) {
                this.f79416b.invoke();
            } else {
                boolean z14 = this.f79417c;
                e23.a<Unit> aVar2 = this.f79418d;
                if (z14) {
                    aVar2.invoke();
                    Toast.makeText(this.f79419e, R.string.txt_error_occurred, 0).show();
                } else {
                    aVar2.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SharingOptionsScreenKt$SharingOptionsScreenContent$3$1", f = "SharingOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f79420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<pu0.a>>> f79421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ou0.f>> f79422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79423d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gv0.d dVar, x3<? extends g3<? extends List<pu0.a>>> x3Var, x3<g3<ou0.f>> x3Var2, p1<Boolean> p1Var, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f79420a = dVar;
            this.f79421b = x3Var;
            this.f79422c = x3Var2;
            this.f79423d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f79420a, this.f79421b, this.f79422c, this.f79423d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int iD;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<g3<List<pu0.a>>> x3Var = this.f79421b;
            if (x3Var.getF182175a().f35300a == fw.p.SUCCESS) {
                ou0.f fVar = this.f79422c.getF182175a().f35301b;
                ou0.b bVar = fVar != null ? fVar.f133984b : null;
                if (bVar instanceof ou0.b.a) {
                    List<pu0.a> list = x3Var.getF182175a().f35301b;
                    iD = list != null ? list.size() : 0;
                } else if (bVar instanceof ou0.b.C2540b) {
                    this.f79420a.getClass();
                    su0.h.f160962a.getClass();
                    iD = su0.h.d();
                } else {
                    iD = -1;
                }
                if (iD == 0 && bVar != null && !bVar.equals(ou0.b.c.f133963a)) {
                    this.f79423d.setValue(Boolean.TRUE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SharingOptionsScreenKt$SharingOptionsScreenContent$4$1", f = "SharingOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<pu0.b>>> f79425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g3<ou0.f>> f79426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f79427d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(p1<Boolean> p1Var, x3<? extends g3<? extends List<pu0.b>>> x3Var, x3<g3<ou0.f>> x3Var2, p1<Boolean> p1Var2, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f79424a = p1Var;
            this.f79425b = x3Var;
            this.f79426c = x3Var2;
            this.f79427d = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f79424a, this.f79425b, this.f79426c, this.f79427d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<Boolean> p1Var = this.f79424a;
            if (p1Var.getF182175a().booleanValue() && this.f79425b.getF182175a().f35300a == fw.p.SUCCESS) {
                ou0.f fVar = this.f79426c.getF182175a().f35301b;
                Boolean bool = fVar != null ? fVar.f133983a : null;
                su0.t.f161004a.getClass();
                if (!su0.t.i()) {
                    Boolean bool2 = Boolean.TRUE;
                    if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                        p1Var.setValue(Boolean.FALSE);
                        this.f79427d.setValue(bool2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, yu0.f fVar, e23.a<Unit> aVar, e23.l<? super e23.a<Unit>, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z14;
        i53.c cVar;
        Object u0Var;
        boolean z15;
        dVar.getClass();
        fVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        p3.o0 o0VarE = mVar.E(956970456);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(fVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar5) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yu0.d(context);
                o0VarE.K(objQ);
            }
            yu0.d dVar2 = (yu0.d) objQ;
            boolean zC5 = dVar.c5();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = Boolean.valueOf(s3.b());
                o0VarE.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            g.h hVar = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new bv0.n(dVar, 8);
                o0VarE.K(objQ4);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ4, o0VarE, 0);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_sharing_settings);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            if (zBooleanValue != 0) {
                o0VarE.C(525644263);
                i53.c cVarL = gl1.d.l(false, o0VarE, 1);
                o0VarE.g0(false);
                cVar = cVarL;
                z14 = true;
            } else {
                z14 = true;
                o0VarE.C(525644951);
                i53.c cVarL2 = gl1.d.l(zC5, o0VarE, 0);
                o0VarE.g0(false);
                cVar = cVarL2;
            }
            boolean zR2 = o0VarE.r(dVar) | o0VarE.r(qVarC) | o0VarE.r(context) | ((458752 & i15) == 131072 ? z14 : false) | ((3670016 & i15) == 1048576 ? z14 : false);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                u0Var = new u0(aVar3, aVar4, qVarC, context, zBooleanValue, dVar, 0);
                z15 = zBooleanValue;
                o0VarE.K(u0Var);
            } else {
                u0Var = objQ5;
                z15 = zBooleanValue;
            }
            o0Var = o0VarE;
            gl1.d.b(strQ, aVar5, zBooleanValue2, cVar, null, (e23.l) u0Var, z3.f.c(-1200171418, new g82.d(dVar, fVar, z15, dVar2, aVar, lVar, aVar2, p1Var), o0VarE), o0Var, ((i15 >> 18) & 112) | 1576960, 16);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(dVar, fVar, (e23.a) aVar, (e23.l) lVar, (e23.a) aVar2, (e23.a) aVar3, (e23.a) aVar4, (e23.a) aVar5, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0419  */
    /* JADX WARN: Code duplicated, block: B:164:0x04ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:193:0x0606  */
    /* JADX WARN: Code duplicated, block: B:196:0x060a  */
    /* JADX WARN: Code duplicated, block: B:198:0x0640  */
    /* JADX WARN: Code duplicated, block: B:199:0x0642  */
    /* JADX WARN: Code duplicated, block: B:205:0x0652  */
    /* JADX WARN: Code duplicated, block: B:207:0x0687  */
    /* JADX WARN: Code duplicated, block: B:210:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:212:0x0702  */
    /* JADX WARN: Code duplicated, block: B:213:0x0705  */
    /* JADX WARN: Code duplicated, block: B:216:0x070b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0717  */
    /* JADX WARN: Code duplicated, block: B:219:0x071c  */
    /* JADX WARN: Code duplicated, block: B:220:0x071e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0722  */
    /* JADX WARN: Code duplicated, block: B:225:0x0733  */
    /* JADX WARN: Code duplicated, block: B:227:0x0740  */
    /* JADX WARN: Code duplicated, block: B:229:0x0749  */
    /* JADX WARN: Code duplicated, block: B:230:0x0757  */
    /* JADX WARN: Code duplicated, block: B:233:0x078d  */
    /* JADX WARN: Code duplicated, block: B:234:0x078f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0797  */
    /* JADX WARN: Code duplicated, block: B:240:0x079c  */
    /* JADX WARN: Code duplicated, block: B:241:0x079f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0819  */
    /* JADX WARN: Code duplicated, block: B:247:0x082c  */
    /* JADX WARN: Code duplicated, block: B:248:0x082f  */
    /* JADX WARN: Code duplicated, block: B:255:0x083d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0840  */
    /* JADX WARN: Code duplicated, block: B:259:0x084e  */
    /* JADX WARN: Code duplicated, block: B:260:0x085a  */
    /* JADX WARN: Code duplicated, block: B:263:0x086e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0876  */
    /* JADX WARN: Code duplicated, block: B:266:0x087a  */
    /* JADX WARN: Code duplicated, block: B:271:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:275:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:277:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:279:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:286:0x0901  */
    /* JADX WARN: Code duplicated, block: B:288:0x0931  */
    /* JADX WARN: Code duplicated, block: B:290:0x0950  */
    /* JADX WARN: Code duplicated, block: B:291:0x0952  */
    /* JADX WARN: Code duplicated, block: B:297:0x0969  */
    /* JADX WARN: Code duplicated, block: B:300:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:302:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:310:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v52, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r10v17, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r10v24, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r13v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v11, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v12, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v13, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v8, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v29, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r1v46, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r1v70, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r1v72, types: [l72.c1] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r20v2, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r20v3, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r20v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [e23.p] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(final gv0.d dVar, final yu0.f fVar, final boolean z14, final yu0.d dVar2, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final e23.l<? super e23.a<Unit>, Unit> lVar, final e23.a<Unit> aVar4, p3.m mVar, final int i14) {
        ?? r14;
        boolean z15;
        boolean z16;
        boolean z17;
        Context context;
        Object cVar;
        p1 p1Var;
        g3 g3Var;
        p1 p1Var2;
        p1 p1Var3;
        p1 p1Var4;
        Object obj;
        c.q qVar;
        p1 p1Var5;
        Context context2;
        p1 p1Var6;
        final ?? r15;
        Throwable th3;
        Object obj2;
        Object obj3;
        ?? r25;
        boolean z18;
        ?? r16;
        j92.b bVar;
        ?? r17;
        Object obj4;
        Object obj5;
        j92.b bVar2;
        ?? r18;
        h4.r.a aVar5;
        boolean zG;
        ou0.f fVar2;
        Object obj6;
        ?? r19;
        j92.f fVar3;
        x0 x0Var;
        ?? r110;
        Object obj7;
        ou0.f fVar4;
        j92.e eVar;
        ?? r111;
        ou0.f fVar5;
        Object obj8;
        boolean z19;
        ?? r29;
        ?? r112;
        ?? r113;
        final ou0.f fVar6;
        boolean zR;
        Object objQ;
        g2.b bVar3;
        boolean z24;
        String strJ;
        g2.a aVar6;
        boolean z25;
        Object objP;
        Object objJ;
        j92.b bVar4;
        Context context3;
        c.q qVar2;
        boolean z26;
        boolean zR2;
        Object objQ2;
        ?? r210;
        boolean z27;
        Context context4;
        c.q qVar3;
        boolean zR3;
        Object objQ3;
        ou0.f fVar7;
        Object obj9;
        int iD;
        String strJ2;
        boolean z28;
        boolean z29;
        Object objQ4;
        Object obj10;
        List list;
        p1 p1Var7;
        boolean z34;
        boolean z35;
        Object objQ5;
        ?? r24;
        boolean zG2;
        Object obj11;
        Object obj12;
        final p1 p1Var8;
        Object objQ6;
        dVar.getClass();
        fVar.getClass();
        dVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        aVar4.getClass();
        ?? E = mVar.E(1064608074);
        int i15 = i14 | (E.r(dVar) ? 4 : 2) | (E.r(fVar) ? 32 : 16) | (E.r(dVar2) ? 2048 : 1024) | (E.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (E.r(lVar) ? 8388608 : 4194304) | (E.r(aVar4) ? 67108864 : 33554432);
        if (E.n(i15 & 1, (i15 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context5 = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) E.A(c.n.f22332a);
            if (activity == null) {
                p2 p2VarI0 = E.i0();
                if (p2VarI0 != null) {
                    final int i16 = 0;
                    p2VarI0.f135219d = new e23.p(dVar, fVar, z14, dVar2, aVar, aVar2, aVar3, lVar, aVar4, i14, i16) { // from class: gv0.n0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f79336a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f79337b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ yu0.f f79338c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ boolean f79339d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ yu0.d f79340e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ e23.a f79341f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ e23.a f79342g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ e23.a f79343h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ e23.l f79344i;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ e23.a f79345j;

                        {
                            this.f79336a = i16;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj13, Object obj14) {
                            switch (this.f79336a) {
                                case 0:
                                    ((Integer) obj14).getClass();
                                    int iT = p3.p0.t(221569);
                                    w0.b(this.f79337b, this.f79338c, this.f79339d, this.f79340e, this.f79341f, this.f79342g, this.f79343h, this.f79344i, this.f79345j, (p3.m) obj13, iT);
                                    break;
                                default:
                                    ((Integer) obj14).getClass();
                                    int iT2 = p3.p0.t(221569);
                                    w0.b(this.f79337b, this.f79338c, this.f79339d, this.f79340e, this.f79341f, this.f79342g, this.f79343h, this.f79344i, this.f79345j, (p3.m) obj13, iT2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            g.h hVar = new g.h();
            boolean zR4 = E.r(dVar);
            Object objQ7 = E.q();
            p3.m.a aVar7 = p3.m.f135153a;
            if (zR4) {
                objQ7 = new bv0.n(dVar, 7);
                E.K(objQ7);
            } else {
                aVar7.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new bv0.n(dVar, 7);
                    E.K(objQ7);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ7, E, 0);
            p1 p1VarC = s9.c.c(dVar.f79204w, E);
            p1 p1VarC2 = s9.c.c(dVar.I0, E);
            p1 p1VarC3 = s9.c.c(dVar.f79194k0, E);
            p1 p1VarC4 = s9.c.c(fVar.f199712j, E);
            b2 b2Var = dVar.N0;
            az0.c.a aVar8 = az0.c.a.Available;
            p1 p1VarB = s9.c.b(b2Var, aVar8, E, 48);
            p1 p1VarC5 = s9.c.c(dVar.K0, E);
            Object objQ8 = E.q();
            aVar7.getClass();
            Object obj13 = p3.m.a.f135155b;
            if (objQ8 == obj13) {
                objQ8 = e5.o(0, E);
            }
            n1 n1Var = (n1) objQ8;
            Object[] objArr = new Object[0];
            Object objQ9 = E.q();
            if (objQ9 == obj13) {
                objQ9 = new go1.j(5);
                E.K(objQ9);
            }
            p1 p1Var9 = (p1) d4.a.e(objArr, (e23.a) objQ9, E, 48);
            boolean zF = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
            g3 g3Var2 = (g3) p1VarC5.getF182175a();
            g3 g3Var3 = (g3) p1VarC4.getF182175a();
            boolean zR5 = E.r(dVar);
            Object objQ10 = E.q();
            if (zR5 || objQ10 == obj13) {
                objQ10 = new a(dVar, n1Var, null);
                E.K(objQ10);
            }
            g3.a aVar9 = g3.f35298f;
            p3.l0.f(g3Var2, g3Var3, (e23.p) objQ10, E);
            boolean z36 = ((az0.c.a) p1VarB.getF182175a()) == aVar8;
            List listK = lv0.c.c((g3) p1VarC2.getF182175a()) ? p13.x.k(((g3) p1VarC.getF182175a()).f35300a, ((g3) p1VarC3.getF182175a()).f35300a, ((g3) p1VarC4.getF182175a()).f35300a) : p13.x.k(((g3) p1VarC.getF182175a()).f35300a, ((g3) p1VarC2.getF182175a()).f35300a, ((g3) p1VarC3.getF182175a()).f35300a, ((g3) p1VarC4.getF182175a()).f35300a);
            if (listK != null && listK.isEmpty()) {
                z15 = false;
                break;
            }
            Iterator it = listK.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                } else if (((fw.p) it.next()) == fw.p.LOADING) {
                    z15 = true;
                    break;
                }
            }
            if (!z15 && (listK == null || !listK.isEmpty())) {
                Iterator it3 = listK.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z16 = false;
                        break;
                    } else if (((fw.p) it3.next()) == fw.p.ERROR) {
                        z16 = true;
                        break;
                    }
                }
            } else {
                z16 = false;
                break;
            }
            Boolean boolValueOf = Boolean.valueOf(z15);
            Boolean boolValueOf2 = Boolean.valueOf(z16);
            boolean zH = E.h(z15) | E.h(z16) | E.r(context5);
            Object objQ11 = E.q();
            if (zH || objQ11 == p3.m.a.f135155b) {
                boolean z37 = z15;
                objQ11 = new b(z37, aVar, z16, aVar2, context5, null);
                z17 = z37;
                context = context5;
                E.K(objQ11);
            } else {
                context = context5;
                z17 = z15;
            }
            p3.l0.f(boolValueOf, boolValueOf2, (e23.p) objQ11, E);
            Object objQ12 = E.q();
            Object obj14 = p3.m.a.f135155b;
            if (objQ12 == obj14) {
                objQ12 = p3.p0.n(Boolean.FALSE);
                E.K(objQ12);
            }
            p1 p1Var10 = (p1) objQ12;
            Object objQ13 = E.q();
            if (objQ13 == obj14) {
                objQ13 = p3.p0.n(Boolean.FALSE);
                E.K(objQ13);
            }
            p1 p1Var11 = (p1) objQ13;
            Object objQ14 = E.q();
            if (objQ14 == obj14) {
                objQ14 = p3.p0.n(Boolean.FALSE);
                E.K(objQ14);
            }
            final p1 p1Var12 = (p1) objQ14;
            g3 g3Var4 = (g3) p1VarC3.getF182175a();
            g3 g3Var5 = (g3) p1VarC.getF182175a();
            boolean zB = E.B(p1VarC3) | E.B(p1VarC) | E.r(dVar);
            Object objQ15 = E.q();
            if (zB || objQ15 == obj14) {
                p1Var = p1VarC3;
                g3Var = g3Var5;
                p1Var2 = p1VarC;
                cVar = new c(dVar, p1Var, p1Var2, p1Var11, null);
                E.K(cVar);
            } else {
                g3Var = g3Var5;
                p1Var2 = p1VarC;
                p1Var = p1VarC3;
                cVar = objQ15;
            }
            g3.a aVar10 = g3.f35298f;
            p3.l0.f(g3Var4, g3Var, (e23.p) cVar, E);
            g3 g3Var6 = (g3) p1VarC2.getF182175a();
            g3 g3Var7 = (g3) p1Var2.getF182175a();
            boolean zB2 = E.B(p1Var9) | E.B(p1VarC2) | E.B(p1Var2);
            Object objQ16 = E.q();
            if (zB2 || objQ16 == obj14) {
                p1Var3 = p1Var2;
                p1Var4 = p1Var9;
                objQ16 = new d(p1Var4, p1VarC2, p1Var3, p1Var12, null);
                E.K(objQ16);
            } else {
                p1Var3 = p1Var2;
                p1Var4 = p1Var9;
            }
            p3.l0.f(g3Var6, g3Var7, (e23.p) objQ16, E);
            if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                E.C(1704682693);
                ?? r26 = c1.f110940a;
                String strQ = gl1.y.Q(E, R.string.msg_no_friends_in_garmin_connect);
                String strQ2 = gl1.y.Q(E, R.string.msg_group_track_requires_one_friend_long);
                String strQ3 = gl1.y.Q(E, R.string.lbl_view_suggestions);
                boolean zR6 = E.r(activity);
                Object objQ17 = E.q();
                if (zR6 || objQ17 == obj14) {
                    objQ17 = new s0(activity, p1Var10, 0);
                    E.K(objQ17);
                }
                e23.a aVar11 = (e23.a) objQ17;
                String strQ4 = gl1.y.Q(E, R.string.lbl_close);
                Object objQ18 = E.q();
                if (objQ18 == obj14) {
                    objQ18 = new gp.e(p1Var10, 8);
                    E.K(objQ18);
                }
                p1Var6 = p1Var4;
                obj = obj14;
                p1Var5 = p1Var10;
                qVar = qVarC;
                context2 = context;
                th3 = null;
                r15 = 0;
                r26.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar11, strQ4, (e23.a) objQ18, E, 0, 6, 217);
                E.g0(false);
            } else {
                obj = obj14;
                qVar = qVarC;
                p1Var5 = p1Var10;
                context2 = context;
                p1Var6 = p1Var4;
                r15 = 0;
                th3 = null;
                E.C(1705285240);
                E.g0(false);
            }
            if (((Boolean) p1Var11.getF182175a()).booleanValue()) {
                E.C(1705343923);
                ?? r27 = c1.f110940a;
                String strQ5 = gl1.y.Q(E, R.string.lbl_grouptrack_turned_off);
                String strQ6 = gl1.y.Q(E, R.string.msg_group_track_requires_one_friend);
                String strQ7 = gl1.y.Q(E, R.string.lbl_ok);
                boolean zR7 = E.r(dVar);
                Object objQ19 = E.q();
                if (zR7) {
                    obj12 = obj;
                } else {
                    obj12 = obj;
                    if (objQ19 != obj12) {
                        p1Var8 = p1Var11;
                    }
                    e23.a aVar12 = (e23.a) objQ19;
                    String strQ8 = gl1.y.Q(E, R.string.lbl_close);
                    objQ6 = E.q();
                    if (objQ6 == obj12) {
                        objQ6 = new gp.e(p1Var8, 9);
                        E.K(objQ6);
                    }
                    obj2 = obj12;
                    r27.a(false, strQ5, strQ6, null, null, strQ7, false, false, aVar12, strQ8, (e23.a) objQ6, E, 0, 6, 217);
                    E.g0(r15);
                }
                p1Var8 = p1Var11;
                objQ19 = new e23.a() { // from class: gv0.t0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (r15) {
                            case 0:
                                p1Var8.setValue(Boolean.FALSE);
                                dVar.P4(ou0.b.c.f133963a);
                                break;
                            default:
                                p1Var8.setValue(Boolean.FALSE);
                                dVar.N4(false);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                E.K(objQ19);
                e23.a aVar13 = (e23.a) objQ19;
                String strQ9 = gl1.y.Q(E, R.string.lbl_close);
                objQ6 = E.q();
                if (objQ6 == obj12) {
                    objQ6 = new gp.e(p1Var8, 9);
                    E.K(objQ6);
                }
                obj2 = obj12;
                r27.a(false, strQ5, strQ6, null, null, strQ7, false, false, aVar13, strQ9, (e23.a) objQ6, E, 0, 6, 217);
                E.g0(r15);
            } else {
                obj2 = obj;
                E.C(1705902264);
                E.g0(r15);
            }
            if (((Boolean) p1Var12.getF182175a()).booleanValue()) {
                E.C(1705949849);
                ?? r28 = c1.f110940a;
                String strQ10 = gl1.y.Q(E, R.string.lbl_notifications_off);
                String strQ11 = gl1.y.Q(E, R.string.lbl_enable_notifications_info_text);
                String strQ12 = gl1.y.Q(E, R.string.lbl_ok);
                boolean zR8 = E.r(dVar);
                Object objQ20 = E.q();
                if (zR8) {
                    obj11 = obj2;
                } else {
                    obj11 = obj2;
                    if (objQ20 == obj11) {
                    }
                    obj3 = obj11;
                    r28.a(false, strQ10, strQ11, null, null, strQ12, false, false, (e23.a) objQ20, null, null, E, 0, 0, 1753);
                    E.g0(r15);
                }
                final int i17 = 1;
                objQ20 = new e23.a() { // from class: gv0.t0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                p1Var12.setValue(Boolean.FALSE);
                                dVar.P4(ou0.b.c.f133963a);
                                break;
                            default:
                                p1Var12.setValue(Boolean.FALSE);
                                dVar.N4(false);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                E.K(objQ20);
                obj3 = obj11;
                r28.a(false, strQ10, strQ11, null, null, strQ12, false, false, (e23.a) objQ20, null, null, E, 0, 0, 1753);
                E.g0(r15);
            } else {
                obj3 = obj2;
                E.C(1706348664);
                E.g0(r15);
            }
            final ou0.f fVar8 = (ou0.f) ((g3) p1Var3.getF182175a()).f35301b;
            ev0.c cVar2 = (ev0.c) ((g3) p1VarC4.getF182175a()).f35301b;
            Object obj15 = cVar2 != null ? cVar2.f66152a : th3;
            Boolean bool = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(obj15, bool)) {
                ev0.c cVar3 = (ev0.c) ((g3) p1VarC4.getF182175a()).f35301b;
                if (cVar3 != null) {
                    zG2 = p005kotlin.jvm.internal.s.g(cVar3.f66153b, bool);
                } else {
                    r24 = r15;
                }
                if (r24 == 0) {
                    r24 = zG2;
                    r25 = r15;
                } else if (z14) {
                    r24 = zG2;
                    r25 = r15;
                } else {
                    r25 = 1;
                }
            } else if (z14) {
                r25 = 1;
            } else {
                r24 = zG2;
                r25 = r15;
            }
            if (z17) {
                z18 = z36;
                E.C(1714330296);
                E.f();
            } else {
                E.C(1706839301);
                h4.r.a aVar14 = h4.r.S;
                h4.r rVarB = a2.b(x2.d(aVar14, 1.0f), a2.a(E), true);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarA = c2.l.A(rVarB, 0.0f, eVar2.f97920e, 1);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, E, r15);
                x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(E.getU());
                i2 i2VarA0 = E.a0();
                h4.r rVarC = h4.k.c(rVarA, E);
                h5.g.V.getClass();
                h5.e0.a aVar15 = h5.g.a.f81805b;
                if (E.f135177b == null) {
                    p3.p0.l();
                    throw th3;
                }
                E.z();
                if (E.T) {
                    E.M(aVar15);
                } else {
                    E.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, E);
                b4.c(h5.g.a.f81809f, i2VarA0, E);
                h5.g.a.b bVar6 = h5.g.a.f81813j;
                if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar6);
                }
                b4.c(h5.g.a.f81807d, rVarC, E);
                c2.b0 b0Var = c2.b0.f22601a;
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ13 = gl1.y.Q(E, R.string.lbl_livetrack_notifications);
                h4.r rVarF = x2.f(aVar14, 1.0f);
                if (p005kotlin.jvm.internal.s.g(obj15, bool)) {
                    gv0.b.f79166a.getClass();
                    r17 = gv0.b.f79167b;
                    bVar = bVar5;
                } else {
                    bVar = bVar5;
                    r17 = th3;
                }
                final int i18 = 1;
                z3.e eVarC = z3.f.c(389313493, new e23.p() { // from class: gv0.q0
                    @Override // e23.p
                    public final Object invoke(Object obj16, Object obj17) {
                        int i19 = i18;
                        ou0.f fVar9 = fVar8;
                        switch (i19) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj16;
                                int iIntValue = ((Integer) obj17).intValue();
                                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 48, 92);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj16;
                                int iIntValue2 = ((Integer) obj17).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var4 = p3.n.f135158a;
                                    hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133983a, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 92);
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, E);
                boolean zR9 = E.r(dVar) | E.r(fVar8);
                Object objQ21 = E.q();
                if (zR9) {
                    obj4 = obj3;
                } else {
                    obj4 = obj3;
                    if (objQ21 == obj4) {
                    }
                    obj5 = obj4;
                    bVar2 = bVar;
                    r18 = p2Var;
                    aVar5 = aVar14;
                    boolean z38 = z36;
                    r18.g(strQ13, rVarF, null, r17, eVarC, z38, false, (e23.a) objQ21, E, 24624, 196);
                    z18 = z38;
                    if (fVar8 != null) {
                        zG = p005kotlin.jvm.internal.s.g(fVar8.f133983a, bool);
                    } else {
                        zG = false;
                    }
                    if (zG) {
                        E.C(1120757645);
                        String strQ14 = gl1.y.Q(E, R.string.lbl_recipients);
                        int intValue = n1Var.getIntValue();
                        String strC = dVar2.f199699b.c(R.plurals.lbl_recipient_count, intValue, Integer.valueOf(intValue));
                        h4.r rVarF2 = x2.f(aVar5, 1.0f);
                        p1Var7 = p1Var6;
                        boolean zB3 = E.B(p1Var7);
                        if ((i15 & 234881024) == 67108864) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        z35 = zB3 | z34;
                        objQ5 = E.q();
                        if (z35 || objQ5 == obj5) {
                            objQ5 = new a11.a0(aVar4, p1Var7, 15);
                            E.K(objQ5);
                        }
                        fVar2 = fVar8;
                        ?? r114 = E;
                        obj6 = obj5;
                        r18.h(strQ14, strC, null, rVarF2, null, false, false, null, null, null, (e23.a) objQ5, r114, 3072, 0, 1012);
                        r114.g0(false);
                        r19 = r114;
                    } else {
                        ?? r115 = E;
                        fVar2 = fVar8;
                        obj6 = obj5;
                        r115.C(1121177602);
                        r115.g0(false);
                        r19 = r115;
                    }
                    bVar2.getClass();
                    float f14 = eVar2.f97920e;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(aVar5, f14, eVar2.f97917b);
                    String strQ15 = gl1.y.Q(r19, R.string.lbl_notify_recipients);
                    fVar3 = d92.b.f58624b;
                    fVar3.getClass();
                    x0Var = j92.f.f97933j;
                    ?? r211 = r19;
                    mh.c(strQ15, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r19), r211, 0, 0, 131068);
                    r110 = r211;
                    if (z14) {
                        obj7 = obj6;
                        fVar4 = fVar2;
                        eVar = eVar2;
                        r110.C(1123298498);
                        r110.g0(false);
                        r111 = r110;
                    } else {
                        r110.C(1121606177);
                        fVar7 = fVar2;
                        if (fVar7 != null) {
                            obj9 = fVar7.f133984b;
                        } else {
                            obj9 = th3;
                        }
                        if (obj9 instanceof ou0.b.a) {
                            list = (List) ((g3) p1Var.getF182175a()).f35301b;
                            if (list != null) {
                                iD = list.size();
                            } else {
                                iD = 0;
                            }
                        } else if (obj9 instanceof ou0.b.C2540b) {
                            su0.h.f160962a.getClass();
                            iD = su0.h.d();
                        } else {
                            iD = 0;
                        }
                        if (p005kotlin.jvm.internal.s.g(obj9, ou0.b.a.f133961a)) {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r110, 728932021, R.string.lbl_visible_to_following_all, r110, false);
                        } else if (p005kotlin.jvm.internal.s.g(obj9, ou0.b.C2540b.f133962a)) {
                            r110.C(728935371);
                            strJ2 = lv0.b.a(r110, iD);
                            r110.g0(false);
                        } else {
                            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r110, 728937664, R.string.lbl_off, r110, false);
                        }
                        String str = strJ2;
                        String strQ16 = gl1.y.Q(r110, R.string.lbl_grouptrack);
                        h4.r rVarF3 = x2.f(aVar5, 1.0f);
                        bVar2.getClass();
                        h4.r rVarC2 = c2.l.C(rVarF3, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
                        p1 p1Var13 = p1Var;
                        boolean zB4 = r110.B(p1Var13);
                        if ((i15 & 3670016) == 1048576) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zB4 | z28;
                        objQ4 = r110.q();
                        if (z29) {
                            obj10 = obj6;
                        } else {
                            obj10 = obj6;
                            if (objQ4 == obj10) {
                            }
                            eVar = eVar2;
                            fVar4 = fVar7;
                            obj7 = obj10;
                            r18.h(strQ16, str, null, rVarC2, null, false, false, null, null, null, (e23.a) objQ4, r110, 0, 0, 1012);
                            bVar2.getClass();
                            float f15 = eVar.f97920e;
                            bVar2.getClass();
                            h4.r rVarZ2 = c2.l.z(aVar5, f15, eVar.f97917b);
                            String strQ17 = gl1.y.Q(r110, R.string.msg_group_track_with_follow_option_description);
                            fVar3.getClass();
                            aVar5 = aVar5;
                            mh.c(strQ17, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r110), r110, 0, 0, 131068);
                            ?? r116 = r110;
                            r116.g0(false);
                            r111 = r116;
                        }
                        objQ4 = new o0(aVar3, p1Var13, p1Var5, 0);
                        r110.K(objQ4);
                        eVar = eVar2;
                        fVar4 = fVar7;
                        obj7 = obj10;
                        r18.h(strQ16, str, null, rVarC2, null, false, false, null, null, null, (e23.a) objQ4, r110, 0, 0, 1012);
                        bVar2.getClass();
                        float f16 = eVar.f97920e;
                        bVar2.getClass();
                        h4.r rVarZ3 = c2.l.z(aVar5, f16, eVar.f97917b);
                        String strQ18 = gl1.y.Q(r110, R.string.msg_group_track_with_follow_option_description);
                        fVar3.getClass();
                        aVar5 = aVar5;
                        mh.c(strQ18, rVarZ3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r110), r110, 0, 0, 131068);
                        ?? r117 = r110;
                        r117.g0(false);
                        r111 = r117;
                    }
                    fVar5 = fVar4;
                    if (fVar5 != null) {
                        obj8 = fVar5.f133985c;
                    } else {
                        obj8 = th3;
                    }
                    if (!zF || z14 || obj8 == null || (obj8 instanceof g2.c)) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (z19) {
                        r111.C(1123680728);
                        bVar3 = g2.b.f184481a;
                        if (p005kotlin.jvm.internal.s.g(obj8, bVar3)) {
                            z24 = false;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728985582, R.string.lbl_strava_for_garmin, r111, false);
                        } else {
                            z24 = false;
                            strJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728987989, R.string.lbl_enable_strava_for_garmin, r111, false);
                        }
                        if (p005kotlin.jvm.internal.s.g(obj8, bVar3)) {
                            objJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728993855, R.string.lbl_on, r111, z24);
                        } else {
                            if (obj8 instanceof g2.a) {
                                r111.C(728992023);
                                r111.f();
                                lc.u0.r();
                                return;
                            }
                            r111.C(1124074242);
                            aVar6 = (g2.a) obj8;
                            if (aVar6.f184479a && aVar6.f184480b) {
                                r111.C(1124169536);
                                objP = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{gl1.y.Q(r111, R.string.lbl_on), gl1.y.Q(r111, R.string.lbl_consent_required)}, r111);
                                z25 = false;
                                r111.g0(false);
                            } else {
                                z25 = false;
                                r111.C(1124486790);
                                r111.g0(false);
                                objP = th3;
                            }
                            r111.g0(z25);
                            objJ = objP;
                        }
                        if (objJ != null) {
                            j92.e eVar3 = eVar;
                            h4.r rVarC3 = c2.l.C(ds.e0.g(r111, 1124671178, aVar5, 1.0f, bVar2), 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13);
                            if ((i15 & 29360128) == 8388608) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            context4 = context2;
                            qVar3 = qVar;
                            zR3 = r111.r(context4) | z27 | r111.r(qVar3);
                            objQ3 = r111.q();
                            if (zR3 || objQ3 == obj7) {
                                objQ3 = new p0(lVar, context4, qVar3, 0);
                                r111.K(objQ3);
                            }
                            bVar4 = bVar2;
                            eVar = eVar3;
                            r18.h(strJ, objJ, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ3, r111, 0, 0, 1012);
                            r111.g0(false);
                            r210 = r18;
                        } else {
                            String str2 = strJ;
                            context3 = context2;
                            qVar2 = qVar;
                            Object obj16 = obj7;
                            r111.C(1125160079);
                            h4.r rVarF4 = x2.f(aVar5, 1.0f);
                            if ((i15 & 29360128) == 8388608) {
                                bVar4 = bVar2;
                                z26 = true;
                            } else {
                                bVar4 = bVar2;
                                z26 = false;
                            }
                            zR2 = r111.r(context3) | z26 | r111.r(qVar2);
                            objQ2 = r111.q();
                            if (zR2 || objQ2 == obj16) {
                                objQ2 = new p0(lVar, context3, qVar2, 1);
                                r111.K(objQ2);
                            }
                            r18.g(str2, rVarF4, null, null, null, false, false, (e23.a) objQ2, r111, 48, 252);
                            r210 = r18;
                            r111.g0(false);
                        }
                        bVar4.getClass();
                        ?? r212 = r111;
                        mh.c(gl1.y.P(R.string.string_new_line_string_pattern, new Object[]{gl1.y.Q(r111, R.string.msg_strava_option_description), gl1.y.Q(r111, R.string.msg_manage_setting_in_strava_app)}, r111), c2.l.z(aVar5, eVar.getF97920e(), d92.b.b().b().getF97917b()), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.b.c().b(), r111), r212, 0, 0, 131068);
                        ?? r118 = r212;
                        r118.f();
                        r112 = r118;
                        r29 = r210;
                    } else {
                        fVar5 = fVar5;
                        r111.C(1126119746);
                        r111.f();
                    }
                    if (r25 != 0) {
                        r112 = r111;
                        r29 = r18;
                        r112.C(1126192441);
                        String strQ19 = gl1.y.Q(r112, R.string.lbl_extend_session_visibility);
                        h4.r rVarC4 = c2.l.C(x2.f(aVar5, 1.0f), 0.0f, d92.b.b().b().getF97921f(), 0.0f, 0.0f, 13);
                        fVar6 = fVar5;
                        final int i19 = 0;
                        z3.e eVarC2 = z3.f.c(2091126657, new e23.p() { // from class: gv0.q0
                            @Override // e23.p
                            public final Object invoke(Object obj17, Object obj18) {
                                int i110 = i19;
                                ou0.f fVar9 = fVar6;
                                switch (i110) {
                                    case 0:
                                        p3.m mVar2 = (p3.m) obj17;
                                        int iIntValue = ((Integer) obj18).intValue();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 48, 92);
                                        } else {
                                            mVar2.e();
                                        }
                                        break;
                                    default:
                                        p3.m mVar3 = (p3.m) obj17;
                                        int iIntValue2 = ((Integer) obj18).intValue();
                                        if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133983a, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 92);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, r112);
                        zR = r112.r(dVar) | r112.r(fVar6);
                        objQ = r112.q();
                        if (zR || objQ == p3.m.a.a()) {
                            final int i24 = 0;
                            objQ = new e23.a() { // from class: gv0.r0
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            ou0.f fVar9 = fVar6;
                                            dVar.O4(!(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false));
                                            break;
                                        default:
                                            ou0.f fVar10 = fVar6;
                                            dVar.N4(!(fVar10 != null ? p005kotlin.jvm.internal.s.g(fVar10.f133983a, Boolean.TRUE) : false));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            r112.K(objQ);
                        }
                        r29.g(strQ19, rVarC4, null, null, eVarC2, z18, false, (e23.a) objQ, r112, 24576, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
                        ?? r213 = r112;
                        mh.c(gl1.y.Q(r112, R.string.msg_livetrack_extend_option_description), c2.l.z(aVar5, d92.b.b().b().getF97920e(), d92.b.b().b().getF97917b()), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.b.c().b(), r112), r213, 0, 0, 131068);
                        ?? r119 = r213;
                        r119.f();
                        r113 = r119;
                    } else {
                        r112 = r111;
                        r29 = r18;
                        r112.C(1127338914);
                        r112.f();
                        r113 = r112;
                    }
                    c2.l.f(x2.h(aVar5, d92.b.b().b().getF97921f()), r113);
                    r113.y();
                    r113.f();
                    r16 = r113;
                }
                final int i25 = 1;
                objQ21 = new e23.a() { // from class: gv0.r0
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                ou0.f fVar9 = fVar8;
                                dVar.O4(!(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false));
                                break;
                            default:
                                ou0.f fVar10 = fVar8;
                                dVar.N4(!(fVar10 != null ? p005kotlin.jvm.internal.s.g(fVar10.f133983a, Boolean.TRUE) : false));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                E.K(objQ21);
                obj5 = obj4;
                bVar2 = bVar;
                r18 = p2Var;
                aVar5 = aVar14;
                boolean z39 = z36;
                r18.g(strQ13, rVarF, null, r17, eVarC, z39, false, (e23.a) objQ21, E, 24624, 196);
                z18 = z39;
                if (fVar8 != null) {
                    zG = p005kotlin.jvm.internal.s.g(fVar8.f133983a, bool);
                } else {
                    zG = false;
                }
                if (zG) {
                    E.C(1120757645);
                    String strQ110 = gl1.y.Q(E, R.string.lbl_recipients);
                    int intValue2 = n1Var.getIntValue();
                    String strC2 = dVar2.f199699b.c(R.plurals.lbl_recipient_count, intValue2, Integer.valueOf(intValue2));
                    h4.r rVarF5 = x2.f(aVar5, 1.0f);
                    p1Var7 = p1Var6;
                    boolean zB5 = E.B(p1Var7);
                    if ((i15 & 234881024) == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = zB5 | z34;
                    objQ5 = E.q();
                    if (z35) {
                        objQ5 = new a11.a0(aVar4, p1Var7, 15);
                        E.K(objQ5);
                    } else {
                        objQ5 = new a11.a0(aVar4, p1Var7, 15);
                        E.K(objQ5);
                    }
                    fVar2 = fVar8;
                    ?? r1110 = E;
                    obj6 = obj5;
                    r18.h(strQ110, strC2, null, rVarF5, null, false, false, null, null, null, (e23.a) objQ5, r1110, 3072, 0, 1012);
                    r1110.g0(false);
                    r19 = r1110;
                } else {
                    ?? r1111 = E;
                    fVar2 = fVar8;
                    obj6 = obj5;
                    r1111.C(1121177602);
                    r1111.g0(false);
                    r19 = r1111;
                }
                bVar2.getClass();
                float f17 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarZ4 = c2.l.z(aVar5, f17, eVar2.f97917b);
                String strQ111 = gl1.y.Q(r19, R.string.lbl_notify_recipients);
                fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0Var = j92.f.f97933j;
                ?? r214 = r19;
                mh.c(strQ111, rVarZ4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r19), r214, 0, 0, 131068);
                r110 = r214;
                if (z14) {
                    r110.C(1121606177);
                    fVar7 = fVar2;
                    if (fVar7 != null) {
                        obj9 = fVar7.f133984b;
                    } else {
                        obj9 = th3;
                    }
                    if (obj9 instanceof ou0.b.a) {
                        list = (List) ((g3) p1Var.getF182175a()).f35301b;
                        if (list != null) {
                            iD = list.size();
                        } else {
                            iD = 0;
                        }
                    } else if (obj9 instanceof ou0.b.C2540b) {
                        su0.h.f160962a.getClass();
                        iD = su0.h.d();
                    } else {
                        iD = 0;
                    }
                    if (p005kotlin.jvm.internal.s.g(obj9, ou0.b.a.f133961a)) {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r110, 728932021, R.string.lbl_visible_to_following_all, r110, false);
                    } else if (p005kotlin.jvm.internal.s.g(obj9, ou0.b.C2540b.f133962a)) {
                        r110.C(728935371);
                        strJ2 = lv0.b.a(r110, iD);
                        r110.g0(false);
                    } else {
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(r110, 728937664, R.string.lbl_off, r110, false);
                    }
                    String str3 = strJ2;
                    String strQ112 = gl1.y.Q(r110, R.string.lbl_grouptrack);
                    h4.r rVarF6 = x2.f(aVar5, 1.0f);
                    bVar2.getClass();
                    h4.r rVarC5 = c2.l.C(rVarF6, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
                    p1 p1Var14 = p1Var;
                    boolean zB6 = r110.B(p1Var14);
                    if ((i15 & 3670016) == 1048576) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zB6 | z28;
                    objQ4 = r110.q();
                    if (z29) {
                        obj10 = obj6;
                        if (objQ4 == obj10) {
                        }
                        eVar = eVar2;
                        fVar4 = fVar7;
                        obj7 = obj10;
                        r18.h(strQ112, str3, null, rVarC5, null, false, false, null, null, null, (e23.a) objQ4, r110, 0, 0, 1012);
                        bVar2.getClass();
                        float f18 = eVar.f97920e;
                        bVar2.getClass();
                        h4.r rVarZ5 = c2.l.z(aVar5, f18, eVar.f97917b);
                        String strQ113 = gl1.y.Q(r110, R.string.msg_group_track_with_follow_option_description);
                        fVar3.getClass();
                        aVar5 = aVar5;
                        mh.c(strQ113, rVarZ5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r110), r110, 0, 0, 131068);
                        ?? r1112 = r110;
                        r1112.g0(false);
                        r111 = r1112;
                    } else {
                        obj10 = obj6;
                    }
                    objQ4 = new o0(aVar3, p1Var14, p1Var5, 0);
                    r110.K(objQ4);
                    eVar = eVar2;
                    fVar4 = fVar7;
                    obj7 = obj10;
                    r18.h(strQ112, str3, null, rVarC5, null, false, false, null, null, null, (e23.a) objQ4, r110, 0, 0, 1012);
                    bVar2.getClass();
                    float f19 = eVar.f97920e;
                    bVar2.getClass();
                    h4.r rVarZ6 = c2.l.z(aVar5, f19, eVar.f97917b);
                    String strQ114 = gl1.y.Q(r110, R.string.msg_group_track_with_follow_option_description);
                    fVar3.getClass();
                    aVar5 = aVar5;
                    mh.c(strQ114, rVarZ6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, r110), r110, 0, 0, 131068);
                    ?? r1113 = r110;
                    r1113.g0(false);
                    r111 = r1113;
                } else {
                    obj7 = obj6;
                    fVar4 = fVar2;
                    eVar = eVar2;
                    r110.C(1123298498);
                    r110.g0(false);
                    r111 = r110;
                }
                fVar5 = fVar4;
                if (fVar5 != null) {
                    obj8 = fVar5.f133985c;
                } else {
                    obj8 = th3;
                }
                if (zF) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (z19) {
                    r111.C(1123680728);
                    bVar3 = g2.b.f184481a;
                    if (p005kotlin.jvm.internal.s.g(obj8, bVar3)) {
                        z24 = false;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728985582, R.string.lbl_strava_for_garmin, r111, false);
                    } else {
                        z24 = false;
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728987989, R.string.lbl_enable_strava_for_garmin, r111, false);
                    }
                    if (p005kotlin.jvm.internal.s.g(obj8, bVar3)) {
                        objJ = com.airbnb.lottie.animation.keyframe.a.j(r111, 728993855, R.string.lbl_on, r111, z24);
                    } else {
                        if (obj8 instanceof g2.a) {
                            r111.C(728992023);
                            r111.f();
                            lc.u0.r();
                            return;
                        }
                        r111.C(1124074242);
                        aVar6 = (g2.a) obj8;
                        if (aVar6.f184479a) {
                            z25 = false;
                            r111.C(1124486790);
                            r111.g0(false);
                            objP = th3;
                        } else {
                            z25 = false;
                            r111.C(1124486790);
                            r111.g0(false);
                            objP = th3;
                        }
                        r111.g0(z25);
                        objJ = objP;
                    }
                    if (objJ != null) {
                        j92.e eVar4 = eVar;
                        h4.r rVarC6 = c2.l.C(ds.e0.g(r111, 1124671178, aVar5, 1.0f, bVar2), 0.0f, eVar4.f97921f, 0.0f, 0.0f, 13);
                        if ((i15 & 29360128) == 8388608) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        context4 = context2;
                        qVar3 = qVar;
                        zR3 = r111.r(context4) | z27 | r111.r(qVar3);
                        objQ3 = r111.q();
                        if (zR3) {
                            objQ3 = new p0(lVar, context4, qVar3, 0);
                            r111.K(objQ3);
                        } else {
                            objQ3 = new p0(lVar, context4, qVar3, 0);
                            r111.K(objQ3);
                        }
                        bVar4 = bVar2;
                        eVar = eVar4;
                        r18.h(strJ, objJ, null, rVarC6, null, false, false, null, null, null, (e23.a) objQ3, r111, 0, 0, 1012);
                        r111.g0(false);
                        r210 = r18;
                    } else {
                        String str4 = strJ;
                        context3 = context2;
                        qVar2 = qVar;
                        Object obj17 = obj7;
                        r111.C(1125160079);
                        h4.r rVarF7 = x2.f(aVar5, 1.0f);
                        if ((i15 & 29360128) == 8388608) {
                            bVar4 = bVar2;
                            z26 = true;
                        } else {
                            bVar4 = bVar2;
                            z26 = false;
                        }
                        zR2 = r111.r(context3) | z26 | r111.r(qVar2);
                        objQ2 = r111.q();
                        if (zR2) {
                            objQ2 = new p0(lVar, context3, qVar2, 1);
                            r111.K(objQ2);
                        } else {
                            objQ2 = new p0(lVar, context3, qVar2, 1);
                            r111.K(objQ2);
                        }
                        r18.g(str4, rVarF7, null, null, null, false, false, (e23.a) objQ2, r111, 48, 252);
                        r210 = r18;
                        r111.g0(false);
                    }
                    bVar4.getClass();
                    ?? r215 = r111;
                    mh.c(gl1.y.P(R.string.string_new_line_string_pattern, new Object[]{gl1.y.Q(r111, R.string.msg_strava_option_description), gl1.y.Q(r111, R.string.msg_manage_setting_in_strava_app)}, r111), c2.l.z(aVar5, eVar.getF97920e(), d92.b.b().b().getF97917b()), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.b.c().b(), r111), r215, 0, 0, 131068);
                    ?? r1114 = r215;
                    r1114.f();
                    r112 = r1114;
                    r29 = r210;
                } else {
                    fVar5 = fVar5;
                    r111.C(1126119746);
                    r111.f();
                }
                if (r25 != 0) {
                    r112 = r111;
                    r29 = r18;
                    r112.C(1126192441);
                    String strQ115 = gl1.y.Q(r112, R.string.lbl_extend_session_visibility);
                    h4.r rVarC7 = c2.l.C(x2.f(aVar5, 1.0f), 0.0f, d92.b.b().b().getF97921f(), 0.0f, 0.0f, 13);
                    fVar6 = fVar5;
                    final int i110 = 0;
                    z3.e eVarC3 = z3.f.c(2091126657, new e23.p() { // from class: gv0.q0
                        @Override // e23.p
                        public final Object invoke(Object obj18, Object obj19) {
                            int i111 = i110;
                            ou0.f fVar9 = fVar6;
                            switch (i111) {
                                case 0:
                                    p3.m mVar2 = (p3.m) obj18;
                                    int iIntValue = ((Integer) obj19).intValue();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar2), mVar2, 48, 92);
                                    } else {
                                        mVar2.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar3 = (p3.m) obj18;
                                    int iIntValue2 = ((Integer) obj19).intValue();
                                    if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        hf.a(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133983a, Boolean.TRUE) : false, null, null, false, d92.c.a(ff.f88115a, mVar3), mVar3, 48, 92);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, r112);
                    zR = r112.r(dVar) | r112.r(fVar6);
                    objQ = r112.q();
                    if (zR) {
                        final int i26 = 0;
                        objQ = new e23.a() { // from class: gv0.r0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        ou0.f fVar9 = fVar6;
                                        dVar.O4(!(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false));
                                        break;
                                    default:
                                        ou0.f fVar10 = fVar6;
                                        dVar.N4(!(fVar10 != null ? p005kotlin.jvm.internal.s.g(fVar10.f133983a, Boolean.TRUE) : false));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r112.K(objQ);
                    } else {
                        final int i27 = 0;
                        objQ = new e23.a() { // from class: gv0.r0
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        ou0.f fVar9 = fVar6;
                                        dVar.O4(!(fVar9 != null ? p005kotlin.jvm.internal.s.g(fVar9.f133986d, Boolean.TRUE) : false));
                                        break;
                                    default:
                                        ou0.f fVar10 = fVar6;
                                        dVar.N4(!(fVar10 != null ? p005kotlin.jvm.internal.s.g(fVar10.f133983a, Boolean.TRUE) : false));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        r112.K(objQ);
                    }
                    r29.g(strQ115, rVarC7, null, null, eVarC3, z18, false, (e23.a) objQ, r112, 24576, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
                    ?? r216 = r112;
                    mh.c(gl1.y.Q(r112, R.string.msg_livetrack_extend_option_description), c2.l.z(aVar5, d92.b.b().b().getF97920e(), d92.b.b().b().getF97917b()), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.b.c().b(), r112), r216, 0, 0, 131068);
                    ?? r1115 = r216;
                    r1115.f();
                    r113 = r1115;
                } else {
                    r112 = r111;
                    r29 = r18;
                    r112.C(1127338914);
                    r112.f();
                    r113 = r112;
                }
                c2.l.f(x2.h(aVar5, d92.b.b().b().getF97921f()), r113);
                r113.y();
                r113.f();
                r16 = r113;
            }
            if (z18) {
                r16 = E;
                r16.C(1714539608);
                r16.f();
            } else {
                r16 = E;
                r16.C(1714366628);
                c2.q.a(u1.n.f(n5.a.a(r16, R.color.surface_background_hero_opacity_5), x2.d(h4.r.S, 1.0f)), r16, 0);
                r16.f();
            }
            x1 x1Var3 = p3.n.f135158a;
            r14 = r16;
        } else {
            E.e();
            r14 = E;
        }
        p2 p2VarI1 = r14.i0();
        if (p2VarI1 != null) {
            final int i28 = 1;
            p2VarI1.f(new e23.p(dVar, fVar, z14, dVar2, aVar, aVar2, aVar3, lVar, aVar4, i14, i28) { // from class: gv0.n0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f79336a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f79337b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ yu0.f f79338c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f79339d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ yu0.d f79340e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f79341f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f79342g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f79343h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.l f79344i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f79345j;

                {
                    this.f79336a = i28;
                }

                @Override // e23.p
                public final Object invoke(Object obj18, Object obj19) {
                    switch (this.f79336a) {
                        case 0:
                            ((Integer) obj19).getClass();
                            int iT = p3.p0.t(221569);
                            w0.b(this.f79337b, this.f79338c, this.f79339d, this.f79340e, this.f79341f, this.f79342g, this.f79343h, this.f79344i, this.f79345j, (p3.m) obj18, iT);
                            break;
                        default:
                            ((Integer) obj19).getClass();
                            int iT2 = p3.p0.t(221569);
                            w0.b(this.f79337b, this.f79338c, this.f79339d, this.f79340e, this.f79341f, this.f79342g, this.f79343h, this.f79344i, this.f79345j, (p3.m) obj18, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
