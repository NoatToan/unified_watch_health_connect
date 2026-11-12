package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import e23.l;
import e23.p;
import h4.k;
import h5.e0;
import h5.g;
import i3.mh;
import java.util.Arrays;
import java.util.Locale;
import kg.f;
import l72.c1;
import o13.r;
import o4.q1;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
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
import s5.i0;
import s5.r0;
import s5.x0;
import v13.e;
import v13.i;
import vb.h;
import w5.c0;
import w5.f0;
import w5.q;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\n\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/FollowerRequestsPrivacyActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "", "requireReview", "showConfirmRequestsWithoutReview", "isLoading", "", "autoApprovalText", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FollowerRequestsPrivacyActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47109c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f47110a = (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47111b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity$FollowerRequestsScreen$1$1", f = "FollowerRequestsPrivacyActivity.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p1 f47112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47113b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f47115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<String> f47116e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<Boolean> p1Var, p1<String> p1Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f47115d = p1Var;
            this.f47116e = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FollowerRequestsPrivacyActivity.this.new b(this.f47115d, this.f47116e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p1<String> p1Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47113b;
            p1<Boolean> p1Var2 = this.f47115d;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = FollowerRequestsPrivacyActivity.f47109c;
                p1Var2.setValue(Boolean.TRUE);
                ei0.d dVar = FollowerRequestsPrivacyActivity.this.f47110a;
                p1<String> p1Var3 = this.f47116e;
                this.f47112a = p1Var3;
                this.f47113b = 1;
                obj = dVar.K(this);
                if (obj == aVar) {
                    return aVar;
                }
                p1Var = p1Var3;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p1Var = this.f47112a;
                r.b(obj);
            }
            a aVar3 = FollowerRequestsPrivacyActivity.f47109c;
            p1Var.setValue((String) obj);
            p1Var2.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0249  */
    public final void da(int i14, l lVar, String str, m mVar, boolean z14) {
        String strJ;
        o0 o0VarE = mVar.E(-1682290154);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(this) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            z5.b.f202439b.getClass();
            Locale locale = new Locale(z5.b.a.a().f202440a.getLanguage());
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1773124106, R.string.follower_setup_follower_approval_footer, o0VarE, false);
            } else {
                if (z14) {
                    throw f.h(o0VarE, -1773125381, false);
                }
                o0VarE.C(-1773120865);
                o0VarE.g0(false);
                strJ = str == null ? "" : str;
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.follower_setup_follower_approval_description);
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            String str2 = strJ;
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            aVar3.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new sq1.e(lVar, 28);
                o0VarE.K(objQ);
            }
            int i16 = (i15 << 3) & 112;
            int i17 = i15 & 7168;
            fa(R.string.follower_setup_follower_approval_option_require_approval, i16 | i17, (e23.a) objQ, o0VarE, z14);
            boolean z15 = !z14;
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new sq1.e(lVar, 29);
                o0VarE.K(objQ2);
            }
            fa(R.string.follower_setup_follower_approval_option_auto_approve, i17, (e23.a) objQ2, o0VarE, z15);
            s5.c.b bVarH = l2.h(o0VarE, -1517124096, 0, 1, null);
            bVarH.b(str2);
            if (lg.d.O(locale)) {
                bVarH.b(StringUtils.SPACE);
            }
            o0VarE.C(-1517118069);
            long jA = d92.b.a(o0VarE).d().a().a();
            k92.a.f103644a.getClass();
            r0 r0Var = new r0(new i0(jA, k92.a.f103653j, (f0) null, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65532, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
            boolean zR = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new ox.e(context, 1);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new ox.e(context, 1);
                    o0VarE.K(objQ3);
                }
            }
            int iG = bVarH.g(new s5.m.a("", r0Var, (s5.n) objQ3));
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.setup_privacy_policy));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar2.getClass();
                h4.r rVarY2 = c2.l.y(rVarF2, eVar.f97920e);
                fVar.getClass();
                mh.d(cVarK, rVarY2, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 262140);
                o0VarE = o0VarE;
                o0VarE.g0(true);
            } catch (Throwable th3) {
                bVarH.f(iG);
                throw th3;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(this, z14, str, lVar, i14, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    public final void ea(boolean z14, m mVar, int i14) {
        o0 o0Var;
        m.a.C2565a c2565a;
        final p1 p1Var;
        final ?? r14;
        p1 p1Var2;
        final p1 p1Var3;
        o0 o0VarE = mVar.E(1766709454);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = hb.a.n(z14, o0VarE);
            }
            p1 p1Var4 = (p1) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = new u1.p1(3);
                o0VarE.K(objQ2);
            }
            p1 p1Var5 = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var6 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p0.n("");
                o0VarE.K(objQ4);
            }
            p1 p1Var7 = (p1) objQ4;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(this);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a2) {
                objQ5 = new b(p1Var6, p1Var7, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, unit, o0VarE);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(1512746553);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.follower_setup_follower_approval_option_auto_approve);
                String strQ2 = gl1.y.Q(o0VarE, R.string.privacy_follower_auto_approve_hint);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                String strQ4 = gl1.y.Q(o0VarE, R.string.common_cancel);
                boolean zB = o0VarE.B(p1Var5) | o0VarE.r(this);
                Object objQ6 = o0VarE.q();
                if (zB || objQ6 == c2565a2) {
                    objQ6 = new tb0.d(20, this, p1Var5);
                    o0VarE.K(objQ6);
                }
                e23.a<Unit> aVar = (e23.a) objQ6;
                boolean zB2 = o0VarE.B(p1Var5);
                Object objQ7 = o0VarE.q();
                if (zB2 || objQ7 == c2565a2) {
                    objQ7 = new tn.h(p1Var5, 7);
                    o0VarE.K(objQ7);
                }
                p1Var2 = p1Var7;
                c2565a = c2565a2;
                p1Var = p1Var5;
                r14 = 0;
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar, strQ4, (e23.a) objQ7, o0VarE, 6, 0, 216);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                c2565a = c2565a2;
                p1Var = p1Var5;
                r14 = 0;
                p1Var2 = p1Var7;
                o0VarE.C(1513442100);
                o0VarE.g0(false);
            }
            boolean zR2 = o0VarE.r(this) | o0VarE.B(p1Var);
            Object objQ8 = o0VarE.q();
            if (zR2 || objQ8 == c2565a) {
                p1Var3 = p1Var4;
                objQ8 = new u12.j(this, p1Var3, p1Var, r14);
                o0VarE.K(objQ8);
            } else {
                p1Var3 = p1Var4;
            }
            w.a(r14, 1, (e23.a) objQ8, o0VarE, r14);
            boolean z15 = (!((Boolean) p1Var6.getF182175a()).booleanValue() || ((Boolean) p1Var3.getF182175a()).booleanValue()) ? r14 : 1;
            z3.e eVarC = z3.f.c(-1430997741, new p(this) { // from class: u12.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FollowerRequestsPrivacyActivity f167800b;

                {
                    this.f167800b = this;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0095  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = r14;
                    p3.m.a aVar2 = p3.m.f135153a;
                    p1 p1Var8 = p1Var3;
                    p1 p1Var9 = p1Var;
                    switch (i16) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            FollowerRequestsPrivacyActivity.a aVar3 = FollowerRequestsPrivacyActivity.f47109c;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strQ5 = gl1.y.Q(mVar2, R.string.follower_setup_follower_approval_title);
                                FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity = this.f167800b;
                                boolean zR3 = mVar2.r(followerRequestsPrivacyActivity) | mVar2.B(p1Var9);
                                Object objQ9 = mVar2.q();
                                if (zR3) {
                                    objQ9 = new j(followerRequestsPrivacyActivity, p1Var8, p1Var9, 1);
                                    mVar2.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new j(followerRequestsPrivacyActivity, p1Var8, p1Var9, 1);
                                        mVar2.K(objQ9);
                                    }
                                }
                                z02.f.c(0, 54, null, (e23.a) objQ9, null, strQ5, mVar2, null);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            FollowerRequestsPrivacyActivity.a aVar4 = FollowerRequestsPrivacyActivity.f47109c;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                boolean zBooleanValue = ((Boolean) p1Var9.getF182175a()).booleanValue();
                                String str = (String) p1Var8.getF182175a();
                                Object objQ10 = mVar3.q();
                                aVar2.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new sk0.n(p1Var9, 15);
                                    mVar3.K(objQ10);
                                }
                                this.f167800b.da(384, (e23.l) objQ10, str, mVar3, zBooleanValue);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            final p1 p1Var8 = p1Var2;
            final int i16 = 1;
            z02.d.a(z15, eVarC, null, null, null, z3.f.c(-1171268585, new p(this) { // from class: u12.k

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FollowerRequestsPrivacyActivity f167800b;

                {
                    this.f167800b = this;
                }

                /* JADX WARN: Code duplicated, block: B:25:0x0095  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    p3.m.a aVar2 = p3.m.f135153a;
                    p1 p1Var9 = p1Var8;
                    p1 p1Var10 = p1Var3;
                    switch (i17) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            FollowerRequestsPrivacyActivity.a aVar3 = FollowerRequestsPrivacyActivity.f47109c;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strQ5 = gl1.y.Q(mVar2, R.string.follower_setup_follower_approval_title);
                                FollowerRequestsPrivacyActivity followerRequestsPrivacyActivity = this.f167800b;
                                boolean zR3 = mVar2.r(followerRequestsPrivacyActivity) | mVar2.B(p1Var10);
                                Object objQ9 = mVar2.q();
                                if (zR3) {
                                    objQ9 = new j(followerRequestsPrivacyActivity, p1Var9, p1Var10, 1);
                                    mVar2.K(objQ9);
                                } else {
                                    aVar2.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new j(followerRequestsPrivacyActivity, p1Var9, p1Var10, 1);
                                        mVar2.K(objQ9);
                                    }
                                }
                                z02.f.c(0, 54, null, (e23.a) objQ9, null, strQ5, mVar2, null);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            FollowerRequestsPrivacyActivity.a aVar4 = FollowerRequestsPrivacyActivity.f47109c;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                boolean zBooleanValue = ((Boolean) p1Var10.getF182175a()).booleanValue();
                                String str = (String) p1Var9.getF182175a();
                                Object objQ10 = mVar3.q();
                                aVar2.getClass();
                                if (objQ10 == p3.m.a.f135155b) {
                                    objQ10 = new sk0.n(p1Var10, 15);
                                    mVar3.K(objQ10);
                                }
                                this.f167800b.da(384, (e23.l) objQ10, str, mVar3, zBooleanValue);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 196656, 28);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u12.i(this, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    public final void fa(int i14, int i15, e23.a aVar, m mVar, boolean z14) {
        o0 o0VarE = mVar.E(359012018);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2);
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i17 = i16 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            String strQ = gl1.y.Q(o0VarE, i14);
            z3.e eVarC = z3.f.c(246472775, new rw0.g(z14, 8), o0VarE);
            boolean z15 = (i17 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new u11.b(aVar, 2);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new u11.b(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(strQ, rVarF, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, 24624, 236);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(this, i14, z14, aVar, i15, 8);
        }
    }

    public final void ga(boolean z14) {
        if (this.f47111b != z14) {
            Intent intent = new Intent();
            intent.putExtras(h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[]{new o13.p("require_review_requests", Integer.valueOf(z14 ? 1 : 0))}, 1)));
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z14 = getIntent().getIntExtra("require_review_requests", 1) == 1;
        this.f47111b = z14;
        initComposeScreen(new z3.e(-73782538, true, new u12.i(this, z14, 0, (byte) 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/presentation/privacy/FollowerRequestsPrivacyActivity$a;", "", "<init>", "()V", "", "PARAM_REQUIRE_REVIEW", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
