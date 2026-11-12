package sd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b82.u0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideConsentActivity;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.promotion.GroupRideAwardsWhatsNewActivity;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import cq.u;
import cq.z;
import e23.l;
import e23.p;
import i3.e9;
import i3.k8;
import i3.mc;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import ps.q;
import ps.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import yo1.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsd0/c;", "Lvo1/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vo1.b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.di.socialgroupride.SocialGroupRideDelegateImpl$ShowClimbListModal$1$1$1", f = "SocialGroupRideDelegateImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f158614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f158615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f158616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, e23.a<Unit> aVar, d<? super a> dVar) {
            super(2, dVar);
            this.f158615b = mcVar;
            this.f158616c = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f158615b, this.f158616c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158614a;
            if (i14 == 0) {
                r.b(obj);
                this.f158614a = 1;
                if (this.f158615b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f158616c.invoke();
            return Unit.INSTANCE;
        }
    }

    @Override // vo1.b
    public final void a(List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, f fVar, boolean z14, boolean z15, e23.a<Unit> aVar, m mVar, int i14) {
        List<x1> list2;
        int i15;
        ActivityDetailChartDTO activityDetailChartDTO2;
        boolean z16;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1369481914);
        if ((i14 & 6) == 0) {
            list2 = list;
            i15 = (o0VarE.r(list2) ? 4 : 2) | i14;
        } else {
            list2 = list;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            activityDetailChartDTO2 = activityDetailChartDTO;
            i15 |= o0VarE.r(activityDetailChartDTO2) ? 32 : 16;
        } else {
            activityDetailChartDTO2 = activityDetailChartDTO;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 16384 : 8192;
        } else {
            z16 = z15;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new k8(b0Var, mcVarF, aVar, 1);
                o0VarE.K(objQ2);
            }
            u.e(list2, activityDetailChartDTO2, fVar, mcVarF, z14, null, z16, (l) objQ2, o0VarE, (i15 & 14) | 196608 | (i15 & 112) | (f.f198451e << 6) | (i15 & 896) | ((i15 << 3) & 57344) | ((i15 << 6) & 3670016));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(this, list, activityDetailChartDTO, fVar, z14, z15, aVar, i14);
        }
    }

    @Override // vo1.b
    public final Intent b(Activity activity, String str, String str2) {
        str.getClass();
        UserProfileActivity.f46494x.getClass();
        return UserProfileActivity.a.b(activity, str, str2, null);
    }

    @Override // vo1.b
    public final void c() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_GROUP_RIDE);
    }

    @Override // vo1.b
    public final void d(Activity activity, long j8) {
        LivetrackGroupRideConsentActivity.f38667k.getClass();
        activity.startActivity(LivetrackGroupRideConsentActivity.a.a(activity, j8, true));
    }

    @Override // vo1.b
    public final void e(final x1 x1Var, final List list, final String str, final boolean z14, final ActivityDetailChartDTO activityDetailChartDTO, final f fVar, final boolean z15, final boolean z16, final boolean z17, final l lVar, final e23.a aVar, m mVar, final int i14) {
        int i15;
        String str2;
        boolean z18;
        boolean z19;
        boolean z24;
        l lVar2;
        x1Var.getClass();
        list.getClass();
        str.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1330289531);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(activityDetailChartDTO) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            z18 = z15;
            i15 |= o0VarE.h(z18) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z18 = z15;
        }
        if ((i14 & 12582912) == 0) {
            z19 = z16;
            i15 |= o0VarE.h(z19) ? 8388608 : 4194304;
        } else {
            z19 = z16;
        }
        if ((100663296 & i14) == 0) {
            z24 = z17;
            i15 |= o0VarE.h(z24) ? 67108864 : 33554432;
        } else {
            z24 = z17;
        }
        if ((805306368 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 536870912 : 268435456;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            p3.x1 x1Var2 = n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            int i16 = i15;
            ArrayList arrayListA = z.a(list, x1Var);
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new eu.b(aVar, b0Var, mcVarF);
                o0VarE.K(objQ2);
            }
            int i17 = i16 >> 9;
            String str3 = str2;
            boolean z25 = z18;
            boolean z26 = z19;
            u.a(str3, activityDetailChartDTO, arrayListA, x1Var, fVar, mcVarF, z25, null, z26, lVar2, z14, z24, (e23.a) objQ2, o0VarE, ((i16 << 9) & 7168) | ((i16 >> 6) & 14) | 12582912 | (i17 & 112) | (x1.G1 << 9) | (f.f198451e << 12) | ((i16 >> 3) & 57344) | (3670016 & i16) | ((i16 << 3) & 234881024) | (1879048192 & i16), ((i16 >> 21) & 112) | (i17 & 14), 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: sd0.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f158599a.e(x1Var, list, str, z14, activityDetailChartDTO, fVar, z15, z16, z17, lVar, aVar, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // vo1.b
    public final void f(h4.r rVar, ps.r rVar2, ps.n nVar, m mVar, int i14) {
        int i15;
        rVar.getClass();
        rVar2.getClass();
        nVar.getClass();
        o0 o0VarE = mVar.E(-703133521);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(rVar2) : o0VarE.r(rVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(nVar) : o0VarE.r(nVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = n.f135158a;
            gp.d.a(rVar, fr.a.f(rVar2, null, null), nVar.getActivityPolylineDMO(), o0VarE, (i15 & 14) | (q.K1 << 6) | (ps.m.f139904n << 9));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(this, rVar, rVar2, nVar, i14, 19);
        }
    }

    @Override // vo1.b
    public final void g(Context context) {
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) GroupRideAwardsWhatsNewActivity.class));
    }

    @Override // vo1.b
    public final void h(x1 x1Var, String str, int i14, m00.a aVar, f fVar, p<? super Integer, ? super Boolean, Unit> pVar, m mVar, int i15) {
        int i16;
        pVar.getClass();
        o0 o0VarE = mVar.E(-318162870);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? o0VarE.B(x1Var) : o0VarE.r(x1Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.k(i14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & 4096) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (32768 & i15) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            p3.x1 x1Var2 = n.f135158a;
            u.d(x1Var, str, i14, aVar, fVar, pVar, o0VarE, (i16 & 458752) | x1.G1 | (i16 & 14) | (i16 & 112) | (i16 & 896) | (m00.a.f115515e << 9) | (i16 & 7168) | (f.f198451e << 12) | (57344 & i16));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(this, x1Var, str, i14, aVar, fVar, pVar, i15);
        }
    }
}
