package pa0;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import java.util.List;
import l72.c1;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r1.q2;
import v62.b5;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.lte.LteSubscriptionTransferScreenKt$LteSubscriptionTransferScreenRoute$1$1", f = "LteSubscriptionTransferScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f136730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f136731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f136730a = hVar;
            this.f136731b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f136730a, this.f136731b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            h hVar = this.f136730a;
            if ((hVar.f136733b instanceof m.c) && hVar.f136732a.isEmpty()) {
                this.f136731b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        Object obj;
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-442316242);
        if ((i14 & 6) == 0) {
            obj = str;
            i15 = (o0VarE.B(obj) ? 4 : 2) | i14;
        } else {
            obj = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_device_migration_transfer_settings_title);
            String strP = y.P(R.string.lte_subscription_found_msg, new Object[]{obj}, o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lte_transfer_subscription);
            String strQ3 = y.Q(o0VarE, R.string.lbl_skip_button);
            c.f136708a.getClass();
            o0Var = o0VarE;
            da0.p.b("lte_subscription_transfer_screen", strQ, dVarA, strP, null, strQ2, aVar, false, strQ3, aVar2, false, null, null, false, z14, aVar3, null, null, null, null, null, c.f136709b, o0Var, ((i15 << 12) & 3670016) | 6 | ((i15 << 18) & 1879048192), ((i15 << 9) & 57344) | ((i15 << 3) & 458752), 384, 4144272);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(i14, 16, aVar, aVar2, str, aVar3, z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0201  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    public static final void b(h hVar, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, p3.m mVar, int i14) {
        e23.a<Unit> aVar6;
        hVar.getClass();
        m mVar2 = hVar.f136733b;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        o0 o0VarP = fb1.c.p(aVar4, aVar5, mVar, -358997341);
        int i15 = i14 | (o0VarP.r(hVar) ? 4 : 2) | (o0VarP.B(str) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024) | (o0VarP.r(lVar) ? 16384 : 8192) | (o0VarP.r(aVar3) ? 131072 : 65536) | (o0VarP.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarP.r(aVar5) ? 8388608 : 4194304);
        if (o0VarP.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            List<j90.g> list = hVar.f136732a;
            int i16 = i15 & 896;
            boolean zR = o0VarP.r(hVar) | (i16 == 256);
            Object objQ = o0VarP.q();
            p3.m.a aVar7 = p3.m.f135153a;
            if (zR) {
                objQ = new a(hVar, aVar, null);
                o0VarP.K(objQ);
            } else {
                aVar7.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(hVar, aVar, null);
                    o0VarP.K(objQ);
                }
            }
            l0.f(mVar2, list, (p) objQ, o0VarP);
            if (mVar2 instanceof m.f) {
                o0VarP.C(-1399038460);
                f(aVar5, o0VarP, (i15 >> 21) & 14);
                o0VarP.g0(false);
            } else if (mVar2 instanceof m.a) {
                o0VarP.C(-1399034907);
                c(str, aVar, aVar5, o0VarP, ((i15 >> 15) & 896) | ((i15 >> 3) & 126));
                o0VarP.g0(false);
            } else if (mVar2 instanceof m.h) {
                o0VarP.C(-1399028434);
                g(aVar, aVar5, o0VarP, ((i15 >> 18) & 112) | ((i15 >> 6) & 14));
                o0VarP.g0(false);
            } else if (mVar2 instanceof m.g) {
                o0VarP.C(-1399022884);
                e(aVar, aVar5, o0VarP, ((i15 >> 18) & 112) | ((i15 >> 6) & 14));
                o0VarP.g0(false);
            } else if (mVar2 instanceof m.b) {
                Object objH = q2.h(o0VarP, -419864888, aVar7);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = new p40.f(14);
                    o0VarP.K(objH);
                }
                e23.a aVar8 = (e23.a) objH;
                Object objQ2 = o0VarP.q();
                if (objQ2 == c2565a) {
                    objQ2 = new p40.f(15);
                    o0VarP.K(objQ2);
                }
                a(str, false, aVar8, (e23.a) objQ2, aVar5, o0VarP, ((i15 >> 3) & 14) | 3504 | ((i15 >> 9) & 57344));
                boolean z14 = ((m.b) mVar2).f136760a;
                boolean zR2 = o0VarP.r(mVar2) | ((3670016 & i15) == 1048576) | (i16 == 256);
                Object objQ3 = o0VarP.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new nw0.p(22, aVar4, mVar2, aVar);
                    o0VarP.K(objQ3);
                }
                d(z14, aVar3, (e23.a) objQ3, o0VarP, (i15 >> 12) & 112);
                o0VarP.g0(false);
                aVar6 = aVar2;
            } else {
                o0VarP.C(-419341825);
                boolean z15 = (mVar2 instanceof m.e) || (mVar2 instanceof m.d);
                boolean zR3 = o0VarP.r(hVar) | ((i15 & 7168) == 2048) | ((i15 & 57344) == 16384);
                Object objQ4 = o0VarP.q();
                if (zR3) {
                    aVar6 = aVar2;
                    objQ4 = new nw0.p(23, aVar6, hVar, lVar);
                    o0VarP.K(objQ4);
                } else {
                    aVar7.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        aVar6 = aVar2;
                        objQ4 = new nw0.p(23, aVar6, hVar, lVar);
                        o0VarP.K(objQ4);
                    } else {
                        aVar6 = aVar2;
                    }
                }
                a(str, z15, (e23.a) objQ4, aVar, aVar5, o0VarP, ((i15 >> 3) & 14) | ((i15 << 3) & 7168) | ((i15 >> 9) & 57344));
                o0VarP.g0(false);
            }
            aVar6 = aVar2;
        } else {
            aVar6 = aVar2;
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(hVar, str, (e23.a) aVar, (e23.a) aVar6, (e23.l) lVar, (e23.a) aVar3, (e23.a) aVar4, (e23.a) aVar5, i14);
        }
    }

    public static final void c(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        String str2;
        int i15;
        e23.a<Unit> aVar3;
        o0 o0Var;
        o0 o0VarE = mVar.E(331004466);
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_well_done);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strP = y.P(R.string.lte_transfer_subscription_success_msg2, new Object[]{str2}, o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.sleep_advanced_sleep_got_it_button);
            c.f136708a.getClass();
            o0Var = o0VarE;
            da0.p.b("lte_subscription_transfer_complete_screen", strQ, dVarA, strP, null, strQ2, aVar, false, null, null, false, null, null, false, false, aVar3, null, null, null, null, null, c.f136711d, o0Var, ((i15 << 15) & 3670016) | 6, (i15 << 9) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(str2, aVar, aVar2, i14, 0);
        }
    }

    public static final void d(boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar3;
        o0 o0Var;
        o0 o0VarE = mVar.E(1433027990);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(-637914296);
                c1.f110940a.a(false, y.Q(o0VarE, R.string.lte_transfer_not_completed), y.Q(o0VarE, R.string.lte_transfer_not_completed_desc), null, null, y.Q(o0VarE, R.string.lbl_retry), false, false, aVar, y.Q(o0VarE, R.string.lbl_cancel), aVar3, o0VarE, (i15 << 21) & 234881024, (i15 >> 6) & 14, 217);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(-637519139);
                c1.f110940a.a(false, y.Q(o0Var, R.string.lte_unable_transfer), y.Q(o0Var, R.string.lte_unable_transfer_desc), null, null, y.Q(o0Var, R.string.lbl_close), false, false, aVar2, null, aVar2, o0Var, (i15 << 18) & 234881024, (i15 >> 6) & 14, 729);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h62.h(z14, aVar, aVar2, i14, 2);
        }
    }

    public static final void e(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-2137528231);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lte_transfer_progress);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lte_transfer_progress_old_desc);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            c.f136708a.getClass();
            o0Var = o0VarE;
            da0.p.b("lte_subscription_transfer_old_device_screen", strQ, dVarA, strQ2, null, strQ3, aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, c.f136713f, o0Var, ((i15 << 18) & 3670016) | 6, (i15 << 12) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 10, (byte) 0);
        }
    }

    public static final void f(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1294672481);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lte_transferring_bic_title);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strP = y.P(R.string.lte_transferring_bic_desc, new Object[]{"30"}, o0VarE);
            c.f136708a.getClass();
            o0Var = o0VarE;
            da0.p.b("lte_subscription_transfer_progress_screen", strQ, dVarA, strP, null, null, null, false, null, null, false, null, null, false, false, aVar, null, null, null, null, null, c.f136710c, o0Var, 6, (i15 << 15) & 458752, 384, 4161520);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 10);
        }
    }

    public static final void g(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(514479701);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lte_transfer_progress);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lte_transfer_progress_desc);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            c.f136708a.getClass();
            o0Var = o0VarE;
            da0.p.b("lte_subscription_transfer_timeout_screen", strQ, dVarA, strQ2, null, strQ3, aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, c.f136712e, o0Var, ((i15 << 18) & 3670016) | 6, (i15 << 12) & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 11, (byte) 0);
        }
    }
}
