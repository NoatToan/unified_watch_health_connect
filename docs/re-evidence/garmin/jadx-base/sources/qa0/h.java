package qa0;

import c2.a0;
import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import da0.v;
import e23.p;
import gl1.y;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import l4.k;
import l72.c1;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import pf0.j;
import q53.q;
import u1.w;
import v13.i;
import v62.a8;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.migration.MultipleBackupsScreenKt$MultipleBackupsScreen$1$1", f = "MultipleBackupsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f143867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f143868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f143867a = z14;
            this.f143868b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f143867a, this.f143868b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f143867a) {
                this.f143868b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(final String str, final List<sg1.c> list, final boolean z14, boolean z15, final e23.a<Unit> aVar, final p<? super sg1.c, ? super Boolean, Unit> pVar, final e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        o0 o0Var;
        boolean z16;
        str.getClass();
        list.getClass();
        aVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(907760447);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new q(4);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            boolean z17 = list.size() > 5;
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean z18 = ((i15 & 3670016) == 1048576) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (z18 || objQ2 == c2565a) {
                objQ2 = new a(z15, aVar2, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, boolValueOf, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_transfer_settings);
            s62.a.f157643a.getClass();
            u4.d dVarA = a8.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_device_migration_transfer_settings);
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z16 = false;
                        break;
                    } else if (((sg1.c) it.next()).f159210h) {
                        z16 = true;
                        break;
                    }
                }
            } else {
                z16 = false;
                break;
            }
            final boolean z19 = z17;
            o0Var = o0VarE;
            da0.p.b("device_migration_multiple_backups_screen", strQ, dVarA, null, null, strQ2, aVar3, z16, y.Q(o0VarE, R.string.lbl_skip_button), aVar2, false, null, null, false, false, null, null, null, null, null, null, z3.f.c(-551678401, new e23.q() { // from class: qa0.g
                /* JADX WARN: Code duplicated, block: B:27:0x011e  */
                /* JADX WARN: Code duplicated, block: B:35:0x0175  */
                /* JADX WARN: Code duplicated, block: B:46:0x026d  */
                /* JADX WARN: Code duplicated, block: B:48:0x02a2  */
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
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m.a aVar4;
                    float f14;
                    String strH;
                    a0 a0Var = (a0) obj;
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    a0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= mVar2.B(a0Var) ? 4 : 2;
                    }
                    if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                        x1 x1Var2 = n.f135158a;
                        h4.r.a aVar5 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        l.f(x2.h(aVar5, j92.b.f97899b.f97919d), mVar2);
                        String strP = y.P(R.string.lbl_device_migration_keep_preferred_settings_multiple_backups, new Object[]{str}, mVar2);
                        d92.b.f58624b.getClass();
                        mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                        m mVar3 = mVar2;
                        mVar3.C(-1881953160);
                        Iterator it3 = h0.S0(list, 5).iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            aVar4 = m.f135153a;
                            if (!zHasNext) {
                                break;
                            }
                            sg1.c cVar = (sg1.c) it3.next();
                            if (cVar.f159208f) {
                                strH = sn.a.h(mVar3, 158001056, R.string.lbl_device_migration_current_device, mVar3);
                            } else {
                                mVar3.C(158096536);
                                mVar3.f();
                                strH = null;
                            }
                            String str2 = strH;
                            h4.r rVarF = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC = l.C(rVarF, 0.0f, j92.b.f97899b.f97919d, 0.0f, 0.0f, 13);
                            boolean z24 = cVar.f159210h;
                            String str3 = cVar.f159203a;
                            String str4 = cVar.f159205c;
                            String str5 = cVar.f159204b;
                            p pVar2 = pVar;
                            boolean zB = mVar3.B(pVar2) | mVar3.r(cVar);
                            Object objQ3 = mVar3.q();
                            if (zB) {
                                objQ3 = new ph1.d(12, pVar2, cVar);
                                mVar3.K(objQ3);
                            } else {
                                aVar4.getClass();
                                if (objQ3 == m.a.f135155b) {
                                    objQ3 = new ph1.d(12, pVar2, cVar);
                                    mVar3.K(objQ3);
                                }
                            }
                            v.a(rVarC, z24, false, str3, str4, str5, str2, (e23.l) objQ3, mVar3, 0, 4);
                        }
                        mVar3.f();
                        if (z19) {
                            mVar3.C(1789807440);
                            String strQ3 = y.Q(mVar3, R.string.lbl_device_migration_browse_all_device_backups);
                            h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            h4.r rVarA = l.A(rVarF2, 0.0f, eVar.f97919d, 1);
                            e23.a aVar6 = aVar;
                            boolean zB2 = mVar3.B(aVar6);
                            Object objQ4 = mVar3.q();
                            if (zB2) {
                                objQ4 = new j(aVar6, 21);
                                mVar3.K(objQ4);
                            } else {
                                aVar4.getClass();
                                if (objQ4 == m.a.f135155b) {
                                    objQ4 = new j(aVar6, 21);
                                    mVar3.K(objQ4);
                                }
                            }
                            h4.r rVarY = l.y(u1.n.e(k.b(w.d(rVarA, false, null, null, (e23.a) objQ4, 15), k2.i.a(eVar.f97918c)), com.nimbusds.jose.shaded.gson.internal.a.c(mVar3), m1.f128891a), eVar.f97920e);
                            d92.b.f58624b.getClass();
                            f14 = 1.0f;
                            mh.c(strQ3, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131068);
                            mVar3 = mVar3;
                            mVar3.f();
                        } else {
                            f14 = 1.0f;
                            mVar3.C(1790471491);
                            mVar3.f();
                        }
                        l.f(a0Var.a(h4.r.S, f14, true), mVar3);
                        String strQ4 = y.Q(mVar3, R.string.lbl_device_migration_transfer_over_time);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        m mVar4 = mVar3;
                        mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar4, 0, 0, 131070);
                        if (z14) {
                            p1 p1Var2 = p1Var;
                            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                mVar4.C(1791353379);
                                mVar4.f();
                            } else {
                                mVar4.C(1790745066);
                                boolean zB3 = mVar4.B(p1Var2);
                                e23.a aVar7 = aVar2;
                                boolean zB4 = zB3 | mVar4.B(aVar7);
                                Object objQ5 = mVar4.q();
                                if (zB4) {
                                    objQ5 = new j0(aVar7, p1Var2, 1);
                                    mVar4.K(objQ5);
                                } else {
                                    aVar4.getClass();
                                    if (objQ5 == m.a.f135155b) {
                                        objQ5 = new j0(aVar7, p1Var2, 1);
                                        mVar4.K(objQ5);
                                    }
                                }
                                e23.a<Unit> aVar8 = (e23.a) objQ5;
                                c1.f110940a.a(false, y.Q(mVar4, R.string.lbl_device_migration_error_transfer_failed), y.Q(mVar4, R.string.lbl_device_migration_error_message_transfer_failed), null, null, y.Q(mVar4, R.string.lbl_ok), false, false, aVar8, null, aVar8, mVar4, 6, 0, 728);
                                mVar4.f();
                            }
                        } else {
                            mVar4.C(1791353379);
                            mVar4.f();
                        }
                        x1 x1Var3 = n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, ((i15 >> 3) & 3670016) | 6 | (1879048192 & (i15 << 9)), 0, 384, 4193304);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.l(str, list, z14, z15, aVar, pVar, aVar2, aVar3, i14);
        }
    }
}
