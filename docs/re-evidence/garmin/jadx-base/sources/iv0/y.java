package iv0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import c2.z;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import gv0.m0;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import i3.v2;
import java.util.List;
import l72.c1;
import l72.p2;
import o53.b0;
import org.koin.compose.InjectKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f95198a;

        public a(x3 x3Var) {
            this.f95198a = x3Var;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            ParametersHolder parametersHolder;
            e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f95198a);
            return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.a implements e23.l<pu0.b, Unit> {
        public b(Object obj) {
            super(1, obj, gv0.d.class, "removeRecipient", "removeRecipient(Lcom/garmin/android/apps/connectmobile/livetrackui/data/model/contact/Contact;Z)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(pu0.b bVar) {
            pu0.b bVar2 = bVar;
            bVar2.getClass();
            gv0.d.V4((gv0.d) this.receiver, bVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.recipients.RecipientsSectionKt$RecipientsSectionScreen$1$8$1$1$1", f = "RecipientsSection.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gv0.d f95200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f95201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f95202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c.q<Intent, f.a> f95203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uu0.c f95204f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(gv0.d dVar, String str, Activity activity, c.q<Intent, f.a> qVar, uu0.c cVar, t13.d<? super c> dVar2) {
            super(2, dVar2);
            this.f95200b = dVar;
            this.f95201c = str;
            this.f95202d = activity;
            this.f95203e = qVar;
            this.f95204f = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f95200b, this.f95201c, this.f95202d, this.f95203e, this.f95204f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Activity activity;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95199a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f95199a = 1;
                obj = this.f95200b.E4(this.f95201c, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            pu0.b bVar = (pu0.b) obj;
            if (bVar != null && (activity = this.f95202d) != null) {
                this.f95203e.a(this.f95204f.b(activity, bVar), null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95205a;

        static {
            int[] iArr = new int[qu0.f.values().length];
            try {
                iArr[qu0.f.SubscribeToGcPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qu0.f.LaunchInReachPromo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95205a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0531  */
    /* JADX WARN: Code duplicated, block: B:233:0x0533  */
    /* JADX WARN: Code duplicated, block: B:236:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0541  */
    /* JADX WARN: Code duplicated, block: B:242:0x0559  */
    /* JADX WARN: Code duplicated, block: B:243:0x055b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0560  */
    /* JADX WARN: Code duplicated, block: B:247:0x0562  */
    /* JADX WARN: Code duplicated, block: B:250:0x056a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x0572  */
    public static final void a(boolean z14, g3 g3Var, hl.a aVar, h hVar, e23.a aVar2, e23.a aVar3, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.a aVar4, e23.a aVar5, e23.a aVar6, e23.l lVar5, e23.a aVar7, e23.a aVar8, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        o0 o0Var;
        e23.a aVar9;
        e23.a aVar10;
        e23.a aVar11;
        e23.a aVar12;
        e23.a aVar13;
        int i24;
        boolean z15;
        int i25;
        p1 p1Var;
        Context context;
        int i26;
        boolean z16;
        e23.l lVar6;
        e23.a aVar14;
        e23.a aVar15;
        char c14;
        boolean z17;
        hl.a aVar16;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objQ;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ2;
        boolean z28;
        g3Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar5.getClass();
        o0 o0VarE = mVar.E(1017601182);
        if ((i14 & 6) == 0) {
            i16 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(g3Var) : o0VarE.r(g3Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(hVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        int i27 = i14 & 196608;
        char c15 = Ascii.MIN;
        if (i27 == 0) {
            i16 |= o0VarE.r(aVar3) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(lVar3) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        int i28 = i16;
        int i29 = i15 & 4096;
        if (i29 != 0) {
            i17 = 438;
        } else {
            i17 = '6' | (o0VarE.r(aVar6) ? (char) 256 : (char) 128);
        }
        int i30 = i17 | (o0VarE.r(lVar5) ? (char) 2048 : (char) 1024);
        int i34 = i15 & 16384;
        if (i34 != 0) {
            i18 = i30 | 24576;
        } else {
            i18 = i30 | (o0VarE.r(aVar7) ? (char) 16384 : (char) 8192);
        }
        int i35 = i15 & 32768;
        if (i35 != 0) {
            i19 = i18 | 196608;
        } else {
            if (o0VarE.r(aVar8)) {
                c15 = Ascii.MIN;
            }
            i19 = i18 | c15;
        }
        int i36 = i19;
        if (o0VarE.n(i28 & 1, ((i28 & 306783379) == 306783378 && (74899 & i36) == 74898) ? false : true)) {
            p3.m.a aVar17 = p3.m.f135153a;
            if (i29 != 0) {
                Object objQ3 = o0VarE.q();
                aVar17.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ik2.b(11);
                    o0VarE.K(objQ3);
                }
                aVar9 = (e23.a) objQ3;
            } else {
                aVar9 = aVar6;
            }
            if (i34 != 0) {
                Object objQ4 = o0VarE.q();
                aVar17.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ik2.b(12);
                    o0VarE.K(objQ4);
                }
                aVar12 = (e23.a) objQ4;
            } else {
                aVar12 = aVar7;
            }
            if (i35 != 0) {
                Object objQ5 = o0VarE.q();
                aVar17.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new ik2.b(13);
                    o0VarE.K(objQ5);
                }
                aVar13 = (e23.a) objQ5;
            } else {
                aVar13 = aVar8;
            }
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ6 = o0VarE.q();
            aVar17.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ6 == c2565a) {
                objQ6 = Boolean.valueOf(s3.b());
                o0VarE.K(objQ6);
            }
            boolean zBooleanValue = ((Boolean) objQ6).booleanValue();
            e23.a aVar18 = aVar13;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ7);
            }
            b0 b0Var = (b0) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(lv0.a.c.f115044a);
                o0VarE.K(objQ8);
            }
            p1 p1Var2 = (p1) objQ8;
            boolean zR = o0VarE.r(hVar) | o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ9 = o0VarE.q();
            if (zR || objQ9 == c2565a) {
                objQ9 = new w(hVar, b0Var, mcVarF, null);
                o0VarE.K(objQ9);
            }
            l0.e((e23.p) objQ9, hVar, o0VarE);
            fw.p pVar = g3Var.f35300a;
            Integer num = g3Var.f35304e;
            boolean zR2 = ((i28 & 112) == 32 || ((i28 & 64) != 0 && o0VarE.r(g3Var))) | ((i36 & 896) == 256) | o0VarE.r(context2);
            Object objQ10 = o0VarE.q();
            if (zR2 || objQ10 == c2565a) {
                i24 = 131072;
                o0Var = o0VarE;
                z15 = zBooleanValue;
                i25 = i36;
                objQ10 = new x(g3Var, aVar4, aVar5, context2, z15, aVar9, p1Var2, null);
                p1Var = p1Var2;
                context = context2;
                o0Var.K(objQ10);
            } else {
                i24 = 131072;
                context = context2;
                p1Var = p1Var2;
                o0Var = o0VarE;
                z15 = zBooleanValue;
                i25 = i36;
            }
            l0.f(pVar, num, (e23.p) objQ10, o0Var);
            lv0.a aVar19 = (lv0.a) p1Var.getF182175a();
            if (aVar19 instanceof lv0.a.c) {
                o0Var.C(1479937314);
                i26 = 0;
                o0Var.g0(false);
            } else if (aVar19 instanceof lv0.a.b) {
                o0Var.C(1479979381);
                c1 c1Var = c1.f110940a;
                lv0.a.b bVar = (lv0.a.b) aVar19;
                String str = bVar.f115042a;
                String str2 = bVar.f115043b;
                String strQ = gl1.y.Q(o0Var, R.string.lbl_ok);
                Object objQ11 = o0Var.q();
                if (objQ11 == c2565a) {
                    objQ11 = new i11.i(p1Var, 20);
                    o0Var.K(objQ11);
                }
                c1Var.a(false, str, str2, null, null, strQ, false, false, (e23.a) objQ11, null, null, o0Var, 100663296, 0, 1753);
                i26 = 0;
                o0Var.g0(false);
            } else {
                if (!(aVar19 instanceof lv0.a.C2188a)) {
                    throw kg.f.h(o0Var, -1337734567, false);
                }
                o0Var.C(1480309314);
                c1 c1Var2 = c1.f110940a;
                lv0.a.C2188a c2188a = (lv0.a.C2188a) aVar19;
                String str3 = c2188a.f115038a;
                String str4 = c2188a.f115039b;
                String str5 = c2188a.f115040c;
                String strQ2 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                boolean zR3 = o0Var.r(aVar19);
                Object objQ12 = o0Var.q();
                if (zR3 || objQ12 == c2565a) {
                    objQ12 = new v(c2188a, p1Var, 0);
                    o0Var.K(objQ12);
                }
                e23.a<Unit> aVar20 = (e23.a) objQ12;
                Object objQ13 = o0Var.q();
                if (objQ13 == c2565a) {
                    objQ13 = new i11.i(p1Var, 21);
                    o0Var.K(objQ13);
                }
                c1Var2.a(false, str3, str4, null, null, str5, false, false, aVar20, strQ2, (e23.a) objQ13, o0Var, 0, 6, 217);
                i26 = 0;
                o0Var.g0(false);
            }
            h4.r.a aVar21 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var, i26);
            int iHashCode = Long.hashCode(o0Var.U);
            i2 i2VarA0 = o0Var.a0();
            h4.r rVarC = h4.k.c(aVar21, o0Var);
            h5.g.V.getClass();
            e0.a aVar22 = h5.g.a.f81805b;
            if (o0Var.f135177b == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar22);
            } else {
                o0Var.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0Var);
            b4.c(h5.g.a.f81809f, i2VarA0, o0Var);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0Var, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0Var);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (z15) {
                o0Var.C(-1050601846);
                f12.l.f68084a.getClass();
                com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                String str6 = gVarW0 != null ? gVarW0.f46858b : null;
                if (str6 == null) {
                    str6 = "";
                }
                String strP = gl1.y.P(R.string.msg_live_track_managed_by_admin, new Object[]{str6}, o0Var);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                h4.r rVarF = x2.f(aVar21, 1.0f);
                d92.b.f58625c.getClass();
                mh.c(strP, c2.l.y(rVarF, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
                z16 = false;
                o0Var.g0(false);
            } else {
                o0Var.C(-1050175224);
                p2 p2Var = p2.f111205a;
                String strQ3 = gl1.y.Q(o0Var, R.string.live_track_add_recipients);
                g.f95099a.getClass();
                z3.e eVar = g.f95100b;
                boolean z29 = (r18 & 458752) == i24;
                Object objQ14 = o0Var.q();
                if (z29 || objQ14 == c2565a) {
                    objQ14 = new ii0.h(aVar3, 22);
                    o0Var.K(objQ14);
                }
                p2Var.g(strQ3, null, null, null, eVar, false, false, (e23.a) objQ14, o0Var, 24576, 238);
                z16 = false;
                o0Var.g0(false);
            }
            List list = (List) g3Var.f35301b;
            if (list == null) {
                o0Var.C(-1049550761);
                o0Var.g0(z16);
                lVar6 = lVar;
                aVar14 = aVar12;
                z17 = z16;
                c14 = 16384;
                aVar15 = aVar18;
            } else {
                o0Var.C(-1049550760);
                if (list.isEmpty()) {
                    lVar6 = lVar;
                    aVar14 = aVar12;
                    aVar15 = aVar18;
                    c14 = 16384;
                    z17 = false;
                    o0Var.C(1283368255);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1281445294);
                    boolean zR4 = o0Var.r(context);
                    if ((r18 & 896) != 256) {
                        if ((r18 & 512) != 0) {
                            aVar16 = aVar;
                            if (o0Var.r(aVar16)) {
                            }
                            boolean z34 = zR4 | z18;
                            if ((r18 & 3670016) == 1048576) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z24 = z34 | z19;
                            objQ = o0Var.q();
                            if (!z24 || objQ == c2565a) {
                                ev2.f fVar = new ev2.f(context, aVar16, p1Var, lVar, 15);
                                lVar6 = lVar;
                                o0Var.K(fVar);
                                objQ = fVar;
                            } else {
                                lVar6 = lVar;
                            }
                            e23.l lVar7 = (e23.l) objQ;
                            c14 = 16384;
                            if ((i25 & 57344) == 16384) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((i25 & 458752) == i24) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z25 | z26;
                            objQ2 = o0Var.q();
                            if (!z27 || objQ2 == c2565a) {
                                aVar14 = aVar12;
                                aVar15 = aVar18;
                                objQ2 = new d52.m(aVar14, aVar15, 1);
                                o0Var.K(objQ2);
                            } else {
                                aVar14 = aVar12;
                                aVar15 = aVar18;
                            }
                            t.c(list, z14, lVar7, (e23.l) objQ2, o0Var, (r18 << 3) & 112);
                            z17 = false;
                            o0Var.g0(false);
                        } else {
                            aVar16 = aVar;
                        }
                        z18 = false;
                        boolean z35 = zR4 | z18;
                        if ((r18 & 3670016) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = z35 | z19;
                        objQ = o0Var.q();
                        if (z24) {
                            ev2.f fVar2 = new ev2.f(context, aVar16, p1Var, lVar, 15);
                            lVar6 = lVar;
                            o0Var.K(fVar2);
                            objQ = fVar2;
                        } else {
                            ev2.f fVar3 = new ev2.f(context, aVar16, p1Var, lVar, 15);
                            lVar6 = lVar;
                            o0Var.K(fVar3);
                            objQ = fVar3;
                        }
                        e23.l lVar8 = (e23.l) objQ;
                        c14 = 16384;
                        if ((i25 & 57344) == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i25 & 458752) == i24) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z25 | z26;
                        objQ2 = o0Var.q();
                        if (z27) {
                            aVar14 = aVar12;
                            aVar15 = aVar18;
                            objQ2 = new d52.m(aVar14, aVar15, 1);
                            o0Var.K(objQ2);
                        } else {
                            aVar14 = aVar12;
                            aVar15 = aVar18;
                            objQ2 = new d52.m(aVar14, aVar15, 1);
                            o0Var.K(objQ2);
                        }
                        t.c(list, z14, lVar8, (e23.l) objQ2, o0Var, (r18 << 3) & 112);
                        z17 = false;
                        o0Var.g0(false);
                    } else {
                        aVar16 = aVar;
                    }
                    z18 = true;
                    boolean z36 = zR4 | z18;
                    if ((r18 & 3670016) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z36 | z19;
                    objQ = o0Var.q();
                    if (z24) {
                        ev2.f fVar4 = new ev2.f(context, aVar16, p1Var, lVar, 15);
                        lVar6 = lVar;
                        o0Var.K(fVar4);
                        objQ = fVar4;
                    } else {
                        ev2.f fVar5 = new ev2.f(context, aVar16, p1Var, lVar, 15);
                        lVar6 = lVar;
                        o0Var.K(fVar5);
                        objQ = fVar5;
                    }
                    e23.l lVar9 = (e23.l) objQ;
                    c14 = 16384;
                    if ((i25 & 57344) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i25 & 458752) == i24) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objQ2 = o0Var.q();
                    if (z27) {
                        aVar14 = aVar12;
                        aVar15 = aVar18;
                        objQ2 = new d52.m(aVar14, aVar15, 1);
                        o0Var.K(objQ2);
                    } else {
                        aVar14 = aVar12;
                        aVar15 = aVar18;
                        objQ2 = new d52.m(aVar14, aVar15, 1);
                        o0Var.K(objQ2);
                    }
                    t.c(list, z14, lVar9, (e23.l) objQ2, o0Var, (r18 << 3) & 112);
                    z17 = false;
                    o0Var.g0(false);
                }
                Unit unit = Unit.INSTANCE;
                o0Var.g0(z17);
            }
            o0Var.g0(true);
            if (r16.e()) {
                o0Var.C(-1337603146);
                if (hVar == null) {
                    o0Var.C(1483975435);
                    o0Var.g0(z17);
                    aVar15 = aVar15;
                    z28 = z17;
                } else {
                    o0Var.C(1483975436);
                    pu0.b bVar3 = hVar.f95101a;
                    qu0.c cVarF = og.a.F(bVar3);
                    qu0.b bVar4 = cVarF != null ? cVarF.f147881b : null;
                    boolean z37 = hVar.f95102b;
                    boolean zBooleanValue2 = ((Boolean) lVar2.invoke(bVar3)).booleanValue();
                    boolean z38 = bVar4 == qu0.b.f147875g;
                    boolean z39 = (r18 & 57344) == c14;
                    Object objQ15 = o0Var.q();
                    if (z39 || objQ15 == c2565a) {
                        objQ15 = new ii0.h(aVar2, 23);
                        o0Var.K(objQ15);
                    }
                    e23.a aVar23 = (e23.a) objQ15;
                    boolean zR5 = o0Var.r(bVar3) | ((i25 & 7168) == 2048);
                    Object objQ16 = o0Var.q();
                    if (zR5 || objQ16 == c2565a) {
                        objQ16 = new iv0.c(lVar5, bVar3, 3);
                        o0Var.K(objQ16);
                    }
                    e23.a aVar24 = (e23.a) objQ16;
                    boolean zR6 = o0Var.r(bVar3) | ((r18 & 3670016) == 1048576);
                    Object objQ17 = o0Var.q();
                    if (zR6 || objQ17 == c2565a) {
                        objQ17 = new iv0.c(lVar6, bVar3, 4);
                        o0Var.K(objQ17);
                    }
                    e23.a aVar25 = (e23.a) objQ17;
                    boolean zR7 = ((1879048192 & r18) == 536870912) | o0Var.r(bVar3);
                    Object objQ18 = o0Var.q();
                    if (zR7 || objQ18 == c2565a) {
                        objQ18 = new iv0.c(lVar4, bVar3, 5);
                        o0Var.K(objQ18);
                    }
                    e23.a aVar26 = (e23.a) objQ18;
                    boolean zR8 = ((234881024 & r18) == 67108864) | o0Var.r(bVar3);
                    Object objQ19 = o0Var.q();
                    if (zR8 || objQ19 == c2565a) {
                        objQ19 = new iv0.c(lVar3, bVar3, 6);
                        o0Var.K(objQ19);
                    }
                    e23.a aVar27 = (e23.a) objQ19;
                    Object objQ20 = o0Var.q();
                    if (objQ20 == c2565a) {
                        objQ20 = new v2(p1Var, 9);
                        o0Var.K(objQ20);
                    }
                    hl.a.Companion companion = hl.a.INSTANCE;
                    z28 = false;
                    r.a(mcVarF, b0Var, bVar3, z37, zBooleanValue2, z38, aVar, aVar23, aVar24, aVar25, aVar26, aVar27, (e23.l) objQ20, o0Var, (i28 << 12) & 3670016);
                    Unit unit2 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z28);
            } else {
                aVar15 = aVar15;
                aVar14 = aVar14;
                o0Var.C(1484988516);
                o0Var.g0(z17);
            }
            aVar10 = aVar14;
            aVar11 = aVar15;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar9 = aVar6;
            aVar10 = aVar7;
            aVar11 = aVar8;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(z14, g3Var, aVar, hVar, aVar2, aVar3, lVar, lVar2, lVar3, lVar4, aVar4, aVar5, aVar9, lVar5, aVar10, aVar11, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(gv0.d dVar, e23.a<Unit> aVar, e23.l<? super pu0.b, Unit> lVar, e23.p<? super String, ? super Boolean, Unit> pVar, e23.l<? super String, Unit> lVar2, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        aVar.getClass();
        lVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1967468650);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            hl.a aVar3 = dVar.f79188f;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            o0VarE.L(414512006);
            Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
            p1 p1VarQ = p0.q(null, o0VarE);
            o0VarE.L(855641119);
            boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                o0VarE.K(objQ3);
            }
            o0VarE.g0(false);
            o0VarE.g0(false);
            uu0.c cVar = (uu0.c) objQ3;
            g.h hVar = new g.h();
            boolean z14 = (i15 & 57344) == 16384;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new fb0.d(lVar2, 25);
                o0VarE.K(objQ4);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ4, o0VarE, 0);
            g.h hVar2 = new g.h();
            boolean zR = o0VarE.r(dVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new bv0.n(dVar, 10);
                o0VarE.K(objQ5);
            }
            c.q qVarC2 = c.w.c(hVar2, (e23.l) objQ5, o0VarE, 0);
            g.h hVar3 = new g.h();
            boolean zR2 = o0VarE.r(dVar);
            Object objQ6 = o0VarE.q();
            if (zR2 || objQ6 == c2565a) {
                objQ6 = new bv0.n(dVar, 11);
                o0VarE.K(objQ6);
            }
            c.q qVarC3 = c.w.c(hVar3, (e23.l) objQ6, o0VarE, 0);
            m0.a(dVar, pVar, o0VarE, (i15 & 14) | ((i15 >> 6) & 112));
            o0Var = o0VarE;
            gl1.d.b(gl1.y.Q(o0VarE, R.string.lbl_recipients), aVar2, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, z3.f.c(-844476764, new fo.i(dVar, aVar3, activity, qVarC, cVar, lVar, aVar, b0Var, qVarC2, qVarC3, p1Var), o0VarE), o0Var, ((i15 >> 12) & 112) | 1572864, 56);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.j(dVar, (e23.a) aVar, (e23.l) lVar, (e23.p) pVar, (e23.l) lVar2, (e23.a) aVar2, i14);
        }
    }
}
