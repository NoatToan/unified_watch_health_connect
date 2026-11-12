package kl0;

import ak0.o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b21.a5;
import c.q;
import c.w;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import e11.t;
import e23.l;
import e23.p;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.fe;
import i3.mh;
import i3.se;
import i3.ua;
import i3.yd;
import java.text.NumberFormat;
import java.util.Locale;
import kb0.k;
import kd0.j5;
import l72.c1;
import l72.f0;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.v;
import r53.o2;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsKt$GolfCourseDetails$4$1", f = "GolfCourseDetails.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<kl0.c> f105217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f105218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3<kl0.c> x3Var, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f105217a = x3Var;
            this.f105218b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f105217a, this.f105218b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f105218b.setValue(Boolean.valueOf(this.f105217a.getF182175a().f105232a.getStatus() == il0.c.DOWNLOAD_FAILED));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kl0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsKt$GolfCourseDetails$5$1", f = "GolfCourseDetails.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2026b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f105219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kl0.d f105220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<kl0.c> f105221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2026b(Context context, kl0.d dVar, x3<kl0.c> x3Var, t13.d<? super C2026b> dVar2) {
            super(2, dVar2);
            this.f105219a = context;
            this.f105220b = dVar;
            this.f105221c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2026b(this.f105219a, this.f105220b, this.f105221c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2026b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Uri uri = this.f105221c.getF182175a().f105233b;
            if (uri != null) {
                g22.a.d(this.f105219a, uri);
                this.f105220b.f105239e.setValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsKt$GolfCourseDetails$checkLocationServices$1", f = "GolfCourseDetails.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f105223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f105224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f105225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f105226e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fe feVar, String str, String str2, Context context, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f105223b = feVar;
            this.f105224c = str;
            this.f105225d = str2;
            this.f105226e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f105223b, this.f105224c, this.f105225d, this.f105226e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105222a;
            if (i14 == 0) {
                r.b(obj);
                yd ydVar = yd.Long;
                this.f105222a = 1;
                cVar = this;
                obj = fe.b(this.f105223b, this.f105224c, this.f105225d, ydVar, cVar, 4);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                cVar = this;
            }
            if (((se) obj) == se.ActionPerformed) {
                cVar.f105226e.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsKt$GolfCourseDetails$launcher$1$1$1", f = "GolfCourseDetails.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f105228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f105229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f105230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fe feVar, String str, Context context, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f105228b = feVar;
            this.f105229c = str;
            this.f105230d = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f105228b, this.f105229c, this.f105230d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105227a;
            if (i14 == 0) {
                r.b(obj);
                j22.b bVar = j22.b.f96736a;
                j22.a aVar2 = j22.a.f96719h;
                bVar.getClass();
                String strF = j22.b.f(aVar2);
                yd ydVar = yd.Long;
                this.f105227a = 1;
                dVar = this;
                obj = fe.b(this.f105228b, strF, this.f105229c, ydVar, dVar, 4);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                dVar = this;
            }
            if (((se) obj) == se.ActionPerformed) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.garmin.android.apps.connectmobile", null));
                dVar.f105230d.startActivity(intent);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105231a;

        static {
            int[] iArr = new int[il0.c.values().length];
            try {
                iArr[il0.c.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[il0.c.DOWNLOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105231a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-695502370);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_download_failed);
            String strQ2 = y.Q(o0VarE, R.string.golf_course_download_failed_message);
            String strQ3 = y.Q(o0VarE, R.string.lbl_close);
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new kb0.p(aVar, 11);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new kb0.p(aVar, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            boolean z15 = i16 == 4;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new kb0.p(aVar, 12);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new kb0.p(aVar, 12);
                    o0VarE.K(objQ2);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(il0.a aVar, kl0.d dVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        String str;
        p1 p1Var;
        fe feVar;
        int i15;
        p1 p1Var2;
        aVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1960783885);
        int i16 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c((o2) dVar.f105240f.getValue(), o0VarE);
            PermissionState permissionStateRememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.ACCESS_FINE_LOCATION", null, o0VarE, 6, 2);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new j5(8);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j5(9);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new j5(10);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new j5(11);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) d4.a.e(objArr4, (e23.a) objQ4, o0VarE, 48);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ5);
            }
            b0 b0Var = (b0) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar2 = (fe) objQ6;
            String strQ = y.Q(o0VarE, R.string.lbl_settings);
            String strQ2 = y.Q(o0VarE, R.string.golf_downloaded_course_directions_location_services_instructions);
            g.g gVar = new g.g();
            boolean zR = o0VarE.r(dVar) | ((i16 & 14) == 4) | o0VarE.B(p1Var5) | o0VarE.r(b0Var) | o0VarE.B(strQ2) | o0VarE.B(strQ) | o0VarE.r(context);
            Object objQ7 = o0VarE.q();
            if (zR || objQ7 == c2565a) {
                str = strQ;
                p1Var = p1Var5;
                feVar = feVar2;
                i15 = 14;
                a5 a5Var = new a5(b0Var, dVar, aVar, p1Var, feVar, strQ2, str, context, 5);
                strQ2 = strQ2;
                b0Var = b0Var;
                o0VarE.K(a5Var);
                objQ7 = a5Var;
            } else {
                str = strQ;
                p1Var = p1Var5;
                feVar = feVar2;
                i15 = 14;
            }
            q qVarC = w.c(gVar, (l) objQ7, o0VarE, 0);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarE.C(2140322616);
                p1Var2 = p1Var3;
                boolean zB = o0VarE.B(p1Var2) | o0VarE.r(qVarC);
                Object objQ8 = o0VarE.q();
                if (zB || objQ8 == c2565a) {
                    objQ8 = new c42.g(qVarC, p1Var2, 2);
                    o0VarE.K(objQ8);
                }
                f((e23.a) objQ8, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                p1Var2 = p1Var3;
                o0VarE.C(2140498479);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0VarE.C(2140557100);
                boolean zB2 = o0VarE.B(p1Var6);
                Object objQ9 = o0VarE.q();
                if (zB2 || objQ9 == c2565a) {
                    objQ9 = new k(p1Var6, 13);
                    o0VarE.K(objQ9);
                }
                ml0.h.a((e23.a) objQ9, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2140682991);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(2140721586);
                boolean zB3 = o0VarE.B(p1Var4);
                Object objQ10 = o0VarE.q();
                if (zB3 || objQ10 == c2565a) {
                    objQ10 = new k(p1Var4, i15);
                    o0VarE.K(objQ10);
                }
                a((e23.a) objQ10, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2140810959);
                o0VarE.g0(false);
            }
            il0.c status = ((kl0.c) p1VarC.getF182175a()).f105232a.getStatus();
            boolean zB4 = o0VarE.B(p1Var4) | o0VarE.B(p1VarC);
            String str2 = strQ2;
            Object objQ11 = o0VarE.q();
            if (zB4 || objQ11 == c2565a) {
                objQ11 = new a(p1VarC, p1Var4, null);
                o0VarE.K(objQ11);
            }
            l0.e((p) objQ11, status, o0VarE);
            Uri uri = ((kl0.c) p1VarC.getF182175a()).f105233b;
            boolean zB5 = o0VarE.B(p1VarC) | o0VarE.r(context) | o0VarE.r(dVar);
            Object objQ12 = o0VarE.q();
            if (zB5 || objQ12 == c2565a) {
                objQ12 = new C2026b(context, dVar, p1VarC, null);
                o0VarE.K(objQ12);
            }
            l0.e((p) objQ12, uri, o0VarE);
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(988031928, new hl1.i(aVar2, 22), o0VarE), z3.f.c(-1017458951, new o(feVar, 21), o0VarE), null, null, z3.f.c(1556003004, new t(context, permissionStateRememberPermissionState, dVar, aVar, p1Var, b0Var, str2, str, p1Var2, qVarC, p1Var6, p1VarC, feVar, 1), o0Var), o0Var, 197040, 25);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(aVar, dVar, aVar2, i14, 16);
        }
    }

    public static final void c(kl0.d dVar, il0.a aVar, b0 b0Var, p1<com.garmin.android.library.mapsdkadapter.i.d> p1Var, fe feVar, String str, String str2, Context context) {
        if (!dVar.f105237c.a("GolfCourseDetailsViewModel")) {
            ge1.b.T(b0Var, null, null, new c(feVar, str, str2, context, null), 3);
            return;
        }
        com.garmin.android.library.mapsdkadapter.i.d f182175a = p1Var.getF182175a();
        aVar.getClass();
        f182175a.getClass();
        ge1.b.T(v1.a(dVar), null, null, new i(dVar, aVar, f182175a, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0548  */
    /* JADX WARN: Code duplicated, block: B:157:0x0674  */
    /* JADX WARN: Code duplicated, block: B:168:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0487  */
    public static final void d(il0.a aVar, z3.e eVar, l lVar, l lVar2, l lVar3, m mVar, int i14) {
        int i15;
        e0.a aVar2;
        h5.g.a.b bVar;
        h4.r.a aVar3;
        int i16;
        int i17;
        int i18;
        h5.g.a.b bVar2;
        String strQ;
        boolean z14;
        o0 o0VarE = mVar.E(1508616172);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i14 | (o0VarE.B(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192);
        if (o0VarE.n(i19 & 1, (i19 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarX = x2.x(x2.f(aVar4, 1.0f), null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar3 = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarX, eVar3.f97920e);
            z zVarA2 = c2.y.a(kVar, aVar5, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
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
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.no_value);
            String name = aVar.getName();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(name, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131070);
            String city = aVar.getCity();
            if (city == null) {
                city = "";
            }
            if (d53.w.J(city)) {
                city = strQ2;
            }
            String state = aVar.getState();
            if (state == null) {
                state = "";
            }
            String upperCase = state.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (d53.w.J(upperCase)) {
                upperCase = strQ2;
            }
            String str = ((Object) city) + ", " + ((Object) upperCase);
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            bVar4.getClass();
            mh.c(str, c2.l.C(aVar4, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0 o0Var = o0VarE;
            if (aVar.getDistanceFromOrigin() != null) {
                o0Var.C(-1589883371);
                String str2 = aVar.getDistanceFromOrigin() + StringUtils.SPACE + y.Q(o0Var, aVar.getDistanceUnitLabel());
                fVar2.getClass();
                x0 x0VarF2 = d92.c.f(x0Var, o0Var);
                bVar4.getClass();
                mh.c(str2, c2.l.C(aVar4, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 131068);
                o0Var = o0Var;
                i15 = 0;
                o0Var.g0(false);
            } else {
                i15 = 0;
                o0Var.C(-1589610974);
                o0Var.g0(false);
            }
            h4.r rVarX2 = x2.x(x2.f(r45, 1.0f), null, 3);
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81533k, o0Var, i15);
            int iHashCode3 = Long.hashCode(o0Var.getU());
            i2 i2VarA2 = o0Var.a0();
            h4.r rVarC3 = h4.k.c(rVarX2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                aVar2 = aVar6;
                o0Var.M(aVar2);
            } else {
                aVar2 = aVar6;
                o0Var.c();
            }
            b4.c(eVar2, s2VarA, o0Var);
            b4.c(c1623g, i2VarA2, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                bVar = bVar3;
                v.h.A(iHashCode3, o0Var, iHashCode3, bVar);
            } else {
                bVar = bVar3;
            }
            b4.c(fVar, rVarC3, o0Var);
            u2 u2Var = u2.f22900a;
            if (aVar.getNumberOfHoles() != null && aVar.getNumberOfHoles().intValue() > 0) {
                strQ2 = NumberFormat.getInstance().format(aVar.getNumberOfHoles());
            }
            strQ2.getClass();
            String strP = y.P(R.string.golf_downloaded_course_num_holes, new Object[]{strQ2}, o0Var);
            fVar2.getClass();
            x0 x0VarF3 = d92.c.f(x0Var, o0Var);
            bVar4.getClass();
            float f14 = eVar3.f97917b;
            bVar4.getClass();
            h5.g.a.b bVar5 = bVar;
            o0 o0Var2 = o0Var;
            e0.a aVar7 = aVar2;
            mh.c(strP, c2.l.C(aVar4, 0.0f, f14, eVar3.f97920e, 0.0f, 9), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, o0Var2, 0, 0, 131068);
            fVar2.getClass();
            x0 x0VarF4 = d92.c.f(x0Var, o0Var2);
            bVar4.getClass();
            mh.c("|", c2.l.C(aVar4, 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF4, o0Var2, 6, 0, 131068);
            String strQ3 = y.Q(o0Var2, aVar.getMembershipType().f93974c);
            fVar2.getClass();
            x0 x0VarF5 = d92.c.f(x0Var, o0Var2);
            bVar4.getClass();
            float f15 = eVar3.f97917b;
            bVar4.getClass();
            mh.c(strQ3, c2.l.C(aVar4, eVar3.f97920e, f15, 0.0f, 0.0f, 12), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF5, o0Var2, 0, 0, 131068);
            o0 o0Var3 = o0Var2;
            o0Var3.g0(true);
            o0Var3.g0(true);
            int i24 = i19 & 14;
            eVar.invoke(aVar, o0Var3, Integer.valueOf(i19 & 126));
            bVar4.getClass();
            c2.l.f(x2.h(aVar4, eVar3.f97920e), o0Var3);
            String phone = aVar.getPhone();
            m.a aVar8 = m.f135153a;
            if (phone != null) {
                o0Var3.C(-1141998957);
                String phone2 = aVar.getPhone();
                fVar2.getClass();
                x0 x0Var2 = j92.f.f97931h;
                f02.m.f67741a.getClass();
                long jA = f02.m.a();
                bVar4.getClass();
                float f16 = eVar3.f97920e;
                bVar4.getClass();
                float f17 = eVar3.f97920e;
                bVar4.getClass();
                h4.r rVarC4 = c2.l.C(aVar4, f17, f16, eVar3.f97920e, 0.0f, 8);
                aVar3 = aVar4;
                i17 = 4;
                boolean z15 = (i24 == 4) | ((i19 & 896) == 256);
                Object objQ = o0Var3.q();
                if (z15) {
                    objQ = new jl0.f(lVar, aVar, 1);
                    o0Var3.K(objQ);
                } else {
                    aVar8.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new jl0.f(lVar, aVar, 1);
                        o0Var3.K(objQ);
                    }
                }
                i16 = i24;
                mh.c(phone2, u1.w.d(rVarC4, false, null, null, (e23.a) objQ, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0Var3, 0, 0, 131064);
                o0Var3 = o0Var3;
                o0Var3.g0(false);
            } else {
                aVar3 = aVar4;
                i16 = i24;
                i17 = 4;
                o0Var3.C(-1141565236);
                o0Var3.g0(false);
            }
            String strQ4 = y.Q(o0Var3, R.string.lbl_driving_directions);
            fVar2.getClass();
            x0 x0Var3 = j92.f.f97931h;
            f02.m.f67741a.getClass();
            long jA2 = f02.m.a();
            bVar4.getClass();
            float f18 = eVar3.f97920e;
            bVar4.getClass();
            float f19 = eVar3.f97920e;
            bVar4.getClass();
            h4.r rVarC5 = c2.l.C(aVar3, f19, f18, eVar3.f97920e, 0.0f, 8);
            boolean z16 = (i16 == i17) | ((i19 & 7168) == 2048);
            Object objQ2 = o0Var3.q();
            if (z16) {
                i18 = 2;
                objQ2 = new jl0.f(lVar2, aVar, 2);
                o0Var3.K(objQ2);
            } else {
                aVar8.getClass();
                if (objQ2 == m.a.f135155b) {
                    i18 = 2;
                    objQ2 = new jl0.f(lVar2, aVar, 2);
                    o0Var3.K(objQ2);
                } else {
                    i18 = 2;
                }
            }
            o0 o0Var4 = o0Var3;
            int i25 = i18;
            h4.r.a aVar9 = aVar3;
            mh.c(strQ4, u1.w.d(rVarC5, false, null, null, (e23.a) objQ2, 15), jA2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0Var4, 0, 0, 131064);
            o0VarE = o0Var4;
            h4.r rVarA = b0Var.a(x2.f(aVar9, 1.0f), 1.0f, true);
            bVar4.getClass();
            h4.r rVarY2 = c2.l.y(rVarA, eVar3.f97920e);
            z0 z0VarD = c2.q.d(h4.d.a.f81531i, false);
            int iHashCode4 = Long.hashCode(o0VarE.getU());
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC6 = h4.k.c(rVarY2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                bVar2 = bVar5;
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            } else {
                bVar2 = bVar5;
            }
            b4.c(fVar, rVarC6, o0VarE);
            u uVar = u.f22885a;
            il0.c status = aVar.getStatus();
            if (status == null) {
                o0VarE.C(-874930147);
                o0VarE.g0(false);
                strQ = null;
            } else {
                o0VarE.C(-874930146);
                il0.c.f93960a.getClass();
                strQ = y.Q(o0VarE, il0.c.a.a(status));
                o0VarE.g0(false);
            }
            if (strQ == null) {
                strQ = "";
            }
            il0.c status2 = aVar.getStatus();
            int i26 = status2 == null ? -1 : e.f105231a[status2.ordinal()];
            if (i26 != 1) {
                if (i26 != i25) {
                    o0VarE.C(1218750646);
                    f0 f0Var = f0.f110999a;
                    String strQ5 = y.Q(o0VarE, R.string.lbl_download);
                    float f22 = SyslogConstants.LOG_LOCAL4;
                    g6.f.a aVar10 = g6.f.f75994b;
                    h4.r rVarB = x2.b(aVar9, f22, 0.0f, i25);
                    boolean z17 = (i16 == 4) | ((i19 & 57344) == 16384);
                    Object objQ3 = o0VarE.q();
                    if (z17) {
                        objQ3 = new jl0.f(lVar3, aVar, 3);
                        o0VarE.K(objQ3);
                    } else {
                        aVar8.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new jl0.f(lVar3, aVar, 3);
                            o0VarE.K(objQ3);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ3, rVarB, strQ5, o0VarE, null, false);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    Unit unit = Unit.INSTANCE;
                } else {
                    o0VarE.C(-873731779);
                    f0 f0Var2 = f0.f110999a;
                    String strQ6 = y.Q(o0VarE, R.string.lbl_downloaded);
                    float f24 = SyslogConstants.LOG_LOCAL4;
                    g6.f.a aVar11 = g6.f.f75994b;
                    h4.r rVarB2 = x2.b(aVar9, f24, 0.0f, i25);
                    Object objQ4 = o0VarE.q();
                    aVar8.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new j5(7);
                        o0VarE.K(objQ4);
                    }
                    f0Var2.i(strQ6, rVarB2, false, (e23.a) objQ4, o0VarE, 3504, 0);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                }
                z14 = true;
            } else {
                o0VarE.C(1218708590);
                boolean zB = o0VarE.B(strQ);
                Object objQ5 = o0VarE.q();
                if (zB) {
                    objQ5 = new jl0.e(strQ, 12);
                    o0VarE.K(objQ5);
                } else {
                    aVar8.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new jl0.e(strQ, 12);
                        o0VarE.K(objQ5);
                    }
                }
                h4.r rVarC7 = v.c((l) objQ5, aVar9, false);
                z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                int iHashCode5 = Long.hashCode(o0VarE.getU());
                i2 i2VarA4 = o0VarE.a0();
                h4.r rVarC8 = h4.k.c(rVarC7, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA4, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode5))) {
                    v.h.A(iHashCode5, o0VarE, iHashCode5, bVar2);
                }
                b4.c(fVar, rVarC8, o0VarE);
                f0 f0Var3 = f0.f110999a;
                float f25 = SyslogConstants.LOG_LOCAL4;
                g6.f.a aVar12 = g6.f.f75994b;
                h4.r rVarB3 = x2.b(aVar9, f25, 0.0f, 2);
                Object objQ6 = o0VarE.q();
                aVar8.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ6 == c2565a) {
                    objQ6 = new j5(6);
                    o0VarE.K(objQ6);
                }
                f0Var3.i("", rVarB3, false, (e23.a) objQ6, o0VarE, 3510, 0);
                bVar4.getClass();
                h4.r rVarQ = x2.q(aVar9, j92.b.f97901d.f97904c);
                boolean zB2 = o0VarE.B(strQ);
                Object objQ7 = o0VarE.q();
                if (zB2 || objQ7 == c2565a) {
                    objQ7 = new jl0.e(strQ, 13);
                    o0VarE.K(objQ7);
                }
                h4.r rVarC9 = v.c((l) objQ7, rVarQ, false);
                z14 = true;
                ua.a(2, 0.0f, 0, 384, 56, vb.h.g(o0VarE), 0L, rVarC9, o0VarE);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
            }
            o0VarE.g0(z14);
            o0VarE.g0(z14);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(aVar, eVar, lVar, lVar2, lVar3, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    public static final void e(il0.a aVar, l<? super com.garmin.android.library.mapsdkadapter.i.d, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(1058590075);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            float f14 = SyslogConstants.LOG_LOCAL4;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(rVarF, f14);
            boolean zR = ((i15 & 112) == 32) | ((i15 & 14) == 4) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k62.k(6, context, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.k(6, context, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            rw0.f.a(rVarH, (l) objQ, null, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(aVar, lVar, i14, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static final void f(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1606851284);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            j22.b bVar = j22.b.f96736a;
            j22.a aVar2 = j22.a.f96719h;
            bVar.getClass();
            String strF = j22.b.f(aVar2);
            String strQ = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new kb0.p(aVar, 9);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new kb0.p(aVar, 9);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, null, strF, null, null, strQ, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1754);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 23);
        }
    }
}
