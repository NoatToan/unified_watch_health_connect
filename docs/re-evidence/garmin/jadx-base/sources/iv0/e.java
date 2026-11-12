package iv0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c2.a0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gv0.m0;
import h5.e0;
import ho.d0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.c1;
import o4.m1;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.recipients.ChangeRecipientMethodScreenKt$ChangeRecipientMethodScreen$1$1", f = "ChangeRecipientMethodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f95088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f95088a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f95088a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f95088a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.recipients.ChangeRecipientMethodScreenKt$ChangeRecipientMethodScreen$3$1", f = "ChangeRecipientMethodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f95089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f95090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gv0.d dVar, String str, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f95089a = dVar;
            this.f95090b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f95089a, this.f95090b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            gv0.d dVar = this.f95089a;
            dVar.getClass();
            String str = this.f95090b;
            str.getClass();
            ge1.b.T(v1.a(dVar), null, null, new gv0.q(dVar, str, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.recipients.ChangeRecipientMethodScreenKt$ChangeRecipientMethodScreen$4$1", f = "ChangeRecipientMethodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f95091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gv0.d f95092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f95093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<g3<pu0.b>> f95094d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f95095a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f95095a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a<Unit> aVar, gv0.d dVar, Context context, x3<g3<pu0.b>> x3Var, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f95091a = aVar;
            this.f95092b = dVar;
            this.f95093c = context;
            this.f95094d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f95091a, this.f95092b, this.f95093c, this.f95094d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<g3<pu0.b>> x3Var = this.f95094d;
            int i14 = a.f95095a[x3Var.getF182175a().f35300a.ordinal()];
            e23.a<Unit> aVar2 = this.f95091a;
            if (i14 != 1) {
                if (i14 == 2) {
                    Toast.makeText(this.f95093c, R.string.txt_error_occurred, 0).show();
                    aVar2.invoke();
                }
            } else if (x3Var.getF182175a().f35301b == null) {
                aVar2.invoke();
                p2 p2Var = this.f95092b.f79198o;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, g3.a.c(g3.f35298f)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<pu0.b, Boolean> {
        public d(Object obj) {
            super(1, obj, gv0.d.class, "requiresLiveTrackSmsOptInRequest", "requiresLiveTrackSmsOptInRequest(Lcom/garmin/android/apps/connectmobile/livetrackui/data/model/contact/Contact;)Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(pu0.b bVar) {
            pu0.b bVar2 = bVar;
            bVar2.getClass();
            ((gv0.d) this.receiver).getClass();
            return Boolean.valueOf(gv0.d.W4(bVar2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void a(pu0.b bVar, Long l14, Boolean bool, gv0.y yVar, e23.p pVar, e23.l lVar, e23.p pVar2, hl.a aVar, p3.m mVar, int i14) {
        Object next;
        Object next2;
        Object next3;
        p1 p1Var;
        p1 p1Var2;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z14;
        String strJ;
        pu0.i iVar;
        pu0.h hVar;
        Context context;
        String strV;
        String str;
        String str2;
        String str3;
        e23.p pVar3;
        int i19;
        c2.b0 b0Var;
        Context context2;
        int i24;
        p1 p1Var3;
        boolean z15;
        String str4;
        pu0.b bVar2 = bVar;
        o0 o0VarE = mVar.E(-245385729);
        int i25 = i14 | (o0VarE.r(bVar2) ? 4 : 2) | (o0VarE.B(l14) ? 32 : 16) | (o0VarE.B(bool) ? 256 : 128) | (o0VarE.k(yVar == null ? -1 : yVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i25 & 1, (i25 & 4793491) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Context context3 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            wd2.l lVar2 = (wd2.l) KoinJavaComponent.get$default(wd2.l.class, null, null, 6, null);
            Iterator<T> it = bVar2.f141186d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((pu0.f) next).f141220a, l14));
            pu0.f fVar = (pu0.f) next;
            Iterator<T> it3 = bVar2.f141191i.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((pu0.i) next2).f141260a, l14));
            pu0.i iVar2 = (pu0.i) next2;
            Iterator<T> it4 = bVar2.f141192j.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!p005kotlin.jvm.internal.s.g(((pu0.h) next3).f141237a, l14));
            pu0.h hVar2 = (pu0.h) next3;
            final pu0.b bVarA = pu0.b.a(bVar2, p13.x.l(fVar), null, p13.x.l(iVar2), p13.x.l(hVar2), null, null, 64759);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(null);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            boolean z16 = ((i25 & 57344) == 16384) | ((i25 & 458752) == 131072);
            Object objQ4 = o0VarE.q();
            if (z16 || objQ4 == c2565a) {
                et.p pVar4 = new et.p(lVar, pVar, p1Var5, p1Var6, p1Var4, 29);
                p1Var = p1Var6;
                p1Var2 = p1Var4;
                o0VarE.K(pVar4);
                objQ4 = pVar4;
            } else {
                p1Var2 = p1Var4;
                p1Var = p1Var6;
            }
            final e23.p pVar5 = (e23.p) objQ4;
            boolean z17 = aVar instanceof hl.a.b;
            if (z17) {
                i15 = -250126083;
                i16 = R.string.lbl_child_livetrack_change_contact_method_description;
            } else {
                if (!(aVar instanceof hl.a.c)) {
                    throw kg.f.h(o0VarE, 407571312, false);
                }
                i15 = -249986707;
                i16 = R.string.lbl_change_contact_method_description;
            }
            String strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, r15);
            if (z17) {
                i17 = -249773489;
                i18 = R.string.msg_child_livetrack_text_notifications_availability_gc_plus_inreach;
            } else {
                if (!(aVar instanceof hl.a.c)) {
                    throw kg.f.h(o0VarE, 407582706, false);
                }
                i17 = -249620039;
                i18 = R.string.livetrack_text_notifications_availability_gc_plus_inreach;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i17, i18, o0VarE, r15);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(a2.b(aVar2, a2.a(o0VarE), true), 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_change_method);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            mh.c(strQ, c2.l.C(aVar2, 0.0f, f14, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            int i26 = d6.h.f57755e;
            bVar4.getClass();
            float f16 = eVar.f97918c;
            bVar4.getClass();
            mh.c(strJ2, c2.l.C(aVar2, 0.0f, f16, 0.0f, eVar.f97921f, 5), 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130044);
            if (fVar == null) {
                o0VarE.C(808250242);
                z14 = false;
                o0VarE.g0(false);
                strJ = null;
            } else {
                z14 = false;
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 808250243, R.string.lbl_email, o0VarE, false);
            }
            if (strJ == null) {
                o0VarE.C(808335772);
                iVar = iVar2;
                if (iVar == null) {
                    o0VarE.C(808335771);
                    o0VarE.g0(z14);
                    strJ = null;
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 808335772, R.string.lbl_text_message, o0VarE, z14);
                }
            } else {
                iVar = iVar2;
                o0VarE.C(-1497948592);
            }
            o0VarE.g0(z14);
            if (strJ == null) {
                o0VarE.C(808432399);
                if (hVar == null) {
                    hVar = hVar2;
                    o0VarE.C(808432398);
                    o0VarE.g0(z14);
                    strJ = null;
                } else {
                    hVar = hVar2;
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 808432399, R.string.lbl_garmin_messenger_app_name, o0VarE, z14);
                }
            } else {
                hVar = hVar2;
                o0VarE.C(-1497948482);
            }
            o0VarE.g0(z14);
            if (strJ == null) {
                strJ = "";
            }
            String upperCase = strJ.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            h4.r rVarB = b0Var2.b(aVar2, h4.d.a.f81536n);
            bVar4.getClass();
            bVar4.getClass();
            bVar4.getClass();
            bVar4.getClass();
            h4.r rVarB2 = c2.l.B(rVarB, f15, f15, f15, eVar.f97917b);
            fVar2.getClass();
            boolean z18 = z14;
            mh.c(upperCase, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            l72.p2 p2Var = l72.p2.f111205a;
            if (fVar == null || (str4 = fVar.f141221b) == null) {
                if (iVar == null || (str3 = iVar.f141261b) == null) {
                    context = context3;
                    strV = (hVar == null || (str2 = hVar.f141238b) == null) ? null : jg.b.v(context, str2);
                    if (strV == null) {
                        str = "";
                    }
                } else {
                    context = context3;
                    strV = jg.b.v(context, str3);
                }
                str = strV;
            } else {
                str = str4;
                context = context3;
            }
            if (hVar != null) {
                f.f95096a.getClass();
                pVar3 = f.f95097b;
            } else {
                pVar3 = null;
            }
            p2Var.g(str, null, null, pVar3, null, false, false, null, o0VarE, 196608, 470);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_current_contact_method);
            fVar2.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            int i27 = d6.h.f57757g;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            bVar4.getClass();
            h4.r rVarA = c2.l.A(rVarF, f15, 0.0f, 2);
            bVar4.getClass();
            boolean z19 = false;
            mh.c(strQ2, c2.l.C(rVarA, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            List<pu0.f> list = bVar2.f141186d;
            ArrayList<pu0.f> arrayList = new ArrayList();
            for (Object obj : list) {
                pu0.f fVar3 = (pu0.f) obj;
                if (fVar3.f141221b != null && !p005kotlin.jvm.internal.s.g(fVar3.f141222c, pu0.g.a.f141234a)) {
                    arrayList.add(obj);
                }
            }
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_email);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (pu0.f fVar4 : arrayList) {
                String str5 = fVar4.f141221b;
                if (str5 == null) {
                    str5 = "";
                }
                List listC = p13.w.c(fVar4);
                String str6 = str5;
                j0 j0Var = j0.f134944a;
                arrayList2.add(new o13.p(str6, pu0.b.a(bVar2, listC, null, j0Var, j0Var, null, null, 64759)));
                b0Var2 = b0Var2;
                context = context;
                z19 = false;
            }
            Context context4 = context;
            c2.b0 b0Var3 = b0Var2;
            boolean zB = o0VarE.B(pVar5) | o0VarE.r(bVarA);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == p3.m.a.f135155b) {
                final int i28 = z18 ? 1 : 0;
                objQ5 = new e23.l() { // from class: iv0.a
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        pu0.b bVar5 = (pu0.b) obj2;
                        switch (i28) {
                            case 0:
                                bVar5.getClass();
                                pVar5.invoke(bVar5, bVarA);
                                break;
                            case 1:
                                bVar5.getClass();
                                pVar5.invoke(bVar5, bVarA);
                                break;
                            default:
                                bVar5.getClass();
                                pVar5.invoke(bVar5, bVarA);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ5);
            }
            int i29 = 10;
            c(b0Var3, strQ3, arrayList2, false, null, null, (e23.l) objQ5, o0VarE, 6, 28);
            o0 o0Var = o0VarE;
            if (bool != null) {
                o0Var.C(810602771);
                List<pu0.i> list2 = bVar2.f141191i;
                ArrayList<pu0.i> arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    pu0.i iVar3 = (pu0.i) obj2;
                    if (iVar3.f141261b != null && !p005kotlin.jvm.internal.s.g(iVar3.f141262c, pu0.g.a.f141234a)) {
                        arrayList3.add(obj2);
                    }
                }
                String strQ4 = gl1.y.Q(o0Var, R.string.lbl_text_message);
                ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                for (pu0.i iVar4 : arrayList3) {
                    String str7 = iVar4.f141261b;
                    Context context5 = context4;
                    String strV2 = str7 != null ? jg.b.v(context5, str7) : null;
                    if (strV2 == null) {
                        strV2 = "";
                    }
                    int i30 = i29;
                    j0 j0Var2 = j0.f134944a;
                    arrayList4.add(new o13.p(strV2, pu0.b.a(bVar2, j0Var2, null, p13.w.c(iVar4), j0Var2, null, null, 64759)));
                    i29 = i30;
                    context4 = context5;
                }
                i19 = i29;
                context2 = context4;
                boolean zBooleanValue = bool.booleanValue();
                boolean zB2 = o0Var.B(pVar5) | o0Var.r(bVarA);
                Object objQ6 = o0Var.q();
                if (zB2 || objQ6 == p3.m.a.f135155b) {
                    final int i34 = 1;
                    objQ6 = new e23.l() { // from class: iv0.a
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            pu0.b bVar5 = (pu0.b) obj3;
                            switch (i34) {
                                case 0:
                                    bVar5.getClass();
                                    pVar5.invoke(bVar5, bVarA);
                                    break;
                                case 1:
                                    bVar5.getClass();
                                    pVar5.invoke(bVar5, bVarA);
                                    break;
                                default:
                                    bVar5.getClass();
                                    pVar5.invoke(bVar5, bVarA);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var.K(objQ6);
                }
                c(b0Var3, strQ4, arrayList4, zBooleanValue, null, null, (e23.l) objQ6, o0Var, 6 | ((i25 << 3) & 7168), 24);
                b0Var = b0Var3;
                o0Var = o0Var;
                if (arrayList3.isEmpty()) {
                    i24 = 2;
                    z15 = false;
                    o0Var.C(811724909);
                    o0Var.g0(false);
                } else {
                    o0Var.C(811307401);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97933j, o0Var);
                    d6.h.f57752b.getClass();
                    int i35 = d6.h.f57757g;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    j92.b bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    i24 = 2;
                    h4.r rVarA2 = c2.l.A(rVarF2, eVar2.f97920e, 0.0f, 2);
                    bVar5.getClass();
                    mh.c(strJ3, c2.l.C(rVarA2, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i35), 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 130044);
                    o0Var = o0Var;
                    z15 = false;
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
            } else {
                i19 = 10;
                b0Var = b0Var3;
                context2 = context4;
                i24 = 2;
                o0Var.C(811734829);
                o0Var.g0(z18);
            }
            List<pu0.h> list3 = bVar2.f141192j;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                pu0.h hVar3 = (pu0.h) obj3;
                if (hVar3.f141238b != null && !p005kotlin.jvm.internal.s.g(hVar3.f141239c, pu0.g.a.f141234a)) {
                    arrayList5.add(obj3);
                }
            }
            String strQ5 = gl1.y.Q(o0Var, R.string.lbl_garmin_messenger_app_name);
            ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, i19));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                pu0.h hVar4 = (pu0.h) it5.next();
                String str8 = hVar4.f141238b;
                Context context6 = context2;
                String strV3 = str8 != null ? jg.b.v(context6, str8) : null;
                if (strV3 == null) {
                    strV3 = "";
                }
                j0 j0Var3 = j0.f134944a;
                arrayList6.add(new o13.p(strV3, pu0.b.a(bVar2, j0Var3, null, j0Var3, p13.w.c(hVar4), null, null, 64759)));
                bVar2 = bVar;
                i24 = i24;
                context2 = context6;
                it5 = it5;
                b0Var = b0Var;
            }
            c2.b0 b0Var4 = b0Var;
            Context context7 = context2;
            final int i36 = i24;
            boolean z24 = yVar != gv0.y.Receiver;
            f.f95096a.getClass();
            z3.e eVar3 = f.f95098c;
            z3.e eVarC = z3.f.c(-1952580159, new gw1.c(yVar, 22, lVar2, context7), o0Var);
            boolean zB3 = o0Var.B(pVar5) | o0Var.r(bVarA);
            Object objQ7 = o0Var.q();
            if (zB3 || objQ7 == p3.m.a.f135155b) {
                objQ7 = new e23.l() { // from class: iv0.a
                    @Override // e23.l
                    public final Object invoke(Object obj4) {
                        pu0.b bVar6 = (pu0.b) obj4;
                        switch (i36) {
                            case 0:
                                bVar6.getClass();
                                pVar5.invoke(bVar6, bVarA);
                                break;
                            case 1:
                                bVar6.getClass();
                                pVar5.invoke(bVar6, bVarA);
                                break;
                            default:
                                bVar6.getClass();
                                pVar5.invoke(bVar6, bVarA);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var.K(objQ7);
            }
            o0 o0Var2 = o0Var;
            c(b0Var4, strQ5, arrayList6, z24, eVar3, eVarC, (e23.l) objQ7, o0Var2, 221190, 0);
            o0VarE = o0Var2;
            o0VarE.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-242541902);
                c1 c1Var = c1.f110940a;
                String strQ6 = gl1.y.Q(o0VarE, R.string.send_new_request_alert_title);
                String strQ7 = gl1.y.Q(o0VarE, R.string.livetrack_text_notifications_request);
                String strQ8 = gl1.y.Q(o0VarE, R.string.send_request);
                boolean z25 = (i25 & 3670016) == 1048576;
                Object objQ8 = o0VarE.q();
                if (z25 || objQ8 == p3.m.a.f135155b) {
                    p1 p1Var7 = p1Var2;
                    objQ8 = new d0(pVar2, p1Var7, p1Var5, p1Var, 10);
                    p1Var3 = p1Var7;
                    o0VarE.K(objQ8);
                } else {
                    p1Var3 = p1Var2;
                }
                e23.a<Unit> aVar5 = (e23.a) objQ8;
                String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                Object objQ9 = o0VarE.q();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new i11.i(p1Var3, 17);
                    o0VarE.K(objQ9);
                }
                c1Var.a(false, strQ6, strQ7, null, null, strQ8, false, false, aVar5, strQ9, (e23.a) objQ9, o0VarE, 0, 6, 217);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-241879773);
                o0VarE.g0(false);
            }
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(bVar, l14, bool, yVar, pVar, lVar, pVar2, aVar, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final gv0.d dVar, final String str, final Long l14, final Boolean bool, final e23.p<? super String, ? super Boolean, Unit> pVar, final e23.a<Unit> aVar, p3.m mVar, final int i14) {
        String str2;
        o0 o0Var;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        dVar.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(777374861);
        int i15 = (o0VarE.r(aVar) ? 131072 : 65536) | i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(l14) ? 256 : 128) | (o0VarE.B(bool) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar2 = p3.m.f135153a;
            if (str == null) {
                o0VarE.C(311148653);
                Unit unit = Unit.INSTANCE;
                boolean z14 = (458752 & i15) == 131072;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new a(aVar, null);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(aVar, null);
                        o0VarE.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, unit, o0VarE);
                o0VarE.g0(false);
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar2 = new e23.p(dVar, str, l14, bool, pVar, aVar, i14, i16) { // from class: iv0.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f95081a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ gv0.d f95082b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f95083c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ Long f95084d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Boolean f95085e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.p f95086f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.a f95087g;

                    {
                        this.f95081a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f95081a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                e.b(this.f95082b, this.f95083c, this.f95084d, this.f95085e, this.f95086f, this.f95087g, (p3.m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                e.b(this.f95082b, this.f95083c, this.f95084d, this.f95085e, this.f95086f, this.f95087g, (p3.m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                str2 = str;
                o0VarE.C(311227672);
                boolean zR = o0VarE.r(dVar) | ((i15 & 112) == 32);
                Object objQ2 = o0VarE.q();
                if (zR) {
                    objQ2 = new b(dVar, str2, null);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new b(dVar, str2, null);
                        o0VarE.K(objQ2);
                    }
                }
                l0.e((e23.p) objQ2, str2, o0VarE);
                o0VarE.g0(false);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                p1 p1VarC = s9.c.c(dVar.f79199p, o0VarE);
                hl.a aVar3 = dVar.f79188f;
                p1 p1VarC2 = s9.c.c(dVar.f79206y, o0VarE);
                boolean z15 = ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING;
                m0.a(dVar, pVar, o0VarE, (i15 & 14) | ((i15 >> 9) & 112));
                fw.p pVar3 = ((g3) p1VarC.getF182175a()).f35300a;
                boolean zB = o0VarE.B(p1VarC) | ((458752 & i15) == 131072) | o0VarE.r(dVar) | o0VarE.r(context);
                Object objQ3 = o0VarE.q();
                if (zB) {
                    c cVar = new c(aVar, dVar, context, p1VarC, null);
                    o0VarE.K(cVar);
                    objQ3 = cVar;
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        c cVar2 = new c(aVar, dVar, context, p1VarC, null);
                        o0VarE.K(cVar2);
                        objQ3 = cVar2;
                    }
                }
                l0.e((e23.p) objQ3, pVar3, o0VarE);
                pu0.b bVar = (pu0.b) ((g3) p1VarC.getF182175a()).f35301b;
                String strA = bVar != null ? og.a.A(bVar) : null;
                if (strA == null) {
                    strA = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -267015210, R.string.title_live_track, o0VarE, false);
                } else {
                    o0VarE.C(-267016667);
                    o0VarE.g0(false);
                }
                o0Var = o0VarE;
                gl1.d.b(strA, aVar, z15, null, null, null, z3.f.c(1613960347, new ak0.h(p1VarC, l14, bool, dVar, aVar3, p1VarC2, 10), o0VarE), o0Var, ((i15 >> 12) & 112) | 1572864, 56);
            }
            p2VarI0.f135219d = pVar2;
        }
        str2 = str;
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            final String str3 = str2;
            pVar2 = new e23.p(dVar, str3, l14, bool, pVar, aVar, i14, i17) { // from class: iv0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f95081a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gv0.d f95082b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f95083c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Long f95084d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Boolean f95085e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.p f95086f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f95087g;

                {
                    this.f95081a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f95081a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            e.b(this.f95082b, this.f95083c, this.f95084d, this.f95085e, this.f95086f, this.f95087g, (p3.m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            e.b(this.f95082b, this.f95083c, this.f95084d, this.f95085e, this.f95086f, this.f95087g, (p3.m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x0205  */
    /* JADX WARN: Code duplicated, block: B:112:0x0214  */
    /* JADX WARN: Code duplicated, block: B:115:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x0234 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(final a0 a0Var, final String str, final ArrayList arrayList, boolean z14, e23.p pVar, e23.p pVar2, final e23.l lVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        boolean z15;
        int i17;
        e23.p pVar3;
        int i18;
        int i19;
        e23.p pVar4;
        int i24;
        boolean z16;
        e23.l lVar2;
        final boolean z17;
        final e23.p pVar5;
        final e23.p pVar6;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar7;
        final boolean z18;
        final e23.p pVar8;
        boolean z19;
        e23.p pVar9;
        e23.p pVar10;
        int i25;
        Iterator it;
        pu0.b bVar;
        boolean z24;
        boolean zR;
        Object objQ;
        int i26;
        o0 o0VarE = mVar.E(1199228612);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(arrayList) ? 256 : 128;
        }
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    pVar3 = pVar;
                    if (o0VarE.r(pVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((196608 & i14) == 0) {
                        pVar4 = pVar2;
                        if (o0VarE.r(pVar4)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i16 |= i24;
                    }
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(lVar)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                    if ((599187 & i16) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i16 & 1, z16)) {
                        if (i27 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        pVar8 = null;
                        if (i17 != 0) {
                            pVar8 = pVar3;
                        }
                        pVar8 = i19 == 0 ? pVar4 : null;
                        x1 x1Var = p3.n.f135158a;
                        if (arrayList.isEmpty()) {
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 != null) {
                                return;
                            }
                            final int i28 = 0;
                            pVar7 = new e23.p() { // from class: iv0.b
                                @Override // e23.p
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i28) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            z19 = z18;
                            pVar9 = pVar8;
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            h4.r.a aVar = h4.r.S;
                            h4.d.f81522a.getClass();
                            h4.r rVarB = a0Var.b(aVar, h4.d.a.f81536n);
                            d92.b.f58623a.getClass();
                            j92.b bVar2 = d92.b.f58625c;
                            bVar2.getClass();
                            j92.e eVar = j92.b.f97899b;
                            float f14 = eVar.f97920e;
                            float f15 = eVar.f97920e;
                            org.apache.commons.lang3.e.j(bVar2);
                            h4.r rVarB2 = c2.l.B(rVarB, f14, f15, f15, eVar.f97917b);
                            d92.b.f58624b.getClass();
                            pVar10 = pVar8;
                            i25 = i16;
                            mh.c(upperCase, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                            o0VarE = o0VarE;
                            o0VarE.C(1407485391);
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                o13.p pVar11 = (o13.p) it.next();
                                String str2 = (String) pVar11.f128594a;
                                bVar = (pu0.b) pVar11.f128595b;
                                l72.p2 p2Var = l72.p2.f111205a;
                                if ((i25 & 3670016) == 1048576) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                zR = z24 | o0VarE.r(bVar);
                                objQ = o0VarE.q();
                                if (zR) {
                                    objQ = new iv0.c(lVar, bVar, 0);
                                    o0VarE.K(objQ);
                                } else {
                                    p3.m.f135153a.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new iv0.c(lVar, bVar, 0);
                                        o0VarE.K(objQ);
                                    }
                                }
                                p2Var.g(str2, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                            }
                            lVar2 = lVar;
                            pVar5 = pVar9;
                            o0VarE.g0(false);
                            if (arrayList.isEmpty()) {
                                pVar6 = pVar10;
                                o0VarE.C(682677374);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(1407494732);
                                pVar6 = pVar10;
                                if (pVar6 == null) {
                                    o0VarE.C(682663733);
                                    o0VarE.g0(false);
                                } else {
                                    o0VarE.C(1407494732);
                                    e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                                }
                                o0VarE.g0(false);
                            }
                            x1 x1Var2 = p3.n.f135158a;
                            z17 = z19;
                        }
                        p2VarI0.f135219d = pVar7;
                    }
                    lVar2 = lVar;
                    o0VarE.e();
                    z17 = z15;
                    pVar5 = pVar3;
                    pVar6 = pVar4;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        final int i29 = 1;
                        final e23.l lVar3 = lVar2;
                        pVar7 = new e23.p() { // from class: iv0.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i29) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar3, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar3, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        p2VarI0.f135219d = pVar7;
                    }
                }
                i16 |= 196608;
                pVar4 = pVar2;
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(lVar)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    pVar8 = null;
                    if (i17 != 0) {
                        pVar8 = pVar3;
                    }
                    if (i19 == 0) {
                    }
                    x1 x1Var3 = p3.n.f135158a;
                    if (arrayList.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            return;
                        }
                        final int i210 = 0;
                        pVar7 = new e23.p() { // from class: iv0.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i210) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        z19 = z18;
                        pVar9 = pVar8;
                        String upperCase2 = str.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        h4.r.a aVar2 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarB3 = a0Var.b(aVar2, h4.d.a.f81536n);
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f16 = eVar2.f97920e;
                        float f17 = eVar2.f97920e;
                        org.apache.commons.lang3.e.j(bVar3);
                        h4.r rVarB4 = c2.l.B(rVarB3, f16, f17, f17, eVar2.f97917b);
                        d92.b.f58624b.getClass();
                        pVar10 = pVar8;
                        i25 = i16;
                        mh.c(upperCase2, rVarB4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.C(1407485391);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            o13.p pVar12 = (o13.p) it.next();
                            String str3 = (String) pVar12.f128594a;
                            bVar = (pu0.b) pVar12.f128595b;
                            l72.p2 p2Var2 = l72.p2.f111205a;
                            if ((i25 & 3670016) == 1048576) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zR = z24 | o0VarE.r(bVar);
                            objQ = o0VarE.q();
                            if (zR) {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new iv0.c(lVar, bVar, 0);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                            p2Var2.g(str3, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                        }
                        lVar2 = lVar;
                        pVar5 = pVar9;
                        o0VarE.g0(false);
                        if (arrayList.isEmpty()) {
                            o0VarE.C(1407494732);
                            pVar6 = pVar10;
                            if (pVar6 == null) {
                                o0VarE.C(682663733);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(1407494732);
                                e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                            }
                            o0VarE.g0(false);
                        } else {
                            pVar6 = pVar10;
                            o0VarE.C(682677374);
                            o0VarE.g0(false);
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        z17 = z19;
                    }
                    p2VarI0.f135219d = pVar7;
                }
                lVar2 = lVar;
                o0VarE.e();
                z17 = z15;
                pVar5 = pVar3;
                pVar6 = pVar4;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i211 = 1;
                    final e23.l lVar4 = lVar2;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i211) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar4, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar4, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2VarI0.f135219d = pVar7;
                }
            }
            i16 |= 24576;
            pVar3 = pVar;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    pVar4 = pVar2;
                    if (o0VarE.r(pVar4)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(lVar)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    pVar8 = null;
                    if (i17 != 0) {
                        pVar8 = pVar3;
                    }
                    if (i19 == 0) {
                    }
                    x1 x1Var5 = p3.n.f135158a;
                    if (arrayList.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            return;
                        }
                        final int i212 = 0;
                        pVar7 = new e23.p() { // from class: iv0.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i212) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        z19 = z18;
                        pVar9 = pVar8;
                        String upperCase3 = str.toUpperCase(Locale.ROOT);
                        upperCase3.getClass();
                        h4.r.a aVar3 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarB5 = a0Var.b(aVar3, h4.d.a.f81536n);
                        d92.b.f58623a.getClass();
                        j92.b bVar4 = d92.b.f58625c;
                        bVar4.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        float f18 = eVar3.f97920e;
                        float f19 = eVar3.f97920e;
                        org.apache.commons.lang3.e.j(bVar4);
                        h4.r rVarB6 = c2.l.B(rVarB5, f18, f19, f19, eVar3.f97917b);
                        d92.b.f58624b.getClass();
                        pVar10 = pVar8;
                        i25 = i16;
                        mh.c(upperCase3, rVarB6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.C(1407485391);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            o13.p pVar13 = (o13.p) it.next();
                            String str4 = (String) pVar13.f128594a;
                            bVar = (pu0.b) pVar13.f128595b;
                            l72.p2 p2Var3 = l72.p2.f111205a;
                            if ((i25 & 3670016) == 1048576) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zR = z24 | o0VarE.r(bVar);
                            objQ = o0VarE.q();
                            if (zR) {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new iv0.c(lVar, bVar, 0);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                            p2Var3.g(str4, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                        }
                        lVar2 = lVar;
                        pVar5 = pVar9;
                        o0VarE.g0(false);
                        if (arrayList.isEmpty()) {
                            o0VarE.C(1407494732);
                            pVar6 = pVar10;
                            if (pVar6 == null) {
                                o0VarE.C(682663733);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(1407494732);
                                e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                            }
                            o0VarE.g0(false);
                        } else {
                            pVar6 = pVar10;
                            o0VarE.C(682677374);
                            o0VarE.g0(false);
                        }
                        x1 x1Var6 = p3.n.f135158a;
                        z17 = z19;
                    }
                    p2VarI0.f135219d = pVar7;
                }
                lVar2 = lVar;
                o0VarE.e();
                z17 = z15;
                pVar5 = pVar3;
                pVar6 = pVar4;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i213 = 1;
                    final e23.l lVar5 = lVar2;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i213) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar5, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar5, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2VarI0.f135219d = pVar7;
                }
            }
            i16 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                pVar8 = null;
                if (i17 != 0) {
                    pVar8 = pVar3;
                }
                if (i19 == 0) {
                }
                x1 x1Var7 = p3.n.f135158a;
                if (arrayList.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i214 = 0;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i214) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    z19 = z18;
                    pVar9 = pVar8;
                    String upperCase4 = str.toUpperCase(Locale.ROOT);
                    upperCase4.getClass();
                    h4.r.a aVar4 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarB7 = a0Var.b(aVar4, h4.d.a.f81536n);
                    d92.b.f58623a.getClass();
                    j92.b bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f110 = eVar4.f97920e;
                    float f111 = eVar4.f97920e;
                    org.apache.commons.lang3.e.j(bVar5);
                    h4.r rVarB8 = c2.l.B(rVarB7, f110, f111, f111, eVar4.f97917b);
                    d92.b.f58624b.getClass();
                    pVar10 = pVar8;
                    i25 = i16;
                    mh.c(upperCase4, rVarB8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.C(1407485391);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        o13.p pVar14 = (o13.p) it.next();
                        String str5 = (String) pVar14.f128594a;
                        bVar = (pu0.b) pVar14.f128595b;
                        l72.p2 p2Var4 = l72.p2.f111205a;
                        if ((i25 & 3670016) == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zR = z24 | o0VarE.r(bVar);
                        objQ = o0VarE.q();
                        if (zR) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new iv0.c(lVar, bVar, 0);
                            o0VarE.K(objQ);
                        }
                        p2Var4.g(str5, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                    }
                    lVar2 = lVar;
                    pVar5 = pVar9;
                    o0VarE.g0(false);
                    if (arrayList.isEmpty()) {
                        o0VarE.C(1407494732);
                        pVar6 = pVar10;
                        if (pVar6 == null) {
                            o0VarE.C(682663733);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1407494732);
                            e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                        }
                        o0VarE.g0(false);
                    } else {
                        pVar6 = pVar10;
                        o0VarE.C(682677374);
                        o0VarE.g0(false);
                    }
                    x1 x1Var8 = p3.n.f135158a;
                    z17 = z19;
                }
                p2VarI0.f135219d = pVar7;
            }
            lVar2 = lVar;
            o0VarE.e();
            z17 = z15;
            pVar5 = pVar3;
            pVar6 = pVar4;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final int i215 = 1;
                final e23.l lVar6 = lVar2;
                pVar7 = new e23.p() { // from class: iv0.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i215) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar6, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar6, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar7;
            }
        }
        i16 |= 3072;
        z15 = z14;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                pVar3 = pVar;
                if (o0VarE.r(pVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    pVar4 = pVar2;
                    if (o0VarE.r(pVar4)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(lVar)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                if ((599187 & i16) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    if (i27 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    pVar8 = null;
                    if (i17 != 0) {
                        pVar8 = pVar3;
                    }
                    if (i19 == 0) {
                    }
                    x1 x1Var9 = p3.n.f135158a;
                    if (arrayList.isEmpty()) {
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            return;
                        }
                        final int i216 = 0;
                        pVar7 = new e23.p() { // from class: iv0.b
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i216) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        z19 = z18;
                        pVar9 = pVar8;
                        String upperCase5 = str.toUpperCase(Locale.ROOT);
                        upperCase5.getClass();
                        h4.r.a aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarB9 = a0Var.b(aVar5, h4.d.a.f81536n);
                        d92.b.f58623a.getClass();
                        j92.b bVar6 = d92.b.f58625c;
                        bVar6.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        float f112 = eVar5.f97920e;
                        float f113 = eVar5.f97920e;
                        org.apache.commons.lang3.e.j(bVar6);
                        h4.r rVarB10 = c2.l.B(rVarB9, f112, f113, f113, eVar5.f97917b);
                        d92.b.f58624b.getClass();
                        pVar10 = pVar8;
                        i25 = i16;
                        mh.c(upperCase5, rVarB10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                        o0VarE = o0VarE;
                        o0VarE.C(1407485391);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            o13.p pVar15 = (o13.p) it.next();
                            String str6 = (String) pVar15.f128594a;
                            bVar = (pu0.b) pVar15.f128595b;
                            l72.p2 p2Var5 = l72.p2.f111205a;
                            if ((i25 & 3670016) == 1048576) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            zR = z24 | o0VarE.r(bVar);
                            objQ = o0VarE.q();
                            if (zR) {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new iv0.c(lVar, bVar, 0);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                            p2Var5.g(str6, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                        }
                        lVar2 = lVar;
                        pVar5 = pVar9;
                        o0VarE.g0(false);
                        if (arrayList.isEmpty()) {
                            o0VarE.C(1407494732);
                            pVar6 = pVar10;
                            if (pVar6 == null) {
                                o0VarE.C(682663733);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(1407494732);
                                e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                            }
                            o0VarE.g0(false);
                        } else {
                            pVar6 = pVar10;
                            o0VarE.C(682677374);
                            o0VarE.g0(false);
                        }
                        x1 x1Var10 = p3.n.f135158a;
                        z17 = z19;
                    }
                    p2VarI0.f135219d = pVar7;
                }
                lVar2 = lVar;
                o0VarE.e();
                z17 = z15;
                pVar5 = pVar3;
                pVar6 = pVar4;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    final int i217 = 1;
                    final e23.l lVar7 = lVar2;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i217) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar7, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar7, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    p2VarI0.f135219d = pVar7;
                }
            }
            i16 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                pVar8 = null;
                if (i17 != 0) {
                    pVar8 = pVar3;
                }
                if (i19 == 0) {
                }
                x1 x1Var11 = p3.n.f135158a;
                if (arrayList.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i218 = 0;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i218) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    z19 = z18;
                    pVar9 = pVar8;
                    String upperCase6 = str.toUpperCase(Locale.ROOT);
                    upperCase6.getClass();
                    h4.r.a aVar6 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarB11 = a0Var.b(aVar6, h4.d.a.f81536n);
                    d92.b.f58623a.getClass();
                    j92.b bVar7 = d92.b.f58625c;
                    bVar7.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f114 = eVar6.f97920e;
                    float f115 = eVar6.f97920e;
                    org.apache.commons.lang3.e.j(bVar7);
                    h4.r rVarB12 = c2.l.B(rVarB11, f114, f115, f115, eVar6.f97917b);
                    d92.b.f58624b.getClass();
                    pVar10 = pVar8;
                    i25 = i16;
                    mh.c(upperCase6, rVarB12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.C(1407485391);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        o13.p pVar16 = (o13.p) it.next();
                        String str7 = (String) pVar16.f128594a;
                        bVar = (pu0.b) pVar16.f128595b;
                        l72.p2 p2Var6 = l72.p2.f111205a;
                        if ((i25 & 3670016) == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zR = z24 | o0VarE.r(bVar);
                        objQ = o0VarE.q();
                        if (zR) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new iv0.c(lVar, bVar, 0);
                            o0VarE.K(objQ);
                        }
                        p2Var6.g(str7, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                    }
                    lVar2 = lVar;
                    pVar5 = pVar9;
                    o0VarE.g0(false);
                    if (arrayList.isEmpty()) {
                        o0VarE.C(1407494732);
                        pVar6 = pVar10;
                        if (pVar6 == null) {
                            o0VarE.C(682663733);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1407494732);
                            e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                        }
                        o0VarE.g0(false);
                    } else {
                        pVar6 = pVar10;
                        o0VarE.C(682677374);
                        o0VarE.g0(false);
                    }
                    x1 x1Var12 = p3.n.f135158a;
                    z17 = z19;
                }
                p2VarI0.f135219d = pVar7;
            }
            lVar2 = lVar;
            o0VarE.e();
            z17 = z15;
            pVar5 = pVar3;
            pVar6 = pVar4;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final int i219 = 1;
                final e23.l lVar8 = lVar2;
                pVar7 = new e23.p() { // from class: iv0.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i219) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar8, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar8, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar7;
            }
        }
        i16 |= 24576;
        pVar3 = pVar;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((196608 & i14) == 0) {
                pVar4 = pVar2;
                if (o0VarE.r(pVar4)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(lVar)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i27 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                pVar8 = null;
                if (i17 != 0) {
                    pVar8 = pVar3;
                }
                if (i19 == 0) {
                }
                x1 x1Var13 = p3.n.f135158a;
                if (arrayList.isEmpty()) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i2110 = 0;
                    pVar7 = new e23.p() { // from class: iv0.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i2110) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    z19 = z18;
                    pVar9 = pVar8;
                    String upperCase7 = str.toUpperCase(Locale.ROOT);
                    upperCase7.getClass();
                    h4.r.a aVar7 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarB13 = a0Var.b(aVar7, h4.d.a.f81536n);
                    d92.b.f58623a.getClass();
                    j92.b bVar8 = d92.b.f58625c;
                    bVar8.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    float f116 = eVar7.f97920e;
                    float f117 = eVar7.f97920e;
                    org.apache.commons.lang3.e.j(bVar8);
                    h4.r rVarB14 = c2.l.B(rVarB13, f116, f117, f117, eVar7.f97917b);
                    d92.b.f58624b.getClass();
                    pVar10 = pVar8;
                    i25 = i16;
                    mh.c(upperCase7, rVarB14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.C(1407485391);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        o13.p pVar17 = (o13.p) it.next();
                        String str8 = (String) pVar17.f128594a;
                        bVar = (pu0.b) pVar17.f128595b;
                        l72.p2 p2Var7 = l72.p2.f111205a;
                        if ((i25 & 3670016) == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zR = z24 | o0VarE.r(bVar);
                        objQ = o0VarE.q();
                        if (zR) {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new iv0.c(lVar, bVar, 0);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new iv0.c(lVar, bVar, 0);
                            o0VarE.K(objQ);
                        }
                        p2Var7.g(str8, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                    }
                    lVar2 = lVar;
                    pVar5 = pVar9;
                    o0VarE.g0(false);
                    if (arrayList.isEmpty()) {
                        o0VarE.C(1407494732);
                        pVar6 = pVar10;
                        if (pVar6 == null) {
                            o0VarE.C(682663733);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1407494732);
                            e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                        }
                        o0VarE.g0(false);
                    } else {
                        pVar6 = pVar10;
                        o0VarE.C(682677374);
                        o0VarE.g0(false);
                    }
                    x1 x1Var14 = p3.n.f135158a;
                    z17 = z19;
                }
                p2VarI0.f135219d = pVar7;
            }
            lVar2 = lVar;
            o0VarE.e();
            z17 = z15;
            pVar5 = pVar3;
            pVar6 = pVar4;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final int i2111 = 1;
                final e23.l lVar9 = lVar2;
                pVar7 = new e23.p() { // from class: iv0.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2111) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar9, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar9, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar7;
            }
        }
        i16 |= 196608;
        pVar4 = pVar2;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(lVar)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i27 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            pVar8 = null;
            if (i17 != 0) {
                pVar8 = pVar3;
            }
            if (i19 == 0) {
            }
            x1 x1Var15 = p3.n.f135158a;
            if (arrayList.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    return;
                }
                final int i2112 = 0;
                pVar7 = new e23.p() { // from class: iv0.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i2112) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.c(a0Var, str, arrayList, z18, pVar8, pVar8, lVar, (p3.m) obj, p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                z19 = z18;
                pVar9 = pVar8;
                String upperCase8 = str.toUpperCase(Locale.ROOT);
                upperCase8.getClass();
                h4.r.a aVar8 = h4.r.S;
                h4.d.f81522a.getClass();
                h4.r rVarB15 = a0Var.b(aVar8, h4.d.a.f81536n);
                d92.b.f58623a.getClass();
                j92.b bVar9 = d92.b.f58625c;
                bVar9.getClass();
                j92.e eVar8 = j92.b.f97899b;
                float f118 = eVar8.f97920e;
                float f119 = eVar8.f97920e;
                org.apache.commons.lang3.e.j(bVar9);
                h4.r rVarB16 = c2.l.B(rVarB15, f118, f119, f119, eVar8.f97917b);
                d92.b.f58624b.getClass();
                pVar10 = pVar8;
                i25 = i16;
                mh.c(upperCase8, rVarB16, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.C(1407485391);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    o13.p pVar18 = (o13.p) it.next();
                    String str9 = (String) pVar18.f128594a;
                    bVar = (pu0.b) pVar18.f128595b;
                    l72.p2 p2Var8 = l72.p2.f111205a;
                    if ((i25 & 3670016) == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zR = z24 | o0VarE.r(bVar);
                    objQ = o0VarE.q();
                    if (zR) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new iv0.c(lVar, bVar, 0);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new iv0.c(lVar, bVar, 0);
                        o0VarE.K(objQ);
                    }
                    p2Var8.g(str9, null, null, pVar9, null, z19, false, (e23.a) objQ, o0VarE, ((i25 >> 3) & 7168) | (458752 & (i25 << 6)), 214);
                }
                lVar2 = lVar;
                pVar5 = pVar9;
                o0VarE.g0(false);
                if (arrayList.isEmpty()) {
                    o0VarE.C(1407494732);
                    pVar6 = pVar10;
                    if (pVar6 == null) {
                        o0VarE.C(682663733);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1407494732);
                        e5.q((i25 >> 15) & 14, pVar6, o0VarE, false);
                    }
                    o0VarE.g0(false);
                } else {
                    pVar6 = pVar10;
                    o0VarE.C(682677374);
                    o0VarE.g0(false);
                }
                x1 x1Var16 = p3.n.f135158a;
                z17 = z19;
            }
            p2VarI0.f135219d = pVar7;
        }
        lVar2 = lVar;
        o0VarE.e();
        z17 = z15;
        pVar5 = pVar3;
        pVar6 = pVar4;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i2113 = 1;
            final e23.l lVar10 = lVar2;
            pVar7 = new e23.p() { // from class: iv0.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i2113) {
                        case 0:
                            ((Integer) obj2).getClass();
                            e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar10, (p3.m) obj, p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            e.c(a0Var, str, arrayList, z17, pVar5, pVar6, lVar10, (p3.m) obj, p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar7;
        }
    }
}
